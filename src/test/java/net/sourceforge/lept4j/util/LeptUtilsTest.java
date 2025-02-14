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

import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;

import net.sourceforge.lept4j.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeptUtilsTest {

    private final String testResourcesPath = "src/test/resources/test-data";

    public LeptUtilsTest() {
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
     * Test of convertPixToImage method, of class LeptUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertPixToImage() throws Exception {
        System.out.println("convertPixToImage");
        File input = new File(testResourcesPath, "eurotext.png");
        Pix pix = Leptonica1.pixRead(input.getPath());
        BufferedImage result = LeptUtils.convertPixToImage(pix);
        assertEquals(pix.w, result.getWidth());
        assertEquals(pix.h, result.getHeight());
        assertEquals(pix.d, result.getColorModel().getPixelSize());
        System.out.println(String.format("Image properties: width=%d, height=%d, depth=%d", result.getWidth(), result.getHeight(), result.getColorModel().getPixelSize()));
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(pix.getPointer());
        Leptonica1.pixDestroy(pRef);
    }

    /**
     * Test of convertImageToPix method, of class LeptUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertImageToPix() throws Exception {
        System.out.println("convertImageToPix");
        File input = new File(testResourcesPath, "eurotext.png");
        BufferedImage image = ImageIO.read(new FileInputStream(input));
        Pix result = LeptUtils.convertImageToPix(image);
        assertEquals(image.getWidth(), result.w);
        assertEquals(image.getHeight(), result.h);
        assertEquals(image.getColorModel().getPixelSize(), result.d);
        System.out.println(String.format("Image properties: width=%d, height=%d, depth=%d", result.w, result.h, result.d));
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(result.getPointer());
        Leptonica1.pixDestroy(pRef);
    }

    /**
     * Test of getImageByteBuffer method, of class LeptUtils.
     * @throws java.lang.Exception
     */
    @Disabled("Disabled until finding a way")
    @Test
    public void testGetImageByteBuffer() throws Exception {
        System.out.println("getImageByteBuffer");
        RenderedImage image = null;
        ByteBuffer expResult = null;
        ByteBuffer result = LeptUtils.getImageByteBuffer(image);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeLines method, of class LeptUtils.
     */
    @Test
    public void testRemoveLines() {
        System.out.println("removeLines");
        File input = new File(testResourcesPath, "table.png");
        Pix pixs = Leptonica1.pixRead(input.getPath());
        Leptonica1.pixDisplay(pixs, 100, 100);
        // remove horizontal lines
        Pix result = LeptUtils.removeLines(pixs);
        new File("target/test-classes/test-results").mkdirs();
        String outfile = "target/test-classes/test-results/result-hlines-removed.png";
        Leptonica1.pixWrite(outfile, result, ILeptonica.IFF_PNG);
        Leptonica1.pixDisplay(result, 100, 100);

        // remove vertical lines
        Pix pix90 = Leptonica1.pixRotate90(result, 1); // rotate 90 degrees
        Pix result2 = LeptUtils.removeLines(pix90);
        Pix result3 = Leptonica1.pixRotate90(result2, -1); // rotate 90 degrees back
        outfile = "target/test-classes/test-results/result-vlines-removed.png";
        Leptonica1.pixWrite(outfile, result3, ILeptonica.IFF_PNG);
        Leptonica1.pixDisplay(result3, 100, 100);

        // resource cleanup
        LeptUtils.dispose(pixs);
        LeptUtils.dispose(result2);
        LeptUtils.dispose(result3);
        LeptUtils.dispose(result);
        assertTrue(new File(outfile).exists());
    }

    /**
     * Test of removeLines method, of class LeptUtils.
     */
    @Test
    public void testRemoveLinesFile() throws IOException {
        System.out.println("removeLines from image file");
        File input = new File(testResourcesPath, "lines.tif");
        // remove lines
        String outfile = LeptUtils.removeLines(input.getPath());
        File outFile = new File(outfile);
        assertTrue(outFile.exists());
        outFile.deleteOnExit();
    }

    /**
     * Test of despeckle method, of class LeptUtils.
     */
    @Test
    public void testDespeckle() {
        System.out.println("despeckle");
        File input = new File(testResourcesPath, "w91frag.jpg");
        Pix pixs = Leptonica1.pixRead(input.getPath());
        Leptonica1.pixDisplay(pixs, 100, 100);
        new File("target/test-classes/test-results").mkdirs();
        String outfile = "target/test-classes/test-results/result-despeckled2.png";
        Pix result = LeptUtils.despeckle(pixs, LeptUtils.SEL_STR2, 2);
        Leptonica1.pixWrite(outfile, result, ILeptonica.IFF_PNG);
        Leptonica1.pixDisplay(result, 100, 100);
        assertTrue(new File(outfile).exists());
        outfile = "target/test-classes/test-results/result-despeckled3.png";
        Pix result1 = LeptUtils.despeckle(pixs, LeptUtils.SEL_STR3, 3);
        Leptonica1.pixDisplay(result1, 100, 100);
        Leptonica1.pixWrite(outfile, result1, ILeptonica.IFF_PNG);

        // resource cleanup
        LeptUtils.dispose(pixs);
        LeptUtils.dispose(result);
        LeptUtils.dispose(result1);

        assertTrue(new File(outfile).exists());
    }

    /**
     * Test of disposePix method, of class LeptUtils.
     */
    @Test
    public void testDisposePix() {
        System.out.println("disposePix");
        Pix pix = null;
        LeptUtils.disposePix(pix);
    }

    /**
     * Test of dispose method, of class LeptUtils.
     */
    @Test
    public void testDispose() {
        System.out.println("dispose");
        Structure resource = null;
        LeptUtils.dispose(resource);
    }
}
