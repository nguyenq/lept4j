/*
 * Copyright 2015 Quan.
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

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.ochafik.lang.jnaerator.runtime.NativeSizeByReference;
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
import org.rococoa.Selector;

public class LeptonicaImpl implements Leptonica {

    public Leptonica getInstance() {
        return Leptonica.INSTANCE;
    }

    @Override
    public Pix pixCleanBackgroundToWhite(Pix pixs, Pix pixim, Pix pixg, float gamma, int blackval, int whiteval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBackgroundNormSimple(Pix pixs, Pix pixim, Pix pixg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBackgroundNorm(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBackgroundNormMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBackgroundNormGrayArray(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBackgroundNormRGBArrays(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBackgroundNormGrayArrayMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBackgroundNormRGBArraysMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBackgroundGrayMap(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBackgroundRGBMap(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBackgroundGrayMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBackgroundRGBMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFillMapHoles(Pix pix, int nx, int ny, int filltype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExtendByReplication(Pix pixs, int addw, int addh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSmoothConnectedRegions(Pix pixs, Pix pixm, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGetInvBackgroundMap(Pix pixs, int bgval, int smoothx, int smoothy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixApplyInvBackgroundGrayMap(Pix pixs, Pix pixm, int sx, int sy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixApplyInvBackgroundRGBMap(Pix pixs, Pix pixmr, Pix pixmg, Pix pixmb, int sx, int sy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixApplyVariableGrayMap(Pix pixs, Pix pixg, int target) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGlobalNormRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int mapval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGlobalNormNoSatRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int factor, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixThresholdSpreadNorm(Pix pixs, int filtertype, int edgethresh, int smoothx, int smoothy, float gamma, int minval, int maxval, int targetthresh, PointerByReference ppixth, PointerByReference ppixb, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBackgroundNormFlex(Pix pixs, int sx, int sy, int smoothx, int smoothy, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixContrastNorm(Pix pixd, Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMinMaxTiles(Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy, PointerByReference ppixmin, PointerByReference ppixmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetLowContrast(Pix pixs1, Pix pixs2, int mindiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixLinearTRCTiled(Pix pixd, Pix pixs, int sx, int sy, Pix pixmin, Pix pixmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffineSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffineSampled(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffinePta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffine(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffinePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffineColor(Pix pixs, FloatBuffer vc, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffinePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffineGray(Pix pixs, FloatBuffer vc, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffinePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getAffineXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int affineInvertXform(FloatBuffer vc, PointerByReference pvci) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int affineXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int affineXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int linearInterpolatePixelColor(IntBuffer datas, int wpls, int w, int h, float x, float y, int colorval, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int linearInterpolatePixelGray(IntBuffer datas, int wpls, int w, int h, float x, float y, int grayval, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gaussjordan(PointerByReference a, FloatBuffer b, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAffineSequential(Pix pixs, Pta ptad, Pta ptas, int bw, int bh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference createMatrix2dTranslate(float transx, float transy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference createMatrix2dScale(float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference createMatrix2dRotate(float xc, float yc, float angle) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaTranslate(Pta ptas, float transx, float transy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaScale(Pta ptas, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaRotate(Pta ptas, float xc, float yc, float angle) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaTranslate(Boxa boxas, float transx, float transy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaScale(Boxa boxas, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaRotate(Boxa boxas, float xc, float yc, float angle) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaAffineTransform(Pta ptas, FloatBuffer mat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaAffineTransform(Boxa boxas, FloatBuffer mat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_productMatVec(FloatBuffer mat, FloatBuffer vecs, FloatBuffer vecd, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_productMat2(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer matd, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_productMat3(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer matd, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_productMat4(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer mat4, FloatBuffer matd, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataBit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataBit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_clearDataBit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataBitVal(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataDibit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataDibit(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_clearDataDibit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataQbit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataQbit(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_clearDataQbit(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataByte(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataByte(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataTwoBytes(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataTwoBytes(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getDataFourBytes(Pointer line, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setDataFourBytes(Pointer line, int n, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer barcodeDispatchDecoder(ByteBuffer barstr, int format, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int barcodeFormatIsSupported(int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixFindBaselines(Pix pixs, PointerByReference ppta, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDeskewLocal(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetLocalSkewTransform(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, PointerByReference pptas, PointerByReference pptad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetLocalSkewAngles(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, FloatBuffer pa, FloatBuffer pb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_ByteBuffer bbufferCreate(ByteBuffer indata, int nalloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bbufferDestroy(PointerByReference pbb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer bbufferDestroyAndSaveData(PointerByReference pbb, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferRead(L_ByteBuffer bb, ByteBuffer src, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferReadStream(L_ByteBuffer bb, FILE fp, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferExtendArray(L_ByteBuffer bb, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferWrite(L_ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferWriteStream(L_ByteBuffer bb, FILE fp, NativeSize nbytes, NativeSizeByReference pnout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilateral(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilateralGray(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilateralExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilateralGrayExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockBilateralExact(Pix pixs, float spatial_stdev, float range_stdev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel makeRangeKernel(float range_stdev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearSampled(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearPta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinear(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearPtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearColor(Pix pixs, FloatBuffer vc, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearPtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearGray(Pix pixs, FloatBuffer vc, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBilinearPtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getBilinearXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bilinearXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bilinearXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixOtsuAdaptiveThreshold(Pix pixs, int sx, int sy, int smoothx, int smoothy, float scorefract, PointerByReference ppixth, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOtsuThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, float scorefract, IntBuffer pthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaskedThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int smoothx, int smoothy, float scorefract, IntBuffer pthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSauvolaBinarizeTiled(Pix pixs, int whsize, float factor, int nx, int ny, PointerByReference ppixth, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSauvolaBinarize(Pix pixs, int whsize, float factor, int addborder, PointerByReference ppixm, PointerByReference ppixsd, PointerByReference ppixth, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSauvolaGetThreshold(Pix pixm, Pix pixms, float factor, PointerByReference ppixsd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixApplyLocalThreshold(Pix pixs, Pix pixth, int redfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntBuffer pglobthresh, PointerByReference ppixd, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntByReference pglobthresh, PointerByReference ppixd, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExpandBinaryReplicate(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExpandBinaryPower2(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReduceBinary2(Pix pixs, ByteBuffer intab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReduceRankBinaryCascade(Pix pixs, int level1, int level2, int level3, int level4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReduceRankBinary2(Pix pixs, int level, ByteBuffer intab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeSubsampleTab2x() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlend(Pix pixs1, Pix pixs2, int x, int y, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendMask(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendGray(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type, int transparent, int transpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendGrayInverse(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendColor(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int transparent, int transpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendColorByChannel(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float rfract, float gfract, float bfract, int transparent, int transpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendGrayAdapt(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int shift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFadeWithGray(Pix pixs, Pix pixb, float factor, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendHardLight(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBlendCmap(Pix pixs, Pix pixb, int x, int y, int sindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendWithGrayMask(Pix pixs1, Pix pixs2, Pix pixg, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendBackgroundToColor(Pix pixd, Pix pixs, Box box, int color, float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMultiplyByColor(Pix pixd, Pix pixs, Box box, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAlphaBlendUniform(Pix pixs, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddAlphaToBlend(Pix pixs, float fract, int invert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSetAlphaOverWhite(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bmf bmfCreate(String dir, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bmfDestroy(PointerByReference pbmf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix bmfGetPix(L_Bmf bmf, byte chr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bmfGetWidth(L_Bmf bmf, byte chr, IntBuffer pw) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bmfGetBaseline(L_Bmf bmf, byte chr, IntBuffer pbaseline) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaGetFont(String dir, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaSaveFont(String indir, String outdir, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaGenerateFontFromFile(String dir, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaGenerateFontFromString(int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaGenerateFont(Pix pixs, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamBmp(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamBmp(FILE fp, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemBmp(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemBmp(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_bootnum_gen1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_bootnum_gen2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxCreate(int x, int y, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxCreateValid(int x, int y, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxCopy(Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxClone(Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void boxDestroy(PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxGetGeometry(Box box, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxSetGeometry(Box box, int x, int y, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxGetSideLocation(Box box, int side, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxGetRefcount(Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxChangeRefcount(Box box, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxIsValid(Box box, IntBuffer pvalid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaCopy(Boxa boxa, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void boxaDestroy(PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaAddBox(Boxa boxa, Box box, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaExtendArray(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaExtendArrayToSize(Boxa boxa, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetCount(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetValidCount(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaGetBox(Boxa boxa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaGetValidBox(Boxa boxa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetBoxGeometry(Boxa boxa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaIsFull(Boxa boxa, IntBuffer pfull) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaReplaceBox(Boxa boxa, int index, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaInsertBox(Boxa boxa, int index, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaRemoveBox(Boxa boxa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaRemoveBoxAndSave(Boxa boxa, int index, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSaveValid(Boxa boxas, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaInitFull(Boxa boxa, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaClear(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaCopy(Boxaa baas, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void boxaaDestroy(PointerByReference pbaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaAddBoxa(Boxaa baa, Boxa ba, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaExtendArray(Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaExtendArrayToSize(Boxaa baa, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaGetCount(Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaGetBoxCount(Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaaGetBoxa(Boxaa baa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaaGetBox(Boxaa baa, int iboxa, int ibox, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaInitFull(Boxaa baa, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaExtendWithInit(Boxaa baa, int maxindex, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaReplaceBoxa(Boxaa baa, int index, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaInsertBoxa(Boxaa baa, int index, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaRemoveBoxa(Boxaa baa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaAddBox(Boxaa baa, int index, Box box, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaReadFromFiles(String dirname, String substr, int first, int nfiles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaWrite(String filename, Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaWriteStream(FILE fp, Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaReadMem(ByteBuffer data, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaWrite(String filename, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaWriteStream(FILE fp, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxPrintStreamInfo(FILE fp, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxContains(Box box1, Box box2, IntBuffer presult) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxIntersects(Box box1, Box box2, IntBuffer presult) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaContainedInBox(Boxa boxas, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaIntersectsBox(Boxa boxas, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaClipToBox(Boxa boxas, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaCombineOverlaps(Boxa boxas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxOverlapRegion(Box box1, Box box2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxBoundingRegion(Box box1, Box box2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxOverlapFraction(Box box1, Box box2, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxOverlapArea(Box box1, Box box2, IntBuffer parea) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaHandleOverlaps(Boxa boxas, int op, int range, float min_overlap, float max_ratio, PointerByReference pnamap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxSeparationDistance(Box box1, Box box2, IntBuffer ph_sep, IntBuffer pv_sep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxContainsPt(Box box, float x, float y, IntBuffer pcontains) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaGetNearestToPt(Boxa boxa, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxGetCenter(Box box, FloatBuffer pcx, FloatBuffer pcy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxIntersectByLine(Box box, int x, int y, float slope, IntBuffer px1, IntBuffer py1, IntBuffer px2, IntBuffer py2, IntBuffer pn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxClipToRectangle(Box box, int wi, int hi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxClipToRectangleParams(Box box, int w, int h, IntBuffer pxstart, IntBuffer pystart, IntBuffer pxend, IntBuffer pyend, IntBuffer pbw, IntBuffer pbh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxRelocateOneSide(Box boxd, Box boxs, int loc, int sideflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxAdjustSides(Box boxd, Box boxs, int delleft, int delright, int deltop, int delbot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSetSide(Boxa boxad, Boxa boxas, int side, int val, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaAdjustWidthToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaAdjustHeightToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxEqual(Box box1, Box box2, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntByReference psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxSimilar(Box box1, Box box2, int leftdiff, int rightdiff, int topdiff, int botdiff, IntBuffer psimilar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntBuffer psimilar, PointerByReference pnasim) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntByReference psimilar, PointerByReference pnasim) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaJoin(Boxa boxad, Boxa boxas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaJoin(Boxaa baad, Boxaa baas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaSplitEvenOdd(Boxa boxa, int fillflag, PointerByReference pboxae, PointerByReference pboxao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaMergeEvenOdd(Boxa boxae, Boxa boxao, int fillflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaTransform(Boxa boxas, int shiftx, int shifty, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxTransform(Box box, int shiftx, int shifty, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaTransformOrdered(Boxa boxas, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxTransformOrdered(Box boxs, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaRotateOrth(Boxa boxas, int w, int h, int rotation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxRotateOrth(Box box, int w, int h, int rotation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaBinSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSortByIndex(Boxa boxas, Numa naindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaSort2d(Boxa boxas, PointerByReference pnaad, int delta1, int delta2, int minh1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaSort2dByIndex(Boxa boxas, Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaExtractAsNuma(Boxa boxa, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference pnaw, PointerByReference pnah, int keepinvalid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaExtractAsPta(Boxa boxa, PointerByReference pptal, PointerByReference pptat, PointerByReference pptar, PointerByReference pptab, PointerByReference pptaw, PointerByReference pptah, int keepinvalid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaGetRankSize(Boxa boxa, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaGetMedian(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetAverageSize(Boxa boxa, FloatBuffer pw, FloatBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaGetExtent(Boxaa baa, IntBuffer pw, IntBuffer ph, PointerByReference pbox, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaGetExtent(Boxaa baa, IntByReference pw, IntByReference ph, PointerByReference pbox, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaaFlattenToBoxa(Boxaa baa, PointerByReference pnaindex, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaaFlattenAligned(Boxaa baa, int num, Box fillerbox, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaEncapsulateAligned(Boxa boxa, int num, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaAlignBox(Boxaa baa, Box box, int delta, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaskConnComp(Pix pixs, int connectivity, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaskBoxa(Pix pixd, Pix pixs, Boxa boxa, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixPaintBoxa(Pix pixs, Boxa boxa, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSetBlackOrWhiteBoxa(Pix pixs, Boxa boxa, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixPaintBoxaRandom(Pix pixs, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlendBoxaRandom(Pix pixs, Boxa boxa, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDrawBoxa(Pix pixs, Boxa boxa, int width, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDrawBoxaRandom(Pix pixs, Boxa boxa, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix boxaaDisplay(Boxaa baa, int linewba, int linewb, int colorba, int colorb, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixSplitIntoBoxa(Pix pixs, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixSplitComponentIntoBoxa(Pix pix, Box box, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa makeMosaicStrips(int w, int h, int direction, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntBuffer pnsame, FloatBuffer pdiffarea, FloatBuffer pdiffxor, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntByReference pnsame, FloatByReference pdiffarea, FloatByReference pdiffxor, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixSelectLargeULComp(Pix pixs, float areaslop, int yslop, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box boxaSelectLargeULBox(Boxa boxas, float areaslop, int yslop) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSelectRange(Boxa boxas, int first, int last, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaSelectRange(Boxaa baas, int first, int last, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSelectBySize(Boxa boxas, int width, int height, int type, int relation, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa boxaMakeSizeIndicator(Boxa boxa, int width, int height, int type, int relation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSelectByArea(Boxa boxas, int area, int relation, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa boxaMakeAreaIndicator(Boxa boxa, int area, int relation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSelectWithIndicator(Boxa boxas, Numa na, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaPermutePseudorandom(Boxa boxas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaPermuteRandom(Boxa boxad, Boxa boxas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaSwapBoxes(Boxa boxa, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta boxaConvertToPta(Boxa boxa, int ncorners) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa ptaConvertToBoxa(Pta pta, int ncorners) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta boxConvertToPta(Box box, int ncorners) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box ptaConvertToBox(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSmoothSequenceLS(Boxa boxas, float factor, int subflag, int maxdiff, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaSmoothSequenceMedian(Boxa boxas, int halfwin, int subflag, int maxdiff, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaLinearFit(Boxa boxas, float factor, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaWindowedMedian(Boxa boxas, int halfwin, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaModifyWithBoxa(Boxa boxas, Boxa boxam, int subflag, int maxdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaConstrainSize(Boxa boxas, int width, int widthflag, int height, int heightflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaReconcileEvenOddHeight(Boxa boxas, int sides, int delh, int op, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaReconcilePairWidth(Boxa boxas, int delw, int op, float factor, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaPlotSides(Boxa boxa, String plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, int outformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaPlotSides(Boxa boxa, Pointer plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, int outformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaFillSequence(Boxa boxas, int useflag, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetExtent(Boxa boxa, IntBuffer pw, IntBuffer ph, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetExtent(Boxa boxa, IntByReference pw, IntByReference ph, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetCoverage(Boxa boxa, int wc, int hc, int exactflag, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaaSizeRange(Boxaa baa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaSizeRange(Boxa boxa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaLocationRange(Boxa boxa, IntBuffer pminx, IntBuffer pminy, IntBuffer pmaxx, IntBuffer pmaxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaGetArea(Boxa boxa, IntBuffer parea) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix boxaDisplayTiled(Boxa boxas, Pixa pixa, int maxwidth, int linewidth, float scalefactor, int background, int spacing, int border, String fontdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bytea l_byteaCreate(NativeSize nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bytea l_byteaInitFromMem(ByteBuffer data, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bytea l_byteaInitFromFile(String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bytea l_byteaInitFromStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Bytea l_byteaCopy(L_Bytea bas, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_byteaDestroy(PointerByReference pba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NativeSize l_byteaGetSize(L_Bytea ba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_byteaGetData(L_Bytea ba, NativeSizeByReference psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_byteaCopyData(L_Bytea ba, NativeSizeByReference psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaAppendData(L_Bytea ba, ByteBuffer newdata, NativeSize newbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaAppendString(L_Bytea ba, ByteBuffer str) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaJoin(L_Bytea ba1, PointerByReference pba2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaSplit(L_Bytea ba1, NativeSize splitloc, PointerByReference pba2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaFindEachSequence(L_Bytea ba, ByteBuffer sequence, int seqlen, PointerByReference pda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaFindEachSequence(L_Bytea ba, Pointer sequence, int seqlen, PointerByReference pda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaWrite(String fname, L_Bytea ba, NativeSize startloc, NativeSize endloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_byteaWriteStream(FILE fp, L_Bytea ba, NativeSize startloc, NativeSize endloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBorda ccbaCreate(Pix pixs, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ccbaDestroy(PointerByReference pccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBord ccbCreate(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ccbDestroy(PointerByReference pccb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaAddCcb(CCBorda ccba, CCBord ccb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaGetCount(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBord ccbaGetCcb(CCBorda ccba, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBorda pixGetAllCCBorders(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBord pixGetCCBorders(Pix pixs, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa pixGetOuterBordersPtaa(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixGetOuterBorderPta(Pix pixs, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetOuterBorder(CCBord ccb, Pix pixs, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetHoleBorder(CCBord ccb, Pix pixs, Box box, int xs, int ys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findNextBorderPixel(int w, int h, IntBuffer data, int wpl, int px, int py, IntBuffer pqpos, IntBuffer pnpx, IntBuffer pnpy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void locateOutsideSeedPixel(int fpx, int fpy, int spx, int spy, IntBuffer pxs, IntBuffer pys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaGenerateGlobalLocs(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaGenerateStepChains(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaStepChainsToPixCoords(CCBorda ccba, int coordtype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaGenerateSPGlobalLocs(CCBorda ccba, int ptsflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaGenerateSinglePath(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta getCutPathForHole(Pix pix, Pta pta, Box boxinner, IntBuffer pdir, IntBuffer plen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix ccbaDisplayBorder(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix ccbaDisplaySPBorder(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix ccbaDisplayImage1(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix ccbaDisplayImage2(CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaWrite(String filename, CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaWriteStream(FILE fp, CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBorda ccbaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CCBorda ccbaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ccbaWriteSVG(String filename, CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer ccbaWriteSVGString(String filename, CCBorda ccba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThin(Pix pixs, int type, int connectivity, int maxiters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThinGeneral(Pix pixs, int type, Sela sela, int maxiters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThinExamples(Pix pixs, int type, int index, int maxiters, String selfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbCorrelation(String dirin, float thresh, float weight, int components, String rootname, int firstpage, int npages, int renderflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbRankHaus(String dirin, int size, float rank, int components, String rootname, int firstpage, int npages, int renderflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbWordsInTextlines(String dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbWordsInTextlines(Pointer dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetWordsInTextlines(Pix pixs, int reduction, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad, PointerByReference pnai) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetWordBoxesInTextlines(Pix pixs, int reduction, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference pnai) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa boxaExtractSortedPattern(Boxa boxa, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaCompareImagesByBoxes(Numaa naa1, Numaa naa2, int nperline, int nreq, int maxshiftx, int maxshifty, int delx, int dely, IntBuffer psame, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorContent(Pix pixs, int rwhite, int gwhite, int bwhite, int mingray, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorMagnitude(Pix pixs, int rwhite, int gwhite, int bwhite, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaskOverColorPixels(Pix pixs, int threshdiff, int mindist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaskOverColorRange(Pix pixs, int rmin, int rmax, int gmin, int gmax, int bmin, int bmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorFraction(Pix pixs, int darkthresh, int lightthresh, int diffthresh, int factor, FloatBuffer ppixfract, FloatBuffer pcolorfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixNumSignificantGrayColors(Pix pixs, int darkthresh, int lightthresh, float minfract, int factor, IntBuffer pncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorsForQuantization(Pix pixs, int thresh, IntBuffer pncolors, IntBuffer piscolor, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixNumColors(Pix pixs, int factor, IntBuffer pncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetMostPopulatedColors(Pix pixs, int sigbits, int factor, int ncolors, PointerByReference parray, PointerByReference pcmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSimpleColorQuantize(Pix pixs, int sigbits, int factor, int ncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetRGBHistogram(Pix pixs, int sigbits, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeRGBIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int sigbits) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRGBFromIndex(int index, int sigbits, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntBuffer phasred, FloatBuffer pratio, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntByReference phasred, FloatByReference pratio, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorGrayRegions(Pix pixs, Boxa boxa, int type, int thresh, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorGray(Pix pixs, Box box, int type, int thresh, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorGrayMasked(Pix pixs, Pix pixm, int type, int thresh, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSnapColor(Pix pixd, Pix pixs, int srcval, int dstval, int diff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSnapColorCmap(Pix pixd, Pix pixs, int srcval, int dstval, int diff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixLinearMapToTargetColor(Pix pixd, Pix pixs, int srcval, int dstval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixelLinearMapToTargetColor(int scolor, int srcmap, int dstmap, IntBuffer pdcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixShiftByComponent(Pix pixd, Pix pixs, int srcval, int dstval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixelShiftByComponent(int rval, int gval, int bval, int srcval, int dstval, IntBuffer ppixel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixelFractionalShift(int rval, int gval, int bval, float fraction, IntBuffer ppixel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapCreate(int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapCreateRandom(int depth, int hasblack, int haswhite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapCreateLinear(int d, int nlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapCopy(PixColormap cmaps) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixcmapDestroy(PointerByReference pcmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapAddColor(PixColormap cmap, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapAddRGBA(PixColormap cmap, int rval, int gval, int bval, int aval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapAddNewColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapAddNearestColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapUsableColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pusable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapAddBlackOrWhite(PixColormap cmap, int color, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapSetBlackAndWhite(PixColormap cmap, int setblack, int setwhite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetCount(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetFreeCount(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetDepth(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetMinDepth(PixColormap cmap, IntBuffer pmindepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapClear(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetColor(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetColor32(PixColormap cmap, int index, IntBuffer pval32) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetRGBA(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetRGBA32(PixColormap cmap, int index, IntBuffer pval32) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapResetColor(PixColormap cmap, int index, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapSetAlpha(PixColormap cmap, int index, int aval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapHasColor(PixColormap cmap, IntBuffer pcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapIsOpaque(PixColormap cmap, IntBuffer popaque) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapIsBlackAndWhite(PixColormap cmap, IntBuffer pblackwhite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapCountGrayColors(PixColormap cmap, IntBuffer pngray) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetRankIntensity(PixColormap cmap, float rankval, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetNearestIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetNearestGrayIndex(PixColormap cmap, int val, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetComponentRange(PixColormap cmap, int color, IntBuffer pminval, IntBuffer pmaxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGetExtremeValue(PixColormap cmap, int type, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapGrayToColor(int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapColorToGray(PixColormap cmaps, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapWrite(String filename, PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapWriteStream(FILE fp, PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapToArrays(PixColormap cmap, PointerByReference prmap, PointerByReference pgmap, PointerByReference pbmap, PointerByReference pamap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapToRGBTable(PixColormap cmap, PointerByReference ptab, IntBuffer pncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapSerializeToMemory(PixColormap cmap, int cpc, IntBuffer pncolors, PointerByReference pdata) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixcmapDeserializeFromMemory(ByteBuffer data, int cpc, int ncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pixcmapConvertToHex(ByteBuffer data, int ncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapGammaTRC(PixColormap cmap, float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapContrastTRC(PixColormap cmap, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapShiftIntensity(PixColormap cmap, float fraction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapShiftByComponent(PixColormap cmap, int srcval, int dstval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorMorph(Pix pixs, int type, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctreeColorQuant(Pix pixs, int colors, int ditherflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctreeColorQuantGeneral(Pix pixs, int colors, int ditherflag, float validthresh, float colorthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeRGBToIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int cqlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getOctcubeIndexFromRGB(int rval, int gval, int bval, IntBuffer rtab, IntBuffer gtab, IntBuffer btab, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctreeQuantByPopulation(Pix pixs, int level, int ditherflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctreeQuantNumColors(Pix pixs, int maxcolors, int subsample) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctcubeQuantMixedWithGray(Pix pixs, int depth, int graylevels, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFixedOctcubeQuant256(Pix pixs, int ditherflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFewColorsOctcubeQuant1(Pix pixs, int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFewColorsOctcubeQuant2(Pix pixs, int level, Numa na, int ncolors, IntBuffer pnerrors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFewColorsOctcubeQuantMixed(Pix pixs, int level, int darkthresh, int lightthresh, int diffthresh, float minfract, int maxspan) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFixedOctcubeQuantGenRGB(Pix pixs, int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOctcubeQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixOctcubeHistogram(Pix pixs, int level, IntBuffer pncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference pixcmapToOctcubeLUT(PixColormap cmap, int level, int metric) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRemoveUnusedColors(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixNumberOccupiedOctcubes(Pix pix, int level, int mincount, float minfract, IntBuffer pncolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMedianCutQuant(Pix pixs, int ditherflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMedianCutQuantGeneral(Pix pixs, int ditherflag, int outdepth, int maxcolors, int sigbits, int maxsub, int checkbw) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int darkthresh, int lightthresh, int diffthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFewColorsMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int maxncolors, int darkthresh, int lightthresh, int diffthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference pixMedianCutHisto(Pix pixs, int sigbits, int subsample) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorSegment(Pix pixs, int maxdist, int maxcolors, int selsize, int finalcolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorSegmentCluster(Pix pixs, int maxdist, int maxcolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAssignToNearestColor(Pix pixd, Pix pixs, Pix pixm, int level, IntBuffer countarray) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorSegmentClean(Pix pixs, int selsize, IntBuffer countarray) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorSegmentRemoveColors(Pix pixd, Pix pixs, int finalcolors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToHSV(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertHSVToRGB(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertRGBToHSV(int rval, int gval, int bval, IntBuffer phval, IntBuffer psval, IntBuffer pvval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertHSVToRGB(int hval, int sval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapConvertRGBToHSV(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapConvertHSVToRGB(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToHue(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToSaturation(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToValue(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeRangeMaskHS(Pix pixs, int huecenter, int huehw, int satcenter, int sathw, int regionflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeRangeMaskHV(Pix pixs, int huecenter, int huehw, int valcenter, int valhw, int regionflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeRangeMaskSV(Pix pixs, int satcenter, int sathw, int valcenter, int valhw, int regionflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeHistoHS(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnasat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeHistoHV(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnaval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeHistoSV(Pix pixs, int factor, PointerByReference pnasat, PointerByReference pnaval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindHistoPeaksHSV(Pix pixs, int type, int width, int height, int npeaks, float erasefactor, PointerByReference ppta, PointerByReference pnatot, PointerByReference ppixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix displayHSVColorRange(int hval, int sval, int vval, int huehw, int sathw, int nsamp, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToYUV(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertYUVToRGB(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertRGBToYUV(int rval, int gval, int bval, IntBuffer pyval, IntBuffer puval, IntBuffer pvval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertYUVToRGB(int yval, int uval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapConvertRGBToYUV(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcmapConvertYUVToRGB(PixColormap cmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa pixConvertRGBToXYZ(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixaConvertXYZToRGB(FPixa fpixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertRGBToXYZ(int rval, int gval, int bval, FloatBuffer pfxval, FloatBuffer pfyval, FloatBuffer pfzval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertXYZToRGB(float fxval, float fyval, float fzval, int blackout, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa fpixaConvertXYZToLAB(FPixa fpixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa fpixaConvertLABToXYZ(FPixa fpixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertXYZToLAB(float xval, float yval, float zval, FloatBuffer plval, FloatBuffer paval, FloatBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertLABToXYZ(float lval, float aval, float bval, FloatBuffer pxval, FloatBuffer pyval, FloatBuffer pzval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa pixConvertRGBToLAB(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixaConvertLABToRGB(FPixa fpixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertRGBToLAB(int rval, int gval, int bval, FloatBuffer pflval, FloatBuffer pfaval, FloatBuffer pfbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertLABToRGB(float flval, float faval, float fbval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixEqual(Pix pix1, Pix pix2, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixEqualWithAlpha(Pix pix1, Pix pix2, int use_alpha, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixEqualWithCmap(Pix pix1, Pix pix2, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixUsesCmapColor(Pix pixs, IntBuffer pcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCorrelationBinary(Pix pix1, Pix pix2, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayDiffBinary(Pix pix1, Pix pix2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatBuffer pfract, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatByReference pfract, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareTiled(Pix pix1, Pix pix2, int sx, int sy, int type, PointerByReference ppixdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixCompareRankDifference(Pix pix1, Pix pix2, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTestForSimilarity(Pix pix1, Pix pix2, int factor, int mindiff, float maxfract, float maxave, IntBuffer psimilar, int printstats) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetDifferenceStats(Pix pix1, Pix pix2, int factor, int mindiff, FloatBuffer pfractdiff, FloatBuffer pavediff, int printstats) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetDifferenceHistogram(Pix pix1, Pix pix2, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatBuffer pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatByReference pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetPSNR(Pix pix1, Pix pix2, int factor, FloatBuffer ppsnr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaComparePhotoRegionsByHisto(Pixa pixa, float minratio, float textthresh, int factor, int nx, int ny, float simthresh, PointerByReference pnai, PointerByReference pscores, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixComparePhotoRegionsByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int factor, int nx, int ny, FloatBuffer pscore, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntBuffer pw, IntBuffer ph, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntByReference pw, IntByReference ph, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixPadToCenterCentroid(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCentroid8(Pix pixs, int factor, FloatBuffer pcx, FloatBuffer pcy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDecideIfPhotoImage(Pix pix, int factor, int nx, int ny, float thresh, PointerByReference pnaa, Pixa pixadebug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTilesByHisto(Numaa naa1, Numaa naa2, float minratio, int w1, int h1, int w2, int h2, FloatBuffer pscore, Pixa pixadebug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareGrayByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int maxgray, int factor, int nx, int ny, FloatBuffer pscore, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCropAlignedToCentroid(Pix pix1, Pix pix2, int factor, PointerByReference pbox1, PointerByReference pbox2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_compressGrayHistograms(Numaa naa, int w, int h, NativeSizeByReference psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa l_uncompressGrayHistograms(ByteBuffer bytea, NativeSize size, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCompareWithTranslation(Pix pix1, Pix pix2, int thresh, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBestCorrelation(Pix pix1, Pix pix2, int area1, int area2, int etransx, int etransy, int maxshift, IntBuffer tab8, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixConnComp(Pix pixs, PointerByReference ppixa, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixConnCompPixa(Pix pixs, PointerByReference ppixa, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixConnCompBB(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCountConnComp(Pix pixs, int connectivity, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int nextOnPixelInRaster(Pix pixs, int xstart, int ystart, IntBuffer px, IntBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int nextOnPixelInRasterLow(IntBuffer data, int w, int h, int wpl, int xstart, int ystart, IntBuffer px, IntBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixSeedfillBB(Pix pixs, L_Stack stack, int x, int y, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixSeedfill4BB(Pix pixs, L_Stack stack, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixSeedfill8BB(Pix pixs, L_Stack stack, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfill(Pix pixs, L_Stack stack, int x, int y, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfill4(Pix pixs, L_Stack stack, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfill8(Pix pixs, L_Stack stack, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFilesTo1bpp(String dirin, String substr, int upscaling, int thresh, int firstpage, int npages, String dirout, int outformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconv(Pix pix, int wc, int hc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconvGray(Pix pixs, Pix pixacc, int wc, int hc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconvAccum(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconvGrayUnnormalized(Pix pixs, int wc, int hc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconvTiled(Pix pix, int wc, int hc, int nx, int ny) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockconvGrayTile(Pix pixs, Pix pixacc, int wc, int hc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWindowedStats(Pix pixs, int wc, int hc, int hasborder, PointerByReference ppixm, PointerByReference ppixms, PointerByReference pfpixv, PointerByReference pfpixrv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixWindowedMean(Pix pixs, int wc, int hc, int hasborder, int normflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixWindowedMeanSquare(Pix pixs, int wc, int hc, int hasborder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWindowedVariance(Pix pixm, Pix pixms, PointerByReference pfpixv, PointerByReference pfpixrv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix pixMeanSquareAccum(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlockrank(Pix pixs, Pix pixacc, int wc, int hc, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixBlocksum(Pix pixs, Pix pixacc, int wc, int hc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCensusTransform(Pix pixs, int halfsize, Pix pixacc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvolve(Pix pixs, L_Kernel kel, int outdepth, int normflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvolveSep(Pix pixs, L_Kernel kelx, L_Kernel kely, int outdepth, int normflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvolveRGB(Pix pixs, L_Kernel kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvolveRGBSep(Pix pixs, L_Kernel kelx, L_Kernel kely) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixConvolve(FPix fpixs, L_Kernel kel, int normflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixConvolveSep(FPix fpixs, L_Kernel kelx, L_Kernel kely, int normflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvolveWithBias(Pix pixs, L_Kernel kel1, L_Kernel kel2, int force8, IntBuffer pbias) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setConvolveSampling(int xfact, int yfact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddGaussianNoise(Pix pixs, float stdev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float gaussDistribSampling() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCorrelationScore(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCorrelationScoreThresholded(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, IntBuffer downcount, float score_threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCorrelationScoreSimple(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCorrelationScoreShifted(Pix pix1, Pix pix2, int area1, int area2, int delx, int dely, IntBuffer tab, FloatBuffer pscore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarp dewarpCreate(Pix pixs, int pageno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarp dewarpCreateRef(int pageno, int refpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dewarpDestroy(PointerByReference pdew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarpa dewarpaCreate(int nptrs, int sampling, int redfactor, int minlines, int maxdist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarpa dewarpaCreateFromPixacomp(PixaComp pixac, int useboth, int sampling, int minlines, int maxdist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dewarpaDestroy(PointerByReference pdewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaDestroyDewarp(L_Dewarpa dewa, int pageno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaInsertDewarp(L_Dewarpa dewa, L_Dewarp dew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarp dewarpaGetDewarp(L_Dewarpa dewa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaSetCurvatures(L_Dewarpa dewa, int max_linecurv, int min_diff_linecurv, int max_diff_linecurv, int max_edgecurv, int max_diff_edgecurv, int max_edgeslope) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaUseBothArrays(L_Dewarpa dewa, int useboth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaSetMaxDistance(L_Dewarpa dewa, int maxdist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarp dewarpRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarp dewarpReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpWrite(String filename, L_Dewarp dew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpWriteStream(FILE fp, L_Dewarp dew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarpa dewarpaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarpa dewarpaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaWrite(String filename, L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaWriteStream(FILE fp, L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpBuildPageModel(L_Dewarp dew, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpFindVertDisparity(L_Dewarp dew, Ptaa ptaa, int rotflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpFindHorizDisparity(L_Dewarp dew, Ptaa ptaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa dewarpGetTextlineCenters(Pix pixs, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa dewarpRemoveShortLines(Pix pixs, Ptaa ptaas, float fract, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpBuildLineModel(L_Dewarp dew, int opensize, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaModelStatus(L_Dewarpa dewa, int pageno, IntBuffer pvsuccess, IntBuffer phsuccess) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, Pointer debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, Pointer debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpMinimize(L_Dewarp dew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpPopulateFullRes(L_Dewarp dew, Pix pix, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpSinglePage(Pix pixs, int thresh, int adaptive, int use_both, PointerByReference ppixd, PointerByReference pdewa, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpSinglePageInit(Pix pixs, int thresh, int adaptive, int use_both, PointerByReference ppixb, PointerByReference pdewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpSinglePageRun(Pix pixs, Pix pixb, L_Dewarpa dewa, PointerByReference ppixd, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaListPages(L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaSetValidModels(L_Dewarpa dewa, int notests, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaInsertRefModels(L_Dewarpa dewa, int notests, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaStripRefModels(L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaRestoreModels(L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaInfo(FILE fp, L_Dewarpa dewa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaModelStats(L_Dewarpa dewa, IntBuffer pnnone, IntBuffer pnvsuccess, IntBuffer pnvvalid, IntBuffer pnhsuccess, IntBuffer pnhvalid, IntBuffer pnref) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaShowArrays(L_Dewarpa dewa, float scalefact, int first, int last) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpDebug(L_Dewarp dew, String subdirs, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpShowResults(L_Dewarpa dewa, Sarray sa, Boxa boxa, int firstpage, int lastpage, String pdfout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaCreateFromIArray(IntBuffer iarray, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaCreateFromDArray(DoubleBuffer darray, int size, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaMakeSequence(double startval, double increment, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_dnaDestroy(PointerByReference pda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaCopy(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaClone(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaEmpty(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaAddNumber(L_Dna da, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaInsertNumber(L_Dna da, int index, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaRemoveNumber(L_Dna da, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaReplaceNumber(L_Dna da, int index, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaGetCount(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaSetCount(L_Dna da, int newcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaGetDValue(L_Dna da, int index, DoubleBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaGetIValue(L_Dna da, int index, IntBuffer pival) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaSetValue(L_Dna da, int index, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaShiftValue(L_Dna da, int index, double diff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference l_dnaGetIArray(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DoubleByReference l_dnaGetDArray(L_Dna da, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaGetRefcount(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaChangeRefcount(L_Dna da, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaGetParameters(L_Dna da, DoubleBuffer pstartx, DoubleBuffer pdelx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaSetParameters(L_Dna da, double startx, double delx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaCopyParameters(L_Dna dad, L_Dna das) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaWrite(String filename, L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaWriteStream(FILE fp, L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dnaa l_dnaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dnaa l_dnaaCreateFull(int nptr, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaTruncate(L_Dnaa daa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_dnaaDestroy(PointerByReference pdaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaAddDna(L_Dnaa daa, L_Dna da, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaGetCount(L_Dnaa daa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaGetDnaCount(L_Dnaa daa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaGetNumberCount(L_Dnaa daa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaaGetDna(L_Dnaa daa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaReplaceDna(L_Dnaa daa, int index, L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaGetValue(L_Dnaa daa, int i, int j, DoubleBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaAddNumber(L_Dnaa daa, int index, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dnaa l_dnaaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dnaa l_dnaaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaWrite(String filename, L_Dnaa daa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaWriteStream(FILE fp, L_Dnaa daa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_DnaHash l_dnaHashCreate(int nbuckets, int initsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_dnaHashDestroy(PointerByReference pdahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaHashGetCount(L_DnaHash dahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaHashGetTotalCount(L_DnaHash dahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaHashGetDna(L_DnaHash dahash, long key, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaHashAdd(L_DnaHash dahash, long key, double value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_DnaHash l_dnaHashCreateFromDna(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaRemoveDupsByHash(L_Dna das, PointerByReference pdad, PointerByReference pdahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaMakeHistoByHash(L_Dna das, PointerByReference pdahash, PointerByReference pdav, PointerByReference pdac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaIntersectionByHash(L_Dna da1, L_Dna da2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaFindValByHash(L_Dna da, L_DnaHash dahash, double val, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna l_dnaMakeDelta(L_Dna das) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa l_dnaConvertToNuma(L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna numaConvertToDna(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaJoin(L_Dna dad, L_Dna das, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphDwa_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFMorphopGen_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fmorphopgen_low_2(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSobelEdgeFilter(Pix pixs, int orientflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixTwoSidedEdgeFilter(Pix pixs, int orientflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMeasureEdgeSmoothness(Pix pixs, int side, int minjump, int minreversal, FloatBuffer pjpl, FloatBuffer pjspl, FloatBuffer prpl, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetEdgeProfile(Pix pixs, int side, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetLastOffPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetLastOnPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer encodeBase64(ByteBuffer inarray, int insize, IntBuffer poutsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer decodeBase64(String inarray, int insize, IntBuffer poutsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer encodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer decodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer reformatPacked64(ByteBuffer inarray, int insize, int leadspace, int linechars, int addquotes, IntBuffer poutsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGammaTRC(Pix pixd, Pix pixs, float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGammaTRCMasked(Pix pixd, Pix pixs, Pix pixm, float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGammaTRCWithAlpha(Pix pixd, Pix pixs, float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaGammaTRC(float gamma, int minval, int maxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixContrastTRC(Pix pixd, Pix pixs, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixContrastTRCMasked(Pix pixd, Pix pixs, Pix pixm, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaContrastTRC(float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixEqualizeTRC(Pix pixd, Pix pixs, float fract, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaEqualizeTRC(Pix pix, float fract, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTRCMap(Pix pixs, Pix pixm, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMasking(Pix pixs, int halfwidth, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMaskingGray(Pix pixs, int halfwidth, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMaskingFast(Pix pixs, int halfwidth, float fract, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMaskingGrayFast(Pix pixs, int halfwidth, float fract, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMaskingGray1D(Pix pixs, int halfwidth, float fract, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnsharpMaskingGray2D(Pix pixs, int halfwidth, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixModifyHue(Pix pixd, Pix pixs, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixModifySaturation(Pix pixd, Pix pixs, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMeasureSaturation(Pix pixs, int factor, FloatBuffer psat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixModifyBrightness(Pix pixd, Pix pixs, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorShiftRGB(Pix pixs, float rfract, float gfract, float bfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMultConstantColor(Pix pixs, float rfact, float gfact, float bfact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMultMatrixColor(Pix pixs, L_Kernel kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHalfEdgeByBandpass(Pix pixs, int sm1h, int sm1v, int sm2h, int sm2v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fhmtautogen(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fhmtautogen1(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fhmtautogen2(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHMTDwa_1(Pix pixd, Pix pixs, String selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFHMTGen_1(Pix pixd, Pix pixs, String selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fhmtgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixItalicWords(Pix pixs, Boxa boxaw, Pix pixw, PointerByReference pboxa, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixOrientDetect(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeOrientDecision(float upconf, float leftconf, float minupconf, float minratio, IntBuffer porient, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixUpDownDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixUpDownDetectGeneral(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixOrientDetectDwa(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixUpDownDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixUpDownDetectGeneralDwa(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMirrorDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMirrorDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFlipFHMTGen(Pix pixd, Pix pixs, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fmorphautogen(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fmorphautogen1(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fmorphautogen2(Sela sela, int fileindex, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphDwa_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFMorphopGen_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fmorphopgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixCreate(int width, int height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixCreateTemplate(FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixClone(FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixCopy(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixResizeImageData(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fpixDestroy(PointerByReference pfpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetDimensions(FPix fpix, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetDimensions(FPix fpix, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetWpl(FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetWpl(FPix fpix, int wpl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetRefcount(FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixChangeRefcount(FPix fpix, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetResolution(FPix fpix, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetResolution(FPix fpix, int xres, int yres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixCopyResolution(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference fpixGetData(FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetData(FPix fpix, FloatBuffer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetPixel(FPix fpix, int x, int y, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetPixel(FPix fpix, int x, int y, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa fpixaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPixa fpixaCopy(FPixa fpixa, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fpixaDestroy(PointerByReference pfpixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaAddFPix(FPixa fpixa, FPix fpix, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaGetCount(FPixa fpixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaChangeRefcount(FPixa fpixa, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixaGetFPix(FPixa fpixa, int index, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaGetFPixDimensions(FPixa fpixa, int index, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference fpixaGetData(FPixa fpixa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaGetPixel(FPixa fpixa, int index, int x, int y, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixaSetPixel(FPixa fpixa, int index, int x, int y, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixCreate(int width, int height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixCreateTemplate(DPix dpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixClone(DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixCopy(DPix dpixd, DPix dpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixResizeImageData(DPix dpixd, DPix dpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dpixDestroy(PointerByReference pdpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetDimensions(DPix dpix, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetDimensions(DPix dpix, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetWpl(DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetWpl(DPix dpix, int wpl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetRefcount(DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixChangeRefcount(DPix dpix, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetResolution(DPix dpix, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetResolution(DPix dpix, int xres, int yres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixCopyResolution(DPix dpixd, DPix dpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DoubleByReference dpixGetData(DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetData(DPix dpix, DoubleBuffer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetPixel(DPix dpix, int x, int y, DoubleBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetPixel(DPix dpix, int x, int y, double val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixWrite(String filename, FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixWriteStream(FILE fp, FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixEndianByteSwap(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixWrite(String filename, DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixWriteStream(FILE fp, DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixEndianByteSwap(DPix dpixd, DPix dpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixPrintStream(FILE fp, FPix fpix, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix pixConvertToFPix(Pix pixs, int ncomps) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix pixConvertToDPix(Pix pixs, int ncomps) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixConvertToPix(FPix fpixs, int outdepth, int negvals, int errorflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixDisplayMaxDynamicRange(FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix fpixConvertToDPix(FPix fpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix dpixConvertToPix(DPix dpixs, int outdepth, int negvals, int errorflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix dpixConvertToFPix(DPix dpix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetMin(FPix fpix, FloatBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixGetMax(FPix fpix, FloatBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetMin(DPix dpix, DoubleBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixGetMax(DPix dpix, DoubleBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixScaleByInteger(FPix fpixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixScaleByInteger(DPix dpixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixLinearCombination(FPix fpixd, FPix fpixs1, FPix fpixs2, float a, float b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixAddMultConstant(FPix fpix, float addc, float multc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DPix dpixLinearCombination(DPix dpixd, DPix dpixs1, DPix dpixs2, float a, float b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixAddMultConstant(DPix dpix, double addc, double multc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixSetAllArbitrary(FPix fpix, float inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dpixSetAllArbitrary(DPix dpix, double inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAddBorder(FPix fpixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixRemoveBorder(FPix fpixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAddMirroredBorder(FPix fpixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAddContinuedBorder(FPix fpixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAddSlopeBorder(FPix fpixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fpixRasterop(FPix fpixd, int dx, int dy, int dw, int dh, FPix fpixs, int sx, int sy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixRotateOrth(FPix fpixs, int quads) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixRotate180(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixRotate90(FPix fpixs, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixFlipLR(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixFlipTB(FPix fpixd, FPix fpixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAffinePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixAffine(FPix fpixs, FloatBuffer vc, float inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixProjectivePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix fpixProjective(FPix fpixs, FloatBuffer vc, float inval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int linearInterpolatePixelFloat(FloatBuffer datas, int w, int h, float x, float y, float inval, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixThresholdToPix(FPix fpix, float thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FPix pixComponentFunction(Pix pix, float rnum, float gnum, float bnum, float rdenom, float gdenom, float bdenom) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamGif(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamGif(FILE fp, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemGif(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemGif(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GPlot gplotCreate(String rootname, int outformat, String title, String xlabel, String ylabel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void gplotDestroy(PointerByReference pgplot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotAddPlot(GPlot gplot, Numa nax, Numa nay, int plotstyle, String plottitle) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSetScaling(GPlot gplot, int scaling) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotMakeOutput(GPlot gplot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotGenCommandFile(GPlot gplot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotGenDataFiles(GPlot gplot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimple1(Numa na, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimple2(Numa na1, Numa na2, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimpleN(Numaa naa, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimpleXY1(Numa nax, Numa nay, int plotstyle, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimpleXY2(Numa nax, Numa nay1, Numa nay2, int plotstyle, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotSimpleXYN(Numa nax, Numaa naay, int plotstyle, int outformat, String outroot, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GPlot gplotRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int gplotWrite(String filename, GPlot gplot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaLine(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaWideLine(int x1, int y1, int x2, int y2, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaBox(Box box, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaBoxa(Boxa boxa, int width, int removedups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaHashBox(Box box, int spacing, int width, int orient, int outline) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline, int removedups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa generatePtaaBoxa(Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa generatePtaaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaPolyline(Pta ptas, int width, int closeflag, int removedups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaGrid(int w, int h, int nx, int ny, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta convertPtaLineTo4cc(Pta ptas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaFilledCircle(int radius) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaFilledSquare(int side) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta generatePtaLineFromPt(int x, int y, double length, double radang) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int locatePtRadially(int xr, int yr, double dist, double radang, DoubleBuffer px, DoubleBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPlotFromNuma(PointerByReference ppix, Numa na, int plotloc, int linewidth, int max, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta makePlotPtaFromNuma(Numa na, int size, int plotloc, int linewidth, int max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPlotFromNumaGen(PointerByReference ppix, Numa na, int orient, int linewidth, int refpos, int max, int drawref, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta makePlotPtaFromNumaGen(Numa na, int orient, int linewidth, int refpos, int max, int drawref) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPta(Pix pix, Pta pta, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPtaArb(Pix pix, Pta pta, byte rval, byte gval, byte bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPtaBlend(Pix pix, Pta pta, byte rval, byte gval, byte bval, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderLine(Pix pix, int x1, int y1, int x2, int y2, int width, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderLineArb(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderLineBlend(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBox(Pix pix, Box box, int width, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBoxArb(Pix pix, Box box, int width, byte rval, byte gval, byte bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBoxBlend(Pix pix, Box box, int width, byte rval, byte gval, byte bval, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBoxa(Pix pix, Boxa boxa, int width, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBoxaArb(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderBoxaBlend(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval, float fract, int removedups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBox(Pix pix, Box box, int spacing, int width, int orient, int outline, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBoxArb(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBoxBlend(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBoxa(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBoxaArb(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderHashBoxaBlend(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPolyline(Pix pix, Pta ptas, int width, int op, int closeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPolylineArb(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, int closeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderPolylineBlend(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, float fract, int closeflag, int removedups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRenderGridArb(Pix pix, int nx, int ny, int width, byte rval, byte gval, byte bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRenderRandomCmapPtaa(Pix pix, Ptaa ptaa, int polyflag, int width, int closeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRenderPolygon(Pta ptas, int width, IntBuffer pxmin, IntBuffer pymin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFillPolygon(Pix pixs, Pta pta, int xmin, int ymin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRenderContours(Pix pixs, int startval, int incr, int outdepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixAutoRenderContours(FPix fpix, int ncontours) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixRenderContours(FPix fpixs, float incr, float proxim) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixGeneratePtaBoundary(Pix pixs, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeGray(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateGray(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenGray(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseGray(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeGray3(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateGray3(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenGray3(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseGray3(Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDitherToBinary(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDitherToBinarySpec(Pix pixs, int lowerclip, int upperclip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdToBinary(Pix pixs, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixVarThresholdToBinary(Pix pixs, Pix pixg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAdaptThresholdToBinary(Pix pixs, Pix pixm, float gamma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAdaptThresholdToBinaryGen(Pix pixs, Pix pixm, float gamma, int blackval, int whiteval, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDitherToBinaryLUT(Pix pixs, int lowerclip, int upperclip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenerateMaskByValue(Pix pixs, int val, int usecmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenerateMaskByBand(Pix pixs, int lower, int upper, int inband, int usecmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDitherTo2bpp(Pix pixs, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDitherTo2bppSpec(Pix pixs, int lowerclip, int upperclip, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdTo2bpp(Pix pixs, int nlevels, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdTo4bpp(Pix pixs, int nlevels, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdOn8bpp(Pix pixs, int nlevels, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdGrayArb(Pix pixs, String edgevals, int outdepth, int use_average, int setblack, int setwhite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeGrayQuantIndexTable(int nlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeGrayQuantTargetTable(int nlevels, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeGrayQuantTableArb(Numa na, int outdepth, PointerByReference ptab, PointerByReference pcmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeGrayQuantColormapArb(Pix pixs, IntBuffer tab, int outdepth, PointerByReference pcmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeGrayQuantColormapArb(Pix pixs, IntByReference tab, int outdepth, PointerByReference pcmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenerateMaskByBand32(Pix pixs, int refval, int delm, int delp, float fractm, float fractp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenerateMaskByDiscr32(Pix pixs, int refval1, int refval2, int distflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGrayQuantFromHisto(Pix pixd, Pix pixs, Pix pixm, float minfract, int maxsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGrayQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherToBinaryLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherToBinaryLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void thresholdToBinaryLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int d, int wpls, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void thresholdToBinaryLineLow(IntBuffer lined, int w, IntBuffer lines, int d, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherToBinaryLUTLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherToBinaryLineLUTLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int make8To1DitherTables(PointerByReference ptabval, PointerByReference ptab38, PointerByReference ptab14, int lowerclip, int upperclip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherTo2bppLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ditherTo2bppLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int make8To2DitherTables(PointerByReference ptabval, PointerByReference ptab38, PointerByReference ptab14, int cliptoblack, int cliptowhite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void thresholdTo2bppLow(IntBuffer datad, int h, int wpld, IntBuffer datas, int wpls, IntBuffer tab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void thresholdTo4bppLow(IntBuffer datad, int h, int wpld, IntBuffer datas, int wpls, IntBuffer tab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Heap lheapCreate(int nalloc, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lheapDestroy(PointerByReference plh, int freeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapAdd(L_Heap lh, Pointer item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer lheapRemove(L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapGetCount(L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapSwapUp(L_Heap lh, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapSwapDown(L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapSort(L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapSortStrictOrder(L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lheapPrint(FILE fp, L_Heap lh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbRankHausInit(int components, int maxwidth, int maxheight, int size, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbCorrelationInit(int components, int maxwidth, int maxheight, float thresh, float weightfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbCorrelationInitWithoutComponents(int components, int maxwidth, int maxheight, float thresh, float weightfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbAddPages(JbClasser classer, Sarray safiles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbAddPage(JbClasser classer, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbAddPageComponents(JbClasser classer, Pix pixs, Boxa boxas, Pixa pixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbClassifyRankHaus(JbClasser classer, Boxa boxa, Pixa pixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRankHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh, int area1, int area3, float rank, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbClassifyCorrelation(JbClasser classer, Boxa boxa, Pixa pixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbGetComponents(Pix pixs, int components, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWordMaskByDilation(Pix pixs, int maxdil, PointerByReference ppixm, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWordMaskByDilation(Pix pixs, int maxdil, PointerByReference ppixm, IntByReference psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWordBoxesByDilation(Pix pixs, int maxdil, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWordBoxesByDilation(Pix pixs, int maxdil, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntByReference psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa jbAccumulateComposites(Pixaa pixaa, PointerByReference pna, PointerByReference pptat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa jbTemplatesFromComposites(Pixa pixac, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbClasser jbClasserCreate(int method, int components) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jbClasserDestroy(PointerByReference pclasser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbData jbDataSave(JbClasser classer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jbDataDestroy(PointerByReference pdata) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbDataWrite(String rootout, JbData jbdata) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JbData jbDataRead(String rootname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa jbDataRender(JbData data, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbGetULCorners(JbClasser classer, Pix pixs, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int jbGetLLCorners(JbClasser classer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderJp2k(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderJp2k(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemJp2k(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetJp2kResolution(FILE fp, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadJp2k(String filename, int reduction, Box box, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamJp2k(FILE fp, int reduction, Box box, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamJp2k(FILE fp, Pix pix, int quality, int nlevels, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemJp2k(ByteBuffer data, NativeSize size, int reduction, Box box, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemJp2k(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int nlevels, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadJpeg(String filename, int cmapflag, int reduction, IntBuffer pnwarn, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamJpeg(FILE fp, int cmapflag, int reduction, IntBuffer pnwarn, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderJpeg(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderJpeg(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetJpegResolution(FILE fp, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetJpegComment(FILE fp, PointerByReference pcomment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteJpeg(String filename, Pix pix, int quality, int progressive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamJpeg(FILE fp, Pix pixs, int quality, int progressive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemJpeg(ByteBuffer data, NativeSize size, int cmflag, int reduction, IntBuffer pnwarn, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemJpeg(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int progressive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetChromaSampling(Pix pix, int sampling) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelCreate(int height, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void kernelDestroy(PointerByReference pkel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelCopy(L_Kernel kels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelGetElement(L_Kernel kel, int row, int col, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelSetElement(L_Kernel kel, int row, int col, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelGetParameters(L_Kernel kel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelSetOrigin(L_Kernel kel, int cy, int cx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelGetSum(L_Kernel kel, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelGetMinMax(L_Kernel kel, FloatBuffer pmin, FloatBuffer pmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelNormalize(L_Kernel kels, float normsum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelInvert(L_Kernel kels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference create2dFloatArray(int sy, int sx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelRead(String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelWrite(String fname, L_Kernel kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int kernelWriteStream(FILE fp, L_Kernel kel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelCreateFromString(int h, int w, int cy, int cx, String kdata) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelCreateFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel kernelCreateFromPix(Pix pix, int cy, int cx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix kernelDisplayInPix(L_Kernel kel, int size, int gthick) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa parseStringForNumbers(String str, String seps) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel makeFlatKernel(int height, int width, int cy, int cx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel makeGaussianKernel(int halfheight, int halfwidth, float stdev, float max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeGaussianKernelSep(int halfheight, int halfwidth, float stdev, float max, PointerByReference pkelx, PointerByReference pkely) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Kernel makeDoGKernel(int halfheight, int halfwidth, float stdev, float ratio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer getImagelibVersions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listDestroy(PointerByReference phead) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listAddToHead(PointerByReference phead, Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listAddToTail(PointerByReference phead, PointerByReference ptail, Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listInsertBefore(PointerByReference phead, DoubleLinkedList elem, Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listInsertAfter(PointerByReference phead, DoubleLinkedList elem, Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer listRemoveElement(PointerByReference phead, DoubleLinkedList elem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer listRemoveFromHead(PointerByReference phead) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer listRemoveFromTail(PointerByReference phead, PointerByReference ptail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DoubleLinkedList listFindElement(DoubleLinkedList head, Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DoubleLinkedList listFindTail(DoubleLinkedList head) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listGetCount(DoubleLinkedList head) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listReverse(PointerByReference phead) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int listJoin(PointerByReference phead1, PointerByReference phead2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_amapCreate(int keytype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Rb_Type l_amapFind(L_Rbtree m, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_amapInsert(L_Rbtree m, Rb_Type.ByValue key, Rb_Type.ByValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_amapDelete(L_Rbtree m, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_amapDestroy(PointerByReference pm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_amapGetFirst(L_Rbtree m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_amapGetNext(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_amapGetLast(L_Rbtree m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_amapGetPrev(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_amapSize(L_Rbtree m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_asetCreate(int keytype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Rb_Type l_asetFind(L_Rbtree s, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_asetInsert(L_Rbtree s, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_asetDelete(L_Rbtree s, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_asetDestroy(PointerByReference ps) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_asetGetFirst(L_Rbtree s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_asetGetNext(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_asetGetLast(L_Rbtree s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_asetGetPrev(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_asetSize(L_Rbtree s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix generateBinaryMaze(int w, int h, int xi, int yi, float wallps, float ranis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixSearchBinaryMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixSearchGrayMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindLargestRectangle(Pix pixs, int polarity, PointerByReference pbox, String debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindLargestRectangle(Pix pixs, int polarity, PointerByReference pbox, Pointer debugfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilate(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErode(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHMT(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpen(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixClose(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseSafe(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenGeneralized(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseGeneralized(Pix pixd, Pix pixs, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseSafeBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selectComposableSels(int size, int direction, PointerByReference psel1, PointerByReference psel2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selectComposableSizes(int size, IntBuffer pfactor1, IntBuffer pfactor2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateCompBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenCompBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseCompBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseSafeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resetMorphBoundaryCondition(int bc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMorphBorderPixelColor(int type, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExtractBoundary(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceMasked(Pix pixs, Pix pixm, String sequence, int dispsep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceByComponent(Pix pixs, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceByComponent(Pix pixs, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaMorphSequenceByComponent(Pixa pixas, String sequence, int minw, int minh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaMorphSequenceByRegion(Pix pixs, Pixa pixam, String sequence, int minw, int minh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnionOfMorphOps(Pix pixs, Sela sela, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixIntersectionOfMorphOps(Pix pixs, Sela sela, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectiveConnCompFill(Pix pixs, int connectivity, int minw, int minh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRemoveMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int dsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int color, float scale, int nlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaExtendIterative(Pixa pixas, int type, int niters, Pointer sel, int include) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSeedfillMorph(Pix pixs, Pix pixm, int maxiters, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixRunHistogramMorph(Pix pixs, int runtype, int direction, int maxsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixTophat(Pix pixs, int hsize, int vsize, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHDome(Pix pixs, int height, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFastTophat(Pix pixs, int xsize, int ysize, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphGradient(Pix pixs, int hsize, int vsize, int smoothing) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixaCentroids(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCentroid(Pix pix, IntBuffer centtab, IntBuffer sumtab, FloatBuffer pxave, FloatBuffer pyave) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDilateCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixErodeCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOpenCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCloseCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getExtendedCompositeParameters(int size, IntBuffer pn, IntBuffer pextra, IntBuffer pactualsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequence(Pix pixs, String sequence, int dispsep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphCompSequence(Pix pixs, String sequence, int dispsep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphSequenceDwa(Pix pixs, String sequence, int dispsep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMorphCompSequenceDwa(Pix pixs, String sequence, int dispsep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int morphSequenceVerify(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGrayMorphSequence(Pix pixs, String sequence, int dispsep, int dispy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorMorphSequence(Pix pixs, String sequence, int dispsep, int dispy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCreateFromIArray(IntBuffer iarray, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCreateFromFArray(FloatBuffer farray, int size, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCreateFromString(String str) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void numaDestroy(PointerByReference pna) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCopy(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaClone(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaEmpty(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaAddNumber(Numa na, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaInsertNumber(Numa na, int index, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaRemoveNumber(Numa na, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaReplaceNumber(Numa na, int index, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetCount(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSetCount(Numa na, int newcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetFValue(Numa na, int index, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetIValue(Numa na, int index, IntBuffer pival) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSetValue(Numa na, int index, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaShiftValue(Numa na, int index, float diff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference numaGetIArray(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference numaGetFArray(Numa na, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetRefcount(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaChangeRefcount(Numa na, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetParameters(Numa na, FloatBuffer pstartx, FloatBuffer pdelx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSetParameters(Numa na, float startx, float delx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaCopyParameters(Numa nad, Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray numaConvertToSarray(Numa na, int size1, int size2, int addzeros, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaWrite(String filename, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaWriteStream(FILE fp, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaCreateFull(int nptr, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaTruncate(Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void numaaDestroy(PointerByReference pnaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaAddNuma(Numaa naa, Numa na, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaGetCount(Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaGetNumaCount(Numaa naa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaGetNumberCount(Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference numaaGetPtrArray(Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaaGetNuma(Numaa naa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaReplaceNuma(Numaa naa, int index, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaGetValue(Numaa naa, int i, int j, FloatBuffer pfval, IntBuffer pival) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaAddNumber(Numaa naa, int index, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaWrite(String filename, Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaWriteStream(FILE fp, Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaArithOp(Numa nad, Numa na1, Numa na2, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaLogicalOp(Numa nad, Numa na1, Numa na2, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaInvert(Numa nad, Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSimilar(Numa na1, Numa na2, float maxdiff, IntBuffer psimilar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaAddToNumber(Numa na, int index, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetMin(Numa na, FloatBuffer pminval, IntBuffer piminloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetMax(Numa na, FloatBuffer pmaxval, IntBuffer pimaxloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetSum(Numa na, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaGetPartialSums(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetSumOnInterval(Numa na, int first, int last, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaHasOnlyIntegers(Numa na, int maxsamples, IntBuffer pallints) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaSubsample(Numa nas, int subfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeDelta(Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeSequence(float startval, float increment, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeConstant(float val, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeAbsValue(Numa nad, Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaAddBorder(Numa nas, int left, int right, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaAddSpecifiedBorder(Numa nas, int left, int right, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaRemoveBorder(Numa nas, int left, int right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetNonzeroRange(Numa na, float eps, IntBuffer pfirst, IntBuffer plast) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetCountRelativeToZero(Numa na, int type, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaClipToInterval(Numa nas, int first, int last) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeThresholdIndicator(Numa nas, float thresh, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaUniformSampling(Numa nas, int nsamp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaReverse(Numa nad, Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaLowPassIntervals(Numa nas, float thresh, float maxn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaThresholdEdges(Numa nas, float thresh1, float thresh2, float maxn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetSpanValues(Numa na, int span, IntBuffer pstart, IntBuffer pend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetEdgeValues(Numa na, int edge, IntBuffer pstart, IntBuffer pend, IntBuffer psign) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaInterpolateEqxVal(float startx, float deltax, Numa nay, int type, float xval, FloatBuffer pyval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaInterpolateArbxVal(Numa nax, Numa nay, int type, float xval, FloatBuffer pyval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaInterpolateEqxInterval(float startx, float deltax, Numa nasy, int type, float x0, float x1, int npts, PointerByReference pnax, PointerByReference pnay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaInterpolateArbxInterval(Numa nax, Numa nay, int type, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaFitMax(Numa na, FloatBuffer pmaxval, Numa naloc, FloatBuffer pmaxloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaDifferentiateInterval(Numa nax, Numa nay, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaIntegrateInterval(Numa nax, Numa nay, float x0, float x1, int npts, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSortGeneral(Numa na, PointerByReference pnasort, PointerByReference pnaindex, PointerByReference pnainvert, int sortorder, int sorttype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaSortAutoSelect(Numa nas, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaSortIndexAutoSelect(Numa nas, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaChooseSortType(Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaSort(Numa naout, Numa nain, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaBinSort(Numa nas, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaGetSortIndex(Numa na, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaGetBinSortIndex(Numa nas, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaSortByIndex(Numa nas, Numa naindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaIsSorted(Numa nas, int sortorder, IntBuffer psorted) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSortPair(Numa nax, Numa nay, int sortorder, PointerByReference pnasx, PointerByReference pnasy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaInvertMap(Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaPseudorandomSequence(int size, int seed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaRandomPermutation(Numa nas, int seed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetRankValue(Numa na, float fract, Numa nasort, int usebins, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetMedian(Numa na, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetBinnedMedian(Numa na, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetMode(Numa na, FloatBuffer pval, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetMedianVariation(Numa na, FloatBuffer pmedval, FloatBuffer pmedvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaJoin(Numa nad, Numa nas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaaJoin(Numaa naad, Numaa naas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaaFlattenToNuma(Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaUnionByAset(Numa na1, Numa na2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaRemoveDupsByAset(Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaIntersectionByAset(Numa na1, Numa na2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_asetCreateFromNuma(Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaErode(Numa nas, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaDilate(Numa nas, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaOpen(Numa nas, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaClose(Numa nas, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaTransform(Numa nas, float shift, float scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSimpleStats(Numa na, int first, int last, FloatBuffer pmean, FloatBuffer pvar, FloatBuffer prvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaWindowedStats(Numa nas, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaWindowedMean(Numa nas, int wc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaWindowedMeanSquare(Numa nas, int wc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaWindowedVariance(Numa nam, Numa nams, PointerByReference pnav, PointerByReference pnarv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaWindowedMedian(Numa nas, int halfwin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaConvertToInt(Numa nas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeHistogram(Numa na, int maxbins, IntBuffer pbinsize, IntBuffer pbinstart) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeHistogramAuto(Numa na, int maxbins) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaMakeHistogramClipped(Numa na, float binsize, float maxsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaRebinHistogram(Numa nas, int newsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaNormalizeHistogram(Numa nas, float tsum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatBuffer pmin, FloatBuffer pmax, FloatBuffer pmean, FloatBuffer pvariance, FloatBuffer pmedian, float rank, FloatBuffer prval, PointerByReference phisto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatByReference pmin, FloatByReference pmax, FloatByReference pmean, FloatByReference pvariance, FloatByReference pmedian, float rank, FloatByReference prval, PointerByReference phisto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetHistogramStats(Numa nahisto, float startx, float deltax, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetHistogramStatsOnInterval(Numa nahisto, float startx, float deltax, int ifirst, int ilast, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaMakeRankFromHistogram(float startx, float deltax, Numa nasy, int npts, PointerByReference pnax, PointerByReference pnay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaHistogramGetRankFromVal(Numa na, float rval, FloatBuffer prank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaHistogramGetValFromRank(Numa na, float rank, FloatBuffer prval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaDiscretizeRankAndIntensity(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam, PointerByReference pnar, PointerByReference pnabb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaGetRankBinValues(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSplitDistribution(Numa na, float scorefract, IntBuffer psplitindex, FloatBuffer pave1, FloatBuffer pave2, FloatBuffer pnum1, FloatBuffer pnum2, PointerByReference pnascore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSplitDistribution(Numa na, float scorefract, IntByReference psplitindex, FloatByReference pave1, FloatByReference pave2, FloatByReference pnum1, FloatByReference pnum2, PointerByReference pnascore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int grayHistogramsToEMD(Numaa naa1, Numaa naa2, PointerByReference pnad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaEarthMoverDistance(Numa na1, Numa na2, FloatBuffer pdist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int grayInterHistogramStats(Numaa naa, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaFindPeaks(Numa nas, int nmax, float fract1, float fract2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaFindExtrema(Numa nas, float delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaCountReversals(Numa nas, float minreversal, IntBuffer pnr, FloatBuffer pnrpl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaSelectCrossingThreshold(Numa nax, Numa nay, float estthresh, FloatBuffer pbestthresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCrossingsByThreshold(Numa nax, Numa nay, float thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaCrossingsByPeaks(Numa nax, Numa nay, float delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaEvalBestHaarParameters(Numa nas, float relweight, int nwidth, int nshift, float minwidth, float maxwidth, FloatBuffer pbestwidth, FloatBuffer pbestshift, FloatBuffer pbestscore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaEvalHaarSum(Numa nas, float width, float shift, float relweight, FloatBuffer pscore) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa genConstrainedNumaInRange(int first, int last, int nmax, int use_pairs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRegionsBinary(Pix pixs, PointerByReference ppixhm, PointerByReference ppixtm, PointerByReference ppixtb, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntBuffer ptlfound, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntByReference ptlfound, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenTextblockMask(Pix pixs, Pix pixvws, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixFindPageForeground(Pix pixs, int threshold, int mindist, int erasedist, int pagenum, int showmorph, int display, String pdfdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSplitIntoCharacters(Pix pixs, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdebug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixSplitComponentWithProfile(Pix pixs, int delta, int mindel, PointerByReference ppixdebug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixExtractTextlines(Pix pixs, int maxw, int maxh, int minw, int minh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDecideIfText(Pix pixs, Box box, IntBuffer pistext, Pixa pixadb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindThreshFgExtent(Pix pixs, int thresh, IntBuffer ptop, IntBuffer pbot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetSelectCmap(Pix pixs, Box box, int sindex, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorGrayRegionsCmap(Pix pixs, Boxa boxa, int type, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorGrayCmap(Pix pixs, Box box, int type, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColorGrayMaskedCmap(Pix pixs, Pix pixm, int type, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int addColorizedGrayToCmap(PixColormap cmap, int type, int rval, int gval, int bval, PointerByReference pna) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetSelectMaskedCmap(Pix pixs, Pix pixm, int x, int y, int sindex, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetMaskedCmap(Pix pixs, Pix pixm, int x, int y, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer parseForProtos(String filein, String prestring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaGetWhiteblocks(Boxa boxas, Box box, int sortflag, int maxboxes, float maxoverlap, int maxperim, float fract, int maxpops) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaPruneSortedOnOverlap(Boxa boxas, float maxoverlap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFilesToPdf(String dirname, String substr, int res, float scalefactor, int type, int quality, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConvertFilesToPdf(Sarray sa, int res, float scalefactor, int type, int quality, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConvertFilesToPdfData(Sarray sa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selectDefaultPdfEncoding(Pix pix, IntBuffer ptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertUnscaledFilesToPdf(String dirname, String substr, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConvertUnscaledFilesToPdf(Sarray sa, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConvertUnscaledFilesToPdfData(Sarray sa, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertUnscaledToPdfData(String fname, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaConvertToPdf(Pixa pixa, int res, float scalefactor, int type, int quality, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaConvertToPdfData(Pixa pixa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdf(String filein, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdf(Pointer filein, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertImageDataToPdf(ByteBuffer imdata, NativeSize size, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertImageDataToPdf(Pointer imdata, NativeSize size, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdfData(String filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdfData(Pointer filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertImageDataToPdfData(ByteBuffer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertImageDataToPdfData(Pointer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdf(Pix pix, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdf(Pix pix, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamPdf(FILE fp, Pix pix, int res, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemPdf(PointerByReference pdata, NativeSizeByReference pnbytes, Pix pix, int res, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertSegmentedFilesToPdf(String dirname, String substr, int res, int type, int thresh, Boxaa baa, int quality, float scalefactor, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa convertNumberedMasksToBoxaa(String dirname, String substr, int numpre, int numpost) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdfSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdfSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPdfDataSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdfDataSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int concatenatePdf(String dirname, String substr, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConcatenatePdf(Sarray sa, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraConcatenatePdf(L_Ptra pa, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int concatenatePdfToData(String dirname, String substr, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int saConcatenatePdfToData(Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraConcatenatePdfToData(L_Ptra pa_data, Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_generateCIDataForPdf(String fname, Pix pix, int quality, PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_generateCIDataForPdf(Pointer fname, Pix pix, int quality, PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Compressed_Data l_generateFlateDataPdf(String fname, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Compressed_Data l_generateJpegData(String fname, int ascii85flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_generateCIData(String fname, int type, int quality, int ascii85, PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_generateCIData(Pointer fname, int type, int quality, int ascii85, PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGenerateCIData(Pix pixs, int type, int quality, int ascii85, PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Compressed_Data l_generateFlateData(String fname, int ascii85flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Compressed_Data l_generateG4Data(String fname, int ascii85flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int cidConvertToPdfData(L_Compressed_Data cid, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_CIDataDestroy(PointerByReference pcid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_pdfSetG4ImageMask(int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_pdfSetDateAndVersion(int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPixMemoryManager(setPixMemoryManager_allocator_callback allocator, setPixMemoryManager_deallocator_callback deallocator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreate(int width, int height, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateNoInit(int width, int height, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateTemplate(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateTemplateNoInit(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateHeader(int width, int height, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixClone(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixDestroy(PointerByReference ppix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCopy(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixResizeImageData(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyColormap(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSizesEqual(Pix pix1, Pix pix2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTransferAllData(Pix pixd, PointerByReference ppixs, int copytext, int copyformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSwapAndDestroy(PointerByReference ppixd, PointerByReference ppixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetWidth(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetWidth(Pix pix, int width) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetHeight(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetHeight(Pix pix, int height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetDepth(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetDepth(Pix pix, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetDimensions(Pix pix, IntBuffer pw, IntBuffer ph, IntBuffer pd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetDimensions(Pix pix, int w, int h, int d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyDimensions(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetSpp(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetSpp(Pix pix, int spp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopySpp(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetWpl(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetWpl(Pix pix, int wpl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRefcount(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixChangeRefcount(Pix pix, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetXRes(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetXRes(Pix pix, int res) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetYRes(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetYRes(Pix pix, int res) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetResolution(Pix pix, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetResolution(Pix pix, int xres, int yres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyResolution(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixScaleResolution(Pix pix, float xscale, float yscale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetInputFormat(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetInputFormat(Pix pix, int informat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyInputFormat(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetSpecial(Pix pix, int special) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pixGetText(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetText(Pix pix, String textstring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAddText(Pix pix, String textstring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyText(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixColormap pixGetColormap(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetColormap(Pix pix, PixColormap colormap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDestroyColormap(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference pixGetData(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetData(Pix pix, IntBuffer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference pixExtractData(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFreeData(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference pixGetLinePtrs(Pix pix, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixPrintStreamInfo(FILE fp, Pix pix, String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetPixel(Pix pix, int x, int y, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetPixel(Pix pix, int x, int y, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRGBPixel(Pix pix, int x, int y, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetRGBPixel(Pix pix, int x, int y, int rval, int gval, int bval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRandomPixel(Pix pix, IntBuffer pval, IntBuffer px, IntBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClearPixel(Pix pix, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFlipPixel(Pix pix, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPixelLow(IntBuffer line, int x, int depth, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBlackOrWhiteVal(Pix pixs, int op, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClearAll(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetAll(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetAllGray(Pix pix, int grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetAllArbitrary(Pix pix, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetBlackOrWhite(Pix pixs, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetComponentArbitrary(Pix pix, int comp, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClearInRect(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetInRect(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetInRectArbitrary(Pix pix, Box box, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixBlendInRect(Pix pixs, Box box, int val, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetPadBits(Pix pix, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetPadBitsBand(Pix pix, int by, int bh, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetOrClearBorder(Pix pixs, int left, int right, int top, int bot, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetBorderVal(Pix pixs, int left, int right, int top, int bot, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetBorderRingVal(Pix pixs, int dist, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetMirroredBorder(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCopyBorder(Pix pixd, Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddBorder(Pix pixs, int npix, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddBlackOrWhiteBorder(Pix pixs, int left, int right, int top, int bot, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddBorderGeneral(Pix pixs, int left, int right, int top, int bot, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveBorder(Pix pixs, int npix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveBorderGeneral(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveBorderToSize(Pix pixs, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddMirroredBorder(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddRepeatedBorder(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddMixedBorder(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddContinuedBorder(Pix pixs, int left, int right, int top, int bot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixShiftAndTransferAlpha(Pix pixd, Pix pixs, float shiftx, float shifty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayLayersRGBA(Pix pixs, int val, int maxw) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateRGBImage(Pix pixr, Pix pixg, Pix pixb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGetRGBComponent(Pix pixs, int comp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetRGBComponent(Pix pixd, Pix pixs, int comp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGetRGBComponentCmap(Pix pixs, int comp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCopyRGBComponent(Pix pixd, Pix pixs, int comp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int composeRGBPixel(int rval, int gval, int bval, IntBuffer ppixel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int composeRGBAPixel(int rval, int gval, int bval, int aval, IntBuffer ppixel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void extractRGBValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void extractRGBAValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int extractMinMaxComponent(int pixel, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRGBLine(Pix pixs, int row, ByteBuffer bufr, ByteBuffer bufg, ByteBuffer bufb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixEndianByteSwapNew(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixEndianByteSwap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lineEndianByteSwap(IntBuffer datad, IntBuffer datas, int wpl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixEndianTwoByteSwapNew(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixEndianTwoByteSwap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRasterData(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAlphaIsOpaque(Pix pix, IntBuffer popaque) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference pixSetupByteProcessing(Pix pix, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCleanupByteProcessing(Pix pix, PointerByReference lineptrs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_setAlphaMaskBorder(float val1, float val2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetMasked(Pix pixd, Pix pixm, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetMaskedGeneral(Pix pixd, Pix pixm, int val, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCombineMasked(Pix pixd, Pix pixs, Pix pixm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCombineMaskedGeneral(Pix pixd, Pix pixs, Pix pixm, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixPaintThroughMask(Pix pixd, Pix pixm, int x, int y, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixPaintSelfThroughMask(Pix pixd, Pix pixm, int x, int y, int searchdir, int mindist, int tilesize, int ntiles, int distblend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeMaskFromLUT(Pix pixs, IntBuffer tab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSetUnderTransparency(Pix pixs, int val, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeAlphaFromMask(Pix pixs, int dist, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetColorNearMaskBoundary(Pix pixs, Pix pixm, Box box, int dist, IntBuffer pval, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixInvert(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixOr(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAnd(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixXor(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSubtract(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixZero(Pix pix, IntBuffer pempty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixForegroundFraction(Pix pix, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaCountPixels(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCountPixels(Pix pix, IntBuffer pcount, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixCountByRow(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixCountByColumn(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixCountPixelsByRow(Pix pix, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixCountPixelsByColumn(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCountPixelsInRow(Pix pix, int row, IntBuffer pcount, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetMomentByColumn(Pix pix, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixThresholdPixelSum(Pix pix, int thresh, IntBuffer pabove, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makePixelSumTab8() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makePixelCentroidTab8() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixAverageByRow(Pix pix, Box box, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixAverageByColumn(Pix pix, Box box, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAverageInRect(Pix pix, Box box, FloatBuffer pave) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixVarianceByRow(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixVarianceByColumn(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixVarianceInRect(Pix pix, Box box, FloatBuffer prootvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixAbsDiffByRow(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixAbsDiffByColumn(Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAbsDiffInRect(Pix pix, Box box, int dir, FloatBuffer pabsdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAbsDiffOnLine(Pix pix, int x1, int y1, int x2, int y2, FloatBuffer pabsdiff) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCountArbInRect(Pix pixs, Box box, int val, int factor, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMirroredTiling(Pix pixs, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindRepCloseTile(Pix pixs, Box box, int searchdir, int mindist, int tsize, int ntiles, PointerByReference pboxtile, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetGrayHistogram(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetGrayHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetGrayHistogramInRect(Pix pixs, Box box, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa pixGetGrayHistogramTiled(Pix pixs, int factor, int nx, int ny) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetColorHistogram(Pix pixs, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetColorHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetCmapHistogram(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetCmapHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetCmapHistogramInRect(Pix pixs, Box box, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRankValue(Pix pixs, int factor, float rank, IntBuffer pvalue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRankValueMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer pval, PointerByReference pna) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatByReference pval, PointerByReference pna) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetAverageValue(Pix pixs, int factor, int type, IntBuffer pvalue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetAverageMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetAverageMasked(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetAverageTiledRGB(Pix pixs, int sx, int sy, int type, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGetAverageTiled(Pix pixs, int sx, int sy, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRowStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixColumnStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetComponentRange(Pix pixs, int factor, int color, IntBuffer pminval, IntBuffer pmaxval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetExtremeValue(Pix pixs, int factor, int type, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer pgrayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetMaxValueInRect(Pix pixs, Box box, IntBuffer pmaxval, IntBuffer pxmax, IntBuffer pymax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBinnedComponentRange(Pix pixs, int nbins, int factor, int color, IntBuffer pminval, IntBuffer pmaxval, PointerByReference pcarray, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRankColorArray(Pix pixs, int nbins, int type, int factor, PointerByReference pcarray, int debugflag, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetBinnedColor(Pix pixs, Pix pixg, int factor, int nbins, Numa nalut, PointerByReference pcarray, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayColorArray(IntBuffer carray, int ncolors, int side, int ncols, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankBinByStrip(Pix pixs, int direction, int size, int nbins, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaGetAlignedStats(Pixa pixa, int type, int nbins, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaExtractColumnFromEachPix(Pixa pixa, int col, Pix pixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetRowStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer colvect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetColumnStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer rowvect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetPixelColumn(Pix pix, int col, FloatBuffer colvect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixThresholdForFgBg(Pix pixs, int factor, int thresh, IntBuffer pfgval, IntBuffer pbgval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntBuffer pthresh, IntBuffer pfgval, IntBuffer pbgval, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaFindDimensions(Pixa pixa, PointerByReference pnaw, PointerByReference pnah) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindAreaPerimRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindPerimToAreaRatio(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindPerimToAreaRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindPerimSizeRatio(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindPerimSizeRatio(Pix pixs, IntBuffer tab, FloatBuffer pratio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindAreaFraction(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindAreaFraction(Pix pixs, IntBuffer tab, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindAreaFractionMasked(Pixa pixa, Pix pixm, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindAreaFractionMasked(Pix pixs, Box box, Pix pixm, IntBuffer tab, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindWidthHeightRatio(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaFindWidthHeightProduct(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindOverlapFraction(Pix pixs1, Pix pixs2, int x2, int y2, IntBuffer tab, FloatBuffer pratio, IntBuffer pnoverlap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixFindRectangleComps(Pix pixs, int dist, int minw, int minh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConformsToRectangle(Pix pixs, Box box, int dist, IntBuffer pconforms) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixClipRectangles(Pix pixs, Boxa boxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixClipRectangle(Pix pixs, Box box, PointerByReference pboxc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixClipMasked(Pix pixs, Pix pixm, int x, int y, int outval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixCropToMatch(Pix pixs1, Pix pixs2, PointerByReference ppixd1, PointerByReference ppixd2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCropToSize(Pix pixs, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixResizeToMatch(Pix pixs, Pix pixt, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMakeFrameMask(int w, int h, float hf1, float hf2, float vf1, float vf2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFractionFgInMask(Pix pix1, Pix pix2, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClipToForeground(Pix pixs, PointerByReference ppixd, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTestClipToForeground(Pix pixs, IntBuffer pcanclip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClipBoxToForeground(Pix pixs, Box boxs, PointerByReference ppixd, PointerByReference pboxd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixScanForForeground(Pix pixs, Box box, int scanflag, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixClipBoxToEdges(Pix pixs, Box boxs, int lowthresh, int highthresh, int maxwidth, int factor, PointerByReference ppixd, PointerByReference pboxd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixScanForEdge(Pix pixs, Box box, int lowthresh, int highthresh, int maxwidth, int factor, int scanflag, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixExtractOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float pixAverageOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixAverageIntensityProfile(Pix pixs, float fract, int dir, int first, int last, int factor1, int factor2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixReversalProfile(Pix pixs, float fract, int dir, int first, int last, int minreversal, int factor1, int factor2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWindowedVarianceOnLine(Pix pixs, int dir, int loc, int c1, int c2, int size, PointerByReference pnad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatBuffer pminave, FloatBuffer pmaxave) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatByReference pminave, FloatByReference pmaxave) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankRowTransform(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankColumnTransform(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaCreateFromPix(Pix pixs, int n, int cellw, int cellh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaCreateFromBoxa(Pix pixs, Boxa boxa, IntBuffer pcropwarn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSplitPix(Pix pixs, int nx, int ny, int borderwidth, int bordercolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixaDestroy(PointerByReference ppixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaCopy(Pixa pixa, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAddPix(Pixa pixa, Pix pix, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAddBox(Pixa pixa, Box box, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaExtendArrayToSize(Pixa pixa, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetCount(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaChangeRefcount(Pixa pixa, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaGetPix(Pixa pixa, int index, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetPixDimensions(Pixa pixa, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixaGetBoxa(Pixa pixa, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetBoxaCount(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixaGetBox(Pixa pixa, int index, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetBoxGeometry(Pixa pixa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaSetBoxa(Pixa pixa, Boxa boxa, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference pixaGetPixArray(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaVerifyDepth(Pixa pixa, IntBuffer pmaxdepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaIsFull(Pixa pixa, IntBuffer pfullpa, IntBuffer pfullba) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaCountText(Pixa pixa, IntBuffer pntext) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference pixaGetLinePtrs(Pixa pixa, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaWriteStreamInfo(FILE fp, Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaReplacePix(Pixa pixa, int index, Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaInsertPix(Pixa pixa, int index, Pix pixs, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaRemovePix(Pixa pixa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaRemovePixAndSave(Pixa pixa, int index, PointerByReference ppix, PointerByReference pbox) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaInitFull(Pixa pixa, Pix pix, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaClear(Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaJoin(Pixa pixad, Pixa pixas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaJoin(Pixaa paad, Pixaa paas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaCreateFromPixa(Pixa pixa, int n, int type, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixaaDestroy(PointerByReference ppaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaAddPixa(Pixaa paa, Pixa pixa, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaExtendArray(Pixaa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaAddPix(Pixaa paa, int index, Pix pix, Box box, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaAddBox(Pixaa paa, Box box, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaGetCount(Pixaa paa, PointerByReference pna) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaaGetPixa(Pixaa paa, int index, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixaaGetBoxa(Pixaa paa, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaaGetPix(Pixaa paa, int index, int ipix, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaVerifyDepth(Pixaa paa, IntBuffer pmaxdepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaIsFull(Pixaa paa, IntBuffer pfull) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaInitFull(Pixaa paa, Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaReplacePixa(Pixaa paa, int index, Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaClear(Pixaa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaTruncate(Pixaa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaWrite(String filename, Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaWriteStream(FILE fp, Pixa pixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaReadFromFiles(String dirname, String substr, int first, int nfiles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaWrite(String filename, Pixaa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaWriteStream(FILE fp, Pixaa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixacc pixaccCreate(int w, int h, int negflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixacc pixaccCreateFromPix(Pix pix, int negflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixaccDestroy(PointerByReference ppixacc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaccFinal(Pixacc pixacc, int outdepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaccGetPix(Pixacc pixacc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaccGetOffset(Pixacc pixacc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaccAdd(Pixacc pixacc, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaccSubtract(Pixacc pixacc, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaccMultConst(Pixacc pixacc, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaccMultConstAccumulate(Pixacc pixacc, Pix pix, float factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectBySize(Pix pixs, int width, int height, int connectivity, int type, int relation, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectBySize(Pixa pixas, int width, int height, int type, int relation, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixaMakeSizeIndicator(Pixa pixa, int width, int height, int type, int relation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectByPerimToAreaRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectByPerimToAreaRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectByPerimSizeRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectByPerimSizeRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectByAreaFraction(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectByAreaFraction(Pixa pixas, float thresh, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSelectByWidthHeightRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectByWidthHeightRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectWithIndicator(Pixa pixas, Numa na, IntBuffer pchanged) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRemoveWithIndicator(Pix pixs, Pixa pixa, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAddWithIndicator(Pix pixs, Pixa pixa, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectWithString(Pixa pixas, String str, IntBuffer perror) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaRenderComponent(Pix pixs, Pixa pixa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaBinSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSortByIndex(Pixa pixas, Numa naindex, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaSort2dByIndex(Pixa pixas, Numaa naa, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectRange(Pixa pixas, int first, int last, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaSelectRange(Pixaa paas, int first, int last, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaScaleToSize(Pixaa paas, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixaa pixaaScaleToSizeVar(Pixaa paas, Numa nawd, Numa nahd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaScaleToSize(Pixa pixas, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaAddBorderGeneral(Pixa pixad, Pixa pixas, int left, int right, int top, int bot, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaaFlattenToPixa(Pixaa paa, PointerByReference pnaindex, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaaSizeRange(Pixaa paa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaSizeRange(Pixa pixa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaClipToPix(Pixa pixas, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetRenderingDepth(Pixa pixa, IntBuffer pdepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaHasColor(Pixa pixa, IntBuffer phascolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAnyColormaps(Pixa pixa, IntBuffer phascmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaGetDepthInfo(Pixa pixa, IntBuffer pmaxdepth, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaConvertToSameDepth(Pixa pixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntByReference psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaRotateOrth(Pixa pixas, int rotation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplay(Pixa pixa, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayOnColor(Pixa pixa, int w, int h, int bgcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayRandomCmap(Pixa pixa, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayLinearly(Pixa pixas, int direction, float scalefactor, int background, int spacing, int border, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntBuffer pncols, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntByReference pncols, PointerByReference pboxa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayUnsplit(Pixa pixa, int nx, int ny, int borderwidth, int bordercolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayTiled(Pixa pixa, int maxwidth, int background, int spacing) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayTiledInRows(Pixa pixa, int outdepth, int maxwidth, float scalefactor, int background, int spacing, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayTiledAndScaled(Pixa pixa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayTiledWithText(Pixa pixa, int maxwidth, float scalefactor, int spacing, int border, int fontsize, int textcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaDisplayTiledByIndex(Pixa pixa, Numa na, int width, int spacing, int border, int fontsize, int textcolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaaDisplay(Pixaa paa, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixaaDisplayByPixa(Pixaa paa, int xspace, int yspace, int maxw) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaaDisplayTiledAndScaled(Pixaa paa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaConvertTo1(Pixa pixas, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaConvertTo8(Pixa pixas, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaConvertTo8Color(Pixa pixas, int dither) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaConvertTo32(Pixa pixas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToNUpFiles(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize, String outdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa convertToNUpPixa(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pmsCreate(NativeSize minsize, NativeSize smallest, Numa numalloc, String logfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pmsDestroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pmsCustomAlloc(NativeSize nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pmsCustomDealloc(Pointer data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pmsGetAlloc(NativeSize nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pmsGetLevelForAlloc(NativeSize nbytes, IntBuffer plevel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pmsGetLevelForDealloc(Pointer data, IntBuffer plevel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pmsLogInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAddConstantGray(Pix pixs, int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMultConstantGray(Pix pixs, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddGray(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSubtractGray(Pix pixd, Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThresholdToValue(Pix pixd, Pix pixs, int threshval, int setval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixInitAccumulate(int w, int h, int offset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFinalAccumulate(Pix pixs, int offset, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFinalAccumulateThreshold(Pix pixs, int offset, int threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAccumulate(Pix pixd, Pix pixs, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMultConstAccumulate(Pix pixs, float factor, int offset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAbsDifference(Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddRGB(Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMinOrMax(Pix pixd, Pix pixs1, Pix pixs2, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMaxDynamicRange(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FloatByReference makeLogBase2Tab() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getLogBase2(int val, FloatBuffer logtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixComp pixcompCreateFromPix(Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixComp pixcompCreateFromString(ByteBuffer data, NativeSize size, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixComp pixcompCreateFromFile(String filename, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixcompDestroy(PointerByReference ppixc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcompGetDimensions(PixComp pixc, IntBuffer pw, IntBuffer ph, IntBuffer pd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcompDetermineFormat(int comptype, int d, int cmapflag, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixCreateFromPixcomp(PixComp pixc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompCreateWithInit(int n, int offset, Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompCreateFromPixa(Pixa pixa, int comptype, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompCreateFromFiles(String dirname, String substr, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompCreateFromSA(Sarray sa, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixacompDestroy(PointerByReference ppixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompAddPix(PixaComp pixac, Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompAddPixcomp(PixaComp pixac, PixComp pixc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompReplacePix(PixaComp pixac, int index, Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompReplacePixcomp(PixaComp pixac, int index, PixComp pixc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompAddBox(PixaComp pixac, Box box, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompGetCount(PixaComp pixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixComp pixacompGetPixcomp(PixaComp pixac, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixacompGetPix(PixaComp pixac, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompGetPixDimensions(PixaComp pixac, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixacompGetBoxa(PixaComp pixac, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompGetBoxaCount(PixaComp pixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box pixacompGetBox(PixaComp pixac, int index, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompGetBoxGeometry(PixaComp pixac, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompGetOffset(PixaComp pixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompSetOffset(PixaComp pixac, int offset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaCreateFromPixacomp(PixaComp pixac, int accesstype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixaComp pixacompReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompWrite(String filename, PixaComp pixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompWriteStream(FILE fp, PixaComp pixac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompConvertToPdf(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompConvertToPdfData(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixacompWriteStreamInfo(FILE fp, PixaComp pixac, String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixcompWriteStreamInfo(FILE fp, PixComp pixc, String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixacompDisplayTiledAndScaled(PixaComp pixac, int outdepth, int tilewidth, int ncols, int background, int spacing, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixThreshold8(Pix pixs, int d, int nlevels, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveColormapGeneral(Pix pixs, int type, int ifnocmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveColormap(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixAddGrayColormap8(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddMinimalGrayColormap8(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToLuminance(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToGray(Pix pixs, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToGrayFast(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToGrayMinMax(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToGraySatBoost(Pix pixs, int refval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertGrayToColormap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertGrayToColormap8(Pix pixs, int mindepth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixColorizeGray(Pix pixs, int color, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertRGBToColormap(Pix pixs, int ditherflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixQuantizeIfFewColors(Pix pixs, int maxcolors, int mingraycolors, int octlevel, PointerByReference ppixd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert16To8(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertGrayToFalseColor(Pix pixs, float gamma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixUnpackBinary(Pix pixs, int depth, int invert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To16(Pix pixd, Pix pixs, short val0, short val1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To32(Pix pixd, Pix pixs, int val0, int val1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To2Cmap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To2(Pix pixd, Pix pixs, int val0, int val1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To4Cmap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To4(Pix pixd, Pix pixs, int val0, int val1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To8Cmap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert1To8(Pix pixd, Pix pixs, byte val0, byte val1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert2To8(Pix pixs, byte val0, byte val1, byte val2, byte val3, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert4To8(Pix pixs, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert8To16(Pix pixs, int leftshift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo1(Pix pixs, int threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo1BySampling(Pix pixs, int factor, int threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo8(Pix pixs, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo8BySampling(Pix pixs, int factor, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo8Color(Pix pixs, int dither) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo16(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo32(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo32BySampling(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert8To32(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertTo8Or32(Pix pixs, int copyflag, int warnflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert24To32(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert32To24(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert32To16(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvert32To8(Pix pixs, int type16, int type8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveAlpha(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddAlphaTo1bpp(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertLossless(Pix pixs, int d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertForPSWrap(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertToSubpixelRGB(Pix pixs, float scalex, float scaley, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertGrayToSubpixelRGB(Pix pixs, float scalex, float scaley, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConvertColorToSubpixelRGB(Pix pixs, float scalex, float scaley, int order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConnCompTransform(Pix pixs, int connect, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixConnCompAreaTransform(Pix pixs, int connect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntBuffer pncc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntByReference pncc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixConnCompIncrAdd(Pix pixs, Ptaa ptaa, IntBuffer pncc, float x, float y, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetSortedNeighborValues(Pix pixs, int x, int y, int conn, PointerByReference pneigh, IntBuffer pnvals) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixLocToColorTransform(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PixTiling pixTilingCreate(Pix pixs, int nx, int ny, int w, int h, int xoverlap, int yoverlap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pixTilingDestroy(PointerByReference ppt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTilingGetCount(PixTiling pt, IntBuffer pnx, IntBuffer pny) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTilingGetSize(PixTiling pt, IntBuffer pw, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixTilingGetTile(PixTiling pt, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTilingNoStripOnPaint(PixTiling pt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixTilingPaintTile(Pix pixd, int i, int j, Pix pixs, PixTiling pt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamPng(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderPng(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderPng(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemPng(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetPngResolution(FILE fp, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int isPngInterlaced(String filename, IntBuffer pinterlaced) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntBuffer ptransparency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntByReference ptransparency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWritePng(String filename, Pix pix, float gamma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamPng(FILE fp, Pix pix, float gamma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetZlibCompression(Pix pix, int compval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_pngSetReadStrip16To8(int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemPng(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemPng(PointerByReference pdata, NativeSizeByReference psize, Pix pix, float gamma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamPnm(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderPnm(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderPnm(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamPnm(FILE fp, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamAsciiPnm(FILE fp, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemPnm(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemPnm(ByteBuffer cdata, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemPnm(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectiveSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectiveSampled(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectivePta(Pix pixs, Pta ptad, Pta ptas, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjective(Pix pixs, FloatBuffer vc, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectivePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectiveColor(Pix pixs, FloatBuffer vc, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectivePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectiveGray(Pix pixs, FloatBuffer vc, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixProjectivePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getProjectiveXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int projectiveXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int projectiveXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFilesToPS(String dirin, String substr, int res, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayConvertFilesToPS(Sarray sa, int res, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFilesFittedToPS(String dirin, String substr, float xpts, float ypts, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayConvertFilesFittedToPS(Sarray sa, float xpts, float ypts, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int writeImageCompressedToPSFile(String filein, String fileout, int res, IntBuffer pfirstfile, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertSegmentedPagesToPS(String pagedir, String pagestr, int page_numpre, String maskdir, String maskstr, int mask_numpre, int numpost, int maxnum, float textscale, float imagescale, int threshold, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteSegmentedPageToPS(Pix pixs, Pix pixm, float textscale, float imagescale, int threshold, int pageno, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMixedToPS(Pix pixb, Pix pixc, float scale, int pageno, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertToPSEmbed(String filein, String fileout, int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaWriteCompressedToPS(Pixa pixa, String fileout, int res, int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWritePSEmbed(String filein, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamPS(FILE fp, Pix pix, Box box, int res, float scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pixWriteStringPS(Pix pixs, Box box, int res, float scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer generateUncompressedPS(ByteBuffer hexdata, int w, int h, int d, int psbpl, int bps, float xpt, float ypt, float wpt, float hpt, int boxflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getScaledParametersPS(Box box, int wpix, int hpix, int res, float scale, FloatBuffer pxpt, FloatBuffer pypt, FloatBuffer pwpt, FloatBuffer phpt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void convertByteToHexAscii(byte byteval, ByteBuffer pnib1, ByteBuffer pnib2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertJpegToPSEmbed(String filein, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertJpegToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertJpegToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer generateJpegPS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertG4ToPSEmbed(String filein, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertG4ToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int maskflag, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertG4ToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int maskflag, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer generateG4PS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int maskflag, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertTiffMultipageToPS(String filein, String fileout, String tempfile, float fillfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFlateToPSEmbed(String filein, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFlateToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertFlateToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer generateFlatePS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemPS(PointerByReference pdata, NativeSizeByReference psize, Pix pix, Box box, int res, float scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResLetterPage(int w, int h, float fillfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResA4Page(int w, int h, float fillfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_psWriteBoundingBox(int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaCreateFromNuma(Numa nax, Numa nay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ptaDestroy(PointerByReference ppta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaCopy(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaCopyRange(Pta ptas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaClone(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaEmpty(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaAddPt(Pta pta, float x, float y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaInsertPt(Pta pta, int index, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaRemovePt(Pta pta, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetRefcount(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaChangeRefcount(Pta pta, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetCount(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetPt(Pta pta, int index, FloatBuffer px, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetIPt(Pta pta, int index, IntBuffer px, IntBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaSetPt(Pta pta, int index, float x, float y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetArrays(Pta pta, PointerByReference pnax, PointerByReference pnay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaWrite(String filename, Pta pta, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaWriteStream(FILE fp, Pta pta, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ptaaDestroy(PointerByReference pptaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaAddPta(Ptaa ptaa, Pta pta, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaGetCount(Ptaa ptaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaaGetPta(Ptaa ptaa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaGetPt(Ptaa ptaa, int ipta, int jpt, FloatBuffer px, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaInitFull(Ptaa ptaa, Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaReplacePta(Ptaa ptaa, int index, Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaAddPt(Ptaa ptaa, int ipta, float x, float y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaTruncate(Ptaa ptaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaWrite(String filename, Ptaa ptaa, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaWriteStream(FILE fp, Ptaa ptaa, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaSubsample(Pta ptas, int subfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaJoin(Pta ptad, Pta ptas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaaJoin(Ptaa ptaad, Ptaa ptaas, int istart, int iend) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaReverse(Pta ptas, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaTranspose(Pta ptas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaCyclicPerm(Pta ptas, int xs, int ys) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaSort(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetSortIndex(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaSortByIndex(Pta ptas, Numa naindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaSortByIndex(Ptaa ptaas, Numa naindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaUnionByAset(Pta pta1, Pta pta2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaRemoveDupsByAset(Pta ptas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaIntersectionByAset(Pta pta1, Pta pta2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_asetCreateFromPta(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaUnionByHash(Pta pta1, Pta pta2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaRemoveDupsByHash(Pta ptas, PointerByReference pptad, PointerByReference pdahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaIntersectionByHash(Pta pta1, Pta pta2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaFindPtByHash(Pta pta, L_DnaHash dahash, int x, int y, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_DnaHash l_dnaHashCreateFromPta(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Box ptaGetBoundingRegion(Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetRange(Pta pta, FloatBuffer pminx, FloatBuffer pmaxx, FloatBuffer pminy, FloatBuffer pmaxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaGetInsideBox(Pta ptas, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixFindCornerPixels(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaContainsPt(Pta pta, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaTestIntersection(Pta pta1, Pta pta2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaTransform(Pta ptas, int shiftx, int shifty, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaPtInsidePolygon(Pta pta, float x, float y, IntBuffer pinside) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float l_angleBetweenVectors(float x1, float y1, float x2, float y2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetLinearLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetLinearLSF(Pta pta, FloatByReference pa, FloatByReference pb, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetQuadraticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetQuadraticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetCubicLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetCubicLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetQuarticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, FloatBuffer pe, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaGetQuarticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, FloatByReference pe, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pmederr, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pmederr, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pmederr, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pmederr, PointerByReference pnafit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int applyLinearFit(float a, float b, float x, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int applyQuadraticFit(float a, float b, float c, float x, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int applyCubicFit(float a, float b, float c, float d, float x, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int applyQuarticFit(float a, float b, float c, float d, float e, float x, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixPlotAlongPta(Pix pixs, Pta pta, int outformat, String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaGetPixelsFromPix(Pix pixs, Box box) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixGenerateFromPta(Pta pta, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaGetBoundaryPixels(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaGetBoundaryPixels(Pix pixs, int type, int connectivity, PointerByReference pboxa, PointerByReference ppixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ptaa ptaaIndexLabelledPixels(Pix pixs, IntBuffer pncc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaGetNeighborPixLocs(Pix pixs, int x, int y, int conn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayPta(Pix pixd, Pix pixs, Pta pta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayPtaaPattern(Pix pixd, Pix pixs, Ptaa ptaa, Pix pixp, int cx, int cy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayPtaPattern(Pix pixd, Pix pixs, Pta pta, Pix pixp, int cx, int cy, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaReplicatePattern(Pta ptas, Pix pixp, Pta ptap, int cx, int cy, int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayPtaa(Pix pixs, Ptaa ptaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Ptra ptraCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ptraDestroy(PointerByReference ppa, int freeflag, int warnflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraAdd(L_Ptra pa, Pointer item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraInsert(L_Ptra pa, int index, Pointer item, int shiftflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer ptraRemove(L_Ptra pa, int index, int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer ptraRemoveLast(L_Ptra pa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer ptraReplace(L_Ptra pa, int index, Pointer item, int freeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraSwap(L_Ptra pa, int index1, int index2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraCompactArray(L_Ptra pa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraReverse(L_Ptra pa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraJoin(L_Ptra pa1, L_Ptra pa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraGetMaxIndex(L_Ptra pa, IntBuffer pmaxindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraGetActualCount(L_Ptra pa, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer ptraGetPtrToItem(L_Ptra pa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Ptraa ptraaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ptraaDestroy(PointerByReference ppaa, int freeflag, int warnflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraaGetSize(L_Ptraa paa, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ptraaInsertPtra(L_Ptraa paa, int index, L_Ptra pa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Ptra ptraaGetPtra(L_Ptraa paa, int index, int accessflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Ptra ptraaFlattenToPtra(L_Ptraa paa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixQuadtreeMean(Pix pixs, int nlevels, Pix pix_ma, PointerByReference pfpixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixQuadtreeVariance(Pix pixs, int nlevels, Pix pix_ma, DPix dpix_msa, PointerByReference pfpixa_v, PointerByReference pfpixa_rv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixMeanInRectangle(Pix pixs, Box box, Pix pixma, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixVarianceInRectangle(Pix pixs, Box box, Pix pix_ma, DPix dpix_msa, FloatBuffer pvar, FloatBuffer prvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxaa boxaaQuadtreeRegions(int w, int h, int nlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int quadtreeGetParent(FPixa fpixa, int level, int x, int y, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int quadtreeGetChildren(FPixa fpixa, int level, int x, int y, FloatBuffer pval00, FloatBuffer pval10, FloatBuffer pval01, FloatBuffer pval11) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int quadtreeMaxLevels(int w, int h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix fpixaDisplayQuadtree(FPixa fpixa, int factor, String fontdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Queue lqueueCreate(int nalloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lqueueDestroy(PointerByReference plq, int freeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lqueueAdd(L_Queue lq, Pointer item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer lqueueRemove(L_Queue lq) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lqueueGetCount(L_Queue lq) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lqueuePrint(FILE fp, L_Queue lq) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankFilter(Pix pixs, int wf, int hf, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankFilterRGB(Pix pixs, int wf, int hf, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankFilterGray(Pix pixs, int wf, int hf, float rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixMedianFilter(Pix pixs, int wf, int hf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRankFilterWithScaling(Pix pixs, int wf, int hf, float rank, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_rbtreeCreate(int keytype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Rb_Type l_rbtreeLookup(L_Rbtree t, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_rbtreeInsert(L_Rbtree t, Rb_Type.ByValue key, Rb_Type.ByValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_rbtreeDelete(L_Rbtree t, Rb_Type.ByValue key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_rbtreeDestroy(PointerByReference pt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_rbtreeGetFirst(L_Rbtree t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_rbtreeGetNext(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_rbtreeGetLast(L_Rbtree t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree_Node l_rbtreeGetPrev(L_Rbtree_Node n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_rbtreeGetCount(L_Rbtree t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_rbtreePrint(FILE fp, L_Rbtree t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_compareKeys(int keytype, Rb_Type.ByValue left, Rb_Type.ByValue right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray pixProcessBarcodes(Pix pixs, int format, int method, PointerByReference psaw, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixExtractBarcodes(Pix pixs, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray pixReadBarcodes(Pixa pixa, int format, int method, PointerByReference psaw, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixReadBarcodeWidths(Pix pixs, int method, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa pixLocateBarcodes(Pix pixs, int thresh, PointerByReference ppixb, PointerByReference ppixm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDeskewBarcode(Pix pixs, Pix pixb, Box box, int margin, int threshold, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixExtractBarcodeWidths1(Pix pixs, float thresh, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatBuffer pwidth, PointerByReference pnac, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatByReference pwidth, PointerByReference pnac, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixExtractBarcodeCrossings(Pix pixs, float thresh, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaQuantizeCrossingsByWidth(Numa nas, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatBuffer pwidth, FloatBuffer pfirstloc, PointerByReference pnac, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatByReference pwidth, FloatByReference pfirstloc, PointerByReference pnac, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaReadFiles(String dirname, String substr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaReadFilesSA(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadWithHint(String filename, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadIndexed(Sarray sa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStream(FILE fp, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixReadHeader(String filename, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findFileFormat(String filename, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findFileFormatStream(FILE fp, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findFileFormatBuffer(ByteBuffer buf, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileFormatIsTiff(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMem(ByteBuffer data, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixReadHeaderMem(ByteBuffer data, NativeSize size, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int ioFormatTest(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogaCreateFromRecog(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogaCreateFromPixaa(Pixaa paa, int scalew, int scaleh, int templ_type, int threshold, int maxyshift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void recogaDestroy(PointerByReference precoga) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaAddRecog(L_Recoga recoga, L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogReplaceInRecoga(PointerByReference precog1, L_Recog recog2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogaGetRecog(L_Recoga recoga, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaGetCount(L_Recoga recoga) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogGetCount(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogGetIndex(L_Recog recog, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogGetParent(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSetBootflag(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogCreateFromRecog(L_Recog recs, int scalew, int scaleh, int templ_type, int threshold, int maxyshift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogCreateFromPixa(Pixa pixa, int scalew, int scaleh, int templ_type, int threshold, int maxyshift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogCreate(int scalew, int scaleh, int templ_type, int threshold, int maxyshift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void recogDestroy(PointerByReference precog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogAppend(L_Recog recog1, L_Recog recog2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogGetClassIndex(L_Recog recog, int val, ByteBuffer text, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogStringToIndex(L_Recog recog, ByteBuffer text, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogGetClassString(L_Recog recog, int index, PointerByReference pcharstr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_convertCharstrToInt(String str, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recoga recogaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaWrite(String filename, L_Recoga recoga) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaWriteStream(FILE fp, L_Recoga recoga, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaWritePixaa(String filename, L_Recoga recoga) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Recog recogReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogWrite(String filename, L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogWriteStream(FILE fp, L_Recog recog, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogWritePixa(String filename, L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogDecode(L_Recog recog, Pix pixs, int nlevels, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogMakeDecodingArrays(L_Recog recog, Pix pixs, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogRunViterbi(L_Recog recog, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogCreateDid(L_Recog recog, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogDestroyDid(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogDidExists(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rdid recogGetDid(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSetChannelParams(L_Recog recog, int nlevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaIdentifyMultiple(L_Recoga recoga, Pix pixs, int nitems, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdb, int debugsplit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSplitIntoCharacters(L_Recog recog, Pix pixs, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference pnaid, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogCorrelationBestRow(L_Recog recog, Pix pixs, PointerByReference pboxa, PointerByReference pnascore, PointerByReference pnaindex, PointerByReference psachar, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatBuffer pscore, IntBuffer pindex, PointerByReference pcharstr, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatByReference pscore, IntByReference pindex, PointerByReference pcharstr, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaIdentifyPixa(L_Recoga recoga, Pixa pixa, Numa naid, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogIdentifyPixa(L_Recog recog, Pixa pixa, Numa naid, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogIdentifyPix(L_Recog recog, Pix pixs, PointerByReference ppixdb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSkipIdentify(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rchaDestroy(PointerByReference prcha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rchDestroy(PointerByReference prch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int rchaExtract(L_Rcha rcha, PointerByReference pnaindex, PointerByReference pnascore, PointerByReference psatext, PointerByReference pnasample, PointerByReference pnaxloc, PointerByReference pnayloc, PointerByReference pnawidth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int rchExtract(L_Rch rch, IntBuffer pindex, FloatBuffer pscore, PointerByReference ptext, IntBuffer psample, IntBuffer pxloc, IntBuffer pyloc, IntBuffer pwidth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix recogProcessToIdentify(L_Recog recog, Pix pixs, int pad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix recogPreSplittingFilter(L_Recog recog, Pix pixs, float maxasp, float minaf, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSplittingFilter(L_Recog recog, Pix pixs, float maxasp, float minaf, IntBuffer premove, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray recogaExtractNumbers(L_Recoga recoga, Boxa boxas, float scorethresh, int spacethresh, PointerByReference pbaa, PointerByReference pnaa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSetTemplateType(L_Recog recog, int templ_type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSetScaling(L_Recog recog, int scalew, int scaleh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogTrainLabelled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, int multflag, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogProcessMultLabelled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppixa, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogProcessMultLabelled(L_Recog recog, Pix pixs, Box box, Pointer text, PointerByReference ppixa, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogProcessSingleLabelled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogProcessSingleLabelled(L_Recog recog, Pix pixs, Box box, Pointer text, PointerByReference ppixa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogAddSamples(L_Recog recog, Pixa pixa, int classindex, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix recogScaleCharacter(L_Recog recog, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogAverageSamples(L_Recog recog, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatBuffer px, FloatBuffer py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatByReference px, FloatByReference py) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogTrainingFinished(L_Recog recog, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogRemoveOutliers(L_Recog recog, float targetscore, float minfract, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaTrainingDone(L_Recoga recoga, IntBuffer pdone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaFinishAveraging(L_Recoga recoga) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogTrainUnlabelled(L_Recog recog, L_Recog recogboot, Pix pixs, Box box, int singlechar, float minscore, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogPadTrainingSet(PointerByReference precog, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogBestCorrelForPadding(L_Recog recog, L_Recoga recoga, PointerByReference pnaset, PointerByReference pnaindex, PointerByReference pnascore, PointerByReference pnasum, Pixa pixadb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogCorrelAverages(L_Recog recog1, L_Recog recog2, PointerByReference pnaindex, PointerByReference pnascore, Pixa pixadb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSetPadParams(L_Recog recog, String bootdir, String bootpattern, String bootpath, int boot_iters, int type, int min_nopad, int max_afterpad, int min_samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogaShowContent(FILE fp, L_Recoga recoga, int display) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogShowContent(FILE fp, L_Recog recog, int display) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogDebugAverages(L_Recog recog, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogShowAverageTemplates(L_Recog recog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogShowMatchesInRange(L_Recog recog, Pixa pixa, float minscore, float maxscore, int display) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix recogShowMatch(L_Recog recog, Pix pix1, Pix pix2, Box box, int index, float score) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogResetBmf(L_Recog recog, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestSetup(int argc, PointerByReference argv, PointerByReference prp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCleanup(L_RegParams rp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCompareValues(L_RegParams rp, float val1, float val2, float delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCompareStrings(L_RegParams rp, ByteBuffer string1, NativeSize bytes1, ByteBuffer string2, NativeSize bytes2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestComparePix(L_RegParams rp, Pix pix1, Pix pix2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCompareSimilarPix(L_RegParams rp, Pix pix1, Pix pix2, int mindiff, float maxfract, int printstats) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCheckFile(L_RegParams rp, String localname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestCompareFiles(L_RegParams rp, int index1, int index2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int regTestWritePixAndCheck(L_RegParams rp, Pix pix, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRasterop(Pix pixd, int dx, int dy, int dw, int dh, int op, Pix pixs, int sx, int sy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRasteropVip(Pix pixd, int bx, int bw, int vshift, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRasteropHip(Pix pixd, int by, int bh, int hshift, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixTranslate(Pix pixd, Pix pixs, int hshift, int vshift, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRasteropIP(Pix pixd, int hshift, int vshift, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRasteropFullImage(Pix pixd, Pix pixs, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rasteropVipLow(IntBuffer data, int pixw, int pixh, int depth, int wpl, int x, int w, int shift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rasteropHipLow(IntBuffer data, int pixh, int depth, int wpl, int y, int h, int shift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void shiftDataHorizontalLow(IntBuffer datad, int wpld, IntBuffer datas, int wpls, int shift) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rasteropUniLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rasteropLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op, IntBuffer datas, int spixw, int spixh, int swpl, int sx, int sy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotate(Pix pixs, float angle, int type, int incolor, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixEmbedForRotation(Pix pixs, float angle, int incolor, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateBySampling(Pix pixs, int xcen, int ycen, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateBinaryNice(Pix pixs, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateWithAlpha(Pix pixs, float angle, Pix pixg, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAM(Pix pixs, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMColor(Pix pixs, float angle, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMGray(Pix pixs, float angle, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMCorner(Pix pixs, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMColorCorner(Pix pixs, float angle, int fillval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMGrayCorner(Pix pixs, float angle, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateAMColorFast(Pix pixs, float angle, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rotateAMColorLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rotateAMGrayLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rotateAMColorCornerLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rotateAMGrayCornerLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, byte grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rotateAMColorFastLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateOrth(Pix pixs, int quads) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotate180(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotate90(Pix pixs, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFlipLR(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFlipTB(Pix pixd, Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateShear(Pix pixs, int xcen, int ycen, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotate2Shear(Pix pixs, int xcen, int ycen, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotate3Shear(Pix pixs, int xcen, int ycen, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRotateShearIP(Pix pixs, int xcen, int ycen, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRotateShearCenter(Pix pixs, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixRotateShearCenterIP(Pix pixs, float angle, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixStrokeWidthTransform(Pix pixs, int color, int depth, int nangles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRunlengthTransform(Pix pixs, int color, int direction, int depth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindHorizontalRuns(Pix pix, int y, IntBuffer xstart, IntBuffer xend, IntBuffer pn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindVerticalRuns(Pix pix, int x, IntBuffer ystart, IntBuffer yend, IntBuffer pn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixFindMaxRuns(Pix pix, int direction, PointerByReference pnastart) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindMaxHorizontalRunOnLine(Pix pix, int y, IntBuffer pxstart, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindMaxVerticalRunOnLine(Pix pix, int x, IntBuffer pystart, IntBuffer psize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int runlengthMembershipOnLine(IntBuffer buffer, int size, int depth, IntBuffer start, IntBuffer end, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeMSBitLocTab(int bitval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCreateInitialized(int n, ByteBuffer initstr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCreateWordsFromString(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCreateLinesFromString(String string, int blankflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sarrayDestroy(PointerByReference psa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCopy(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayClone(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayAddString(Sarray sa, ByteBuffer string, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer sarrayRemoveString(Sarray sa, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayReplaceString(Sarray sa, int index, ByteBuffer newstr, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayClear(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayGetCount(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference sarrayGetArray(Sarray sa, IntBuffer pnalloc, IntBuffer pn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer sarrayGetString(Sarray sa, int index, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayGetRefcount(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayChangeRefcount(Sarray sa, int delta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer sarrayToString(Sarray sa, int addnlflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer sarrayToStringRange(Sarray sa, int first, int nstrings, int addnlflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayJoin(Sarray sa1, Sarray sa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayAppendRange(Sarray sa1, Sarray sa2, int start, int end) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayPadToSameSize(Sarray sa1, Sarray sa2, ByteBuffer padstring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayConvertWordsToLines(Sarray sa, int linesize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarraySplitString(Sarray sa, String str, String separators) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarraySelectBySubstring(Sarray sain, String substr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarraySelectByRange(Sarray sain, int first, int last) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayParseRange(Sarray sa, int start, IntBuffer pactualstart, IntBuffer pend, IntBuffer pnewstart, String substr, int loc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarraySort(Sarray saout, Sarray sain, int sortorder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarraySortByIndex(Sarray sain, Numa naindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringCompareLexical(String str1, String str2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayUnionByAset(Sarray sa1, Sarray sa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayRemoveDupsByAset(Sarray sas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayIntersectionByAset(Sarray sa1, Sarray sa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Rbtree l_asetCreateFromSarray(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayRemoveDupsByHash(Sarray sas, PointerByReference psad, PointerByReference pdahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayIntersectionByHash(Sarray sa1, Sarray sa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayFindStringByHash(Sarray sa, L_DnaHash dahash, String str, IntBuffer pindex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_DnaHash l_dnaHashCreateFromSarray(Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayWrite(String filename, Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayWriteStream(FILE fp, Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayAppend(String filename, Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray getNumberedPathnamesInDirectory(String dirname, String substr, int numpre, int numpost, int maxnum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray getSortedPathnamesInDirectory(String dirname, String substr, int first, int nfiles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray convertSortedToNumberedPathnames(Sarray sa, int numpre, int numpost, int maxnum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray getFilenamesInDirectory(String dirname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScale(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToSize(Pix pixs, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGeneral(Pix pixs, float scalex, float scaley, float sharpfract, int sharpwidth) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleColorLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleColor2xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleColor4xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray2xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray4xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleBySampling(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleBySamplingToSize(Pix pixs, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleByIntSampling(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleRGBToGrayFast(Pix pixs, int factor, int color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleRGBToBinaryFast(Pix pixs, int factor, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayToBinaryFast(Pix pixs, int factor, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleSmooth(Pix pix, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleRGBToGray2(Pix pixs, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleAreaMap(Pix pix, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleAreaMap2(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleBinary(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGrayFast(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray2(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray3(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray4(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray6(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray8(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGray16(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleToGrayMipmap(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleMipmap(Pix pixs1, Pix pixs2, float scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExpandReplicate(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray2xLIThresh(Pix pixs, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray2xLIDither(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray4xLIThresh(Pix pixs, int thresh) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGray4xLIDither(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayMinMax(Pix pixs, int xfact, int yfact, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayMinMax2(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayRankCascade(Pix pixs, int level1, int level2, int level3, int level4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleGrayRank2(Pix pixs, int rank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixScaleAndTransferAlpha(Pix pixd, Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixScaleWithAlpha(Pix pixs, float scalex, float scaley, Pix pixg, float fract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleColorLILow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGrayLILow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleColor2xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleColor2xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGray2xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGray2xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGray4xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGray4xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int scaleBySamplingLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int d, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int scaleSmoothLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int d, int wpls, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleRGBToGray2Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleColorAreaMapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleGrayAreaMapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleAreaMapLow2(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int d, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int scaleBinaryLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray2Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeSumTabSG2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeValTabSG2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray3Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeSumTabSG3() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeValTabSG3() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray4Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference makeSumTabSG4() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeValTabSG4() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray6Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeValTabSG6() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray8Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer makeValTabSG8() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray16Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int scaleMipmapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas1, int wpls1, IntBuffer datas2, int wpls2, float red) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSeedfillBinary(Pix pixd, Pix pixs, Pix pixm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSeedfillBinaryRestricted(Pix pixd, Pix pixs, Pix pixm, int connectivity, int xmax, int ymax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHolesByFilling(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFillClosedBorders(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixExtractBorderConnComps(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveBorderConnComps(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFillBgFromBorder(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFillHolesToBoundingRect(Pix pixs, int minsize, float maxhfract, float minfgfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfillGray(Pix pixs, Pix pixm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfillGrayInv(Pix pixs, Pix pixm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfillGraySimple(Pix pixs, Pix pixm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSeedfillGrayInvSimple(Pix pixs, Pix pixm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSeedfillGrayBasin(Pix pixb, Pix pixm, int delta, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDistanceFunction(Pix pixs, int connectivity, int outdepth, int boundcond) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSeedspread(Pix pixs, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixLocalExtrema(Pix pixs, int maxmin, int minmax, PointerByReference ppixmin, PointerByReference ppixmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSelectedLocalExtrema(Pix pixs, int mindist, PointerByReference ppixmin, PointerByReference ppixmax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFindEqualValues(Pix pixs1, Pix pixs2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSelectMinInConnComp(Pix pixs, Pix pixm, PointerByReference ppta, PointerByReference pnav) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRemoveSeededComponents(Pix pixd, Pix pixs, Pix pixm, int connectivity, int bordersize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedfillBinaryLow(IntBuffer datas, int hs, int wpls, IntBuffer datam, int hm, int wplm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedfillGrayLow(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedfillGrayInvLow(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedfillGrayLowSimple(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedfillGrayInvLowSimple(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void distanceFunctionLow(IntBuffer datad, int w, int h, int d, int wpld, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void seedspreadLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datat, int wplt, int connectivity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selaDestroy(PointerByReference psela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreate(int height, int width, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selDestroy(PointerByReference psel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCopy(Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateBrick(int h, int w, int cy, int cx, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateComb(int factor1, int factor2, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PointerByReference create2dIntArray(int sy, int sx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selaAddSel(Sela sela, Pointer sel, String selname, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selaGetCount(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selaGetSel(Sela sela, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer selGetName(Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selSetName(Pointer sel, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selaFindSelByName(Sela sela, String name, IntBuffer pindex, PointerByReference psel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selGetElement(Pointer sel, int row, int col, IntBuffer ptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selSetElement(Pointer sel, int row, int col, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selGetParameters(Pointer sel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selSetOrigin(Pointer sel, int cy, int cx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selGetTypeAtOrigin(Pointer sel, IntBuffer ptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer selaGetBrickName(Sela sela, int hsize, int vsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer selaGetCombName(Sela sela, int size, int direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getCompositeParameters(int size, IntBuffer psize1, IntBuffer psize2, PointerByReference pnameh1, PointerByReference pnameh2, PointerByReference pnamev1, PointerByReference pnamev2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray selaGetSelnames(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selFindMaxTranslations(Pointer sel, IntBuffer pxp, IntBuffer pyp, IntBuffer pxn, IntBuffer pyn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selRotateOrth(Pointer sel, int quads) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaRead(String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selRead(String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selReadStream(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selaWrite(String fname, Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selaWriteStream(FILE fp, Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selWrite(String fname, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int selWriteStream(FILE fp, Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateFromString(String text, int h, int w, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer selPrintToString(Pointer sel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaCreateFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateFromPta(Pta pta, int cy, int cx, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateFromPix(Pix pix, int cy, int cx, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selReadFromColorImage(String pathname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector selCreateFromColorPix(Pix pixs, ByteBuffer selname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix selDisplayInPix(Pointer sel, int size, int gthick) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix selaDisplayInPix(Sela sela, int size, int gthick, int spacing, int ncols) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddBasic(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddHitMiss(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddDwaLinear(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddDwaCombs(Sela sela) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddCrossJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sela selaAddTJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector pixGenerateSelWithRuns(Pix pixs, int nhlines, int nvlines, int distance, int minlength, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector pixGenerateSelRandom(Pix pixs, float hitfract, float missfract, int distance, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Selector pixGenerateSelBoundary(Pix pixs, int hitdist, int missdist, int hitskip, int missskip, int topflag, int botflag, int leftflag, int rightflag, PointerByReference ppixe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetRunCentersOnLine(Pix pixs, int x, int y, int minlength) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa pixGetRunsOnLine(Pix pixs, int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta pixSubsampleBoundaryPixels(Pix pixs, int skip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int adjacentOnPixelInRaster(Pix pixs, int x, int y, IntBuffer pxa, IntBuffer pya) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDisplayHitMissSel(Pix pixs, Pointer sel, int scalefactor, int hitcolor, int misscolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHShear(Pix pixd, Pix pixs, int yloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixVShear(Pix pixd, Pix pixs, int xloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHShearCorner(Pix pixd, Pix pixs, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixVShearCorner(Pix pixd, Pix pixs, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHShearCenter(Pix pixd, Pix pixs, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixVShearCenter(Pix pixd, Pix pixs, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixHShearIP(Pix pixs, int yloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixVShearIP(Pix pixs, int xloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixHShearLI(Pix pixs, int yloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixVShearLI(Pix pixs, int xloc, float radang, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDeskew(Pix pixs, int redsearch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixFindSkewAndDeskew(Pix pixs, int redsearch, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDeskewGeneral(Pix pixs, int redsweep, float sweeprange, float sweepdelta, int redsearch, int thresh, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkew(Pix pixs, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkewSweep(Pix pixs, FloatBuffer pangle, int reduction, float sweeprange, float sweepdelta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkewSweepAndSearch(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkewSweepAndSearchScore(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkewSweepAndSearchScorePivot(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta, int pivot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindSkewOrthogonalRange(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, float confprior) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindDifferentialSquareSum(Pix pixs, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFindNormalizedSquareSum(Pix pixs, FloatBuffer phratio, FloatBuffer pvratio, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamSpix(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderSpix(String filename, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderSpix(FILE fp, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sreadHeaderSpix(IntBuffer data, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamSpix(FILE fp, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemSpix(ByteBuffer data, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemSpix(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSerializeToMemory(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixDeserializeFromMemory(IntBuffer data, NativeSize nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Stack lstackCreate(int nalloc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lstackDestroy(PointerByReference plstack, int freeflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lstackAdd(L_Stack lstack, Pointer item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer lstackRemove(L_Stack lstack) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lstackGetCount(L_Stack lstack) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lstackPrint(FILE fp, L_Stack lstack) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_StrCode strcodeCreate(int fileno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int strcodeCreateFromFile(String filein, int fileno, String outdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int strcodeGenerate(L_StrCode strcode, String filein, String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int strcodeFinalize(PointerByReference pstrcode, String outdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int strcodeFinalize(PointerByReference pstrcode, Pointer outdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_getStructnameFromFile(String filename, PointerByReference psn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference sudokuReadFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IntByReference sudokuReadString(String str) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Sudoku sudokuCreate(IntBuffer array) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sudokuDestroy(PointerByReference psud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sudokuSolve(L_Sudoku sud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sudokuTestUniqueness(IntBuffer array, IntBuffer punique) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Sudoku sudokuGenerate(IntBuffer array, int seed, int minelems, int maxtries) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sudokuOutput(L_Sudoku sud, int arraytype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddSingleTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int location, IntBuffer poverflow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixAddTextlines(Pix pixs, L_Bmf bmf, String textstr, int val, int location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, int wtext, int firstindent, IntBuffer poverflow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSetTextline(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, IntBuffer pwidth, IntBuffer poverflow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaAddTextNumber(Pixa pixas, L_Bmf bmf, Numa na, int val, int location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaAddTextlines(Pixa pixas, L_Bmf bmf, Sarray sa, int val, int location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaAddPixWithText(Pixa pixa, Pix pixs, int reduction, L_Bmf bmf, String textstr, int val, int location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray bmfGetLineStrings(L_Bmf bmf, String textstr, int maxw, int firstindent, IntBuffer ph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa bmfGetWordWidths(L_Bmf bmf, String textstr, Sarray sa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bmfGetStringWidth(L_Bmf bmf, String textstr, IntBuffer pw) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray splitStringToParagraphs(ByteBuffer textstr, int splitflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadTiff(String filename, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamTiff(FILE fp, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteTiff(String filename, Pix pix, int comptype, String modestring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteTiffCustom(String filename, Pix pix, int comptype, String modestring, Numa natags, Sarray savals, Sarray satypes, Numa nasizes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamTiff(FILE fp, Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaReadMultipageTiff(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int writeMultipageTiff(String dirin, String substr, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int writeMultipageTiffSA(Sarray sa, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fprintTiffInfo(FILE fpout, String tiffile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int tiffGetCount(FILE fp, IntBuffer pn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTiffResolution(FILE fp, IntBuffer pxres, IntBuffer pyres) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderTiff(String filename, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int freadHeaderTiff(FILE fp, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemTiff(ByteBuffer cdata, NativeSize size, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findTiffCompression(FILE fp, IntBuffer pcomptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int extractG4DataFromFile(String filein, PointerByReference pdata, NativeSizeByReference pnbytes, IntBuffer pw, IntBuffer ph, IntBuffer pminisblack) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemTiff(ByteBuffer cdata, NativeSize size, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemTiff(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemTiffCustom(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype, Numa natags, Sarray savals, Sarray satypes, Numa nasizes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int setMsgSeverity(int newsev) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int returnErrorInt(String msg, String procname, int ival) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float returnErrorFloat(String msg, String procname, float fval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer returnErrorPtr(String msg, String procname, Pointer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringNew(String src) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringCopy(ByteBuffer dest, String src, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringReplace(PointerByReference pdest, String src) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringLength(String src, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringCat(ByteBuffer dest, NativeSize size, String src) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringConcatNew(String first, PointerByReference varArgs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringJoin(String src1, String src2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringJoinIP(PointerByReference psrc1, String src2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringReverse(String src) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer strtokSafe(ByteBuffer cstr, String seps, PointerByReference psaveptr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringSplitOnToken(ByteBuffer cstr, String seps, PointerByReference phead, PointerByReference ptail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringRemoveChars(String src, String remchars) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringFindSubstr(String src, String sub, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringReplaceSubstr(String src, String sub1, String sub2, IntBuffer pfound, IntBuffer ploc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer stringReplaceEachSubstr(String src, String sub1, String sub2, IntBuffer pcount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dna arrayFindEachSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int arrayFindSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen, IntBuffer poffset, IntBuffer pfound) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer reallocNew(PointerByReference pindata, int oldsize, int newsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_binaryRead(String filename, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_binaryReadStream(FILE fp, NativeSizeByReference pnbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_binaryReadSelect(String filename, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_binaryReadSelectStream(FILE fp, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_binaryWrite(String filename, String operation, Pointer data, NativeSize nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NativeSize nbytesInFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NativeSize fnbytesInFile(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_binaryCopy(ByteBuffer datas, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileCopy(String srcfile, String newfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileConcatenate(String srcfile, String destfile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileAppendString(String filename, String str) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int filesAreIdentical(String fname1, String fname2, IntBuffer psame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public short convertOnLittleEnd16(short shortin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public short convertOnBigEnd16(short shortin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertOnLittleEnd32(int wordin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertOnBigEnd32(int wordin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FILE fopenReadStream(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FILE fopenWriteStream(String filename, String modestring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FILE lept_fopen(String filename, String mode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_fclose(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer lept_calloc(NativeSize nmemb, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lept_free(Pointer ptr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_mkdir(String subdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_rmdir(String subdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lept_direxists(String dir, IntBuffer pexists) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_rm_match(String subdir, String substr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_rm(String subdir, String tail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_rmfile(String filepath) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_mv(String srcfile, String newdir, String newtail, PointerByReference pnewpath) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_cp(String srcfile, String newdir, String newtail, PointerByReference pnewpath) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int splitPathAtDirectory(String pathname, PointerByReference pdir, PointerByReference ptail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int splitPathAtExtension(String pathname, PointerByReference pbasename, PointerByReference pextension) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer pathJoin(String dir, String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer appendSubdirs(String basedir, String subdirs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertSepCharsInPath(ByteBuffer path, int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer genPathname(String dir, String fname) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int makeTempDirname(ByteBuffer result, NativeSize nbytes, String subdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int modifyTrailingSlash(ByteBuffer path, NativeSize nbytes, int flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer genTempFilename(String dir, String tail, int usetime, int usepid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int extractNumberFromFilename(String fname, int numpre, int numpost) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileCorruptByDeletion(String filein, float loc, float size, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int fileCorruptByMutation(String filein, float loc, float size, String fileout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int genRandomIntegerInRange(int range, int seed, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_roundftoi(float fval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_hashStringToUint64(String str, LongBuffer phash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_hashPtToUint64(int x, int y, LongBuffer phash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_hashPtToUint64Fast(int nbuckets, int x, int y, LongBuffer phash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_hashFloat64ToUint64(int nbuckets, double val, LongBuffer phash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findNextLargerPrime(int start, IntBuffer pprime) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lept_isPrime(long n, IntBuffer pis_prime, IntBuffer pfactor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertBinaryToGrayCode(int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertGrayCodeToBinary(int val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer getLeptonicaVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void startTimer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float stopTimer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer startTimerNested() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float stopTimerNested(Pointer rusage_start) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_getCurrentTime(IntBuffer sec, IntBuffer usec) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_WallTimer startWallTimer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float stopWallTimer(PointerByReference ptimer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_getFormattedDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixHtmlViewer(String dirin, String dirout, String rootname, int thumbwidth, int viewwidth, int copyorig) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixSimpleCaptcha(Pix pixs, int border, int nterms, int seed, int color, int cmapflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixRandomHarmonicWarp(Pix pixs, float xmag, float ymag, float xfreq, float yfreq, int nx, int ny, int seed, int grayval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixWarpStereoscopic(Pix pixs, int zbend, int zshiftt, int zshiftb, int ybendt, int ybendb, int redleft) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixStretchHorizontal(Pix pixs, int dir, int type, int hmax, int operation, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixStretchHorizontalSampled(Pix pixs, int dir, int type, int hmax, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixStretchHorizontalLI(Pix pixs, int dir, int type, int hmax, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixQuadraticVShear(Pix pixs, int dir, int vmaxt, int vmaxb, int operation, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixQuadraticVShearSampled(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixQuadraticVShearLI(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixStereoFromPair(Pix pix1, Pix pix2, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_WShed wshedCreate(Pix pixs, Pix pixm, int mindepth, int debugflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void wshedDestroy(PointerByReference pwshed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int wshedApply(L_WShed wshed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int wshedBasins(L_WShed wshed, PointerByReference ppixa, PointerByReference pnalevels) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix wshedRenderFill(L_WShed wshed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix wshedRenderColors(L_WShed wshed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadStreamWebP(FILE fp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemWebP(ByteBuffer filedata, NativeSize filesize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderWebP(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemWebP(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteWebP(String filename, Pix pixs, int quality, int lossless) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStreamWebP(FILE fp, Pix pixs, int quality, int lossless) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemWebP(PointerByReference pencdata, NativeSizeByReference pencsize, Pix pixs, int quality, int lossless) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaWriteFiles(String rootname, Pixa pixa, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWrite(String filename, Pix pix, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteAutoFormat(String filename, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteStream(FILE fp, Pix pix, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteImpliedFormat(String filename, Pix pix, int quality, int progressive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteTempfile(String dir, String tail, Pix pix, int format, PointerByReference pfilename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixChooseOutputFormat(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getImpliedFileFormat(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixGetAutoFormat(Pix pix, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer getFormatExtension(int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDisplay(Pix pixs, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDisplayWithTitle(Pix pixs, int x, int y, String title, int dispflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDisplayMultiple(String filepattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDisplayWrite(Pix pixs, int reduction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixDisplayWriteFormat(Pix pixs, int reduction, int format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSaveTiled(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int dp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSaveTiledOutline(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int linewidth, int dp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixSaveTiledWithText(Pix pixs, Pixa pixa, int outwidth, int newrow, int space, int linewidth, L_Bmf bmf, String textstr, int val, int location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void l_chooseDisplayProg(int selection) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer zlibCompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer zlibUncompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HBITMAP pixGetWindowsHBITMAP(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
}
