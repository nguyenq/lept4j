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

import com.sun.jna.ptr.PointerByReference;
import java.io.File;
import java.nio.FloatBuffer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static net.sourceforge.lept4j.ILeptonica.IFF_PNG;

/**
 * Java version of <code>lineremoval.c</code>, demonstrating line removal from a
 * grayscale sketch.<br>
 * <br>
 * Note: Leptonica uses gthumb on Unix and IrfanView (<code>i_view32</code>) on
 * Windows for displaying images.
 */
public class LineRemovalTest {

    private final String testResourcesPath = "src/test/resources/test-data";
    Leptonica instance;

    public LineRemovalTest() {
        File outputDir = new File("test/test-results");
        outputDir.mkdirs();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
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
        String filein;
        float angle, conf, deg2rad;
        Pix pixs, pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9;

        filein = new File(testResourcesPath, "dave-orig.png").getPath();
        deg2rad = (float) (3.14159 / 180.);

        instance = new LeptonicaImpl().getInstance();

        if ((pixs = instance.pixRead(filein)) == null) {
            System.err.print("pix not made");
            throw new Exception("pix not made");
        }

        /* threshold to binary, extracting much of the lines */
        pix1 = instance.pixThresholdToBinary(pixs, 170);
        instance.pixWrite("test/test-results/dave-proc1.png", pix1, IFF_PNG);
        instance.pixDisplayWrite(pix1, 1);

        /* find the skew angle and deskew using an interpolated
         * rotator for anti-aliasing (to avoid jaggies) */
        FloatBuffer pangle = FloatBuffer.allocate(1);
        FloatBuffer pconf = FloatBuffer.allocate(1);
        instance.pixFindSkew(pix1, pangle, pconf);
        angle = pangle.get();
        conf = pconf.get();
        pix2 = instance.pixRotateAMGray(pixs, (float) (deg2rad * angle), (byte) 255);
        instance.pixWrite("test/test-results/dave-proc2.png", pix2, IFF_PNG);
        instance.pixDisplayWrite(pix2, 1);

        /* extract the lines to be removed */
        pix3 = instance.pixCloseGray(pix2, 51, 1);
        instance.pixWrite("test/test-results/dave-proc3.png", pix3, IFF_PNG);
        instance.pixDisplayWrite(pix3, 1);

        /* solidify the lines to be removed */
        pix4 = instance.pixErodeGray(pix3, 1, 5);
        instance.pixWrite("test/test-results/dave-proc4.png", pix4, IFF_PNG);
        instance.pixDisplayWrite(pix4, 1);

        /* clean the background of those lines */
        pix5 = instance.pixThresholdToValue(null, pix4, 210, 255);
        instance.pixWrite("test/test-results/dave-proc5.png", pix5, IFF_PNG);
        instance.pixDisplayWrite(pix5, 1);

        pix6 = instance.pixThresholdToValue(null, pix5, 200, 0);
        instance.pixWrite("test/test-results/dave-proc6.png", pix6, IFF_PNG);
        instance.pixDisplayWrite(pix6, 1);

        /* get paint-through mask for changed pixels */
        pix7 = instance.pixThresholdToBinary(pix6, 210);
        instance.pixWrite("test/test-results/dave-proc7.png", pix7, IFF_PNG);
        instance.pixDisplayWrite(pix7, 1);

        /* add the inverted, cleaned lines to orig.  Because
         * the background was cleaned, the inversion is 0,
         * so when you add, it doesn't lighten those pixels.
         * It only lightens (to white) the pixels in the lines! */
        instance.pixInvert(pix6, pix6);
        pix8 = instance.pixAddGray(null, pix2, pix6);
        instance.pixWrite("test/test-results/dave-proc8.png", pix8, IFF_PNG);
        instance.pixDisplayWrite(pix8, 1);

        pix9 = instance.pixOpenGray(pix8, 1, 9);
        instance.pixWrite("test/test-results/dave-proc9.png", pix9, IFF_PNG);
        instance.pixDisplayWrite(pix9, 1);

        instance.pixCombineMasked(pix8, pix9, pix7);
        instance.pixWrite("test/test-results/dave-result.png", pix8, IFF_PNG);
        instance.pixDisplayWrite(pix8, 1);

        instance.pixDisplayMultiple("test/test-results/dave-proc*.png");

        // resource cleanup
        disposePix(pixs);
        disposePix(pix1);
        disposePix(pix2);
        disposePix(pix3);
        disposePix(pix4);
        disposePix(pix5);
        disposePix(pix6);
        disposePix(pix7);
        disposePix(pix8);
        disposePix(pix9);
    }

//    /**
//     * Test of LineRemoval algorithm.
//     *
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testLineRemoval1() throws Exception {
//        String filein;
//        float angle, conf, deg2rad;
//        Pix pixs, pix1, pix2, pix3, pix4, pix5;
//        Pix pix6, pix7, pix8, pix9;
//
//        filein = "dave-orig.png";
//        deg2rad = (float) (3.14159 / 180.);
//
//        if ((pixs = Leptonica1.pixRead(filein)) == null) {
//            System.err.print("pix not made");
//            return;
//        }
//
//        /* threshold to binary, extracting much of the lines */
//        pix1 = Leptonica1.pixThresholdToBinary(pixs, 170);
//        Leptonica1.pixWrite("test/test-results/dave-proc1.png", pix1, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix1, 1);
//
//        /* find the skew angle and deskew using an interpolated
//         * rotator for anti-aliasing (to avoid jaggies) */
//        FloatBuffer pangle = FloatBuffer.allocate(1);
//        FloatBuffer pconf = FloatBuffer.allocate(1);
//        Leptonica1.pixFindSkew(pix1, pangle, pconf);
//        angle = pangle.get();
//        conf = pconf.get();
//        pix2 = Leptonica1.pixRotateAMGray(pixs, (float) (deg2rad * angle), (byte) 255);
//        Leptonica1.pixWrite("test/test-results/dave-proc2.png", pix2, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix2, 1);
//
//        /* extract the lines to be removed */
//        pix3 = Leptonica1.pixCloseGray(pix2, 51, 1);
//        Leptonica1.pixWrite("test/test-results/dave-proc3.png", pix3, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix3, 1);
//
//        /* solidify the lines to be removed */
//        pix4 = Leptonica1.pixErodeGray(pix3, 1, 5);
//        Leptonica1.pixWrite("test/test-results/dave-proc4.png", pix4, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix4, 1);
//
//        /* clean the background of those lines */
//        pix5 = Leptonica1.pixThresholdToValue(null, pix4, 210, 255);
//        Leptonica1.pixWrite("test/test-results/dave-proc5.png", pix5, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix5, 1);
//
//        pix6 = Leptonica1.pixThresholdToValue(null, pix5, 200, 0);
//        Leptonica1.pixWrite("test/test-results/dave-proc6.png", pix6, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix6, 1);
//
//        /* get paint-through mask for changed pixels */
//        pix7 = Leptonica1.pixThresholdToBinary(pix6, 210);
//        Leptonica1.pixWrite("test/test-results/dave-proc7.png", pix7, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix7, 1);
//
//        /* add the inverted, cleaned lines to orig.  Because
//         * the background was cleaned, the inversion is 0,
//         * so when you add, it doesn't lighten those pixels.
//         * It only lightens (to white) the pixels in the lines! */
//        Leptonica1.pixInvert(pix6, pix6);
//        pix8 = Leptonica1.pixAddGray(null, pix2, pix6);
//        Leptonica1.pixWrite("test/test-results/dave-proc8.png", pix8, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix8, 1);
//
//        pix9 = Leptonica1.pixOpenGray(pix8, 1, 9);
//        Leptonica1.pixWrite("test/test-results/dave-proc9.png", pix9, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix9, 1);
//
//        Leptonica1.pixCombineMasked(pix8, pix9, pix7);
//        Leptonica1.pixWrite("test/test-results/dave-result.png", pix8, IFF_PNG);
//        Leptonica1.pixDisplayWrite(pix8, 1);
//
//        Leptonica1.pixDisplayMultiple("test/test-results/dave-proc*.png");
//
//        // resource cleanup
//        disposePix(pixs);
//        disposePix(pix1);
//        disposePix(pix2);
//        disposePix(pix3);
//        disposePix(pix4);
//        disposePix(pix5);
//        disposePix(pix6);
//        disposePix(pix7);
//        disposePix(pix8);
//        disposePix(pix9);
//    }
    /**
     * Disposes of Pix resource.
     *
     * @param pix
     */
    void disposePix(Pix pix) {
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(pix.getPointer());
        Leptonica1.pixDestroy(pRef);
    }
}
