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

import com.sun.jna.StringArray;
import com.sun.jna.ptr.PointerByReference;
import java.io.File;

import static net.sourceforge.lept4j.ILeptonica.IFF_JFIF_JPEG;
import static net.sourceforge.lept4j.ILeptonica.IFF_PNG;
import net.sourceforge.lept4j.util.LeptUtils;

import org.junit.jupiter.api.*;

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

    public SpeckleRemovalTest() {

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
    public void testDespeckle() throws Exception {
        Pix pix1, pix2, pix3, pix4, pix5;
        Pix pix6, pix7, pix8, pix9, pix10;
        Pixa pixa1;
        Sel sel1, sel2, sel3, sel4;
        L_RegParams rp;
        int argc = 2;
        String[] argv = {"speckle_deg", "display"};
        PointerByReference pargv = new PointerByReference(new StringArray(argv));
        PointerByReference prp = new PointerByReference();

//        if (Leptonica1.regTestSetup(argc, pargv, prp) == 1) {
//            System.err.print("Failed Test Setup");
//            throw new Exception("Failed Test Setup");
//        }
        rp = new L_RegParams(prp.getValue());
        rp.mode = 2;
        rp.display = 1;
        
        String filename = "w91frag.jpg";
        File image = new File(testResourcesPath, filename);
        Pix pixs = Leptonica1.pixRead(image.getPath());

        /*  Normalize for rapidly varying background */
        pixa1 = Leptonica1.pixaCreate(0);
        Leptonica1.pixaAddPix(pixa1, pixs, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pixs, IFF_JFIF_JPEG);  /* 0 */
        Leptonica1.pixWrite(testResultsPath + "result0.jpg", pixs, ILeptonica.IFF_JFIF_JPEG);        /* 0 */
        pix1 = Leptonica1.pixBackgroundNormFlex(pixs, 7, 7, 1, 1, 10);
        Leptonica1.pixaAddPix(pixa1, pix1, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix1, IFF_JFIF_JPEG);  /* 1 */
        Leptonica1.pixWrite(testResultsPath + "result1.jpg", pix1, ILeptonica.IFF_JFIF_JPEG);        /* 1 */

        /* Remove the background */
        pix2 = Leptonica1.pixGammaTRCMasked(null, pix1, null, 1.0f, 100, 175);
        Leptonica1.regTestWritePixAndCheck(rp, pix2, IFF_JFIF_JPEG);  /* 2 */
        Leptonica1.pixWrite(testResultsPath + "result2.jpg", pix2, ILeptonica.IFF_JFIF_JPEG);        /* 2 */

        /* Binarize */
        pix3 = Leptonica1.pixThresholdToBinary(pix2, 180);
        Leptonica1.pixaAddPix(pixa1, pix3, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix3, IFF_PNG);  /* 3 */
        Leptonica1.pixWrite(testResultsPath + "result3.png", pix3, ILeptonica.IFF_PNG);        /* 3 */

        /* Remove the speckle noise up to 2x2 */
        sel1 = Leptonica1.selCreateFromString(selstr2, 4, 4, "speckle2");
        pix4 = Leptonica1.pixHMT(null, pix3, sel1.getPointer());
        Leptonica1.pixaAddPix(pixa1, pix4, ILeptonica.L_INSERT);
        sel2 = Leptonica1.selCreateBrick(2, 2, 0, 0, ILeptonica.SEL_HIT);
        pix5 = Leptonica1.pixDilate(null, pix4, sel2.getPointer());
        Leptonica1.pixaAddPix(pixa1, pix5, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix5, IFF_PNG);  /* 4 */
        Leptonica1.pixWrite(testResultsPath + "result4.png", pix5, ILeptonica.IFF_PNG);        /* 4 */
        pix6 = Leptonica1.pixSubtract(null, pix3, pix5);
        Leptonica1.pixaAddPix(pixa1, pix6, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix6, IFF_PNG);  /* 5 */
        Leptonica1.pixWrite(testResultsPath + "result5.png", pix6, ILeptonica.IFF_PNG);        /* 5 */

        /* Remove the speckle noise up to 3x3 */
        sel3 = Leptonica1.selCreateFromString(selstr3, 5, 5, "speckle3");
        pix7 = Leptonica1.pixHMT(null, pix3, sel3.getPointer());
        Leptonica1.pixaAddPix(pixa1, pix7, ILeptonica.L_INSERT);
        sel4 = Leptonica1.selCreateBrick(3, 3, 0, 0, ILeptonica.SEL_HIT);
        pix8 = Leptonica1.pixDilate(null, pix7, sel4.getPointer());
        Leptonica1.pixaAddPix(pixa1, pix8, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix8, IFF_PNG);  /* 6 */
        Leptonica1.pixWrite(testResultsPath + "result6.png", pix8, ILeptonica.IFF_PNG);        /* 6 */
        pix9 = Leptonica1.pixSubtract(null, pix3, pix8);
        Leptonica1.pixaAddPix(pixa1, pix9, ILeptonica.L_INSERT);
        Leptonica1.regTestWritePixAndCheck(rp, pix9, IFF_PNG);  /* 7 */
        Leptonica1.pixWrite(testResultsPath + "result7.png", pix9, ILeptonica.IFF_PNG);        /* 7 */

        pix10 = Leptonica1.pixaDisplayTiledInColumns(pixa1, 3, 1.0f, 30, 2);
        Leptonica1.pixDisplayWithTitle(pix10, 0, 0, null, 1);
        Leptonica1.regTestWritePixAndCheck(rp, pix10, IFF_JFIF_JPEG);  /* 8 */
        Leptonica1.pixWrite(testResultsPath + "result8.jpg", pix10, ILeptonica.IFF_JFIF_JPEG);        /* 8 */

        LeptUtils.dispose(sel1);
        LeptUtils.dispose(sel2);
        LeptUtils.dispose(sel3);
        LeptUtils.dispose(sel4);
        LeptUtils.dispose(pix2);
        LeptUtils.dispose(pix10);
        LeptUtils.dispose(pixa1);
//        Leptonica1.regTestCleanup(rp);
    }
}
