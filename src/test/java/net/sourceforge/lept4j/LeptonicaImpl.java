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
    public net.sourceforge.lept4j.ByteBuffer bbufferCreate(ByteBuffer indata, int nalloc) {
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
    public int bbufferRead(net.sourceforge.lept4j.ByteBuffer bb, ByteBuffer src, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferExtendArray(net.sourceforge.lept4j.ByteBuffer bb, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferWrite(net.sourceforge.lept4j.ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout) {
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
    public L_Bmf bmfCreate(String dir, int size) {
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
    public Pixa pixaGetFont(String dir, int size, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixaSaveFont(String indir, String outdir, int size) {
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
    public Pix pixReadMemBmp(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemBmp(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pointer l_bootnum_gen() {
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
    public int boxaaWrite(String filename, Boxaa baa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaRead(String filename) {
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
    public int boxaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxa boxa) {
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
    public int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debugflag, IntBuffer psimilar) {
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
    public int boxaPlotSides(Boxa boxa, String plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, int outformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boxa boxaFillSequence(Boxa boxas, int useflag, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int boxaPlotSides(Boxa boxa, Pointer plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, int outformat) {
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
    public CCBorda ccbaRead(String filename) {
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
    public int pixcmapWrite(String filename, PixColormap cmap) {
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
    public Pix pixOctcubeQuantFromCmapLUT(Pix pixs, PixColormap cmap, int mindepth, IntBuffer cmaptab, IntBuffer rtab, IntBuffer gtab, IntBuffer btab) {
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
    public int dewarpWrite(String filename, L_Dewarp dew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dewarpa dewarpaRead(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaWrite(String filename, L_Dewarpa dewa) {
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
    public int dewarpaModelStats(L_Dewarpa dewa, IntBuffer pnnone, IntBuffer pnvsuccess, IntBuffer pnvvalid, IntBuffer pnhsuccess, IntBuffer pnhvalid, IntBuffer pnref) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpaShowArrays(L_Dewarpa dewa, float scalefact, int first, int last, String fontdir) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpDebug(L_Dewarp dew, String subdir, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dewarpShowResults(L_Dewarpa dewa, Sarray sa, Boxa boxa, int firstpage, int lastpage, String fontdir, String pdfout) {
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
    public int l_dnaWrite(String filename, L_Dna da) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L_Dnaa l_dnaaCreate(int n) {
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
    public int l_dnaaWrite(String filename, L_Dnaa daa) {
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
    public Pix pixReadMemGif(ByteBuffer cdata, NativeSize size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemGif(PointerByReference pdata, NativeSizeByReference psize, Pix pix) {
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
    public int readHeaderMemJp2k(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadJp2k(String filename, int reduction, Box box, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemJp2k(ByteBuffer data, NativeSize size, int reduction, Box box, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteMemJp2k(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int nlevels, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadJpeg(String filename, int cmflag, int reduction, IntBuffer pnwarn, int hint) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderJpeg(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteJpeg(String filename, Pix pix, int quality, int progressive) {
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
    public int kernelWrite(String fname, L_Kernel kel) {
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
    public int numaWrite(String filename, Numa na) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaCreate(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numaa numaaCreateFull(int ntop, int n) {
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
    public int numaaExtendArray(Numaa naa) {
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
    public int numaaWrite(String filename, Numaa naa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa2d numa2dCreate(int nrows, int ncols, int initsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void numa2dDestroy(PointerByReference pna2d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numa2dAddNumber(Numa2d na2d, int row, int col, float val) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numa2dGetCount(Numa2d na2d, int row, int col) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numa2dGetNuma(Numa2d na2d, int row, int col) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numa2dGetFValue(Numa2d na2d, int row, int col, int index, FloatBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numa2dGetIValue(Numa2d na2d, int row, int col, int index, IntBuffer pval) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NumaHash numaHashCreate(int nbuckets, int initsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void numaHashDestroy(PointerByReference pnahash) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Numa numaHashGetNuma(NumaHash nahash, int key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numaHashAdd(NumaHash nahash, int key, float value) {
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
    public int numaEarthMoverDistance(Numa na1, Numa na2, FloatBuffer pdist) {
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
    public int pixReadHeader(String filename, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findFileFormat(String filename, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int findFileFormatBuffer(ByteBuffer buf, IntBuffer pformat) {
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
    public Pix pixDeskew(Pix pixs, int redsearch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixFindSkewAndDeskew(Pix pixs, int redsearch, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixDeskewGeneral(Pix pixs, int redsweep, float sweeprange, float sweepdelta, int redsearch, int thresh, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkew(Pix pixs, FloatBuffer pangle, FloatBuffer pconf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkewSweep(Pix pixs, FloatBuffer pangle, int reduction, float sweeprange, float sweepdelta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkewSweepAndSearch(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkewSweepAndSearchScore(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkewSweepAndSearchScorePivot(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta, int pivot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindSkewOrthogonalRange(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, float confprior) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindDifferentialSquareSum(Pix pixs, FloatBuffer psum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixFindNormalizedSquareSum(Pix pixs, FloatBuffer phratio, FloatBuffer pvratio, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScale(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToSize(Pix pixs, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGeneral(Pix pixs, float scalex, float scaley, float sharpfract, int sharpwidth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleColorLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleColor2xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleColor4xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayLI(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray2xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray4xLI(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleBySampling(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleBySamplingToSize(Pix pixs, int wd, int hd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleByIntSampling(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleRGBToGrayFast(Pix pixs, int factor, int color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleRGBToBinaryFast(Pix pixs, int factor, int thresh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayToBinaryFast(Pix pixs, int factor, int thresh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleSmooth(Pix pix, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleRGBToGray2(Pix pixs, float rwt, float gwt, float bwt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleAreaMap(Pix pix, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleAreaMap2(Pix pix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleBinary(Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGrayFast(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray2(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray3(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray4(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray6(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray8(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGray16(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleToGrayMipmap(Pix pixs, float scalefactor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleMipmap(Pix pixs1, Pix pixs2, float scale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixExpandReplicate(Pix pixs, int factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray2xLIThresh(Pix pixs, int thresh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray2xLIDither(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray4xLIThresh(Pix pixs, int thresh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGray4xLIDither(Pix pixs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayMinMax(Pix pixs, int xfact, int yfact, int type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayMinMax2(Pix pixs, int type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayRankCascade(Pix pixs, int level1, int level2, int level3, int level4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleGrayRank2(Pix pixs, int rank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pixScaleAndTransferAlpha(Pix pixd, Pix pixs, float scalex, float scaley) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pix pixScaleWithAlpha(Pix pixs, float scalex, float scaley, Pix pixg, float fract) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
