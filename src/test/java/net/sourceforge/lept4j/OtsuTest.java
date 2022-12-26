/*
 * Copyright 2016 Quan Nguyen
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
import java.nio.IntBuffer;
import static net.sourceforge.lept4j.ILeptonica.*;
import net.sourceforge.lept4j.util.LeptUtils;

import org.junit.jupiter.api.*;

/**
 * Java version of <code>otsutest2.c</code>.
 * <br>
 * This demonstrates the usefulness of the modified version of Otsu for
 * thresholding an image that doesn't have a well-defined background color.
 * <br>
 * Standard Otsu binarization is done with <code>scorefract = 0.0</code>, which
 * returns the threshold at the maximum value of the score. However, this value
 * is up on the shoulder of the background, and its use causes some of the dark
 * background to be binarized as foreground.
 * <br>
 * Using the modified Otsu with <code>scorefract = 0.1</code> returns a
 * threshold at the lowest value of this histogram such that the score is at
 * least 0.9 times the maximum value of the score. This allows the threshold to
 * be taken in the histogram minimum between the fg and bg peaks, producing a
 * much cleaner binarization.
 */
public class OtsuTest {

    private final String testResourcesPath = "src/test/resources/test-data";

    public OtsuTest() {
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
     * Test of Otsu algorithm.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testOtsu() throws Exception {
        System.out.println("Otsu");
        String textstr;
        IntBuffer thresh = IntBuffer.allocate(1);
        IntBuffer fgval = IntBuffer.allocate(1);
        IntBuffer bgval = IntBuffer.allocate(1);
        float scorefract;
        L_Bmf bmf;
        Pix pixs, pixb, pixg, pixp, pix1, pix2, pix3;
        Pixa pixa1, pixad;

        Leptonica1.setLeptDebugOK(1);
//        Leptonica1.lept_mkdir("lept/otsu");

        String filename = "1555-7.jpg";
        File image = new File(testResourcesPath, filename);
        pixs = Leptonica1.pixRead(image.getPath());
        pixg = Leptonica1.pixConvertTo8(pixs, 0);
        bmf = Leptonica1.bmfCreate(null, 8);
        pixad = Leptonica1.pixaCreate(0);

        for (int i = 0; i < 3; i++) {
            pixa1 = Leptonica1.pixaCreate(2);
            scorefract = 0.1f * i;

            /* Get a 1 bpp version; use a single tile */
            PointerByReference ppixb = new PointerByReference();
            int result = Leptonica1.pixOtsuAdaptiveThreshold(pixg, 2000, 2000, 0, 0, scorefract, null, ppixb);
            pixb = new Pix(ppixb.getValue());
            Leptonica1.pixaAddPix(pixa1, pixg, L_COPY);
            Leptonica1.pixaAddPix(pixa1, pixb, L_INSERT);

            thresh.rewind();
            fgval.rewind();
            bgval.rewind();
            PointerByReference ppixp = new PointerByReference();

            /* Show the histogram of gray values and the split location */
            result = Leptonica1.pixSplitDistributionFgBg(pixg, scorefract, 1, thresh, fgval, bgval, ppixp);
            System.err.printf("thresh = %d, fgval = %d, bgval = %d\n", thresh.get(), fgval.get(), bgval.get());
            thresh.rewind();

            pixp = new Pix(ppixp.getValue());
            Leptonica1.pixaAddPix(pixa1, pixp, L_CLONE);

            /* Join these together and add some text */
            pix1 = Leptonica1.pixaDisplayTiledInColumns(pixa1, 3, 1.0f, 20, 2);
            textstr = String.format("Scorefract = %3.1f ........... Thresh = %d", scorefract, thresh.get());
            pix2 = Leptonica1.pixAddSingleTextblock(pix1, bmf, textstr, 0x00ff0000, L_ADD_BELOW, null);

            /* Save and display the result */
            Leptonica1.pixaAddPix(pixad, pix2, L_INSERT);
            textstr = String.format("target/test-classes/test-results/otsu.%d.png", i);
            Leptonica1.pixWrite(textstr, pix2, IFF_PNG);
            Leptonica1.pixDisplay(pix2, 100, 100);
            LeptUtils.dispose(pix1);
            LeptUtils.dispose(pixa1);
        }

        /* Use a smaller tile for Otsu */
        for (int i = 0; i < 2; i++) {
            scorefract = 0.1f * i;
            PointerByReference ppixb = new PointerByReference();
            int result = Leptonica1.pixOtsuAdaptiveThreshold(pixg, 300, 300, 0, 0, scorefract, null, ppixb);
            pixb = new Pix(ppixb.getValue());
            pix1 = Leptonica1.pixAddBlackOrWhiteBorder(pixb, 2, 2, 2, 2, L_GET_BLACK_VAL);
            pix2 = Leptonica1.pixScale(pix1, 0.5f, 0.5f);
            textstr = String.format("Scorefract = %3.1f", scorefract);
            pix3 = Leptonica1.pixAddSingleTextblock(pix2, bmf, textstr, 1, L_ADD_BELOW, null);
            Leptonica1.pixaAddPix(pixad, pix3, L_INSERT);
            LeptUtils.dispose(pixb);
            LeptUtils.dispose(pix1);
            LeptUtils.dispose(pix2);
        }

        System.err.println("Writing to: target/test-classes/test-results/result1.pdf");
        Leptonica1.pixaConvertToPdf(pixad, 75, 1.0f, 0, 0, "Otsu thresholding",
                "target/test-classes/test-results/result1.pdf");
        LeptUtils.dispose(bmf);
        LeptUtils.dispose(pixs);
        LeptUtils.dispose(pixg);
        LeptUtils.dispose(pixad);
    }
}
