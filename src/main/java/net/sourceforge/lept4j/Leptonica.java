/**
 * Copyright @ 2015 Quan Nguyen
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.sourceforge.lept4j;

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.ochafik.lang.jnaerator.runtime.NativeSizeByReference;
import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import net.sourceforge.lept4j.util.LoadLibs;

/**
 * JNA Wrapper for <b>Leptonica Image Processing Library</b> using
 * <code>JNA Interface Mapping</code>.
 */
public interface Leptonica extends Library, ILeptonica {

    public static final Leptonica INSTANCE = LoadLibs.getLeptonicaInstance();

    /**
     * Original signature :
     * <code>PIX* pixCleanBackgroundToWhite(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    Pix pixCleanBackgroundToWhite(Pix pixs, Pix pixim, Pix pixg, float gamma, int blackval, int whiteval);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormSimple(PIX*, PIX*, PIX*)</code>
     */
    Pix pixBackgroundNormSimple(Pix pixs, Pix pixim, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNorm(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixBackgroundNorm(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormMorph(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixBackgroundNormMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormGrayArray(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    int pixBackgroundNormGrayArray(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormRGBArrays(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixBackgroundNormRGBArrays(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormGrayArrayMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    int pixBackgroundNormGrayArrayMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormRGBArraysMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixBackgroundNormRGBArraysMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    int pixGetBackgroundGrayMap(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundRGBMap(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixGetBackgroundRGBMap(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundGrayMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**)</code>
     */
    int pixGetBackgroundGrayMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixm);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundRGBMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixGetBackgroundRGBMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_ok pixFillMapHoles(PIX*, l_int32, l_int32, l_int32)</code>
     */
    int pixFillMapHoles(Pix pix, int nx, int ny, int filltype);

    /**
     * Original signature :
     * <code>PIX* pixExtendByReplication(PIX*, l_int32, l_int32)</code>
     */
    Pix pixExtendByReplication(Pix pixs, int addw, int addh);

    /**
     * Original signature :
     * <code>l_ok pixSmoothConnectedRegions(PIX*, PIX*, l_int32)</code>
     */
    int pixSmoothConnectedRegions(Pix pixs, Pix pixm, int factor);

    /**
     * Original signature :
     * <code>PIX* pixGetInvBackgroundMap(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixGetInvBackgroundMap(Pix pixs, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixApplyInvBackgroundGrayMap(Pix pixs, Pix pixm, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundRGBMap(PIX*, PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixApplyInvBackgroundRGBMap(Pix pixs, Pix pixmr, Pix pixmg, Pix pixmb, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyVariableGrayMap(PIX*, PIX*, l_int32)</code>
     */
    Pix pixApplyVariableGrayMap(Pix pixs, Pix pixg, int target);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixGlobalNormRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int mapval);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormNoSatRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    Pix pixGlobalNormNoSatRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int factor, float rank);

    /**
     * Original signature :
     * <code>l_ok pixThresholdSpreadNorm(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixThresholdSpreadNorm(Pix pixs, int filtertype, int edgethresh, int smoothx, int smoothy, float gamma, int minval, int maxval, int targetthresh, PointerByReference ppixth, PointerByReference ppixb, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormFlex(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixBackgroundNormFlex(Pix pixs, int sx, int sy, int smoothx, int smoothy, int delta);

    /**
     * Original signature :
     * <code>PIX* pixContrastNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixContrastNorm(Pix pixd, Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>l_ok pixMinMaxTiles(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**)</code>
     */
    int pixMinMaxTiles(Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy, PointerByReference ppixmin, PointerByReference ppixmax);

    /**
     * Original signature :
     * <code>l_ok pixSetLowContrast(PIX*, PIX*, l_int32)</code>
     */
    int pixSetLowContrast(Pix pixs1, Pix pixs2, int mindiff);

    /**
     * Original signature :
     * <code>PIX* pixLinearTRCTiled(PIX*, PIX*, l_int32, l_int32, PIX*, PIX*)</code>
     */
    Pix pixLinearTRCTiled(Pix pixd, Pix pixs, int sx, int sy, Pix pixmin, Pix pixmax);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    Pix pixAffineSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampled(PIX*, l_float32*, l_int32)</code>
     */
    Pix pixAffineSampled(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    Pix pixAffinePta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffine(PIX*, l_float32*, l_int32)</code>
     */
    Pix pixAffine(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
     */
    Pix pixAffinePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffineColor(PIX*, l_float32*, l_uint32)</code>
     */
    Pix pixAffineColor(Pix pixs, FloatBuffer vc, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
     */
    Pix pixAffinePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffineGray(PIX*, l_float32*, l_uint8)</code>
     */
    Pix pixAffineGray(Pix pixs, FloatBuffer vc, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
     */
    Pix pixAffinePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);

//      /**
//       * Original signature :
//       * <code>l_ok getAffineXformCoeffs(PTA*, PTA*, l_float32**)</code>
//       */
//      int getAffineXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_ok affineInvertXform(l_float32*, l_float32**)</code>
//       */
//      int affineInvertXform(FloatBuffer vc, PointerByReference pvci);
//      /**
//       * Original signature :
//       * <code>l_ok affineXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int affineXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_ok affineXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
//       */
//      int affineXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_ok linearInterpolatePixelColor(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_uint32, l_uint32*)</code>
//       */
//      int linearInterpolatePixelColor(IntBuffer datas, int wpls, int w, int h, float x, float y, int colorval, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok linearInterpolatePixelGray(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32*)</code>
//       */
//      int linearInterpolatePixelGray(IntBuffer datas, int wpls, int w, int h, float x, float y, int grayval, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 gaussjordan(l_float32**, l_float32*, l_int32)</code>
//       */
//      int gaussjordan(PointerByReference a, FloatBuffer b, int n);
//      /**
//       * Original signature :
//       * <code>PIX* pixAffineSequential(PIX*, PTA*, PTA*, l_int32, l_int32)</code>
//       */
//      Pix pixAffineSequential(Pix pixs, Pta ptad, Pta ptas, int bw, int bh);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dTranslate(l_float32, l_float32)</code>
//       */
//      FloatByReference createMatrix2dTranslate(float transx, float transy);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dScale(l_float32, l_float32)</code>
//       */
//      FloatByReference createMatrix2dScale(float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dRotate(l_float32, l_float32, l_float32)</code>
//       */
//      FloatByReference createMatrix2dRotate(float xc, float yc, float angle);
    /**
     * Original signature :
     * <code>PTA* ptaTranslate(PTA*, l_float32, l_float32)</code>
     */
    Pta ptaTranslate(Pta ptas, float transx, float transy);

    /**
     * Original signature :
     * <code>PTA* ptaScale(PTA*, l_float32, l_float32)</code>
     */
    Pta ptaScale(Pta ptas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PTA* ptaRotate(PTA*, l_float32, l_float32, l_float32)</code>
     */
    Pta ptaRotate(Pta ptas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>BOXA* boxaTranslate(BOXA*, l_float32, l_float32)</code>
     */
    Boxa boxaTranslate(Boxa boxas, float transx, float transy);

    /**
     * Original signature :
     * <code>BOXA* boxaScale(BOXA*, l_float32, l_float32)</code>
     */
    Boxa boxaScale(Boxa boxas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>BOXA* boxaRotate(BOXA*, l_float32, l_float32, l_float32)</code>
     */
    Boxa boxaRotate(Boxa boxas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>PTA* ptaAffineTransform(PTA*, l_float32*)</code>
     */
    Pta ptaAffineTransform(Pta ptas, FloatBuffer mat);

    /**
     * Original signature :
     * <code>BOXA* boxaAffineTransform(BOXA*, l_float32*)</code>
     */
    Boxa boxaAffineTransform(Boxa boxas, FloatBuffer mat);

//      /**
//       * Original signature :
//       * <code>l_ok l_productMatVec(l_float32*, l_float32*, l_float32*, l_int32)</code>
//       */
//      int l_productMatVec(FloatBuffer mat, FloatBuffer vecs, FloatBuffer vecd, int size);
//      /**
//       * Original signature :
//       * <code>l_ok l_productMat2(l_float32*, l_float32*, l_float32*, l_int32)</code>
//       */
//      int l_productMat2(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_ok l_productMat3(l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code>
//       */
//      int l_productMat3(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_ok l_productMat4(l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code>
//       */
//      int l_productMat4(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer mat4, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataBit(void*, l_int32)</code>
//       */
//      int l_getDataBit(Pointer line, int n);
//  
//      /**
//       * Original signature : <code>void l_setDataBit(void*, l_int32)</code>
//       */
//      void l_setDataBit(Pointer line, int n);
//  
//      /**
//       * Original signature : <code>void l_clearDataBit(void*, l_int32)</code>
//       */
//      void l_clearDataBit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataBitVal(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataBitVal(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataDibit(void*, l_int32)</code>
//       */
//      int l_getDataDibit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataDibit(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataDibit(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>void l_clearDataDibit(void*, l_int32)</code>
//       */
//      void l_clearDataDibit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataQbit(void*, l_int32)</code>
//       */
//      int l_getDataQbit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataQbit(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataQbit(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>void l_clearDataQbit(void*, l_int32)</code>
//       */
//      void l_clearDataQbit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataByte(void*, l_int32)</code>
//       */
//      int l_getDataByte(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataByte(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataByte(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataTwoBytes(void*, l_int32)</code>
//       */
//      int l_getDataTwoBytes(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataTwoBytes(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataTwoBytes(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataFourBytes(void*, l_int32)</code>
//       */
//      int l_getDataFourBytes(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataFourBytes(void*, l_int32, l_int32)</code>
//       */
//      void l_setDataFourBytes(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>char* barcodeDispatchDecoder(char*, l_int32, l_int32)</code>
//       */
//      Pointer barcodeDispatchDecoder(ByteBuffer barstr, int format, int debugflag);
//      /**
//       * Original signature :
//       * <code>l_int32 barcodeFormatIsSupported(l_int32)</code>
//       */
//      int barcodeFormatIsSupported(int format);
    /**
     * Original signature :
     * <code>NUMA* pixFindBaselines(PIX*, PTA**, PIXA*)</code>
     */
    Numa pixFindBaselines(Pix pixs, PointerByReference ppta, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixDeskewLocal(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32)</code>
     */
    Pix pixDeskewLocal(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixGetLocalSkewTransform(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, PTA**, PTA**)</code>
     */
    int pixGetLocalSkewTransform(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, PointerByReference pptas, PointerByReference pptad);

    /**
     * Original signature :
     * <code>NUMA* pixGetLocalSkewAngles(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*, l_float32*, l_int32)</code>
     */
    Numa pixGetLocalSkewAngles(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, FloatBuffer pa, FloatBuffer pb, int debug);

    /**
     * Original signature :
     * <code>L_BBUFFER* bbufferCreate(l_uint8*, l_int32)</code>
     */
    L_ByteBuffer bbufferCreate(ByteBuffer indata, int nalloc);

    /**
     * Original signature : <code>void bbufferDestroy(L_BBUFFER**)</code>
     */
    void bbufferDestroy(PointerByReference pbb);

    /**
     * Original signature :
     * <code>l_uint8* bbufferDestroyAndSaveData(L_BBUFFER**, size_t*)</code>
     */
    Pointer bbufferDestroyAndSaveData(PointerByReference pbb, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferRead(L_BBUFFER*, l_uint8*, l_int32)</code>
     */
    int bbufferRead(L_ByteBuffer bb, ByteBuffer src, int nbytes);

//      /**
//       * Original signature :
//       * <code>l_ok bbufferReadStream(L_BBUFFER*, FILE*, l_int32)</code>
//       */
//      int bbufferReadStream(L_ByteBuffer bb, FILE fp, int nbytes);
    /**
     * Original signature :
     * <code>l_ok bbufferExtendArray(L_BBUFFER*, l_int32)</code>
     */
    int bbufferExtendArray(L_ByteBuffer bb, int nbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferWrite(L_BBUFFER*, l_uint8*, size_t, size_t*)</code>
     */
    int bbufferWrite(L_ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_ok bbufferWriteStream(L_BBUFFER*, FILE*, size_t, size_t*)</code>
     */
    int bbufferWriteStream(L_ByteBuffer bb, FILE fp, NativeSize nbytes, NativeSizeByReference pnout);

//      /**
//       * Original signature :
//       * <code>PIX* pixBilateral(PIX*, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Pix pixBilateral(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralGray(PIX*, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Pix pixBilateralGray(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralExact(PIX*, L_KERNEL*, L_KERNEL*)</code>
//       */
//      Pix pixBilateralExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralGrayExact(PIX*, L_KERNEL*, L_KERNEL*)</code>
//       */
//      Pix pixBilateralGrayExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);
//      /**
//       * Original signature :
//       * <code>PIX* pixBlockBilateralExact(PIX*, l_float32, l_float32)</code>
//       */
//      Pix pixBlockBilateralExact(Pix pixs, float spatial_stdev, float range_stdev);
//      /**
//       * Original signature :
//       * <code>L_KERNEL* makeRangeKernel(l_float32)</code>
//       */
//      L_Kernel makeRangeKernel(float range_stdev);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
//       */
//      Pix pixBilinearSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearSampled(PIX*, l_float32*, l_int32)</code>
//       */
//      Pix pixBilinearSampled(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPta(PIX*, PTA*, PTA*, l_int32)</code>
//       */
//      Pix pixBilinearPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinear(PIX*, l_float32*, l_int32)</code>
//       */
//      Pix pixBilinear(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
//       */
//      Pix pixBilinearPtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearColor(PIX*, l_float32*, l_uint32)</code>
//       */
//      Pix pixBilinearColor(Pix pixs, FloatBuffer vc, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
//       */
//      Pix pixBilinearPtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearGray(PIX*, l_float32*, l_uint8)</code>
//       */
//      Pix pixBilinearGray(Pix pixs, FloatBuffer vc, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixBilinearPtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);
//      /**
//       * Original signature :
//       * <code>l_ok getBilinearXformCoeffs(PTA*, PTA*, l_float32**)</code>
//       */
//      int getBilinearXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_ok bilinearXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int bilinearXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_ok bilinearXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
//       */
//      int bilinearXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
    /**
     * Original signature :
     * <code>l_ok pixOtsuAdaptiveThreshold(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PIX**, PIX**)</code>
     */
    int pixOtsuAdaptiveThreshold(Pix pixs, int sx, int sy, int smoothx, int smoothy, float scorefract, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixOtsuThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    Pix pixOtsuThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>PIX* pixMaskedThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    Pix pixMaskedThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>l_ok pixSauvolaBinarizeTiled(PIX*, l_int32, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
     */
    int pixSauvolaBinarizeTiled(Pix pixs, int whsize, float factor, int nx, int ny, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixSauvolaBinarize(PIX*, l_int32, l_float32, l_int32, PIX**, PIX**, PIX**, PIX**)</code>
     */
    int pixSauvolaBinarize(Pix pixs, int whsize, float factor, int addborder, PointerByReference ppixm, PointerByReference ppixsd, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixSauvolaGetThreshold(PIX*, PIX*, l_float32, PIX**)</code>
     */
    Pix pixSauvolaGetThreshold(Pix pixm, Pix pixms, float factor, PointerByReference ppixsd);

    /**
     * Original signature :
     * <code>PIX* pixApplyLocalThreshold(PIX*, PIX*, l_int32)</code>
     */
    Pix pixApplyLocalThreshold(Pix pixs, Pix pixth, int redfactor);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code>
     */
    int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntBuffer pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code>
     */
    int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntByReference pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryReplicate(PIX*, l_int32, l_int32)</code>
     */
    Pix pixExpandBinaryReplicate(Pix pixs, int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryPower2(PIX*, l_int32)</code>
     */
    Pix pixExpandBinaryPower2(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixReduceBinary2(PIX*, l_uint8*)</code>
     */
    Pix pixReduceBinary2(Pix pixs, ByteBuffer intab);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinaryCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixReduceRankBinaryCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinary2(PIX*, l_int32, l_uint8*)</code>
     */
    Pix pixReduceRankBinary2(Pix pixs, int level, ByteBuffer intab);

    /**
     * Original signature : <code>l_uint8* makeSubsampleTab2x()</code>
     */
    Pointer makeSubsampleTab2x();

    /**
     * Original signature :
     * <code>PIX* pixBlend(PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    Pix pixBlend(Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendMask(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixBlendMask(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendGray(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32)</code>
     */
    Pix pixBlendGray(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayInverse(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    Pix pixBlendGrayInverse(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendColor(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_uint32)</code>
     */
    Pix pixBlendColor(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendColorByChannel(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_float32, l_int32, l_uint32)</code>
     */
    Pix pixBlendColorByChannel(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float rfract, float gfract, float bfract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayAdapt(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixBlendGrayAdapt(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int shift);

    /**
     * Original signature :
     * <code>PIX* pixFadeWithGray(PIX*, PIX*, l_float32, l_int32)</code>
     */
    Pix pixFadeWithGray(Pix pixs, Pix pixb, float factor, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendHardLight(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    Pix pixBlendHardLight(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>l_ok pixBlendCmap(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    int pixBlendCmap(Pix pixs, Pix pixb, int x, int y, int sindex);

    /**
     * Original signature :
     * <code>PIX* pixBlendWithGrayMask(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlendWithGrayMask(Pix pixs1, Pix pixs2, Pix pixg, int x, int y);

    /**
     * Original signature :
     * <code>PIX* pixBlendBackgroundToColor(PIX*, PIX*, BOX*, l_uint32, l_float32, l_int32, l_int32)</code>
     */
    Pix pixBlendBackgroundToColor(Pix pixd, Pix pixs, Box box, int color, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixMultiplyByColor(PIX*, PIX*, BOX*, l_uint32)</code>
     */
    Pix pixMultiplyByColor(Pix pixd, Pix pixs, Box box, int color);

    /**
     * Original signature :
     * <code>PIX* pixAlphaBlendUniform(PIX*, l_uint32)</code>
     */
    Pix pixAlphaBlendUniform(Pix pixs, int color);

    /**
     * Original signature :
     * <code>PIX* pixAddAlphaToBlend(PIX*, l_float32, l_int32)</code>
     */
    Pix pixAddAlphaToBlend(Pix pixs, float fract, int invert);

    /**
     * Original signature : <code>PIX* pixSetAlphaOverWhite(PIX*)</code>
     */
    Pix pixSetAlphaOverWhite(Pix pixs);

    /**
     * Original signature :
     * <code>L_BMF* bmfCreate(const char*, l_int32)</code>
     */
    L_Bmf bmfCreate(String dir, int fontsize);

    /**
     * Original signature : <code>void bmfDestroy(L_BMF**)</code>
     */
    void bmfDestroy(PointerByReference pbmf);

    /**
     * Original signature : <code>PIX* bmfGetPix(L_BMF*, char)</code>
     */
    Pix bmfGetPix(L_Bmf bmf, byte chr);

    /**
     * Original signature :
     * <code>l_ok bmfGetWidth(L_BMF*, char, l_int32*)</code>
     */
    int bmfGetWidth(L_Bmf bmf, byte chr, IntBuffer pw);

    /**
     * Original signature :
     * <code>l_ok bmfGetBaseline(L_BMF*, char, l_int32*)</code>
     */
    int bmfGetBaseline(L_Bmf bmf, byte chr, IntBuffer pbaseline);

    /**
     * Original signature :
     * <code>PIXA* pixaGetFont(const char*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    Pixa pixaGetFont(String dir, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2);

    /**
     * Original signature :
     * <code>l_ok pixaSaveFont(const char*, const char*, l_int32)</code>
     */
    int pixaSaveFont(String indir, String outdir, int fontsize);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamBmp(FILE*)</code>
//       */
//      Pix pixReadStreamBmp(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemBmp(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemBmp(ByteBuffer cdata, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamBmp(FILE*, PIX*)</code>
//       */
//      int pixWriteStreamBmp(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>l_ok pixWriteMemBmp(l_uint8**, size_t*, PIX*)</code>
     */
    int pixWriteMemBmp(PointerByReference pfdata, NativeSizeByReference pfsize, Pix pixs);

    /**
     * Original signature : <code>PIXA* l_bootnum_gen1()</code>
     */
    Pixa l_bootnum_gen1();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen2()</code>
     */
    Pixa l_bootnum_gen2();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen3()</code>
     */
    Pixa l_bootnum_gen3();

    /**
     * Original signature :
     * <code>BOX* boxCreate(l_int32, l_int32, l_int32, l_int32)</code>
     */
    Box boxCreate(int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>BOX* boxCreateValid(l_int32, l_int32, l_int32, l_int32)</code>
     */
    Box boxCreateValid(int x, int y, int w, int h);

    /**
     * Original signature : <code>BOX* boxCopy(BOX*)</code>
     */
    Box boxCopy(Box box);

    /**
     * Original signature : <code>BOX* boxClone(BOX*)</code>
     */
    Box boxClone(Box box);

    /**
     * Original signature : <code>void boxDestroy(BOX**)</code>
     */
    void boxDestroy(PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok boxGetGeometry(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxGetGeometry(Box box, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok boxSetGeometry(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int boxSetGeometry(Box box, int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>l_ok boxGetSideLocations(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxGetSideLocations(Box box, IntBuffer pl, IntBuffer pr, IntBuffer pt, IntBuffer pb);

    /**
     * Original signature :
     * <code>l_ok boxSetSideLocations(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int boxSetSideLocations(Box box, int l, int r, int t, int b);

    /**
     * Original signature : <code>l_int32 boxGetRefcount(BOX*)</code>
     */
    int boxGetRefcount(Box box);

    /**
     * Original signature :
     * <code>l_ok boxChangeRefcount(BOX*, l_int32)</code>
     */
    int boxChangeRefcount(Box box, int delta);

    /**
     * Original signature : <code>l_ok boxIsValid(BOX*, l_int32*)</code>
     */
    int boxIsValid(Box box, IntBuffer pvalid);

    /**
     * Original signature : <code>BOXA* boxaCreate(l_int32)</code>
     */
    Boxa boxaCreate(int n);

    /**
     * Original signature : <code>BOXA* boxaCopy(BOXA*, l_int32)</code>
     */
    Boxa boxaCopy(Boxa boxa, int copyflag);

    /**
     * Original signature : <code>void boxaDestroy(BOXA**)</code>
     */
    void boxaDestroy(PointerByReference pboxa);

    /**
     * Original signature :
     * <code>l_ok boxaAddBox(BOXA*, BOX*, l_int32)</code>
     */
    int boxaAddBox(Boxa boxa, Box box, int copyflag);

    /**
     * Original signature : <code>l_ok boxaExtendArray(BOXA*)</code>
     */
    int boxaExtendArray(Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaExtendArrayToSize(BOXA*, l_int32)</code>
     */
    int boxaExtendArrayToSize(Boxa boxa, int size);

    /**
     * Original signature : <code>l_int32 boxaGetCount(BOXA*)</code>
     */
    int boxaGetCount(Boxa boxa);

    /**
     * Original signature : <code>l_int32 boxaGetValidCount(BOXA*)</code>
     */
    int boxaGetValidCount(Boxa boxa);

    /**
     * Original signature :
     * <code>BOX* boxaGetBox(BOXA*, l_int32, l_int32)</code>
     */
    Box boxaGetBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature :
     * <code>BOX* boxaGetValidBox(BOXA*, l_int32, l_int32)</code>
     */
    Box boxaGetValidBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature : <code>NUMA* boxaFindInvalidBoxes(BOXA*)</code>
     */
    Numa boxaFindInvalidBoxes(Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaGetBoxGeometry(BOXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxaGetBoxGeometry(Boxa boxa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature : <code>l_ok boxaIsFull(BOXA*, l_int32*)</code>
     */
    int boxaIsFull(Boxa boxa, IntBuffer pfull);

    /**
     * Original signature :
     * <code>l_ok boxaReplaceBox(BOXA*, l_int32, BOX*)</code>
     */
    int boxaReplaceBox(Boxa boxa, int index, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaInsertBox(BOXA*, l_int32, BOX*)</code>
     */
    int boxaInsertBox(Boxa boxa, int index, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaRemoveBox(BOXA*, l_int32)</code>
     */
    int boxaRemoveBox(Boxa boxa, int index);

    /**
     * Original signature :
     * <code>l_ok boxaRemoveBoxAndSave(BOXA*, l_int32, BOX**)</code>
     */
    int boxaRemoveBoxAndSave(Boxa boxa, int index, PointerByReference pbox);

    /**
     * Original signature : <code>BOXA* boxaSaveValid(BOXA*, l_int32)</code>
     */
    Boxa boxaSaveValid(Boxa boxas, int copyflag);

    /**
     * Original signature : <code>l_ok boxaInitFull(BOXA*, BOX*)</code>
     */
    int boxaInitFull(Boxa boxa, Box box);

    /**
     * Original signature : <code>l_ok boxaClear(BOXA*)</code>
     */
    int boxaClear(Boxa boxa);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaCreate(l_int32)</code>
//       */
//      Boxaa boxaaCreate(int n);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaCopy(BOXAA*, l_int32)</code>
//       */
//      Boxaa boxaaCopy(Boxaa baas, int copyflag);
//  
//      /**
//       * Original signature : <code>void boxaaDestroy(BOXAA**)</code>
//       */
//      void boxaaDestroy(PointerByReference pbaa);

//      /**
//       * Original signature :
//       * <code>l_ok boxaaAddBoxa(BOXAA*, BOXA*, l_int32)</code>
//       */
//      int boxaaAddBoxa(Boxaa baa, Boxa ba, int copyflag);
//  
//      /**
//       * Original signature : <code>l_ok boxaaExtendArray(BOXAA*)</code>
//       */
//      int boxaaExtendArray(Boxaa baa);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaExtendArrayToSize(BOXAA*, l_int32)</code>
//       */
//      int boxaaExtendArrayToSize(Boxaa baa, int size);
//  
//      /**
//       * Original signature : <code>l_int32 boxaaGetCount(BOXAA*)</code>
//       */
//      int boxaaGetCount(Boxaa baa);
//  
//      /**
//       * Original signature : <code>l_int32 boxaaGetBoxCount(BOXAA*)</code>
//       */
//      int boxaaGetBoxCount(Boxaa baa);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaGetBoxa(BOXAA*, l_int32, l_int32)</code>
//       */
//      Boxa boxaaGetBoxa(Boxaa baa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>BOX* boxaaGetBox(BOXAA*, l_int32, l_int32, l_int32)</code>
//       */
//      Box boxaaGetBox(Boxaa baa, int iboxa, int ibox, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaInitFull(BOXAA*, BOXA*)</code>
//       */
//      int boxaaInitFull(Boxaa baa, Boxa boxa);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaExtendWithInit(BOXAA*, l_int32, BOXA*)</code>
//       */
//      int boxaaExtendWithInit(Boxaa baa, int maxindex, Boxa boxa);
    /**
     * Original signature :
     * <code>l_ok boxaaReplaceBoxa(BOXAA*, l_int32, BOXA*)</code>
     */
    int boxaaReplaceBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaaInsertBoxa(BOXAA*, l_int32, BOXA*)</code>
     */
    int boxaaInsertBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaaRemoveBoxa(BOXAA*, l_int32)</code>
     */
    int boxaaRemoveBoxa(Boxaa baa, int index);

    /**
     * Original signature :
     * <code>l_ok boxaaAddBox(BOXAA*, l_int32, BOX*, l_int32)</code>
     */
    int boxaaAddBox(Boxaa baa, int index, Box box, int accessflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code>
     */
    Boxaa boxaaReadFromFiles(String dirname, String substr, int first, int nfiles);

    /**
     * Original signature : <code>BOXAA* boxaaRead(const char*)</code>
     */
    Boxaa boxaaRead(String filename);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaReadStream(FILE*)</code>
//       */
//      Boxaa boxaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadMem(const l_uint8*, size_t)</code>
     */
    Boxaa boxaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok boxaaWrite(const char*, BOXAA*)</code>
     */
    int boxaaWrite(String filename, Boxaa baa);

//      /**
//       * Original signature :
//       * <code>l_ok boxaaWriteStream(FILE*, BOXAA*)</code>
//       */
//      int boxaaWriteStream(FILE fp, Boxaa baa);
    /**
     * Original signature :
     * <code>l_ok boxaaWriteMem(l_uint8**, size_t*, BOXAA*)</code>
     */
    int boxaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxaa baa);

    /**
     * Original signature : <code>BOXA* boxaRead(const char*)</code>
     */
    Boxa boxaRead(String filename);
//  
//      /**
//       * Original signature : <code>BOXA* boxaReadStream(FILE*)</code>
//       */
//      Boxa boxaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXA* boxaReadMem(const l_uint8*, size_t)</code>
     */
    Boxa boxaReadMem(ByteBuffer data, NativeSize size);
    
//    /**
//     * Original signature : <code>l_ok boxaWriteDebug(const char*, BOXA*)</code>
//     */
//    int boxaWriteDebug(String filename, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaWrite(const char*, BOXA*)</code>
     */
    int boxaWrite(String filename, Boxa boxa);

//      /**
//       * Original signature :
//       * <code>l_ok boxaWriteStream(FILE*, BOXA*)</code>
//       */
//      int boxaWriteStream(FILE fp, Boxa boxa);
    /**
     * Original signature :
     * <code>l_ok boxaWriteMem(l_uint8**, size_t*, BOXA*)</code>
     */
    int boxaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxa boxa);

//      /**
//       * Original signature :
//       * <code>l_ok boxPrintStreamInfo(FILE*, BOX*)</code>
//       */
//      int boxPrintStreamInfo(FILE fp, Box box);
    /**
     * Original signature :
     * <code>l_ok boxContains(BOX*, BOX*, l_int32*)</code>
     */
    int boxContains(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature :
     * <code>l_ok boxIntersects(BOX*, BOX*, l_int32*)</code>
     */
    int boxIntersects(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature :
     * <code>BOXA* boxaContainedInBox(BOXA*, BOX*)</code>
     */
    Boxa boxaContainedInBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaContainedInBoxCount(BOXA*, BOX*, l_int32*)</code>
     */
    int boxaContainedInBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_ok boxaContainedInBoxa(BOXA*, BOXA*, l_int32*)</code>
     */
    int boxaContainedInBoxa(Boxa boxa1, Boxa boxa2, IntBuffer pcontained);

    /**
     * Original signature :
     * <code>BOXA* boxaIntersectsBox(BOXA*, BOX*)</code>
     */
    Boxa boxaIntersectsBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaIntersectsBoxCount(BOXA*, BOX*, l_int32*)</code>
     */
    int boxaIntersectsBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature : <code>BOXA* boxaClipToBox(BOXA*, BOX*)</code>
     */
    Boxa boxaClipToBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>BOXA* boxaCombineOverlaps(BOXA*, PIXA*)</code>
     */
    Boxa boxaCombineOverlaps(Boxa boxas, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok boxaCombineOverlapsInPair(BOXA*, BOXA*, BOXA**, BOXA**, PIXA*)</code>
     */
    int boxaCombineOverlapsInPair(Boxa boxas1, Boxa boxas2, PointerByReference pboxad1, PointerByReference pboxad2, Pixa pixadb);

    /**
     * Original signature : <code>BOX* boxOverlapRegion(BOX*, BOX*)</code>
     */
    Box boxOverlapRegion(Box box1, Box box2);

    /**
     * Original signature : <code>BOX* boxBoundingRegion(BOX*, BOX*)</code>
     */
    Box boxBoundingRegion(Box box1, Box box2);

    /**
     * Original signature :
     * <code>l_ok boxOverlapFraction(BOX*, BOX*, l_float32*)</code>
     */
    int boxOverlapFraction(Box box1, Box box2, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok boxOverlapArea(BOX*, BOX*, l_int32*)</code>
     */
    int boxOverlapArea(Box box1, Box box2, IntBuffer parea);

    /**
     * Original signature :
     * <code>BOXA* boxaHandleOverlaps(BOXA*, l_int32, l_int32, l_float32, l_float32, NUMA**)</code>
     */
    Boxa boxaHandleOverlaps(Boxa boxas, int op, int range, float min_overlap, float max_ratio, PointerByReference pnamap);

    /**
     * Original signature :
     * <code>l_ok boxSeparationDistance(BOX*, BOX*, l_int32*, l_int32*)</code>
     */
    int boxSeparationDistance(Box box1, Box box2, IntBuffer ph_sep, IntBuffer pv_sep);

    /**
     * Original signature :
     * <code>l_ok boxCompareSize(BOX*, BOX*, l_int32, l_int32*)</code>
     */
    int boxCompareSize(Box box1, Box box2, int type, IntBuffer prel);

    /**
     * Original signature :
     * <code>l_ok boxContainsPt(BOX*, l_float32, l_float32, l_int32*)</code>
     */
    int boxContainsPt(Box box, float x, float y, IntBuffer pcontains);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToPt(BOXA*, l_int32, l_int32)</code>
     */
    Box boxaGetNearestToPt(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToLine(BOXA*, l_int32, l_int32)</code>
     */
    Box boxaGetNearestToLine(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>l_ok boxGetCenter(BOX*, l_float32*, l_float32*)</code>
     */
    int boxGetCenter(Box box, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_ok boxIntersectByLine(BOX*, l_int32, l_int32, l_float32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxIntersectByLine(Box box, int x, int y, float slope, IntBuffer px1, IntBuffer py1, IntBuffer px2, IntBuffer py2, IntBuffer pn);

    /**
     * Original signature :
     * <code>BOX* boxClipToRectangle(BOX*, l_int32, l_int32)</code>
     */
    Box boxClipToRectangle(Box box, int wi, int hi);

    /**
     * Original signature :
     * <code>l_ok boxClipToRectangleParams(BOX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxClipToRectangleParams(Box box, int w, int h, IntBuffer pxstart, IntBuffer pystart, IntBuffer pxend, IntBuffer pyend, IntBuffer pbw, IntBuffer pbh);

    /**
     * Original signature :
     * <code>BOX* boxRelocateOneSide(BOX*, BOX*, l_int32, l_int32)</code>
     */
    Box boxRelocateOneSide(Box boxd, Box boxs, int loc, int sideflag);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustSides(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Boxa boxaAdjustSides(Boxa boxas, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOX* boxAdjustSides(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Box boxAdjustSides(Box boxd, Box boxs, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOXA* boxaSetSide(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    Boxa boxaSetSide(Boxa boxad, Boxa boxas, int side, int val, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustWidthToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    Boxa boxaAdjustWidthToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustHeightToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    Boxa boxaAdjustHeightToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature :
     * <code>l_ok boxEqual(BOX*, BOX*, l_int32*)</code>
     */
    int boxEqual(Box box1, Box box2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code>
     */
    int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code>
     */
    int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntByReference psame);

    /**
     * Original signature :
     * <code>l_ok boxSimilar(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    int boxSimilar(Box box1, Box box2, int leftdiff, int rightdiff, int topdiff, int botdiff, IntBuffer psimilar);

    /**
     * Original signature :
     * <code>l_ok boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code>
     */
    int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntBuffer psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_ok boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code>
     */
    int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntByReference psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_ok boxaJoin(BOXA*, BOXA*, l_int32, l_int32)</code>
     */
    int boxaJoin(Boxa boxad, Boxa boxas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_ok boxaaJoin(BOXAA*, BOXAA*, l_int32, l_int32)</code>
     */
    int boxaaJoin(Boxaa baad, Boxaa baas, int istart, int iend);

//      /**
//       * Original signature :
//       * <code>l_ok boxaSplitEvenOdd(BOXA*, l_int32, BOXA**, BOXA**)</code>
//       */
//      int boxaSplitEvenOdd(Boxa boxa, int fillflag, PointerByReference pboxae, PointerByReference pboxao);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaMergeEvenOdd(BOXA*, BOXA*, l_int32)</code>
//       */
//      Boxa boxaMergeEvenOdd(Boxa boxae, Boxa boxao, int fillflag);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaTransform(BOXA*, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      Boxa boxaTransform(Boxa boxas, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>BOX* boxTransform(BOX*, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      Box boxTransform(Box box, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaTransformOrdered(BOXA*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code>
//       */
//      Boxa boxaTransformOrdered(Boxa boxas, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);
//      /**
//       * Original signature :
//       * <code>BOX* boxTransformOrdered(BOX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code>
//       */
//      Box boxTransformOrdered(Box boxs, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaRotateOrth(BOXA*, l_int32, l_int32, l_int32)</code>
//       */
//      Boxa boxaRotateOrth(Boxa boxas, int w, int h, int rotation);
//      /**
//       * Original signature :
//       * <code>BOX* boxRotateOrth(BOX*, l_int32, l_int32, l_int32)</code>
//       */
//      Box boxRotateOrth(Box box, int w, int h, int rotation);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaSort(BOXA*, l_int32, l_int32, NUMA**)</code>
//       */
//      Boxa boxaSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaBinSort(BOXA*, l_int32, l_int32, NUMA**)</code>
//       */
//      Boxa boxaBinSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);
//  
//      /**
//       * Original signature : <code>BOXA* boxaSortByIndex(BOXA*, NUMA*)</code>
//       */
//      Boxa boxaSortByIndex(Boxa boxas, Numa naindex);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaSort2d(BOXA*, NUMAA**, l_int32, l_int32, l_int32)</code>
//       */
//      Boxaa boxaSort2d(Boxa boxas, PointerByReference pnaad, int delta1, int delta2, int minh1);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaSort2dByIndex(BOXA*, NUMAA*)</code>
//       */
//      Boxaa boxaSort2dByIndex(Boxa boxas, Numaa naa);
//      /**
//       * Original signature :
//       * <code>l_ok boxaExtractAsNuma(BOXA*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, l_int32)</code>
//       */
//      int boxaExtractAsNuma(Boxa boxa, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference pnaw, PointerByReference pnah, int keepinvalid);
//      /**
//       * Original signature :
//       * <code>l_ok boxaExtractAsPta(BOXA*, PTA**, PTA**, PTA**, PTA**, PTA**, PTA**, l_int32)</code>
//       */
//      int boxaExtractAsPta(Boxa boxa, PointerByReference pptal, PointerByReference pptat, PointerByReference pptar, PointerByReference pptab, PointerByReference pptaw, PointerByReference pptah, int keepinvalid);
//      /**
//       * Original signature :
//       * <code>l_ok boxaGetRankVals(BOXA*, l_float32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int boxaGetRankVals(Boxa boxa, float fract, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok boxaGetMedianVals(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int boxaGetMedianVals(Boxa boxa, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok boxaGetAverageSize(BOXA*, l_float32*, l_float32*)</code>
//       */
//      int boxaGetAverageSize(Boxa boxa, FloatBuffer pw, FloatBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code>
//       */
//      int boxaaGetExtent(Boxaa baa, IntBuffer pw, IntBuffer ph, PointerByReference pbox, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code>
//       */
//      int boxaaGetExtent(Boxaa baa, IntByReference pw, IntByReference ph, PointerByReference pbox, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaFlattenToBoxa(BOXAA*, NUMA**, l_int32)</code>
//       */
//      Boxa boxaaFlattenToBoxa(Boxaa baa, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaFlattenAligned(BOXAA*, l_int32, BOX*, l_int32)</code>
//       */
//      Boxa boxaaFlattenAligned(Boxaa baa, int num, Box fillerbox, int copyflag);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaEncapsulateAligned(BOXA*, l_int32, l_int32)</code>
//       */
//      Boxaa boxaEncapsulateAligned(Boxa boxa, int num, int copyflag);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaTranspose(BOXAA*)</code>
//       */
//      Boxaa boxaaTranspose(Boxaa baas);
//      /**
//       * Original signature :
//       * <code>l_ok boxaaAlignBox(BOXAA*, BOX*, l_int32, l_int32*)</code>
//       */
//      int boxaaAlignBox(Boxaa baa, Box box, int delta, IntBuffer pindex);
    /**
     * Original signature :
     * <code>PIX* pixMaskConnComp(PIX*, l_int32, BOXA**)</code>
     */
    Pix pixMaskConnComp(Pix pixs, int connectivity, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMaskBoxa(PIX*, PIX*, BOXA*, l_int32)</code>
     */
    Pix pixMaskBoxa(Pix pixd, Pix pixs, Boxa boxa, int op);

    /**
     * Original signature :
     * <code>PIX* pixPaintBoxa(PIX*, BOXA*, l_uint32)</code>
     */
    Pix pixPaintBoxa(Pix pixs, Boxa boxa, int val);

    /**
     * Original signature :
     * <code>PIX* pixSetBlackOrWhiteBoxa(PIX*, BOXA*, l_int32)</code>
     */
    Pix pixSetBlackOrWhiteBoxa(Pix pixs, Boxa boxa, int op);

    /**
     * Original signature :
     * <code>PIX* pixPaintBoxaRandom(PIX*, BOXA*)</code>
     */
    Pix pixPaintBoxaRandom(Pix pixs, Boxa boxa);

    /**
     * Original signature :
     * <code>PIX* pixBlendBoxaRandom(PIX*, BOXA*, l_float32)</code>
     */
    Pix pixBlendBoxaRandom(Pix pixs, Boxa boxa, float fract);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxa(PIX*, BOXA*, l_int32, l_uint32)</code>
     */
    Pix pixDrawBoxa(Pix pixs, Boxa boxa, int width, int val);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxaRandom(PIX*, BOXA*, l_int32)</code>
     */
    Pix pixDrawBoxaRandom(Pix pixs, Boxa boxa, int width);

    /**
     * Original signature :
     * <code>PIX* boxaaDisplay(PIX*, BOXAA*, l_int32, l_int32, l_uint32, l_uint32, l_int32, l_int32)</code>
     */
    Pix boxaaDisplay(Pix pixs, Boxaa baa, int linewba, int linewb, int colorba, int colorb, int w, int h);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayBoxaa(PIXA*, BOXAA*, l_int32, l_int32)</code>
     */
    Pixa pixaDisplayBoxaa(Pixa pixas, Boxaa baa, int colorflag, int width);

    /**
     * Original signature :
     * <code>BOXA* pixSplitIntoBoxa(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Boxa pixSplitIntoBoxa(Pix pixs, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentIntoBoxa(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Boxa pixSplitComponentIntoBoxa(Pix pix, Box box, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);
//
//    /**
//     * Original signature :
//     * <code>BOXA* makeMosaicStrips(l_int32, l_int32, l_int32, l_int32)</code>
//     */
//    Boxa makeMosaicStrips(int w, int h, int direction, int size);

    /**
     * Original signature :
     * <code>l_ok boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntBuffer pnsame, FloatBuffer pdiffarea, FloatBuffer pdiffxor, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntByReference pnsame, FloatByReference pdiffarea, FloatByReference pdiffxor, PointerByReference ppixdb);

//    /**
//     * Original signature :
//     * <code>BOX* pixSelectLargeULComp(PIX*, l_float32, l_int32, l_int32)</code>
//     */
//    Box pixSelectLargeULComp(Pix pixs, float areaslop, int yslop, int connectivity);
//
//    /**
//     * Original signature :
//     * <code>BOX* boxaSelectLargeULBox(BOXA*, l_float32, l_int32)</code>
//     */
//    Box boxaSelectLargeULBox(Boxa boxas, float areaslop, int yslop);
    /**
     * Original signature :
     * <code>BOXA* boxaSelectRange(BOXA*, l_int32, l_int32, l_int32)</code>
     */
    Boxa boxaSelectRange(Boxa boxas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaSelectRange(BOXAA*, l_int32, l_int32, l_int32)</code>
     */
    Boxaa boxaaSelectRange(Boxaa baas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectBySize(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    Boxa boxaSelectBySize(Boxa boxas, int width, int height, int type, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* boxaMakeSizeIndicator(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Numa boxaMakeSizeIndicator(Boxa boxa, int width, int height, int type, int relation);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectByArea(BOXA*, l_int32, l_int32, l_int32*)</code>
     */
    Boxa boxaSelectByArea(Boxa boxas, int area, int relation, IntBuffer pchanged);

//    /**
//     * Original signature :
//     * <code>NUMA* boxaMakeAreaIndicator(BOXA*, l_int32, l_int32)</code>
//     */
//    Numa boxaMakeAreaIndicator(Boxa boxa, int area, int relation);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSelectByWHRatio(BOXA*, l_float32, l_int32, l_int32*)</code>
//     */
//    Boxa boxaSelectByWHRatio(Boxa boxas, float ratio, int relation, IntBuffer pchanged);
//
//    /**
//     * Original signature :
//     * <code>NUMA* boxaMakeWHRatioIndicator(BOXA*, l_float32, l_int32)</code>
//     */
//    Numa boxaMakeWHRatioIndicator(Boxa boxa, float ratio, int relation);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSelectWithIndicator(BOXA*, NUMA*, l_int32*)</code>
//     */
//    Boxa boxaSelectWithIndicator(Boxa boxas, Numa na, IntBuffer pchanged);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaPermutePseudorandom(BOXA*)</code>
//     */
//    Boxa boxaPermutePseudorandom(Boxa boxas);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaPermuteRandom(BOXA*, BOXA*)</code>
//     */
//    Boxa boxaPermuteRandom(Boxa boxad, Boxa boxas);
    /**
     * Original signature :
     * <code>l_ok boxaSwapBoxes(BOXA*, l_int32, l_int32)</code>
     */
    int boxaSwapBoxes(Boxa boxa, int i, int j);

    /**
     * Original signature :
     * <code>PTA* boxaConvertToPta(BOXA*, l_int32)</code>
     */
    Pta boxaConvertToPta(Boxa boxa, int ncorners);

    /**
     * Original signature :
     * <code>BOXA* ptaConvertToBoxa(PTA*, l_int32)</code>
     */
    Boxa ptaConvertToBoxa(Pta pta, int ncorners);

    /**
     * Original signature : <code>PTA* boxConvertToPta(BOX*, l_int32)</code>
     */
    Pta boxConvertToPta(Box box, int ncorners);

    /**
     * Original signature : <code>BOX* ptaConvertToBox(PTA*)</code>
     */
    Box ptaConvertToBox(Pta pta);

//    /**
//     * Original signature :
//     * <code>BOXA* boxaSmoothSequenceLS(BOXA*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
//     */
//    Boxa boxaSmoothSequenceLS(Boxa boxas, float factor, int subflag, int maxdiff, int extrapixels, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSmoothSequenceMedian(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//     */
//    Boxa boxaSmoothSequenceMedian(Boxa boxas, int halfwin, int subflag, int maxdiff, int extrapixels, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaLinearFit(BOXA*, l_float32, l_int32)</code>
//     */
//    Boxa boxaLinearFit(Boxa boxas, float factor, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaWindowedMedian(BOXA*, l_int32, l_int32)</code>
//     */
//    Boxa boxaWindowedMedian(Boxa boxas, int halfwin, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaModifyWithBoxa(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
//     */
//    Boxa boxaModifyWithBoxa(Boxa boxas, Boxa boxam, int subflag, int maxdiff, int extrapixels);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaConstrainSize(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
//     */
//    Boxa boxaConstrainSize(Boxa boxas, int width, int widthflag, int height, int heightflag);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaReconcileEvenOddHeight(BOXA*, l_int32, l_int32, l_int32, l_float32, l_int32)</code>
//     */
//    Boxa boxaReconcileEvenOddHeight(Boxa boxas, int sides, int delh, int op, float factor, int start);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaReconcilePairWidth(BOXA*, l_int32, l_int32, l_float32, NUMA*)</code>
//     */
//    Boxa boxaReconcilePairWidth(Boxa boxas, int delw, int op, float factor, Numa na);
//
//    /**
//     * Original signature :
//     * <code>l_ok boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code>
//     */
//    int boxaPlotSides(Boxa boxa, String plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_ok boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code>
//     */
//    int boxaPlotSides(Boxa boxa, Pointer plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_ok boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code>
//     */
//    int boxaPlotSizes(Boxa boxa, String plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_ok boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code>
//     */
//    int boxaPlotSizes(Boxa boxa, Pointer plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaFillSequence(BOXA*, l_int32, l_int32)</code>
//     */
//    Boxa boxaFillSequence(Boxa boxas, int useflag, int debug);
//
//    /**
//     * Original signature : <code>l_ok boxaSizeVariation(BOXA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//     */
//    int boxaSizeVariation(Boxa boxa, int type, FloatBuffer pdel_evenodd, FloatBuffer prms_even, FloatBuffer prms_odd, FloatBuffer prms_all);

//    /**
//     * Original signature :
//     * <code>l_ok boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code>
//     */
//    int boxaGetExtent(Boxa boxa, IntBuffer pw, IntBuffer ph, PointerByReference pbox);
//
//    /**
//     * Original signature :
//     * <code>l_ok boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code>
//     */
//    int boxaGetExtent(Boxa boxa, IntByReference pw, IntByReference ph, PointerByReference pbox);
    /**
     * Original signature :
     * <code>l_ok boxaGetCoverage(BOXA*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    int boxaGetCoverage(Boxa boxa, int wc, int hc, int exactflag, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok boxaaSizeRange(BOXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxaaSizeRange(Boxaa baa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok boxaSizeRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxaSizeRange(Boxa boxa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok boxaLocationRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int boxaLocationRange(Boxa boxa, IntBuffer pminx, IntBuffer pminy, IntBuffer pmaxx, IntBuffer pmaxy);

    /**
     * Original signature :
     * <code>l_ok boxaGetSizes(BOXA*, NUMA**, NUMA**)</code>
     */
    int boxaGetSizes(Boxa boxa, PointerByReference pnaw, PointerByReference pnah);

    /**
     * Original signature :
     * <code>l_ok boxaGetArea(BOXA*, l_int32*)</code>
     */
    int boxaGetArea(Boxa boxa, IntBuffer parea);

    /**
     * Original signature :
     * <code>PIX* boxaDisplayTiled(BOXA*, PIXA*, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
     */
    Pix boxaDisplayTiled(Boxa boxas, Pixa pixa, int maxwidth, int linewidth, float scalefactor, int background, int spacing, int border);
//  
//      /**
//       * Original signature : <code>L_BYTEA* l_byteaCreate(size_t)</code>
//       */
//      L_Bytea l_byteaCreate(NativeSize nbytes);

//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromMem(l_uint8*, size_t)</code>
//       */
//      L_Bytea l_byteaInitFromMem(ByteBuffer data, NativeSize size);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromFile(const char*)</code>
//       */
//      L_Bytea l_byteaInitFromFile(String fname);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromStream(FILE*)</code>
//       */
//      L_Bytea l_byteaInitFromStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaCopy(L_BYTEA*, l_int32)</code>
//       */
//      L_Bytea l_byteaCopy(L_Bytea bas, int copyflag);
//  
//      /**
//       * Original signature : <code>void l_byteaDestroy(L_BYTEA**)</code>
//       */
//      void l_byteaDestroy(PointerByReference pba);
//  
//      /**
//       * Original signature : <code>size_t l_byteaGetSize(L_BYTEA*)</code>
//       */
//      NativeSize l_byteaGetSize(L_Bytea ba);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_byteaGetData(L_BYTEA*, size_t*)</code>
//       */
//      Pointer l_byteaGetData(L_Bytea ba, NativeSizeByReference psize);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_byteaCopyData(L_BYTEA*, size_t*)</code>
//       */
//      Pointer l_byteaCopyData(L_Bytea ba, NativeSizeByReference psize);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaAppendData(L_BYTEA*, l_uint8*, size_t)</code>
//       */
//      int l_byteaAppendData(L_Bytea ba, ByteBuffer newdata, NativeSize newbytes);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaAppendString(L_BYTEA*, const char*)</code>
//       */
//      int l_byteaAppendString(L_Bytea ba, String str);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaJoin(L_BYTEA*, L_BYTEA**)</code>
//       */
//      int l_byteaJoin(L_Bytea ba1, PointerByReference pba2);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaSplit(L_BYTEA*, size_t, L_BYTEA**)</code>
//       */
//      int l_byteaSplit(L_Bytea ba1, NativeSize splitloc, PointerByReference pba2);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaFindEachSequence(L_BYTEA*, l_uint8*, size_t, L_DNA**)</code>
//       */
//      int l_byteaFindEachSequence(L_Bytea ba, ByteBuffer sequence, NativeSize seqlen, PointerByReference pda);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaFindEachSequence(L_BYTEA*, l_uint8*, size_t, L_DNA**)</code>
//       */
//      int l_byteaFindEachSequence(L_Bytea ba, Pointer sequence, NativeSize seqlen, PointerByReference pda);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaWrite(const char*, L_BYTEA*, size_t, size_t)</code>
//       */
//      int l_byteaWrite(String fname, L_Bytea ba, NativeSize startloc, NativeSize endloc);
//      /**
//       * Original signature :
//       * <code>l_ok l_byteaWriteStream(FILE*, L_BYTEA*, size_t, size_t)</code>
//       */
//      int l_byteaWriteStream(FILE fp, L_Bytea ba, NativeSize startloc, NativeSize endloc);
    /**
     * Original signature : <code>CCBORDA* ccbaCreate(PIX*, l_int32)</code>
     */
    CCBorda ccbaCreate(Pix pixs, int n);

    /**
     * Original signature : <code>void ccbaDestroy(CCBORDA**)</code>
     */
    void ccbaDestroy(PointerByReference pccba);

    /**
     * Original signature : <code>CCBORD* ccbCreate(PIX*)</code>
     */
    CCBord ccbCreate(Pix pixs);

    /**
     * Original signature : <code>void ccbDestroy(CCBORD**)</code>
     */
    void ccbDestroy(PointerByReference pccb);

    /**
     * Original signature :
     * <code>l_ok ccbaAddCcb(CCBORDA*, CCBORD*)</code>
     */
    int ccbaAddCcb(CCBorda ccba, CCBord ccb);

    /**
     * Original signature : <code>l_int32 ccbaGetCount(CCBORDA*)</code>
     */
    int ccbaGetCount(CCBorda ccba);

    /**
     * Original signature :
     * <code>CCBORD* ccbaGetCcb(CCBORDA*, l_int32)</code>
     */
    CCBord ccbaGetCcb(CCBorda ccba, int index);

    /**
     * Original signature : <code>CCBORDA* pixGetAllCCBorders(PIX*)</code>
     */
    CCBorda pixGetAllCCBorders(Pix pixs);

    /**
     * Original signature : <code>CCBORD* pixGetCCBorders(PIX*, BOX*)</code>
     */
    CCBord pixGetCCBorders(Pix pixs, Box box);

    /**
     * Original signature : <code>PTAA* pixGetOuterBordersPtaa(PIX*)</code>
     */
    Ptaa pixGetOuterBordersPtaa(Pix pixs);

    /**
     * Original signature :
     * <code>PTA* pixGetOuterBorderPta(PIX*, BOX*)</code>
     */
    Pta pixGetOuterBorderPta(Pix pixs, Box box);

    /**
     * Original signature :
     * <code>l_ok pixGetOuterBorder(CCBORD*, PIX*, BOX*)</code>
     */
    int pixGetOuterBorder(CCBord ccb, Pix pixs, Box box);

    /**
     * Original signature :
     * <code>l_ok pixGetHoleBorder(CCBORD*, PIX*, BOX*, l_int32, l_int32)</code>
     */
    int pixGetHoleBorder(CCBord ccb, Pix pixs, Box box, int xs, int ys);

    /**
     * Original signature :
     * <code>l_int32 findNextBorderPixel(l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int findNextBorderPixel(int w, int h, IntBuffer data, int wpl, int px, int py, IntBuffer pqpos, IntBuffer pnpx, IntBuffer pnpy);

    /**
     * Original signature :
     * <code>void locateOutsideSeedPixel(l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    void locateOutsideSeedPixel(int fpx, int fpy, int spx, int spy, IntBuffer pxs, IntBuffer pys);

    /**
     * Original signature :
     * <code>l_ok ccbaGenerateGlobalLocs(CCBORDA*)</code>
     */
    int ccbaGenerateGlobalLocs(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_ok ccbaGenerateStepChains(CCBORDA*)</code>
     */
    int ccbaGenerateStepChains(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_ok ccbaStepChainsToPixCoords(CCBORDA*, l_int32)</code>
     */
    int ccbaStepChainsToPixCoords(CCBorda ccba, int coordtype);

    /**
     * Original signature :
     * <code>l_ok ccbaGenerateSPGlobalLocs(CCBORDA*, l_int32)</code>
     */
    int ccbaGenerateSPGlobalLocs(CCBorda ccba, int ptsflag);

    /**
     * Original signature :
     * <code>l_ok ccbaGenerateSinglePath(CCBORDA*)</code>
     */
    int ccbaGenerateSinglePath(CCBorda ccba);

    /**
     * Original signature :
     * <code>PTA* getCutPathForHole(PIX*, PTA*, BOX*, l_int32*, l_int32*)</code>
     */
    Pta getCutPathForHole(Pix pix, Pta pta, Box boxinner, IntBuffer pdir, IntBuffer plen);

    /**
     * Original signature : <code>PIX* ccbaDisplayBorder(CCBORDA*)</code>
     */
    Pix ccbaDisplayBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplaySPBorder(CCBORDA*)</code>
     */
    Pix ccbaDisplaySPBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage1(CCBORDA*)</code>
     */
    Pix ccbaDisplayImage1(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage2(CCBORDA*)</code>
     */
    Pix ccbaDisplayImage2(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_ok ccbaWrite(const char*, CCBORDA*)</code>
     */
    int ccbaWrite(String filename, CCBorda ccba);

//      /**
//       * Original signature :
//       * <code>l_ok ccbaWriteStream(FILE*, CCBORDA*)</code>
//       */
//      int ccbaWriteStream(FILE fp, CCBorda ccba);
    /**
     * Original signature : <code>CCBORDA* ccbaRead(const char*)</code>
     */
    CCBorda ccbaRead(String filename);
//  
//      /**
//       * Original signature : <code>CCBORDA* ccbaReadStream(FILE*)</code>
//       */
//      CCBorda ccbaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_ok ccbaWriteSVG(const char*, CCBORDA*)</code>
     */
    int ccbaWriteSVG(String filename, CCBorda ccba);

    /**
     * Original signature :
     * <code>char* ccbaWriteSVGString(const char*, CCBORDA*)</code>
     */
    Pointer ccbaWriteSVGString(String filename, CCBorda ccba);

    /**
     * Original signature :
     * <code>PIXA* pixaThinConnected(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaThinConnected(Pixa pixas, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnected(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixThinConnected(Pix pixs, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnectedBySet(PIX*, l_int32, SELA*, l_int32)</code>
     */
    Pix pixThinConnectedBySet(Pix pixs, int type, Sela sela, int maxiters);

    /**
     * Original signature :
     * <code>SELA* selaMakeThinSets(l_int32, l_int32)</code>
     */
    Sela selaMakeThinSets(int index, int debug);

    /**
     * Original signature :
     * <code>l_ok jbCorrelation(const char*, l_float32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code>
     */
    int jbCorrelation(String dirin, float thresh, float weight, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>l_ok jbRankHaus(const char*, l_int32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code>
     */
    int jbRankHaus(String dirin, int size, float rank, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code>
     */
    JbClasser jbWordsInTextlines(String dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code>
     */
    JbClasser jbWordsInTextlines(Pointer dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>l_ok pixGetWordsInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, PIXA**, NUMA**)</code>
     */
    int pixGetWordsInTextlines(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>l_ok pixGetWordBoxesInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, NUMA**)</code>
     */
    int pixGetWordBoxesInTextlines(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>NUMAA* boxaExtractSortedPattern(BOXA*, NUMA*)</code>
     */
    Numaa boxaExtractSortedPattern(Boxa boxa, Numa na);

    /**
     * Original signature :
     * <code>l_ok numaaCompareImagesByBoxes(NUMAA*, NUMAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    int numaaCompareImagesByBoxes(Numaa naa1, Numaa naa2, int nperline, int nreq, int maxshiftx, int maxshifty, int delx, int dely, IntBuffer psame, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixColorContent(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    int pixColorContent(Pix pixs, int rwhite, int gwhite, int bwhite, int mingray, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>PIX* pixColorMagnitude(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorMagnitude(Pix pixs, int rwhite, int gwhite, int bwhite, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorPixels(PIX*, l_int32, l_int32)</code>
     */
    Pix pixMaskOverColorPixels(Pix pixs, int threshdiff, int mindist);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorRange(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMaskOverColorRange(Pix pixs, int rmin, int rmax, int gmin, int gmax, int bmin, int bmax);

    /**
     * Original signature :
     * <code>l_ok pixColorFraction(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    int pixColorFraction(Pix pixs, int darkthresh, int lightthresh, int diffthresh, int factor, FloatBuffer ppixfract, FloatBuffer pcolorfract);

    /**
     * Original signature :
     * <code>l_ok pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code>
     */
    int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatBuffer pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code>
     */
    int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatByReference pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixNumSignificantGrayColors(PIX*, l_int32, l_int32, l_float32, l_int32, l_int32*)</code>
     */
    int pixNumSignificantGrayColors(Pix pixs, int darkthresh, int lightthresh, float minfract, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_ok pixColorsForQuantization(PIX*, l_int32, l_int32*, l_int32*, l_int32)</code>
     */
    int pixColorsForQuantization(Pix pixs, int thresh, IntBuffer pncolors, IntBuffer piscolor, int debug);

    /**
     * Original signature :
     * <code>l_ok pixNumColors(PIX*, l_int32, l_int32*)</code>
     */
    int pixNumColors(Pix pixs, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_ok pixGetMostPopulatedColors(PIX*, l_int32, l_int32, l_int32, l_uint32**, PIXCMAP**)</code>
     */
    int pixGetMostPopulatedColors(Pix pixs, int sigbits, int factor, int ncolors, PointerByReference parray, PointerByReference pcmap);

    /**
     * Original signature :
     * <code>PIX* pixSimpleColorQuantize(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixSimpleColorQuantize(Pix pixs, int sigbits, int factor, int ncolors);

    /**
     * Original signature :
     * <code>NUMA* pixGetRGBHistogram(PIX*, l_int32, l_int32)</code>
     */
    Numa pixGetRGBHistogram(Pix pixs, int sigbits, int factor);

    /**
     * Original signature :
     * <code>l_ok makeRGBIndexTables(l_uint32**, l_uint32**, l_uint32**, l_int32)</code>
     */
    int makeRGBIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int sigbits);

    /**
     * Original signature :
     * <code>l_ok getRGBFromIndex(l_uint32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int getRGBFromIndex(int index, int sigbits, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code>
     */
    int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntBuffer phasred, FloatBuffer pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code>
     */
    int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntByReference phasred, FloatByReference pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayRegions(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorGrayRegions(Pix pixs, Boxa boxa, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGray(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixColorGray(Pix pixs, Box box, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorGrayMasked(Pix pixs, Pix pixm, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixSnapColor(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code>
     */
    Pix pixSnapColor(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixSnapColorCmap(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code>
     */
    Pix pixSnapColorCmap(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixLinearMapToTargetColor(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    Pix pixLinearMapToTargetColor(Pix pixd, Pix pixs, int srcval, int dstval);

    /**
     * Original signature :
     * <code>l_ok pixelLinearMapToTargetColor(l_uint32, l_uint32, l_uint32, l_uint32*)</code>
     */
    int pixelLinearMapToTargetColor(int scolor, int srcmap, int dstmap, IntBuffer pdcolor);

    /**
     * Original signature :
     * <code>PIX* pixShiftByComponent(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    Pix pixShiftByComponent(Pix pixd, Pix pixs, int srcval, int dstval);

//      /**
//       * Original signature :
//       * <code>l_ok pixelShiftByComponent(l_int32, l_int32, l_int32, l_uint32, l_uint32, l_uint32*)</code>
//       */
//      int pixelShiftByComponent(int rval, int gval, int bval, int srcval, int dstval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>l_ok pixelFractionalShift(l_int32, l_int32, l_int32, l_float32, l_uint32*)</code>
//       */
//      int pixelFractionalShift(int rval, int gval, int bval, float fraction, IntBuffer ppixel);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapCreate(l_int32)</code>
//       */
//      PixColormap pixcmapCreate(int depth);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapCreateRandom(l_int32, l_int32, l_int32)</code>
//       */
//      PixColormap pixcmapCreateRandom(int depth, int hasblack, int haswhite);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapCreateLinear(l_int32, l_int32)</code>
//       */
//      PixColormap pixcmapCreateLinear(int d, int nlevels);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapCopy(PIXCMAP*)</code>
//       */
//      PixColormap pixcmapCopy(PixColormap cmaps);
//  
//      /**
//       * Original signature : <code>void pixcmapDestroy(PIXCMAP**)</code>
//       */
//      void pixcmapDestroy(PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapAddColor(PIXCMAP*, l_int32, l_int32, l_int32)</code>
//       */
//      int pixcmapAddColor(PixColormap cmap, int rval, int gval, int bval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapAddRGBA(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      int pixcmapAddRGBA(PixColormap cmap, int rval, int gval, int bval, int aval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapAddNewColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcmapAddNewColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapAddNearestColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcmapAddNearestColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapUsableColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcmapUsableColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pusable);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapAddBlackOrWhite(PIXCMAP*, l_int32, l_int32*)</code>
//       */
//      int pixcmapAddBlackOrWhite(PixColormap cmap, int color, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapSetBlackAndWhite(PIXCMAP*, l_int32, l_int32)</code>
//       */
//      int pixcmapSetBlackAndWhite(PixColormap cmap, int setblack, int setwhite);
//  
//      /**
//       * Original signature : <code>l_int32 pixcmapGetCount(PIXCMAP*)</code>
//       */
//      int pixcmapGetCount(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetFreeCount(PIXCMAP*)</code>
//       */
//      int pixcmapGetFreeCount(PixColormap cmap);
//  
//      /**
//       * Original signature : <code>l_int32 pixcmapGetDepth(PIXCMAP*)</code>
//       */
//      int pixcmapGetDepth(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetMinDepth(PIXCMAP*, l_int32*)</code>
//       */
//      int pixcmapGetMinDepth(PixColormap cmap, IntBuffer pmindepth);
//  
//      /**
//       * Original signature : <code>l_ok pixcmapClear(PIXCMAP*)</code>
//       */
//      int pixcmapClear(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetColor(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixcmapGetColor(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetColor32(PIXCMAP*, l_int32, l_uint32*)</code>
//       */
//      int pixcmapGetColor32(PixColormap cmap, int index, IntBuffer pval32);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetRGBA(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixcmapGetRGBA(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetRGBA32(PIXCMAP*, l_int32, l_uint32*)</code>
//       */
//      int pixcmapGetRGBA32(PixColormap cmap, int index, IntBuffer pval32);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapResetColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      int pixcmapResetColor(PixColormap cmap, int index, int rval, int gval, int bval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapSetAlpha(PIXCMAP*, l_int32, l_int32)</code>
//       */
//      int pixcmapSetAlpha(PixColormap cmap, int index, int aval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcmapGetIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapHasColor(PIXCMAP*, l_int32*)</code>
//       */
//      int pixcmapHasColor(PixColormap cmap, IntBuffer pcolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapIsOpaque(PIXCMAP*, l_int32*)</code>
//       */
//      int pixcmapIsOpaque(PixColormap cmap, IntBuffer popaque);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapIsBlackAndWhite(PIXCMAP*, l_int32*)</code>
//       */
//      int pixcmapIsBlackAndWhite(PixColormap cmap, IntBuffer pblackwhite);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapCountGrayColors(PIXCMAP*, l_int32*)</code>
//       */
//      int pixcmapCountGrayColors(PixColormap cmap, IntBuffer pngray);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetRankIntensity(PIXCMAP*, l_float32, l_int32*)</code>
//       */
//      int pixcmapGetRankIntensity(PixColormap cmap, float rankval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetNearestIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcmapGetNearestIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGetNearestGrayIndex(PIXCMAP*, l_int32, l_int32*)</code>
//       */
//      int pixcmapGetNearestGrayIndex(PixColormap cmap, int val, IntBuffer pindex);
    /**
     * Original signature :
     * <code>l_ok pixcmapGetDistanceToColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    int pixcmapGetDistanceToColor(PixColormap cmap, int index, int rval, int gval, int bval, IntBuffer pdist);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetRangeValues(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int pixcmapGetRangeValues(PixColormap cmap, int select, IntBuffer pminval, IntBuffer pmaxval, IntBuffer pminindex, IntBuffer pmaxindex);

//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapGrayToColor(l_uint32)</code>
//       */
//      PixColormap pixcmapGrayToColor(int color);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapColorToGray(PIXCMAP*, l_float32, l_float32, l_float32)</code>
//       */
//      PixColormap pixcmapColorToGray(PixColormap cmaps, float rwt, float gwt, float bwt);
    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapConvertTo4(PIXCMAP*)</code>
     */
    PixColormap pixcmapConvertTo4(PixColormap cmaps);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapConvertTo8(PIXCMAP*)</code>
     */
    PixColormap pixcmapConvertTo8(PixColormap cmaps);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapRead(const char*)</code>
//       */
//      PixColormap pixcmapRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapReadStream(FILE*)</code>
//       */
//      PixColormap pixcmapReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapReadMem(const l_uint8*, size_t)</code>
     */
    PixColormap pixcmapReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixcmapWrite(const char*, PIXCMAP*)</code>
     */
    int pixcmapWrite(String filename, PixColormap cmap);

//      /**
//       * Original signature :
//       * <code>l_ok pixcmapWriteStream(FILE*, PIXCMAP*)</code>
//       */
//      int pixcmapWriteStream(FILE fp, PixColormap cmap);
    /**
     * Original signature :
     * <code>l_ok pixcmapWriteMem(l_uint8**, size_t*, PIXCMAP*)</code>
     */
    int pixcmapWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixColormap cmap);

//      /**
//       * Original signature :
//       * <code>l_ok pixcmapToArrays(PIXCMAP*, l_int32**, l_int32**, l_int32**, l_int32**)</code>
//       */
//      int pixcmapToArrays(PixColormap cmap, PointerByReference prmap, PointerByReference pgmap, PointerByReference pbmap, PointerByReference pamap);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapToRGBTable(PIXCMAP*, l_uint32**, l_int32*)</code>
//       */
//      int pixcmapToRGBTable(PixColormap cmap, PointerByReference ptab, IntBuffer pncolors);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapSerializeToMemory(PIXCMAP*, l_int32, l_int32*, l_uint8**)</code>
//       */
//      int pixcmapSerializeToMemory(PixColormap cmap, int cpc, IntBuffer pncolors, PointerByReference pdata);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapDeserializeFromMemory(l_uint8*, l_int32, l_int32)</code>
//       */
//      PixColormap pixcmapDeserializeFromMemory(ByteBuffer data, int cpc, int ncolors);
//      /**
//       * Original signature :
//       * <code>char* pixcmapConvertToHex(l_uint8*, l_int32)</code>
//       */
//      Pointer pixcmapConvertToHex(ByteBuffer data, int ncolors);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapGammaTRC(PIXCMAP*, l_float32, l_int32, l_int32)</code>
//       */
//      int pixcmapGammaTRC(PixColormap cmap, float gamma, int minval, int maxval);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapContrastTRC(PIXCMAP*, l_float32)</code>
//       */
//      int pixcmapContrastTRC(PixColormap cmap, float factor);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapShiftIntensity(PIXCMAP*, l_float32)</code>
//       */
//      int pixcmapShiftIntensity(PixColormap cmap, float fraction);
//      /**
//       * Original signature :
//       * <code>l_ok pixcmapShiftByComponent(PIXCMAP*, l_uint32, l_uint32)</code>
//       */
//      int pixcmapShiftByComponent(PixColormap cmap, int srcval, int dstval);
    /**
     * Original signature :
     * <code>PIX* pixColorMorph(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorMorph(Pix pixs, int type, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuant(PIX*, l_int32, l_int32)</code>
     */
    Pix pixOctreeColorQuant(Pix pixs, int colors, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuantGeneral(PIX*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    Pix pixOctreeColorQuantGeneral(Pix pixs, int colors, int ditherflag, float validthresh, float colorthresh);

    /**
     * Original signature :
     * <code>l_ok makeRGBToIndexTables(l_uint32**, l_uint32**, l_uint32**, l_int32)</code>
     */
    int makeRGBToIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int cqlevels);

    /**
     * Original signature :
     * <code>void getOctcubeIndexFromRGB(l_int32, l_int32, l_int32, l_uint32*, l_uint32*, l_uint32*, l_uint32*)</code>
     */
    void getOctcubeIndexFromRGB(int rval, int gval, int bval, IntBuffer rtab, IntBuffer gtab, IntBuffer btab, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantByPopulation(PIX*, l_int32, l_int32)</code>
     */
    Pix pixOctreeQuantByPopulation(Pix pixs, int level, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantNumColors(PIX*, l_int32, l_int32)</code>
     */
    Pix pixOctreeQuantNumColors(Pix pixs, int maxcolors, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantMixedWithGray(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixOctcubeQuantMixedWithGray(Pix pixs, int depth, int graylevels, int delta);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuant256(PIX*, l_int32)</code>
     */
    Pix pixFixedOctcubeQuant256(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant1(PIX*, l_int32)</code>
     */
    Pix pixFewColorsOctcubeQuant1(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant2(PIX*, l_int32, NUMA*, l_int32, l_int32*)</code>
     */
    Pix pixFewColorsOctcubeQuant2(Pix pixs, int level, Numa na, int ncolors, IntBuffer pnerrors);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixFewColorsOctcubeQuantMixed(Pix pixs, int level, int darkthresh, int lightthresh, int diffthresh, float minfract, int maxspan);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuantGenRGB(PIX*, l_int32)</code>
     */
    Pix pixFixedOctcubeQuantGenRGB(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixOctcubeQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>NUMA* pixOctcubeHistogram(PIX*, l_int32, l_int32*)</code>
     */
    Numa pixOctcubeHistogram(Pix pixs, int level, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_int32* pixcmapToOctcubeLUT(PIXCMAP*, l_int32, l_int32)</code>
     */
    IntByReference pixcmapToOctcubeLUT(PixColormap cmap, int level, int metric);

    /**
     * Original signature : <code>l_ok pixRemoveUnusedColors(PIX*)</code>
     */
    int pixRemoveUnusedColors(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixNumberOccupiedOctcubes(PIX*, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    int pixNumberOccupiedOctcubes(Pix pix, int level, int mincount, float minfract, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuant(PIX*, l_int32)</code>
     */
    Pix pixMedianCutQuant(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMedianCutQuantGeneral(Pix pixs, int ditherflag, int outdepth, int maxcolors, int sigbits, int maxsub, int checkbw);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixFewColorsMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int maxncolors, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>l_int32* pixMedianCutHisto(PIX*, l_int32, l_int32)</code>
     */
    IntByReference pixMedianCutHisto(Pix pixs, int sigbits, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixColorSegment(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorSegment(Pix pixs, int maxdist, int maxcolors, int selsize, int finalcolors, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixColorSegmentCluster(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixColorSegmentCluster(Pix pixs, int maxdist, int maxcolors, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixAssignToNearestColor(PIX*, PIX*, PIX*, l_int32, l_int32*)</code>
     */
    int pixAssignToNearestColor(Pix pixd, Pix pixs, Pix pixm, int level, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_ok pixColorSegmentClean(PIX*, l_int32, l_int32*)</code>
     */
    int pixColorSegmentClean(Pix pixs, int selsize, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_ok pixColorSegmentRemoveColors(PIX*, PIX*, l_int32)</code>
     */
    int pixColorSegmentRemoveColors(Pix pixd, Pix pixs, int finalcolors);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHSV(PIX*, PIX*)</code>
     */
    Pix pixConvertRGBToHSV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertHSVToRGB(PIX*, PIX*)</code>
     */
    Pix pixConvertHSVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok convertRGBToHSV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertRGBToHSV(int rval, int gval, int bval, IntBuffer phval, IntBuffer psval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_ok convertHSVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertHSVToRGB(int hval, int sval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixcmapConvertRGBToHSV(PIXCMAP*)</code>
     */
    int pixcmapConvertRGBToHSV(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapConvertHSVToRGB(PIXCMAP*)</code>
     */
    int pixcmapConvertHSVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHue(PIX*)</code>
     */
    Pix pixConvertRGBToHue(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToSaturation(PIX*)</code>
     */
    Pix pixConvertRGBToSaturation(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToValue(PIX*)</code>
     */
    Pix pixConvertRGBToValue(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHS(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMakeRangeMaskHS(Pix pixs, int huecenter, int huehw, int satcenter, int sathw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMakeRangeMaskHV(Pix pixs, int huecenter, int huehw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMakeRangeMaskSV(Pix pixs, int satcenter, int sathw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHS(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    Pix pixMakeHistoHS(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnasat);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHV(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    Pix pixMakeHistoHV(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoSV(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    Pix pixMakeHistoSV(Pix pixs, int factor, PointerByReference pnasat, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>l_ok pixFindHistoPeaksHSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PTA**, NUMA**, PIXA**)</code>
     */
    int pixFindHistoPeaksHSV(Pix pixs, int type, int width, int height, int npeaks, float erasefactor, PointerByReference ppta, PointerByReference pnatot, PointerByReference ppixa);

    /**
     * Original signature :
     * <code>PIX* displayHSVColorRange(l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix displayHSVColorRange(int hval, int sval, int vval, int huehw, int sathw, int nsamp, int factor);

    /**
     * Original signature : <code>PIX* pixConvertRGBToYUV(PIX*, PIX*)</code>
     */
    Pix pixConvertRGBToYUV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertYUVToRGB(PIX*, PIX*)</code>
     */
    Pix pixConvertYUVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok convertRGBToYUV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertRGBToYUV(int rval, int gval, int bval, IntBuffer pyval, IntBuffer puval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_ok convertYUVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertYUVToRGB(int yval, int uval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixcmapConvertRGBToYUV(PIXCMAP*)</code>
     */
    int pixcmapConvertRGBToYUV(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapConvertYUVToRGB(PIXCMAP*)</code>
     */
    int pixcmapConvertYUVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToXYZ(PIX*)</code>
     */
    FPixa pixConvertRGBToXYZ(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertXYZToRGB(FPIXA*)</code>
     */
    Pix fpixaConvertXYZToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_ok convertRGBToXYZ(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    int convertRGBToXYZ(int rval, int gval, int bval, FloatBuffer pfxval, FloatBuffer pfyval, FloatBuffer pfzval);

    /**
     * Original signature :
     * <code>l_ok convertXYZToRGB(l_float32, l_float32, l_float32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertXYZToRGB(float fxval, float fyval, float fzval, int blackout, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>FPIXA* fpixaConvertXYZToLAB(FPIXA*)</code>
     */
    FPixa fpixaConvertXYZToLAB(FPixa fpixas);

    /**
     * Original signature : <code>FPIXA* fpixaConvertLABToXYZ(FPIXA*)</code>
     */
    FPixa fpixaConvertLABToXYZ(FPixa fpixas);

    /**
     * Original signature :
     * <code>l_ok convertXYZToLAB(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    int convertXYZToLAB(float xval, float yval, float zval, FloatBuffer plval, FloatBuffer paval, FloatBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok convertLABToXYZ(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    int convertLABToXYZ(float lval, float aval, float bval, FloatBuffer pxval, FloatBuffer pyval, FloatBuffer pzval);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToLAB(PIX*)</code>
     */
    FPixa pixConvertRGBToLAB(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertLABToRGB(FPIXA*)</code>
     */
    Pix fpixaConvertLABToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_ok convertRGBToLAB(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    int convertRGBToLAB(int rval, int gval, int bval, FloatBuffer pflval, FloatBuffer pfaval, FloatBuffer pfbval);

    /**
     * Original signature :
     * <code>l_ok convertLABToRGB(l_float32, l_float32, l_float32, l_int32*, l_int32*, l_int32*)</code>
     */
    int convertLABToRGB(float flval, float faval, float fbval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixEqual(PIX*, PIX*, l_int32*)</code>
     */
    int pixEqual(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixEqualWithAlpha(PIX*, PIX*, l_int32, l_int32*)</code>
     */
    int pixEqualWithAlpha(Pix pix1, Pix pix2, int use_alpha, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixEqualWithCmap(PIX*, PIX*, l_int32*)</code>
     */
    int pixEqualWithCmap(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok cmapEqual(PIXCMAP*, PIXCMAP*, l_int32, l_int32*)</code>
     */
    int cmapEqual(PixColormap cmap1, PixColormap cmap2, int ncomps, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixUsesCmapColor(PIX*, l_int32*)</code>
     */
    int pixUsesCmapColor(Pix pixs, IntBuffer pcolor);

    /**
     * Original signature :
     * <code>l_ok pixCorrelationBinary(PIX*, PIX*, l_float32*)</code>
     */
    int pixCorrelationBinary(Pix pix1, Pix pix2, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* pixDisplayDiffBinary(PIX*, PIX*)</code>
     */
    Pix pixDisplayDiffBinary(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_ok pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code>
     */
    int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatBuffer pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code>
     */
    int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatByReference pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareTiled(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    int pixCompareTiled(Pix pix1, Pix pix2, int sx, int sy, int type, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>NUMA* pixCompareRankDifference(PIX*, PIX*, l_int32)</code>
     */
    Numa pixCompareRankDifference(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_ok pixTestForSimilarity(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32*, l_int32)</code>
     */
    int pixTestForSimilarity(Pix pix1, Pix pix2, int factor, int mindiff, float maxfract, float maxave, IntBuffer psimilar, int details);

    /**
     * Original signature :
     * <code>l_ok pixGetDifferenceStats(PIX*, PIX*, l_int32, l_int32, l_float32*, l_float32*, l_int32)</code>
     */
    int pixGetDifferenceStats(Pix pix1, Pix pix2, int factor, int mindiff, FloatBuffer pfractdiff, FloatBuffer pavediff, int details);

    /**
     * Original signature :
     * <code>NUMA* pixGetDifferenceHistogram(PIX*, PIX*, l_int32)</code>
     */
    Numa pixGetDifferenceHistogram(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_ok pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code>
     */
    int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatBuffer pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_ok pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code>
     */
    int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatByReference pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_ok pixGetPSNR(PIX*, PIX*, l_int32, l_float32*)</code>
     */
    int pixGetPSNR(Pix pix1, Pix pix2, int factor, FloatBuffer ppsnr);

    /**
     * Original signature :
     * <code>l_ok pixaComparePhotoRegionsByHisto(PIXA*, l_float32, l_float32, l_int32, l_int32, l_int32, l_float32, NUMA**, l_float32**, PIX**, l_int32)</code>
     */
    int pixaComparePhotoRegionsByHisto(Pixa pixa, float minratio, float textthresh, int factor, int nx, int ny, float simthresh, PointerByReference pnai, PointerByReference pscores, PointerByReference ppixd, int debug);

    /**
     * Original signature :
     * <code>l_ok pixComparePhotoRegionsByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_int32, l_float32*, l_int32)</code>
     */
    int pixComparePhotoRegionsByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int factor, int nx, int ny, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code>
     */
    int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntBuffer pw, IntBuffer ph, int debugindex);

    /**
     * Original signature :
     * <code>l_ok pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code>
     */
    int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntByReference pw, IntByReference ph, int debugindex);

    /**
     * Original signature :
     * <code>PIX* pixPadToCenterCentroid(PIX*, l_int32)</code>
     */
    Pix pixPadToCenterCentroid(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_ok pixCentroid8(PIX*, l_int32, l_float32*, l_float32*)</code>
     */
    int pixCentroid8(Pix pixs, int factor, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfPhotoImage(PIX*, l_int32, l_int32, l_int32, l_float32, NUMAA**, PIXA*)</code>
     */
    int pixDecideIfPhotoImage(Pix pix, int factor, int nx, int ny, float thresh, PointerByReference pnaa, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_ok compareTilesByHisto(NUMAA*, NUMAA*, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32*, PIXA*)</code>
     */
    int compareTilesByHisto(Numaa naa1, Numaa naa2, float minratio, int w1, int h1, int w2, int h2, FloatBuffer pscore, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32*, l_int32)</code>
     */
    int pixCompareGrayByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int maxgray, int factor, int nx, int ny, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixCropAlignedToCentroid(PIX*, PIX*, l_int32, BOX**, BOX**)</code>
     */
    int pixCropAlignedToCentroid(Pix pix1, Pix pix2, int factor, PointerByReference pbox1, PointerByReference pbox2);

    /**
     * Original signature :
     * <code>l_uint8* l_compressGrayHistograms(NUMAA*, l_int32, l_int32, size_t*)</code>
     */
    Pointer l_compressGrayHistograms(Numaa naa, int w, int h, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>NUMAA* l_uncompressGrayHistograms(l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    Numaa l_uncompressGrayHistograms(ByteBuffer bytea, NativeSize size, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok pixCompareWithTranslation(PIX*, PIX*, l_int32, l_int32*, l_int32*, l_float32*, l_int32)</code>
     */
    int pixCompareWithTranslation(Pix pix1, Pix pix2, int thresh, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixBestCorrelation(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_float32*, l_int32)</code>
     */
    int pixBestCorrelation(Pix pix1, Pix pix2, int area1, int area2, int etransx, int etransy, int maxshift, IntBuffer tab8, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>BOXA* pixConnComp(PIX*, PIXA**, l_int32)</code>
     */
    Boxa pixConnComp(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature :
     * <code>BOXA* pixConnCompPixa(PIX*, PIXA**, l_int32)</code>
     */
    Boxa pixConnCompPixa(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature : <code>BOXA* pixConnCompBB(PIX*, l_int32)</code>
     */
    Boxa pixConnCompBB(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixCountConnComp(PIX*, l_int32, l_int32*)</code>
     */
    int pixCountConnComp(Pix pixs, int connectivity, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_int32 nextOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    int nextOnPixelInRaster(Pix pixs, int xstart, int ystart, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>BOX* pixSeedfillBB(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code>
     */
    Box pixSeedfillBB(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill4BB(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    Box pixSeedfill4BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill8BB(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    Box pixSeedfill8BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code>
     */
    int pixSeedfill(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill4(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    int pixSeedfill4(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill8(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    int pixSeedfill8(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok convertFilesTo1bpp(const char*, const char*, l_int32, l_int32, l_int32, l_int32, const char*, l_int32)</code>
     */
    int convertFilesTo1bpp(String dirin, String substr, int upscaling, int thresh, int firstpage, int npages, String dirout, int outformat);

    /**
     * Original signature :
     * <code>PIX* pixBlockconv(PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlockconv(Pix pix, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGray(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlockconvGray(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature : <code>PIX* pixBlockconvAccum(PIX*)</code>
     */
    Pix pixBlockconvAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayUnnormalized(PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlockconvGrayUnnormalized(Pix pixs, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvTiled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixBlockconvTiled(Pix pix, int wc, int hc, int nx, int ny);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayTile(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlockconvGrayTile(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>l_ok pixWindowedStats(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, FPIX**, FPIX**)</code>
     */
    int pixWindowedStats(Pix pixs, int wc, int hc, int hasborder, PointerByReference ppixm, PointerByReference ppixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMean(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixWindowedMean(Pix pixs, int wc, int hc, int hasborder, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMeanSquare(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixWindowedMeanSquare(Pix pixs, int wc, int hc, int hasborder);

    /**
     * Original signature :
     * <code>l_ok pixWindowedVariance(PIX*, PIX*, FPIX**, FPIX**)</code>
     */
    int pixWindowedVariance(Pix pixm, Pix pixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature : <code>DPIX* pixMeanSquareAccum(PIX*)</code>
     */
    DPix pixMeanSquareAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockrank(PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    Pix pixBlockrank(Pix pixs, Pix pixacc, int wc, int hc, float rank);

    /**
     * Original signature :
     * <code>PIX* pixBlocksum(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixBlocksum(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixCensusTransform(PIX*, l_int32, PIX*)</code>
     */
    Pix pixCensusTransform(Pix pixs, int halfsize, Pix pixacc);

    /**
     * Original signature :
     * <code>PIX* pixConvolve(PIX*, L_KERNEL*, l_int32, l_int32)</code>
     */
    Pix pixConvolve(Pix pixs, L_Kernel kel, int outdepth, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveSep(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32)</code>
     */
    Pix pixConvolveSep(Pix pixs, L_Kernel kelx, L_Kernel kely, int outdepth, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveRGB(PIX*, L_KERNEL*)</code>
     */
    Pix pixConvolveRGB(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixConvolveRGBSep(PIX*, L_KERNEL*, L_KERNEL*)</code>
     */
    Pix pixConvolveRGBSep(Pix pixs, L_Kernel kelx, L_Kernel kely);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolve(FPIX*, L_KERNEL*, l_int32)</code>
     */
    FPix fpixConvolve(FPix fpixs, L_Kernel kel, int normflag);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolveSep(FPIX*, L_KERNEL*, L_KERNEL*, l_int32)</code>
     */
    FPix fpixConvolveSep(FPix fpixs, L_Kernel kelx, L_Kernel kely, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveWithBias(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32*)</code>
     */
    Pix pixConvolveWithBias(Pix pixs, L_Kernel kel1, L_Kernel kel2, int force8, IntBuffer pbias);

    /**
     * Original signature :
     * <code>void l_setConvolveSampling(l_int32, l_int32)</code>
     */
    void l_setConvolveSampling(int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixAddGaussianNoise(PIX*, l_float32)</code>
     */
    Pix pixAddGaussianNoise(Pix pixs, float stdev);

    /**
     * Original signature : <code>l_float32 gaussDistribSampling()</code>
     */
    float gaussDistribSampling();

//      /**
//       * Original signature :
//       * <code>l_ok pixCorrelationScore(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code>
//       */
//      int pixCorrelationScore(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);
//      /**
//       * Original signature :
//       * <code>l_ok pixCorrelationScoreThresholded(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_int32*, l_float32)</code>
//       */
//      int pixCorrelationScoreThresholded(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, IntBuffer downcount, float score_threshold);
//      /**
//       * Original signature :
//       * <code>l_ok pixCorrelationScoreSimple(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code>
//       */
//      int pixCorrelationScoreSimple(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);
//      /**
//       * Original signature :
//       * <code>l_ok pixCorrelationScoreShifted(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32*, l_float32*)</code>
//       */
//      int pixCorrelationScoreShifted(Pix pix1, Pix pix2, int area1, int area2, int delx, int dely, IntBuffer tab, FloatBuffer pscore);
    /**
     * Original signature :
     * <code>L_DEWARP* dewarpCreate(PIX*, l_int32)</code>
     */
    L_Dewarp dewarpCreate(Pix pixs, int pageno);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpCreateRef(l_int32, l_int32)</code>
     */
    L_Dewarp dewarpCreateRef(int pageno, int refpage);

    /**
     * Original signature : <code>void dewarpDestroy(L_DEWARP**)</code>
     */
    void dewarpDestroy(PointerByReference pdew);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    L_Dewarpa dewarpaCreate(int nptrs, int sampling, int redfactor, int minlines, int maxdist);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreateFromPixacomp(PIXAC*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    L_Dewarpa dewarpaCreateFromPixacomp(PixaComp pixac, int useboth, int sampling, int minlines, int maxdist);

    /**
     * Original signature : <code>void dewarpaDestroy(L_DEWARPA**)</code>
     */
    void dewarpaDestroy(PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaDestroyDewarp(L_DEWARPA*, l_int32)</code>
     */
    int dewarpaDestroyDewarp(L_Dewarpa dewa, int pageno);

    /**
     * Original signature :
     * <code>l_ok dewarpaInsertDewarp(L_DEWARPA*, L_DEWARP*)</code>
     */
    int dewarpaInsertDewarp(L_Dewarpa dewa, L_Dewarp dew);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpaGetDewarp(L_DEWARPA*, l_int32)</code>
     */
    L_Dewarp dewarpaGetDewarp(L_Dewarpa dewa, int index);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetCurvatures(L_DEWARPA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int dewarpaSetCurvatures(L_Dewarpa dewa, int max_linecurv, int min_diff_linecurv, int max_diff_linecurv, int max_edgecurv, int max_diff_edgecurv, int max_edgeslope);

    /**
     * Original signature :
     * <code>l_ok dewarpaUseBothArrays(L_DEWARPA*, l_int32)</code>
     */
    int dewarpaUseBothArrays(L_Dewarpa dewa, int useboth);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetCheckColumns(L_DEWARPA*, l_int32)</code>
     */
    int dewarpaSetCheckColumns(L_Dewarpa dewa, int check_columns);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetMaxDistance(L_DEWARPA*, l_int32)</code>
     */
    int dewarpaSetMaxDistance(L_Dewarpa dewa, int maxdist);

    /**
     * Original signature : <code>L_DEWARP* dewarpRead(const char*)</code>
     */
    L_Dewarp dewarpRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DEWARP* dewarpReadStream(FILE*)</code>
//       */
//      L_Dewarp dewarpReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpReadMem(const l_uint8*, size_t)</code>
     */
    L_Dewarp dewarpReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok dewarpWrite(const char*, L_DEWARP*)</code>
     */
    int dewarpWrite(String filename, L_Dewarp dew);

//      /**
//       * Original signature :
//       * <code>l_ok dewarpWriteStream(FILE*, L_DEWARP*)</code>
//       */
//      int dewarpWriteStream(FILE fp, L_Dewarp dew);
    /**
     * Original signature :
     * <code>l_ok dewarpWriteMem(l_uint8**, size_t*, L_DEWARP*)</code>
     */
    int dewarpWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarp dew);

    /**
     * Original signature : <code>L_DEWARPA* dewarpaRead(const char*)</code>
     */
    L_Dewarpa dewarpaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DEWARPA* dewarpaReadStream(FILE*)</code>
//       */
//      L_Dewarpa dewarpaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaReadMem(const l_uint8*, size_t)</code>
     */
    L_Dewarpa dewarpaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok dewarpaWrite(const char*, L_DEWARPA*)</code>
     */
    int dewarpaWrite(String filename, L_Dewarpa dewa);

//      /**
//       * Original signature :
//       * <code>l_ok dewarpaWriteStream(FILE*, L_DEWARPA*)</code>
//       */
//      int dewarpaWriteStream(FILE fp, L_Dewarpa dewa);
    /**
     * Original signature :
     * <code>l_ok dewarpaWriteMem(l_uint8**, size_t*, L_DEWARPA*)</code>
     */
    int dewarpaWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpBuildPageModel(L_DEWARP*, const char*)</code>
     */
    int dewarpBuildPageModel(L_Dewarp dew, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpFindVertDisparity(L_DEWARP*, PTAA*, l_int32)</code>
     */
    int dewarpFindVertDisparity(L_Dewarp dew, Ptaa ptaa, int rotflag);

    /**
     * Original signature :
     * <code>l_ok dewarpFindHorizDisparity(L_DEWARP*, PTAA*)</code>
     */
    int dewarpFindHorizDisparity(L_Dewarp dew, Ptaa ptaa);

    /**
     * Original signature :
     * <code>PTAA* dewarpGetTextlineCenters(PIX*, l_int32)</code>
     */
    Ptaa dewarpGetTextlineCenters(Pix pixs, int debugflag);

    /**
     * Original signature :
     * <code>PTAA* dewarpRemoveShortLines(PIX*, PTAA*, l_float32, l_int32)</code>
     */
    Ptaa dewarpRemoveShortLines(Pix pixs, Ptaa ptaas, float fract, int debugflag);

    /**
     * Original signature :
     * <code>l_ok dewarpFindHorizSlopeDisparity(L_DEWARP*, PIX*, l_float32, l_int32)</code>
     */
    int dewarpFindHorizSlopeDisparity(L_Dewarp dew, Pix pixb, float fractthresh, int parity);

    /**
     * Original signature :
     * <code>l_ok dewarpBuildLineModel(L_DEWARP*, l_int32, const char*)</code>
     */
    int dewarpBuildLineModel(L_Dewarp dew, int opensize, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaModelStatus(L_DEWARPA*, l_int32, l_int32*, l_int32*)</code>
     */
    int dewarpaModelStatus(L_Dewarpa dewa, int pageno, IntBuffer pvsuccess, IntBuffer phsuccess);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code>
     */
    int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code>
     */
    int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, Pointer debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code>
     */
    int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code>
     */
    int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, Pointer debugfile);

    /**
     * Original signature : <code>l_ok dewarpMinimize(L_DEWARP*)</code>
     */
    int dewarpMinimize(L_Dewarp dew);

    /**
     * Original signature :
     * <code>l_ok dewarpPopulateFullRes(L_DEWARP*, PIX*, l_int32, l_int32)</code>
     */
    int dewarpPopulateFullRes(L_Dewarp dew, Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePage(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**, l_int32)</code>
     */
    int dewarpSinglePage(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixd, PointerByReference pdewa, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePageInit(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**)</code>
     */
    int dewarpSinglePageInit(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixb, PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePageRun(PIX*, PIX*, L_DEWARPA*, PIX**, l_int32)</code>
     */
    int dewarpSinglePageRun(Pix pixs, Pix pixb, L_Dewarpa dewa, PointerByReference ppixd, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpaListPages(L_DEWARPA*)</code>
     */
    int dewarpaListPages(L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetValidModels(L_DEWARPA*, l_int32, l_int32)</code>
     */
    int dewarpaSetValidModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpaInsertRefModels(L_DEWARPA*, l_int32, l_int32)</code>
     */
    int dewarpaInsertRefModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpaStripRefModels(L_DEWARPA*)</code>
     */
    int dewarpaStripRefModels(L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaRestoreModels(L_DEWARPA*)</code>
     */
    int dewarpaRestoreModels(L_Dewarpa dewa);

//      /**
//       * Original signature :
//       * <code>l_ok dewarpaInfo(FILE*, L_DEWARPA*)</code>
//       */
//      int dewarpaInfo(FILE fp, L_Dewarpa dewa);
    /**
     * Original signature :
     * <code>l_ok dewarpaModelStats(L_DEWARPA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int dewarpaModelStats(L_Dewarpa dewa, IntBuffer pnnone, IntBuffer pnvsuccess, IntBuffer pnvvalid, IntBuffer pnhsuccess, IntBuffer pnhvalid, IntBuffer pnref);

    /**
     * Original signature :
     * <code>l_ok dewarpaShowArrays(L_DEWARPA*, l_float32, l_int32, l_int32)</code>
     */
    int dewarpaShowArrays(L_Dewarpa dewa, float scalefact, int first, int last);

    /**
     * Original signature :
     * <code>l_ok dewarpDebug(L_DEWARP*, const char*, l_int32)</code>
     */
    int dewarpDebug(L_Dewarp dew, String subdirs, int index);

    /**
     * Original signature :
     * <code>l_ok dewarpShowResults(L_DEWARPA*, SARRAY*, BOXA*, l_int32, l_int32, const char*)</code>
     */
    int dewarpShowResults(L_Dewarpa dewa, Sarray sa, Boxa boxa, int firstpage, int lastpage, String pdfout);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaCreate(l_int32)</code>
//       */
//      L_Dna l_dnaCreate(int n);

//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaCreateFromIArray(l_int32*, l_int32)</code>
//       */
//      L_Dna l_dnaCreateFromIArray(IntBuffer iarray, int size);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaCreateFromDArray(l_float64*, l_int32, l_int32)</code>
//       */
//      L_Dna l_dnaCreateFromDArray(DoubleBuffer darray, int size, int copyflag);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaMakeSequence(l_float64, l_float64, l_int32)</code>
//       */
//      L_Dna l_dnaMakeSequence(double startval, double increment, int size);
//  
//      /**
//       * Original signature : <code>void l_dnaDestroy(L_DNA**)</code>
//       */
//      void l_dnaDestroy(PointerByReference pda);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaCopy(L_DNA*)</code>
//       */
//      L_Dna l_dnaCopy(L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaClone(L_DNA*)</code>
//       */
//      L_Dna l_dnaClone(L_Dna da);
//  
//      /**
//       * Original signature : <code>l_ok l_dnaEmpty(L_DNA*)</code>
//       */
//      int l_dnaEmpty(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaAddNumber(L_DNA*, l_float64)</code>
//       */
//      int l_dnaAddNumber(L_Dna da, double val);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaInsertNumber(L_DNA*, l_int32, l_float64)</code>
//       */
//      int l_dnaInsertNumber(L_Dna da, int index, double val);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaRemoveNumber(L_DNA*, l_int32)</code>
//       */
//      int l_dnaRemoveNumber(L_Dna da, int index);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaReplaceNumber(L_DNA*, l_int32, l_float64)</code>
//       */
//      int l_dnaReplaceNumber(L_Dna da, int index, double val);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaGetCount(L_DNA*)</code>
//       */
//      int l_dnaGetCount(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaSetCount(L_DNA*, l_int32)</code>
//       */
//      int l_dnaSetCount(L_Dna da, int newcount);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaGetDValue(L_DNA*, l_int32, l_float64*)</code>
//       */
//      int l_dnaGetDValue(L_Dna da, int index, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaGetIValue(L_DNA*, l_int32, l_int32*)</code>
//       */
//      int l_dnaGetIValue(L_Dna da, int index, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaSetValue(L_DNA*, l_int32, l_float64)</code>
//       */
//      int l_dnaSetValue(L_Dna da, int index, double val);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaShiftValue(L_DNA*, l_int32, l_float64)</code>
//       */
//      int l_dnaShiftValue(L_Dna da, int index, double diff);
//  
//      /**
//       * Original signature : <code>l_int32* l_dnaGetIArray(L_DNA*)</code>
//       */
//      IntByReference l_dnaGetIArray(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_float64* l_dnaGetDArray(L_DNA*, l_int32)</code>
//       */
//      DoubleByReference l_dnaGetDArray(L_Dna da, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaGetRefcount(L_DNA*)</code>
//       */
//      int l_dnaGetRefcount(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaChangeRefcount(L_DNA*, l_int32)</code>
//       */
//      int l_dnaChangeRefcount(L_Dna da, int delta);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaGetParameters(L_DNA*, l_float64*, l_float64*)</code>
//       */
//      int l_dnaGetParameters(L_Dna da, DoubleBuffer pstartx, DoubleBuffer pdelx);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaSetParameters(L_DNA*, l_float64, l_float64)</code>
//       */
//      int l_dnaSetParameters(L_Dna da, double startx, double delx);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaCopyParameters(L_DNA*, L_DNA*)</code>
//       */
//      int l_dnaCopyParameters(L_Dna dad, L_Dna das);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaRead(const char*)</code>
//       */
//      L_Dna l_dnaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaReadStream(FILE*)</code>
//       */
//      L_Dna l_dnaReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaWrite(const char*, L_DNA*)</code>
//       */
//      int l_dnaWrite(String filename, L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaWriteStream(FILE*, L_DNA*)</code>
//       */
//      int l_dnaWriteStream(FILE fp, L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaCreate(l_int32)</code>
//       */
//      L_Dnaa l_dnaaCreate(int n);
    /**
     * Original signature :
     * <code>L_DNAA* l_dnaaCreateFull(l_int32, l_int32)</code>
     */
    L_Dnaa l_dnaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_ok l_dnaaTruncate(L_DNAA*)</code>
     */
    int l_dnaaTruncate(L_Dnaa daa);
//  
//      /**
//       * Original signature : <code>void l_dnaaDestroy(L_DNAA**)</code>
//       */
//      void l_dnaaDestroy(PointerByReference pdaa);

//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaAddDna(L_DNAA*, L_DNA*, l_int32)</code>
//       */
//      int l_dnaaAddDna(L_Dnaa daa, L_Dna da, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaaGetCount(L_DNAA*)</code>
//       */
//      int l_dnaaGetCount(L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaGetDnaCount(L_DNAA*, l_int32)</code>
//       */
//      int l_dnaaGetDnaCount(L_Dnaa daa, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaGetNumberCount(L_DNAA*)</code>
//       */
//      int l_dnaaGetNumberCount(L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaaGetDna(L_DNAA*, l_int32, l_int32)</code>
//       */
//      L_Dna l_dnaaGetDna(L_Dnaa daa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaReplaceDna(L_DNAA*, l_int32, L_DNA*)</code>
//       */
//      int l_dnaaReplaceDna(L_Dnaa daa, int index, L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaGetValue(L_DNAA*, l_int32, l_int32, l_float64*)</code>
//       */
//      int l_dnaaGetValue(L_Dnaa daa, int i, int j, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaAddNumber(L_DNAA*, l_int32, l_float64)</code>
//       */
//      int l_dnaaAddNumber(L_Dnaa daa, int index, double val);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaRead(const char*)</code>
//       */
//      L_Dnaa l_dnaaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaReadStream(FILE*)</code>
//       */
//      L_Dnaa l_dnaaReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaWrite(const char*, L_DNAA*)</code>
//       */
//      int l_dnaaWrite(String filename, L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaaWriteStream(FILE*, L_DNAA*)</code>
//       */
//      int l_dnaaWriteStream(FILE fp, L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_ok l_dnaJoin(L_DNA*, L_DNA*, l_int32, l_int32)</code>
//       */
//      int l_dnaJoin(L_Dna dad, L_Dna das, int istart, int iend);
    /**
     * Original signature : <code>L_DNA* l_dnaaFlattenToDna(L_DNAA*)</code>
     */
    L_Dna l_dnaaFlattenToDna(L_Dnaa daa);
//  
//      /**
//       * Original signature : <code>NUMA* l_dnaConvertToNuma(L_DNA*)</code>
//       */
//      Numa l_dnaConvertToNuma(L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNA* numaConvertToDna(NUMA*)</code>
//       */
//      L_Dna numaConvertToDna(Numa na);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaUnionByAset(L_DNA*, L_DNA*)</code>
     */
    L_Dna l_dnaUnionByAset(L_Dna da1, L_Dna da2);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaRemoveDupsByAset(L_DNA*)</code>
     */
    L_Dna l_dnaRemoveDupsByAset(L_Dna das);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaIntersectionByAset(L_DNA*, L_DNA*)</code>
     */
    L_Dna l_dnaIntersectionByAset(L_Dna da1, L_Dna da2);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromDna(L_DNA*)</code>
     */
    L_Rbtree l_asetCreateFromDna(L_Dna da);

    /**
     * Original signature : <code>L_DNA* l_dnaDiffAdjValues(L_DNA*)</code>
     */
    L_Dna l_dnaDiffAdjValues(L_Dna das);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreate(l_int32, l_int32)</code>
     */
    L_DnaHash l_dnaHashCreate(int nbuckets, int initsize);

    /**
     * Original signature : <code>void l_dnaHashDestroy(L_DNAHASH**)</code>
     */
    void l_dnaHashDestroy(PointerByReference pdahash);

    /**
     * Original signature :
     * <code>l_int32 l_dnaHashGetCount(L_DNAHASH*)</code>
     */
    int l_dnaHashGetCount(L_DnaHash dahash);

    /**
     * Original signature :
     * <code>l_int32 l_dnaHashGetTotalCount(L_DNAHASH*)</code>
     */
    int l_dnaHashGetTotalCount(L_DnaHash dahash);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaHashGetDna(L_DNAHASH*, l_uint64, l_int32)</code>
     */
    L_Dna l_dnaHashGetDna(L_DnaHash dahash, long key, int copyflag);

    /**
     * Original signature :
     * <code>l_ok l_dnaHashAdd(L_DNAHASH*, l_uint64, l_float64)</code>
     */
    int l_dnaHashAdd(L_DnaHash dahash, long key, double value);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreateFromDna(L_DNA*)</code>
     */
    L_DnaHash l_dnaHashCreateFromDna(L_Dna da);

    /**
     * Original signature :
     * <code>l_ok l_dnaRemoveDupsByHash(L_DNA*, L_DNA**, L_DNAHASH**)</code>
     */
    int l_dnaRemoveDupsByHash(L_Dna das, PointerByReference pdad, PointerByReference pdahash);

    /**
     * Original signature :
     * <code>l_ok l_dnaMakeHistoByHash(L_DNA*, L_DNAHASH**, L_DNA**, L_DNA**)</code>
     */
    int l_dnaMakeHistoByHash(L_Dna das, PointerByReference pdahash, PointerByReference pdav, PointerByReference pdac);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaIntersectionByHash(L_DNA*, L_DNA*)</code>
     */
    L_Dna l_dnaIntersectionByHash(L_Dna da1, L_Dna da2);

    /**
     * Original signature :
     * <code>l_ok l_dnaFindValByHash(L_DNA*, L_DNAHASH*, l_float64, l_int32*)</code>
     */
    int l_dnaFindValByHash(L_Dna da, L_DnaHash dahash, double val, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_2(PIX*, PIX*, l_int32, char*)</code>
     */
    Pix pixMorphDwa_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_2(PIX*, PIX*, l_int32, char*)</code>
     */
    Pix pixFMorphopGen_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>l_int32 fmorphopgen_low_2(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    int fmorphopgen_low_2(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature :
     * <code>PIX* pixSobelEdgeFilter(PIX*, l_int32)</code>
     */
    Pix pixSobelEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>PIX* pixTwoSidedEdgeFilter(PIX*, l_int32)</code>
     */
    Pix pixTwoSidedEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>l_ok pixMeasureEdgeSmoothness(PIX*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, const char*)</code>
     */
    int pixMeasureEdgeSmoothness(Pix pixs, int side, int minjump, int minreversal, FloatBuffer pjpl, FloatBuffer pjspl, FloatBuffer prpl, String debugfile);

    /**
     * Original signature :
     * <code>NUMA* pixGetEdgeProfile(PIX*, l_int32, const char*)</code>
     */
    Numa pixGetEdgeProfile(Pix pixs, int side, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 pixGetLastOffPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    int pixGetLastOffPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>l_int32 pixGetLastOnPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    int pixGetLastOnPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>char* encodeBase64(l_uint8*, l_int32, l_int32*)</code>
     */
    Pointer encodeBase64(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeBase64(const char*, l_int32, l_int32*)</code>
     */
    Pointer decodeBase64(String inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>char* encodeAscii85(l_uint8*, l_int32, l_int32*)</code>
     */
    Pointer encodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeAscii85(char*, l_int32, l_int32*)</code>
     */
    Pointer decodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>char* reformatPacked64(char*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    Pointer reformatPacked64(ByteBuffer inarray, int insize, int leadspace, int linechars, int addquotes, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRC(PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    Pix pixGammaTRC(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCMasked(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    Pix pixGammaTRCMasked(Pix pixd, Pix pixs, Pix pixm, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCWithAlpha(PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    Pix pixGammaTRCWithAlpha(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>NUMA* numaGammaTRC(l_float32, l_int32, l_int32)</code>
     */
    Numa numaGammaTRC(float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRC(PIX*, PIX*, l_float32)</code>
     */
    Pix pixContrastTRC(Pix pixd, Pix pixs, float factor);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRCMasked(PIX*, PIX*, PIX*, l_float32)</code>
     */
    Pix pixContrastTRCMasked(Pix pixd, Pix pixs, Pix pixm, float factor);

    /**
     * Original signature : <code>NUMA* numaContrastTRC(l_float32)</code>
     */
    Numa numaContrastTRC(float factor);

    /**
     * Original signature :
     * <code>PIX* pixEqualizeTRC(PIX*, PIX*, l_float32, l_int32)</code>
     */
    Pix pixEqualizeTRC(Pix pixd, Pix pixs, float fract, int factor);

    /**
     * Original signature :
     * <code>NUMA* numaEqualizeTRC(PIX*, l_float32, l_int32)</code>
     */
    Numa numaEqualizeTRC(Pix pix, float fract, int factor);

    /**
     * Original signature :
     * <code>l_int32 pixTRCMap(PIX*, PIX*, NUMA*)</code>
     */
    int pixTRCMap(Pix pixs, Pix pixm, Numa na);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMasking(PIX*, l_int32, l_float32)</code>
     */
    Pix pixUnsharpMasking(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray(PIX*, l_int32, l_float32)</code>
     */
    Pix pixUnsharpMaskingGray(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingFast(PIX*, l_int32, l_float32, l_int32)</code>
     */
    Pix pixUnsharpMaskingFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGrayFast(PIX*, l_int32, l_float32, l_int32)</code>
     */
    Pix pixUnsharpMaskingGrayFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray1D(PIX*, l_int32, l_float32, l_int32)</code>
     */
    Pix pixUnsharpMaskingGray1D(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray2D(PIX*, l_int32, l_float32)</code>
     */
    Pix pixUnsharpMaskingGray2D(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifyHue(PIX*, PIX*, l_float32)</code>
     */
    Pix pixModifyHue(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifySaturation(PIX*, PIX*, l_float32)</code>
     */
    Pix pixModifySaturation(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixMeasureSaturation(PIX*, l_int32, l_float32*)</code>
     */
    int pixMeasureSaturation(Pix pixs, int factor, FloatBuffer psat);

    /**
     * Original signature :
     * <code>PIX* pixModifyBrightness(PIX*, PIX*, l_float32)</code>
     */
    Pix pixModifyBrightness(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixColorShiftRGB(PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixColorShiftRGB(Pix pixs, float rfract, float gfract, float bfract);
    
    /**
     * Original signature : <code>PIX* pixDarkenGray(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDarkenGray(Pix pixd, Pix pixs, int thresh, int satlimit);

    /**
     * Original signature :
     * <code>PIX* pixMultConstantColor(PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixMultConstantColor(Pix pixs, float rfact, float gfact, float bfact);

    /**
     * Original signature :
     * <code>PIX* pixMultMatrixColor(PIX*, L_KERNEL*)</code>
     */
    Pix pixMultMatrixColor(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixHalfEdgeByBandpass(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixHalfEdgeByBandpass(Pix pixs, int sm1h, int sm1v, int sm2h, int sm2v);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen(SELA*, l_int32, const char*)</code>
     */
    int fhmtautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen1(SELA*, l_int32, const char*)</code>
     */
    int fhmtautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen2(SELA*, l_int32, const char*)</code>
     */
    int fhmtautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixHMTDwa_1(PIX*, PIX*, const char*)</code>
     */
    Pix pixHMTDwa_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>PIX* pixFHMTGen_1(PIX*, PIX*, const char*)</code>
     */
    Pix pixFHMTGen_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>l_int32 fhmtgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    int fhmtgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature :
     * <code>l_ok pixItalicWords(PIX*, BOXA*, PIX*, BOXA**, l_int32)</code>
     */
    int pixItalicWords(Pix pixs, Boxa boxaw, Pix pixw, PointerByReference pboxa, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixOrientDetect(PIX*, l_float32*, l_float32*, l_int32, l_int32)</code>
     */
    int pixOrientDetect(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok makeOrientDecision(l_float32, l_float32, l_float32, l_float32, l_int32*, l_int32)</code>
     */
    int makeOrientDecision(float upconf, float leftconf, float minupconf, float minratio, IntBuffer porient, int debug);

    /**
     * Original signature :
     * <code>l_ok pixUpDownDetect(PIX*, l_float32*, l_int32, l_int32)</code>
     */
    int pixUpDownDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok pixUpDownDetectGeneral(PIX*, l_float32*, l_int32, l_int32, l_int32)</code>
     */
    int pixUpDownDetectGeneral(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug);

    /**
     * Original signature :
     * <code>l_ok pixOrientDetectDwa(PIX*, l_float32*, l_float32*, l_int32, l_int32)</code>
     */
    int pixOrientDetectDwa(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok pixUpDownDetectDwa(PIX*, l_float32*, l_int32, l_int32)</code>
     */
    int pixUpDownDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok pixUpDownDetectGeneralDwa(PIX*, l_float32*, l_int32, l_int32, l_int32)</code>
     */
    int pixUpDownDetectGeneralDwa(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug);

    /**
     * Original signature :
     * <code>l_ok pixMirrorDetect(PIX*, l_float32*, l_int32, l_int32)</code>
     */
    int pixMirrorDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok pixMirrorDetectDwa(PIX*, l_float32*, l_int32, l_int32)</code>
     */
    int pixMirrorDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>PIX* pixFlipFHMTGen(PIX*, PIX*, const char*)</code>
     */
    Pix pixFlipFHMTGen(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>l_ok fmorphautogen(SELA*, l_int32, const char*)</code>
     */
    int fmorphautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fmorphautogen1(SELA*, l_int32, const char*)</code>
     */
    int fmorphautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fmorphautogen2(SELA*, l_int32, const char*)</code>
     */
    int fmorphautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_1(PIX*, PIX*, l_int32, char*)</code>
     */
    Pix pixMorphDwa_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_1(PIX*, PIX*, l_int32, char*)</code>
     */
    Pix pixFMorphopGen_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

//      /**
//       * Original signature :
//       * <code>l_int32 fmorphopgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
//       */
//      int fmorphopgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCreate(l_int32, l_int32)</code>
//       */
//      FPix fpixCreate(int width, int height);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCreateTemplate(FPIX*)</code>
//       */
//      FPix fpixCreateTemplate(FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixClone(FPIX*)</code>
//       */
//      FPix fpixClone(FPix fpix);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCopy(FPIX*, FPIX*)</code>
//       */
//      FPix fpixCopy(FPix fpixd, FPix fpixs);
//      /**
//       * Original signature :
//       * <code>l_ok fpixResizeImageData(FPIX*, FPIX*)</code>
//       */
//      int fpixResizeImageData(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>void fpixDestroy(FPIX**)</code>
//       */
//      void fpixDestroy(PointerByReference pfpix);
//      /**
//       * Original signature :
//       * <code>l_ok fpixGetDimensions(FPIX*, l_int32*, l_int32*)</code>
//       */
//      int fpixGetDimensions(FPix fpix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok fpixSetDimensions(FPIX*, l_int32, l_int32)</code>
//       */
//      int fpixSetDimensions(FPix fpix, int w, int h);
//  
//      /**
//       * Original signature : <code>l_int32 fpixGetWpl(FPIX*)</code>
//       */
//      int fpixGetWpl(FPix fpix);
//  
//      /**
//       * Original signature : <code>l_ok fpixSetWpl(FPIX*, l_int32)</code>
//       */
//      int fpixSetWpl(FPix fpix, int wpl);
//  
//      /**
//       * Original signature : <code>l_int32 fpixGetRefcount(FPIX*)</code>
//       */
//      int fpixGetRefcount(FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_ok fpixChangeRefcount(FPIX*, l_int32)</code>
//       */
//      int fpixChangeRefcount(FPix fpix, int delta);
//      /**
//       * Original signature :
//       * <code>l_ok fpixGetResolution(FPIX*, l_int32*, l_int32*)</code>
//       */
//      int fpixGetResolution(FPix fpix, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_ok fpixSetResolution(FPIX*, l_int32, l_int32)</code>
//       */
//      int fpixSetResolution(FPix fpix, int xres, int yres);
//      /**
//       * Original signature :
//       * <code>l_ok fpixCopyResolution(FPIX*, FPIX*)</code>
//       */
//      int fpixCopyResolution(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>l_float32* fpixGetData(FPIX*)</code>
//       */
//      FloatByReference fpixGetData(FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_ok fpixSetData(FPIX*, l_float32*)</code>
//       */
//      int fpixSetData(FPix fpix, FloatBuffer data);
//      /**
//       * Original signature :
//       * <code>l_ok fpixGetPixel(FPIX*, l_int32, l_int32, l_float32*)</code>
//       */
//      int fpixGetPixel(FPix fpix, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok fpixSetPixel(FPIX*, l_int32, l_int32, l_float32)</code>
//       */
//      int fpixSetPixel(FPix fpix, int x, int y, float val);
//  
//      /**
//       * Original signature : <code>FPIXA* fpixaCreate(l_int32)</code>
//       */
//      FPixa fpixaCreate(int n);
//  
//      /**
//       * Original signature : <code>FPIXA* fpixaCopy(FPIXA*, l_int32)</code>
//       */
//      FPixa fpixaCopy(FPixa fpixa, int copyflag);
//  
//      /**
//       * Original signature : <code>void fpixaDestroy(FPIXA**)</code>
//       */
//      void fpixaDestroy(PointerByReference pfpixa);
//      /**
//       * Original signature :
//       * <code>l_ok fpixaAddFPix(FPIXA*, FPIX*, l_int32)</code>
//       */
//      int fpixaAddFPix(FPixa fpixa, FPix fpix, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 fpixaGetCount(FPIXA*)</code>
//       */
//      int fpixaGetCount(FPixa fpixa);
//      /**
//       * Original signature :
//       * <code>l_ok fpixaChangeRefcount(FPIXA*, l_int32)</code>
//       */
//      int fpixaChangeRefcount(FPixa fpixa, int delta);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixaGetFPix(FPIXA*, l_int32, l_int32)</code>
//       */
//      FPix fpixaGetFPix(FPixa fpixa, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_ok fpixaGetFPixDimensions(FPIXA*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int fpixaGetFPixDimensions(FPixa fpixa, int index, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_float32* fpixaGetData(FPIXA*, l_int32)</code>
//       */
//      FloatByReference fpixaGetData(FPixa fpixa, int index);
//      /**
//       * Original signature :
//       * <code>l_ok fpixaGetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int fpixaGetPixel(FPixa fpixa, int index, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok fpixaSetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32)</code>
//       */
//      int fpixaSetPixel(FPixa fpixa, int index, int x, int y, float val);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCreate(l_int32, l_int32)</code>
//       */
//      DPix dpixCreate(int width, int height);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCreateTemplate(DPIX*)</code>
//       */
//      DPix dpixCreateTemplate(DPix dpixs);
//  
//      /**
//       * Original signature : <code>DPIX* dpixClone(DPIX*)</code>
//       */
//      DPix dpixClone(DPix dpix);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCopy(DPIX*, DPIX*)</code>
//       */
//      DPix dpixCopy(DPix dpixd, DPix dpixs);
//      /**
//       * Original signature :
//       * <code>l_ok dpixResizeImageData(DPIX*, DPIX*)</code>
//       */
//      int dpixResizeImageData(DPix dpixd, DPix dpixs);
//  
//      /**
//       * Original signature : <code>void dpixDestroy(DPIX**)</code>
//       */
//      void dpixDestroy(PointerByReference pdpix);
//      /**
//       * Original signature :
//       * <code>l_ok dpixGetDimensions(DPIX*, l_int32*, l_int32*)</code>
//       */
//      int dpixGetDimensions(DPix dpix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok dpixSetDimensions(DPIX*, l_int32, l_int32)</code>
//       */
//      int dpixSetDimensions(DPix dpix, int w, int h);
//  
//      /**
//       * Original signature : <code>l_int32 dpixGetWpl(DPIX*)</code>
//       */
//      int dpixGetWpl(DPix dpix);
//  
//      /**
//       * Original signature : <code>l_ok dpixSetWpl(DPIX*, l_int32)</code>
//       */
//      int dpixSetWpl(DPix dpix, int wpl);
//  
//      /**
//       * Original signature : <code>l_int32 dpixGetRefcount(DPIX*)</code>
//       */
//      int dpixGetRefcount(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_ok dpixChangeRefcount(DPIX*, l_int32)</code>
//       */
//      int dpixChangeRefcount(DPix dpix, int delta);
//      /**
//       * Original signature :
//       * <code>l_ok dpixGetResolution(DPIX*, l_int32*, l_int32*)</code>
//       */
//      int dpixGetResolution(DPix dpix, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_ok dpixSetResolution(DPIX*, l_int32, l_int32)</code>
//       */
//      int dpixSetResolution(DPix dpix, int xres, int yres);
//      /**
//       * Original signature :
//       * <code>l_ok dpixCopyResolution(DPIX*, DPIX*)</code>
//       */
//      int dpixCopyResolution(DPix dpixd, DPix dpixs);
//  
//      /**
//       * Original signature : <code>l_float64* dpixGetData(DPIX*)</code>
//       */
//      DoubleByReference dpixGetData(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_ok dpixSetData(DPIX*, l_float64*)</code>
//       */
//      int dpixSetData(DPix dpix, DoubleBuffer data);
//      /**
//       * Original signature :
//       * <code>l_ok dpixGetPixel(DPIX*, l_int32, l_int32, l_float64*)</code>
//       */
//      int dpixGetPixel(DPix dpix, int x, int y, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok dpixSetPixel(DPIX*, l_int32, l_int32, l_float64)</code>
//       */
//      int dpixSetPixel(DPix dpix, int x, int y, double val);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRead(const char*)</code>
//       */
//      FPix fpixRead(String filename);
//  
//      /**
//       * Original signature : <code>FPIX* fpixReadStream(FILE*)</code>
//       */
//      FPix fpixReadStream(FILE fp);
    /**
     * Original signature :
     * <code>FPIX* fpixReadMem(const l_uint8*, size_t)</code>
     */
    FPix fpixReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok fpixWrite(const char*, FPIX*)</code>
//       */
//      int fpixWrite(String filename, FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_ok fpixWriteStream(FILE*, FPIX*)</code>
//       */
//      int fpixWriteStream(FILE fp, FPix fpix);
    /**
     * Original signature :
     * <code>l_ok fpixWriteMem(l_uint8**, size_t*, FPIX*)</code>
     */
    int fpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, FPix fpix);

//      /**
//       * Original signature :
//       * <code>FPIX* fpixEndianByteSwap(FPIX*, FPIX*)</code>
//       */
//      FPix fpixEndianByteSwap(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>DPIX* dpixRead(const char*)</code>
//       */
//      DPix dpixRead(String filename);
//  
//      /**
//       * Original signature : <code>DPIX* dpixReadStream(FILE*)</code>
//       */
//      DPix dpixReadStream(FILE fp);
    /**
     * Original signature :
     * <code>DPIX* dpixReadMem(const l_uint8*, size_t)</code>
     */
    DPix dpixReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok dpixWrite(const char*, DPIX*)</code>
//       */
//      int dpixWrite(String filename, DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_ok dpixWriteStream(FILE*, DPIX*)</code>
//       */
//      int dpixWriteStream(FILE fp, DPix dpix);
    /**
     * Original signature :
     * <code>l_ok dpixWriteMem(l_uint8**, size_t*, DPIX*)</code>
     */
    int dpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, DPix dpix);

//      /**
//       * Original signature :
//       * <code>DPIX* dpixEndianByteSwap(DPIX*, DPIX*)</code>
//       */
//      DPix dpixEndianByteSwap(DPix dpixd, DPix dpixs);
//      /**
//       * Original signature :
//       * <code>l_ok fpixPrintStream(FILE*, FPIX*, l_int32)</code>
//       */
//      int fpixPrintStream(FILE fp, FPix fpix, int factor);
//      /**
//       * Original signature :
//       * <code>FPIX* pixConvertToFPix(PIX*, l_int32)</code>
//       */
//      FPix pixConvertToFPix(Pix pixs, int ncomps);
//      /**
//       * Original signature :
//       * <code>DPIX* pixConvertToDPix(PIX*, l_int32)</code>
//       */
//      DPix pixConvertToDPix(Pix pixs, int ncomps);
//      /**
//       * Original signature :
//       * <code>PIX* fpixConvertToPix(FPIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix fpixConvertToPix(FPix fpixs, int outdepth, int negvals, int errorflag);
//      /**
//       * Original signature :
//       * <code>PIX* fpixDisplayMaxDynamicRange(FPIX*)</code>
//       */
//      Pix fpixDisplayMaxDynamicRange(FPix fpixs);
//  
//      /**
//       * Original signature : <code>DPIX* fpixConvertToDPix(FPIX*)</code>
//       */
//      DPix fpixConvertToDPix(FPix fpix);
//      /**
//       * Original signature :
//       * <code>PIX* dpixConvertToPix(DPIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix dpixConvertToPix(DPix dpixs, int outdepth, int negvals, int errorflag);
//  
//      /**
//       * Original signature : <code>FPIX* dpixConvertToFPix(DPIX*)</code>
//       */
//      FPix dpixConvertToFPix(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_ok fpixGetMin(FPIX*, l_float32*, l_int32*, l_int32*)</code>
//       */
//      int fpixGetMin(FPix fpix, FloatBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);
//      /**
//       * Original signature :
//       * <code>l_ok fpixGetMax(FPIX*, l_float32*, l_int32*, l_int32*)</code>
//       */
//      int fpixGetMax(FPix fpix, FloatBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);
//      /**
//       * Original signature :
//       * <code>l_ok dpixGetMin(DPIX*, l_float64*, l_int32*, l_int32*)</code>
//       */
//      int dpixGetMin(DPix dpix, DoubleBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);
//      /**
//       * Original signature :
//       * <code>l_ok dpixGetMax(DPIX*, l_float64*, l_int32*, l_int32*)</code>
//       */
//      int dpixGetMax(DPix dpix, DoubleBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixScaleByInteger(FPIX*, l_int32)</code>
//       */
//      FPix fpixScaleByInteger(FPix fpixs, int factor);
//      /**
//       * Original signature :
//       * <code>DPIX* dpixScaleByInteger(DPIX*, l_int32)</code>
//       */
//      DPix dpixScaleByInteger(DPix dpixs, int factor);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixLinearCombination(FPIX*, FPIX*, FPIX*, l_float32, l_float32)</code>
//       */
//      FPix fpixLinearCombination(FPix fpixd, FPix fpixs1, FPix fpixs2, float a, float b);
//      /**
//       * Original signature :
//       * <code>l_ok fpixAddMultConstant(FPIX*, l_float32, l_float32)</code>
//       */
//      int fpixAddMultConstant(FPix fpix, float addc, float multc);
//      /**
//       * Original signature :
//       * <code>DPIX* dpixLinearCombination(DPIX*, DPIX*, DPIX*, l_float32, l_float32)</code>
//       */
//      DPix dpixLinearCombination(DPix dpixd, DPix dpixs1, DPix dpixs2, float a, float b);
//      /**
//       * Original signature :
//       * <code>l_ok dpixAddMultConstant(DPIX*, l_float64, l_float64)</code>
//       */
//      int dpixAddMultConstant(DPix dpix, double addc, double multc);
//      /**
//       * Original signature :
//       * <code>l_ok fpixSetAllArbitrary(FPIX*, l_float32)</code>
//       */
//      int fpixSetAllArbitrary(FPix fpix, float inval);
//      /**
//       * Original signature :
//       * <code>l_ok dpixSetAllArbitrary(DPIX*, l_float64)</code>
//       */
//      int dpixSetAllArbitrary(DPix dpix, double inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      FPix fpixAddBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixRemoveBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      FPix fpixRemoveBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddMirroredBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      FPix fpixAddMirroredBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddContinuedBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      FPix fpixAddContinuedBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddSlopeBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      FPix fpixAddSlopeBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>l_ok fpixRasterop(FPIX*, l_int32, l_int32, l_int32, l_int32, FPIX*, l_int32, l_int32)</code>
//       */
//      int fpixRasterop(FPix fpixd, int dx, int dy, int dw, int dh, FPix fpixs, int sx, int sy);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixRotateOrth(FPIX*, l_int32)</code>
//       */
//      FPix fpixRotateOrth(FPix fpixs, int quads);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRotate180(FPIX*, FPIX*)</code>
//       */
//      FPix fpixRotate180(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRotate90(FPIX*, l_int32)</code>
//       */
//      FPix fpixRotate90(FPix fpixs, int direction);
//  
//      /**
//       * Original signature : <code>FPIX* fpixFlipLR(FPIX*, FPIX*)</code>
//       */
//      FPix fpixFlipLR(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixFlipTB(FPIX*, FPIX*)</code>
//       */
//      FPix fpixFlipTB(FPix fpixd, FPix fpixs);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAffinePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code>
//       */
//      FPix fpixAffinePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAffine(FPIX*, l_float32*, l_float32)</code>
//       */
//      FPix fpixAffine(FPix fpixs, FloatBuffer vc, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixProjectivePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code>
//       */
//      FPix fpixProjectivePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixProjective(FPIX*, l_float32*, l_float32)</code>
//       */
//      FPix fpixProjective(FPix fpixs, FloatBuffer vc, float inval);
    /**
     * Original signature :
     * <code>l_ok linearInterpolatePixelFloat(l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    int linearInterpolatePixelFloat(FloatBuffer datas, int w, int h, float x, float y, float inval, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* fpixThresholdToPix(FPIX*, l_float32)</code>
     */
    Pix fpixThresholdToPix(FPix fpix, float thresh);

    /**
     * Original signature :
     * <code>FPIX* pixComponentFunction(PIX*, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    FPix pixComponentFunction(Pix pix, float rnum, float gnum, float bnum, float rdenom, float gdenom, float bdenom);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamGif(FILE*)</code>
//       */
//      Pix pixReadStreamGif(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamGif(FILE*, PIX*)</code>
//       */
//      int pixWriteStreamGif(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>PIX* pixReadMemGif(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemGif(ByteBuffer cdata, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemGif(l_uint8**, size_t*, PIX*)</code>
     */
    int pixWriteMemGif(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

//      /**
//       * Original signature :
//       * <code>GPLOT* gplotCreate(const char*, l_int32, const char*, const char*, const char*)</code>
//       */
//      GPlot gplotCreate(String rootname, int outformat, String title, String xlabel, String ylabel);
//  
//      /**
//       * Original signature : <code>void gplotDestroy(GPLOT**)</code>
//       */
//      void gplotDestroy(PointerByReference pgplot);
//      /**
//       * Original signature :
//       * <code>l_ok gplotAddPlot(GPLOT*, NUMA*, NUMA*, l_int32, const char*)</code>
//       */
//      int gplotAddPlot(GPlot gplot, Numa nax, Numa nay, int plotstyle, String plottitle);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSetScaling(GPLOT*, l_int32)</code>
//       */
//      int gplotSetScaling(GPlot gplot, int scaling);
//  
//      /**
//       * Original signature : <code>l_ok gplotMakeOutput(GPLOT*)</code>
//       */
//      int gplotMakeOutput(GPlot gplot);
//  
//      /**
//       * Original signature : <code>l_ok gplotGenCommandFile(GPLOT*)</code>
//       */
//      int gplotGenCommandFile(GPlot gplot);
//  
//      /**
//       * Original signature : <code>l_ok gplotGenDataFiles(GPLOT*)</code>
//       */
//      int gplotGenDataFiles(GPlot gplot);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimple1(NUMA*, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimple1(Numa na, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimple2(NUMA*, NUMA*, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimple2(Numa na1, Numa na2, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimpleN(NUMAA*, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimpleN(Numaa naa, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimpleXY1(NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimpleXY1(Numa nax, Numa nay, int plotstyle, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimpleXY2(NUMA*, NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimpleXY2(Numa nax, Numa nay1, Numa nay2, int plotstyle, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_ok gplotSimpleXYN(NUMA*, NUMAA*, l_int32, l_int32, const char*, const char*)</code>
//       */
//      int gplotSimpleXYN(Numa nax, Numaa naay, int plotstyle, int outformat, String outroot, String title);
//  
//      /**
//       * Original signature : <code>GPLOT* gplotRead(const char*)</code>
//       */
//      GPlot gplotRead(String filename);
//      /**
//       * Original signature :
//       * <code>l_ok gplotWrite(const char*, GPLOT*)</code>
//       */
//      int gplotWrite(String filename, GPlot gplot);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaLine(l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta generatePtaLine(int x1, int y1, int x2, int y2);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaWideLine(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta generatePtaWideLine(int x1, int y1, int x2, int y2, int width);
//  
//      /**
//       * Original signature : <code>PTA* generatePtaBox(BOX*, l_int32)</code>
//       */
//      Pta generatePtaBox(Box box, int width);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaBoxa(BOXA*, l_int32, l_int32)</code>
//       */
//      Pta generatePtaBoxa(Boxa boxa, int width, int removedups);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaHashBox(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta generatePtaHashBox(Box box, int spacing, int width, int orient, int outline);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta generatePtaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline, int removedups);
//  
//      /**
//       * Original signature : <code>PTAA* generatePtaaBoxa(BOXA*)</code>
//       */
//      Ptaa generatePtaaBoxa(Boxa boxa);
//      /**
//       * Original signature :
//       * <code>PTAA* generatePtaaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Ptaa generatePtaaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaPolyline(PTA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pta generatePtaPolyline(Pta ptas, int width, int closeflag, int removedups);
    /**
     * Original signature :
     * <code>PTA* generatePtaGrid(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pta generatePtaGrid(int w, int h, int nx, int ny, int width);
//  
//      /**
//       * Original signature : <code>PTA* convertPtaLineTo4cc(PTA*)</code>
//       */
//      Pta convertPtaLineTo4cc(Pta ptas);

//      /**
//       * Original signature :
//       * <code>PTA* generatePtaFilledCircle(l_int32)</code>
//       */
//      Pta generatePtaFilledCircle(int radius);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaFilledSquare(l_int32)</code>
//       */
//      Pta generatePtaFilledSquare(int side);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaLineFromPt(l_int32, l_int32, l_float64, l_float64)</code>
//       */
//      Pta generatePtaLineFromPt(int x, int y, double length, double radang);
//      /**
//       * Original signature :
//       * <code>l_ok locatePtRadially(l_int32, l_int32, l_float64, l_float64, l_float64*, l_float64*)</code>
//       */
//      int locatePtRadially(int xr, int yr, double dist, double radang, DoubleBuffer px, DoubleBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok pixRenderPlotFromNuma(PIX**, NUMA*, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      int pixRenderPlotFromNuma(PointerByReference ppix, Numa na, int plotloc, int linewidth, int max, int color);
//      /**
//       * Original signature :
//       * <code>PTA* makePlotPtaFromNuma(NUMA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta makePlotPtaFromNuma(Numa na, int size, int plotloc, int linewidth, int max);
//      /**
//       * Original signature :
//       * <code>l_ok pixRenderPlotFromNumaGen(PIX**, NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      int pixRenderPlotFromNumaGen(PointerByReference ppix, Numa na, int orient, int linewidth, int refpos, int max, int drawref, int color);
//      /**
//       * Original signature :
//       * <code>PTA* makePlotPtaFromNumaGen(NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta makePlotPtaFromNumaGen(Numa na, int orient, int linewidth, int refpos, int max, int drawref);
//      /**
//       * Original signature :
//       * <code>l_ok pixRenderPta(PIX*, PTA*, l_int32)</code>
//       */
//      int pixRenderPta(Pix pix, Pta pta, int op);
//      /**
//       * Original signature :
//       * <code>l_ok pixRenderPtaArb(PIX*, PTA*, l_uint8, l_uint8, l_uint8)</code>
//       */
//      int pixRenderPtaArb(Pix pix, Pta pta, byte rval, byte gval, byte bval);
//      /**
//       * Original signature :
//       * <code>l_ok pixRenderPtaBlend(PIX*, PTA*, l_uint8, l_uint8, l_uint8, l_float32)</code>
//       */
//      int pixRenderPtaBlend(Pix pix, Pta pta, byte rval, byte gval, byte bval, float fract);
    /**
     * Original signature :
     * <code>l_ok pixRenderLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderLine(Pix pix, int x1, int y1, int x2, int y2, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderLineArb(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    int pixRenderLineArb(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderLineBlend(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code>
     */
    int pixRenderLineBlend(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderBox(PIX*, BOX*, l_int32, l_int32)</code>
     */
    int pixRenderBox(Pix pix, Box box, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxArb(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    int pixRenderBoxArb(Pix pix, Box box, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxBlend(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code>
     */
    int pixRenderBoxBlend(Pix pix, Box box, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxa(PIX*, BOXA*, l_int32, l_int32)</code>
     */
    int pixRenderBoxa(Pix pix, Boxa boxa, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxaArb(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    int pixRenderBoxaArb(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxaBlend(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32)</code>
     */
    int pixRenderBoxaBlend(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval, float fract, int removedups);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBox(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderHashBox(Pix pix, Box box, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxArb(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderHashBoxArb(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxBlend(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    int pixRenderHashBoxBlend(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashMaskArb(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderHashMaskArb(Pix pix, Pix pixm, int x, int y, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxa(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderHashBoxa(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxaArb(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderHashBoxaArb(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxaBlend(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    int pixRenderHashBoxaBlend(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolyline(PIX*, PTA*, l_int32, l_int32, l_int32)</code>
     */
    int pixRenderPolyline(Pix pix, Pta ptas, int width, int op, int closeflag);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolylineArb(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_int32)</code>
     */
    int pixRenderPolylineArb(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, int closeflag);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolylineBlend(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32, l_int32)</code>
     */
    int pixRenderPolylineBlend(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, float fract, int closeflag, int removedups);

    /**
     * Original signature :
     * <code>l_ok pixRenderGridArb(PIX*, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    int pixRenderGridArb(Pix pix, int nx, int ny, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>PIX* pixRenderRandomCmapPtaa(PIX*, PTAA*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixRenderRandomCmapPtaa(Pix pix, Ptaa ptaa, int polyflag, int width, int closeflag);

    /**
     * Original signature :
     * <code>PIX* pixRenderPolygon(PTA*, l_int32, l_int32*, l_int32*)</code>
     */
    Pix pixRenderPolygon(Pta ptas, int width, IntBuffer pxmin, IntBuffer pymin);

    /**
     * Original signature :
     * <code>PIX* pixFillPolygon(PIX*, PTA*, l_int32, l_int32)</code>
     */
    Pix pixFillPolygon(Pix pixs, Pta pta, int xmin, int ymin);

    /**
     * Original signature :
     * <code>PIX* pixRenderContours(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixRenderContours(Pix pixs, int startval, int incr, int outdepth);

    /**
     * Original signature :
     * <code>PIX* fpixAutoRenderContours(FPIX*, l_int32)</code>
     */
    Pix fpixAutoRenderContours(FPix fpix, int ncontours);

    /**
     * Original signature :
     * <code>PIX* fpixRenderContours(FPIX*, l_float32, l_float32)</code>
     */
    Pix fpixRenderContours(FPix fpixs, float incr, float proxim);

    /**
     * Original signature :
     * <code>PTA* pixGeneratePtaBoundary(PIX*, l_int32)</code>
     */
    Pta pixGeneratePtaBoundary(Pix pixs, int width);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray(PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray(PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray(PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray(PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray3(PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray3(PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray3(PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray3(PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature : <code>PIX* pixDitherToBinary(PIX*)</code>
     */
    Pix pixDitherToBinary(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixDitherToBinarySpec(PIX*, l_int32, l_int32)</code>
     */
    Pix pixDitherToBinarySpec(Pix pixs, int lowerclip, int upperclip);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToBinary(PIX*, l_int32)</code>
     */
    Pix pixThresholdToBinary(Pix pixs, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixVarThresholdToBinary(PIX*, PIX*)</code>
     */
    Pix pixVarThresholdToBinary(Pix pixs, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinary(PIX*, PIX*, l_float32)</code>
     */
    Pix pixAdaptThresholdToBinary(Pix pixs, Pix pixm, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinaryGen(PIX*, PIX*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixAdaptThresholdToBinaryGen(Pix pixs, Pix pixm, float gamma, int blackval, int whiteval, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByValue(PIX*, l_int32, l_int32)</code>
     */
    Pix pixGenerateMaskByValue(Pix pixs, int val, int usecmap);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByBand(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixGenerateMaskByBand(Pix pixs, int lower, int upper, int inband, int usecmap);

    /**
     * Original signature : <code>PIX* pixDitherTo2bpp(PIX*, l_int32)</code>
     */
    Pix pixDitherTo2bpp(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixDitherTo2bppSpec(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixDitherTo2bppSpec(Pix pixs, int lowerclip, int upperclip, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo2bpp(PIX*, l_int32, l_int32)</code>
     */
    Pix pixThresholdTo2bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo4bpp(PIX*, l_int32, l_int32)</code>
     */
    Pix pixThresholdTo4bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdOn8bpp(PIX*, l_int32, l_int32)</code>
     */
    Pix pixThresholdOn8bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdGrayArb(PIX*, const char*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixThresholdGrayArb(Pix pixs, String edgevals, int outdepth, int use_average, int setblack, int setwhite);

//      /**
//       * Original signature :
//       * <code>l_int32* makeGrayQuantIndexTable(l_int32)</code>
//       */
//      IntByReference makeGrayQuantIndexTable(int nlevels);
//      /**
//       * Original signature :
//       * <code>l_ok makeGrayQuantTableArb(NUMA*, l_int32, l_int32**, PIXCMAP**)</code>
//       */
//      int makeGrayQuantTableArb(Numa na, int outdepth, PointerByReference ptab, PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateMaskByBand32(PIX*, l_uint32, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      Pix pixGenerateMaskByBand32(Pix pixs, int refval, int delm, int delp, float fractm, float fractp);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateMaskByDiscr32(PIX*, l_uint32, l_uint32, l_int32)</code>
//       */
//      Pix pixGenerateMaskByDiscr32(Pix pixs, int refval1, int refval2, int distflag);
//      /**
//       * Original signature :
//       * <code>PIX* pixGrayQuantFromHisto(PIX*, PIX*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixGrayQuantFromHisto(Pix pixd, Pix pixs, Pix pixm, float minfract, int maxsize);
//      /**
//       * Original signature :
//       * <code>PIX* pixGrayQuantFromCmap(PIX*, PIXCMAP*, l_int32)</code>
//       */
//      Pix pixGrayQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth);
//      /**
//       * Original signature :
//       * <code>void ditherToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32, l_int32, l_int32)</code>
//       */
//      void ditherToBinaryLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip, int lastlineflag);
    /**
     * Original signature :
     * <code>void thresholdToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    void thresholdToBinaryLineLow(IntBuffer lined, int w, IntBuffer lines, int d, int thresh);

     /**
     * Original signature :
     * <code>L_HEAP* lheapCreate(l_int32, l_int32)</code>
     */
    L_Heap lheapCreate(int nalloc, int direction);

    /**
     * Original signature :
     * <code>void lheapDestroy(L_HEAP**, l_int32)</code>
     */
    void lheapDestroy(PointerByReference plh, int freeflag);

    /**
     * Original signature : <code>l_ok lheapAdd(L_HEAP*, void*)</code>
     */
    int lheapAdd(L_Heap lh, Pointer item);

    /**
     * Original signature : <code>void* lheapRemove(L_HEAP*)</code>
     */
    Pointer lheapRemove(L_Heap lh);

    /**
     * Original signature : <code>l_int32 lheapGetCount(L_HEAP*)</code>
     */
    int lheapGetCount(L_Heap lh);

    /**
     * Original signature :
     * <code>l_ok lheapSwapUp(L_HEAP*, l_int32)</code>
     */
    int lheapSwapUp(L_Heap lh, int index);

    /**
     * Original signature : <code>l_ok lheapSwapDown(L_HEAP*)</code>
     */
    int lheapSwapDown(L_Heap lh);

    /**
     * Original signature : <code>l_ok lheapSort(L_HEAP*)</code>
     */
    int lheapSort(L_Heap lh);

    /**
     * Original signature :
     * <code>l_ok lheapSortStrictOrder(L_HEAP*)</code>
     */
    int lheapSortStrictOrder(L_Heap lh);
//  
//      /**
//       * Original signature : <code>l_ok lheapPrint(FILE*, L_HEAP*)</code>
//       */
//      int lheapPrint(FILE fp, L_Heap lh);

//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbRankHausInit(l_int32, l_int32, l_int32, l_int32, l_float32)</code>
//       */
//      JbClasser jbRankHausInit(int components, int maxwidth, int maxheight, int size, float rank);
//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbCorrelationInit(l_int32, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      JbClasser jbCorrelationInit(int components, int maxwidth, int maxheight, float thresh, float weightfactor);
//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbCorrelationInitWithoutComponents(l_int32, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      JbClasser jbCorrelationInitWithoutComponents(int components, int maxwidth, int maxheight, float thresh, float weightfactor);
//      /**
//       * Original signature :
//       * <code>l_ok jbAddPages(JBCLASSER*, SARRAY*)</code>
//       */
//      int jbAddPages(JbClasser classer, Sarray safiles);
//  
//      /**
//       * Original signature : <code>l_ok jbAddPage(JBCLASSER*, PIX*)</code>
//       */
//      int jbAddPage(JbClasser classer, Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_ok jbAddPageComponents(JBCLASSER*, PIX*, BOXA*, PIXA*)</code>
//       */
//      int jbAddPageComponents(JbClasser classer, Pix pixs, Boxa boxas, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_ok jbClassifyRankHaus(JBCLASSER*, BOXA*, PIXA*)</code>
//       */
//      int jbClassifyRankHaus(JbClasser classer, Boxa boxa, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_int32 pixHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      int pixHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRankHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
//       */
//      int pixRankHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh, int area1, int area3, float rank, IntBuffer tab8);
//      /**
//       * Original signature :
//       * <code>l_ok jbClassifyCorrelation(JBCLASSER*, BOXA*, PIXA*)</code>
//       */
//      int jbClassifyCorrelation(JbClasser classer, Boxa boxa, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_ok jbGetComponents(PIX*, l_int32, l_int32, l_int32, BOXA**, PIXA**)</code>
//       */
//      int jbGetComponents(Pix pixs, int components, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad);
    /**
     * Original signature :
     * <code>l_ok pixWordMaskByDilation(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    int pixWordMaskByDilation(Pix pixs, PointerByReference ppixm, IntBuffer psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordMaskByDilation(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    int pixWordMaskByDilation(Pix pixs, PointerByReference ppixm, IntByReference psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*, PIXA*)</code>
     */
    int pixWordBoxesByDilation(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntBuffer psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*, PIXA*)</code>
     */
    int pixWordBoxesByDilation(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntByReference psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIXA* jbAccumulateComposites(PIXAA*, NUMA**, PTA**)</code>
     */
    Pixa jbAccumulateComposites(Pixaa pixaa, PointerByReference pna, PointerByReference pptat);

    /**
     * Original signature :
     * <code>PIXA* jbTemplatesFromComposites(PIXA*, NUMA*)</code>
     */
    Pixa jbTemplatesFromComposites(Pixa pixac, Numa na);

    /**
     * Original signature :
     * <code>JBCLASSER* jbClasserCreate(l_int32, l_int32)</code>
     */
    JbClasser jbClasserCreate(int method, int components);

    /**
     * Original signature : <code>void jbClasserDestroy(JBCLASSER**)</code>
     */
    void jbClasserDestroy(PointerByReference pclasser);

    /**
     * Original signature : <code>JBDATA* jbDataSave(JBCLASSER*)</code>
     */
    JbData jbDataSave(JbClasser classer);

    /**
     * Original signature : <code>void jbDataDestroy(JBDATA**)</code>
     */
    void jbDataDestroy(PointerByReference pdata);

    /**
     * Original signature :
     * <code>l_ok jbDataWrite(const char*, JBDATA*)</code>
     */
    int jbDataWrite(String rootout, JbData jbdata);

    /**
     * Original signature : <code>JBDATA* jbDataRead(const char*)</code>
     */
    JbData jbDataRead(String rootname);

    /**
     * Original signature :
     * <code>PIXA* jbDataRender(JBDATA*, l_int32)</code>
     */
    Pixa jbDataRender(JbData data, int debugflag);

    /**
     * Original signature :
     * <code>l_ok jbGetULCorners(JBCLASSER*, PIX*, BOXA*)</code>
     */
    int jbGetULCorners(JbClasser classer, Pix pixs, Boxa boxa);

    /**
     * Original signature : <code>l_ok jbGetLLCorners(JBCLASSER*)</code>
     */
    int jbGetLLCorners(JbClasser classer);

    /**
     * Original signature :
     * <code>l_ok readHeaderJp2k(const char*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderJp2k(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_ok freadHeaderJp2k(FILE*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int freadHeaderJp2k(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);
    /**
     * Original signature :
     * <code>l_ok readHeaderMemJp2k(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemJp2k(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_int32 fgetJp2kResolution(FILE*, l_int32*, l_int32*)</code>
//       */
//      int fgetJp2kResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);
    /**
     * Original signature :
     * <code>PIX* pixReadJp2k(const char*, l_uint32, BOX*, l_int32, l_int32)</code>
     */
    Pix pixReadJp2k(String filename, int reduction, Box box, int hint, int debug);

//      /**
//       * Original signature :
//       * <code>PIX* pixReadStreamJp2k(FILE*, l_uint32, BOX*, l_int32, l_int32)</code>
//       */
//      Pix pixReadStreamJp2k(FILE fp, int reduction, Box box, int hint, int debug);
    /**
     * Original signature :
     * <code>l_ok pixWriteJp2k(const char*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint, int debug);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamJp2k(FILE*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      int pixWriteStreamJp2k(FILE fp, Pix pix, int quality, int nlevels, int hint, int debug);
    /**
     * Original signature :
     * <code>PIX* pixReadMemJp2k(const l_uint8*, size_t, l_uint32, BOX*, l_int32, l_int32)</code>
     */
    Pix pixReadMemJp2k(ByteBuffer data, NativeSize size, int reduction, Box box, int hint, int debug);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemJp2k(l_uint8**, size_t*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixWriteMemJp2k(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int nlevels, int hint, int debug);

    /**
     * Original signature :
     * <code>PIX* pixReadJpeg(const char*, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    Pix pixReadJpeg(String filename, int cmapflag, int reduction, IntBuffer pnwarn, int hint);

//      /**
//       * Original signature :
//       * <code>PIX* pixReadStreamJpeg(FILE*, l_int32, l_int32, l_int32*, l_int32)</code>
//       */
//      Pix pixReadStreamJpeg(FILE fp, int cmapflag, int reduction, IntBuffer pnwarn, int hint);
    /**
     * Original signature :
     * <code>l_ok readHeaderJpeg(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderJpeg(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

//      /**
//       * Original signature :
//       * <code>l_ok freadHeaderJpeg(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int freadHeaderJpeg(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);
//      /**
//       * Original signature :
//       * <code>l_int32 fgetJpegResolution(FILE*, l_int32*, l_int32*)</code>
//       */
//      int fgetJpegResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_int32 fgetJpegComment(FILE*, l_uint8**)</code>
//       */
//      int fgetJpegComment(FILE fp, PointerByReference pcomment);
    /**
     * Original signature :
     * <code>l_ok pixWriteJpeg(const char*, PIX*, l_int32, l_int32)</code>
     */
    int pixWriteJpeg(String filename, Pix pix, int quality, int progressive);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamJpeg(FILE*, PIX*, l_int32, l_int32)</code>
//       */
//      int pixWriteStreamJpeg(FILE fp, Pix pixs, int quality, int progressive);
    /**
     * Original signature :
     * <code>PIX* pixReadMemJpeg(const l_uint8*, size_t, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    Pix pixReadMemJpeg(ByteBuffer data, NativeSize size, int cmflag, int reduction, IntBuffer pnwarn, int hint);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemJpeg(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

//    /**
//    * Original signature : <code>l_ok readResolutionMemJpeg(const l_uint8*, size_t, l_int32*, l_int32*)</code>
//    */
//    int readResolutionMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemJpeg(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code>
     */
    int pixWriteMemJpeg(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int progressive);

    /**
     * Original signature :
     * <code>l_ok pixSetChromaSampling(PIX*, l_int32)</code>
     */
    int pixSetChromaSampling(Pix pix, int sampling);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreate(l_int32, l_int32)</code>
     */
    L_Kernel kernelCreate(int height, int width);

    /**
     * Original signature : <code>void kernelDestroy(L_KERNEL**)</code>
     */
    void kernelDestroy(PointerByReference pkel);

    /**
     * Original signature : <code>L_KERNEL* kernelCopy(L_KERNEL*)</code>
     */
    L_Kernel kernelCopy(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_ok kernelGetElement(L_KERNEL*, l_int32, l_int32, l_float32*)</code>
     */
    int kernelGetElement(L_Kernel kel, int row, int col, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok kernelSetElement(L_KERNEL*, l_int32, l_int32, l_float32)</code>
     */
    int kernelSetElement(L_Kernel kel, int row, int col, float val);

    /**
     * Original signature :
     * <code>l_ok kernelGetParameters(L_KERNEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int kernelGetParameters(L_Kernel kel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);

    /**
     * Original signature :
     * <code>l_ok kernelSetOrigin(L_KERNEL*, l_int32, l_int32)</code>
     */
    int kernelSetOrigin(L_Kernel kel, int cy, int cx);

    /**
     * Original signature :
     * <code>l_ok kernelGetSum(L_KERNEL*, l_float32*)</code>
     */
    int kernelGetSum(L_Kernel kel, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok kernelGetMinMax(L_KERNEL*, l_float32*, l_float32*)</code>
     */
    int kernelGetMinMax(L_Kernel kel, FloatBuffer pmin, FloatBuffer pmax);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelNormalize(L_KERNEL*, l_float32)</code>
     */
    L_Kernel kernelNormalize(L_Kernel kels, float normsum);

    /**
     * Original signature : <code>L_KERNEL* kernelInvert(L_KERNEL*)</code>
     */
    L_Kernel kernelInvert(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_float32** create2dFloatArray(l_int32, l_int32)</code>
     */
    PointerByReference create2dFloatArray(int sy, int sx);

    /**
     * Original signature : <code>L_KERNEL* kernelRead(const char*)</code>
     */
    L_Kernel kernelRead(String fname);
//  
//      /**
//       * Original signature : <code>L_KERNEL* kernelReadStream(FILE*)</code>
//       */
//      L_Kernel kernelReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_ok kernelWrite(const char*, L_KERNEL*)</code>
     */
    int kernelWrite(String fname, L_Kernel kel);

//      /**
//       * Original signature :
//       * <code>l_ok kernelWriteStream(FILE*, L_KERNEL*)</code>
//       */
//      int kernelWriteStream(FILE fp, L_Kernel kel);
    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromString(l_int32, l_int32, l_int32, l_int32, const char*)</code>
     */
    L_Kernel kernelCreateFromString(int h, int w, int cy, int cx, String kdata);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromFile(const char*)</code>
     */
    L_Kernel kernelCreateFromFile(String filename);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromPix(PIX*, l_int32, l_int32)</code>
     */
    L_Kernel kernelCreateFromPix(Pix pix, int cy, int cx);

    /**
     * Original signature :
     * <code>PIX* kernelDisplayInPix(L_KERNEL*, l_int32, l_int32)</code>
     */
    Pix kernelDisplayInPix(L_Kernel kel, int size, int gthick);

    /**
     * Original signature :
     * <code>NUMA* parseStringForNumbers(const char*, const char*)</code>
     */
    Numa parseStringForNumbers(String str, String seps);

    /**
     * Original signature :
     * <code>L_KERNEL* makeFlatKernel(l_int32, l_int32, l_int32, l_int32)</code>
     */
    L_Kernel makeFlatKernel(int height, int width, int cy, int cx);

    /**
     * Original signature :
     * <code>L_KERNEL* makeGaussianKernel(l_int32, l_int32, l_float32, l_float32)</code>
     */
    L_Kernel makeGaussianKernel(int halfheight, int halfwidth, float stdev, float max);

    /**
     * Original signature :
     * <code>l_ok makeGaussianKernelSep(l_int32, l_int32, l_float32, l_float32, L_KERNEL**, L_KERNEL**)</code>
     */
    int makeGaussianKernelSep(int halfheight, int halfwidth, float stdev, float max, PointerByReference pkelx, PointerByReference pkely);

    /**
     * Original signature :
     * <code>L_KERNEL* makeDoGKernel(l_int32, l_int32, l_float32, l_float32)</code>
     */
    L_Kernel makeDoGKernel(int halfheight, int halfwidth, float stdev, float ratio);

    /**
     * Original signature : <code>char* getImagelibVersions()</code>
     */
    Pointer getImagelibVersions();

    /**
     * Original signature : <code>void listDestroy(DLLIST**)</code>
     */
    void listDestroy(PointerByReference phead);

    /**
     * Original signature :
     * <code>l_ok listAddToHead(DLLIST**, void*)</code>
     */
    int listAddToHead(PointerByReference phead, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listAddToTail(DLLIST**, DLLIST**, void*)</code>
     */
    int listAddToTail(PointerByReference phead, PointerByReference ptail, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listInsertBefore(DLLIST**, DLLIST*, void*)</code>
     */
    int listInsertBefore(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listInsertAfter(DLLIST**, DLLIST*, void*)</code>
     */
    int listInsertAfter(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>void* listRemoveElement(DLLIST**, DLLIST*)</code>
     */
    Pointer listRemoveElement(PointerByReference phead, DoubleLinkedList elem);

    /**
     * Original signature : <code>void* listRemoveFromHead(DLLIST**)</code>
     */
    Pointer listRemoveFromHead(PointerByReference phead);

    /**
     * Original signature :
     * <code>void* listRemoveFromTail(DLLIST**, DLLIST**)</code>
     */
    Pointer listRemoveFromTail(PointerByReference phead, PointerByReference ptail);

    /**
     * Original signature :
     * <code>DLLIST* listFindElement(DLLIST*, void*)</code>
     */
    DoubleLinkedList listFindElement(DoubleLinkedList head, Pointer data);

    /**
     * Original signature : <code>DLLIST* listFindTail(DLLIST*)</code>
     */
    DoubleLinkedList listFindTail(DoubleLinkedList head);

    /**
     * Original signature : <code>l_int32 listGetCount(DLLIST*)</code>
     */
    int listGetCount(DoubleLinkedList head);

    /**
     * Original signature : <code>l_ok listReverse(DLLIST**)</code>
     */
    int listReverse(PointerByReference phead);

    /**
     * Original signature :
     * <code>l_ok listJoin(DLLIST**, DLLIST**)</code>
     */
    int listJoin(PointerByReference phead1, PointerByReference phead2);

    /**
     * Original signature : <code>L_AMAP* l_amapCreate(l_int32)</code>
     */
    L_Rbtree l_amapCreate(int keytype);

    /**
     * Original signature :
     * <code>RB_TYPE* l_amapFind(L_AMAP*, RB_TYPE)</code>
     */
    Rb_Type l_amapFind(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature :
     * <code>void l_amapInsert(L_AMAP*, RB_TYPE, RB_TYPE)</code>
     */
    void l_amapInsert(L_Rbtree m, Rb_Type.ByValue key, Rb_Type.ByValue value);

    /**
     * Original signature : <code>void l_amapDelete(L_AMAP*, RB_TYPE)</code>
     */
    void l_amapDelete(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_amapDestroy(L_AMAP**)</code>
     */
    void l_amapDestroy(PointerByReference pm);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetFirst(L_AMAP*)</code>
     */
    L_Rbtree_Node l_amapGetFirst(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetNext(L_AMAP_NODE*)</code>
     */
    L_Rbtree_Node l_amapGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_AMAP_NODE* l_amapGetLast(L_AMAP*)</code>
     */
    L_Rbtree_Node l_amapGetLast(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetPrev(L_AMAP_NODE*)</code>
     */
    L_Rbtree_Node l_amapGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_amapSize(L_AMAP*)</code>
     */
    int l_amapSize(L_Rbtree m);

    /**
     * Original signature : <code>L_ASET* l_asetCreate(l_int32)</code>
     */
    L_Rbtree l_asetCreate(int keytype);

    /**
     * Original signature :
     * <code>RB_TYPE* l_asetFind(L_ASET*, RB_TYPE)</code>
     */
    Rb_Type l_asetFind(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetInsert(L_ASET*, RB_TYPE)</code>
     */
    void l_asetInsert(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDelete(L_ASET*, RB_TYPE)</code>
     */
    void l_asetDelete(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDestroy(L_ASET**)</code>
     */
    void l_asetDestroy(PointerByReference ps);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetFirst(L_ASET*)</code>
     */
    L_Rbtree_Node l_asetGetFirst(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetNext(L_ASET_NODE*)</code>
     */
    L_Rbtree_Node l_asetGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_ASET_NODE* l_asetGetLast(L_ASET*)</code>
     */
    L_Rbtree_Node l_asetGetLast(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetPrev(L_ASET_NODE*)</code>
     */
    L_Rbtree_Node l_asetGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_asetSize(L_ASET*)</code>
     */
    int l_asetSize(L_Rbtree s);

    /**
     * Original signature :
     * <code>PIX* generateBinaryMaze(l_int32, l_int32, l_int32, l_int32, l_float32, l_float32)</code>
     */
    Pix generateBinaryMaze(int w, int h, int xi, int yi, float wallps, float ranis);

    /**
     * Original signature :
     * <code>PTA* pixSearchBinaryMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    Pta pixSearchBinaryMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PTA* pixSearchGrayMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    Pta pixSearchGrayMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixDilate(PIX*, PIX*, SEL*)</code>
     */
    Pix pixDilate(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixErode(PIX*, PIX*, SEL*)</code>
     */
    Pix pixErode(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixHMT(PIX*, PIX*, SEL*)</code>
     */
    Pix pixHMT(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixOpen(PIX*, PIX*, SEL*)</code>
     */
    Pix pixOpen(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixClose(PIX*, PIX*, SEL*)</code>
     */
    Pix pixClose(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixCloseSafe(PIX*, PIX*, SEL*)</code>
     */
    Pix pixCloseSafe(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixOpenGeneralized(PIX*, PIX*, SEL*)</code>
     */
    Pix pixOpenGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixCloseGeneralized(PIX*, PIX*, SEL*)</code>
     */
    Pix pixCloseGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseSafeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_int32 selectComposableSels(l_int32, l_int32, SEL**, SEL**)</code>
     */
    int selectComposableSels(int size, int direction, PointerByReference psel1, PointerByReference psel2);

    /**
     * Original signature :
     * <code>l_ok selectComposableSizes(l_int32, l_int32*, l_int32*)</code>
     */
    int selectComposableSizes(int size, IntBuffer pfactor1, IntBuffer pfactor2);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseSafeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>void resetMorphBoundaryCondition(l_int32)</code>
     */
    void resetMorphBoundaryCondition(int bc);

    /**
     * Original signature :
     * <code>l_uint32 getMorphBorderPixelColor(l_int32, l_int32)</code>
     */
    int getMorphBorderPixelColor(int type, int depth);

    /**
     * Original signature :
     * <code>PIX* pixExtractBoundary(PIX*, l_int32)</code>
     */
    Pix pixExtractBoundary(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceMasked(PIX*, PIX*, const char*, l_int32)</code>
     */
    Pix pixMorphSequenceMasked(Pix pixs, Pix pixm, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    Pix pixMorphSequenceByComponent(Pix pixs, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    Pix pixMorphSequenceByComponent(Pix pixs, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByComponent(PIXA*, const char*, l_int32, l_int32)</code>
     */
    Pixa pixaMorphSequenceByComponent(Pixa pixas, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByRegion(PIX*, PIXA*, const char*, l_int32, l_int32)</code>
     */
    Pixa pixaMorphSequenceByRegion(Pix pixs, Pixa pixam, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixUnionOfMorphOps(PIX*, SELA*, l_int32)</code>
     */
    Pix pixUnionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixIntersectionOfMorphOps(PIX*, SELA*, l_int32)</code>
     */
    Pix pixIntersectionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixSelectiveConnCompFill(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixSelectiveConnCompFill(Pix pixs, int connectivity, int minw, int minh);

    /**
     * Original signature :
     * <code>l_ok pixRemoveMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    int pixRemoveMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int dsize);

    /**
     * Original signature :
     * <code>PIX* pixDisplayMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_uint32, l_float32, l_int32)</code>
     */
    Pix pixDisplayMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int color, float scale, int nlevels);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByMorph(PIXA*, l_int32, l_int32, SEL*, l_int32)</code>
     */
    Pixa pixaExtendByMorph(Pixa pixas, int type, int niters, Pointer sel, int include);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByScaling(PIXA*, NUMA*, l_int32, l_int32)</code>
     */
    Pixa pixaExtendByScaling(Pixa pixas, Numa nasc, int type, int include);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillMorph(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixSeedfillMorph(Pix pixs, Pix pixm, int maxiters, int connectivity);

    /**
     * Original signature :
     * <code>NUMA* pixRunHistogramMorph(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Numa pixRunHistogramMorph(Pix pixs, int runtype, int direction, int maxsize);

    /**
     * Original signature :
     * <code>PIX* pixTophat(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixTophat(Pix pixs, int hsize, int vsize, int type);

    /**
     * Original signature :
     * <code>PIX* pixHDome(PIX*, l_int32, l_int32)</code>
     */
    Pix pixHDome(Pix pixs, int height, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixFastTophat(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixFastTophat(Pix pixs, int xsize, int ysize, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphGradient(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixMorphGradient(Pix pixs, int hsize, int vsize, int smoothing);

    /**
     * Original signature : <code>PTA* pixaCentroids(PIXA*)</code>
     */
    Pta pixaCentroids(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixCentroid(PIX*, l_int32*, l_int32*, l_float32*, l_float32*)</code>
     */
    int pixCentroid(Pix pix, IntBuffer centtab, IntBuffer sumtab, FloatBuffer pxave, FloatBuffer pyave);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixDilateCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixErodeCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixOpenCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixCloseCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_ok getExtendedCompositeParameters(l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int getExtendedCompositeParameters(int size, IntBuffer pn, IntBuffer pextra, IntBuffer pactualsize);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequence(PIX*, const char*, l_int32)</code>
     */
    Pix pixMorphSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequence(PIX*, const char*, l_int32)</code>
     */
    Pix pixMorphCompSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceDwa(PIX*, const char*, l_int32)</code>
     */
    Pix pixMorphSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequenceDwa(PIX*, const char*, l_int32)</code>
     */
    Pix pixMorphCompSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>l_int32 morphSequenceVerify(SARRAY*)</code>
     */
    int morphSequenceVerify(Sarray sa);

    /**
     * Original signature :
     * <code>PIX* pixGrayMorphSequence(PIX*, const char*, l_int32, l_int32)</code>
     */
    Pix pixGrayMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);

    /**
     * Original signature :
     * <code>PIX* pixColorMorphSequence(PIX*, const char*, l_int32, l_int32)</code>
     */
    Pix pixColorMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);
//  
//      /**
//       * Original signature : <code>NUMA* numaCreate(l_int32)</code>
//       */
//      Numa numaCreate(int n);

//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromIArray(l_int32*, l_int32)</code>
//       */
//      Numa numaCreateFromIArray(IntBuffer iarray, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromFArray(l_float32*, l_int32, l_int32)</code>
//       */
//      Numa numaCreateFromFArray(FloatBuffer farray, int size, int copyflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromString(const char*)</code>
//       */
//      Numa numaCreateFromString(String str);
//  
//      /**
//       * Original signature : <code>void numaDestroy(NUMA**)</code>
//       */
//      void numaDestroy(PointerByReference pna);
//  
//      /**
//       * Original signature : <code>NUMA* numaCopy(NUMA*)</code>
//       */
//      Numa numaCopy(Numa na);
//  
//      /**
//       * Original signature : <code>NUMA* numaClone(NUMA*)</code>
//       */
//      Numa numaClone(Numa na);
//  
//      /**
//       * Original signature : <code>l_ok numaEmpty(NUMA*)</code>
//       */
//      int numaEmpty(Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok numaAddNumber(NUMA*, l_float32)</code>
//       */
//      int numaAddNumber(Numa na, float val);
//      /**
//       * Original signature :
//       * <code>l_ok numaInsertNumber(NUMA*, l_int32, l_float32)</code>
//       */
//      int numaInsertNumber(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_ok numaRemoveNumber(NUMA*, l_int32)</code>
//       */
//      int numaRemoveNumber(Numa na, int index);
//      /**
//       * Original signature :
//       * <code>l_ok numaReplaceNumber(NUMA*, l_int32, l_float32)</code>
//       */
//      int numaReplaceNumber(Numa na, int index, float val);
//  
//      /**
//       * Original signature : <code>l_int32 numaGetCount(NUMA*)</code>
//       */
//      int numaGetCount(Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok numaSetCount(NUMA*, l_int32)</code>
//       */
//      int numaSetCount(Numa na, int newcount);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetFValue(NUMA*, l_int32, l_float32*)</code>
//       */
//      int numaGetFValue(Numa na, int index, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetIValue(NUMA*, l_int32, l_int32*)</code>
//       */
//      int numaGetIValue(Numa na, int index, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_ok numaSetValue(NUMA*, l_int32, l_float32)</code>
//       */
//      int numaSetValue(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_ok numaShiftValue(NUMA*, l_int32, l_float32)</code>
//       */
//      int numaShiftValue(Numa na, int index, float diff);
//  
//      /**
//       * Original signature : <code>l_int32* numaGetIArray(NUMA*)</code>
//       */
//      IntByReference numaGetIArray(Numa na);
//      /**
//       * Original signature :
//       * <code>l_float32* numaGetFArray(NUMA*, l_int32)</code>
//       */
//      FloatByReference numaGetFArray(Numa na, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 numaGetRefcount(NUMA*)</code>
//       */
//      int numaGetRefcount(Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok numaChangeRefcount(NUMA*, l_int32)</code>
//       */
//      int numaChangeRefcount(Numa na, int delta);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetParameters(NUMA*, l_float32*, l_float32*)</code>
//       */
//      int numaGetParameters(Numa na, FloatBuffer pstartx, FloatBuffer pdelx);
//      /**
//       * Original signature :
//       * <code>l_ok numaSetParameters(NUMA*, l_float32, l_float32)</code>
//       */
//      int numaSetParameters(Numa na, float startx, float delx);
//      /**
//       * Original signature :
//       * <code>l_ok numaCopyParameters(NUMA*, NUMA*)</code>
//       */
//      int numaCopyParameters(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>SARRAY* numaConvertToSarray(NUMA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Sarray numaConvertToSarray(Numa na, int size1, int size2, int addzeros, int type);
//  
//      /**
//       * Original signature : <code>NUMA* numaRead(const char*)</code>
//       */
//      Numa numaRead(String filename);
//  
//      /**
//       * Original signature : <code>NUMA* numaReadStream(FILE*)</code>
//       */
//      Numa numaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>NUMA* numaReadMem(const l_uint8*, size_t)</code>
     */
    Numa numaReadMem(ByteBuffer data, NativeSize size);

//    /**
//     * Original signature : <code>l_ok numaWriteDebug(const char*, NUMA*)</code>
//     */
//    int numaWriteDebug(String filename, Numa na);

    /**
     * Original signature :
     * <code>l_ok numaWrite(const char*, NUMA*)</code>
     */
    int numaWrite(String filename, Numa na);

//      /**
//       * Original signature :
//       * <code>l_ok numaWriteStream(FILE*, NUMA*)</code>
//       */
//      int numaWriteStream(FILE fp, Numa na);
    /**
     * Original signature :
     * <code>l_ok numaWriteMem(l_uint8**, size_t*, NUMA*)</code>
     */
    int numaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numa na);

    /**
     * Original signature : <code>NUMAA* numaaCreate(l_int32)</code>
     */
    Numaa numaaCreate(int n);

    /**
     * Original signature :
     * <code>NUMAA* numaaCreateFull(l_int32, l_int32)</code>
     */
    Numaa numaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_ok numaaTruncate(NUMAA*)</code>
     */
    int numaaTruncate(Numaa naa);

    /**
     * Original signature : <code>void numaaDestroy(NUMAA**)</code>
     */
    void numaaDestroy(PointerByReference pnaa);

    /**
     * Original signature :
     * <code>l_ok numaaAddNuma(NUMAA*, NUMA*, l_int32)</code>
     */
    int numaaAddNuma(Numaa naa, Numa na, int copyflag);

    /**
     * Original signature : <code>l_int32 numaaGetCount(NUMAA*)</code>
     */
    int numaaGetCount(Numaa naa);

    /**
     * Original signature :
     * <code>l_int32 numaaGetNumaCount(NUMAA*, l_int32)</code>
     */
    int numaaGetNumaCount(Numaa naa, int index);

    /**
     * Original signature : <code>l_int32 numaaGetNumberCount(NUMAA*)</code>
     */
    int numaaGetNumberCount(Numaa naa);
//  
//      /**
//       * Original signature : <code>NUMA** numaaGetPtrArray(NUMAA*)</code>
//       */
//      PointerByReference numaaGetPtrArray(Numaa naa);

//      /**
//       * Original signature :
//       * <code>NUMA* numaaGetNuma(NUMAA*, l_int32, l_int32)</code>
//       */
//      Numa numaaGetNuma(Numaa naa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_ok numaaReplaceNuma(NUMAA*, l_int32, NUMA*)</code>
//       */
//      int numaaReplaceNuma(Numaa naa, int index, Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok numaaGetValue(NUMAA*, l_int32, l_int32, l_float32*, l_int32*)</code>
//       */
//      int numaaGetValue(Numaa naa, int i, int j, FloatBuffer pfval, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_ok numaaAddNumber(NUMAA*, l_int32, l_float32)</code>
//       */
//      int numaaAddNumber(Numaa naa, int index, float val);
//  
//      /**
//       * Original signature : <code>NUMAA* numaaRead(const char*)</code>
//       */
//      Numaa numaaRead(String filename);
//  
//      /**
//       * Original signature : <code>NUMAA* numaaReadStream(FILE*)</code>
//       */
//      Numaa numaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>NUMAA* numaaReadMem(const l_uint8*, size_t)</code>
     */
    Numaa numaaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok numaaWrite(const char*, NUMAA*)</code>
//       */
//      int numaaWrite(String filename, Numaa naa);
//      /**
//       * Original signature :
//       * <code>l_ok numaaWriteStream(FILE*, NUMAA*)</code>
//       */
//      int numaaWriteStream(FILE fp, Numaa naa);
    /**
     * Original signature :
     * <code>l_ok numaaWriteMem(l_uint8**, size_t*, NUMAA*)</code>
     */
    int numaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numaa naa);

//      /**
//       * Original signature :
//       * <code>NUMA* numaArithOp(NUMA*, NUMA*, NUMA*, l_int32)</code>
//       */
//      Numa numaArithOp(Numa nad, Numa na1, Numa na2, int op);
//      /**
//       * Original signature :
//       * <code>NUMA* numaLogicalOp(NUMA*, NUMA*, NUMA*, l_int32)</code>
//       */
//      Numa numaLogicalOp(Numa nad, Numa na1, Numa na2, int op);
//  
//      /**
//       * Original signature : <code>NUMA* numaInvert(NUMA*, NUMA*)</code>
//       */
//      Numa numaInvert(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSimilar(NUMA*, NUMA*, l_float32, l_int32*)</code>
//       */
//      int numaSimilar(Numa na1, Numa na2, float maxdiff, IntBuffer psimilar);
//      /**
//       * Original signature :
//       * <code>l_ok numaAddToNumber(NUMA*, l_int32, l_float32)</code>
//       */
//      int numaAddToNumber(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetMin(NUMA*, l_float32*, l_int32*)</code>
//       */
//      int numaGetMin(Numa na, FloatBuffer pminval, IntBuffer piminloc);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetMax(NUMA*, l_float32*, l_int32*)</code>
//       */
//      int numaGetMax(Numa na, FloatBuffer pmaxval, IntBuffer pimaxloc);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetSum(NUMA*, l_float32*)</code>
//       */
//      int numaGetSum(Numa na, FloatBuffer psum);
//  
//      /**
//       * Original signature : <code>NUMA* numaGetPartialSums(NUMA*)</code>
//       */
//      Numa numaGetPartialSums(Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetSumOnInterval(NUMA*, l_int32, l_int32, l_float32*)</code>
//       */
//      int numaGetSumOnInterval(Numa na, int first, int last, FloatBuffer psum);
//      /**
//       * Original signature :
//       * <code>l_ok numaHasOnlyIntegers(NUMA*, l_int32, l_int32*)</code>
//       */
//      int numaHasOnlyIntegers(Numa na, int maxsamples, IntBuffer pallints);
//  
//      /**
//       * Original signature : <code>NUMA* numaSubsample(NUMA*, l_int32)</code>
//       */
//      Numa numaSubsample(Numa nas, int subfactor);
//  
//      /**
//       * Original signature : <code>NUMA* numaMakeDelta(NUMA*)</code>
//       */
//      Numa numaMakeDelta(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeSequence(l_float32, l_float32, l_int32)</code>
//       */
//      Numa numaMakeSequence(float startval, float increment, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeConstant(l_float32, l_int32)</code>
//       */
//      Numa numaMakeConstant(float val, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeAbsValue(NUMA*, NUMA*)</code>
//       */
//      Numa numaMakeAbsValue(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaAddBorder(NUMA*, l_int32, l_int32, l_float32)</code>
//       */
//      Numa numaAddBorder(Numa nas, int left, int right, float val);
//      /**
//       * Original signature :
//       * <code>NUMA* numaAddSpecifiedBorder(NUMA*, l_int32, l_int32, l_int32)</code>
//       */
//      Numa numaAddSpecifiedBorder(Numa nas, int left, int right, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRemoveBorder(NUMA*, l_int32, l_int32)</code>
//       */
//      Numa numaRemoveBorder(Numa nas, int left, int right);
//    /**
//     * Original signature :
//     * <code>l_ok numaCountNonzeroRuns(NUMA*, l_int32*)</code>
//     */
//    int numaCountNonzeroRuns(Numa na, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetNonzeroRange(NUMA*, l_float32, l_int32*, l_int32*)</code>
//       */
//      int numaGetNonzeroRange(Numa na, float eps, IntBuffer pfirst, IntBuffer plast);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetCountRelativeToZero(NUMA*, l_int32, l_int32*)</code>
//       */
//      int numaGetCountRelativeToZero(Numa na, int type, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>NUMA* numaClipToInterval(NUMA*, l_int32, l_int32)</code>
//       */
//      Numa numaClipToInterval(Numa nas, int first, int last);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeThresholdIndicator(NUMA*, l_float32, l_int32)</code>
//       */
//      Numa numaMakeThresholdIndicator(Numa nas, float thresh, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* numaUniformSampling(NUMA*, l_int32)</code>
//       */
//      Numa numaUniformSampling(Numa nas, int nsamp);
//  
//      /**
//       * Original signature : <code>NUMA* numaReverse(NUMA*, NUMA*)</code>
//       */
//      Numa numaReverse(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaLowPassIntervals(NUMA*, l_float32, l_float32)</code>
//       */
//      Numa numaLowPassIntervals(Numa nas, float thresh, float maxn);
//      /**
//       * Original signature :
//       * <code>NUMA* numaThresholdEdges(NUMA*, l_float32, l_float32, l_float32)</code>
//       */
//      Numa numaThresholdEdges(Numa nas, float thresh1, float thresh2, float maxn);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetSpanValues(NUMA*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int numaGetSpanValues(Numa na, int span, IntBuffer pstart, IntBuffer pend);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetEdgeValues(NUMA*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int numaGetEdgeValues(Numa na, int edge, IntBuffer pstart, IntBuffer pend, IntBuffer psign);
//      /**
//       * Original signature :
//       * <code>l_ok numaInterpolateEqxVal(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32*)</code>
//       */
//      int numaInterpolateEqxVal(float startx, float deltax, Numa nay, int type, float xval, FloatBuffer pyval);
//      /**
//       * Original signature :
//       * <code>l_ok numaInterpolateArbxVal(NUMA*, NUMA*, l_int32, l_float32, l_float32*)</code>
//       */
//      int numaInterpolateArbxVal(Numa nax, Numa nay, int type, float xval, FloatBuffer pyval);
//      /**
//       * Original signature :
//       * <code>l_ok numaInterpolateEqxInterval(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaInterpolateEqxInterval(float startx, float deltax, Numa nasy, int type, float x0, float x1, int npts, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>l_ok numaInterpolateArbxInterval(NUMA*, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaInterpolateArbxInterval(Numa nax, Numa nay, int type, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);
//      /**
//       * Original signature :
//       * <code>l_ok numaFitMax(NUMA*, l_float32*, NUMA*, l_float32*)</code>
//       */
//      int numaFitMax(Numa na, FloatBuffer pmaxval, Numa naloc, FloatBuffer pmaxloc);
//      /**
//       * Original signature :
//       * <code>l_ok numaDifferentiateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaDifferentiateInterval(Numa nax, Numa nay, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);
//      /**
//       * Original signature :
//       * <code>l_ok numaIntegrateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, l_float32*)</code>
//       */
//      int numaIntegrateInterval(Numa nax, Numa nay, float x0, float x1, int npts, FloatBuffer psum);
//      /**
//       * Original signature :
//       * <code>l_ok numaSortGeneral(NUMA*, NUMA**, NUMA**, NUMA**, l_int32, l_int32)</code>
//       */
//      int numaSortGeneral(Numa na, PointerByReference pnasort, PointerByReference pnaindex, PointerByReference pnainvert, int sortorder, int sorttype);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSortAutoSelect(NUMA*, l_int32)</code>
//       */
//      Numa numaSortAutoSelect(Numa nas, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSortIndexAutoSelect(NUMA*, l_int32)</code>
//       */
//      Numa numaSortIndexAutoSelect(Numa nas, int sortorder);
//  
//      /**
//       * Original signature : <code>l_int32 numaChooseSortType(NUMA*)</code>
//       */
//      int numaChooseSortType(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSort(NUMA*, NUMA*, l_int32)</code>
//       */
//      Numa numaSort(Numa naout, Numa nain, int sortorder);
//  
//      /**
//       * Original signature : <code>NUMA* numaBinSort(NUMA*, l_int32)</code>
//       */
//      Numa numaBinSort(Numa nas, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaGetSortIndex(NUMA*, l_int32)</code>
//       */
//      Numa numaGetSortIndex(Numa na, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaGetBinSortIndex(NUMA*, l_int32)</code>
//       */
//      Numa numaGetBinSortIndex(Numa nas, int sortorder);
//  
//      /**
//       * Original signature : <code>NUMA* numaSortByIndex(NUMA*, NUMA*)</code>
//       */
//      Numa numaSortByIndex(Numa nas, Numa naindex);
//      /**
//       * Original signature :
//       * <code>l_int32 numaIsSorted(NUMA*, l_int32, l_int32*)</code>
//       */
//      int numaIsSorted(Numa nas, int sortorder, IntBuffer psorted);
//      /**
//       * Original signature :
//       * <code>l_ok numaSortPair(NUMA*, NUMA*, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaSortPair(Numa nax, Numa nay, int sortorder, PointerByReference pnasx, PointerByReference pnasy);
//  
//      /**
//       * Original signature : <code>NUMA* numaInvertMap(NUMA*)</code>
//       */
//      Numa numaInvertMap(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaPseudorandomSequence(l_int32, l_int32)</code>
//       */
//      Numa numaPseudorandomSequence(int size, int seed);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRandomPermutation(NUMA*, l_int32)</code>
//       */
//      Numa numaRandomPermutation(Numa nas, int seed);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetRankValue(NUMA*, l_float32, NUMA*, l_int32, l_float32*)</code>
//       */
//      int numaGetRankValue(Numa na, float fract, Numa nasort, int usebins, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetMedian(NUMA*, l_float32*)</code>
//       */
//      int numaGetMedian(Numa na, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetBinnedMedian(NUMA*, l_int32*)</code>
//       */
//      int numaGetBinnedMedian(Numa na, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetMode(NUMA*, l_float32*, l_int32*)</code>
//       */
//      int numaGetMode(Numa na, FloatBuffer pval, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>l_ok numaJoin(NUMA*, NUMA*, l_int32, l_int32)</code>
//       */
//      int numaJoin(Numa nad, Numa nas, int istart, int iend);
//      /**
//       * Original signature :
//       * <code>l_ok numaaJoin(NUMAA*, NUMAA*, l_int32, l_int32)</code>
//       */
//      int numaaJoin(Numaa naad, Numaa naas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>NUMA* numaaFlattenToNuma(NUMAA*)</code>
//       */
//      Numa numaaFlattenToNuma(Numaa naa);
//  
//      /**
//       * Original signature : <code>NUMA* numaErode(NUMA*, l_int32)</code>
//       */
//      Numa numaErode(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaDilate(NUMA*, l_int32)</code>
//       */
//      Numa numaDilate(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaOpen(NUMA*, l_int32)</code>
//       */
//      Numa numaOpen(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaClose(NUMA*, l_int32)</code>
//       */
//      Numa numaClose(Numa nas, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaTransform(NUMA*, l_float32, l_float32)</code>
//       */
//      Numa numaTransform(Numa nas, float shift, float scale);
    /**
     * Original signature :
     * <code>l_ok numaSimpleStats(NUMA*, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    int numaSimpleStats(Numa na, int first, int last, FloatBuffer pmean, FloatBuffer pvar, FloatBuffer prvar);

//      /**
//       * Original signature :
//       * <code>l_ok numaWindowedStats(NUMA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int numaWindowedStats(Numa nas, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMean(NUMA*, l_int32)</code>
//       */
//      Numa numaWindowedMean(Numa nas, int wc);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMeanSquare(NUMA*, l_int32)</code>
//       */
//      Numa numaWindowedMeanSquare(Numa nas, int wc);
//      /**
//       * Original signature :
//       * <code>l_ok numaWindowedVariance(NUMA*, NUMA*, NUMA**, NUMA**)</code>
//       */
//      int numaWindowedVariance(Numa nam, Numa nams, PointerByReference pnav, PointerByReference pnarv);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMedian(NUMA*, l_int32)</code>
//       */
//      Numa numaWindowedMedian(Numa nas, int halfwin);
//  
//      /**
//       * Original signature : <code>NUMA* numaConvertToInt(NUMA*)</code>
//       */
//      Numa numaConvertToInt(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogram(NUMA*, l_int32, l_int32*, l_int32*)</code>
//       */
//      Numa numaMakeHistogram(Numa na, int maxbins, IntBuffer pbinsize, IntBuffer pbinstart);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogramAuto(NUMA*, l_int32)</code>
//       */
//      Numa numaMakeHistogramAuto(Numa na, int maxbins);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogramClipped(NUMA*, l_float32, l_float32)</code>
//       */
//      Numa numaMakeHistogramClipped(Numa na, float binsize, float maxsize);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRebinHistogram(NUMA*, l_int32)</code>
//       */
//      Numa numaRebinHistogram(Numa nas, int newsize);
//      /**
//       * Original signature :
//       * <code>NUMA* numaNormalizeHistogram(NUMA*, l_float32)</code>
//       */
//      Numa numaNormalizeHistogram(Numa nas, float tsum);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code>
//       */
//      int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatBuffer pmin, FloatBuffer pmax, FloatBuffer pmean, FloatBuffer pvariance, FloatBuffer pmedian, float rank, FloatBuffer prval, PointerByReference phisto);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code>
//       */
//      int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatByReference pmin, FloatByReference pmax, FloatByReference pmean, FloatByReference pvariance, FloatByReference pmedian, float rank, FloatByReference prval, PointerByReference phisto);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetHistogramStats(NUMA*, l_float32, l_float32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int numaGetHistogramStats(Numa nahisto, float startx, float deltax, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetHistogramStatsOnInterval(NUMA*, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int numaGetHistogramStatsOnInterval(Numa nahisto, float startx, float deltax, int ifirst, int ilast, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);
//      /**
//       * Original signature :
//       * <code>l_ok numaMakeRankFromHistogram(l_float32, l_float32, NUMA*, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaMakeRankFromHistogram(float startx, float deltax, Numa nasy, int npts, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>l_ok numaHistogramGetRankFromVal(NUMA*, l_float32, l_float32*)</code>
//       */
//      int numaHistogramGetRankFromVal(Numa na, float rval, FloatBuffer prank);
//      /**
//       * Original signature :
//       * <code>l_ok numaHistogramGetValFromRank(NUMA*, l_float32, l_float32*)</code>
//       */
//      int numaHistogramGetValFromRank(Numa na, float rank, FloatBuffer prval);
//      /**
//       * Original signature :
//       * <code>l_ok numaDiscretizeRankAndIntensity(NUMA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int numaDiscretizeRankAndIntensity(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam, PointerByReference pnar, PointerByReference pnabb);
//      /**
//       * Original signature :
//       * <code>l_ok numaGetRankBinValues(NUMA*, l_int32, NUMA**, NUMA**)</code>
//       */
//      int numaGetRankBinValues(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam);
//      /**
//       * Original signature :
//       * <code>l_ok numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int numaSplitDistribution(Numa na, float scorefract, IntBuffer psplitindex, FloatBuffer pave1, FloatBuffer pave2, FloatBuffer pnum1, FloatBuffer pnum2, PointerByReference pnascore);
//      /**
//       * Original signature :
//       * <code>l_ok numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int numaSplitDistribution(Numa na, float scorefract, IntByReference psplitindex, FloatByReference pave1, FloatByReference pave2, FloatByReference pnum1, FloatByReference pnum2, PointerByReference pnascore);
    /**
     * Original signature :
     * <code>l_ok grayHistogramsToEMD(NUMAA*, NUMAA*, NUMA**)</code>
     */
    int grayHistogramsToEMD(Numaa naa1, Numaa naa2, PointerByReference pnad);

//      /**
//       * Original signature :
//       * <code>l_ok numaEarthMoverDistance(NUMA*, NUMA*, l_float32*)</code>
//       */
//      int numaEarthMoverDistance(Numa na1, Numa na2, FloatBuffer pdist);
    /**
     * Original signature :
     * <code>l_ok grayInterHistogramStats(NUMAA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    int grayInterHistogramStats(Numaa naa, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);

//      /**
//       * Original signature :
//       * <code>NUMA* numaFindPeaks(NUMA*, l_int32, l_float32, l_float32)</code>
//       */
//      Numa numaFindPeaks(Numa nas, int nmax, float fract1, float fract2);
//      /**
//       * Original signature :
//       * <code>NUMA* numaFindExtrema(NUMA*, l_float32, NUMA**)</code>
//       */
//      Numa numaFindExtrema(Numa nas, float delta, PointerByReference pnav);
//      /**
//       * Original signature :
//       * <code>l_ok numaCountReversals(NUMA*, l_float32, l_int32*, l_float32*)</code>
//       */
//      int numaCountReversals(Numa nas, float minreversal, IntBuffer pnr, FloatBuffer pnrpl);
//      /**
//       * Original signature :
//       * <code>l_ok numaSelectCrossingThreshold(NUMA*, NUMA*, l_float32, l_float32*)</code>
//       */
//      int numaSelectCrossingThreshold(Numa nax, Numa nay, float estthresh, FloatBuffer pbestthresh);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCrossingsByThreshold(NUMA*, NUMA*, l_float32)</code>
//       */
//      Numa numaCrossingsByThreshold(Numa nax, Numa nay, float thresh);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCrossingsByPeaks(NUMA*, NUMA*, l_float32)</code>
//       */
//      Numa numaCrossingsByPeaks(Numa nax, Numa nay, float delta);
//      /**
//       * Original signature :
//       * <code>l_ok numaEvalBestHaarParameters(NUMA*, l_float32, l_int32, l_int32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int numaEvalBestHaarParameters(Numa nas, float relweight, int nwidth, int nshift, float minwidth, float maxwidth, FloatBuffer pbestwidth, FloatBuffer pbestshift, FloatBuffer pbestscore);
//      /**
//       * Original signature :
//       * <code>l_ok numaEvalHaarSum(NUMA*, l_float32, l_float32, l_float32, l_float32*)</code>
//       */
//      int numaEvalHaarSum(Numa nas, float width, float shift, float relweight, FloatBuffer pscore);
    /**
     * Original signature :
     * <code>NUMA* genConstrainedNumaInRange(l_int32, l_int32, l_int32, l_int32)</code>
     */
    Numa genConstrainedNumaInRange(int first, int last, int nmax, int use_pairs);

    /**
     * Original signature :
     * <code>l_ok pixGetRegionsBinary(PIX*, PIX**, PIX**, PIX**, PIXA*)</code>
     */
    int pixGetRegionsBinary(Pix pixs, PointerByReference ppixhm, PointerByReference ppixtm, PointerByReference ppixtb, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code>
     */
    Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code>
     */
    Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntBuffer ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntByReference ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextblockMask(PIX*, PIX*, PIXA*)</code>
     */
    Pix pixGenTextblockMask(Pix pixs, Pix pixvws, Pixa pixadb);

    /**
     * Original signature : <code>BOX* pixFindPageForeground(PIX*, l_int32, l_int32, l_int32, l_int32, PIXAC*)</code>
     */
    Box pixFindPageForeground(Pix pixs, int threshold, int mindist, int erasedist, int showmorph, PixaComp pixac);

    /**
     * Original signature :
     * <code>l_ok pixSplitIntoCharacters(PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**)</code>
     */
    int pixSplitIntoCharacters(Pix pixs, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentWithProfile(PIX*, l_int32, l_int32, PIX**)</code>
     */
    Boxa pixSplitComponentWithProfile(Pix pixs, int delta, int mindel, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>PIXA* pixExtractTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    Pixa pixExtractTextlines(Pix pixs, int maxw, int maxh, int minw, int minh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIXA* pixExtractRawTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    Pixa pixExtractRawTextlines(Pix pixs, int maxw, int maxh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixCountTextColumns(PIX*, l_float32, l_float32, l_float32, l_int32*, PIXA*)</code>
     */
    int pixCountTextColumns(Pix pixs, float deltafract, float peakfract, float clipfract, IntBuffer pncols, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfText(PIX*, BOX*, l_int32*, PIXA*)</code>
     */
    int pixDecideIfText(Pix pixs, Box box, IntBuffer pistext, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixFindThreshFgExtent(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    int pixFindThreshFgExtent(Pix pixs, int thresh, IntBuffer ptop, IntBuffer pbot);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfTable(PIX*, BOX*, l_int32*, PIXA*)</code>
     */
    int pixDecideIfTable(Pix pixs, Box box, IntBuffer pistable, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixPrepare1bpp(PIX*, BOX*, l_float32, l_int32)</code>
     */
    Pix pixPrepare1bpp(Pix pixs, Box box, float cropfract, int outres);

    /**
     * Original signature :
     * <code>l_ok pixEstimateBackground(PIX*, l_int32, l_float32, l_int32*)</code>
     */
    int pixEstimateBackground(Pix pixs, int darkthresh, float edgecrop, IntBuffer pbg);

    /**
     * Original signature :
     * <code>l_ok pixFindLargeRectangles(PIX*, l_int32, l_int32, BOXA**, PIX**)</code>
     */
    int pixFindLargeRectangles(Pix pixs, int polarity, int nrect, PointerByReference pboxa, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixFindLargestRectangle(PIX*, l_int32, BOX**, PIX**)</code>
     */
    int pixFindLargestRectangle(Pix pixs, int polarity, PointerByReference pbox, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixSetSelectCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetSelectCmap(Pix pixs, Box box, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayRegionsCmap(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixColorGrayRegionsCmap(Pix pixs, Boxa boxa, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixColorGrayCmap(Pix pixs, Box box, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixColorGrayMaskedCmap(Pix pixs, Pix pixm, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok addColorizedGrayToCmap(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, NUMA**)</code>
     */
    int addColorizedGrayToCmap(PixColormap cmap, int type, int rval, int gval, int bval, PointerByReference pna);

    /**
     * Original signature :
     * <code>l_ok pixSetSelectMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetSelectMaskedCmap(Pix pixs, Pix pixm, int x, int y, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixSetMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetMaskedCmap(Pix pixs, Pix pixm, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>char* parseForProtos(const char*, const char*)</code>
     */
    Pointer parseForProtos(String filein, String prestring);

    /**
     * Original signature :
     * <code>BOXA* boxaGetWhiteblocks(BOXA*, BOX*, l_int32, l_int32, l_float32, l_int32, l_float32, l_int32)</code>
     */
    Boxa boxaGetWhiteblocks(Boxa boxas, Box box, int sortflag, int maxboxes, float maxoverlap, int maxperim, float fract, int maxpops);

    /**
     * Original signature :
     * <code>BOXA* boxaPruneSortedOnOverlap(BOXA*, l_float32)</code>
     */
    Boxa boxaPruneSortedOnOverlap(Boxa boxas, float maxoverlap);

    /**
     * Original signature :
     * <code>l_ok convertFilesToPdf(const char*, const char*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    int convertFilesToPdf(String dirname, String substr, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertFilesToPdf(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    int saConvertFilesToPdf(Sarray sa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertFilesToPdfData(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
     */
    int saConvertFilesToPdfData(Sarray sa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok selectDefaultPdfEncoding(PIX*, l_int32*)</code>
     */
    int selectDefaultPdfEncoding(Pix pix, IntBuffer ptype);

    /**
     * Original signature :
     * <code>l_ok convertUnscaledFilesToPdf(const char*, const char*, const char*, const char*)</code>
     */
    int convertUnscaledFilesToPdf(String dirname, String substr, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertUnscaledFilesToPdf(SARRAY*, const char*, const char*)</code>
     */
    int saConvertUnscaledFilesToPdf(Sarray sa, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertUnscaledFilesToPdfData(SARRAY*, const char*, l_uint8**, size_t*)</code>
     */
    int saConvertUnscaledFilesToPdfData(Sarray sa, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertUnscaledToPdfData(const char*, const char*, l_uint8**, size_t*)</code>
     */
    int convertUnscaledToPdfData(String fname, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixaConvertToPdf(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    int pixaConvertToPdf(Pixa pixa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixaConvertToPdfData(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
     */
    int pixaConvertToPdfData(Pixa pixa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertToPdf(String filein, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertToPdf(Pointer filein, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertImageDataToPdf(ByteBuffer imdata, NativeSize size, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertImageDataToPdf(Pointer imdata, NativeSize size, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertToPdfData(String filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertToPdfData(Pointer filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertImageDataToPdfData(ByteBuffer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int convertImageDataToPdfData(Pointer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int pixConvertToPdf(Pix pix, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int pixConvertToPdf(Pix pix, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamPdf(FILE*, PIX*, l_int32, const char*)</code>
//       */
//      int pixWriteStreamPdf(FILE fp, Pix pix, int res, String title);
    /**
     * Original signature :
     * <code>l_ok pixWriteMemPdf(l_uint8**, size_t*, PIX*, l_int32, const char*)</code>
     */
    int pixWriteMemPdf(PointerByReference pdata, NativeSizeByReference pnbytes, Pix pix, int res, String title);

    /**
     * Original signature :
     * <code>l_ok convertSegmentedFilesToPdf(const char*, const char*, l_int32, l_int32, l_int32, BOXAA*, l_int32, l_float32, const char*, const char*)</code>
     */
    int convertSegmentedFilesToPdf(String dirname, String substr, int res, int type, int thresh, Boxaa baa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>BOXAA* convertNumberedMasksToBoxaa(const char*, const char*, l_int32, l_int32)</code>
     */
    Boxaa convertNumberedMasksToBoxaa(String dirname, String substr, int numpre, int numpost);

    /**
     * Original signature :
     * <code>l_ok convertToPdfSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code>
     */
    int convertToPdfSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code>
     */
    int pixConvertToPdfSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertToPdfDataSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code>
     */
    int convertToPdfDataSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfDataSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code>
     */
    int pixConvertToPdfDataSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok concatenatePdf(const char*, const char*, const char*)</code>
     */
    int concatenatePdf(String dirname, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConcatenatePdf(SARRAY*, const char*)</code>
     */
    int saConcatenatePdf(Sarray sa, String fileout);

    /**
     * Original signature :
     * <code>l_ok ptraConcatenatePdf(L_PTRA*, const char*)</code>
     */
    int ptraConcatenatePdf(L_Ptra pa, String fileout);

    /**
     * Original signature :
     * <code>l_ok concatenatePdfToData(const char*, const char*, l_uint8**, size_t*)</code>
     */
    int concatenatePdfToData(String dirname, String substr, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok saConcatenatePdfToData(SARRAY*, l_uint8**, size_t*)</code>
     */
    int saConcatenatePdfToData(Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok ptraConcatenatePdfToData(L_PTRA*, SARRAY*, l_uint8**, size_t*)</code>
     */
    int ptraConcatenatePdfToData(L_Ptra pa_data, Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertTiffMultipageToPdf(const char*, const char*)</code>
     */
    int convertTiffMultipageToPdf(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code>
     */
    int l_generateCIDataForPdf(String fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code>
     */
    int l_generateCIDataForPdf(Pointer fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateDataPdf(const char*, PIX*)</code>
     */
    L_Compressed_Data l_generateFlateDataPdf(String fname, Pix pixs);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateJpegData(const char*, l_int32)</code>
     */
    L_Compressed_Data l_generateJpegData(String fname, int ascii85flag);
    
//    /**
//     * Original signature : <code>L_COMP_DATA* l_generateJpegDataMem(l_uint8*, size_t, l_int32)</code>
//     */
//    L_Compressed_Data l_generateJpegDataMem(ByteBuffer data, NativeSize nbytes, int ascii85flag);

    /**
     * Original signature :
     * <code>l_ok l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    int l_generateCIData(String fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    int l_generateCIData(Pointer fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok pixGenerateCIData(PIX*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    int pixGenerateCIData(Pix pixs, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateData(const char*, l_int32)</code>
     */
    L_Compressed_Data l_generateFlateData(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateG4Data(const char*, l_int32)</code>
     */
    L_Compressed_Data l_generateG4Data(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>l_ok cidConvertToPdfData(L_COMP_DATA*, const char*, l_uint8**, size_t*)</code>
     */
    int cidConvertToPdfData(L_Compressed_Data cid, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature : <code>void l_CIDataDestroy(L_COMP_DATA**)</code>
     */
    void l_CIDataDestroy(PointerByReference pcid);

    /**
     * Original signature : <code>void l_pdfSetG4ImageMask(l_int32)</code>
     */
    void l_pdfSetG4ImageMask(int flag);

    /**
     * Original signature :
     * <code>void l_pdfSetDateAndVersion(l_int32)</code>
     */
    void l_pdfSetDateAndVersion(int flag);

    /**
     * Original signature :
     * <code>void setPixMemoryManager(alloc_fn, dealloc_fn)</code>
     */
    void setPixMemoryManager(alloc_fn allocator, dealloc_fn deallocator);

    /**
     * Original signature :
     * <code>PIX* pixCreate(l_int32, l_int32, l_int32)</code>
     */
    Pix pixCreate(int width, int height, int depth);

    /**
     * Original signature :
     * <code>PIX* pixCreateNoInit(l_int32, l_int32, l_int32)</code>
     */
    Pix pixCreateNoInit(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixCreateTemplate(PIX*)</code>
     */
    Pix pixCreateTemplate(Pix pixs);

    /**
     * Original signature : <code>PIX* pixCreateTemplateNoInit(PIX*)</code>
     */
    Pix pixCreateTemplateNoInit(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixCreateHeader(l_int32, l_int32, l_int32)</code>
     */
    Pix pixCreateHeader(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixClone(PIX*)</code>
     */
    Pix pixClone(Pix pixs);

    /**
     * Original signature : <code>void pixDestroy(PIX**)</code>
     */
    void pixDestroy(PointerByReference ppix);

    /**
     * Original signature : <code>PIX* pixCopy(PIX*, PIX*)</code>
     */
    Pix pixCopy(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixResizeImageData(PIX*, PIX*)</code>
     */
    int pixResizeImageData(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_ok pixCopyColormap(PIX*, PIX*)</code>
     */
    int pixCopyColormap(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixSizesEqual(PIX*, PIX*)</code>
     */
    int pixSizesEqual(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_ok pixTransferAllData(PIX*, PIX**, l_int32, l_int32)</code>
     */
    int pixTransferAllData(Pix pixd, PointerByReference ppixs, int copytext, int copyformat);

    /**
     * Original signature :
     * <code>l_ok pixSwapAndDestroy(PIX**, PIX**)</code>
     */
    int pixSwapAndDestroy(PointerByReference ppixd, PointerByReference ppixs);

    /**
     * Original signature : <code>l_int32 pixGetWidth(PIX*)</code>
     */
    int pixGetWidth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWidth(PIX*, l_int32)</code>
     */
    int pixSetWidth(Pix pix, int width);

    /**
     * Original signature : <code>l_int32 pixGetHeight(PIX*)</code>
     */
    int pixGetHeight(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetHeight(PIX*, l_int32)</code>
     */
    int pixSetHeight(Pix pix, int height);

    /**
     * Original signature : <code>l_int32 pixGetDepth(PIX*)</code>
     */
    int pixGetDepth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetDepth(PIX*, l_int32)</code>
     */
    int pixSetDepth(Pix pix, int depth);

    /**
     * Original signature :
     * <code>l_ok pixGetDimensions(PIX*, l_int32*, l_int32*, l_int32*)</code>
     */
    int pixGetDimensions(Pix pix, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature :
     * <code>l_ok pixSetDimensions(PIX*, l_int32, l_int32, l_int32)</code>
     */
    int pixSetDimensions(Pix pix, int w, int h, int d);

    /**
     * Original signature :
     * <code>l_ok pixCopyDimensions(PIX*, PIX*)</code>
     */
    int pixCopyDimensions(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetSpp(PIX*)</code>
     */
    int pixGetSpp(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetSpp(PIX*, l_int32)</code>
     */
    int pixSetSpp(Pix pix, int spp);

    /**
     * Original signature : <code>l_ok pixCopySpp(PIX*, PIX*)</code>
     */
    int pixCopySpp(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetWpl(PIX*)</code>
     */
    int pixGetWpl(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWpl(PIX*, l_int32)</code>
     */
    int pixSetWpl(Pix pix, int wpl);

    /**
     * Original signature : <code>l_int32 pixGetRefcount(PIX*)</code>
     */
    int pixGetRefcount(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixChangeRefcount(PIX*, l_int32)</code>
     */
    int pixChangeRefcount(Pix pix, int delta);

    /**
     * Original signature : <code>l_int32 pixGetXRes(PIX*)</code>
     */
    int pixGetXRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetXRes(PIX*, l_int32)</code>
     */
    int pixSetXRes(Pix pix, int res);

    /**
     * Original signature : <code>l_int32 pixGetYRes(PIX*)</code>
     */
    int pixGetYRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetYRes(PIX*, l_int32)</code>
     */
    int pixSetYRes(Pix pix, int res);

    /**
     * Original signature :
     * <code>l_ok pixGetResolution(PIX*, l_int32*, l_int32*)</code>
     */
    int pixGetResolution(Pix pix, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok pixSetResolution(PIX*, l_int32, l_int32)</code>
     */
    int pixSetResolution(Pix pix, int xres, int yres);

    /**
     * Original signature :
     * <code>l_int32 pixCopyResolution(PIX*, PIX*)</code>
     */
    int pixCopyResolution(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixScaleResolution(PIX*, l_float32, l_float32)</code>
     */
    int pixScaleResolution(Pix pix, float xscale, float yscale);

    /**
     * Original signature : <code>l_int32 pixGetInputFormat(PIX*)</code>
     */
    int pixGetInputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetInputFormat(PIX*, l_int32)</code>
     */
    int pixSetInputFormat(Pix pix, int informat);

    /**
     * Original signature :
     * <code>l_int32 pixCopyInputFormat(PIX*, PIX*)</code>
     */
    int pixCopyInputFormat(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixSetSpecial(PIX*, l_int32)</code>
     */
    int pixSetSpecial(Pix pix, int special);

    /**
     * Original signature : <code>char* pixGetText(PIX*)</code>
     */
    Pointer pixGetText(Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixSetText(PIX*, const char*)</code>
     */
    int pixSetText(Pix pix, String textstring);

    /**
     * Original signature :
     * <code>l_ok pixAddText(PIX*, const char*)</code>
     */
    int pixAddText(Pix pix, String textstring);

    /**
     * Original signature : <code>l_int32 pixCopyText(PIX*, PIX*)</code>
     */
    int pixCopyText(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIXCMAP* pixGetColormap(PIX*)</code>
     */
    PixColormap pixGetColormap(Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixSetColormap(PIX*, PIXCMAP*)</code>
     */
    int pixSetColormap(Pix pix, PixColormap colormap);

    /**
     * Original signature : <code>l_ok pixDestroyColormap(PIX*)</code>
     */
    int pixDestroyColormap(Pix pix);

    /**
     * Original signature : <code>l_uint32* pixGetData(PIX*)</code>
     */
    IntByReference pixGetData(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetData(PIX*, l_uint32*)</code>
     */
    int pixSetData(Pix pix, IntBuffer data);

    /**
     * Original signature : <code>l_uint32* pixExtractData(PIX*)</code>
     */
    IntByReference pixExtractData(Pix pixs);

    /**
     * Original signature : <code>l_int32 pixFreeData(PIX*)</code>
     */
    int pixFreeData(Pix pix);

    /**
     * Original signature :
     * <code>void** pixGetLinePtrs(PIX*, l_int32*)</code>
     */
    PointerByReference pixGetLinePtrs(Pix pix, IntBuffer psize);

//      /**
//       * Original signature :
//       * <code>l_ok pixPrintStreamInfo(FILE*, PIX*, const char*)</code>
//       */
//      int pixPrintStreamInfo(FILE fp, Pix pix, String text);
    /**
     * Original signature :
     * <code>l_ok pixGetPixel(PIX*, l_int32, l_int32, l_uint32*)</code>
     */
    int pixGetPixel(Pix pix, int x, int y, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_ok pixSetPixel(PIX*, l_int32, l_int32, l_uint32)</code>
     */
    int pixSetPixel(Pix pix, int x, int y, int val);

    /**
     * Original signature :
     * <code>l_ok pixGetRGBPixel(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    int pixGetRGBPixel(Pix pix, int x, int y, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixSetRGBPixel(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetRGBPixel(Pix pix, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixGetRandomPixel(PIX*, l_uint32*, l_int32*, l_int32*)</code>
     */
    int pixGetRandomPixel(Pix pix, IntBuffer pval, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>l_ok pixClearPixel(PIX*, l_int32, l_int32)</code>
     */
    int pixClearPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixFlipPixel(PIX*, l_int32, l_int32)</code>
     */
    int pixFlipPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>void setPixelLow(l_uint32*, l_int32, l_int32, l_uint32)</code>
     */
    void setPixelLow(IntBuffer line, int x, int depth, int val);

    /**
     * Original signature :
     * <code>l_ok pixGetBlackOrWhiteVal(PIX*, l_int32, l_uint32*)</code>
     */
    int pixGetBlackOrWhiteVal(Pix pixs, int op, IntBuffer pval);

    /**
     * Original signature : <code>l_ok pixClearAll(PIX*)</code>
     */
    int pixClearAll(Pix pix);

    /**
     * Original signature : <code>l_ok pixSetAll(PIX*)</code>
     */
    int pixSetAll(Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixSetAllGray(PIX*, l_int32)</code>
     */
    int pixSetAllGray(Pix pix, int grayval);

    /**
     * Original signature :
     * <code>l_ok pixSetAllArbitrary(PIX*, l_uint32)</code>
     */
    int pixSetAllArbitrary(Pix pix, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetBlackOrWhite(PIX*, l_int32)</code>
     */
    int pixSetBlackOrWhite(Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_ok pixSetComponentArbitrary(PIX*, l_int32, l_int32)</code>
     */
    int pixSetComponentArbitrary(Pix pix, int comp, int val);

    /**
     * Original signature : <code>l_ok pixClearInRect(PIX*, BOX*)</code>
     */
    int pixClearInRect(Pix pix, Box box);

    /**
     * Original signature : <code>l_ok pixSetInRect(PIX*, BOX*)</code>
     */
    int pixSetInRect(Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_ok pixSetInRectArbitrary(PIX*, BOX*, l_uint32)</code>
     */
    int pixSetInRectArbitrary(Pix pix, Box box, int val);

    /**
     * Original signature :
     * <code>l_ok pixBlendInRect(PIX*, BOX*, l_uint32, l_float32)</code>
     */
    int pixBlendInRect(Pix pixs, Box box, int val, float fract);

    /**
     * Original signature :
     * <code>l_ok pixSetPadBits(PIX*, l_int32)</code>
     */
    int pixSetPadBits(Pix pix, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetPadBitsBand(PIX*, l_int32, l_int32, l_int32)</code>
     */
    int pixSetPadBitsBand(Pix pix, int by, int bh, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetOrClearBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetOrClearBorder(Pix pixs, int left, int right, int top, int bot, int op);

    /**
     * Original signature :
     * <code>l_ok pixSetBorderVal(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    int pixSetBorderVal(Pix pixs, int left, int right, int top, int bot, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetBorderRingVal(PIX*, l_int32, l_uint32)</code>
     */
    int pixSetBorderRingVal(Pix pixs, int dist, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSetMirroredBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixCopyBorder(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixCopyBorder(Pix pixd, Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddBorder(PIX*, l_int32, l_uint32)</code>
     */
    Pix pixAddBorder(Pix pixs, int npix, int val);

    /**
     * Original signature :
     * <code>PIX* pixAddBlackOrWhiteBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixAddBlackOrWhiteBorder(Pix pixs, int left, int right, int top, int bot, int op);

//      /**
//       * Original signature :
//       * <code>PIX* pixAddBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      Pix pixAddBorderGeneral(Pix pixs, int left, int right, int top, int bot, int val);
//  
//      /**
//       * Original signature : <code>PIX* pixRemoveBorder(PIX*, l_int32)</code>
//       */
//      Pix pixRemoveBorder(Pix pixs, int npix);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixRemoveBorderGeneral(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderToSize(PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixRemoveBorderToSize(Pix pixs, int wd, int hd);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixAddMirroredBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddRepeatedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixAddRepeatedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddMixedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixAddMixedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddContinuedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixAddContinuedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>l_ok pixShiftAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code>
//       */
//      int pixShiftAndTransferAlpha(Pix pixd, Pix pixs, float shiftx, float shifty);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayLayersRGBA(PIX*, l_uint32, l_int32)</code>
//       */
//      Pix pixDisplayLayersRGBA(Pix pixs, int val, int maxw);
//      /**
//       * Original signature :
//       * <code>PIX* pixCreateRGBImage(PIX*, PIX*, PIX*)</code>
//       */
//      Pix pixCreateRGBImage(Pix pixr, Pix pixg, Pix pixb);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetRGBComponent(PIX*, l_int32)</code>
//       */
//      Pix pixGetRGBComponent(Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_ok pixSetRGBComponent(PIX*, PIX*, l_int32)</code>
//       */
//      int pixSetRGBComponent(Pix pixd, Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetRGBComponentCmap(PIX*, l_int32)</code>
//       */
//      Pix pixGetRGBComponentCmap(Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_ok pixCopyRGBComponent(PIX*, PIX*, l_int32)</code>
//       */
//      int pixCopyRGBComponent(Pix pixd, Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_ok composeRGBPixel(l_int32, l_int32, l_int32, l_uint32*)</code>
//       */
//      int composeRGBPixel(int rval, int gval, int bval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>l_ok composeRGBAPixel(l_int32, l_int32, l_int32, l_int32, l_uint32*)</code>
//       */
//      int composeRGBAPixel(int rval, int gval, int bval, int aval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>void extractRGBValues(l_uint32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      void extractRGBValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);
//      /**
//       * Original signature :
//       * <code>void extractRGBAValues(l_uint32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      void extractRGBAValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);
//      /**
//       * Original signature :
//       * <code>l_int32 extractMinMaxComponent(l_uint32, l_int32)</code>
//       */
//      int extractMinMaxComponent(int pixel, int type);
    /**
     * Original signature :
     * <code>l_ok pixGetRGBLine(PIX*, l_int32, l_uint8*, l_uint8*, l_uint8*)</code>
     */
    int pixGetRGBLine(Pix pixs, int row, ByteBuffer bufr, ByteBuffer bufg, ByteBuffer bufb);

    /**
     * Original signature : <code>PIX* pixEndianByteSwapNew(PIX*)</code>
     */
    Pix pixEndianByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_ok pixEndianByteSwap(PIX*)</code>
     */
    int pixEndianByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 lineEndianByteSwap(l_uint32*, l_uint32*, l_int32)</code>
     */
    int lineEndianByteSwap(IntBuffer datad, IntBuffer datas, int wpl);

    /**
     * Original signature : <code>PIX* pixEndianTwoByteSwapNew(PIX*)</code>
     */
    Pix pixEndianTwoByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_ok pixEndianTwoByteSwap(PIX*)</code>
     */
    int pixEndianTwoByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixGetRasterData(PIX*, l_uint8**, size_t*)</code>
     */
    int pixGetRasterData(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixAlphaIsOpaque(PIX*, l_int32*)</code>
     */
    int pixAlphaIsOpaque(Pix pix, IntBuffer popaque);

//      /**
//       * Original signature :
//       * <code>l_uint8** pixSetupByteProcessing(PIX*, l_int32*, l_int32*)</code>
//       */
//      PointerByReference pixSetupByteProcessing(Pix pix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_ok pixCleanupByteProcessing(PIX*, l_uint8**)</code>
//       */
//      int pixCleanupByteProcessing(Pix pix, PointerByReference lineptrs);
//      /**
//       * Original signature :
//       * <code>void l_setAlphaMaskBorder(l_float32, l_float32)</code>
//       */
//      void l_setAlphaMaskBorder(float val1, float val2);
    /**
     * Original signature :
     * <code>l_ok pixSetMasked(PIX*, PIX*, l_uint32)</code>
     */
    int pixSetMasked(Pix pixd, Pix pixm, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetMaskedGeneral(PIX*, PIX*, l_uint32, l_int32, l_int32)</code>
     */
    int pixSetMaskedGeneral(Pix pixd, Pix pixm, int val, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixCombineMasked(PIX*, PIX*, PIX*)</code>
     */
    int pixCombineMasked(Pix pixd, Pix pixs, Pix pixm);

    /**
     * Original signature :
     * <code>l_ok pixCombineMaskedGeneral(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    int pixCombineMaskedGeneral(Pix pixd, Pix pixs, Pix pixm, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixPaintThroughMask(PIX*, PIX*, l_int32, l_int32, l_uint32)</code>
     */
    int pixPaintThroughMask(Pix pixd, Pix pixm, int x, int y, int val);

    /**
     * Original signature :
     * <code>l_ok pixPaintSelfThroughMask(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixPaintSelfThroughMask(Pix pixd, Pix pixm, int x, int y, int searchdir, int mindist, int tilesize, int ntiles, int distblend);

    /**
     * Original signature :
     * <code>PIX* pixMakeMaskFromVal(PIX*, l_int32)</code>
     */
    Pix pixMakeMaskFromVal(Pix pixs, int val);

    /**
     * Original signature :
     * <code>PIX* pixMakeMaskFromLUT(PIX*, l_int32*)</code>
     */
    Pix pixMakeMaskFromLUT(Pix pixs, IntBuffer tab);

    /**
     * Original signature :
     * <code>PIX* pixMakeArbMaskFromRGB(PIX*, l_float32, l_float32, l_float32, l_float32)</code>
     */
    Pix pixMakeArbMaskFromRGB(Pix pixs, float rc, float gc, float bc, float thresh);

    /**
     * Original signature :
     * <code>PIX* pixSetUnderTransparency(PIX*, l_uint32, l_int32)</code>
     */
    Pix pixSetUnderTransparency(Pix pixs, int val, int debug);

    /**
     * Original signature :
     * <code>PIX* pixMakeAlphaFromMask(PIX*, l_int32, BOX**)</code>
     */
    Pix pixMakeAlphaFromMask(Pix pixs, int dist, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok pixGetColorNearMaskBoundary(PIX*, PIX*, BOX*, l_int32, l_uint32*, l_int32)</code>
     */
    int pixGetColorNearMaskBoundary(Pix pixs, Pix pixm, Box box, int dist, IntBuffer pval, int debug);

    /**
     * Original signature : <code>PIX* pixInvert(PIX*, PIX*)</code>
     */
    Pix pixInvert(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixOr(PIX*, PIX*, PIX*)</code>
     */
    Pix pixOr(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAnd(PIX*, PIX*, PIX*)</code>
     */
    Pix pixAnd(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixXor(PIX*, PIX*, PIX*)</code>
     */
    Pix pixXor(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixSubtract(PIX*, PIX*, PIX*)</code>
     */
    Pix pixSubtract(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>l_ok pixZero(PIX*, l_int32*)</code>
     */
    int pixZero(Pix pix, IntBuffer pempty);

    /**
     * Original signature :
     * <code>l_ok pixForegroundFraction(PIX*, l_float32*)</code>
     */
    int pixForegroundFraction(Pix pix, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>NUMA* pixaCountPixels(PIXA*)</code>
//       */
//      Numa pixaCountPixels(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>l_ok pixCountPixels(PIX*, l_int32*, l_int32*)</code>
//       */
//      int pixCountPixels(Pix pix, IntBuffer pcount, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountByRow(PIX*, BOX*)</code>
//       */
//      Numa pixCountByRow(Pix pix, Box box);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountByColumn(PIX*, BOX*)</code>
//       */
//      Numa pixCountByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixCountPixelsByRow(PIX*, l_int32*)</code>
//       */
//      Numa pixCountPixelsByRow(Pix pix, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountPixelsByColumn(PIX*)</code>
//       */
//      Numa pixCountPixelsByColumn(Pix pix);
//      /**
//       * Original signature :
//       * <code>l_ok pixCountPixelsInRow(PIX*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixCountPixelsInRow(Pix pix, int row, IntBuffer pcount, IntBuffer tab8);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetMomentByColumn(PIX*, l_int32)</code>
//       */
//      Numa pixGetMomentByColumn(Pix pix, int order);
//      /**
//       * Original signature :
//       * <code>l_ok pixThresholdPixelSum(PIX*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixThresholdPixelSum(Pix pix, int thresh, IntBuffer pabove, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>l_int32* makePixelSumTab8()</code>
//       */
//      IntByReference makePixelSumTab8();
//  
//      /**
//       * Original signature : <code>l_int32* makePixelCentroidTab8()</code>
//       */
//      IntByReference makePixelCentroidTab8();
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageByRow(PIX*, BOX*, l_int32)</code>
//       */
//      Numa pixAverageByRow(Pix pix, Box box, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageByColumn(PIX*, BOX*, l_int32)</code>
//       */
//      Numa pixAverageByColumn(Pix pix, Box box, int type);
//      /**
//       * Original signature :
//       * <code>l_ok pixAverageInRect(PIX*, BOX*, l_float32*)</code>
//       */
//      int pixAverageInRect(Pix pix, Box box, FloatBuffer pave);
//  
//      /**
//       * Original signature : <code>NUMA* pixVarianceByRow(PIX*, BOX*)</code>
//       */
//      Numa pixVarianceByRow(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixVarianceByColumn(PIX*, BOX*)</code>
//       */
//      Numa pixVarianceByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_ok pixVarianceInRect(PIX*, BOX*, l_float32*)</code>
//       */
//      int pixVarianceInRect(Pix pix, Box box, FloatBuffer prootvar);
//  
//      /**
//       * Original signature : <code>NUMA* pixAbsDiffByRow(PIX*, BOX*)</code>
//       */
//      Numa pixAbsDiffByRow(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAbsDiffByColumn(PIX*, BOX*)</code>
//       */
//      Numa pixAbsDiffByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_ok pixAbsDiffInRect(PIX*, BOX*, l_int32, l_float32*)</code>
//       */
//      int pixAbsDiffInRect(Pix pix, Box box, int dir, FloatBuffer pabsdiff);
//      /**
//       * Original signature :
//       * <code>l_ok pixAbsDiffOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int pixAbsDiffOnLine(Pix pix, int x1, int y1, int x2, int y2, FloatBuffer pabsdiff);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCountArbInRect(PIX*, BOX*, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixCountArbInRect(Pix pixs, Box box, int val, int factor, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>PIX* pixMirroredTiling(PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixMirroredTiling(Pix pixs, int w, int h);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindRepCloseTile(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, BOX**, l_int32)</code>
//       */
//      int pixFindRepCloseTile(Pix pixs, Box box, int searchdir, int mindist, int tsize, int ntiles, PointerByReference pboxtile, int debug);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogram(PIX*, l_int32)</code>
//       */
//      Numa pixGetGrayHistogram(Pix pixs, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixGetGrayHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogramInRect(PIX*, BOX*, l_int32)</code>
//       */
//      Numa pixGetGrayHistogramInRect(Pix pixs, Box box, int factor);
    /**
     * Original signature :
     * <code>NUMAA* pixGetGrayHistogramTiled(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Numaa pixGetGrayHistogramTiled(Pix pixs, int factor, int nx, int ny);

//      /**
//       * Original signature :
//       * <code>l_ok pixGetColorHistogram(PIX*, l_int32, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int pixGetColorHistogram(Pix pixs, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetColorHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int pixGetColorHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogram(PIX*, l_int32)</code>
//       */
//      Numa pixGetCmapHistogram(Pix pixs, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixGetCmapHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogramInRect(PIX*, BOX*, l_int32)</code>
//       */
//      Numa pixGetCmapHistogramInRect(Pix pixs, Box box, int factor);
    /**
     * Original signature : <code>l_int32 pixCountRGBColors(PIX*)</code>
     */
    int pixCountRGBColors(Pix pixs);

    /**
     * Original signature :
     * <code>L_AMAP* pixGetColorAmapHistogram(PIX*, l_int32)</code>
     */
    L_Rbtree pixGetColorAmapHistogram(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_int32 amapGetCountForColor(L_AMAP*, l_uint32)</code>
     */
    int amapGetCountForColor(L_Rbtree amap, int val);

//      /**
//       * Original signature :
//       * <code>l_ok pixGetRankValue(PIX*, l_int32, l_float32, l_uint32*)</code>
//       */
//      int pixGetRankValue(Pix pixs, int factor, float rank, IntBuffer pvalue);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetRankValueMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int pixGetRankValueMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code>
//       */
//      int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer pval, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code>
//       */
//      int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatByReference pval, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetAverageMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int pixGetAverageMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetAverageMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int pixGetAverageMasked(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetAverageTiledRGB(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
//       */
//      int pixGetAverageTiledRGB(Pix pixs, int sx, int sy, int type, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetAverageTiled(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixGetAverageTiled(Pix pixs, int sx, int sy, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRowStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int pixRowStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);
//      /**
//       * Original signature :
//       * <code>l_int32 pixColumnStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int pixColumnStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);
    /**
     * Original signature :
     * <code>l_ok pixGetRangeValues(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    int pixGetRangeValues(Pix pixs, int factor, int color, IntBuffer pminval, IntBuffer pmaxval);

//      /**
//       * Original signature :
//       * <code>l_ok pixGetExtremeValue(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixGetExtremeValue(Pix pixs, int factor, int type, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer pgrayval);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetMaxValueInRect(PIX*, BOX*, l_uint32*, l_int32*, l_int32*)</code>
//       */
//      int pixGetMaxValueInRect(Pix pixs, Box box, IntBuffer pmaxval, IntBuffer pxmax, IntBuffer pymax);
    /**
     * Original signature :
     * <code>l_ok pixGetBinnedComponentRange(PIX*, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_uint32**, l_int32)</code>
     */
    int pixGetBinnedComponentRange(Pix pixs, int nbins, int factor, int color, IntBuffer pminval, IntBuffer pmaxval, PointerByReference pcarray, int fontsize);

    /**
     * Original signature :
     * <code>l_ok pixGetRankColorArray(PIX*, l_int32, l_int32, l_int32, l_uint32**, l_int32, l_int32)</code>
     */
    int pixGetRankColorArray(Pix pixs, int nbins, int type, int factor, PointerByReference pcarray, int debugflag, int fontsize);

//      /**
//       * Original signature :
//       * <code>l_ok pixGetBinnedColor(PIX*, PIX*, l_int32, l_int32, NUMA*, l_uint32**, l_int32)</code>
//       */
//      int pixGetBinnedColor(Pix pixs, Pix pixg, int factor, int nbins, Numa nalut, PointerByReference pcarray, int debugflag);
    /**
     * Original signature :
     * <code>PIX* pixDisplayColorArray(l_uint32*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixDisplayColorArray(IntBuffer carray, int ncolors, int side, int ncols, int fontsize);

//      /**
//       * Original signature :
//       * <code>PIX* pixRankBinByStrip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixRankBinByStrip(Pix pixs, int direction, int size, int nbins, int type);
//      /**
//       * Original signature :
//       * <code>PIX* pixaGetAlignedStats(PIXA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaGetAlignedStats(Pixa pixa, int type, int nbins, int thresh);
//      /**
//       * Original signature :
//       * <code>l_ok pixaExtractColumnFromEachPix(PIXA*, l_int32, PIX*)</code>
//       */
//      int pixaExtractColumnFromEachPix(Pixa pixa, int col, Pix pixd);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetRowStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int pixGetRowStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer colvect);
//      /**
//       * Original signature :
//       * <code>l_ok pixGetColumnStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int pixGetColumnStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer rowvect);
//      /**
//       * Original signature :
//       * <code>l_ok pixSetPixelColumn(PIX*, l_int32, l_float32*)</code>
//       */
//      int pixSetPixelColumn(Pix pix, int col, FloatBuffer colvect);
//      /**
//       * Original signature :
//       * <code>l_ok pixThresholdForFgBg(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixThresholdForFgBg(Pix pixs, int factor, int thresh, IntBuffer pfgval, IntBuffer pbgval);
//      /**
//       * Original signature :
//       * <code>l_ok pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code>
//       */
//      int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntBuffer pthresh, IntBuffer pfgval, IntBuffer pbgval, PointerByReference ppixdb);
    /**
     * Original signature :
     * <code>l_ok pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code>
     */
    int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntByReference pthresh, IntByReference pfgval, IntByReference pbgval, PointerByReference ppixdb);

//      /**
//       * Original signature :
//       * <code>l_ok pixaFindDimensions(PIXA*, NUMA**, NUMA**)</code>
//       */
//      int pixaFindDimensions(Pixa pixa, PointerByReference pnaw, PointerByReference pnah);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindAreaPerimRatio(PIX*, l_int32*, l_float32*)</code>
//       */
//      int pixFindAreaPerimRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindPerimToAreaRatio(PIXA*)</code>
//       */
//      Numa pixaFindPerimToAreaRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindPerimToAreaRatio(PIX*, l_int32*, l_float32*)</code>
//       */
//      int pixFindPerimToAreaRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>NUMA* pixaFindPerimSizeRatio(PIXA*)</code>
//       */
//      Numa pixaFindPerimSizeRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindPerimSizeRatio(PIX*, l_int32*, l_float32*)</code>
//       */
//      int pixFindPerimSizeRatio(Pix pixs, IntBuffer tab, FloatBuffer pratio);
//  
//      /**
//       * Original signature : <code>NUMA* pixaFindAreaFraction(PIXA*)</code>
//       */
//      Numa pixaFindAreaFraction(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindAreaFraction(PIX*, l_int32*, l_float32*)</code>
//       */
//      int pixFindAreaFraction(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindAreaFractionMasked(PIXA*, PIX*, l_int32)</code>
//       */
//      Numa pixaFindAreaFractionMasked(Pixa pixa, Pix pixm, int debug);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindAreaFractionMasked(PIX*, BOX*, PIX*, l_int32*, l_float32*)</code>
//       */
//      int pixFindAreaFractionMasked(Pix pixs, Box box, Pix pixm, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindWidthHeightRatio(PIXA*)</code>
//       */
//      Numa pixaFindWidthHeightRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindWidthHeightProduct(PIXA*)</code>
//       */
//      Numa pixaFindWidthHeightProduct(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindOverlapFraction(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_int32*)</code>
//       */
//      int pixFindOverlapFraction(Pix pixs1, Pix pixs2, int x2, int y2, IntBuffer tab, FloatBuffer pratio, IntBuffer pnoverlap);
//      /**
//       * Original signature :
//       * <code>BOXA* pixFindRectangleComps(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Boxa pixFindRectangleComps(Pix pixs, int dist, int minw, int minh);
//      /**
//       * Original signature :
//       * <code>l_ok pixConformsToRectangle(PIX*, BOX*, l_int32, l_int32*)</code>
//       */
//      int pixConformsToRectangle(Pix pixs, Box box, int dist, IntBuffer pconforms);
//      /**
//       * Original signature :
//       * <code>PIXA* pixClipRectangles(PIX*, BOXA*)</code>
//       */
//      Pixa pixClipRectangles(Pix pixs, Boxa boxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixClipRectangle(PIX*, BOX*, BOX**)</code>
//       */
//      Pix pixClipRectangle(Pix pixs, Box box, PointerByReference pboxc);
//      /**
//       * Original signature :
//       * <code>PIX* pixClipMasked(PIX*, PIX*, l_int32, l_int32, l_uint32)</code>
//       */
//      Pix pixClipMasked(Pix pixs, Pix pixm, int x, int y, int outval);
//      /**
//       * Original signature :
//       * <code>l_ok pixCropToMatch(PIX*, PIX*, PIX**, PIX**)</code>
//       */
//      int pixCropToMatch(Pix pixs1, Pix pixs2, PointerByReference ppixd1, PointerByReference ppixd2);
//      /**
//       * Original signature :
//       * <code>PIX* pixCropToSize(PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixCropToSize(Pix pixs, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixResizeToMatch(PIX*, PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixResizeToMatch(Pix pixs, Pix pixt, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixMakeFrameMask(l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
//       */
//      Pix pixMakeFrameMask(int w, int h, float hf1, float hf2, float vf1, float vf2);
//    	/**
//	 * Original signature : <code>PIX* pixMakeCoveringOfRectangles(PIX*, l_int32)</code>
//	 */
//	Pix pixMakeCoveringOfRectangles(Pix pixs, int maxiters);

    /**
     * Original signature :
     * <code>l_ok pixFractionFgInMask(PIX*, PIX*, l_float32*)</code>
     */
    int pixFractionFgInMask(Pix pix1, Pix pix2, FloatBuffer pfract);

//      /**
//       * Original signature :
//       * <code>l_ok pixClipToForeground(PIX*, PIX**, BOX**)</code>
//       */
//      int pixClipToForeground(Pix pixs, PointerByReference ppixd, PointerByReference pbox);
//      /**
//       * Original signature :
//       * <code>l_ok pixTestClipToForeground(PIX*, l_int32*)</code>
//       */
//      int pixTestClipToForeground(Pix pixs, IntBuffer pcanclip);
//      /**
//       * Original signature :
//       * <code>l_ok pixClipBoxToForeground(PIX*, BOX*, PIX**, BOX**)</code>
//       */
//      int pixClipBoxToForeground(Pix pixs, Box boxs, PointerByReference ppixd, PointerByReference pboxd);
//      /**
//       * Original signature :
//       * <code>l_ok pixScanForForeground(PIX*, BOX*, l_int32, l_int32*)</code>
//       */
//      int pixScanForForeground(Pix pixs, Box box, int scanflag, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>l_ok pixClipBoxToEdges(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, PIX**, BOX**)</code>
//       */
//      int pixClipBoxToEdges(Pix pixs, Box boxs, int lowthresh, int highthresh, int maxwidth, int factor, PointerByReference ppixd, PointerByReference pboxd);
//      /**
//       * Original signature :
//       * <code>l_ok pixScanForEdge(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixScanForEdge(Pix pixs, Box box, int lowthresh, int highthresh, int maxwidth, int factor, int scanflag, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixExtractOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);
//      /**
//       * Original signature :
//       * <code>l_float32 pixAverageOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      float pixAverageOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageIntensityProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixAverageIntensityProfile(Pix pixs, float fract, int dir, int first, int last, int factor1, int factor2);
//      /**
//       * Original signature :
//       * <code>NUMA* pixReversalProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixReversalProfile(Pix pixs, float fract, int dir, int first, int last, int minreversal, int factor1, int factor2);
//      /**
//       * Original signature :
//       * <code>l_ok pixWindowedVarianceOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**)</code>
//       */
//      int pixWindowedVarianceOnLine(Pix pixs, int dir, int loc, int c1, int c2, int size, PointerByReference pnad);
//      /**
//       * Original signature :
//       * <code>l_ok pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code>
//       */
//      int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatBuffer pminave, FloatBuffer pmaxave);
//      /**
//       * Original signature :
//       * <code>l_ok pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code>
//       */
//      int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatByReference pminave, FloatByReference pmaxave);
//  
//      /**
//       * Original signature : <code>PIX* pixRankRowTransform(PIX*)</code>
//       */
//      Pix pixRankRowTransform(Pix pixs);
//  
//      /**
//       * Original signature : <code>PIX* pixRankColumnTransform(PIX*)</code>
//       */
//      Pix pixRankColumnTransform(Pix pixs);
//  
      /**
       * Original signature : <code>PIXA* pixaCreate(l_int32)</code>
       */
      Pixa pixaCreate(int n);
      /**
       * Original signature :
       * <code>PIXA* pixaCreateFromPix(PIX*, l_int32, l_int32, l_int32)</code>
       */
      Pixa pixaCreateFromPix(Pix pixs, int n, int cellw, int cellh);
      /**
       * Original signature :
       * <code>PIXA* pixaCreateFromBoxa(PIX*, BOXA*, l_int32*)</code>
       */
      Pixa pixaCreateFromBoxa(Pix pixs, Boxa boxa, IntBuffer pcropwarn);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSplitPix(PIX*, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      Pixa pixaSplitPix(Pix pixs, int nx, int ny, int borderwidth, int bordercolor);
//  
      /**
       * Original signature : <code>void pixaDestroy(PIXA**)</code>
       */
      void pixaDestroy(PointerByReference ppixa);
  
      /**
       * Original signature : <code>PIXA* pixaCopy(PIXA*, l_int32)</code>
       */
      Pixa pixaCopy(Pixa pixa, int copyflag);
      /**
       * Original signature :
       * <code>l_ok pixaAddPix(PIXA*, PIX*, l_int32)</code>
       */
      int pixaAddPix(Pixa pixa, Pix pix, int copyflag);
      /**
       * Original signature :
       * <code>l_ok pixaAddBox(PIXA*, BOX*, l_int32)</code>
       */
      int pixaAddBox(Pixa pixa, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_ok pixaExtendArrayToSize(PIXA*, l_int32)</code>
//       */
//      int pixaExtendArrayToSize(Pixa pixa, int size);
//  
//      /**
//       * Original signature : <code>l_int32 pixaGetCount(PIXA*)</code>
//       */
//      int pixaGetCount(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaChangeRefcount(PIXA*, l_int32)</code>
//       */
//      int pixaChangeRefcount(Pixa pixa, int delta);
//      /**
//       * Original signature :
//       * <code>PIX* pixaGetPix(PIXA*, l_int32, l_int32)</code>
//       */
//      Pix pixaGetPix(Pixa pixa, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_ok pixaGetPixDimensions(PIXA*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixaGetPixDimensions(Pixa pixa, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);
//  
      /**
       * Original signature : <code>BOXA* pixaGetBoxa(PIXA*, l_int32)</code>
       */
      Boxa pixaGetBoxa(Pixa pixa, int accesstype);
  
      /**
       * Original signature : <code>l_int32 pixaGetBoxaCount(PIXA*)</code>
       */
      int pixaGetBoxaCount(Pixa pixa);
      /**
       * Original signature :
       * <code>BOX* pixaGetBox(PIXA*, l_int32, l_int32)</code>
       */
      Box pixaGetBox(Pixa pixa, int index, int accesstype);
      /**
       * Original signature :
       * <code>l_ok pixaGetBoxGeometry(PIXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
       */
      int pixaGetBoxGeometry(Pixa pixa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
      /**
       * Original signature :
       * <code>l_ok pixaSetBoxa(PIXA*, BOXA*, l_int32)</code>
       */
      int pixaSetBoxa(Pixa pixa, Boxa boxa, int accesstype);
    /**
     * Original signature : <code>PIX** pixaGetPixArray(PIXA*)</code>
     */
    PointerByReference pixaGetPixArray(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>l_ok pixaVerifyDepth(PIXA*, l_int32*, l_int32*)</code>
//       */
//      int pixaVerifyDepth(Pixa pixa, IntBuffer psame, IntBuffer pmaxd);
//      /**
//       * Original signature :
//       * <code>l_ok pixaIsFull(PIXA*, l_int32*, l_int32*)</code>
//       */
//      int pixaIsFull(Pixa pixa, IntBuffer pfullpa, IntBuffer pfullba);
//      /**
//       * Original signature :
//       * <code>l_ok pixaCountText(PIXA*, l_int32*)</code>
//       */
//      int pixaCountText(Pixa pixa, IntBuffer pntext);
    /**
     * Original signature : <code>l_ok pixaSetText(PIXA*, SARRAY*)</code>
     */
    int pixaSetText(Pixa pixa, Sarray sa);

//      /**
//       * Original signature :
//       * <code>void*** pixaGetLinePtrs(PIXA*, l_int32*)</code>
//       */
//      PointerByReference pixaGetLinePtrs(Pixa pixa, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_ok pixaWriteStreamInfo(FILE*, PIXA*)</code>
//       */
//      int pixaWriteStreamInfo(FILE fp, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaReplacePix(PIXA*, l_int32, PIX*, BOX*)</code>
//       */
//      int pixaReplacePix(Pixa pixa, int index, Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_ok pixaInsertPix(PIXA*, l_int32, PIX*, BOX*)</code>
//       */
//      int pixaInsertPix(Pixa pixa, int index, Pix pixs, Box box);
//      /**
//       * Original signature :
//       * <code>l_ok pixaRemovePix(PIXA*, l_int32)</code>
//       */
//      int pixaRemovePix(Pixa pixa, int index);
//      /**
//       * Original signature :
//       * <code>l_ok pixaRemovePixAndSave(PIXA*, l_int32, PIX**, BOX**)</code>
//       */
//      int pixaRemovePixAndSave(Pixa pixa, int index, PointerByReference ppix, PointerByReference pbox);
//      /**
//       * Original signature :
//       * <code>l_ok pixaInitFull(PIXA*, PIX*, BOX*)</code>
//       */
//      int pixaInitFull(Pixa pixa, Pix pix, Box box);
//  
//      /**
//       * Original signature : <code>l_ok pixaClear(PIXA*)</code>
//       */
//      int pixaClear(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaJoin(PIXA*, PIXA*, l_int32, l_int32)</code>
//       */
//      int pixaJoin(Pixa pixad, Pixa pixas, int istart, int iend);
    /**
     * Original signature :
     * <code>PIXA* pixaInterleave(PIXA*, PIXA*, l_int32)</code>
     */
    Pixa pixaInterleave(Pixa pixa1, Pixa pixa2, int copyflag);

//      /**
//       * Original signature :
//       * <code>l_ok pixaaJoin(PIXAA*, PIXAA*, l_int32, l_int32)</code>
//       */
//      int pixaaJoin(Pixaa paad, Pixaa paas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaCreate(l_int32)</code>
//       */
//      Pixaa pixaaCreate(int n);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaCreateFromPixa(PIXA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pixaa pixaaCreateFromPixa(Pixa pixa, int n, int type, int copyflag);
//  
//      /**
//       * Original signature : <code>void pixaaDestroy(PIXAA**)</code>
//       */
//      void pixaaDestroy(PointerByReference ppaa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaAddPixa(PIXAA*, PIXA*, l_int32)</code>
//       */
//      int pixaaAddPixa(Pixaa paa, Pixa pixa, int copyflag);
//  
//      /**
//       * Original signature : <code>l_ok pixaaExtendArray(PIXAA*)</code>
//       */
//      int pixaaExtendArray(Pixaa paa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaAddPix(PIXAA*, l_int32, PIX*, BOX*, l_int32)</code>
//       */
//      int pixaaAddPix(Pixaa paa, int index, Pix pix, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaAddBox(PIXAA*, BOX*, l_int32)</code>
//       */
//      int pixaaAddBox(Pixaa paa, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaGetCount(PIXAA*, NUMA**)</code>
//       */
//      int pixaaGetCount(Pixaa paa, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaGetPixa(PIXAA*, l_int32, l_int32)</code>
//       */
//      Pixa pixaaGetPixa(Pixaa paa, int index, int accesstype);
//  
//      /**
//       * Original signature : <code>BOXA* pixaaGetBoxa(PIXAA*, l_int32)</code>
//       */
//      Boxa pixaaGetBoxa(Pixaa paa, int accesstype);
//      /**
//       * Original signature :
//       * <code>PIX* pixaaGetPix(PIXAA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaaGetPix(Pixaa paa, int index, int ipix, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaVerifyDepth(PIXAA*, l_int32*)</code>
//       */
//      int pixaaVerifyDepth(Pixaa paa, IntBuffer pmaxdepth);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaIsFull(PIXAA*, l_int32*)</code>
//       */
//      int pixaaIsFull(Pixaa paa, IntBuffer pfull);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaInitFull(PIXAA*, PIXA*)</code>
//       */
//      int pixaaInitFull(Pixaa paa, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaReplacePixa(PIXAA*, l_int32, PIXA*)</code>
//       */
//      int pixaaReplacePixa(Pixaa paa, int index, Pixa pixa);
//  
//      /**
//       * Original signature : <code>l_ok pixaaClear(PIXAA*)</code>
//       */
//      int pixaaClear(Pixaa paa);
//  
//      /**
//       * Original signature : <code>l_ok pixaaTruncate(PIXAA*)</code>
//       */
//      int pixaaTruncate(Pixaa paa);
//  
//      /**
//       * Original signature : <code>PIXA* pixaRead(const char*)</code>
//       */
//      Pixa pixaRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXA* pixaReadStream(FILE*)</code>
//       */
//      Pixa pixaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PIXA* pixaReadMem(const l_uint8*, size_t)</code>
     */
    Pixa pixaReadMem(ByteBuffer data, NativeSize size);

//    /**
//     * Original signature : <code>l_ok pixaWriteDebug(const char*, PIXA*)</code>
//     */
//    int pixaWriteDebug(String fname, Pixa pixa);

//      /**
//       * Original signature :
//       * <code>l_ok pixaWrite(const char*, PIXA*)</code>
//       */
//      int pixaWrite(String filename, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaWriteStream(FILE*, PIXA*)</code>
//       */
//      int pixaWriteStream(FILE fp, Pixa pixa);
    /**
     * Original signature :
     * <code>l_ok pixaWriteMem(l_uint8**, size_t*, PIXA*)</code>
     */
    int pixaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature : <code>PIXA* pixaReadBoth(const char*)</code>
     */
    Pixa pixaReadBoth(String filename);

//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code>
//       */
//      Pixaa pixaaReadFromFiles(String dirname, String substr, int first, int nfiles);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaRead(const char*)</code>
//       */
//      Pixaa pixaaRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaReadStream(FILE*)</code>
//       */
//      Pixaa pixaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PIXAA* pixaaReadMem(const l_uint8*, size_t)</code>
     */
    Pixaa pixaaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok pixaaWrite(const char*, PIXAA*)</code>
//       */
//      int pixaaWrite(String filename, Pixaa paa);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaWriteStream(FILE*, PIXAA*)</code>
//       */
//      int pixaaWriteStream(FILE fp, Pixaa paa);
    /**
     * Original signature :
     * <code>l_ok pixaaWriteMem(l_uint8**, size_t*, PIXAA*)</code>
     */
    int pixaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixaa paa);

//      /**
//       * Original signature :
//       * <code>PIXACC* pixaccCreate(l_int32, l_int32, l_int32)</code>
//       */
//      Pixacc pixaccCreate(int w, int h, int negflag);
//      /**
//       * Original signature :
//       * <code>PIXACC* pixaccCreateFromPix(PIX*, l_int32)</code>
//       */
//      Pixacc pixaccCreateFromPix(Pix pix, int negflag);
//  
//      /**
//       * Original signature : <code>void pixaccDestroy(PIXACC**)</code>
//       */
//      void pixaccDestroy(PointerByReference ppixacc);
//  
//      /**
//       * Original signature : <code>PIX* pixaccFinal(PIXACC*, l_int32)</code>
//       */
//      Pix pixaccFinal(Pixacc pixacc, int outdepth);
//  
//      /**
//       * Original signature : <code>PIX* pixaccGetPix(PIXACC*)</code>
//       */
//      Pix pixaccGetPix(Pixacc pixacc);
//  
//      /**
//       * Original signature : <code>l_int32 pixaccGetOffset(PIXACC*)</code>
//       */
//      int pixaccGetOffset(Pixacc pixacc);
//  
//      /**
//       * Original signature : <code>l_ok pixaccAdd(PIXACC*, PIX*)</code>
//       */
//      int pixaccAdd(Pixacc pixacc, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_ok pixaccSubtract(PIXACC*, PIX*)</code>
//       */
//      int pixaccSubtract(Pixacc pixacc, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_ok pixaccMultConst(PIXACC*, l_float32)</code>
//       */
//      int pixaccMultConst(Pixacc pixacc, float factor);
//      /**
//       * Original signature :
//       * <code>l_ok pixaccMultConstAccumulate(PIXACC*, PIX*, l_float32)</code>
//       */
//      int pixaccMultConstAccumulate(Pixacc pixacc, Pix pix, float factor);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectBySize(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pix pixSelectBySize(Pix pixs, int width, int height, int connectivity, int type, int relation, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectBySize(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pixa pixaSelectBySize(Pixa pixas, int width, int height, int type, int relation, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaMakeSizeIndicator(PIXA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixaMakeSizeIndicator(Pixa pixa, int width, int height, int type, int relation);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByPerimToAreaRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pix pixSelectByPerimToAreaRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByPerimToAreaRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
//       */
//      Pixa pixaSelectByPerimToAreaRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByPerimSizeRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pix pixSelectByPerimSizeRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByPerimSizeRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
//       */
//      Pixa pixaSelectByPerimSizeRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByAreaFraction(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pix pixSelectByAreaFraction(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByAreaFraction(PIXA*, l_float32, l_int32, l_int32*)</code>
//       */
//      Pixa pixaSelectByAreaFraction(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByWidthHeightRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
//       */
//      Pix pixSelectByWidthHeightRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByWidthHeightRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
//       */
//      Pixa pixaSelectByWidthHeightRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
    /**
     * Original signature :
     * <code>PIXA* pixaSelectByNumConnComp(PIXA*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    Pixa pixaSelectByNumConnComp(Pixa pixas, int nmin, int nmax, int connectivity, IntBuffer pchanged);

//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectWithIndicator(PIXA*, NUMA*, l_int32*)</code>
//       */
//      Pixa pixaSelectWithIndicator(Pixa pixas, Numa na, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>l_ok pixRemoveWithIndicator(PIX*, PIXA*, NUMA*)</code>
//       */
//      int pixRemoveWithIndicator(Pix pixs, Pixa pixa, Numa na);
//      /**
//       * Original signature :
//       * <code>l_ok pixAddWithIndicator(PIX*, PIXA*, NUMA*)</code>
//       */
//      int pixAddWithIndicator(Pix pixs, Pixa pixa, Numa na);
    /**
     * Original signature :
     * <code>PIXA* pixaSelectWithString(PIXA*, const char*, l_int32*)</code>
     */
    Pixa pixaSelectWithString(Pixa pixas, String str, IntBuffer perror);

//      /**
//       * Original signature :
//       * <code>PIX* pixaRenderComponent(PIX*, PIXA*, l_int32)</code>
//       */
//      Pix pixaRenderComponent(Pix pixs, Pixa pixa, int index);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code>
//       */
//      Pixa pixaSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaBinSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code>
//       */
//      Pixa pixaBinSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSortByIndex(PIXA*, NUMA*, l_int32)</code>
//       */
//      Pixa pixaSortByIndex(Pixa pixas, Numa naindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaSort2dByIndex(PIXA*, NUMAA*, l_int32)</code>
//       */
//      Pixaa pixaSort2dByIndex(Pixa pixas, Numaa naa, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectRange(PIXA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pixa pixaSelectRange(Pixa pixas, int first, int last, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaSelectRange(PIXAA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pixaa pixaaSelectRange(Pixaa paas, int first, int last, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaScaleToSize(PIXAA*, l_int32, l_int32)</code>
//       */
//      Pixaa pixaaScaleToSize(Pixaa paas, int wd, int hd);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaScaleToSizeVar(PIXAA*, NUMA*, NUMA*)</code>
//       */
//      Pixaa pixaaScaleToSizeVar(Pixaa paas, Numa nawd, Numa nahd);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaScaleToSize(PIXA*, l_int32, l_int32)</code>
//       */
//      Pixa pixaScaleToSize(Pixa pixas, int wd, int hd);
    /**
     * Original signature :
     * <code>PIXA* pixaScaleToSizeRel(PIXA*, l_int32, l_int32)</code>
     */
    Pixa pixaScaleToSizeRel(Pixa pixas, int delw, int delh);

    /**
     * Original signature :
     * <code>PIXA* pixaScale(PIXA*, l_float32, l_float32)</code>
     */
    Pixa pixaScale(Pixa pixas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIXA* pixaScaleBySampling(PIXA*, l_float32, l_float32)</code>
     */
    Pixa pixaScaleBySampling(Pixa pixas, float scalex, float scaley);
    /**
     * Original signature :
     * <code>PIXA* pixaRotate(PIXA*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaRotate(Pixa pixas, float angle, int type, int incolor, int width, int height);
    /**
     * Original signature :
     * <code>PIXA* pixaRotateOrth(PIXA*, l_int32)</code>
     */
    Pixa pixaRotateOrth(Pixa pixas, int rotation);
    /**
     * Original signature :
     * <code>PIXA* pixaTranslate(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaTranslate(Pixa pixas, int hshift, int vshift, int incolor);

//      /**
//       * Original signature :
//       * <code>PIXA* pixaAddBorderGeneral(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      Pixa pixaAddBorderGeneral(Pixa pixad, Pixa pixas, int left, int right, int top, int bot, int val);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaFlattenToPixa(PIXAA*, NUMA**, l_int32)</code>
//       */
//      Pixa pixaaFlattenToPixa(Pixaa paa, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_ok pixaaSizeRange(PIXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixaaSizeRange(Pixaa paa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);
//      /**
//       * Original signature :
//       * <code>l_ok pixaSizeRange(PIXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixaSizeRange(Pixa pixa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);
//  
//      /**
//       * Original signature : <code>PIXA* pixaClipToPix(PIXA*, PIX*)</code>
//       */
//      Pixa pixaClipToPix(Pixa pixas, Pix pixs);
    /**
     * Original signature :
     * <code>l_ok pixaClipToForeground(PIXA*, PIXA**, BOXA**)</code>
     */
    int pixaClipToForeground(Pixa pixas, PointerByReference ppixad, PointerByReference pboxa);

//      /**
//       * Original signature :
//       * <code>l_ok pixaGetRenderingDepth(PIXA*, l_int32*)</code>
//       */
//      int pixaGetRenderingDepth(Pixa pixa, IntBuffer pdepth);
//      /**
//       * Original signature :
//       * <code>l_ok pixaHasColor(PIXA*, l_int32*)</code>
//       */
//      int pixaHasColor(Pixa pixa, IntBuffer phascolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixaAnyColormaps(PIXA*, l_int32*)</code>
//       */
//      int pixaAnyColormaps(Pixa pixa, IntBuffer phascmap);
//      /**
//       * Original signature :
//       * <code>l_ok pixaGetDepthInfo(PIXA*, l_int32*, l_int32*)</code>
//       */
//      int pixaGetDepthInfo(Pixa pixa, IntBuffer pmaxdepth, IntBuffer psame);
//  
//      /**
//       * Original signature : <code>PIXA* pixaConvertToSameDepth(PIXA*)</code>
//       */
//      Pixa pixaConvertToSameDepth(Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_ok pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code>
//       */
//      int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);
//      /**
//       * Original signature :
//       * <code>l_ok pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code>
//       */
//      int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntByReference psame);

    /**
     * Original signature : <code>l_ok pixaSetFullSizeBoxa(PIXA*)</code>
     */
    int pixaSetFullSizeBoxa(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplay(PIXA*, l_int32, l_int32)</code>
//       */
//      Pix pixaDisplay(Pixa pixa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnColor(PIXA*, l_int32, l_int32, l_uint32)</code>
//       */
//      Pix pixaDisplayOnColor(Pixa pixa, int w, int h, int bgcolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayRandomCmap(PIXA*, l_int32, l_int32)</code>
//       */
//      Pix pixaDisplayRandomCmap(Pixa pixa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayLinearly(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, BOXA**)</code>
//       */
//      Pix pixaDisplayLinearly(Pixa pixas, int direction, float scalefactor, int background, int spacing, int border, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code>
//       */
//      Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntBuffer pncols, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code>
//       */
//      Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntByReference pncols, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayUnsplit(PIXA*, l_int32, l_int32, l_int32, l_uint32)</code>
//       */
//      Pix pixaDisplayUnsplit(Pixa pixa, int nx, int ny, int borderwidth, int bordercolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiled(PIXA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaDisplayTiled(Pixa pixa, int maxwidth, int background, int spacing);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiledInRows(PIXA*, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaDisplayTiledInRows(Pixa pixa, int outdepth, int maxwidth, float scalefactor, int background, int spacing, int border);
    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledInColumns(PIXA*, l_int32, l_float32, l_int32, l_int32)</code>
     */
    Pix pixaDisplayTiledInColumns(Pixa pixas, int nx, float scalefactor, int spacing, int border);

//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiledAndScaled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaDisplayTiledAndScaled(Pixa pixa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledWithText(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    Pix pixaDisplayTiledWithText(Pixa pixa, int maxwidth, float scalefactor, int spacing, int border, int fontsize, int textcolor);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledByIndex(PIXA*, NUMA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    Pix pixaDisplayTiledByIndex(Pixa pixa, Numa na, int width, int spacing, int border, int fontsize, int textcolor);

//      /**
//       * Original signature :
//       * <code>PIX* pixaaDisplay(PIXAA*, l_int32, l_int32)</code>
//       */
//      Pix pixaaDisplay(Pixaa paa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaaDisplayByPixa(PIXAA*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixaaDisplayByPixa(Pixaa paa, int xspace, int yspace, int maxw);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaDisplayTiledAndScaled(PIXAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pixa pixaaDisplayTiledAndScaled(Pixaa paa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo1(PIXA*, l_int32)</code>
//       */
//      Pixa pixaConvertTo1(Pixa pixas, int thresh);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo8(PIXA*, l_int32)</code>
//       */
//      Pixa pixaConvertTo8(Pixa pixas, int cmapflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo8Colormap(PIXA*, l_int32)</code>
//       */
//      Pixa pixaConvertTo8Colormap(Pixa pixas, int dither);
//      /**
//       * Original signature : <code>PIXA* pixaConvertTo32(PIXA*)</code>
//       */
//      Pixa pixaConvertTo32(Pixa pixas);
    /**
     * Original signature :
     * <code>PIXA* pixaConstrainedSelect(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaConstrainedSelect(Pixa pixas, int first, int last, int nmax, int use_pairs, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaSelectToPdf(PIXA*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32, l_int32, const char*)</code>
     */
    int pixaSelectToPdf(Pixa pixas, int first, int last, int res, float scalefactor, int type, int quality, int color, int fontsize, String fileout);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayMultiTiled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
     */
    Pixa pixaDisplayMultiTiled(Pixa pixas, int nx, int ny, int maxw, int maxh, float scalefactor, int spacing, int border);

    /**
     * Original signature :
     * <code>l_ok pixaSplitIntoFiles(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixaSplitIntoFiles(Pixa pixas, int nsplit, float scale, int outwidth, int write_pixa, int write_pix, int write_pdf);

//      /**
//       * Original signature :
//       * <code>l_ok convertToNUpFiles(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code>
//       */
//      int convertToNUpFiles(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize, String outdir);
//      /**
//       * Original signature :
//       * <code>PIXA* convertToNUpPixa(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pixa convertToNUpPixa(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize);
    /**
     * Original signature :
     * <code>PIXA* pixaConvertToNUpPixa(PIXA*, SARRAY*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaConvertToNUpPixa(Pixa pixas, Sarray sa, int nx, int ny, int tw, int spacing, int border, int fontsize);

    /**
     * Original signature :
     * <code>l_ok pixaCompareInPdf(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code>
     */
    int pixaCompareInPdf(Pixa pixa1, Pixa pixa2, int nx, int ny, int tw, int spacing, int border, int fontsize, String fileout);

//      /**
//       * Original signature :
//       * <code>l_ok pmsCreate(size_t, size_t, NUMA*, const char*)</code>
//       */
//      int pmsCreate(NativeSize minsize, NativeSize smallest, Numa numalloc, String logfile);
//  
//      /**
//       * Original signature : <code>void pmsDestroy()</code>
//       */
//      void pmsDestroy();
//  
//      /**
//       * Original signature : <code>void* pmsCustomAlloc(size_t)</code>
//       */
//      Pointer pmsCustomAlloc(NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>void pmsCustomDealloc(void*)</code>
//       */
//      void pmsCustomDealloc(Pointer data);
//  
//      /**
//       * Original signature : <code>void* pmsGetAlloc(size_t)</code>
//       */
//      Pointer pmsGetAlloc(NativeSize nbytes);
//      /**
//       * Original signature :
//       * <code>l_ok pmsGetLevelForAlloc(size_t, l_int32*)</code>
//       */
//      int pmsGetLevelForAlloc(NativeSize nbytes, IntBuffer plevel);
//      /**
//       * Original signature :
//       * <code>l_ok pmsGetLevelForDealloc(void*, l_int32*)</code>
//       */
//      int pmsGetLevelForDealloc(Pointer data, IntBuffer plevel);
//  
//      /**
//       * Original signature : <code>void pmsLogInfo()</code>
//       */
//      void pmsLogInfo();
    /**
     * Original signature :
     * <code>l_ok pixAddConstantGray(PIX*, l_int32)</code>
     */
    int pixAddConstantGray(Pix pixs, int val);

    /**
     * Original signature :
     * <code>l_ok pixMultConstantGray(PIX*, l_float32)</code>
     */
    int pixMultConstantGray(Pix pixs, float val);

    /**
     * Original signature : <code>PIX* pixAddGray(PIX*, PIX*, PIX*)</code>
     */
    Pix pixAddGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixSubtractGray(PIX*, PIX*, PIX*)</code>
     */
    Pix pixSubtractGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToValue(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixThresholdToValue(Pix pixd, Pix pixs, int threshval, int setval);

    /**
     * Original signature :
     * <code>PIX* pixInitAccumulate(l_int32, l_int32, l_uint32)</code>
     */
    Pix pixInitAccumulate(int w, int h, int offset);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulate(PIX*, l_uint32, l_int32)</code>
     */
    Pix pixFinalAccumulate(Pix pixs, int offset, int depth);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulateThreshold(PIX*, l_uint32, l_uint32)</code>
     */
    Pix pixFinalAccumulateThreshold(Pix pixs, int offset, int threshold);

    /**
     * Original signature :
     * <code>l_ok pixAccumulate(PIX*, PIX*, l_int32)</code>
     */
    int pixAccumulate(Pix pixd, Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_ok pixMultConstAccumulate(PIX*, l_float32, l_uint32)</code>
     */
    int pixMultConstAccumulate(Pix pixs, float factor, int offset);

    /**
     * Original signature : <code>PIX* pixAbsDifference(PIX*, PIX*)</code>
     */
    Pix pixAbsDifference(Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAddRGB(PIX*, PIX*)</code>
     */
    Pix pixAddRGB(Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixMinOrMax(PIX*, PIX*, PIX*, l_int32)</code>
     */
    Pix pixMinOrMax(Pix pixd, Pix pixs1, Pix pixs2, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaxDynamicRange(PIX*, l_int32)</code>
     */
    Pix pixMaxDynamicRange(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaxDynamicRangeRGB(PIX*, l_int32)</code>
     */
    Pix pixMaxDynamicRangeRGB(Pix pixs, int type);

    /**
     * Original signature :
     * <code>l_uint32 linearScaleRGBVal(l_uint32, l_float32)</code>
     */
    int linearScaleRGBVal(int sval, float factor);

    /**
     * Original signature :
     * <code>l_uint32 logScaleRGBVal(l_uint32, l_float32*, l_float32)</code>
     */
    int logScaleRGBVal(int sval, FloatBuffer tab, float factor);
//  
//      /**
//       * Original signature : <code>l_float32* makeLogBase2Tab()</code>
//       */
//      FloatByReference makeLogBase2Tab();

//      /**
//       * Original signature :
//       * <code>l_float32 getLogBase2(l_int32, l_float32*)</code>
//       */
//      float getLogBase2(int val, FloatBuffer logtab);
//      /**
//       * Original signature :
//       * <code>PIXC* pixcompCreateFromPix(PIX*, l_int32)</code>
//       */
//      PixComp pixcompCreateFromPix(Pix pix, int comptype);
    /**
     * Original signature :
     * <code>PIXC* pixcompCreateFromString(l_uint8*, size_t, l_int32)</code>
     */
    PixComp pixcompCreateFromString(ByteBuffer data, NativeSize size, int copyflag);

//      /**
//       * Original signature :
//       * <code>PIXC* pixcompCreateFromFile(const char*, l_int32)</code>
//       */
//      PixComp pixcompCreateFromFile(String filename, int comptype);
//  
//      /**
//       * Original signature : <code>void pixcompDestroy(PIXC**)</code>
//       */
//      void pixcompDestroy(PointerByReference ppixc);
    /**
     * Original signature : <code>PIXC* pixcompCopy(PIXC*)</code>
     */
    PixComp pixcompCopy(PixComp pixcs);

//      /**
//       * Original signature :
//       * <code>l_ok pixcompGetDimensions(PIXC*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixcompGetDimensions(PixComp pixc, IntBuffer pw, IntBuffer ph, IntBuffer pd);
    
//        /**
//        * Original signature : <code>l_ok pixcompGetParameters(PIXC*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//        */
//        int pixcompGetParameters(PixComp pixc, IntBuffer pxres, IntBuffer pyres, IntBuffer pcomptype, IntBuffer pcmapflag);

//      /**
//       * Original signature :
//       * <code>l_ok pixcompDetermineFormat(l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixcompDetermineFormat(int comptype, int d, int cmapflag, IntBuffer pformat);
//  
//      /**
//       * Original signature : <code>PIX* pixCreateFromPixcomp(PIXC*)</code>
//       */
//      Pix pixCreateFromPixcomp(PixComp pixc);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompCreate(l_int32)</code>
//       */
//      PixaComp pixacompCreate(int n);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateWithInit(l_int32, l_int32, PIX*, l_int32)</code>
//       */
//      PixaComp pixacompCreateWithInit(int n, int offset, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromPixa(PIXA*, l_int32, l_int32)</code>
//       */
//      PixaComp pixacompCreateFromPixa(Pixa pixa, int comptype, int accesstype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromFiles(const char*, const char*, l_int32)</code>
//       */
//      PixaComp pixacompCreateFromFiles(String dirname, String substr, int comptype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromSA(SARRAY*, l_int32)</code>
//       */
//      PixaComp pixacompCreateFromSA(Sarray sa, int comptype);
//  
//      /**
//       * Original signature : <code>void pixacompDestroy(PIXAC**)</code>
//       */
//      void pixacompDestroy(PointerByReference ppixac);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompAddPix(PIXAC*, PIX*, l_int32)</code>
//       */
//      int pixacompAddPix(PixaComp pixac, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompAddPixcomp(PIXAC*, PIXC*, l_int32)</code>
//       */
//      int pixacompAddPixcomp(PixaComp pixac, PixComp pixc, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompReplacePix(PIXAC*, l_int32, PIX*, l_int32)</code>
//       */
//      int pixacompReplacePix(PixaComp pixac, int index, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompReplacePixcomp(PIXAC*, l_int32, PIXC*)</code>
//       */
//      int pixacompReplacePixcomp(PixaComp pixac, int index, PixComp pixc);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompAddBox(PIXAC*, BOX*, l_int32)</code>
//       */
//      int pixacompAddBox(PixaComp pixac, Box box, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 pixacompGetCount(PIXAC*)</code>
//       */
//      int pixacompGetCount(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>PIXC* pixacompGetPixcomp(PIXAC*, l_int32, l_int32)</code>
//       */
//      PixComp pixacompGetPixcomp(PixaComp pixac, int index, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIX* pixacompGetPix(PIXAC*, l_int32)</code>
//       */
//      Pix pixacompGetPix(PixaComp pixac, int index);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompGetPixDimensions(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixacompGetPixDimensions(PixaComp pixac, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);
//      /**
//       * Original signature :
//       * <code>BOXA* pixacompGetBoxa(PIXAC*, l_int32)</code>
//       */
//      Boxa pixacompGetBoxa(PixaComp pixac, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompGetBoxaCount(PIXAC*)</code>
//       */
//      int pixacompGetBoxaCount(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>BOX* pixacompGetBox(PIXAC*, l_int32, l_int32)</code>
//       */
//      Box pixacompGetBox(PixaComp pixac, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompGetBoxGeometry(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixacompGetBoxGeometry(PixaComp pixac, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//  
//      /**
//       * Original signature : <code>l_int32 pixacompGetOffset(PIXAC*)</code>
//       */
//      int pixacompGetOffset(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompSetOffset(PIXAC*, l_int32)</code>
//       */
//      int pixacompSetOffset(PixaComp pixac, int offset);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaCreateFromPixacomp(PIXAC*, l_int32)</code>
//       */
//      Pixa pixaCreateFromPixacomp(PixaComp pixac, int accesstype);
    /**
     * Original signature :
     * <code>l_ok pixacompJoin(PIXAC*, PIXAC*, l_int32, l_int32)</code>
     */
    int pixacompJoin(PixaComp pixacd, PixaComp pixacs, int istart, int iend);

    /**
     * Original signature :
     * <code>PIXAC* pixacompInterleave(PIXAC*, PIXAC*)</code>
     */
    PixaComp pixacompInterleave(PixaComp pixac1, PixaComp pixac2);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompRead(const char*)</code>
//       */
//      PixaComp pixacompRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompReadStream(FILE*)</code>
//       */
//      PixaComp pixacompReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXAC* pixacompReadMem(const l_uint8*, size_t)</code>
     */
    PixaComp pixacompReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok pixacompWrite(const char*, PIXAC*)</code>
//       */
//      int pixacompWrite(String filename, PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompWriteStream(FILE*, PIXAC*)</code>
//       */
//      int pixacompWriteStream(FILE fp, PixaComp pixac);
    /**
     * Original signature :
     * <code>l_ok pixacompWriteMem(l_uint8**, size_t*, PIXAC*)</code>
     */
    int pixacompWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixaComp pixac);

//      /**
//       * Original signature :
//       * <code>l_ok pixacompConvertToPdf(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
//       */
//      int pixacompConvertToPdf(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok pixacompConvertToPdfData(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
//       */
//      int pixacompConvertToPdfData(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

//        /**
//        * Original signature : <code>l_ok pixacompFastConvertToPdfData(PIXAC*, const char*, l_uint8**, size_t*)</code>
//        */
//        int pixacompFastConvertToPdfData(PixaComp pixac, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

//      /**
//       * Original signature :
//       * <code>l_ok pixacompWriteStreamInfo(FILE*, PIXAC*, const char*)</code>
//       */
//      int pixacompWriteStreamInfo(FILE fp, PixaComp pixac, String text);
//      /**
//       * Original signature :
//       * <code>l_ok pixcompWriteStreamInfo(FILE*, PIXC*, const char*)</code>
//       */
//      int pixcompWriteStreamInfo(FILE fp, PixComp pixc, String text);
//      /**
//       * Original signature :
//       * <code>PIX* pixacompDisplayTiledAndScaled(PIXAC*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixacompDisplayTiledAndScaled(PixaComp pixac, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
//    
//    /**
//     * Original signature : <code>l_ok pixacompWriteFiles(PIXAC*, const char*)</code>
//     */
//    int pixacompWriteFiles(PixaComp pixac, String subdir);
//
//    /**
//     * Original signature : <code>l_ok pixcompWriteFile(const char*, PIXC*)</code>
//     */
//    int pixcompWriteFile(String rootname, PixComp pixc);
     
    /**
     * Original signature :
     * <code>PIX* pixThreshold8(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixThreshold8(Pix pixs, int d, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRemoveColormapGeneral(PIX*, l_int32, l_int32)</code>
     */
    Pix pixRemoveColormapGeneral(Pix pixs, int type, int ifnocmap);

    /**
     * Original signature :
     * <code>PIX* pixRemoveColormap(PIX*, l_int32)</code>
     */
    Pix pixRemoveColormap(Pix pixs, int type);

    /**
     * Original signature : <code>l_ok pixAddGrayColormap8(PIX*)</code>
     */
    int pixAddGrayColormap8(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixAddMinimalGrayColormap8(PIX*)</code>
     */
    Pix pixAddMinimalGrayColormap8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToLuminance(PIX*)</code>
     */
    Pix pixConvertRGBToLuminance(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGray(PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixConvertRGBToGray(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature : <code>PIX* pixConvertRGBToGrayFast(PIX*)</code>
     */
    Pix pixConvertRGBToGrayFast(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayMinMax(PIX*, l_int32)</code>
     */
    Pix pixConvertRGBToGrayMinMax(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGraySatBoost(PIX*, l_int32)</code>
     */
    Pix pixConvertRGBToGraySatBoost(Pix pixs, int refval);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayArb(PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixConvertRGBToGrayArb(Pix pixs, float rc, float gc, float bc);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToBinaryArb(PIX*, l_float32, l_float32, l_float32, l_int32, l_int32)</code>
     */
    Pix pixConvertRGBToBinaryArb(Pix pixs, float rc, float gc, float bc, int thresh, int relation);

    /**
     * Original signature : <code>PIX* pixConvertGrayToColormap(PIX*)</code>
     */
    Pix pixConvertGrayToColormap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToColormap8(PIX*, l_int32)</code>
     */
    Pix pixConvertGrayToColormap8(Pix pixs, int mindepth);

    /**
     * Original signature :
     * <code>PIX* pixColorizeGray(PIX*, l_uint32, l_int32)</code>
     */
    Pix pixColorizeGray(Pix pixs, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToColormap(PIX*, l_int32)</code>
     */
    Pix pixConvertRGBToColormap(Pix pixs, int ditherflag);

    /**
     * Original signature : <code>PIX* pixConvertCmapTo1(PIX*)</code>
     */
    Pix pixConvertCmapTo1(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixQuantizeIfFewColors(PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    int pixQuantizeIfFewColors(Pix pixs, int maxcolors, int mingraycolors, int octlevel, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixConvert16To8(PIX*, l_int32)</code>
     */
    Pix pixConvert16To8(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToFalseColor(PIX*, l_float32)</code>
     */
    Pix pixConvertGrayToFalseColor(Pix pixs, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixUnpackBinary(PIX*, l_int32, l_int32)</code>
     */
    Pix pixUnpackBinary(Pix pixs, int depth, int invert);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To16(PIX*, PIX*, l_uint16, l_uint16)</code>
     */
    Pix pixConvert1To16(Pix pixd, Pix pixs, short val0, short val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To32(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    Pix pixConvert1To32(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To2Cmap(PIX*)</code>
     */
    Pix pixConvert1To2Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To2(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvert1To2(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To4Cmap(PIX*)</code>
     */
    Pix pixConvert1To4Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To4(PIX*, PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvert1To4(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To8Cmap(PIX*)</code>
     */
    Pix pixConvert1To8Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To8(PIX*, PIX*, l_uint8, l_uint8)</code>
     */
    Pix pixConvert1To8(Pix pixd, Pix pixs, byte val0, byte val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert2To8(PIX*, l_uint8, l_uint8, l_uint8, l_uint8, l_int32)</code>
     */
    Pix pixConvert2To8(Pix pixs, byte val0, byte val1, byte val2, byte val3, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert4To8(PIX*, l_int32)</code>
     */
    Pix pixConvert4To8(Pix pixs, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert8To16(PIX*, l_int32)</code>
     */
    Pix pixConvert8To16(Pix pixs, int leftshift);
        
    /**
     * Original signature : <code>PIX* pixConvertTo2(PIX*)</code>
     */
    Pix pixConvertTo2(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert8To2(PIX*)</code>
     */
    Pix pixConvert8To2(Pix pix);

    /**
     * Original signature : <code>PIX* pixConvertTo4(PIX*)</code>
     */
    Pix pixConvertTo4(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert8To4(PIX*)</code>
     */
    Pix pixConvert8To4(Pix pix);

    /**
     * Original signature : <code>PIX* pixConvertTo1(PIX*, l_int32)</code>
     */
    Pix pixConvertTo1(Pix pixs, int threshold);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo1BySampling(PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvertTo1BySampling(Pix pixs, int factor, int threshold);

    /**
     * Original signature : <code>PIX* pixConvertTo8(PIX*, l_int32)</code>
     */
    Pix pixConvertTo8(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8BySampling(PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvertTo8BySampling(Pix pixs, int factor, int cmapflag);
   
    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Colormap(PIX*, l_int32)</code>
     */
    Pix pixConvertTo8Colormap(Pix pixs, int dither);

    /**
     * Original signature : <code>PIX* pixConvertTo16(PIX*)</code>
     */
    Pix pixConvertTo16(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertTo32(PIX*)</code>
     */
    Pix pixConvertTo32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo32BySampling(PIX*, l_int32)</code>
     */
    Pix pixConvertTo32BySampling(Pix pixs, int factor);

    /**
     * Original signature : <code>PIX* pixConvert8To32(PIX*)</code>
     */
    Pix pixConvert8To32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Or32(PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvertTo8Or32(Pix pixs, int copyflag, int warnflag);

    /**
     * Original signature : <code>PIX* pixConvert24To32(PIX*)</code>
     */
    Pix pixConvert24To32(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert32To24(PIX*)</code>
     */
    Pix pixConvert32To24(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert32To16(PIX*, l_int32)</code>
     */
    Pix pixConvert32To16(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvert32To8(PIX*, l_int32, l_int32)</code>
     */
    Pix pixConvert32To8(Pix pixs, int type16, int type8);

    /**
     * Original signature : <code>PIX* pixRemoveAlpha(PIX*)</code>
     */
    Pix pixRemoveAlpha(Pix pixs);

    /**
     * Original signature : <code>PIX* pixAddAlphaTo1bpp(PIX*, PIX*)</code>
     */
    Pix pixAddAlphaTo1bpp(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertLossless(PIX*, l_int32)</code>
     */
    Pix pixConvertLossless(Pix pixs, int d);

    /**
     * Original signature : <code>PIX* pixConvertForPSWrap(PIX*)</code>
     */
    Pix pixConvertForPSWrap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    Pix pixConvertToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    Pix pixConvertGrayToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertColorToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    Pix pixConvertColorToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature : <code>void l_setNeutralBoostVal(l_int32)</code>
     */
    void l_setNeutralBoostVal(int val);

//      /**
//       * Original signature :
//       * <code>PIX* pixConnCompTransform(PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixConnCompTransform(Pix pixs, int connect, int depth);
//      /**
//       * Original signature :
//       * <code>PIX* pixConnCompAreaTransform(PIX*, l_int32)</code>
//       */
//      Pix pixConnCompAreaTransform(Pix pixs, int connect);
    /**
     * Original signature :
     * <code>l_ok pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code>
     */
    int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntBuffer pncc);

    /**
     * Original signature :
     * <code>l_ok pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code>
     */
    int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntByReference pncc);

    /**
     * Original signature :
     * <code>l_int32 pixConnCompIncrAdd(PIX*, PTAA*, l_int32*, l_float32, l_float32, l_int32)</code>
     */
    int pixConnCompIncrAdd(Pix pixs, Ptaa ptaa, IntBuffer pncc, float x, float y, int debug);

    /**
     * Original signature :
     * <code>l_ok pixGetSortedNeighborValues(PIX*, l_int32, l_int32, l_int32, l_int32**, l_int32*)</code>
     */
    int pixGetSortedNeighborValues(Pix pixs, int x, int y, int conn, PointerByReference pneigh, IntBuffer pnvals);
//  
//      /**
//       * Original signature : <code>PIX* pixLocToColorTransform(PIX*)</code>
//       */
//      Pix pixLocToColorTransform(Pix pixs);

//      /**
//       * Original signature :
//       * <code>PIXTILING* pixTilingCreate(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      PixTiling pixTilingCreate(Pix pixs, int nx, int ny, int w, int h, int xoverlap, int yoverlap);
//  
//      /**
//       * Original signature : <code>void pixTilingDestroy(PIXTILING**)</code>
//       */
//      void pixTilingDestroy(PointerByReference ppt);
//      /**
//       * Original signature :
//       * <code>l_ok pixTilingGetCount(PIXTILING*, l_int32*, l_int32*)</code>
//       */
//      int pixTilingGetCount(PixTiling pt, IntBuffer pnx, IntBuffer pny);
//      /**
//       * Original signature :
//       * <code>l_ok pixTilingGetSize(PIXTILING*, l_int32*, l_int32*)</code>
//       */
//      int pixTilingGetSize(PixTiling pt, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>PIX* pixTilingGetTile(PIXTILING*, l_int32, l_int32)</code>
//       */
//      Pix pixTilingGetTile(PixTiling pt, int i, int j);
//      /**
//       * Original signature :
//       * <code>l_ok pixTilingNoStripOnPaint(PIXTILING*)</code>
//       */
//      int pixTilingNoStripOnPaint(PixTiling pt);
//      /**
//       * Original signature :
//       * <code>l_ok pixTilingPaintTile(PIX*, l_int32, l_int32, PIX*, PIXTILING*)</code>
//       */
//      int pixTilingPaintTile(Pix pixd, int i, int j, Pix pixs, PixTiling pt);
    /**
     * Original signature : <code>PIX* pixReadStreamPng(FILE*)</code>
     */
    Pix pixReadStreamPng(FILE fp);

    /**
     * Original signature :
     * <code>l_ok readHeaderPng(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderPng(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok freadHeaderPng(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int freadHeaderPng(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemPng(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemPng(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 fgetPngResolution(FILE*, l_int32*, l_int32*)</code>
     */
    int fgetPngResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok isPngInterlaced(const char*, l_int32*)</code>
     */
    int isPngInterlaced(String filename, IntBuffer pinterlaced);

    /**
     * Original signature :
     * <code>l_ok fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code>
     */
    int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntBuffer ptransparency);

    /**
     * Original signature :
     * <code>l_ok fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code>
     */
    int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntByReference ptransparency);

    /**
     * Original signature :
     * <code>l_ok pixWritePng(const char*, PIX*, l_float32)</code>
     */
    int pixWritePng(String filename, Pix pix, float gamma);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamPng(FILE*, PIX*, l_float32)</code>
//       */
//      int pixWriteStreamPng(FILE fp, Pix pix, float gamma);
    /**
     * Original signature :
     * <code>l_ok pixSetZlibCompression(PIX*, l_int32)</code>
     */
    int pixSetZlibCompression(Pix pix, int compval);

    /**
     * Original signature :
     * <code>void l_pngSetReadStrip16To8(l_int32)</code>
     */
    void l_pngSetReadStrip16To8(int flag);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPng(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemPng(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPng(l_uint8**, size_t*, PIX*, l_float32)</code>
     */
    int pixWriteMemPng(PointerByReference pfiledata, NativeSizeByReference pfilesize, Pix pix, float gamma);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamPnm(FILE*)</code>
//       */
//      Pix pixReadStreamPnm(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_ok readHeaderPnm(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int readHeaderPnm(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);
//      /**
//       * Original signature :
//       * <code>l_ok freadHeaderPnm(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int freadHeaderPnm(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamPnm(FILE*, PIX*)</code>
//       */
//      int pixWriteStreamPnm(FILE fp, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamAsciiPnm(FILE*, PIX*)</code>
//       */
//      int pixWriteStreamAsciiPnm(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>l_ok pixWriteStreamPam(FILE*, PIX*)</code>
     */
    int pixWriteStreamPam(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPnm(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemPnm(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemPnm(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemPnm(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteMemPnm(l_uint8**, size_t*, PIX*)</code>
//       */
//      int pixWriteMemPnm(PointerByReference pdata, NativeSizeByReference psize, Pix pix);
    /**
     * Original signature :
     * <code>l_ok pixWriteMemPam(l_uint8**, size_t*, PIX*)</code>
     */
    int pixWriteMemPam(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
//       */
//      Pix pixProjectiveSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveSampled(PIX*, l_float32*, l_int32)</code>
//       */
//      Pix pixProjectiveSampled(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePta(PIX*, PTA*, PTA*, l_int32)</code>
//       */
//      Pix pixProjectivePta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjective(PIX*, l_float32*, l_int32)</code>
//       */
//      Pix pixProjective(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
//       */
//      Pix pixProjectivePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveColor(PIX*, l_float32*, l_uint32)</code>
//       */
//      Pix pixProjectiveColor(Pix pixs, FloatBuffer vc, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
//       */
//      Pix pixProjectivePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveGray(PIX*, l_float32*, l_uint8)</code>
//       */
//      Pix pixProjectiveGray(Pix pixs, FloatBuffer vc, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixProjectivePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);
//      /**
//       * Original signature :
//       * <code>l_ok getProjectiveXformCoeffs(PTA*, PTA*, l_float32**)</code>
//       */
//      int getProjectiveXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_ok projectiveXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int projectiveXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_ok projectiveXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
//       */
//      int projectiveXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_ok convertFilesToPS(const char*, const char*, l_int32, const char*)</code>
//       */
//      int convertFilesToPS(String dirin, String substr, int res, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayConvertFilesToPS(SARRAY*, l_int32, const char*)</code>
//       */
//      int sarrayConvertFilesToPS(Sarray sa, int res, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok convertFilesFittedToPS(const char*, const char*, l_float32, l_float32, const char*)</code>
//       */
//      int convertFilesFittedToPS(String dirin, String substr, float xpts, float ypts, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayConvertFilesFittedToPS(SARRAY*, l_float32, l_float32, const char*)</code>
//       */
//      int sarrayConvertFilesFittedToPS(Sarray sa, float xpts, float ypts, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok writeImageCompressedToPSFile(const char*, const char*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int writeImageCompressedToPSFile(String filein, String fileout, int res, IntBuffer pfirstfile, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok convertSegmentedPagesToPS(const char*, const char*, l_int32, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, const char*)</code>
//       */
//      int convertSegmentedPagesToPS(String pagedir, String pagestr, int page_numpre, String maskdir, String maskstr, int mask_numpre, int numpost, int maxnum, float textscale, float imagescale, int threshold, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteSegmentedPageToPS(PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, const char*)</code>
//       */
//      int pixWriteSegmentedPageToPS(Pix pixs, Pix pixm, float textscale, float imagescale, int threshold, int pageno, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteMixedToPS(PIX*, PIX*, l_float32, l_int32, const char*)</code>
//       */
//      int pixWriteMixedToPS(Pix pixb, Pix pixc, float scale, int pageno, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok convertToPSEmbed(const char*, const char*, l_int32)</code>
//       */
//      int convertToPSEmbed(String filein, String fileout, int level);
//      /**
//       * Original signature :
//       * <code>l_ok pixaWriteCompressedToPS(PIXA*, const char*, l_int32, l_int32)</code>
//       */
//      int pixaWriteCompressedToPS(Pixa pixa, String fileout, int res, int level);
//      /**
//       * Original signature :
//       * <code>l_ok pixWritePSEmbed(const char*, const char*)</code>
//       */
//      int pixWritePSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamPS(FILE*, PIX*, BOX*, l_int32, l_float32)</code>
//       */
//      int pixWriteStreamPS(FILE fp, Pix pix, Box box, int res, float scale);
//      /**
//       * Original signature :
//       * <code>char* pixWriteStringPS(PIX*, BOX*, l_int32, l_float32)</code>
//       */
//      Pointer pixWriteStringPS(Pix pixs, Box box, int res, float scale);
    /**
     * Original signature :
     * <code>char* generateUncompressedPS(char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code>
     */
    Pointer generateUncompressedPS(ByteBuffer hexdata, int w, int h, int d, int psbpl, int bps, float xpt, float ypt, float wpt, float hpt, int boxflag);

//      /**
//       * Original signature :
//       * <code>void getScaledParametersPS(BOX*, l_int32, l_int32, l_int32, l_float32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//       */
//      void getScaledParametersPS(Box box, int wpix, int hpix, int res, float scale, FloatBuffer pxpt, FloatBuffer pypt, FloatBuffer pwpt, FloatBuffer phpt);
    /**
     * Original signature :
     * <code>void convertByteToHexAscii(l_uint8, char*, char*)</code>
     */
    void convertByteToHexAscii(byte byteval, ByteBuffer pnib1, ByteBuffer pnib2);

//      /**
//       * Original signature :
//       * <code>l_ok convertJpegToPSEmbed(const char*, const char*)</code>
//       */
//      int convertJpegToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok convertJpegToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
//       */
//      int convertJpegToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok convertJpegToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
//       */
//      int convertJpegToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateJpegPS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Pointer generateJpegPS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok convertG4ToPSEmbed(const char*, const char*)</code>
//       */
//      int convertG4ToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok convertG4ToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
//       */
//      int convertG4ToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int maskflag, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok convertG4ToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
//       */
//      int convertG4ToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int maskflag, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateG4PS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32, l_int32)</code>
//       */
//      Pointer generateG4PS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int maskflag, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok convertTiffMultipageToPS(const char*, const char*, l_float32)</code>
//       */
//      int convertTiffMultipageToPS(String filein, String fileout, float fillfract);
//      /**
//       * Original signature :
//       * <code>l_ok convertFlateToPSEmbed(const char*, const char*)</code>
//       */
//      int convertFlateToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok convertFlateToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
//       */
//      int convertFlateToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok convertFlateToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
//       */
//      int convertFlateToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateFlatePS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Pointer generateFlatePS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteMemPS(l_uint8**, size_t*, PIX*, BOX*, l_int32, l_float32)</code>
//       */
//      int pixWriteMemPS(PointerByReference pdata, NativeSizeByReference psize, Pix pix, Box box, int res, float scale);
//      /**
//       * Original signature :
//       * <code>l_int32 getResLetterPage(l_int32, l_int32, l_float32)</code>
//       */
//      int getResLetterPage(int w, int h, float fillfract);
//      /**
//       * Original signature :
//       * <code>l_int32 getResA4Page(l_int32, l_int32, l_float32)</code>
//       */
//      int getResA4Page(int w, int h, float fillfract);
//  
//      /**
//       * Original signature : <code>void l_psWriteBoundingBox(l_int32)</code>
//       */
//      void l_psWriteBoundingBox(int flag);
//  
//      /**
//       * Original signature : <code>PTA* ptaCreate(l_int32)</code>
//       */
//      Pta ptaCreate(int n);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCreateFromNuma(NUMA*, NUMA*)</code>
//       */
//      Pta ptaCreateFromNuma(Numa nax, Numa nay);
//  
//      /**
//       * Original signature : <code>void ptaDestroy(PTA**)</code>
//       */
//      void ptaDestroy(PointerByReference ppta);
//  
//      /**
//       * Original signature : <code>PTA* ptaCopy(PTA*)</code>
//       */
//      Pta ptaCopy(Pta pta);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCopyRange(PTA*, l_int32, l_int32)</code>
//       */
//      Pta ptaCopyRange(Pta ptas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PTA* ptaClone(PTA*)</code>
//       */
//      Pta ptaClone(Pta pta);
//  
//      /**
//       * Original signature : <code>l_ok ptaEmpty(PTA*)</code>
//       */
//      int ptaEmpty(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_ok ptaAddPt(PTA*, l_float32, l_float32)</code>
//       */
//      int ptaAddPt(Pta pta, float x, float y);
//      /**
//       * Original signature :
//       * <code>l_ok ptaInsertPt(PTA*, l_int32, l_int32, l_int32)</code>
//       */
//      int ptaInsertPt(Pta pta, int index, int x, int y);
//  
//      /**
//       * Original signature : <code>l_ok ptaRemovePt(PTA*, l_int32)</code>
//       */
//      int ptaRemovePt(Pta pta, int index);
//  
//      /**
//       * Original signature : <code>l_int32 ptaGetRefcount(PTA*)</code>
//       */
//      int ptaGetRefcount(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaChangeRefcount(PTA*, l_int32)</code>
//       */
//      int ptaChangeRefcount(Pta pta, int delta);
//  
//      /**
//       * Original signature : <code>l_int32 ptaGetCount(PTA*)</code>
//       */
//      int ptaGetCount(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetPt(PTA*, l_int32, l_float32*, l_float32*)</code>
//       */
//      int ptaGetPt(Pta pta, int index, FloatBuffer px, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetIPt(PTA*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int ptaGetIPt(Pta pta, int index, IntBuffer px, IntBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok ptaSetPt(PTA*, l_int32, l_float32, l_float32)</code>
//       */
//      int ptaSetPt(Pta pta, int index, float x, float y);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetArrays(PTA*, NUMA**, NUMA**)</code>
//       */
//      int ptaGetArrays(Pta pta, PointerByReference pnax, PointerByReference pnay);
//  
//      /**
//       * Original signature : <code>PTA* ptaRead(const char*)</code>
//       */
//      Pta ptaRead(String filename);
//  
//      /**
//       * Original signature : <code>PTA* ptaReadStream(FILE*)</code>
//       */
//      Pta ptaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PTA* ptaReadMem(const l_uint8*, size_t)</code>
     */
    Pta ptaReadMem(ByteBuffer data, NativeSize size);
    
//    /**
//     * Original signature : <code>l_ok ptaWriteDebug(const char*, PTA*, l_int32)</code>
//     */
//    int ptaWriteDebug(String filename, Pta pta, int type);
 
//      /**
//       * Original signature :
//       * <code>l_ok ptaWrite(const char*, PTA*, l_int32)</code>
//       */
//      int ptaWrite(String filename, Pta pta, int type);
//      /**
//       * Original signature :
//       * <code>l_ok ptaWriteStream(FILE*, PTA*, l_int32)</code>
//       */
//      int ptaWriteStream(FILE fp, Pta pta, int type);
    /**
     * Original signature :
     * <code>l_ok ptaWriteMem(l_uint8**, size_t*, PTA*, l_int32)</code>
     */
    int ptaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pta pta, int type);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaCreate(l_int32)</code>
//       */
//      Ptaa ptaaCreate(int n);
//  
//      /**
//       * Original signature : <code>void ptaaDestroy(PTAA**)</code>
//       */
//      void ptaaDestroy(PointerByReference pptaa);

//      /**
//       * Original signature :
//       * <code>l_ok ptaaAddPta(PTAA*, PTA*, l_int32)</code>
//       */
//      int ptaaAddPta(Ptaa ptaa, Pta pta, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 ptaaGetCount(PTAA*)</code>
//       */
//      int ptaaGetCount(Ptaa ptaa);
//      /**
//       * Original signature :
//       * <code>PTA* ptaaGetPta(PTAA*, l_int32, l_int32)</code>
//       */
//      Pta ptaaGetPta(Ptaa ptaa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_ok ptaaGetPt(PTAA*, l_int32, l_int32, l_float32*, l_float32*)</code>
//       */
//      int ptaaGetPt(Ptaa ptaa, int ipta, int jpt, FloatBuffer px, FloatBuffer py);
//  
//      /**
//       * Original signature : <code>l_ok ptaaInitFull(PTAA*, PTA*)</code>
//       */
//      int ptaaInitFull(Ptaa ptaa, Pta pta);
//      /**
//       * Original signature :
//       * <code>l_ok ptaaReplacePta(PTAA*, l_int32, PTA*)</code>
//       */
//      int ptaaReplacePta(Ptaa ptaa, int index, Pta pta);
//      /**
//       * Original signature :
//       * <code>l_ok ptaaAddPt(PTAA*, l_int32, l_float32, l_float32)</code>
//       */
//      int ptaaAddPt(Ptaa ptaa, int ipta, float x, float y);
//  
//      /**
//       * Original signature : <code>l_ok ptaaTruncate(PTAA*)</code>
//       */
//      int ptaaTruncate(Ptaa ptaa);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaRead(const char*)</code>
//       */
//      Ptaa ptaaRead(String filename);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaReadStream(FILE*)</code>
//       */
//      Ptaa ptaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PTAA* ptaaReadMem(const l_uint8*, size_t)</code>
     */
    Ptaa ptaaReadMem(ByteBuffer data, NativeSize size);
    
//    /**
//     * Original signature : <code>l_ok ptaaWriteDebug(const char*, PTAA*, l_int32)</code>
//     */
//    int ptaaWriteDebug(String filename, Ptaa ptaa, int type);

//      /**
//       * Original signature :
//       * <code>l_ok ptaaWrite(const char*, PTAA*, l_int32)</code>
//       */
//      int ptaaWrite(String filename, Ptaa ptaa, int type);
//      /**
//       * Original signature :
//       * <code>l_ok ptaaWriteStream(FILE*, PTAA*, l_int32)</code>
//       */
//      int ptaaWriteStream(FILE fp, Ptaa ptaa, int type);
    /**
     * Original signature :
     * <code>l_ok ptaaWriteMem(l_uint8**, size_t*, PTAA*, l_int32)</code>
     */
    int ptaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Ptaa ptaa, int type);
//  
//      /**
//       * Original signature : <code>PTA* ptaSubsample(PTA*, l_int32)</code>
//       */
//      Pta ptaSubsample(Pta ptas, int subfactor);

//      /**
//       * Original signature :
//       * <code>l_ok ptaJoin(PTA*, PTA*, l_int32, l_int32)</code>
//       */
//      int ptaJoin(Pta ptad, Pta ptas, int istart, int iend);
//      /**
//       * Original signature :
//       * <code>l_ok ptaaJoin(PTAA*, PTAA*, l_int32, l_int32)</code>
//       */
//      int ptaaJoin(Ptaa ptaad, Ptaa ptaas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PTA* ptaReverse(PTA*, l_int32)</code>
//       */
//      Pta ptaReverse(Pta ptas, int type);
//  
//      /**
//       * Original signature : <code>PTA* ptaTranspose(PTA*)</code>
//       */
//      Pta ptaTranspose(Pta ptas);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCyclicPerm(PTA*, l_int32, l_int32)</code>
//       */
//      Pta ptaCyclicPerm(Pta ptas, int xs, int ys);
    /**
     * Original signature :
     * <code>PTA* ptaSelectRange(PTA*, l_int32, l_int32)</code>
     */
    Pta ptaSelectRange(Pta ptas, int first, int last);
//  
//      /**
//       * Original signature : <code>BOX* ptaGetBoundingRegion(PTA*)</code>
//       */
//      Box ptaGetBoundingRegion(Pta pta);

//      /**
//       * Original signature :
//       * <code>l_ok ptaGetRange(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int ptaGetRange(Pta pta, FloatBuffer pminx, FloatBuffer pmaxx, FloatBuffer pminy, FloatBuffer pmaxy);
//  
//      /**
//       * Original signature : <code>PTA* ptaGetInsideBox(PTA*, BOX*)</code>
//       */
//      Pta ptaGetInsideBox(Pta ptas, Box box);
//  
//      /**
//       * Original signature : <code>PTA* pixFindCornerPixels(PIX*)</code>
//       */
//      Pta pixFindCornerPixels(Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaContainsPt(PTA*, l_int32, l_int32)</code>
//       */
//      int ptaContainsPt(Pta pta, int x, int y);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaTestIntersection(PTA*, PTA*)</code>
//       */
//      int ptaTestIntersection(Pta pta1, Pta pta2);
//      /**
//       * Original signature :
//       * <code>PTA* ptaTransform(PTA*, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      Pta ptaTransform(Pta ptas, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaPtInsidePolygon(PTA*, l_float32, l_float32, l_int32*)</code>
//       */
//      int ptaPtInsidePolygon(Pta pta, float x, float y, IntBuffer pinside);
//      /**
//       * Original signature :
//       * <code>l_float32 l_angleBetweenVectors(l_float32, l_float32, l_float32, l_float32)</code>
//       */
//      float l_angleBetweenVectors(float x1, float y1, float x2, float y2);
    /**
     * Original signature :
     * <code>l_ok ptaGetMinMax(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    int ptaGetMinMax(Pta pta, FloatBuffer pxmin, FloatBuffer pymin, FloatBuffer pxmax, FloatBuffer pymax);

    /**
     * Original signature :
     * <code>PTA* ptaSelectByValue(PTA*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    Pta ptaSelectByValue(Pta ptas, float xth, float yth, int type, int relation);

    /**
     * Original signature : <code>PTA* ptaCropToMask(PTA*, PIX*)</code>
     */
    Pta ptaCropToMask(Pta ptas, Pix pixm);

//      /**
//       * Original signature :
//       * <code>l_ok ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetLinearLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetLinearLSF(Pta pta, FloatByReference pa, FloatByReference pb, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetQuadraticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetQuadraticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetCubicLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetCubicLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetQuarticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, FloatBuffer pe, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaGetQuarticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, FloatByReference pe, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
//       */
//      int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_ok applyLinearFit(l_float32, l_float32, l_float32, l_float32*)</code>
//       */
//      int applyLinearFit(float a, float b, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok applyQuadraticFit(l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
//       */
//      int applyQuadraticFit(float a, float b, float c, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok applyCubicFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
//       */
//      int applyCubicFit(float a, float b, float c, float d, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok applyQuarticFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
//       */
//      int applyQuarticFit(float a, float b, float c, float d, float e, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_ok pixPlotAlongPta(PIX*, PTA*, l_int32, const char*)</code>
//       */
//      int pixPlotAlongPta(Pix pixs, Pta pta, int outformat, String title);
//      /**
//       * Original signature :
//       * <code>PTA* ptaGetPixelsFromPix(PIX*, BOX*)</code>
//       */
//      Pta ptaGetPixelsFromPix(Pix pixs, Box box);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateFromPta(PTA*, l_int32, l_int32)</code>
//       */
//      Pix pixGenerateFromPta(Pta pta, int w, int h);
//      /**
//       * Original signature :
//       * <code>PTA* ptaGetBoundaryPixels(PIX*, l_int32)</code>
//       */
//      Pta ptaGetBoundaryPixels(Pix pixs, int type);
//      /**
//       * Original signature :
//       * <code>PTAA* ptaaGetBoundaryPixels(PIX*, l_int32, l_int32, BOXA**, PIXA**)</code>
//       */
//      Ptaa ptaaGetBoundaryPixels(Pix pixs, int type, int connectivity, PointerByReference pboxa, PointerByReference ppixa);
//    /**
//     * Original signature :
//     * <code>PTAA* ptaaIndexLabeledPixels(PIX*, l_int32*)</code>
//     */
//    Ptaa ptaaIndexLabeledPixels(Pix pixs, IntBuffer pncc);
//
//    /**
//     * Original signature :
//     * <code>PTA* ptaGetNeighborPixLocs(PIX*, l_int32, l_int32, l_int32)</code>
//     */
//    Pta ptaGetNeighborPixLocs(Pix pixs, int x, int y, int conn);
//
//    /**
//     * Original signature : <code>PTA* numaConvertToPta1(NUMA*)</code>
//     */
//    Pta numaConvertToPta1(Numa na);
//
//    /**
//     * Original signature :
//     * <code>PTA* numaConvertToPta2(NUMA*, NUMA*)</code>
//     */
//    Pta numaConvertToPta2(Numa nax, Numa nay);
//
//    /**
//     * Original signature :
//     * <code>l_ok ptaConvertToNuma(PTA*, NUMA**, NUMA**)</code>
//     */
//    int ptaConvertToNuma(Pta pta, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPta(PIX*, PIX*, PTA*)</code>
//       */
//      Pix pixDisplayPta(Pix pixd, Pix pixs, Pta pta);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPtaaPattern(PIX*, PIX*, PTAA*, PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixDisplayPtaaPattern(Pix pixd, Pix pixs, Ptaa ptaa, Pix pixp, int cx, int cy);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPtaPattern(PIX*, PIX*, PTA*, PIX*, l_int32, l_int32, l_uint32)</code>
//       */
//      Pix pixDisplayPtaPattern(Pix pixd, Pix pixs, Pta pta, Pix pixp, int cx, int cy, int color);
//      /**
//       * Original signature :
//       * <code>PTA* ptaReplicatePattern(PTA*, PIX*, PTA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pta ptaReplicatePattern(Pta ptas, Pix pixp, Pta ptap, int cx, int cy, int w, int h);
//  
//      /**
//       * Original signature : <code>PIX* pixDisplayPtaa(PIX*, PTAA*)</code>
//       */
//      Pix pixDisplayPtaa(Pix pixs, Ptaa ptaa);
//      /**
//       * Original signature :
//       * <code>PTA* ptaSort(PTA*, l_int32, l_int32, NUMA**)</code>
//       */
//      Pta ptaSort(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);
//      /**
//       * Original signature :
//       * <code>l_ok ptaGetSortIndex(PTA*, l_int32, l_int32, NUMA**)</code>
//       */
//      int ptaGetSortIndex(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);
//  
//      /**
//       * Original signature : <code>PTA* ptaSortByIndex(PTA*, NUMA*)</code>
//       */
//      Pta ptaSortByIndex(Pta ptas, Numa naindex);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaSortByIndex(PTAA*, NUMA*)</code>
//       */
//      Ptaa ptaaSortByIndex(Ptaa ptaas, Numa naindex);
    /**
     * Original signature :
     * <code>l_ok ptaGetRankValue(PTA*, l_float32, PTA*, l_int32, l_float32*)</code>
     */
    int ptaGetRankValue(Pta pta, float fract, Pta ptasort, int sorttype, FloatBuffer pval);

    /**
     * Original signature : <code>PTA* ptaUnionByAset(PTA*, PTA*)</code>
     */
    Pta ptaUnionByAset(Pta pta1, Pta pta2);

    /**
     * Original signature : <code>PTA* ptaRemoveDupsByAset(PTA*)</code>
     */
    Pta ptaRemoveDupsByAset(Pta ptas);

    /**
     * Original signature :
     * <code>PTA* ptaIntersectionByAset(PTA*, PTA*)</code>
     */
    Pta ptaIntersectionByAset(Pta pta1, Pta pta2);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromPta(PTA*)</code>
     */
    L_Rbtree l_asetCreateFromPta(Pta pta);

    /**
     * Original signature : <code>PTA* ptaUnionByHash(PTA*, PTA*)</code>
     */
    Pta ptaUnionByHash(Pta pta1, Pta pta2);

    /**
     * Original signature :
     * <code>l_ok ptaRemoveDupsByHash(PTA*, PTA**, L_DNAHASH**)</code>
     */
    int ptaRemoveDupsByHash(Pta ptas, PointerByReference pptad, PointerByReference pdahash);

    /**
     * Original signature :
     * <code>PTA* ptaIntersectionByHash(PTA*, PTA*)</code>
     */
    Pta ptaIntersectionByHash(Pta pta1, Pta pta2);

    /**
     * Original signature :
     * <code>l_ok ptaFindPtByHash(PTA*, L_DNAHASH*, l_int32, l_int32, l_int32*)</code>
     */
    int ptaFindPtByHash(Pta pta, L_DnaHash dahash, int x, int y, IntBuffer pindex);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreateFromPta(PTA*)</code>
     */
    L_DnaHash l_dnaHashCreateFromPta(Pta pta);
//  
//      /**
//       * Original signature : <code>L_PTRA* ptraCreate(l_int32)</code>
//       */
//      L_Ptra ptraCreate(int n);

//      /**
//       * Original signature :
//       * <code>void ptraDestroy(L_PTRA**, l_int32, l_int32)</code>
//       */
//      void ptraDestroy(PointerByReference ppa, int freeflag, int warnflag);
//  
//      /**
//       * Original signature : <code>l_ok ptraAdd(L_PTRA*, void*)</code>
//       */
//      int ptraAdd(L_Ptra pa, Pointer item);
//      /**
//       * Original signature :
//       * <code>l_ok ptraInsert(L_PTRA*, l_int32, void*, l_int32)</code>
//       */
//      int ptraInsert(L_Ptra pa, int index, Pointer item, int shiftflag);
//      /**
//       * Original signature :
//       * <code>void* ptraRemove(L_PTRA*, l_int32, l_int32)</code>
//       */
//      Pointer ptraRemove(L_Ptra pa, int index, int flag);
//  
//      /**
//       * Original signature : <code>void* ptraRemoveLast(L_PTRA*)</code>
//       */
//      Pointer ptraRemoveLast(L_Ptra pa);
//      /**
//       * Original signature :
//       * <code>void* ptraReplace(L_PTRA*, l_int32, void*, l_int32)</code>
//       */
//      Pointer ptraReplace(L_Ptra pa, int index, Pointer item, int freeflag);
//      /**
//       * Original signature :
//       * <code>l_ok ptraSwap(L_PTRA*, l_int32, l_int32)</code>
//       */
//      int ptraSwap(L_Ptra pa, int index1, int index2);
//  
//      /**
//       * Original signature : <code>l_ok ptraCompactArray(L_PTRA*)</code>
//       */
//      int ptraCompactArray(L_Ptra pa);
//  
//      /**
//       * Original signature : <code>l_ok ptraReverse(L_PTRA*)</code>
//       */
//      int ptraReverse(L_Ptra pa);
//  
//      /**
//       * Original signature : <code>l_ok ptraJoin(L_PTRA*, L_PTRA*)</code>
//       */
//      int ptraJoin(L_Ptra pa1, L_Ptra pa2);
//      /**
//       * Original signature :
//       * <code>l_ok ptraGetMaxIndex(L_PTRA*, l_int32*)</code>
//       */
//      int ptraGetMaxIndex(L_Ptra pa, IntBuffer pmaxindex);
//      /**
//       * Original signature :
//       * <code>l_ok ptraGetActualCount(L_PTRA*, l_int32*)</code>
//       */
//      int ptraGetActualCount(L_Ptra pa, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>void* ptraGetPtrToItem(L_PTRA*, l_int32)</code>
//       */
//      Pointer ptraGetPtrToItem(L_Ptra pa, int index);
//  
//      /**
//       * Original signature : <code>L_PTRAA* ptraaCreate(l_int32)</code>
//       */
//      L_Ptraa ptraaCreate(int n);
//      /**
//       * Original signature :
//       * <code>void ptraaDestroy(L_PTRAA**, l_int32, l_int32)</code>
//       */
//      void ptraaDestroy(PointerByReference ppaa, int freeflag, int warnflag);
//      /**
//       * Original signature :
//       * <code>l_ok ptraaGetSize(L_PTRAA*, l_int32*)</code>
//       */
//      int ptraaGetSize(L_Ptraa paa, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_ok ptraaInsertPtra(L_PTRAA*, l_int32, L_PTRA*)</code>
//       */
//      int ptraaInsertPtra(L_Ptraa paa, int index, L_Ptra pa);
//      /**
//       * Original signature :
//       * <code>L_PTRA* ptraaGetPtra(L_PTRAA*, l_int32, l_int32)</code>
//       */
//      L_Ptra ptraaGetPtra(L_Ptraa paa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>L_PTRA* ptraaFlattenToPtra(L_PTRAA*)</code>
//       */
//      L_Ptra ptraaFlattenToPtra(L_Ptraa paa);
//      /**
//       * Original signature :
//       * <code>l_ok pixQuadtreeMean(PIX*, l_int32, PIX*, FPIXA**)</code>
//       */
//      int pixQuadtreeMean(Pix pixs, int nlevels, Pix pix_ma, PointerByReference pfpixa);
//      /**
//       * Original signature :
//       * <code>l_ok pixQuadtreeVariance(PIX*, l_int32, PIX*, DPIX*, FPIXA**, FPIXA**)</code>
//       */
//      int pixQuadtreeVariance(Pix pixs, int nlevels, Pix pix_ma, DPix dpix_msa, PointerByReference pfpixa_v, PointerByReference pfpixa_rv);
//      /**
//       * Original signature :
//       * <code>l_ok pixMeanInRectangle(PIX*, BOX*, PIX*, l_float32*)</code>
//       */
//      int pixMeanInRectangle(Pix pixs, Box box, Pix pixma, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok pixVarianceInRectangle(PIX*, BOX*, PIX*, DPIX*, l_float32*, l_float32*)</code>
//       */
//      int pixVarianceInRectangle(Pix pixs, Box box, Pix pix_ma, DPix dpix_msa, FloatBuffer pvar, FloatBuffer prvar);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaaQuadtreeRegions(l_int32, l_int32, l_int32)</code>
//       */
//      Boxaa boxaaQuadtreeRegions(int w, int h, int nlevels);
//      /**
//       * Original signature :
//       * <code>l_ok quadtreeGetParent(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code>
//       */
//      int quadtreeGetParent(FPixa fpixa, int level, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_ok quadtreeGetChildren(FPIXA*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
//       */
//      int quadtreeGetChildren(FPixa fpixa, int level, int x, int y, FloatBuffer pval00, FloatBuffer pval10, FloatBuffer pval01, FloatBuffer pval11);
//      /**
//       * Original signature :
//       * <code>l_int32 quadtreeMaxLevels(l_int32, l_int32)</code>
//       */
//      int quadtreeMaxLevels(int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* fpixaDisplayQuadtree(FPIXA*, l_int32, l_int32)</code>
//       */
//      Pix fpixaDisplayQuadtree(FPixa fpixa, int factor, int fontsize);
//  
//      /**
//       * Original signature : <code>L_QUEUE* lqueueCreate(l_int32)</code>
//       */
//      L_Queue lqueueCreate(int nalloc);
//      /**
//       * Original signature :
//       * <code>void lqueueDestroy(L_QUEUE**, l_int32)</code>
//       */
//      void lqueueDestroy(PointerByReference plq, int freeflag);
//  
//      /**
//       * Original signature : <code>l_ok lqueueAdd(L_QUEUE*, void*)</code>
//       */
//      int lqueueAdd(L_Queue lq, Pointer item);
//  
//      /**
//       * Original signature : <code>void* lqueueRemove(L_QUEUE*)</code>
//       */
//      Pointer lqueueRemove(L_Queue lq);
//  
//      /**
//       * Original signature : <code>l_int32 lqueueGetCount(L_QUEUE*)</code>
//       */
//      int lqueueGetCount(L_Queue lq);
//      /**
//       * Original signature :
//       * <code>l_ok lqueuePrint(FILE*, L_QUEUE*)</code>
//       */
//      int lqueuePrint(FILE fp, L_Queue lq);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilter(PIX*, l_int32, l_int32, l_float32)</code>
//       */
//      Pix pixRankFilter(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterRGB(PIX*, l_int32, l_int32, l_float32)</code>
//       */
//      Pix pixRankFilterRGB(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterGray(PIX*, l_int32, l_int32, l_float32)</code>
//       */
//      Pix pixRankFilterGray(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixMedianFilter(PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixMedianFilter(Pix pixs, int wf, int hf);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterWithScaling(PIX*, l_int32, l_int32, l_float32, l_float32)</code>
//       */
//      Pix pixRankFilterWithScaling(Pix pixs, int wf, int hf, float rank, float scalefactor);
//  
//      /**
//       * Original signature : <code>L_RBTREE* l_rbtreeCreate(l_int32)</code>
//       */
//      L_Rbtree l_rbtreeCreate(int keytype);
//      /**
//       * Original signature :
//       * <code>RB_TYPE* l_rbtreeLookup(L_RBTREE*, RB_TYPE)</code>
//       */
//      Rb_Type l_rbtreeLookup(L_Rbtree t, Rb_Type.ByValue key);
//      /**
//       * Original signature :
//       * <code>void l_rbtreeInsert(L_RBTREE*, RB_TYPE, RB_TYPE)</code>
//       */
//      void l_rbtreeInsert(L_Rbtree t, Rb_Type.ByValue key, Rb_Type.ByValue value);
//      /**
//       * Original signature :
//       * <code>void l_rbtreeDelete(L_RBTREE*, RB_TYPE)</code>
//       */
//      void l_rbtreeDelete(L_Rbtree t, Rb_Type.ByValue key);
//  
//      /**
//       * Original signature : <code>void l_rbtreeDestroy(L_RBTREE**)</code>
//       */
//      void l_rbtreeDestroy(PointerByReference pt);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetFirst(L_RBTREE*)</code>
//       */
//      L_Rbtree_Node l_rbtreeGetFirst(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetNext(L_RBTREE_NODE*)</code>
//       */
//      L_Rbtree_Node l_rbtreeGetNext(L_Rbtree_Node n);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetLast(L_RBTREE*)</code>
//       */
//      L_Rbtree_Node l_rbtreeGetLast(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetPrev(L_RBTREE_NODE*)</code>
//       */
//      L_Rbtree_Node l_rbtreeGetPrev(L_Rbtree_Node n);
//  
//      /**
//       * Original signature : <code>l_int32 l_rbtreeGetCount(L_RBTREE*)</code>
//       */
//      int l_rbtreeGetCount(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>void l_rbtreePrint(FILE*, L_RBTREE*)</code>
//       */
//      void l_rbtreePrint(FILE fp, L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>SARRAY* pixProcessBarcodes(PIX*, l_int32, l_int32, SARRAY**, l_int32)</code>
//       */
//      Sarray pixProcessBarcodes(Pix pixs, int format, int method, PointerByReference psaw, int debugflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixExtractBarcodes(PIX*, l_int32)</code>
//       */
//      Pixa pixExtractBarcodes(Pix pixs, int debugflag);
//      /**
//       * Original signature :
//       * <code>SARRAY* pixReadBarcodes(PIXA*, l_int32, l_int32, SARRAY**, l_int32)</code>
//       */
//      Sarray pixReadBarcodes(Pixa pixa, int format, int method, PointerByReference psaw, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixReadBarcodeWidths(PIX*, l_int32, l_int32)</code>
//       */
//      Numa pixReadBarcodeWidths(Pix pixs, int method, int debugflag);
//      /**
//       * Original signature :
//       * <code>BOXA* pixLocateBarcodes(PIX*, l_int32, PIX**, PIX**)</code>
//       */
//      Boxa pixLocateBarcodes(Pix pixs, int thresh, PointerByReference ppixb, PointerByReference ppixm);
//      /**
//       * Original signature :
//       * <code>PIX* pixDeskewBarcode(PIX*, PIX*, BOX*, l_int32, l_int32, l_float32*, l_float32*)</code>
//       */
//      Pix pixDeskewBarcode(Pix pixs, Pix pixb, Box box, int margin, int threshold, FloatBuffer pangle, FloatBuffer pconf);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths1(PIX*, l_float32, l_float32, NUMA**, NUMA**, l_int32)</code>
//       */
//      Numa pixExtractBarcodeWidths1(Pix pixs, float thresh, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code>
//       */
//      Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatBuffer pwidth, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code>
//       */
//      Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatByReference pwidth, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeCrossings(PIX*, l_float32, l_int32)</code>
//       */
//      Numa pixExtractBarcodeCrossings(Pix pixs, float thresh, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWidth(NUMA*, l_float32, NUMA**, NUMA**, l_int32)</code>
//       */
//      Numa numaQuantizeCrossingsByWidth(Numa nas, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code>
//       */
//      Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatBuffer pwidth, FloatBuffer pfirstloc, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code>
//       */
//      Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatByReference pwidth, FloatByReference pfirstloc, PointerByReference pnac, int debugflag);
    /**
     * Original signature :
     * <code>PIXA* pixaReadFiles(const char*, const char*)</code>
     */
    Pixa pixaReadFiles(String dirname, String substr);

    /**
     * Original signature : <code>PIXA* pixaReadFilesSA(SARRAY*)</code>
     */
    Pixa pixaReadFilesSA(Sarray sa);

    /**
     * Original signature : <code>PIX* pixRead(const char*)</code>
     */
    Pix pixRead(String filename);

    /**
     * Original signature :
     * <code>PIX* pixReadWithHint(const char*, l_int32)</code>
     */
    Pix pixReadWithHint(String filename, int hint);

    /**
     * Original signature :
     * <code>PIX* pixReadIndexed(SARRAY*, l_int32)</code>
     */
    Pix pixReadIndexed(Sarray sa, int index);

    /**
     * Original signature : <code>PIX* pixReadStream(FILE*, l_int32)</code>
     */
    Pix pixReadStream(FILE fp, int hint);

    /**
     * Original signature :
     * <code>l_ok pixReadHeader(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int pixReadHeader(String filename, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok findFileFormat(const char*, l_int32*)</code>
     */
    int findFileFormat(String filename, IntBuffer pformat);

//      /**
//       * Original signature :
//       * <code>l_ok findFileFormatStream(FILE*, l_int32*)</code>
//       */
//      int findFileFormatStream(FILE fp, IntBuffer pformat);
    /**
     * Original signature :
     * <code>l_ok findFileFormatBuffer(const l_uint8*, l_int32*)</code>
     */
    int findFileFormatBuffer(ByteBuffer buf, IntBuffer pformat);

    /**
     * Original signature : <code>l_int32 fileFormatIsTiff(FILE*)</code>
     */
    int fileFormatIsTiff(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMem(const l_uint8*, size_t)</code>
     */
    Pix pixReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixReadHeaderMem(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int pixReadHeaderMem(ByteBuffer data, NativeSize size, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok writeImageFileInfo(const char*, FILE*, l_int32)</code>
     */
    int writeImageFileInfo(String filename, FILE fpout, int headeronly);

    /**
     * Original signature : <code>l_ok ioFormatTest(const char*)</code>
     */
    int ioFormatTest(String filename);

//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromRecog(L_RECOG*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      L_Recog recogCreateFromRecog(L_Recog recs, int scalew, int scaleh, int linew, int threshold, int maxyshift);
//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromPixa(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      L_Recog recogCreateFromPixa(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);
//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromPixaNoFinish(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      L_Recog recogCreateFromPixaNoFinish(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);
    /**
     * Original signature :
     * <code>L_RECOG* recogCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    L_Recog recogCreate(int scalew, int scaleh, int linew, int threshold, int maxyshift);
//  
//      /**
//       * Original signature : <code>void recogDestroy(L_RECOG**)</code>
//       */
//      void recogDestroy(PointerByReference precog);
//  
//      /**
//       * Original signature : <code>l_int32 recogGetCount(L_RECOG*)</code>
//       */
//      int recogGetCount(L_Recog recog);

    /**
     * Original signature :
     * <code>l_ok recogSetParams(L_RECOG*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    int recogSetParams(L_Recog recog, int type, int min_nopad, float max_wh_ratio, float max_ht_ratio);

//      /**
//       * Original signature :
//       * <code>l_int32 recogGetClassIndex(L_RECOG*, l_int32, char*, l_int32*)</code>
//       */
//      int recogGetClassIndex(L_Recog recog, int val, ByteBuffer text, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_ok recogStringToIndex(L_RECOG*, char*, l_int32*)</code>
//       */
//      int recogStringToIndex(L_Recog recog, ByteBuffer text, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 recogGetClassString(L_RECOG*, l_int32, char**)</code>
//       */
//      int recogGetClassString(L_Recog recog, int index, PointerByReference pcharstr);
//      /**
//       * Original signature :
//       * <code>l_ok l_convertCharstrToInt(const char*, l_int32*)</code>
//       */
//      int l_convertCharstrToInt(String str, IntBuffer pval);
//  
//      /**
//       * Original signature : <code>L_RECOG* recogRead(const char*)</code>
//       */
//      L_Recog recogRead(String filename);
//  
//      /**
//       * Original signature : <code>L_RECOG* recogReadStream(FILE*)</code>
//       */
//      L_Recog recogReadStream(FILE fp);
    /**
     * Original signature :
     * <code>L_RECOG* recogReadMem(const l_uint8*, size_t)</code>
     */
    L_Recog recogReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok recogWrite(const char*, L_RECOG*)</code>
//       */
//      int recogWrite(String filename, L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_ok recogWriteStream(FILE*, L_RECOG*)</code>
//       */
//      int recogWriteStream(FILE fp, L_Recog recog);
//    /**
//     * Original signature :
//     * <code>l_ok recogWriteMem(l_uint8**, size_t*, L_RECOG*)</code>
//     */
//    int recogWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Recog recog);
//
//    /**
//     * Original signature : <code>PIXA* recogExtractPixa(L_RECOG*)</code>
//     */
//    Pixa recogExtractPixa(L_Recog recog);
//
//    /**
//     * Original signature :
//     * <code>BOXA* recogDecode(L_RECOG*, PIX*, l_int32, PIX**)</code>
//     */
//    Boxa recogDecode(L_Recog recog, Pix pixs, int nlevels, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_ok recogCreateDid(L_RECOG*, PIX*)</code>
//       */
//      int recogCreateDid(L_Recog recog, Pix pixs);
//  
//      /**
//       * Original signature : <code>l_ok recogDestroyDid(L_RECOG*)</code>
//       */
//      int recogDestroyDid(L_Recog recog);
//  
//      /**
//       * Original signature : <code>l_int32 recogDidExists(L_RECOG*)</code>
//       */
//      int recogDidExists(L_Recog recog);
//  
//      /**
//       * Original signature : <code>L_RDID* recogGetDid(L_RECOG*)</code>
//       */
//      L_Rdid recogGetDid(L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_ok recogSetChannelParams(L_RECOG*, l_int32)</code>
//       */
//      int recogSetChannelParams(L_Recog recog, int nlevels);
//    /**
//     * Original signature :
//     * <code>l_ok recogIdentifyMultiple(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**, l_int32)</code>
//     */
//    int recogIdentifyMultiple(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdb, int debugsplit);
//      /**
//       * Original signature :
//       * <code>l_ok recogSplitIntoCharacters(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, l_int32)</code>
//       */
//      int recogSplitIntoCharacters(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, int debug);
//      /**
//       * Original signature :
//       * <code>l_ok recogCorrelationBestRow(L_RECOG*, PIX*, BOXA**, NUMA**, NUMA**, SARRAY**, l_int32)</code>
//       */
//      int recogCorrelationBestRow(L_Recog recog, Pix pixs, PointerByReference pboxa, PointerByReference pnascore, PointerByReference pnaindex, PointerByReference psachar, int debug);
//      /**
//       * Original signature :
//       * <code>l_ok recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code>
//       */
//      int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatBuffer pscore, IntBuffer pindex, PointerByReference pcharstr, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_ok recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code>
//       */
//      int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatByReference pscore, IntByReference pindex, PointerByReference pcharstr, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_ok recogIdentifyPixa(L_RECOG*, PIXA*, PIX**)</code>
//       */
//      int recogIdentifyPixa(L_Recog recog, Pixa pixa, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_ok recogIdentifyPix(L_RECOG*, PIX*, PIX**)</code>
//       */
//      int recogIdentifyPix(L_Recog recog, Pix pixs, PointerByReference ppixdb);
//  
//      /**
//       * Original signature : <code>l_ok recogSkipIdentify(L_RECOG*)</code>
//       */
//      int recogSkipIdentify(L_Recog recog);
//  
//      /**
//       * Original signature : <code>void rchaDestroy(L_RCHA**)</code>
//       */
//      void rchaDestroy(PointerByReference prcha);
//  
//      /**
//       * Original signature : <code>void rchDestroy(L_RCH**)</code>
//       */
//      void rchDestroy(PointerByReference prch);
//      /**
//       * Original signature :
//       * <code>l_ok rchaExtract(L_RCHA*, NUMA**, NUMA**, SARRAY**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
//       */
//      int rchaExtract(L_Rcha rcha, PointerByReference pnaindex, PointerByReference pnascore, PointerByReference psatext, PointerByReference pnasample, PointerByReference pnaxloc, PointerByReference pnayloc, PointerByReference pnawidth);
//      /**
//       * Original signature :
//       * <code>l_ok rchExtract(L_RCH*, l_int32*, l_float32*, char**, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int rchExtract(L_Rch rch, IntBuffer pindex, FloatBuffer pscore, PointerByReference ptext, IntBuffer psample, IntBuffer pxloc, IntBuffer pyloc, IntBuffer pwidth);
//      /**
//       * Original signature :
//       * <code>PIX* recogProcessToIdentify(L_RECOG*, PIX*, l_int32)</code>
//       */
//      Pix recogProcessToIdentify(L_Recog recog, Pix pixs, int pad);
//    /**
//     * Original signature :
//     * <code>SARRAY* recogExtractNumbers(L_RECOG*, BOXA*, l_float32, l_int32, BOXAA**, NUMAA**)</code>
//     */
//    Sarray recogExtractNumbers(L_Recog recog, Boxa boxas, float scorethresh, int spacethresh, PointerByReference pbaa, PointerByReference pnaa);
//
//    /**
//     * Original signature :
//     * <code>PIXA* showExtractNumbers(PIX*, SARRAY*, BOXAA*, NUMAA*, PIX**)</code>
//     */
//    Pixa showExtractNumbers(Pix pixs, Sarray sa, Boxaa baa, Numaa naa, PointerByReference ppixdb);
//    /**
//     * Original signature :
//     * <code>l_ok recogTrainLabeled(L_RECOG*, PIX*, BOX*, char*, l_int32)</code>
//     */
//    int recogTrainLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, int debug);
//
//    /**
//     * Original signature :
//     * <code>l_ok recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code>
//     */
//    int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppix);
//
//    /**
//     * Original signature :
//     * <code>l_ok recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code>
//     */
//    int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, Pointer text, PointerByReference ppix);
//
//    /**
//     * Original signature :
//     * <code>l_ok recogAddSample(L_RECOG*, PIX*, l_int32)</code>
//     */
//    int recogAddSample(L_Recog recog, Pix pix, int debug);
//
//    /**
//     * Original signature :
//     * <code>PIX* recogModifyTemplate(L_RECOG*, PIX*)</code>
//     */
//    Pix recogModifyTemplate(L_Recog recog, Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_int32 recogAverageSamples(L_RECOG**, l_int32)</code>
//       */
//      int recogAverageSamples(PointerByReference precog, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code>
//       */
//      int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatBuffer px, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code>
//       */
//      int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatByReference px, FloatByReference py);
//      /**
//       * Original signature :
//       * <code>l_ok recogTrainingFinished(L_RECOG**, l_int32, l_int32, l_float32)</code>
//       */
//      int recogTrainingFinished(PointerByReference precog, int modifyflag, int minsize, float minfract);
//    /**
//     * Original signature :
//     * <code>PIXA* recogFilterPixaBySize(PIXA*, l_int32, l_int32, l_float32, NUMA**)</code>
//     */
//    Pixa recogFilterPixaBySize(Pixa pixas, int setsize, int maxkeep, float max_ht_ratio, PointerByReference pna);
//    /**
//     * Original signature :
//     * <code>PIXAA* recogSortPixaByClass(PIXA*, l_int32)</code>
//     */
//    Pixaa recogSortPixaByClass(Pixa pixa, int setsize);
//      /**
//       * Original signature :
//       * <code>l_ok recogRemoveOutliers1(L_RECOG**, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
//       */
//      int recogRemoveOutliers1(PointerByReference precog, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//    /**
//     * Original signature :
//     * <code>PIXA* pixaRemoveOutliers1(PIXA*, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
//     */
//    Pixa pixaRemoveOutliers1(Pixa pixas, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>l_ok recogRemoveOutliers2(L_RECOG**, l_float32, l_int32, PIX**, PIX**)</code>
//     */
//    int recogRemoveOutliers2(PointerByReference precog, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>PIXA* pixaRemoveOutliers2(PIXA*, l_float32, l_int32, PIX**, PIX**)</code>
//     */
//    Pixa pixaRemoveOutliers2(Pixa pixas, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogTrainFromBoot(L_RECOG*, PIXA*, l_float32, l_int32, l_int32)</code>
//     */
//    Pixa recogTrainFromBoot(L_Recog recogboot, Pixa pixas, float minscore, int threshold, int debug);
//
//    /**
//     * Original signature :
//     * <code>l_ok recogPadDigitTrainingSet(L_RECOG**, l_int32, l_int32)</code>
//     */
//    int recogPadDigitTrainingSet(PointerByReference precog, int scaleh, int linew);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogIsPaddingNeeded(L_RECOG*, SARRAY**)</code>
//     */
//    int recogIsPaddingNeeded(L_Recog recog, PointerByReference psa);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogAddDigitPadTemplates(L_RECOG*, SARRAY*)</code>
//     */
//    Pixa recogAddDigitPadTemplates(L_Recog recog, Sarray sa);
//
//    /**
//     * Original signature :
//     * <code>L_RECOG* recogMakeBootDigitRecog(l_int32, l_int32, l_int32, l_int32)</code>
//     */
//    L_Recog recogMakeBootDigitRecog(int scaleh, int linew, int maxyshift, int debug);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogMakeBootDigitTemplates(l_int32)</code>
//     */
//    Pixa recogMakeBootDigitTemplates(int debug);
//      /**
//       * Original signature :
//       * <code>l_ok recogShowContent(FILE*, L_RECOG*, l_int32, l_int32)</code>
//       */
//      int recogShowContent(FILE fp, L_Recog recog, int index, int display);
//      /**
//       * Original signature :
//       * <code>l_ok recogDebugAverages(L_RECOG**, l_int32)</code>
//       */
//      int recogDebugAverages(PointerByReference precog, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 recogShowAverageTemplates(L_RECOG*)</code>
//       */
//      int recogShowAverageTemplates(L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_ok recogShowMatchesInRange(L_RECOG*, PIXA*, l_float32, l_float32, l_int32)</code>
//       */
//      int recogShowMatchesInRange(L_Recog recog, Pixa pixa, float minscore, float maxscore, int display);
//      /**
//       * Original signature :
//       * <code>PIX* recogShowMatch(L_RECOG*, PIX*, PIX*, BOX*, l_int32, l_float32)</code>
//       */
//      Pix recogShowMatch(L_Recog recog, Pix pix1, Pix pix2, Box box, int index, float score);
//      /**
//       * Original signature :
//       * <code>l_ok regTestSetup(l_int32, char**, L_REGPARAMS**)</code>
//       */
//      int regTestSetup(int argc, PointerByReference argv, PointerByReference prp);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCleanup(L_REGPARAMS*)</code>
//       */
//      int regTestCleanup(L_RegParams rp);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCompareValues(L_REGPARAMS*, l_float32, l_float32, l_float32)</code>
//       */
//      int regTestCompareValues(L_RegParams rp, float val1, float val2, float delta);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCompareStrings(L_REGPARAMS*, l_uint8*, size_t, l_uint8*, size_t)</code>
//       */
//      int regTestCompareStrings(L_RegParams rp, ByteBuffer string1, NativeSize bytes1, ByteBuffer string2, NativeSize bytes2);
//      /**
//       * Original signature :
//       * <code>l_ok regTestComparePix(L_REGPARAMS*, PIX*, PIX*)</code>
//       */
//      int regTestComparePix(L_RegParams rp, Pix pix1, Pix pix2);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCompareSimilarPix(L_REGPARAMS*, PIX*, PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      int regTestCompareSimilarPix(L_RegParams rp, Pix pix1, Pix pix2, int mindiff, float maxfract, int printstats);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCheckFile(L_REGPARAMS*, const char*)</code>
//       */
//      int regTestCheckFile(L_RegParams rp, String localname);
//      /**
//       * Original signature :
//       * <code>l_ok regTestCompareFiles(L_REGPARAMS*, l_int32, l_int32)</code>
//       */
//      int regTestCompareFiles(L_RegParams rp, int index1, int index2);
//      /**
//       * Original signature :
//       * <code>l_ok regTestWritePixAndCheck(L_REGPARAMS*, PIX*, l_int32)</code>
//       */
//      int regTestWritePixAndCheck(L_RegParams rp, Pix pix, int format);
//    /**
//     * Original signature :
//     * <code>char* regTestGenLocalFilename(L_REGPARAMS*, l_int32, l_int32)</code>
//     */
//    Pointer regTestGenLocalFilename(L_RegParams rp, int index, int format);
//      /**
//       * Original signature :
//       * <code>l_ok pixRasterop(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, PIX*, l_int32, l_int32)</code>
//       */
//      int pixRasterop(Pix pixd, int dx, int dy, int dw, int dh, int op, Pix pixs, int sx, int sy);
//      /**
//       * Original signature :
//       * <code>l_ok pixRasteropVip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      int pixRasteropVip(Pix pixd, int bx, int bw, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixRasteropHip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      int pixRasteropHip(Pix pixd, int by, int bh, int hshift, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixTranslate(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixTranslate(Pix pixd, Pix pixs, int hshift, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixRasteropIP(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      int pixRasteropIP(Pix pixd, int hshift, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixRasteropFullImage(PIX*, PIX*, l_int32)</code>
//       */
//      int pixRasteropFullImage(Pix pixd, Pix pixs, int op);
//      /**
//       * Original signature :
//       * <code>void rasteropVipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      void rasteropVipLow(IntBuffer data, int pixw, int pixh, int depth, int wpl, int x, int w, int shift);
//      /**
//       * Original signature :
//       * <code>void rasteropHipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      void rasteropHipLow(IntBuffer data, int pixh, int depth, int wpl, int y, int h, int shift);
//      /**
//       * Original signature :
//       * <code>void rasteropUniLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      void rasteropUniLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op);
//      /**
//       * Original signature :
//       * <code>void rasteropLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      void rasteropLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op, IntBuffer datas, int spixw, int spixh, int swpl, int sx, int sy);
    /**
     * Original signature :
     * <code>PIX* pixRotate(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixRotate(Pix pixs, float angle, int type, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixEmbedForRotation(PIX*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixEmbedForRotation(Pix pixs, float angle, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixRotateBySampling(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixRotateBySampling(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateBinaryNice(PIX*, l_float32, l_int32)</code>
     */
    Pix pixRotateBinaryNice(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateWithAlpha(PIX*, l_float32, PIX*, l_float32)</code>
     */
    Pix pixRotateWithAlpha(Pix pixs, float angle, Pix pixg, float fract);

    /**
     * Original signature :
     * <code>PIX* pixRotateAM(PIX*, l_float32, l_int32)</code>
     */
    Pix pixRotateAM(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColor(PIX*, l_float32, l_uint32)</code>
     */
    Pix pixRotateAMColor(Pix pixs, float angle, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGray(PIX*, l_float32, l_uint8)</code>
     */
    Pix pixRotateAMGray(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMCorner(PIX*, l_float32, l_int32)</code>
     */
    Pix pixRotateAMCorner(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorCorner(PIX*, l_float32, l_uint32)</code>
     */
    Pix pixRotateAMColorCorner(Pix pixs, float angle, int fillval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGrayCorner(PIX*, l_float32, l_uint8)</code>
     */
    Pix pixRotateAMGrayCorner(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorFast(PIX*, l_float32, l_uint32)</code>
     */
    Pix pixRotateAMColorFast(Pix pixs, float angle, int colorval);

    /**
     * Original signature : <code>PIX* pixRotateOrth(PIX*, l_int32)</code>
     */
    Pix pixRotateOrth(Pix pixs, int quads);

    /**
     * Original signature : <code>PIX* pixRotate180(PIX*, PIX*)</code>
     */
    Pix pixRotate180(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixRotate90(PIX*, l_int32)</code>
     */
    Pix pixRotate90(Pix pixs, int direction);

    /**
     * Original signature : <code>PIX* pixFlipLR(PIX*, PIX*)</code>
     */
    Pix pixFlipLR(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixFlipTB(PIX*, PIX*)</code>
     */
    Pix pixFlipTB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixRotateShear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixRotateShear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate2Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixRotate2Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate3Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    Pix pixRotate3Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRotateShearIP(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    int pixRotateShearIP(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateShearCenter(PIX*, l_float32, l_int32)</code>
     */
    Pix pixRotateShearCenter(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRotateShearCenterIP(PIX*, l_float32, l_int32)</code>
     */
    int pixRotateShearCenterIP(Pix pixs, float angle, int incolor);

//      /**
//       * Original signature :
//       * <code>PIX* pixStrokeWidthTransform(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixStrokeWidthTransform(Pix pixs, int color, int depth, int nangles);
//      /**
//       * Original signature :
//       * <code>PIX* pixRunlengthTransform(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixRunlengthTransform(Pix pixs, int color, int direction, int depth);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindHorizontalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixFindHorizontalRuns(Pix pix, int y, IntBuffer xstart, IntBuffer xend, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindVerticalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int pixFindVerticalRuns(Pix pix, int x, IntBuffer ystart, IntBuffer yend, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>NUMA* pixFindMaxRuns(PIX*, l_int32, NUMA**)</code>
//       */
//      Numa pixFindMaxRuns(Pix pix, int direction, PointerByReference pnastart);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindMaxHorizontalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixFindMaxHorizontalRunOnLine(Pix pix, int y, IntBuffer pxstart, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_ok pixFindMaxVerticalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixFindMaxVerticalRunOnLine(Pix pix, int x, IntBuffer pystart, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_ok runlengthMembershipOnLine(l_int32*, l_int32, l_int32, l_int32*, l_int32*, l_int32)</code>
//       */
//      int runlengthMembershipOnLine(IntBuffer buffer, int size, int depth, IntBuffer start, IntBuffer end, int n);
//  
//      /**
//       * Original signature : <code>l_int32* makeMSBitLocTab(l_int32)</code>
//       */
//      IntByReference makeMSBitLocTab(int bitval);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayCreate(l_int32)</code>
//       */
//      Sarray sarrayCreate(int n);
    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateInitialized(l_int32, const char*)</code>
     */
    Sarray sarrayCreateInitialized(int n, String initstr);

//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayCreateWordsFromString(const char*)</code>
//       */
//      Sarray sarrayCreateWordsFromString(String string);
    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateLinesFromString(const char*, l_int32)</code>
     */
    Sarray sarrayCreateLinesFromString(String string, int blankflag);
//  
//      /**
//       * Original signature : <code>void sarrayDestroy(SARRAY**)</code>
//       */
//      void sarrayDestroy(PointerByReference psa);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayCopy(SARRAY*)</code>
//       */
//      Sarray sarrayCopy(Sarray sa);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayClone(SARRAY*)</code>
//       */
//      Sarray sarrayClone(Sarray sa);

    /**
     * Original signature :
     * <code>l_ok sarrayAddString(SARRAY*, const char*, l_int32)</code>
     */
    int sarrayAddString(Sarray sa, String string, int copyflag);

//      /**
//       * Original signature :
//       * <code>char* sarrayRemoveString(SARRAY*, l_int32)</code>
//       */
//      Pointer sarrayRemoveString(Sarray sa, int index);
    /**
     * Original signature :
     * <code>l_ok sarrayReplaceString(SARRAY*, l_int32, char*, l_int32)</code>
     */
    int sarrayReplaceString(Sarray sa, int index, ByteBuffer newstr, int copyflag);
//  
//      /**
//       * Original signature : <code>l_ok sarrayClear(SARRAY*)</code>
//       */
//      int sarrayClear(Sarray sa);
//  
//      /**
//       * Original signature : <code>l_int32 sarrayGetCount(SARRAY*)</code>
//       */
//      int sarrayGetCount(Sarray sa);

//      /**
//       * Original signature :
//       * <code>char** sarrayGetArray(SARRAY*, l_int32*, l_int32*)</code>
//       */
//      PointerByReference sarrayGetArray(Sarray sa, IntBuffer pnalloc, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>char* sarrayGetString(SARRAY*, l_int32, l_int32)</code>
//       */
//      Pointer sarrayGetString(Sarray sa, int index, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 sarrayGetRefcount(SARRAY*)</code>
//       */
//      int sarrayGetRefcount(Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayChangeRefcount(SARRAY*, l_int32)</code>
//       */
//      int sarrayChangeRefcount(Sarray sa, int delta);
//      /**
//       * Original signature :
//       * <code>char* sarrayToString(SARRAY*, l_int32)</code>
//       */
//      Pointer sarrayToString(Sarray sa, int addnlflag);
//      /**
//       * Original signature :
//       * <code>char* sarrayToStringRange(SARRAY*, l_int32, l_int32, l_int32)</code>
//       */
//      Pointer sarrayToStringRange(Sarray sa, int first, int nstrings, int addnlflag);
    /**
     * Original signature :
     * <code>l_ok sarrayJoin(SARRAY*, SARRAY*)</code>
     */
    int sarrayJoin(Sarray sa1, Sarray sa2);

//      /**
//       * Original signature :
//       * <code>l_ok sarrayAppendRange(SARRAY*, SARRAY*, l_int32, l_int32)</code>
//       */
//      int sarrayAppendRange(Sarray sa1, Sarray sa2, int start, int end);
    /**
     * Original signature :
     * <code>l_ok sarrayPadToSameSize(SARRAY*, SARRAY*, const char*)</code>
     */
    int sarrayPadToSameSize(Sarray sa1, Sarray sa2, String padstring);

//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayConvertWordsToLines(SARRAY*, l_int32)</code>
//       */
//      Sarray sarrayConvertWordsToLines(Sarray sa, int linesize);
//      /**
//       * Original signature :
//       * <code>l_int32 sarraySplitString(SARRAY*, const char*, const char*)</code>
//       */
//      int sarraySplitString(Sarray sa, String str, String separators);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySelectBySubstring(SARRAY*, const char*)</code>
//       */
//      Sarray sarraySelectBySubstring(Sarray sain, String substr);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySelectByRange(SARRAY*, l_int32, l_int32)</code>
//       */
//      Sarray sarraySelectByRange(Sarray sain, int first, int last);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayParseRange(SARRAY*, l_int32, l_int32*, l_int32*, l_int32*, const char*, l_int32)</code>
//       */
//      int sarrayParseRange(Sarray sa, int start, IntBuffer pactualstart, IntBuffer pend, IntBuffer pnewstart, String substr, int loc);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayRead(const char*)</code>
//       */
//      Sarray sarrayRead(String filename);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayReadStream(FILE*)</code>
//       */
//      Sarray sarrayReadStream(FILE fp);
    /**
     * Original signature :
     * <code>SARRAY* sarrayReadMem(const l_uint8*, size_t)</code>
     */
    Sarray sarrayReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok sarrayWrite(const char*, SARRAY*)</code>
//       */
//      int sarrayWrite(String filename, Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayWriteStream(FILE*, SARRAY*)</code>
//       */
//      int sarrayWriteStream(FILE fp, Sarray sa);
    /**
     * Original signature :
     * <code>l_ok sarrayWriteMem(l_uint8**, size_t*, SARRAY*)</code>
     */
    int sarrayWriteMem(PointerByReference pdata, NativeSizeByReference psize, Sarray sa);

//      /**
//       * Original signature :
//       * <code>l_ok sarrayAppend(const char*, SARRAY*)</code>
//       */
//      int sarrayAppend(String filename, Sarray sa);
//      /**
//       * Original signature :
//       * <code>SARRAY* getNumberedPathnamesInDirectory(const char*, const char*, l_int32, l_int32, l_int32)</code>
//       */
//      Sarray getNumberedPathnamesInDirectory(String dirname, String substr, int numpre, int numpost, int maxnum);
//      /**
//       * Original signature :
//       * <code>SARRAY* getSortedPathnamesInDirectory(const char*, const char*, l_int32, l_int32)</code>
//       */
//      Sarray getSortedPathnamesInDirectory(String dirname, String substr, int first, int nfiles);
//      /**
//       * Original signature :
//       * <code>SARRAY* convertSortedToNumberedPathnames(SARRAY*, l_int32, l_int32, l_int32)</code>
//       */
//      Sarray convertSortedToNumberedPathnames(Sarray sa, int numpre, int numpost, int maxnum);
//      /**
//       * Original signature :
//       * <code>SARRAY* getFilenamesInDirectory(const char*)</code>
//       */
//      Sarray getFilenamesInDirectory(String dirname);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySort(SARRAY*, SARRAY*, l_int32)</code>
//       */
//      Sarray sarraySort(Sarray saout, Sarray sain, int sortorder);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySortByIndex(SARRAY*, NUMA*)</code>
//       */
//      Sarray sarraySortByIndex(Sarray sain, Numa naindex);
//      /**
//       * Original signature :
//       * <code>l_int32 stringCompareLexical(const char*, const char*)</code>
//       */
//      int stringCompareLexical(String str1, String str2);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayUnionByAset(SARRAY*, SARRAY*)</code>
//       */
//      Sarray sarrayUnionByAset(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayRemoveDupsByAset(SARRAY*)</code>
//       */
//      Sarray sarrayRemoveDupsByAset(Sarray sas);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayIntersectionByAset(SARRAY*, SARRAY*)</code>
//       */
//      Sarray sarrayIntersectionByAset(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>L_ASET* l_asetCreateFromSarray(SARRAY*)</code>
//       */
//      L_Rbtree l_asetCreateFromSarray(Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayRemoveDupsByHash(SARRAY*, SARRAY**, L_DNAHASH**)</code>
//       */
//      int sarrayRemoveDupsByHash(Sarray sas, PointerByReference psad, PointerByReference pdahash);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayIntersectionByHash(SARRAY*, SARRAY*)</code>
//       */
//      Sarray sarrayIntersectionByHash(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>l_ok sarrayFindStringByHash(SARRAY*, L_DNAHASH*, const char*, l_int32*)</code>
//       */
//      int sarrayFindStringByHash(Sarray sa, L_DnaHash dahash, String str, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>L_DNAHASH* l_dnaHashCreateFromSarray(SARRAY*)</code>
//       */
//      L_DnaHash l_dnaHashCreateFromSarray(Sarray sa);
    /**
     * Original signature :
     * <code>SARRAY* sarrayGenerateIntegers(l_int32)</code>
     */
    Sarray sarrayGenerateIntegers(int n);

    /**
     * Original signature :
     * <code>PIX* pixScale(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScale(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSizeRel(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleToSizeRel(Pix pixs, int delw, int delh);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSize(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleGeneral(PIX*, l_float32, l_float32, l_float32, l_int32)</code>
     */
    Pix pixScaleGeneral(Pix pixs, float scalex, float scaley, float sharpfract, int sharpwidth);

    /**
     * Original signature :
     * <code>PIX* pixScaleLI(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleColorLI(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleColorLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleColor2xLI(PIX*)</code>
     */
    Pix pixScaleColor2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleColor4xLI(PIX*)</code>
     */
    Pix pixScaleColor4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayLI(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleGrayLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLI(PIX*)</code>
     */
    Pix pixScaleGray2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLI(PIX*)</code>
     */
    Pix pixScaleGray4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySampling(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleBySampling(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySamplingToSize(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleBySamplingToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleByIntSampling(PIX*, l_int32)</code>
     */
    Pix pixScaleByIntSampling(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGrayFast(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleRGBToGrayFast(Pix pixs, int factor, int color);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToBinaryFast(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleRGBToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayToBinaryFast(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleGrayToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleSmooth(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleSmooth(Pix pix, float scalex, float scaley);
    
    /**
     * Original signature :
     * <code>PIX* pixScaleSmoothToSize(PIX*, l_int32, l_int32)</code>
     */
    Pix pixScaleSmoothToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGray2(PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixScaleRGBToGray2(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>PIX* pixScaleAreaMap(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleAreaMap(Pix pix, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleAreaMap2(PIX*)</code>
     */
    Pix pixScaleAreaMap2(Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixScaleBinary(PIX*, l_float32, l_float32)</code>
     */
    Pix pixScaleBinary(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGray(PIX*, l_float32)</code>
     */
    Pix pixScaleToGray(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayFast(PIX*, l_float32)</code>
     */
    Pix pixScaleToGrayFast(Pix pixs, float scalefactor);

    /**
     * Original signature : <code>PIX* pixScaleToGray2(PIX*)</code>
     */
    Pix pixScaleToGray2(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray3(PIX*)</code>
     */
    Pix pixScaleToGray3(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray4(PIX*)</code>
     */
    Pix pixScaleToGray4(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray6(PIX*)</code>
     */
    Pix pixScaleToGray6(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray8(PIX*)</code>
     */
    Pix pixScaleToGray8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray16(PIX*)</code>
     */
    Pix pixScaleToGray16(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayMipmap(PIX*, l_float32)</code>
     */
    Pix pixScaleToGrayMipmap(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleMipmap(PIX*, PIX*, l_float32)</code>
     */
    Pix pixScaleMipmap(Pix pixs1, Pix pixs2, float scale);

    /**
     * Original signature :
     * <code>PIX* pixExpandReplicate(PIX*, l_int32)</code>
     */
    Pix pixExpandReplicate(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray2xLIThresh(PIX*, l_int32)</code>
     */
    Pix pixScaleGray2xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLIDither(PIX*)</code>
     */
    Pix pixScaleGray2xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray4xLIThresh(PIX*, l_int32)</code>
     */
    Pix pixScaleGray4xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLIDither(PIX*)</code>
     */
    Pix pixScaleGray4xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayMinMax(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixScaleGrayMinMax(Pix pixs, int xfact, int yfact, int type);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayMinMax2(PIX*, l_int32)</code>
     */
    Pix pixScaleGrayMinMax2(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayRankCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixScaleGrayRankCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayRank2(PIX*, l_int32)</code>
     */
    Pix pixScaleGrayRank2(Pix pixs, int rank);

    /**
     * Original signature :
     * <code>l_ok pixScaleAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code>
     */
    int pixScaleAndTransferAlpha(Pix pixd, Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleWithAlpha(PIX*, l_float32, l_float32, PIX*, l_float32)</code>
     */
    Pix pixScaleWithAlpha(Pix pixs, float scalex, float scaley, Pix pixg, float fract);

 
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillBinary(PIX*, PIX*, PIX*, l_int32)</code>
//       */
//      Pix pixSeedfillBinary(Pix pixd, Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillBinaryRestricted(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixSeedfillBinaryRestricted(Pix pixd, Pix pixs, Pix pixm, int connectivity, int xmax, int ymax);
//      /**
//       * Original signature :
//       * <code>PIX* pixHolesByFilling(PIX*, l_int32)</code>
//       */
//      Pix pixHolesByFilling(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillClosedBorders(PIX*, l_int32)</code>
//       */
//      Pix pixFillClosedBorders(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixExtractBorderConnComps(PIX*, l_int32)</code>
//       */
//      Pix pixExtractBorderConnComps(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderConnComps(PIX*, l_int32)</code>
//       */
//      Pix pixRemoveBorderConnComps(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillBgFromBorder(PIX*, l_int32)</code>
//       */
//      Pix pixFillBgFromBorder(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillHolesToBoundingRect(PIX*, l_int32, l_float32, l_float32)</code>
//       */
//      Pix pixFillHolesToBoundingRect(Pix pixs, int minsize, float maxhfract, float minfgfract);
//      /**
//       * Original signature :
//       * <code>l_ok pixSeedfillGray(PIX*, PIX*, l_int32)</code>
//       */
//      int pixSeedfillGray(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_ok pixSeedfillGrayInv(PIX*, PIX*, l_int32)</code>
//       */
//      int pixSeedfillGrayInv(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_ok pixSeedfillGraySimple(PIX*, PIX*, l_int32)</code>
//       */
//      int pixSeedfillGraySimple(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_ok pixSeedfillGrayInvSimple(PIX*, PIX*, l_int32)</code>
//       */
//      int pixSeedfillGrayInvSimple(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillGrayBasin(PIX*, PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixSeedfillGrayBasin(Pix pixb, Pix pixm, int delta, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixDistanceFunction(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Pix pixDistanceFunction(Pix pixs, int connectivity, int outdepth, int boundcond);
//  
//      /**
//       * Original signature : <code>PIX* pixSeedspread(PIX*, l_int32)</code>
//       */
//      Pix pixSeedspread(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_ok pixLocalExtrema(PIX*, l_int32, l_int32, PIX**, PIX**)</code>
//       */
//      int pixLocalExtrema(Pix pixs, int maxmin, int minmax, PointerByReference ppixmin, PointerByReference ppixmax);
//      /**
//       * Original signature :
//       * <code>l_ok pixSelectedLocalExtrema(PIX*, l_int32, PIX**, PIX**)</code>
//       */
//      int pixSelectedLocalExtrema(Pix pixs, int mindist, PointerByReference ppixmin, PointerByReference ppixmax);
//  
//      /**
//       * Original signature : <code>PIX* pixFindEqualValues(PIX*, PIX*)</code>
//       */
//      Pix pixFindEqualValues(Pix pixs1, Pix pixs2);
//      /**
//       * Original signature :
//       * <code>l_ok pixSelectMinInConnComp(PIX*, PIX*, PTA**, NUMA**)</code>
//       */
//      int pixSelectMinInConnComp(Pix pixs, Pix pixm, PointerByReference ppta, PointerByReference pnav);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveSeededComponents(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
//       */
//      Pix pixRemoveSeededComponents(Pix pixd, Pix pixs, Pix pixm, int connectivity, int bordersize);
//  
//      /**
//       * Original signature : <code>SELA* selaCreate(l_int32)</code>
//       */
//      Sela selaCreate(int n);
//  
//      /**
//       * Original signature : <code>void selaDestroy(SELA**)</code>
//       */
//      void selaDestroy(PointerByReference psela);
      /**
       * Original signature :
       * <code>SEL* selCreate(l_int32, l_int32, const char*)</code>
       */
      Sel selCreate(int height, int width, String name);
  
      /**
       * Original signature : <code>void selDestroy(SEL**)</code>
       */
      void selDestroy(PointerByReference psel);
  
      /**
       * Original signature : <code>SEL* selCopy(SEL*)</code>
       */
      Sel selCopy(Pointer sel);
      /**
       * Original signature :
       * <code>SEL* selCreateBrick(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
       */
      Sel selCreateBrick(int h, int w, int cy, int cx, int type);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateComb(l_int32, l_int32, l_int32)</code>
//       */
//      Sel selCreateComb(int factor1, int factor2, int direction);
//      /**
//       * Original signature :
//       * <code>l_int32** create2dIntArray(l_int32, l_int32)</code>
//       */
//      PointerByReference create2dIntArray(int sy, int sx);
//      /**
//       * Original signature :
//       * <code>l_ok selaAddSel(SELA*, SEL*, const char*, l_int32)</code>
//       */
//      int selaAddSel(Sela sela, Pointer sel, String selname, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 selaGetCount(SELA*)</code>
//       */
//      int selaGetCount(Sela sela);
//  
//      /**
//       * Original signature : <code>SEL* selaGetSel(SELA*, l_int32)</code>
//       */
//      Sel selaGetSel(Sela sela, int i);
//  
//      /**
//       * Original signature : <code>char* selGetName(SEL*)</code>
//       */
//      Pointer selGetName(Pointer sel);
//      /**
//       * Original signature :
//       * <code>l_ok selSetName(SEL*, const char*)</code>
//       */
//      int selSetName(Pointer sel, String name);
//      /**
//       * Original signature :
//       * <code>l_ok selaFindSelByName(SELA*, const char*, l_int32*, SEL**)</code>
//       */
//      int selaFindSelByName(Sela sela, String name, IntBuffer pindex, PointerByReference psel);
//      /**
//       * Original signature :
//       * <code>l_ok selGetElement(SEL*, l_int32, l_int32, l_int32*)</code>
//       */
//      int selGetElement(Pointer sel, int row, int col, IntBuffer ptype);
//      /**
//       * Original signature :
//       * <code>l_ok selSetElement(SEL*, l_int32, l_int32, l_int32)</code>
//       */
//      int selSetElement(Pointer sel, int row, int col, int type);
//      /**
//       * Original signature :
//       * <code>l_ok selGetParameters(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int selGetParameters(Pointer sel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);
//      /**
//       * Original signature :
//       * <code>l_ok selSetOrigin(SEL*, l_int32, l_int32)</code>
//       */
//      int selSetOrigin(Pointer sel, int cy, int cx);
//      /**
//       * Original signature :
//       * <code>l_ok selGetTypeAtOrigin(SEL*, l_int32*)</code>
//       */
//      int selGetTypeAtOrigin(Pointer sel, IntBuffer ptype);
//      /**
//       * Original signature :
//       * <code>char* selaGetBrickName(SELA*, l_int32, l_int32)</code>
//       */
//      Pointer selaGetBrickName(Sela sela, int hsize, int vsize);
//      /**
//       * Original signature :
//       * <code>char* selaGetCombName(SELA*, l_int32, l_int32)</code>
//       */
//      Pointer selaGetCombName(Sela sela, int size, int direction);
//      /**
//       * Original signature :
//       * <code>l_ok getCompositeParameters(l_int32, l_int32*, l_int32*, char**, char**, char**, char**)</code>
//       */
//      int getCompositeParameters(int size, IntBuffer psize1, IntBuffer psize2, PointerByReference pnameh1, PointerByReference pnameh2, PointerByReference pnamev1, PointerByReference pnamev2);
//  
//      /**
//       * Original signature : <code>SARRAY* selaGetSelnames(SELA*)</code>
//       */
//      Sarray selaGetSelnames(Sela sela);
//      /**
//       * Original signature :
//       * <code>l_ok selFindMaxTranslations(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int selFindMaxTranslations(Pointer sel, IntBuffer pxp, IntBuffer pyp, IntBuffer pxn, IntBuffer pyn);
//  
//      /**
//       * Original signature : <code>SEL* selRotateOrth(SEL*, l_int32)</code>
//       */
//      Sel selRotateOrth(Pointer sel, int quads);
//  
//      /**
//       * Original signature : <code>SELA* selaRead(const char*)</code>
//       */
//      Sela selaRead(String fname);
//  
//      /**
//       * Original signature : <code>SELA* selaReadStream(FILE*)</code>
//       */
//      Sela selaReadStream(FILE fp);
//  
//      /**
//       * Original signature : <code>SEL* selRead(const char*)</code>
//       */
//      Sel selRead(String fname);
//  
//      /**
//       * Original signature : <code>SEL* selReadStream(FILE*)</code>
//       */
//      Sel selReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_ok selaWrite(const char*, SELA*)</code>
//       */
//      int selaWrite(String fname, Sela sela);
//      /**
//       * Original signature :
//       * <code>l_ok selaWriteStream(FILE*, SELA*)</code>
//       */
//      int selaWriteStream(FILE fp, Sela sela);
//  
//      /**
//       * Original signature : <code>l_ok selWrite(const char*, SEL*)</code>
//       */
//      int selWrite(String fname, Pointer sel);
//  
//      /**
//       * Original signature : <code>l_ok selWriteStream(FILE*, SEL*)</code>
//       */
//      int selWriteStream(FILE fp, Pointer sel);
      /**
       * Original signature :
       * <code>SEL* selCreateFromString(const char*, l_int32, l_int32, const char*)</code>
       */
      Sel selCreateFromString(String text, int h, int w, String name);
//  
//      /**
//       * Original signature : <code>char* selPrintToString(SEL*)</code>
//       */
//      Pointer selPrintToString(Pointer sel);
//      /**
//       * Original signature :
//       * <code>SELA* selaCreateFromFile(const char*)</code>
//       */
//      Sela selaCreateFromFile(String filename);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromPta(PTA*, l_int32, l_int32, const char*)</code>
//       */
//      Sel selCreateFromPta(Pta pta, int cy, int cx, String name);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromPix(PIX*, l_int32, l_int32, const char*)</code>
//       */
//      Sel selCreateFromPix(Pix pix, int cy, int cx, String name);
//      /**
//       * Original signature :
//       * <code>SEL* selReadFromColorImage(const char*)</code>
//       */
//      Sel selReadFromColorImage(String pathname);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromColorPix(PIX*, const char*)</code>
//       */
//      Sel selCreateFromColorPix(Pix pixs, String selname);
//      /**
//       * Original signature :
//       * <code>PIX* selDisplayInPix(SEL*, l_int32, l_int32)</code>
//       */
//      Pix selDisplayInPix(Pointer sel, int size, int gthick);
//      /**
//       * Original signature :
//       * <code>PIX* selaDisplayInPix(SELA*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Pix selaDisplayInPix(Sela sela, int size, int gthick, int spacing, int ncols);
//  
//      /**
//       * Original signature : <code>SELA* selaAddBasic(SELA*)</code>
//       */
//      Sela selaAddBasic(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddHitMiss(SELA*)</code>
//       */
//      Sela selaAddHitMiss(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddDwaLinear(SELA*)</code>
//       */
//      Sela selaAddDwaLinear(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddDwaCombs(SELA*)</code>
//       */
//      Sela selaAddDwaCombs(Sela sela);
//      /**
//       * Original signature :
//       * <code>SELA* selaAddCrossJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Sela selaAddCrossJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);
//      /**
//       * Original signature :
//       * <code>SELA* selaAddTJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code>
//       */
//      Sela selaAddTJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);
    /**
     * Original signature : <code>SELA* sela4ccThin(SELA*)</code>
     */
    Sela sela4ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela8ccThin(SELA*)</code>
     */
    Sela sela8ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela4and8ccThin(SELA*)</code>
     */
    Sela sela4and8ccThin(Sela sela);

//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelWithRuns(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
//       */
//      Sel pixGenerateSelWithRuns(Pix pixs, int nhlines, int nvlines, int distance, int minlength, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelRandom(PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
//       */
//      Sel pixGenerateSelRandom(Pix pixs, float hitfract, float missfract, int distance, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelBoundary(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
//       */
//      Sel pixGenerateSelBoundary(Pix pixs, int hitdist, int missdist, int hitskip, int missskip, int topflag, int botflag, int leftflag, int rightflag, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetRunCentersOnLine(PIX*, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixGetRunCentersOnLine(Pix pixs, int x, int y, int minlength);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetRunsOnLine(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
//       */
//      Numa pixGetRunsOnLine(Pix pixs, int x1, int y1, int x2, int y2);
//      /**
//       * Original signature :
//       * <code>PTA* pixSubsampleBoundaryPixels(PIX*, l_int32)</code>
//       */
//      Pta pixSubsampleBoundaryPixels(Pix pixs, int skip);
//      /**
//       * Original signature :
//       * <code>l_int32 adjacentOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int adjacentOnPixelInRaster(Pix pixs, int x, int y, IntBuffer pxa, IntBuffer pya);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayHitMissSel(PIX*, SEL*, l_int32, l_uint32, l_uint32)</code>
//       */
//      Pix pixDisplayHitMissSel(Pix pixs, Pointer sel, int scalefactor, int hitcolor, int misscolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      Pix pixHShear(Pix pixd, Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      Pix pixVShear(Pix pixd, Pix pixs, int xloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearCorner(PIX*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixHShearCorner(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearCorner(PIX*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixVShearCorner(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearCenter(PIX*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixHShearCenter(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearCenter(PIX*, PIX*, l_float32, l_int32)</code>
//       */
//      Pix pixVShearCenter(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixHShearIP(PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      int pixHShearIP(Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>l_ok pixVShearIP(PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      int pixVShearIP(Pix pixs, int xloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearLI(PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      Pix pixHShearLI(Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearLI(PIX*, l_int32, l_float32, l_int32)</code>
//       */
//      Pix pixVShearLI(Pix pixs, int xloc, float radang, int incolor);
    /**
     * Original signature : <code>PIX* pixDeskewBoth(PIX*, l_int32)</code>
     */
    Pix pixDeskewBoth(Pix pixs, int redsearch);

    /**
     * Original signature : <code>PIX* pixDeskew(PIX*, l_int32)</code>
     */
    Pix pixDeskew(Pix pixs, int redsearch);

    /**
     * Original signature :
     * <code>PIX* pixFindSkewAndDeskew(PIX*, l_int32, l_float32*, l_float32*)</code>
     */
    Pix pixFindSkewAndDeskew(Pix pixs, int redsearch, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>PIX* pixDeskewGeneral(PIX*, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    Pix pixDeskewGeneral(Pix pixs, int redsweep, float sweeprange, float sweepdelta, int redsearch, int thresh, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_ok pixFindSkew(PIX*, l_float32*, l_float32*)</code>
     */
    int pixFindSkew(Pix pixs, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweep(PIX*, l_float32*, l_int32, l_float32, l_float32)</code>
     */
    int pixFindSkewSweep(Pix pixs, FloatBuffer pangle, int reduction, float sweeprange, float sweepdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearch(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32)</code>
     */
    int pixFindSkewSweepAndSearch(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearchScore(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    int pixFindSkewSweepAndSearchScore(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearchScorePivot(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code>
     */
    int pixFindSkewSweepAndSearchScorePivot(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta, int pivot);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewOrthogonalRange(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    int pixFindSkewOrthogonalRange(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, float confprior);

    /**
     * Original signature :
     * <code>l_ok pixFindDifferentialSquareSum(PIX*, l_float32*)</code>
     */
    int pixFindDifferentialSquareSum(Pix pixs, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok pixFindNormalizedSquareSum(PIX*, l_float32*, l_float32*, l_float32*)</code>
     */
    int pixFindNormalizedSquareSum(Pix pixs, FloatBuffer phratio, FloatBuffer pvratio, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamSpix(FILE*)</code>
//       */
//      Pix pixReadStreamSpix(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_ok readHeaderSpix(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int readHeaderSpix(String filename, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_ok freadHeaderSpix(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int freadHeaderSpix(FILE fp, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_ok sreadHeaderSpix(const l_uint32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int sreadHeaderSpix(IntBuffer data, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamSpix(FILE*, PIX*)</code>
//       */
//      int pixWriteStreamSpix(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>PIX* pixReadMemSpix(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemSpix(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteMemSpix(l_uint8**, size_t*, PIX*)</code>
//       */
//      int pixWriteMemSpix(PointerByReference pdata, NativeSizeByReference psize, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_ok pixSerializeToMemory(PIX*, l_uint32**, size_t*)</code>
//       */
//      int pixSerializeToMemory(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>PIX* pixDeserializeFromMemory(const l_uint32*, size_t)</code>
//       */
//      Pix pixDeserializeFromMemory(IntBuffer data, NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>L_STACK* lstackCreate(l_int32)</code>
//       */
//      L_Stack lstackCreate(int nalloc);
//      /**
//       * Original signature :
//       * <code>void lstackDestroy(L_STACK**, l_int32)</code>
//       */
//      void lstackDestroy(PointerByReference plstack, int freeflag);
//  
//      /**
//       * Original signature : <code>l_ok lstackAdd(L_STACK*, void*)</code>
//       */
//      int lstackAdd(L_Stack lstack, Pointer item);
//  
//      /**
//       * Original signature : <code>void* lstackRemove(L_STACK*)</code>
//       */
//      Pointer lstackRemove(L_Stack lstack);
//  
//      /**
//       * Original signature : <code>l_int32 lstackGetCount(L_STACK*)</code>
//       */
//      int lstackGetCount(L_Stack lstack);
//      /**
//       * Original signature :
//       * <code>l_ok lstackPrint(FILE*, L_STACK*)</code>
//       */
//      int lstackPrint(FILE fp, L_Stack lstack);
//  
//      /**
//       * Original signature : <code>L_STRCODE* strcodeCreate(l_int32)</code>
//       */
//      L_StrCode strcodeCreate(int fileno);
//      /**
//       * Original signature :
//       * <code>l_ok strcodeCreateFromFile(const char*, l_int32, const char*)</code>
//       */
//      int strcodeCreateFromFile(String filein, int fileno, String outdir);
//      /**
//       * Original signature :
//       * <code>l_ok strcodeGenerate(L_STRCODE*, const char*, const char*)</code>
//       */
//      int strcodeGenerate(L_StrCode strcode, String filein, String type);
//      /**
//       * Original signature :
//       * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code>
//       */
//      int strcodeFinalize(PointerByReference pstrcode, String outdir);
    /**
     * Original signature :
     * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code>
     */
    int strcodeFinalize(PointerByReference pstrcode, Pointer outdir);

    /**
     * Original signature :
     * <code>l_int32 l_getStructStrFromFile(const char*, l_int32, char**)</code>
     */
    int l_getStructStrFromFile(String filename, int field, PointerByReference pstr);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeLength(PIX*, l_int32*, l_int32*)</code>
     */
    int pixFindStrokeLength(Pix pixs, IntBuffer tab8, IntBuffer plength);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code>
     */
    int pixFindStrokeWidth(Pix pixs, float thresh, IntBuffer tab8, FloatBuffer pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code>
     */
    int pixFindStrokeWidth(Pix pixs, float thresh, IntByReference tab8, FloatByReference pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>NUMA* pixaFindStrokeWidth(PIXA*, l_float32, l_int32*, l_int32)</code>
     */
    Numa pixaFindStrokeWidth(Pixa pixa, float thresh, IntBuffer tab8, int debug);

    /**
     * Original signature :
     * <code>PIXA* pixaModifyStrokeWidth(PIXA*, l_float32)</code>
     */
    Pixa pixaModifyStrokeWidth(Pixa pixas, float targetw);

    /**
     * Original signature :
     * <code>PIX* pixModifyStrokeWidth(PIX*, l_float32, l_float32)</code>
     */
    Pix pixModifyStrokeWidth(Pix pixs, float width, float targetw);

    /**
     * Original signature :
     * <code>PIXA* pixaSetStrokeWidth(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    Pixa pixaSetStrokeWidth(Pixa pixas, int width, int thinfirst, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixSetStrokeWidth(PIX*, l_int32, l_int32, l_int32)</code>
     */
    Pix pixSetStrokeWidth(Pix pixs, int width, int thinfirst, int connectivity);

//      /**
//       * Original signature :
//       * <code>l_int32* sudokuReadFile(const char*)</code>
//       */
//      IntByReference sudokuReadFile(String filename);
//      /**
//       * Original signature :
//       * <code>l_int32* sudokuReadString(const char*)</code>
//       */
//      IntByReference sudokuReadString(String str);
//  
//      /**
//       * Original signature : <code>L_SUDOKU* sudokuCreate(l_int32*)</code>
//       */
//      L_Sudoku sudokuCreate(IntBuffer array);
//  
//      /**
//       * Original signature : <code>void sudokuDestroy(L_SUDOKU**)</code>
//       */
//      void sudokuDestroy(PointerByReference psud);
//  
//      /**
//       * Original signature : <code>l_int32 sudokuSolve(L_SUDOKU*)</code>
//       */
//      int sudokuSolve(L_Sudoku sud);
//      /**
//       * Original signature :
//       * <code>l_ok sudokuTestUniqueness(l_int32*, l_int32*)</code>
//       */
//      int sudokuTestUniqueness(IntBuffer array, IntBuffer punique);
//      /**
//       * Original signature :
//       * <code>L_SUDOKU* sudokuGenerate(l_int32*, l_int32, l_int32, l_int32)</code>
//       */
//      L_Sudoku sudokuGenerate(IntBuffer array, int seed, int minelems, int maxtries);
//      /**
//       * Original signature :
//       * <code>l_int32 sudokuOutput(L_SUDOKU*, l_int32)</code>
//       */
//      int sudokuOutput(L_Sudoku sud, int arraytype);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddSingleTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32*)</code>
//       */
//      Pix pixAddSingleTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int location, IntBuffer poverflow);
    /**
     * Original signature :
     * <code>PIX* pixAddTextlines(PIX*, L_BMF*, const char*, l_uint32, l_int32)</code>
     */
    Pix pixAddTextlines(Pix pixs, L_Bmf bmf, String textstr, int val, int location);

//      /**
//       * Original signature :
//       * <code>l_ok pixSetTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
//       */
//      int pixSetTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, int wtext, int firstindent, IntBuffer poverflow);
//      /**
//       * Original signature :
//       * <code>l_ok pixSetTextline(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32*, l_int32*)</code>
//       */
//      int pixSetTextline(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, IntBuffer pwidth, IntBuffer poverflow);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaAddTextNumber(PIXA*, L_BMF*, NUMA*, l_uint32, l_int32)</code>
//       */
//      Pixa pixaAddTextNumber(Pixa pixas, L_Bmf bmf, Numa na, int val, int location);
    /**
     * Original signature :
     * <code>PIXA* pixaAddTextlines(PIXA*, L_BMF*, SARRAY*, l_uint32, l_int32)</code>
     */
    Pixa pixaAddTextlines(Pixa pixas, L_Bmf bmf, Sarray sa, int val, int location);

    /**
     * Original signature :
     * <code>l_ok pixaAddPixWithText(PIXA*, PIX*, l_int32, L_BMF*, const char*, l_uint32, l_int32)</code>
     */
    int pixaAddPixWithText(Pixa pixa, Pix pixs, int reduction, L_Bmf bmf, String textstr, int val, int location);

//      /**
//       * Original signature :
//       * <code>SARRAY* bmfGetLineStrings(L_BMF*, const char*, l_int32, l_int32, l_int32*)</code>
//       */
//      Sarray bmfGetLineStrings(L_Bmf bmf, String textstr, int maxw, int firstindent, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>NUMA* bmfGetWordWidths(L_BMF*, const char*, SARRAY*)</code>
//       */
//      Numa bmfGetWordWidths(L_Bmf bmf, String textstr, Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_ok bmfGetStringWidth(L_BMF*, const char*, l_int32*)</code>
//       */
//      int bmfGetStringWidth(L_Bmf bmf, String textstr, IntBuffer pw);
    /**
     * Original signature :
     * <code>SARRAY* splitStringToParagraphs(char*, l_int32)</code>
     */
    Sarray splitStringToParagraphs(ByteBuffer textstr, int splitflag);

    /**
     * Original signature :
     * <code>PIX* pixReadTiff(const char*, l_int32)</code>
     */
    Pix pixReadTiff(String filename, int n);

    /**
     * Original signature :
     * <code>PIX* pixReadStreamTiff(FILE*, l_int32)</code>
     */
    Pix pixReadStreamTiff(FILE fp, int n);

    /**
     * Original signature :
     * <code>l_ok pixWriteTiff(const char*, PIX*, l_int32, const char*)</code>
     */
    int pixWriteTiff(String filename, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>l_ok pixWriteTiffCustom(const char*, PIX*, l_int32, const char*, NUMA*, SARRAY*, SARRAY*, NUMA*)</code>
     */
    int pixWriteTiffCustom(String filename, Pix pix, int comptype, String modestr, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamTiff(FILE*, PIX*, l_int32)</code>
     */
    int pixWriteStreamTiff(FILE fp, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamTiffWA(FILE*, PIX*, l_int32, const char*)</code>
     */
    int pixWriteStreamTiffWA(FILE fp, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>PIX* pixReadFromMultipageTiff(const char*, size_t*)</code>
     */
    Pix pixReadFromMultipageTiff(String fname, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMultipageTiff(const char*)</code>
     */
    Pixa pixaReadMultipageTiff(String filename);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMultipageTiff(const char*, PIXA*)</code>
     */
    int pixaWriteMultipageTiff(String fname, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok writeMultipageTiff(const char*, const char*, const char*)</code>
     */
    int writeMultipageTiff(String dirin, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_ok writeMultipageTiffSA(SARRAY*, const char*)</code>
     */
    int writeMultipageTiffSA(Sarray sa, String fileout);

    /**
     * Original signature :
     * <code>l_ok fprintTiffInfo(FILE*, const char*)</code>
     */
    int fprintTiffInfo(FILE fpout, String tiffile);

    /**
     * Original signature :
     * <code>l_ok tiffGetCount(FILE*, l_int32*)</code>
     */
    int tiffGetCount(FILE fp, IntBuffer pn);

    /**
     * Original signature :
     * <code>l_ok getTiffResolution(FILE*, l_int32*, l_int32*)</code>
     */
    int getTiffResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok readHeaderTiff(const char*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderTiff(String filename, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok freadHeaderTiff(FILE*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int freadHeaderTiff(FILE fp, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemTiff(const l_uint8*, size_t, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemTiff(ByteBuffer cdata, NativeSize size, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok findTiffCompression(FILE*, l_int32*)</code>
     */
    int findTiffCompression(FILE fp, IntBuffer pcomptype);

//      /**
//       * Original signature :
//       * <code>l_ok extractG4DataFromFile(const char*, l_uint8**, size_t*, l_int32*, l_int32*, l_int32*)</code>
//       */
//      int extractG4DataFromFile(String filein, PointerByReference pdata, NativeSizeByReference pnbytes, IntBuffer pw, IntBuffer ph, IntBuffer pminisblack);
    /**
     * Original signature :
     * <code>PIX* pixReadMemTiff(const l_uint8*, size_t, l_int32)</code>
     */
    Pix pixReadMemTiff(ByteBuffer cdata, NativeSize size, int n);

    /**
     * Original signature :
     * <code>PIX* pixReadMemFromMultipageTiff(const l_uint8*, size_t, size_t*)</code>
     */
    Pix pixReadMemFromMultipageTiff(ByteBuffer cdata, NativeSize size, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMemMultipageTiff(const l_uint8*, size_t)</code>
     */
    Pixa pixaReadMemMultipageTiff(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMemMultipageTiff(l_uint8**, size_t*, PIXA*)</code>
     */
    int pixaWriteMemMultipageTiff(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemTiff(l_uint8**, size_t*, PIX*, l_int32)</code>
     */
    int pixWriteMemTiff(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemTiffCustom(l_uint8**, size_t*, PIX*, l_int32, NUMA*, SARRAY*, SARRAY*, NUMA*)</code>
     */
    int pixWriteMemTiffCustom(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);
//  
//      /**
//       * Original signature : <code>l_int32 setMsgSeverity(l_int32)</code>
//       */
//      int setMsgSeverity(int newsev);

//      /**
//       * Original signature :
//       * <code>l_int32 returnErrorInt(const char*, const char*, l_int32)</code>
//       */
//      int returnErrorInt(String msg, String procname, int ival);
//      /**
//       * Original signature :
//       * <code>l_float32 returnErrorFloat(const char*, const char*, l_float32)</code>
//       */
//      float returnErrorFloat(String msg, String procname, float fval);
//      /**
//       * Original signature :
//       * <code>void* returnErrorPtr(const char*, const char*, void*)</code>
//       */
//      Pointer returnErrorPtr(String msg, String procname, Pointer pval);
//      /**
//       * Original signature :
//       * <code>l_ok filesAreIdentical(const char*, const char*, l_int32*)</code>
//       */
//      int filesAreIdentical(String fname1, String fname2, IntBuffer psame);
//      /**
//       * Original signature :
//       * <code>l_uint16 convertOnLittleEnd16(l_uint16)</code>
//       */
//      short convertOnLittleEnd16(short shortin);
//      /**
//       * Original signature :
//       * <code>l_uint16 convertOnBigEnd16(l_uint16)</code>
//       */
//      short convertOnBigEnd16(short shortin);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertOnLittleEnd32(l_uint32)</code>
//       */
//      int convertOnLittleEnd32(int wordin);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertOnBigEnd32(l_uint32)</code>
//       */
//      int convertOnBigEnd32(int wordin);
//      /**
//       * Original signature :
//       * <code>l_ok fileCorruptByDeletion(const char*, l_float32, l_float32, const char*)</code>
//       */
//      int fileCorruptByDeletion(String filein, float loc, float size, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok fileCorruptByMutation(const char*, l_float32, l_float32, const char*)</code>
//       */
//      int fileCorruptByMutation(String filein, float loc, float size, String fileout);
//      /**
//       * Original signature :
//       * <code>l_ok genRandomIntegerInRange(l_int32, l_int32, l_int32*)</code>
//       */
//      int genRandomIntegerInRange(int range, int seed, IntBuffer pval);
//  
//      /**
//       * Original signature : <code>l_int32 lept_roundftoi(l_float32)</code>
//       */
//      int lept_roundftoi(float fval);
//      /**
//       * Original signature :
//       * <code>l_ok l_hashStringToUint64(const char*, l_uint64*)</code>
//       */
//      int l_hashStringToUint64(String str, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_ok l_hashPtToUint64(l_int32, l_int32, l_uint64*)</code>
//       */
//      int l_hashPtToUint64(int x, int y, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_ok l_hashFloat64ToUint64(l_int32, l_float64, l_uint64*)</code>
//       */
//      int l_hashFloat64ToUint64(int nbuckets, double val, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_ok findNextLargerPrime(l_int32, l_uint32*)</code>
//       */
//      int findNextLargerPrime(int start, IntBuffer pprime);
//      /**
//       * Original signature :
//       * <code>l_ok lept_isPrime(l_uint64, l_int32*, l_uint32*)</code>
//       */
//      int lept_isPrime(long n, IntBuffer pis_prime, IntBuffer pfactor);

//     /**
//     * Original signature :
//     * <code>l_uint32 convertIntToGrayCode(l_uint32)</code>
//     */
//    int convertIntToGrayCode(int val);
//
//    /**
//     * Original signature :
//     * <code>l_uint32 convertGrayCodeToInt(l_uint32)</code>
//     */
//    int convertGrayCodeToInt(int val);

    /**
     * Original signature : <code>char* getLeptonicaVersion()</code>
     */
    Pointer getLeptonicaVersion();
//  
//      /**
//       * Original signature : <code>void startTimer()</code>
//       */
//      void startTimer();
//  
//      /**
//       * Original signature : <code>l_float32 stopTimer()</code>
//       */
//      float stopTimer();
//  
//      /**
//       * Original signature : <code>L_TIMER startTimerNested()</code>
//       */
//      Pointer startTimerNested();
//  
//      /**
//       * Original signature : <code>l_float32 stopTimerNested(L_TIMER)</code>
//       */
//      float stopTimerNested(Pointer rusage_start);

    /**
     * Original signature :
     * <code>void l_getCurrentTime(l_int32*, l_int32*)</code>
     */
    void l_getCurrentTime(IntBuffer sec, IntBuffer usec);

    /**
     * Original signature : <code>L_WALLTIMER* startWallTimer()</code>
     */
    L_WallTimer startWallTimer();

    /**
     * Original signature :
     * <code>l_float32 stopWallTimer(L_WALLTIMER**)</code>
     */
    float stopWallTimer(PointerByReference ptimer);

    /**
     * Original signature : <code>char* l_getFormattedDate()</code>
     */
    Pointer l_getFormattedDate();
//  
//      /**
//       * Original signature : <code>char* stringNew(const char*)</code>
//       */
//      Pointer stringNew(String src);

//      /**
//       * Original signature :
//       * <code>l_ok stringCopy(char*, const char*, l_int32)</code>
//       */
//      int stringCopy(ByteBuffer dest, String src, int n);
//      /**
//       * Original signature :
//       * <code>l_ok stringReplace(char**, const char*)</code>
//       */
//      int stringReplace(PointerByReference pdest, String src);
//      /**
//       * Original signature :
//       * <code>l_int32 stringLength(const char*, size_t)</code>
//       */
//      int stringLength(String src, NativeSize size);
//      /**
//       * Original signature :
//       * <code>l_int32 stringCat(char*, size_t, const char*)</code>
//       */
//      int stringCat(ByteBuffer dest, NativeSize size, String src);
//      /**
//       * Original signature :
//       * <code>char* stringConcatNew(const char*, null)</code>
//       */
//      Pointer stringConcatNew(String first, PointerByReference varArgs1);
//      /**
//       * Original signature :
//       * <code>char* stringJoin(const char*, const char*)</code>
//       */
//      Pointer stringJoin(String src1, String src2);
//      /**
//       * Original signature :
//       * <code>l_ok stringJoinIP(char**, const char*)</code>
//       */
//      int stringJoinIP(PointerByReference psrc1, String src2);
//  
//      /**
//       * Original signature : <code>char* stringReverse(const char*)</code>
//       */
//      Pointer stringReverse(String src);
//      /**
//       * Original signature :
//       * <code>char* strtokSafe(char*, const char*, char**)</code>
//       */
//      Pointer strtokSafe(ByteBuffer cstr, String seps, PointerByReference psaveptr);
//      /**
//       * Original signature :
//       * <code>l_ok stringSplitOnToken(char*, const char*, char**, char**)</code>
//       */
//      int stringSplitOnToken(ByteBuffer cstr, String seps, PointerByReference phead, PointerByReference ptail);
//      /**
//       * Original signature : <code>l_ok stringCheckForChars(const char*, const char*, l_int32*)</code>
//       */
//      int stringCheckForChars(String src, String chars, IntBuffer pfound);
//      /**
//       * Original signature :
//       * <code>char* stringRemoveChars(const char*, const char*)</code>
//       */
//      Pointer stringRemoveChars(String src, String remchars);
//      /**
//       * Original signature :
//       * <code>l_int32 stringFindSubstr(const char*, const char*, l_int32*)</code>
//       */
//      int stringFindSubstr(String src, String sub, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>char* stringReplaceSubstr(const char*, const char*, const char*, l_int32*, l_int32*)</code>
//       */
//      Pointer stringReplaceSubstr(String src, String sub1, String sub2, IntBuffer pfound, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>char* stringReplaceEachSubstr(const char*, const char*, const char*, l_int32*)</code>
//       */
//      Pointer stringReplaceEachSubstr(String src, String sub1, String sub2, IntBuffer pcount);
    /**
     * Original signature :
     * <code>L_DNA* arrayFindEachSequence(const l_uint8*, size_t, const l_uint8*, size_t)</code>
     */
    L_Dna arrayFindEachSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen);

    /**
     * Original signature :
     * <code>l_ok arrayFindSequence(const l_uint8*, size_t, const l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    int arrayFindSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen, IntBuffer poffset, IntBuffer pfound);

//      /**
//       * Original signature :
//       * <code>void* reallocNew(void**, l_int32, l_int32)</code>
//       */
//      Pointer reallocNew(PointerByReference pindata, int oldsize, int newsize);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryRead(const char*, size_t*)</code>
//       */
//      Pointer l_binaryRead(String filename, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadStream(FILE*, size_t*)</code>
//       */
//      Pointer l_binaryReadStream(FILE fp, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadSelect(const char*, size_t, size_t, size_t*)</code>
//       */
//      Pointer l_binaryReadSelect(String filename, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadSelectStream(FILE*, size_t, size_t, size_t*)</code>
//       */
//      Pointer l_binaryReadSelectStream(FILE fp, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);
//      /**
//       * Original signature :
//       * <code>l_ok l_binaryWrite(const char*, const char*, const void*, size_t)</code>
//       */
//      int l_binaryWrite(String filename, String operation, Pointer data, NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>size_t nbytesInFile(const char*)</code>
//       */
//      NativeSize nbytesInFile(String filename);
//  
//      /**
//       * Original signature : <code>size_t fnbytesInFile(FILE*)</code>
//       */
//      NativeSize fnbytesInFile(FILE fp);
    /**
     * Original signature :
     * <code>l_uint8* l_binaryCopy(l_uint8*, size_t)</code>
     */
    Pointer l_binaryCopy(ByteBuffer datas, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_ok fileCopy(const char*, const char*)</code>
//       */
//      int fileCopy(String srcfile, String newfile);
//      /**
//       * Original signature :
//       * <code>l_ok fileConcatenate(const char*, const char*)</code>
//       */
//      int fileConcatenate(String srcfile, String destfile);
//      /**
//       * Original signature :
//       * <code>l_ok fileAppendString(const char*, const char*)</code>
//       */
//      int fileAppendString(String filename, String str);
//  
//      /**
//       * Original signature : <code>FILE* fopenReadStream(const char*)</code>
//       */
//      FILE fopenReadStream(String filename);
//      /**
//       * Original signature :
//       * <code>FILE* fopenWriteStream(const char*, const char*)</code>
//       */
//      FILE fopenWriteStream(String filename, String modestring);
    /**
     * Original signature :
     * <code>FILE* fopenReadFromMemory(const l_uint8*, size_t)</code>
     */
    FILE fopenReadFromMemory(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>FILE* fopenWriteWinTempfile()</code>
     */
    FILE fopenWriteWinTempfile();

//      /**
//       * Original signature :
//       * <code>FILE* lept_fopen(const char*, const char*)</code>
//       */
//      FILE lept_fopen(String filename, String mode);
//  
//      /**
//       * Original signature : <code>l_ok lept_fclose(FILE*)</code>
//       */
//      int lept_fclose(FILE fp);
//  
//      /**
//       * Original signature : <code>void* lept_calloc(size_t, size_t)</code>
//       */
//      Pointer lept_calloc(NativeSize nmemb, NativeSize size);
    /**
     * Original signature : <code>void lept_free(void*)</code>
     */
    void lept_free(Pointer ptr);

    /**
     * Original signature : <code>l_int32 lept_mkdir(const char*)</code>
     */
    int lept_mkdir(String subdir);

    /**
     * Original signature : <code>l_int32 lept_rmdir(const char*)</code>
     */
    int lept_rmdir(String subdir);

    /**
     * Original signature :
     * <code>void lept_direxists(const char*, l_int32*)</code>
     */
    void lept_direxists(String dir, IntBuffer pexists);

//      /**
//       * Original signature :
//       * <code>l_int32 lept_rm_match(const char*, const char*)</code>
//       */
//      int lept_rm_match(String subdir, String substr);
    /**
     * Original signature :
     * <code>l_int32 lept_rm(const char*, const char*)</code>
     */
    int lept_rm(String subdir, String tail);
//  
//      /**
//       * Original signature : <code>l_int32 lept_rmfile(const char*)</code>
//       */
//      int lept_rmfile(String filepath);

//      /**
//       * Original signature :
//       * <code>l_int32 lept_mv(const char*, const char*, const char*, char**)</code>
//       */
//      int lept_mv(String srcfile, String newdir, String newtail, PointerByReference pnewpath);
//      /**
//       * Original signature :
//       * <code>l_int32 lept_cp(const char*, const char*, const char*, char**)</code>
//       */
//      int lept_cp(String srcfile, String newdir, String newtail, PointerByReference pnewpath);
	/**
	 * Original signature : <code>void callSystemDebug(const char*)</code>
	 */
	void callSystemDebug(String cmd);

//      /**
//       * Original signature :
//       * <code>l_ok splitPathAtDirectory(const char*, char**, char**)</code>
//       */
//      int splitPathAtDirectory(String pathname, PointerByReference pdir, PointerByReference ptail);
//      /**
//       * Original signature :
//       * <code>l_ok splitPathAtExtension(const char*, char**, char**)</code>
//       */
//      int splitPathAtExtension(String pathname, PointerByReference pbasename, PointerByReference pextension);
//      /**
//       * Original signature :
//       * <code>char* pathJoin(const char*, const char*)</code>
//       */
//      Pointer pathJoin(String dir, String fname);
    /**
     * Original signature :
     * <code>char* appendSubdirs(const char*, const char*)</code>
     */
    Pointer appendSubdirs(String basedir, String subdirs);

    /**
     * Original signature :
     * <code>l_ok convertSepCharsInPath(char*, l_int32)</code>
     */
    int convertSepCharsInPath(ByteBuffer path, int type);

//      /**
//       * Original signature :
//       * <code>char* genPathname(const char*, const char*)</code>
//       */
//      Pointer genPathname(String dir, String fname);
    /**
     * Original signature :
     * <code>l_ok makeTempDirname(char*, size_t, const char*)</code>
     */
    int makeTempDirname(ByteBuffer result, NativeSize nbytes, String subdir);

    /**
     * Original signature :
     * <code>l_ok modifyTrailingSlash(char*, size_t, l_int32)</code>
     */
    int modifyTrailingSlash(ByteBuffer path, NativeSize nbytes, int flag);

    /**
     * Original signature : <code>char* l_makeTempFilename()</code>
     */
    Pointer l_makeTempFilename();

//      /**
//       * Original signature :
//       * <code>l_int32 extractNumberFromFilename(const char*, l_int32, l_int32)</code>
//       */
//      int extractNumberFromFilename(String fname, int numpre, int numpost);
    /**
     * Original signature :
     * <code>PIX* pixSimpleCaptcha(PIX*, l_int32, l_int32, l_uint32, l_uint32, l_int32)</code>
     */
    Pix pixSimpleCaptcha(Pix pixs, int border, int nterms, int seed, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRandomHarmonicWarp(PIX*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32, l_uint32, l_int32)</code>
     */
    Pix pixRandomHarmonicWarp(Pix pixs, float xmag, float ymag, float xfreq, float yfreq, int nx, int ny, int seed, int grayval);

    /**
     * Original signature :
     * <code>PIX* pixWarpStereoscopic(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixWarpStereoscopic(Pix pixs, int zbend, int zshiftt, int zshiftb, int ybendt, int ybendb, int redleft);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontal(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixStretchHorizontal(Pix pixs, int dir, int type, int hmax, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixStretchHorizontalSampled(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixStretchHorizontalLI(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShear(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixQuadraticVShear(Pix pixs, int dir, int vmaxt, int vmaxb, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixQuadraticVShearSampled(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    Pix pixQuadraticVShearLI(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStereoFromPair(PIX*, PIX*, l_float32, l_float32, l_float32)</code>
     */
    Pix pixStereoFromPair(Pix pix1, Pix pix2, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>L_WSHED* wshedCreate(PIX*, PIX*, l_int32, l_int32)</code>
     */
    L_WShed wshedCreate(Pix pixs, Pix pixm, int mindepth, int debugflag);

    /**
     * Original signature : <code>void wshedDestroy(L_WSHED**)</code>
     */
    void wshedDestroy(PointerByReference pwshed);

    /**
     * Original signature : <code>l_ok wshedApply(L_WSHED*)</code>
     */
    int wshedApply(L_WShed wshed);

    /**
     * Original signature :
     * <code>l_ok wshedBasins(L_WSHED*, PIXA**, NUMA**)</code>
     */
    int wshedBasins(L_WShed wshed, PointerByReference ppixa, PointerByReference pnalevels);

    /**
     * Original signature : <code>PIX* wshedRenderFill(L_WSHED*)</code>
     */
    Pix wshedRenderFill(L_WShed wshed);

    /**
     * Original signature : <code>PIX* wshedRenderColors(L_WSHED*)</code>
     */
    Pix wshedRenderColors(L_WShed wshed);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamWebP(FILE*)</code>
//       */
//      Pix pixReadStreamWebP(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemWebP(const l_uint8*, size_t)</code>
     */
    Pix pixReadMemWebP(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_ok readHeaderWebP(const char*, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderWebP(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemWebP(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*)</code>
     */
    int readHeaderMemWebP(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok pixWriteWebP(const char*, PIX*, l_int32, l_int32)</code>
     */
    int pixWriteWebP(String filename, Pix pixs, int quality, int lossless);

//      /**
//       * Original signature :
//       * <code>l_ok pixWriteStreamWebP(FILE*, PIX*, l_int32, l_int32)</code>
//       */
//      int pixWriteStreamWebP(FILE fp, Pix pixs, int quality, int lossless);
    /**
     * Original signature :
     * <code>l_ok pixWriteMemWebP(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code>
     */
    int pixWriteMemWebP(PointerByReference pencdata, NativeSizeByReference pencsize, Pix pixs, int quality, int lossless);

//    /**
//     * Original signature : <code>l_int32 l_jpegSetQuality(l_int32)</code>
//     */
//    int l_jpegSetQuality(int new_quality);
    
    /**
     * Original signature : <code>void setLeptDebugOK(l_int32)</code>
     */
    void setLeptDebugOK(int allow);
    
    /**
     * Original signature : <code>l_ok pixaWriteFiles(const char*, PIXA*, l_int32)</code>
     */
    int pixaWriteFiles(String rootname, Pixa pixa, int format);
    
//    /**
//     * Original signature : <code>l_ok pixWriteDebug(const char*, PIX*, l_int32)</code>
//     */
//    int pixWriteDebug(String fname, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWrite(const char*, PIX*, l_int32)</code>
     */
    int pixWrite(String fname, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteAutoFormat(const char*, PIX*)</code>
     */
    int pixWriteAutoFormat(String filename, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteStream(FILE*, PIX*, l_int32)</code>
     */
    int pixWriteStream(FILE fp, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteImpliedFormat(const char*, PIX*, l_int32, l_int32)</code>
     */
    int pixWriteImpliedFormat(String filename, Pix pix, int quality, int progressive);

    /**
     * Original signature : <code>l_int32 pixChooseOutputFormat(PIX*)</code>
     */
    int pixChooseOutputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 getImpliedFileFormat(const char*)</code>
     */
    int getImpliedFileFormat(String filename);

    /**
     * Original signature :
     * <code>l_ok pixGetAutoFormat(PIX*, l_int32*)</code>
     */
    int pixGetAutoFormat(Pix pix, IntBuffer pformat);

    /**
     * Original signature : <code>char* getFormatExtension(l_int32)</code>
     */
    Pointer getFormatExtension(int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteMem(l_uint8**, size_t*, PIX*, l_int32)</code>
     */
    int pixWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok l_fileDisplay(const char*, l_int32, l_int32, l_float32)</code>
     */
    int l_fileDisplay(String fname, int x, int y, float scale);

    /**
     * Original signature :
     * <code>l_ok pixDisplay(PIX*, l_int32, l_int32)</code>
     */
    int pixDisplay(Pix pixs, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixDisplayWithTitle(PIX*, l_int32, l_int32, const char*, l_int32)</code>
     */
    int pixDisplayWithTitle(Pix pixs, int x, int y, String title, int dispflag);

    /**
     * Original signature :
     * <code>l_ok pixSaveTiled(PIX*, PIXA*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    int pixSaveTiled(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int dp);

    /**
     * Original signature :
     * <code>l_ok pixSaveTiledOutline(PIX*, PIXA*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    int pixSaveTiledOutline(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int linewidth, int dp);

    /**
     * Original signature :
     * <code>l_ok pixSaveTiledWithText(PIX*, PIXA*, l_int32, l_int32, l_int32, l_int32, L_BMF*, const char*, l_uint32, l_int32)</code>
     */
    int pixSaveTiledWithText(Pix pixs, Pixa pixa, int outwidth, int newrow, int space, int linewidth, L_Bmf bmf, String textstr, int val, int location);

    /**
     * Original signature : <code>void l_chooseDisplayProg(l_int32)</code>
     */
    void l_chooseDisplayProg(int selection);

    /**
     * Original signature :
     * <code>l_ok pixDisplayWrite(PIX*, l_int32)</code>
     */
    int pixDisplayWrite(Pix pixs, int reduction);

    /**
     * Original signature :
     * <code>l_uint8* zlibCompress(l_uint8*, size_t, size_t*)</code>
     */
    Pointer zlibCompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_uint8* zlibUncompress(l_uint8*, size_t, size_t*)</code>
     */
    Pointer zlibUncompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);
}
