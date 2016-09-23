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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Java version of <code>otsutest2.c</code>.
 * <br>
 * This demonstrates the usefulness of the modified version of Otsu for
 * thresholding an image that doesn't have a well-defined background color.
 * <br>
 * Standard Otsu binarization is done with <code>scorefract</code> = 0.0, which
 * returns the threshold at the maximum value of the score. However. this value
 * is up on the shoulder of the background, and its use causes some of the dark
 * background to be binarized as foreground.
 * <br>
 * Using the modified Otsu with <code>scorefract</code> = 0.1 returns a
 * threshold at the lowest value of this histogram such that the score is at
 * least 0.9 times the maximum value of the score. This allows the threshold to
 * be taken in the histogram minimum between the fg and bg peaks, producing a
 * much cleaner binarization.
 */
public class OtsuTest {

    private final String testResourcesPath = "src/test/resources/test-data";

    public OtsuTest() {

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
        Pix pixs, pixb, pixb2, pixb3, pixg, pixp, pixt1, pixt2;
        Pixa pixa;

        String filename = "1555-7.jpg";
        File image = new File(testResourcesPath, filename);
        pixs = Leptonica1.pixRead(image.getPath());
        pixg = Leptonica1.pixConvertTo8(pixs, 0);
        bmf = Leptonica1.bmfCreate("fonts", 8);
        for (int i = 0; i < 3; i++) {
            pixa = Leptonica1.pixaCreate(3);
            scorefract = 0.1f * i;
            PointerByReference ppixb = new PointerByReference();
            int result = Leptonica1.pixOtsuAdaptiveThreshold(pixg, 2000, 2000, 0, 0, scorefract, null, ppixb);
            pixb = new Pix(ppixb.getValue());
            Leptonica1.pixSaveTiledOutline(pixb, pixa, 0.5f, 1, 20, 2, 32);
            thresh.rewind();
            fgval.rewind();
            bgval.rewind();
            Leptonica1.pixSplitDistributionFgBg(pixg, scorefract, 1, thresh, fgval, bgval, 1);
            System.err.printf("thresh = %d, fgval = %d, bgval = %d\n", thresh.get(), fgval.get(), bgval.get());
            thresh.rewind();
            /* Give gnuplot time to write out the plot */
            Thread.sleep(1000);
            pixp = Leptonica1.pixRead("/tmp/histplot.png");
            Leptonica1.pixSaveTiled(pixp, pixa, 1.0f, 0, 20, 1);
            pixt1 = Leptonica1.pixaDisplay(pixa, 0, 0);
            textstr = String.format("Scorefract = %3.1f ........... Thresh = %d", scorefract, thresh.get());
            pixt2 = Leptonica1.pixAddSingleTextblock(pixt1, bmf, textstr, 0x00ff0000, L_ADD_BELOW, null);
            Leptonica1.pixDisplay(pixt2, 100, 100);
            textstr = String.format("target/test-classes/test-results/otsu.%d.png", i);
            Leptonica1.pixWrite(textstr, pixt2, IFF_PNG);
            pixDestroy(pixb);
            pixDestroy(pixp);
            pixDestroy(pixt1);
            pixDestroy(pixt2);
            pixaDestroy(pixa);
        }

        pixa = Leptonica1.pixaCreate(2);
        for (int i = 0; i < 2; i++) {
            scorefract = 0.1f * i;
            PointerByReference ppixb = new PointerByReference();
            int result = Leptonica1.pixOtsuAdaptiveThreshold(pixg, 300, 300, 0, 0, scorefract, null, ppixb);
            pixb = new Pix(ppixb.getValue());
            pixb2 = Leptonica1.pixAddBlackOrWhiteBorder(pixb, 2, 2, 2, 2, L_GET_BLACK_VAL);
            textstr = String.format("Scorefract = %3.1f", scorefract);
            pixb3 = Leptonica1.pixAddSingleTextblock(pixb2, bmf, textstr, 1, L_ADD_BELOW, null);
            Leptonica1.pixSaveTiled(pixb3, pixa, 2, (i + 1) % 1, 20, 32);
            pixDestroy(pixb);
            pixDestroy(pixb2);
        }
        pixb = Leptonica1.pixaDisplay(pixa, 0, 0);
        Leptonica1.pixWrite("target/test-classes/test-results/otsu-tiled.jpg", pixb, IFF_PNG);
        pixDestroy(pixb);
        pixaDestroy(pixa);

        bmfDestroy(bmf);
        pixDestroy(pixs);
        pixDestroy(pixg);
    }

    /**
     * Disposes of Pix resource.
     *
     * @param pix
     */
    void pixDestroy(Pix pix) {
        LeptUtils.disposePix(pix);
    }

    /**
     * Disposes of Pixa resource.
     *
     * @param pixa
     */
    void pixaDestroy(Pixa pixa) {
        LeptUtils.destroyPixa(pixa);
    }

    /**
     * Disposes of L_Bmf resource.
     *
     * @param bmf
     */
    void bmfDestroy(L_Bmf bmf) {
        if (bmf == null) {
            return;
        }
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(bmf.getPointer());
        Leptonica1.bmfDestroy(pRef);
    }
}
