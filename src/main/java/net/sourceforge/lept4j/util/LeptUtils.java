/*
 * Copyright 2015 Quan Nguyen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sourceforge.lept4j.util;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.Locale;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageOutputStream;

import com.github.jaiimageio.plugins.tiff.TIFFImageWriteParam;
import com.sun.jna.ptr.PointerByReference;

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.ochafik.lang.jnaerator.runtime.NativeSizeByReference;
import com.sun.jna.Structure;
import net.sourceforge.lept4j.*;
import static net.sourceforge.lept4j.ILeptonica.IFF_TIFF;

//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.imgcodecs.Imgcodecs;

/**
 * Various utility methods for Leptonica.
 *
 */
public class LeptUtils {

    final static String JAI_IMAGE_WRITER_MESSAGE = "Need to install JAI Image I/O package.\nhttps://github.com/jai-imageio/jai-imageio-core";
    final static String TIFF_FORMAT = "tiff";
    final static float deg2rad = (float) (3.14159 / 180.);

    /**
     * Converts Leptonica <code>Pix</code> to <code>BufferedImage</code>.
     *
     * @param pix source pix
     * @return BufferedImage output image
     * @throws IOException
     */
    public static BufferedImage convertPixToImage(Pix pix) throws IOException {
        PointerByReference pdata = new PointerByReference();
        NativeSizeByReference psize = new NativeSizeByReference();
        int format = IFF_TIFF;
        Leptonica1.pixWriteMem(pdata, psize, pix, format);
        byte[] b = pdata.getValue().getByteArray(0, psize.getValue().intValue());
        InputStream in = new ByteArrayInputStream(b);
        BufferedImage bi = ImageIO.read(in);
        in.close();
        Leptonica1.lept_free(pdata.getValue());
        return bi;
    }

    /**
     * Converts <code>BufferedImage</code> to Leptonica <code>Pix</code> .
     *
     * @param image source image
     * @return Pix output pix
     * @throws IOException
     */
    public static Pix convertImageToPix(BufferedImage image) throws IOException {
        ByteBuffer buff = getImageByteBuffer(image);
        Pix pix = Leptonica1.pixReadMem(buff, new NativeSize(buff.capacity()));
        return pix;
    }

    /**
     * Removes horizontal lines from a grayscale image. The algorithm is based
     * on Leptonica <code>lineremoval.c</code> example.
     * <br>
     * To remove vertical lines, rotate the image 90 degrees first, remove the
     * horizontal lines, and rotate it back.
     *
     * @see
     * <a href="http://www.leptonica.com/line-removal.html">line-removal</a>
     *
     * @param pixs input pix
     * @return pix with lines removed
     */
    public static Pix removeLines(Pix pixs) {
        float angle, conf;
        Pix pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9;

        /* threshold to binary, extracting much of the lines */
        pix1 = Leptonica1.pixThresholdToBinary(pixs, 170);

        /* find the skew angle and deskew using an interpolated
         * rotator for anti-aliasing (to avoid jaggies) */
        FloatBuffer pangle = FloatBuffer.allocate(1);
        FloatBuffer pconf = FloatBuffer.allocate(1);
        Leptonica1.pixFindSkew(pix1, pangle, pconf);
        angle = pangle.get();
        conf = pconf.get();
        pix2 = Leptonica1.pixRotateAMGray(pixs, (float) (deg2rad * angle), (byte) 255);

        /* extract the lines to be removed */
        pix3 = Leptonica1.pixCloseGray(pix2, 51, 1);

        /* solidify the lines to be removed */
        pix4 = Leptonica1.pixErodeGray(pix3, 1, 5);

        /* clean the background of those lines */
        pix5 = Leptonica1.pixThresholdToValue(null, pix4, 210, 255);

        pix6 = Leptonica1.pixThresholdToValue(null, pix5, 200, 0);

        /* get paint-through mask for changed pixels */
        pix7 = Leptonica1.pixThresholdToBinary(pix6, 210);

        /* add the inverted, cleaned lines to orig.  Because
         * the background was cleaned, the inversion is 0,
         * so when you add, it doesn't lighten those pixels.
         * It only lightens (to white) the pixels in the lines! */
        Leptonica1.pixInvert(pix6, pix6);
        pix8 = Leptonica1.pixAddGray(null, pix2, pix6);

        pix9 = Leptonica1.pixOpenGray(pix8, 1, 9);

        Leptonica1.pixCombineMasked(pix8, pix9, pix7);

        // resource cleanup
        disposePix(pix1);
        disposePix(pix2);
        disposePix(pix3);
        disposePix(pix4);
        disposePix(pix5);
        disposePix(pix6);
        disposePix(pix7);
        disposePix(pix9);

        return pix8;
    }

    /**
     * HMT (with just misses) for speckle up to 2x2
     * <blockquote><pre>"oooo"
     *"oC o"
     *"o  o"
     *"oooo"</pre></blockquote>
     */
    public static final String SEL_STR2 = "oooooC oo  ooooo";
    /**
     * HMT (with just misses) for speckle up to 3x3
     * <blockquote><pre>"ooooo"
     *"oC  o"
     *"o   o"
     *"o   o"
     *"ooooo"</pre></blockquote>
     */
    public static final String SEL_STR3 = "ooooooC  oo   oo   oooooo";

    /**
     * Reduces speckle noise in image. The algorithm is based on Leptonica
     * <code>speckle_reg.c</code> example demonstrating morphological method of
     * removing speckle.
     *
     * @param pixs input pix
     * @param selStr hit-miss sels in 2D layout; SEL_STR2 and SEL_STR3 are
     * predefined values
     * @param selSize 2 for 2x2, 3 for 3x3
     * @return pix with speckle removed
     */
    public static Pix despeckle(Pix pixs, String selStr, int selSize) {
        Pix pix1, pix2, pix3;
        Pix pix4, pix5, pix6;
        Sel sel1, sel2;

        /*  Normalize for rapidly varying background */
        pix1 = Leptonica1.pixBackgroundNormFlex(pixs, 7, 7, 1, 1, 10);

        /* Remove the background */
        pix2 = Leptonica1.pixGammaTRCMasked(null, pix1, null, 1.0f, 100, 175);
        /* Binarize */
        pix3 = Leptonica1.pixThresholdToBinary(pix2, 180);

        /* Remove the speckle noise up to selSize x selSize */
        sel1 = Leptonica1.selCreateFromString(selStr, selSize + 2, selSize + 2, "speckle" + selSize);
        pix4 = Leptonica1.pixHMT(null, pix3, sel1.getPointer());
        sel2 = Leptonica1.selCreateBrick(selSize, selSize, 0, 0, ILeptonica.SEL_HIT);
        pix5 = Leptonica1.pixDilate(null, pix4, sel2.getPointer());
        pix6 = Leptonica1.pixSubtract(null, pix3, pix5);

        LeptUtils.dispose(sel1);
        LeptUtils.dispose(sel2);

        LeptUtils.dispose(pix1);
        LeptUtils.dispose(pix2);
        LeptUtils.dispose(pix3);
        LeptUtils.dispose(pix4);
        LeptUtils.dispose(pix5);

        return pix6;
    }

    /**
     * Disposes of Pix resource.
     *
     * @param pix
     */
    public static void disposePix(Pix pix) {
        if (pix == null) {
            return;
        }
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(pix.getPointer());
        Leptonica1.pixDestroy(pRef);
    }

    /**
     * Disposes of Leptonica native resource.
     *
     * @param resource A Leptonica object, such as <code>Pix</code>,
     * <code>Pixa</code>, <code>Box</code>, <code>Boxa</code>,
     * <code>PixColormap</code>, etc.
     */
    public static void dispose(Structure resource) {
        if (resource == null) {
            return;
        }
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(resource.getPointer());

        if (resource instanceof Pix) {
            Leptonica1.pixDestroy(pRef);
        } else if (resource instanceof Pixa) {
            Leptonica1.pixaDestroy(pRef);
        } else if (resource instanceof Box) {
            Leptonica1.boxDestroy(pRef);
        } else if (resource instanceof Boxa) {
            Leptonica1.boxaDestroy(pRef);
        } else if (resource instanceof L_Bmf) {
            Leptonica1.bmfDestroy(pRef);
        } else if (resource instanceof L_ByteBuffer) {
            Leptonica1.bbufferDestroy(pRef);
        } else if (resource instanceof Boxaa) {
            Leptonica1.boxaaDestroy(pRef);
        } else if (resource instanceof L_Bytea) {
            Leptonica1.l_byteaDestroy(pRef);
        } else if (resource instanceof CCBorda) {
            Leptonica1.ccbaDestroy(pRef);
        } else if (resource instanceof CCBord) {
            Leptonica1.ccbDestroy(pRef);
        } else if (resource instanceof PixColormap) {
            Leptonica1.pixcmapDestroy(pRef);
        } else if (resource instanceof L_Dewarp) {
            Leptonica1.dewarpDestroy(pRef);
        } else if (resource instanceof L_Dewarpa) {
            Leptonica1.dewarpaDestroy(pRef);
        } else if (resource instanceof L_Dna) {
            Leptonica1.l_dnaDestroy(pRef);
        } else if (resource instanceof L_Dnaa) {
            Leptonica1.l_dnaaDestroy(pRef);
        } else if (resource instanceof L_DnaHash) {
            Leptonica1.l_dnaHashDestroy(pRef);
        } else if (resource instanceof FPix) {
            Leptonica1.fpixDestroy(pRef);
        } else if (resource instanceof FPixa) {
            Leptonica1.fpixaDestroy(pRef);
        } else if (resource instanceof DPix) {
            Leptonica1.dpixDestroy(pRef);
        } else if (resource instanceof GPlot) {
            Leptonica1.gplotDestroy(pRef);
        } else if (resource instanceof JbClasser) {
            Leptonica1.jbClasserDestroy(pRef);
        } else if (resource instanceof JbData) {
            Leptonica1.jbDataDestroy(pRef);
        } else if (resource instanceof L_Kernel) {
            Leptonica1.kernelDestroy(pRef);
        } else if (resource instanceof Numa) {
            Leptonica1.numaDestroy(pRef);
        } else if (resource instanceof Numaa) {
            Leptonica1.numaaDestroy(pRef);
        } else if (resource instanceof Pixaa) {
            Leptonica1.pixaaDestroy(pRef);
        } else if (resource instanceof Pixacc) {
            Leptonica1.pixaccDestroy(pRef);
        } else if (resource instanceof PixComp) {
            Leptonica1.pixcompDestroy(pRef);
        } else if (resource instanceof PixaComp) {
            Leptonica1.pixacompDestroy(pRef);
        } else if (resource instanceof PixTiling) {
            Leptonica1.pixTilingDestroy(pRef);
        } else if (resource instanceof Pta) {
            Leptonica1.ptaDestroy(pRef);
        } else if (resource instanceof Ptaa) {
            Leptonica1.ptaaDestroy(pRef);
        } else if (resource instanceof L_Recog) {
            Leptonica1.recogDestroy(pRef);
        } else if (resource instanceof Sarray) {
            Leptonica1.sarrayDestroy(pRef);
        } else if (resource instanceof Sel) {
            Leptonica1.selDestroy(pRef);
        } else if (resource instanceof Sela) {
            Leptonica1.selaDestroy(pRef);
        } else if (resource instanceof L_Sudoku) {
            Leptonica1.sudokuDestroy(pRef);
        } else if (resource instanceof L_WShed) {
            Leptonica1.wshedDestroy(pRef);
        } else if (resource instanceof DoubleLinkedList) {
            Leptonica1.listDestroy(pRef);
        } else if (resource instanceof L_Rbtree) {
            Leptonica1.l_rbtreeDestroy(pRef);
        } else {
            throw new RuntimeException("Not supported.");
        }
    }

    /**
     * Gets image data of an <code>RenderedImage</code> object.
     *
     * @param image an <code>RenderedImage</code> object
     * @return a byte buffer of image data
     * @throws IOException
     */
    static ByteBuffer getImageByteBuffer(RenderedImage image) throws IOException {
        //Set up the writeParam
        TIFFImageWriteParam tiffWriteParam = new TIFFImageWriteParam(Locale.US);
        tiffWriteParam.setCompressionMode(ImageWriteParam.MODE_DISABLED);

        //Get tif writer and set output to file
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(TIFF_FORMAT);

        if (!writers.hasNext()) {
            throw new RuntimeException(JAI_IMAGE_WRITER_MESSAGE);
        }

        ImageWriter writer = writers.next();

        //Get the stream metadata
        IIOMetadata streamMetadata = writer.getDefaultStreamMetadata(tiffWriteParam);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageOutputStream ios = ImageIO.createImageOutputStream(outputStream);
        writer.setOutput(ios);
        writer.write(streamMetadata, new IIOImage(image, null, null), tiffWriteParam);
//        writer.write(image);
        writer.dispose();
        ios.seek(0);
        byte[] b = new byte[(int) ios.length()];
        ios.read(b);
        ios.close();

        ByteBuffer buf = ByteBuffer.allocateDirect(b.length);
        buf.order(ByteOrder.nativeOrder());
        buf.put(b);
        ((Buffer) buf).flip();
        return buf;
    }

//    /**
//     * Converts OpenCV Mat to Leptonica Pix.
//     * 
//     * @param mat source mat
//     * @return output pix
//     */
//    public static Pix convertMatToPix(Mat mat) {
//        MatOfByte bytes = new MatOfByte();
//        Imgcodecs.imencode(".tif", mat, bytes);
//        ByteBuffer buff = ByteBuffer.wrap(bytes.toArray());
//        return Leptonica1.pixReadMem(buff, new NativeSize(buff.capacity()));
//    }
//
//    /**
//     * Converts Leptonica Pix to OpenCV Mat.
//     * @param pix source pix
//     * @return output mat
//     */
//    public static Mat convertPixToMat(Pix pix) {
//        PointerByReference pdata = new PointerByReference();
//        NativeSizeByReference psize = new NativeSizeByReference();
//        Leptonica1.pixWriteMem(pdata, psize, pix, ILeptonica.IFF_TIFF);
//        byte[] b = pdata.getValue().getByteArray(0, psize.getValue().intValue());
//        Leptonica1.lept_free(pdata.getValue());
//        return Imgcodecs.imdecode(new MatOfByte(b), Imgcodecs.CV_LOAD_IMAGE_UNCHANGED);
//    }
}
