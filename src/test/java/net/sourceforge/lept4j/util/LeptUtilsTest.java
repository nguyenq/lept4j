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

import com.sun.jna.ptr.PointerByReference;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

import net.sourceforge.lept4j.Leptonica;
import net.sourceforge.lept4j.Leptonica1;
import net.sourceforge.lept4j.Pix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LeptUtilsTest {

    private final String testResourcesPath = "src/test/resources/test-data";

    public LeptUtilsTest() {
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
     * Test of convertPixToImage method, of class LeptUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertPixToImage() throws Exception {
        System.out.println("convertPixToImage");
        File input = new File(testResourcesPath, "eurotext.png");
        Leptonica leptInstance = Leptonica.INSTANCE;
        Pix pix = leptInstance.pixRead(input.getPath());
        BufferedImage result = LeptUtils.convertPixToImage(pix);
        assertEquals(pix.w, result.getWidth());
        assertEquals(pix.h, result.getHeight());
        assertEquals(pix.d, result.getColorModel().getPixelSize());
        System.out.println(String.format("Image properties: width=%d, height=%d, depth=%d", result.getWidth(), result.getHeight(), result.getColorModel().getPixelSize()));
        PointerByReference pRef = new PointerByReference();
        pRef.setValue(pix.getPointer());
        leptInstance.pixDestroy(pRef);
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

}
