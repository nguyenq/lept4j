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
    public int bbufferExtendArray(L_ByteBuffer bb, int nbytes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int bbufferWrite(L_ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout) {
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
    public int pixcmapWrite(String filename, PixColormap cmap) {
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
    public L_Dnaa l_dnaaCreateFull(int nptr, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int l_dnaaTruncate(L_Dnaa daa) {
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
    public Pta generatePtaGrid(int w, int h, int nx, int ny, int width) {
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
    public Pix pixReadJp2k(String filename, int reduction, Box box, int hint, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint, int debug) {
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
    public int numaWrite(String filename, Numa na) {
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
    public int numaSimpleStats(Numa na, int first, int last, FloatBuffer pmean, FloatBuffer pvar, FloatBuffer prvar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int grayHistogramsToEMD(Numaa naa1, Numaa naa2, PointerByReference pnad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int grayInterHistogramStats(Numaa naa, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv) {
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
    public Numaa pixGetGrayHistogramTiled(Pix pixs, int factor, int nx, int ny) {
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
    public Pix pixDisplayColorArray(IntBuffer carray, int ncolors, int side, int ncols, int fontsize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int pixFractionFgInMask(Pix pix1, Pix pix2, FloatBuffer pfract) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaSelectWithString(Pixa pixas, String str, IntBuffer perror) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pixa pixaRotateOrth(Pixa pixas, int rotation) {
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
    public PixComp pixcompCreateFromString(ByteBuffer data, NativeSize size, int copyflag) {
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
    public int readHeaderMemPng(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemPng(ByteBuffer cdata, NativeSize size) {
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
    public Pointer generateUncompressedPS(ByteBuffer hexdata, int w, int h, int d, int psbpl, int bps, float xpt, float ypt, float wpt, float hpt, int boxflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void convertByteToHexAscii(byte byteval, ByteBuffer pnib1, ByteBuffer pnib2) {
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
    public Ptaa ptaaIndexLabelledPixels(Pix pixs, IntBuffer pncc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pta ptaGetNeighborPixLocs(Pix pixs, int x, int y, int conn) {
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
    public Pix recogPreSplittingFilter(L_Recog recog, Pix pixs, float maxasp, float minaf, int debug) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int recogSplittingFilter(L_Recog recog, Pix pixs, float maxasp, float minaf, IntBuffer premove, int debug) {
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
    public int recogProcessSingleLabelled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppixa) {
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
    public Sarray sarrayCreateInitialized(int n, ByteBuffer initstr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sarray sarrayCreateLinesFromString(String string, int blankflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayAddString(Sarray sa, ByteBuffer string, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayReplaceString(Sarray sa, int index, ByteBuffer newstr, int copyflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayJoin(Sarray sa1, Sarray sa2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int sarrayPadToSameSize(Sarray sa1, Sarray sa2, ByteBuffer padstring) {
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
    public void scaleToGray2Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray3Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray4Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray6Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scaleToGray8Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab) {
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
    public Pix pixReadMemSpix(ByteBuffer data, NativeSize size) {
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
    public Pix pixAddTextlines(Pix pixs, L_Bmf bmf, String textstr, int val, int location) {
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
    public Sarray splitStringToParagraphs(ByteBuffer textstr, int splitflag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int readHeaderMemTiff(ByteBuffer cdata, NativeSize size, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pix pixReadMemTiff(ByteBuffer cdata, NativeSize size, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringCopy(ByteBuffer dest, String src, int n) {
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
    public Pointer strtokSafe(ByteBuffer cstr, String seps, PointerByReference psaveptr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int stringSplitOnToken(ByteBuffer cstr, String seps, PointerByReference phead, PointerByReference ptail) {
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
    public Pointer l_binaryCopy(ByteBuffer datas, NativeSize size) {
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
    public Pointer appendSubdirs(String basedir, String subdirs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int convertSepCharsInPath(ByteBuffer path, int type) {
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
    public Pointer getLeptonicaVersion() {
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

}
