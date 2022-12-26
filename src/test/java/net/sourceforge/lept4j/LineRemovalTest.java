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
package net.sourceforge.lept4j;

import com.sun.jna.StringArray;
import com.sun.jna.ptr.PointerByReference;
import java.io.File;
import java.nio.FloatBuffer;
import org.junit.jupiter.api.*;

import static net.sourceforge.lept4j.ILeptonica.*;
import static net.sourceforge.lept4j.util.LeptUtils.dispose;

/**
 * Java version of <code>lineremoval_reg.c</code>, demonstrating line removal
 * from a grayscale sketch.<br>
 * <br>
 * Note: Leptonica uses gthumb on Unix and IrfanView (<code>i_view32</code>) on
 * Windows for displaying images.
 */
public class LineRemovalTest {

    private final String testResourcesPath = "src/test/resources/test-data";

    public LineRemovalTest() {

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of LineRemoval algorithm.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testLineRemoval() throws Exception {
        System.out.println("Line Removal");
        float angle, conf;
        final float deg2rad = (float) (3.14159 / 180.);
        Pix pixs, pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9;
        Pixa pixa;
        L_RegParams rp;
        int argc = 2;
        String[] argv = {"lineremoval_reg", "display"};
        PointerByReference pargv = new PointerByReference(new StringArray(argv));
        PointerByReference prp = new PointerByReference();

//        if (Leptonica1.regTestSetup(argc, pargv, prp) == 1) {
//            System.err.print("Failed Test Setup");
//            throw new Exception("Failed Test Setup");
//        }
        rp = new L_RegParams(prp.getValue());
        rp.mode = 2;
        rp.display = 1;
        
        String filein = "dave-orig.png";
        File image = new File(testResourcesPath, filein);

        if ((pixs = Leptonica1.pixRead(image.getPath())) == null) {
            System.err.print("pix not read");
            throw new Exception("pix not read");
        }

        pixa = Leptonica1.pixaCreate(0);

        /* Threshold to binary, extracting much of the lines */
        pix1 = Leptonica1.pixThresholdToBinary(pixs, 170);
        Leptonica1.pixWrite("target/test-classes/test-results/dave-proc1.png", pix1, IFF_PNG);
        Leptonica1.regTestWritePixAndCheck(rp, pix1, IFF_PNG);        /* 0 */
        Leptonica1.pixaAddPix(pixa, pix1, L_INSERT);

        /* Find the skew angle and deskew using an interpolated
         * rotator for anti-aliasing (to avoid jaggies) */
        FloatBuffer pangle = FloatBuffer.allocate(1);
        FloatBuffer pconf = FloatBuffer.allocate(1);
        Leptonica1.pixFindSkew(pix1, pangle, pconf);
        angle = pangle.get();
        conf = pconf.get();
        pix2 = Leptonica1.pixRotateAMGray(pixs, (float) (deg2rad * angle), (byte) 255);
        Leptonica1.regTestWritePixAndCheck(rp, pix2, IFF_PNG);        /* 1 */
        Leptonica1.pixaAddPix(pixa, pix2, L_INSERT);

        /* Extract the lines to be removed */
        pix3 = Leptonica1.pixCloseGray(pix2, 51, 1);
        Leptonica1.regTestWritePixAndCheck(rp, pix3, IFF_PNG);        /* 2 */
        Leptonica1.pixaAddPix(pixa, pix3, L_INSERT);

        /* Solidify the lines to be removed */
        pix4 = Leptonica1.pixErodeGray(pix3, 1, 5);
        Leptonica1.regTestWritePixAndCheck(rp, pix4, IFF_PNG);        /* 3 */
        Leptonica1.pixaAddPix(pixa, pix4, L_INSERT);

        /* Clean the background of those lines */
        pix5 = Leptonica1.pixThresholdToValue(null, pix4, 210, 255);
        Leptonica1.regTestWritePixAndCheck(rp, pix5, IFF_PNG);        /* 4 */
        Leptonica1.pixaAddPix(pixa, pix5, L_INSERT);

        pix6 = Leptonica1.pixThresholdToValue(null, pix5, 200, 0);
        Leptonica1.regTestWritePixAndCheck(rp, pix6, IFF_PNG);        /* 5 */
        Leptonica1.pixaAddPix(pixa, pix6, L_COPY);

        /* Get paint-through mask for changed pixels */
        pix7 = Leptonica1.pixThresholdToBinary(pix6, 210);
        Leptonica1.regTestWritePixAndCheck(rp, pix7, IFF_PNG);        /* 6 */
        Leptonica1.pixaAddPix(pixa, pix7, L_INSERT);

        /* Add the inverted, cleaned lines to orig.  Because
         * the background was cleaned, the inversion is 0,
         * so when you add, it doesn't lighten those pixels.
         * It only lightens (to white) the pixels in the lines! */
        Leptonica1.pixInvert(pix6, pix6);
        pix8 = Leptonica1.pixAddGray(null, pix2, pix6);
        Leptonica1.regTestWritePixAndCheck(rp, pix8, IFF_PNG);        /* 7 */
        Leptonica1.pixaAddPix(pixa, pix8, L_COPY);

        pix9 = Leptonica1.pixOpenGray(pix8, 1, 9);
        Leptonica1.regTestWritePixAndCheck(rp, pix9, IFF_PNG);        /* 8 */
        Leptonica1.pixaAddPix(pixa, pix9, L_INSERT);

        Leptonica1.pixCombineMasked(pix8, pix9, pix7);
        Leptonica1.regTestWritePixAndCheck(rp, pix8, IFF_PNG);        /* 9 */
        Leptonica1.pixaAddPix(pixa, pix8, L_INSERT);

        System.err.println("Writing to: target/test-classes/test-results/lineremoval.pdf");
        Leptonica1.pixaConvertToPdf(pixa, 0, 1.0f, L_FLATE_ENCODE, 0, "lineremoval example",
                "target/test-classes/test-results/lineremoval.pdf");
        pix1 = Leptonica1.pixaDisplayTiledInColumns(pixa, 5, 0.5f, 30, 2);
        Leptonica1.pixWrite("target/test-classes/test-results/lineremoval.jpg", pix1, IFF_JFIF_JPEG);
        Leptonica1.pixDisplay(pix1, 100, 100);

        // resource cleanup
        dispose(pixa);
        dispose(pixs);
        dispose(pix1);
        dispose(pix6);
//        Leptonica1.regTestCleanup(rp);
    }
}
