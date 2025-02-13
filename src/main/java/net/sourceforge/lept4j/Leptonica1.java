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
import com.sun.jna.Native;
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
 * <code>JNA Direct Mapping</code>.
 */
public class Leptonica1 implements Library, ILeptonica {

    static {
        Native.register(LoadLibs.getLeptonicaLibName());
    }

    /**
     * Original signature :
     * <code>PIX* pixCleanBackgroundToWhite(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixCleanBackgroundToWhite(Pix pixs, Pix pixim, Pix pixg, float gamma, int blackval, int whiteval);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormSimple(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixBackgroundNormSimple(Pix pixs, Pix pixim, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNorm(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixBackgroundNorm(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormMorph(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixBackgroundNormMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormGrayArray(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixBackgroundNormGrayArray(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormRGBArrays(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixBackgroundNormRGBArrays(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormGrayArrayMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixBackgroundNormGrayArrayMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixBackgroundNormRGBArraysMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixBackgroundNormRGBArraysMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixGetBackgroundGrayMap(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundRGBMap(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixGetBackgroundRGBMap(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundGrayMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixGetBackgroundGrayMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixm);

    /**
     * Original signature :
     * <code>l_ok pixGetBackgroundRGBMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixGetBackgroundRGBMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_ok pixFillMapHoles(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixFillMapHoles(Pix pix, int nx, int ny, int filltype);

    /**
     * Original signature :
     * <code>PIX* pixExtendByReplication(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixExtendByReplication(Pix pixs, int addw, int addh);

    /**
     * Original signature :
     * <code>l_ok pixSmoothConnectedRegions(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSmoothConnectedRegions(Pix pixs, Pix pixm, int factor);

    /**
     * Original signature :
     * <code>PIX* pixGetInvBackgroundMap(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixGetInvBackgroundMap(Pix pixs, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixApplyInvBackgroundGrayMap(Pix pixs, Pix pixm, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundRGBMap(PIX*, PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixApplyInvBackgroundRGBMap(Pix pixs, Pix pixmr, Pix pixmg, Pix pixmb, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyVariableGrayMap(PIX*, PIX*, l_int32)</code>
     */
    public static native Pix pixApplyVariableGrayMap(Pix pixs, Pix pixg, int target);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixGlobalNormRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int mapval);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormNoSatRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixGlobalNormNoSatRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int factor, float rank);

    /**
     * Original signature :
     * <code>l_ok pixThresholdSpreadNorm(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixThresholdSpreadNorm(Pix pixs, int filtertype, int edgethresh, int smoothx, int smoothy, float gamma, int minval, int maxval, int targetthresh, PointerByReference ppixth, PointerByReference ppixb, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormFlex(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixBackgroundNormFlex(Pix pixs, int sx, int sy, int smoothx, int smoothy, int delta);

    /**
     * Original signature :
     * <code>PIX* pixContrastNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixContrastNorm(Pix pixd, Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormTo1MinMax(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBackgroundNormTo1MinMax(Pix pixs, int contrast, int scalefactor);

    /**
     * Original signature : <code>PIX* pixConvertTo8MinMax(PIX*)</code>
     */
    public static native Pix pixConvertTo8MinMax(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixAffineSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampled(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixAffineSampled(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixAffinePta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffine(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixAffine(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
     */
    public static native Pix pixAffinePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffineColor(PIX*, l_float32*, l_uint32)</code>
     */
    public static native Pix pixAffineColor(Pix pixs, FloatBuffer vc, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
     */
    public static native Pix pixAffinePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffineGray(PIX*, l_float32*, l_uint8)</code>
     */
    public static native Pix pixAffineGray(Pix pixs, FloatBuffer vc, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixAffinePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);

    /**
     * Original signature :
     * <code>l_ok getAffineXformCoeffs(PTA*, PTA*, l_float32**)</code>
     */
    public static native int getAffineXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);

    /**
     * Original signature :
     * <code>l_ok affineInvertXform(l_float32*, l_float32**)</code>
     */
    public static native int affineInvertXform(FloatBuffer vc, PointerByReference pvci);

    /**
     * Original signature :
     * <code>l_ok affineXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int affineXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok affineXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int affineXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok linearInterpolatePixelColor(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_uint32, l_uint32*)</code>
     */
    public static native int linearInterpolatePixelColor(IntBuffer datas, int wpls, int w, int h, float x, float y, int colorval, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_ok linearInterpolatePixelGray(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32*)</code>
     */
    public static native int linearInterpolatePixelGray(IntBuffer datas, int wpls, int w, int h, float x, float y, int grayval, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_int32 gaussjordan(l_float32**, l_float32*, l_int32)</code>
     */
    public static native int gaussjordan(PointerByReference a, FloatBuffer b, int n);

    /**
     * Original signature :
     * <code>PIX* pixAffineSequential(PIX*, PTA*, PTA*, l_int32, l_int32)</code>
     */
    public static native Pix pixAffineSequential(Pix pixs, Pta ptad, Pta ptas, int bw, int bh);

    /**
     * Original signature :
     * <code>l_float32* createMatrix2dTranslate(l_float32, l_float32)</code>
     */
    public static native FloatByReference createMatrix2dTranslate(float transx, float transy);

    /**
     * Original signature :
     * <code>l_float32* createMatrix2dScale(l_float32, l_float32)</code>
     */
    public static native FloatByReference createMatrix2dScale(float scalex, float scaley);

    /**
     * Original signature :
     * <code>l_float32* createMatrix2dRotate(l_float32, l_float32, l_float32)</code>
     */
    public static native FloatByReference createMatrix2dRotate(float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>PTA* ptaTranslate(PTA*, l_float32, l_float32)</code>
     */
    public static native Pta ptaTranslate(Pta ptas, float transx, float transy);

    /**
     * Original signature :
     * <code>PTA* ptaScale(PTA*, l_float32, l_float32)</code>
     */
    public static native Pta ptaScale(Pta ptas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PTA* ptaRotate(PTA*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pta ptaRotate(Pta ptas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>BOXA* boxaTranslate(BOXA*, l_float32, l_float32)</code>
     */
    public static native Boxa boxaTranslate(Boxa boxas, float transx, float transy);

    /**
     * Original signature :
     * <code>BOXA* boxaScale(BOXA*, l_float32, l_float32)</code>
     */
    public static native Boxa boxaScale(Boxa boxas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>BOXA* boxaRotate(BOXA*, l_float32, l_float32, l_float32)</code>
     */
    public static native Boxa boxaRotate(Boxa boxas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>PTA* ptaAffineTransform(PTA*, l_float32*)</code>
     */
    public static native Pta ptaAffineTransform(Pta ptas, FloatBuffer mat);

    /**
     * Original signature :
     * <code>BOXA* boxaAffineTransform(BOXA*, l_float32*)</code>
     */
    public static native Boxa boxaAffineTransform(Boxa boxas, FloatBuffer mat);

    /**
     * Original signature :
     * <code>l_ok l_productMatVec(l_float32*, l_float32*, l_float32*, l_int32)</code>
     */
    public static native int l_productMatVec(FloatBuffer mat, FloatBuffer vecs, FloatBuffer vecd, int size);

    /**
     * Original signature :
     * <code>l_ok l_productMat2(l_float32*, l_float32*, l_float32*, l_int32)</code>
     */
    public static native int l_productMat2(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer matd, int size);

    /**
     * Original signature :
     * <code>l_ok l_productMat3(l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code>
     */
    public static native int l_productMat3(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer matd, int size);

    /**
     * Original signature :
     * <code>l_ok l_productMat4(l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code>
     */
    public static native int l_productMat4(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer mat4, FloatBuffer matd, int size);

    /**
     * Original signature :
     * <code>l_int32 l_getDataBit(const void*, l_int32)</code>
     */
    public static native int l_getDataBit(Pointer line, int n);

    /**
     * Original signature : <code>void l_setDataBit(void*, l_int32)</code>
     */
    public static native void l_setDataBit(Pointer line, int n);

    /**
     * Original signature : <code>void l_clearDataBit(void*, l_int32)</code>
     */
    public static native void l_clearDataBit(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataBitVal(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataBitVal(Pointer line, int n, int val);

    /**
     * Original signature :
     * <code>l_int32 l_getDataDibit(const void*, l_int32)</code>
     */
    public static native int l_getDataDibit(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataDibit(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataDibit(Pointer line, int n, int val);

    /**
     * Original signature : <code>void l_clearDataDibit(void*, l_int32)</code>
     */
    public static native void l_clearDataDibit(Pointer line, int n);

    /**
     * Original signature :
     * <code>l_int32 l_getDataQbit(const void*, l_int32)</code>
     */
    public static native int l_getDataQbit(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataQbit(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataQbit(Pointer line, int n, int val);

    /**
     * Original signature : <code>void l_clearDataQbit(void*, l_int32)</code>
     */
    public static native void l_clearDataQbit(Pointer line, int n);

    /**
     * Original signature :
     * <code>l_int32 l_getDataByte(const void*, l_int32)</code>
     */
    public static native int l_getDataByte(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataByte(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataByte(Pointer line, int n, int val);

    /**
     * Original signature :
     * <code>l_int32 l_getDataTwoBytes(const void*, l_int32)</code>
     */
    public static native int l_getDataTwoBytes(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataTwoBytes(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataTwoBytes(Pointer line, int n, int val);

    /**
     * Original signature :
     * <code>l_int32 l_getDataFourBytes(const void*, l_int32)</code>
     */
    public static native int l_getDataFourBytes(Pointer line, int n);

    /**
     * Original signature :
     * <code>void l_setDataFourBytes(void*, l_int32, l_int32)</code>
     */
    public static native void l_setDataFourBytes(Pointer line, int n, int val);

    /**
     * Original signature :
     * <code>char* barcodeDispatchDecoder(char*, l_int32, l_int32)</code>
     */
    public static native Pointer barcodeDispatchDecoder(ByteBuffer barstr, int format, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 barcodeFormatIsSupported(l_int32)</code>
     */
    public static native int barcodeFormatIsSupported(int format);

    /**
     * Original signature :
     * <code>NUMA* pixFindBaselines(PIX*, PTA**, PIXA*)</code>
     */
    public static native Numa pixFindBaselines(Pix pixs, PointerByReference ppta, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixDeskewLocal(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixDeskewLocal(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixGetLocalSkewTransform(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, PTA**, PTA**)</code>
     */
    public static native int pixGetLocalSkewTransform(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, PointerByReference pptas, PointerByReference pptad);

    /**
     * Original signature :
     * <code>NUMA* pixGetLocalSkewAngles(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*, l_float32*, l_int32)</code>
     */
    public static native Numa pixGetLocalSkewAngles(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, FloatBuffer pa, FloatBuffer pb, int debug);

    /**
     * Original signature :
     * <code>L_BBUFFER* bbufferCreate(const l_uint8*, l_int32)</code>
     */
    public static native L_ByteBuffer bbufferCreate(ByteBuffer indata, int nalloc);

    /**
     * Original signature : <code>void bbufferDestroy(L_BBUFFER**)</code>
     */
    public static native void bbufferDestroy(PointerByReference pbb);

    /**
     * Original signature :
     * <code>l_uint8* bbufferDestroyAndSaveData(L_BBUFFER**, size_t*)</code>
     */
    public static native Pointer bbufferDestroyAndSaveData(PointerByReference pbb, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferRead(L_BBUFFER*, l_uint8*, l_int32)</code>
     */
    public static native int bbufferRead(L_ByteBuffer bb, ByteBuffer src, int nbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferReadStream(L_BBUFFER*, FILE*, l_int32)</code>
     */
    public static native int bbufferReadStream(L_ByteBuffer bb, FILE fp, int nbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferExtendArray(L_BBUFFER*, l_int32)</code>
     */
    public static native int bbufferExtendArray(L_ByteBuffer bb, int nbytes);

    /**
     * Original signature :
     * <code>l_ok bbufferWrite(L_BBUFFER*, l_uint8*, size_t, size_t*)</code>
     */
    public static native int bbufferWrite(L_ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_ok bbufferWriteStream(L_BBUFFER*, FILE*, size_t, size_t*)</code>
     */
    public static native int bbufferWriteStream(L_ByteBuffer bb, FILE fp, NativeSize nbytes, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>PIX* pixBilateral(PIX*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixBilateral(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);

    /**
     * Original signature :
     * <code>PIX* pixBilateralGray(PIX*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixBilateralGray(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);

    /**
     * Original signature :
     * <code>PIX* pixBilateralExact(PIX*, L_KERNEL*, L_KERNEL*)</code>
     */
    public static native Pix pixBilateralExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);

    /**
     * Original signature :
     * <code>PIX* pixBilateralGrayExact(PIX*, L_KERNEL*, L_KERNEL*)</code>
     */
    public static native Pix pixBilateralGrayExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);

    /**
     * Original signature :
     * <code>PIX* pixBlockBilateralExact(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixBlockBilateralExact(Pix pixs, float spatial_stdev, float range_stdev);

    /**
     * Original signature : <code>L_KERNEL* makeRangeKernel(l_float32)</code>
     */
    public static native L_Kernel makeRangeKernel(float range_stdev);

    /**
     * Original signature :
     * <code>PIX* pixBilinearSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixBilinearSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixBilinearSampled(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixBilinearSampled(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixBilinearPta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixBilinearPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixBilinear(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixBilinear(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixBilinearPtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
     */
    public static native Pix pixBilinearPtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixBilinearColor(PIX*, l_float32*, l_uint32)</code>
     */
    public static native Pix pixBilinearColor(Pix pixs, FloatBuffer vc, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixBilinearPtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
     */
    public static native Pix pixBilinearPtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixBilinearGray(PIX*, l_float32*, l_uint8)</code>
     */
    public static native Pix pixBilinearGray(Pix pixs, FloatBuffer vc, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixBilinearPtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixBilinearPtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);

    /**
     * Original signature :
     * <code>l_ok getBilinearXformCoeffs(PTA*, PTA*, l_float32**)</code>
     */
    public static native int getBilinearXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);

    /**
     * Original signature :
     * <code>l_ok bilinearXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int bilinearXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok bilinearXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int bilinearXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok pixOtsuAdaptiveThreshold(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PIX**, PIX**)</code>
     */
    public static native int pixOtsuAdaptiveThreshold(Pix pixs, int sx, int sy, int smoothx, int smoothy, float scorefract, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixOtsuThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    public static native Pix pixOtsuThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>PIX* pixMaskedThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    public static native Pix pixMaskedThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>l_ok pixSauvolaBinarizeTiled(PIX*, l_int32, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
     */
    public static native int pixSauvolaBinarizeTiled(Pix pixs, int whsize, float factor, int nx, int ny, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok pixSauvolaBinarize(PIX*, l_int32, l_float32, l_int32, PIX**, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixSauvolaBinarize(Pix pixs, int whsize, float factor, int addborder, PointerByReference ppixm, PointerByReference ppixsd, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixSauvolaOnContrastNorm(PIX*, l_int32, PIX**, PIX**)</code>
     */
    public static native Pix pixSauvolaOnContrastNorm(Pix pixs, int mindiff, PointerByReference ppixn, PointerByReference ppixth);

    /**
     * Original signature :
     * <code>PIX* pixThreshOnDoubleNorm(PIX*, l_int32)</code>
     */
    public static native Pix pixThreshOnDoubleNorm(Pix pixs, int mindiff);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code>
     */
    public static native int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntBuffer pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code>
     */
    public static native int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntByReference pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByHisto(PIX*, l_int32, l_int32, l_int32, l_int32*, PIX**, NUMA**, PIX**)</code>
     */
    public static native int pixThresholdByHisto(Pix pixs, int factor, int halfw, int skip, IntBuffer pthresh, PointerByReference ppixd, PointerByReference pnahisto, PointerByReference ppixhisto);

    /**
     * Original signature :
     * <code>l_ok pixThresholdByHisto(PIX*, l_int32, l_int32, l_int32, l_int32*, PIX**, NUMA**, PIX**)</code>
     */
    public static native int pixThresholdByHisto(Pix pixs, int factor, int halfw, int skip, IntByReference pthresh, PointerByReference ppixd, PointerByReference pnahisto, PointerByReference ppixhisto);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryReplicate(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixExpandBinaryReplicate(Pix pixs, int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryPower2(PIX*, l_int32)</code>
     */
    public static native Pix pixExpandBinaryPower2(Pix pixs, int factor);

    /**
     * Original signature : <code>PIX* pixReduceBinary2(PIX*, l_uint8*)</code>
     */
    public static native Pix pixReduceBinary2(Pix pixs, ByteBuffer intab);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinaryCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixReduceRankBinaryCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinary2(PIX*, l_int32, l_uint8*)</code>
     */
    public static native Pix pixReduceRankBinary2(Pix pixs, int level, ByteBuffer intab);

    /**
     * Original signature : <code>l_uint8* makeSubsampleTab2x()</code>
     */
    public static native Pointer makeSubsampleTab2x();

    /**
     * Original signature :
     * <code>PIX* pixBlend(PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixBlend(Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendMask(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixBlendMask(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendGray(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixBlendGray(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayInverse(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixBlendGrayInverse(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendColor(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_uint32)</code>
     */
    public static native Pix pixBlendColor(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendColorByChannel(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_float32, l_int32, l_uint32)</code>
     */
    public static native Pix pixBlendColorByChannel(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float rfract, float gfract, float bfract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayAdapt(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixBlendGrayAdapt(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int shift);

    /**
     * Original signature :
     * <code>PIX* pixFadeWithGray(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixFadeWithGray(Pix pixs, Pix pixb, float factor, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendHardLight(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixBlendHardLight(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>l_ok pixBlendCmap(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixBlendCmap(Pix pixs, Pix pixb, int x, int y, int sindex);

    /**
     * Original signature :
     * <code>PIX* pixBlendWithGrayMask(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlendWithGrayMask(Pix pixs1, Pix pixs2, Pix pixg, int x, int y);

    /**
     * Original signature :
     * <code>PIX* pixBlendBackgroundToColor(PIX*, PIX*, BOX*, l_uint32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixBlendBackgroundToColor(Pix pixd, Pix pixs, Box box, int color, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixMultiplyByColor(PIX*, PIX*, BOX*, l_uint32)</code>
     */
    public static native Pix pixMultiplyByColor(Pix pixd, Pix pixs, Box box, int color);

    /**
     * Original signature :
     * <code>PIX* pixAlphaBlendUniform(PIX*, l_uint32)</code>
     */
    public static native Pix pixAlphaBlendUniform(Pix pixs, int color);

    /**
     * Original signature :
     * <code>PIX* pixAddAlphaToBlend(PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixAddAlphaToBlend(Pix pixs, float fract, int invert);

    /**
     * Original signature : <code>PIX* pixSetAlphaOverWhite(PIX*)</code>
     */
    public static native Pix pixSetAlphaOverWhite(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixLinearEdgeFade(PIX*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native int pixLinearEdgeFade(Pix pixs, int dir, int fadeto, float distfract, float maxfade);

    /**
     * Original signature : <code>L_BMF* bmfCreate(const char*, l_int32)</code>
     */
    public static native L_Bmf bmfCreate(String dir, int fontsize);

    /**
     * Original signature : <code>void bmfDestroy(L_BMF**)</code>
     */
    public static native void bmfDestroy(PointerByReference pbmf);

    /**
     * Original signature : <code>PIX* bmfGetPix(L_BMF*, char)</code>
     */
    public static native Pix bmfGetPix(L_Bmf bmf, byte chr);

    /**
     * Original signature :
     * <code>l_ok bmfGetWidth(L_BMF*, char, l_int32*)</code>
     */
    public static native int bmfGetWidth(L_Bmf bmf, byte chr, IntBuffer pw);

    /**
     * Original signature :
     * <code>l_ok bmfGetBaseline(L_BMF*, char, l_int32*)</code>
     */
    public static native int bmfGetBaseline(L_Bmf bmf, byte chr, IntBuffer pbaseline);

    /**
     * Original signature :
     * <code>PIXA* pixaGetFont(const char*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native Pixa pixaGetFont(String dir, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2);

    /**
     * Original signature :
     * <code>l_ok pixaSaveFont(const char*, const char*, l_int32)</code>
     */
    public static native int pixaSaveFont(String indir, String outdir, int fontsize);

    /**
     * Original signature : <code>PIX* pixReadStreamBmp(FILE*)</code>
     */
    public static native Pix pixReadStreamBmp(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemBmp(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemBmp(ByteBuffer cdata, NativeSize size);

    /**
     * Original signature : <code>l_ok pixWriteStreamBmp(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamBmp(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemBmp(l_uint8**, size_t*, PIX*)</code>
     */
    public static native int pixWriteMemBmp(PointerByReference pfdata, NativeSizeByReference pfsize, Pix pixs);

    /**
     * Original signature : <code>PIXA* l_bootnum_gen1()</code>
     */
    public static native Pixa l_bootnum_gen1();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen2()</code>
     */
    public static native Pixa l_bootnum_gen2();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen3()</code>
     */
    public static native Pixa l_bootnum_gen3();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen4(l_int32)</code>
     */
    public static native Pixa l_bootnum_gen4(int nsamp);

    /**
     * Original signature :
     * <code>BOX* boxCreate(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Box boxCreate(int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>BOX* boxCreateValid(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Box boxCreateValid(int x, int y, int w, int h);

    /**
     * Original signature : <code>BOX* boxCopy(BOX*)</code>
     */
    public static native Box boxCopy(Box box);

    /**
     * Original signature : <code>BOX* boxClone(BOX*)</code>
     */
    public static native Box boxClone(Box box);

    /**
     * Original signature : <code>void boxDestroy(BOX**)</code>
     */
    public static native void boxDestroy(PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok boxGetGeometry(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxGetGeometry(Box box, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok boxSetGeometry(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int boxSetGeometry(Box box, int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>l_ok boxGetSideLocations(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxGetSideLocations(Box box, IntBuffer pl, IntBuffer pr, IntBuffer pt, IntBuffer pb);

    /**
     * Original signature :
     * <code>l_ok boxSetSideLocations(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int boxSetSideLocations(Box box, int l, int r, int t, int b);

    /**
     * Original signature : <code>l_ok boxIsValid(BOX*, l_int32*)</code>
     */
    public static native int boxIsValid(Box box, IntBuffer pvalid);

    /**
     * Original signature : <code>BOXA* boxaCreate(l_int32)</code>
     */
    public static native Boxa boxaCreate(int n);

    /**
     * Original signature : <code>BOXA* boxaCopy(BOXA*, l_int32)</code>
     */
    public static native Boxa boxaCopy(Boxa boxa, int copyflag);

    /**
     * Original signature : <code>void boxaDestroy(BOXA**)</code>
     */
    public static native void boxaDestroy(PointerByReference pboxa);

    /**
     * Original signature : <code>l_ok boxaAddBox(BOXA*, BOX*, l_int32)</code>
     */
    public static native int boxaAddBox(Boxa boxa, Box box, int copyflag);

    /**
     * Original signature : <code>l_ok boxaExtendArray(BOXA*)</code>
     */
    public static native int boxaExtendArray(Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaExtendArrayToSize(BOXA*, size_t)</code>
     */
    public static native int boxaExtendArrayToSize(Boxa boxa, NativeSize size);

    /**
     * Original signature : <code>l_int32 boxaGetCount(BOXA*)</code>
     */
    public static native int boxaGetCount(Boxa boxa);

    /**
     * Original signature : <code>l_int32 boxaGetValidCount(BOXA*)</code>
     */
    public static native int boxaGetValidCount(Boxa boxa);

    /**
     * Original signature :
     * <code>BOX* boxaGetBox(BOXA*, l_int32, l_int32)</code>
     */
    public static native Box boxaGetBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature :
     * <code>BOX* boxaGetValidBox(BOXA*, l_int32, l_int32)</code>
     */
    public static native Box boxaGetValidBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature : <code>NUMA* boxaFindInvalidBoxes(BOXA*)</code>
     */
    public static native Numa boxaFindInvalidBoxes(Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaGetBoxGeometry(BOXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaGetBoxGeometry(Boxa boxa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature : <code>l_ok boxaIsFull(BOXA*, l_int32*)</code>
     */
    public static native int boxaIsFull(Boxa boxa, IntBuffer pfull);

    /**
     * Original signature :
     * <code>l_ok boxaReplaceBox(BOXA*, l_int32, BOX*)</code>
     */
    public static native int boxaReplaceBox(Boxa boxa, int index, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaInsertBox(BOXA*, l_int32, BOX*)</code>
     */
    public static native int boxaInsertBox(Boxa boxa, int index, Box box);

    /**
     * Original signature : <code>l_ok boxaRemoveBox(BOXA*, l_int32)</code>
     */
    public static native int boxaRemoveBox(Boxa boxa, int index);

    /**
     * Original signature :
     * <code>l_ok boxaRemoveBoxAndSave(BOXA*, l_int32, BOX**)</code>
     */
    public static native int boxaRemoveBoxAndSave(Boxa boxa, int index, PointerByReference pbox);

    /**
     * Original signature : <code>BOXA* boxaSaveValid(BOXA*, l_int32)</code>
     */
    public static native Boxa boxaSaveValid(Boxa boxas, int copyflag);

    /**
     * Original signature : <code>l_ok boxaInitFull(BOXA*, BOX*)</code>
     */
    public static native int boxaInitFull(Boxa boxa, Box box);

    /**
     * Original signature : <code>l_ok boxaClear(BOXA*)</code>
     */
    public static native int boxaClear(Boxa boxa);

    /**
     * Original signature : <code>BOXAA* boxaaCreate(l_int32)</code>
     */
    public static native Boxaa boxaaCreate(int n);

    /**
     * Original signature : <code>BOXAA* boxaaCopy(BOXAA*, l_int32)</code>
     */
    public static native Boxaa boxaaCopy(Boxaa baas, int copyflag);

    /**
     * Original signature : <code>void boxaaDestroy(BOXAA**)</code>
     */
    public static native void boxaaDestroy(PointerByReference pbaa);

    /**
     * Original signature :
     * <code>l_ok boxaaAddBoxa(BOXAA*, BOXA*, l_int32)</code>
     */
    public static native int boxaaAddBoxa(Boxaa baa, Boxa ba, int copyflag);

    /**
     * Original signature : <code>l_ok boxaaExtendArray(BOXAA*)</code>
     */
    public static native int boxaaExtendArray(Boxaa baa);

    /**
     * Original signature :
     * <code>l_ok boxaaExtendArrayToSize(BOXAA*, l_int32)</code>
     */
    public static native int boxaaExtendArrayToSize(Boxaa baa, int size);

    /**
     * Original signature : <code>l_int32 boxaaGetCount(BOXAA*)</code>
     */
    public static native int boxaaGetCount(Boxaa baa);

    /**
     * Original signature : <code>l_int32 boxaaGetBoxCount(BOXAA*)</code>
     */
    public static native int boxaaGetBoxCount(Boxaa baa);

    /**
     * Original signature :
     * <code>BOXA* boxaaGetBoxa(BOXAA*, l_int32, l_int32)</code>
     */
    public static native Boxa boxaaGetBoxa(Boxaa baa, int index, int accessflag);

    /**
     * Original signature :
     * <code>BOX* boxaaGetBox(BOXAA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Box boxaaGetBox(Boxaa baa, int iboxa, int ibox, int accessflag);

    /**
     * Original signature : <code>l_ok boxaaInitFull(BOXAA*, BOXA*)</code>
     */
    public static native int boxaaInitFull(Boxaa baa, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaaExtendWithInit(BOXAA*, l_int32, BOXA*)</code>
     */
    public static native int boxaaExtendWithInit(Boxaa baa, int maxindex, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaaReplaceBoxa(BOXAA*, l_int32, BOXA*)</code>
     */
    public static native int boxaaReplaceBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaaInsertBoxa(BOXAA*, l_int32, BOXA*)</code>
     */
    public static native int boxaaInsertBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature : <code>l_ok boxaaRemoveBoxa(BOXAA*, l_int32)</code>
     */
    public static native int boxaaRemoveBoxa(Boxaa baa, int index);

    /**
     * Original signature :
     * <code>l_ok boxaaAddBox(BOXAA*, l_int32, BOX*, l_int32)</code>
     */
    public static native int boxaaAddBox(Boxaa baa, int index, Box box, int accessflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code>
     */
    public static native Boxaa boxaaReadFromFiles(String dirname, String substr, int first, int nfiles);

    /**
     * Original signature : <code>BOXAA* boxaaRead(const char*)</code>
     */
    public static native Boxaa boxaaRead(String filename);

    /**
     * Original signature : <code>BOXAA* boxaaReadStream(FILE*)</code>
     */
    public static native Boxaa boxaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Boxaa boxaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok boxaaWrite(const char*, BOXAA*)</code>
     */
    public static native int boxaaWrite(String filename, Boxaa baa);

    /**
     * Original signature : <code>l_ok boxaaWriteStream(FILE*, BOXAA*)</code>
     */
    public static native int boxaaWriteStream(FILE fp, Boxaa baa);

    /**
     * Original signature :
     * <code>l_ok boxaaWriteMem(l_uint8**, size_t*, BOXAA*)</code>
     */
    public static native int boxaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxaa baa);

    /**
     * Original signature : <code>BOXA* boxaRead(const char*)</code>
     */
    public static native Boxa boxaRead(String filename);

    /**
     * Original signature : <code>BOXA* boxaReadStream(FILE*)</code>
     */
    public static native Boxa boxaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXA* boxaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Boxa boxaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok boxaWriteDebug(const char*, BOXA*)</code>
     */
    public static native int boxaWriteDebug(String filename, Boxa boxa);

    /**
     * Original signature : <code>l_ok boxaWrite(const char*, BOXA*)</code>
     */
    public static native int boxaWrite(String filename, Boxa boxa);

    /**
     * Original signature : <code>l_ok boxaWriteStream(FILE*, BOXA*)</code>
     */
    public static native int boxaWriteStream(FILE fp, Boxa boxa);

    /**
     * Original signature : <code>l_ok boxaWriteStderr(BOXA*)</code>
     */
    public static native int boxaWriteStderr(Boxa boxa);

    /**
     * Original signature :
     * <code>l_ok boxaWriteMem(l_uint8**, size_t*, BOXA*)</code>
     */
    public static native int boxaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxa boxa);

    /**
     * Original signature : <code>l_ok boxPrintStreamInfo(FILE*, BOX*)</code>
     */
    public static native int boxPrintStreamInfo(FILE fp, Box box);

    /**
     * Original signature : <code>l_ok boxContains(BOX*, BOX*, l_int32*)</code>
     */
    public static native int boxContains(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature :
     * <code>l_ok boxIntersects(BOX*, BOX*, l_int32*)</code>
     */
    public static native int boxIntersects(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature : <code>BOXA* boxaContainedInBox(BOXA*, BOX*)</code>
     */
    public static native Boxa boxaContainedInBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaContainedInBoxCount(BOXA*, BOX*, l_int32*)</code>
     */
    public static native int boxaContainedInBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_ok boxaContainedInBoxa(BOXA*, BOXA*, l_int32*)</code>
     */
    public static native int boxaContainedInBoxa(Boxa boxa1, Boxa boxa2, IntBuffer pcontained);

    /**
     * Original signature : <code>BOXA* boxaIntersectsBox(BOXA*, BOX*)</code>
     */
    public static native Boxa boxaIntersectsBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_ok boxaIntersectsBoxCount(BOXA*, BOX*, l_int32*)</code>
     */
    public static native int boxaIntersectsBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature : <code>BOXA* boxaClipToBox(BOXA*, BOX*)</code>
     */
    public static native Boxa boxaClipToBox(Boxa boxas, Box box);

    /**
     * Original signature : <code>BOXA* boxaCombineOverlaps(BOXA*, PIXA*)</code>
     */
    public static native Boxa boxaCombineOverlaps(Boxa boxas, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok boxaCombineOverlapsInPair(BOXA*, BOXA*, BOXA**, BOXA**, PIXA*)</code>
     */
    public static native int boxaCombineOverlapsInPair(Boxa boxas1, Boxa boxas2, PointerByReference pboxad1, PointerByReference pboxad2, Pixa pixadb);

    /**
     * Original signature : <code>BOX* boxOverlapRegion(BOX*, BOX*)</code>
     */
    public static native Box boxOverlapRegion(Box box1, Box box2);

    /**
     * Original signature : <code>BOX* boxBoundingRegion(BOX*, BOX*)</code>
     */
    public static native Box boxBoundingRegion(Box box1, Box box2);

    /**
     * Original signature :
     * <code>l_ok boxOverlapFraction(BOX*, BOX*, l_float32*)</code>
     */
    public static native int boxOverlapFraction(Box box1, Box box2, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok boxOverlapArea(BOX*, BOX*, l_int32*)</code>
     */
    public static native int boxOverlapArea(Box box1, Box box2, IntBuffer parea);

    /**
     * Original signature :
     * <code>BOXA* boxaHandleOverlaps(BOXA*, l_int32, l_int32, l_float32, l_float32, NUMA**)</code>
     */
    public static native Boxa boxaHandleOverlaps(Boxa boxas, int op, int range, float min_overlap, float max_ratio, PointerByReference pnamap);

    /**
     * Original signature :
     * <code>l_ok boxOverlapDistance(BOX*, BOX*, l_int32*, l_int32*)</code>
     */
    public static native int boxOverlapDistance(Box box1, Box box2, IntBuffer ph_ovl, IntBuffer pv_ovl);

    /**
     * Original signature :
     * <code>l_ok boxSeparationDistance(BOX*, BOX*, l_int32*, l_int32*)</code>
     */
    public static native int boxSeparationDistance(Box box1, Box box2, IntBuffer ph_sep, IntBuffer pv_sep);

    /**
     * Original signature :
     * <code>l_ok boxCompareSize(BOX*, BOX*, l_int32, l_int32*)</code>
     */
    public static native int boxCompareSize(Box box1, Box box2, int type, IntBuffer prel);

    /**
     * Original signature :
     * <code>l_ok boxContainsPt(BOX*, l_float32, l_float32, l_int32*)</code>
     */
    public static native int boxContainsPt(Box box, float x, float y, IntBuffer pcontains);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToPt(BOXA*, l_int32, l_int32)</code>
     */
    public static native Box boxaGetNearestToPt(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToLine(BOXA*, l_int32, l_int32)</code>
     */
    public static native Box boxaGetNearestToLine(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>l_ok boxaFindNearestBoxes(BOXA*, l_int32, l_int32, NUMAA**, NUMAA**)</code>
     */
    public static native int boxaFindNearestBoxes(Boxa boxa, int dist_select, int range, PointerByReference pnaaindex, PointerByReference pnaadist);

    /**
     * Original signature :
     * <code>l_ok boxaGetNearestByDirection(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int boxaGetNearestByDirection(Boxa boxa, int i, int dir, int dist_select, int range, IntBuffer pindex, IntBuffer pdist);

    /**
     * Original signature :
     * <code>l_ok boxGetCenter(BOX*, l_float32*, l_float32*)</code>
     */
    public static native int boxGetCenter(Box box, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_ok boxIntersectByLine(BOX*, l_int32, l_int32, l_float32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxIntersectByLine(Box box, int x, int y, float slope, IntBuffer px1, IntBuffer py1, IntBuffer px2, IntBuffer py2, IntBuffer pn);

    /**
     * Original signature :
     * <code>BOX* boxClipToRectangle(BOX*, l_int32, l_int32)</code>
     */
    public static native Box boxClipToRectangle(Box box, int wi, int hi);

    /**
     * Original signature :
     * <code>l_ok boxClipToRectangleParams(BOX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxClipToRectangleParams(Box box, int w, int h, IntBuffer pxstart, IntBuffer pystart, IntBuffer pxend, IntBuffer pyend, IntBuffer pbw, IntBuffer pbh);

    /**
     * Original signature :
     * <code>BOX* boxRelocateOneSide(BOX*, BOX*, l_int32, l_int32)</code>
     */
    public static native Box boxRelocateOneSide(Box boxd, Box boxs, int loc, int sideflag);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustSides(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaAdjustSides(Boxa boxas, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>l_ok boxaAdjustBoxSides(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int boxaAdjustBoxSides(Boxa boxa, int index, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOX* boxAdjustSides(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Box boxAdjustSides(Box boxd, Box boxs, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOXA* boxaSetSide(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaSetSide(Boxa boxad, Boxa boxas, int side, int val, int thresh);

    /**
     * Original signature :
     * <code>l_ok boxSetSide(BOX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int boxSetSide(Box boxs, int side, int val, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustWidthToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaAdjustWidthToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustHeightToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaAdjustHeightToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature : <code>l_ok boxEqual(BOX*, BOX*, l_int32*)</code>
     */
    public static native int boxEqual(Box box1, Box box2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code>
     */
    public static native int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code>
     */
    public static native int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntByReference psame);

    /**
     * Original signature :
     * <code>l_ok boxSimilar(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int boxSimilar(Box box1, Box box2, int leftdiff, int rightdiff, int topdiff, int botdiff, IntBuffer psimilar);

    /**
     * Original signature :
     * <code>l_ok boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code>
     */
    public static native int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntBuffer psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_ok boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code>
     */
    public static native int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntByReference psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_ok boxaJoin(BOXA*, BOXA*, l_int32, l_int32)</code>
     */
    public static native int boxaJoin(Boxa boxad, Boxa boxas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_ok boxaaJoin(BOXAA*, BOXAA*, l_int32, l_int32)</code>
     */
    public static native int boxaaJoin(Boxaa baad, Boxaa baas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_ok boxaSplitEvenOdd(BOXA*, l_int32, BOXA**, BOXA**)</code>
     */
    public static native int boxaSplitEvenOdd(Boxa boxa, int fillflag, PointerByReference pboxae, PointerByReference pboxao);

    /**
     * Original signature :
     * <code>BOXA* boxaMergeEvenOdd(BOXA*, BOXA*, l_int32)</code>
     */
    public static native Boxa boxaMergeEvenOdd(Boxa boxae, Boxa boxao, int fillflag);

    /**
     * Original signature :
     * <code>BOXA* boxaTransform(BOXA*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Boxa boxaTransform(Boxa boxas, int shiftx, int shifty, float scalex, float scaley);

    /**
     * Original signature :
     * <code>BOX* boxTransform(BOX*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Box boxTransform(Box box, int shiftx, int shifty, float scalex, float scaley);

    /**
     * Original signature :
     * <code>BOXA* boxaTransformOrdered(BOXA*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Boxa boxaTransformOrdered(Boxa boxas, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);

    /**
     * Original signature :
     * <code>BOX* boxTransformOrdered(BOX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Box boxTransformOrdered(Box boxs, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);

    /**
     * Original signature :
     * <code>BOXA* boxaRotateOrth(BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaRotateOrth(Boxa boxas, int w, int h, int rotation);

    /**
     * Original signature :
     * <code>BOX* boxRotateOrth(BOX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Box boxRotateOrth(Box box, int w, int h, int rotation);

    /**
     * Original signature :
     * <code>BOXA* boxaShiftWithPta(BOXA*, PTA*, l_int32)</code>
     */
    public static native Boxa boxaShiftWithPta(Boxa boxas, Pta pta, int dir);

    /**
     * Original signature :
     * <code>BOXA* boxaSort(BOXA*, l_int32, l_int32, NUMA**)</code>
     */
    public static native Boxa boxaSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);

    /**
     * Original signature :
     * <code>BOXA* boxaBinSort(BOXA*, l_int32, l_int32, NUMA**)</code>
     */
    public static native Boxa boxaBinSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);

    /**
     * Original signature : <code>BOXA* boxaSortByIndex(BOXA*, NUMA*)</code>
     */
    public static native Boxa boxaSortByIndex(Boxa boxas, Numa naindex);

    /**
     * Original signature :
     * <code>BOXAA* boxaSort2d(BOXA*, NUMAA**, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxaa boxaSort2d(Boxa boxas, PointerByReference pnaad, int delta1, int delta2, int minh1);

    /**
     * Original signature : <code>BOXAA* boxaSort2dByIndex(BOXA*, NUMAA*)</code>
     */
    public static native Boxaa boxaSort2dByIndex(Boxa boxas, Numaa naa);

    /**
     * Original signature :
     * <code>l_ok boxaExtractAsNuma(BOXA*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, l_int32)</code>
     */
    public static native int boxaExtractAsNuma(Boxa boxa, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference pnaw, PointerByReference pnah, int keepinvalid);

    /**
     * Original signature :
     * <code>l_ok boxaExtractAsPta(BOXA*, PTA**, PTA**, PTA**, PTA**, PTA**, PTA**, l_int32)</code>
     */
    public static native int boxaExtractAsPta(Boxa boxa, PointerByReference pptal, PointerByReference pptat, PointerByReference pptar, PointerByReference pptab, PointerByReference pptaw, PointerByReference pptah, int keepinvalid);

    /**
     * Original signature : <code>PTA* boxaExtractCorners(BOXA*, l_int32)</code>
     */
    public static native Pta boxaExtractCorners(Boxa boxa, int loc);

    /**
     * Original signature :
     * <code>l_ok boxaGetRankVals(BOXA*, l_float32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaGetRankVals(Boxa boxa, float fract, IntBuffer px, IntBuffer py, IntBuffer pr, IntBuffer pb, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok boxaGetMedianVals(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaGetMedianVals(Boxa boxa, IntBuffer px, IntBuffer py, IntBuffer pr, IntBuffer pb, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok boxaGetAverageSize(BOXA*, l_float32*, l_float32*)</code>
     */
    public static native int boxaGetAverageSize(Boxa boxa, FloatBuffer pw, FloatBuffer ph);

    /**
     * Original signature :
     * <code>l_ok boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code>
     */
    public static native int boxaaGetExtent(Boxaa baa, IntBuffer pw, IntBuffer ph, PointerByReference pbox, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>l_ok boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code>
     */
    public static native int boxaaGetExtent(Boxaa baa, IntByReference pw, IntByReference ph, PointerByReference pbox, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>BOXA* boxaaFlattenToBoxa(BOXAA*, NUMA**, l_int32)</code>
     */
    public static native Boxa boxaaFlattenToBoxa(Boxaa baa, PointerByReference pnaindex, int copyflag);

    /**
     * Original signature :
     * <code>BOXA* boxaaFlattenAligned(BOXAA*, l_int32, BOX*, l_int32)</code>
     */
    public static native Boxa boxaaFlattenAligned(Boxaa baa, int num, Box fillerbox, int copyflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaEncapsulateAligned(BOXA*, l_int32, l_int32)</code>
     */
    public static native Boxaa boxaEncapsulateAligned(Boxa boxa, int num, int copyflag);

    /**
     * Original signature : <code>BOXAA* boxaaTranspose(BOXAA*)</code>
     */
    public static native Boxaa boxaaTranspose(Boxaa baas);

    /**
     * Original signature :
     * <code>l_ok boxaaAlignBox(BOXAA*, BOX*, l_int32, l_int32*)</code>
     */
    public static native int boxaaAlignBox(Boxaa baa, Box box, int delta, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixMaskConnComp(PIX*, l_int32, BOXA**)</code>
     */
    public static native Pix pixMaskConnComp(Pix pixs, int connectivity, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMaskBoxa(PIX*, PIX*, BOXA*, l_int32)</code>
     */
    public static native Pix pixMaskBoxa(Pix pixd, Pix pixs, Boxa boxa, int op);

    /**
     * Original signature :
     * <code>PIX* pixPaintBoxa(PIX*, BOXA*, l_uint32)</code>
     */
    public static native Pix pixPaintBoxa(Pix pixs, Boxa boxa, int val);

    /**
     * Original signature :
     * <code>PIX* pixSetBlackOrWhiteBoxa(PIX*, BOXA*, l_int32)</code>
     */
    public static native Pix pixSetBlackOrWhiteBoxa(Pix pixs, Boxa boxa, int op);

    /**
     * Original signature : <code>PIX* pixPaintBoxaRandom(PIX*, BOXA*)</code>
     */
    public static native Pix pixPaintBoxaRandom(Pix pixs, Boxa boxa);

    /**
     * Original signature :
     * <code>PIX* pixBlendBoxaRandom(PIX*, BOXA*, l_float32)</code>
     */
    public static native Pix pixBlendBoxaRandom(Pix pixs, Boxa boxa, float fract);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxa(PIX*, BOXA*, l_int32, l_uint32)</code>
     */
    public static native Pix pixDrawBoxa(Pix pixs, Boxa boxa, int width, int val);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxaRandom(PIX*, BOXA*, l_int32)</code>
     */
    public static native Pix pixDrawBoxaRandom(Pix pixs, Boxa boxa, int width);

    /**
     * Original signature :
     * <code>PIX* boxaaDisplay(PIX*, BOXAA*, l_int32, l_int32, l_uint32, l_uint32, l_int32, l_int32)</code>
     */
    public static native Pix boxaaDisplay(Pix pixs, Boxaa baa, int linewba, int linewb, int colorba, int colorb, int w, int h);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayBoxaa(PIXA*, BOXAA*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaDisplayBoxaa(Pixa pixas, Boxaa baa, int colorflag, int width);

    /**
     * Original signature :
     * <code>BOXA* pixSplitIntoBoxa(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa pixSplitIntoBoxa(Pix pixs, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentIntoBoxa(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa pixSplitComponentIntoBoxa(Pix pix, Box box, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);

    /**
     * Original signature :
     * <code>BOXA* makeMosaicStrips(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa makeMosaicStrips(int w, int h, int direction, int size);

    /**
     * Original signature :
     * <code>l_ok boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntBuffer pnsame, FloatBuffer pdiffarea, FloatBuffer pdiffxor, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntByReference pnsame, FloatByReference pdiffarea, FloatByReference pdiffxor, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>BOX* pixSelectLargeULComp(PIX*, l_float32, l_int32, l_int32)</code>
     */
    public static native Box pixSelectLargeULComp(Pix pixs, float areaslop, int yslop, int connectivity);

    /**
     * Original signature :
     * <code>BOX* boxaSelectLargeULBox(BOXA*, l_float32, l_int32)</code>
     */
    public static native Box boxaSelectLargeULBox(Boxa boxas, float areaslop, int yslop);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectRange(BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaSelectRange(Boxa boxas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaSelectRange(BOXAA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxaa boxaaSelectRange(Boxaa baas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectBySize(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Boxa boxaSelectBySize(Boxa boxas, int width, int height, int type, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* boxaMakeSizeIndicator(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa boxaMakeSizeIndicator(Boxa boxa, int width, int height, int type, int relation);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectByArea(BOXA*, l_int32, l_int32, l_int32*)</code>
     */
    public static native Boxa boxaSelectByArea(Boxa boxas, int area, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* boxaMakeAreaIndicator(BOXA*, l_int32, l_int32)</code>
     */
    public static native Numa boxaMakeAreaIndicator(Boxa boxa, int area, int relation);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectByWHRatio(BOXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Boxa boxaSelectByWHRatio(Boxa boxas, float ratio, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* boxaMakeWHRatioIndicator(BOXA*, l_float32, l_int32)</code>
     */
    public static native Numa boxaMakeWHRatioIndicator(Boxa boxa, float ratio, int relation);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectWithIndicator(BOXA*, NUMA*, l_int32*)</code>
     */
    public static native Boxa boxaSelectWithIndicator(Boxa boxas, Numa na, IntBuffer pchanged);

    /**
     * Original signature : <code>BOXA* boxaPermutePseudorandom(BOXA*)</code>
     */
    public static native Boxa boxaPermutePseudorandom(Boxa boxas);

    /**
     * Original signature : <code>BOXA* boxaPermuteRandom(BOXA*, BOXA*)</code>
     */
    public static native Boxa boxaPermuteRandom(Boxa boxad, Boxa boxas);

    /**
     * Original signature :
     * <code>l_ok boxaSwapBoxes(BOXA*, l_int32, l_int32)</code>
     */
    public static native int boxaSwapBoxes(Boxa boxa, int i, int j);

    /**
     * Original signature : <code>PTA* boxaConvertToPta(BOXA*, l_int32)</code>
     */
    public static native Pta boxaConvertToPta(Boxa boxa, int ncorners);

    /**
     * Original signature : <code>BOXA* ptaConvertToBoxa(PTA*, l_int32)</code>
     */
    public static native Boxa ptaConvertToBoxa(Pta pta, int ncorners);

    /**
     * Original signature : <code>PTA* boxConvertToPta(BOX*, l_int32)</code>
     */
    public static native Pta boxConvertToPta(Box box, int ncorners);

    /**
     * Original signature : <code>BOX* ptaConvertToBox(PTA*)</code>
     */
    public static native Box ptaConvertToBox(Pta pta);

    /**
     * Original signature :
     * <code>l_ok boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code>
     */
    public static native int boxaGetExtent(Boxa boxa, IntBuffer pw, IntBuffer ph, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code>
     */
    public static native int boxaGetExtent(Boxa boxa, IntByReference pw, IntByReference ph, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok boxaGetCoverage(BOXA*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int boxaGetCoverage(Boxa boxa, int wc, int hc, int exactflag, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok boxaaSizeRange(BOXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaaSizeRange(Boxaa baa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok boxaSizeRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaSizeRange(Boxa boxa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok boxaLocationRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int boxaLocationRange(Boxa boxa, IntBuffer pminx, IntBuffer pminy, IntBuffer pmaxx, IntBuffer pmaxy);

    /**
     * Original signature :
     * <code>l_ok boxaGetSizes(BOXA*, NUMA**, NUMA**)</code>
     */
    public static native int boxaGetSizes(Boxa boxa, PointerByReference pnaw, PointerByReference pnah);

    /**
     * Original signature : <code>l_ok boxaGetArea(BOXA*, l_int32*)</code>
     */
    public static native int boxaGetArea(Boxa boxa, IntBuffer parea);

    /**
     * Original signature :
     * <code>PIX* boxaDisplayTiled(BOXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix boxaDisplayTiled(Boxa boxas, Pixa pixa, int first, int last, int maxwidth, int linewidth, float scalefactor, int background, int spacing, int border);

    /**
     * Original signature :
     * <code>BOXA* boxaSmoothSequenceMedian(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaSmoothSequenceMedian(Boxa boxas, int halfwin, int subflag, int maxdiff, int extrapixels, int debug);

    /**
     * Original signature :
     * <code>BOXA* boxaWindowedMedian(BOXA*, l_int32, l_int32)</code>
     */
    public static native Boxa boxaWindowedMedian(Boxa boxas, int halfwin, int debug);

    /**
     * Original signature :
     * <code>BOXA* boxaModifyWithBoxa(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa boxaModifyWithBoxa(Boxa boxas, Boxa boxam, int subflag, int maxdiff, int extrapixels);

    /**
     * Original signature :
     * <code>BOXA* boxaReconcilePairWidth(BOXA*, l_int32, l_int32, l_float32, NUMA*)</code>
     */
    public static native Boxa boxaReconcilePairWidth(Boxa boxas, int delw, int op, float factor, Numa na);

    /**
     * Original signature :
     * <code>l_ok boxaSizeConsistency(BOXA*, l_int32, l_float32, l_float32, l_float32*, l_float32*, l_int32*)</code>
     */
    public static native int boxaSizeConsistency(Boxa boxas, int type, float threshp, float threshm, FloatBuffer pfvarp, FloatBuffer pfvarm, IntBuffer psame);

    /**
     * Original signature :
     * <code>BOXA* boxaReconcileAllByMedian(BOXA*, l_int32, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    public static native Boxa boxaReconcileAllByMedian(Boxa boxas, int select1, int select2, int thresh, int extra, Pixa pixadb);

    /**
     * Original signature :
     * <code>BOXA* boxaReconcileSidesByMedian(BOXA*, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    public static native Boxa boxaReconcileSidesByMedian(Boxa boxas, int select, int thresh, int extra, Pixa pixadb);

    /**
     * Original signature :
     * <code>BOXA* boxaReconcileSizeByMedian(BOXA*, l_int32, l_float32, l_float32, l_float32, NUMA**, NUMA**, l_float32*)</code>
     */
    public static native Boxa boxaReconcileSizeByMedian(Boxa boxas, int type, float dfract, float sfract, float factor, PointerByReference pnadelw, PointerByReference pnadelh, FloatBuffer pratiowh);

    /**
     * Original signature :
     * <code>BOXA* boxaReconcileSizeByMedian(BOXA*, l_int32, l_float32, l_float32, l_float32, NUMA**, NUMA**, l_float32*)</code>
     */
    public static native Boxa boxaReconcileSizeByMedian(Boxa boxas, int type, float dfract, float sfract, float factor, PointerByReference pnadelw, PointerByReference pnadelh, FloatByReference pratiowh);

    /**
     * Original signature :
     * <code>l_ok boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code>
     */
    public static native int boxaPlotSides(Boxa boxa, String plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code>
     */
    public static native int boxaPlotSides(Boxa boxa, Pointer plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code>
     */
    public static native int boxaPlotSizes(Boxa boxa, String plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_ok boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code>
     */
    public static native int boxaPlotSizes(Boxa boxa, Pointer plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>BOXA* boxaFillSequence(BOXA*, l_int32, l_int32)</code>
     */
    public static native Boxa boxaFillSequence(Boxa boxas, int useflag, int debug);

    /**
     * Original signature :
     * <code>l_ok boxaSizeVariation(BOXA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int boxaSizeVariation(Boxa boxa, int type, FloatBuffer pdel_evenodd, FloatBuffer prms_even, FloatBuffer prms_odd, FloatBuffer prms_all);

    /**
     * Original signature :
     * <code>l_ok boxaMedianDimensions(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, NUMA**, NUMA**)</code>
     */
    public static native int boxaMedianDimensions(Boxa boxas, IntBuffer pmedw, IntBuffer pmedh, IntBuffer pmedwe, IntBuffer pmedwo, IntBuffer pmedhe, IntBuffer pmedho, PointerByReference pnadelw, PointerByReference pnadelh);

    /**
     * Original signature :
     * <code>l_ok boxaMedianDimensions(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, NUMA**, NUMA**)</code>
     */
    public static native int boxaMedianDimensions(Boxa boxas, IntByReference pmedw, IntByReference pmedh, IntByReference pmedwe, IntByReference pmedwo, IntByReference pmedhe, IntByReference pmedho, PointerByReference pnadelw, PointerByReference pnadelh);

    /**
     * Original signature : <code>L_BYTEA* l_byteaCreate(size_t)</code>
     */
    public static native L_Bytea l_byteaCreate(NativeSize nbytes);

    /**
     * Original signature :
     * <code>L_BYTEA* l_byteaInitFromMem(const l_uint8*, size_t)</code>
     */
    public static native L_Bytea l_byteaInitFromMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>L_BYTEA* l_byteaInitFromFile(const char*)</code>
     */
    public static native L_Bytea l_byteaInitFromFile(String fname);

    /**
     * Original signature : <code>L_BYTEA* l_byteaInitFromStream(FILE*)</code>
     */
    public static native L_Bytea l_byteaInitFromStream(FILE fp);

    /**
     * Original signature : <code>L_BYTEA* l_byteaCopy(L_BYTEA*, l_int32)</code>
     */
    public static native L_Bytea l_byteaCopy(L_Bytea bas, int copyflag);

    /**
     * Original signature : <code>void l_byteaDestroy(L_BYTEA**)</code>
     */
    public static native void l_byteaDestroy(PointerByReference pba);

    /**
     * Original signature : <code>size_t l_byteaGetSize(L_BYTEA*)</code>
     */
    public static native NativeSize l_byteaGetSize(L_Bytea ba);

    /**
     * Original signature :
     * <code>l_uint8* l_byteaGetData(L_BYTEA*, size_t*)</code>
     */
    public static native Pointer l_byteaGetData(L_Bytea ba, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>l_uint8* l_byteaCopyData(L_BYTEA*, size_t*)</code>
     */
    public static native Pointer l_byteaCopyData(L_Bytea ba, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>l_ok l_byteaAppendData(L_BYTEA*, const l_uint8*, size_t)</code>
     */
    public static native int l_byteaAppendData(L_Bytea ba, ByteBuffer newdata, NativeSize newbytes);

    /**
     * Original signature :
     * <code>l_ok l_byteaAppendString(L_BYTEA*, const char*)</code>
     */
    public static native int l_byteaAppendString(L_Bytea ba, String str);

    /**
     * Original signature : <code>l_ok l_byteaJoin(L_BYTEA*, L_BYTEA**)</code>
     */
    public static native int l_byteaJoin(L_Bytea ba1, PointerByReference pba2);

    /**
     * Original signature :
     * <code>l_ok l_byteaSplit(L_BYTEA*, size_t, L_BYTEA**)</code>
     */
    public static native int l_byteaSplit(L_Bytea ba1, NativeSize splitloc, PointerByReference pba2);

    /**
     * Original signature :
     * <code>l_ok l_byteaFindEachSequence(L_BYTEA*, const l_uint8*, size_t, L_DNA**)</code>
     */
    public static native int l_byteaFindEachSequence(L_Bytea ba, ByteBuffer sequence, NativeSize seqlen, PointerByReference pda);

    /**
     * Original signature :
     * <code>l_ok l_byteaFindEachSequence(L_BYTEA*, const l_uint8*, size_t, L_DNA**)</code>
     */
    public static native int l_byteaFindEachSequence(L_Bytea ba, Pointer sequence, NativeSize seqlen, PointerByReference pda);

    /**
     * Original signature :
     * <code>l_ok l_byteaWrite(const char*, L_BYTEA*, size_t, size_t)</code>
     */
    public static native int l_byteaWrite(String fname, L_Bytea ba, NativeSize startloc, NativeSize nbytes);

    /**
     * Original signature :
     * <code>l_ok l_byteaWriteStream(FILE*, L_BYTEA*, size_t, size_t)</code>
     */
    public static native int l_byteaWriteStream(FILE fp, L_Bytea ba, NativeSize startloc, NativeSize nbytes);

    /**
     * Original signature : <code>void ccbaDestroy(CCBORDA**)</code>
     */
    public static native void ccbaDestroy(PointerByReference pccba);

    /**
     * Original signature : <code>CCBORDA* pixGetAllCCBorders(PIX*)</code>
     */
    public static native CCBorda pixGetAllCCBorders(Pix pixs);

    /**
     * Original signature : <code>PTAA* pixGetOuterBordersPtaa(PIX*)</code>
     */
    public static native Ptaa pixGetOuterBordersPtaa(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixGetOuterBorder(CCBORD*, PIX*, BOX*)</code>
     */
    public static native int pixGetOuterBorder(CCBord ccb, Pix pixs, Box box);

    /**
     * Original signature : <code>l_ok ccbaGenerateGlobalLocs(CCBORDA*)</code>
     */
    public static native int ccbaGenerateGlobalLocs(CCBorda ccba);

    /**
     * Original signature : <code>l_ok ccbaGenerateStepChains(CCBORDA*)</code>
     */
    public static native int ccbaGenerateStepChains(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_ok ccbaStepChainsToPixCoords(CCBORDA*, l_int32)</code>
     */
    public static native int ccbaStepChainsToPixCoords(CCBorda ccba, int coordtype);

    /**
     * Original signature :
     * <code>l_ok ccbaGenerateSPGlobalLocs(CCBORDA*, l_int32)</code>
     */
    public static native int ccbaGenerateSPGlobalLocs(CCBorda ccba, int ptsflag);

    /**
     * Original signature : <code>l_ok ccbaGenerateSinglePath(CCBORDA*)</code>
     */
    public static native int ccbaGenerateSinglePath(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayBorder(CCBORDA*)</code>
     */
    public static native Pix ccbaDisplayBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplaySPBorder(CCBORDA*)</code>
     */
    public static native Pix ccbaDisplaySPBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage1(CCBORDA*)</code>
     */
    public static native Pix ccbaDisplayImage1(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage2(CCBORDA*)</code>
     */
    public static native Pix ccbaDisplayImage2(CCBorda ccba);

    /**
     * Original signature : <code>l_ok ccbaWrite(const char*, CCBORDA*)</code>
     */
    public static native int ccbaWrite(String filename, CCBorda ccba);

    /**
     * Original signature : <code>l_ok ccbaWriteStream(FILE*, CCBORDA*)</code>
     */
    public static native int ccbaWriteStream(FILE fp, CCBorda ccba);

    /**
     * Original signature : <code>CCBORDA* ccbaRead(const char*)</code>
     */
    public static native CCBorda ccbaRead(String filename);

    /**
     * Original signature : <code>CCBORDA* ccbaReadStream(FILE*)</code>
     */
    public static native CCBorda ccbaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_ok ccbaWriteSVG(const char*, CCBORDA*)</code>
     */
    public static native int ccbaWriteSVG(String filename, CCBorda ccba);

    /**
     * Original signature : <code>char* ccbaWriteSVGString(CCBORDA*)</code>
     */
    public static native Pointer ccbaWriteSVGString(CCBorda ccba);

    /**
     * Original signature :
     * <code>PIXA* pixaThinConnected(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaThinConnected(Pixa pixas, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnected(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixThinConnected(Pix pixs, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnectedBySet(PIX*, l_int32, SELA*, l_int32)</code>
     */
    public static native Pix pixThinConnectedBySet(Pix pixs, int type, Sela sela, int maxiters);

    /**
     * Original signature :
     * <code>SELA* selaMakeThinSets(l_int32, l_int32)</code>
     */
    public static native Sela selaMakeThinSets(int index, int debug);

    /**
     * Original signature :
     * <code>l_ok pixFindCheckerboardCorners(PIX*, l_int32, l_int32, l_int32, PIX**, PTA**, PIXA*)</code>
     */
    public static native int pixFindCheckerboardCorners(Pix pixs, int size, int dilation, int nsels, PointerByReference ppix_corners, PointerByReference ppta_corners, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok jbCorrelation(const char*, l_float32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code>
     */
    public static native int jbCorrelation(String dirin, float thresh, float weight, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>l_ok jbRankHaus(const char*, l_int32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code>
     */
    public static native int jbRankHaus(String dirin, int size, float rank, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code>
     */
    public static native JbClasser jbWordsInTextlines(String dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code>
     */
    public static native JbClasser jbWordsInTextlines(Pointer dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>l_ok pixGetWordsInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, PIXA**, NUMA**)</code>
     */
    public static native int pixGetWordsInTextlines(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>l_ok pixGetWordBoxesInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, NUMA**)</code>
     */
    public static native int pixGetWordBoxesInTextlines(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>l_ok pixFindWordAndCharacterBoxes(PIX*, BOX*, l_int32, BOXA**, BOXAA**, const char*)</code>
     */
    public static native int pixFindWordAndCharacterBoxes(Pix pixs, Box boxs, int thresh, PointerByReference pboxaw, PointerByReference pboxaac, String debugdir);

    /**
     * Original signature :
     * <code>l_ok pixFindWordAndCharacterBoxes(PIX*, BOX*, l_int32, BOXA**, BOXAA**, const char*)</code>
     */
    public static native int pixFindWordAndCharacterBoxes(Pix pixs, Box boxs, int thresh, PointerByReference pboxaw, PointerByReference pboxaac, Pointer debugdir);

    /**
     * Original signature :
     * <code>NUMAA* boxaExtractSortedPattern(BOXA*, NUMA*)</code>
     */
    public static native Numaa boxaExtractSortedPattern(Boxa boxa, Numa na);

    /**
     * Original signature :
     * <code>l_ok numaaCompareImagesByBoxes(NUMAA*, NUMAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    public static native int numaaCompareImagesByBoxes(Numaa naa1, Numaa naa2, int nperline, int nreq, int maxshiftx, int maxshifty, int delx, int dely, IntBuffer psame, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixColorContent(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixColorContent(Pix pixs, int rref, int gref, int bref, int mingray, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>PIX* pixColorMagnitude(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorMagnitude(Pix pixs, int rref, int gref, int bref, int type);

    /**
     * Original signature :
     * <code>l_ok pixColorFraction(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int pixColorFraction(Pix pixs, int darkthresh, int lightthresh, int diffthresh, int factor, FloatBuffer ppixfract, FloatBuffer pcolorfract);

    /**
     * Original signature :
     * <code>PIX* pixColorShiftWhitePoint(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorShiftWhitePoint(Pix pixs, int rref, int gref, int bref);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorPixels(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixMaskOverColorPixels(Pix pixs, int threshdiff, int mindist);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverGrayPixels(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixMaskOverGrayPixels(Pix pixs, int maxlimit, int satlimit);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorRange(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMaskOverColorRange(Pix pixs, int rmin, int rmax, int gmin, int gmax, int bmin, int bmax);

    /**
     * Original signature :
     * <code>l_ok pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code>
     */
    public static native int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatBuffer pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code>
     */
    public static native int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatByReference pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixNumSignificantGrayColors(PIX*, l_int32, l_int32, l_float32, l_int32, l_int32*)</code>
     */
    public static native int pixNumSignificantGrayColors(Pix pixs, int darkthresh, int lightthresh, float minfract, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_ok pixColorsForQuantization(PIX*, l_int32, l_int32*, l_int32*, l_int32)</code>
     */
    public static native int pixColorsForQuantization(Pix pixs, int thresh, IntBuffer pncolors, IntBuffer piscolor, int debug);

    /**
     * Original signature :
     * <code>l_ok pixNumColors(PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixNumColors(Pix pixs, int factor, IntBuffer pncolors);

    /**
     * Original signature : <code>PIX* pixConvertRGBToCmapLossless(PIX*)</code>
     */
    public static native Pix pixConvertRGBToCmapLossless(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixGetMostPopulatedColors(PIX*, l_int32, l_int32, l_int32, l_uint32**, PIXCMAP**)</code>
     */
    public static native int pixGetMostPopulatedColors(Pix pixs, int sigbits, int factor, int ncolors, PointerByReference parray, PointerByReference pcmap);

    /**
     * Original signature :
     * <code>PIX* pixSimpleColorQuantize(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixSimpleColorQuantize(Pix pixs, int sigbits, int factor, int ncolors);

    /**
     * Original signature :
     * <code>NUMA* pixGetRGBHistogram(PIX*, l_int32, l_int32)</code>
     */
    public static native Numa pixGetRGBHistogram(Pix pixs, int sigbits, int factor);

    /**
     * Original signature :
     * <code>l_ok makeRGBIndexTables(l_uint32**, l_uint32**, l_uint32**, l_int32)</code>
     */
    public static native int makeRGBIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int sigbits);

    /**
     * Original signature :
     * <code>l_ok getRGBFromIndex(l_uint32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int getRGBFromIndex(int index, int sigbits, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code>
     */
    public static native int pixHasHighlightRed(Pix pixs, int factor, float minfract, float fthresh, IntBuffer phasred, FloatBuffer pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code>
     */
    public static native int pixHasHighlightRed(Pix pixs, int factor, float minfract, float fthresh, IntByReference phasred, FloatByReference pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>L_COLORFILL* l_colorfillCreate(PIX*, l_int32, l_int32)</code>
     */
    public static native L_Colorfill l_colorfillCreate(Pix pixs, int nx, int ny);

    /**
     * Original signature : <code>void l_colorfillDestroy(L_COLORFILL**)</code>
     */
    public static native void l_colorfillDestroy(PointerByReference pcf);

    /**
     * Original signature :
     * <code>l_ok pixColorContentByLocation(L_COLORFILL*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixColorContentByLocation(L_Colorfill cf, int rref, int gref, int bref, int minmax, int maxdiff, int minarea, int smooth, int debug);

    /**
     * Original signature :
     * <code>PIX* pixColorFill(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorFill(Pix pixs, int minmax, int maxdiff, int smooth, int minarea, int debug);

    /**
     * Original signature :
     * <code>PIXA* makeColorfillTestData(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa makeColorfillTestData(int w, int h, int nseeds, int range);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayRegions(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorGrayRegions(Pix pixs, Boxa boxa, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGray(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixColorGray(Pix pixs, Box box, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorGrayMasked(Pix pixs, Pix pixm, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixSnapColor(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code>
     */
    public static native Pix pixSnapColor(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixSnapColorCmap(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code>
     */
    public static native Pix pixSnapColorCmap(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixLinearMapToTargetColor(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    public static native Pix pixLinearMapToTargetColor(Pix pixd, Pix pixs, int srcval, int dstval);

    /**
     * Original signature :
     * <code>l_ok pixelLinearMapToTargetColor(l_uint32, l_uint32, l_uint32, l_uint32*)</code>
     */
    public static native int pixelLinearMapToTargetColor(int scolor, int srcmap, int dstmap, IntBuffer pdcolor);

    /**
     * Original signature :
     * <code>PIX* pixShiftByComponent(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    public static native Pix pixShiftByComponent(Pix pixd, Pix pixs, int srcval, int dstval);

    /**
     * Original signature :
     * <code>l_ok pixelShiftByComponent(l_int32, l_int32, l_int32, l_uint32, l_uint32, l_uint32*)</code>
     */
    public static native int pixelShiftByComponent(int rval, int gval, int bval, int srcval, int dstval, IntBuffer ppixel);

    /**
     * Original signature :
     * <code>l_ok pixelFractionalShift(l_int32, l_int32, l_int32, l_float32, l_uint32*)</code>
     */
    public static native int pixelFractionalShift(int rval, int gval, int bval, float fract, IntBuffer ppixel);

    /**
     * Original signature :
     * <code>PIX* pixMapWithInvariantHue(PIX*, PIX*, l_uint32, l_float32)</code>
     */
    public static native Pix pixMapWithInvariantHue(Pix pixd, Pix pixs, int srcval, float fract);

    /**
     * Original signature : <code>PIXCMAP* pixcmapCreate(l_int32)</code>
     */
    public static native PixColormap pixcmapCreate(int depth);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapCreateRandom(l_int32, l_int32, l_int32)</code>
     */
    public static native PixColormap pixcmapCreateRandom(int depth, int hasblack, int haswhite);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapCreateLinear(l_int32, l_int32)</code>
     */
    public static native PixColormap pixcmapCreateLinear(int d, int nlevels);

    /**
     * Original signature : <code>PIXCMAP* pixcmapCopy(const PIXCMAP*)</code>
     */
    public static native PixColormap pixcmapCopy(PixColormap cmaps);

    /**
     * Original signature : <code>void pixcmapDestroy(PIXCMAP**)</code>
     */
    public static native void pixcmapDestroy(PointerByReference pcmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapIsValid(const PIXCMAP*, PIX*, l_int32*)</code>
     */
    public static native int pixcmapIsValid(PixColormap cmap, Pix pix, IntBuffer pvalid);

    /**
     * Original signature :
     * <code>l_ok pixcmapAddColor(PIXCMAP*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixcmapAddColor(PixColormap cmap, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixcmapAddRGBA(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixcmapAddRGBA(PixColormap cmap, int rval, int gval, int bval, int aval);

    /**
     * Original signature :
     * <code>l_ok pixcmapAddNewColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapAddNewColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapAddNearestColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapAddNearestColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapUsableColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapUsableColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pusable);

    /**
     * Original signature :
     * <code>l_ok pixcmapAddBlackOrWhite(PIXCMAP*, l_int32, l_int32*)</code>
     */
    public static native int pixcmapAddBlackOrWhite(PixColormap cmap, int color, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapSetBlackAndWhite(PIXCMAP*, l_int32, l_int32)</code>
     */
    public static native int pixcmapSetBlackAndWhite(PixColormap cmap, int setblack, int setwhite);

    /**
     * Original signature : <code>l_int32 pixcmapGetCount(const PIXCMAP*)</code>
     */
    public static native int pixcmapGetCount(PixColormap cmap);

    /**
     * Original signature : <code>l_int32 pixcmapGetFreeCount(PIXCMAP*)</code>
     */
    public static native int pixcmapGetFreeCount(PixColormap cmap);

    /**
     * Original signature : <code>l_int32 pixcmapGetDepth(PIXCMAP*)</code>
     */
    public static native int pixcmapGetDepth(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetMinDepth(PIXCMAP*, l_int32*)</code>
     */
    public static native int pixcmapGetMinDepth(PixColormap cmap, IntBuffer pmindepth);

    /**
     * Original signature : <code>l_ok pixcmapClear(PIXCMAP*)</code>
     */
    public static native int pixcmapClear(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetColor(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcmapGetColor(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetColor32(PIXCMAP*, l_int32, l_uint32*)</code>
     */
    public static native int pixcmapGetColor32(PixColormap cmap, int index, IntBuffer pval32);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetRGBA(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcmapGetRGBA(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetRGBA32(PIXCMAP*, l_int32, l_uint32*)</code>
     */
    public static native int pixcmapGetRGBA32(PixColormap cmap, int index, IntBuffer pval32);

    /**
     * Original signature :
     * <code>l_ok pixcmapResetColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixcmapResetColor(PixColormap cmap, int index, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixcmapSetAlpha(PIXCMAP*, l_int32, l_int32)</code>
     */
    public static native int pixcmapSetAlpha(PixColormap cmap, int index, int aval);

    /**
     * Original signature :
     * <code>l_int32 pixcmapGetIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapGetIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapHasColor(PIXCMAP*, l_int32*)</code>
     */
    public static native int pixcmapHasColor(PixColormap cmap, IntBuffer pcolor);

    /**
     * Original signature :
     * <code>l_ok pixcmapIsOpaque(PIXCMAP*, l_int32*)</code>
     */
    public static native int pixcmapIsOpaque(PixColormap cmap, IntBuffer popaque);

    /**
     * Original signature :
     * <code>l_ok pixcmapNonOpaqueColorsInfo(PIXCMAP*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcmapNonOpaqueColorsInfo(PixColormap cmap, IntBuffer pntrans, IntBuffer pmax_trans, IntBuffer pmin_opaque);

    /**
     * Original signature :
     * <code>l_ok pixcmapIsBlackAndWhite(PIXCMAP*, l_int32*)</code>
     */
    public static native int pixcmapIsBlackAndWhite(PixColormap cmap, IntBuffer pblackwhite);

    /**
     * Original signature :
     * <code>l_ok pixcmapCountGrayColors(PIXCMAP*, l_int32*)</code>
     */
    public static native int pixcmapCountGrayColors(PixColormap cmap, IntBuffer pngray);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetRankIntensity(PIXCMAP*, l_float32, l_int32*)</code>
     */
    public static native int pixcmapGetRankIntensity(PixColormap cmap, float rankval, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetNearestIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapGetNearestIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetNearestGrayIndex(PIXCMAP*, l_int32, l_int32*)</code>
     */
    public static native int pixcmapGetNearestGrayIndex(PixColormap cmap, int val, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetDistanceToColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcmapGetDistanceToColor(PixColormap cmap, int index, int rval, int gval, int bval, IntBuffer pdist);

    /**
     * Original signature :
     * <code>l_ok pixcmapGetRangeValues(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcmapGetRangeValues(PixColormap cmap, int select, IntBuffer pminval, IntBuffer pmaxval, IntBuffer pminindex, IntBuffer pmaxindex);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapGrayToFalseColor(l_float32)</code>
     */
    public static native PixColormap pixcmapGrayToFalseColor(float gamma);

    /**
     * Original signature : <code>PIXCMAP* pixcmapGrayToColor(l_uint32)</code>
     */
    public static native PixColormap pixcmapGrayToColor(int color);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapColorToGray(PIXCMAP*, l_float32, l_float32, l_float32)</code>
     */
    public static native PixColormap pixcmapColorToGray(PixColormap cmaps, float rwt, float gwt, float bwt);

    /**
     * Original signature : <code>PIXCMAP* pixcmapConvertTo4(PIXCMAP*)</code>
     */
    public static native PixColormap pixcmapConvertTo4(PixColormap cmaps);

    /**
     * Original signature : <code>PIXCMAP* pixcmapConvertTo8(PIXCMAP*)</code>
     */
    public static native PixColormap pixcmapConvertTo8(PixColormap cmaps);

    /**
     * Original signature : <code>PIXCMAP* pixcmapRead(const char*)</code>
     */
    public static native PixColormap pixcmapRead(String filename);

    /**
     * Original signature : <code>PIXCMAP* pixcmapReadStream(FILE*)</code>
     */
    public static native PixColormap pixcmapReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapReadMem(const l_uint8*, size_t)</code>
     */
    public static native PixColormap pixcmapReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixcmapWrite(const char*, const PIXCMAP*)</code>
     */
    public static native int pixcmapWrite(String filename, PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapWriteStream(FILE*, const PIXCMAP*)</code>
     */
    public static native int pixcmapWriteStream(FILE fp, PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapWriteMem(l_uint8**, size_t*, const PIXCMAP*)</code>
     */
    public static native int pixcmapWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixColormap cmap);

    /**
     * Original signature :
     * <code>l_ok pixcmapToArrays(const PIXCMAP*, l_int32**, l_int32**, l_int32**, l_int32**)</code>
     */
    public static native int pixcmapToArrays(PixColormap cmap, PointerByReference prmap, PointerByReference pgmap, PointerByReference pbmap, PointerByReference pamap);

    /**
     * Original signature :
     * <code>l_ok pixcmapToRGBTable(PIXCMAP*, l_uint32**, l_int32*)</code>
     */
    public static native int pixcmapToRGBTable(PixColormap cmap, PointerByReference ptab, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_ok pixcmapSerializeToMemory(PIXCMAP*, l_int32, l_int32*, l_uint8**)</code>
     */
    public static native int pixcmapSerializeToMemory(PixColormap cmap, int cpc, IntBuffer pncolors, PointerByReference pdata);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapDeserializeFromMemory(l_uint8*, l_int32, l_int32)</code>
     */
    public static native PixColormap pixcmapDeserializeFromMemory(ByteBuffer data, int cpc, int ncolors);

    /**
     * Original signature :
     * <code>char* pixcmapConvertToHex(l_uint8*, l_int32)</code>
     */
    public static native Pointer pixcmapConvertToHex(ByteBuffer data, int ncolors);

    /**
     * Original signature :
     * <code>l_ok pixcmapGammaTRC(PIXCMAP*, l_float32, l_int32, l_int32)</code>
     */
    public static native int pixcmapGammaTRC(PixColormap cmap, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>l_ok pixcmapContrastTRC(PIXCMAP*, l_float32)</code>
     */
    public static native int pixcmapContrastTRC(PixColormap cmap, float factor);

    /**
     * Original signature :
     * <code>l_ok pixcmapShiftIntensity(PIXCMAP*, l_float32)</code>
     */
    public static native int pixcmapShiftIntensity(PixColormap cmap, float fraction);

    /**
     * Original signature :
     * <code>l_ok pixcmapShiftByComponent(PIXCMAP*, l_uint32, l_uint32)</code>
     */
    public static native int pixcmapShiftByComponent(PixColormap cmap, int srcval, int dstval);

    /**
     * Original signature :
     * <code>PIX* pixColorMorph(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorMorph(Pix pixs, int type, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuant(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOctreeColorQuant(Pix pixs, int colors, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuantGeneral(PIX*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Pix pixOctreeColorQuantGeneral(Pix pixs, int colors, int ditherflag, float validthresh, float colorthresh);

    /**
     * Original signature :
     * <code>l_ok makeRGBToIndexTables(l_int32, l_uint32**, l_uint32**, l_uint32**)</code>
     */
    public static native int makeRGBToIndexTables(int cqlevels, PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab);

    /**
     * Original signature :
     * <code>void getOctcubeIndexFromRGB(l_int32, l_int32, l_int32, l_uint32*, l_uint32*, l_uint32*, l_uint32*)</code>
     */
    public static native void getOctcubeIndexFromRGB(int rval, int gval, int bval, IntBuffer rtab, IntBuffer gtab, IntBuffer btab, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantByPopulation(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOctreeQuantByPopulation(Pix pixs, int level, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantNumColors(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOctreeQuantNumColors(Pix pixs, int maxcolors, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantMixedWithGray(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixOctcubeQuantMixedWithGray(Pix pixs, int depth, int graylevels, int delta);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuant256(PIX*, l_int32)</code>
     */
    public static native Pix pixFixedOctcubeQuant256(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant1(PIX*, l_int32)</code>
     */
    public static native Pix pixFewColorsOctcubeQuant1(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant2(PIX*, l_int32, NUMA*, l_int32, l_int32*)</code>
     */
    public static native Pix pixFewColorsOctcubeQuant2(Pix pixs, int level, Numa na, int ncolors, IntBuffer pnerrors);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixFewColorsOctcubeQuantMixed(Pix pixs, int level, int darkthresh, int lightthresh, int diffthresh, float minfract, int maxspan);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuantGenRGB(PIX*, l_int32)</code>
     */
    public static native Pix pixFixedOctcubeQuantGenRGB(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixOctcubeQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>NUMA* pixOctcubeHistogram(PIX*, l_int32, l_int32*)</code>
     */
    public static native Numa pixOctcubeHistogram(Pix pixs, int level, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_int32* pixcmapToOctcubeLUT(PIXCMAP*, l_int32, l_int32)</code>
     */
    public static native IntByReference pixcmapToOctcubeLUT(PixColormap cmap, int level, int metric);

    /**
     * Original signature : <code>l_ok pixRemoveUnusedColors(PIX*)</code>
     */
    public static native int pixRemoveUnusedColors(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixNumberOccupiedOctcubes(PIX*, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    public static native int pixNumberOccupiedOctcubes(Pix pix, int level, int mincount, float minfract, IntBuffer pncolors);

    /**
     * Original signature : <code>PIX* pixMedianCutQuant(PIX*, l_int32)</code>
     */
    public static native Pix pixMedianCutQuant(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMedianCutQuantGeneral(Pix pixs, int ditherflag, int outdepth, int maxcolors, int sigbits, int maxsub, int checkbw);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixFewColorsMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int maxncolors, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>l_int32* pixMedianCutHisto(PIX*, l_int32, l_int32)</code>
     */
    public static native IntByReference pixMedianCutHisto(Pix pixs, int sigbits, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixColorSegment(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorSegment(Pix pixs, int maxdist, int maxcolors, int selsize, int finalcolors, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixColorSegmentCluster(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixColorSegmentCluster(Pix pixs, int maxdist, int maxcolors, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixAssignToNearestColor(PIX*, PIX*, PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixAssignToNearestColor(Pix pixd, Pix pixs, Pix pixm, int level, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_ok pixColorSegmentClean(PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixColorSegmentClean(Pix pixs, int selsize, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_ok pixColorSegmentRemoveColors(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixColorSegmentRemoveColors(Pix pixd, Pix pixs, int finalcolors);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHSV(PIX*, PIX*)</code>
     */
    public static native Pix pixConvertRGBToHSV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertHSVToRGB(PIX*, PIX*)</code>
     */
    public static native Pix pixConvertHSVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok convertRGBToHSV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertRGBToHSV(int rval, int gval, int bval, IntBuffer phval, IntBuffer psval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_ok convertHSVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertHSVToRGB(int hval, int sval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>l_ok pixcmapConvertRGBToHSV(PIXCMAP*)</code>
     */
    public static native int pixcmapConvertRGBToHSV(PixColormap cmap);

    /**
     * Original signature : <code>l_ok pixcmapConvertHSVToRGB(PIXCMAP*)</code>
     */
    public static native int pixcmapConvertHSVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHue(PIX*)</code>
     */
    public static native Pix pixConvertRGBToHue(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToSaturation(PIX*)</code>
     */
    public static native Pix pixConvertRGBToSaturation(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToValue(PIX*)</code>
     */
    public static native Pix pixConvertRGBToValue(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHS(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMakeRangeMaskHS(Pix pixs, int huecenter, int huehw, int satcenter, int sathw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMakeRangeMaskHV(Pix pixs, int huecenter, int huehw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMakeRangeMaskSV(Pix pixs, int satcenter, int sathw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHS(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native Pix pixMakeHistoHS(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnasat);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHV(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native Pix pixMakeHistoHV(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoSV(PIX*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native Pix pixMakeHistoSV(Pix pixs, int factor, PointerByReference pnasat, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>l_ok pixFindHistoPeaksHSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PTA**, NUMA**, PIXA**)</code>
     */
    public static native int pixFindHistoPeaksHSV(Pix pixs, int type, int width, int height, int npeaks, float erasefactor, PointerByReference ppta, PointerByReference pnatot, PointerByReference ppixa);

    /**
     * Original signature :
     * <code>PIX* displayHSVColorRange(l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix displayHSVColorRange(int hval, int sval, int vval, int huehw, int sathw, int nsamp, int factor);

    /**
     * Original signature : <code>PIX* pixConvertRGBToYUV(PIX*, PIX*)</code>
     */
    public static native Pix pixConvertRGBToYUV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertYUVToRGB(PIX*, PIX*)</code>
     */
    public static native Pix pixConvertYUVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok convertRGBToYUV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertRGBToYUV(int rval, int gval, int bval, IntBuffer pyval, IntBuffer puval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_ok convertYUVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertYUVToRGB(int yval, int uval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>l_ok pixcmapConvertRGBToYUV(PIXCMAP*)</code>
     */
    public static native int pixcmapConvertRGBToYUV(PixColormap cmap);

    /**
     * Original signature : <code>l_ok pixcmapConvertYUVToRGB(PIXCMAP*)</code>
     */
    public static native int pixcmapConvertYUVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToXYZ(PIX*)</code>
     */
    public static native FPixa pixConvertRGBToXYZ(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertXYZToRGB(FPIXA*)</code>
     */
    public static native Pix fpixaConvertXYZToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_ok convertRGBToXYZ(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int convertRGBToXYZ(int rval, int gval, int bval, FloatBuffer pfxval, FloatBuffer pfyval, FloatBuffer pfzval);

    /**
     * Original signature :
     * <code>l_ok convertXYZToRGB(l_float32, l_float32, l_float32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertXYZToRGB(float fxval, float fyval, float fzval, int blackout, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>FPIXA* fpixaConvertXYZToLAB(FPIXA*)</code>
     */
    public static native FPixa fpixaConvertXYZToLAB(FPixa fpixas);

    /**
     * Original signature : <code>FPIXA* fpixaConvertLABToXYZ(FPIXA*)</code>
     */
    public static native FPixa fpixaConvertLABToXYZ(FPixa fpixas);

    /**
     * Original signature :
     * <code>l_ok convertXYZToLAB(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int convertXYZToLAB(float xval, float yval, float zval, FloatBuffer plval, FloatBuffer paval, FloatBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok convertLABToXYZ(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int convertLABToXYZ(float lval, float aval, float bval, FloatBuffer pxval, FloatBuffer pyval, FloatBuffer pzval);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToLAB(PIX*)</code>
     */
    public static native FPixa pixConvertRGBToLAB(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertLABToRGB(FPIXA*)</code>
     */
    public static native Pix fpixaConvertLABToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_ok convertRGBToLAB(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int convertRGBToLAB(int rval, int gval, int bval, FloatBuffer pflval, FloatBuffer pfaval, FloatBuffer pfbval);

    /**
     * Original signature :
     * <code>l_ok convertLABToRGB(l_float32, l_float32, l_float32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int convertLABToRGB(float flval, float faval, float fbval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>PIX* pixMakeGamutRGB(l_int32)</code>
     */
    public static native Pix pixMakeGamutRGB(int scale);

    /**
     * Original signature : <code>l_ok pixEqual(PIX*, PIX*, l_int32*)</code>
     */
    public static native int pixEqual(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixEqualWithAlpha(PIX*, PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixEqualWithAlpha(Pix pix1, Pix pix2, int use_alpha, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixEqualWithCmap(PIX*, PIX*, l_int32*)</code>
     */
    public static native int pixEqualWithCmap(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok cmapEqual(PIXCMAP*, PIXCMAP*, l_int32, l_int32*)</code>
     */
    public static native int cmapEqual(PixColormap cmap1, PixColormap cmap2, int ncomps, IntBuffer psame);

    /**
     * Original signature : <code>l_ok pixUsesCmapColor(PIX*, l_int32*)</code>
     */
    public static native int pixUsesCmapColor(Pix pixs, IntBuffer pcolor);

    /**
     * Original signature :
     * <code>l_ok pixCorrelationBinary(PIX*, PIX*, l_float32*)</code>
     */
    public static native int pixCorrelationBinary(Pix pix1, Pix pix2, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* pixDisplayDiff(PIX*, PIX*, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixDisplayDiff(Pix pix1, Pix pix2, int showall, int mindiff, int diffcolor);

    /**
     * Original signature : <code>PIX* pixDisplayDiffBinary(PIX*, PIX*)</code>
     */
    public static native Pix pixDisplayDiffBinary(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_ok pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code>
     */
    public static native int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatBuffer pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code>
     */
    public static native int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatByReference pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code>
     */
    public static native int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_ok pixCompareTiled(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixCompareTiled(Pix pix1, Pix pix2, int sx, int sy, int type, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>NUMA* pixCompareRankDifference(PIX*, PIX*, l_int32)</code>
     */
    public static native Numa pixCompareRankDifference(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_ok pixTestForSimilarity(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32*, l_int32)</code>
     */
    public static native int pixTestForSimilarity(Pix pix1, Pix pix2, int factor, int mindiff, float maxfract, float maxave, IntBuffer psimilar, int details);

    /**
     * Original signature :
     * <code>l_ok pixGetDifferenceStats(PIX*, PIX*, l_int32, l_int32, l_float32*, l_float32*, l_int32)</code>
     */
    public static native int pixGetDifferenceStats(Pix pix1, Pix pix2, int factor, int mindiff, FloatBuffer pfractdiff, FloatBuffer pavediff, int details);

    /**
     * Original signature :
     * <code>NUMA* pixGetDifferenceHistogram(PIX*, PIX*, l_int32)</code>
     */
    public static native Numa pixGetDifferenceHistogram(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_ok pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code>
     */
    public static native int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatBuffer pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_ok pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code>
     */
    public static native int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatByReference pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_ok pixGetPSNR(PIX*, PIX*, l_int32, l_float32*)</code>
     */
    public static native int pixGetPSNR(Pix pix1, Pix pix2, int factor, FloatBuffer ppsnr);

    /**
     * Original signature :
     * <code>l_ok pixaComparePhotoRegionsByHisto(PIXA*, l_float32, l_float32, l_int32, l_int32, l_float32, NUMA**, l_float32**, PIX**, l_int32)</code>
     */
    public static native int pixaComparePhotoRegionsByHisto(Pixa pixa, float minratio, float textthresh, int factor, int n, float simthresh, PointerByReference pnai, PointerByReference pscores, PointerByReference ppixd, int debug);

    /**
     * Original signature :
     * <code>l_ok pixComparePhotoRegionsByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_float32*, l_int32)</code>
     */
    public static native int pixComparePhotoRegionsByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int factor, int n, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code>
     */
    public static native int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int n, PointerByReference pnaa, IntBuffer pw, IntBuffer ph, int debugindex);

    /**
     * Original signature :
     * <code>l_ok pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code>
     */
    public static native int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int n, PointerByReference pnaa, IntByReference pw, IntByReference ph, int debugindex);

    /**
     * Original signature :
     * <code>PIX* pixPadToCenterCentroid(PIX*, l_int32)</code>
     */
    public static native Pix pixPadToCenterCentroid(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_ok pixCentroid8(PIX*, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int pixCentroid8(Pix pixs, int factor, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfPhotoImage(PIX*, l_int32, l_float32, l_int32, NUMAA**, PIXA*)</code>
     */
    public static native int pixDecideIfPhotoImage(Pix pix, int factor, float thresh, int n, PointerByReference pnaa, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_ok compareTilesByHisto(NUMAA*, NUMAA*, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32*, PIXA*)</code>
     */
    public static native int compareTilesByHisto(Numaa naa1, Numaa naa2, float minratio, int w1, int h1, int w2, int h2, FloatBuffer pscore, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_ok pixCompareGrayByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_int32, l_float32*, l_int32)</code>
     */
    public static native int pixCompareGrayByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int maxgray, int factor, int n, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixCropAlignedToCentroid(PIX*, PIX*, l_int32, BOX**, BOX**)</code>
     */
    public static native int pixCropAlignedToCentroid(Pix pix1, Pix pix2, int factor, PointerByReference pbox1, PointerByReference pbox2);

    /**
     * Original signature :
     * <code>l_uint8* l_compressGrayHistograms(NUMAA*, l_int32, l_int32, size_t*)</code>
     */
    public static native Pointer l_compressGrayHistograms(Numaa naa, int w, int h, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>NUMAA* l_uncompressGrayHistograms(l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    public static native Numaa l_uncompressGrayHistograms(ByteBuffer bytea, NativeSize size, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok pixCompareWithTranslation(PIX*, PIX*, l_int32, l_int32*, l_int32*, l_float32*, l_int32)</code>
     */
    public static native int pixCompareWithTranslation(Pix pix1, Pix pix2, int thresh, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_ok pixBestCorrelation(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_float32*, l_int32)</code>
     */
    public static native int pixBestCorrelation(Pix pix1, Pix pix2, int area1, int area2, int etransx, int etransy, int maxshift, IntBuffer tab8, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>BOXA* pixConnComp(PIX*, PIXA**, l_int32)</code>
     */
    public static native Boxa pixConnComp(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature :
     * <code>BOXA* pixConnCompPixa(PIX*, PIXA**, l_int32)</code>
     */
    public static native Boxa pixConnCompPixa(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature : <code>BOXA* pixConnCompBB(PIX*, l_int32)</code>
     */
    public static native Boxa pixConnCompBB(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixCountConnComp(PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixCountConnComp(Pix pixs, int connectivity, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_int32 nextOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int nextOnPixelInRaster(Pix pixs, int xstart, int ystart, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>BOX* pixSeedfillBB(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code>
     */
    public static native Box pixSeedfillBB(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill4BB(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    public static native Box pixSeedfill4BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill8BB(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    public static native Box pixSeedfill8BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSeedfill(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill4(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    public static native int pixSeedfill4(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixSeedfill8(PIX*, L_STACK*, l_int32, l_int32)</code>
     */
    public static native int pixSeedfill8(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_ok convertFilesTo1bpp(const char*, const char*, l_int32, l_int32, l_int32, l_int32, const char*, l_int32)</code>
     */
    public static native int convertFilesTo1bpp(String dirin, String substr, int upscaling, int thresh, int firstpage, int npages, String dirout, int outformat);

    /**
     * Original signature :
     * <code>PIX* pixBlockconv(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlockconv(Pix pix, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGray(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlockconvGray(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature : <code>PIX* pixBlockconvAccum(PIX*)</code>
     */
    public static native Pix pixBlockconvAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayUnnormalized(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlockconvGrayUnnormalized(Pix pixs, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvTiled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixBlockconvTiled(Pix pix, int wc, int hc, int nx, int ny);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayTile(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlockconvGrayTile(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>l_ok pixWindowedStats(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, FPIX**, FPIX**)</code>
     */
    public static native int pixWindowedStats(Pix pixs, int wc, int hc, int hasborder, PointerByReference ppixm, PointerByReference ppixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMean(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixWindowedMean(Pix pixs, int wc, int hc, int hasborder, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMeanSquare(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixWindowedMeanSquare(Pix pixs, int wc, int hc, int hasborder);

    /**
     * Original signature :
     * <code>l_ok pixWindowedVariance(PIX*, PIX*, FPIX**, FPIX**)</code>
     */
    public static native int pixWindowedVariance(Pix pixm, Pix pixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature : <code>DPIX* pixMeanSquareAccum(PIX*)</code>
     */
    public static native DPix pixMeanSquareAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockrank(PIX*, PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixBlockrank(Pix pixs, Pix pixacc, int wc, int hc, float rank);

    /**
     * Original signature :
     * <code>PIX* pixBlocksum(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixBlocksum(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixCensusTransform(PIX*, l_int32, PIX*)</code>
     */
    public static native Pix pixCensusTransform(Pix pixs, int halfsize, Pix pixacc);

    /**
     * Original signature :
     * <code>PIX* pixConvolve(PIX*, L_KERNEL*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvolve(Pix pixs, L_Kernel kel, int outdepth, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveSep(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvolveSep(Pix pixs, L_Kernel kelx, L_Kernel kely, int outdepth, int normflag);

    /**
     * Original signature : <code>PIX* pixConvolveRGB(PIX*, L_KERNEL*)</code>
     */
    public static native Pix pixConvolveRGB(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixConvolveRGBSep(PIX*, L_KERNEL*, L_KERNEL*)</code>
     */
    public static native Pix pixConvolveRGBSep(Pix pixs, L_Kernel kelx, L_Kernel kely);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolve(FPIX*, L_KERNEL*, l_int32)</code>
     */
    public static native FPix fpixConvolve(FPix fpixs, L_Kernel kel, int normflag);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolveSep(FPIX*, L_KERNEL*, L_KERNEL*, l_int32)</code>
     */
    public static native FPix fpixConvolveSep(FPix fpixs, L_Kernel kelx, L_Kernel kely, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveWithBias(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32*)</code>
     */
    public static native Pix pixConvolveWithBias(Pix pixs, L_Kernel kel1, L_Kernel kel2, int force8, IntBuffer pbias);

    /**
     * Original signature :
     * <code>void l_setConvolveSampling(l_int32, l_int32)</code>
     */
    public static native void l_setConvolveSampling(int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixAddGaussianNoise(PIX*, l_float32)</code>
     */
    public static native Pix pixAddGaussianNoise(Pix pixs, float stdev);

    /**
     * Original signature : <code>l_float32 gaussDistribSampling()</code>
     */
    public static native float gaussDistribSampling();

    /**
     * Original signature :
     * <code>l_ok pixCorrelationScore(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code>
     */
    public static native int pixCorrelationScore(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);

    /**
     * Original signature :
     * <code>l_int32 pixCorrelationScoreThresholded(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_int32*, l_float32)</code>
     */
    public static native int pixCorrelationScoreThresholded(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, IntBuffer downcount, float score_threshold);

    /**
     * Original signature :
     * <code>l_ok pixCorrelationScoreSimple(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code>
     */
    public static native int pixCorrelationScoreSimple(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);

    /**
     * Original signature :
     * <code>l_ok pixCorrelationScoreShifted(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32*, l_float32*)</code>
     */
    public static native int pixCorrelationScoreShifted(Pix pix1, Pix pix2, int area1, int area2, int delx, int dely, IntBuffer tab, FloatBuffer pscore);

    /**
     * Original signature : <code>L_DEWARP* dewarpCreate(PIX*, l_int32)</code>
     */
    public static native L_Dewarp dewarpCreate(Pix pixs, int pageno);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpCreateRef(l_int32, l_int32)</code>
     */
    public static native L_Dewarp dewarpCreateRef(int pageno, int refpage);

    /**
     * Original signature : <code>void dewarpDestroy(L_DEWARP**)</code>
     */
    public static native void dewarpDestroy(PointerByReference pdew);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Dewarpa dewarpaCreate(int nptrs, int sampling, int redfactor, int minlines, int maxdist);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreateFromPixacomp(PIXAC*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Dewarpa dewarpaCreateFromPixacomp(PixaComp pixac, int useboth, int sampling, int minlines, int maxdist);

    /**
     * Original signature : <code>void dewarpaDestroy(L_DEWARPA**)</code>
     */
    public static native void dewarpaDestroy(PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaDestroyDewarp(L_DEWARPA*, l_int32)</code>
     */
    public static native int dewarpaDestroyDewarp(L_Dewarpa dewa, int pageno);

    /**
     * Original signature :
     * <code>l_ok dewarpaInsertDewarp(L_DEWARPA*, L_DEWARP*)</code>
     */
    public static native int dewarpaInsertDewarp(L_Dewarpa dewa, L_Dewarp dew);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpaGetDewarp(L_DEWARPA*, l_int32)</code>
     */
    public static native L_Dewarp dewarpaGetDewarp(L_Dewarpa dewa, int index);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetCurvatures(L_DEWARPA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int dewarpaSetCurvatures(L_Dewarpa dewa, int max_linecurv, int min_diff_linecurv, int max_diff_linecurv, int max_edgecurv, int max_diff_edgecurv, int max_edgeslope);

    /**
     * Original signature :
     * <code>l_ok dewarpaUseBothArrays(L_DEWARPA*, l_int32)</code>
     */
    public static native int dewarpaUseBothArrays(L_Dewarpa dewa, int useboth);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetCheckColumns(L_DEWARPA*, l_int32)</code>
     */
    public static native int dewarpaSetCheckColumns(L_Dewarpa dewa, int check_columns);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetMaxDistance(L_DEWARPA*, l_int32)</code>
     */
    public static native int dewarpaSetMaxDistance(L_Dewarpa dewa, int maxdist);

    /**
     * Original signature : <code>L_DEWARP* dewarpRead(const char*)</code>
     */
    public static native L_Dewarp dewarpRead(String filename);

    /**
     * Original signature : <code>L_DEWARP* dewarpReadStream(FILE*)</code>
     */
    public static native L_Dewarp dewarpReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpReadMem(const l_uint8*, size_t)</code>
     */
    public static native L_Dewarp dewarpReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok dewarpWrite(const char*, L_DEWARP*)</code>
     */
    public static native int dewarpWrite(String filename, L_Dewarp dew);

    /**
     * Original signature :
     * <code>l_ok dewarpWriteStream(FILE*, L_DEWARP*)</code>
     */
    public static native int dewarpWriteStream(FILE fp, L_Dewarp dew);

    /**
     * Original signature :
     * <code>l_ok dewarpWriteMem(l_uint8**, size_t*, L_DEWARP*)</code>
     */
    public static native int dewarpWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarp dew);

    /**
     * Original signature : <code>L_DEWARPA* dewarpaRead(const char*)</code>
     */
    public static native L_Dewarpa dewarpaRead(String filename);

    /**
     * Original signature : <code>L_DEWARPA* dewarpaReadStream(FILE*)</code>
     */
    public static native L_Dewarpa dewarpaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaReadMem(const l_uint8*, size_t)</code>
     */
    public static native L_Dewarpa dewarpaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok dewarpaWrite(const char*, L_DEWARPA*)</code>
     */
    public static native int dewarpaWrite(String filename, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaWriteStream(FILE*, L_DEWARPA*)</code>
     */
    public static native int dewarpaWriteStream(FILE fp, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaWriteMem(l_uint8**, size_t*, L_DEWARPA*)</code>
     */
    public static native int dewarpaWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpBuildPageModel(L_DEWARP*, const char*)</code>
     */
    public static native int dewarpBuildPageModel(L_Dewarp dew, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpFindVertDisparity(L_DEWARP*, PTAA*, l_int32)</code>
     */
    public static native int dewarpFindVertDisparity(L_Dewarp dew, Ptaa ptaa, int rotflag);

    /**
     * Original signature :
     * <code>l_ok dewarpFindHorizDisparity(L_DEWARP*, PTAA*)</code>
     */
    public static native int dewarpFindHorizDisparity(L_Dewarp dew, Ptaa ptaa);

    /**
     * Original signature :
     * <code>PTAA* dewarpGetTextlineCenters(PIX*, l_int32)</code>
     */
    public static native Ptaa dewarpGetTextlineCenters(Pix pixs, int debugflag);

    /**
     * Original signature :
     * <code>PTAA* dewarpRemoveShortLines(PIX*, PTAA*, l_float32, l_int32)</code>
     */
    public static native Ptaa dewarpRemoveShortLines(Pix pixs, Ptaa ptaas, float fract, int debugflag);

    /**
     * Original signature :
     * <code>l_ok dewarpFindHorizSlopeDisparity(L_DEWARP*, PIX*, l_float32, l_int32)</code>
     */
    public static native int dewarpFindHorizSlopeDisparity(L_Dewarp dew, Pix pixb, float fractthresh, int parity);

    /**
     * Original signature :
     * <code>l_ok dewarpBuildLineModel(L_DEWARP*, l_int32, const char*)</code>
     */
    public static native int dewarpBuildLineModel(L_Dewarp dew, int opensize, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaModelStatus(L_DEWARPA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int dewarpaModelStatus(L_Dewarpa dewa, int pageno, IntBuffer pvsuccess, IntBuffer phsuccess);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code>
     */
    public static native int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code>
     */
    public static native int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, Pointer debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code>
     */
    public static native int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, String debugfile);

    /**
     * Original signature :
     * <code>l_ok dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code>
     */
    public static native int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, Pointer debugfile);

    /**
     * Original signature : <code>l_ok dewarpMinimize(L_DEWARP*)</code>
     */
    public static native int dewarpMinimize(L_Dewarp dew);

    /**
     * Original signature :
     * <code>l_ok dewarpPopulateFullRes(L_DEWARP*, PIX*, l_int32, l_int32)</code>
     */
    public static native int dewarpPopulateFullRes(L_Dewarp dew, Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePage(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**, l_int32)</code>
     */
    public static native int dewarpSinglePage(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixd, PointerByReference pdewa, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePageInit(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**)</code>
     */
    public static native int dewarpSinglePageInit(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixb, PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_ok dewarpSinglePageRun(PIX*, PIX*, L_DEWARPA*, PIX**, l_int32)</code>
     */
    public static native int dewarpSinglePageRun(Pix pixs, Pix pixb, L_Dewarpa dewa, PointerByReference ppixd, int debug);

    /**
     * Original signature : <code>l_ok dewarpaListPages(L_DEWARPA*)</code>
     */
    public static native int dewarpaListPages(L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaSetValidModels(L_DEWARPA*, l_int32, l_int32)</code>
     */
    public static native int dewarpaSetValidModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature :
     * <code>l_ok dewarpaInsertRefModels(L_DEWARPA*, l_int32, l_int32)</code>
     */
    public static native int dewarpaInsertRefModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature : <code>l_ok dewarpaStripRefModels(L_DEWARPA*)</code>
     */
    public static native int dewarpaStripRefModels(L_Dewarpa dewa);

    /**
     * Original signature : <code>l_ok dewarpaRestoreModels(L_DEWARPA*)</code>
     */
    public static native int dewarpaRestoreModels(L_Dewarpa dewa);

    /**
     * Original signature : <code>l_ok dewarpaInfo(FILE*, L_DEWARPA*)</code>
     */
    public static native int dewarpaInfo(FILE fp, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_ok dewarpaModelStats(L_DEWARPA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int dewarpaModelStats(L_Dewarpa dewa, IntBuffer pnnone, IntBuffer pnvsuccess, IntBuffer pnvvalid, IntBuffer pnhsuccess, IntBuffer pnhvalid, IntBuffer pnref);

    /**
     * Original signature :
     * <code>l_ok dewarpaShowArrays(L_DEWARPA*, l_float32, l_int32, l_int32)</code>
     */
    public static native int dewarpaShowArrays(L_Dewarpa dewa, float scalefact, int first, int last);

    /**
     * Original signature :
     * <code>l_ok dewarpDebug(L_DEWARP*, const char*, l_int32)</code>
     */
    public static native int dewarpDebug(L_Dewarp dew, String subdirs, int index);

    /**
     * Original signature :
     * <code>l_ok dewarpShowResults(L_DEWARPA*, SARRAY*, BOXA*, l_int32, l_int32, const char*)</code>
     */
    public static native int dewarpShowResults(L_Dewarpa dewa, Sarray sa, Boxa boxa, int firstpage, int lastpage, String pdfout);

    /**
     * Original signature : <code>L_DNA* l_dnaCreate(l_int32)</code>
     */
    public static native L_Dna l_dnaCreate(int n);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaCreateFromIArray(l_int32*, l_int32)</code>
     */
    public static native L_Dna l_dnaCreateFromIArray(IntBuffer iarray, int size);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaCreateFromDArray(l_float64*, l_int32, l_int32)</code>
     */
    public static native L_Dna l_dnaCreateFromDArray(DoubleBuffer darray, int size, int copyflag);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaMakeSequence(l_float64, l_float64, l_int32)</code>
     */
    public static native L_Dna l_dnaMakeSequence(double startval, double increment, int size);

    /**
     * Original signature : <code>void l_dnaDestroy(L_DNA**)</code>
     */
    public static native void l_dnaDestroy(PointerByReference pda);

    /**
     * Original signature : <code>L_DNA* l_dnaCopy(L_DNA*)</code>
     */
    public static native L_Dna l_dnaCopy(L_Dna da);

    /**
     * Original signature : <code>L_DNA* l_dnaClone(L_DNA*)</code>
     */
    public static native L_Dna l_dnaClone(L_Dna da);

    /**
     * Original signature : <code>l_ok l_dnaEmpty(L_DNA*)</code>
     */
    public static native int l_dnaEmpty(L_Dna da);

    /**
     * Original signature : <code>l_ok l_dnaAddNumber(L_DNA*, l_float64)</code>
     */
    public static native int l_dnaAddNumber(L_Dna da, double val);

    /**
     * Original signature :
     * <code>l_ok l_dnaInsertNumber(L_DNA*, l_int32, l_float64)</code>
     */
    public static native int l_dnaInsertNumber(L_Dna da, int index, double val);

    /**
     * Original signature : <code>l_ok l_dnaRemoveNumber(L_DNA*, l_int32)</code>
     */
    public static native int l_dnaRemoveNumber(L_Dna da, int index);

    /**
     * Original signature :
     * <code>l_ok l_dnaReplaceNumber(L_DNA*, l_int32, l_float64)</code>
     */
    public static native int l_dnaReplaceNumber(L_Dna da, int index, double val);

    /**
     * Original signature : <code>l_int32 l_dnaGetCount(L_DNA*)</code>
     */
    public static native int l_dnaGetCount(L_Dna da);

    /**
     * Original signature : <code>l_ok l_dnaSetCount(L_DNA*, l_int32)</code>
     */
    public static native int l_dnaSetCount(L_Dna da, int newcount);

    /**
     * Original signature :
     * <code>l_ok l_dnaGetDValue(L_DNA*, l_int32, l_float64*)</code>
     */
    public static native int l_dnaGetDValue(L_Dna da, int index, DoubleBuffer pval);

    /**
     * Original signature :
     * <code>l_ok l_dnaGetIValue(L_DNA*, l_int32, l_int32*)</code>
     */
    public static native int l_dnaGetIValue(L_Dna da, int index, IntBuffer pival);

    /**
     * Original signature :
     * <code>l_ok l_dnaSetValue(L_DNA*, l_int32, l_float64)</code>
     */
    public static native int l_dnaSetValue(L_Dna da, int index, double val);

    /**
     * Original signature :
     * <code>l_ok l_dnaShiftValue(L_DNA*, l_int32, l_float64)</code>
     */
    public static native int l_dnaShiftValue(L_Dna da, int index, double diff);

    /**
     * Original signature : <code>l_int32* l_dnaGetIArray(L_DNA*)</code>
     */
    public static native IntByReference l_dnaGetIArray(L_Dna da);

    /**
     * Original signature :
     * <code>l_float64* l_dnaGetDArray(L_DNA*, l_int32)</code>
     */
    public static native DoubleByReference l_dnaGetDArray(L_Dna da, int copyflag);

    /**
     * Original signature :
     * <code>l_ok l_dnaGetParameters(L_DNA*, l_float64*, l_float64*)</code>
     */
    public static native int l_dnaGetParameters(L_Dna da, DoubleBuffer pstartx, DoubleBuffer pdelx);

    /**
     * Original signature :
     * <code>l_ok l_dnaSetParameters(L_DNA*, l_float64, l_float64)</code>
     */
    public static native int l_dnaSetParameters(L_Dna da, double startx, double delx);

    /**
     * Original signature :
     * <code>l_ok l_dnaCopyParameters(L_DNA*, L_DNA*)</code>
     */
    public static native int l_dnaCopyParameters(L_Dna dad, L_Dna das);

    /**
     * Original signature : <code>L_DNA* l_dnaRead(const char*)</code>
     */
    public static native L_Dna l_dnaRead(String filename);

    /**
     * Original signature : <code>L_DNA* l_dnaReadStream(FILE*)</code>
     */
    public static native L_Dna l_dnaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaReadMem(const l_uint8*, size_t)</code>
     */
    public static native L_Dna l_dnaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok l_dnaWrite(const char*, L_DNA*)</code>
     */
    public static native int l_dnaWrite(String filename, L_Dna da);

    /**
     * Original signature : <code>l_ok l_dnaWriteStream(FILE*, L_DNA*)</code>
     */
    public static native int l_dnaWriteStream(FILE fp, L_Dna da);

    /**
     * Original signature : <code>l_ok l_dnaWriteStderr(L_DNA*)</code>
     */
    public static native int l_dnaWriteStderr(L_Dna da);

    /**
     * Original signature :
     * <code>l_ok l_dnaWriteMem(l_uint8**, size_t*, L_DNA*)</code>
     */
    public static native int l_dnaWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dna da);

    /**
     * Original signature : <code>L_DNAA* l_dnaaCreate(l_int32)</code>
     */
    public static native L_Dnaa l_dnaaCreate(int n);

    /**
     * Original signature :
     * <code>L_DNAA* l_dnaaCreateFull(l_int32, l_int32)</code>
     */
    public static native L_Dnaa l_dnaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_ok l_dnaaTruncate(L_DNAA*)</code>
     */
    public static native int l_dnaaTruncate(L_Dnaa daa);

    /**
     * Original signature : <code>void l_dnaaDestroy(L_DNAA**)</code>
     */
    public static native void l_dnaaDestroy(PointerByReference pdaa);

    /**
     * Original signature :
     * <code>l_ok l_dnaaAddDna(L_DNAA*, L_DNA*, l_int32)</code>
     */
    public static native int l_dnaaAddDna(L_Dnaa daa, L_Dna da, int copyflag);

    /**
     * Original signature : <code>l_int32 l_dnaaGetCount(L_DNAA*)</code>
     */
    public static native int l_dnaaGetCount(L_Dnaa daa);

    /**
     * Original signature :
     * <code>l_int32 l_dnaaGetDnaCount(L_DNAA*, l_int32)</code>
     */
    public static native int l_dnaaGetDnaCount(L_Dnaa daa, int index);

    /**
     * Original signature : <code>l_int32 l_dnaaGetNumberCount(L_DNAA*)</code>
     */
    public static native int l_dnaaGetNumberCount(L_Dnaa daa);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaaGetDna(L_DNAA*, l_int32, l_int32)</code>
     */
    public static native L_Dna l_dnaaGetDna(L_Dnaa daa, int index, int accessflag);

    /**
     * Original signature :
     * <code>l_ok l_dnaaReplaceDna(L_DNAA*, l_int32, L_DNA*)</code>
     */
    public static native int l_dnaaReplaceDna(L_Dnaa daa, int index, L_Dna da);

    /**
     * Original signature :
     * <code>l_ok l_dnaaGetValue(L_DNAA*, l_int32, l_int32, l_float64*)</code>
     */
    public static native int l_dnaaGetValue(L_Dnaa daa, int i, int j, DoubleBuffer pval);

    /**
     * Original signature :
     * <code>l_ok l_dnaaAddNumber(L_DNAA*, l_int32, l_float64)</code>
     */
    public static native int l_dnaaAddNumber(L_Dnaa daa, int index, double val);

    /**
     * Original signature : <code>L_DNAA* l_dnaaRead(const char*)</code>
     */
    public static native L_Dnaa l_dnaaRead(String filename);

    /**
     * Original signature : <code>L_DNAA* l_dnaaReadStream(FILE*)</code>
     */
    public static native L_Dnaa l_dnaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DNAA* l_dnaaReadMem(const l_uint8*, size_t)</code>
     */
    public static native L_Dnaa l_dnaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok l_dnaaWrite(const char*, L_DNAA*)</code>
     */
    public static native int l_dnaaWrite(String filename, L_Dnaa daa);

    /**
     * Original signature : <code>l_ok l_dnaaWriteStream(FILE*, L_DNAA*)</code>
     */
    public static native int l_dnaaWriteStream(FILE fp, L_Dnaa daa);

    /**
     * Original signature :
     * <code>l_ok l_dnaaWriteMem(l_uint8**, size_t*, L_DNAA*)</code>
     */
    public static native int l_dnaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dnaa daa);

    /**
     * Original signature :
     * <code>l_ok l_dnaJoin(L_DNA*, L_DNA*, l_int32, l_int32)</code>
     */
    public static native int l_dnaJoin(L_Dna dad, L_Dna das, int istart, int iend);

    /**
     * Original signature : <code>L_DNA* l_dnaaFlattenToDna(L_DNAA*)</code>
     */
    public static native L_Dna l_dnaaFlattenToDna(L_Dnaa daa);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaSelectRange(L_DNA*, l_int32, l_int32)</code>
     */
    public static native L_Dna l_dnaSelectRange(L_Dna das, int first, int last);

    /**
     * Original signature : <code>NUMA* l_dnaConvertToNuma(L_DNA*)</code>
     */
    public static native Numa l_dnaConvertToNuma(L_Dna da);

    /**
     * Original signature : <code>L_DNA* numaConvertToDna(NUMA*)</code>
     */
    public static native L_Dna numaConvertToDna(Numa na);

    /**
     * Original signature : <code>L_DNA* pixConvertDataToDna(PIX*)</code>
     */
    public static native L_Dna pixConvertDataToDna(Pix pix);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromDna(L_DNA*)</code>
     */
    public static native L_Rbtree l_asetCreateFromDna(L_Dna da);

    /**
     * Original signature :
     * <code>l_ok l_dnaRemoveDupsByAset(L_DNA*, L_DNA**)</code>
     */
    public static native int l_dnaRemoveDupsByAset(L_Dna das, PointerByReference pdad);

    /**
     * Original signature :
     * <code>l_ok l_dnaUnionByAset(L_DNA*, L_DNA*, L_DNA**)</code>
     */
    public static native int l_dnaUnionByAset(L_Dna da1, L_Dna da2, PointerByReference pdad);

    /**
     * Original signature :
     * <code>l_ok l_dnaIntersectionByAset(L_DNA*, L_DNA*, L_DNA**)</code>
     */
    public static native int l_dnaIntersectionByAset(L_Dna da1, L_Dna da2, PointerByReference pdad);

    /**
     * Original signature : <code>L_HASHMAP* l_hmapCreateFromDna(L_DNA*)</code>
     */
    public static native L_Hashmap l_hmapCreateFromDna(L_Dna da);

    /**
     * Original signature :
     * <code>l_ok l_dnaRemoveDupsByHmap(L_DNA*, L_DNA**, L_HASHMAP**)</code>
     */
    public static native int l_dnaRemoveDupsByHmap(L_Dna das, PointerByReference pdad, PointerByReference phmap);

    /**
     * Original signature :
     * <code>l_ok l_dnaUnionByHmap(L_DNA*, L_DNA*, L_DNA**)</code>
     */
    public static native int l_dnaUnionByHmap(L_Dna da1, L_Dna da2, PointerByReference pdad);

    /**
     * Original signature :
     * <code>l_ok l_dnaIntersectionByHmap(L_DNA*, L_DNA*, L_DNA**)</code>
     */
    public static native int l_dnaIntersectionByHmap(L_Dna da1, L_Dna da2, PointerByReference pdad);

    /**
     * Original signature :
     * <code>l_ok l_dnaMakeHistoByHmap(L_DNA*, L_DNA**, L_DNA**)</code>
     */
    public static native int l_dnaMakeHistoByHmap(L_Dna das, PointerByReference pdav, PointerByReference pdac);

    /**
     * Original signature : <code>L_DNA* l_dnaDiffAdjValues(L_DNA*)</code>
     */
    public static native L_Dna l_dnaDiffAdjValues(L_Dna das);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreate(l_int32, l_int32)</code>
     */
    public static native L_DnaHash l_dnaHashCreate(int nbuckets, int initsize);

    /**
     * Original signature : <code>void l_dnaHashDestroy(L_DNAHASH**)</code>
     */
    public static native void l_dnaHashDestroy(PointerByReference pdahash);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaHashGetDna(L_DNAHASH*, l_uint64, l_int32)</code>
     */
    public static native L_Dna l_dnaHashGetDna(L_DnaHash dahash, long key, int copyflag);

    /**
     * Original signature :
     * <code>l_ok l_dnaHashAdd(L_DNAHASH*, l_uint64, l_float64)</code>
     */
    public static native int l_dnaHashAdd(L_DnaHash dahash, long key, double value);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_2(PIX*, PIX*, l_int32, char*)</code>
     */
    public static native Pix pixMorphDwa_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_2(PIX*, PIX*, l_int32, char*)</code>
     */
    public static native Pix pixFMorphopGen_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>l_int32 fmorphopgen_low_2(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    public static native int fmorphopgen_low_2(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature : <code>PIX* pixSobelEdgeFilter(PIX*, l_int32)</code>
     */
    public static native Pix pixSobelEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>PIX* pixTwoSidedEdgeFilter(PIX*, l_int32)</code>
     */
    public static native Pix pixTwoSidedEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>l_ok pixMeasureEdgeSmoothness(PIX*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, const char*)</code>
     */
    public static native int pixMeasureEdgeSmoothness(Pix pixs, int side, int minjump, int minreversal, FloatBuffer pjpl, FloatBuffer pjspl, FloatBuffer prpl, String debugfile);

    /**
     * Original signature :
     * <code>NUMA* pixGetEdgeProfile(PIX*, l_int32, const char*)</code>
     */
    public static native Numa pixGetEdgeProfile(Pix pixs, int side, String debugfile);

    /**
     * Original signature :
     * <code>l_ok pixGetLastOffPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixGetLastOffPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>l_int32 pixGetLastOnPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixGetLastOnPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>char* encodeBase64(const l_uint8*, l_int32, l_int32*)</code>
     */
    public static native Pointer encodeBase64(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeBase64(const char*, l_int32, l_int32*)</code>
     */
    public static native Pointer decodeBase64(String inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>char* encodeAscii85(const l_uint8*, size_t, size_t*)</code>
     */
    public static native Pointer encodeAscii85(ByteBuffer inarray, NativeSize insize, NativeSizeByReference poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeAscii85(const char*, size_t, size_t*)</code>
     */
    public static native Pointer decodeAscii85(String inarray, NativeSize insize, NativeSizeByReference poutsize);

    /**
     * Original signature :
     * <code>char* encodeAscii85WithComp(const l_uint8*, size_t, size_t*)</code>
     */
    public static native Pointer encodeAscii85WithComp(ByteBuffer indata, NativeSize insize, NativeSizeByReference poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeAscii85WithComp(const char*, size_t, size_t*)</code>
     */
    public static native Pointer decodeAscii85WithComp(String instr, NativeSize insize, NativeSizeByReference poutsize);

    /**
     * Original signature :
     * <code>char* reformatPacked64(const char*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pointer reformatPacked64(String inarray, int insize, int leadspace, int linechars, int addquotes, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRC(PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixGammaTRC(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCMasked(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixGammaTRCMasked(Pix pixd, Pix pixs, Pix pixm, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCWithAlpha(PIX*, PIX*, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixGammaTRCWithAlpha(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>NUMA* numaGammaTRC(l_float32, l_int32, l_int32)</code>
     */
    public static native Numa numaGammaTRC(float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRC(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixContrastTRC(Pix pixd, Pix pixs, float factor);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRCMasked(PIX*, PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixContrastTRCMasked(Pix pixd, Pix pixs, Pix pixm, float factor);

    /**
     * Original signature : <code>NUMA* numaContrastTRC(l_float32)</code>
     */
    public static native Numa numaContrastTRC(float factor);

    /**
     * Original signature :
     * <code>PIX* pixEqualizeTRC(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixEqualizeTRC(Pix pixd, Pix pixs, float fract, int factor);

    /**
     * Original signature :
     * <code>NUMA* numaEqualizeTRC(PIX*, l_float32, l_int32)</code>
     */
    public static native Numa numaEqualizeTRC(Pix pix, float fract, int factor);

    /**
     * Original signature : <code>l_int32 pixTRCMap(PIX*, PIX*, NUMA*)</code>
     */
    public static native int pixTRCMap(Pix pixs, Pix pixm, Numa na);

    /**
     * Original signature :
     * <code>l_int32 pixTRCMapGeneral(PIX*, PIX*, NUMA*, NUMA*, NUMA*)</code>
     */
    public static native int pixTRCMapGeneral(Pix pixs, Pix pixm, Numa nar, Numa nag, Numa nab);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMasking(PIX*, l_int32, l_float32)</code>
     */
    public static native Pix pixUnsharpMasking(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray(PIX*, l_int32, l_float32)</code>
     */
    public static native Pix pixUnsharpMaskingGray(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingFast(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixUnsharpMaskingFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGrayFast(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixUnsharpMaskingGrayFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray1D(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixUnsharpMaskingGray1D(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray2D(PIX*, l_int32, l_float32)</code>
     */
    public static native Pix pixUnsharpMaskingGray2D(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifyHue(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixModifyHue(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifySaturation(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixModifySaturation(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixMeasureSaturation(PIX*, l_int32, l_float32*)</code>
     */
    public static native int pixMeasureSaturation(Pix pixs, int factor, FloatBuffer psat);

    /**
     * Original signature :
     * <code>PIX* pixModifyBrightness(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixModifyBrightness(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixMosaicColorShiftRGB(PIX*, l_float32, l_float32, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixMosaicColorShiftRGB(Pix pixs, float roff, float goff, float boff, float delta, int nincr);

    /**
     * Original signature :
     * <code>PIX* pixColorShiftRGB(PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixColorShiftRGB(Pix pixs, float rfract, float gfract, float bfract);

    /**
     * Original signature :
     * <code>PIX* pixDarkenGray(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDarkenGray(Pix pixd, Pix pixs, int thresh, int satlimit);

    /**
     * Original signature :
     * <code>PIX* pixMultConstantColor(PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixMultConstantColor(Pix pixs, float rfact, float gfact, float bfact);

    /**
     * Original signature :
     * <code>PIX* pixMultMatrixColor(PIX*, L_KERNEL*)</code>
     */
    public static native Pix pixMultMatrixColor(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixHalfEdgeByBandpass(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixHalfEdgeByBandpass(Pix pixs, int sm1h, int sm1v, int sm2h, int sm2v);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen(SELA*, l_int32, const char*)</code>
     */
    public static native int fhmtautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen1(SELA*, l_int32, const char*)</code>
     */
    public static native int fhmtautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fhmtautogen2(SELA*, l_int32, const char*)</code>
     */
    public static native int fhmtautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixHMTDwa_1(PIX*, PIX*, const char*)</code>
     */
    public static native Pix pixHMTDwa_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>PIX* pixFHMTGen_1(PIX*, PIX*, const char*)</code>
     */
    public static native Pix pixFHMTGen_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>l_int32 fhmtgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    public static native int fhmtgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature :
     * <code>l_ok pixItalicWords(PIX*, BOXA*, PIX*, BOXA**, l_int32)</code>
     */
    public static native int pixItalicWords(Pix pixs, Boxa boxaw, Pix pixw, PointerByReference pboxa, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixOrientCorrect(PIX*, l_float32, l_float32, l_float32*, l_float32*, l_int32*, l_int32)</code>
     */
    public static native Pix pixOrientCorrect(Pix pixs, float minupconf, float minratio, FloatBuffer pupconf, FloatBuffer pleftconf, IntBuffer protation, int debug);

    /**
     * Original signature :
     * <code>l_ok pixOrientDetect(PIX*, l_float32*, l_float32*, l_int32, l_int32)</code>
     */
    public static native int pixOrientDetect(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok makeOrientDecision(l_float32, l_float32, l_float32, l_float32, l_int32*, l_int32)</code>
     */
    public static native int makeOrientDecision(float upconf, float leftconf, float minupconf, float minratio, IntBuffer porient, int debug);

    /**
     * Original signature :
     * <code>l_ok pixUpDownDetect(PIX*, l_float32*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixUpDownDetect(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug);

    /**
     * Original signature :
     * <code>l_ok pixMirrorDetect(PIX*, l_float32*, l_int32, l_int32)</code>
     */
    public static native int pixMirrorDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_ok fmorphautogen(SELA*, l_int32, const char*)</code>
     */
    public static native int fmorphautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_ok fmorphautogen1(SELA*, l_int32, const char*)</code>
     */
    public static native int fmorphautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_int32 fmorphautogen2(SELA*, l_int32, const char*)</code>
     */
    public static native int fmorphautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_1(PIX*, PIX*, l_int32, char*)</code>
     */
    public static native Pix pixMorphDwa_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_1(PIX*, PIX*, l_int32, char*)</code>
     */
    public static native Pix pixFMorphopGen_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>l_int32 fmorphopgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    public static native int fmorphopgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature : <code>FPIX* fpixCreate(l_int32, l_int32)</code>
     */
    public static native FPix fpixCreate(int width, int height);

    /**
     * Original signature : <code>FPIX* fpixCreateTemplate(FPIX*)</code>
     */
    public static native FPix fpixCreateTemplate(FPix fpixs);

    /**
     * Original signature : <code>FPIX* fpixClone(FPIX*)</code>
     */
    public static native FPix fpixClone(FPix fpix);

    /**
     * Original signature : <code>FPIX* fpixCopy(FPIX*)</code>
     */
    public static native FPix fpixCopy(FPix fpixs);

    /**
     * Original signature : <code>void fpixDestroy(FPIX**)</code>
     */
    public static native void fpixDestroy(PointerByReference pfpix);

    /**
     * Original signature :
     * <code>l_ok fpixGetDimensions(FPIX*, l_int32*, l_int32*)</code>
     */
    public static native int fpixGetDimensions(FPix fpix, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok fpixSetDimensions(FPIX*, l_int32, l_int32)</code>
     */
    public static native int fpixSetDimensions(FPix fpix, int w, int h);

    /**
     * Original signature : <code>l_int32 fpixGetWpl(FPIX*)</code>
     */
    public static native int fpixGetWpl(FPix fpix);

    /**
     * Original signature : <code>l_ok fpixSetWpl(FPIX*, l_int32)</code>
     */
    public static native int fpixSetWpl(FPix fpix, int wpl);

    /**
     * Original signature :
     * <code>l_ok fpixGetResolution(FPIX*, l_int32*, l_int32*)</code>
     */
    public static native int fpixGetResolution(FPix fpix, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok fpixSetResolution(FPIX*, l_int32, l_int32)</code>
     */
    public static native int fpixSetResolution(FPix fpix, int xres, int yres);

    /**
     * Original signature : <code>l_ok fpixCopyResolution(FPIX*, FPIX*)</code>
     */
    public static native int fpixCopyResolution(FPix fpixd, FPix fpixs);

    /**
     * Original signature : <code>l_float32* fpixGetData(FPIX*)</code>
     */
    public static native FloatByReference fpixGetData(FPix fpix);

    /**
     * Original signature : <code>l_ok fpixSetData(FPIX*, l_float32*)</code>
     */
    public static native int fpixSetData(FPix fpix, FloatBuffer data);

    /**
     * Original signature :
     * <code>l_ok fpixGetPixel(FPIX*, l_int32, l_int32, l_float32*)</code>
     */
    public static native int fpixGetPixel(FPix fpix, int x, int y, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok fpixSetPixel(FPIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native int fpixSetPixel(FPix fpix, int x, int y, float val);

    /**
     * Original signature : <code>FPIXA* fpixaCreate(l_int32)</code>
     */
    public static native FPixa fpixaCreate(int n);

    /**
     * Original signature : <code>FPIXA* fpixaCopy(FPIXA*, l_int32)</code>
     */
    public static native FPixa fpixaCopy(FPixa fpixa, int copyflag);

    /**
     * Original signature : <code>void fpixaDestroy(FPIXA**)</code>
     */
    public static native void fpixaDestroy(PointerByReference pfpixa);

    /**
     * Original signature :
     * <code>l_ok fpixaAddFPix(FPIXA*, FPIX*, l_int32)</code>
     */
    public static native int fpixaAddFPix(FPixa fpixa, FPix fpix, int copyflag);

    /**
     * Original signature : <code>l_int32 fpixaGetCount(FPIXA*)</code>
     */
    public static native int fpixaGetCount(FPixa fpixa);

    /**
     * Original signature :
     * <code>FPIX* fpixaGetFPix(FPIXA*, l_int32, l_int32)</code>
     */
    public static native FPix fpixaGetFPix(FPixa fpixa, int index, int accesstype);

    /**
     * Original signature :
     * <code>l_ok fpixaGetFPixDimensions(FPIXA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int fpixaGetFPixDimensions(FPixa fpixa, int index, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_float32* fpixaGetData(FPIXA*, l_int32)</code>
     */
    public static native FloatByReference fpixaGetData(FPixa fpixa, int index);

    /**
     * Original signature :
     * <code>l_ok fpixaGetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int fpixaGetPixel(FPixa fpixa, int index, int x, int y, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok fpixaSetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32)</code>
     */
    public static native int fpixaSetPixel(FPixa fpixa, int index, int x, int y, float val);

    /**
     * Original signature : <code>DPIX* dpixCreate(l_int32, l_int32)</code>
     */
    public static native DPix dpixCreate(int width, int height);

    /**
     * Original signature : <code>DPIX* dpixCreateTemplate(DPIX*)</code>
     */
    public static native DPix dpixCreateTemplate(DPix dpixs);

    /**
     * Original signature : <code>DPIX* dpixClone(DPIX*)</code>
     */
    public static native DPix dpixClone(DPix dpix);

    /**
     * Original signature : <code>DPIX* dpixCopy(DPIX*)</code>
     */
    public static native DPix dpixCopy(DPix dpixs);

    /**
     * Original signature : <code>void dpixDestroy(DPIX**)</code>
     */
    public static native void dpixDestroy(PointerByReference pdpix);

    /**
     * Original signature :
     * <code>l_ok dpixGetDimensions(DPIX*, l_int32*, l_int32*)</code>
     */
    public static native int dpixGetDimensions(DPix dpix, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok dpixSetDimensions(DPIX*, l_int32, l_int32)</code>
     */
    public static native int dpixSetDimensions(DPix dpix, int w, int h);

    /**
     * Original signature : <code>l_int32 dpixGetWpl(DPIX*)</code>
     */
    public static native int dpixGetWpl(DPix dpix);

    /**
     * Original signature : <code>l_ok dpixSetWpl(DPIX*, l_int32)</code>
     */
    public static native int dpixSetWpl(DPix dpix, int wpl);

    /**
     * Original signature :
     * <code>l_ok dpixGetResolution(DPIX*, l_int32*, l_int32*)</code>
     */
    public static native int dpixGetResolution(DPix dpix, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok dpixSetResolution(DPIX*, l_int32, l_int32)</code>
     */
    public static native int dpixSetResolution(DPix dpix, int xres, int yres);

    /**
     * Original signature : <code>l_ok dpixCopyResolution(DPIX*, DPIX*)</code>
     */
    public static native int dpixCopyResolution(DPix dpixd, DPix dpixs);

    /**
     * Original signature : <code>l_float64* dpixGetData(DPIX*)</code>
     */
    public static native DoubleByReference dpixGetData(DPix dpix);

    /**
     * Original signature : <code>l_ok dpixSetData(DPIX*, l_float64*)</code>
     */
    public static native int dpixSetData(DPix dpix, DoubleBuffer data);

    /**
     * Original signature :
     * <code>l_ok dpixGetPixel(DPIX*, l_int32, l_int32, l_float64*)</code>
     */
    public static native int dpixGetPixel(DPix dpix, int x, int y, DoubleBuffer pval);

    /**
     * Original signature :
     * <code>l_ok dpixSetPixel(DPIX*, l_int32, l_int32, l_float64)</code>
     */
    public static native int dpixSetPixel(DPix dpix, int x, int y, double val);

    /**
     * Original signature : <code>FPIX* fpixRead(const char*)</code>
     */
    public static native FPix fpixRead(String filename);

    /**
     * Original signature : <code>FPIX* fpixReadStream(FILE*)</code>
     */
    public static native FPix fpixReadStream(FILE fp);

    /**
     * Original signature :
     * <code>FPIX* fpixReadMem(const l_uint8*, size_t)</code>
     */
    public static native FPix fpixReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok fpixWrite(const char*, FPIX*)</code>
     */
    public static native int fpixWrite(String filename, FPix fpix);

    /**
     * Original signature : <code>l_ok fpixWriteStream(FILE*, FPIX*)</code>
     */
    public static native int fpixWriteStream(FILE fp, FPix fpix);

    /**
     * Original signature :
     * <code>l_ok fpixWriteMem(l_uint8**, size_t*, FPIX*)</code>
     */
    public static native int fpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, FPix fpix);

    /**
     * Original signature : <code>FPIX* fpixEndianByteSwap(FPIX*, FPIX*)</code>
     */
    public static native FPix fpixEndianByteSwap(FPix fpixd, FPix fpixs);

    /**
     * Original signature : <code>DPIX* dpixRead(const char*)</code>
     */
    public static native DPix dpixRead(String filename);

    /**
     * Original signature : <code>DPIX* dpixReadStream(FILE*)</code>
     */
    public static native DPix dpixReadStream(FILE fp);

    /**
     * Original signature :
     * <code>DPIX* dpixReadMem(const l_uint8*, size_t)</code>
     */
    public static native DPix dpixReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok dpixWrite(const char*, DPIX*)</code>
     */
    public static native int dpixWrite(String filename, DPix dpix);

    /**
     * Original signature : <code>l_ok dpixWriteStream(FILE*, DPIX*)</code>
     */
    public static native int dpixWriteStream(FILE fp, DPix dpix);

    /**
     * Original signature :
     * <code>l_ok dpixWriteMem(l_uint8**, size_t*, DPIX*)</code>
     */
    public static native int dpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, DPix dpix);

    /**
     * Original signature : <code>DPIX* dpixEndianByteSwap(DPIX*, DPIX*)</code>
     */
    public static native DPix dpixEndianByteSwap(DPix dpixd, DPix dpixs);

    /**
     * Original signature :
     * <code>l_ok fpixPrintStream(FILE*, FPIX*, l_int32)</code>
     */
    public static native int fpixPrintStream(FILE fp, FPix fpix, int factor);

    /**
     * Original signature : <code>FPIX* pixConvertToFPix(PIX*, l_int32)</code>
     */
    public static native FPix pixConvertToFPix(Pix pixs, int ncomps);

    /**
     * Original signature : <code>DPIX* pixConvertToDPix(PIX*, l_int32)</code>
     */
    public static native DPix pixConvertToDPix(Pix pixs, int ncomps);

    /**
     * Original signature :
     * <code>PIX* fpixConvertToPix(FPIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix fpixConvertToPix(FPix fpixs, int outdepth, int negvals, int errorflag);

    /**
     * Original signature : <code>PIX* fpixDisplayMaxDynamicRange(FPIX*)</code>
     */
    public static native Pix fpixDisplayMaxDynamicRange(FPix fpixs);

    /**
     * Original signature : <code>DPIX* fpixConvertToDPix(FPIX*)</code>
     */
    public static native DPix fpixConvertToDPix(FPix fpix);

    /**
     * Original signature :
     * <code>PIX* dpixConvertToPix(DPIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix dpixConvertToPix(DPix dpixs, int outdepth, int negvals, int errorflag);

    /**
     * Original signature : <code>FPIX* dpixConvertToFPix(DPIX*)</code>
     */
    public static native FPix dpixConvertToFPix(DPix dpix);

    /**
     * Original signature :
     * <code>l_ok fpixGetMin(FPIX*, l_float32*, l_int32*, l_int32*)</code>
     */
    public static native int fpixGetMin(FPix fpix, FloatBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);

    /**
     * Original signature :
     * <code>l_ok fpixGetMax(FPIX*, l_float32*, l_int32*, l_int32*)</code>
     */
    public static native int fpixGetMax(FPix fpix, FloatBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);

    /**
     * Original signature :
     * <code>l_ok dpixGetMin(DPIX*, l_float64*, l_int32*, l_int32*)</code>
     */
    public static native int dpixGetMin(DPix dpix, DoubleBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);

    /**
     * Original signature :
     * <code>l_ok dpixGetMax(DPIX*, l_float64*, l_int32*, l_int32*)</code>
     */
    public static native int dpixGetMax(DPix dpix, DoubleBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);

    /**
     * Original signature :
     * <code>FPIX* fpixScaleByInteger(FPIX*, l_int32)</code>
     */
    public static native FPix fpixScaleByInteger(FPix fpixs, int factor);

    /**
     * Original signature :
     * <code>DPIX* dpixScaleByInteger(DPIX*, l_int32)</code>
     */
    public static native DPix dpixScaleByInteger(DPix dpixs, int factor);

    /**
     * Original signature :
     * <code>FPIX* fpixLinearCombination(FPIX*, FPIX*, FPIX*, l_float32, l_float32)</code>
     */
    public static native FPix fpixLinearCombination(FPix fpixd, FPix fpixs1, FPix fpixs2, float a, float b);

    /**
     * Original signature :
     * <code>l_ok fpixAddMultConstant(FPIX*, l_float32, l_float32)</code>
     */
    public static native int fpixAddMultConstant(FPix fpix, float addc, float multc);

    /**
     * Original signature :
     * <code>DPIX* dpixLinearCombination(DPIX*, DPIX*, DPIX*, l_float32, l_float32)</code>
     */
    public static native DPix dpixLinearCombination(DPix dpixd, DPix dpixs1, DPix dpixs2, float a, float b);

    /**
     * Original signature :
     * <code>l_ok dpixAddMultConstant(DPIX*, l_float64, l_float64)</code>
     */
    public static native int dpixAddMultConstant(DPix dpix, double addc, double multc);

    /**
     * Original signature :
     * <code>l_ok fpixSetAllArbitrary(FPIX*, l_float32)</code>
     */
    public static native int fpixSetAllArbitrary(FPix fpix, float inval);

    /**
     * Original signature :
     * <code>l_ok dpixSetAllArbitrary(DPIX*, l_float64)</code>
     */
    public static native int dpixSetAllArbitrary(DPix dpix, double inval);

    /**
     * Original signature :
     * <code>FPIX* fpixAddBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native FPix fpixAddBorder(FPix fpixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>FPIX* fpixRemoveBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native FPix fpixRemoveBorder(FPix fpixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>FPIX* fpixAddMirroredBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native FPix fpixAddMirroredBorder(FPix fpixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>FPIX* fpixAddContinuedBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native FPix fpixAddContinuedBorder(FPix fpixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>FPIX* fpixAddSlopeBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native FPix fpixAddSlopeBorder(FPix fpixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>l_ok fpixRasterop(FPIX*, l_int32, l_int32, l_int32, l_int32, FPIX*, l_int32, l_int32)</code>
     */
    public static native int fpixRasterop(FPix fpixd, int dx, int dy, int dw, int dh, FPix fpixs, int sx, int sy);

    /**
     * Original signature : <code>FPIX* fpixRotateOrth(FPIX*, l_int32)</code>
     */
    public static native FPix fpixRotateOrth(FPix fpixs, int quads);

    /**
     * Original signature : <code>FPIX* fpixRotate180(FPIX*, FPIX*)</code>
     */
    public static native FPix fpixRotate180(FPix fpixd, FPix fpixs);

    /**
     * Original signature : <code>FPIX* fpixRotate90(FPIX*, l_int32)</code>
     */
    public static native FPix fpixRotate90(FPix fpixs, int direction);

    /**
     * Original signature : <code>FPIX* fpixFlipLR(FPIX*, FPIX*)</code>
     */
    public static native FPix fpixFlipLR(FPix fpixd, FPix fpixs);

    /**
     * Original signature : <code>FPIX* fpixFlipTB(FPIX*, FPIX*)</code>
     */
    public static native FPix fpixFlipTB(FPix fpixd, FPix fpixs);

    /**
     * Original signature :
     * <code>FPIX* fpixAffinePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code>
     */
    public static native FPix fpixAffinePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);

    /**
     * Original signature :
     * <code>FPIX* fpixAffine(FPIX*, l_float32*, l_float32)</code>
     */
    public static native FPix fpixAffine(FPix fpixs, FloatBuffer vc, float inval);

    /**
     * Original signature :
     * <code>FPIX* fpixProjectivePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code>
     */
    public static native FPix fpixProjectivePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);

    /**
     * Original signature :
     * <code>FPIX* fpixProjective(FPIX*, l_float32*, l_float32)</code>
     */
    public static native FPix fpixProjective(FPix fpixs, FloatBuffer vc, float inval);

    /**
     * Original signature :
     * <code>l_ok linearInterpolatePixelFloat(l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int linearInterpolatePixelFloat(FloatBuffer datas, int w, int h, float x, float y, float inval, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* fpixThresholdToPix(FPIX*, l_float32)</code>
     */
    public static native Pix fpixThresholdToPix(FPix fpix, float thresh);

    /**
     * Original signature :
     * <code>FPIX* pixComponentFunction(PIX*, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native FPix pixComponentFunction(Pix pix, float rnum, float gnum, float bnum, float rdenom, float gdenom, float bdenom);

    /**
     * Original signature : <code>PIX* pixReadStreamGif(FILE*)</code>
     */
    public static native Pix pixReadStreamGif(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemGif(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemGif(ByteBuffer cdata, NativeSize size);

    /**
     * Original signature : <code>l_ok pixWriteStreamGif(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamGif(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemGif(l_uint8**, size_t*, PIX*)</code>
     */
    public static native int pixWriteMemGif(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

    /**
     * Original signature :
     * <code>GPLOT* gplotCreate(const char*, l_int32, const char*, const char*, const char*)</code>
     */
    public static native GPlot gplotCreate(String rootname, int outformat, String title, String xlabel, String ylabel);

    /**
     * Original signature : <code>void gplotDestroy(GPLOT**)</code>
     */
    public static native void gplotDestroy(PointerByReference pgplot);

    /**
     * Original signature :
     * <code>l_ok gplotAddPlot(GPLOT*, NUMA*, NUMA*, l_int32, const char*)</code>
     */
    public static native int gplotAddPlot(GPlot gplot, Numa nax, Numa nay, int plotstyle, String plotlabel);

    /**
     * Original signature : <code>l_ok gplotSetScaling(GPLOT*, l_int32)</code>
     */
    public static native int gplotSetScaling(GPlot gplot, int scaling);

    /**
     * Original signature : <code>PIX* gplotMakeOutputPix(GPLOT*)</code>
     */
    public static native Pix gplotMakeOutputPix(GPlot gplot);

    /**
     * Original signature : <code>l_ok gplotMakeOutput(GPLOT*)</code>
     */
    public static native int gplotMakeOutput(GPlot gplot);

    /**
     * Original signature : <code>l_ok gplotGenCommandFile(GPLOT*)</code>
     */
    public static native int gplotGenCommandFile(GPlot gplot);

    /**
     * Original signature : <code>l_ok gplotGenDataFiles(GPLOT*)</code>
     */
    public static native int gplotGenDataFiles(GPlot gplot);

    /**
     * Original signature :
     * <code>l_ok gplotSimple1(NUMA*, l_int32, const char*, const char*)</code>
     */
    public static native int gplotSimple1(Numa na, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>l_ok gplotSimple2(NUMA*, NUMA*, l_int32, const char*, const char*)</code>
     */
    public static native int gplotSimple2(Numa na1, Numa na2, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>l_ok gplotSimpleN(NUMAA*, l_int32, const char*, const char*)</code>
     */
    public static native int gplotSimpleN(Numaa naa, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>PIX* gplotSimplePix1(NUMA*, const char*)</code>
     */
    public static native Pix gplotSimplePix1(Numa na, String title);

    /**
     * Original signature :
     * <code>PIX* gplotSimplePix2(NUMA*, NUMA*, const char*)</code>
     */
    public static native Pix gplotSimplePix2(Numa na1, Numa na2, String title);

    /**
     * Original signature :
     * <code>PIX* gplotSimplePixN(NUMAA*, const char*)</code>
     */
    public static native Pix gplotSimplePixN(Numaa naa, String title);

    /**
     * Original signature :
     * <code>GPLOT* gplotSimpleXY1(NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native GPlot gplotSimpleXY1(Numa nax, Numa nay, int plotstyle, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>GPLOT* gplotSimpleXY2(NUMA*, NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native GPlot gplotSimpleXY2(Numa nax, Numa nay1, Numa nay2, int plotstyle, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>GPLOT* gplotSimpleXYN(NUMA*, NUMAA*, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native GPlot gplotSimpleXYN(Numa nax, Numaa naay, int plotstyle, int outformat, String outroot, String title);

    /**
     * Original signature :
     * <code>PIX* gplotGeneralPix1(NUMA*, l_int32, const char*, const char*, const char*, const char*)</code>
     */
    public static native Pix gplotGeneralPix1(Numa na, int plotstyle, String rootname, String title, String xlabel, String ylabel);

    /**
     * Original signature :
     * <code>PIX* gplotGeneralPix2(NUMA*, NUMA*, l_int32, const char*, const char*, const char*, const char*)</code>
     */
    public static native Pix gplotGeneralPix2(Numa na1, Numa na2, int plotstyle, String rootname, String title, String xlabel, String ylabel);

    /**
     * Original signature :
     * <code>PIX* gplotGeneralPixN(NUMA*, NUMAA*, l_int32, const char*, const char*, const char*, const char*)</code>
     */
    public static native Pix gplotGeneralPixN(Numa nax, Numaa naay, int plotstyle, String rootname, String title, String xlabel, String ylabel);

    /**
     * Original signature : <code>GPLOT* gplotRead(const char*)</code>
     */
    public static native GPlot gplotRead(String filename);

    /**
     * Original signature : <code>l_ok gplotWrite(const char*, GPLOT*)</code>
     */
    public static native int gplotWrite(String filename, GPlot gplot);

    /**
     * Original signature :
     * <code>PTA* generatePtaLine(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaLine(int x1, int y1, int x2, int y2);

    /**
     * Original signature :
     * <code>PTA* generatePtaWideLine(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaWideLine(int x1, int y1, int x2, int y2, int width);

    /**
     * Original signature : <code>PTA* generatePtaBox(BOX*, l_int32)</code>
     */
    public static native Pta generatePtaBox(Box box, int width);

    /**
     * Original signature :
     * <code>PTA* generatePtaBoxa(BOXA*, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaBoxa(Boxa boxa, int width, int removedups);

    /**
     * Original signature :
     * <code>PTA* generatePtaHashBox(BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaHashBox(Box box, int spacing, int width, int orient, int outline);

    /**
     * Original signature :
     * <code>PTA* generatePtaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline, int removedups);

    /**
     * Original signature : <code>PTAA* generatePtaaBoxa(BOXA*)</code>
     */
    public static native Ptaa generatePtaaBoxa(Boxa boxa);

    /**
     * Original signature :
     * <code>PTAA* generatePtaaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Ptaa generatePtaaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline);

    /**
     * Original signature :
     * <code>PTA* generatePtaPolyline(PTA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaPolyline(Pta ptas, int width, int closeflag, int removedups);

    /**
     * Original signature :
     * <code>PTA* generatePtaGrid(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta generatePtaGrid(int w, int h, int nx, int ny, int width);

    /**
     * Original signature : <code>PTA* convertPtaLineTo4cc(PTA*)</code>
     */
    public static native Pta convertPtaLineTo4cc(Pta ptas);

    /**
     * Original signature : <code>PTA* generatePtaFilledCircle(l_int32)</code>
     */
    public static native Pta generatePtaFilledCircle(int radius);

    /**
     * Original signature : <code>PTA* generatePtaFilledSquare(l_int32)</code>
     */
    public static native Pta generatePtaFilledSquare(int side);

    /**
     * Original signature :
     * <code>PTA* generatePtaLineFromPt(l_int32, l_int32, l_float64, l_float64)</code>
     */
    public static native Pta generatePtaLineFromPt(int x, int y, double length, double radang);

    /**
     * Original signature :
     * <code>l_ok locatePtRadially(l_int32, l_int32, l_float64, l_float64, l_float64*, l_float64*)</code>
     */
    public static native int locatePtRadially(int xr, int yr, double dist, double radang, DoubleBuffer px, DoubleBuffer py);

    /**
     * Original signature :
     * <code>l_ok pixRenderPlotFromNuma(PIX**, NUMA*, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native int pixRenderPlotFromNuma(PointerByReference ppix, Numa na, int plotloc, int linewidth, int max, int color);

    /**
     * Original signature :
     * <code>PTA* makePlotPtaFromNuma(NUMA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta makePlotPtaFromNuma(Numa na, int size, int plotloc, int linewidth, int max);

    /**
     * Original signature :
     * <code>l_ok pixRenderPlotFromNumaGen(PIX**, NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native int pixRenderPlotFromNumaGen(PointerByReference ppix, Numa na, int orient, int linewidth, int refpos, int max, int drawref, int color);

    /**
     * Original signature :
     * <code>PTA* makePlotPtaFromNumaGen(NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta makePlotPtaFromNumaGen(Numa na, int orient, int linewidth, int refpos, int max, int drawref);

    /**
     * Original signature : <code>l_ok pixRenderPta(PIX*, PTA*, l_int32)</code>
     */
    public static native int pixRenderPta(Pix pix, Pta pta, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderPtaArb(PIX*, PTA*, l_uint8, l_uint8, l_uint8)</code>
     */
    public static native int pixRenderPtaArb(Pix pix, Pta pta, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderPtaBlend(PIX*, PTA*, l_uint8, l_uint8, l_uint8, l_float32)</code>
     */
    public static native int pixRenderPtaBlend(Pix pix, Pta pta, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderLine(Pix pix, int x1, int y1, int x2, int y2, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderLineArb(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    public static native int pixRenderLineArb(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderLineBlend(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code>
     */
    public static native int pixRenderLineBlend(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderBox(PIX*, BOX*, l_int32, l_int32)</code>
     */
    public static native int pixRenderBox(Pix pix, Box box, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxArb(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    public static native int pixRenderBoxArb(Pix pix, Box box, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxBlend(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code>
     */
    public static native int pixRenderBoxBlend(Pix pix, Box box, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxa(PIX*, BOXA*, l_int32, l_int32)</code>
     */
    public static native int pixRenderBoxa(Pix pix, Boxa boxa, int width, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxaArb(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    public static native int pixRenderBoxaArb(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderBoxaBlend(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32)</code>
     */
    public static native int pixRenderBoxaBlend(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval, float fract, int removedups);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBox(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderHashBox(Pix pix, Box box, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxArb(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderHashBoxArb(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxBlend(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    public static native int pixRenderHashBoxBlend(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashMaskArb(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderHashMaskArb(Pix pix, Pix pixm, int x, int y, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxa(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderHashBoxa(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxaArb(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderHashBoxaArb(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixRenderHashBoxaBlend(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    public static native int pixRenderHashBoxaBlend(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolyline(PIX*, PTA*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRenderPolyline(Pix pix, Pta ptas, int width, int op, int closeflag);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolylineArb(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_int32)</code>
     */
    public static native int pixRenderPolylineArb(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, int closeflag);

    /**
     * Original signature :
     * <code>l_ok pixRenderPolylineBlend(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32, l_int32)</code>
     */
    public static native int pixRenderPolylineBlend(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, float fract, int closeflag, int removedups);

    /**
     * Original signature :
     * <code>l_ok pixRenderGridArb(PIX*, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code>
     */
    public static native int pixRenderGridArb(Pix pix, int nx, int ny, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>PIX* pixRenderRandomCmapPtaa(PIX*, PTAA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRenderRandomCmapPtaa(Pix pix, Ptaa ptaa, int polyflag, int width, int closeflag);

    /**
     * Original signature :
     * <code>PIX* pixRenderPolygon(PTA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native Pix pixRenderPolygon(Pta ptas, int width, IntBuffer pxmin, IntBuffer pymin);

    /**
     * Original signature :
     * <code>PIX* pixFillPolygon(PIX*, PTA*, l_int32, l_int32)</code>
     */
    public static native Pix pixFillPolygon(Pix pixs, Pta pta, int xmin, int ymin);

    /**
     * Original signature :
     * <code>PIX* pixRenderContours(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRenderContours(Pix pixs, int startval, int incr, int outdepth);

    /**
     * Original signature :
     * <code>PIX* fpixAutoRenderContours(FPIX*, l_int32)</code>
     */
    public static native Pix fpixAutoRenderContours(FPix fpix, int ncontours);

    /**
     * Original signature :
     * <code>PIX* fpixRenderContours(FPIX*, l_float32, l_float32)</code>
     */
    public static native Pix fpixRenderContours(FPix fpixs, float incr, float proxim);

    /**
     * Original signature :
     * <code>PTA* pixGeneratePtaBoundary(PIX*, l_int32)</code>
     */
    public static native Pta pixGeneratePtaBoundary(Pix pixs, int width);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray3(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray3(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray3(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray3(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature : <code>PIX* pixDitherToBinary(PIX*)</code>
     */
    public static native Pix pixDitherToBinary(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixDitherToBinarySpec(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDitherToBinarySpec(Pix pixs, int lowerclip, int upperclip);

    /**
     * Original signature :
     * <code>void ditherToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32, l_int32, l_int32)</code>
     */
    public static native void ditherToBinaryLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip, int lastlineflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToBinary(PIX*, l_int32)</code>
     */
    public static native Pix pixThresholdToBinary(Pix pixs, int thresh);

    /**
     * Original signature :
     * <code>void thresholdToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32)</code>
     */
    public static native void thresholdToBinaryLineLow(IntBuffer lined, int w, IntBuffer lines, int d, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixVarThresholdToBinary(PIX*, PIX*)</code>
     */
    public static native Pix pixVarThresholdToBinary(Pix pixs, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinary(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixAdaptThresholdToBinary(Pix pixs, Pix pixm, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinaryGen(PIX*, PIX*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAdaptThresholdToBinaryGen(Pix pixs, Pix pixm, float gamma, int blackval, int whiteval, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByValue(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixGenerateMaskByValue(Pix pixs, int val, int usecmap);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByBand(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixGenerateMaskByBand(Pix pixs, int lower, int upper, int inband, int usecmap);

    /**
     * Original signature : <code>PIX* pixDitherTo2bpp(PIX*, l_int32)</code>
     */
    public static native Pix pixDitherTo2bpp(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixDitherTo2bppSpec(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixDitherTo2bppSpec(Pix pixs, int lowerclip, int upperclip, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo2bpp(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixThresholdTo2bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo4bpp(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixThresholdTo4bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdOn8bpp(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixThresholdOn8bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdGrayArb(PIX*, const char*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixThresholdGrayArb(Pix pixs, String edgevals, int outdepth, int use_average, int setblack, int setwhite);

    /**
     * Original signature :
     * <code>l_int32* makeGrayQuantIndexTable(l_int32)</code>
     */
    public static native IntByReference makeGrayQuantIndexTable(int nlevels);

    /**
     * Original signature :
     * <code>l_ok makeGrayQuantTableArb(NUMA*, l_int32, l_int32**, PIXCMAP**)</code>
     */
    public static native int makeGrayQuantTableArb(Numa na, int outdepth, PointerByReference ptab, PointerByReference pcmap);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByBand32(PIX*, l_uint32, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Pix pixGenerateMaskByBand32(Pix pixs, int refval, int delm, int delp, float fractm, float fractp);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByDiscr32(PIX*, l_uint32, l_uint32, l_int32)</code>
     */
    public static native Pix pixGenerateMaskByDiscr32(Pix pixs, int refval1, int refval2, int distflag);

    /**
     * Original signature :
     * <code>PIX* pixGrayQuantFromHisto(PIX*, PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixGrayQuantFromHisto(Pix pixd, Pix pixs, Pix pixm, float minfract, int maxsize);

    /**
     * Original signature :
     * <code>PIX* pixGrayQuantFromCmap(PIX*, PIXCMAP*, l_int32)</code>
     */
    public static native Pix pixGrayQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth);

    /**
     * Original signature :
     * <code>L_HASHMAP* l_hmapCreate(l_int32, l_int32)</code>
     */
    public static native L_Hashmap l_hmapCreate(int ninit, int maxocc);

    /**
     * Original signature : <code>void l_hmapDestroy(L_HASHMAP**)</code>
     */
    public static native void l_hmapDestroy(PointerByReference phmap);

    /**
     * Original signature :
     * <code>L_HASHITEM* l_hmapLookup(L_HASHMAP*, l_uint64, l_uint64, l_int32)</code>
     */
    public static native L_Hashitem l_hmapLookup(L_Hashmap hmap, long key, long val, int op);

    /**
     * Original signature : <code>l_ok l_hmapRehash(L_HASHMAP*)</code>
     */
    public static native int l_hmapRehash(L_Hashmap hmap);

    /**
     * Original signature : <code>L_HEAP* lheapCreate(l_int32, l_int32)</code>
     */
    public static native L_Heap lheapCreate(int n, int direction);

    /**
     * Original signature : <code>void lheapDestroy(L_HEAP**, l_int32)</code>
     */
    public static native void lheapDestroy(PointerByReference plh, int freeflag);

    /**
     * Original signature : <code>l_ok lheapAdd(L_HEAP*, void*)</code>
     */
    public static native int lheapAdd(L_Heap lh, Pointer item);

    /**
     * Original signature : <code>void* lheapRemove(L_HEAP*)</code>
     */
    public static native Pointer lheapRemove(L_Heap lh);

    /**
     * Original signature : <code>l_int32 lheapGetCount(L_HEAP*)</code>
     */
    public static native int lheapGetCount(L_Heap lh);

    /**
     * Original signature : <code>void* lheapGetElement(L_HEAP*, l_int32)</code>
     */
    public static native Pointer lheapGetElement(L_Heap lh, int index);

    /**
     * Original signature : <code>l_ok lheapSort(L_HEAP*)</code>
     */
    public static native int lheapSort(L_Heap lh);

    /**
     * Original signature : <code>l_ok lheapSortStrictOrder(L_HEAP*)</code>
     */
    public static native int lheapSortStrictOrder(L_Heap lh);

    /**
     * Original signature : <code>l_ok lheapPrint(FILE*, L_HEAP*)</code>
     */
    public static native int lheapPrint(FILE fp, L_Heap lh);

    /**
     * Original signature :
     * <code>JBCLASSER* jbRankHausInit(l_int32, l_int32, l_int32, l_int32, l_float32)</code>
     */
    public static native JbClasser jbRankHausInit(int components, int maxwidth, int maxheight, int size, float rank);

    /**
     * Original signature :
     * <code>JBCLASSER* jbCorrelationInit(l_int32, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native JbClasser jbCorrelationInit(int components, int maxwidth, int maxheight, float thresh, float weightfactor);

    /**
     * Original signature :
     * <code>JBCLASSER* jbCorrelationInitWithoutComponents(l_int32, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native JbClasser jbCorrelationInitWithoutComponents(int components, int maxwidth, int maxheight, float thresh, float weightfactor);

    /**
     * Original signature : <code>l_ok jbAddPages(JBCLASSER*, SARRAY*)</code>
     */
    public static native int jbAddPages(JbClasser classer, Sarray safiles);

    /**
     * Original signature : <code>l_ok jbAddPage(JBCLASSER*, PIX*)</code>
     */
    public static native int jbAddPage(JbClasser classer, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok jbAddPageComponents(JBCLASSER*, PIX*, BOXA*, PIXA*)</code>
     */
    public static native int jbAddPageComponents(JbClasser classer, Pix pixs, Boxa boxas, Pixa pixas);

    /**
     * Original signature :
     * <code>l_ok jbClassifyRankHaus(JBCLASSER*, BOXA*, PIXA*)</code>
     */
    public static native int jbClassifyRankHaus(JbClasser classer, Boxa boxa, Pixa pixas);

    /**
     * Original signature :
     * <code>l_int32 pixHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native int pixHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh);

    /**
     * Original signature :
     * <code>l_int32 pixRankHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code>
     */
    public static native int pixRankHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh, int area1, int area3, float rank, IntBuffer tab8);

    /**
     * Original signature :
     * <code>l_ok jbClassifyCorrelation(JBCLASSER*, BOXA*, PIXA*)</code>
     */
    public static native int jbClassifyCorrelation(JbClasser classer, Boxa boxa, Pixa pixas);

    /**
     * Original signature :
     * <code>l_ok jbGetComponents(PIX*, l_int32, l_int32, l_int32, BOXA**, PIXA**)</code>
     */
    public static native int jbGetComponents(Pix pixs, int components, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad);

    /**
     * Original signature :
     * <code>l_ok pixWordMaskByDilation(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native int pixWordMaskByDilation(Pix pixs, PointerByReference ppixm, IntBuffer psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordMaskByDilation(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native int pixWordMaskByDilation(Pix pixs, PointerByReference ppixm, IntByReference psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*, PIXA*)</code>
     */
    public static native int pixWordBoxesByDilation(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntBuffer psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*, PIXA*)</code>
     */
    public static native int pixWordBoxesByDilation(Pix pixs, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntByReference psize, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIXA* jbAccumulateComposites(PIXAA*, NUMA**, PTA**)</code>
     */
    public static native Pixa jbAccumulateComposites(Pixaa pixaa, PointerByReference pna, PointerByReference pptat);

    /**
     * Original signature :
     * <code>PIXA* jbTemplatesFromComposites(PIXA*, NUMA*)</code>
     */
    public static native Pixa jbTemplatesFromComposites(Pixa pixac, Numa na);

    /**
     * Original signature :
     * <code>JBCLASSER* jbClasserCreate(l_int32, l_int32)</code>
     */
    public static native JbClasser jbClasserCreate(int method, int components);

    /**
     * Original signature : <code>void jbClasserDestroy(JBCLASSER**)</code>
     */
    public static native void jbClasserDestroy(PointerByReference pclasser);

    /**
     * Original signature : <code>JBDATA* jbDataSave(JBCLASSER*)</code>
     */
    public static native JbData jbDataSave(JbClasser classer);

    /**
     * Original signature : <code>void jbDataDestroy(JBDATA**)</code>
     */
    public static native void jbDataDestroy(PointerByReference pdata);

    /**
     * Original signature : <code>l_ok jbDataWrite(const char*, JBDATA*)</code>
     */
    public static native int jbDataWrite(String rootout, JbData jbdata);

    /**
     * Original signature : <code>JBDATA* jbDataRead(const char*)</code>
     */
    public static native JbData jbDataRead(String rootname);

    /**
     * Original signature : <code>PIXA* jbDataRender(JBDATA*, l_int32)</code>
     */
    public static native Pixa jbDataRender(JbData data, int debugflag);

    /**
     * Original signature :
     * <code>l_ok jbGetULCorners(JBCLASSER*, PIX*, BOXA*)</code>
     */
    public static native int jbGetULCorners(JbClasser classer, Pix pixs, Boxa boxa);

    /**
     * Original signature : <code>l_ok jbGetLLCorners(JBCLASSER*)</code>
     */
    public static native int jbGetLLCorners(JbClasser classer);

    /**
     * Original signature :
     * <code>l_ok readHeaderJp2k(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderJp2k(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pcodec);

    /**
     * Original signature :
     * <code>l_ok freadHeaderJp2k(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderJp2k(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pcodec);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemJp2k(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemJp2k(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pcodec);

    /**
     * Original signature :
     * <code>l_int32 fgetJp2kResolution(FILE*, l_int32*, l_int32*)</code>
     */
    public static native int fgetJp2kResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok readResolutionMemJp2k(const l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    public static native int readResolutionMemJp2k(ByteBuffer data, NativeSize nbytes, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>PIX* pixReadJp2k(const char*, l_uint32, BOX*, l_int32, l_int32)</code>
     */
    public static native Pix pixReadJp2k(String filename, int reduction, Box box, int hint, int debug);

    /**
     * Original signature :
     * <code>PIX* pixReadStreamJp2k(FILE*, l_uint32, BOX*, l_int32, l_int32)</code>
     */
    public static native Pix pixReadStreamJp2k(FILE fp, int reduction, Box box, int hint, int debug);

    /**
     * Original signature :
     * <code>l_ok pixWriteJp2k(const char*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint, int debug);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamJp2k(FILE*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixWriteStreamJp2k(FILE fp, Pix pix, int quality, int nlevels, int codec, int hint, int debug);

    /**
     * Original signature :
     * <code>PIX* pixReadMemJp2k(const l_uint8*, size_t, l_uint32, BOX*, l_int32, l_int32)</code>
     */
    public static native Pix pixReadMemJp2k(ByteBuffer data, NativeSize size, int reduction, Box box, int hint, int debug);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemJp2k(l_uint8**, size_t*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixWriteMemJp2k(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int nlevels, int hint, int debug);

    /**
     * Original signature :
     * <code>PIX* pixReadJpeg(const char*, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    public static native Pix pixReadJpeg(String filename, int cmapflag, int reduction, IntBuffer pnwarn, int hint);

    /**
     * Original signature :
     * <code>PIX* pixReadStreamJpeg(FILE*, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    public static native Pix pixReadStreamJpeg(FILE fp, int cmapflag, int reduction, IntBuffer pnwarn, int hint);

    /**
     * Original signature :
     * <code>l_ok readHeaderJpeg(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderJpeg(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

    /**
     * Original signature :
     * <code>l_ok freadHeaderJpeg(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderJpeg(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

    /**
     * Original signature :
     * <code>l_int32 fgetJpegResolution(FILE*, l_int32*, l_int32*)</code>
     */
    public static native int fgetJpegResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_int32 fgetJpegComment(FILE*, l_uint8**)</code>
     */
    public static native int fgetJpegComment(FILE fp, PointerByReference pcomment);

    /**
     * Original signature :
     * <code>l_ok pixWriteJpeg(const char*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteJpeg(String filename, Pix pix, int quality, int progressive);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamJpeg(FILE*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteStreamJpeg(FILE fp, Pix pixs, int quality, int progressive);

    /**
     * Original signature :
     * <code>PIX* pixReadMemJpeg(const l_uint8*, size_t, l_int32, l_int32, l_int32*, l_int32)</code>
     */
    public static native Pix pixReadMemJpeg(ByteBuffer data, NativeSize size, int cmflag, int reduction, IntBuffer pnwarn, int hint);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemJpeg(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

    /**
     * Original signature :
     * <code>l_ok readResolutionMemJpeg(const l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    public static native int readResolutionMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemJpeg(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteMemJpeg(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int progressive);

    /**
     * Original signature :
     * <code>l_ok pixSetChromaSampling(PIX*, l_int32)</code>
     */
    public static native int pixSetChromaSampling(Pix pix, int sampling);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreate(l_int32, l_int32)</code>
     */
    public static native L_Kernel kernelCreate(int height, int width);

    /**
     * Original signature : <code>void kernelDestroy(L_KERNEL**)</code>
     */
    public static native void kernelDestroy(PointerByReference pkel);

    /**
     * Original signature : <code>L_KERNEL* kernelCopy(L_KERNEL*)</code>
     */
    public static native L_Kernel kernelCopy(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_ok kernelGetElement(L_KERNEL*, l_int32, l_int32, l_float32*)</code>
     */
    public static native int kernelGetElement(L_Kernel kel, int row, int col, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok kernelSetElement(L_KERNEL*, l_int32, l_int32, l_float32)</code>
     */
    public static native int kernelSetElement(L_Kernel kel, int row, int col, float val);

    /**
     * Original signature :
     * <code>l_ok kernelGetParameters(L_KERNEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int kernelGetParameters(L_Kernel kel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);

    /**
     * Original signature :
     * <code>l_ok kernelSetOrigin(L_KERNEL*, l_int32, l_int32)</code>
     */
    public static native int kernelSetOrigin(L_Kernel kel, int cy, int cx);

    /**
     * Original signature :
     * <code>l_ok kernelGetSum(L_KERNEL*, l_float32*)</code>
     */
    public static native int kernelGetSum(L_Kernel kel, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok kernelGetMinMax(L_KERNEL*, l_float32*, l_float32*)</code>
     */
    public static native int kernelGetMinMax(L_Kernel kel, FloatBuffer pmin, FloatBuffer pmax);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelNormalize(L_KERNEL*, l_float32)</code>
     */
    public static native L_Kernel kernelNormalize(L_Kernel kels, float normsum);

    /**
     * Original signature : <code>L_KERNEL* kernelInvert(L_KERNEL*)</code>
     */
    public static native L_Kernel kernelInvert(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_float32** create2dFloatArray(l_int32, l_int32)</code>
     */
    public static native PointerByReference create2dFloatArray(int sy, int sx);

    /**
     * Original signature : <code>L_KERNEL* kernelRead(const char*)</code>
     */
    public static native L_Kernel kernelRead(String fname);

    /**
     * Original signature : <code>L_KERNEL* kernelReadStream(FILE*)</code>
     */
    public static native L_Kernel kernelReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_ok kernelWrite(const char*, L_KERNEL*)</code>
     */
    public static native int kernelWrite(String fname, L_Kernel kel);

    /**
     * Original signature :
     * <code>l_ok kernelWriteStream(FILE*, L_KERNEL*)</code>
     */
    public static native int kernelWriteStream(FILE fp, L_Kernel kel);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromString(l_int32, l_int32, l_int32, l_int32, const char*)</code>
     */
    public static native L_Kernel kernelCreateFromString(int h, int w, int cy, int cx, String kdata);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromFile(const char*)</code>
     */
    public static native L_Kernel kernelCreateFromFile(String filename);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromPix(PIX*, l_int32, l_int32)</code>
     */
    public static native L_Kernel kernelCreateFromPix(Pix pix, int cy, int cx);

    /**
     * Original signature :
     * <code>PIX* kernelDisplayInPix(L_KERNEL*, l_int32, l_int32)</code>
     */
    public static native Pix kernelDisplayInPix(L_Kernel kel, int size, int gthick);

    /**
     * Original signature :
     * <code>NUMA* parseStringForNumbers(const char*, const char*)</code>
     */
    public static native Numa parseStringForNumbers(String str, String seps);

    /**
     * Original signature :
     * <code>L_KERNEL* makeFlatKernel(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Kernel makeFlatKernel(int height, int width, int cy, int cx);

    /**
     * Original signature :
     * <code>L_KERNEL* makeGaussianKernel(l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native L_Kernel makeGaussianKernel(int halfh, int halfw, float stdev, float max);

    /**
     * Original signature :
     * <code>l_ok makeGaussianKernelSep(l_int32, l_int32, l_float32, l_float32, L_KERNEL**, L_KERNEL**)</code>
     */
    public static native int makeGaussianKernelSep(int halfh, int halfw, float stdev, float max, PointerByReference pkelx, PointerByReference pkely);

    /**
     * Original signature :
     * <code>L_KERNEL* makeDoGKernel(l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native L_Kernel makeDoGKernel(int halfh, int halfw, float stdev, float ratio);

    /**
     * Original signature : <code>char* getImagelibVersions()</code>
     */
    public static native Pointer getImagelibVersions();

    /**
     * Original signature : <code>void listDestroy(DLLIST**)</code>
     */
    public static native void listDestroy(PointerByReference phead);

    /**
     * Original signature : <code>l_ok listAddToHead(DLLIST**, void*)</code>
     */
    public static native int listAddToHead(PointerByReference phead, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listAddToTail(DLLIST**, DLLIST**, void*)</code>
     */
    public static native int listAddToTail(PointerByReference phead, PointerByReference ptail, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listInsertBefore(DLLIST**, DLLIST*, void*)</code>
     */
    public static native int listInsertBefore(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>l_ok listInsertAfter(DLLIST**, DLLIST*, void*)</code>
     */
    public static native int listInsertAfter(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>void* listRemoveElement(DLLIST**, DLLIST*)</code>
     */
    public static native Pointer listRemoveElement(PointerByReference phead, DoubleLinkedList elem);

    /**
     * Original signature : <code>void* listRemoveFromHead(DLLIST**)</code>
     */
    public static native Pointer listRemoveFromHead(PointerByReference phead);

    /**
     * Original signature :
     * <code>void* listRemoveFromTail(DLLIST**, DLLIST**)</code>
     */
    public static native Pointer listRemoveFromTail(PointerByReference phead, PointerByReference ptail);

    /**
     * Original signature : <code>DLLIST* listFindElement(DLLIST*, void*)</code>
     */
    public static native DoubleLinkedList listFindElement(DoubleLinkedList head, Pointer data);

    /**
     * Original signature : <code>DLLIST* listFindTail(DLLIST*)</code>
     */
    public static native DoubleLinkedList listFindTail(DoubleLinkedList head);

    /**
     * Original signature : <code>l_int32 listGetCount(DLLIST*)</code>
     */
    public static native int listGetCount(DoubleLinkedList head);

    /**
     * Original signature : <code>l_ok listReverse(DLLIST**)</code>
     */
    public static native int listReverse(PointerByReference phead);

    /**
     * Original signature : <code>l_ok listJoin(DLLIST**, DLLIST**)</code>
     */
    public static native int listJoin(PointerByReference phead1, PointerByReference phead2);

    /**
     * Original signature : <code>L_AMAP* l_amapCreate(l_int32)</code>
     */
    public static native L_Rbtree l_amapCreate(int keytype);

    /**
     * Original signature : <code>RB_TYPE* l_amapFind(L_AMAP*, RB_TYPE)</code>
     */
    public static native Rb_Type l_amapFind(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature :
     * <code>void l_amapInsert(L_AMAP*, RB_TYPE, RB_TYPE)</code>
     */
    public static native void l_amapInsert(L_Rbtree m, Rb_Type.ByValue key, Rb_Type.ByValue value);

    /**
     * Original signature : <code>void l_amapDelete(L_AMAP*, RB_TYPE)</code>
     */
    public static native void l_amapDelete(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_amapDestroy(L_AMAP**)</code>
     */
    public static native void l_amapDestroy(PointerByReference pm);

    /**
     * Original signature : <code>L_AMAP_NODE* l_amapGetFirst(L_AMAP*)</code>
     */
    public static native L_Rbtree_Node l_amapGetFirst(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetNext(L_AMAP_NODE*)</code>
     */
    public static native L_Rbtree_Node l_amapGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_AMAP_NODE* l_amapGetLast(L_AMAP*)</code>
     */
    public static native L_Rbtree_Node l_amapGetLast(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetPrev(L_AMAP_NODE*)</code>
     */
    public static native L_Rbtree_Node l_amapGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_amapSize(L_AMAP*)</code>
     */
    public static native int l_amapSize(L_Rbtree m);

    /**
     * Original signature : <code>L_ASET* l_asetCreate(l_int32)</code>
     */
    public static native L_Rbtree l_asetCreate(int keytype);

    /**
     * Original signature : <code>RB_TYPE* l_asetFind(L_ASET*, RB_TYPE)</code>
     */
    public static native Rb_Type l_asetFind(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetInsert(L_ASET*, RB_TYPE)</code>
     */
    public static native void l_asetInsert(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDelete(L_ASET*, RB_TYPE)</code>
     */
    public static native void l_asetDelete(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDestroy(L_ASET**)</code>
     */
    public static native void l_asetDestroy(PointerByReference ps);

    /**
     * Original signature : <code>L_ASET_NODE* l_asetGetFirst(L_ASET*)</code>
     */
    public static native L_Rbtree_Node l_asetGetFirst(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetNext(L_ASET_NODE*)</code>
     */
    public static native L_Rbtree_Node l_asetGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_ASET_NODE* l_asetGetLast(L_ASET*)</code>
     */
    public static native L_Rbtree_Node l_asetGetLast(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetPrev(L_ASET_NODE*)</code>
     */
    public static native L_Rbtree_Node l_asetGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_asetSize(L_ASET*)</code>
     */
    public static native int l_asetSize(L_Rbtree s);

    /**
     * Original signature :
     * <code>PIX* generateBinaryMaze(l_int32, l_int32, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Pix generateBinaryMaze(int w, int h, int xi, int yi, float wallps, float ranis);

    /**
     * Original signature :
     * <code>PTA* pixSearchBinaryMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native Pta pixSearchBinaryMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PTA* pixSearchGrayMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native Pta pixSearchGrayMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixDilate(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixDilate(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixErode(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixErode(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixHMT(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixHMT(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixOpen(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixOpen(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixClose(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixClose(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixCloseSafe(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixCloseSafe(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixOpenGeneralized(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixOpenGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixCloseGeneralized(PIX*, PIX*, SEL*)</code>
     */
    public static native Pix pixCloseGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseSafeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_int32 selectComposableSels(l_int32, l_int32, SEL**, SEL**)</code>
     */
    public static native int selectComposableSels(int size, int direction, PointerByReference psel1, PointerByReference psel2);

    /**
     * Original signature :
     * <code>l_ok selectComposableSizes(l_int32, l_int32*, l_int32*)</code>
     */
    public static native int selectComposableSizes(int size, IntBuffer pfactor1, IntBuffer pfactor2);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeCompBrick(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseSafeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>void resetMorphBoundaryCondition(l_int32)</code>
     */
    public static native void resetMorphBoundaryCondition(int bc);

    /**
     * Original signature :
     * <code>l_uint32 getMorphBorderPixelColor(l_int32, l_int32)</code>
     */
    public static native int getMorphBorderPixelColor(int type, int depth);

    /**
     * Original signature : <code>PIX* pixExtractBoundary(PIX*, l_int32)</code>
     */
    public static native Pix pixExtractBoundary(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceMasked(PIX*, PIX*, const char*, l_int32)</code>
     */
    public static native Pix pixMorphSequenceMasked(Pix pixs, Pix pixm, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    public static native Pix pixMorphSequenceByComponent(Pix pixs, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    public static native Pix pixMorphSequenceByComponent(Pix pixs, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByComponent(PIXA*, const char*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaMorphSequenceByComponent(Pixa pixas, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    public static native Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    public static native Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByRegion(PIX*, PIXA*, const char*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaMorphSequenceByRegion(Pix pixs, Pixa pixam, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixUnionOfMorphOps(PIX*, SELA*, l_int32)</code>
     */
    public static native Pix pixUnionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixIntersectionOfMorphOps(PIX*, SELA*, l_int32)</code>
     */
    public static native Pix pixIntersectionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixSelectiveConnCompFill(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixSelectiveConnCompFill(Pix pixs, int connectivity, int minw, int minh);

    /**
     * Original signature :
     * <code>l_ok pixRemoveMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRemoveMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int dsize);

    /**
     * Original signature :
     * <code>PIX* pixDisplayMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_uint32, l_float32, l_int32)</code>
     */
    public static native Pix pixDisplayMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int color, float scale, int nlevels);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByMorph(PIXA*, l_int32, l_int32, SEL*, l_int32)</code>
     */
    public static native Pixa pixaExtendByMorph(Pixa pixas, int type, int niters, Pointer sel, int include);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByScaling(PIXA*, NUMA*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaExtendByScaling(Pixa pixas, Numa nasc, int type, int include);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillMorph(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixSeedfillMorph(Pix pixs, Pix pixm, int maxiters, int connectivity);

    /**
     * Original signature :
     * <code>NUMA* pixRunHistogramMorph(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixRunHistogramMorph(Pix pixs, int runtype, int direction, int maxsize);

    /**
     * Original signature :
     * <code>PIX* pixTophat(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixTophat(Pix pixs, int hsize, int vsize, int type);

    /**
     * Original signature : <code>PIX* pixHDome(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixHDome(Pix pixs, int height, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixFastTophat(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixFastTophat(Pix pixs, int xsize, int ysize, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphGradient(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixMorphGradient(Pix pixs, int hsize, int vsize, int smoothing);

    /**
     * Original signature : <code>PTA* pixaCentroids(PIXA*)</code>
     */
    public static native Pta pixaCentroids(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixCentroid(PIX*, l_int32*, l_int32*, l_float32*, l_float32*)</code>
     */
    public static native int pixCentroid(Pix pix, IntBuffer centtab, IntBuffer sumtab, FloatBuffer pxave, FloatBuffer pyave);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDilateCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixErodeCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixOpenCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCloseCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_ok getExtendedCompositeParameters(l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int getExtendedCompositeParameters(int size, IntBuffer pn, IntBuffer pextra, IntBuffer pactualsize);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequence(PIX*, const char*, l_int32)</code>
     */
    public static native Pix pixMorphSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequence(PIX*, const char*, l_int32)</code>
     */
    public static native Pix pixMorphCompSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceDwa(PIX*, const char*, l_int32)</code>
     */
    public static native Pix pixMorphSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequenceDwa(PIX*, const char*, l_int32)</code>
     */
    public static native Pix pixMorphCompSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature : <code>l_int32 morphSequenceVerify(SARRAY*)</code>
     */
    public static native int morphSequenceVerify(Sarray sa);

    /**
     * Original signature :
     * <code>PIX* pixGrayMorphSequence(PIX*, const char*, l_int32, l_int32)</code>
     */
    public static native Pix pixGrayMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);

    /**
     * Original signature :
     * <code>PIX* pixColorMorphSequence(PIX*, const char*, l_int32, l_int32)</code>
     */
    public static native Pix pixColorMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);

    /**
     * Original signature : <code>NUMA* numaCreate(l_int32)</code>
     */
    public static native Numa numaCreate(int n);

    /**
     * Original signature :
     * <code>NUMA* numaCreateFromIArray(l_int32*, l_int32)</code>
     */
    public static native Numa numaCreateFromIArray(IntBuffer iarray, int size);

    /**
     * Original signature :
     * <code>NUMA* numaCreateFromFArray(l_float32*, l_int32, l_int32)</code>
     */
    public static native Numa numaCreateFromFArray(FloatBuffer farray, int size, int copyflag);

    /**
     * Original signature : <code>NUMA* numaCreateFromString(const char*)</code>
     */
    public static native Numa numaCreateFromString(String str);

    /**
     * Original signature : <code>void numaDestroy(NUMA**)</code>
     */
    public static native void numaDestroy(PointerByReference pna);

    /**
     * Original signature : <code>NUMA* numaCopy(NUMA*)</code>
     */
    public static native Numa numaCopy(Numa na);

    /**
     * Original signature : <code>NUMA* numaClone(NUMA*)</code>
     */
    public static native Numa numaClone(Numa na);

    /**
     * Original signature : <code>l_ok numaEmpty(NUMA*)</code>
     */
    public static native int numaEmpty(Numa na);

    /**
     * Original signature : <code>l_ok numaAddNumber(NUMA*, l_float32)</code>
     */
    public static native int numaAddNumber(Numa na, float val);

    /**
     * Original signature :
     * <code>l_ok numaInsertNumber(NUMA*, l_int32, l_float32)</code>
     */
    public static native int numaInsertNumber(Numa na, int index, float val);

    /**
     * Original signature : <code>l_ok numaRemoveNumber(NUMA*, l_int32)</code>
     */
    public static native int numaRemoveNumber(Numa na, int index);

    /**
     * Original signature :
     * <code>l_ok numaReplaceNumber(NUMA*, l_int32, l_float32)</code>
     */
    public static native int numaReplaceNumber(Numa na, int index, float val);

    /**
     * Original signature : <code>l_int32 numaGetCount(NUMA*)</code>
     */
    public static native int numaGetCount(Numa na);

    /**
     * Original signature : <code>l_ok numaSetCount(NUMA*, l_int32)</code>
     */
    public static native int numaSetCount(Numa na, int newcount);

    /**
     * Original signature :
     * <code>l_ok numaGetFValue(NUMA*, l_int32, l_float32*)</code>
     */
    public static native int numaGetFValue(Numa na, int index, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok numaGetIValue(NUMA*, l_int32, l_int32*)</code>
     */
    public static native int numaGetIValue(Numa na, int index, IntBuffer pival);

    /**
     * Original signature :
     * <code>l_ok numaSetValue(NUMA*, l_int32, l_float32)</code>
     */
    public static native int numaSetValue(Numa na, int index, float val);

    /**
     * Original signature :
     * <code>l_ok numaShiftValue(NUMA*, l_int32, l_float32)</code>
     */
    public static native int numaShiftValue(Numa na, int index, float diff);

    /**
     * Original signature : <code>l_int32* numaGetIArray(NUMA*)</code>
     */
    public static native IntByReference numaGetIArray(Numa na);

    /**
     * Original signature :
     * <code>l_float32* numaGetFArray(NUMA*, l_int32)</code>
     */
    public static native FloatByReference numaGetFArray(Numa na, int copyflag);

    /**
     * Original signature :
     * <code>l_ok numaGetParameters(NUMA*, l_float32*, l_float32*)</code>
     */
    public static native int numaGetParameters(Numa na, FloatBuffer pstartx, FloatBuffer pdelx);

    /**
     * Original signature :
     * <code>l_ok numaSetParameters(NUMA*, l_float32, l_float32)</code>
     */
    public static native int numaSetParameters(Numa na, float startx, float delx);

    /**
     * Original signature : <code>l_ok numaCopyParameters(NUMA*, NUMA*)</code>
     */
    public static native int numaCopyParameters(Numa nad, Numa nas);

    /**
     * Original signature :
     * <code>SARRAY* numaConvertToSarray(NUMA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Sarray numaConvertToSarray(Numa na, int size1, int size2, int addzeros, int type);

    /**
     * Original signature : <code>NUMA* numaRead(const char*)</code>
     */
    public static native Numa numaRead(String filename);

    /**
     * Original signature : <code>NUMA* numaReadStream(FILE*)</code>
     */
    public static native Numa numaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>NUMA* numaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Numa numaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok numaWriteDebug(const char*, NUMA*)</code>
     */
    public static native int numaWriteDebug(String filename, Numa na);

    /**
     * Original signature : <code>l_ok numaWrite(const char*, NUMA*)</code>
     */
    public static native int numaWrite(String filename, Numa na);

    /**
     * Original signature : <code>l_ok numaWriteStream(FILE*, NUMA*)</code>
     */
    public static native int numaWriteStream(FILE fp, Numa na);

    /**
     * Original signature : <code>l_ok numaWriteStderr(NUMA*)</code>
     */
    public static native int numaWriteStderr(Numa na);

    /**
     * Original signature :
     * <code>l_ok numaWriteMem(l_uint8**, size_t*, NUMA*)</code>
     */
    public static native int numaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numa na);

    /**
     * Original signature : <code>NUMAA* numaaCreate(l_int32)</code>
     */
    public static native Numaa numaaCreate(int n);

    /**
     * Original signature :
     * <code>NUMAA* numaaCreateFull(l_int32, l_int32)</code>
     */
    public static native Numaa numaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_ok numaaTruncate(NUMAA*)</code>
     */
    public static native int numaaTruncate(Numaa naa);

    /**
     * Original signature : <code>void numaaDestroy(NUMAA**)</code>
     */
    public static native void numaaDestroy(PointerByReference pnaa);

    /**
     * Original signature :
     * <code>l_ok numaaAddNuma(NUMAA*, NUMA*, l_int32)</code>
     */
    public static native int numaaAddNuma(Numaa naa, Numa na, int copyflag);

    /**
     * Original signature : <code>l_int32 numaaGetCount(NUMAA*)</code>
     */
    public static native int numaaGetCount(Numaa naa);

    /**
     * Original signature :
     * <code>l_int32 numaaGetNumaCount(NUMAA*, l_int32)</code>
     */
    public static native int numaaGetNumaCount(Numaa naa, int index);

    /**
     * Original signature : <code>l_int32 numaaGetNumberCount(NUMAA*)</code>
     */
    public static native int numaaGetNumberCount(Numaa naa);

    /**
     * Original signature : <code>NUMA** numaaGetPtrArray(NUMAA*)</code>
     */
    public static native PointerByReference numaaGetPtrArray(Numaa naa);

    /**
     * Original signature :
     * <code>NUMA* numaaGetNuma(NUMAA*, l_int32, l_int32)</code>
     */
    public static native Numa numaaGetNuma(Numaa naa, int index, int accessflag);

    /**
     * Original signature :
     * <code>l_ok numaaReplaceNuma(NUMAA*, l_int32, NUMA*)</code>
     */
    public static native int numaaReplaceNuma(Numaa naa, int index, Numa na);

    /**
     * Original signature :
     * <code>l_ok numaaGetValue(NUMAA*, l_int32, l_int32, l_float32*, l_int32*)</code>
     */
    public static native int numaaGetValue(Numaa naa, int i, int j, FloatBuffer pfval, IntBuffer pival);

    /**
     * Original signature :
     * <code>l_ok numaaAddNumber(NUMAA*, l_int32, l_float32)</code>
     */
    public static native int numaaAddNumber(Numaa naa, int index, float val);

    /**
     * Original signature : <code>NUMAA* numaaRead(const char*)</code>
     */
    public static native Numaa numaaRead(String filename);

    /**
     * Original signature : <code>NUMAA* numaaReadStream(FILE*)</code>
     */
    public static native Numaa numaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>NUMAA* numaaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Numaa numaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok numaaWrite(const char*, NUMAA*)</code>
     */
    public static native int numaaWrite(String filename, Numaa naa);

    /**
     * Original signature : <code>l_ok numaaWriteStream(FILE*, NUMAA*)</code>
     */
    public static native int numaaWriteStream(FILE fp, Numaa naa);

    /**
     * Original signature :
     * <code>l_ok numaaWriteMem(l_uint8**, size_t*, NUMAA*)</code>
     */
    public static native int numaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numaa naa);

    /**
     * Original signature :
     * <code>NUMA* numaArithOp(NUMA*, NUMA*, NUMA*, l_int32)</code>
     */
    public static native Numa numaArithOp(Numa nad, Numa na1, Numa na2, int op);

    /**
     * Original signature :
     * <code>NUMA* numaLogicalOp(NUMA*, NUMA*, NUMA*, l_int32)</code>
     */
    public static native Numa numaLogicalOp(Numa nad, Numa na1, Numa na2, int op);

    /**
     * Original signature : <code>NUMA* numaInvert(NUMA*, NUMA*)</code>
     */
    public static native Numa numaInvert(Numa nad, Numa nas);

    /**
     * Original signature :
     * <code>l_int32 numaSimilar(NUMA*, NUMA*, l_float32, l_int32*)</code>
     */
    public static native int numaSimilar(Numa na1, Numa na2, float maxdiff, IntBuffer psimilar);

    /**
     * Original signature :
     * <code>l_ok numaAddToNumber(NUMA*, l_int32, l_float32)</code>
     */
    public static native int numaAddToNumber(Numa na, int index, float val);

    /**
     * Original signature :
     * <code>l_ok numaGetMin(NUMA*, l_float32*, l_int32*)</code>
     */
    public static native int numaGetMin(Numa na, FloatBuffer pminval, IntBuffer piminloc);

    /**
     * Original signature :
     * <code>l_ok numaGetMax(NUMA*, l_float32*, l_int32*)</code>
     */
    public static native int numaGetMax(Numa na, FloatBuffer pmaxval, IntBuffer pimaxloc);

    /**
     * Original signature : <code>l_ok numaGetSum(NUMA*, l_float32*)</code>
     */
    public static native int numaGetSum(Numa na, FloatBuffer psum);

    /**
     * Original signature : <code>NUMA* numaGetPartialSums(NUMA*)</code>
     */
    public static native Numa numaGetPartialSums(Numa na);

    /**
     * Original signature :
     * <code>l_ok numaGetSumOnInterval(NUMA*, l_int32, l_int32, l_float32*)</code>
     */
    public static native int numaGetSumOnInterval(Numa na, int first, int last, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok numaHasOnlyIntegers(NUMA*, l_int32*)</code>
     */
    public static native int numaHasOnlyIntegers(Numa na, IntBuffer pallints);

    /**
     * Original signature : <code>l_ok numaGetMean(NUMA*, l_float32*)</code>
     */
    public static native int numaGetMean(Numa na, FloatBuffer pave);

    /**
     * Original signature :
     * <code>l_ok numaGetMeanAbsval(NUMA*, l_float32*)</code>
     */
    public static native int numaGetMeanAbsval(Numa na, FloatBuffer paveabs);

    /**
     * Original signature : <code>NUMA* numaSubsample(NUMA*, l_int32)</code>
     */
    public static native Numa numaSubsample(Numa nas, int subfactor);

    /**
     * Original signature : <code>NUMA* numaMakeDelta(NUMA*)</code>
     */
    public static native Numa numaMakeDelta(Numa nas);

    /**
     * Original signature :
     * <code>NUMA* numaMakeSequence(l_float32, l_float32, l_int32)</code>
     */
    public static native Numa numaMakeSequence(float startval, float increment, int size);

    /**
     * Original signature :
     * <code>NUMA* numaMakeConstant(l_float32, l_int32)</code>
     */
    public static native Numa numaMakeConstant(float val, int size);

    /**
     * Original signature : <code>NUMA* numaMakeAbsval(NUMA*, NUMA*)</code>
     */
    public static native Numa numaMakeAbsval(Numa nad, Numa nas);

    /**
     * Original signature :
     * <code>NUMA* numaAddBorder(NUMA*, l_int32, l_int32, l_float32)</code>
     */
    public static native Numa numaAddBorder(Numa nas, int left, int right, float val);

    /**
     * Original signature :
     * <code>NUMA* numaAddSpecifiedBorder(NUMA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa numaAddSpecifiedBorder(Numa nas, int left, int right, int type);

    /**
     * Original signature :
     * <code>NUMA* numaRemoveBorder(NUMA*, l_int32, l_int32)</code>
     */
    public static native Numa numaRemoveBorder(Numa nas, int left, int right);

    /**
     * Original signature :
     * <code>l_ok numaCountNonzeroRuns(NUMA*, l_int32*)</code>
     */
    public static native int numaCountNonzeroRuns(Numa na, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_ok numaGetNonzeroRange(NUMA*, l_float32, l_int32*, l_int32*)</code>
     */
    public static native int numaGetNonzeroRange(Numa na, float eps, IntBuffer pfirst, IntBuffer plast);

    /**
     * Original signature :
     * <code>l_ok numaGetCountRelativeToZero(NUMA*, l_int32, l_int32*)</code>
     */
    public static native int numaGetCountRelativeToZero(Numa na, int type, IntBuffer pcount);

    /**
     * Original signature :
     * <code>NUMA* numaClipToInterval(NUMA*, l_int32, l_int32)</code>
     */
    public static native Numa numaClipToInterval(Numa nas, int first, int last);

    /**
     * Original signature :
     * <code>NUMA* numaMakeThresholdIndicator(NUMA*, l_float32, l_int32)</code>
     */
    public static native Numa numaMakeThresholdIndicator(Numa nas, float thresh, int type);

    /**
     * Original signature :
     * <code>NUMA* numaUniformSampling(NUMA*, l_int32)</code>
     */
    public static native Numa numaUniformSampling(Numa nas, int nsamp);

    /**
     * Original signature : <code>NUMA* numaReverse(NUMA*, NUMA*)</code>
     */
    public static native Numa numaReverse(Numa nad, Numa nas);

    /**
     * Original signature :
     * <code>NUMA* numaLowPassIntervals(NUMA*, l_float32, l_float32)</code>
     */
    public static native Numa numaLowPassIntervals(Numa nas, float thresh, float maxn);

    /**
     * Original signature :
     * <code>NUMA* numaThresholdEdges(NUMA*, l_float32, l_float32, l_float32)</code>
     */
    public static native Numa numaThresholdEdges(Numa nas, float thresh1, float thresh2, float maxn);

    /**
     * Original signature :
     * <code>l_int32 numaGetSpanValues(NUMA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int numaGetSpanValues(Numa na, int span, IntBuffer pstart, IntBuffer pend);

    /**
     * Original signature :
     * <code>l_int32 numaGetEdgeValues(NUMA*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int numaGetEdgeValues(Numa na, int edge, IntBuffer pstart, IntBuffer pend, IntBuffer psign);

    /**
     * Original signature :
     * <code>l_ok numaInterpolateEqxVal(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32*)</code>
     */
    public static native int numaInterpolateEqxVal(float startx, float deltax, Numa nay, int type, float xval, FloatBuffer pyval);

    /**
     * Original signature :
     * <code>l_ok numaInterpolateArbxVal(NUMA*, NUMA*, l_int32, l_float32, l_float32*)</code>
     */
    public static native int numaInterpolateArbxVal(Numa nax, Numa nay, int type, float xval, FloatBuffer pyval);

    /**
     * Original signature :
     * <code>l_ok numaInterpolateEqxInterval(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaInterpolateEqxInterval(float startx, float deltax, Numa nasy, int type, float x0, float x1, int npts, PointerByReference pnax, PointerByReference pnay);

    /**
     * Original signature :
     * <code>l_ok numaInterpolateArbxInterval(NUMA*, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaInterpolateArbxInterval(Numa nax, Numa nay, int type, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);

    /**
     * Original signature :
     * <code>l_ok numaFitMax(NUMA*, l_float32*, NUMA*, l_float32*)</code>
     */
    public static native int numaFitMax(Numa na, FloatBuffer pmaxval, Numa naloc, FloatBuffer pmaxloc);

    /**
     * Original signature :
     * <code>l_ok numaDifferentiateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaDifferentiateInterval(Numa nax, Numa nay, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);

    /**
     * Original signature :
     * <code>l_ok numaIntegrateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, l_float32*)</code>
     */
    public static native int numaIntegrateInterval(Numa nax, Numa nay, float x0, float x1, int npts, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok numaSortGeneral(NUMA*, NUMA**, NUMA**, NUMA**, l_int32, l_int32)</code>
     */
    public static native int numaSortGeneral(Numa na, PointerByReference pnasort, PointerByReference pnaindex, PointerByReference pnainvert, int sortorder, int sorttype);

    /**
     * Original signature :
     * <code>NUMA* numaSortAutoSelect(NUMA*, l_int32)</code>
     */
    public static native Numa numaSortAutoSelect(Numa nas, int sortorder);

    /**
     * Original signature :
     * <code>NUMA* numaSortIndexAutoSelect(NUMA*, l_int32)</code>
     */
    public static native Numa numaSortIndexAutoSelect(Numa nas, int sortorder);

    /**
     * Original signature : <code>l_int32 numaChooseSortType(NUMA*)</code>
     */
    public static native int numaChooseSortType(Numa nas);

    /**
     * Original signature : <code>NUMA* numaSort(NUMA*, NUMA*, l_int32)</code>
     */
    public static native Numa numaSort(Numa naout, Numa nain, int sortorder);

    /**
     * Original signature : <code>NUMA* numaBinSort(NUMA*, l_int32)</code>
     */
    public static native Numa numaBinSort(Numa nas, int sortorder);

    /**
     * Original signature : <code>NUMA* numaGetSortIndex(NUMA*, l_int32)</code>
     */
    public static native Numa numaGetSortIndex(Numa na, int sortorder);

    /**
     * Original signature :
     * <code>NUMA* numaGetBinSortIndex(NUMA*, l_int32)</code>
     */
    public static native Numa numaGetBinSortIndex(Numa nas, int sortorder);

    /**
     * Original signature : <code>NUMA* numaSortByIndex(NUMA*, NUMA*)</code>
     */
    public static native Numa numaSortByIndex(Numa nas, Numa naindex);

    /**
     * Original signature :
     * <code>l_int32 numaIsSorted(NUMA*, l_int32, l_int32*)</code>
     */
    public static native int numaIsSorted(Numa nas, int sortorder, IntBuffer psorted);

    /**
     * Original signature :
     * <code>l_ok numaSortPair(NUMA*, NUMA*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaSortPair(Numa nax, Numa nay, int sortorder, PointerByReference pnasx, PointerByReference pnasy);

    /**
     * Original signature : <code>NUMA* numaInvertMap(NUMA*)</code>
     */
    public static native Numa numaInvertMap(Numa nas);

    /**
     * Original signature : <code>l_ok numaAddSorted(NUMA*, l_float32)</code>
     */
    public static native int numaAddSorted(Numa na, float val);

    /**
     * Original signature :
     * <code>l_ok numaFindSortedLoc(NUMA*, l_float32, l_int32*)</code>
     */
    public static native int numaFindSortedLoc(Numa na, float val, IntBuffer pindex);

    /**
     * Original signature :
     * <code>NUMA* numaPseudorandomSequence(l_int32, l_int32)</code>
     */
    public static native Numa numaPseudorandomSequence(int size, int seed);

    /**
     * Original signature :
     * <code>NUMA* numaRandomPermutation(NUMA*, l_int32)</code>
     */
    public static native Numa numaRandomPermutation(Numa nas, int seed);

    /**
     * Original signature :
     * <code>l_ok numaGetRankValue(NUMA*, l_float32, NUMA*, l_int32, l_float32*)</code>
     */
    public static native int numaGetRankValue(Numa na, float fract, Numa nasort, int usebins, FloatBuffer pval);

    /**
     * Original signature : <code>l_ok numaGetMedian(NUMA*, l_float32*)</code>
     */
    public static native int numaGetMedian(Numa na, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok numaGetBinnedMedian(NUMA*, l_int32*)</code>
     */
    public static native int numaGetBinnedMedian(Numa na, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_ok numaGetMeanDevFromMedian(NUMA*, l_float32, l_float32*)</code>
     */
    public static native int numaGetMeanDevFromMedian(Numa na, float med, FloatBuffer pdev);

    /**
     * Original signature :
     * <code>l_ok numaGetMedianDevFromMedian(NUMA*, l_float32*, l_float32*)</code>
     */
    public static native int numaGetMedianDevFromMedian(Numa na, FloatBuffer pmed, FloatBuffer pdev);

    /**
     * Original signature :
     * <code>l_ok numaGetMode(NUMA*, l_float32*, l_int32*)</code>
     */
    public static native int numaGetMode(Numa na, FloatBuffer pval, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_ok numaJoin(NUMA*, NUMA*, l_int32, l_int32)</code>
     */
    public static native int numaJoin(Numa nad, Numa nas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_ok numaaJoin(NUMAA*, NUMAA*, l_int32, l_int32)</code>
     */
    public static native int numaaJoin(Numaa naad, Numaa naas, int istart, int iend);

    /**
     * Original signature : <code>NUMA* numaaFlattenToNuma(NUMAA*)</code>
     */
    public static native Numa numaaFlattenToNuma(Numaa naa);

    /**
     * Original signature : <code>NUMA* numaErode(NUMA*, l_int32)</code>
     */
    public static native Numa numaErode(Numa nas, int size);

    /**
     * Original signature : <code>NUMA* numaDilate(NUMA*, l_int32)</code>
     */
    public static native Numa numaDilate(Numa nas, int size);

    /**
     * Original signature : <code>NUMA* numaOpen(NUMA*, l_int32)</code>
     */
    public static native Numa numaOpen(Numa nas, int size);

    /**
     * Original signature : <code>NUMA* numaClose(NUMA*, l_int32)</code>
     */
    public static native Numa numaClose(Numa nas, int size);

    /**
     * Original signature :
     * <code>NUMA* numaTransform(NUMA*, l_float32, l_float32)</code>
     */
    public static native Numa numaTransform(Numa nas, float shift, float scale);

    /**
     * Original signature :
     * <code>l_ok numaSimpleStats(NUMA*, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int numaSimpleStats(Numa na, int first, int last, FloatBuffer pmean, FloatBuffer pvar, FloatBuffer prvar);

    /**
     * Original signature :
     * <code>l_ok numaWindowedStats(NUMA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int numaWindowedStats(Numa nas, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);

    /**
     * Original signature : <code>NUMA* numaWindowedMean(NUMA*, l_int32)</code>
     */
    public static native Numa numaWindowedMean(Numa nas, int wc);

    /**
     * Original signature :
     * <code>NUMA* numaWindowedMeanSquare(NUMA*, l_int32)</code>
     */
    public static native Numa numaWindowedMeanSquare(Numa nas, int wc);

    /**
     * Original signature :
     * <code>l_ok numaWindowedVariance(NUMA*, NUMA*, NUMA**, NUMA**)</code>
     */
    public static native int numaWindowedVariance(Numa nam, Numa nams, PointerByReference pnav, PointerByReference pnarv);

    /**
     * Original signature :
     * <code>NUMA* numaWindowedMedian(NUMA*, l_int32)</code>
     */
    public static native Numa numaWindowedMedian(Numa nas, int halfwin);

    /**
     * Original signature : <code>NUMA* numaConvertToInt(NUMA*)</code>
     */
    public static native Numa numaConvertToInt(Numa nas);

    /**
     * Original signature :
     * <code>NUMA* numaMakeHistogram(NUMA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native Numa numaMakeHistogram(Numa na, int maxbins, IntBuffer pbinsize, IntBuffer pbinstart);

    /**
     * Original signature :
     * <code>NUMA* numaMakeHistogramAuto(NUMA*, l_int32)</code>
     */
    public static native Numa numaMakeHistogramAuto(Numa na, int maxbins);

    /**
     * Original signature :
     * <code>NUMA* numaMakeHistogramClipped(NUMA*, l_float32, l_float32)</code>
     */
    public static native Numa numaMakeHistogramClipped(Numa na, float binsize, float maxsize);

    /**
     * Original signature :
     * <code>NUMA* numaRebinHistogram(NUMA*, l_int32)</code>
     */
    public static native Numa numaRebinHistogram(Numa nas, int newsize);

    /**
     * Original signature :
     * <code>NUMA* numaNormalizeHistogram(NUMA*, l_float32)</code>
     */
    public static native Numa numaNormalizeHistogram(Numa nas, float tsum);

    /**
     * Original signature :
     * <code>l_ok numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code>
     */
    public static native int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatBuffer pmin, FloatBuffer pmax, FloatBuffer pmean, FloatBuffer pvariance, FloatBuffer pmedian, float rank, FloatBuffer prval, PointerByReference phisto);

    /**
     * Original signature :
     * <code>l_ok numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code>
     */
    public static native int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatByReference pmin, FloatByReference pmax, FloatByReference pmean, FloatByReference pvariance, FloatByReference pmedian, float rank, FloatByReference prval, PointerByReference phisto);

    /**
     * Original signature :
     * <code>l_ok numaGetHistogramStats(NUMA*, l_float32, l_float32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int numaGetHistogramStats(Numa nahisto, float startx, float deltax, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);

    /**
     * Original signature :
     * <code>l_ok numaGetHistogramStatsOnInterval(NUMA*, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int numaGetHistogramStatsOnInterval(Numa nahisto, float startx, float deltax, int ifirst, int ilast, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);

    /**
     * Original signature :
     * <code>l_ok numaMakeRankFromHistogram(l_float32, l_float32, NUMA*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaMakeRankFromHistogram(float startx, float deltax, Numa nasy, int npts, PointerByReference pnax, PointerByReference pnay);

    /**
     * Original signature :
     * <code>l_ok numaHistogramGetRankFromVal(NUMA*, l_float32, l_float32*)</code>
     */
    public static native int numaHistogramGetRankFromVal(Numa na, float rval, FloatBuffer prank);

    /**
     * Original signature :
     * <code>l_ok numaHistogramGetValFromRank(NUMA*, l_float32, l_float32*)</code>
     */
    public static native int numaHistogramGetValFromRank(Numa na, float rank, FloatBuffer prval);

    /**
     * Original signature :
     * <code>l_ok numaDiscretizeSortedInBins(NUMA*, l_int32, NUMA**)</code>
     */
    public static native int numaDiscretizeSortedInBins(Numa na, int nbins, PointerByReference pnabinval);

    /**
     * Original signature :
     * <code>l_ok numaDiscretizeHistoInBins(NUMA*, l_int32, NUMA**, NUMA**)</code>
     */
    public static native int numaDiscretizeHistoInBins(Numa na, int nbins, PointerByReference pnabinval, PointerByReference pnarank);

    /**
     * Original signature :
     * <code>l_ok numaGetRankBinValues(NUMA*, l_int32, NUMA**)</code>
     */
    public static native int numaGetRankBinValues(Numa na, int nbins, PointerByReference pnam);

    /**
     * Original signature :
     * <code>NUMA* numaGetUniformBinSizes(l_int32, l_int32)</code>
     */
    public static native Numa numaGetUniformBinSizes(int ntotal, int nbins);

    /**
     * Original signature :
     * <code>l_ok numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int numaSplitDistribution(Numa na, float scorefract, IntBuffer psplitindex, FloatBuffer pave1, FloatBuffer pave2, FloatBuffer pnum1, FloatBuffer pnum2, PointerByReference pnascore);

    /**
     * Original signature :
     * <code>l_ok numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int numaSplitDistribution(Numa na, float scorefract, IntByReference psplitindex, FloatByReference pave1, FloatByReference pave2, FloatByReference pnum1, FloatByReference pnum2, PointerByReference pnascore);

    /**
     * Original signature :
     * <code>l_ok grayHistogramsToEMD(NUMAA*, NUMAA*, NUMA**)</code>
     */
    public static native int grayHistogramsToEMD(Numaa naa1, Numaa naa2, PointerByReference pnad);

    /**
     * Original signature :
     * <code>l_ok numaEarthMoverDistance(NUMA*, NUMA*, l_float32*)</code>
     */
    public static native int numaEarthMoverDistance(Numa na1, Numa na2, FloatBuffer pdist);

    /**
     * Original signature :
     * <code>l_ok grayInterHistogramStats(NUMAA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int grayInterHistogramStats(Numaa naa, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);

    /**
     * Original signature :
     * <code>NUMA* numaFindPeaks(NUMA*, l_int32, l_float32, l_float32)</code>
     */
    public static native Numa numaFindPeaks(Numa nas, int nmax, float fract1, float fract2);

    /**
     * Original signature :
     * <code>NUMA* numaFindExtrema(NUMA*, l_float32, NUMA**)</code>
     */
    public static native Numa numaFindExtrema(Numa nas, float delta, PointerByReference pnav);

    /**
     * Original signature :
     * <code>l_ok numaFindLocForThreshold(NUMA*, l_int32, l_int32*, l_float32*)</code>
     */
    public static native int numaFindLocForThreshold(Numa na, int skip, IntBuffer pthresh, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok numaCountReversals(NUMA*, l_float32, l_int32*, l_float32*)</code>
     */
    public static native int numaCountReversals(Numa nas, float minreversal, IntBuffer pnr, FloatBuffer prd);

    /**
     * Original signature :
     * <code>l_ok numaSelectCrossingThreshold(NUMA*, NUMA*, l_float32, l_float32*)</code>
     */
    public static native int numaSelectCrossingThreshold(Numa nax, Numa nay, float estthresh, FloatBuffer pbestthresh);

    /**
     * Original signature :
     * <code>NUMA* numaCrossingsByThreshold(NUMA*, NUMA*, l_float32)</code>
     */
    public static native Numa numaCrossingsByThreshold(Numa nax, Numa nay, float thresh);

    /**
     * Original signature :
     * <code>NUMA* numaCrossingsByPeaks(NUMA*, NUMA*, l_float32)</code>
     */
    public static native Numa numaCrossingsByPeaks(Numa nax, Numa nay, float delta);

    /**
     * Original signature :
     * <code>l_ok numaEvalBestHaarParameters(NUMA*, l_float32, l_int32, l_int32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int numaEvalBestHaarParameters(Numa nas, float relweight, int nwidth, int nshift, float minwidth, float maxwidth, FloatBuffer pbestwidth, FloatBuffer pbestshift, FloatBuffer pbestscore);

    /**
     * Original signature :
     * <code>l_ok numaEvalHaarSum(NUMA*, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int numaEvalHaarSum(Numa nas, float width, float shift, float relweight, FloatBuffer pscore);

    /**
     * Original signature :
     * <code>NUMA* genConstrainedNumaInRange(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa genConstrainedNumaInRange(int first, int last, int nmax, int use_pairs);

    /**
     * Original signature :
     * <code>l_ok pixGetRegionsBinary(PIX*, PIX**, PIX**, PIX**, PIXA*)</code>
     */
    public static native int pixGetRegionsBinary(Pix pixs, PointerByReference ppixhm, PointerByReference ppixtm, PointerByReference ppixtb, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code>
     */
    public static native Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code>
     */
    public static native Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntBuffer ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code>
     */
    public static native Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntByReference ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextblockMask(PIX*, PIX*, PIXA*)</code>
     */
    public static native Pix pixGenTextblockMask(Pix pixs, Pix pixvws, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixCropImage(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, const char*, BOX**)</code>
     */
    public static native Pix pixCropImage(Pix pixs, int lr_clear, int tb_clear, int edgeclean, int lr_border, int tb_border, float maxwiden, int printwiden, String debugfile, PointerByReference pcropbox);

    /**
     * Original signature :
     * <code>PIX* pixCleanImage(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCleanImage(Pix pixs, int contrast, int rotation, int scale, int opensize);

    /**
     * Original signature :
     * <code>BOX* pixFindPageForeground(PIX*, l_int32, l_int32, l_int32, l_int32, PIXAC*)</code>
     */
    public static native Box pixFindPageForeground(Pix pixs, int threshold, int mindist, int erasedist, int showmorph, PixaComp pixac);

    /**
     * Original signature :
     * <code>l_ok pixSplitIntoCharacters(PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**)</code>
     */
    public static native int pixSplitIntoCharacters(Pix pixs, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentWithProfile(PIX*, l_int32, l_int32, PIX**)</code>
     */
    public static native Boxa pixSplitComponentWithProfile(Pix pixs, int delta, int mindel, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>PIXA* pixExtractTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    public static native Pixa pixExtractTextlines(Pix pixs, int maxw, int maxh, int minw, int minh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIXA* pixExtractRawTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, PIXA*)</code>
     */
    public static native Pixa pixExtractRawTextlines(Pix pixs, int maxw, int maxh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixCountTextColumns(PIX*, l_float32, l_float32, l_float32, l_int32*, PIXA*)</code>
     */
    public static native int pixCountTextColumns(Pix pixs, float deltafract, float peakfract, float clipfract, IntBuffer pncols, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfText(PIX*, BOX*, l_int32*, PIXA*)</code>
     */
    public static native int pixDecideIfText(Pix pixs, Box box, IntBuffer pistext, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixFindThreshFgExtent(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixFindThreshFgExtent(Pix pixs, int thresh, IntBuffer ptop, IntBuffer pbot);

    /**
     * Original signature :
     * <code>l_ok pixDecideIfTable(PIX*, BOX*, l_int32, l_int32*, PIXA*)</code>
     */
    public static native int pixDecideIfTable(Pix pixs, Box box, int orient, IntBuffer pscore, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixPrepare1bpp(PIX*, BOX*, l_float32, l_int32)</code>
     */
    public static native Pix pixPrepare1bpp(Pix pixs, Box box, float cropfract, int outres);

    /**
     * Original signature :
     * <code>l_ok pixEstimateBackground(PIX*, l_int32, l_float32, l_int32*)</code>
     */
    public static native int pixEstimateBackground(Pix pixs, int darkthresh, float edgecrop, IntBuffer pbg);

    /**
     * Original signature :
     * <code>l_ok pixFindLargeRectangles(PIX*, l_int32, l_int32, BOXA**, PIX**)</code>
     */
    public static native int pixFindLargeRectangles(Pix pixs, int polarity, int nrect, PointerByReference pboxa, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixFindLargestRectangle(PIX*, l_int32, BOX**, PIX**)</code>
     */
    public static native int pixFindLargestRectangle(Pix pixs, int polarity, PointerByReference pbox, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>BOX* pixFindRectangleInCC(PIX*, BOX*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Box pixFindRectangleInCC(Pix pixs, Box boxs, float fract, int dir, int select, int debug);

    /**
     * Original signature :
     * <code>PIX* pixAutoPhotoinvert(PIX*, l_int32, PIX**, PIXA*)</code>
     */
    public static native Pix pixAutoPhotoinvert(Pix pixs, int thresh, PointerByReference ppixm, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_ok pixSetSelectCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetSelectCmap(Pix pixs, Box box, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayRegionsCmap(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixColorGrayRegionsCmap(Pix pixs, Boxa boxa, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixColorGrayCmap(Pix pixs, Box box, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixColorGrayMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixColorGrayMaskedCmap(Pix pixs, Pix pixm, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok addColorizedGrayToCmap(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, NUMA**)</code>
     */
    public static native int addColorizedGrayToCmap(PixColormap cmap, int type, int rval, int gval, int bval, PointerByReference pna);

    /**
     * Original signature :
     * <code>l_ok pixSetSelectMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetSelectMaskedCmap(Pix pixs, Pix pixm, int x, int y, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixSetMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetMaskedCmap(Pix pixs, Pix pixm, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>char* parseForProtos(const char*, const char*)</code>
     */
    public static native Pointer parseForProtos(String filein, String prestring);

    /**
     * Original signature :
     * <code>l_ok partifyFiles(const char*, const char*, l_int32, const char*, const char*)</code>
     */
    public static native int partifyFiles(String dirname, String substr, int nparts, String outroot, String debugfile);

    /**
     * Original signature :
     * <code>l_ok partifyPixac(PIXAC*, l_int32, const char*, PIXA*)</code>
     */
    public static native int partifyPixac(PixaComp pixac, int nparts, String outroot, Pixa pixadb);

    /**
     * Original signature :
     * <code>BOXA* boxaGetWhiteblocks(BOXA*, BOX*, l_int32, l_int32, l_float32, l_int32, l_float32, l_int32)</code>
     */
    public static native Boxa boxaGetWhiteblocks(Boxa boxas, Box box, int sortflag, int maxboxes, float maxoverlap, int maxperim, float fract, int maxpops);

    /**
     * Original signature :
     * <code>BOXA* boxaPruneSortedOnOverlap(BOXA*, l_float32)</code>
     */
    public static native Boxa boxaPruneSortedOnOverlap(Boxa boxas, float maxoverlap);

    /**
     * Original signature :
     * <code>l_ok compressFilesToPdf(SARRAY*, l_int32, l_int32, l_float32, l_int32, const char*, const char*)</code>
     */
    public static native int compressFilesToPdf(Sarray sa, int onebit, int savecolor, float scalefactor, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok cropFilesToPdf(SARRAY*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, const char*, const char*)</code>
     */
    public static native int cropFilesToPdf(Sarray sa, int lr_clear, int tb_clear, int edgeclean, int lr_add, int tb_add, float maxwiden, int printwiden, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok cleanTo1bppFilesToPdf(SARRAY*, l_int32, l_int32, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int cleanTo1bppFilesToPdf(Sarray sa, int res, int contrast, int rotation, int opensize, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertFilesToPdf(const char*, const char*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int convertFilesToPdf(String dirname, String substr, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertFilesToPdf(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int saConvertFilesToPdf(Sarray sa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertFilesToPdfData(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
     */
    public static native int saConvertFilesToPdfData(Sarray sa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok selectDefaultPdfEncoding(PIX*, l_int32*)</code>
     */
    public static native int selectDefaultPdfEncoding(Pix pix, IntBuffer ptype);

    /**
     * Original signature :
     * <code>l_ok convertUnscaledFilesToPdf(const char*, const char*, const char*, const char*)</code>
     */
    public static native int convertUnscaledFilesToPdf(String dirname, String substr, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertUnscaledFilesToPdf(SARRAY*, const char*, const char*)</code>
     */
    public static native int saConvertUnscaledFilesToPdf(Sarray sa, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConvertUnscaledFilesToPdfData(SARRAY*, const char*, l_uint8**, size_t*)</code>
     */
    public static native int saConvertUnscaledFilesToPdfData(Sarray sa, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertUnscaledToPdfData(const char*, const char*, l_uint8**, size_t*)</code>
     */
    public static native int convertUnscaledToPdfData(String fname, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixaConvertToPdf(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int pixaConvertToPdf(Pixa pixa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixaConvertToPdfData(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
     */
    public static native int pixaConvertToPdfData(Pixa pixa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertToPdf(String filein, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertToPdf(Pointer filein, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertImageDataToPdf(ByteBuffer imdata, NativeSize size, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertImageDataToPdf(Pointer imdata, NativeSize size, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertToPdfData(String filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertToPdfData(Pointer filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertImageDataToPdfData(ByteBuffer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int convertImageDataToPdfData(Pointer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int pixConvertToPdf(Pix pix, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int pixConvertToPdf(Pix pix, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamPdf(FILE*, PIX*, l_int32, const char*)</code>
     */
    public static native int pixWriteStreamPdf(FILE fp, Pix pix, int res, String title);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPdf(l_uint8**, size_t*, PIX*, l_int32, const char*)</code>
     */
    public static native int pixWriteMemPdf(PointerByReference pdata, NativeSizeByReference pnbytes, Pix pix, int res, String title);

    /**
     * Original signature :
     * <code>l_ok convertSegmentedFilesToPdf(const char*, const char*, l_int32, l_int32, l_int32, BOXAA*, l_int32, l_float32, const char*, const char*)</code>
     */
    public static native int convertSegmentedFilesToPdf(String dirname, String substr, int res, int type, int thresh, Boxaa baa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>BOXAA* convertNumberedMasksToBoxaa(const char*, const char*, l_int32, l_int32)</code>
     */
    public static native Boxaa convertNumberedMasksToBoxaa(String dirname, String substr, int numpre, int numpost);

    /**
     * Original signature :
     * <code>l_ok convertToPdfSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code>
     */
    public static native int convertToPdfSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code>
     */
    public static native int pixConvertToPdfSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertToPdfDataSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code>
     */
    public static native int convertToPdfDataSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfDataSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code>
     */
    public static native int pixConvertToPdfDataSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok concatenatePdf(const char*, const char*, const char*)</code>
     */
    public static native int concatenatePdf(String dirname, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_ok saConcatenatePdf(SARRAY*, const char*)</code>
     */
    public static native int saConcatenatePdf(Sarray sa, String fileout);

    /**
     * Original signature :
     * <code>l_ok ptraConcatenatePdf(L_PTRA*, const char*)</code>
     */
    public static native int ptraConcatenatePdf(L_Ptra pa, String fileout);

    /**
     * Original signature :
     * <code>l_ok concatenatePdfToData(const char*, const char*, l_uint8**, size_t*)</code>
     */
    public static native int concatenatePdfToData(String dirname, String substr, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok saConcatenatePdfToData(SARRAY*, l_uint8**, size_t*)</code>
     */
    public static native int saConcatenatePdfToData(Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code>
     */
    public static native int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_ok ptraConcatenatePdfToData(L_PTRA*, SARRAY*, l_uint8**, size_t*)</code>
     */
    public static native int ptraConcatenatePdfToData(L_Ptra pa_data, Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok convertTiffMultipageToPdf(const char*, const char*)</code>
     */
    public static native int convertTiffMultipageToPdf(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code>
     */
    public static native int l_generateCIDataForPdf(String fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code>
     */
    public static native int l_generateCIDataForPdf(Pointer fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateDataPdf(const char*, PIX*)</code>
     */
    public static native L_Compressed_Data l_generateFlateDataPdf(String fname, Pix pixs);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateJpegData(const char*, l_int32)</code>
     */
    public static native L_Compressed_Data l_generateJpegData(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateJpegDataMem(l_uint8*, size_t, l_int32)</code>
     */
    public static native L_Compressed_Data l_generateJpegDataMem(ByteBuffer data, NativeSize nbytes, int ascii85flag);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateG4Data(const char*, l_int32)</code>
     */
    public static native L_Compressed_Data l_generateG4Data(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>l_ok l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    public static native int l_generateCIData(String fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    public static native int l_generateCIData(Pointer fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok pixGenerateCIData(PIX*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code>
     */
    public static native int pixGenerateCIData(Pix pixs, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateData(const char*, l_int32)</code>
     */
    public static native L_Compressed_Data l_generateFlateData(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>l_ok cidConvertToPdfData(L_COMP_DATA*, const char*, l_uint8**, size_t*)</code>
     */
    public static native int cidConvertToPdfData(L_Compressed_Data cid, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature : <code>void l_CIDataDestroy(L_COMP_DATA**)</code>
     */
    public static native void l_CIDataDestroy(PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_ok getPdfPageCount(const char*, l_int32*)</code>
     */
    public static native int getPdfPageCount(String fname, IntBuffer pnpages);

    /**
     * Original signature :
     * <code>l_ok getPdfPageSizes(const char*, NUMA**, NUMA**, l_int32*, l_int32*)</code>
     */
    public static native int getPdfPageSizes(String fname, PointerByReference pnaw, PointerByReference pnah, IntBuffer pmedw, IntBuffer pmedh);

    /**
     * Original signature :
     * <code>l_ok getPdfMediaBoxSizes(const char*, NUMA**, NUMA**, l_int32*, l_int32*)</code>
     */
    public static native int getPdfMediaBoxSizes(String fname, PointerByReference pnaw, PointerByReference pnah, IntBuffer pmedw, IntBuffer pmedh);

    /**
     * Original signature :
     * <code>l_ok getPdfRendererResolution(const char*, const char*, l_int32*)</code>
     */
    public static native int getPdfRendererResolution(String infile, String outdir, IntBuffer pres);

    /**
     * Original signature : <code>void l_pdfSetG4ImageMask(l_int32)</code>
     */
    public static native void l_pdfSetG4ImageMask(int flag);

    /**
     * Original signature : <code>void l_pdfSetDateAndVersion(l_int32)</code>
     */
    public static native void l_pdfSetDateAndVersion(int flag);

    /**
     * Original signature :
     * <code>void setPixMemoryManager(alloc_fn, dealloc_fn)</code>
     */
    public static native void setPixMemoryManager(alloc_fn allocator, dealloc_fn deallocator);

    /**
     * Original signature :
     * <code>PIX* pixCreate(l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCreate(int width, int height, int depth);

    /**
     * Original signature :
     * <code>PIX* pixCreateNoInit(l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCreateNoInit(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixCreateTemplate(const PIX*)</code>
     */
    public static native Pix pixCreateTemplate(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixCreateTemplateNoInit(const PIX*)</code>
     */
    public static native Pix pixCreateTemplateNoInit(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixCreateWithCmap(l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCreateWithCmap(int width, int height, int depth, int initcolor);

    /**
     * Original signature :
     * <code>PIX* pixCreateHeader(l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCreateHeader(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixClone(PIX*)</code>
     */
    public static native Pix pixClone(Pix pixs);

    /**
     * Original signature : <code>void pixDestroy(PIX**)</code>
     */
    public static native void pixDestroy(PointerByReference ppix);

    /**
     * Original signature : <code>PIX* pixCopy(PIX*, const PIX*)</code>
     */
    public static native Pix pixCopy(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixResizeImageData(PIX*, const PIX*)</code>
     */
    public static native int pixResizeImageData(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_ok pixCopyColormap(PIX*, const PIX*)</code>
     */
    public static native int pixCopyColormap(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixTransferAllData(PIX*, PIX**, l_int32, l_int32)</code>
     */
    public static native int pixTransferAllData(Pix pixd, PointerByReference ppixs, int copytext, int copyformat);

    /**
     * Original signature : <code>l_ok pixSwapAndDestroy(PIX**, PIX**)</code>
     */
    public static native int pixSwapAndDestroy(PointerByReference ppixd, PointerByReference ppixs);

    /**
     * Original signature : <code>l_int32 pixGetWidth(const PIX*)</code>
     */
    public static native int pixGetWidth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWidth(PIX*, l_int32)</code>
     */
    public static native int pixSetWidth(Pix pix, int width);

    /**
     * Original signature : <code>l_int32 pixGetHeight(const PIX*)</code>
     */
    public static native int pixGetHeight(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetHeight(PIX*, l_int32)</code>
     */
    public static native int pixSetHeight(Pix pix, int height);

    /**
     * Original signature : <code>l_int32 pixGetDepth(const PIX*)</code>
     */
    public static native int pixGetDepth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetDepth(PIX*, l_int32)</code>
     */
    public static native int pixSetDepth(Pix pix, int depth);

    /**
     * Original signature :
     * <code>l_ok pixGetDimensions(const PIX*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetDimensions(Pix pix, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature :
     * <code>l_ok pixSetDimensions(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetDimensions(Pix pix, int w, int h, int d);

    /**
     * Original signature :
     * <code>l_ok pixCopyDimensions(PIX*, const PIX*)</code>
     */
    public static native int pixCopyDimensions(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetSpp(const PIX*)</code>
     */
    public static native int pixGetSpp(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetSpp(PIX*, l_int32)</code>
     */
    public static native int pixSetSpp(Pix pix, int spp);

    /**
     * Original signature : <code>l_ok pixCopySpp(PIX*, const PIX*)</code>
     */
    public static native int pixCopySpp(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetWpl(const PIX*)</code>
     */
    public static native int pixGetWpl(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWpl(PIX*, l_int32)</code>
     */
    public static native int pixSetWpl(Pix pix, int wpl);

    /**
     * Original signature : <code>l_int32 pixGetXRes(const PIX*)</code>
     */
    public static native int pixGetXRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetXRes(PIX*, l_int32)</code>
     */
    public static native int pixSetXRes(Pix pix, int res);

    /**
     * Original signature : <code>l_int32 pixGetYRes(const PIX*)</code>
     */
    public static native int pixGetYRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetYRes(PIX*, l_int32)</code>
     */
    public static native int pixSetYRes(Pix pix, int res);

    /**
     * Original signature :
     * <code>l_ok pixGetResolution(const PIX*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetResolution(Pix pix, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok pixSetResolution(PIX*, l_int32, l_int32)</code>
     */
    public static native int pixSetResolution(Pix pix, int xres, int yres);

    /**
     * Original signature :
     * <code>l_int32 pixCopyResolution(PIX*, const PIX*)</code>
     */
    public static native int pixCopyResolution(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixScaleResolution(PIX*, l_float32, l_float32)</code>
     */
    public static native int pixScaleResolution(Pix pix, float xscale, float yscale);

    /**
     * Original signature : <code>l_int32 pixGetInputFormat(const PIX*)</code>
     */
    public static native int pixGetInputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetInputFormat(PIX*, l_int32)</code>
     */
    public static native int pixSetInputFormat(Pix pix, int informat);

    /**
     * Original signature :
     * <code>l_int32 pixCopyInputFormat(PIX*, const PIX*)</code>
     */
    public static native int pixCopyInputFormat(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixSetSpecial(PIX*, l_int32)</code>
     */
    public static native int pixSetSpecial(Pix pix, int special);

    /**
     * Original signature : <code>char* pixGetText(PIX*)</code>
     */
    public static native Pointer pixGetText(Pix pix);

    /**
     * Original signature : <code>l_ok pixSetText(PIX*, const char*)</code>
     */
    public static native int pixSetText(Pix pix, String textstring);

    /**
     * Original signature : <code>l_ok pixAddText(PIX*, const char*)</code>
     */
    public static native int pixAddText(Pix pix, String textstring);

    /**
     * Original signature : <code>l_int32 pixCopyText(PIX*, const PIX*)</code>
     */
    public static native int pixCopyText(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_uint8* pixGetTextCompNew(PIX*, size_t*)</code>
     */
    public static native Pointer pixGetTextCompNew(Pix pix, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>l_ok pixSetTextCompNew(PIX*, const l_uint8*, size_t)</code>
     */
    public static native int pixSetTextCompNew(Pix pix, ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>PIXCMAP* pixGetColormap(PIX*)</code>
     */
    public static native PixColormap pixGetColormap(Pix pix);

    /**
     * Original signature : <code>l_ok pixSetColormap(PIX*, PIXCMAP*)</code>
     */
    public static native int pixSetColormap(Pix pix, PixColormap colormap);

    /**
     * Original signature : <code>l_ok pixDestroyColormap(PIX*)</code>
     */
    public static native int pixDestroyColormap(Pix pix);

    /**
     * Original signature : <code>l_uint32* pixGetData(PIX*)</code>
     */
    public static native IntByReference pixGetData(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixFreeAndSetData(PIX*, l_uint32*)</code>
     */
    public static native int pixFreeAndSetData(Pix pix, IntBuffer data);

    /**
     * Original signature :
     * <code>l_int32 pixFreeAndSetData(PIX*, l_uint32*)</code>
     */
    public static native int pixFreeAndSetData(Pix pix, IntByReference data);

    /**
     * Original signature : <code>l_int32 pixSetData(PIX*, l_uint32*)</code>
     */
    public static native int pixSetData(Pix pix, IntBuffer data);

    /**
     * Original signature : <code>l_int32 pixSetData(PIX*, l_uint32*)</code>
     */
    public static native int pixSetData(Pix pix, IntByReference data);

    /**
     * Original signature : <code>l_uint32* pixExtractData(PIX*)</code>
     */
    public static native IntByReference pixExtractData(Pix pix);

    /**
     * Original signature : <code>l_int32 pixFreeData(PIX*)</code>
     */
    public static native int pixFreeData(Pix pix);

    /**
     * Original signature : <code>void** pixGetLinePtrs(PIX*, l_int32*)</code>
     */
    public static native PointerByReference pixGetLinePtrs(Pix pix, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_int32 pixSizesEqual(const PIX*, const PIX*)</code>
     */
    public static native int pixSizesEqual(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_ok pixMaxAspectRatio(PIX*, l_float32*)</code>
     */
    public static native int pixMaxAspectRatio(Pix pixs, FloatBuffer pratio);

    /**
     * Original signature :
     * <code>l_ok pixPrintStreamInfo(FILE*, const PIX*, const char*)</code>
     */
    public static native int pixPrintStreamInfo(FILE fp, Pix pix, String text);

    /**
     * Original signature :
     * <code>l_ok pixGetPixel(PIX*, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int pixGetPixel(Pix pix, int x, int y, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_ok pixGetPixel(PIX*, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int pixGetPixel(Pix pix, int x, int y, IntByReference pval);

    /**
     * Original signature :
     * <code>l_ok pixSetPixel(PIX*, l_int32, l_int32, l_uint32)</code>
     */
    public static native int pixSetPixel(Pix pix, int x, int y, int val);

    /**
     * Original signature :
     * <code>l_ok pixGetRGBPixel(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetRGBPixel(Pix pix, int x, int y, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);
    
    /**
     * Original signature :
     * <code>l_ok pixGetRGBPixel(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetRGBPixel(Pix pix, int x, int y, IntByReference prval, IntByReference pgval, IntByReference pbval);

    /**
     * Original signature :
     * <code>l_ok pixSetRGBPixel(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetRGBPixel(Pix pix, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixSetCmapPixel(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetCmapPixel(Pix pix, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_ok pixGetRandomPixel(PIX*, l_uint32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetRandomPixel(Pix pix, IntBuffer pval, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>l_ok pixClearPixel(PIX*, l_int32, l_int32)</code>
     */
    public static native int pixClearPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixFlipPixel(PIX*, l_int32, l_int32)</code>
     */
    public static native int pixFlipPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>void setPixelLow(l_uint32*, l_int32, l_int32, l_uint32)</code>
     */
    public static native void setPixelLow(IntBuffer line, int x, int depth, int val);

    /**
     * Original signature :
     * <code>l_ok pixGetBlackOrWhiteVal(PIX*, l_int32, l_uint32*)</code>
     */
    public static native int pixGetBlackOrWhiteVal(Pix pixs, int op, IntBuffer pval);

    /**
     * Original signature : <code>l_ok pixClearAll(PIX*)</code>
     */
    public static native int pixClearAll(Pix pix);

    /**
     * Original signature : <code>l_ok pixSetAll(PIX*)</code>
     */
    public static native int pixSetAll(Pix pix);

    /**
     * Original signature : <code>l_ok pixSetAllGray(PIX*, l_int32)</code>
     */
    public static native int pixSetAllGray(Pix pix, int grayval);

    /**
     * Original signature : <code>l_ok pixSetAllArbitrary(PIX*, l_uint32)</code>
     */
    public static native int pixSetAllArbitrary(Pix pix, int val);

    /**
     * Original signature : <code>l_ok pixSetBlackOrWhite(PIX*, l_int32)</code>
     */
    public static native int pixSetBlackOrWhite(Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_ok pixSetComponentArbitrary(PIX*, l_int32, l_int32)</code>
     */
    public static native int pixSetComponentArbitrary(Pix pix, int comp, int val);

    /**
     * Original signature : <code>l_ok pixClearInRect(PIX*, BOX*)</code>
     */
    public static native int pixClearInRect(Pix pix, Box box);

    /**
     * Original signature : <code>l_ok pixSetInRect(PIX*, BOX*)</code>
     */
    public static native int pixSetInRect(Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_ok pixSetInRectArbitrary(PIX*, BOX*, l_uint32)</code>
     */
    public static native int pixSetInRectArbitrary(Pix pix, Box box, int val);

    /**
     * Original signature :
     * <code>l_ok pixBlendInRect(PIX*, BOX*, l_uint32, l_float32)</code>
     */
    public static native int pixBlendInRect(Pix pixs, Box box, int val, float fract);

    /**
     * Original signature : <code>l_ok pixSetPadBits(PIX*, l_int32)</code>
     */
    public static native int pixSetPadBits(Pix pix, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetPadBitsBand(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetPadBitsBand(Pix pix, int by, int bh, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetOrClearBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetOrClearBorder(Pix pixs, int left, int right, int top, int bot, int op);

    /**
     * Original signature :
     * <code>l_ok pixSetBorderVal(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native int pixSetBorderVal(Pix pixs, int left, int right, int top, int bot, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetBorderRingVal(PIX*, l_int32, l_uint32)</code>
     */
    public static native int pixSetBorderRingVal(Pix pixs, int dist, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixSetMirroredBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixCopyBorder(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixCopyBorder(Pix pixd, Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddBorder(PIX*, l_int32, l_uint32)</code>
     */
    public static native Pix pixAddBorder(Pix pixs, int npix, int val);

    /**
     * Original signature :
     * <code>PIX* pixAddBlackOrWhiteBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddBlackOrWhiteBorder(Pix pixs, int left, int right, int top, int bot, int op);

    /**
     * Original signature :
     * <code>PIX* pixAddBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixAddBorderGeneral(Pix pixs, int left, int right, int top, int bot, int val);

    /**
     * Original signature :
     * <code>PIX* pixAddMultipleBlackWhiteBorders(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddMultipleBlackWhiteBorders(Pix pixs, int nblack1, int nwhite1, int nblack2, int nwhite2, int nblack3, int nwhite3);

    /**
     * Original signature : <code>PIX* pixRemoveBorder(PIX*, l_int32)</code>
     */
    public static native Pix pixRemoveBorder(Pix pixs, int npix);

    /**
     * Original signature :
     * <code>PIX* pixRemoveBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRemoveBorderGeneral(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixRemoveBorderToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixRemoveBorderToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixAddMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddMirroredBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddRepeatedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddRepeatedBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddMixedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddMixedBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddContinuedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixAddContinuedBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>l_ok pixShiftAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code>
     */
    public static native int pixShiftAndTransferAlpha(Pix pixd, Pix pixs, float shiftx, float shifty);

    /**
     * Original signature :
     * <code>PIX* pixDisplayLayersRGBA(PIX*, l_uint32, l_int32)</code>
     */
    public static native Pix pixDisplayLayersRGBA(Pix pixs, int val, int maxw);

    /**
     * Original signature :
     * <code>PIX* pixCreateRGBImage(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixCreateRGBImage(Pix pixr, Pix pixg, Pix pixb);

    /**
     * Original signature : <code>PIX* pixGetRGBComponent(PIX*, l_int32)</code>
     */
    public static native Pix pixGetRGBComponent(Pix pixs, int comp);

    /**
     * Original signature :
     * <code>l_ok pixSetRGBComponent(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSetRGBComponent(Pix pixd, Pix pixs, int comp);

    /**
     * Original signature :
     * <code>PIX* pixGetRGBComponentCmap(PIX*, l_int32)</code>
     */
    public static native Pix pixGetRGBComponentCmap(Pix pixs, int comp);

    /**
     * Original signature :
     * <code>l_ok pixCopyRGBComponent(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixCopyRGBComponent(Pix pixd, Pix pixs, int comp);

    /**
     * Original signature :
     * <code>l_ok composeRGBPixel(l_int32, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int composeRGBPixel(int rval, int gval, int bval, IntBuffer ppixel);

    /**
     * Original signature :
     * <code>l_ok composeRGBAPixel(l_int32, l_int32, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int composeRGBAPixel(int rval, int gval, int bval, int aval, IntBuffer ppixel);

    /**
     * Original signature :
     * <code>void extractRGBValues(l_uint32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native void extractRGBValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>void extractRGBAValues(l_uint32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native void extractRGBAValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);

    /**
     * Original signature :
     * <code>l_int32 extractMinMaxComponent(l_uint32, l_int32)</code>
     */
    public static native int extractMinMaxComponent(int pixel, int type);

    /**
     * Original signature :
     * <code>l_ok pixGetRGBLine(PIX*, l_int32, l_uint8*, l_uint8*, l_uint8*)</code>
     */
    public static native int pixGetRGBLine(Pix pixs, int row, ByteBuffer bufr, ByteBuffer bufg, ByteBuffer bufb);

    /**
     * Original signature :
     * <code>l_ok setLineDataVal(l_uint32*, l_int32, l_int32, l_uint32)</code>
     */
    public static native int setLineDataVal(IntBuffer line, int j, int d, int val);

    /**
     * Original signature : <code>PIX* pixEndianByteSwapNew(PIX*)</code>
     */
    public static native Pix pixEndianByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_ok pixEndianByteSwap(PIX*)</code>
     */
    public static native int pixEndianByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 lineEndianByteSwap(l_uint32*, l_uint32*, l_int32)</code>
     */
    public static native int lineEndianByteSwap(IntBuffer datad, IntBuffer datas, int wpl);

    /**
     * Original signature : <code>PIX* pixEndianTwoByteSwapNew(PIX*)</code>
     */
    public static native Pix pixEndianTwoByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_ok pixEndianTwoByteSwap(PIX*)</code>
     */
    public static native int pixEndianTwoByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixGetRasterData(PIX*, l_uint8**, size_t*)</code>
     */
    public static native int pixGetRasterData(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixInferResolution(PIX*, l_float32, l_int32*)</code>
     */
    public static native int pixInferResolution(Pix pix, float longside, IntBuffer pres);

    /**
     * Original signature : <code>l_ok pixAlphaIsOpaque(PIX*, l_int32*)</code>
     */
    public static native int pixAlphaIsOpaque(Pix pix, IntBuffer popaque);

    /**
     * Original signature :
     * <code>l_uint8** pixSetupByteProcessing(PIX*, l_int32*, l_int32*)</code>
     */
    public static native PointerByReference pixSetupByteProcessing(Pix pix, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_ok pixCleanupByteProcessing(PIX*, l_uint8**)</code>
     */
    public static native int pixCleanupByteProcessing(Pix pix, PointerByReference lineptrs);

    /**
     * Original signature :
     * <code>void l_setAlphaMaskBorder(l_float32, l_float32)</code>
     */
    public static native void l_setAlphaMaskBorder(float val1, float val2);

    /**
     * Original signature : <code>l_ok pixSetMasked(PIX*, PIX*, l_uint32)</code>
     */
    public static native int pixSetMasked(Pix pixd, Pix pixm, int val);

    /**
     * Original signature :
     * <code>l_ok pixSetMaskedGeneral(PIX*, PIX*, l_uint32, l_int32, l_int32)</code>
     */
    public static native int pixSetMaskedGeneral(Pix pixd, Pix pixm, int val, int x, int y);

    /**
     * Original signature : <code>l_ok pixCombineMasked(PIX*, PIX*, PIX*)</code>
     */
    public static native int pixCombineMasked(Pix pixd, Pix pixs, Pix pixm);

    /**
     * Original signature :
     * <code>l_ok pixCombineMaskedGeneral(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixCombineMaskedGeneral(Pix pixd, Pix pixs, Pix pixm, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixPaintThroughMask(PIX*, PIX*, l_int32, l_int32, l_uint32)</code>
     */
    public static native int pixPaintThroughMask(Pix pixd, Pix pixm, int x, int y, int val);

    /**
     * Original signature :
     * <code>PIX* pixCopyWithBoxa(PIX*, BOXA*, l_int32)</code>
     */
    public static native Pix pixCopyWithBoxa(Pix pixs, Boxa boxa, int background);

    /**
     * Original signature :
     * <code>l_ok pixPaintSelfThroughMask(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixPaintSelfThroughMask(Pix pixd, Pix pixm, int x, int y, int searchdir, int mindist, int tilesize, int ntiles, int distblend);

    /**
     * Original signature : <code>PIX* pixMakeMaskFromVal(PIX*, l_int32)</code>
     */
    public static native Pix pixMakeMaskFromVal(Pix pixs, int val);

    /**
     * Original signature : <code>PIX* pixMakeMaskFromLUT(PIX*, l_int32*)</code>
     */
    public static native Pix pixMakeMaskFromLUT(Pix pixs, IntBuffer tab);

    /**
     * Original signature :
     * <code>PIX* pixMakeArbMaskFromRGB(PIX*, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixMakeArbMaskFromRGB(Pix pixs, float rc, float gc, float bc, float thresh);

    /**
     * Original signature :
     * <code>PIX* pixSetUnderTransparency(PIX*, l_uint32, l_int32)</code>
     */
    public static native Pix pixSetUnderTransparency(Pix pixs, int val, int debug);

    /**
     * Original signature :
     * <code>PIX* pixMakeAlphaFromMask(PIX*, l_int32, BOX**)</code>
     */
    public static native Pix pixMakeAlphaFromMask(Pix pixs, int dist, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok pixGetColorNearMaskBoundary(PIX*, PIX*, BOX*, l_int32, l_uint32*, l_int32)</code>
     */
    public static native int pixGetColorNearMaskBoundary(Pix pixs, Pix pixm, Box box, int dist, IntBuffer pval, int debug);

    /**
     * Original signature :
     * <code>PIX* pixDisplaySelectedPixels(PIX*, PIX*, SEL*, l_uint32)</code>
     */
    public static native Pix pixDisplaySelectedPixels(Pix pixs, Pix pixm, Pointer sel, int val);

    /**
     * Original signature : <code>PIX* pixInvert(PIX*, PIX*)</code>
     */
    public static native Pix pixInvert(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixOr(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixOr(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAnd(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixAnd(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixXor(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixXor(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixSubtract(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixSubtract(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>l_ok pixZero(PIX*, l_int32*)</code>
     */
    public static native int pixZero(Pix pix, IntBuffer pempty);

    /**
     * Original signature :
     * <code>l_ok pixForegroundFraction(PIX*, l_float32*)</code>
     */
    public static native int pixForegroundFraction(Pix pix, FloatBuffer pfract);

    /**
     * Original signature : <code>NUMA* pixaCountPixels(PIXA*)</code>
     */
    public static native Numa pixaCountPixels(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixCountPixels(PIX*, l_int32*, l_int32*)</code>
     */
    public static native int pixCountPixels(Pix pixs, IntBuffer pcount, IntBuffer tab8);

    /**
     * Original signature :
     * <code>l_ok pixCountPixelsInRect(PIX*, BOX*, l_int32*, l_int32*)</code>
     */
    public static native int pixCountPixelsInRect(Pix pixs, Box box, IntBuffer pcount, IntBuffer tab8);

    /**
     * Original signature : <code>NUMA* pixCountByRow(PIX*, BOX*)</code>
     */
    public static native Numa pixCountByRow(Pix pix, Box box);

    /**
     * Original signature : <code>NUMA* pixCountByColumn(PIX*, BOX*)</code>
     */
    public static native Numa pixCountByColumn(Pix pix, Box box);

    /**
     * Original signature :
     * <code>NUMA* pixCountPixelsByRow(PIX*, l_int32*)</code>
     */
    public static native Numa pixCountPixelsByRow(Pix pix, IntBuffer tab8);

    /**
     * Original signature : <code>NUMA* pixCountPixelsByColumn(PIX*)</code>
     */
    public static native Numa pixCountPixelsByColumn(Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixCountPixelsInRow(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixCountPixelsInRow(Pix pix, int row, IntBuffer pcount, IntBuffer tab8);

    /**
     * Original signature :
     * <code>NUMA* pixGetMomentByColumn(PIX*, l_int32)</code>
     */
    public static native Numa pixGetMomentByColumn(Pix pix, int order);

    /**
     * Original signature :
     * <code>l_ok pixThresholdPixelSum(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixThresholdPixelSum(Pix pix, int thresh, IntBuffer pabove, IntBuffer tab8);

    /**
     * Original signature : <code>l_int32* makePixelSumTab8()</code>
     */
    public static native IntByReference makePixelSumTab8();

    /**
     * Original signature : <code>l_int32* makePixelCentroidTab8()</code>
     */
    public static native IntByReference makePixelCentroidTab8();

    /**
     * Original signature :
     * <code>NUMA* pixAverageByRow(PIX*, BOX*, l_int32)</code>
     */
    public static native Numa pixAverageByRow(Pix pix, Box box, int type);

    /**
     * Original signature :
     * <code>NUMA* pixAverageByColumn(PIX*, BOX*, l_int32)</code>
     */
    public static native Numa pixAverageByColumn(Pix pix, Box box, int type);

    /**
     * Original signature :
     * <code>l_ok pixAverageInRect(PIX*, PIX*, BOX*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int pixAverageInRect(Pix pixs, Pix pixm, Box box, int minval, int maxval, int subsamp, FloatBuffer pave);

    /**
     * Original signature :
     * <code>l_ok pixAverageInRectRGB(PIX*, PIX*, BOX*, l_int32, l_uint32*)</code>
     */
    public static native int pixAverageInRectRGB(Pix pixs, Pix pixm, Box box, int subsamp, IntBuffer pave);

    /**
     * Original signature : <code>NUMA* pixVarianceByRow(PIX*, BOX*)</code>
     */
    public static native Numa pixVarianceByRow(Pix pix, Box box);

    /**
     * Original signature : <code>NUMA* pixVarianceByColumn(PIX*, BOX*)</code>
     */
    public static native Numa pixVarianceByColumn(Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_ok pixVarianceInRect(PIX*, BOX*, l_float32*)</code>
     */
    public static native int pixVarianceInRect(Pix pix, Box box, FloatBuffer prootvar);

    /**
     * Original signature : <code>NUMA* pixAbsDiffByRow(PIX*, BOX*)</code>
     */
    public static native Numa pixAbsDiffByRow(Pix pix, Box box);

    /**
     * Original signature : <code>NUMA* pixAbsDiffByColumn(PIX*, BOX*)</code>
     */
    public static native Numa pixAbsDiffByColumn(Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_ok pixAbsDiffInRect(PIX*, BOX*, l_int32, l_float32*)</code>
     */
    public static native int pixAbsDiffInRect(Pix pix, Box box, int dir, FloatBuffer pabsdiff);

    /**
     * Original signature :
     * <code>l_ok pixAbsDiffOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int pixAbsDiffOnLine(Pix pix, int x1, int y1, int x2, int y2, FloatBuffer pabsdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCountArbInRect(PIX*, BOX*, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixCountArbInRect(Pix pixs, Box box, int val, int factor, IntBuffer pcount);

    /**
     * Original signature :
     * <code>PIX* pixMirroredTiling(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixMirroredTiling(Pix pixs, int w, int h);

    /**
     * Original signature :
     * <code>l_ok pixFindRepCloseTile(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, BOX**, l_int32)</code>
     */
    public static native int pixFindRepCloseTile(Pix pixs, Box box, int searchdir, int mindist, int tsize, int ntiles, PointerByReference pboxtile, int debug);

    /**
     * Original signature :
     * <code>NUMA* pixGetGrayHistogram(PIX*, l_int32)</code>
     */
    public static native Numa pixGetGrayHistogram(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>NUMA* pixGetGrayHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixGetGrayHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);

    /**
     * Original signature :
     * <code>NUMA* pixGetGrayHistogramInRect(PIX*, BOX*, l_int32)</code>
     */
    public static native Numa pixGetGrayHistogramInRect(Pix pixs, Box box, int factor);

    /**
     * Original signature :
     * <code>NUMAA* pixGetGrayHistogramTiled(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numaa pixGetGrayHistogramTiled(Pix pixs, int factor, int nx, int ny);

    /**
     * Original signature :
     * <code>l_ok pixGetColorHistogram(PIX*, l_int32, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int pixGetColorHistogram(Pix pixs, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);

    /**
     * Original signature :
     * <code>l_ok pixGetColorHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int pixGetColorHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);

    /**
     * Original signature :
     * <code>NUMA* pixGetCmapHistogram(PIX*, l_int32)</code>
     */
    public static native Numa pixGetCmapHistogram(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>NUMA* pixGetCmapHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixGetCmapHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);

    /**
     * Original signature :
     * <code>NUMA* pixGetCmapHistogramInRect(PIX*, BOX*, l_int32)</code>
     */
    public static native Numa pixGetCmapHistogramInRect(Pix pixs, Box box, int factor);

    /**
     * Original signature :
     * <code>l_ok pixCountRGBColorsByHash(PIX*, l_int32*)</code>
     */
    public static native int pixCountRGBColorsByHash(Pix pixs, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_ok pixCountRGBColors(PIX*, l_int32, l_int32*)</code>
     */
    public static native int pixCountRGBColors(Pix pixs, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>L_AMAP* pixGetColorAmapHistogram(PIX*, l_int32)</code>
     */
    public static native L_Rbtree pixGetColorAmapHistogram(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_int32 amapGetCountForColor(L_AMAP*, l_uint32)</code>
     */
    public static native int amapGetCountForColor(L_Rbtree amap, int val);

    /**
     * Original signature :
     * <code>l_ok pixGetRankValue(PIX*, l_int32, l_float32, l_uint32*)</code>
     */
    public static native int pixGetRankValue(Pix pixs, int factor, float rank, IntBuffer pvalue);

    /**
     * Original signature :
     * <code>l_ok pixGetRankValueMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int pixGetRankValueMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code>
     */
    public static native int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer pval, PointerByReference pna);

    /**
     * Original signature :
     * <code>l_ok pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code>
     */
    public static native int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatByReference pval, PointerByReference pna);

    /**
     * Original signature :
     * <code>l_ok pixGetPixelAverage(PIX*, PIX*, l_int32, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int pixGetPixelAverage(Pix pixs, Pix pixm, int x, int y, int factor, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_ok pixGetPixelStats(PIX*, l_int32, l_int32, l_uint32*)</code>
     */
    public static native int pixGetPixelStats(Pix pixs, int factor, int type, IntBuffer pvalue);

    /**
     * Original signature :
     * <code>l_ok pixGetAverageMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int pixGetAverageMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);

    /**
     * Original signature :
     * <code>l_ok pixGetAverageMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int pixGetAverageMasked(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok pixGetAverageTiledRGB(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code>
     */
    public static native int pixGetAverageTiledRGB(Pix pixs, int sx, int sy, int type, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>PIX* pixGetAverageTiled(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixGetAverageTiled(Pix pixs, int sx, int sy, int type);

    /**
     * Original signature :
     * <code>l_int32 pixRowStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int pixRowStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);

    /**
     * Original signature :
     * <code>l_int32 pixColumnStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int pixColumnStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);

    /**
     * Original signature :
     * <code>l_ok pixGetRangeValues(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixGetRangeValues(Pix pixs, int factor, int color, IntBuffer pminval, IntBuffer pmaxval);

    /**
     * Original signature :
     * <code>l_ok pixGetExtremeValue(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetExtremeValue(Pix pixs, int factor, int type, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer pgrayval);

    /**
     * Original signature :
     * <code>l_ok pixGetMaxValueInRect(PIX*, BOX*, l_uint32*, l_int32*, l_int32*)</code>
     */
    public static native int pixGetMaxValueInRect(Pix pixs, Box box, IntBuffer pmaxval, IntBuffer pxmax, IntBuffer pymax);

    /**
     * Original signature :
     * <code>l_ok pixGetMaxColorIndex(PIX*, l_int32*)</code>
     */
    public static native int pixGetMaxColorIndex(Pix pixs, IntBuffer pmaxindex);

    /**
     * Original signature :
     * <code>l_ok pixGetBinnedComponentRange(PIX*, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_uint32**, l_int32)</code>
     */
    public static native int pixGetBinnedComponentRange(Pix pixs, int nbins, int factor, int color, IntBuffer pminval, IntBuffer pmaxval, PointerByReference pcarray, int fontsize);

    /**
     * Original signature :
     * <code>l_ok pixGetRankColorArray(PIX*, l_int32, l_int32, l_int32, l_uint32**, PIXA*, l_int32)</code>
     */
    public static native int pixGetRankColorArray(Pix pixs, int nbins, int type, int factor, PointerByReference pcarray, Pixa pixadb, int fontsize);

    /**
     * Original signature :
     * <code>l_ok pixGetBinnedColor(PIX*, PIX*, l_int32, l_int32, l_uint32**, PIXA*)</code>
     */
    public static native int pixGetBinnedColor(Pix pixs, Pix pixg, int factor, int nbins, PointerByReference pcarray, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixDisplayColorArray(l_uint32*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixDisplayColorArray(IntBuffer carray, int ncolors, int side, int ncols, int fontsize);

    /**
     * Original signature :
     * <code>PIX* pixRankBinByStrip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRankBinByStrip(Pix pixs, int direction, int size, int nbins, int type);

    /**
     * Original signature :
     * <code>PIX* pixaGetAlignedStats(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaGetAlignedStats(Pixa pixa, int type, int nbins, int thresh);

    /**
     * Original signature :
     * <code>l_ok pixaExtractColumnFromEachPix(PIXA*, l_int32, PIX*)</code>
     */
    public static native int pixaExtractColumnFromEachPix(Pixa pixa, int col, Pix pixd);

    /**
     * Original signature :
     * <code>l_ok pixGetRowStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int pixGetRowStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer colvect);

    /**
     * Original signature :
     * <code>l_ok pixGetColumnStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int pixGetColumnStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer rowvect);

    /**
     * Original signature :
     * <code>l_ok pixSetPixelColumn(PIX*, l_int32, l_float32*)</code>
     */
    public static native int pixSetPixelColumn(Pix pix, int col, FloatBuffer colvect);

    /**
     * Original signature :
     * <code>l_ok pixThresholdForFgBg(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixThresholdForFgBg(Pix pixs, int factor, int thresh, IntBuffer pfgval, IntBuffer pbgval);

    /**
     * Original signature :
     * <code>l_ok pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code>
     */
    public static native int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntBuffer pthresh, IntBuffer pfgval, IntBuffer pbgval, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code>
     */
    public static native int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntByReference pthresh, IntByReference pfgval, IntByReference pbgval, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok pixaFindDimensions(PIXA*, NUMA**, NUMA**)</code>
     */
    public static native int pixaFindDimensions(Pixa pixa, PointerByReference pnaw, PointerByReference pnah);

    /**
     * Original signature :
     * <code>l_ok pixFindAreaPerimRatio(PIX*, l_int32*, l_float32*)</code>
     */
    public static native int pixFindAreaPerimRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);

    /**
     * Original signature : <code>NUMA* pixaFindPerimToAreaRatio(PIXA*)</code>
     */
    public static native Numa pixaFindPerimToAreaRatio(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixFindPerimToAreaRatio(PIX*, l_int32*, l_float32*)</code>
     */
    public static native int pixFindPerimToAreaRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);

    /**
     * Original signature : <code>NUMA* pixaFindPerimSizeRatio(PIXA*)</code>
     */
    public static native Numa pixaFindPerimSizeRatio(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixFindPerimSizeRatio(PIX*, l_int32*, l_float32*)</code>
     */
    public static native int pixFindPerimSizeRatio(Pix pixs, IntBuffer tab, FloatBuffer pratio);

    /**
     * Original signature : <code>NUMA* pixaFindAreaFraction(PIXA*)</code>
     */
    public static native Numa pixaFindAreaFraction(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixFindAreaFraction(PIX*, l_int32*, l_float32*)</code>
     */
    public static native int pixFindAreaFraction(Pix pixs, IntBuffer tab, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>NUMA* pixaFindAreaFractionMasked(PIXA*, PIX*, l_int32)</code>
     */
    public static native Numa pixaFindAreaFractionMasked(Pixa pixa, Pix pixm, int debug);

    /**
     * Original signature :
     * <code>l_ok pixFindAreaFractionMasked(PIX*, BOX*, PIX*, l_int32*, l_float32*)</code>
     */
    public static native int pixFindAreaFractionMasked(Pix pixs, Box box, Pix pixm, IntBuffer tab, FloatBuffer pfract);

    /**
     * Original signature : <code>NUMA* pixaFindWidthHeightRatio(PIXA*)</code>
     */
    public static native Numa pixaFindWidthHeightRatio(Pixa pixa);

    /**
     * Original signature : <code>NUMA* pixaFindWidthHeightProduct(PIXA*)</code>
     */
    public static native Numa pixaFindWidthHeightProduct(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixFindOverlapFraction(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_int32*)</code>
     */
    public static native int pixFindOverlapFraction(Pix pixs1, Pix pixs2, int x2, int y2, IntBuffer tab, FloatBuffer pratio, IntBuffer pnoverlap);

    /**
     * Original signature :
     * <code>BOXA* pixFindRectangleComps(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Boxa pixFindRectangleComps(Pix pixs, int dist, int minw, int minh);

    /**
     * Original signature :
     * <code>l_ok pixConformsToRectangle(PIX*, BOX*, l_int32, l_int32*)</code>
     */
    public static native int pixConformsToRectangle(Pix pixs, Box box, int dist, IntBuffer pconforms);

    /**
     * Original signature :
     * <code>PIX* pixExtractRectangularRegions(PIX*, BOXA*)</code>
     */
    public static native Pix pixExtractRectangularRegions(Pix pixs, Boxa boxa);

    /**
     * Original signature : 
     * <code>PIXA* pixClipRectangles(PIX*, BOXA*)</code>
     */
    public static native Pixa pixClipRectangles(Pix pixs, Boxa boxa);

    /**
     * Original signature :
     * <code>PIX* pixClipRectangle(PIX*, BOX*, BOX**)</code>
     */
    public static native Pix pixClipRectangle(Pix pixs, Box box, PointerByReference pboxc);

    /**
     * Original signature :
     * <code>PIX* pixClipRectangleWithBorder(PIX*, BOX*, l_int32, BOX**)</code>
     */
    public static native Pix pixClipRectangleWithBorder(Pix pixs, Box box, int maxbord, PointerByReference pboxn);

    /**
     * Original signature :
     * <code>PIX* pixClipMasked(PIX*, PIX*, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixClipMasked(Pix pixs, Pix pixm, int x, int y, int outval);

    /**
     * Original signature :
     * <code>l_ok pixCropToMatch(PIX*, PIX*, PIX**, PIX**)</code>
     */
    public static native int pixCropToMatch(Pix pixs1, Pix pixs2, PointerByReference ppixd1, PointerByReference ppixd2);

    /**
     * Original signature :
     * <code>PIX* pixCropToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixCropToSize(Pix pixs, int w, int h);

    /**
     * Original signature :
     * <code>PIX* pixResizeToMatch(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixResizeToMatch(Pix pixs, Pix pixt, int w, int h);

    /**
     * Original signature :
     * <code>PIX* pixSelectComponentBySize(PIX*, l_int32, l_int32, l_int32, BOX**)</code>
     */
    public static native Pix pixSelectComponentBySize(Pix pixs, int rankorder, int type, int connectivity, PointerByReference pbox);

    /**
     * Original signature :
     * <code>PIX* pixFilterComponentBySize(PIX*, l_int32, l_int32, l_int32, BOX**)</code>
     */
    public static native Pix pixFilterComponentBySize(Pix pixs, int rankorder, int type, int connectivity, PointerByReference pbox);

    /**
     * Original signature :
     * <code>PIX* pixMakeSymmetricMask(l_int32, l_int32, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixMakeSymmetricMask(int w, int h, float hf, float vf, int type);

    /**
     * Original signature :
     * <code>PIX* pixMakeFrameMask(l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixMakeFrameMask(int w, int h, float hf1, float hf2, float vf1, float vf2);

    /**
     * Original signature :
     * <code>PIX* pixMakeCoveringOfRectangles(PIX*, l_int32)</code>
     */
    public static native Pix pixMakeCoveringOfRectangles(Pix pixs, int maxiters);

    /**
     * Original signature :
     * <code>l_ok pixFractionFgInMask(PIX*, PIX*, l_float32*)</code>
     */
    public static native int pixFractionFgInMask(Pix pix1, Pix pix2, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_ok pixClipToForeground(PIX*, PIX**, BOX**)</code>
     */
    public static native int pixClipToForeground(Pix pixs, PointerByReference ppixd, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_ok pixTestClipToForeground(PIX*, l_int32*)</code>
     */
    public static native int pixTestClipToForeground(Pix pixs, IntBuffer pcanclip);

    /**
     * Original signature :
     * <code>l_ok pixClipBoxToForeground(PIX*, BOX*, PIX**, BOX**)</code>
     */
    public static native int pixClipBoxToForeground(Pix pixs, Box boxs, PointerByReference ppixd, PointerByReference pboxd);

    /**
     * Original signature :
     * <code>l_ok pixScanForForeground(PIX*, BOX*, l_int32, l_int32*)</code>
     */
    public static native int pixScanForForeground(Pix pixs, Box box, int scanflag, IntBuffer ploc);

    /**
     * Original signature :
     * <code>l_ok pixClipBoxToEdges(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, PIX**, BOX**)</code>
     */
    public static native int pixClipBoxToEdges(Pix pixs, Box boxs, int lowthresh, int highthresh, int maxwidth, int factor, PointerByReference ppixd, PointerByReference pboxd);

    /**
     * Original signature :
     * <code>l_ok pixScanForEdge(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixScanForEdge(Pix pixs, Box box, int lowthresh, int highthresh, int maxwidth, int factor, int scanflag, IntBuffer ploc);

    /**
     * Original signature :
     * <code>NUMA* pixExtractOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixExtractOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);

    /**
     * Original signature :
     * <code>l_float32 pixAverageOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native float pixAverageOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);

    /**
     * Original signature :
     * <code>NUMA* pixAverageIntensityProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixAverageIntensityProfile(Pix pixs, float fract, int dir, int first, int last, int factor1, int factor2);

    /**
     * Original signature :
     * <code>NUMA* pixReversalProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixReversalProfile(Pix pixs, float fract, int dir, int first, int last, int minreversal, int factor1, int factor2);

    /**
     * Original signature :
     * <code>l_ok pixWindowedVarianceOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**)</code>
     */
    public static native int pixWindowedVarianceOnLine(Pix pixs, int dir, int loc, int c1, int c2, int size, PointerByReference pnad);

    /**
     * Original signature :
     * <code>l_ok pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code>
     */
    public static native int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatBuffer pminave, FloatBuffer pmaxave);

    /**
     * Original signature :
     * <code>l_ok pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code>
     */
    public static native int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatByReference pminave, FloatByReference pmaxave);

    /**
     * Original signature : <code>PIX* pixRankRowTransform(PIX*)</code>
     */
    public static native Pix pixRankRowTransform(Pix pixs);

    /**
     * Original signature : <code>PIX* pixRankColumnTransform(PIX*)</code>
     */
    public static native Pix pixRankColumnTransform(Pix pixs);

    /**
     * Original signature : <code>PIXA* pixaCreate(l_int32)</code>
     */
    public static native Pixa pixaCreate(int n);

    /**
     * Original signature :
     * <code>PIXA* pixaCreateFromPix(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaCreateFromPix(Pix pixs, int n, int cellw, int cellh);

    /**
     * Original signature :
     * <code>PIXA* pixaCreateFromBoxa(PIX*, BOXA*, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaCreateFromBoxa(Pix pixs, Boxa boxa, int start, int num, IntBuffer pcropwarn);

    /**
     * Original signature :
     * <code>PIXA* pixaSplitPix(PIX*, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pixa pixaSplitPix(Pix pixs, int nx, int ny, int borderwidth, int bordercolor);

    /**
     * Original signature : <code>void pixaDestroy(PIXA**)</code>
     */
    public static native void pixaDestroy(PointerByReference ppixa);

    /**
     * Original signature : <code>PIXA* pixaCopy(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaCopy(Pixa pixa, int copyflag);

    /**
     * Original signature : <code>l_ok pixaAddPix(PIXA*, PIX*, l_int32)</code>
     */
    public static native int pixaAddPix(Pixa pixa, Pix pix, int copyflag);

    /**
     * Original signature : <code>l_ok pixaAddBox(PIXA*, BOX*, l_int32)</code>
     */
    public static native int pixaAddBox(Pixa pixa, Box box, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaExtendArrayToSize(PIXA*, size_t)</code>
     */
    public static native int pixaExtendArrayToSize(Pixa pixa, NativeSize size);

    /**
     * Original signature : <code>l_int32 pixaGetCount(PIXA*)</code>
     */
    public static native int pixaGetCount(Pixa pixa);

    /**
     * Original signature :
     * <code>PIX* pixaGetPix(PIXA*, l_int32, l_int32)</code>
     */
    public static native Pix pixaGetPix(Pixa pixa, int index, int accesstype);

    /**
     * Original signature :
     * <code>l_ok pixaGetPixDimensions(PIXA*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaGetPixDimensions(Pixa pixa, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature : <code>BOXA* pixaGetBoxa(PIXA*, l_int32)</code>
     */
    public static native Boxa pixaGetBoxa(Pixa pixa, int accesstype);

    /**
     * Original signature : <code>l_int32 pixaGetBoxaCount(PIXA*)</code>
     */
    public static native int pixaGetBoxaCount(Pixa pixa);

    /**
     * Original signature :
     * <code>BOX* pixaGetBox(PIXA*, l_int32, l_int32)</code>
     */
    public static native Box pixaGetBox(Pixa pixa, int index, int accesstype);

    /**
     * Original signature :
     * <code>l_ok pixaGetBoxGeometry(PIXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaGetBoxGeometry(Pixa pixa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature : <code>l_ok pixaSetBoxa(PIXA*, BOXA*, l_int32)</code>
     */
    public static native int pixaSetBoxa(Pixa pixa, Boxa boxa, int accesstype);

    /**
     * Original signature : <code>PIX** pixaGetPixArray(PIXA*)</code>
     */
    public static native PointerByReference pixaGetPixArray(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixaVerifyDepth(PIXA*, l_int32*, l_int32*)</code>
     */
    public static native int pixaVerifyDepth(Pixa pixa, IntBuffer psame, IntBuffer pmaxd);

    /**
     * Original signature :
     * <code>l_ok pixaVerifyDimensions(PIXA*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaVerifyDimensions(Pixa pixa, IntBuffer psame, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok pixaIsFull(PIXA*, l_int32*, l_int32*)</code>
     */
    public static native int pixaIsFull(Pixa pixa, IntBuffer pfullpa, IntBuffer pfullba);

    /**
     * Original signature : <code>l_ok pixaCountText(PIXA*, l_int32*)</code>
     */
    public static native int pixaCountText(Pixa pixa, IntBuffer pntext);

    /**
     * Original signature :
     * <code>l_ok pixaSetText(PIXA*, const char*, SARRAY*)</code>
     */
    public static native int pixaSetText(Pixa pixa, String text, Sarray sa);

    /**
     * Original signature :
     * <code>void*** pixaGetLinePtrs(PIXA*, l_int32*)</code>
     */
    public static native PointerByReference pixaGetLinePtrs(Pixa pixa, IntBuffer psize);

    /**
     * Original signature : <code>l_ok pixaWriteStreamInfo(FILE*, PIXA*)</code>
     */
    public static native int pixaWriteStreamInfo(FILE fp, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixaReplacePix(PIXA*, l_int32, PIX*, BOX*)</code>
     */
    public static native int pixaReplacePix(Pixa pixa, int index, Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_ok pixaInsertPix(PIXA*, l_int32, PIX*, BOX*)</code>
     */
    public static native int pixaInsertPix(Pixa pixa, int index, Pix pixs, Box box);

    /**
     * Original signature : <code>l_ok pixaRemovePix(PIXA*, l_int32)</code>
     */
    public static native int pixaRemovePix(Pixa pixa, int index);

    /**
     * Original signature :
     * <code>l_ok pixaRemovePixAndSave(PIXA*, l_int32, PIX**, BOX**)</code>
     */
    public static native int pixaRemovePixAndSave(Pixa pixa, int index, PointerByReference ppix, PointerByReference pbox);

    /**
     * Original signature : <code>l_ok pixaRemoveSelected(PIXA*, NUMA*)</code>
     */
    public static native int pixaRemoveSelected(Pixa pixa, Numa naindex);

    /**
     * Original signature : <code>l_ok pixaInitFull(PIXA*, PIX*, BOX*)</code>
     */
    public static native int pixaInitFull(Pixa pixa, Pix pix, Box box);

    /**
     * Original signature : <code>l_ok pixaClear(PIXA*)</code>
     */
    public static native int pixaClear(Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixaJoin(PIXA*, PIXA*, l_int32, l_int32)</code>
     */
    public static native int pixaJoin(Pixa pixad, Pixa pixas, int istart, int iend);

    /**
     * Original signature :
     * <code>PIXA* pixaInterleave(PIXA*, PIXA*, l_int32)</code>
     */
    public static native Pixa pixaInterleave(Pixa pixa1, Pixa pixa2, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaaJoin(PIXAA*, PIXAA*, l_int32, l_int32)</code>
     */
    public static native int pixaaJoin(Pixaa paad, Pixaa paas, int istart, int iend);

    /**
     * Original signature : <code>PIXAA* pixaaCreate(l_int32)</code>
     */
    public static native Pixaa pixaaCreate(int n);

    /**
     * Original signature :
     * <code>PIXAA* pixaaCreateFromPixa(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixaa pixaaCreateFromPixa(Pixa pixa, int n, int type, int copyflag);

    /**
     * Original signature : <code>void pixaaDestroy(PIXAA**)</code>
     */
    public static native void pixaaDestroy(PointerByReference ppaa);

    /**
     * Original signature :
     * <code>l_ok pixaaAddPixa(PIXAA*, PIXA*, l_int32)</code>
     */
    public static native int pixaaAddPixa(Pixaa paa, Pixa pixa, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaaAddPix(PIXAA*, l_int32, PIX*, BOX*, l_int32)</code>
     */
    public static native int pixaaAddPix(Pixaa paa, int index, Pix pix, Box box, int copyflag);

    /**
     * Original signature : <code>l_ok pixaaAddBox(PIXAA*, BOX*, l_int32)</code>
     */
    public static native int pixaaAddBox(Pixaa paa, Box box, int copyflag);

    /**
     * Original signature : <code>l_int32 pixaaGetCount(PIXAA*, NUMA**)</code>
     */
    public static native int pixaaGetCount(Pixaa paa, PointerByReference pna);

    /**
     * Original signature :
     * <code>PIXA* pixaaGetPixa(PIXAA*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaaGetPixa(Pixaa paa, int index, int accesstype);

    /**
     * Original signature : <code>BOXA* pixaaGetBoxa(PIXAA*, l_int32)</code>
     */
    public static native Boxa pixaaGetBoxa(Pixaa paa, int accesstype);

    /**
     * Original signature :
     * <code>PIX* pixaaGetPix(PIXAA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaaGetPix(Pixaa paa, int index, int ipix, int accessflag);

    /**
     * Original signature :
     * <code>l_ok pixaaVerifyDepth(PIXAA*, l_int32*, l_int32*)</code>
     */
    public static native int pixaaVerifyDepth(Pixaa paa, IntBuffer psame, IntBuffer pmaxd);

    /**
     * Original signature :
     * <code>l_ok pixaaVerifyDimensions(PIXAA*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaaVerifyDimensions(Pixaa paa, IntBuffer psame, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature : <code>l_int32 pixaaIsFull(PIXAA*, l_int32*)</code>
     */
    public static native int pixaaIsFull(Pixaa paa, IntBuffer pfull);

    /**
     * Original signature : <code>l_ok pixaaInitFull(PIXAA*, PIXA*)</code>
     */
    public static native int pixaaInitFull(Pixaa paa, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixaaReplacePixa(PIXAA*, l_int32, PIXA*)</code>
     */
    public static native int pixaaReplacePixa(Pixaa paa, int index, Pixa pixa);

    /**
     * Original signature : <code>l_ok pixaaClear(PIXAA*)</code>
     */
    public static native int pixaaClear(Pixaa paa);

    /**
     * Original signature : <code>l_ok pixaaTruncate(PIXAA*)</code>
     */
    public static native int pixaaTruncate(Pixaa paa);

    /**
     * Original signature : <code>PIXA* pixaRead(const char*)</code>
     */
    public static native Pixa pixaRead(String filename);

    /**
     * Original signature : <code>PIXA* pixaReadStream(FILE*)</code>
     */
    public static native Pixa pixaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Pixa pixaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok pixaWriteDebug(const char*, PIXA*)</code>
     */
    public static native int pixaWriteDebug(String fname, Pixa pixa);

    /**
     * Original signature : <code>l_ok pixaWrite(const char*, PIXA*)</code>
     */
    public static native int pixaWrite(String filename, Pixa pixa);

    /**
     * Original signature : <code>l_ok pixaWriteStream(FILE*, PIXA*)</code>
     */
    public static native int pixaWriteStream(FILE fp, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMem(l_uint8**, size_t*, PIXA*)</code>
     */
    public static native int pixaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature : <code>PIXA* pixaReadBoth(const char*)</code>
     */
    public static native Pixa pixaReadBoth(String filename);

    /**
     * Original signature :
     * <code>PIXAA* pixaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code>
     */
    public static native Pixaa pixaaReadFromFiles(String dirname, String substr, int first, int nfiles);

    /**
     * Original signature : <code>PIXAA* pixaaRead(const char*)</code>
     */
    public static native Pixaa pixaaRead(String filename);

    /**
     * Original signature : <code>PIXAA* pixaaReadStream(FILE*)</code>
     */
    public static native Pixaa pixaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXAA* pixaaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Pixaa pixaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok pixaaWrite(const char*, PIXAA*)</code>
     */
    public static native int pixaaWrite(String filename, Pixaa paa);

    /**
     * Original signature : <code>l_ok pixaaWriteStream(FILE*, PIXAA*)</code>
     */
    public static native int pixaaWriteStream(FILE fp, Pixaa paa);

    /**
     * Original signature :
     * <code>l_ok pixaaWriteMem(l_uint8**, size_t*, PIXAA*)</code>
     */
    public static native int pixaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixaa paa);

    /**
     * Original signature :
     * <code>PIXACC* pixaccCreate(l_int32, l_int32, l_int32)</code>
     */
    public static native Pixacc pixaccCreate(int w, int h, int negflag);

    /**
     * Original signature :
     * <code>PIXACC* pixaccCreateFromPix(PIX*, l_int32)</code>
     */
    public static native Pixacc pixaccCreateFromPix(Pix pix, int negflag);

    /**
     * Original signature : <code>void pixaccDestroy(PIXACC**)</code>
     */
    public static native void pixaccDestroy(PointerByReference ppixacc);

    /**
     * Original signature : <code>PIX* pixaccFinal(PIXACC*, l_int32)</code>
     */
    public static native Pix pixaccFinal(Pixacc pixacc, int outdepth);

    /**
     * Original signature : <code>PIX* pixaccGetPix(PIXACC*)</code>
     */
    public static native Pix pixaccGetPix(Pixacc pixacc);

    /**
     * Original signature : <code>l_int32 pixaccGetOffset(PIXACC*)</code>
     */
    public static native int pixaccGetOffset(Pixacc pixacc);

    /**
     * Original signature : <code>l_ok pixaccAdd(PIXACC*, PIX*)</code>
     */
    public static native int pixaccAdd(Pixacc pixacc, Pix pix);

    /**
     * Original signature : <code>l_ok pixaccSubtract(PIXACC*, PIX*)</code>
     */
    public static native int pixaccSubtract(Pixacc pixacc, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixaccMultConst(PIXACC*, l_float32)</code>
     */
    public static native int pixaccMultConst(Pixacc pixacc, float factor);

    /**
     * Original signature :
     * <code>l_ok pixaccMultConstAccumulate(PIXACC*, PIX*, l_float32)</code>
     */
    public static native int pixaccMultConstAccumulate(Pixacc pixacc, Pix pix, float factor);

    /**
     * Original signature :
     * <code>PIX* pixSelectBySize(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectBySize(Pix pixs, int width, int height, int connectivity, int type, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectBySize(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectBySize(Pixa pixas, int width, int height, int type, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* pixaMakeSizeIndicator(PIXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixaMakeSizeIndicator(Pixa pixa, int width, int height, int type, int relation);

    /**
     * Original signature :
     * <code>PIX* pixSelectByPerimToAreaRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectByPerimToAreaRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByPerimToAreaRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByPerimToAreaRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIX* pixSelectByPerimSizeRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectByPerimSizeRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByPerimSizeRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByPerimSizeRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIX* pixSelectByAreaFraction(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectByAreaFraction(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByAreaFraction(PIXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByAreaFraction(Pixa pixas, float thresh, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIX* pixSelectByArea(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectByArea(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByArea(PIXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByArea(Pixa pixas, float thresh, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIX* pixSelectByWidthHeightRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pix pixSelectByWidthHeightRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByWidthHeightRatio(PIXA*, l_float32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByWidthHeightRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectByNumConnComp(PIXA*, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native Pixa pixaSelectByNumConnComp(Pixa pixas, int nmin, int nmax, int connectivity, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectWithIndicator(PIXA*, NUMA*, l_int32*)</code>
     */
    public static native Pixa pixaSelectWithIndicator(Pixa pixas, Numa na, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>l_ok pixRemoveWithIndicator(PIX*, PIXA*, NUMA*)</code>
     */
    public static native int pixRemoveWithIndicator(Pix pixs, Pixa pixa, Numa na);

    /**
     * Original signature :
     * <code>l_ok pixAddWithIndicator(PIX*, PIXA*, NUMA*)</code>
     */
    public static native int pixAddWithIndicator(Pix pixs, Pixa pixa, Numa na);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectWithString(PIXA*, const char*, l_int32*)</code>
     */
    public static native Pixa pixaSelectWithString(Pixa pixas, String str, IntBuffer perror);

    /**
     * Original signature :
     * <code>PIX* pixaRenderComponent(PIX*, PIXA*, l_int32)</code>
     */
    public static native Pix pixaRenderComponent(Pix pixs, Pixa pixa, int index);

    /**
     * Original signature :
     * <code>PIXA* pixaSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code>
     */
    public static native Pixa pixaSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);

    /**
     * Original signature :
     * <code>PIXA* pixaBinSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code>
     */
    public static native Pixa pixaBinSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);

    /**
     * Original signature :
     * <code>PIXA* pixaSortByIndex(PIXA*, NUMA*, l_int32)</code>
     */
    public static native Pixa pixaSortByIndex(Pixa pixas, Numa naindex, int copyflag);

    /**
     * Original signature :
     * <code>PIXAA* pixaSort2dByIndex(PIXA*, NUMAA*, l_int32)</code>
     */
    public static native Pixaa pixaSort2dByIndex(Pixa pixas, Numaa naa, int copyflag);

    /**
     * Original signature :
     * <code>PIXA* pixaSelectRange(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaSelectRange(Pixa pixas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>PIXAA* pixaaSelectRange(PIXAA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixaa pixaaSelectRange(Pixaa paas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>PIXAA* pixaaScaleToSize(PIXAA*, l_int32, l_int32)</code>
     */
    public static native Pixaa pixaaScaleToSize(Pixaa paas, int wd, int hd);

    /**
     * Original signature :
     * <code>PIXAA* pixaaScaleToSizeVar(PIXAA*, NUMA*, NUMA*)</code>
     */
    public static native Pixaa pixaaScaleToSizeVar(Pixaa paas, Numa nawd, Numa nahd);

    /**
     * Original signature :
     * <code>PIXA* pixaScaleToSize(PIXA*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaScaleToSize(Pixa pixas, int wd, int hd);

    /**
     * Original signature :
     * <code>PIXA* pixaScaleToSizeRel(PIXA*, l_int32, l_int32)</code>
     */
    public static native Pixa pixaScaleToSizeRel(Pixa pixas, int delw, int delh);

    /**
     * Original signature :
     * <code>PIXA* pixaScale(PIXA*, l_float32, l_float32)</code>
     */
    public static native Pixa pixaScale(Pixa pixas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIXA* pixaScaleBySampling(PIXA*, l_float32, l_float32)</code>
     */
    public static native Pixa pixaScaleBySampling(Pixa pixas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIXA* pixaRotate(PIXA*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaRotate(Pixa pixas, float angle, int type, int incolor, int width, int height);

    /**
     * Original signature : <code>PIXA* pixaRotateOrth(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaRotateOrth(Pixa pixas, int rotation);

    /**
     * Original signature :
     * <code>PIXA* pixaTranslate(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaTranslate(Pixa pixas, int hshift, int vshift, int incolor);

    /**
     * Original signature :
     * <code>PIXA* pixaAddBorderGeneral(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pixa pixaAddBorderGeneral(Pixa pixad, Pixa pixas, int left, int right, int top, int bot, int val);

    /**
     * Original signature :
     * <code>PIXA* pixaaFlattenToPixa(PIXAA*, NUMA**, l_int32)</code>
     */
    public static native Pixa pixaaFlattenToPixa(Pixaa paa, PointerByReference pnaindex, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaaSizeRange(PIXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaaSizeRange(Pixaa paa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_ok pixaSizeRange(PIXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixaSizeRange(Pixa pixa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature : <code>PIXA* pixaClipToPix(PIXA*, PIX*)</code>
     */
    public static native Pixa pixaClipToPix(Pixa pixas, Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixaClipToForeground(PIXA*, PIXA**, BOXA**)</code>
     */
    public static native int pixaClipToForeground(Pixa pixas, PointerByReference ppixad, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>l_ok pixaGetRenderingDepth(PIXA*, l_int32*)</code>
     */
    public static native int pixaGetRenderingDepth(Pixa pixa, IntBuffer pdepth);

    /**
     * Original signature : <code>l_ok pixaHasColor(PIXA*, l_int32*)</code>
     */
    public static native int pixaHasColor(Pixa pixa, IntBuffer phascolor);

    /**
     * Original signature : <code>l_ok pixaAnyColormaps(PIXA*, l_int32*)</code>
     */
    public static native int pixaAnyColormaps(Pixa pixa, IntBuffer phascmap);

    /**
     * Original signature :
     * <code>l_ok pixaGetDepthInfo(PIXA*, l_int32*, l_int32*)</code>
     */
    public static native int pixaGetDepthInfo(Pixa pixa, IntBuffer pmaxdepth, IntBuffer psame);

    /**
     * Original signature : <code>PIXA* pixaConvertToSameDepth(PIXA*)</code>
     */
    public static native Pixa pixaConvertToSameDepth(Pixa pixas);

    /**
     * Original signature :
     * <code>PIXA* pixaConvertToGivenDepth(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaConvertToGivenDepth(Pixa pixas, int depth);

    /**
     * Original signature :
     * <code>l_ok pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code>
     */
    public static native int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_ok pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code>
     */
    public static native int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntByReference psame);

    /**
     * Original signature : <code>l_ok pixaSetFullSizeBoxa(PIXA*)</code>
     */
    public static native int pixaSetFullSizeBoxa(Pixa pixa);

    /**
     * Original signature :
     * <code>PIX* pixaDisplay(PIXA*, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplay(Pixa pixa, int w, int h);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayRandomCmap(PIXA*, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplayRandomCmap(Pixa pixa, int w, int h);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayLinearly(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, BOXA**)</code>
     */
    public static native Pix pixaDisplayLinearly(Pixa pixas, int direction, float scalefactor, int background, int spacing, int border, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code>
     */
    public static native Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntBuffer pncols, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code>
     */
    public static native Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntByReference pncols, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayUnsplit(PIXA*, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixaDisplayUnsplit(Pixa pixa, int nx, int ny, int borderwidth, int bordercolor);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiled(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplayTiled(Pixa pixa, int maxwidth, int background, int spacing);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledInRows(PIXA*, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplayTiledInRows(Pixa pixa, int outdepth, int maxwidth, float scalefactor, int background, int spacing, int border);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledInColumns(PIXA*, l_int32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplayTiledInColumns(Pixa pixas, int nx, float scalefactor, int spacing, int border);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledAndScaled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaDisplayTiledAndScaled(Pixa pixa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledWithText(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixaDisplayTiledWithText(Pixa pixa, int maxwidth, float scalefactor, int spacing, int border, int fontsize, int textcolor);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledByIndex(PIXA*, NUMA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixaDisplayTiledByIndex(Pixa pixa, Numa na, int width, int spacing, int border, int fontsize, int textcolor);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayPairTiledInColumns(PIXA*, PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, SARRAY*)</code>
     */
    public static native Pix pixaDisplayPairTiledInColumns(Pixa pixas1, Pixa pixas2, int nx, float scalefactor, int spacing1, int spacing2, int border1, int border2, int fontsize, int startindex, Sarray sa);

    /**
     * Original signature :
     * <code>PIX* pixaaDisplay(PIXAA*, l_int32, l_int32)</code>
     */
    public static native Pix pixaaDisplay(Pixaa paa, int w, int h);

    /**
     * Original signature :
     * <code>PIX* pixaaDisplayByPixa(PIXAA*, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixaaDisplayByPixa(Pixaa paa, int maxnx, float scalefactor, int hspacing, int vspacing, int border);

    /**
     * Original signature :
     * <code>PIXA* pixaaDisplayTiledAndScaled(PIXAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaaDisplayTiledAndScaled(Pixaa paa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);

    /**
     * Original signature : <code>PIXA* pixaConvertTo1(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaConvertTo1(Pixa pixas, int thresh);

    /**
     * Original signature : <code>PIXA* pixaConvertTo8(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaConvertTo8(Pixa pixas, int cmapflag);

    /**
     * Original signature :
     * <code>PIXA* pixaConvertTo8Colormap(PIXA*, l_int32)</code>
     */
    public static native Pixa pixaConvertTo8Colormap(Pixa pixas, int dither);

    /**
     * Original signature : <code>PIXA* pixaConvertTo32(PIXA*)</code>
     */
    public static native Pixa pixaConvertTo32(Pixa pixas);

    /**
     * Original signature :
     * <code>PIXA* pixaConstrainedSelect(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaConstrainedSelect(Pixa pixas, int first, int last, int nmax, int use_pairs, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixaSelectToPdf(PIXA*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32, l_int32, const char*)</code>
     */
    public static native int pixaSelectToPdf(Pixa pixas, int first, int last, int res, float scalefactor, int type, int quality, int color, int fontsize, String fileout);

    /**
     * Original signature :
     * <code>PIXA* pixaMakeFromTiledPixa(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaMakeFromTiledPixa(Pixa pixas, int w, int h, int nsamp);

    /**
     * Original signature :
     * <code>PIXA* pixaMakeFromTiledPix(PIX*, l_int32, l_int32, l_int32, l_int32, BOXA*)</code>
     */
    public static native Pixa pixaMakeFromTiledPix(Pix pixs, int w, int h, int start, int num, Boxa boxa);

    /**
     * Original signature : <code>l_ok pixGetTileCount(PIX*, l_int32*)</code>
     */
    public static native int pixGetTileCount(Pix pix, IntBuffer pn);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayMultiTiled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaDisplayMultiTiled(Pixa pixas, int nx, int ny, int maxw, int maxh, float scalefactor, int spacing, int border);

    /**
     * Original signature :
     * <code>l_ok pixaSplitIntoFiles(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixaSplitIntoFiles(Pixa pixas, int nsplit, float scale, int outwidth, int write_pixa, int write_pix, int write_pdf);

    /**
     * Original signature :
     * <code>l_ok convertToNUpFiles(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code>
     */
    public static native int convertToNUpFiles(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize, String outdir);

    /**
     * Original signature :
     * <code>PIXA* convertToNUpPixa(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa convertToNUpPixa(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize);

    /**
     * Original signature :
     * <code>PIXA* pixaConvertToNUpPixa(PIXA*, SARRAY*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaConvertToNUpPixa(Pixa pixas, Sarray sa, int nx, int ny, int tw, int spacing, int border, int fontsize);

    /**
     * Original signature :
     * <code>l_ok pixaCompareInPdf(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code>
     */
    public static native int pixaCompareInPdf(Pixa pixa1, Pixa pixa2, int nx, int ny, int tw, int spacing, int border, int fontsize, String fileout);

    /**
     * Original signature :
     * <code>l_ok pmsCreate(size_t, size_t, NUMA*, const char*)</code>
     */
    public static native int pmsCreate(NativeSize minsize, NativeSize smallest, Numa numalloc, String logfile);

    /**
     * Original signature : <code>void pmsDestroy()</code>
     */
    public static native void pmsDestroy();

    /**
     * Original signature : <code>void* pmsCustomAlloc(size_t)</code>
     */
    public static native Pointer pmsCustomAlloc(NativeSize nbytes);

    /**
     * Original signature : <code>void pmsCustomDealloc(void*)</code>
     */
    public static native void pmsCustomDealloc(Pointer data);

    /**
     * Original signature : <code>void* pmsGetAlloc(size_t)</code>
     */
    public static native Pointer pmsGetAlloc(NativeSize nbytes);

    /**
     * Original signature :
     * <code>l_ok pmsGetLevelForAlloc(size_t, l_int32*)</code>
     */
    public static native int pmsGetLevelForAlloc(NativeSize nbytes, IntBuffer plevel);

    /**
     * Original signature :
     * <code>l_ok pmsGetLevelForDealloc(void*, l_int32*)</code>
     */
    public static native int pmsGetLevelForDealloc(Pointer data, IntBuffer plevel);

    /**
     * Original signature : <code>void pmsLogInfo()</code>
     */
    public static native void pmsLogInfo();

    /**
     * Original signature : <code>l_ok pixAddConstantGray(PIX*, l_int32)</code>
     */
    public static native int pixAddConstantGray(Pix pixs, int val);

    /**
     * Original signature :
     * <code>l_ok pixMultConstantGray(PIX*, l_float32)</code>
     */
    public static native int pixMultConstantGray(Pix pixs, float val);

    /**
     * Original signature : <code>PIX* pixAddGray(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixAddGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixSubtractGray(PIX*, PIX*, PIX*)</code>
     */
    public static native Pix pixSubtractGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixMultiplyGray(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixMultiplyGray(Pix pixs, Pix pixg, float norm);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToValue(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixThresholdToValue(Pix pixd, Pix pixs, int threshval, int setval);

    /**
     * Original signature :
     * <code>PIX* pixInitAccumulate(l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixInitAccumulate(int w, int h, int offset);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulate(PIX*, l_uint32, l_int32)</code>
     */
    public static native Pix pixFinalAccumulate(Pix pixs, int offset, int depth);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulateThreshold(PIX*, l_uint32, l_uint32)</code>
     */
    public static native Pix pixFinalAccumulateThreshold(Pix pixs, int offset, int threshold);

    /**
     * Original signature : <code>l_ok pixAccumulate(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixAccumulate(Pix pixd, Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_ok pixMultConstAccumulate(PIX*, l_float32, l_uint32)</code>
     */
    public static native int pixMultConstAccumulate(Pix pixs, float factor, int offset);

    /**
     * Original signature : <code>PIX* pixAbsDifference(PIX*, PIX*)</code>
     */
    public static native Pix pixAbsDifference(Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAddRGB(PIX*, PIX*)</code>
     */
    public static native Pix pixAddRGB(Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixMinOrMax(PIX*, PIX*, PIX*, l_int32)</code>
     */
    public static native Pix pixMinOrMax(Pix pixd, Pix pixs1, Pix pixs2, int type);

    /**
     * Original signature : <code>PIX* pixMaxDynamicRange(PIX*, l_int32)</code>
     */
    public static native Pix pixMaxDynamicRange(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaxDynamicRangeRGB(PIX*, l_int32)</code>
     */
    public static native Pix pixMaxDynamicRangeRGB(Pix pixs, int type);

    /**
     * Original signature :
     * <code>l_uint32 linearScaleRGBVal(l_uint32, l_float32)</code>
     */
    public static native int linearScaleRGBVal(int sval, float factor);

    /**
     * Original signature :
     * <code>l_uint32 logScaleRGBVal(l_uint32, l_float32*, l_float32)</code>
     */
    public static native int logScaleRGBVal(int sval, FloatBuffer tab, float factor);

    /**
     * Original signature : <code>l_float32* makeLogBase2Tab()</code>
     */
    public static native FloatByReference makeLogBase2Tab();

    /**
     * Original signature :
     * <code>l_float32 getLogBase2(l_int32, l_float32*)</code>
     */
    public static native float getLogBase2(int val, FloatBuffer logtab);

    /**
     * Original signature :
     * <code>PIXC* pixcompCreateFromPix(PIX*, l_int32)</code>
     */
    public static native PixComp pixcompCreateFromPix(Pix pix, int comptype);

    /**
     * Original signature :
     * <code>PIXC* pixcompCreateFromString(l_uint8*, size_t, l_int32)</code>
     */
    public static native PixComp pixcompCreateFromString(ByteBuffer data, NativeSize size, int copyflag);

    /**
     * Original signature :
     * <code>PIXC* pixcompCreateFromFile(const char*, l_int32)</code>
     */
    public static native PixComp pixcompCreateFromFile(String filename, int comptype);

    /**
     * Original signature : <code>void pixcompDestroy(PIXC**)</code>
     */
    public static native void pixcompDestroy(PointerByReference ppixc);

    /**
     * Original signature : <code>PIXC* pixcompCopy(PIXC*)</code>
     */
    public static native PixComp pixcompCopy(PixComp pixcs);

    /**
     * Original signature :
     * <code>l_ok pixcompGetDimensions(PIXC*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcompGetDimensions(PixComp pixc, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature :
     * <code>l_ok pixcompGetParameters(PIXC*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixcompGetParameters(PixComp pixc, IntBuffer pxres, IntBuffer pyres, IntBuffer pcomptype, IntBuffer pcmapflag);

    /**
     * Original signature :
     * <code>l_ok pixcompDetermineFormat(l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixcompDetermineFormat(int comptype, int d, int cmapflag, IntBuffer pformat);

    /**
     * Original signature : <code>PIX* pixCreateFromPixcomp(PIXC*)</code>
     */
    public static native Pix pixCreateFromPixcomp(PixComp pixc);

    /**
     * Original signature : <code>PIXAC* pixacompCreate(l_int32)</code>
     */
    public static native PixaComp pixacompCreate(int n);

    /**
     * Original signature :
     * <code>PIXAC* pixacompCreateWithInit(l_int32, l_int32, PIX*, l_int32)</code>
     */
    public static native PixaComp pixacompCreateWithInit(int n, int offset, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>PIXAC* pixacompCreateFromPixa(PIXA*, l_int32, l_int32)</code>
     */
    public static native PixaComp pixacompCreateFromPixa(Pixa pixa, int comptype, int accesstype);

    /**
     * Original signature :
     * <code>PIXAC* pixacompCreateFromFiles(const char*, const char*, l_int32)</code>
     */
    public static native PixaComp pixacompCreateFromFiles(String dirname, String substr, int comptype);

    /**
     * Original signature :
     * <code>PIXAC* pixacompCreateFromSA(SARRAY*, l_int32)</code>
     */
    public static native PixaComp pixacompCreateFromSA(Sarray sa, int comptype);

    /**
     * Original signature : <code>void pixacompDestroy(PIXAC**)</code>
     */
    public static native void pixacompDestroy(PointerByReference ppixac);

    /**
     * Original signature :
     * <code>l_ok pixacompAddPix(PIXAC*, PIX*, l_int32)</code>
     */
    public static native int pixacompAddPix(PixaComp pixac, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixacompAddPixcomp(PIXAC*, PIXC*, l_int32)</code>
     */
    public static native int pixacompAddPixcomp(PixaComp pixac, PixComp pixc, int copyflag);

    /**
     * Original signature :
     * <code>l_ok pixacompReplacePix(PIXAC*, l_int32, PIX*, l_int32)</code>
     */
    public static native int pixacompReplacePix(PixaComp pixac, int index, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixacompReplacePixcomp(PIXAC*, l_int32, PIXC*)</code>
     */
    public static native int pixacompReplacePixcomp(PixaComp pixac, int index, PixComp pixc);

    /**
     * Original signature :
     * <code>l_ok pixacompAddBox(PIXAC*, BOX*, l_int32)</code>
     */
    public static native int pixacompAddBox(PixaComp pixac, Box box, int copyflag);

    /**
     * Original signature : <code>l_int32 pixacompGetCount(PIXAC*)</code>
     */
    public static native int pixacompGetCount(PixaComp pixac);

    /**
     * Original signature :
     * <code>PIXC* pixacompGetPixcomp(PIXAC*, l_int32, l_int32)</code>
     */
    public static native PixComp pixacompGetPixcomp(PixaComp pixac, int index, int copyflag);

    /**
     * Original signature : <code>PIX* pixacompGetPix(PIXAC*, l_int32)</code>
     */
    public static native Pix pixacompGetPix(PixaComp pixac, int index);

    /**
     * Original signature :
     * <code>l_ok pixacompGetPixDimensions(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixacompGetPixDimensions(PixaComp pixac, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature : <code>BOXA* pixacompGetBoxa(PIXAC*, l_int32)</code>
     */
    public static native Boxa pixacompGetBoxa(PixaComp pixac, int accesstype);

    /**
     * Original signature : <code>l_int32 pixacompGetBoxaCount(PIXAC*)</code>
     */
    public static native int pixacompGetBoxaCount(PixaComp pixac);

    /**
     * Original signature :
     * <code>BOX* pixacompGetBox(PIXAC*, l_int32, l_int32)</code>
     */
    public static native Box pixacompGetBox(PixaComp pixac, int index, int accesstype);

    /**
     * Original signature :
     * <code>l_ok pixacompGetBoxGeometry(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixacompGetBoxGeometry(PixaComp pixac, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature : <code>l_int32 pixacompGetOffset(PIXAC*)</code>
     */
    public static native int pixacompGetOffset(PixaComp pixac);

    /**
     * Original signature : <code>l_ok pixacompSetOffset(PIXAC*, l_int32)</code>
     */
    public static native int pixacompSetOffset(PixaComp pixac, int offset);

    /**
     * Original signature :
     * <code>PIXA* pixaCreateFromPixacomp(PIXAC*, l_int32)</code>
     */
    public static native Pixa pixaCreateFromPixacomp(PixaComp pixac, int accesstype);

    /**
     * Original signature :
     * <code>l_ok pixacompJoin(PIXAC*, PIXAC*, l_int32, l_int32)</code>
     */
    public static native int pixacompJoin(PixaComp pixacd, PixaComp pixacs, int istart, int iend);

    /**
     * Original signature :
     * <code>PIXAC* pixacompInterleave(PIXAC*, PIXAC*)</code>
     */
    public static native PixaComp pixacompInterleave(PixaComp pixac1, PixaComp pixac2);

    /**
     * Original signature : <code>PIXAC* pixacompRead(const char*)</code>
     */
    public static native PixaComp pixacompRead(String filename);

    /**
     * Original signature : <code>PIXAC* pixacompReadStream(FILE*)</code>
     */
    public static native PixaComp pixacompReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXAC* pixacompReadMem(const l_uint8*, size_t)</code>
     */
    public static native PixaComp pixacompReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok pixacompWrite(const char*, PIXAC*)</code>
     */
    public static native int pixacompWrite(String filename, PixaComp pixac);

    /**
     * Original signature : <code>l_ok pixacompWriteStream(FILE*, PIXAC*)</code>
     */
    public static native int pixacompWriteStream(FILE fp, PixaComp pixac);

    /**
     * Original signature :
     * <code>l_ok pixacompWriteMem(l_uint8**, size_t*, PIXAC*)</code>
     */
    public static native int pixacompWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixaComp pixac);

    /**
     * Original signature :
     * <code>l_ok pixacompConvertToPdf(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int pixacompConvertToPdf(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixacompConvertToPdfData(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code>
     */
    public static native int pixacompConvertToPdfData(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixacompFastConvertToPdfData(PIXAC*, const char*, l_uint8**, size_t*)</code>
     */
    public static native int pixacompFastConvertToPdfData(PixaComp pixac, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_ok pixacompWriteStreamInfo(FILE*, PIXAC*, const char*)</code>
     */
    public static native int pixacompWriteStreamInfo(FILE fp, PixaComp pixac, String text);

    /**
     * Original signature :
     * <code>l_ok pixcompWriteStreamInfo(FILE*, PIXC*, const char*)</code>
     */
    public static native int pixcompWriteStreamInfo(FILE fp, PixComp pixc, String text);

    /**
     * Original signature :
     * <code>PIX* pixacompDisplayTiledAndScaled(PIXAC*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixacompDisplayTiledAndScaled(PixaComp pixac, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);

    /**
     * Original signature :
     * <code>l_ok pixacompWriteFiles(PIXAC*, const char*)</code>
     */
    public static native int pixacompWriteFiles(PixaComp pixac, String subdir);

    /**
     * Original signature :
     * <code>l_ok pixcompWriteFile(const char*, PIXC*)</code>
     */
    public static native int pixcompWriteFile(String rootname, PixComp pixc);

    /**
     * Original signature :
     * <code>PIX* pixThreshold8(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixThreshold8(Pix pixs, int d, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRemoveColormapGeneral(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixRemoveColormapGeneral(Pix pixs, int type, int ifnocmap);

    /**
     * Original signature : <code>PIX* pixRemoveColormap(PIX*, l_int32)</code>
     */
    public static native Pix pixRemoveColormap(Pix pixs, int type);

    /**
     * Original signature : <code>l_ok pixAddGrayColormap8(PIX*)</code>
     */
    public static native int pixAddGrayColormap8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixAddMinimalGrayColormap8(PIX*)</code>
     */
    public static native Pix pixAddMinimalGrayColormap8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToLuminance(PIX*)</code>
     */
    public static native Pix pixConvertRGBToLuminance(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayGeneral(PIX*, l_int32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixConvertRGBToGrayGeneral(Pix pixs, int type, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGray(PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixConvertRGBToGray(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature : <code>PIX* pixConvertRGBToGrayFast(PIX*)</code>
     */
    public static native Pix pixConvertRGBToGrayFast(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayMinMax(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertRGBToGrayMinMax(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGraySatBoost(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertRGBToGraySatBoost(Pix pixs, int refval);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayArb(PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixConvertRGBToGrayArb(Pix pixs, float rc, float gc, float bc);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToBinaryArb(PIX*, l_float32, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pix pixConvertRGBToBinaryArb(Pix pixs, float rc, float gc, float bc, int thresh, int relation);

    /**
     * Original signature : <code>PIX* pixConvertGrayToColormap(PIX*)</code>
     */
    public static native Pix pixConvertGrayToColormap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToColormap8(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertGrayToColormap8(Pix pixs, int mindepth);

    /**
     * Original signature :
     * <code>PIX* pixColorizeGray(PIX*, l_uint32, l_int32)</code>
     */
    public static native Pix pixColorizeGray(Pix pixs, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToColormap(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertRGBToColormap(Pix pixs, int ditherflag);

    /**
     * Original signature : <code>PIX* pixConvertCmapTo1(PIX*)</code>
     */
    public static native Pix pixConvertCmapTo1(Pix pixs);

    /**
     * Original signature :
     * <code>l_ok pixQuantizeIfFewColors(PIX*, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native int pixQuantizeIfFewColors(Pix pixs, int maxcolors, int mingraycolors, int octlevel, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixConvert16To8(PIX*, l_int32)</code>
     */
    public static native Pix pixConvert16To8(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToFalseColor(PIX*, l_float32)</code>
     */
    public static native Pix pixConvertGrayToFalseColor(Pix pixs, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixUnpackBinary(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixUnpackBinary(Pix pixs, int depth, int invert);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To16(PIX*, PIX*, l_uint16, l_uint16)</code>
     */
    public static native Pix pixConvert1To16(Pix pixd, Pix pixs, short val0, short val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To32(PIX*, PIX*, l_uint32, l_uint32)</code>
     */
    public static native Pix pixConvert1To32(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To2Cmap(PIX*)</code>
     */
    public static native Pix pixConvert1To2Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To2(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvert1To2(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To4Cmap(PIX*)</code>
     */
    public static native Pix pixConvert1To4Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To4(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvert1To4(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To8Cmap(PIX*)</code>
     */
    public static native Pix pixConvert1To8Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To8(PIX*, PIX*, l_uint8, l_uint8)</code>
     */
    public static native Pix pixConvert1To8(Pix pixd, Pix pixs, byte val0, byte val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert2To8(PIX*, l_uint8, l_uint8, l_uint8, l_uint8, l_int32)</code>
     */
    public static native Pix pixConvert2To8(Pix pixs, byte val0, byte val1, byte val2, byte val3, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert4To8(PIX*, l_int32)</code>
     */
    public static native Pix pixConvert4To8(Pix pixs, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert8To16(PIX*, l_int32)</code>
     */
    public static native Pix pixConvert8To16(Pix pixs, int leftshift);

    /**
     * Original signature : <code>PIX* pixConvertTo2(PIX*)</code>
     */
    public static native Pix pixConvertTo2(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert8To2(PIX*)</code>
     */
    public static native Pix pixConvert8To2(Pix pix);

    /**
     * Original signature : <code>PIX* pixConvertTo4(PIX*)</code>
     */
    public static native Pix pixConvertTo4(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert8To4(PIX*)</code>
     */
    public static native Pix pixConvert8To4(Pix pix);

    /**
     * Original signature : <code>PIX* pixConvertTo1Adaptive(PIX*)</code>
     */
    public static native Pix pixConvertTo1Adaptive(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertTo1(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertTo1(Pix pixs, int threshold);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo1BySampling(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvertTo1BySampling(Pix pixs, int factor, int threshold);

    /**
     * Original signature : <code>PIX* pixConvertTo8(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertTo8(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8BySampling(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvertTo8BySampling(Pix pixs, int factor, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Colormap(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertTo8Colormap(Pix pixs, int dither);

    /**
     * Original signature : <code>PIX* pixConvertTo16(PIX*)</code>
     */
    public static native Pix pixConvertTo16(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertTo32(PIX*)</code>
     */
    public static native Pix pixConvertTo32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo32BySampling(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertTo32BySampling(Pix pixs, int factor);

    /**
     * Original signature : <code>PIX* pixConvert8To32(PIX*)</code>
     */
    public static native Pix pixConvert8To32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Or32(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvertTo8Or32(Pix pixs, int copyflag, int warnflag);

    /**
     * Original signature : <code>PIX* pixConvert24To32(PIX*)</code>
     */
    public static native Pix pixConvert24To32(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert32To24(PIX*)</code>
     */
    public static native Pix pixConvert32To24(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert32To16(PIX*, l_int32)</code>
     */
    public static native Pix pixConvert32To16(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvert32To8(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConvert32To8(Pix pixs, int type16, int type8);

    /**
     * Original signature : <code>PIX* pixRemoveAlpha(PIX*)</code>
     */
    public static native Pix pixRemoveAlpha(Pix pixs);

    /**
     * Original signature : <code>PIX* pixAddAlphaTo1bpp(PIX*, PIX*)</code>
     */
    public static native Pix pixAddAlphaTo1bpp(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertLossless(PIX*, l_int32)</code>
     */
    public static native Pix pixConvertLossless(Pix pixs, int d);

    /**
     * Original signature : <code>PIX* pixConvertForPSWrap(PIX*)</code>
     */
    public static native Pix pixConvertForPSWrap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixConvertToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixConvertGrayToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertColorToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixConvertColorToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature : <code>void l_setNeutralBoostVal(l_int32)</code>
     */
    public static native void l_setNeutralBoostVal(int val);

    /**
     * Original signature :
     * <code>PIX* pixConnCompTransform(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixConnCompTransform(Pix pixs, int connect, int depth);

    /**
     * Original signature :
     * <code>PIX* pixConnCompAreaTransform(PIX*, l_int32)</code>
     */
    public static native Pix pixConnCompAreaTransform(Pix pixs, int connect);

    /**
     * Original signature :
     * <code>l_ok pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code>
     */
    public static native int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntBuffer pncc);

    /**
     * Original signature :
     * <code>l_ok pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code>
     */
    public static native int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntByReference pncc);

    /**
     * Original signature :
     * <code>l_int32 pixConnCompIncrAdd(PIX*, PTAA*, l_int32*, l_float32, l_float32, l_int32)</code>
     */
    public static native int pixConnCompIncrAdd(Pix pixs, Ptaa ptaa, IntBuffer pncc, float x, float y, int debug);

    /**
     * Original signature :
     * <code>l_ok pixGetSortedNeighborValues(PIX*, l_int32, l_int32, l_int32, l_int32**, l_int32*)</code>
     */
    public static native int pixGetSortedNeighborValues(Pix pixs, int x, int y, int conn, PointerByReference pneigh, IntBuffer pnvals);

    /**
     * Original signature : <code>PIX* pixLocToColorTransform(PIX*)</code>
     */
    public static native Pix pixLocToColorTransform(Pix pixs);

    /**
     * Original signature :
     * <code>PIXTILING* pixTilingCreate(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native PixTiling pixTilingCreate(Pix pixs, int nx, int ny, int w, int h, int xoverlap, int yoverlap);

    /**
     * Original signature : <code>void pixTilingDestroy(PIXTILING**)</code>
     */
    public static native void pixTilingDestroy(PointerByReference ppt);

    /**
     * Original signature :
     * <code>l_ok pixTilingGetCount(PIXTILING*, l_int32*, l_int32*)</code>
     */
    public static native int pixTilingGetCount(PixTiling pt, IntBuffer pnx, IntBuffer pny);

    /**
     * Original signature :
     * <code>l_ok pixTilingGetSize(PIXTILING*, l_int32*, l_int32*)</code>
     */
    public static native int pixTilingGetSize(PixTiling pt, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>PIX* pixTilingGetTile(PIXTILING*, l_int32, l_int32)</code>
     */
    public static native Pix pixTilingGetTile(PixTiling pt, int i, int j);

    /**
     * Original signature :
     * <code>l_ok pixTilingNoStripOnPaint(PIXTILING*)</code>
     */
    public static native int pixTilingNoStripOnPaint(PixTiling pt);

    /**
     * Original signature :
     * <code>l_ok pixTilingPaintTile(PIX*, l_int32, l_int32, PIX*, PIXTILING*)</code>
     */
    public static native int pixTilingPaintTile(Pix pixd, int i, int j, Pix pixs, PixTiling pt);

    /**
     * Original signature : <code>PIX* pixReadStreamPng(FILE*)</code>
     */
    public static native Pix pixReadStreamPng(FILE fp);

    /**
     * Original signature :
     * <code>l_ok readHeaderPng(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderPng(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok freadHeaderPng(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderPng(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemPng(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemPng(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 fgetPngResolution(FILE*, l_int32*, l_int32*)</code>
     */
    public static native int fgetPngResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok isPngInterlaced(const char*, l_int32*)</code>
     */
    public static native int isPngInterlaced(String filename, IntBuffer pinterlaced);

    /**
     * Original signature :
     * <code>l_ok fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code>
     */
    public static native int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntBuffer ptransparency);

    /**
     * Original signature :
     * <code>l_ok fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code>
     */
    public static native int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntByReference ptransparency);

    /**
     * Original signature :
     * <code>l_ok pixWritePng(const char*, PIX*, l_float32)</code>
     */
    public static native int pixWritePng(String filename, Pix pix, float gamma);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamPng(FILE*, PIX*, l_float32)</code>
     */
    public static native int pixWriteStreamPng(FILE fp, Pix pix, float gamma);

    /**
     * Original signature :
     * <code>l_ok pixSetZlibCompression(PIX*, l_int32)</code>
     */
    public static native int pixSetZlibCompression(Pix pix, int compval);

    /**
     * Original signature : <code>void l_pngSetReadStrip16To8(l_int32)</code>
     */
    public static native void l_pngSetReadStrip16To8(int flag);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPng(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemPng(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPng(l_uint8**, size_t*, PIX*, l_float32)</code>
     */
    public static native int pixWriteMemPng(PointerByReference pfiledata, NativeSizeByReference pfilesize, Pix pix, float gamma);

    /**
     * Original signature : <code>PIX* pixReadStreamPnm(FILE*)</code>
     */
    public static native Pix pixReadStreamPnm(FILE fp);

    /**
     * Original signature :
     * <code>l_ok readHeaderPnm(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderPnm(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok freadHeaderPnm(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderPnm(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);

    /**
     * Original signature : <code>l_ok pixWriteStreamPnm(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamPnm(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamAsciiPnm(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamAsciiPnm(FILE fp, Pix pix);

    /**
     * Original signature : <code>l_ok pixWriteStreamPam(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamPam(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPnm(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemPnm(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemPnm(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemPnm(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPnm(l_uint8**, size_t*, PIX*)</code>
     */
    public static native int pixWriteMemPnm(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPam(l_uint8**, size_t*, PIX*)</code>
     */
    public static native int pixWriteMemPam(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixProjectiveSampledPta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixProjectiveSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixProjectiveSampled(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixProjectiveSampled(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixProjectivePta(PIX*, PTA*, PTA*, l_int32)</code>
     */
    public static native Pix pixProjectivePta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixProjective(PIX*, l_float32*, l_int32)</code>
     */
    public static native Pix pixProjective(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixProjectivePtaColor(PIX*, PTA*, PTA*, l_uint32)</code>
     */
    public static native Pix pixProjectivePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixProjectiveColor(PIX*, l_float32*, l_uint32)</code>
     */
    public static native Pix pixProjectiveColor(Pix pixs, FloatBuffer vc, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixProjectivePtaGray(PIX*, PTA*, PTA*, l_uint8)</code>
     */
    public static native Pix pixProjectivePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixProjectiveGray(PIX*, l_float32*, l_uint8)</code>
     */
    public static native Pix pixProjectiveGray(Pix pixs, FloatBuffer vc, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixProjectivePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixProjectivePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);

    /**
     * Original signature :
     * <code>l_ok getProjectiveXformCoeffs(PTA*, PTA*, l_float32**)</code>
     */
    public static native int getProjectiveXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);

    /**
     * Original signature :
     * <code>l_ok projectiveXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int projectiveXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok projectiveXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int projectiveXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);

    /**
     * Original signature :
     * <code>l_ok convertFilesToPS(const char*, const char*, l_int32, const char*)</code>
     */
    public static native int convertFilesToPS(String dirin, String substr, int res, String fileout);

    /**
     * Original signature :
     * <code>l_ok sarrayConvertFilesToPS(SARRAY*, l_int32, const char*)</code>
     */
    public static native int sarrayConvertFilesToPS(Sarray sa, int res, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertFilesFittedToPS(const char*, const char*, l_float32, l_float32, const char*)</code>
     */
    public static native int convertFilesFittedToPS(String dirin, String substr, float xpts, float ypts, String fileout);

    /**
     * Original signature :
     * <code>l_ok sarrayConvertFilesFittedToPS(SARRAY*, l_float32, l_float32, const char*)</code>
     */
    public static native int sarrayConvertFilesFittedToPS(Sarray sa, float xpts, float ypts, String fileout);

    /**
     * Original signature :
     * <code>l_ok writeImageCompressedToPSFile(const char*, const char*, l_int32, l_int32*)</code>
     */
    public static native int writeImageCompressedToPSFile(String filein, String fileout, int res, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok convertSegmentedPagesToPS(const char*, const char*, l_int32, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, const char*)</code>
     */
    public static native int convertSegmentedPagesToPS(String pagedir, String pagestr, int page_numpre, String maskdir, String maskstr, int mask_numpre, int numpost, int maxnum, float textscale, float imagescale, int threshold, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixWriteSegmentedPageToPS(PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, const char*)</code>
     */
    public static native int pixWriteSegmentedPageToPS(Pix pixs, Pix pixm, float textscale, float imagescale, int threshold, int pageno, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixWriteMixedToPS(PIX*, PIX*, l_float32, l_int32, const char*)</code>
     */
    public static native int pixWriteMixedToPS(Pix pixb, Pix pixc, float scale, int pageno, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertToPSEmbed(const char*, const char*, l_int32)</code>
     */
    public static native int convertToPSEmbed(String filein, String fileout, int level);

    /**
     * Original signature :
     * <code>l_ok pixaWriteCompressedToPS(PIXA*, const char*, l_int32, l_int32)</code>
     */
    public static native int pixaWriteCompressedToPS(Pixa pixa, String fileout, int res, int level);

    /**
     * Original signature :
     * <code>l_ok pixWriteCompressedToPS(PIX*, const char*, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixWriteCompressedToPS(Pix pix, String fileout, int res, int level, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok pixWritePSEmbed(const char*, const char*)</code>
     */
    public static native int pixWritePSEmbed(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamPS(FILE*, PIX*, BOX*, l_int32, l_float32)</code>
     */
    public static native int pixWriteStreamPS(FILE fp, Pix pix, Box box, int res, float scale);

    /**
     * Original signature :
     * <code>char* pixWriteStringPS(PIX*, BOX*, l_int32, l_float32)</code>
     */
    public static native Pointer pixWriteStringPS(Pix pixs, Box box, int res, float scale);

    /**
     * Original signature :
     * <code>char* generateUncompressedPS(char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code>
     */
    public static native Pointer generateUncompressedPS(ByteBuffer hexdata, int w, int h, int d, int psbpl, int bps, float xpt, float ypt, float wpt, float hpt, int boxflag);

    /**
     * Original signature :
     * <code>l_ok convertJpegToPSEmbed(const char*, const char*)</code>
     */
    public static native int convertJpegToPSEmbed(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertJpegToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
     */
    public static native int convertJpegToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);

    /**
     * Original signature :
     * <code>l_ok convertG4ToPSEmbed(const char*, const char*)</code>
     */
    public static native int convertG4ToPSEmbed(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertG4ToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native int convertG4ToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int maskflag, int endpage);

    /**
     * Original signature :
     * <code>l_ok convertTiffMultipageToPS(const char*, const char*, l_float32)</code>
     */
    public static native int convertTiffMultipageToPS(String filein, String fileout, float fillfract);

    /**
     * Original signature :
     * <code>l_ok convertFlateToPSEmbed(const char*, const char*)</code>
     */
    public static native int convertFlateToPSEmbed(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_ok convertFlateToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code>
     */
    public static native int convertFlateToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemPS(l_uint8**, size_t*, PIX*, BOX*, l_int32, l_float32)</code>
     */
    public static native int pixWriteMemPS(PointerByReference pdata, NativeSizeByReference psize, Pix pix, Box box, int res, float scale);

    /**
     * Original signature :
     * <code>l_int32 getResLetterPage(l_int32, l_int32, l_float32)</code>
     */
    public static native int getResLetterPage(int w, int h, float fillfract);

    /**
     * Original signature :
     * <code>l_int32 getResA4Page(l_int32, l_int32, l_float32)</code>
     */
    public static native int getResA4Page(int w, int h, float fillfract);

    /**
     * Original signature : <code>void l_psWriteBoundingBox(l_int32)</code>
     */
    public static native void l_psWriteBoundingBox(int flag);

    /**
     * Original signature : <code>PTA* ptaCreate(l_int32)</code>
     */
    public static native Pta ptaCreate(int n);

    /**
     * Original signature : <code>PTA* ptaCreateFromNuma(NUMA*, NUMA*)</code>
     */
    public static native Pta ptaCreateFromNuma(Numa nax, Numa nay);

    /**
     * Original signature : <code>void ptaDestroy(PTA**)</code>
     */
    public static native void ptaDestroy(PointerByReference ppta);

    /**
     * Original signature : <code>PTA* ptaCopy(PTA*)</code>
     */
    public static native Pta ptaCopy(Pta pta);

    /**
     * Original signature :
     * <code>PTA* ptaCopyRange(PTA*, l_int32, l_int32)</code>
     */
    public static native Pta ptaCopyRange(Pta ptas, int istart, int iend);

    /**
     * Original signature : <code>PTA* ptaClone(PTA*)</code>
     */
    public static native Pta ptaClone(Pta pta);

    /**
     * Original signature : <code>l_ok ptaEmpty(PTA*)</code>
     */
    public static native int ptaEmpty(Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaAddPt(PTA*, l_float32, l_float32)</code>
     */
    public static native int ptaAddPt(Pta pta, float x, float y);

    /**
     * Original signature :
     * <code>l_ok ptaInsertPt(PTA*, l_int32, l_int32, l_int32)</code>
     */
    public static native int ptaInsertPt(Pta pta, int index, int x, int y);

    /**
     * Original signature : <code>l_ok ptaRemovePt(PTA*, l_int32)</code>
     */
    public static native int ptaRemovePt(Pta pta, int index);

    /**
     * Original signature : <code>l_int32 ptaGetCount(PTA*)</code>
     */
    public static native int ptaGetCount(Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaGetPt(PTA*, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int ptaGetPt(Pta pta, int index, FloatBuffer px, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_ok ptaGetIPt(PTA*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int ptaGetIPt(Pta pta, int index, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>l_ok ptaSetPt(PTA*, l_int32, l_float32, l_float32)</code>
     */
    public static native int ptaSetPt(Pta pta, int index, float x, float y);

    /**
     * Original signature : <code>l_ok ptaGetArrays(PTA*, NUMA**, NUMA**)</code>
     */
    public static native int ptaGetArrays(Pta pta, PointerByReference pnax, PointerByReference pnay);

    /**
     * Original signature : <code>PTA* ptaRead(const char*)</code>
     */
    public static native Pta ptaRead(String filename);

    /**
     * Original signature : <code>PTA* ptaReadStream(FILE*)</code>
     */
    public static native Pta ptaReadStream(FILE fp);

    /**
     * Original signature : <code>PTA* ptaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Pta ptaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok ptaWriteDebug(const char*, PTA*, l_int32)</code>
     */
    public static native int ptaWriteDebug(String filename, Pta pta, int type);

    /**
     * Original signature :
     * <code>l_ok ptaWrite(const char*, PTA*, l_int32)</code>
     */
    public static native int ptaWrite(String filename, Pta pta, int type);

    /**
     * Original signature :
     * <code>l_ok ptaWriteStream(FILE*, PTA*, l_int32)</code>
     */
    public static native int ptaWriteStream(FILE fp, Pta pta, int type);

    /**
     * Original signature :
     * <code>l_ok ptaWriteMem(l_uint8**, size_t*, PTA*, l_int32)</code>
     */
    public static native int ptaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pta pta, int type);

    /**
     * Original signature : <code>PTAA* ptaaCreate(l_int32)</code>
     */
    public static native Ptaa ptaaCreate(int n);

    /**
     * Original signature : <code>void ptaaDestroy(PTAA**)</code>
     */
    public static native void ptaaDestroy(PointerByReference pptaa);

    /**
     * Original signature : <code>l_ok ptaaAddPta(PTAA*, PTA*, l_int32)</code>
     */
    public static native int ptaaAddPta(Ptaa ptaa, Pta pta, int copyflag);

    /**
     * Original signature : <code>l_int32 ptaaGetCount(PTAA*)</code>
     */
    public static native int ptaaGetCount(Ptaa ptaa);

    /**
     * Original signature :
     * <code>PTA* ptaaGetPta(PTAA*, l_int32, l_int32)</code>
     */
    public static native Pta ptaaGetPta(Ptaa ptaa, int index, int accessflag);

    /**
     * Original signature :
     * <code>l_ok ptaaGetPt(PTAA*, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native int ptaaGetPt(Ptaa ptaa, int ipta, int jpt, FloatBuffer px, FloatBuffer py);

    /**
     * Original signature : <code>l_ok ptaaInitFull(PTAA*, PTA*)</code>
     */
    public static native int ptaaInitFull(Ptaa ptaa, Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaaReplacePta(PTAA*, l_int32, PTA*)</code>
     */
    public static native int ptaaReplacePta(Ptaa ptaa, int index, Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaaAddPt(PTAA*, l_int32, l_float32, l_float32)</code>
     */
    public static native int ptaaAddPt(Ptaa ptaa, int ipta, float x, float y);

    /**
     * Original signature : <code>l_ok ptaaTruncate(PTAA*)</code>
     */
    public static native int ptaaTruncate(Ptaa ptaa);

    /**
     * Original signature : <code>PTAA* ptaaRead(const char*)</code>
     */
    public static native Ptaa ptaaRead(String filename);

    /**
     * Original signature : <code>PTAA* ptaaReadStream(FILE*)</code>
     */
    public static native Ptaa ptaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PTAA* ptaaReadMem(const l_uint8*, size_t)</code>
     */
    public static native Ptaa ptaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok ptaaWriteDebug(const char*, PTAA*, l_int32)</code>
     */
    public static native int ptaaWriteDebug(String filename, Ptaa ptaa, int type);

    /**
     * Original signature :
     * <code>l_ok ptaaWrite(const char*, PTAA*, l_int32)</code>
     */
    public static native int ptaaWrite(String filename, Ptaa ptaa, int type);

    /**
     * Original signature :
     * <code>l_ok ptaaWriteStream(FILE*, PTAA*, l_int32)</code>
     */
    public static native int ptaaWriteStream(FILE fp, Ptaa ptaa, int type);

    /**
     * Original signature :
     * <code>l_ok ptaaWriteMem(l_uint8**, size_t*, PTAA*, l_int32)</code>
     */
    public static native int ptaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Ptaa ptaa, int type);

    /**
     * Original signature : <code>PTA* ptaSubsample(PTA*, l_int32)</code>
     */
    public static native Pta ptaSubsample(Pta ptas, int subfactor);

    /**
     * Original signature :
     * <code>l_ok ptaJoin(PTA*, PTA*, l_int32, l_int32)</code>
     */
    public static native int ptaJoin(Pta ptad, Pta ptas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_ok ptaaJoin(PTAA*, PTAA*, l_int32, l_int32)</code>
     */
    public static native int ptaaJoin(Ptaa ptaad, Ptaa ptaas, int istart, int iend);

    /**
     * Original signature : <code>PTA* ptaReverse(PTA*, l_int32)</code>
     */
    public static native Pta ptaReverse(Pta ptas, int type);

    /**
     * Original signature : <code>PTA* ptaTranspose(PTA*)</code>
     */
    public static native Pta ptaTranspose(Pta ptas);

    /**
     * Original signature :
     * <code>PTA* ptaCyclicPerm(PTA*, l_int32, l_int32)</code>
     */
    public static native Pta ptaCyclicPerm(Pta ptas, int xs, int ys);

    /**
     * Original signature :
     * <code>PTA* ptaSelectRange(PTA*, l_int32, l_int32)</code>
     */
    public static native Pta ptaSelectRange(Pta ptas, int first, int last);

    /**
     * Original signature : <code>BOX* ptaGetBoundingRegion(PTA*)</code>
     */
    public static native Box ptaGetBoundingRegion(Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaGetRange(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int ptaGetRange(Pta pta, FloatBuffer pminx, FloatBuffer pmaxx, FloatBuffer pminy, FloatBuffer pmaxy);

    /**
     * Original signature : <code>PTA* ptaGetInsideBox(PTA*, BOX*)</code>
     */
    public static native Pta ptaGetInsideBox(Pta ptas, Box box);

    /**
     * Original signature : <code>PTA* pixFindCornerPixels(PIX*)</code>
     */
    public static native Pta pixFindCornerPixels(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 ptaContainsPt(PTA*, l_int32, l_int32)</code>
     */
    public static native int ptaContainsPt(Pta pta, int x, int y);

    /**
     * Original signature : <code>l_int32 ptaTestIntersection(PTA*, PTA*)</code>
     */
    public static native int ptaTestIntersection(Pta pta1, Pta pta2);

    /**
     * Original signature :
     * <code>PTA* ptaTransform(PTA*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Pta ptaTransform(Pta ptas, int shiftx, int shifty, float scalex, float scaley);

    /**
     * Original signature :
     * <code>l_int32 ptaPtInsidePolygon(PTA*, l_float32, l_float32, l_int32*)</code>
     */
    public static native int ptaPtInsidePolygon(Pta pta, float x, float y, IntBuffer pinside);

    /**
     * Original signature :
     * <code>l_float32 l_angleBetweenVectors(l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native float l_angleBetweenVectors(float x1, float y1, float x2, float y2);

    /**
     * Original signature :
     * <code>l_int32 ptaPolygonIsConvex(PTA*, l_int32*)</code>
     */
    public static native int ptaPolygonIsConvex(Pta pta, IntBuffer pisconvex);

    /**
     * Original signature :
     * <code>l_ok ptaGetMinMax(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int ptaGetMinMax(Pta pta, FloatBuffer pxmin, FloatBuffer pymin, FloatBuffer pxmax, FloatBuffer pymax);

    /**
     * Original signature :
     * <code>PTA* ptaSelectByValue(PTA*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Pta ptaSelectByValue(Pta ptas, float xth, float yth, int type, int relation);

    /**
     * Original signature : <code>PTA* ptaCropToMask(PTA*, PIX*)</code>
     */
    public static native Pta ptaCropToMask(Pta ptas, Pix pixm);

    /**
     * Original signature :
     * <code>l_ok ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetLinearLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetLinearLSF(Pta pta, FloatByReference pa, FloatByReference pb, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetQuadraticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetQuadraticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetCubicLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetCubicLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetQuarticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, FloatBuffer pe, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaGetQuarticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, FloatByReference pe, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pmederr, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pmederr, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pmederr, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code>
     */
    public static native int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pmederr, PointerByReference pnafit);

    /**
     * Original signature :
     * <code>l_ok applyLinearFit(l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int applyLinearFit(float a, float b, float x, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_ok applyQuadraticFit(l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int applyQuadraticFit(float a, float b, float c, float x, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_ok applyCubicFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int applyCubicFit(float a, float b, float c, float d, float x, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_ok applyQuarticFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code>
     */
    public static native int applyQuarticFit(float a, float b, float c, float d, float e, float x, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_ok pixPlotAlongPta(PIX*, PTA*, l_int32, const char*)</code>
     */
    public static native int pixPlotAlongPta(Pix pixs, Pta pta, int outformat, String title);

    /**
     * Original signature : <code>PTA* ptaGetPixelsFromPix(PIX*, BOX*)</code>
     */
    public static native Pta ptaGetPixelsFromPix(Pix pixs, Box box);

    /**
     * Original signature :
     * <code>PIX* pixGenerateFromPta(PTA*, l_int32, l_int32)</code>
     */
    public static native Pix pixGenerateFromPta(Pta pta, int w, int h);

    /**
     * Original signature :
     * <code>PTA* ptaGetBoundaryPixels(PIX*, l_int32)</code>
     */
    public static native Pta ptaGetBoundaryPixels(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PTAA* ptaaGetBoundaryPixels(PIX*, l_int32, l_int32, BOXA**, PIXA**)</code>
     */
    public static native Ptaa ptaaGetBoundaryPixels(Pix pixs, int type, int connectivity, PointerByReference pboxa, PointerByReference ppixa);

    /**
     * Original signature :
     * <code>PTAA* ptaaIndexLabeledPixels(PIX*, l_int32*)</code>
     */
    public static native Ptaa ptaaIndexLabeledPixels(Pix pixs, IntBuffer pncc);

    /**
     * Original signature :
     * <code>PTA* ptaGetNeighborPixLocs(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta ptaGetNeighborPixLocs(Pix pixs, int x, int y, int conn);

    /**
     * Original signature : <code>PTA* numaConvertToPta1(NUMA*)</code>
     */
    public static native Pta numaConvertToPta1(Numa na);

    /**
     * Original signature : <code>PTA* numaConvertToPta2(NUMA*, NUMA*)</code>
     */
    public static native Pta numaConvertToPta2(Numa nax, Numa nay);

    /**
     * Original signature :
     * <code>l_ok ptaConvertToNuma(PTA*, NUMA**, NUMA**)</code>
     */
    public static native int ptaConvertToNuma(Pta pta, PointerByReference pnax, PointerByReference pnay);

    /**
     * Original signature : <code>PIX* pixDisplayPta(PIX*, PIX*, PTA*)</code>
     */
    public static native Pix pixDisplayPta(Pix pixd, Pix pixs, Pta pta);

    /**
     * Original signature :
     * <code>PIX* pixDisplayPtaaPattern(PIX*, PIX*, PTAA*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixDisplayPtaaPattern(Pix pixd, Pix pixs, Ptaa ptaa, Pix pixp, int cx, int cy);

    /**
     * Original signature :
     * <code>PIX* pixDisplayPtaPattern(PIX*, PIX*, PTA*, PIX*, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixDisplayPtaPattern(Pix pixd, Pix pixs, Pta pta, Pix pixp, int cx, int cy, int color);

    /**
     * Original signature :
     * <code>PTA* ptaReplicatePattern(PTA*, PIX*, PTA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pta ptaReplicatePattern(Pta ptas, Pix pixp, Pta ptap, int cx, int cy, int w, int h);

    /**
     * Original signature : <code>PIX* pixDisplayPtaa(PIX*, PTAA*)</code>
     */
    public static native Pix pixDisplayPtaa(Pix pixs, Ptaa ptaa);

    /**
     * Original signature :
     * <code>PTA* ptaSort(PTA*, l_int32, l_int32, NUMA**)</code>
     */
    public static native Pta ptaSort(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);

    /**
     * Original signature :
     * <code>l_ok ptaGetSortIndex(PTA*, l_int32, l_int32, NUMA**)</code>
     */
    public static native int ptaGetSortIndex(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);

    /**
     * Original signature : <code>PTA* ptaSortByIndex(PTA*, NUMA*)</code>
     */
    public static native Pta ptaSortByIndex(Pta ptas, Numa naindex);

    /**
     * Original signature : <code>PTAA* ptaaSortByIndex(PTAA*, NUMA*)</code>
     */
    public static native Ptaa ptaaSortByIndex(Ptaa ptaas, Numa naindex);

    /**
     * Original signature :
     * <code>l_ok ptaGetRankValue(PTA*, l_float32, PTA*, l_int32, l_float32*)</code>
     */
    public static native int ptaGetRankValue(Pta pta, float fract, Pta ptasort, int sorttype, FloatBuffer pval);

    /**
     * Original signature : <code>PTA* ptaSort2d(PTA*)</code>
     */
    public static native Pta ptaSort2d(Pta pta);

    /**
     * Original signature : <code>l_ok ptaEqual(PTA*, PTA*, l_int32*)</code>
     */
    public static native int ptaEqual(Pta pta1, Pta pta2, IntBuffer psame);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromPta(PTA*)</code>
     */
    public static native L_Rbtree l_asetCreateFromPta(Pta pta);

    /**
     * Original signature : <code>l_ok ptaRemoveDupsByAset(PTA*, PTA**)</code>
     */
    public static native int ptaRemoveDupsByAset(Pta ptas, PointerByReference pptad);

    /**
     * Original signature : <code>l_ok ptaUnionByAset(PTA*, PTA*, PTA**)</code>
     */
    public static native int ptaUnionByAset(Pta pta1, Pta pta2, PointerByReference pptad);

    /**
     * Original signature :
     * <code>l_ok ptaIntersectionByAset(PTA*, PTA*, PTA**)</code>
     */
    public static native int ptaIntersectionByAset(Pta pta1, Pta pta2, PointerByReference pptad);

    /**
     * Original signature : <code>L_HASHMAP* l_hmapCreateFromPta(PTA*)</code>
     */
    public static native L_Hashmap l_hmapCreateFromPta(Pta pta);

    /**
     * Original signature :
     * <code>l_ok ptaRemoveDupsByHmap(PTA*, PTA**, L_HASHMAP**)</code>
     */
    public static native int ptaRemoveDupsByHmap(Pta ptas, PointerByReference pptad, PointerByReference phmap);

    /**
     * Original signature : <code>l_ok ptaUnionByHmap(PTA*, PTA*, PTA**)</code>
     */
    public static native int ptaUnionByHmap(Pta pta1, Pta pta2, PointerByReference pptad);

    /**
     * Original signature :
     * <code>l_ok ptaIntersectionByHmap(PTA*, PTA*, PTA**)</code>
     */
    public static native int ptaIntersectionByHmap(Pta pta1, Pta pta2, PointerByReference pptad);

    /**
     * Original signature : <code>L_PTRA* ptraCreate(l_int32)</code>
     */
    public static native L_Ptra ptraCreate(int n);

    /**
     * Original signature :
     * <code>void ptraDestroy(L_PTRA**, l_int32, l_int32)</code>
     */
    public static native void ptraDestroy(PointerByReference ppa, int freeflag, int warnflag);

    /**
     * Original signature : <code>l_ok ptraAdd(L_PTRA*, void*)</code>
     */
    public static native int ptraAdd(L_Ptra pa, Pointer item);

    /**
     * Original signature :
     * <code>l_ok ptraInsert(L_PTRA*, l_int32, void*, l_int32)</code>
     */
    public static native int ptraInsert(L_Ptra pa, int index, Pointer item, int shiftflag);

    /**
     * Original signature :
     * <code>void* ptraRemove(L_PTRA*, l_int32, l_int32)</code>
     */
    public static native Pointer ptraRemove(L_Ptra pa, int index, int flag);

    /**
     * Original signature : <code>void* ptraRemoveLast(L_PTRA*)</code>
     */
    public static native Pointer ptraRemoveLast(L_Ptra pa);

    /**
     * Original signature :
     * <code>void* ptraReplace(L_PTRA*, l_int32, void*, l_int32)</code>
     */
    public static native Pointer ptraReplace(L_Ptra pa, int index, Pointer item, int freeflag);

    /**
     * Original signature :
     * <code>l_ok ptraSwap(L_PTRA*, l_int32, l_int32)</code>
     */
    public static native int ptraSwap(L_Ptra pa, int index1, int index2);

    /**
     * Original signature : <code>l_ok ptraCompactArray(L_PTRA*)</code>
     */
    public static native int ptraCompactArray(L_Ptra pa);

    /**
     * Original signature : <code>l_ok ptraReverse(L_PTRA*)</code>
     */
    public static native int ptraReverse(L_Ptra pa);

    /**
     * Original signature : <code>l_ok ptraJoin(L_PTRA*, L_PTRA*)</code>
     */
    public static native int ptraJoin(L_Ptra pa1, L_Ptra pa2);

    /**
     * Original signature : <code>l_ok ptraGetMaxIndex(L_PTRA*, l_int32*)</code>
     */
    public static native int ptraGetMaxIndex(L_Ptra pa, IntBuffer pmaxindex);

    /**
     * Original signature :
     * <code>l_ok ptraGetActualCount(L_PTRA*, l_int32*)</code>
     */
    public static native int ptraGetActualCount(L_Ptra pa, IntBuffer pcount);

    /**
     * Original signature :
     * <code>void* ptraGetPtrToItem(L_PTRA*, l_int32)</code>
     */
    public static native Pointer ptraGetPtrToItem(L_Ptra pa, int index);

    /**
     * Original signature : <code>L_PTRAA* ptraaCreate(l_int32)</code>
     */
    public static native L_Ptraa ptraaCreate(int n);

    /**
     * Original signature :
     * <code>void ptraaDestroy(L_PTRAA**, l_int32, l_int32)</code>
     */
    public static native void ptraaDestroy(PointerByReference ppaa, int freeflag, int warnflag);

    /**
     * Original signature : <code>l_ok ptraaGetSize(L_PTRAA*, l_int32*)</code>
     */
    public static native int ptraaGetSize(L_Ptraa paa, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_ok ptraaInsertPtra(L_PTRAA*, l_int32, L_PTRA*)</code>
     */
    public static native int ptraaInsertPtra(L_Ptraa paa, int index, L_Ptra pa);

    /**
     * Original signature :
     * <code>L_PTRA* ptraaGetPtra(L_PTRAA*, l_int32, l_int32)</code>
     */
    public static native L_Ptra ptraaGetPtra(L_Ptraa paa, int index, int accessflag);

    /**
     * Original signature : <code>L_PTRA* ptraaFlattenToPtra(L_PTRAA*)</code>
     */
    public static native L_Ptra ptraaFlattenToPtra(L_Ptraa paa);

    /**
     * Original signature :
     * <code>l_ok pixQuadtreeMean(PIX*, l_int32, PIX*, FPIXA**)</code>
     */
    public static native int pixQuadtreeMean(Pix pixs, int nlevels, Pix pix_ma, PointerByReference pfpixa);

    /**
     * Original signature :
     * <code>l_ok pixQuadtreeVariance(PIX*, l_int32, PIX*, DPIX*, FPIXA**, FPIXA**)</code>
     */
    public static native int pixQuadtreeVariance(Pix pixs, int nlevels, Pix pix_ma, DPix dpix_msa, PointerByReference pfpixa_v, PointerByReference pfpixa_rv);

    /**
     * Original signature :
     * <code>l_ok pixMeanInRectangle(PIX*, BOX*, PIX*, l_float32*)</code>
     */
    public static native int pixMeanInRectangle(Pix pixs, Box box, Pix pixma, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok pixVarianceInRectangle(PIX*, BOX*, PIX*, DPIX*, l_float32*, l_float32*)</code>
     */
    public static native int pixVarianceInRectangle(Pix pixs, Box box, Pix pix_ma, DPix dpix_msa, FloatBuffer pvar, FloatBuffer prvar);

    /**
     * Original signature :
     * <code>BOXAA* boxaaQuadtreeRegions(l_int32, l_int32, l_int32)</code>
     */
    public static native Boxaa boxaaQuadtreeRegions(int w, int h, int nlevels);

    /**
     * Original signature :
     * <code>l_ok quadtreeGetParent(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code>
     */
    public static native int quadtreeGetParent(FPixa fpixa, int level, int x, int y, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_ok quadtreeGetChildren(FPIXA*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int quadtreeGetChildren(FPixa fpixa, int level, int x, int y, FloatBuffer pval00, FloatBuffer pval10, FloatBuffer pval01, FloatBuffer pval11);

    /**
     * Original signature :
     * <code>l_int32 quadtreeMaxLevels(l_int32, l_int32)</code>
     */
    public static native int quadtreeMaxLevels(int w, int h);

    /**
     * Original signature :
     * <code>PIX* fpixaDisplayQuadtree(FPIXA*, l_int32, l_int32)</code>
     */
    public static native Pix fpixaDisplayQuadtree(FPixa fpixa, int factor, int fontsize);

    /**
     * Original signature : <code>L_QUEUE* lqueueCreate(l_int32)</code>
     */
    public static native L_Queue lqueueCreate(int nalloc);

    /**
     * Original signature : <code>void lqueueDestroy(L_QUEUE**, l_int32)</code>
     */
    public static native void lqueueDestroy(PointerByReference plq, int freeflag);

    /**
     * Original signature : <code>l_ok lqueueAdd(L_QUEUE*, void*)</code>
     */
    public static native int lqueueAdd(L_Queue lq, Pointer item);

    /**
     * Original signature : <code>void* lqueueRemove(L_QUEUE*)</code>
     */
    public static native Pointer lqueueRemove(L_Queue lq);

    /**
     * Original signature : <code>l_int32 lqueueGetCount(L_QUEUE*)</code>
     */
    public static native int lqueueGetCount(L_Queue lq);

    /**
     * Original signature : <code>l_ok lqueuePrint(FILE*, L_QUEUE*)</code>
     */
    public static native int lqueuePrint(FILE fp, L_Queue lq);

    /**
     * Original signature :
     * <code>PIX* pixRankFilter(PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixRankFilter(Pix pixs, int wf, int hf, float rank);

    /**
     * Original signature :
     * <code>PIX* pixRankFilterRGB(PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixRankFilterRGB(Pix pixs, int wf, int hf, float rank);

    /**
     * Original signature :
     * <code>PIX* pixRankFilterGray(PIX*, l_int32, l_int32, l_float32)</code>
     */
    public static native Pix pixRankFilterGray(Pix pixs, int wf, int hf, float rank);

    /**
     * Original signature :
     * <code>PIX* pixMedianFilter(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixMedianFilter(Pix pixs, int wf, int hf);

    /**
     * Original signature :
     * <code>PIX* pixRankFilterWithScaling(PIX*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native Pix pixRankFilterWithScaling(Pix pixs, int wf, int hf, float rank, float scalefactor);

    /**
     * Original signature : <code>L_RBTREE* l_rbtreeCreate(l_int32)</code>
     */
    public static native L_Rbtree l_rbtreeCreate(int keytype);

    /**
     * Original signature :
     * <code>RB_TYPE* l_rbtreeLookup(L_RBTREE*, RB_TYPE)</code>
     */
    public static native Rb_Type l_rbtreeLookup(L_Rbtree t, Rb_Type.ByValue key);

    /**
     * Original signature :
     * <code>void l_rbtreeInsert(L_RBTREE*, RB_TYPE, RB_TYPE)</code>
     */
    public static native void l_rbtreeInsert(L_Rbtree t, Rb_Type.ByValue key, Rb_Type.ByValue value);

    /**
     * Original signature : <code>void l_rbtreeDelete(L_RBTREE*, RB_TYPE)</code>
     */
    public static native void l_rbtreeDelete(L_Rbtree t, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_rbtreeDestroy(L_RBTREE**)</code>
     */
    public static native void l_rbtreeDestroy(PointerByReference pt);

    /**
     * Original signature :
     * <code>L_RBTREE_NODE* l_rbtreeGetFirst(L_RBTREE*)</code>
     */
    public static native L_Rbtree_Node l_rbtreeGetFirst(L_Rbtree t);

    /**
     * Original signature :
     * <code>L_RBTREE_NODE* l_rbtreeGetNext(L_RBTREE_NODE*)</code>
     */
    public static native L_Rbtree_Node l_rbtreeGetNext(L_Rbtree_Node n);

    /**
     * Original signature :
     * <code>L_RBTREE_NODE* l_rbtreeGetLast(L_RBTREE*)</code>
     */
    public static native L_Rbtree_Node l_rbtreeGetLast(L_Rbtree t);

    /**
     * Original signature :
     * <code>L_RBTREE_NODE* l_rbtreeGetPrev(L_RBTREE_NODE*)</code>
     */
    public static native L_Rbtree_Node l_rbtreeGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_rbtreeGetCount(L_RBTREE*)</code>
     */
    public static native int l_rbtreeGetCount(L_Rbtree t);

    /**
     * Original signature : <code>void l_rbtreePrint(FILE*, L_RBTREE*)</code>
     */
    public static native void l_rbtreePrint(FILE fp, L_Rbtree t);

    /**
     * Original signature :
     * <code>SARRAY* pixProcessBarcodes(PIX*, l_int32, l_int32, SARRAY**, l_int32)</code>
     */
    public static native Sarray pixProcessBarcodes(Pix pixs, int format, int method, PointerByReference psaw, int debugflag);

    /**
     * Original signature : <code>PIXA* pixExtractBarcodes(PIX*, l_int32)</code>
     */
    public static native Pixa pixExtractBarcodes(Pix pixs, int debugflag);

    /**
     * Original signature :
     * <code>SARRAY* pixReadBarcodes(PIXA*, l_int32, l_int32, SARRAY**, l_int32)</code>
     */
    public static native Sarray pixReadBarcodes(Pixa pixa, int format, int method, PointerByReference psaw, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* pixReadBarcodeWidths(PIX*, l_int32, l_int32)</code>
     */
    public static native Numa pixReadBarcodeWidths(Pix pixs, int method, int debugflag);

    /**
     * Original signature :
     * <code>BOXA* pixLocateBarcodes(PIX*, l_int32, PIX**, PIX**)</code>
     */
    public static native Boxa pixLocateBarcodes(Pix pixs, int thresh, PointerByReference ppixb, PointerByReference ppixm);

    /**
     * Original signature :
     * <code>PIX* pixDeskewBarcode(PIX*, PIX*, BOX*, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native Pix pixDeskewBarcode(Pix pixs, Pix pixb, Box box, int margin, int threshold, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>NUMA* pixExtractBarcodeWidths1(PIX*, l_float32, l_float32, NUMA**, NUMA**, l_int32)</code>
     */
    public static native Numa pixExtractBarcodeWidths1(Pix pixs, float thresh, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code>
     */
    public static native Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatBuffer pwidth, PointerByReference pnac, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code>
     */
    public static native Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatByReference pwidth, PointerByReference pnac, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* pixExtractBarcodeCrossings(PIX*, l_float32, l_int32)</code>
     */
    public static native Numa pixExtractBarcodeCrossings(Pix pixs, float thresh, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* numaQuantizeCrossingsByWidth(NUMA*, l_float32, NUMA**, NUMA**, l_int32)</code>
     */
    public static native Numa numaQuantizeCrossingsByWidth(Numa nas, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code>
     */
    public static native Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatBuffer pwidth, FloatBuffer pfirstloc, PointerByReference pnac, int debugflag);

    /**
     * Original signature :
     * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code>
     */
    public static native Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatByReference pwidth, FloatByReference pfirstloc, PointerByReference pnac, int debugflag);

    /**
     * Original signature :
     * <code>PIXA* pixaReadFiles(const char*, const char*)</code>
     */
    public static native Pixa pixaReadFiles(String dirname, String substr);

    /**
     * Original signature : <code>PIXA* pixaReadFilesSA(SARRAY*)</code>
     */
    public static native Pixa pixaReadFilesSA(Sarray sa);

    /**
     * Original signature : <code>PIX* pixRead(const char*)</code>
     */
    public static native Pix pixRead(String filename);

    /**
     * Original signature :
     * <code>PIX* pixReadWithHint(const char*, l_int32)</code>
     */
    public static native Pix pixReadWithHint(String filename, int hint);

    /**
     * Original signature : <code>PIX* pixReadIndexed(SARRAY*, l_int32)</code>
     */
    public static native Pix pixReadIndexed(Sarray sa, int index);

    /**
     * Original signature : <code>PIX* pixReadStream(FILE*, l_int32)</code>
     */
    public static native Pix pixReadStream(FILE fp, int hint);

    /**
     * Original signature :
     * <code>l_ok pixReadHeader(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixReadHeader(String filename, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok findFileFormat(const char*, l_int32*)</code>
     */
    public static native int findFileFormat(String filename, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok findFileFormatStream(FILE*, l_int32*)</code>
     */
    public static native int findFileFormatStream(FILE fp, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok findFileFormatBuffer(const l_uint8*, l_int32*)</code>
     */
    public static native int findFileFormatBuffer(ByteBuffer buf, IntBuffer pformat);

    /**
     * Original signature : <code>l_int32 fileFormatIsTiff(FILE*)</code>
     */
    public static native int fileFormatIsTiff(FILE fp);

    /**
     * Original signature : <code>PIX* pixReadMem(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixReadHeaderMem(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixReadHeaderMem(ByteBuffer data, NativeSize size, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok writeImageFileInfo(const char*, FILE*, l_int32)</code>
     */
    public static native int writeImageFileInfo(String filename, FILE fpout, int headeronly);

    /**
     * Original signature : <code>l_ok ioFormatTest(const char*)</code>
     */
    public static native int ioFormatTest(String filename);

    /**
     * Original signature :
     * <code>L_RECOG* recogCreateFromRecog(L_RECOG*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Recog recogCreateFromRecog(L_Recog recs, int scalew, int scaleh, int linew, int threshold, int maxyshift);

    /**
     * Original signature :
     * <code>L_RECOG* recogCreateFromPixa(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Recog recogCreateFromPixa(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);

    /**
     * Original signature :
     * <code>L_RECOG* recogCreateFromPixaNoFinish(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Recog recogCreateFromPixaNoFinish(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);

    /**
     * Original signature :
     * <code>L_RECOG* recogCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Recog recogCreate(int scalew, int scaleh, int linew, int threshold, int maxyshift);

    /**
     * Original signature : <code>void recogDestroy(L_RECOG**)</code>
     */
    public static native void recogDestroy(PointerByReference precog);

    /**
     * Original signature : <code>l_int32 recogGetCount(L_RECOG*)</code>
     */
    public static native int recogGetCount(L_Recog recog);

    /**
     * Original signature :
     * <code>l_ok recogSetParams(L_RECOG*, l_int32, l_int32, l_float32, l_float32)</code>
     */
    public static native int recogSetParams(L_Recog recog, int type, int min_nopad, float max_wh_ratio, float max_ht_ratio);

    /**
     * Original signature :
     * <code>l_int32 recogGetClassIndex(L_RECOG*, l_int32, char*, l_int32*)</code>
     */
    public static native int recogGetClassIndex(L_Recog recog, int val, ByteBuffer text, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_ok recogStringToIndex(L_RECOG*, char*, l_int32*)</code>
     */
    public static native int recogStringToIndex(L_Recog recog, ByteBuffer text, IntBuffer pindex);

    /**
     * Original signature :
     * <code>l_int32 recogGetClassString(L_RECOG*, l_int32, char**)</code>
     */
    public static native int recogGetClassString(L_Recog recog, int index, PointerByReference pcharstr);

    /**
     * Original signature :
     * <code>l_ok l_convertCharstrToInt(const char*, l_int32*)</code>
     */
    public static native int l_convertCharstrToInt(String str, IntBuffer pval);

    /**
     * Original signature : <code>L_RECOG* recogRead(const char*)</code>
     */
    public static native L_Recog recogRead(String filename);

    /**
     * Original signature : <code>L_RECOG* recogReadStream(FILE*)</code>
     */
    public static native L_Recog recogReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_RECOG* recogReadMem(const l_uint8*, size_t)</code>
     */
    public static native L_Recog recogReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok recogWrite(const char*, L_RECOG*)</code>
     */
    public static native int recogWrite(String filename, L_Recog recog);

    /**
     * Original signature : <code>l_ok recogWriteStream(FILE*, L_RECOG*)</code>
     */
    public static native int recogWriteStream(FILE fp, L_Recog recog);

    /**
     * Original signature :
     * <code>l_ok recogWriteMem(l_uint8**, size_t*, L_RECOG*)</code>
     */
    public static native int recogWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Recog recog);

    /**
     * Original signature : <code>PIXA* recogExtractPixa(L_RECOG*)</code>
     */
    public static native Pixa recogExtractPixa(L_Recog recog);

    /**
     * Original signature :
     * <code>BOXA* recogDecode(L_RECOG*, PIX*, l_int32, PIX**)</code>
     */
    public static native Boxa recogDecode(L_Recog recog, Pix pixs, int nlevels, PointerByReference ppixdb);

    /**
     * Original signature : <code>l_ok recogCreateDid(L_RECOG*, PIX*)</code>
     */
    public static native int recogCreateDid(L_Recog recog, Pix pixs);

    /**
     * Original signature : <code>l_ok recogDestroyDid(L_RECOG*)</code>
     */
    public static native int recogDestroyDid(L_Recog recog);

    /**
     * Original signature : <code>l_int32 recogDidExists(L_RECOG*)</code>
     */
    public static native int recogDidExists(L_Recog recog);

    /**
     * Original signature : <code>L_RDID* recogGetDid(L_RECOG*)</code>
     */
    public static native L_Rdid recogGetDid(L_Recog recog);

    /**
     * Original signature :
     * <code>l_ok recogSetChannelParams(L_RECOG*, l_int32)</code>
     */
    public static native int recogSetChannelParams(L_Recog recog, int nlevels);

    /**
     * Original signature :
     * <code>l_ok recogIdentifyMultiple(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**, l_int32)</code>
     */
    public static native int recogIdentifyMultiple(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdb, int debugsplit);

    /**
     * Original signature :
     * <code>l_ok recogSplitIntoCharacters(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, l_int32)</code>
     */
    public static native int recogSplitIntoCharacters(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, int debug);

    /**
     * Original signature :
     * <code>l_ok recogCorrelationBestRow(L_RECOG*, PIX*, BOXA**, NUMA**, NUMA**, SARRAY**, l_int32)</code>
     */
    public static native int recogCorrelationBestRow(L_Recog recog, Pix pixs, PointerByReference pboxa, PointerByReference pnascore, PointerByReference pnaindex, PointerByReference psachar, int debug);

    /**
     * Original signature :
     * <code>l_ok recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code>
     */
    public static native int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatBuffer pscore, IntBuffer pindex, PointerByReference pcharstr, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code>
     */
    public static native int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatByReference pscore, IntByReference pindex, PointerByReference pcharstr, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok recogIdentifyPixa(L_RECOG*, PIXA*, PIX**)</code>
     */
    public static native int recogIdentifyPixa(L_Recog recog, Pixa pixa, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok recogIdentifyPix(L_RECOG*, PIX*, PIX**)</code>
     */
    public static native int recogIdentifyPix(L_Recog recog, Pix pixs, PointerByReference ppixdb);

    /**
     * Original signature : <code>l_ok recogSkipIdentify(L_RECOG*)</code>
     */
    public static native int recogSkipIdentify(L_Recog recog);

    /**
     * Original signature : <code>void rchaDestroy(L_RCHA**)</code>
     */
    public static native void rchaDestroy(PointerByReference prcha);

    /**
     * Original signature : <code>void rchDestroy(L_RCH**)</code>
     */
    public static native void rchDestroy(PointerByReference prch);

    /**
     * Original signature :
     * <code>l_ok rchaExtract(L_RCHA*, NUMA**, NUMA**, SARRAY**, NUMA**, NUMA**, NUMA**, NUMA**)</code>
     */
    public static native int rchaExtract(L_Rcha rcha, PointerByReference pnaindex, PointerByReference pnascore, PointerByReference psatext, PointerByReference pnasample, PointerByReference pnaxloc, PointerByReference pnayloc, PointerByReference pnawidth);

    /**
     * Original signature :
     * <code>l_ok rchExtract(L_RCH*, l_int32*, l_float32*, char**, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int rchExtract(L_Rch rch, IntBuffer pindex, FloatBuffer pscore, PointerByReference ptext, IntBuffer psample, IntBuffer pxloc, IntBuffer pyloc, IntBuffer pwidth);

    /**
     * Original signature :
     * <code>PIX* recogProcessToIdentify(L_RECOG*, PIX*, l_int32)</code>
     */
    public static native Pix recogProcessToIdentify(L_Recog recog, Pix pixs, int pad);

    /**
     * Original signature :
     * <code>SARRAY* recogExtractNumbers(L_RECOG*, BOXA*, l_float32, l_int32, BOXAA**, NUMAA**)</code>
     */
    public static native Sarray recogExtractNumbers(L_Recog recog, Boxa boxas, float scorethresh, int spacethresh, PointerByReference pbaa, PointerByReference pnaa);

    /**
     * Original signature :
     * <code>PIXA* showExtractNumbers(PIX*, SARRAY*, BOXAA*, NUMAA*, PIX**)</code>
     */
    public static native Pixa showExtractNumbers(Pix pixs, Sarray sa, Boxaa baa, Numaa naa, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_ok recogTrainLabeled(L_RECOG*, PIX*, BOX*, char*, l_int32)</code>
     */
    public static native int recogTrainLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, int debug);

    /**
     * Original signature :
     * <code>l_ok recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code>
     */
    public static native int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppix);

    /**
     * Original signature :
     * <code>l_ok recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code>
     */
    public static native int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, Pointer text, PointerByReference ppix);

    /**
     * Original signature :
     * <code>l_ok recogAddSample(L_RECOG*, PIX*, l_int32)</code>
     */
    public static native int recogAddSample(L_Recog recog, Pix pix, int debug);

    /**
     * Original signature :
     * <code>PIX* recogModifyTemplate(L_RECOG*, PIX*)</code>
     */
    public static native Pix recogModifyTemplate(L_Recog recog, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 recogAverageSamples(L_RECOG*, l_int32)</code>
     */
    public static native int recogAverageSamples(L_Recog precog, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code>
     */
    public static native int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatBuffer px, FloatBuffer py);

    /**
     * Original signature :
     * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code>
     */
    public static native int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatByReference px, FloatByReference py);

    /**
     * Original signature :
     * <code>l_ok recogTrainingFinished(L_RECOG**, l_int32, l_int32, l_float32)</code>
     */
    public static native int recogTrainingFinished(PointerByReference precog, int modifyflag, int minsize, float minfract);

    /**
     * Original signature :
     * <code>PIXA* recogFilterPixaBySize(PIXA*, l_int32, l_int32, l_float32, NUMA**)</code>
     */
    public static native Pixa recogFilterPixaBySize(Pixa pixas, int setsize, int maxkeep, float max_ht_ratio, PointerByReference pna);

    /**
     * Original signature :
     * <code>PIXAA* recogSortPixaByClass(PIXA*, l_int32)</code>
     */
    public static native Pixaa recogSortPixaByClass(Pixa pixa, int setsize);

    /**
     * Original signature :
     * <code>l_ok recogRemoveOutliers1(L_RECOG**, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
     */
    public static native int recogRemoveOutliers1(PointerByReference precog, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);

    /**
     * Original signature :
     * <code>PIXA* pixaRemoveOutliers1(PIXA*, l_float32, l_int32, l_int32, PIX**, PIX**)</code>
     */
    public static native Pixa pixaRemoveOutliers1(Pixa pixas, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);

    /**
     * Original signature :
     * <code>l_ok recogRemoveOutliers2(L_RECOG**, l_float32, l_int32, PIX**, PIX**)</code>
     */
    public static native int recogRemoveOutliers2(PointerByReference precog, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);

    /**
     * Original signature :
     * <code>PIXA* pixaRemoveOutliers2(PIXA*, l_float32, l_int32, PIX**, PIX**)</code>
     */
    public static native Pixa pixaRemoveOutliers2(Pixa pixas, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);

    /**
     * Original signature :
     * <code>PIXA* recogTrainFromBoot(L_RECOG*, PIXA*, l_float32, l_int32, l_int32)</code>
     */
    public static native Pixa recogTrainFromBoot(L_Recog recogboot, Pixa pixas, float minscore, int threshold, int debug);

    /**
     * Original signature :
     * <code>l_ok recogPadDigitTrainingSet(L_RECOG**, l_int32, l_int32)</code>
     */
    public static native int recogPadDigitTrainingSet(PointerByReference precog, int scaleh, int linew);

    /**
     * Original signature :
     * <code>l_int32 recogIsPaddingNeeded(L_RECOG*, SARRAY**)</code>
     */
    public static native int recogIsPaddingNeeded(L_Recog recog, PointerByReference psa);

    /**
     * Original signature :
     * <code>PIXA* recogAddDigitPadTemplates(L_RECOG*, SARRAY*)</code>
     */
    public static native Pixa recogAddDigitPadTemplates(L_Recog recog, Sarray sa);

    /**
     * Original signature :
     * <code>L_RECOG* recogMakeBootDigitRecog(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Recog recogMakeBootDigitRecog(int nsamp, int scaleh, int linew, int maxyshift, int debug);

    /**
     * Original signature :
     * <code>PIXA* recogMakeBootDigitTemplates(l_int32, l_int32)</code>
     */
    public static native Pixa recogMakeBootDigitTemplates(int nsamp, int debug);

    /**
     * Original signature :
     * <code>l_ok recogShowContent(FILE*, L_RECOG*, l_int32, l_int32)</code>
     */
    public static native int recogShowContent(FILE fp, L_Recog recog, int index, int display);

    /**
     * Original signature :
     * <code>l_ok recogDebugAverages(L_RECOG*, l_int32)</code>
     */
    public static native int recogDebugAverages(L_Recog precog, int debug);

    /**
     * Original signature :
     * <code>l_int32 recogShowAverageTemplates(L_RECOG*)</code>
     */
    public static native int recogShowAverageTemplates(L_Recog recog);

    /**
     * Original signature :
     * <code>l_ok recogShowMatchesInRange(L_RECOG*, PIXA*, l_float32, l_float32, l_int32)</code>
     */
    public static native int recogShowMatchesInRange(L_Recog recog, Pixa pixa, float minscore, float maxscore, int display);

    /**
     * Original signature :
     * <code>PIX* recogShowMatch(L_RECOG*, PIX*, PIX*, BOX*, l_int32, l_float32)</code>
     */
    public static native Pix recogShowMatch(L_Recog recog, Pix pix1, Pix pix2, Box box, int index, float score);

    /**
     * Original signature :
     * <code>l_ok regTestSetup(l_int32, char**, L_REGPARAMS**)</code>
     */
    public static native int regTestSetup(int argc, PointerByReference argv, PointerByReference prp);

    /**
     * Original signature : <code>l_ok regTestCleanup(L_REGPARAMS*)</code>
     */
    public static native int regTestCleanup(L_RegParams rp);

    /**
     * Original signature :
     * <code>l_ok regTestCompareValues(L_REGPARAMS*, l_float32, l_float32, l_float32)</code>
     */
    public static native int regTestCompareValues(L_RegParams rp, float val1, float val2, float delta);

    /**
     * Original signature :
     * <code>l_ok regTestCompareStrings(L_REGPARAMS*, l_uint8*, size_t, l_uint8*, size_t)</code>
     */
    public static native int regTestCompareStrings(L_RegParams rp, ByteBuffer string1, NativeSize bytes1, ByteBuffer string2, NativeSize bytes2);

    /**
     * Original signature :
     * <code>l_ok regTestComparePix(L_REGPARAMS*, PIX*, PIX*)</code>
     */
    public static native int regTestComparePix(L_RegParams rp, Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_ok regTestCompareSimilarPix(L_REGPARAMS*, PIX*, PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native int regTestCompareSimilarPix(L_RegParams rp, Pix pix1, Pix pix2, int mindiff, float maxfract, int printstats);

    /**
     * Original signature :
     * <code>l_ok regTestCheckFile(L_REGPARAMS*, const char*)</code>
     */
    public static native int regTestCheckFile(L_RegParams rp, String localname);

    /**
     * Original signature :
     * <code>l_ok regTestCompareFiles(L_REGPARAMS*, l_int32, l_int32)</code>
     */
    public static native int regTestCompareFiles(L_RegParams rp, int index1, int index2);

    /**
     * Original signature :
     * <code>l_ok regTestWritePixAndCheck(L_REGPARAMS*, PIX*, l_int32)</code>
     */
    public static native int regTestWritePixAndCheck(L_RegParams rp, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok regTestWriteDataAndCheck(L_REGPARAMS*, void*, size_t, const char*)</code>
     */
    public static native int regTestWriteDataAndCheck(L_RegParams rp, Pointer data, NativeSize nbytes, String ext);

    /**
     * Original signature :
     * <code>char* regTestGenLocalFilename(L_REGPARAMS*, l_int32, l_int32)</code>
     */
    public static native Pointer regTestGenLocalFilename(L_RegParams rp, int index, int format);

    /**
     * Original signature :
     * <code>l_ok l_pdfRenderFile(const char*, l_int32, SARRAY**)</code>
     */
    public static native int l_pdfRenderFile(String filename, int res, PointerByReference psaout);

    /**
     * Original signature :
     * <code>l_ok l_pdfRenderFiles(const char*, SARRAY*, l_int32, SARRAY**)</code>
     */
    public static native int l_pdfRenderFiles(String dir, Sarray sain, int res, PointerByReference psaout);

    /**
     * Original signature :
     * <code>l_ok pixRasterop(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixRasterop(Pix pixd, int dx, int dy, int dw, int dh, int op, Pix pixs, int sx, int sy);

    /**
     * Original signature :
     * <code>l_ok pixRasteropVip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRasteropVip(Pix pixd, int bx, int bw, int vshift, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRasteropHip(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRasteropHip(Pix pixd, int by, int bh, int hshift, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixTranslate(PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixTranslate(Pix pixd, Pix pixs, int hshift, int vshift, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRasteropIP(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixRasteropIP(Pix pixd, int hshift, int vshift, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRasteropFullImage(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixRasteropFullImage(Pix pixd, Pix pixs, int op);

    /**
     * Original signature :
     * <code>void rasteropUniLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native void rasteropUniLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op);

    /**
     * Original signature :
     * <code>void rasteropLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native void rasteropLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op, IntBuffer datas, int spixw, int spixh, int swpl, int sx, int sy);

    /**
     * Original signature :
     * <code>void rasteropVipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native void rasteropVipLow(IntBuffer data, int pixw, int pixh, int depth, int wpl, int x, int w, int shift);

    /**
     * Original signature :
     * <code>void rasteropHipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native void rasteropHipLow(IntBuffer data, int pixh, int depth, int wpl, int y, int h, int shift);

    /**
     * Original signature :
     * <code>PIX* pixRotate(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRotate(Pix pixs, float angle, int type, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixEmbedForRotation(PIX*, l_float32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixEmbedForRotation(Pix pixs, float angle, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixRotateBySampling(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateBySampling(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateBinaryNice(PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateBinaryNice(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateWithAlpha(PIX*, l_float32, PIX*, l_float32)</code>
     */
    public static native Pix pixRotateWithAlpha(Pix pixs, float angle, Pix pixg, float fract);

    /**
     * Original signature :
     * <code>PIX* pixRotateAM(PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateAM(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColor(PIX*, l_float32, l_uint32)</code>
     */
    public static native Pix pixRotateAMColor(Pix pixs, float angle, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGray(PIX*, l_float32, l_uint8)</code>
     */
    public static native Pix pixRotateAMGray(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMCorner(PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateAMCorner(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorCorner(PIX*, l_float32, l_uint32)</code>
     */
    public static native Pix pixRotateAMColorCorner(Pix pixs, float angle, int fillval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGrayCorner(PIX*, l_float32, l_uint8)</code>
     */
    public static native Pix pixRotateAMGrayCorner(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorFast(PIX*, l_float32, l_uint32)</code>
     */
    public static native Pix pixRotateAMColorFast(Pix pixs, float angle, int colorval);

    /**
     * Original signature : <code>PIX* pixRotateOrth(PIX*, l_int32)</code>
     */
    public static native Pix pixRotateOrth(Pix pixs, int quads);

    /**
     * Original signature : <code>PIX* pixRotate180(PIX*, PIX*)</code>
     */
    public static native Pix pixRotate180(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixRotate90(PIX*, l_int32)</code>
     */
    public static native Pix pixRotate90(Pix pixs, int direction);

    /**
     * Original signature : <code>PIX* pixFlipLR(PIX*, PIX*)</code>
     */
    public static native Pix pixFlipLR(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixFlipTB(PIX*, PIX*)</code>
     */
    public static native Pix pixFlipTB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixRotateShear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateShear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate2Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixRotate2Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate3Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixRotate3Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRotateShearIP(PIX*, l_int32, l_int32, l_float32, l_int32)</code>
     */
    public static native int pixRotateShearIP(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateShearCenter(PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixRotateShearCenter(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixRotateShearCenterIP(PIX*, l_float32, l_int32)</code>
     */
    public static native int pixRotateShearCenterIP(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStrokeWidthTransform(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixStrokeWidthTransform(Pix pixs, int color, int depth, int nangles);

    /**
     * Original signature :
     * <code>PIX* pixRunlengthTransform(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixRunlengthTransform(Pix pixs, int color, int direction, int depth);

    /**
     * Original signature :
     * <code>l_ok pixFindHorizontalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixFindHorizontalRuns(Pix pix, int y, IntBuffer xstart, IntBuffer xend, IntBuffer pn);

    /**
     * Original signature :
     * <code>l_ok pixFindVerticalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int pixFindVerticalRuns(Pix pix, int x, IntBuffer ystart, IntBuffer yend, IntBuffer pn);

    /**
     * Original signature :
     * <code>NUMA* pixFindMaxRuns(PIX*, l_int32, NUMA**)</code>
     */
    public static native Numa pixFindMaxRuns(Pix pix, int direction, PointerByReference pnastart);

    /**
     * Original signature :
     * <code>l_ok pixFindMaxHorizontalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixFindMaxHorizontalRunOnLine(Pix pix, int y, IntBuffer pxstart, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_ok pixFindMaxVerticalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixFindMaxVerticalRunOnLine(Pix pix, int x, IntBuffer pystart, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_ok runlengthMembershipOnLine(l_int32*, l_int32, l_int32, l_int32*, l_int32*, l_int32)</code>
     */
    public static native int runlengthMembershipOnLine(IntBuffer buffer, int size, int depth, IntBuffer start, IntBuffer end, int n);

    /**
     * Original signature : <code>l_int32* makeMSBitLocTab(l_int32)</code>
     */
    public static native IntByReference makeMSBitLocTab(int bitval);

    /**
     * Original signature : <code>SARRAY* sarrayCreate(l_int32)</code>
     */
    public static native Sarray sarrayCreate(int n);

    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateInitialized(l_int32, const char*)</code>
     */
    public static native Sarray sarrayCreateInitialized(int n, String initstr);

    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateWordsFromString(const char*)</code>
     */
    public static native Sarray sarrayCreateWordsFromString(String string);

    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateLinesFromString(const char*, l_int32)</code>
     */
    public static native Sarray sarrayCreateLinesFromString(String string, int blankflag);

    /**
     * Original signature : <code>void sarrayDestroy(SARRAY**)</code>
     */
    public static native void sarrayDestroy(PointerByReference psa);

    /**
     * Original signature : <code>SARRAY* sarrayCopy(SARRAY*)</code>
     */
    public static native Sarray sarrayCopy(Sarray sa);

    /**
     * Original signature : <code>SARRAY* sarrayClone(SARRAY*)</code>
     */
    public static native Sarray sarrayClone(Sarray sa);

    /**
     * Original signature :
     * <code>l_ok sarrayAddString(SARRAY*, const char*, l_int32)</code>
     */
    public static native int sarrayAddString(Sarray sa, String string, int copyflag);

    /**
     * Original signature :
     * <code>char* sarrayRemoveString(SARRAY*, l_int32)</code>
     */
    public static native Pointer sarrayRemoveString(Sarray sa, int index);

    /**
     * Original signature :
     * <code>l_ok sarrayReplaceString(SARRAY*, l_int32, char*, l_int32)</code>
     */
    public static native int sarrayReplaceString(Sarray sa, int index, ByteBuffer newstr, int copyflag);

    /**
     * Original signature : <code>l_ok sarrayClear(SARRAY*)</code>
     */
    public static native int sarrayClear(Sarray sa);

    /**
     * Original signature : <code>l_int32 sarrayGetCount(SARRAY*)</code>
     */
    public static native int sarrayGetCount(Sarray sa);

    /**
     * Original signature :
     * <code>char** sarrayGetArray(SARRAY*, l_int32*, l_int32*)</code>
     */
    public static native PointerByReference sarrayGetArray(Sarray sa, IntBuffer pnalloc, IntBuffer pn);

    /**
     * Original signature :
     * <code>char* sarrayGetString(SARRAY*, l_int32, l_int32)</code>
     */
    public static native Pointer sarrayGetString(Sarray sa, int index, int copyflag);

    /**
     * Original signature : <code>char* sarrayToString(SARRAY*, l_int32)</code>
     */
    public static native Pointer sarrayToString(Sarray sa, int addnlflag);

    /**
     * Original signature :
     * <code>char* sarrayToStringRange(SARRAY*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pointer sarrayToStringRange(Sarray sa, int first, int nstrings, int addnlflag);

    /**
     * Original signature :
     * <code>SARRAY* sarrayConcatUniformly(SARRAY*, l_int32, l_int32)</code>
     */
    public static native Sarray sarrayConcatUniformly(Sarray sa, int n, int addnlflag);

    /**
     * Original signature : <code>l_ok sarrayJoin(SARRAY*, SARRAY*)</code>
     */
    public static native int sarrayJoin(Sarray sa1, Sarray sa2);

    /**
     * Original signature :
     * <code>l_ok sarrayAppendRange(SARRAY*, SARRAY*, l_int32, l_int32)</code>
     */
    public static native int sarrayAppendRange(Sarray sa1, Sarray sa2, int start, int end);

    /**
     * Original signature :
     * <code>l_ok sarrayPadToSameSize(SARRAY*, SARRAY*, const char*)</code>
     */
    public static native int sarrayPadToSameSize(Sarray sa1, Sarray sa2, String padstring);

    /**
     * Original signature :
     * <code>SARRAY* sarrayConvertWordsToLines(SARRAY*, l_int32)</code>
     */
    public static native Sarray sarrayConvertWordsToLines(Sarray sa, int linesize);

    /**
     * Original signature :
     * <code>l_int32 sarraySplitString(SARRAY*, const char*, const char*)</code>
     */
    public static native int sarraySplitString(Sarray sa, String str, String separators);

    /**
     * Original signature :
     * <code>SARRAY* sarraySelectBySubstring(SARRAY*, const char*)</code>
     */
    public static native Sarray sarraySelectBySubstring(Sarray sain, String substr);

    /**
     * Original signature :
     * <code>SARRAY* sarraySelectRange(SARRAY*, l_int32, l_int32)</code>
     */
    public static native Sarray sarraySelectRange(Sarray sain, int first, int last);

    /**
     * Original signature :
     * <code>l_int32 sarrayParseRange(SARRAY*, l_int32, l_int32*, l_int32*, l_int32*, const char*, l_int32)</code>
     */
    public static native int sarrayParseRange(Sarray sa, int start, IntBuffer pactualstart, IntBuffer pend, IntBuffer pnewstart, String substr, int loc);

    /**
     * Original signature : <code>SARRAY* sarrayRead(const char*)</code>
     */
    public static native Sarray sarrayRead(String filename);

    /**
     * Original signature : <code>SARRAY* sarrayReadStream(FILE*)</code>
     */
    public static native Sarray sarrayReadStream(FILE fp);

    /**
     * Original signature :
     * <code>SARRAY* sarrayReadMem(const l_uint8*, size_t)</code>
     */
    public static native Sarray sarrayReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>l_ok sarrayWrite(const char*, SARRAY*)</code>
     */
    public static native int sarrayWrite(String filename, Sarray sa);

    /**
     * Original signature : <code>l_ok sarrayWriteStream(FILE*, SARRAY*)</code>
     */
    public static native int sarrayWriteStream(FILE fp, Sarray sa);

    /**
     * Original signature : <code>l_ok sarrayWriteStderr(SARRAY*)</code>
     */
    public static native int sarrayWriteStderr(Sarray sa);

    /**
     * Original signature :
     * <code>l_ok sarrayWriteMem(l_uint8**, size_t*, SARRAY*)</code>
     */
    public static native int sarrayWriteMem(PointerByReference pdata, NativeSizeByReference psize, Sarray sa);

    /**
     * Original signature : <code>l_ok sarrayAppend(const char*, SARRAY*)</code>
     */
    public static native int sarrayAppend(String filename, Sarray sa);

    /**
     * Original signature :
     * <code>SARRAY* getNumberedPathnamesInDirectory(const char*, const char*, l_int32, l_int32, l_int32)</code>
     */
    public static native Sarray getNumberedPathnamesInDirectory(String dirname, String substr, int numpre, int numpost, int maxnum);

    /**
     * Original signature :
     * <code>SARRAY* getSortedPathnamesInDirectory(const char*, const char*, l_int32, l_int32)</code>
     */
    public static native Sarray getSortedPathnamesInDirectory(String dirname, String substr, int first, int nfiles);

    /**
     * Original signature :
     * <code>SARRAY* convertSortedToNumberedPathnames(SARRAY*, l_int32, l_int32, l_int32)</code>
     */
    public static native Sarray convertSortedToNumberedPathnames(Sarray sa, int numpre, int numpost, int maxnum);

    /**
     * Original signature :
     * <code>SARRAY* getFilenamesInDirectory(const char*)</code>
     */
    public static native Sarray getFilenamesInDirectory(String dirname);

    /**
     * Original signature :
     * <code>SARRAY* sarraySort(SARRAY*, SARRAY*, l_int32)</code>
     */
    public static native Sarray sarraySort(Sarray saout, Sarray sain, int sortorder);

    /**
     * Original signature :
     * <code>SARRAY* sarraySortByIndex(SARRAY*, NUMA*)</code>
     */
    public static native Sarray sarraySortByIndex(Sarray sain, Numa naindex);

    /**
     * Original signature :
     * <code>l_int32 stringCompareLexical(const char*, const char*)</code>
     */
    public static native int stringCompareLexical(String str1, String str2);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromSarray(SARRAY*)</code>
     */
    public static native L_Rbtree l_asetCreateFromSarray(Sarray sa);

    /**
     * Original signature :
     * <code>l_ok sarrayRemoveDupsByAset(SARRAY*, SARRAY**)</code>
     */
    public static native int sarrayRemoveDupsByAset(Sarray sas, PointerByReference psad);

    /**
     * Original signature :
     * <code>l_ok sarrayUnionByAset(SARRAY*, SARRAY*, SARRAY**)</code>
     */
    public static native int sarrayUnionByAset(Sarray sa1, Sarray sa2, PointerByReference psad);

    /**
     * Original signature :
     * <code>l_ok sarrayIntersectionByAset(SARRAY*, SARRAY*, SARRAY**)</code>
     */
    public static native int sarrayIntersectionByAset(Sarray sa1, Sarray sa2, PointerByReference psad);

    /**
     * Original signature :
     * <code>L_HASHMAP* l_hmapCreateFromSarray(SARRAY*)</code>
     */
    public static native L_Hashmap l_hmapCreateFromSarray(Sarray sa);

    /**
     * Original signature :
     * <code>l_ok sarrayRemoveDupsByHmap(SARRAY*, SARRAY**, L_HASHMAP**)</code>
     */
    public static native int sarrayRemoveDupsByHmap(Sarray sas, PointerByReference psad, PointerByReference phmap);

    /**
     * Original signature :
     * <code>l_ok sarrayUnionByHmap(SARRAY*, SARRAY*, SARRAY**)</code>
     */
    public static native int sarrayUnionByHmap(Sarray sa1, Sarray sa2, PointerByReference psad);

    /**
     * Original signature :
     * <code>l_ok sarrayIntersectionByHmap(SARRAY*, SARRAY*, SARRAY**)</code>
     */
    public static native int sarrayIntersectionByHmap(Sarray sa1, Sarray sa2, PointerByReference psad);

    /**
     * Original signature : <code>SARRAY* sarrayGenerateIntegers(l_int32)</code>
     */
    public static native Sarray sarrayGenerateIntegers(int n);

    /**
     * Original signature :
     * <code>l_ok sarrayLookupCSKV(SARRAY*, const char*, char**)</code>
     */
    public static native int sarrayLookupCSKV(Sarray sa, String keystring, PointerByReference pvalstring);

    /**
     * Original signature :
     * <code>PIX* pixScale(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScale(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSizeRel(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleToSizeRel(Pix pixs, int delw, int delh);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleToResolution(PIX*, l_float32, l_float32, l_float32*)</code>
     */
    public static native Pix pixScaleToResolution(Pix pixs, float target, float assumed, FloatBuffer pscalefact);

    /**
     * Original signature :
     * <code>PIX* pixScaleGeneral(PIX*, l_float32, l_float32, l_float32, l_int32)</code>
     */
    public static native Pix pixScaleGeneral(Pix pixs, float scalex, float scaley, float sharpfract, int sharpwidth);

    /**
     * Original signature :
     * <code>PIX* pixScaleLI(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleColorLI(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleColorLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleColor2xLI(PIX*)</code>
     */
    public static native Pix pixScaleColor2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleColor4xLI(PIX*)</code>
     */
    public static native Pix pixScaleColor4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayLI(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleGrayLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLI(PIX*)</code>
     */
    public static native Pix pixScaleGray2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLI(PIX*)</code>
     */
    public static native Pix pixScaleGray4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray2xLIThresh(PIX*, l_int32)</code>
     */
    public static native Pix pixScaleGray2xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLIDither(PIX*)</code>
     */
    public static native Pix pixScaleGray2xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray4xLIThresh(PIX*, l_int32)</code>
     */
    public static native Pix pixScaleGray4xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLIDither(PIX*)</code>
     */
    public static native Pix pixScaleGray4xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySampling(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleBySampling(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySamplingWithShift(PIX*, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleBySamplingWithShift(Pix pixs, float scalex, float scaley, float shiftx, float shifty);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySamplingToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleBySamplingToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleByIntSampling(PIX*, l_int32)</code>
     */
    public static native Pix pixScaleByIntSampling(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGrayFast(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleRGBToGrayFast(Pix pixs, int factor, int color);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToBinaryFast(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleRGBToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayToBinaryFast(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleGrayToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleSmooth(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleSmooth(Pix pix, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleSmoothToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleSmoothToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGray2(PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleRGBToGray2(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>PIX* pixScaleAreaMap(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleAreaMap(Pix pix, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleAreaMap2(PIX*)</code>
     */
    public static native Pix pixScaleAreaMap2(Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixScaleAreaMapToSize(PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleAreaMapToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleBinary(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleBinary(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleBinaryWithShift(PIX*, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixScaleBinaryWithShift(Pix pixs, float scalex, float scaley, float shiftx, float shifty);

    /**
     * Original signature : <code>PIX* pixScaleToGray(PIX*, l_float32)</code>
     */
    public static native Pix pixScaleToGray(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayFast(PIX*, l_float32)</code>
     */
    public static native Pix pixScaleToGrayFast(Pix pixs, float scalefactor);

    /**
     * Original signature : <code>PIX* pixScaleToGray2(PIX*)</code>
     */
    public static native Pix pixScaleToGray2(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray3(PIX*)</code>
     */
    public static native Pix pixScaleToGray3(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray4(PIX*)</code>
     */
    public static native Pix pixScaleToGray4(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray6(PIX*)</code>
     */
    public static native Pix pixScaleToGray6(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray8(PIX*)</code>
     */
    public static native Pix pixScaleToGray8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray16(PIX*)</code>
     */
    public static native Pix pixScaleToGray16(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayMipmap(PIX*, l_float32)</code>
     */
    public static native Pix pixScaleToGrayMipmap(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleMipmap(PIX*, PIX*, l_float32)</code>
     */
    public static native Pix pixScaleMipmap(Pix pixs1, Pix pixs2, float scale);

    /**
     * Original signature : <code>PIX* pixExpandReplicate(PIX*, l_int32)</code>
     */
    public static native Pix pixExpandReplicate(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayMinMax(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleGrayMinMax(Pix pixs, int xfact, int yfact, int type);

    /**
     * Original signature : <code>PIX* pixScaleGrayMinMax2(PIX*, l_int32)</code>
     */
    public static native Pix pixScaleGrayMinMax2(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayRankCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixScaleGrayRankCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature : <code>PIX* pixScaleGrayRank2(PIX*, l_int32)</code>
     */
    public static native Pix pixScaleGrayRank2(Pix pixs, int rank);

    /**
     * Original signature :
     * <code>l_ok pixScaleAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code>
     */
    public static native int pixScaleAndTransferAlpha(Pix pixd, Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleWithAlpha(PIX*, l_float32, l_float32, PIX*, l_float32)</code>
     */
    public static native Pix pixScaleWithAlpha(Pix pixs, float scalex, float scaley, Pix pixg, float fract);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillBinary(PIX*, PIX*, PIX*, l_int32)</code>
     */
    public static native Pix pixSeedfillBinary(Pix pixd, Pix pixs, Pix pixm, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillBinaryRestricted(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixSeedfillBinaryRestricted(Pix pixd, Pix pixs, Pix pixm, int connectivity, int xmax, int ymax);

    /**
     * Original signature : <code>PIX* pixHolesByFilling(PIX*, l_int32)</code>
     */
    public static native Pix pixHolesByFilling(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixFillClosedBorders(PIX*, l_int32)</code>
     */
    public static native Pix pixFillClosedBorders(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixExtractBorderConnComps(PIX*, l_int32)</code>
     */
    public static native Pix pixExtractBorderConnComps(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixRemoveBorderConnComps(PIX*, l_int32)</code>
     */
    public static native Pix pixRemoveBorderConnComps(Pix pixs, int connectivity);

    /**
     * Original signature : <code>PIX* pixFillBgFromBorder(PIX*, l_int32)</code>
     */
    public static native Pix pixFillBgFromBorder(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixFillHolesToBoundingRect(PIX*, l_int32, l_float32, l_float32)</code>
     */
    public static native Pix pixFillHolesToBoundingRect(Pix pixs, int minsize, float maxhfract, float minfgfract);

    /**
     * Original signature :
     * <code>l_ok pixSeedfillGray(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSeedfillGray(Pix pixs, Pix pixm, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixSeedfillGrayInv(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSeedfillGrayInv(Pix pixs, Pix pixm, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixSeedfillGraySimple(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSeedfillGraySimple(Pix pixs, Pix pixm, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixSeedfillGrayInvSimple(PIX*, PIX*, l_int32)</code>
     */
    public static native int pixSeedfillGrayInvSimple(Pix pixs, Pix pixm, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillGrayBasin(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixSeedfillGrayBasin(Pix pixb, Pix pixm, int delta, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixDistanceFunction(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixDistanceFunction(Pix pixs, int connectivity, int outdepth, int boundcond);

    /**
     * Original signature : <code>PIX* pixSeedspread(PIX*, l_int32)</code>
     */
    public static native Pix pixSeedspread(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>l_ok pixLocalExtrema(PIX*, l_int32, l_int32, PIX**, PIX**)</code>
     */
    public static native int pixLocalExtrema(Pix pixs, int maxmin, int minmax, PointerByReference ppixmin, PointerByReference ppixmax);

    /**
     * Original signature :
     * <code>l_ok pixSelectedLocalExtrema(PIX*, l_int32, PIX**, PIX**)</code>
     */
    public static native int pixSelectedLocalExtrema(Pix pixs, int mindist, PointerByReference ppixmin, PointerByReference ppixmax);

    /**
     * Original signature : <code>PIX* pixFindEqualValues(PIX*, PIX*)</code>
     */
    public static native Pix pixFindEqualValues(Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>l_ok pixSelectMinInConnComp(PIX*, PIX*, PTA**, NUMA**)</code>
     */
    public static native int pixSelectMinInConnComp(Pix pixs, Pix pixm, PointerByReference ppta, PointerByReference pnav);

    /**
     * Original signature :
     * <code>PIX* pixRemoveSeededComponents(PIX*, PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native Pix pixRemoveSeededComponents(Pix pixd, Pix pixs, Pix pixm, int connectivity, int bordersize);

    /**
     * Original signature : <code>SELA* selaCreate(l_int32)</code>
     */
    public static native Sela selaCreate(int n);

    /**
     * Original signature : <code>void selaDestroy(SELA**)</code>
     */
    public static native void selaDestroy(PointerByReference psela);

    /**
     * Original signature :
     * <code>SEL* selCreate(l_int32, l_int32, const char*)</code>
     */
    public static native Sel selCreate(int height, int width, String name);

    /**
     * Original signature : <code>void selDestroy(SEL**)</code>
     */
    public static native void selDestroy(PointerByReference psel);

    /**
     * Original signature : <code>SEL* selCopy(SEL*)</code>
     */
    public static native Sel selCopy(Pointer sel);

    /**
     * Original signature :
     * <code>SEL* selCreateBrick(l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Sel selCreateBrick(int h, int w, int cy, int cx, int type);

    /**
     * Original signature :
     * <code>SEL* selCreateComb(l_int32, l_int32, l_int32)</code>
     */
    public static native Sel selCreateComb(int factor1, int factor2, int direction);

    /**
     * Original signature :
     * <code>l_int32** create2dIntArray(l_int32, l_int32)</code>
     */
    public static native PointerByReference create2dIntArray(int sy, int sx);

    /**
     * Original signature :
     * <code>l_ok selaAddSel(SELA*, SEL*, const char*, l_int32)</code>
     */
    public static native int selaAddSel(Sela sela, Pointer sel, String selname, int copyflag);

    /**
     * Original signature : <code>l_int32 selaGetCount(SELA*)</code>
     */
    public static native int selaGetCount(Sela sela);

    /**
     * Original signature : <code>SEL* selaGetSel(SELA*, l_int32)</code>
     */
    public static native Sel selaGetSel(Sela sela, int i);

    /**
     * Original signature : <code>char* selGetName(SEL*)</code>
     */
    public static native Pointer selGetName(Pointer sel);

    /**
     * Original signature : <code>l_ok selSetName(SEL*, const char*)</code>
     */
    public static native int selSetName(Pointer sel, String name);

    /**
     * Original signature :
     * <code>l_ok selaFindSelByName(SELA*, const char*, l_int32*, SEL**)</code>
     */
    public static native int selaFindSelByName(Sela sela, String name, IntBuffer pindex, PointerByReference psel);

    /**
     * Original signature :
     * <code>l_ok selGetElement(SEL*, l_int32, l_int32, l_int32*)</code>
     */
    public static native int selGetElement(Pointer sel, int row, int col, IntBuffer ptype);

    /**
     * Original signature :
     * <code>l_ok selSetElement(SEL*, l_int32, l_int32, l_int32)</code>
     */
    public static native int selSetElement(Pointer sel, int row, int col, int type);

    /**
     * Original signature :
     * <code>l_ok selGetParameters(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int selGetParameters(Pointer sel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);

    /**
     * Original signature :
     * <code>l_ok selSetOrigin(SEL*, l_int32, l_int32)</code>
     */
    public static native int selSetOrigin(Pointer sel, int cy, int cx);

    /**
     * Original signature : <code>l_ok selGetTypeAtOrigin(SEL*, l_int32*)</code>
     */
    public static native int selGetTypeAtOrigin(Pointer sel, IntBuffer ptype);

    /**
     * Original signature :
     * <code>char* selaGetBrickName(SELA*, l_int32, l_int32)</code>
     */
    public static native Pointer selaGetBrickName(Sela sela, int hsize, int vsize);

    /**
     * Original signature :
     * <code>char* selaGetCombName(SELA*, l_int32, l_int32)</code>
     */
    public static native Pointer selaGetCombName(Sela sela, int size, int direction);

    /**
     * Original signature :
     * <code>l_ok getCompositeParameters(l_int32, l_int32*, l_int32*, char**, char**, char**, char**)</code>
     */
    public static native int getCompositeParameters(int size, IntBuffer psize1, IntBuffer psize2, PointerByReference pnameh1, PointerByReference pnameh2, PointerByReference pnamev1, PointerByReference pnamev2);

    /**
     * Original signature : <code>SARRAY* selaGetSelnames(SELA*)</code>
     */
    public static native Sarray selaGetSelnames(Sela sela);

    /**
     * Original signature :
     * <code>l_ok selFindMaxTranslations(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int selFindMaxTranslations(Pointer sel, IntBuffer pxp, IntBuffer pyp, IntBuffer pxn, IntBuffer pyn);

    /**
     * Original signature : <code>SEL* selRotateOrth(SEL*, l_int32)</code>
     */
    public static native Sel selRotateOrth(Pointer sel, int quads);

    /**
     * Original signature : <code>SELA* selaRead(const char*)</code>
     */
    public static native Sela selaRead(String fname);

    /**
     * Original signature : <code>SELA* selaReadStream(FILE*)</code>
     */
    public static native Sela selaReadStream(FILE fp);

    /**
     * Original signature : <code>SEL* selRead(const char*)</code>
     */
    public static native Sel selRead(String fname);

    /**
     * Original signature : <code>SEL* selReadStream(FILE*)</code>
     */
    public static native Sel selReadStream(FILE fp);

    /**
     * Original signature : <code>l_ok selaWrite(const char*, SELA*)</code>
     */
    public static native int selaWrite(String fname, Sela sela);

    /**
     * Original signature : <code>l_ok selaWriteStream(FILE*, SELA*)</code>
     */
    public static native int selaWriteStream(FILE fp, Sela sela);

    /**
     * Original signature : <code>l_ok selWrite(const char*, SEL*)</code>
     */
    public static native int selWrite(String fname, Pointer sel);

    /**
     * Original signature : <code>l_ok selWriteStream(FILE*, SEL*)</code>
     */
    public static native int selWriteStream(FILE fp, Pointer sel);

    /**
     * Original signature :
     * <code>SEL* selCreateFromString(const char*, l_int32, l_int32, const char*)</code>
     */
    public static native Sel selCreateFromString(String text, int h, int w, String name);

    /**
     * Original signature : <code>char* selPrintToString(SEL*)</code>
     */
    public static native Pointer selPrintToString(Pointer sel);

    /**
     * Original signature : <code>SELA* selaCreateFromFile(const char*)</code>
     */
    public static native Sela selaCreateFromFile(String filename);

    /**
     * Original signature :
     * <code>SEL* selCreateFromPta(PTA*, l_int32, l_int32, const char*)</code>
     */
    public static native Sel selCreateFromPta(Pta pta, int cy, int cx, String name);

    /**
     * Original signature :
     * <code>SEL* selCreateFromPix(PIX*, l_int32, l_int32, const char*)</code>
     */
    public static native Sel selCreateFromPix(Pix pix, int cy, int cx, String name);

    /**
     * Original signature : <code>SEL* selReadFromColorImage(const char*)</code>
     */
    public static native Sel selReadFromColorImage(String pathname);

    /**
     * Original signature :
     * <code>SEL* selCreateFromColorPix(PIX*, const char*)</code>
     */
    public static native Sel selCreateFromColorPix(Pix pixs, String selname);

    /**
     * Original signature :
     * <code>SELA* selaCreateFromColorPixa(PIXA*, SARRAY*)</code>
     */
    public static native Sela selaCreateFromColorPixa(Pixa pixa, Sarray sa);

    /**
     * Original signature :
     * <code>PIX* selDisplayInPix(SEL*, l_int32, l_int32)</code>
     */
    public static native Pix selDisplayInPix(Pointer sel, int size, int gthick);

    /**
     * Original signature :
     * <code>PIX* selaDisplayInPix(SELA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix selaDisplayInPix(Sela sela, int size, int gthick, int spacing, int ncols);

    /**
     * Original signature : <code>SELA* selaAddBasic(SELA*)</code>
     */
    public static native Sela selaAddBasic(Sela sela);

    /**
     * Original signature : <code>SELA* selaAddHitMiss(SELA*)</code>
     */
    public static native Sela selaAddHitMiss(Sela sela);

    /**
     * Original signature : <code>SELA* selaAddDwaLinear(SELA*)</code>
     */
    public static native Sela selaAddDwaLinear(Sela sela);

    /**
     * Original signature : <code>SELA* selaAddDwaCombs(SELA*)</code>
     */
    public static native Sela selaAddDwaCombs(Sela sela);

    /**
     * Original signature :
     * <code>SELA* selaAddCrossJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Sela selaAddCrossJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);

    /**
     * Original signature :
     * <code>SELA* selaAddTJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code>
     */
    public static native Sela selaAddTJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);

    /**
     * Original signature : <code>SELA* sela4ccThin(SELA*)</code>
     */
    public static native Sela sela4ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela8ccThin(SELA*)</code>
     */
    public static native Sela sela8ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela4and8ccThin(SELA*)</code>
     */
    public static native Sela sela4and8ccThin(Sela sela);

    /**
     * Original signature : <code>SEL* selMakePlusSign(l_int32, l_int32)</code>
     */
    public static native Sel selMakePlusSign(int size, int linewidth);

    /**
     * Original signature :
     * <code>SEL* pixGenerateSelWithRuns(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native Sel pixGenerateSelWithRuns(Pix pixs, int nhlines, int nvlines, int distance, int minlength, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);

    /**
     * Original signature :
     * <code>SEL* pixGenerateSelRandom(PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native Sel pixGenerateSelRandom(Pix pixs, float hitfract, float missfract, int distance, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);

    /**
     * Original signature :
     * <code>SEL* pixGenerateSelBoundary(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code>
     */
    public static native Sel pixGenerateSelBoundary(Pix pixs, int hitdist, int missdist, int hitskip, int missskip, int topflag, int botflag, int leftflag, int rightflag, PointerByReference ppixe);

    /**
     * Original signature :
     * <code>NUMA* pixGetRunCentersOnLine(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixGetRunCentersOnLine(Pix pixs, int x, int y, int minlength);

    /**
     * Original signature :
     * <code>NUMA* pixGetRunsOnLine(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Numa pixGetRunsOnLine(Pix pixs, int x1, int y1, int x2, int y2);

    /**
     * Original signature :
     * <code>PTA* pixSubsampleBoundaryPixels(PIX*, l_int32)</code>
     */
    public static native Pta pixSubsampleBoundaryPixels(Pix pixs, int skip);

    /**
     * Original signature :
     * <code>l_int32 adjacentOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int adjacentOnPixelInRaster(Pix pixs, int x, int y, IntBuffer pxa, IntBuffer pya);

    /**
     * Original signature :
     * <code>PIX* pixDisplayHitMissSel(PIX*, SEL*, l_int32, l_uint32, l_uint32)</code>
     */
    public static native Pix pixDisplayHitMissSel(Pix pixs, Pointer sel, int scalefactor, int hitcolor, int misscolor);

    /**
     * Original signature :
     * <code>PIX* pixHShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixHShear(Pix pixd, Pix pixs, int yloc, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixVShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixVShear(Pix pixd, Pix pixs, int xloc, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixHShearCorner(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixHShearCorner(Pix pixd, Pix pixs, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixVShearCorner(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixVShearCorner(Pix pixd, Pix pixs, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixHShearCenter(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixHShearCenter(Pix pixd, Pix pixs, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixVShearCenter(PIX*, PIX*, l_float32, l_int32)</code>
     */
    public static native Pix pixVShearCenter(Pix pixd, Pix pixs, float radang, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixHShearIP(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native int pixHShearIP(Pix pixs, int yloc, float radang, int incolor);

    /**
     * Original signature :
     * <code>l_ok pixVShearIP(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native int pixVShearIP(Pix pixs, int xloc, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixHShearLI(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixHShearLI(Pix pixs, int yloc, float radang, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixVShearLI(PIX*, l_int32, l_float32, l_int32)</code>
     */
    public static native Pix pixVShearLI(Pix pixs, int xloc, float radang, int incolor);

    /**
     * Original signature : <code>PIX* pixDeskewBoth(PIX*, l_int32)</code>
     */
    public static native Pix pixDeskewBoth(Pix pixs, int redsearch);

    /**
     * Original signature : <code>PIX* pixDeskew(PIX*, l_int32)</code>
     */
    public static native Pix pixDeskew(Pix pixs, int redsearch);

    /**
     * Original signature :
     * <code>PIX* pixFindSkewAndDeskew(PIX*, l_int32, l_float32*, l_float32*)</code>
     */
    public static native Pix pixFindSkewAndDeskew(Pix pixs, int redsearch, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>PIX* pixDeskewGeneral(PIX*, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*)</code>
     */
    public static native Pix pixDeskewGeneral(Pix pixs, int redsweep, float sweeprange, float sweepdelta, int redsearch, int thresh, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_ok pixFindSkew(PIX*, l_float32*, l_float32*)</code>
     */
    public static native int pixFindSkew(Pix pixs, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweep(PIX*, l_float32*, l_int32, l_float32, l_float32)</code>
     */
    public static native int pixFindSkewSweep(Pix pixs, FloatBuffer pangle, int reduction, float sweeprange, float sweepdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearch(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32)</code>
     */
    public static native int pixFindSkewSweepAndSearch(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearchScore(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native int pixFindSkewSweepAndSearchScore(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_ok pixFindSkewSweepAndSearchScorePivot(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code>
     */
    public static native int pixFindSkewSweepAndSearchScorePivot(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta, int pivot);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewOrthogonalRange(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code>
     */
    public static native int pixFindSkewOrthogonalRange(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, float confprior);

    /**
     * Original signature :
     * <code>l_ok pixFindDifferentialSquareSum(PIX*, l_float32*)</code>
     */
    public static native int pixFindDifferentialSquareSum(Pix pixs, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_ok pixFindNormalizedSquareSum(PIX*, l_float32*, l_float32*, l_float32*)</code>
     */
    public static native int pixFindNormalizedSquareSum(Pix pixs, FloatBuffer phratio, FloatBuffer pvratio, FloatBuffer pfract);

    /**
     * Original signature : <code>PIX* pixReadStreamSpix(FILE*)</code>
     */
    public static native Pix pixReadStreamSpix(FILE fp);

    /**
     * Original signature :
     * <code>l_ok readHeaderSpix(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderSpix(String filename, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok freadHeaderSpix(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderSpix(FILE fp, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_ok sreadHeaderSpix(const l_uint32*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int sreadHeaderSpix(IntBuffer data, NativeSize size, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature : <code>l_ok pixWriteStreamSpix(FILE*, PIX*)</code>
     */
    public static native int pixWriteStreamSpix(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixReadMemSpix(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemSpix(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemSpix(l_uint8**, size_t*, PIX*)</code>
     */
    public static native int pixWriteMemSpix(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixSerializeToMemory(PIX*, l_uint32**, size_t*)</code>
     */
    public static native int pixSerializeToMemory(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>PIX* pixDeserializeFromMemory(const l_uint32*, size_t)</code>
     */
    public static native Pix pixDeserializeFromMemory(IntBuffer data, NativeSize nbytes);

    /**
     * Original signature : <code>L_STACK* lstackCreate(l_int32)</code>
     */
    public static native L_Stack lstackCreate(int n);

    /**
     * Original signature : <code>void lstackDestroy(L_STACK**, l_int32)</code>
     */
    public static native void lstackDestroy(PointerByReference plstack, int freeflag);

    /**
     * Original signature : <code>l_ok lstackAdd(L_STACK*, void*)</code>
     */
    public static native int lstackAdd(L_Stack lstack, Pointer item);

    /**
     * Original signature : <code>void* lstackRemove(L_STACK*)</code>
     */
    public static native Pointer lstackRemove(L_Stack lstack);

    /**
     * Original signature : <code>l_int32 lstackGetCount(L_STACK*)</code>
     */
    public static native int lstackGetCount(L_Stack lstack);

    /**
     * Original signature : <code>l_ok lstackPrint(FILE*, L_STACK*)</code>
     */
    public static native int lstackPrint(FILE fp, L_Stack lstack);

    /**
     * Original signature : <code>L_STRCODE* strcodeCreate(l_int32)</code>
     */
    public static native L_StrCode strcodeCreate(int fileno);

    /**
     * Original signature :
     * <code>l_ok strcodeCreateFromFile(const char*, l_int32, const char*)</code>
     */
    public static native int strcodeCreateFromFile(String filein, int fileno, String outdir);

    /**
     * Original signature :
     * <code>l_ok strcodeGenerate(L_STRCODE*, const char*, const char*)</code>
     */
    public static native int strcodeGenerate(L_StrCode strcode, String filein, String type);

    /**
     * Original signature :
     * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code>
     */
    public static native int strcodeFinalize(PointerByReference pstrcode, String outdir);

    /**
     * Original signature :
     * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code>
     */
    public static native int strcodeFinalize(PointerByReference pstrcode, Pointer outdir);

    /**
     * Original signature :
     * <code>l_int32 l_getStructStrFromFile(const char*, l_int32, char**)</code>
     */
    public static native int l_getStructStrFromFile(String filename, int field, PointerByReference pstr);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeLength(PIX*, l_int32*, l_int32*)</code>
     */
    public static native int pixFindStrokeLength(Pix pixs, IntBuffer tab8, IntBuffer plength);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code>
     */
    public static native int pixFindStrokeWidth(Pix pixs, float thresh, IntBuffer tab8, FloatBuffer pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>l_ok pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code>
     */
    public static native int pixFindStrokeWidth(Pix pixs, float thresh, IntByReference tab8, FloatByReference pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>NUMA* pixaFindStrokeWidth(PIXA*, l_float32, l_int32*, l_int32)</code>
     */
    public static native Numa pixaFindStrokeWidth(Pixa pixa, float thresh, IntBuffer tab8, int debug);

    /**
     * Original signature :
     * <code>PIXA* pixaModifyStrokeWidth(PIXA*, l_float32)</code>
     */
    public static native Pixa pixaModifyStrokeWidth(Pixa pixas, float targetw);

    /**
     * Original signature :
     * <code>PIX* pixModifyStrokeWidth(PIX*, l_float32, l_float32)</code>
     */
    public static native Pix pixModifyStrokeWidth(Pix pixs, float width, float targetw);

    /**
     * Original signature :
     * <code>PIXA* pixaSetStrokeWidth(PIXA*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pixa pixaSetStrokeWidth(Pixa pixas, int width, int thinfirst, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixSetStrokeWidth(PIX*, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixSetStrokeWidth(Pix pixs, int width, int thinfirst, int connectivity);

    /**
     * Original signature : <code>l_int32* sudokuReadFile(const char*)</code>
     */
    public static native IntByReference sudokuReadFile(String filename);

    /**
     * Original signature : <code>l_int32* sudokuReadString(const char*)</code>
     */
    public static native IntByReference sudokuReadString(String str);

    /**
     * Original signature : <code>L_SUDOKU* sudokuCreate(l_int32*)</code>
     */
    public static native L_Sudoku sudokuCreate(IntBuffer array);

    /**
     * Original signature : <code>void sudokuDestroy(L_SUDOKU**)</code>
     */
    public static native void sudokuDestroy(PointerByReference psud);

    /**
     * Original signature : <code>l_int32 sudokuSolve(L_SUDOKU*)</code>
     */
    public static native int sudokuSolve(L_Sudoku sud);

    /**
     * Original signature :
     * <code>l_ok sudokuTestUniqueness(l_int32*, l_int32*)</code>
     */
    public static native int sudokuTestUniqueness(IntBuffer array, IntBuffer punique);

    /**
     * Original signature :
     * <code>L_SUDOKU* sudokuGenerate(l_int32*, l_int32, l_int32, l_int32)</code>
     */
    public static native L_Sudoku sudokuGenerate(IntBuffer array, int seed, int minelems, int maxtries);

    /**
     * Original signature :
     * <code>l_int32 sudokuOutput(L_SUDOKU*, l_int32)</code>
     */
    public static native int sudokuOutput(L_Sudoku sud, int arraytype);

    /**
     * Original signature :
     * <code>PIX* pixAddSingleTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32*)</code>
     */
    public static native Pix pixAddSingleTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int location, IntBuffer poverflow);

    /**
     * Original signature :
     * <code>PIX* pixAddTextlines(PIX*, L_BMF*, const char*, l_uint32, l_int32)</code>
     */
    public static native Pix pixAddTextlines(Pix pixs, L_Bmf bmf, String textstr, int val, int location);

    /**
     * Original signature :
     * <code>l_ok pixSetTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int pixSetTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, int wtext, int firstindent, IntBuffer poverflow);

    /**
     * Original signature :
     * <code>l_ok pixSetTextline(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32*, l_int32*)</code>
     */
    public static native int pixSetTextline(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, IntBuffer pwidth, IntBuffer poverflow);

    /**
     * Original signature :
     * <code>PIXA* pixaAddTextNumber(PIXA*, L_BMF*, NUMA*, l_uint32, l_int32)</code>
     */
    public static native Pixa pixaAddTextNumber(Pixa pixas, L_Bmf bmf, Numa na, int val, int location);

    /**
     * Original signature :
     * <code>PIXA* pixaAddTextlines(PIXA*, L_BMF*, SARRAY*, l_uint32, l_int32)</code>
     */
    public static native Pixa pixaAddTextlines(Pixa pixas, L_Bmf bmf, Sarray sa, int val, int location);

    /**
     * Original signature :
     * <code>l_ok pixaAddPixWithText(PIXA*, PIX*, l_int32, L_BMF*, const char*, l_uint32, l_int32)</code>
     */
    public static native int pixaAddPixWithText(Pixa pixa, Pix pixs, int reduction, L_Bmf bmf, String textstr, int val, int location);

    /**
     * Original signature :
     * <code>SARRAY* bmfGetLineStrings(L_BMF*, const char*, l_int32, l_int32, l_int32*)</code>
     */
    public static native Sarray bmfGetLineStrings(L_Bmf bmf, String textstr, int maxw, int firstindent, IntBuffer ph);

    /**
     * Original signature :
     * <code>NUMA* bmfGetWordWidths(L_BMF*, const char*, SARRAY*)</code>
     */
    public static native Numa bmfGetWordWidths(L_Bmf bmf, String textstr, Sarray sa);

    /**
     * Original signature :
     * <code>l_ok bmfGetStringWidth(L_BMF*, const char*, l_int32*)</code>
     */
    public static native int bmfGetStringWidth(L_Bmf bmf, String textstr, IntBuffer pw);

    /**
     * Original signature :
     * <code>SARRAY* splitStringToParagraphs(char*, l_int32)</code>
     */
    public static native Sarray splitStringToParagraphs(ByteBuffer textstr, int splitflag);

    /**
     * Original signature : <code>PIX* pixReadTiff(const char*, l_int32)</code>
     */
    public static native Pix pixReadTiff(String filename, int n);

    /**
     * Original signature : <code>PIX* pixReadStreamTiff(FILE*, l_int32)</code>
     */
    public static native Pix pixReadStreamTiff(FILE fp, int n);

    /**
     * Original signature :
     * <code>l_ok pixWriteTiff(const char*, PIX*, l_int32, const char*)</code>
     */
    public static native int pixWriteTiff(String filename, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>l_ok pixWriteTiffCustom(const char*, PIX*, l_int32, const char*, NUMA*, SARRAY*, SARRAY*, NUMA*)</code>
     */
    public static native int pixWriteTiffCustom(String filename, Pix pix, int comptype, String modestr, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamTiff(FILE*, PIX*, l_int32)</code>
     */
    public static native int pixWriteStreamTiff(FILE fp, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamTiffWA(FILE*, PIX*, l_int32, const char*)</code>
     */
    public static native int pixWriteStreamTiffWA(FILE fp, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>PIX* pixReadFromMultipageTiff(const char*, size_t*)</code>
     */
    public static native Pix pixReadFromMultipageTiff(String fname, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMultipageTiff(const char*)</code>
     */
    public static native Pixa pixaReadMultipageTiff(String filename);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMultipageTiff(const char*, PIXA*)</code>
     */
    public static native int pixaWriteMultipageTiff(String fname, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok writeMultipageTiff(const char*, const char*, const char*)</code>
     */
    public static native int writeMultipageTiff(String dirin, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_ok writeMultipageTiffSA(SARRAY*, const char*)</code>
     */
    public static native int writeMultipageTiffSA(Sarray sa, String fileout);

    /**
     * Original signature : <code>l_ok fprintTiffInfo(FILE*, const char*)</code>
     */
    public static native int fprintTiffInfo(FILE fpout, String tiffile);

    /**
     * Original signature : <code>l_ok tiffGetCount(FILE*, l_int32*)</code>
     */
    public static native int tiffGetCount(FILE fp, IntBuffer pn);

    /**
     * Original signature :
     * <code>l_ok getTiffResolution(FILE*, l_int32*, l_int32*)</code>
     */
    public static native int getTiffResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_ok readHeaderTiff(const char*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderTiff(String filename, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok freadHeaderTiff(FILE*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int freadHeaderTiff(FILE fp, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemTiff(const l_uint8*, size_t, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemTiff(ByteBuffer cdata, NativeSize size, int n, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_ok findTiffCompression(FILE*, l_int32*)</code>
     */
    public static native int findTiffCompression(FILE fp, IntBuffer pcomptype);

    /**
     * Original signature :
     * <code>l_ok extractG4DataFromFile(const char*, l_uint8**, size_t*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int extractG4DataFromFile(String filein, PointerByReference pdata, NativeSizeByReference pnbytes, IntBuffer pw, IntBuffer ph, IntBuffer pminisblack);

    /**
     * Original signature :
     * <code>PIX* pixReadMemTiff(const l_uint8*, size_t, l_int32)</code>
     */
    public static native Pix pixReadMemTiff(ByteBuffer cdata, NativeSize size, int n);

    /**
     * Original signature :
     * <code>PIX* pixReadMemFromMultipageTiff(const l_uint8*, size_t, size_t*)</code>
     */
    public static native Pix pixReadMemFromMultipageTiff(ByteBuffer cdata, NativeSize size, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMemMultipageTiff(const l_uint8*, size_t)</code>
     */
    public static native Pixa pixaReadMemMultipageTiff(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMemMultipageTiff(l_uint8**, size_t*, PIXA*)</code>
     */
    public static native int pixaWriteMemMultipageTiff(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemTiff(l_uint8**, size_t*, PIX*, l_int32)</code>
     */
    public static native int pixWriteMemTiff(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemTiffCustom(l_uint8**, size_t*, PIX*, l_int32, NUMA*, SARRAY*, SARRAY*, NUMA*)</code>
     */
    public static native int pixWriteMemTiffCustom(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);

    /**
     * Original signature : <code>l_int32 setMsgSeverity(l_int32)</code>
     */
    public static native int setMsgSeverity(int newsev);

    /**
     * Original signature :
     * <code>l_int32 returnErrorInt(const char*, const char*, l_int32)</code>
     */
    public static native int returnErrorInt(String msg, String procname, int ival);

    /**
     * Original signature :
     * <code>l_float32 returnErrorFloat(const char*, const char*, l_float32)</code>
     */
    public static native float returnErrorFloat(String msg, String procname, float fval);

    /**
     * Original signature :
     * <code>void* returnErrorPtr(const char*, const char*, void*)</code>
     */
    public static native Pointer returnErrorPtr(String msg, String procname, Pointer pval);

    /**
     * Original signature :
     * <code>l_int32 returnErrorInt1(const char*, const char*, const char*, l_int32)</code>
     */
    public static native int returnErrorInt1(String msg, String arg, String procname, int ival);

    /**
     * Original signature :
     * <code>l_float32 returnErrorFloat1(const char*, const char*, const char*, l_float32)</code>
     */
    public static native float returnErrorFloat1(String msg, String arg, String procname, float fval);

    /**
     * Original signature :
     * <code>void* returnErrorPtr1(const char*, const char*, const char*, void*)</code>
     */
    public static native Pointer returnErrorPtr1(String msg, String arg, String procname, Pointer pval);

    /**
     * Original signature :
     * <code>void leptSetStderrHandler(leptSetStderrHandler_handler_callback*)</code>
     */
    public static native void leptSetStderrHandler(leptSetStderrHandler_handler_callback handler);

    /**
     * Original signature : <code>void lept_stderr(const char*, null)</code>
     */
    public static native void lept_stderr(String fmt, PointerByReference varArgs1);

    /**
     * Original signature :
     * <code>l_ok filesAreIdentical(const char*, const char*, l_int32*)</code>
     */
    public static native int filesAreIdentical(String fname1, String fname2, IntBuffer psame);

    /**
     * Original signature : <code>l_uint16 convertOnLittleEnd16(l_uint16)</code>
     */
    public static native short convertOnLittleEnd16(short shortin);

    /**
     * Original signature : <code>l_uint16 convertOnBigEnd16(l_uint16)</code>
     */
    public static native short convertOnBigEnd16(short shortin);

    /**
     * Original signature : <code>l_uint32 convertOnLittleEnd32(l_uint32)</code>
     */
    public static native int convertOnLittleEnd32(int wordin);

    /**
     * Original signature : <code>l_uint32 convertOnBigEnd32(l_uint32)</code>
     */
    public static native int convertOnBigEnd32(int wordin);

    /**
     * Original signature :
     * <code>l_ok fileCorruptByDeletion(const char*, l_float32, l_float32, const char*)</code>
     */
    public static native int fileCorruptByDeletion(String filein, float loc, float size, String fileout);

    /**
     * Original signature :
     * <code>l_ok fileCorruptByMutation(const char*, l_float32, l_float32, const char*)</code>
     */
    public static native int fileCorruptByMutation(String filein, float loc, float size, String fileout);

    /**
     * Original signature :
     * <code>l_ok fileReplaceBytes(const char*, l_int32, l_int32, l_uint8*, size_t, const char*)</code>
     */
    public static native int fileReplaceBytes(String filein, int start, int nbytes, ByteBuffer newdata, NativeSize newsize, String fileout);

    /**
     * Original signature :
     * <code>l_ok genRandomIntOnInterval(l_int32, l_int32, l_int32, l_int32*)</code>
     */
    public static native int genRandomIntOnInterval(int start, int end, int seed, IntBuffer pval);

    /**
     * Original signature : <code>l_int32 lept_roundftoi(l_float32)</code>
     */
    public static native int lept_roundftoi(float fval);

    /**
     * Original signature : <code>l_int32 lept_floor(l_float32)</code>
     */
    public static native int lept_floor(float fval);

    /**
     * Original signature : <code>l_int32 lept_ceiling(l_float32)</code>
     */
    public static native int lept_ceiling(float fval);

    /**
     * Original signature :
     * <code>l_ok l_hashStringToUint64(const char*, l_uint64*)</code>
     */
    public static native int l_hashStringToUint64(String str, LongBuffer phash);

    /**
     * Original signature :
     * <code>l_ok l_hashStringToUint64Fast(const char*, l_uint64*)</code>
     */
    public static native int l_hashStringToUint64Fast(String str, LongBuffer phash);

    /**
     * Original signature :
     * <code>l_ok l_hashPtToUint64(l_int32, l_int32, l_uint64*)</code>
     */
    public static native int l_hashPtToUint64(int x, int y, LongBuffer phash);

    /**
     * Original signature :
     * <code>l_ok l_hashFloat64ToUint64(l_float64, l_uint64*)</code>
     */
    public static native int l_hashFloat64ToUint64(double val, LongBuffer phash);

    /**
     * Original signature :
     * <code>l_ok findNextLargerPrime(l_int32, l_uint32*)</code>
     */
    public static native int findNextLargerPrime(int start, IntBuffer pprime);

    /**
     * Original signature :
     * <code>l_ok lept_isPrime(l_uint64, l_int32*, l_uint32*)</code>
     */
    public static native int lept_isPrime(long n, IntBuffer pis_prime, IntBuffer pfactor);

    /**
     * Original signature : <code>l_uint32 convertIntToGrayCode(l_uint32)</code>
     */
    public static native int convertIntToGrayCode(int val);

    /**
     * Original signature : <code>l_uint32 convertGrayCodeToInt(l_uint32)</code>
     */
    public static native int convertGrayCodeToInt(int val);

    /**
     * Original signature : <code>char* getLeptonicaVersion()</code>
     */
    public static native Pointer getLeptonicaVersion();

    /**
     * Original signature : <code>void startTimer()</code>
     */
    public static native void startTimer();

    /**
     * Original signature : <code>l_float32 stopTimer()</code>
     */
    public static native float stopTimer();

    /**
     * Original signature : <code>L_TIMER startTimerNested()</code>
     */
    public static native Pointer startTimerNested();

    /**
     * Original signature : <code>l_float32 stopTimerNested(L_TIMER)</code>
     */
    public static native float stopTimerNested(Pointer rusage_start);

    /**
     * Original signature :
     * <code>void l_getCurrentTime(l_int32*, l_int32*)</code>
     */
    public static native void l_getCurrentTime(IntBuffer sec, IntBuffer usec);

    /**
     * Original signature : <code>L_WALLTIMER* startWallTimer()</code>
     */
    public static native L_WallTimer startWallTimer();

    /**
     * Original signature : <code>l_float32 stopWallTimer(L_WALLTIMER**)</code>
     */
    public static native float stopWallTimer(PointerByReference ptimer);

    /**
     * Original signature : <code>char* l_getFormattedDate()</code>
     */
    public static native Pointer l_getFormattedDate();

    /**
     * Original signature : <code>char* stringNew(const char*)</code>
     */
    public static native Pointer stringNew(String src);

    /**
     * Original signature :
     * <code>l_ok stringCopy(char*, const char*, l_int32)</code>
     */
    public static native int stringCopy(ByteBuffer dest, String src, int n);

    /**
     * Original signature :
     * <code>char* stringCopySegment(const char*, l_int32, l_int32)</code>
     */
    public static native Pointer stringCopySegment(String src, int start, int nbytes);

    /**
     * Original signature : <code>l_ok stringReplace(char**, const char*)</code>
     */
    public static native int stringReplace(PointerByReference pdest, String src);

    /**
     * Original signature :
     * <code>l_int32 stringLength(const char*, size_t)</code>
     */
    public static native int stringLength(String src, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 stringCat(char*, size_t, const char*)</code>
     */
    public static native int stringCat(ByteBuffer dest, NativeSize size, String src);

    /**
     * Original signature :
     * <code>char* stringConcatNew(const char*, null)</code>
     */
    public static native Pointer stringConcatNew(String first, PointerByReference varArgs1);

    /**
     * Original signature :
     * <code>char* stringJoin(const char*, const char*)</code>
     */
    public static native Pointer stringJoin(String src1, String src2);

    /**
     * Original signature : <code>l_ok stringJoinIP(char**, const char*)</code>
     */
    public static native int stringJoinIP(PointerByReference psrc1, String src2);

    /**
     * Original signature : <code>char* stringReverse(const char*)</code>
     */
    public static native Pointer stringReverse(String src);

    /**
     * Original signature :
     * <code>char* strtokSafe(char*, const char*, char**)</code>
     */
    public static native Pointer strtokSafe(ByteBuffer cstr, String seps, PointerByReference psaveptr);

    /**
     * Original signature :
     * <code>l_ok stringSplitOnToken(char*, const char*, char**, char**)</code>
     */
    public static native int stringSplitOnToken(ByteBuffer cstr, String seps, PointerByReference phead, PointerByReference ptail);

    /**
     * Original signature :
     * <code>l_ok stringCheckForChars(const char*, const char*, l_int32*)</code>
     */
    public static native int stringCheckForChars(String src, String chars, IntBuffer pfound);

    /**
     * Original signature :
     * <code>char* stringRemoveChars(const char*, const char*)</code>
     */
    public static native Pointer stringRemoveChars(String src, String remchars);

    /**
     * Original signature :
     * <code>char* stringReplaceEachSubstr(const char*, const char*, const char*, l_int32*)</code>
     */
    public static native Pointer stringReplaceEachSubstr(String src, String sub1, String sub2, IntBuffer pcount);

    /**
     * Original signature :
     * <code>char* stringReplaceSubstr(const char*, const char*, const char*, l_int32*, l_int32*)</code>
     */
    public static native Pointer stringReplaceSubstr(String src, String sub1, String sub2, IntBuffer ploc, IntBuffer pfound);

    /**
     * Original signature :
     * <code>L_DNA* stringFindEachSubstr(const char*, const char*)</code>
     */
    public static native L_Dna stringFindEachSubstr(String src, String sub);

    /**
     * Original signature :
     * <code>l_int32 stringFindSubstr(const char*, const char*, l_int32*)</code>
     */
    public static native int stringFindSubstr(String src, String sub, IntBuffer ploc);

    /**
     * Original signature :
     * <code>l_uint8* arrayReplaceEachSequence(const l_uint8*, size_t, const l_uint8*, size_t, const l_uint8*, size_t, size_t*, l_int32*)</code>
     */
    public static native Pointer arrayReplaceEachSequence(ByteBuffer datas, NativeSize dataslen, ByteBuffer seq, NativeSize seqlen, ByteBuffer newseq, NativeSize newseqlen, NativeSizeByReference pdatadlen, IntBuffer pcount);

    /**
     * Original signature :
     * <code>L_DNA* arrayFindEachSequence(const l_uint8*, size_t, const l_uint8*, size_t)</code>
     */
    public static native L_Dna arrayFindEachSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen);

    /**
     * Original signature :
     * <code>l_ok arrayFindSequence(const l_uint8*, size_t, const l_uint8*, size_t, l_int32*, l_int32*)</code>
     */
    public static native int arrayFindSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen, IntBuffer poffset, IntBuffer pfound);

    /**
     * Original signature :
     * <code>void* reallocNew(void**, size_t, size_t)</code>
     */
    public static native Pointer reallocNew(PointerByReference pindata, NativeSize oldsize, NativeSize newsize);

    /**
     * Original signature :
     * <code>l_uint8* l_binaryRead(const char*, size_t*)</code>
     */
    public static native Pointer l_binaryRead(String filename, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_uint8* l_binaryReadStream(FILE*, size_t*)</code>
     */
    public static native Pointer l_binaryReadStream(FILE fp, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_uint8* l_binaryReadSelect(const char*, size_t, size_t, size_t*)</code>
     */
    public static native Pointer l_binaryReadSelect(String filename, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);

    /**
     * Original signature :
     * <code>l_uint8* l_binaryReadSelectStream(FILE*, size_t, size_t, size_t*)</code>
     */
    public static native Pointer l_binaryReadSelectStream(FILE fp, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);

    /**
     * Original signature :
     * <code>l_ok l_binaryWrite(const char*, const char*, const void*, size_t)</code>
     */
    public static native int l_binaryWrite(String filename, String operation, Pointer data, NativeSize nbytes);

    /**
     * Original signature : <code>size_t nbytesInFile(const char*)</code>
     */
    public static native NativeSize nbytesInFile(String filename);

    /**
     * Original signature : <code>size_t fnbytesInFile(FILE*)</code>
     */
    public static native NativeSize fnbytesInFile(FILE fp);

    /**
     * Original signature :
     * <code>l_uint8* l_binaryCopy(const l_uint8*, size_t)</code>
     */
    public static native Pointer l_binaryCopy(ByteBuffer datas, NativeSize size);

    /**
     * Original signature :
     * <code>l_ok l_binaryCompare(const l_uint8*, size_t, const l_uint8*, size_t, l_int32*)</code>
     */
    public static native int l_binaryCompare(ByteBuffer data1, NativeSize size1, ByteBuffer data2, NativeSize size2, IntBuffer psame);

    /**
     * Original signature : <code>l_ok fileCopy(const char*, const char*)</code>
     */
    public static native int fileCopy(String srcfile, String newfile);

    /**
     * Original signature :
     * <code>l_ok fileConcatenate(const char*, const char*)</code>
     */
    public static native int fileConcatenate(String srcfile, String destfile);

    /**
     * Original signature :
     * <code>l_ok fileAppendString(const char*, const char*)</code>
     */
    public static native int fileAppendString(String filename, String str);

    /**
     * Original signature :
     * <code>l_ok fileSplitLinesUniform(const char*, l_int32, l_int32, const char*, const char*)</code>
     */
    public static native int fileSplitLinesUniform(String filename, int n, int save_empty, String rootpath, String ext);

    /**
     * Original signature : <code>FILE* fopenReadStream(const char*)</code>
     */
    public static native FILE fopenReadStream(String filename);

    /**
     * Original signature :
     * <code>FILE* fopenWriteStream(const char*, const char*)</code>
     */
    public static native FILE fopenWriteStream(String filename, String modestring);

    /**
     * Original signature :
     * <code>FILE* fopenReadFromMemory(const l_uint8*, size_t)</code>
     */
    public static native FILE fopenReadFromMemory(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>FILE* fopenWriteWinTempfile()</code>
     */
    public static native FILE fopenWriteWinTempfile();

    /**
     * Original signature :
     * <code>FILE* lept_fopen(const char*, const char*)</code>
     */
    public static native FILE lept_fopen(String filename, String mode);

    /**
     * Original signature : <code>l_ok lept_fclose(FILE*)</code>
     */
    public static native int lept_fclose(FILE fp);

    /**
     * Original signature : <code>void* lept_calloc(size_t, size_t)</code>
     */
    public static native Pointer lept_calloc(NativeSize nmemb, NativeSize size);

    /**
     * Original signature : <code>void lept_free(void*)</code>
     */
    public static native void lept_free(Pointer ptr);

    /**
     * Original signature : <code>l_int32 lept_mkdir(const char*)</code>
     */
    public static native int lept_mkdir(String subdir);

    /**
     * Original signature : <code>l_int32 lept_rmdir(const char*)</code>
     */
    public static native int lept_rmdir(String subdir);

    /**
     * Original signature :
     * <code>void lept_direxists(const char*, l_int32*)</code>
     */
    public static native void lept_direxists(String dir, IntBuffer pexists);

    /**
     * Original signature :
     * <code>l_int32 lept_rm_match(const char*, const char*)</code>
     */
    public static native int lept_rm_match(String subdir, String substr);

    /**
     * Original signature :
     * <code>l_int32 lept_rm(const char*, const char*)</code>
     */
    public static native int lept_rm(String subdir, String tail);

    /**
     * Original signature : <code>l_int32 lept_rmfile(const char*)</code>
     */
    public static native int lept_rmfile(String filepath);

    /**
     * Original signature :
     * <code>l_int32 lept_mv(const char*, const char*, const char*, char**)</code>
     */
    public static native int lept_mv(String srcfile, String newdir, String newtail, PointerByReference pnewpath);

    /**
     * Original signature :
     * <code>l_int32 lept_cp(const char*, const char*, const char*, char**)</code>
     */
    public static native int lept_cp(String srcfile, String newdir, String newtail, PointerByReference pnewpath);

    /**
     * Original signature : <code>l_int32 callSystemDebug(const char*)</code>
     */
    public static native int callSystemDebug(String cmd);

    /**
     * Original signature :
     * <code>l_ok splitPathAtDirectory(const char*, char**, char**)</code>
     */
    public static native int splitPathAtDirectory(String pathname, PointerByReference pdir, PointerByReference ptail);

    /**
     * Original signature :
     * <code>l_ok splitPathAtExtension(const char*, char**, char**)</code>
     */
    public static native int splitPathAtExtension(String pathname, PointerByReference pbasename, PointerByReference pextension);

    /**
     * Original signature :
     * <code>char* pathJoin(const char*, const char*)</code>
     */
    public static native Pointer pathJoin(String dir, String fname);

    /**
     * Original signature :
     * <code>char* appendSubdirs(const char*, const char*)</code>
     */
    public static native Pointer appendSubdirs(String basedir, String subdirs);

    /**
     * Original signature :
     * <code>l_ok convertSepCharsInPath(char*, l_int32)</code>
     */
    public static native int convertSepCharsInPath(ByteBuffer path, int type);

    /**
     * Original signature :
     * <code>char* genPathname(const char*, const char*)</code>
     */
    public static native Pointer genPathname(String dir, String fname);

    /**
     * Original signature :
     * <code>l_ok makeTempDirname(char*, size_t, const char*)</code>
     */
    public static native int makeTempDirname(ByteBuffer result, NativeSize nbytes, String subdir);

    /**
     * Original signature :
     * <code>l_ok modifyTrailingSlash(char*, size_t, l_int32)</code>
     */
    public static native int modifyTrailingSlash(ByteBuffer path, NativeSize nbytes, int flag);

    /**
     * Original signature : <code>char* l_makeTempFilename()</code>
     */
    public static native Pointer l_makeTempFilename();

    /**
     * Original signature :
     * <code>l_int32 extractNumberFromFilename(const char*, l_int32, l_int32)</code>
     */
    public static native int extractNumberFromFilename(String fname, int numpre, int numpost);

    /**
     * Original signature :
     * <code>PIX* pixSimpleCaptcha(PIX*, l_int32, l_int32, l_uint32, l_uint32, l_int32)</code>
     */
    public static native Pix pixSimpleCaptcha(Pix pixs, int border, int nterms, int seed, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRandomHarmonicWarp(PIX*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32, l_uint32, l_int32)</code>
     */
    public static native Pix pixRandomHarmonicWarp(Pix pixs, float xmag, float ymag, float xfreq, float yfreq, int nx, int ny, int seed, int grayval);

    /**
     * Original signature :
     * <code>PIX* pixWarpStereoscopic(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixWarpStereoscopic(Pix pixs, int zbend, int zshiftt, int zshiftb, int ybendt, int ybendb, int redleft);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontal(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixStretchHorizontal(Pix pixs, int dir, int type, int hmax, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixStretchHorizontalSampled(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixStretchHorizontalLI(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShear(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixQuadraticVShear(Pix pixs, int dir, int vmaxt, int vmaxb, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixQuadraticVShearSampled(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native Pix pixQuadraticVShearLI(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStereoFromPair(PIX*, PIX*, l_float32, l_float32, l_float32)</code>
     */
    public static native Pix pixStereoFromPair(Pix pix1, Pix pix2, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>L_WSHED* wshedCreate(PIX*, PIX*, l_int32, l_int32)</code>
     */
    public static native L_WShed wshedCreate(Pix pixs, Pix pixm, int mindepth, int debugflag);

    /**
     * Original signature : <code>void wshedDestroy(L_WSHED**)</code>
     */
    public static native void wshedDestroy(PointerByReference pwshed);

    /**
     * Original signature : <code>l_ok wshedApply(L_WSHED*)</code>
     */
    public static native int wshedApply(L_WShed wshed);

    /**
     * Original signature :
     * <code>l_ok wshedBasins(L_WSHED*, PIXA**, NUMA**)</code>
     */
    public static native int wshedBasins(L_WShed wshed, PointerByReference ppixa, PointerByReference pnalevels);

    /**
     * Original signature : <code>PIX* wshedRenderFill(L_WSHED*)</code>
     */
    public static native Pix wshedRenderFill(L_WShed wshed);

    /**
     * Original signature : <code>PIX* wshedRenderColors(L_WSHED*)</code>
     */
    public static native Pix wshedRenderColors(L_WShed wshed);

    /**
     * Original signature :
     * <code>l_ok pixaWriteWebPAnim(const char*, PIXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixaWriteWebPAnim(String filename, Pixa pixa, int loopcount, int duration, int quality, int lossless);

    /**
     * Original signature :
     * <code>l_ok pixaWriteStreamWebPAnim(FILE*, PIXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixaWriteStreamWebPAnim(FILE fp, Pixa pixa, int loopcount, int duration, int quality, int lossless);

    /**
     * Original signature :
     * <code>l_ok pixaWriteMemWebPAnim(l_uint8**, size_t*, PIXA*, l_int32, l_int32, l_int32, l_int32)</code>
     */
    public static native int pixaWriteMemWebPAnim(PointerByReference pencdata, NativeSizeByReference pencsize, Pixa pixa, int loopcount, int duration, int quality, int lossless);

    /**
     * Original signature : <code>PIX* pixReadStreamWebP(FILE*)</code>
     */
    public static native Pix pixReadStreamWebP(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemWebP(const l_uint8*, size_t)</code>
     */
    public static native Pix pixReadMemWebP(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_ok readHeaderWebP(const char*, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderWebP(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok readHeaderMemWebP(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*)</code>
     */
    public static native int readHeaderMemWebP(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_ok pixWriteWebP(const char*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteWebP(String filename, Pix pixs, int quality, int lossless);

    /**
     * Original signature :
     * <code>l_ok pixWriteStreamWebP(FILE*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteStreamWebP(FILE fp, Pix pixs, int quality, int lossless);

    /**
     * Original signature :
     * <code>l_ok pixWriteMemWebP(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteMemWebP(PointerByReference pencdata, NativeSizeByReference pencsize, Pix pixs, int quality, int lossless);

    /**
     * Original signature : <code>l_int32 l_jpegSetQuality(l_int32)</code>
     */
    public static native int l_jpegSetQuality(int new_quality);

    /**
     * Original signature : <code>void setLeptDebugOK(l_int32)</code>
     */
    public static native void setLeptDebugOK(int allow);

    /**
     * Original signature :
     * <code>l_ok pixaWriteFiles(const char*, PIXA*, l_int32)</code>
     */
    public static native int pixaWriteFiles(String rootname, Pixa pixa, int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteDebug(const char*, PIX*, l_int32)</code>
     */
    public static native int pixWriteDebug(String fname, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWrite(const char*, PIX*, l_int32)</code>
     */
    public static native int pixWrite(String fname, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteAutoFormat(const char*, PIX*)</code>
     */
    public static native int pixWriteAutoFormat(String filename, Pix pix);

    /**
     * Original signature :
     * <code>l_ok pixWriteStream(FILE*, PIX*, l_int32)</code>
     */
    public static native int pixWriteStream(FILE fp, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteImpliedFormat(const char*, PIX*, l_int32, l_int32)</code>
     */
    public static native int pixWriteImpliedFormat(String filename, Pix pix, int quality, int progressive);

    /**
     * Original signature : <code>l_int32 pixChooseOutputFormat(PIX*)</code>
     */
    public static native int pixChooseOutputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 getFormatFromExtension(const char*)</code>
     */
    public static native int getFormatFromExtension(String extension);

    /**
     * Original signature :
     * <code>l_int32 getImpliedFileFormat(const char*)</code>
     */
    public static native int getImpliedFileFormat(String filename);

    /**
     * Original signature : <code>l_ok pixGetAutoFormat(PIX*, l_int32*)</code>
     */
    public static native int pixGetAutoFormat(Pix pix, IntBuffer pformat);

    /**
     * Original signature : <code>char* getFormatExtension(l_int32)</code>
     */
    public static native Pointer getFormatExtension(int format);

    /**
     * Original signature :
     * <code>l_ok pixWriteMem(l_uint8**, size_t*, PIX*, l_int32)</code>
     */
    public static native int pixWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_ok l_fileDisplay(const char*, l_int32, l_int32, l_float32)</code>
     */
    public static native int l_fileDisplay(String fname, int x, int y, float scale);

    /**
     * Original signature : <code>l_ok pixDisplay(PIX*, l_int32, l_int32)</code>
     */
    public static native int pixDisplay(Pix pixs, int x, int y);

    /**
     * Original signature :
     * <code>l_ok pixDisplayWithTitle(PIX*, l_int32, l_int32, const char*, l_int32)</code>
     */
    public static native int pixDisplayWithTitle(Pix pixs, int x, int y, String title, int dispflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeColorSquare(l_uint32, l_int32, l_int32, l_int32, l_uint32)</code>
     */
    public static native Pix pixMakeColorSquare(int color, int size, int addlabel, int location, int textcolor);

    /**
     * Original signature : <code>void l_chooseDisplayProg(l_int32)</code>
     */
    public static native void l_chooseDisplayProg(int selection);

    /**
     * Original signature :
     * <code>void changeFormatForMissingLib(l_int32*)</code>
     */
    public static native void changeFormatForMissingLib(IntBuffer pformat);

    /**
     * Original signature : <code>l_ok pixDisplayWrite(PIX*, l_int32)</code>
     */
    public static native int pixDisplayWrite(Pix pixs, int reduction);

    /**
     * Original signature :
     * <code>l_uint8* zlibCompress(const l_uint8*, size_t, size_t*)</code>
     */
    public static native Pointer zlibCompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_uint8* zlibUncompress(const l_uint8*, size_t, size_t*)</code>
     */
    public static native Pointer zlibUncompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);
}
