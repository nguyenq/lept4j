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

import java.io.File;
import java.nio.FloatBuffer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static net.sourceforge.lept4j.ILeptonica.*;
import static net.sourceforge.lept4j.util.LeptUtils.dispose;

/**
 * Java version of <code>lineremoval_reg.c</code>, demonstrating line removal from a
 * grayscale sketch.<br>
 * <br>
 * Note: Leptonica uses gthumb on Unix and IrfanView (<code>i_view32</code>) on
 * Windows for displaying images.
 */
public class LineRemovalTest {
private final String testResourcesPath = "src/test/resources/test-data";
    Leptonica instance;

    public LineRemovalTest() {
        instance = new LeptonicaImpl().getInstance();
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
        float angle, conf;
        final float deg2rad = (float) (3.14159 / 180.);
        Pix pixs, pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9;
        Pixa pixa;

        String filein = "dave-orig.png";
        File image = new File(testResourcesPath, filein);

        if ((pixs = instance.pixRead(image.getPath())) == null) {
            System.err.print("pix not read");
            throw new Exception("pix not read");
        }
        
        pixa = instance.pixaCreate(0);

        /* threshold to binary, extracting much of the lines */
        pix1 = instance.pixThresholdToBinary(pixs, 170);
        instance.pixWrite("target/test-classes/test-results/dave-proc1.png", pix1, IFF_PNG);
        instance.pixDisplayWrite(pix1, 1);
        instance.pixaAddPix(pixa, pix1, L_INSERT);

        /* find the skew angle and deskew using an interpolated
         * rotator for anti-aliasing (to avoid jaggies) */
        FloatBuffer pangle = FloatBuffer.allocate(1);
        FloatBuffer pconf = FloatBuffer.allocate(1);
        instance.pixFindSkew(pix1, pangle, pconf);
        angle = pangle.get();
        conf = pconf.get();
        pix2 = instance.pixRotateAMGray(pixs, (float) (deg2rad * angle), (byte) 255);
        instance.pixWrite("target/test-classes/test-results/dave-proc2.png", pix2, IFF_PNG);
        instance.pixDisplayWrite(pix2, 1);
        instance.pixaAddPix(pixa, pix2, L_INSERT);

        /* extract the lines to be removed */
        pix3 = instance.pixCloseGray(pix2, 51, 1);
        instance.pixWrite("target/test-classes/test-results/dave-proc3.png", pix3, IFF_PNG);
        instance.pixDisplayWrite(pix3, 1);
        instance.pixaAddPix(pixa, pix3, L_INSERT);

        /* solidify the lines to be removed */
        pix4 = instance.pixErodeGray(pix3, 1, 5);
        instance.pixWrite("target/test-classes/test-results/dave-proc4.png", pix4, IFF_PNG);
        instance.pixDisplayWrite(pix4, 1);
        instance.pixaAddPix(pixa, pix4, L_INSERT);

        /* clean the background of those lines */
        pix5 = instance.pixThresholdToValue(null, pix4, 210, 255);
        instance.pixWrite("target/test-classes/test-results/dave-proc5.png", pix5, IFF_PNG);
        instance.pixDisplayWrite(pix5, 1);
        instance.pixaAddPix(pixa, pix5, L_INSERT);

        pix6 = instance.pixThresholdToValue(null, pix5, 200, 0);
        instance.pixWrite("target/test-classes/test-results/dave-proc6.png", pix6, IFF_PNG);
        instance.pixDisplayWrite(pix6, 1);
        instance.pixaAddPix(pixa, pix6, L_COPY);

        /* get paint-through mask for changed pixels */
        pix7 = instance.pixThresholdToBinary(pix6, 210);
        instance.pixWrite("target/test-classes/test-results/dave-proc7.png", pix7, IFF_PNG);
        instance.pixDisplayWrite(pix7, 1);
        instance.pixaAddPix(pixa, pix7, L_INSERT);

        /* add the inverted, cleaned lines to orig.  Because
         * the background was cleaned, the inversion is 0,
         * so when you add, it doesn't lighten those pixels.
         * It only lightens (to white) the pixels in the lines! */
        instance.pixInvert(pix6, pix6);
        pix8 = instance.pixAddGray(null, pix2, pix6);
        instance.pixWrite("target/test-classes/test-results/dave-proc8.png", pix8, IFF_PNG);
        instance.pixDisplayWrite(pix8, 1);
        instance.pixaAddPix(pixa, pix8, L_COPY);

        pix9 = instance.pixOpenGray(pix8, 1, 9);
        instance.pixWrite("target/test-classes/test-results/dave-proc9.png", pix9, IFF_PNG);
        instance.pixDisplayWrite(pix9, 1);
        instance.pixaAddPix(pixa, pix9, L_INSERT);

        instance.pixCombineMasked(pix8, pix9, pix7);
        instance.pixWrite("target/test-classes/test-results/dave-result.png", pix8, IFF_PNG);
        instance.pixDisplayWrite(pix8, 1);
        instance.pixaAddPix(pixa, pix8, L_INSERT);
        
        System.err.println("Writing to: target/test-classes/test-results/lineremoval.pdf");
        instance.pixaConvertToPdf(pixa, 0, 1.0f, L_FLATE_ENCODE, 0, "lineremoval example",
                         "target/test-classes/test-results/lineremoval.pdf");
        pix1 = instance.pixaDisplayTiledInColumns(pixa, 5, 0.5f, 30, 2);
        instance.pixWrite("target/test-classes/test-results/lineremoval.jpg", pix1, IFF_JFIF_JPEG);
        instance.pixDisplay(pix1, 100, 100);

        // resource cleanup
        dispose(pixa);
        dispose(pixs);
        dispose(pix1);
        dispose(pix6);
    }
}
