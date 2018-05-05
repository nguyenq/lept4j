/*
 * Copyright 2018 Quan Nguyen
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

import net.sourceforge.lept4j.util.LeptUtils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Java version of <code>speckle_reg.c</code>, demonstrating morphological
 * method of removing speckle.
 *
 * See
 * <a href="https://github.com/DanBloomberg/leptonica/blob/master/prog/speckle_reg.c">speckle_reg.c</a>
 */
public class SpeckleRemovalTest {

    private final String testResourcesPath = "src/test/resources/test-data";
    private final String testResultsPath = "target/test-classes/test-results/";

    Leptonica instance;

    public SpeckleRemovalTest() {
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

    /* HMT (with just misses) for speckle up to 2x2 */
    /*
    "oooo"
    "oC o"
    "o  o"
    "oooo"
    */
    public static final String selstr2 = "oooooC oo  ooooo";
    /* HMT (with just misses) for speckle up to 3x3 */
    /*
    "ooooo"
    "oC  o"
    "o   o"
    "o   o"
    "ooooo"
    */
    public static final String selstr3 = "ooooooC  oo   oo   oooooo";

    /**
     * Test of Despeckle algorithm.
     *
     */
    @Test
    public void testDespeckle() {
        Pix pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9, pix10;
        Pixa pixa1;
        Sel sel1, sel2, sel3, sel4;

        String filename = "w91frag.jpg";
        File image = new File(testResourcesPath, filename);
        Pix pixs = instance.pixRead(image.getPath());

        /*  Normalize for rapidly varying background */
        pixa1 = instance.pixaCreate(0);
        instance.pixaAddPix(pixa1, pixs, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result0.jpg", pixs, ILeptonica.IFF_JFIF_JPEG);        /* 0 */
        pix1 = instance.pixBackgroundNormFlex(pixs, 7, 7, 1, 1, 10);
        instance.pixaAddPix(pixa1, pix1, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result1.jpg", pix1, ILeptonica.IFF_JFIF_JPEG);        /* 1 */

        /* Remove the background */
        pix2 = instance.pixGammaTRCMasked(null, pix1, null, 1.0f, 100, 175);
        instance.pixWrite(testResultsPath + "result2.jpg", pix2, ILeptonica.IFF_JFIF_JPEG);        /* 2 */

        /* Binarize */
        pix3 = instance.pixThresholdToBinary(pix2, 180);
        instance.pixaAddPix(pixa1, pix3, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result3.png", pix3, ILeptonica.IFF_PNG);        /* 3 */

        /* Remove the speckle noise up to 2x2 */
        sel1 = instance.selCreateFromString(selstr2, 4, 4, "speckle2");
        pix4 = instance.pixHMT(null, pix3, sel1.getPointer());
        instance.pixaAddPix(pixa1, pix4, ILeptonica.L_INSERT);
        sel2 = instance.selCreateBrick(2, 2, 0, 0, ILeptonica.SEL_HIT);
        pix5 = instance.pixDilate(null, pix4, sel2.getPointer());
        instance.pixaAddPix(pixa1, pix5, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result4.png", pix5, ILeptonica.IFF_PNG);        /* 4 */
        pix6 = instance.pixSubtract(null, pix3, pix5);
        instance.pixaAddPix(pixa1, pix6, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result5.png", pix6, ILeptonica.IFF_PNG);        /* 5 */

        /* Remove the speckle noise up to 3x3 */
        sel3 = instance.selCreateFromString(selstr3, 5, 5, "speckle3");
        pix7 = instance.pixHMT(null, pix3, sel3.getPointer());
        instance.pixaAddPix(pixa1, pix7, ILeptonica.L_INSERT);
        sel4 = instance.selCreateBrick(3, 3, 0, 0, ILeptonica.SEL_HIT);
        pix8 = instance.pixDilate(null, pix7, sel4.getPointer());
        instance.pixaAddPix(pixa1, pix8, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result6.png", pix8, ILeptonica.IFF_PNG);        /* 6 */
        pix9 = instance.pixSubtract(null, pix3, pix8);
        instance.pixaAddPix(pixa1, pix9, ILeptonica.L_INSERT);
        instance.pixWrite(testResultsPath + "result7.png", pix9, ILeptonica.IFF_PNG);        /* 7 */

        pix10 = instance.pixaDisplayTiledInColumns(pixa1, 3, 1.0f, 30, 2);
        instance.pixDisplayWithTitle(pix10, 0, 0, null, 1);

        instance.pixWrite(testResultsPath + "result8.jpg", pix10, ILeptonica.IFF_JFIF_JPEG);        /* 8 */

        LeptUtils.dispose(sel1);
        LeptUtils.dispose(sel2);
        LeptUtils.dispose(sel3);
        LeptUtils.dispose(sel4);
        LeptUtils.dispose(pix2);
        LeptUtils.dispose(pix10);
        LeptUtils.dispose(pixa1);
    }
}
