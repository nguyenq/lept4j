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
import static net.sourceforge.lept4j.ILeptonica.IFF_JFIF_JPEG;
import static net.sourceforge.lept4j.ILeptonica.IFF_PNG;
import static net.sourceforge.lept4j.ILeptonica.IFF_TIFF_G4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Java version of <code>dewarptest1.c</code>, this exercises functions in
 * <code>dewarp.c</code> for dewarping based on lines of horizontal text. It
 * also creates a 24-image pdf of steps in the process.<br> Output files could
 * be found in 
 * <code>C:\Users\yourname\AppData\Local\Temp\leptonica<code> directory on Windows.
 * <br>
 * Note: Leptonica uses gthumb on Unix and IrfanView (<code>i_view32</code>) on
 * Windows for displaying images.
 */
public class DewarpTest {

    private final String testResourcesPath = "src/test/resources/test-data";
    Leptonica instance;

    public DewarpTest() {

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
     * Test of Dewarp algorithm.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDewarp() throws Exception {
        System.out.println("Dewarp");
        L_Dewarp dew1, dew2;
        L_Dewarpa dewa;
        Pix pixs, pixn, pixg, pixb, pixd, pixt1, pixt2;
        Pix pixs2, pixn2, pixg2, pixb2, pixd2;

        instance = new LeptonicaImpl().getInstance();

        /*    pixs = instance.pixRead("test/1555-7.jpg"); */
        pixs = instance.pixRead(new File(testResourcesPath, "cat-35.jpg").getPath());
        /*    pixs =  instance.pixRead("test/cat-10.jpg"); */

        /* Normalize for varying background and binarize */
        pixn = instance.pixBackgroundNormSimple(pixs, null, null);
        pixg = instance.pixConvertRGBToGray(pixn, 0.5f, 0.3f, 0.2f);
        pixb = instance.pixThresholdToBinary(pixg, 130);

        /* Run the basic functions */
        dewa = instance.dewarpaCreate(2, 30, 1, 10, 30);
        instance.dewarpaUseBothArrays(dewa, 1);
        dew1 = instance.dewarpCreate(pixb, 35);
        instance.dewarpaInsertDewarp(dewa, dew1);
        instance.dewarpBuildPageModel(dew1, "/tmp/lept/dewarp_model1.pdf");
        PointerByReference ppixd = new PointerByReference();
        instance.dewarpaApplyDisparity(dewa, 35, pixg, 200, 0, 0, ppixd, "/tmp/lept/dewarp_apply1.pdf");
        pixd = new Pix(ppixd.getValue());

        /* Write out some of the files to be imaged */
        instance.lept_mkdir("lept");
        instance.lept_rmdir("dewtest");
        instance.lept_mkdir("dewtest");
        instance.pixWrite("/tmp/dewtest/001.jpg", pixs, IFF_JFIF_JPEG);
        instance.pixWrite("/tmp/dewtest/002.jpg", pixn, IFF_JFIF_JPEG);
        instance.pixWrite("/tmp/dewtest/003.jpg", pixg, IFF_JFIF_JPEG);
        instance.pixWrite("/tmp/dewtest/004.png", pixb, IFF_TIFF_G4);
        instance.pixWrite("/tmp/dewtest/005.jpg", pixd, IFF_JFIF_JPEG);
        pixt1 = instance.pixRead("/tmp/dewmod/0020.png");
        instance.pixWrite("/tmp/dewtest/006.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0030.png");
        instance.pixWrite("/tmp/dewtest/007.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0060.png");
        instance.pixWrite("/tmp/dewtest/008.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0070.png");
        instance.pixWrite("/tmp/dewtest/009.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewapply/002.png");
        instance.pixWrite("/tmp/dewtest/010.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewapply/003.png");
        instance.pixWrite("/tmp/dewtest/011.png", pixt1, IFF_PNG);
        pixt2 = instance.pixThresholdToBinary(pixt1, 130);
        instance.pixWrite("/tmp/dewtest/012.png", pixt2, IFF_TIFF_G4);
        pixDestroy(pixt1);
        pixDestroy(pixt2);
        pixt1 = instance.pixRead("/tmp/dewmod/0041.png");
        instance.pixWrite("/tmp/dewtest/013.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0042.png");
        instance.pixWrite("/tmp/dewtest/014.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0051.png");
        instance.pixWrite("/tmp/dewtest/015.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewmod/0052.png");
        instance.pixWrite("/tmp/dewtest/016.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);

        /* Normalize another image, that may not have enough textlines
         * to build an accurate model */
        /*    pixs2 =  instance.pixRead("test/1555-3.jpg");  */
        pixs2 = instance.pixRead(new File(testResourcesPath, "cat-7.jpg").getPath());
        /*    pixs2 =  instance.pixRead("test/cat-14.jpg"); */
        pixn2 = instance.pixBackgroundNormSimple(pixs2, null, null);
        pixg2 = instance.pixConvertRGBToGray(pixn2, 0.5f, 0.3f, 0.2f);
        pixb2 = instance.pixThresholdToBinary(pixg2, 130);

        /* Apply the previous disparity model to this image */
        dew2 = instance.dewarpCreate(pixb2, 7);
        instance.dewarpaInsertDewarp(dewa, dew2);
        instance.dewarpaInsertRefModels(dewa, 0, 1);
//        dewarpaInfo(stderr, dewa);

        instance.dewarpaApplyDisparity(dewa, 7, pixg2, 200, 0, 0, ppixd, "/tmp/lept/dewarp_apply2.pdf");
        pixd2 = new Pix(ppixd.getValue());
        PointerByReference dewaRef = new PointerByReference();
        dewaRef.setValue(dewa.getPointer());
        instance.dewarpaDestroy(dewaRef);

        /* Write out files for the second image */
        instance.pixWrite("/tmp/dewtest/017.jpg", pixs2, IFF_JFIF_JPEG);
        instance.pixWrite("/tmp/dewtest/018.jpg", pixg2, IFF_JFIF_JPEG);
        instance.pixWrite("/tmp/dewtest/019.png", pixb2, IFF_TIFF_G4);
        instance.pixWrite("/tmp/dewtest/020.jpg", pixd2, IFF_JFIF_JPEG);
        pixt1 = instance.pixRead("/tmp/dewmod/0060.png");
        instance.pixWrite("/tmp/dewtest/021.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewapply/002.png");
        instance.pixWrite("/tmp/dewtest/022.png", pixt1, IFF_PNG);
        pixt2 = instance.pixThresholdToBinary(pixt1, 130);
        instance.pixWrite("/tmp/dewtest/023.png", pixt2, IFF_TIFF_G4);
        pixDestroy(pixt1);
        pixDestroy(pixt2);
        pixt1 = instance.pixRead("/tmp/dewmod/0070.png");
        instance.pixWrite("/tmp/dewtest/024.png", pixt1, IFF_PNG);
        pixDestroy(pixt1);
        pixt1 = instance.pixRead("/tmp/dewapply/003.png");
        instance.pixWrite("/tmp/dewtest/025.png", pixt1, IFF_PNG);
        pixt2 = instance.pixThresholdToBinary(pixt1, 130);
        instance.pixWrite("/tmp/dewtest/026.png", pixt2, IFF_TIFF_G4);
        pixDestroy(pixt1);
        pixDestroy(pixt2);

        /* Generate the big pdf file */
        instance.convertFilesToPdf("/tmp/dewtest", null, 135, 1.0f, 0, 0, "Dewarp Test", "/tmp/lept/dewarptest1.pdf");

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.out.println("pdf file made: " + System.getProperty("java.io.tmpdir") + "leptonica\\lept\\dewarptest1.pdf");
        } else {
            System.out.println("pdf file made: /tmp/lept/dewarptest1.pdf");
        }

        instance.lept_rmdir("dewmod");
        instance.lept_rmdir("dewtest");
        pixDestroy(pixs);
        pixDestroy(pixn);
        pixDestroy(pixg);
        pixDestroy(pixb);
        pixDestroy(pixd);
        pixDestroy(pixs2);
        pixDestroy(pixn2);
        pixDestroy(pixg2);
        pixDestroy(pixb2);
        pixDestroy(pixd2);
    }

    /**
     * Disposes of Pix resource.
     *
     * @param pix
     */
    void pixDestroy(Pix pix) {
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(pix.getPointer());
        instance.pixDestroy(pRef);
    }
}
