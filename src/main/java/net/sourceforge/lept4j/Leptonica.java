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
     * <code>PIX* pixCleanBackgroundToWhite(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2</i>
     */
    Pix pixCleanBackgroundToWhite(Pix pixs, Pix pixim, Pix pixg, float gamma, int blackval, int whiteval);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormSimple(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:4</i>
     */
    Pix pixBackgroundNormSimple(Pix pixs, Pix pixim, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNorm(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:6</i>
     */
    Pix pixBackgroundNorm(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormMorph(PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:8</i>
     */
    Pix pixBackgroundNormMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval);

    /**
     * Original signature :
     * <code>l_int32 pixBackgroundNormGrayArray(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:10</i>
     */
    int pixBackgroundNormGrayArray(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_int32 pixBackgroundNormRGBArrays(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:12</i>
     */
    int pixBackgroundNormRGBArrays(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_int32 pixBackgroundNormGrayArrayMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:14</i>
     */
    int pixBackgroundNormGrayArrayMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_int32 pixBackgroundNormRGBArraysMorph(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:16</i>
     */
    int pixBackgroundNormRGBArraysMorph(Pix pixs, Pix pixim, int reduction, int size, int bgval, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>l_int32 pixGetBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:18</i>
     */
    int pixGetBackgroundGrayMap(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_int32 pixGetBackgroundRGBMap(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:20</i>
     */
    int pixGetBackgroundRGBMap(Pix pixs, Pix pixim, Pix pixg, int sx, int sy, int thresh, int mincount, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_int32 pixGetBackgroundGrayMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:22</i>
     */
    int pixGetBackgroundGrayMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixm);

    /**
     * Original signature :
     * <code>l_int32 pixGetBackgroundRGBMapMorph(PIX*, PIX*, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:24</i>
     */
    int pixGetBackgroundRGBMapMorph(Pix pixs, Pix pixim, int reduction, int size, PointerByReference ppixmr, PointerByReference ppixmg, PointerByReference ppixmb);

    /**
     * Original signature :
     * <code>l_int32 pixFillMapHoles(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:26</i>
     */
    int pixFillMapHoles(Pix pix, int nx, int ny, int filltype);

    /**
     * Original signature :
     * <code>PIX* pixExtendByReplication(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:28</i>
     */
    Pix pixExtendByReplication(Pix pixs, int addw, int addh);

    /**
     * Original signature :
     * <code>l_int32 pixSmoothConnectedRegions(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:30</i>
     */
    int pixSmoothConnectedRegions(Pix pixs, Pix pixm, int factor);

    /**
     * Original signature :
     * <code>PIX* pixGetInvBackgroundMap(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:32</i>
     */
    Pix pixGetInvBackgroundMap(Pix pixs, int bgval, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundGrayMap(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:34</i>
     */
    Pix pixApplyInvBackgroundGrayMap(Pix pixs, Pix pixm, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyInvBackgroundRGBMap(PIX*, PIX*, PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:36</i>
     */
    Pix pixApplyInvBackgroundRGBMap(Pix pixs, Pix pixmr, Pix pixmg, Pix pixmb, int sx, int sy);

    /**
     * Original signature :
     * <code>PIX* pixApplyVariableGrayMap(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:38</i>
     */
    Pix pixApplyVariableGrayMap(Pix pixs, Pix pixg, int target);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:40</i>
     */
    Pix pixGlobalNormRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int mapval);

    /**
     * Original signature :
     * <code>PIX* pixGlobalNormNoSatRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:42</i>
     */
    Pix pixGlobalNormNoSatRGB(Pix pixd, Pix pixs, int rval, int gval, int bval, int factor, float rank);

    /**
     * Original signature :
     * <code>l_int32 pixThresholdSpreadNorm(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:44</i>
     */
    int pixThresholdSpreadNorm(Pix pixs, int filtertype, int edgethresh, int smoothx, int smoothy, float gamma, int minval, int maxval, int targetthresh, PointerByReference ppixth, PointerByReference ppixb, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixBackgroundNormFlex(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:46</i>
     */
    Pix pixBackgroundNormFlex(Pix pixs, int sx, int sy, int smoothx, int smoothy, int delta);

    /**
     * Original signature :
     * <code>PIX* pixContrastNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:48</i>
     */
    Pix pixContrastNorm(Pix pixd, Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy);

    /**
     * Original signature :
     * <code>l_int32 pixMinMaxTiles(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:50</i>
     */
    int pixMinMaxTiles(Pix pixs, int sx, int sy, int mindiff, int smoothx, int smoothy, PointerByReference ppixmin, PointerByReference ppixmax);

    /**
     * Original signature :
     * <code>l_int32 pixSetLowContrast(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:52</i>
     */
    int pixSetLowContrast(Pix pixs1, Pix pixs2, int mindiff);

    /**
     * Original signature :
     * <code>PIX* pixLinearTRCTiled(PIX*, PIX*, l_int32, l_int32, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:54</i>
     */
    Pix pixLinearTRCTiled(Pix pixd, Pix pixs, int sx, int sy, Pix pixmin, Pix pixmax);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampledPta(PIX*, PTA*, PTA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:56</i>
     */
    Pix pixAffineSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffineSampled(PIX*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:58</i>
     */
    Pix pixAffineSampled(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePta(PIX*, PTA*, PTA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:60</i>
     */
    Pix pixAffinePta(Pix pixs, Pta ptad, Pta ptas, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffine(PIX*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:62</i>
     */
    Pix pixAffine(Pix pixs, FloatBuffer vc, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaColor(PIX*, PTA*, PTA*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:64</i>
     */
    Pix pixAffinePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffineColor(PIX*, l_float32*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:66</i>
     */
    Pix pixAffineColor(Pix pixs, FloatBuffer vc, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaGray(PIX*, PTA*, PTA*, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:68</i>
     */
    Pix pixAffinePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffineGray(PIX*, l_float32*, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:70</i>
     */
    Pix pixAffineGray(Pix pixs, FloatBuffer vc, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixAffinePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:72</i>
     */
    Pix pixAffinePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);

//      /**
//       * Original signature :
//       * <code>l_int32 getAffineXformCoeffs(PTA*, PTA*, l_float32**)</code><br>
//       * <i>native declaration : allheaders.h:74</i>
//       */
//      int getAffineXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_int32 affineInvertXform(l_float32*, l_float32**)</code><br>
//       * <i>native declaration : allheaders.h:76</i>
//       */
//      int affineInvertXform(FloatBuffer vc, PointerByReference pvci);
//      /**
//       * Original signature :
//       * <code>l_int32 affineXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:78</i>
//       */
//      int affineXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_int32 affineXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:80</i>
//       */
//      int affineXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_int32 linearInterpolatePixelColor(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_uint32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:82</i>
//       */
//      int linearInterpolatePixelColor(IntBuffer datas, int wpls, int w, int h, float x, float y, int colorval, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 linearInterpolatePixelGray(l_uint32*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:84</i>
//       */
//      int linearInterpolatePixelGray(IntBuffer datas, int wpls, int w, int h, float x, float y, int grayval, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 gaussjordan(l_float32**, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:86</i>
//       */
//      int gaussjordan(PointerByReference a, FloatBuffer b, int n);
//      /**
//       * Original signature :
//       * <code>PIX* pixAffineSequential(PIX*, PTA*, PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:88</i>
//       */
//      Pix pixAffineSequential(Pix pixs, Pta ptad, Pta ptas, int bw, int bh);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dTranslate(l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:90</i>
//       */
//      FloatByReference createMatrix2dTranslate(float transx, float transy);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dScale(l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:92</i>
//       */
//      FloatByReference createMatrix2dScale(float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>l_float32* createMatrix2dRotate(l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:94</i>
//       */
//      FloatByReference createMatrix2dRotate(float xc, float yc, float angle);
    /**
     * Original signature :
     * <code>PTA* ptaTranslate(PTA*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:96</i>
     */
    Pta ptaTranslate(Pta ptas, float transx, float transy);

    /**
     * Original signature :
     * <code>PTA* ptaScale(PTA*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:98</i>
     */
    Pta ptaScale(Pta ptas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PTA* ptaRotate(PTA*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:100</i>
     */
    Pta ptaRotate(Pta ptas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>BOXA* boxaTranslate(BOXA*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:102</i>
     */
    Boxa boxaTranslate(Boxa boxas, float transx, float transy);

    /**
     * Original signature :
     * <code>BOXA* boxaScale(BOXA*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:104</i>
     */
    Boxa boxaScale(Boxa boxas, float scalex, float scaley);

    /**
     * Original signature :
     * <code>BOXA* boxaRotate(BOXA*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:106</i>
     */
    Boxa boxaRotate(Boxa boxas, float xc, float yc, float angle);

    /**
     * Original signature :
     * <code>PTA* ptaAffineTransform(PTA*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:108</i>
     */
    Pta ptaAffineTransform(Pta ptas, FloatBuffer mat);

    /**
     * Original signature :
     * <code>BOXA* boxaAffineTransform(BOXA*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:110</i>
     */
    Boxa boxaAffineTransform(Boxa boxas, FloatBuffer mat);

//      /**
//       * Original signature :
//       * <code>l_int32 l_productMatVec(l_float32*, l_float32*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:112</i>
//       */
//      int l_productMatVec(FloatBuffer mat, FloatBuffer vecs, FloatBuffer vecd, int size);
//      /**
//       * Original signature :
//       * <code>l_int32 l_productMat2(l_float32*, l_float32*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:114</i>
//       */
//      int l_productMat2(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_int32 l_productMat3(l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:116</i>
//       */
//      int l_productMat3(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_int32 l_productMat4(l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:118</i>
//       */
//      int l_productMat4(FloatBuffer mat1, FloatBuffer mat2, FloatBuffer mat3, FloatBuffer mat4, FloatBuffer matd, int size);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataBit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:120</i>
//       */
//      int l_getDataBit(Pointer line, int n);
//  
//      /**
//       * Original signature : <code>void l_setDataBit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:122</i>
//       */
//      void l_setDataBit(Pointer line, int n);
//  
//      /**
//       * Original signature : <code>void l_clearDataBit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:124</i>
//       */
//      void l_clearDataBit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataBitVal(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:126</i>
//       */
//      void l_setDataBitVal(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataDibit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:128</i>
//       */
//      int l_getDataDibit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataDibit(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:130</i>
//       */
//      void l_setDataDibit(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>void l_clearDataDibit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:132</i>
//       */
//      void l_clearDataDibit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataQbit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:134</i>
//       */
//      int l_getDataQbit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataQbit(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:136</i>
//       */
//      void l_setDataQbit(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>void l_clearDataQbit(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:138</i>
//       */
//      void l_clearDataQbit(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataByte(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:140</i>
//       */
//      int l_getDataByte(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataByte(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:142</i>
//       */
//      void l_setDataByte(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataTwoBytes(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:144</i>
//       */
//      int l_getDataTwoBytes(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataTwoBytes(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:146</i>
//       */
//      void l_setDataTwoBytes(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_getDataFourBytes(void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:148</i>
//       */
//      int l_getDataFourBytes(Pointer line, int n);
//      /**
//       * Original signature :
//       * <code>void l_setDataFourBytes(void*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:150</i>
//       */
//      void l_setDataFourBytes(Pointer line, int n, int val);
//      /**
//       * Original signature :
//       * <code>char* barcodeDispatchDecoder(char*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:152</i>
//       */
//      Pointer barcodeDispatchDecoder(ByteBuffer barstr, int format, int debugflag);
//      /**
//       * Original signature :
//       * <code>l_int32 barcodeFormatIsSupported(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:154</i>
//       */
//      int barcodeFormatIsSupported(int format);
    /**
     * Original signature :
     * <code>NUMA* pixFindBaselines(PIX*, PTA**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:156</i>
     */
    Numa pixFindBaselines(Pix pixs, PointerByReference ppta, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixDeskewLocal(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:158</i>
     */
    Pix pixDeskewLocal(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_int32 pixGetLocalSkewTransform(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, PTA**, PTA**)</code><br>
     * <i>native declaration : allheaders.h:160</i>
     */
    int pixGetLocalSkewTransform(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, PointerByReference pptas, PointerByReference pptad);

    /**
     * Original signature :
     * <code>NUMA* pixGetLocalSkewAngles(PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:162</i>
     */
    Numa pixGetLocalSkewAngles(Pix pixs, int nslices, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, FloatBuffer pa, FloatBuffer pb, int debug);

    /**
     * Original signature :
     * <code>L_BBUFFER* bbufferCreate(l_uint8*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:164</i>
     */
    L_ByteBuffer bbufferCreate(ByteBuffer indata, int nalloc);

    /**
     * Original signature : <code>void bbufferDestroy(L_BBUFFER**)</code><br>
     * <i>native declaration : allheaders.h:166</i>
     */
    void bbufferDestroy(PointerByReference pbb);

    /**
     * Original signature :
     * <code>l_uint8* bbufferDestroyAndSaveData(L_BBUFFER**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:168</i>
     */
    Pointer bbufferDestroyAndSaveData(PointerByReference pbb, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 bbufferRead(L_BBUFFER*, l_uint8*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:170</i>
     */
    int bbufferRead(L_ByteBuffer bb, ByteBuffer src, int nbytes);

//      /**
//       * Original signature :
//       * <code>l_int32 bbufferReadStream(L_BBUFFER*, FILE*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:172</i>
//       */
//      int bbufferReadStream(L_ByteBuffer bb, FILE fp, int nbytes);
    /**
     * Original signature :
     * <code>l_int32 bbufferExtendArray(L_BBUFFER*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:174</i>
     */
    int bbufferExtendArray(L_ByteBuffer bb, int nbytes);

    /**
     * Original signature :
     * <code>l_int32 bbufferWrite(L_BBUFFER*, l_uint8*, size_t, size_t*)</code><br>
     * <i>native declaration : allheaders.h:176</i>
     */
    int bbufferWrite(L_ByteBuffer bb, ByteBuffer dest, NativeSize nbytes, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_int32 bbufferWriteStream(L_BBUFFER*, FILE*, size_t, size_t*)</code><br>
     * <i>native declaration : allheaders.h:178</i>
     */
    int bbufferWriteStream(L_ByteBuffer bb, FILE fp, NativeSize nbytes, NativeSizeByReference pnout);

//      /**
//       * Original signature :
//       * <code>PIX* pixBilateral(PIX*, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:180</i>
//       */
//      Pix pixBilateral(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralGray(PIX*, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:182</i>
//       */
//      Pix pixBilateralGray(Pix pixs, float spatial_stdev, float range_stdev, int ncomps, int reduction);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralExact(PIX*, L_KERNEL*, L_KERNEL*)</code><br>
//       * <i>native declaration : allheaders.h:184</i>
//       */
//      Pix pixBilateralExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilateralGrayExact(PIX*, L_KERNEL*, L_KERNEL*)</code><br>
//       * <i>native declaration : allheaders.h:186</i>
//       */
//      Pix pixBilateralGrayExact(Pix pixs, L_Kernel spatial_kel, L_Kernel range_kel);
//      /**
//       * Original signature :
//       * <code>PIX* pixBlockBilateralExact(PIX*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:188</i>
//       */
//      Pix pixBlockBilateralExact(Pix pixs, float spatial_stdev, float range_stdev);
//      /**
//       * Original signature :
//       * <code>L_KERNEL* makeRangeKernel(l_float32)</code><br>
//       * <i>native declaration : allheaders.h:190</i>
//       */
//      L_Kernel makeRangeKernel(float range_stdev);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearSampledPta(PIX*, PTA*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:192</i>
//       */
//      Pix pixBilinearSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearSampled(PIX*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:194</i>
//       */
//      Pix pixBilinearSampled(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPta(PIX*, PTA*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:196</i>
//       */
//      Pix pixBilinearPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinear(PIX*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:198</i>
//       */
//      Pix pixBilinear(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaColor(PIX*, PTA*, PTA*, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:200</i>
//       */
//      Pix pixBilinearPtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearColor(PIX*, l_float32*, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:202</i>
//       */
//      Pix pixBilinearColor(Pix pixs, FloatBuffer vc, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaGray(PIX*, PTA*, PTA*, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:204</i>
//       */
//      Pix pixBilinearPtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearGray(PIX*, l_float32*, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:206</i>
//       */
//      Pix pixBilinearGray(Pix pixs, FloatBuffer vc, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixBilinearPtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:208</i>
//       */
//      Pix pixBilinearPtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);
//      /**
//       * Original signature :
//       * <code>l_int32 getBilinearXformCoeffs(PTA*, PTA*, l_float32**)</code><br>
//       * <i>native declaration : allheaders.h:210</i>
//       */
//      int getBilinearXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_int32 bilinearXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:212</i>
//       */
//      int bilinearXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_int32 bilinearXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:214</i>
//       */
//      int bilinearXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
    /**
     * Original signature :
     * <code>l_int32 pixOtsuAdaptiveThreshold(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:216</i>
     */
    int pixOtsuAdaptiveThreshold(Pix pixs, int sx, int sy, int smoothx, int smoothy, float scorefract, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixOtsuThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:218</i>
     */
    Pix pixOtsuThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int bgval, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>PIX* pixMaskedThreshOnBackgroundNorm(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:220</i>
     */
    Pix pixMaskedThreshOnBackgroundNorm(Pix pixs, Pix pixim, int sx, int sy, int thresh, int mincount, int smoothx, int smoothy, float scorefract, IntBuffer pthresh);

    /**
     * Original signature :
     * <code>l_int32 pixSauvolaBinarizeTiled(PIX*, l_int32, l_float32, l_int32, l_int32, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:222</i>
     */
    int pixSauvolaBinarizeTiled(Pix pixs, int whsize, float factor, int nx, int ny, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_int32 pixSauvolaBinarize(PIX*, l_int32, l_float32, l_int32, PIX**, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:224</i>
     */
    int pixSauvolaBinarize(Pix pixs, int whsize, float factor, int addborder, PointerByReference ppixm, PointerByReference ppixsd, PointerByReference ppixth, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PIX* pixSauvolaGetThreshold(PIX*, PIX*, l_float32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:226</i>
     */
    Pix pixSauvolaGetThreshold(Pix pixm, Pix pixms, float factor, PointerByReference ppixsd);

    /**
     * Original signature :
     * <code>PIX* pixApplyLocalThreshold(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:228</i>
     */
    Pix pixApplyLocalThreshold(Pix pixs, Pix pixth, int redfactor);

    /**
     * Original signature :
     * <code>l_int32 pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:230</i>
     */
    int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntBuffer pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixThresholdByConnComp(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32*, PIX**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:230</i>
     */
    int pixThresholdByConnComp(Pix pixs, Pix pixm, int start, int end, int incr, float thresh48, float threshdiff, IntByReference pglobthresh, PointerByReference ppixd, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryReplicate(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:232</i>
     */
    Pix pixExpandBinaryReplicate(Pix pixs, int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixExpandBinaryPower2(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:234</i>
     */
    Pix pixExpandBinaryPower2(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixReduceBinary2(PIX*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:236</i>
     */
    Pix pixReduceBinary2(Pix pixs, ByteBuffer intab);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinaryCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:238</i>
     */
    Pix pixReduceRankBinaryCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature :
     * <code>PIX* pixReduceRankBinary2(PIX*, l_int32, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:240</i>
     */
    Pix pixReduceRankBinary2(Pix pixs, int level, ByteBuffer intab);

    /**
     * Original signature : <code>l_uint8* makeSubsampleTab2x()</code><br>
     * <i>native declaration : allheaders.h:242</i>
     */
    Pointer makeSubsampleTab2x();

    /**
     * Original signature :
     * <code>PIX* pixBlend(PIX*, PIX*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:244</i>
     */
    Pix pixBlend(Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendMask(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:246</i>
     */
    Pix pixBlendMask(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendGray(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:248</i>
     */
    Pix pixBlendGray(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int type, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayInverse(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:250</i>
     */
    Pix pixBlendGrayInverse(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>PIX* pixBlendColor(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:252</i>
     */
    Pix pixBlendColor(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendColorByChannel(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_float32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:254</i>
     */
    Pix pixBlendColorByChannel(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float rfract, float gfract, float bfract, int transparent, int transpix);

    /**
     * Original signature :
     * <code>PIX* pixBlendGrayAdapt(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:256</i>
     */
    Pix pixBlendGrayAdapt(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract, int shift);

    /**
     * Original signature :
     * <code>PIX* pixFadeWithGray(PIX*, PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:258</i>
     */
    Pix pixFadeWithGray(Pix pixs, Pix pixb, float factor, int type);

    /**
     * Original signature :
     * <code>PIX* pixBlendHardLight(PIX*, PIX*, PIX*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:260</i>
     */
    Pix pixBlendHardLight(Pix pixd, Pix pixs1, Pix pixs2, int x, int y, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixBlendCmap(PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:262</i>
     */
    int pixBlendCmap(Pix pixs, Pix pixb, int x, int y, int sindex);

    /**
     * Original signature :
     * <code>PIX* pixBlendWithGrayMask(PIX*, PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:264</i>
     */
    Pix pixBlendWithGrayMask(Pix pixs1, Pix pixs2, Pix pixg, int x, int y);

    /**
     * Original signature :
     * <code>PIX* pixBlendBackgroundToColor(PIX*, PIX*, BOX*, l_uint32, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:266</i>
     */
    Pix pixBlendBackgroundToColor(Pix pixd, Pix pixs, Box box, int color, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixMultiplyByColor(PIX*, PIX*, BOX*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:268</i>
     */
    Pix pixMultiplyByColor(Pix pixd, Pix pixs, Box box, int color);

    /**
     * Original signature :
     * <code>PIX* pixAlphaBlendUniform(PIX*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:270</i>
     */
    Pix pixAlphaBlendUniform(Pix pixs, int color);

    /**
     * Original signature :
     * <code>PIX* pixAddAlphaToBlend(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:272</i>
     */
    Pix pixAddAlphaToBlend(Pix pixs, float fract, int invert);

    /**
     * Original signature : <code>PIX* pixSetAlphaOverWhite(PIX*)</code><br>
     * <i>native declaration : allheaders.h:274</i>
     */
    Pix pixSetAlphaOverWhite(Pix pixs);

    /**
     * Original signature :
     * <code>L_BMF* bmfCreate(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:276</i>
     */
    L_Bmf bmfCreate(String dir, int fontsize);

    /**
     * Original signature : <code>void bmfDestroy(L_BMF**)</code><br>
     * <i>native declaration : allheaders.h:278</i>
     */
    void bmfDestroy(PointerByReference pbmf);

    /**
     * Original signature : <code>PIX* bmfGetPix(L_BMF*, char)</code><br>
     * <i>native declaration : allheaders.h:280</i>
     */
    Pix bmfGetPix(L_Bmf bmf, byte chr);

    /**
     * Original signature :
     * <code>l_int32 bmfGetWidth(L_BMF*, char, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:282</i>
     */
    int bmfGetWidth(L_Bmf bmf, byte chr, IntBuffer pw);

    /**
     * Original signature :
     * <code>l_int32 bmfGetBaseline(L_BMF*, char, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:284</i>
     */
    int bmfGetBaseline(L_Bmf bmf, byte chr, IntBuffer pbaseline);

    /**
     * Original signature :
     * <code>PIXA* pixaGetFont(const char*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:286</i>
     */
    Pixa pixaGetFont(String dir, int fontsize, IntBuffer pbl0, IntBuffer pbl1, IntBuffer pbl2);

    /**
     * Original signature :
     * <code>l_int32 pixaSaveFont(const char*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:288</i>
     */
    int pixaSaveFont(String indir, String outdir, int fontsize);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamBmp(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:290</i>
//       */
//      Pix pixReadStreamBmp(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemBmp(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:292</i>
     */
    Pix pixReadMemBmp(ByteBuffer cdata, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamBmp(FILE*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:294</i>
//       */
//      int pixWriteStreamBmp(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>l_int32 pixWriteMemBmp(l_uint8**, size_t*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:296</i>
     */
    int pixWriteMemBmp(PointerByReference pfdata, NativeSizeByReference pfsize, Pix pixs);

    /**
     * Original signature : <code>PIXA* l_bootnum_gen1()</code><br>
     * <i>native declaration : allheaders.h:298</i>
     */
    Pixa l_bootnum_gen1();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen2()</code><br>
     * <i>native declaration : allheaders.h:300</i>
     */
    Pixa l_bootnum_gen2();

    /**
     * Original signature : <code>PIXA* l_bootnum_gen3()</code><br>
     * <i>native declaration : allheaders.h:302</i>
     */
    Pixa l_bootnum_gen3();

    /**
     * Original signature :
     * <code>BOX* boxCreate(l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:304</i>
     */
    Box boxCreate(int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>BOX* boxCreateValid(l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:306</i>
     */
    Box boxCreateValid(int x, int y, int w, int h);

    /**
     * Original signature : <code>BOX* boxCopy(BOX*)</code><br>
     * <i>native declaration : allheaders.h:308</i>
     */
    Box boxCopy(Box box);

    /**
     * Original signature : <code>BOX* boxClone(BOX*)</code><br>
     * <i>native declaration : allheaders.h:310</i>
     */
    Box boxClone(Box box);

    /**
     * Original signature : <code>void boxDestroy(BOX**)</code><br>
     * <i>native declaration : allheaders.h:312</i>
     */
    void boxDestroy(PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_int32 boxGetGeometry(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:314</i>
     */
    int boxGetGeometry(Box box, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_int32 boxSetGeometry(BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:316</i>
     */
    int boxSetGeometry(Box box, int x, int y, int w, int h);

    /**
     * Original signature :
     * <code>l_int32 boxGetSideLocations(BOX*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:318</i>
     */
    int boxGetSideLocations(Box box, IntBuffer pl, IntBuffer pr, IntBuffer pt, IntBuffer pb);

    /**
     * Original signature :
     * <code>l_int32 boxSetSideLocations(BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:320</i>
     */
    int boxSetSideLocations(Box box, int l, int r, int t, int b);

    /**
     * Original signature : <code>l_int32 boxGetRefcount(BOX*)</code><br>
     * <i>native declaration : allheaders.h:322</i>
     */
    int boxGetRefcount(Box box);

    /**
     * Original signature :
     * <code>l_int32 boxChangeRefcount(BOX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:324</i>
     */
    int boxChangeRefcount(Box box, int delta);

    /**
     * Original signature : <code>l_int32 boxIsValid(BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:326</i>
     */
    int boxIsValid(Box box, IntBuffer pvalid);

    /**
     * Original signature : <code>BOXA* boxaCreate(l_int32)</code><br>
     * <i>native declaration : allheaders.h:328</i>
     */
    Boxa boxaCreate(int n);

    /**
     * Original signature : <code>BOXA* boxaCopy(BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:330</i>
     */
    Boxa boxaCopy(Boxa boxa, int copyflag);

    /**
     * Original signature : <code>void boxaDestroy(BOXA**)</code><br>
     * <i>native declaration : allheaders.h:332</i>
     */
    void boxaDestroy(PointerByReference pboxa);

    /**
     * Original signature :
     * <code>l_int32 boxaAddBox(BOXA*, BOX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:334</i>
     */
    int boxaAddBox(Boxa boxa, Box box, int copyflag);

    /**
     * Original signature : <code>l_int32 boxaExtendArray(BOXA*)</code><br>
     * <i>native declaration : allheaders.h:336</i>
     */
    int boxaExtendArray(Boxa boxa);

    /**
     * Original signature :
     * <code>l_int32 boxaExtendArrayToSize(BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:338</i>
     */
    int boxaExtendArrayToSize(Boxa boxa, int size);

    /**
     * Original signature : <code>l_int32 boxaGetCount(BOXA*)</code><br>
     * <i>native declaration : allheaders.h:340</i>
     */
    int boxaGetCount(Boxa boxa);

    /**
     * Original signature : <code>l_int32 boxaGetValidCount(BOXA*)</code><br>
     * <i>native declaration : allheaders.h:342</i>
     */
    int boxaGetValidCount(Boxa boxa);

    /**
     * Original signature :
     * <code>BOX* boxaGetBox(BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:344</i>
     */
    Box boxaGetBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature :
     * <code>BOX* boxaGetValidBox(BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:346</i>
     */
    Box boxaGetValidBox(Boxa boxa, int index, int accessflag);

    /**
     * Original signature : <code>NUMA* boxaFindInvalidBoxes(BOXA*)</code><br>
     * <i>native declaration : allheaders.h:348</i>
     */
    Numa boxaFindInvalidBoxes(Boxa boxa);

    /**
     * Original signature :
     * <code>l_int32 boxaGetBoxGeometry(BOXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:350</i>
     */
    int boxaGetBoxGeometry(Boxa boxa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature : <code>l_int32 boxaIsFull(BOXA*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:352</i>
     */
    int boxaIsFull(Boxa boxa, IntBuffer pfull);

    /**
     * Original signature :
     * <code>l_int32 boxaReplaceBox(BOXA*, l_int32, BOX*)</code><br>
     * <i>native declaration : allheaders.h:354</i>
     */
    int boxaReplaceBox(Boxa boxa, int index, Box box);

    /**
     * Original signature :
     * <code>l_int32 boxaInsertBox(BOXA*, l_int32, BOX*)</code><br>
     * <i>native declaration : allheaders.h:356</i>
     */
    int boxaInsertBox(Boxa boxa, int index, Box box);

    /**
     * Original signature :
     * <code>l_int32 boxaRemoveBox(BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:358</i>
     */
    int boxaRemoveBox(Boxa boxa, int index);

    /**
     * Original signature :
     * <code>l_int32 boxaRemoveBoxAndSave(BOXA*, l_int32, BOX**)</code><br>
     * <i>native declaration : allheaders.h:360</i>
     */
    int boxaRemoveBoxAndSave(Boxa boxa, int index, PointerByReference pbox);

    /**
     * Original signature : <code>BOXA* boxaSaveValid(BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:362</i>
     */
    Boxa boxaSaveValid(Boxa boxas, int copyflag);

    /**
     * Original signature : <code>l_int32 boxaInitFull(BOXA*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:364</i>
     */
    int boxaInitFull(Boxa boxa, Box box);

    /**
     * Original signature : <code>l_int32 boxaClear(BOXA*)</code><br>
     * <i>native declaration : allheaders.h:366</i>
     */
    int boxaClear(Boxa boxa);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:368</i>
//       */
//      Boxaa boxaaCreate(int n);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaCopy(BOXAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:370</i>
//       */
//      Boxaa boxaaCopy(Boxaa baas, int copyflag);
//  
//      /**
//       * Original signature : <code>void boxaaDestroy(BOXAA**)</code><br>
//       * <i>native declaration : allheaders.h:372</i>
//       */
//      void boxaaDestroy(PointerByReference pbaa);

//      /**
//       * Original signature :
//       * <code>l_int32 boxaaAddBoxa(BOXAA*, BOXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:374</i>
//       */
//      int boxaaAddBoxa(Boxaa baa, Boxa ba, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 boxaaExtendArray(BOXAA*)</code><br>
//       * <i>native declaration : allheaders.h:376</i>
//       */
//      int boxaaExtendArray(Boxaa baa);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaExtendArrayToSize(BOXAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:378</i>
//       */
//      int boxaaExtendArrayToSize(Boxaa baa, int size);
//  
//      /**
//       * Original signature : <code>l_int32 boxaaGetCount(BOXAA*)</code><br>
//       * <i>native declaration : allheaders.h:380</i>
//       */
//      int boxaaGetCount(Boxaa baa);
//  
//      /**
//       * Original signature : <code>l_int32 boxaaGetBoxCount(BOXAA*)</code><br>
//       * <i>native declaration : allheaders.h:382</i>
//       */
//      int boxaaGetBoxCount(Boxaa baa);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaGetBoxa(BOXAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:384</i>
//       */
//      Boxa boxaaGetBoxa(Boxaa baa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>BOX* boxaaGetBox(BOXAA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:386</i>
//       */
//      Box boxaaGetBox(Boxaa baa, int iboxa, int ibox, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaInitFull(BOXAA*, BOXA*)</code><br>
//       * <i>native declaration : allheaders.h:388</i>
//       */
//      int boxaaInitFull(Boxaa baa, Boxa boxa);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaExtendWithInit(BOXAA*, l_int32, BOXA*)</code><br>
//       * <i>native declaration : allheaders.h:390</i>
//       */
//      int boxaaExtendWithInit(Boxaa baa, int maxindex, Boxa boxa);
    /**
     * Original signature :
     * <code>l_int32 boxaaReplaceBoxa(BOXAA*, l_int32, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:392</i>
     */
    int boxaaReplaceBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature :
     * <code>l_int32 boxaaInsertBoxa(BOXAA*, l_int32, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:394</i>
     */
    int boxaaInsertBoxa(Boxaa baa, int index, Boxa boxa);

    /**
     * Original signature :
     * <code>l_int32 boxaaRemoveBoxa(BOXAA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:396</i>
     */
    int boxaaRemoveBoxa(Boxaa baa, int index);

    /**
     * Original signature :
     * <code>l_int32 boxaaAddBox(BOXAA*, l_int32, BOX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:398</i>
     */
    int boxaaAddBox(Boxaa baa, int index, Box box, int accessflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:400</i>
     */
    Boxaa boxaaReadFromFiles(String dirname, String substr, int first, int nfiles);

    /**
     * Original signature : <code>BOXAA* boxaaRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:402</i>
     */
    Boxaa boxaaRead(String filename);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:404</i>
//       */
//      Boxaa boxaaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXAA* boxaaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:406</i>
     */
    Boxaa boxaaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 boxaaWrite(const char*, BOXAA*)</code><br>
     * <i>native declaration : allheaders.h:408</i>
     */
    int boxaaWrite(String filename, Boxaa baa);

//      /**
//       * Original signature :
//       * <code>l_int32 boxaaWriteStream(FILE*, BOXAA*)</code><br>
//       * <i>native declaration : allheaders.h:410</i>
//       */
//      int boxaaWriteStream(FILE fp, Boxaa baa);
    /**
     * Original signature :
     * <code>l_int32 boxaaWriteMem(l_uint8**, size_t*, BOXAA*)</code><br>
     * <i>native declaration : allheaders.h:412</i>
     */
    int boxaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxaa baa);

    /**
     * Original signature : <code>BOXA* boxaRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:414</i>
     */
    Boxa boxaRead(String filename);
//  
//      /**
//       * Original signature : <code>BOXA* boxaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:416</i>
//       */
//      Boxa boxaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>BOXA* boxaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:418</i>
     */
    Boxa boxaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 boxaWrite(const char*, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:420</i>
     */
    int boxaWrite(String filename, Boxa boxa);

//      /**
//       * Original signature :
//       * <code>l_int32 boxaWriteStream(FILE*, BOXA*)</code><br>
//       * <i>native declaration : allheaders.h:422</i>
//       */
//      int boxaWriteStream(FILE fp, Boxa boxa);
    /**
     * Original signature :
     * <code>l_int32 boxaWriteMem(l_uint8**, size_t*, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:424</i>
     */
    int boxaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Boxa boxa);

//      /**
//       * Original signature :
//       * <code>l_int32 boxPrintStreamInfo(FILE*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:426</i>
//       */
//      int boxPrintStreamInfo(FILE fp, Box box);
    /**
     * Original signature :
     * <code>l_int32 boxContains(BOX*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:428</i>
     */
    int boxContains(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature :
     * <code>l_int32 boxIntersects(BOX*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:430</i>
     */
    int boxIntersects(Box box1, Box box2, IntBuffer presult);

    /**
     * Original signature :
     * <code>BOXA* boxaContainedInBox(BOXA*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:432</i>
     */
    Boxa boxaContainedInBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_int32 boxaContainedInBoxCount(BOXA*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:434</i>
     */
    int boxaContainedInBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_int32 boxaContainedInBoxa(BOXA*, BOXA*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:436</i>
     */
    int boxaContainedInBoxa(Boxa boxa1, Boxa boxa2, IntBuffer pcontained);

    /**
     * Original signature :
     * <code>BOXA* boxaIntersectsBox(BOXA*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:436</i>
     */
    Boxa boxaIntersectsBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>l_int32 boxaIntersectsBoxCount(BOXA*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:438</i>
     */
    int boxaIntersectsBoxCount(Boxa boxa, Box box, IntBuffer pcount);

    /**
     * Original signature : <code>BOXA* boxaClipToBox(BOXA*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:440</i>
     */
    Boxa boxaClipToBox(Boxa boxas, Box box);

    /**
     * Original signature :
     * <code>BOXA* boxaCombineOverlaps(BOXA*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:442</i>
     */
    Boxa boxaCombineOverlaps(Boxa boxas, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 boxaCombineOverlapsInPair(BOXA*, BOXA*, BOXA**, BOXA**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:446</i>
     */
    int boxaCombineOverlapsInPair(Boxa boxas1, Boxa boxas2, PointerByReference pboxad1, PointerByReference pboxad2, Pixa pixadb);

    /**
     * Original signature : <code>BOX* boxOverlapRegion(BOX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:444</i>
     */
    Box boxOverlapRegion(Box box1, Box box2);

    /**
     * Original signature : <code>BOX* boxBoundingRegion(BOX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:446</i>
     */
    Box boxBoundingRegion(Box box1, Box box2);

    /**
     * Original signature :
     * <code>l_int32 boxOverlapFraction(BOX*, BOX*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:448</i>
     */
    int boxOverlapFraction(Box box1, Box box2, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_int32 boxOverlapArea(BOX*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:450</i>
     */
    int boxOverlapArea(Box box1, Box box2, IntBuffer parea);

    /**
     * Original signature :
     * <code>BOXA* boxaHandleOverlaps(BOXA*, l_int32, l_int32, l_float32, l_float32, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:452</i>
     */
    Boxa boxaHandleOverlaps(Boxa boxas, int op, int range, float min_overlap, float max_ratio, PointerByReference pnamap);

    /**
     * Original signature :
     * <code>l_int32 boxSeparationDistance(BOX*, BOX*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:454</i>
     */
    int boxSeparationDistance(Box box1, Box box2, IntBuffer ph_sep, IntBuffer pv_sep);

    /**
     * Original signature :
     * <code>l_int32 boxCompareSize(BOX*, BOX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:460</i>
     */
    int boxCompareSize(Box box1, Box box2, int type, IntBuffer prel);

    /**
     * Original signature :
     * <code>l_int32 boxContainsPt(BOX*, l_float32, l_float32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:456</i>
     */
    int boxContainsPt(Box box, float x, float y, IntBuffer pcontains);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToPt(BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:458</i>
     */
    Box boxaGetNearestToPt(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>BOX* boxaGetNearestToLine(BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:460</i>
     */
    Box boxaGetNearestToLine(Boxa boxa, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 boxGetCenter(BOX*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:462</i>
     */
    int boxGetCenter(Box box, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_int32 boxIntersectByLine(BOX*, l_int32, l_int32, l_float32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:464</i>
     */
    int boxIntersectByLine(Box box, int x, int y, float slope, IntBuffer px1, IntBuffer py1, IntBuffer px2, IntBuffer py2, IntBuffer pn);

    /**
     * Original signature :
     * <code>BOX* boxClipToRectangle(BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:466</i>
     */
    Box boxClipToRectangle(Box box, int wi, int hi);

    /**
     * Original signature :
     * <code>l_int32 boxClipToRectangleParams(BOX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:468</i>
     */
    int boxClipToRectangleParams(Box box, int w, int h, IntBuffer pxstart, IntBuffer pystart, IntBuffer pxend, IntBuffer pyend, IntBuffer pbw, IntBuffer pbh);

    /**
     * Original signature :
     * <code>BOX* boxRelocateOneSide(BOX*, BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:470</i>
     */
    Box boxRelocateOneSide(Box boxd, Box boxs, int loc, int sideflag);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustSides(BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:472</i>
     */
    Boxa boxaAdjustSides(Boxa boxas, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOX* boxAdjustSides(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:474</i>
     */
    Box boxAdjustSides(Box boxd, Box boxs, int delleft, int delright, int deltop, int delbot);

    /**
     * Original signature :
     * <code>BOXA* boxaSetSide(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:476</i>
     */
    Boxa boxaSetSide(Boxa boxad, Boxa boxas, int side, int val, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustWidthToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:478</i>
     */
    Boxa boxaAdjustWidthToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature :
     * <code>BOXA* boxaAdjustHeightToTarget(BOXA*, BOXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:480</i>
     */
    Boxa boxaAdjustHeightToTarget(Boxa boxad, Boxa boxas, int sides, int target, int thresh);

    /**
     * Original signature :
     * <code>l_int32 boxEqual(BOX*, BOX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:482</i>
     */
    int boxEqual(Box box1, Box box2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:484</i>
     */
    int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 boxaEqual(BOXA*, BOXA*, l_int32, NUMA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:484</i>
     */
    int boxaEqual(Boxa boxa1, Boxa boxa2, int maxdist, PointerByReference pnaindex, IntByReference psame);

    /**
     * Original signature :
     * <code>l_int32 boxSimilar(BOX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:486</i>
     */
    int boxSimilar(Box box1, Box box2, int leftdiff, int rightdiff, int topdiff, int botdiff, IntBuffer psimilar);

    /**
     * Original signature :
     * <code>l_int32 boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:488</i>
     */
    int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntBuffer psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_int32 boxaSimilar(BOXA*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:488</i>
     */
    int boxaSimilar(Boxa boxa1, Boxa boxa2, int leftdiff, int rightdiff, int topdiff, int botdiff, int debug, IntByReference psimilar, PointerByReference pnasim);

    /**
     * Original signature :
     * <code>l_int32 boxaJoin(BOXA*, BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:490</i>
     */
    int boxaJoin(Boxa boxad, Boxa boxas, int istart, int iend);

    /**
     * Original signature :
     * <code>l_int32 boxaaJoin(BOXAA*, BOXAA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:492</i>
     */
    int boxaaJoin(Boxaa baad, Boxaa baas, int istart, int iend);

//      /**
//       * Original signature :
//       * <code>l_int32 boxaSplitEvenOdd(BOXA*, l_int32, BOXA**, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:494</i>
//       */
//      int boxaSplitEvenOdd(Boxa boxa, int fillflag, PointerByReference pboxae, PointerByReference pboxao);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaMergeEvenOdd(BOXA*, BOXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:496</i>
//       */
//      Boxa boxaMergeEvenOdd(Boxa boxae, Boxa boxao, int fillflag);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaTransform(BOXA*, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:498</i>
//       */
//      Boxa boxaTransform(Boxa boxas, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>BOX* boxTransform(BOX*, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:500</i>
//       */
//      Box boxTransform(Box box, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaTransformOrdered(BOXA*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:502</i>
//       */
//      Boxa boxaTransformOrdered(Boxa boxas, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);
//      /**
//       * Original signature :
//       * <code>BOX* boxTransformOrdered(BOX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:504</i>
//       */
//      Box boxTransformOrdered(Box boxs, int shiftx, int shifty, float scalex, float scaley, int xcen, int ycen, float angle, int order);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaRotateOrth(BOXA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:506</i>
//       */
//      Boxa boxaRotateOrth(Boxa boxas, int w, int h, int rotation);
//      /**
//       * Original signature :
//       * <code>BOX* boxRotateOrth(BOX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:508</i>
//       */
//      Box boxRotateOrth(Box box, int w, int h, int rotation);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaSort(BOXA*, l_int32, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:510</i>
//       */
//      Boxa boxaSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaBinSort(BOXA*, l_int32, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:512</i>
//       */
//      Boxa boxaBinSort(Boxa boxas, int sorttype, int sortorder, PointerByReference pnaindex);
//  
//      /**
//       * Original signature : <code>BOXA* boxaSortByIndex(BOXA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:514</i>
//       */
//      Boxa boxaSortByIndex(Boxa boxas, Numa naindex);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaSort2d(BOXA*, NUMAA**, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:516</i>
//       */
//      Boxaa boxaSort2d(Boxa boxas, PointerByReference pnaad, int delta1, int delta2, int minh1);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaSort2dByIndex(BOXA*, NUMAA*)</code><br>
//       * <i>native declaration : allheaders.h:518</i>
//       */
//      Boxaa boxaSort2dByIndex(Boxa boxas, Numaa naa);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaExtractAsNuma(BOXA*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:520</i>
//       */
//      int boxaExtractAsNuma(Boxa boxa, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference pnaw, PointerByReference pnah, int keepinvalid);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaExtractAsPta(BOXA*, PTA**, PTA**, PTA**, PTA**, PTA**, PTA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:522</i>
//       */
//      int boxaExtractAsPta(Boxa boxa, PointerByReference pptal, PointerByReference pptat, PointerByReference pptar, PointerByReference pptab, PointerByReference pptaw, PointerByReference pptah, int keepinvalid);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaGetRankVals(BOXA*, l_float32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:524</i>
//       */
//      int boxaGetRankVals(Boxa boxa, float fract, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaGetMedianVals(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:526</i>
//       */
//      int boxaGetMedianVals(Boxa boxa, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaGetAverageSize(BOXA*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:528</i>
//       */
//      int boxaGetAverageSize(Boxa boxa, FloatBuffer pw, FloatBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:530</i>
//       */
//      int boxaaGetExtent(Boxaa baa, IntBuffer pw, IntBuffer ph, PointerByReference pbox, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaGetExtent(BOXAA*, l_int32*, l_int32*, BOX**, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:530</i>
//       */
//      int boxaaGetExtent(Boxaa baa, IntByReference pw, IntByReference ph, PointerByReference pbox, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaFlattenToBoxa(BOXAA*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:532</i>
//       */
//      Boxa boxaaFlattenToBoxa(Boxaa baa, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>BOXA* boxaaFlattenAligned(BOXAA*, l_int32, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:534</i>
//       */
//      Boxa boxaaFlattenAligned(Boxaa baa, int num, Box fillerbox, int copyflag);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaEncapsulateAligned(BOXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:536</i>
//       */
//      Boxaa boxaEncapsulateAligned(Boxa boxa, int num, int copyflag);
//  
//      /**
//       * Original signature : <code>BOXAA* boxaaTranspose(BOXAA*)</code><br>
//       * <i>native declaration : allheaders.h:538</i>
//       */
//      Boxaa boxaaTranspose(Boxaa baas);
//      /**
//       * Original signature :
//       * <code>l_int32 boxaaAlignBox(BOXAA*, BOX*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:540</i>
//       */
//      int boxaaAlignBox(Boxaa baa, Box box, int delta, IntBuffer pindex);
    /**
     * Original signature :
     * <code>PIX* pixMaskConnComp(PIX*, l_int32, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:542</i>
     */
    Pix pixMaskConnComp(Pix pixs, int connectivity, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMaskBoxa(PIX*, PIX*, BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:544</i>
     */
    Pix pixMaskBoxa(Pix pixd, Pix pixs, Boxa boxa, int op);

    /**
     * Original signature :
     * <code>PIX* pixPaintBoxa(PIX*, BOXA*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:546</i>
     */
    Pix pixPaintBoxa(Pix pixs, Boxa boxa, int val);

    /**
     * Original signature :
     * <code>PIX* pixSetBlackOrWhiteBoxa(PIX*, BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:548</i>
     */
    Pix pixSetBlackOrWhiteBoxa(Pix pixs, Boxa boxa, int op);

    /**
     * Original signature :
     * <code>PIX* pixPaintBoxaRandom(PIX*, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:550</i>
     */
    Pix pixPaintBoxaRandom(Pix pixs, Boxa boxa);

    /**
     * Original signature :
     * <code>PIX* pixBlendBoxaRandom(PIX*, BOXA*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:552</i>
     */
    Pix pixBlendBoxaRandom(Pix pixs, Boxa boxa, float fract);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxa(PIX*, BOXA*, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:554</i>
     */
    Pix pixDrawBoxa(Pix pixs, Boxa boxa, int width, int val);

    /**
     * Original signature :
     * <code>PIX* pixDrawBoxaRandom(PIX*, BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:556</i>
     */
    Pix pixDrawBoxaRandom(Pix pixs, Boxa boxa, int width);

    /**
     * Original signature :
     * <code>PIX* boxaaDisplay(PIX*, BOXAA*, l_int32, l_int32, l_uint32, l_uint32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:558</i>
     */
    Pix boxaaDisplay(Pix pixs, Boxaa baa, int linewba, int linewb, int colorba, int colorb, int w, int h);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayBoxaa(PIXA*, BOXAA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:560</i>
     */
    Pixa pixaDisplayBoxaa(Pixa pixas, Boxaa baa, int colorflag, int width);

    /**
     * Original signature :
     * <code>BOXA* pixSplitIntoBoxa(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:562</i>
     */
    Boxa pixSplitIntoBoxa(Pix pixs, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentIntoBoxa(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:564</i>
     */
    Boxa pixSplitComponentIntoBoxa(Pix pix, Box box, int minsum, int skipdist, int delta, int maxbg, int maxcomps, int remainder);
//
//    /**
//     * Original signature :
//     * <code>BOXA* makeMosaicStrips(l_int32, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:566</i>
//     */
//    Boxa makeMosaicStrips(int w, int h, int direction, int size);

    /**
     * Original signature :
     * <code>l_int32 boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:568</i>
     */
    int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntBuffer pnsame, FloatBuffer pdiffarea, FloatBuffer pdiffxor, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_int32 boxaCompareRegions(BOXA*, BOXA*, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:568</i>
     */
    int boxaCompareRegions(Boxa boxa1, Boxa boxa2, int areathresh, IntByReference pnsame, FloatByReference pdiffarea, FloatByReference pdiffxor, PointerByReference ppixdb);

//    /**
//     * Original signature :
//     * <code>BOX* pixSelectLargeULComp(PIX*, l_float32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:570</i>
//     */
//    Box pixSelectLargeULComp(Pix pixs, float areaslop, int yslop, int connectivity);
//
//    /**
//     * Original signature :
//     * <code>BOX* boxaSelectLargeULBox(BOXA*, l_float32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:572</i>
//     */
//    Box boxaSelectLargeULBox(Boxa boxas, float areaslop, int yslop);
    /**
     * Original signature :
     * <code>BOXA* boxaSelectRange(BOXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:574</i>
     */
    Boxa boxaSelectRange(Boxa boxas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXAA* boxaaSelectRange(BOXAA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:576</i>
     */
    Boxaa boxaaSelectRange(Boxaa baas, int first, int last, int copyflag);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectBySize(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:578</i>
     */
    Boxa boxaSelectBySize(Boxa boxas, int width, int height, int type, int relation, IntBuffer pchanged);

    /**
     * Original signature :
     * <code>NUMA* boxaMakeSizeIndicator(BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:580</i>
     */
    Numa boxaMakeSizeIndicator(Boxa boxa, int width, int height, int type, int relation);

    /**
     * Original signature :
     * <code>BOXA* boxaSelectByArea(BOXA*, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:582</i>
     */
    Boxa boxaSelectByArea(Boxa boxas, int area, int relation, IntBuffer pchanged);

//    /**
//     * Original signature :
//     * <code>NUMA* boxaMakeAreaIndicator(BOXA*, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:584</i>
//     */
//    Numa boxaMakeAreaIndicator(Boxa boxa, int area, int relation);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSelectByWHRatio(BOXA*, l_float32, l_int32, l_int32*)</code><br>
//     * <i>native declaration : allheaders.h:586</i>
//     */
//    Boxa boxaSelectByWHRatio(Boxa boxas, float ratio, int relation, IntBuffer pchanged);
//
//    /**
//     * Original signature :
//     * <code>NUMA* boxaMakeWHRatioIndicator(BOXA*, l_float32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:588</i>
//     */
//    Numa boxaMakeWHRatioIndicator(Boxa boxa, float ratio, int relation);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSelectWithIndicator(BOXA*, NUMA*, l_int32*)</code><br>
//     * <i>native declaration : allheaders.h:590</i>
//     */
//    Boxa boxaSelectWithIndicator(Boxa boxas, Numa na, IntBuffer pchanged);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaPermutePseudorandom(BOXA*)</code><br>
//     * <i>native declaration : allheaders.h:592</i>
//     */
//    Boxa boxaPermutePseudorandom(Boxa boxas);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaPermuteRandom(BOXA*, BOXA*)</code><br>
//     * <i>native declaration : allheaders.h:594</i>
//     */
//    Boxa boxaPermuteRandom(Boxa boxad, Boxa boxas);
    /**
     * Original signature :
     * <code>l_int32 boxaSwapBoxes(BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:596</i>
     */
    int boxaSwapBoxes(Boxa boxa, int i, int j);

    /**
     * Original signature :
     * <code>PTA* boxaConvertToPta(BOXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:598</i>
     */
    Pta boxaConvertToPta(Boxa boxa, int ncorners);

    /**
     * Original signature :
     * <code>BOXA* ptaConvertToBoxa(PTA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:600</i>
     */
    Boxa ptaConvertToBoxa(Pta pta, int ncorners);

    /**
     * Original signature : <code>PTA* boxConvertToPta(BOX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:602</i>
     */
    Pta boxConvertToPta(Box box, int ncorners);

    /**
     * Original signature : <code>BOX* ptaConvertToBox(PTA*)</code><br>
     * <i>native declaration : allheaders.h:604</i>
     */
    Box ptaConvertToBox(Pta pta);

//    /**
//     * Original signature :
//     * <code>BOXA* boxaSmoothSequenceLS(BOXA*, l_float32, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:606</i>
//     */
//    Boxa boxaSmoothSequenceLS(Boxa boxas, float factor, int subflag, int maxdiff, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaSmoothSequenceMedian(BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:608</i>
//     */
//    Boxa boxaSmoothSequenceMedian(Boxa boxas, int halfwin, int subflag, int maxdiff, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaLinearFit(BOXA*, l_float32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:610</i>
//     */
//    Boxa boxaLinearFit(Boxa boxas, float factor, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaWindowedMedian(BOXA*, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:612</i>
//     */
//    Boxa boxaWindowedMedian(Boxa boxas, int halfwin, int debug);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaModifyWithBoxa(BOXA*, BOXA*, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:614</i>
//     */
//    Boxa boxaModifyWithBoxa(Boxa boxas, Boxa boxam, int subflag, int maxdiff);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaConstrainSize(BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:616</i>
//     */
//    Boxa boxaConstrainSize(Boxa boxas, int width, int widthflag, int height, int heightflag);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaReconcileEvenOddHeight(BOXA*, l_int32, l_int32, l_int32, l_float32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:618</i>
//     */
//    Boxa boxaReconcileEvenOddHeight(Boxa boxas, int sides, int delh, int op, float factor, int start);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaReconcilePairWidth(BOXA*, l_int32, l_int32, l_float32, NUMA*)</code><br>
//     * <i>native declaration : allheaders.h:620</i>
//     */
//    Boxa boxaReconcilePairWidth(Boxa boxas, int delw, int op, float factor, Numa na);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:622</i>
//     */
//    int boxaPlotSides(Boxa boxa, String plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaPlotSides(BOXA*, const char*, NUMA**, NUMA**, NUMA**, NUMA**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:622</i>
//     */
//    int boxaPlotSides(Boxa boxa, Pointer plotname, PointerByReference pnal, PointerByReference pnat, PointerByReference pnar, PointerByReference pnab, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:624</i>
//     */
//    int boxaPlotSizes(Boxa boxa, String plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaPlotSizes(BOXA*, const char*, NUMA**, NUMA**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:624</i>
//     */
//    int boxaPlotSizes(Boxa boxa, Pointer plotname, PointerByReference pnaw, PointerByReference pnah, PointerByReference ppixd);
//
//    /**
//     * Original signature :
//     * <code>BOXA* boxaFillSequence(BOXA*, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:626</i>
//     */
//    Boxa boxaFillSequence(Boxa boxas, int useflag, int debug);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code><br>
//     * <i>native declaration : allheaders.h:628</i>
//     */
//    int boxaGetExtent(Boxa boxa, IntBuffer pw, IntBuffer ph, PointerByReference pbox);
//
//    /**
//     * Original signature :
//     * <code>l_int32 boxaGetExtent(BOXA*, l_int32*, l_int32*, BOX**)</code><br>
//     * <i>native declaration : allheaders.h:628</i>
//     */
//    int boxaGetExtent(Boxa boxa, IntByReference pw, IntByReference ph, PointerByReference pbox);
    /**
     * Original signature :
     * <code>l_int32 boxaGetCoverage(BOXA*, l_int32, l_int32, l_int32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:630</i>
     */
    int boxaGetCoverage(Boxa boxa, int wc, int hc, int exactflag, FloatBuffer pfract);

    /**
     * Original signature :
     * <code>l_int32 boxaaSizeRange(BOXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:632</i>
     */
    int boxaaSizeRange(Boxaa baa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_int32 boxaSizeRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:634</i>
     */
    int boxaSizeRange(Boxa boxa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);

    /**
     * Original signature :
     * <code>l_int32 boxaLocationRange(BOXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:636</i>
     */
    int boxaLocationRange(Boxa boxa, IntBuffer pminx, IntBuffer pminy, IntBuffer pmaxx, IntBuffer pmaxy);

    /**
     * Original signature :
     * <code>l_int32 boxaGetSizes(BOXA*, NUMA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:638</i>
     */
    int boxaGetSizes(Boxa boxa, PointerByReference pnaw, PointerByReference pnah);

    /**
     * Original signature :
     * <code>l_int32 boxaGetArea(BOXA*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:640</i>
     */
    int boxaGetArea(Boxa boxa, IntBuffer parea);

    /**
     * Original signature :
     * <code>PIX* boxaDisplayTiled(BOXA*, PIXA*, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:642</i>
     */
    Pix boxaDisplayTiled(Boxa boxas, Pixa pixa, int maxwidth, int linewidth, float scalefactor, int background, int spacing, int border);
//  
//      /**
//       * Original signature : <code>L_BYTEA* l_byteaCreate(size_t)</code><br>
//       * <i>native declaration : allheaders.h:644</i>
//       */
//      L_Bytea l_byteaCreate(NativeSize nbytes);

//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromMem(l_uint8*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:646</i>
//       */
//      L_Bytea l_byteaInitFromMem(ByteBuffer data, NativeSize size);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromFile(const char*)</code><br>
//       * <i>native declaration : allheaders.h:648</i>
//       */
//      L_Bytea l_byteaInitFromFile(String fname);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaInitFromStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:650</i>
//       */
//      L_Bytea l_byteaInitFromStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>L_BYTEA* l_byteaCopy(L_BYTEA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:652</i>
//       */
//      L_Bytea l_byteaCopy(L_Bytea bas, int copyflag);
//  
//      /**
//       * Original signature : <code>void l_byteaDestroy(L_BYTEA**)</code><br>
//       * <i>native declaration : allheaders.h:654</i>
//       */
//      void l_byteaDestroy(PointerByReference pba);
//  
//      /**
//       * Original signature : <code>size_t l_byteaGetSize(L_BYTEA*)</code><br>
//       * <i>native declaration : allheaders.h:656</i>
//       */
//      NativeSize l_byteaGetSize(L_Bytea ba);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_byteaGetData(L_BYTEA*, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:658</i>
//       */
//      Pointer l_byteaGetData(L_Bytea ba, NativeSizeByReference psize);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_byteaCopyData(L_BYTEA*, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:660</i>
//       */
//      Pointer l_byteaCopyData(L_Bytea ba, NativeSizeByReference psize);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaAppendData(L_BYTEA*, l_uint8*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:662</i>
//       */
//      int l_byteaAppendData(L_Bytea ba, ByteBuffer newdata, NativeSize newbytes);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaAppendString(L_BYTEA*, char*)</code><br>
//       * <i>native declaration : allheaders.h:664</i>
//       */
//      int l_byteaAppendString(L_Bytea ba, ByteBuffer str);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaJoin(L_BYTEA*, L_BYTEA**)</code><br>
//       * <i>native declaration : allheaders.h:666</i>
//       */
//      int l_byteaJoin(L_Bytea ba1, PointerByReference pba2);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaSplit(L_BYTEA*, size_t, L_BYTEA**)</code><br>
//       * <i>native declaration : allheaders.h:668</i>
//       */
//      int l_byteaSplit(L_Bytea ba1, NativeSize splitloc, PointerByReference pba2);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaFindEachSequence(L_BYTEA*, l_uint8*, l_int32, L_DNA**)</code><br>
//       * <i>native declaration : allheaders.h:670</i>
//       */
//      int l_byteaFindEachSequence(L_Bytea ba, ByteBuffer sequence, int seqlen, PointerByReference pda);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaFindEachSequence(L_BYTEA*, l_uint8*, l_int32, L_DNA**)</code><br>
//       * <i>native declaration : allheaders.h:670</i>
//       */
//      int l_byteaFindEachSequence(L_Bytea ba, Pointer sequence, int seqlen, PointerByReference pda);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaWrite(const char*, L_BYTEA*, size_t, size_t)</code><br>
//       * <i>native declaration : allheaders.h:672</i>
//       */
//      int l_byteaWrite(String fname, L_Bytea ba, NativeSize startloc, NativeSize endloc);
//      /**
//       * Original signature :
//       * <code>l_int32 l_byteaWriteStream(FILE*, L_BYTEA*, size_t, size_t)</code><br>
//       * <i>native declaration : allheaders.h:674</i>
//       */
//      int l_byteaWriteStream(FILE fp, L_Bytea ba, NativeSize startloc, NativeSize endloc);
    /**
     * Original signature : <code>CCBORDA* ccbaCreate(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:676</i>
     */
    CCBorda ccbaCreate(Pix pixs, int n);

    /**
     * Original signature : <code>void ccbaDestroy(CCBORDA**)</code><br>
     * <i>native declaration : allheaders.h:678</i>
     */
    void ccbaDestroy(PointerByReference pccba);

    /**
     * Original signature : <code>CCBORD* ccbCreate(PIX*)</code><br>
     * <i>native declaration : allheaders.h:680</i>
     */
    CCBord ccbCreate(Pix pixs);

    /**
     * Original signature : <code>void ccbDestroy(CCBORD**)</code><br>
     * <i>native declaration : allheaders.h:682</i>
     */
    void ccbDestroy(PointerByReference pccb);

    /**
     * Original signature :
     * <code>l_int32 ccbaAddCcb(CCBORDA*, CCBORD*)</code><br>
     * <i>native declaration : allheaders.h:684</i>
     */
    int ccbaAddCcb(CCBorda ccba, CCBord ccb);

    /**
     * Original signature : <code>l_int32 ccbaGetCount(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:686</i>
     */
    int ccbaGetCount(CCBorda ccba);

    /**
     * Original signature :
     * <code>CCBORD* ccbaGetCcb(CCBORDA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:688</i>
     */
    CCBord ccbaGetCcb(CCBorda ccba, int index);

    /**
     * Original signature : <code>CCBORDA* pixGetAllCCBorders(PIX*)</code><br>
     * <i>native declaration : allheaders.h:690</i>
     */
    CCBorda pixGetAllCCBorders(Pix pixs);

    /**
     * Original signature : <code>CCBORD* pixGetCCBorders(PIX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:692</i>
     */
    CCBord pixGetCCBorders(Pix pixs, Box box);

    /**
     * Original signature : <code>PTAA* pixGetOuterBordersPtaa(PIX*)</code><br>
     * <i>native declaration : allheaders.h:694</i>
     */
    Ptaa pixGetOuterBordersPtaa(Pix pixs);

    /**
     * Original signature :
     * <code>PTA* pixGetOuterBorderPta(PIX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:696</i>
     */
    Pta pixGetOuterBorderPta(Pix pixs, Box box);

    /**
     * Original signature :
     * <code>l_int32 pixGetOuterBorder(CCBORD*, PIX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:698</i>
     */
    int pixGetOuterBorder(CCBord ccb, Pix pixs, Box box);

    /**
     * Original signature :
     * <code>l_int32 pixGetHoleBorder(CCBORD*, PIX*, BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:700</i>
     */
    int pixGetHoleBorder(CCBord ccb, Pix pixs, Box box, int xs, int ys);

    /**
     * Original signature :
     * <code>l_int32 findNextBorderPixel(l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:702</i>
     */
    int findNextBorderPixel(int w, int h, IntBuffer data, int wpl, int px, int py, IntBuffer pqpos, IntBuffer pnpx, IntBuffer pnpy);

    /**
     * Original signature :
     * <code>void locateOutsideSeedPixel(l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:704</i>
     */
    void locateOutsideSeedPixel(int fpx, int fpy, int spx, int spy, IntBuffer pxs, IntBuffer pys);

    /**
     * Original signature :
     * <code>l_int32 ccbaGenerateGlobalLocs(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:706</i>
     */
    int ccbaGenerateGlobalLocs(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_int32 ccbaGenerateStepChains(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:708</i>
     */
    int ccbaGenerateStepChains(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_int32 ccbaStepChainsToPixCoords(CCBORDA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:710</i>
     */
    int ccbaStepChainsToPixCoords(CCBorda ccba, int coordtype);

    /**
     * Original signature :
     * <code>l_int32 ccbaGenerateSPGlobalLocs(CCBORDA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:712</i>
     */
    int ccbaGenerateSPGlobalLocs(CCBorda ccba, int ptsflag);

    /**
     * Original signature :
     * <code>l_int32 ccbaGenerateSinglePath(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:714</i>
     */
    int ccbaGenerateSinglePath(CCBorda ccba);

    /**
     * Original signature :
     * <code>PTA* getCutPathForHole(PIX*, PTA*, BOX*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:716</i>
     */
    Pta getCutPathForHole(Pix pix, Pta pta, Box boxinner, IntBuffer pdir, IntBuffer plen);

    /**
     * Original signature : <code>PIX* ccbaDisplayBorder(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:718</i>
     */
    Pix ccbaDisplayBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplaySPBorder(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:720</i>
     */
    Pix ccbaDisplaySPBorder(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage1(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:722</i>
     */
    Pix ccbaDisplayImage1(CCBorda ccba);

    /**
     * Original signature : <code>PIX* ccbaDisplayImage2(CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:724</i>
     */
    Pix ccbaDisplayImage2(CCBorda ccba);

    /**
     * Original signature :
     * <code>l_int32 ccbaWrite(const char*, CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:726</i>
     */
    int ccbaWrite(String filename, CCBorda ccba);

//      /**
//       * Original signature :
//       * <code>l_int32 ccbaWriteStream(FILE*, CCBORDA*)</code><br>
//       * <i>native declaration : allheaders.h:728</i>
//       */
//      int ccbaWriteStream(FILE fp, CCBorda ccba);
    /**
     * Original signature : <code>CCBORDA* ccbaRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:730</i>
     */
    CCBorda ccbaRead(String filename);
//  
//      /**
//       * Original signature : <code>CCBORDA* ccbaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:732</i>
//       */
//      CCBorda ccbaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_int32 ccbaWriteSVG(const char*, CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:734</i>
     */
    int ccbaWriteSVG(String filename, CCBorda ccba);

    /**
     * Original signature :
     * <code>char* ccbaWriteSVGString(const char*, CCBORDA*)</code><br>
     * <i>native declaration : allheaders.h:736</i>
     */
    Pointer ccbaWriteSVGString(String filename, CCBorda ccba);

    /**
     * Original signature :
     * <code>PIXA* pixaThinConnected(PIXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:738</i>
     */
    Pixa pixaThinConnected(Pixa pixas, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnected(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:740</i>
     */
    Pix pixThinConnected(Pix pixs, int type, int connectivity, int maxiters);

    /**
     * Original signature :
     * <code>PIX* pixThinConnectedBySet(PIX*, l_int32, SELA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:742</i>
     */
    Pix pixThinConnectedBySet(Pix pixs, int type, Sela sela, int maxiters);

    /**
     * Original signature :
     * <code>SELA* selaMakeThinSets(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:744</i>
     */
    Sela selaMakeThinSets(int index, int debug);

    /**
     * Original signature :
     * <code>l_int32 jbCorrelation(const char*, l_float32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:746</i>
     */
    int jbCorrelation(String dirin, float thresh, float weight, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>l_int32 jbRankHaus(const char*, l_int32, l_float32, l_int32, const char*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:748</i>
     */
    int jbRankHaus(String dirin, int size, float rank, int components, String rootname, int firstpage, int npages, int renderflag);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:750</i>
     */
    JbClasser jbWordsInTextlines(String dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>JBCLASSER* jbWordsInTextlines(const char*, l_int32, l_int32, l_int32, l_float32, l_float32, NUMA**, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:750</i>
     */
    JbClasser jbWordsInTextlines(Pointer dirin, int reduction, int maxwidth, int maxheight, float thresh, float weight, PointerByReference pnatl, int firstpage, int npages);

    /**
     * Original signature :
     * <code>l_int32 pixGetWordsInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, BOXA**, PIXA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:752</i>
     */
    int pixGetWordsInTextlines(Pix pixs, int reduction, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>l_int32 pixGetWordBoxesInTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, BOXA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:754</i>
     */
    int pixGetWordBoxesInTextlines(Pix pixs, int reduction, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference pnai);

    /**
     * Original signature :
     * <code>NUMAA* boxaExtractSortedPattern(BOXA*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:756</i>
     */
    Numaa boxaExtractSortedPattern(Boxa boxa, Numa na);

    /**
     * Original signature :
     * <code>l_int32 numaaCompareImagesByBoxes(NUMAA*, NUMAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:758</i>
     */
    int numaaCompareImagesByBoxes(Numaa naa1, Numaa naa2, int nperline, int nreq, int maxshiftx, int maxshifty, int delx, int dely, IntBuffer psame, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixColorContent(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:760</i>
     */
    int pixColorContent(Pix pixs, int rwhite, int gwhite, int bwhite, int mingray, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);

    /**
     * Original signature :
     * <code>PIX* pixColorMagnitude(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:762</i>
     */
    Pix pixColorMagnitude(Pix pixs, int rwhite, int gwhite, int bwhite, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorPixels(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:764</i>
     */
    Pix pixMaskOverColorPixels(Pix pixs, int threshdiff, int mindist);

    /**
     * Original signature :
     * <code>PIX* pixMaskOverColorRange(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:766</i>
     */
    Pix pixMaskOverColorRange(Pix pixs, int rmin, int rmax, int gmin, int gmax, int bmin, int bmax);

    /**
     * Original signature :
     * <code>l_int32 pixColorFraction(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:768</i>
     */
    int pixColorFraction(Pix pixs, int darkthresh, int lightthresh, int diffthresh, int factor, FloatBuffer ppixfract, FloatBuffer pcolorfract);

    /**
     * Original signature :
     * <code>l_int32 pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:770</i>
     */
    int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatBuffer pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 pixFindColorRegions(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32*, PIX**, PIX**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:770</i>
     */
    int pixFindColorRegions(Pix pixs, Pix pixm, int factor, int lightthresh, int darkthresh, int mindiff, int colordiff, float edgefract, FloatByReference pcolorfract, PointerByReference pcolormask1, PointerByReference pcolormask2, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 pixNumSignificantGrayColors(PIX*, l_int32, l_int32, l_float32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:772</i>
     */
    int pixNumSignificantGrayColors(Pix pixs, int darkthresh, int lightthresh, float minfract, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_int32 pixColorsForQuantization(PIX*, l_int32, l_int32*, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:774</i>
     */
    int pixColorsForQuantization(Pix pixs, int thresh, IntBuffer pncolors, IntBuffer piscolor, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixNumColors(PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:776</i>
     */
    int pixNumColors(Pix pixs, int factor, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_int32 pixGetMostPopulatedColors(PIX*, l_int32, l_int32, l_int32, l_uint32**, PIXCMAP**)</code><br>
     * <i>native declaration : allheaders.h:778</i>
     */
    int pixGetMostPopulatedColors(Pix pixs, int sigbits, int factor, int ncolors, PointerByReference parray, PointerByReference pcmap);

    /**
     * Original signature :
     * <code>PIX* pixSimpleColorQuantize(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:780</i>
     */
    Pix pixSimpleColorQuantize(Pix pixs, int sigbits, int factor, int ncolors);

    /**
     * Original signature :
     * <code>NUMA* pixGetRGBHistogram(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:782</i>
     */
    Numa pixGetRGBHistogram(Pix pixs, int sigbits, int factor);

    /**
     * Original signature :
     * <code>l_int32 makeRGBIndexTables(l_uint32**, l_uint32**, l_uint32**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:784</i>
     */
    int makeRGBIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int sigbits);

    /**
     * Original signature :
     * <code>l_int32 getRGBFromIndex(l_uint32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:786</i>
     */
    int getRGBFromIndex(int index, int sigbits, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:788</i>
     */
    int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntBuffer phasred, FloatBuffer pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_int32 pixHasHighlightRed(PIX*, l_int32, l_float32, l_float32, l_int32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:788</i>
     */
    int pixHasHighlightRed(Pix pixs, int factor, float fract, float fthresh, IntByReference phasred, FloatByReference pratio, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayRegions(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:790</i>
     */
    Pix pixColorGrayRegions(Pix pixs, Boxa boxa, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixColorGray(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:792</i>
     */
    int pixColorGray(Pix pixs, Box box, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixColorGrayMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:794</i>
     */
    Pix pixColorGrayMasked(Pix pixs, Pix pixm, int type, int thresh, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>PIX* pixSnapColor(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:796</i>
     */
    Pix pixSnapColor(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixSnapColorCmap(PIX*, PIX*, l_uint32, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:798</i>
     */
    Pix pixSnapColorCmap(Pix pixd, Pix pixs, int srcval, int dstval, int diff);

    /**
     * Original signature :
     * <code>PIX* pixLinearMapToTargetColor(PIX*, PIX*, l_uint32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:800</i>
     */
    Pix pixLinearMapToTargetColor(Pix pixd, Pix pixs, int srcval, int dstval);

    /**
     * Original signature :
     * <code>l_int32 pixelLinearMapToTargetColor(l_uint32, l_uint32, l_uint32, l_uint32*)</code><br>
     * <i>native declaration : allheaders.h:802</i>
     */
    int pixelLinearMapToTargetColor(int scolor, int srcmap, int dstmap, IntBuffer pdcolor);

    /**
     * Original signature :
     * <code>PIX* pixShiftByComponent(PIX*, PIX*, l_uint32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:804</i>
     */
    Pix pixShiftByComponent(Pix pixd, Pix pixs, int srcval, int dstval);

//      /**
//       * Original signature :
//       * <code>l_int32 pixelShiftByComponent(l_int32, l_int32, l_int32, l_uint32, l_uint32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:806</i>
//       */
//      int pixelShiftByComponent(int rval, int gval, int bval, int srcval, int dstval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>l_int32 pixelFractionalShift(l_int32, l_int32, l_int32, l_float32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:808</i>
//       */
//      int pixelFractionalShift(int rval, int gval, int bval, float fraction, IntBuffer ppixel);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:810</i>
//       */
//      PixColormap pixcmapCreate(int depth);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapCreateRandom(l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:812</i>
//       */
//      PixColormap pixcmapCreateRandom(int depth, int hasblack, int haswhite);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapCreateLinear(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:814</i>
//       */
//      PixColormap pixcmapCreateLinear(int d, int nlevels);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapCopy(PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:816</i>
//       */
//      PixColormap pixcmapCopy(PixColormap cmaps);
//  
//      /**
//       * Original signature : <code>void pixcmapDestroy(PIXCMAP**)</code><br>
//       * <i>native declaration : allheaders.h:818</i>
//       */
//      void pixcmapDestroy(PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapAddColor(PIXCMAP*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:820</i>
//       */
//      int pixcmapAddColor(PixColormap cmap, int rval, int gval, int bval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapAddRGBA(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:822</i>
//       */
//      int pixcmapAddRGBA(PixColormap cmap, int rval, int gval, int bval, int aval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapAddNewColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:824</i>
//       */
//      int pixcmapAddNewColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapAddNearestColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:826</i>
//       */
//      int pixcmapAddNearestColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapUsableColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:828</i>
//       */
//      int pixcmapUsableColor(PixColormap cmap, int rval, int gval, int bval, IntBuffer pusable);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapAddBlackOrWhite(PIXCMAP*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:830</i>
//       */
//      int pixcmapAddBlackOrWhite(PixColormap cmap, int color, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapSetBlackAndWhite(PIXCMAP*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:832</i>
//       */
//      int pixcmapSetBlackAndWhite(PixColormap cmap, int setblack, int setwhite);
//  
//      /**
//       * Original signature : <code>l_int32 pixcmapGetCount(PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:834</i>
//       */
//      int pixcmapGetCount(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetFreeCount(PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:836</i>
//       */
//      int pixcmapGetFreeCount(PixColormap cmap);
//  
//      /**
//       * Original signature : <code>l_int32 pixcmapGetDepth(PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:838</i>
//       */
//      int pixcmapGetDepth(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetMinDepth(PIXCMAP*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:840</i>
//       */
//      int pixcmapGetMinDepth(PixColormap cmap, IntBuffer pmindepth);
//  
//      /**
//       * Original signature : <code>l_int32 pixcmapClear(PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:842</i>
//       */
//      int pixcmapClear(PixColormap cmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetColor(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:844</i>
//       */
//      int pixcmapGetColor(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetColor32(PIXCMAP*, l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:846</i>
//       */
//      int pixcmapGetColor32(PixColormap cmap, int index, IntBuffer pval32);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetRGBA(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:848</i>
//       */
//      int pixcmapGetRGBA(PixColormap cmap, int index, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetRGBA32(PIXCMAP*, l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:850</i>
//       */
//      int pixcmapGetRGBA32(PixColormap cmap, int index, IntBuffer pval32);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapResetColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:852</i>
//       */
//      int pixcmapResetColor(PixColormap cmap, int index, int rval, int gval, int bval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapSetAlpha(PIXCMAP*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:854</i>
//       */
//      int pixcmapSetAlpha(PixColormap cmap, int index, int aval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:856</i>
//       */
//      int pixcmapGetIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapHasColor(PIXCMAP*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:858</i>
//       */
//      int pixcmapHasColor(PixColormap cmap, IntBuffer pcolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapIsOpaque(PIXCMAP*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:860</i>
//       */
//      int pixcmapIsOpaque(PixColormap cmap, IntBuffer popaque);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapIsBlackAndWhite(PIXCMAP*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:862</i>
//       */
//      int pixcmapIsBlackAndWhite(PixColormap cmap, IntBuffer pblackwhite);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapCountGrayColors(PIXCMAP*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:864</i>
//       */
//      int pixcmapCountGrayColors(PixColormap cmap, IntBuffer pngray);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetRankIntensity(PIXCMAP*, l_float32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:866</i>
//       */
//      int pixcmapGetRankIntensity(PixColormap cmap, float rankval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetNearestIndex(PIXCMAP*, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:868</i>
//       */
//      int pixcmapGetNearestIndex(PixColormap cmap, int rval, int gval, int bval, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGetNearestGrayIndex(PIXCMAP*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:870</i>
//       */
//      int pixcmapGetNearestGrayIndex(PixColormap cmap, int val, IntBuffer pindex);
    /**
     * Original signature :
     * <code>l_int32 pixcmapGetDistanceToColor(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:872</i>
     */
    int pixcmapGetDistanceToColor(PixColormap cmap, int index, int rval, int gval, int bval, IntBuffer pdist);

    /**
     * Original signature :
     * <code>l_int32 pixcmapGetRangeValues(PIXCMAP*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:874</i>
     */
    int pixcmapGetRangeValues(PixColormap cmap, int select, IntBuffer pminval, IntBuffer pmaxval, IntBuffer pminindex, IntBuffer pmaxindex);

//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapGrayToColor(l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:876</i>
//       */
//      PixColormap pixcmapGrayToColor(int color);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapColorToGray(PIXCMAP*, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:878</i>
//       */
//      PixColormap pixcmapColorToGray(PixColormap cmaps, float rwt, float gwt, float bwt);
    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapConvertTo4(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:880</i>
     */
    PixColormap pixcmapConvertTo4(PixColormap cmaps);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapConvertTo8(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:882</i>
     */
    PixColormap pixcmapConvertTo8(PixColormap cmaps);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:884</i>
//       */
//      PixColormap pixcmapRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXCMAP* pixcmapReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:886</i>
//       */
//      PixColormap pixcmapReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXCMAP* pixcmapReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:888</i>
     */
    PixColormap pixcmapReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 pixcmapWrite(const char*, PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:890</i>
     */
    int pixcmapWrite(String filename, PixColormap cmap);

//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapWriteStream(FILE*, PIXCMAP*)</code><br>
//       * <i>native declaration : allheaders.h:892</i>
//       */
//      int pixcmapWriteStream(FILE fp, PixColormap cmap);
    /**
     * Original signature :
     * <code>l_int32 pixcmapWriteMem(l_uint8**, size_t*, PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:894</i>
     */
    int pixcmapWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixColormap cmap);

//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapToArrays(PIXCMAP*, l_int32**, l_int32**, l_int32**, l_int32**)</code><br>
//       * <i>native declaration : allheaders.h:896</i>
//       */
//      int pixcmapToArrays(PixColormap cmap, PointerByReference prmap, PointerByReference pgmap, PointerByReference pbmap, PointerByReference pamap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapToRGBTable(PIXCMAP*, l_uint32**, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:898</i>
//       */
//      int pixcmapToRGBTable(PixColormap cmap, PointerByReference ptab, IntBuffer pncolors);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapSerializeToMemory(PIXCMAP*, l_int32, l_int32*, l_uint8**)</code><br>
//       * <i>native declaration : allheaders.h:900</i>
//       */
//      int pixcmapSerializeToMemory(PixColormap cmap, int cpc, IntBuffer pncolors, PointerByReference pdata);
//      /**
//       * Original signature :
//       * <code>PIXCMAP* pixcmapDeserializeFromMemory(l_uint8*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:902</i>
//       */
//      PixColormap pixcmapDeserializeFromMemory(ByteBuffer data, int cpc, int ncolors);
//      /**
//       * Original signature :
//       * <code>char* pixcmapConvertToHex(l_uint8*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:904</i>
//       */
//      Pointer pixcmapConvertToHex(ByteBuffer data, int ncolors);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapGammaTRC(PIXCMAP*, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:906</i>
//       */
//      int pixcmapGammaTRC(PixColormap cmap, float gamma, int minval, int maxval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapContrastTRC(PIXCMAP*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:908</i>
//       */
//      int pixcmapContrastTRC(PixColormap cmap, float factor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapShiftIntensity(PIXCMAP*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:910</i>
//       */
//      int pixcmapShiftIntensity(PixColormap cmap, float fraction);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcmapShiftByComponent(PIXCMAP*, l_uint32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:912</i>
//       */
//      int pixcmapShiftByComponent(PixColormap cmap, int srcval, int dstval);
    /**
     * Original signature :
     * <code>PIX* pixColorMorph(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:914</i>
     */
    Pix pixColorMorph(Pix pixs, int type, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuant(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:916</i>
     */
    Pix pixOctreeColorQuant(Pix pixs, int colors, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeColorQuantGeneral(PIX*, l_int32, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:918</i>
     */
    Pix pixOctreeColorQuantGeneral(Pix pixs, int colors, int ditherflag, float validthresh, float colorthresh);

    /**
     * Original signature :
     * <code>l_int32 makeRGBToIndexTables(l_uint32**, l_uint32**, l_uint32**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:920</i>
     */
    int makeRGBToIndexTables(PointerByReference prtab, PointerByReference pgtab, PointerByReference pbtab, int cqlevels);

    /**
     * Original signature :
     * <code>void getOctcubeIndexFromRGB(l_int32, l_int32, l_int32, l_uint32*, l_uint32*, l_uint32*, l_uint32*)</code><br>
     * <i>native declaration : allheaders.h:922</i>
     */
    void getOctcubeIndexFromRGB(int rval, int gval, int bval, IntBuffer rtab, IntBuffer gtab, IntBuffer btab, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantByPopulation(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:924</i>
     */
    Pix pixOctreeQuantByPopulation(Pix pixs, int level, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixOctreeQuantNumColors(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:926</i>
     */
    Pix pixOctreeQuantNumColors(Pix pixs, int maxcolors, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantMixedWithGray(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:928</i>
     */
    Pix pixOctcubeQuantMixedWithGray(Pix pixs, int depth, int graylevels, int delta);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuant256(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:930</i>
     */
    Pix pixFixedOctcubeQuant256(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant1(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:932</i>
     */
    Pix pixFewColorsOctcubeQuant1(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuant2(PIX*, l_int32, NUMA*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:934</i>
     */
    Pix pixFewColorsOctcubeQuant2(Pix pixs, int level, Numa na, int ncolors, IntBuffer pnerrors);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsOctcubeQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:936</i>
     */
    Pix pixFewColorsOctcubeQuantMixed(Pix pixs, int level, int darkthresh, int lightthresh, int diffthresh, float minfract, int maxspan);

    /**
     * Original signature :
     * <code>PIX* pixFixedOctcubeQuantGenRGB(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:938</i>
     */
    Pix pixFixedOctcubeQuantGenRGB(Pix pixs, int level);

    /**
     * Original signature :
     * <code>PIX* pixQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:940</i>
     */
    Pix pixQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>PIX* pixOctcubeQuantFromCmap(PIX*, PIXCMAP*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:942</i>
     */
    Pix pixOctcubeQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth, int level, int metric);

    /**
     * Original signature :
     * <code>NUMA* pixOctcubeHistogram(PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:944</i>
     */
    Numa pixOctcubeHistogram(Pix pixs, int level, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>l_int32* pixcmapToOctcubeLUT(PIXCMAP*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:946</i>
     */
    IntByReference pixcmapToOctcubeLUT(PixColormap cmap, int level, int metric);

    /**
     * Original signature : <code>l_int32 pixRemoveUnusedColors(PIX*)</code><br>
     * <i>native declaration : allheaders.h:948</i>
     */
    int pixRemoveUnusedColors(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixNumberOccupiedOctcubes(PIX*, l_int32, l_int32, l_float32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:950</i>
     */
    int pixNumberOccupiedOctcubes(Pix pix, int level, int mincount, float minfract, IntBuffer pncolors);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuant(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:952</i>
     */
    Pix pixMedianCutQuant(Pix pixs, int ditherflag);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:954</i>
     */
    Pix pixMedianCutQuantGeneral(Pix pixs, int ditherflag, int outdepth, int maxcolors, int sigbits, int maxsub, int checkbw);

    /**
     * Original signature :
     * <code>PIX* pixMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:956</i>
     */
    Pix pixMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>PIX* pixFewColorsMedianCutQuantMixed(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:958</i>
     */
    Pix pixFewColorsMedianCutQuantMixed(Pix pixs, int ncolor, int ngray, int maxncolors, int darkthresh, int lightthresh, int diffthresh);

    /**
     * Original signature :
     * <code>l_int32* pixMedianCutHisto(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:960</i>
     */
    IntByReference pixMedianCutHisto(Pix pixs, int sigbits, int subsample);

    /**
     * Original signature :
     * <code>PIX* pixColorSegment(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:962</i>
     */
    Pix pixColorSegment(Pix pixs, int maxdist, int maxcolors, int selsize, int finalcolors, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixColorSegmentCluster(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:964</i>
     */
    Pix pixColorSegmentCluster(Pix pixs, int maxdist, int maxcolors, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixAssignToNearestColor(PIX*, PIX*, PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:966</i>
     */
    int pixAssignToNearestColor(Pix pixd, Pix pixs, Pix pixm, int level, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_int32 pixColorSegmentClean(PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:968</i>
     */
    int pixColorSegmentClean(Pix pixs, int selsize, IntBuffer countarray);

    /**
     * Original signature :
     * <code>l_int32 pixColorSegmentRemoveColors(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:970</i>
     */
    int pixColorSegmentRemoveColors(Pix pixd, Pix pixs, int finalcolors);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHSV(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:972</i>
     */
    Pix pixConvertRGBToHSV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertHSVToRGB(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:974</i>
     */
    Pix pixConvertHSVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 convertRGBToHSV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:976</i>
     */
    int convertRGBToHSV(int rval, int gval, int bval, IntBuffer phval, IntBuffer psval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_int32 convertHSVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:978</i>
     */
    int convertHSVToRGB(int hval, int sval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 pixcmapConvertRGBToHSV(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:980</i>
     */
    int pixcmapConvertRGBToHSV(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_int32 pixcmapConvertHSVToRGB(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:982</i>
     */
    int pixcmapConvertHSVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>PIX* pixConvertRGBToHue(PIX*)</code><br>
     * <i>native declaration : allheaders.h:984</i>
     */
    Pix pixConvertRGBToHue(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToSaturation(PIX*)</code><br>
     * <i>native declaration : allheaders.h:986</i>
     */
    Pix pixConvertRGBToSaturation(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToValue(PIX*)</code><br>
     * <i>native declaration : allheaders.h:988</i>
     */
    Pix pixConvertRGBToValue(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHS(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:990</i>
     */
    Pix pixMakeRangeMaskHS(Pix pixs, int huecenter, int huehw, int satcenter, int sathw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskHV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:992</i>
     */
    Pix pixMakeRangeMaskHV(Pix pixs, int huecenter, int huehw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeRangeMaskSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:994</i>
     */
    Pix pixMakeRangeMaskSV(Pix pixs, int satcenter, int sathw, int valcenter, int valhw, int regionflag);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHS(PIX*, l_int32, NUMA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:996</i>
     */
    Pix pixMakeHistoHS(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnasat);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoHV(PIX*, l_int32, NUMA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:998</i>
     */
    Pix pixMakeHistoHV(Pix pixs, int factor, PointerByReference pnahue, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>PIX* pixMakeHistoSV(PIX*, l_int32, NUMA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:1000</i>
     */
    Pix pixMakeHistoSV(Pix pixs, int factor, PointerByReference pnasat, PointerByReference pnaval);

    /**
     * Original signature :
     * <code>l_int32 pixFindHistoPeaksHSV(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32, PTA**, NUMA**, PIXA**)</code><br>
     * <i>native declaration : allheaders.h:1002</i>
     */
    int pixFindHistoPeaksHSV(Pix pixs, int type, int width, int height, int npeaks, float erasefactor, PointerByReference ppta, PointerByReference pnatot, PointerByReference ppixa);

    /**
     * Original signature :
     * <code>PIX* displayHSVColorRange(l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1004</i>
     */
    Pix displayHSVColorRange(int hval, int sval, int vval, int huehw, int sathw, int nsamp, int factor);

    /**
     * Original signature : <code>PIX* pixConvertRGBToYUV(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1006</i>
     */
    Pix pixConvertRGBToYUV(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertYUVToRGB(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1008</i>
     */
    Pix pixConvertYUVToRGB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 convertRGBToYUV(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1010</i>
     */
    int convertRGBToYUV(int rval, int gval, int bval, IntBuffer pyval, IntBuffer puval, IntBuffer pvval);

    /**
     * Original signature :
     * <code>l_int32 convertYUVToRGB(l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1012</i>
     */
    int convertYUVToRGB(int yval, int uval, int vval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 pixcmapConvertRGBToYUV(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:1014</i>
     */
    int pixcmapConvertRGBToYUV(PixColormap cmap);

    /**
     * Original signature :
     * <code>l_int32 pixcmapConvertYUVToRGB(PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:1016</i>
     */
    int pixcmapConvertYUVToRGB(PixColormap cmap);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToXYZ(PIX*)</code><br>
     * <i>native declaration : allheaders.h:1018</i>
     */
    FPixa pixConvertRGBToXYZ(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertXYZToRGB(FPIXA*)</code><br>
     * <i>native declaration : allheaders.h:1020</i>
     */
    Pix fpixaConvertXYZToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_int32 convertRGBToXYZ(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1022</i>
     */
    int convertRGBToXYZ(int rval, int gval, int bval, FloatBuffer pfxval, FloatBuffer pfyval, FloatBuffer pfzval);

    /**
     * Original signature :
     * <code>l_int32 convertXYZToRGB(l_float32, l_float32, l_float32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1024</i>
     */
    int convertXYZToRGB(float fxval, float fyval, float fzval, int blackout, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature : <code>FPIXA* fpixaConvertXYZToLAB(FPIXA*)</code><br>
     * <i>native declaration : allheaders.h:1026</i>
     */
    FPixa fpixaConvertXYZToLAB(FPixa fpixas);

    /**
     * Original signature : <code>FPIXA* fpixaConvertLABToXYZ(FPIXA*)</code><br>
     * <i>native declaration : allheaders.h:1028</i>
     */
    FPixa fpixaConvertLABToXYZ(FPixa fpixas);

    /**
     * Original signature :
     * <code>l_int32 convertXYZToLAB(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1030</i>
     */
    int convertXYZToLAB(float xval, float yval, float zval, FloatBuffer plval, FloatBuffer paval, FloatBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 convertLABToXYZ(l_float32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1032</i>
     */
    int convertLABToXYZ(float lval, float aval, float bval, FloatBuffer pxval, FloatBuffer pyval, FloatBuffer pzval);

    /**
     * Original signature : <code>FPIXA* pixConvertRGBToLAB(PIX*)</code><br>
     * <i>native declaration : allheaders.h:1034</i>
     */
    FPixa pixConvertRGBToLAB(Pix pixs);

    /**
     * Original signature : <code>PIX* fpixaConvertLABToRGB(FPIXA*)</code><br>
     * <i>native declaration : allheaders.h:1036</i>
     */
    Pix fpixaConvertLABToRGB(FPixa fpixa);

    /**
     * Original signature :
     * <code>l_int32 convertRGBToLAB(l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1038</i>
     */
    int convertRGBToLAB(int rval, int gval, int bval, FloatBuffer pflval, FloatBuffer pfaval, FloatBuffer pfbval);

    /**
     * Original signature :
     * <code>l_int32 convertLABToRGB(l_float32, l_float32, l_float32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1040</i>
     */
    int convertLABToRGB(float flval, float faval, float fbval, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 pixEqual(PIX*, PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1042</i>
     */
    int pixEqual(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 pixEqualWithAlpha(PIX*, PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1044</i>
     */
    int pixEqualWithAlpha(Pix pix1, Pix pix2, int use_alpha, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 pixEqualWithCmap(PIX*, PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1046</i>
     */
    int pixEqualWithCmap(Pix pix1, Pix pix2, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 cmapEqual(PIXCMAP*, PIXCMAP*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1048</i>
     */
    int cmapEqual(PixColormap cmap1, PixColormap cmap2, int ncomps, IntBuffer psame);

    /**
     * Original signature :
     * <code>l_int32 pixUsesCmapColor(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1050</i>
     */
    int pixUsesCmapColor(Pix pixs, IntBuffer pcolor);

    /**
     * Original signature :
     * <code>l_int32 pixCorrelationBinary(PIX*, PIX*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1052</i>
     */
    int pixCorrelationBinary(Pix pix1, Pix pix2, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* pixDisplayDiffBinary(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1054</i>
     */
    Pix pixDisplayDiffBinary(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_int32 pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1056</i>
     */
    int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatBuffer pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareBinary(PIX*, PIX*, l_int32, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1056</i>
     */
    int pixCompareBinary(Pix pix1, Pix pix2, int comptype, FloatByReference pfract, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1058</i>
     */
    int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareGrayOrRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1058</i>
     */
    int pixCompareGrayOrRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1060</i>
     */
    int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareGray(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1060</i>
     */
    int pixCompareGray(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1062</i>
     */
    int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntBuffer psame, FloatBuffer pdiff, FloatBuffer prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareRGB(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_float32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1062</i>
     */
    int pixCompareRGB(Pix pix1, Pix pix2, int comptype, int plottype, IntByReference psame, FloatByReference pdiff, FloatByReference prmsdiff, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>l_int32 pixCompareTiled(PIX*, PIX*, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1064</i>
     */
    int pixCompareTiled(Pix pix1, Pix pix2, int sx, int sy, int type, PointerByReference ppixdiff);

    /**
     * Original signature :
     * <code>NUMA* pixCompareRankDifference(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1066</i>
     */
    Numa pixCompareRankDifference(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_int32 pixTestForSimilarity(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1068</i>
     */
    int pixTestForSimilarity(Pix pix1, Pix pix2, int factor, int mindiff, float maxfract, float maxave, IntBuffer psimilar, int printstats);

    /**
     * Original signature :
     * <code>l_int32 pixGetDifferenceStats(PIX*, PIX*, l_int32, l_int32, l_float32*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1070</i>
     */
    int pixGetDifferenceStats(Pix pix1, Pix pix2, int factor, int mindiff, FloatBuffer pfractdiff, FloatBuffer pavediff, int printstats);

    /**
     * Original signature :
     * <code>NUMA* pixGetDifferenceHistogram(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1072</i>
     */
    Numa pixGetDifferenceHistogram(Pix pix1, Pix pix2, int factor);

    /**
     * Original signature :
     * <code>l_int32 pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1074</i>
     */
    int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatBuffer pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_int32 pixGetPerceptualDiff(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32*, PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1074</i>
     */
    int pixGetPerceptualDiff(Pix pixs1, Pix pixs2, int sampling, int dilation, int mindiff, FloatByReference pfract, PointerByReference ppixdiff1, PointerByReference ppixdiff2);

    /**
     * Original signature :
     * <code>l_int32 pixGetPSNR(PIX*, PIX*, l_int32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1076</i>
     */
    int pixGetPSNR(Pix pix1, Pix pix2, int factor, FloatBuffer ppsnr);

    /**
     * Original signature :
     * <code>l_int32 pixaComparePhotoRegionsByHisto(PIXA*, l_float32, l_float32, l_int32, l_int32, l_int32, l_float32, NUMA**, l_float32**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:1078</i>
     */
    int pixaComparePhotoRegionsByHisto(Pixa pixa, float minratio, float textthresh, int factor, int nx, int ny, float simthresh, PointerByReference pnai, PointerByReference pscores, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>l_int32 pixComparePhotoRegionsByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_int32, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1080</i>
     */
    int pixComparePhotoRegionsByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int factor, int nx, int ny, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1082</i>
     */
    int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntBuffer pw, IntBuffer ph, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixGenPhotoHistos(PIX*, BOX*, l_int32, l_float32, l_int32, l_int32, NUMAA**, l_int32*, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1082</i>
     */
    int pixGenPhotoHistos(Pix pixs, Box box, int factor, float thresh, int nx, int ny, PointerByReference pnaa, IntByReference pw, IntByReference ph, int debugflag);

    /**
     * Original signature :
     * <code>PIX* pixPadToCenterCentroid(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1084</i>
     */
    Pix pixPadToCenterCentroid(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_int32 pixCentroid8(PIX*, l_int32, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1086</i>
     */
    int pixCentroid8(Pix pixs, int factor, FloatBuffer pcx, FloatBuffer pcy);

    /**
     * Original signature :
     * <code>l_int32 pixDecideIfPhotoImage(PIX*, l_int32, l_int32, l_int32, l_float32, NUMAA**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:1088</i>
     */
    int pixDecideIfPhotoImage(Pix pix, int factor, int nx, int ny, float thresh, PointerByReference pnaa, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_int32 compareTilesByHisto(NUMAA*, NUMAA*, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:1090</i>
     */
    int compareTilesByHisto(Numaa naa1, Numaa naa2, float minratio, int w1, int h1, int w2, int h2, FloatBuffer pscore, Pixa pixadebug);

    /**
     * Original signature :
     * <code>l_int32 pixCompareGrayByHisto(PIX*, PIX*, BOX*, BOX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1092</i>
     */
    int pixCompareGrayByHisto(Pix pix1, Pix pix2, Box box1, Box box2, float minratio, int maxgray, int factor, int nx, int ny, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixCropAlignedToCentroid(PIX*, PIX*, l_int32, BOX**, BOX**)</code><br>
     * <i>native declaration : allheaders.h:1094</i>
     */
    int pixCropAlignedToCentroid(Pix pix1, Pix pix2, int factor, PointerByReference pbox1, PointerByReference pbox2);

    /**
     * Original signature :
     * <code>l_uint8* l_compressGrayHistograms(NUMAA*, l_int32, l_int32, size_t*)</code><br>
     * <i>native declaration : allheaders.h:1096</i>
     */
    Pointer l_compressGrayHistograms(Numaa naa, int w, int h, NativeSizeByReference psize);

    /**
     * Original signature :
     * <code>NUMAA* l_uncompressGrayHistograms(l_uint8*, size_t, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1098</i>
     */
    Numaa l_uncompressGrayHistograms(ByteBuffer bytea, NativeSize size, IntBuffer pw, IntBuffer ph);

    /**
     * Original signature :
     * <code>l_int32 pixCompareWithTranslation(PIX*, PIX*, l_int32, l_int32*, l_int32*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1100</i>
     */
    int pixCompareWithTranslation(Pix pix1, Pix pix2, int thresh, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixBestCorrelation(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_float32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1102</i>
     */
    int pixBestCorrelation(Pix pix1, Pix pix2, int area1, int area2, int etransx, int etransy, int maxshift, IntBuffer tab8, IntBuffer pdelx, IntBuffer pdely, FloatBuffer pscore, int debugflag);

    /**
     * Original signature :
     * <code>BOXA* pixConnComp(PIX*, PIXA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1104</i>
     */
    Boxa pixConnComp(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature :
     * <code>BOXA* pixConnCompPixa(PIX*, PIXA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1106</i>
     */
    Boxa pixConnCompPixa(Pix pixs, PointerByReference ppixa, int connectivity);

    /**
     * Original signature : <code>BOXA* pixConnCompBB(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1108</i>
     */
    Boxa pixConnCompBB(Pix pixs, int connectivity);

    /**
     * Original signature :
     * <code>l_int32 pixCountConnComp(PIX*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1110</i>
     */
    int pixCountConnComp(Pix pixs, int connectivity, IntBuffer pcount);

    /**
     * Original signature :
     * <code>l_int32 nextOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1112</i>
     */
    int nextOnPixelInRaster(Pix pixs, int xstart, int ystart, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>l_int32 nextOnPixelInRasterLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1114</i>
     */
    int nextOnPixelInRasterLow(IntBuffer data, int w, int h, int wpl, int xstart, int ystart, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>BOX* pixSeedfillBB(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1116</i>
     */
    Box pixSeedfillBB(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill4BB(PIX*, L_STACK*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1118</i>
     */
    Box pixSeedfill4BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>BOX* pixSeedfill8BB(PIX*, L_STACK*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1120</i>
     */
    Box pixSeedfill8BB(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixSeedfill(PIX*, L_STACK*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1122</i>
     */
    int pixSeedfill(Pix pixs, L_Stack stack, int x, int y, int connectivity);

    /**
     * Original signature :
     * <code>l_int32 pixSeedfill4(PIX*, L_STACK*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1124</i>
     */
    int pixSeedfill4(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixSeedfill8(PIX*, L_STACK*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1126</i>
     */
    int pixSeedfill8(Pix pixs, L_Stack stack, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 convertFilesTo1bpp(const char*, const char*, l_int32, l_int32, l_int32, l_int32, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1128</i>
     */
    int convertFilesTo1bpp(String dirin, String substr, int upscaling, int thresh, int firstpage, int npages, String dirout, int outformat);

    /**
     * Original signature :
     * <code>PIX* pixBlockconv(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1130</i>
     */
    Pix pixBlockconv(Pix pix, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGray(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1132</i>
     */
    Pix pixBlockconvGray(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature : <code>PIX* pixBlockconvAccum(PIX*)</code><br>
     * <i>native declaration : allheaders.h:1134</i>
     */
    Pix pixBlockconvAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayUnnormalized(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1136</i>
     */
    Pix pixBlockconvGrayUnnormalized(Pix pixs, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvTiled(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1138</i>
     */
    Pix pixBlockconvTiled(Pix pix, int wc, int hc, int nx, int ny);

    /**
     * Original signature :
     * <code>PIX* pixBlockconvGrayTile(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1140</i>
     */
    Pix pixBlockconvGrayTile(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>l_int32 pixWindowedStats(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, FPIX**, FPIX**)</code><br>
     * <i>native declaration : allheaders.h:1142</i>
     */
    int pixWindowedStats(Pix pixs, int wc, int hc, int hasborder, PointerByReference ppixm, PointerByReference ppixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMean(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1144</i>
     */
    Pix pixWindowedMean(Pix pixs, int wc, int hc, int hasborder, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixWindowedMeanSquare(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1146</i>
     */
    Pix pixWindowedMeanSquare(Pix pixs, int wc, int hc, int hasborder);

    /**
     * Original signature :
     * <code>l_int32 pixWindowedVariance(PIX*, PIX*, FPIX**, FPIX**)</code><br>
     * <i>native declaration : allheaders.h:1148</i>
     */
    int pixWindowedVariance(Pix pixm, Pix pixms, PointerByReference pfpixv, PointerByReference pfpixrv);

    /**
     * Original signature : <code>DPIX* pixMeanSquareAccum(PIX*)</code><br>
     * <i>native declaration : allheaders.h:1150</i>
     */
    DPix pixMeanSquareAccum(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixBlockrank(PIX*, PIX*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1152</i>
     */
    Pix pixBlockrank(Pix pixs, Pix pixacc, int wc, int hc, float rank);

    /**
     * Original signature :
     * <code>PIX* pixBlocksum(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1154</i>
     */
    Pix pixBlocksum(Pix pixs, Pix pixacc, int wc, int hc);

    /**
     * Original signature :
     * <code>PIX* pixCensusTransform(PIX*, l_int32, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1156</i>
     */
    Pix pixCensusTransform(Pix pixs, int halfsize, Pix pixacc);

    /**
     * Original signature :
     * <code>PIX* pixConvolve(PIX*, L_KERNEL*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1158</i>
     */
    Pix pixConvolve(Pix pixs, L_Kernel kel, int outdepth, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveSep(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1160</i>
     */
    Pix pixConvolveSep(Pix pixs, L_Kernel kelx, L_Kernel kely, int outdepth, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveRGB(PIX*, L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:1162</i>
     */
    Pix pixConvolveRGB(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixConvolveRGBSep(PIX*, L_KERNEL*, L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:1164</i>
     */
    Pix pixConvolveRGBSep(Pix pixs, L_Kernel kelx, L_Kernel kely);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolve(FPIX*, L_KERNEL*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1166</i>
     */
    FPix fpixConvolve(FPix fpixs, L_Kernel kel, int normflag);

    /**
     * Original signature :
     * <code>FPIX* fpixConvolveSep(FPIX*, L_KERNEL*, L_KERNEL*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1168</i>
     */
    FPix fpixConvolveSep(FPix fpixs, L_Kernel kelx, L_Kernel kely, int normflag);

    /**
     * Original signature :
     * <code>PIX* pixConvolveWithBias(PIX*, L_KERNEL*, L_KERNEL*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1170</i>
     */
    Pix pixConvolveWithBias(Pix pixs, L_Kernel kel1, L_Kernel kel2, int force8, IntBuffer pbias);

    /**
     * Original signature :
     * <code>void l_setConvolveSampling(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1172</i>
     */
    void l_setConvolveSampling(int xfact, int yfact);

    /**
     * Original signature :
     * <code>PIX* pixAddGaussianNoise(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1174</i>
     */
    Pix pixAddGaussianNoise(Pix pixs, float stdev);

    /**
     * Original signature : <code>l_float32 gaussDistribSampling()</code><br>
     * <i>native declaration : allheaders.h:1176</i>
     */
    float gaussDistribSampling();

//      /**
//       * Original signature :
//       * <code>l_int32 pixCorrelationScore(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1178</i>
//       */
//      int pixCorrelationScore(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCorrelationScoreThresholded(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_int32*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1180</i>
//       */
//      int pixCorrelationScoreThresholded(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, IntBuffer downcount, float score_threshold);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCorrelationScoreSimple(PIX*, PIX*, l_int32, l_int32, l_float32, l_float32, l_int32, l_int32, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1182</i>
//       */
//      int pixCorrelationScoreSimple(Pix pix1, Pix pix2, int area1, int area2, float delx, float dely, int maxdiffw, int maxdiffh, IntBuffer tab, FloatBuffer pscore);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCorrelationScoreShifted(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1184</i>
//       */
//      int pixCorrelationScoreShifted(Pix pix1, Pix pix2, int area1, int area2, int delx, int dely, IntBuffer tab, FloatBuffer pscore);
    /**
     * Original signature :
     * <code>L_DEWARP* dewarpCreate(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1186</i>
     */
    L_Dewarp dewarpCreate(Pix pixs, int pageno);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpCreateRef(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1188</i>
     */
    L_Dewarp dewarpCreateRef(int pageno, int refpage);

    /**
     * Original signature : <code>void dewarpDestroy(L_DEWARP**)</code><br>
     * <i>native declaration : allheaders.h:1190</i>
     */
    void dewarpDestroy(PointerByReference pdew);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1192</i>
     */
    L_Dewarpa dewarpaCreate(int nptrs, int sampling, int redfactor, int minlines, int maxdist);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaCreateFromPixacomp(PIXAC*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1194</i>
     */
    L_Dewarpa dewarpaCreateFromPixacomp(PixaComp pixac, int useboth, int sampling, int minlines, int maxdist);

    /**
     * Original signature : <code>void dewarpaDestroy(L_DEWARPA**)</code><br>
     * <i>native declaration : allheaders.h:1196</i>
     */
    void dewarpaDestroy(PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_int32 dewarpaDestroyDewarp(L_DEWARPA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1198</i>
     */
    int dewarpaDestroyDewarp(L_Dewarpa dewa, int pageno);

    /**
     * Original signature :
     * <code>l_int32 dewarpaInsertDewarp(L_DEWARPA*, L_DEWARP*)</code><br>
     * <i>native declaration : allheaders.h:1200</i>
     */
    int dewarpaInsertDewarp(L_Dewarpa dewa, L_Dewarp dew);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpaGetDewarp(L_DEWARPA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1202</i>
     */
    L_Dewarp dewarpaGetDewarp(L_Dewarpa dewa, int index);

    /**
     * Original signature :
     * <code>l_int32 dewarpaSetCurvatures(L_DEWARPA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1204</i>
     */
    int dewarpaSetCurvatures(L_Dewarpa dewa, int max_linecurv, int min_diff_linecurv, int max_diff_linecurv, int max_edgecurv, int max_diff_edgecurv, int max_edgeslope);

    /**
     * Original signature :
     * <code>l_int32 dewarpaUseBothArrays(L_DEWARPA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1206</i>
     */
    int dewarpaUseBothArrays(L_Dewarpa dewa, int useboth);

    /**
     * Original signature :
     * <code>l_int32 dewarpaSetCheckColumns(L_DEWARPA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1208</i>
     */
    int dewarpaSetCheckColumns(L_Dewarpa dewa, int check_columns);

    /**
     * Original signature :
     * <code>l_int32 dewarpaSetMaxDistance(L_DEWARPA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1210</i>
     */
    int dewarpaSetMaxDistance(L_Dewarpa dewa, int maxdist);

    /**
     * Original signature : <code>L_DEWARP* dewarpRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:1212</i>
     */
    L_Dewarp dewarpRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DEWARP* dewarpReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1214</i>
//       */
//      L_Dewarp dewarpReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARP* dewarpReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:1216</i>
     */
    L_Dewarp dewarpReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 dewarpWrite(const char*, L_DEWARP*)</code><br>
     * <i>native declaration : allheaders.h:1218</i>
     */
    int dewarpWrite(String filename, L_Dewarp dew);

//      /**
//       * Original signature :
//       * <code>l_int32 dewarpWriteStream(FILE*, L_DEWARP*)</code><br>
//       * <i>native declaration : allheaders.h:1220</i>
//       */
//      int dewarpWriteStream(FILE fp, L_Dewarp dew);
    /**
     * Original signature :
     * <code>l_int32 dewarpWriteMem(l_uint8**, size_t*, L_DEWARP*)</code><br>
     * <i>native declaration : allheaders.h:1222</i>
     */
    int dewarpWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarp dew);

    /**
     * Original signature : <code>L_DEWARPA* dewarpaRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:1224</i>
     */
    L_Dewarpa dewarpaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DEWARPA* dewarpaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1226</i>
//       */
//      L_Dewarpa dewarpaReadStream(FILE fp);

    /**
     * Original signature :
     * <code>L_DEWARPA* dewarpaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:1228</i>
     */
    L_Dewarpa dewarpaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 dewarpaWrite(const char*, L_DEWARPA*)</code><br>
     * <i>native declaration : allheaders.h:1230</i>
     */
    int dewarpaWrite(String filename, L_Dewarpa dewa);

//      /**
//       * Original signature :
//       * <code>l_int32 dewarpaWriteStream(FILE*, L_DEWARPA*)</code><br>
//       * <i>native declaration : allheaders.h:1232</i>
//       */
//      int dewarpaWriteStream(FILE fp, L_Dewarpa dewa);
    /**
     * Original signature :
     * <code>l_int32 dewarpaWriteMem(l_uint8**, size_t*, L_DEWARPA*)</code><br>
     * <i>native declaration : allheaders.h:1234</i>
     */
    int dewarpaWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_int32 dewarpBuildPageModel(L_DEWARP*, const char*)</code><br>
     * <i>native declaration : allheaders.h:1236</i>
     */
    int dewarpBuildPageModel(L_Dewarp dew, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 dewarpFindVertDisparity(L_DEWARP*, PTAA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1238</i>
     */
    int dewarpFindVertDisparity(L_Dewarp dew, Ptaa ptaa, int rotflag);

    /**
     * Original signature :
     * <code>l_int32 dewarpFindHorizDisparity(L_DEWARP*, PTAA*)</code><br>
     * <i>native declaration : allheaders.h:1240</i>
     */
    int dewarpFindHorizDisparity(L_Dewarp dew, Ptaa ptaa);

    /**
     * Original signature :
     * <code>PTAA* dewarpGetTextlineCenters(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1242</i>
     */
    Ptaa dewarpGetTextlineCenters(Pix pixs, int debugflag);

    /**
     * Original signature :
     * <code>PTAA* dewarpRemoveShortLines(PIX*, PTAA*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1244</i>
     */
    Ptaa dewarpRemoveShortLines(Pix pixs, Ptaa ptaas, float fract, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 dewarpFindHorizSlopeDisparity(L_DEWARP*, PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1246</i>
     */
    int dewarpFindHorizSlopeDisparity(L_Dewarp dew, Pix pixb, float fractthresh, int parity);

    /**
     * Original signature :
     * <code>l_int32 dewarpBuildLineModel(L_DEWARP*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1248</i>
     */
    int dewarpBuildLineModel(L_Dewarp dew, int opensize, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 dewarpaModelStatus(L_DEWARPA*, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1250</i>
     */
    int dewarpaModelStatus(L_Dewarpa dewa, int pageno, IntBuffer pvsuccess, IntBuffer phsuccess);

    /**
     * Original signature :
     * <code>l_int32 dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code><br>
     * <i>native declaration : allheaders.h:1252</i>
     */
    int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 dewarpaApplyDisparity(L_DEWARPA*, l_int32, PIX*, l_int32, l_int32, l_int32, PIX**, const char*)</code><br>
     * <i>native declaration : allheaders.h:1252</i>
     */
    int dewarpaApplyDisparity(L_Dewarpa dewa, int pageno, Pix pixs, int grayin, int x, int y, PointerByReference ppixd, Pointer debugfile);

    /**
     * Original signature :
     * <code>l_int32 dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code><br>
     * <i>native declaration : allheaders.h:1254</i>
     */
    int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 dewarpaApplyDisparityBoxa(L_DEWARPA*, l_int32, PIX*, BOXA*, l_int32, l_int32, l_int32, BOXA**, const char*)</code><br>
     * <i>native declaration : allheaders.h:1254</i>
     */
    int dewarpaApplyDisparityBoxa(L_Dewarpa dewa, int pageno, Pix pixs, Boxa boxas, int mapdir, int x, int y, PointerByReference pboxad, Pointer debugfile);

    /**
     * Original signature : <code>l_int32 dewarpMinimize(L_DEWARP*)</code><br>
     * <i>native declaration : allheaders.h:1256</i>
     */
    int dewarpMinimize(L_Dewarp dew);

    /**
     * Original signature :
     * <code>l_int32 dewarpPopulateFullRes(L_DEWARP*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1258</i>
     */
    int dewarpPopulateFullRes(L_Dewarp dew, Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 dewarpSinglePage(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1260</i>
     */
    int dewarpSinglePage(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixd, PointerByReference pdewa, int debug);

    /**
     * Original signature :
     * <code>l_int32 dewarpSinglePageInit(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**, L_DEWARPA**)</code><br>
     * <i>native declaration : allheaders.h:1262</i>
     */
    int dewarpSinglePageInit(Pix pixs, int thresh, int adaptive, int useboth, int check_columns, PointerByReference ppixb, PointerByReference pdewa);

    /**
     * Original signature :
     * <code>l_int32 dewarpSinglePageRun(PIX*, PIX*, L_DEWARPA*, PIX**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1264</i>
     */
    int dewarpSinglePageRun(Pix pixs, Pix pixb, L_Dewarpa dewa, PointerByReference ppixd, int debug);

    /**
     * Original signature :
     * <code>l_int32 dewarpaListPages(L_DEWARPA*)</code><br>
     * <i>native declaration : allheaders.h:1266</i>
     */
    int dewarpaListPages(L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_int32 dewarpaSetValidModels(L_DEWARPA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1268</i>
     */
    int dewarpaSetValidModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature :
     * <code>l_int32 dewarpaInsertRefModels(L_DEWARPA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1270</i>
     */
    int dewarpaInsertRefModels(L_Dewarpa dewa, int notests, int debug);

    /**
     * Original signature :
     * <code>l_int32 dewarpaStripRefModels(L_DEWARPA*)</code><br>
     * <i>native declaration : allheaders.h:1272</i>
     */
    int dewarpaStripRefModels(L_Dewarpa dewa);

    /**
     * Original signature :
     * <code>l_int32 dewarpaRestoreModels(L_DEWARPA*)</code><br>
     * <i>native declaration : allheaders.h:1274</i>
     */
    int dewarpaRestoreModels(L_Dewarpa dewa);

//      /**
//       * Original signature :
//       * <code>l_int32 dewarpaInfo(FILE*, L_DEWARPA*)</code><br>
//       * <i>native declaration : allheaders.h:1276</i>
//       */
//      int dewarpaInfo(FILE fp, L_Dewarpa dewa);
    /**
     * Original signature :
     * <code>l_int32 dewarpaModelStats(L_DEWARPA*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1278</i>
     */
    int dewarpaModelStats(L_Dewarpa dewa, IntBuffer pnnone, IntBuffer pnvsuccess, IntBuffer pnvvalid, IntBuffer pnhsuccess, IntBuffer pnhvalid, IntBuffer pnref);

    /**
     * Original signature :
     * <code>l_int32 dewarpaShowArrays(L_DEWARPA*, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1280</i>
     */
    int dewarpaShowArrays(L_Dewarpa dewa, float scalefact, int first, int last);

    /**
     * Original signature :
     * <code>l_int32 dewarpDebug(L_DEWARP*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1282</i>
     */
    int dewarpDebug(L_Dewarp dew, String subdirs, int index);

    /**
     * Original signature :
     * <code>l_int32 dewarpShowResults(L_DEWARPA*, SARRAY*, BOXA*, l_int32, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1284</i>
     */
    int dewarpShowResults(L_Dewarpa dewa, Sarray sa, Boxa boxa, int firstpage, int lastpage, String pdfout);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1286</i>
//       */
//      L_Dna l_dnaCreate(int n);

//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaCreateFromIArray(l_int32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1288</i>
//       */
//      L_Dna l_dnaCreateFromIArray(IntBuffer iarray, int size);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaCreateFromDArray(l_float64*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1290</i>
//       */
//      L_Dna l_dnaCreateFromDArray(DoubleBuffer darray, int size, int copyflag);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaMakeSequence(l_float64, l_float64, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1292</i>
//       */
//      L_Dna l_dnaMakeSequence(double startval, double increment, int size);
//  
//      /**
//       * Original signature : <code>void l_dnaDestroy(L_DNA**)</code><br>
//       * <i>native declaration : allheaders.h:1294</i>
//       */
//      void l_dnaDestroy(PointerByReference pda);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaCopy(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1296</i>
//       */
//      L_Dna l_dnaCopy(L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaClone(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1298</i>
//       */
//      L_Dna l_dnaClone(L_Dna da);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaEmpty(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1300</i>
//       */
//      int l_dnaEmpty(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaAddNumber(L_DNA*, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1302</i>
//       */
//      int l_dnaAddNumber(L_Dna da, double val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaInsertNumber(L_DNA*, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1304</i>
//       */
//      int l_dnaInsertNumber(L_Dna da, int index, double val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaRemoveNumber(L_DNA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1306</i>
//       */
//      int l_dnaRemoveNumber(L_Dna da, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaReplaceNumber(L_DNA*, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1308</i>
//       */
//      int l_dnaReplaceNumber(L_Dna da, int index, double val);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaGetCount(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1310</i>
//       */
//      int l_dnaGetCount(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaSetCount(L_DNA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1312</i>
//       */
//      int l_dnaSetCount(L_Dna da, int newcount);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaGetDValue(L_DNA*, l_int32, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1314</i>
//       */
//      int l_dnaGetDValue(L_Dna da, int index, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaGetIValue(L_DNA*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1316</i>
//       */
//      int l_dnaGetIValue(L_Dna da, int index, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaSetValue(L_DNA*, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1318</i>
//       */
//      int l_dnaSetValue(L_Dna da, int index, double val);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaShiftValue(L_DNA*, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1320</i>
//       */
//      int l_dnaShiftValue(L_Dna da, int index, double diff);
//  
//      /**
//       * Original signature : <code>l_int32* l_dnaGetIArray(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1322</i>
//       */
//      IntByReference l_dnaGetIArray(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_float64* l_dnaGetDArray(L_DNA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1324</i>
//       */
//      DoubleByReference l_dnaGetDArray(L_Dna da, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaGetRefcount(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1326</i>
//       */
//      int l_dnaGetRefcount(L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaChangeRefcount(L_DNA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1328</i>
//       */
//      int l_dnaChangeRefcount(L_Dna da, int delta);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaGetParameters(L_DNA*, l_float64*, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1330</i>
//       */
//      int l_dnaGetParameters(L_Dna da, DoubleBuffer pstartx, DoubleBuffer pdelx);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaSetParameters(L_DNA*, l_float64, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1332</i>
//       */
//      int l_dnaSetParameters(L_Dna da, double startx, double delx);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaCopyParameters(L_DNA*, L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1334</i>
//       */
//      int l_dnaCopyParameters(L_Dna dad, L_Dna das);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:1336</i>
//       */
//      L_Dna l_dnaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DNA* l_dnaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1338</i>
//       */
//      L_Dna l_dnaReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaWrite(const char*, L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1340</i>
//       */
//      int l_dnaWrite(String filename, L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaWriteStream(FILE*, L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1342</i>
//       */
//      int l_dnaWriteStream(FILE fp, L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1344</i>
//       */
//      L_Dnaa l_dnaaCreate(int n);
    /**
     * Original signature :
     * <code>L_DNAA* l_dnaaCreateFull(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1346</i>
     */
    L_Dnaa l_dnaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_int32 l_dnaaTruncate(L_DNAA*)</code><br>
     * <i>native declaration : allheaders.h:1348</i>
     */
    int l_dnaaTruncate(L_Dnaa daa);
//  
//      /**
//       * Original signature : <code>void l_dnaaDestroy(L_DNAA**)</code><br>
//       * <i>native declaration : allheaders.h:1350</i>
//       */
//      void l_dnaaDestroy(PointerByReference pdaa);

//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaAddDna(L_DNAA*, L_DNA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1352</i>
//       */
//      int l_dnaaAddDna(L_Dnaa daa, L_Dna da, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 l_dnaaGetCount(L_DNAA*)</code><br>
//       * <i>native declaration : allheaders.h:1354</i>
//       */
//      int l_dnaaGetCount(L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaGetDnaCount(L_DNAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1356</i>
//       */
//      int l_dnaaGetDnaCount(L_Dnaa daa, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaGetNumberCount(L_DNAA*)</code><br>
//       * <i>native declaration : allheaders.h:1358</i>
//       */
//      int l_dnaaGetNumberCount(L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>L_DNA* l_dnaaGetDna(L_DNAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1360</i>
//       */
//      L_Dna l_dnaaGetDna(L_Dnaa daa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaReplaceDna(L_DNAA*, l_int32, L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1362</i>
//       */
//      int l_dnaaReplaceDna(L_Dnaa daa, int index, L_Dna da);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaGetValue(L_DNAA*, l_int32, l_int32, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1364</i>
//       */
//      int l_dnaaGetValue(L_Dnaa daa, int i, int j, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaAddNumber(L_DNAA*, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1366</i>
//       */
//      int l_dnaaAddNumber(L_Dnaa daa, int index, double val);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:1368</i>
//       */
//      L_Dnaa l_dnaaRead(String filename);
//  
//      /**
//       * Original signature : <code>L_DNAA* l_dnaaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1370</i>
//       */
//      L_Dnaa l_dnaaReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaWrite(const char*, L_DNAA*)</code><br>
//       * <i>native declaration : allheaders.h:1372</i>
//       */
//      int l_dnaaWrite(String filename, L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaaWriteStream(FILE*, L_DNAA*)</code><br>
//       * <i>native declaration : allheaders.h:1374</i>
//       */
//      int l_dnaaWriteStream(FILE fp, L_Dnaa daa);
//      /**
//       * Original signature :
//       * <code>l_int32 l_dnaJoin(L_DNA*, L_DNA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1376</i>
//       */
//      int l_dnaJoin(L_Dna dad, L_Dna das, int istart, int iend);
    /**
     * Original signature : <code>L_DNA* l_dnaaFlattenToDna(L_DNAA*)</code><br>
     * <i>native declaration : allheaders.h:1378</i>
     */
    L_Dna l_dnaaFlattenToDna(L_Dnaa daa);
//  
//      /**
//       * Original signature : <code>NUMA* l_dnaConvertToNuma(L_DNA*)</code><br>
//       * <i>native declaration : allheaders.h:1380</i>
//       */
//      Numa l_dnaConvertToNuma(L_Dna da);
//  
//      /**
//       * Original signature : <code>L_DNA* numaConvertToDna(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:1382</i>
//       */
//      L_Dna numaConvertToDna(Numa na);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaUnionByAset(L_DNA*, L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1384</i>
     */
    L_Dna l_dnaUnionByAset(L_Dna da1, L_Dna da2);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaRemoveDupsByAset(L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1386</i>
     */
    L_Dna l_dnaRemoveDupsByAset(L_Dna das);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaIntersectionByAset(L_DNA*, L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1388</i>
     */
    L_Dna l_dnaIntersectionByAset(L_Dna da1, L_Dna da2);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromDna(L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1390</i>
     */
    L_Rbtree l_asetCreateFromDna(L_Dna da);

    /**
     * Original signature : <code>L_DNA* l_dnaDiffAdjValues(L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1392</i>
     */
    L_Dna l_dnaDiffAdjValues(L_Dna das);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreate(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1394</i>
     */
    L_DnaHash l_dnaHashCreate(int nbuckets, int initsize);

    /**
     * Original signature : <code>void l_dnaHashDestroy(L_DNAHASH**)</code><br>
     * <i>native declaration : allheaders.h:1396</i>
     */
    void l_dnaHashDestroy(PointerByReference pdahash);

    /**
     * Original signature :
     * <code>l_int32 l_dnaHashGetCount(L_DNAHASH*)</code><br>
     * <i>native declaration : allheaders.h:1398</i>
     */
    int l_dnaHashGetCount(L_DnaHash dahash);

    /**
     * Original signature :
     * <code>l_int32 l_dnaHashGetTotalCount(L_DNAHASH*)</code><br>
     * <i>native declaration : allheaders.h:1400</i>
     */
    int l_dnaHashGetTotalCount(L_DnaHash dahash);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaHashGetDna(L_DNAHASH*, l_uint64, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1402</i>
     */
    L_Dna l_dnaHashGetDna(L_DnaHash dahash, long key, int copyflag);

    /**
     * Original signature :
     * <code>l_int32 l_dnaHashAdd(L_DNAHASH*, l_uint64, l_float64)</code><br>
     * <i>native declaration : allheaders.h:1404</i>
     */
    int l_dnaHashAdd(L_DnaHash dahash, long key, double value);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreateFromDna(L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1406</i>
     */
    L_DnaHash l_dnaHashCreateFromDna(L_Dna da);

    /**
     * Original signature :
     * <code>l_int32 l_dnaRemoveDupsByHash(L_DNA*, L_DNA**, L_DNAHASH**)</code><br>
     * <i>native declaration : allheaders.h:1408</i>
     */
    int l_dnaRemoveDupsByHash(L_Dna das, PointerByReference pdad, PointerByReference pdahash);

    /**
     * Original signature :
     * <code>l_int32 l_dnaMakeHistoByHash(L_DNA*, L_DNAHASH**, L_DNA**, L_DNA**)</code><br>
     * <i>native declaration : allheaders.h:1410</i>
     */
    int l_dnaMakeHistoByHash(L_Dna das, PointerByReference pdahash, PointerByReference pdav, PointerByReference pdac);

    /**
     * Original signature :
     * <code>L_DNA* l_dnaIntersectionByHash(L_DNA*, L_DNA*)</code><br>
     * <i>native declaration : allheaders.h:1412</i>
     */
    L_Dna l_dnaIntersectionByHash(L_Dna da1, L_Dna da2);

    /**
     * Original signature :
     * <code>l_int32 l_dnaFindValByHash(L_DNA*, L_DNAHASH*, l_float64, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1414</i>
     */
    int l_dnaFindValByHash(L_Dna da, L_DnaHash dahash, double val, IntBuffer pindex);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_2(PIX*, PIX*, l_int32, char*)</code><br>
     * <i>native declaration : allheaders.h:1416</i>
     */
    Pix pixMorphDwa_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_2(PIX*, PIX*, l_int32, char*)</code><br>
     * <i>native declaration : allheaders.h:1418</i>
     */
    Pix pixFMorphopGen_2(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>l_int32 fmorphopgen_low_2(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1420</i>
     */
    int fmorphopgen_low_2(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature :
     * <code>PIX* pixSobelEdgeFilter(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1422</i>
     */
    Pix pixSobelEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>PIX* pixTwoSidedEdgeFilter(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1424</i>
     */
    Pix pixTwoSidedEdgeFilter(Pix pixs, int orientflag);

    /**
     * Original signature :
     * <code>l_int32 pixMeasureEdgeSmoothness(PIX*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, const char*)</code><br>
     * <i>native declaration : allheaders.h:1426</i>
     */
    int pixMeasureEdgeSmoothness(Pix pixs, int side, int minjump, int minreversal, FloatBuffer pjpl, FloatBuffer pjspl, FloatBuffer prpl, String debugfile);

    /**
     * Original signature :
     * <code>NUMA* pixGetEdgeProfile(PIX*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1428</i>
     */
    Numa pixGetEdgeProfile(Pix pixs, int side, String debugfile);

    /**
     * Original signature :
     * <code>l_int32 pixGetLastOffPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1430</i>
     */
    int pixGetLastOffPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>l_int32 pixGetLastOnPixelInRun(PIX*, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1432</i>
     */
    int pixGetLastOnPixelInRun(Pix pixs, int x, int y, int direction, IntBuffer ploc);

    /**
     * Original signature :
     * <code>char* encodeBase64(l_uint8*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1434</i>
     */
    Pointer encodeBase64(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeBase64(const char*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1436</i>
     */
    Pointer decodeBase64(String inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>char* encodeAscii85(l_uint8*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1438</i>
     */
    Pointer encodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>l_uint8* decodeAscii85(char*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1440</i>
     */
    Pointer decodeAscii85(ByteBuffer inarray, int insize, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>char* reformatPacked64(char*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1442</i>
     */
    Pointer reformatPacked64(ByteBuffer inarray, int insize, int leadspace, int linechars, int addquotes, IntBuffer poutsize);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRC(PIX*, PIX*, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1444</i>
     */
    Pix pixGammaTRC(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCMasked(PIX*, PIX*, PIX*, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1446</i>
     */
    Pix pixGammaTRCMasked(Pix pixd, Pix pixs, Pix pixm, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixGammaTRCWithAlpha(PIX*, PIX*, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1448</i>
     */
    Pix pixGammaTRCWithAlpha(Pix pixd, Pix pixs, float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>NUMA* numaGammaTRC(l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1450</i>
     */
    Numa numaGammaTRC(float gamma, int minval, int maxval);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRC(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1452</i>
     */
    Pix pixContrastTRC(Pix pixd, Pix pixs, float factor);

    /**
     * Original signature :
     * <code>PIX* pixContrastTRCMasked(PIX*, PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1454</i>
     */
    Pix pixContrastTRCMasked(Pix pixd, Pix pixs, Pix pixm, float factor);

    /**
     * Original signature : <code>NUMA* numaContrastTRC(l_float32)</code><br>
     * <i>native declaration : allheaders.h:1456</i>
     */
    Numa numaContrastTRC(float factor);

    /**
     * Original signature :
     * <code>PIX* pixEqualizeTRC(PIX*, PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1458</i>
     */
    Pix pixEqualizeTRC(Pix pixd, Pix pixs, float fract, int factor);

    /**
     * Original signature :
     * <code>NUMA* numaEqualizeTRC(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1460</i>
     */
    Numa numaEqualizeTRC(Pix pix, float fract, int factor);

    /**
     * Original signature :
     * <code>l_int32 pixTRCMap(PIX*, PIX*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:1462</i>
     */
    int pixTRCMap(Pix pixs, Pix pixm, Numa na);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMasking(PIX*, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1464</i>
     */
    Pix pixUnsharpMasking(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray(PIX*, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1466</i>
     */
    Pix pixUnsharpMaskingGray(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingFast(PIX*, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1468</i>
     */
    Pix pixUnsharpMaskingFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGrayFast(PIX*, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1470</i>
     */
    Pix pixUnsharpMaskingGrayFast(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray1D(PIX*, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1472</i>
     */
    Pix pixUnsharpMaskingGray1D(Pix pixs, int halfwidth, float fract, int direction);

    /**
     * Original signature :
     * <code>PIX* pixUnsharpMaskingGray2D(PIX*, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1474</i>
     */
    Pix pixUnsharpMaskingGray2D(Pix pixs, int halfwidth, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifyHue(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1476</i>
     */
    Pix pixModifyHue(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixModifySaturation(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1478</i>
     */
    Pix pixModifySaturation(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixMeasureSaturation(PIX*, l_int32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1480</i>
     */
    int pixMeasureSaturation(Pix pixs, int factor, FloatBuffer psat);

    /**
     * Original signature :
     * <code>PIX* pixModifyBrightness(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1482</i>
     */
    Pix pixModifyBrightness(Pix pixd, Pix pixs, float fract);

    /**
     * Original signature :
     * <code>PIX* pixColorShiftRGB(PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1484</i>
     */
    Pix pixColorShiftRGB(Pix pixs, float rfract, float gfract, float bfract);

    /**
     * Original signature :
     * <code>PIX* pixMultConstantColor(PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1486</i>
     */
    Pix pixMultConstantColor(Pix pixs, float rfact, float gfact, float bfact);

    /**
     * Original signature :
     * <code>PIX* pixMultMatrixColor(PIX*, L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:1488</i>
     */
    Pix pixMultMatrixColor(Pix pixs, L_Kernel kel);

    /**
     * Original signature :
     * <code>PIX* pixHalfEdgeByBandpass(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1490</i>
     */
    Pix pixHalfEdgeByBandpass(Pix pixs, int sm1h, int sm1v, int sm2h, int sm2v);

    /**
     * Original signature :
     * <code>l_int32 fhmtautogen(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1492</i>
     */
    int fhmtautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_int32 fhmtautogen1(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1494</i>
     */
    int fhmtautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_int32 fhmtautogen2(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1496</i>
     */
    int fhmtautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixHMTDwa_1(PIX*, PIX*, const char*)</code><br>
     * <i>native declaration : allheaders.h:1498</i>
     */
    Pix pixHMTDwa_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>PIX* pixFHMTGen_1(PIX*, PIX*, const char*)</code><br>
     * <i>native declaration : allheaders.h:1500</i>
     */
    Pix pixFHMTGen_1(Pix pixd, Pix pixs, String selname);

    /**
     * Original signature :
     * <code>l_int32 fhmtgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1502</i>
     */
    int fhmtgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);

    /**
     * Original signature :
     * <code>l_int32 pixItalicWords(PIX*, BOXA*, PIX*, BOXA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1504</i>
     */
    int pixItalicWords(Pix pixs, Boxa boxaw, Pix pixw, PointerByReference pboxa, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 pixOrientDetect(PIX*, l_float32*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1506</i>
     */
    int pixOrientDetect(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_int32 makeOrientDecision(l_float32, l_float32, l_float32, l_float32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1508</i>
     */
    int makeOrientDecision(float upconf, float leftconf, float minupconf, float minratio, IntBuffer porient, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixUpDownDetect(PIX*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1510</i>
     */
    int pixUpDownDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixUpDownDetectGeneral(PIX*, l_float32*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1512</i>
     */
    int pixUpDownDetectGeneral(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixOrientDetectDwa(PIX*, l_float32*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1514</i>
     */
    int pixOrientDetectDwa(Pix pixs, FloatBuffer pupconf, FloatBuffer pleftconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixUpDownDetectDwa(PIX*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1516</i>
     */
    int pixUpDownDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixUpDownDetectGeneralDwa(PIX*, l_float32*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1518</i>
     */
    int pixUpDownDetectGeneralDwa(Pix pixs, FloatBuffer pconf, int mincount, int npixels, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixMirrorDetect(PIX*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1520</i>
     */
    int pixMirrorDetect(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixMirrorDetectDwa(PIX*, l_float32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1522</i>
     */
    int pixMirrorDetectDwa(Pix pixs, FloatBuffer pconf, int mincount, int debug);

    /**
     * Original signature :
     * <code>PIX* pixFlipFHMTGen(PIX*, PIX*, char*)</code><br>
     * <i>native declaration : allheaders.h:1524</i>
     */
    Pix pixFlipFHMTGen(Pix pixd, Pix pixs, ByteBuffer selname);

    /**
     * Original signature :
     * <code>l_int32 fmorphautogen(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1526</i>
     */
    int fmorphautogen(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_int32 fmorphautogen1(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1528</i>
     */
    int fmorphautogen1(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>l_int32 fmorphautogen2(SELA*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:1530</i>
     */
    int fmorphautogen2(Sela sela, int fileindex, String filename);

    /**
     * Original signature :
     * <code>PIX* pixMorphDwa_1(PIX*, PIX*, l_int32, char*)</code><br>
     * <i>native declaration : allheaders.h:1532</i>
     */
    Pix pixMorphDwa_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

    /**
     * Original signature :
     * <code>PIX* pixFMorphopGen_1(PIX*, PIX*, l_int32, char*)</code><br>
     * <i>native declaration : allheaders.h:1534</i>
     */
    Pix pixFMorphopGen_1(Pix pixd, Pix pixs, int operation, ByteBuffer selname);

//      /**
//       * Original signature :
//       * <code>l_int32 fmorphopgen_low_1(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1536</i>
//       */
//      int fmorphopgen_low_1(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, int index);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCreate(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1538</i>
//       */
//      FPix fpixCreate(int width, int height);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCreateTemplate(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1540</i>
//       */
//      FPix fpixCreateTemplate(FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixClone(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1542</i>
//       */
//      FPix fpixClone(FPix fpix);
//  
//      /**
//       * Original signature : <code>FPIX* fpixCopy(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1544</i>
//       */
//      FPix fpixCopy(FPix fpixd, FPix fpixs);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixResizeImageData(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1546</i>
//       */
//      int fpixResizeImageData(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>void fpixDestroy(FPIX**)</code><br>
//       * <i>native declaration : allheaders.h:1548</i>
//       */
//      void fpixDestroy(PointerByReference pfpix);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixGetDimensions(FPIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1550</i>
//       */
//      int fpixGetDimensions(FPix fpix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixSetDimensions(FPIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1552</i>
//       */
//      int fpixSetDimensions(FPix fpix, int w, int h);
//  
//      /**
//       * Original signature : <code>l_int32 fpixGetWpl(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1554</i>
//       */
//      int fpixGetWpl(FPix fpix);
//  
//      /**
//       * Original signature : <code>l_int32 fpixSetWpl(FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1556</i>
//       */
//      int fpixSetWpl(FPix fpix, int wpl);
//  
//      /**
//       * Original signature : <code>l_int32 fpixGetRefcount(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1558</i>
//       */
//      int fpixGetRefcount(FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixChangeRefcount(FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1560</i>
//       */
//      int fpixChangeRefcount(FPix fpix, int delta);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixGetResolution(FPIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1562</i>
//       */
//      int fpixGetResolution(FPix fpix, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixSetResolution(FPIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1564</i>
//       */
//      int fpixSetResolution(FPix fpix, int xres, int yres);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixCopyResolution(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1566</i>
//       */
//      int fpixCopyResolution(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>l_float32* fpixGetData(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1568</i>
//       */
//      FloatByReference fpixGetData(FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixSetData(FPIX*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1570</i>
//       */
//      int fpixSetData(FPix fpix, FloatBuffer data);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixGetPixel(FPIX*, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1572</i>
//       */
//      int fpixGetPixel(FPix fpix, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixSetPixel(FPIX*, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1574</i>
//       */
//      int fpixSetPixel(FPix fpix, int x, int y, float val);
//  
//      /**
//       * Original signature : <code>FPIXA* fpixaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1576</i>
//       */
//      FPixa fpixaCreate(int n);
//  
//      /**
//       * Original signature : <code>FPIXA* fpixaCopy(FPIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1578</i>
//       */
//      FPixa fpixaCopy(FPixa fpixa, int copyflag);
//  
//      /**
//       * Original signature : <code>void fpixaDestroy(FPIXA**)</code><br>
//       * <i>native declaration : allheaders.h:1580</i>
//       */
//      void fpixaDestroy(PointerByReference pfpixa);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixaAddFPix(FPIXA*, FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1582</i>
//       */
//      int fpixaAddFPix(FPixa fpixa, FPix fpix, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 fpixaGetCount(FPIXA*)</code><br>
//       * <i>native declaration : allheaders.h:1584</i>
//       */
//      int fpixaGetCount(FPixa fpixa);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixaChangeRefcount(FPIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1586</i>
//       */
//      int fpixaChangeRefcount(FPixa fpixa, int delta);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixaGetFPix(FPIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1588</i>
//       */
//      FPix fpixaGetFPix(FPixa fpixa, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixaGetFPixDimensions(FPIXA*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1590</i>
//       */
//      int fpixaGetFPixDimensions(FPixa fpixa, int index, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_float32* fpixaGetData(FPIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1592</i>
//       */
//      FloatByReference fpixaGetData(FPixa fpixa, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixaGetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:1594</i>
//       */
//      int fpixaGetPixel(FPixa fpixa, int index, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixaSetPixel(FPIXA*, l_int32, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1596</i>
//       */
//      int fpixaSetPixel(FPixa fpixa, int index, int x, int y, float val);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCreate(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1598</i>
//       */
//      DPix dpixCreate(int width, int height);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCreateTemplate(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1600</i>
//       */
//      DPix dpixCreateTemplate(DPix dpixs);
//  
//      /**
//       * Original signature : <code>DPIX* dpixClone(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1602</i>
//       */
//      DPix dpixClone(DPix dpix);
//  
//      /**
//       * Original signature : <code>DPIX* dpixCopy(DPIX*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1604</i>
//       */
//      DPix dpixCopy(DPix dpixd, DPix dpixs);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixResizeImageData(DPIX*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1606</i>
//       */
//      int dpixResizeImageData(DPix dpixd, DPix dpixs);
//  
//      /**
//       * Original signature : <code>void dpixDestroy(DPIX**)</code><br>
//       * <i>native declaration : allheaders.h:1608</i>
//       */
//      void dpixDestroy(PointerByReference pdpix);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixGetDimensions(DPIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1610</i>
//       */
//      int dpixGetDimensions(DPix dpix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixSetDimensions(DPIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1612</i>
//       */
//      int dpixSetDimensions(DPix dpix, int w, int h);
//  
//      /**
//       * Original signature : <code>l_int32 dpixGetWpl(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1614</i>
//       */
//      int dpixGetWpl(DPix dpix);
//  
//      /**
//       * Original signature : <code>l_int32 dpixSetWpl(DPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1616</i>
//       */
//      int dpixSetWpl(DPix dpix, int wpl);
//  
//      /**
//       * Original signature : <code>l_int32 dpixGetRefcount(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1618</i>
//       */
//      int dpixGetRefcount(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixChangeRefcount(DPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1620</i>
//       */
//      int dpixChangeRefcount(DPix dpix, int delta);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixGetResolution(DPIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1622</i>
//       */
//      int dpixGetResolution(DPix dpix, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixSetResolution(DPIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1624</i>
//       */
//      int dpixSetResolution(DPix dpix, int xres, int yres);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixCopyResolution(DPIX*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1626</i>
//       */
//      int dpixCopyResolution(DPix dpixd, DPix dpixs);
//  
//      /**
//       * Original signature : <code>l_float64* dpixGetData(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1628</i>
//       */
//      DoubleByReference dpixGetData(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixSetData(DPIX*, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1630</i>
//       */
//      int dpixSetData(DPix dpix, DoubleBuffer data);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixGetPixel(DPIX*, l_int32, l_int32, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1632</i>
//       */
//      int dpixGetPixel(DPix dpix, int x, int y, DoubleBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixSetPixel(DPIX*, l_int32, l_int32, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1634</i>
//       */
//      int dpixSetPixel(DPix dpix, int x, int y, double val);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:1636</i>
//       */
//      FPix fpixRead(String filename);
//  
//      /**
//       * Original signature : <code>FPIX* fpixReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1638</i>
//       */
//      FPix fpixReadStream(FILE fp);
    /**
     * Original signature :
     * <code>FPIX* fpixReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:1640</i>
     */
    FPix fpixReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 fpixWrite(const char*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1642</i>
//       */
//      int fpixWrite(String filename, FPix fpix);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixWriteStream(FILE*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1644</i>
//       */
//      int fpixWriteStream(FILE fp, FPix fpix);
    /**
     * Original signature :
     * <code>l_int32 fpixWriteMem(l_uint8**, size_t*, FPIX*)</code><br>
     * <i>native declaration : allheaders.h:1646</i>
     */
    int fpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, FPix fpix);

//      /**
//       * Original signature :
//       * <code>FPIX* fpixEndianByteSwap(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1648</i>
//       */
//      FPix fpixEndianByteSwap(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>DPIX* dpixRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:1650</i>
//       */
//      DPix dpixRead(String filename);
//  
//      /**
//       * Original signature : <code>DPIX* dpixReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1652</i>
//       */
//      DPix dpixReadStream(FILE fp);
    /**
     * Original signature :
     * <code>DPIX* dpixReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:1654</i>
     */
    DPix dpixReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 dpixWrite(const char*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1656</i>
//       */
//      int dpixWrite(String filename, DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixWriteStream(FILE*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1658</i>
//       */
//      int dpixWriteStream(FILE fp, DPix dpix);
    /**
     * Original signature :
     * <code>l_int32 dpixWriteMem(l_uint8**, size_t*, DPIX*)</code><br>
     * <i>native declaration : allheaders.h:1660</i>
     */
    int dpixWriteMem(PointerByReference pdata, NativeSizeByReference psize, DPix dpix);

//      /**
//       * Original signature :
//       * <code>DPIX* dpixEndianByteSwap(DPIX*, DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1662</i>
//       */
//      DPix dpixEndianByteSwap(DPix dpixd, DPix dpixs);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixPrintStream(FILE*, FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1664</i>
//       */
//      int fpixPrintStream(FILE fp, FPix fpix, int factor);
//      /**
//       * Original signature :
//       * <code>FPIX* pixConvertToFPix(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1666</i>
//       */
//      FPix pixConvertToFPix(Pix pixs, int ncomps);
//      /**
//       * Original signature :
//       * <code>DPIX* pixConvertToDPix(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1668</i>
//       */
//      DPix pixConvertToDPix(Pix pixs, int ncomps);
//      /**
//       * Original signature :
//       * <code>PIX* fpixConvertToPix(FPIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1670</i>
//       */
//      Pix fpixConvertToPix(FPix fpixs, int outdepth, int negvals, int errorflag);
//      /**
//       * Original signature :
//       * <code>PIX* fpixDisplayMaxDynamicRange(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1672</i>
//       */
//      Pix fpixDisplayMaxDynamicRange(FPix fpixs);
//  
//      /**
//       * Original signature : <code>DPIX* fpixConvertToDPix(FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1674</i>
//       */
//      DPix fpixConvertToDPix(FPix fpix);
//      /**
//       * Original signature :
//       * <code>PIX* dpixConvertToPix(DPIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1676</i>
//       */
//      Pix dpixConvertToPix(DPix dpixs, int outdepth, int negvals, int errorflag);
//  
//      /**
//       * Original signature : <code>FPIX* dpixConvertToFPix(DPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1678</i>
//       */
//      FPix dpixConvertToFPix(DPix dpix);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixGetMin(FPIX*, l_float32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1680</i>
//       */
//      int fpixGetMin(FPix fpix, FloatBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixGetMax(FPIX*, l_float32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1682</i>
//       */
//      int fpixGetMax(FPix fpix, FloatBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixGetMin(DPIX*, l_float64*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1684</i>
//       */
//      int dpixGetMin(DPix dpix, DoubleBuffer pminval, IntBuffer pxminloc, IntBuffer pyminloc);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixGetMax(DPIX*, l_float64*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1686</i>
//       */
//      int dpixGetMax(DPix dpix, DoubleBuffer pmaxval, IntBuffer pxmaxloc, IntBuffer pymaxloc);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixScaleByInteger(FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1688</i>
//       */
//      FPix fpixScaleByInteger(FPix fpixs, int factor);
//      /**
//       * Original signature :
//       * <code>DPIX* dpixScaleByInteger(DPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1690</i>
//       */
//      DPix dpixScaleByInteger(DPix dpixs, int factor);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixLinearCombination(FPIX*, FPIX*, FPIX*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1692</i>
//       */
//      FPix fpixLinearCombination(FPix fpixd, FPix fpixs1, FPix fpixs2, float a, float b);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixAddMultConstant(FPIX*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1694</i>
//       */
//      int fpixAddMultConstant(FPix fpix, float addc, float multc);
//      /**
//       * Original signature :
//       * <code>DPIX* dpixLinearCombination(DPIX*, DPIX*, DPIX*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1696</i>
//       */
//      DPix dpixLinearCombination(DPix dpixd, DPix dpixs1, DPix dpixs2, float a, float b);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixAddMultConstant(DPIX*, l_float64, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1698</i>
//       */
//      int dpixAddMultConstant(DPix dpix, double addc, double multc);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixSetAllArbitrary(FPIX*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1700</i>
//       */
//      int fpixSetAllArbitrary(FPix fpix, float inval);
//      /**
//       * Original signature :
//       * <code>l_int32 dpixSetAllArbitrary(DPIX*, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1702</i>
//       */
//      int dpixSetAllArbitrary(DPix dpix, double inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1704</i>
//       */
//      FPix fpixAddBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixRemoveBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1706</i>
//       */
//      FPix fpixRemoveBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddMirroredBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1708</i>
//       */
//      FPix fpixAddMirroredBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddContinuedBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1710</i>
//       */
//      FPix fpixAddContinuedBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAddSlopeBorder(FPIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1712</i>
//       */
//      FPix fpixAddSlopeBorder(FPix fpixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>l_int32 fpixRasterop(FPIX*, l_int32, l_int32, l_int32, l_int32, FPIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1714</i>
//       */
//      int fpixRasterop(FPix fpixd, int dx, int dy, int dw, int dh, FPix fpixs, int sx, int sy);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixRotateOrth(FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1716</i>
//       */
//      FPix fpixRotateOrth(FPix fpixs, int quads);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRotate180(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1718</i>
//       */
//      FPix fpixRotate180(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixRotate90(FPIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1720</i>
//       */
//      FPix fpixRotate90(FPix fpixs, int direction);
//  
//      /**
//       * Original signature : <code>FPIX* fpixFlipLR(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1722</i>
//       */
//      FPix fpixFlipLR(FPix fpixd, FPix fpixs);
//  
//      /**
//       * Original signature : <code>FPIX* fpixFlipTB(FPIX*, FPIX*)</code><br>
//       * <i>native declaration : allheaders.h:1724</i>
//       */
//      FPix fpixFlipTB(FPix fpixd, FPix fpixs);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAffinePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1726</i>
//       */
//      FPix fpixAffinePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixAffine(FPIX*, l_float32*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1728</i>
//       */
//      FPix fpixAffine(FPix fpixs, FloatBuffer vc, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixProjectivePta(FPIX*, PTA*, PTA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1730</i>
//       */
//      FPix fpixProjectivePta(FPix fpixs, Pta ptad, Pta ptas, int border, float inval);
//      /**
//       * Original signature :
//       * <code>FPIX* fpixProjective(FPIX*, l_float32*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1732</i>
//       */
//      FPix fpixProjective(FPix fpixs, FloatBuffer vc, float inval);
    /**
     * Original signature :
     * <code>l_int32 linearInterpolatePixelFloat(l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:1734</i>
     */
    int linearInterpolatePixelFloat(FloatBuffer datas, int w, int h, float x, float y, float inval, FloatBuffer pval);

    /**
     * Original signature :
     * <code>PIX* fpixThresholdToPix(FPIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1736</i>
     */
    Pix fpixThresholdToPix(FPix fpix, float thresh);

    /**
     * Original signature :
     * <code>FPIX* pixComponentFunction(PIX*, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1738</i>
     */
    FPix pixComponentFunction(Pix pix, float rnum, float gnum, float bnum, float rdenom, float gdenom, float bdenom);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamGif(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:1740</i>
//       */
//      Pix pixReadStreamGif(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamGif(FILE*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:1742</i>
//       */
//      int pixWriteStreamGif(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>PIX* pixReadMemGif(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:1744</i>
     */
    Pix pixReadMemGif(ByteBuffer cdata, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemGif(l_uint8**, size_t*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1746</i>
     */
    int pixWriteMemGif(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

//      /**
//       * Original signature :
//       * <code>GPLOT* gplotCreate(const char*, l_int32, const char*, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1748</i>
//       */
//      GPlot gplotCreate(String rootname, int outformat, String title, String xlabel, String ylabel);
//  
//      /**
//       * Original signature : <code>void gplotDestroy(GPLOT**)</code><br>
//       * <i>native declaration : allheaders.h:1750</i>
//       */
//      void gplotDestroy(PointerByReference pgplot);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotAddPlot(GPLOT*, NUMA*, NUMA*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1752</i>
//       */
//      int gplotAddPlot(GPlot gplot, Numa nax, Numa nay, int plotstyle, String plottitle);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSetScaling(GPLOT*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1754</i>
//       */
//      int gplotSetScaling(GPlot gplot, int scaling);
//  
//      /**
//       * Original signature : <code>l_int32 gplotMakeOutput(GPLOT*)</code><br>
//       * <i>native declaration : allheaders.h:1756</i>
//       */
//      int gplotMakeOutput(GPlot gplot);
//  
//      /**
//       * Original signature : <code>l_int32 gplotGenCommandFile(GPLOT*)</code><br>
//       * <i>native declaration : allheaders.h:1758</i>
//       */
//      int gplotGenCommandFile(GPlot gplot);
//  
//      /**
//       * Original signature : <code>l_int32 gplotGenDataFiles(GPLOT*)</code><br>
//       * <i>native declaration : allheaders.h:1760</i>
//       */
//      int gplotGenDataFiles(GPlot gplot);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimple1(NUMA*, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1762</i>
//       */
//      int gplotSimple1(Numa na, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimple2(NUMA*, NUMA*, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1764</i>
//       */
//      int gplotSimple2(Numa na1, Numa na2, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimpleN(NUMAA*, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1766</i>
//       */
//      int gplotSimpleN(Numaa naa, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimpleXY1(NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1768</i>
//       */
//      int gplotSimpleXY1(Numa nax, Numa nay, int plotstyle, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimpleXY2(NUMA*, NUMA*, NUMA*, l_int32, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1770</i>
//       */
//      int gplotSimpleXY2(Numa nax, Numa nay1, Numa nay2, int plotstyle, int outformat, String outroot, String title);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotSimpleXYN(NUMA*, NUMAA*, l_int32, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:1772</i>
//       */
//      int gplotSimpleXYN(Numa nax, Numaa naay, int plotstyle, int outformat, String outroot, String title);
//  
//      /**
//       * Original signature : <code>GPLOT* gplotRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:1774</i>
//       */
//      GPlot gplotRead(String filename);
//      /**
//       * Original signature :
//       * <code>l_int32 gplotWrite(const char*, GPLOT*)</code><br>
//       * <i>native declaration : allheaders.h:1776</i>
//       */
//      int gplotWrite(String filename, GPlot gplot);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaLine(l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1778</i>
//       */
//      Pta generatePtaLine(int x1, int y1, int x2, int y2);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaWideLine(l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1780</i>
//       */
//      Pta generatePtaWideLine(int x1, int y1, int x2, int y2, int width);
//  
//      /**
//       * Original signature : <code>PTA* generatePtaBox(BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1782</i>
//       */
//      Pta generatePtaBox(Box box, int width);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaBoxa(BOXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1784</i>
//       */
//      Pta generatePtaBoxa(Boxa boxa, int width, int removedups);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaHashBox(BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1786</i>
//       */
//      Pta generatePtaHashBox(Box box, int spacing, int width, int orient, int outline);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1788</i>
//       */
//      Pta generatePtaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline, int removedups);
//  
//      /**
//       * Original signature : <code>PTAA* generatePtaaBoxa(BOXA*)</code><br>
//       * <i>native declaration : allheaders.h:1790</i>
//       */
//      Ptaa generatePtaaBoxa(Boxa boxa);
//      /**
//       * Original signature :
//       * <code>PTAA* generatePtaaHashBoxa(BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1792</i>
//       */
//      Ptaa generatePtaaHashBoxa(Boxa boxa, int spacing, int width, int orient, int outline);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaPolyline(PTA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1794</i>
//       */
//      Pta generatePtaPolyline(Pta ptas, int width, int closeflag, int removedups);
    /**
     * Original signature :
     * <code>PTA* generatePtaGrid(l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1796</i>
     */
    Pta generatePtaGrid(int w, int h, int nx, int ny, int width);
//  
//      /**
//       * Original signature : <code>PTA* convertPtaLineTo4cc(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:1798</i>
//       */
//      Pta convertPtaLineTo4cc(Pta ptas);

//      /**
//       * Original signature :
//       * <code>PTA* generatePtaFilledCircle(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1800</i>
//       */
//      Pta generatePtaFilledCircle(int radius);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaFilledSquare(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1802</i>
//       */
//      Pta generatePtaFilledSquare(int side);
//      /**
//       * Original signature :
//       * <code>PTA* generatePtaLineFromPt(l_int32, l_int32, l_float64, l_float64)</code><br>
//       * <i>native declaration : allheaders.h:1804</i>
//       */
//      Pta generatePtaLineFromPt(int x, int y, double length, double radang);
//      /**
//       * Original signature :
//       * <code>l_int32 locatePtRadially(l_int32, l_int32, l_float64, l_float64, l_float64*, l_float64*)</code><br>
//       * <i>native declaration : allheaders.h:1806</i>
//       */
//      int locatePtRadially(int xr, int yr, double dist, double radang, DoubleBuffer px, DoubleBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRenderPlotFromNuma(PIX**, NUMA*, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:1808</i>
//       */
//      int pixRenderPlotFromNuma(PointerByReference ppix, Numa na, int plotloc, int linewidth, int max, int color);
//      /**
//       * Original signature :
//       * <code>PTA* makePlotPtaFromNuma(NUMA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1810</i>
//       */
//      Pta makePlotPtaFromNuma(Numa na, int size, int plotloc, int linewidth, int max);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRenderPlotFromNumaGen(PIX**, NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:1812</i>
//       */
//      int pixRenderPlotFromNumaGen(PointerByReference ppix, Numa na, int orient, int linewidth, int refpos, int max, int drawref, int color);
//      /**
//       * Original signature :
//       * <code>PTA* makePlotPtaFromNumaGen(NUMA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1814</i>
//       */
//      Pta makePlotPtaFromNumaGen(Numa na, int orient, int linewidth, int refpos, int max, int drawref);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRenderPta(PIX*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1816</i>
//       */
//      int pixRenderPta(Pix pix, Pta pta, int op);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRenderPtaArb(PIX*, PTA*, l_uint8, l_uint8, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:1818</i>
//       */
//      int pixRenderPtaArb(Pix pix, Pta pta, byte rval, byte gval, byte bval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRenderPtaBlend(PIX*, PTA*, l_uint8, l_uint8, l_uint8, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1820</i>
//       */
//      int pixRenderPtaBlend(Pix pix, Pta pta, byte rval, byte gval, byte bval, float fract);
    /**
     * Original signature :
     * <code>l_int32 pixRenderLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1822</i>
     */
    int pixRenderLine(Pix pix, int x1, int y1, int x2, int y2, int width, int op);

    /**
     * Original signature :
     * <code>l_int32 pixRenderLineArb(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:1824</i>
     */
    int pixRenderLineArb(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderLineBlend(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1826</i>
     */
    int pixRenderLineBlend(Pix pix, int x1, int y1, int x2, int y2, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBox(PIX*, BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1828</i>
     */
    int pixRenderBox(Pix pix, Box box, int width, int op);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBoxArb(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:1830</i>
     */
    int pixRenderBoxArb(Pix pix, Box box, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBoxBlend(PIX*, BOX*, l_int32, l_uint8, l_uint8, l_uint8, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1832</i>
     */
    int pixRenderBoxBlend(Pix pix, Box box, int width, byte rval, byte gval, byte bval, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBoxa(PIX*, BOXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1834</i>
     */
    int pixRenderBoxa(Pix pix, Boxa boxa, int width, int op);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBoxaArb(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:1836</i>
     */
    int pixRenderBoxaArb(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderBoxaBlend(PIX*, BOXA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1838</i>
     */
    int pixRenderBoxaBlend(Pix pix, Boxa boxa, int width, byte rval, byte gval, byte bval, float fract, int removedups);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBox(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1840</i>
     */
    int pixRenderHashBox(Pix pix, Box box, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBoxArb(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1842</i>
     */
    int pixRenderHashBoxArb(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBoxBlend(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1844</i>
     */
    int pixRenderHashBoxBlend(Pix pix, Box box, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashMaskArb(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1846</i>
     */
    int pixRenderHashMaskArb(Pix pix, Pix pixm, int x, int y, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBoxa(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1848</i>
     */
    int pixRenderHashBoxa(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int op);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBoxaArb(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1850</i>
     */
    int pixRenderHashBoxaArb(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixRenderHashBoxaBlend(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1852</i>
     */
    int pixRenderHashBoxaBlend(Pix pix, Boxa boxa, int spacing, int width, int orient, int outline, int rval, int gval, int bval, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixRenderPolyline(PIX*, PTA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1854</i>
     */
    int pixRenderPolyline(Pix pix, Pta ptas, int width, int op, int closeflag);

    /**
     * Original signature :
     * <code>l_int32 pixRenderPolylineArb(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1856</i>
     */
    int pixRenderPolylineArb(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, int closeflag);

    /**
     * Original signature :
     * <code>l_int32 pixRenderPolylineBlend(PIX*, PTA*, l_int32, l_uint8, l_uint8, l_uint8, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1858</i>
     */
    int pixRenderPolylineBlend(Pix pix, Pta ptas, int width, byte rval, byte gval, byte bval, float fract, int closeflag, int removedups);

    /**
     * Original signature :
     * <code>l_int32 pixRenderGridArb(PIX*, l_int32, l_int32, l_int32, l_uint8, l_uint8, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:1860</i>
     */
    int pixRenderGridArb(Pix pix, int nx, int ny, int width, byte rval, byte gval, byte bval);

    /**
     * Original signature :
     * <code>PIX* pixRenderRandomCmapPtaa(PIX*, PTAA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1862</i>
     */
    Pix pixRenderRandomCmapPtaa(Pix pix, Ptaa ptaa, int polyflag, int width, int closeflag);

    /**
     * Original signature :
     * <code>PIX* pixRenderPolygon(PTA*, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1864</i>
     */
    Pix pixRenderPolygon(Pta ptas, int width, IntBuffer pxmin, IntBuffer pymin);

    /**
     * Original signature :
     * <code>PIX* pixFillPolygon(PIX*, PTA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1866</i>
     */
    Pix pixFillPolygon(Pix pixs, Pta pta, int xmin, int ymin);

    /**
     * Original signature :
     * <code>PIX* pixRenderContours(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1868</i>
     */
    Pix pixRenderContours(Pix pixs, int startval, int incr, int outdepth);

    /**
     * Original signature :
     * <code>PIX* fpixAutoRenderContours(FPIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1870</i>
     */
    Pix fpixAutoRenderContours(FPix fpix, int ncontours);

    /**
     * Original signature :
     * <code>PIX* fpixRenderContours(FPIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1872</i>
     */
    Pix fpixRenderContours(FPix fpixs, float incr, float proxim);

    /**
     * Original signature :
     * <code>PTA* pixGeneratePtaBoundary(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1874</i>
     */
    Pta pixGeneratePtaBoundary(Pix pixs, int width);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1876</i>
     */
    Pix pixErodeGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1878</i>
     */
    Pix pixDilateGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1880</i>
     */
    Pix pixOpenGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1882</i>
     */
    Pix pixCloseGray(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeGray3(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1884</i>
     */
    Pix pixErodeGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateGray3(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1886</i>
     */
    Pix pixDilateGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenGray3(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1888</i>
     */
    Pix pixOpenGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseGray3(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1890</i>
     */
    Pix pixCloseGray3(Pix pixs, int hsize, int vsize);

    /**
     * Original signature : <code>PIX* pixDitherToBinary(PIX*)</code><br>
     * <i>native declaration : allheaders.h:1892</i>
     */
    Pix pixDitherToBinary(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixDitherToBinarySpec(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1894</i>
     */
    Pix pixDitherToBinarySpec(Pix pixs, int lowerclip, int upperclip);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToBinary(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1896</i>
     */
    Pix pixThresholdToBinary(Pix pixs, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixVarThresholdToBinary(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:1898</i>
     */
    Pix pixVarThresholdToBinary(Pix pixs, Pix pixg);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinary(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:1900</i>
     */
    Pix pixAdaptThresholdToBinary(Pix pixs, Pix pixm, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixAdaptThresholdToBinaryGen(PIX*, PIX*, l_float32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1902</i>
     */
    Pix pixAdaptThresholdToBinaryGen(Pix pixs, Pix pixm, float gamma, int blackval, int whiteval, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByValue(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1904</i>
     */
    Pix pixGenerateMaskByValue(Pix pixs, int val, int usecmap);

    /**
     * Original signature :
     * <code>PIX* pixGenerateMaskByBand(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1906</i>
     */
    Pix pixGenerateMaskByBand(Pix pixs, int lower, int upper, int inband, int usecmap);

    /**
     * Original signature : <code>PIX* pixDitherTo2bpp(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1908</i>
     */
    Pix pixDitherTo2bpp(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixDitherTo2bppSpec(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1910</i>
     */
    Pix pixDitherTo2bppSpec(Pix pixs, int lowerclip, int upperclip, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo2bpp(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1912</i>
     */
    Pix pixThresholdTo2bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdTo4bpp(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1914</i>
     */
    Pix pixThresholdTo4bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdOn8bpp(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1916</i>
     */
    Pix pixThresholdOn8bpp(Pix pixs, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixThresholdGrayArb(PIX*, const char*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1918</i>
     */
    Pix pixThresholdGrayArb(Pix pixs, String edgevals, int outdepth, int use_average, int setblack, int setwhite);

//      /**
//       * Original signature :
//       * <code>l_int32* makeGrayQuantIndexTable(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1920</i>
//       */
//      IntByReference makeGrayQuantIndexTable(int nlevels);
//      /**
//       * Original signature :
//       * <code>l_int32* makeGrayQuantTargetTable(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1922</i>
//       */
//      IntByReference makeGrayQuantTargetTable(int nlevels, int depth);
//      /**
//       * Original signature :
//       * <code>l_int32 makeGrayQuantTableArb(NUMA*, l_int32, l_int32**, PIXCMAP**)</code><br>
//       * <i>native declaration : allheaders.h:1924</i>
//       */
//      int makeGrayQuantTableArb(Numa na, int outdepth, PointerByReference ptab, PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>l_int32 makeGrayQuantColormapArb(PIX*, l_int32*, l_int32, PIXCMAP**)</code><br>
//       * <i>native declaration : allheaders.h:1926</i>
//       */
//      int makeGrayQuantColormapArb(Pix pixs, IntBuffer tab, int outdepth, PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>l_int32 makeGrayQuantColormapArb(PIX*, l_int32*, l_int32, PIXCMAP**)</code><br>
//       * <i>native declaration : allheaders.h:1926</i>
//       */
//      int makeGrayQuantColormapArb(Pix pixs, IntByReference tab, int outdepth, PointerByReference pcmap);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateMaskByBand32(PIX*, l_uint32, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1928</i>
//       */
//      Pix pixGenerateMaskByBand32(Pix pixs, int refval, int delm, int delp, float fractm, float fractp);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateMaskByDiscr32(PIX*, l_uint32, l_uint32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1930</i>
//       */
//      Pix pixGenerateMaskByDiscr32(Pix pixs, int refval1, int refval2, int distflag);
//      /**
//       * Original signature :
//       * <code>PIX* pixGrayQuantFromHisto(PIX*, PIX*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1932</i>
//       */
//      Pix pixGrayQuantFromHisto(Pix pixd, Pix pixs, Pix pixm, float minfract, int maxsize);
//      /**
//       * Original signature :
//       * <code>PIX* pixGrayQuantFromCmap(PIX*, PIXCMAP*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1934</i>
//       */
//      Pix pixGrayQuantFromCmap(Pix pixs, PixColormap cmap, int mindepth);
//      /**
//       * Original signature :
//       * <code>void ditherToBinaryLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1936</i>
//       */
//      void ditherToBinaryLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip);
//      /**
//       * Original signature :
//       * <code>void ditherToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1938</i>
//       */
//      void ditherToBinaryLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, int lowerclip, int upperclip, int lastlineflag);
    /**
     * Original signature :
     * <code>void thresholdToBinaryLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1940</i>
     */
    void thresholdToBinaryLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int d, int wpls, int thresh);

    /**
     * Original signature :
     * <code>void thresholdToBinaryLineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1942</i>
     */
    void thresholdToBinaryLineLow(IntBuffer lined, int w, IntBuffer lines, int d, int thresh);

    /**
     * Original signature :
     * <code>void ditherTo2bppLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1944</i>
     */
    void ditherTo2bppLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14);

    /**
     * Original signature :
     * <code>void ditherTo2bppLineLow(l_uint32*, l_int32, l_uint32*, l_uint32*, l_int32*, l_int32*, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1946</i>
     */
    void ditherTo2bppLineLow(IntBuffer lined, int w, IntBuffer bufs1, IntBuffer bufs2, IntBuffer tabval, IntBuffer tab38, IntBuffer tab14, int lastlineflag);

    /**
     * Original signature :
     * <code>l_int32 make8To2DitherTables(l_int32**, l_int32**, l_int32**, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1948</i>
     */
    int make8To2DitherTables(PointerByReference ptabval, PointerByReference ptab38, PointerByReference ptab14, int cliptoblack, int cliptowhite);

    /**
     * Original signature :
     * <code>void thresholdTo2bppLow(l_uint32*, l_int32, l_int32, l_uint32*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1950</i>
     */
    void thresholdTo2bppLow(IntBuffer datad, int h, int wpld, IntBuffer datas, int wpls, IntBuffer tab);

    /**
     * Original signature :
     * <code>void thresholdTo4bppLow(l_uint32*, l_int32, l_int32, l_uint32*, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1952</i>
     */
    void thresholdTo4bppLow(IntBuffer datad, int h, int wpld, IntBuffer datas, int wpls, IntBuffer tab);

    /**
     * Original signature :
     * <code>L_HEAP* lheapCreate(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1954</i>
     */
    L_Heap lheapCreate(int nalloc, int direction);

    /**
     * Original signature :
     * <code>void lheapDestroy(L_HEAP**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1956</i>
     */
    void lheapDestroy(PointerByReference plh, int freeflag);

    /**
     * Original signature : <code>l_int32 lheapAdd(L_HEAP*, void*)</code><br>
     * <i>native declaration : allheaders.h:1958</i>
     */
    int lheapAdd(L_Heap lh, Pointer item);

    /**
     * Original signature : <code>void* lheapRemove(L_HEAP*)</code><br>
     * <i>native declaration : allheaders.h:1960</i>
     */
    Pointer lheapRemove(L_Heap lh);

    /**
     * Original signature : <code>l_int32 lheapGetCount(L_HEAP*)</code><br>
     * <i>native declaration : allheaders.h:1962</i>
     */
    int lheapGetCount(L_Heap lh);

    /**
     * Original signature :
     * <code>l_int32 lheapSwapUp(L_HEAP*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:1964</i>
     */
    int lheapSwapUp(L_Heap lh, int index);

    /**
     * Original signature : <code>l_int32 lheapSwapDown(L_HEAP*)</code><br>
     * <i>native declaration : allheaders.h:1966</i>
     */
    int lheapSwapDown(L_Heap lh);

    /**
     * Original signature : <code>l_int32 lheapSort(L_HEAP*)</code><br>
     * <i>native declaration : allheaders.h:1968</i>
     */
    int lheapSort(L_Heap lh);

    /**
     * Original signature :
     * <code>l_int32 lheapSortStrictOrder(L_HEAP*)</code><br>
     * <i>native declaration : allheaders.h:1970</i>
     */
    int lheapSortStrictOrder(L_Heap lh);
//  
//      /**
//       * Original signature : <code>l_int32 lheapPrint(FILE*, L_HEAP*)</code><br>
//       * <i>native declaration : allheaders.h:1972</i>
//       */
//      int lheapPrint(FILE fp, L_Heap lh);

//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbRankHausInit(l_int32, l_int32, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1974</i>
//       */
//      JbClasser jbRankHausInit(int components, int maxwidth, int maxheight, int size, float rank);
//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbCorrelationInit(l_int32, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1976</i>
//       */
//      JbClasser jbCorrelationInit(int components, int maxwidth, int maxheight, float thresh, float weightfactor);
//      /**
//       * Original signature :
//       * <code>JBCLASSER* jbCorrelationInitWithoutComponents(l_int32, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:1978</i>
//       */
//      JbClasser jbCorrelationInitWithoutComponents(int components, int maxwidth, int maxheight, float thresh, float weightfactor);
//      /**
//       * Original signature :
//       * <code>l_int32 jbAddPages(JBCLASSER*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:1980</i>
//       */
//      int jbAddPages(JbClasser classer, Sarray safiles);
//  
//      /**
//       * Original signature : <code>l_int32 jbAddPage(JBCLASSER*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:1982</i>
//       */
//      int jbAddPage(JbClasser classer, Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_int32 jbAddPageComponents(JBCLASSER*, PIX*, BOXA*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:1984</i>
//       */
//      int jbAddPageComponents(JbClasser classer, Pix pixs, Boxa boxas, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_int32 jbClassifyRankHaus(JBCLASSER*, BOXA*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:1986</i>
//       */
//      int jbClassifyRankHaus(JbClasser classer, Boxa boxa, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_int32 pixHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:1988</i>
//       */
//      int pixHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRankHaustest(PIX*, PIX*, PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:1990</i>
//       */
//      int pixRankHaustest(Pix pix1, Pix pix2, Pix pix3, Pix pix4, float delx, float dely, int maxdiffw, int maxdiffh, int area1, int area3, float rank, IntBuffer tab8);
//      /**
//       * Original signature :
//       * <code>l_int32 jbClassifyCorrelation(JBCLASSER*, BOXA*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:1992</i>
//       */
//      int jbClassifyCorrelation(JbClasser classer, Boxa boxa, Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_int32 jbGetComponents(PIX*, l_int32, l_int32, l_int32, BOXA**, PIXA**)</code><br>
//       * <i>native declaration : allheaders.h:1994</i>
//       */
//      int jbGetComponents(Pix pixs, int components, int maxwidth, int maxheight, PointerByReference pboxad, PointerByReference ppixad);
    /**
     * Original signature :
     * <code>l_int32 pixWordMaskByDilation(PIX*, l_int32, PIX**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1996</i>
     */
    int pixWordMaskByDilation(Pix pixs, int maxdil, PointerByReference ppixm, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_int32 pixWordMaskByDilation(PIX*, l_int32, PIX**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1996</i>
     */
    int pixWordMaskByDilation(Pix pixs, int maxdil, PointerByReference ppixm, IntByReference psize);

    /**
     * Original signature :
     * <code>l_int32 pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1998</i>
     */
    int pixWordBoxesByDilation(Pix pixs, int maxdil, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntBuffer psize);

    /**
     * Original signature :
     * <code>l_int32 pixWordBoxesByDilation(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, BOXA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:1998</i>
     */
    int pixWordBoxesByDilation(Pix pixs, int maxdil, int minwidth, int minheight, int maxwidth, int maxheight, PointerByReference pboxa, IntByReference psize);

    /**
     * Original signature :
     * <code>PIXA* jbAccumulateComposites(PIXAA*, NUMA**, PTA**)</code><br>
     * <i>native declaration : allheaders.h:2000</i>
     */
    Pixa jbAccumulateComposites(Pixaa pixaa, PointerByReference pna, PointerByReference pptat);

    /**
     * Original signature :
     * <code>PIXA* jbTemplatesFromComposites(PIXA*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:2002</i>
     */
    Pixa jbTemplatesFromComposites(Pixa pixac, Numa na);

    /**
     * Original signature :
     * <code>JBCLASSER* jbClasserCreate(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2004</i>
     */
    JbClasser jbClasserCreate(int method, int components);

    /**
     * Original signature : <code>void jbClasserDestroy(JBCLASSER**)</code><br>
     * <i>native declaration : allheaders.h:2006</i>
     */
    void jbClasserDestroy(PointerByReference pclasser);

    /**
     * Original signature : <code>JBDATA* jbDataSave(JBCLASSER*)</code><br>
     * <i>native declaration : allheaders.h:2008</i>
     */
    JbData jbDataSave(JbClasser classer);

    /**
     * Original signature : <code>void jbDataDestroy(JBDATA**)</code><br>
     * <i>native declaration : allheaders.h:2010</i>
     */
    void jbDataDestroy(PointerByReference pdata);

    /**
     * Original signature :
     * <code>l_int32 jbDataWrite(const char*, JBDATA*)</code><br>
     * <i>native declaration : allheaders.h:2012</i>
     */
    int jbDataWrite(String rootout, JbData jbdata);

    /**
     * Original signature : <code>JBDATA* jbDataRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:2014</i>
     */
    JbData jbDataRead(String rootname);

    /**
     * Original signature :
     * <code>PIXA* jbDataRender(JBDATA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2016</i>
     */
    Pixa jbDataRender(JbData data, int debugflag);

    /**
     * Original signature :
     * <code>l_int32 jbGetULCorners(JBCLASSER*, PIX*, BOXA*)</code><br>
     * <i>native declaration : allheaders.h:2018</i>
     */
    int jbGetULCorners(JbClasser classer, Pix pixs, Boxa boxa);

    /**
     * Original signature : <code>l_int32 jbGetLLCorners(JBCLASSER*)</code><br>
     * <i>native declaration : allheaders.h:2020</i>
     */
    int jbGetLLCorners(JbClasser classer);

    /**
     * Original signature :
     * <code>l_int32 readHeaderJp2k(const char*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2022</i>
     */
    int readHeaderJp2k(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_int32 freadHeaderJp2k(FILE*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2024</i>
//       */
//      int freadHeaderJp2k(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);
    /**
     * Original signature :
     * <code>l_int32 readHeaderMemJp2k(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2026</i>
     */
    int readHeaderMemJp2k(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_int32 fgetJp2kResolution(FILE*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2028</i>
//       */
//      int fgetJp2kResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);
    /**
     * Original signature :
     * <code>PIX* pixReadJp2k(const char*, l_uint32, BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2030</i>
     */
    Pix pixReadJp2k(String filename, int reduction, Box box, int hint, int debug);

//      /**
//       * Original signature :
//       * <code>PIX* pixReadStreamJp2k(FILE*, l_uint32, BOX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2032</i>
//       */
//      Pix pixReadStreamJp2k(FILE fp, int reduction, Box box, int hint, int debug);
    /**
     * Original signature :
     * <code>l_int32 pixWriteJp2k(const char*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2034</i>
     */
    int pixWriteJp2k(String filename, Pix pix, int quality, int nlevels, int hint, int debug);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamJp2k(FILE*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2036</i>
//       */
//      int pixWriteStreamJp2k(FILE fp, Pix pix, int quality, int nlevels, int hint, int debug);
    /**
     * Original signature :
     * <code>PIX* pixReadMemJp2k(const l_uint8*, size_t, l_uint32, BOX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2038</i>
     */
    Pix pixReadMemJp2k(ByteBuffer data, NativeSize size, int reduction, Box box, int hint, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemJp2k(l_uint8**, size_t*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2040</i>
     */
    int pixWriteMemJp2k(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int nlevels, int hint, int debug);

    /**
     * Original signature :
     * <code>PIX* pixReadJpeg(const char*, l_int32, l_int32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2042</i>
     */
    Pix pixReadJpeg(String filename, int cmapflag, int reduction, IntBuffer pnwarn, int hint);

//      /**
//       * Original signature :
//       * <code>PIX* pixReadStreamJpeg(FILE*, l_int32, l_int32, l_int32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2044</i>
//       */
//      Pix pixReadStreamJpeg(FILE fp, int cmapflag, int reduction, IntBuffer pnwarn, int hint);
    /**
     * Original signature :
     * <code>l_int32 readHeaderJpeg(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2046</i>
     */
    int readHeaderJpeg(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

//      /**
//       * Original signature :
//       * <code>l_int32 freadHeaderJpeg(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2048</i>
//       */
//      int freadHeaderJpeg(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);
//      /**
//       * Original signature :
//       * <code>l_int32 fgetJpegResolution(FILE*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2050</i>
//       */
//      int fgetJpegResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);
//      /**
//       * Original signature :
//       * <code>l_int32 fgetJpegComment(FILE*, l_uint8**)</code><br>
//       * <i>native declaration : allheaders.h:2052</i>
//       */
//      int fgetJpegComment(FILE fp, PointerByReference pcomment);
    /**
     * Original signature :
     * <code>l_int32 pixWriteJpeg(const char*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2054</i>
     */
    int pixWriteJpeg(String filename, Pix pix, int quality, int progressive);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamJpeg(FILE*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2056</i>
//       */
//      int pixWriteStreamJpeg(FILE fp, Pix pixs, int quality, int progressive);
    /**
     * Original signature :
     * <code>PIX* pixReadMemJpeg(const l_uint8*, size_t, l_int32, l_int32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2058</i>
     */
    Pix pixReadMemJpeg(ByteBuffer data, NativeSize size, int cmflag, int reduction, IntBuffer pnwarn, int hint);

    /**
     * Original signature :
     * <code>l_int32 readHeaderMemJpeg(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2060</i>
     */
    int readHeaderMemJpeg(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp, IntBuffer pycck, IntBuffer pcmyk);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemJpeg(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2062</i>
     */
    int pixWriteMemJpeg(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int quality, int progressive);

    /**
     * Original signature :
     * <code>l_int32 pixSetChromaSampling(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2064</i>
     */
    int pixSetChromaSampling(Pix pix, int sampling);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreate(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2066</i>
     */
    L_Kernel kernelCreate(int height, int width);

    /**
     * Original signature : <code>void kernelDestroy(L_KERNEL**)</code><br>
     * <i>native declaration : allheaders.h:2068</i>
     */
    void kernelDestroy(PointerByReference pkel);

    /**
     * Original signature : <code>L_KERNEL* kernelCopy(L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:2070</i>
     */
    L_Kernel kernelCopy(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_int32 kernelGetElement(L_KERNEL*, l_int32, l_int32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:2072</i>
     */
    int kernelGetElement(L_Kernel kel, int row, int col, FloatBuffer pval);

    /**
     * Original signature :
     * <code>l_int32 kernelSetElement(L_KERNEL*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2074</i>
     */
    int kernelSetElement(L_Kernel kel, int row, int col, float val);

    /**
     * Original signature :
     * <code>l_int32 kernelGetParameters(L_KERNEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2076</i>
     */
    int kernelGetParameters(L_Kernel kel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);

    /**
     * Original signature :
     * <code>l_int32 kernelSetOrigin(L_KERNEL*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2078</i>
     */
    int kernelSetOrigin(L_Kernel kel, int cy, int cx);

    /**
     * Original signature :
     * <code>l_int32 kernelGetSum(L_KERNEL*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:2080</i>
     */
    int kernelGetSum(L_Kernel kel, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_int32 kernelGetMinMax(L_KERNEL*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:2082</i>
     */
    int kernelGetMinMax(L_Kernel kel, FloatBuffer pmin, FloatBuffer pmax);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelNormalize(L_KERNEL*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2084</i>
     */
    L_Kernel kernelNormalize(L_Kernel kels, float normsum);

    /**
     * Original signature : <code>L_KERNEL* kernelInvert(L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:2086</i>
     */
    L_Kernel kernelInvert(L_Kernel kels);

    /**
     * Original signature :
     * <code>l_float32** create2dFloatArray(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2088</i>
     */
    PointerByReference create2dFloatArray(int sy, int sx);

    /**
     * Original signature : <code>L_KERNEL* kernelRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:2090</i>
     */
    L_Kernel kernelRead(String fname);
//  
//      /**
//       * Original signature : <code>L_KERNEL* kernelReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:2092</i>
//       */
//      L_Kernel kernelReadStream(FILE fp);

    /**
     * Original signature :
     * <code>l_int32 kernelWrite(const char*, L_KERNEL*)</code><br>
     * <i>native declaration : allheaders.h:2094</i>
     */
    int kernelWrite(String fname, L_Kernel kel);

//      /**
//       * Original signature :
//       * <code>l_int32 kernelWriteStream(FILE*, L_KERNEL*)</code><br>
//       * <i>native declaration : allheaders.h:2096</i>
//       */
//      int kernelWriteStream(FILE fp, L_Kernel kel);
    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromString(l_int32, l_int32, l_int32, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:2098</i>
     */
    L_Kernel kernelCreateFromString(int h, int w, int cy, int cx, String kdata);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromFile(const char*)</code><br>
     * <i>native declaration : allheaders.h:2100</i>
     */
    L_Kernel kernelCreateFromFile(String filename);

    /**
     * Original signature :
     * <code>L_KERNEL* kernelCreateFromPix(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2102</i>
     */
    L_Kernel kernelCreateFromPix(Pix pix, int cy, int cx);

    /**
     * Original signature :
     * <code>PIX* kernelDisplayInPix(L_KERNEL*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2104</i>
     */
    Pix kernelDisplayInPix(L_Kernel kel, int size, int gthick);

    /**
     * Original signature :
     * <code>NUMA* parseStringForNumbers(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2106</i>
     */
    Numa parseStringForNumbers(String str, String seps);

    /**
     * Original signature :
     * <code>L_KERNEL* makeFlatKernel(l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2108</i>
     */
    L_Kernel makeFlatKernel(int height, int width, int cy, int cx);

    /**
     * Original signature :
     * <code>L_KERNEL* makeGaussianKernel(l_int32, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2110</i>
     */
    L_Kernel makeGaussianKernel(int halfheight, int halfwidth, float stdev, float max);

    /**
     * Original signature :
     * <code>l_int32 makeGaussianKernelSep(l_int32, l_int32, l_float32, l_float32, L_KERNEL**, L_KERNEL**)</code><br>
     * <i>native declaration : allheaders.h:2112</i>
     */
    int makeGaussianKernelSep(int halfheight, int halfwidth, float stdev, float max, PointerByReference pkelx, PointerByReference pkely);

    /**
     * Original signature :
     * <code>L_KERNEL* makeDoGKernel(l_int32, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2114</i>
     */
    L_Kernel makeDoGKernel(int halfheight, int halfwidth, float stdev, float ratio);

    /**
     * Original signature : <code>char* getImagelibVersions()</code><br>
     * <i>native declaration : allheaders.h:2116</i>
     */
    Pointer getImagelibVersions();

    /**
     * Original signature : <code>void listDestroy(DLLIST**)</code><br>
     * <i>native declaration : allheaders.h:2118</i>
     */
    void listDestroy(PointerByReference phead);

    /**
     * Original signature :
     * <code>l_int32 listAddToHead(DLLIST**, void*)</code><br>
     * <i>native declaration : allheaders.h:2120</i>
     */
    int listAddToHead(PointerByReference phead, Pointer data);

    /**
     * Original signature :
     * <code>l_int32 listAddToTail(DLLIST**, DLLIST**, void*)</code><br>
     * <i>native declaration : allheaders.h:2122</i>
     */
    int listAddToTail(PointerByReference phead, PointerByReference ptail, Pointer data);

    /**
     * Original signature :
     * <code>l_int32 listInsertBefore(DLLIST**, DLLIST*, void*)</code><br>
     * <i>native declaration : allheaders.h:2124</i>
     */
    int listInsertBefore(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>l_int32 listInsertAfter(DLLIST**, DLLIST*, void*)</code><br>
     * <i>native declaration : allheaders.h:2126</i>
     */
    int listInsertAfter(PointerByReference phead, DoubleLinkedList elem, Pointer data);

    /**
     * Original signature :
     * <code>void* listRemoveElement(DLLIST**, DLLIST*)</code><br>
     * <i>native declaration : allheaders.h:2128</i>
     */
    Pointer listRemoveElement(PointerByReference phead, DoubleLinkedList elem);

    /**
     * Original signature : <code>void* listRemoveFromHead(DLLIST**)</code><br>
     * <i>native declaration : allheaders.h:2130</i>
     */
    Pointer listRemoveFromHead(PointerByReference phead);

    /**
     * Original signature :
     * <code>void* listRemoveFromTail(DLLIST**, DLLIST**)</code><br>
     * <i>native declaration : allheaders.h:2132</i>
     */
    Pointer listRemoveFromTail(PointerByReference phead, PointerByReference ptail);

    /**
     * Original signature :
     * <code>DLLIST* listFindElement(DLLIST*, void*)</code><br>
     * <i>native declaration : allheaders.h:2134</i>
     */
    DoubleLinkedList listFindElement(DoubleLinkedList head, Pointer data);

    /**
     * Original signature : <code>DLLIST* listFindTail(DLLIST*)</code><br>
     * <i>native declaration : allheaders.h:2136</i>
     */
    DoubleLinkedList listFindTail(DoubleLinkedList head);

    /**
     * Original signature : <code>l_int32 listGetCount(DLLIST*)</code><br>
     * <i>native declaration : allheaders.h:2138</i>
     */
    int listGetCount(DoubleLinkedList head);

    /**
     * Original signature : <code>l_int32 listReverse(DLLIST**)</code><br>
     * <i>native declaration : allheaders.h:2140</i>
     */
    int listReverse(PointerByReference phead);

    /**
     * Original signature :
     * <code>l_int32 listJoin(DLLIST**, DLLIST**)</code><br>
     * <i>native declaration : allheaders.h:2142</i>
     */
    int listJoin(PointerByReference phead1, PointerByReference phead2);

    /**
     * Original signature : <code>L_AMAP* l_amapCreate(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2144</i>
     */
    L_Rbtree l_amapCreate(int keytype);

    /**
     * Original signature :
     * <code>RB_TYPE* l_amapFind(L_AMAP*, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2146</i>
     */
    Rb_Type l_amapFind(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature :
     * <code>void l_amapInsert(L_AMAP*, RB_TYPE, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2148</i>
     */
    void l_amapInsert(L_Rbtree m, Rb_Type.ByValue key, Rb_Type.ByValue value);

    /**
     * Original signature : <code>void l_amapDelete(L_AMAP*, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2150</i>
     */
    void l_amapDelete(L_Rbtree m, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_amapDestroy(L_AMAP**)</code><br>
     * <i>native declaration : allheaders.h:2152</i>
     */
    void l_amapDestroy(PointerByReference pm);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetFirst(L_AMAP*)</code><br>
     * <i>native declaration : allheaders.h:2154</i>
     */
    L_Rbtree_Node l_amapGetFirst(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetNext(L_AMAP_NODE*)</code><br>
     * <i>native declaration : allheaders.h:2156</i>
     */
    L_Rbtree_Node l_amapGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_AMAP_NODE* l_amapGetLast(L_AMAP*)</code><br>
     * <i>native declaration : allheaders.h:2158</i>
     */
    L_Rbtree_Node l_amapGetLast(L_Rbtree m);

    /**
     * Original signature :
     * <code>L_AMAP_NODE* l_amapGetPrev(L_AMAP_NODE*)</code><br>
     * <i>native declaration : allheaders.h:2160</i>
     */
    L_Rbtree_Node l_amapGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_amapSize(L_AMAP*)</code><br>
     * <i>native declaration : allheaders.h:2162</i>
     */
    int l_amapSize(L_Rbtree m);

    /**
     * Original signature : <code>L_ASET* l_asetCreate(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2164</i>
     */
    L_Rbtree l_asetCreate(int keytype);

    /**
     * Original signature :
     * <code>RB_TYPE* l_asetFind(L_ASET*, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2166</i>
     */
    Rb_Type l_asetFind(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetInsert(L_ASET*, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2168</i>
     */
    void l_asetInsert(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDelete(L_ASET*, RB_TYPE)</code><br>
     * <i>native declaration : allheaders.h:2170</i>
     */
    void l_asetDelete(L_Rbtree s, Rb_Type.ByValue key);

    /**
     * Original signature : <code>void l_asetDestroy(L_ASET**)</code><br>
     * <i>native declaration : allheaders.h:2172</i>
     */
    void l_asetDestroy(PointerByReference ps);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetFirst(L_ASET*)</code><br>
     * <i>native declaration : allheaders.h:2174</i>
     */
    L_Rbtree_Node l_asetGetFirst(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetNext(L_ASET_NODE*)</code><br>
     * <i>native declaration : allheaders.h:2176</i>
     */
    L_Rbtree_Node l_asetGetNext(L_Rbtree_Node n);

    /**
     * Original signature : <code>L_ASET_NODE* l_asetGetLast(L_ASET*)</code><br>
     * <i>native declaration : allheaders.h:2178</i>
     */
    L_Rbtree_Node l_asetGetLast(L_Rbtree s);

    /**
     * Original signature :
     * <code>L_ASET_NODE* l_asetGetPrev(L_ASET_NODE*)</code><br>
     * <i>native declaration : allheaders.h:2180</i>
     */
    L_Rbtree_Node l_asetGetPrev(L_Rbtree_Node n);

    /**
     * Original signature : <code>l_int32 l_asetSize(L_ASET*)</code><br>
     * <i>native declaration : allheaders.h:2182</i>
     */
    int l_asetSize(L_Rbtree s);

    /**
     * Original signature :
     * <code>PIX* generateBinaryMaze(l_int32, l_int32, l_int32, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2184</i>
     */
    Pix generateBinaryMaze(int w, int h, int xi, int yi, float wallps, float ranis);

    /**
     * Original signature :
     * <code>PTA* pixSearchBinaryMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2186</i>
     */
    Pta pixSearchBinaryMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature :
     * <code>PTA* pixSearchGrayMaze(PIX*, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2188</i>
     */
    Pta pixSearchGrayMaze(Pix pixs, int xi, int yi, int xf, int yf, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixDilate(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2190</i>
     */
    Pix pixDilate(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixErode(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2192</i>
     */
    Pix pixErode(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixHMT(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2194</i>
     */
    Pix pixHMT(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixOpen(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2196</i>
     */
    Pix pixOpen(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixClose(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2198</i>
     */
    Pix pixClose(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature : <code>PIX* pixCloseSafe(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2200</i>
     */
    Pix pixCloseSafe(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixOpenGeneralized(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2202</i>
     */
    Pix pixOpenGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixCloseGeneralized(PIX*, PIX*, SEL*)</code><br>
     * <i>native declaration : allheaders.h:2204</i>
     */
    Pix pixCloseGeneralized(Pix pixd, Pix pixs, Pointer sel);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2206</i>
     */
    Pix pixDilateBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2208</i>
     */
    Pix pixErodeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2210</i>
     */
    Pix pixOpenBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2212</i>
     */
    Pix pixCloseBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2214</i>
     */
    Pix pixCloseSafeBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_int32 selectComposableSels(l_int32, l_int32, SEL**, SEL**)</code><br>
     * <i>native declaration : allheaders.h:2216</i>
     */
    int selectComposableSels(int size, int direction, PointerByReference psel1, PointerByReference psel2);

    /**
     * Original signature :
     * <code>l_int32 selectComposableSizes(l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2218</i>
     */
    int selectComposableSizes(int size, IntBuffer pfactor1, IntBuffer pfactor2);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2220</i>
     */
    Pix pixDilateCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2222</i>
     */
    Pix pixErodeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2224</i>
     */
    Pix pixOpenCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2226</i>
     */
    Pix pixCloseCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseSafeCompBrick(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2228</i>
     */
    Pix pixCloseSafeCompBrick(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>void resetMorphBoundaryCondition(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2230</i>
     */
    void resetMorphBoundaryCondition(int bc);

    /**
     * Original signature :
     * <code>l_uint32 getMorphBorderPixelColor(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2232</i>
     */
    int getMorphBorderPixelColor(int type, int depth);

    /**
     * Original signature :
     * <code>PIX* pixExtractBoundary(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2234</i>
     */
    Pix pixExtractBoundary(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceMasked(PIX*, PIX*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2236</i>
     */
    Pix pixMorphSequenceMasked(Pix pixs, Pix pixm, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:2238</i>
     */
    Pix pixMorphSequenceByComponent(Pix pixs, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByComponent(PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:2238</i>
     */
    Pix pixMorphSequenceByComponent(Pix pixs, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByComponent(PIXA*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2240</i>
     */
    Pixa pixaMorphSequenceByComponent(Pixa pixas, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:2242</i>
     */
    Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, String sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceByRegion(PIX*, PIX*, const char*, l_int32, l_int32, l_int32, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:2242</i>
     */
    Pix pixMorphSequenceByRegion(Pix pixs, Pix pixm, Pointer sequence, int connectivity, int minw, int minh, PointerByReference pboxa);

    /**
     * Original signature :
     * <code>PIXA* pixaMorphSequenceByRegion(PIX*, PIXA*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2244</i>
     */
    Pixa pixaMorphSequenceByRegion(Pix pixs, Pixa pixam, String sequence, int minw, int minh);

    /**
     * Original signature :
     * <code>PIX* pixUnionOfMorphOps(PIX*, SELA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2246</i>
     */
    Pix pixUnionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixIntersectionOfMorphOps(PIX*, SELA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2248</i>
     */
    Pix pixIntersectionOfMorphOps(Pix pixs, Sela sela, int type);

    /**
     * Original signature :
     * <code>PIX* pixSelectiveConnCompFill(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2250</i>
     */
    Pix pixSelectiveConnCompFill(Pix pixs, int connectivity, int minw, int minh);

    /**
     * Original signature :
     * <code>l_int32 pixRemoveMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2252</i>
     */
    int pixRemoveMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int dsize);

    /**
     * Original signature :
     * <code>PIX* pixDisplayMatchedPattern(PIX*, PIX*, PIX*, l_int32, l_int32, l_uint32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2254</i>
     */
    Pix pixDisplayMatchedPattern(Pix pixs, Pix pixp, Pix pixe, int x0, int y0, int color, float scale, int nlevels);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByMorph(PIXA*, l_int32, l_int32, SEL*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2256</i>
     */
    Pixa pixaExtendByMorph(Pixa pixas, int type, int niters, Pointer sel, int include);

    /**
     * Original signature :
     * <code>PIXA* pixaExtendByScaling(PIXA*, NUMA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2258</i>
     */
    Pixa pixaExtendByScaling(Pixa pixas, Numa nasc, int type, int include);

    /**
     * Original signature :
     * <code>PIX* pixSeedfillMorph(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2260</i>
     */
    Pix pixSeedfillMorph(Pix pixs, Pix pixm, int maxiters, int connectivity);

    /**
     * Original signature :
     * <code>NUMA* pixRunHistogramMorph(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2262</i>
     */
    Numa pixRunHistogramMorph(Pix pixs, int runtype, int direction, int maxsize);

    /**
     * Original signature :
     * <code>PIX* pixTophat(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2264</i>
     */
    Pix pixTophat(Pix pixs, int hsize, int vsize, int type);

    /**
     * Original signature :
     * <code>PIX* pixHDome(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2266</i>
     */
    Pix pixHDome(Pix pixs, int height, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixFastTophat(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2268</i>
     */
    Pix pixFastTophat(Pix pixs, int xsize, int ysize, int type);

    /**
     * Original signature :
     * <code>PIX* pixMorphGradient(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2270</i>
     */
    Pix pixMorphGradient(Pix pixs, int hsize, int vsize, int smoothing);

    /**
     * Original signature : <code>PTA* pixaCentroids(PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2272</i>
     */
    Pta pixaCentroids(Pixa pixa);

    /**
     * Original signature :
     * <code>l_int32 pixCentroid(PIX*, l_int32*, l_int32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:2274</i>
     */
    int pixCentroid(Pix pix, IntBuffer centtab, IntBuffer sumtab, FloatBuffer pxave, FloatBuffer pyave);

    /**
     * Original signature :
     * <code>PIX* pixDilateBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2276</i>
     */
    Pix pixDilateBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2278</i>
     */
    Pix pixErodeBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2280</i>
     */
    Pix pixOpenBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2282</i>
     */
    Pix pixCloseBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2284</i>
     */
    Pix pixDilateCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2286</i>
     */
    Pix pixErodeCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2288</i>
     */
    Pix pixOpenCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2290</i>
     */
    Pix pixCloseCompBrickDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixDilateCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2292</i>
     */
    Pix pixDilateCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixErodeCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2294</i>
     */
    Pix pixErodeCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixOpenCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2296</i>
     */
    Pix pixOpenCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>PIX* pixCloseCompBrickExtendDwa(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2298</i>
     */
    Pix pixCloseCompBrickExtendDwa(Pix pixd, Pix pixs, int hsize, int vsize);

    /**
     * Original signature :
     * <code>l_int32 getExtendedCompositeParameters(l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2300</i>
     */
    int getExtendedCompositeParameters(int size, IntBuffer pn, IntBuffer pextra, IntBuffer pactualsize);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequence(PIX*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2302</i>
     */
    Pix pixMorphSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequence(PIX*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2304</i>
     */
    Pix pixMorphCompSequence(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphSequenceDwa(PIX*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2306</i>
     */
    Pix pixMorphSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>PIX* pixMorphCompSequenceDwa(PIX*, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2308</i>
     */
    Pix pixMorphCompSequenceDwa(Pix pixs, String sequence, int dispsep);

    /**
     * Original signature :
     * <code>l_int32 morphSequenceVerify(SARRAY*)</code><br>
     * <i>native declaration : allheaders.h:2310</i>
     */
    int morphSequenceVerify(Sarray sa);

    /**
     * Original signature :
     * <code>PIX* pixGrayMorphSequence(PIX*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2312</i>
     */
    Pix pixGrayMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);

    /**
     * Original signature :
     * <code>PIX* pixColorMorphSequence(PIX*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2314</i>
     */
    Pix pixColorMorphSequence(Pix pixs, String sequence, int dispsep, int dispy);
//  
//      /**
//       * Original signature : <code>NUMA* numaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2316</i>
//       */
//      Numa numaCreate(int n);

//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromIArray(l_int32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2318</i>
//       */
//      Numa numaCreateFromIArray(IntBuffer iarray, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromFArray(l_float32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2320</i>
//       */
//      Numa numaCreateFromFArray(FloatBuffer farray, int size, int copyflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCreateFromString(const char*)</code><br>
//       * <i>native declaration : allheaders.h:2322</i>
//       */
//      Numa numaCreateFromString(String str);
//  
//      /**
//       * Original signature : <code>void numaDestroy(NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2324</i>
//       */
//      void numaDestroy(PointerByReference pna);
//  
//      /**
//       * Original signature : <code>NUMA* numaCopy(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2326</i>
//       */
//      Numa numaCopy(Numa na);
//  
//      /**
//       * Original signature : <code>NUMA* numaClone(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2328</i>
//       */
//      Numa numaClone(Numa na);
//  
//      /**
//       * Original signature : <code>l_int32 numaEmpty(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2330</i>
//       */
//      int numaEmpty(Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 numaAddNumber(NUMA*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2332</i>
//       */
//      int numaAddNumber(Numa na, float val);
//      /**
//       * Original signature :
//       * <code>l_int32 numaInsertNumber(NUMA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2334</i>
//       */
//      int numaInsertNumber(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_int32 numaRemoveNumber(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2336</i>
//       */
//      int numaRemoveNumber(Numa na, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 numaReplaceNumber(NUMA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2338</i>
//       */
//      int numaReplaceNumber(Numa na, int index, float val);
//  
//      /**
//       * Original signature : <code>l_int32 numaGetCount(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2340</i>
//       */
//      int numaGetCount(Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSetCount(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2342</i>
//       */
//      int numaSetCount(Numa na, int newcount);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetFValue(NUMA*, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2344</i>
//       */
//      int numaGetFValue(Numa na, int index, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetIValue(NUMA*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2346</i>
//       */
//      int numaGetIValue(Numa na, int index, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSetValue(NUMA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2348</i>
//       */
//      int numaSetValue(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_int32 numaShiftValue(NUMA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2350</i>
//       */
//      int numaShiftValue(Numa na, int index, float diff);
//  
//      /**
//       * Original signature : <code>l_int32* numaGetIArray(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2352</i>
//       */
//      IntByReference numaGetIArray(Numa na);
//      /**
//       * Original signature :
//       * <code>l_float32* numaGetFArray(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2354</i>
//       */
//      FloatByReference numaGetFArray(Numa na, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 numaGetRefcount(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2356</i>
//       */
//      int numaGetRefcount(Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 numaChangeRefcount(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2358</i>
//       */
//      int numaChangeRefcount(Numa na, int delta);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetParameters(NUMA*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2360</i>
//       */
//      int numaGetParameters(Numa na, FloatBuffer pstartx, FloatBuffer pdelx);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSetParameters(NUMA*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2362</i>
//       */
//      int numaSetParameters(Numa na, float startx, float delx);
//      /**
//       * Original signature :
//       * <code>l_int32 numaCopyParameters(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2364</i>
//       */
//      int numaCopyParameters(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>SARRAY* numaConvertToSarray(NUMA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2366</i>
//       */
//      Sarray numaConvertToSarray(Numa na, int size1, int size2, int addzeros, int type);
//  
//      /**
//       * Original signature : <code>NUMA* numaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:2368</i>
//       */
//      Numa numaRead(String filename);
//  
//      /**
//       * Original signature : <code>NUMA* numaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:2370</i>
//       */
//      Numa numaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>NUMA* numaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:2372</i>
     */
    Numa numaReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 numaWrite(const char*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:2374</i>
     */
    int numaWrite(String filename, Numa na);

//      /**
//       * Original signature :
//       * <code>l_int32 numaWriteStream(FILE*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2376</i>
//       */
//      int numaWriteStream(FILE fp, Numa na);
    /**
     * Original signature :
     * <code>l_int32 numaWriteMem(l_uint8**, size_t*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:2378</i>
     */
    int numaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numa na);

    /**
     * Original signature : <code>NUMAA* numaaCreate(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2380</i>
     */
    Numaa numaaCreate(int n);

    /**
     * Original signature :
     * <code>NUMAA* numaaCreateFull(l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2382</i>
     */
    Numaa numaaCreateFull(int nptr, int n);

    /**
     * Original signature : <code>l_int32 numaaTruncate(NUMAA*)</code><br>
     * <i>native declaration : allheaders.h:2384</i>
     */
    int numaaTruncate(Numaa naa);

    /**
     * Original signature : <code>void numaaDestroy(NUMAA**)</code><br>
     * <i>native declaration : allheaders.h:2386</i>
     */
    void numaaDestroy(PointerByReference pnaa);

    /**
     * Original signature :
     * <code>l_int32 numaaAddNuma(NUMAA*, NUMA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2388</i>
     */
    int numaaAddNuma(Numaa naa, Numa na, int copyflag);

    /**
     * Original signature : <code>l_int32 numaaGetCount(NUMAA*)</code><br>
     * <i>native declaration : allheaders.h:2390</i>
     */
    int numaaGetCount(Numaa naa);

    /**
     * Original signature :
     * <code>l_int32 numaaGetNumaCount(NUMAA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2392</i>
     */
    int numaaGetNumaCount(Numaa naa, int index);

    /**
     * Original signature : <code>l_int32 numaaGetNumberCount(NUMAA*)</code><br>
     * <i>native declaration : allheaders.h:2394</i>
     */
    int numaaGetNumberCount(Numaa naa);
//  
//      /**
//       * Original signature : <code>NUMA** numaaGetPtrArray(NUMAA*)</code><br>
//       * <i>native declaration : allheaders.h:2396</i>
//       */
//      PointerByReference numaaGetPtrArray(Numaa naa);

//      /**
//       * Original signature :
//       * <code>NUMA* numaaGetNuma(NUMAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2398</i>
//       */
//      Numa numaaGetNuma(Numaa naa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_int32 numaaReplaceNuma(NUMAA*, l_int32, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2400</i>
//       */
//      int numaaReplaceNuma(Numaa naa, int index, Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 numaaGetValue(NUMAA*, l_int32, l_int32, l_float32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2402</i>
//       */
//      int numaaGetValue(Numaa naa, int i, int j, FloatBuffer pfval, IntBuffer pival);
//      /**
//       * Original signature :
//       * <code>l_int32 numaaAddNumber(NUMAA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2404</i>
//       */
//      int numaaAddNumber(Numaa naa, int index, float val);
//  
//      /**
//       * Original signature : <code>NUMAA* numaaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:2406</i>
//       */
//      Numaa numaaRead(String filename);
//  
//      /**
//       * Original signature : <code>NUMAA* numaaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:2408</i>
//       */
//      Numaa numaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>NUMAA* numaaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:2410</i>
     */
    Numaa numaaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 numaaWrite(const char*, NUMAA*)</code><br>
//       * <i>native declaration : allheaders.h:2412</i>
//       */
//      int numaaWrite(String filename, Numaa naa);
//      /**
//       * Original signature :
//       * <code>l_int32 numaaWriteStream(FILE*, NUMAA*)</code><br>
//       * <i>native declaration : allheaders.h:2414</i>
//       */
//      int numaaWriteStream(FILE fp, Numaa naa);
    /**
     * Original signature :
     * <code>l_int32 numaaWriteMem(l_uint8**, size_t*, NUMAA*)</code><br>
     * <i>native declaration : allheaders.h:2416</i>
     */
    int numaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Numaa naa);

//      /**
//       * Original signature :
//       * <code>NUMA* numaArithOp(NUMA*, NUMA*, NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2418</i>
//       */
//      Numa numaArithOp(Numa nad, Numa na1, Numa na2, int op);
//      /**
//       * Original signature :
//       * <code>NUMA* numaLogicalOp(NUMA*, NUMA*, NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2420</i>
//       */
//      Numa numaLogicalOp(Numa nad, Numa na1, Numa na2, int op);
//  
//      /**
//       * Original signature : <code>NUMA* numaInvert(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2422</i>
//       */
//      Numa numaInvert(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSimilar(NUMA*, NUMA*, l_float32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2424</i>
//       */
//      int numaSimilar(Numa na1, Numa na2, float maxdiff, IntBuffer psimilar);
//      /**
//       * Original signature :
//       * <code>l_int32 numaAddToNumber(NUMA*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2426</i>
//       */
//      int numaAddToNumber(Numa na, int index, float val);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetMin(NUMA*, l_float32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2428</i>
//       */
//      int numaGetMin(Numa na, FloatBuffer pminval, IntBuffer piminloc);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetMax(NUMA*, l_float32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2430</i>
//       */
//      int numaGetMax(Numa na, FloatBuffer pmaxval, IntBuffer pimaxloc);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetSum(NUMA*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2432</i>
//       */
//      int numaGetSum(Numa na, FloatBuffer psum);
//  
//      /**
//       * Original signature : <code>NUMA* numaGetPartialSums(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2434</i>
//       */
//      Numa numaGetPartialSums(Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetSumOnInterval(NUMA*, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2436</i>
//       */
//      int numaGetSumOnInterval(Numa na, int first, int last, FloatBuffer psum);
//      /**
//       * Original signature :
//       * <code>l_int32 numaHasOnlyIntegers(NUMA*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2438</i>
//       */
//      int numaHasOnlyIntegers(Numa na, int maxsamples, IntBuffer pallints);
//  
//      /**
//       * Original signature : <code>NUMA* numaSubsample(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2440</i>
//       */
//      Numa numaSubsample(Numa nas, int subfactor);
//  
//      /**
//       * Original signature : <code>NUMA* numaMakeDelta(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2442</i>
//       */
//      Numa numaMakeDelta(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeSequence(l_float32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2444</i>
//       */
//      Numa numaMakeSequence(float startval, float increment, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeConstant(l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2446</i>
//       */
//      Numa numaMakeConstant(float val, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeAbsValue(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2448</i>
//       */
//      Numa numaMakeAbsValue(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaAddBorder(NUMA*, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2450</i>
//       */
//      Numa numaAddBorder(Numa nas, int left, int right, float val);
//      /**
//       * Original signature :
//       * <code>NUMA* numaAddSpecifiedBorder(NUMA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2452</i>
//       */
//      Numa numaAddSpecifiedBorder(Numa nas, int left, int right, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRemoveBorder(NUMA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2454</i>
//       */
//      Numa numaRemoveBorder(Numa nas, int left, int right);
//    /**
//     * Original signature :
//     * <code>l_int32 numaCountNonzeroRuns(NUMA*, l_int32*)</code><br>
//     * <i>native declaration : allheaders.h:2456</i>
//     */
//    int numaCountNonzeroRuns(Numa na, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetNonzeroRange(NUMA*, l_float32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2458</i>
//       */
//      int numaGetNonzeroRange(Numa na, float eps, IntBuffer pfirst, IntBuffer plast);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetCountRelativeToZero(NUMA*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2460</i>
//       */
//      int numaGetCountRelativeToZero(Numa na, int type, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>NUMA* numaClipToInterval(NUMA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2462</i>
//       */
//      Numa numaClipToInterval(Numa nas, int first, int last);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeThresholdIndicator(NUMA*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2464</i>
//       */
//      Numa numaMakeThresholdIndicator(Numa nas, float thresh, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* numaUniformSampling(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2466</i>
//       */
//      Numa numaUniformSampling(Numa nas, int nsamp);
//  
//      /**
//       * Original signature : <code>NUMA* numaReverse(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2468</i>
//       */
//      Numa numaReverse(Numa nad, Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaLowPassIntervals(NUMA*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2470</i>
//       */
//      Numa numaLowPassIntervals(Numa nas, float thresh, float maxn);
//      /**
//       * Original signature :
//       * <code>NUMA* numaThresholdEdges(NUMA*, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2472</i>
//       */
//      Numa numaThresholdEdges(Numa nas, float thresh1, float thresh2, float maxn);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetSpanValues(NUMA*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2474</i>
//       */
//      int numaGetSpanValues(Numa na, int span, IntBuffer pstart, IntBuffer pend);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetEdgeValues(NUMA*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2476</i>
//       */
//      int numaGetEdgeValues(Numa na, int edge, IntBuffer pstart, IntBuffer pend, IntBuffer psign);
//      /**
//       * Original signature :
//       * <code>l_int32 numaInterpolateEqxVal(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2478</i>
//       */
//      int numaInterpolateEqxVal(float startx, float deltax, Numa nay, int type, float xval, FloatBuffer pyval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaInterpolateArbxVal(NUMA*, NUMA*, l_int32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2480</i>
//       */
//      int numaInterpolateArbxVal(Numa nax, Numa nay, int type, float xval, FloatBuffer pyval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaInterpolateEqxInterval(l_float32, l_float32, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2482</i>
//       */
//      int numaInterpolateEqxInterval(float startx, float deltax, Numa nasy, int type, float x0, float x1, int npts, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>l_int32 numaInterpolateArbxInterval(NUMA*, NUMA*, l_int32, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2484</i>
//       */
//      int numaInterpolateArbxInterval(Numa nax, Numa nay, int type, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);
//      /**
//       * Original signature :
//       * <code>l_int32 numaFitMax(NUMA*, l_float32*, NUMA*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2486</i>
//       */
//      int numaFitMax(Numa na, FloatBuffer pmaxval, Numa naloc, FloatBuffer pmaxloc);
//      /**
//       * Original signature :
//       * <code>l_int32 numaDifferentiateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2488</i>
//       */
//      int numaDifferentiateInterval(Numa nax, Numa nay, float x0, float x1, int npts, PointerByReference pnadx, PointerByReference pnady);
//      /**
//       * Original signature :
//       * <code>l_int32 numaIntegrateInterval(NUMA*, NUMA*, l_float32, l_float32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2490</i>
//       */
//      int numaIntegrateInterval(Numa nax, Numa nay, float x0, float x1, int npts, FloatBuffer psum);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSortGeneral(NUMA*, NUMA**, NUMA**, NUMA**, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2492</i>
//       */
//      int numaSortGeneral(Numa na, PointerByReference pnasort, PointerByReference pnaindex, PointerByReference pnainvert, int sortorder, int sorttype);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSortAutoSelect(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2494</i>
//       */
//      Numa numaSortAutoSelect(Numa nas, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSortIndexAutoSelect(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2496</i>
//       */
//      Numa numaSortIndexAutoSelect(Numa nas, int sortorder);
//  
//      /**
//       * Original signature : <code>l_int32 numaChooseSortType(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2498</i>
//       */
//      int numaChooseSortType(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaSort(NUMA*, NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2500</i>
//       */
//      Numa numaSort(Numa naout, Numa nain, int sortorder);
//  
//      /**
//       * Original signature : <code>NUMA* numaBinSort(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2502</i>
//       */
//      Numa numaBinSort(Numa nas, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaGetSortIndex(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2504</i>
//       */
//      Numa numaGetSortIndex(Numa na, int sortorder);
//      /**
//       * Original signature :
//       * <code>NUMA* numaGetBinSortIndex(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2506</i>
//       */
//      Numa numaGetBinSortIndex(Numa nas, int sortorder);
//  
//      /**
//       * Original signature : <code>NUMA* numaSortByIndex(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2508</i>
//       */
//      Numa numaSortByIndex(Numa nas, Numa naindex);
//      /**
//       * Original signature :
//       * <code>l_int32 numaIsSorted(NUMA*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2510</i>
//       */
//      int numaIsSorted(Numa nas, int sortorder, IntBuffer psorted);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSortPair(NUMA*, NUMA*, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2512</i>
//       */
//      int numaSortPair(Numa nax, Numa nay, int sortorder, PointerByReference pnasx, PointerByReference pnasy);
//  
//      /**
//       * Original signature : <code>NUMA* numaInvertMap(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2514</i>
//       */
//      Numa numaInvertMap(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaPseudorandomSequence(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2516</i>
//       */
//      Numa numaPseudorandomSequence(int size, int seed);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRandomPermutation(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2518</i>
//       */
//      Numa numaRandomPermutation(Numa nas, int seed);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetRankValue(NUMA*, l_float32, NUMA*, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2520</i>
//       */
//      int numaGetRankValue(Numa na, float fract, Numa nasort, int usebins, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetMedian(NUMA*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2522</i>
//       */
//      int numaGetMedian(Numa na, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetBinnedMedian(NUMA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2524</i>
//       */
//      int numaGetBinnedMedian(Numa na, IntBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetMode(NUMA*, l_float32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2526</i>
//       */
//      int numaGetMode(Numa na, FloatBuffer pval, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetMedianVariation(NUMA*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2528</i>
//       */
//      int numaGetMedianVariation(Numa na, FloatBuffer pmedval, FloatBuffer pmedvar);
//      /**
//       * Original signature :
//       * <code>l_int32 numaJoin(NUMA*, NUMA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2530</i>
//       */
//      int numaJoin(Numa nad, Numa nas, int istart, int iend);
//      /**
//       * Original signature :
//       * <code>l_int32 numaaJoin(NUMAA*, NUMAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2532</i>
//       */
//      int numaaJoin(Numaa naad, Numaa naas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>NUMA* numaaFlattenToNuma(NUMAA*)</code><br>
//       * <i>native declaration : allheaders.h:2534</i>
//       */
//      Numa numaaFlattenToNuma(Numaa naa);
//  
//      /**
//       * Original signature : <code>NUMA* numaErode(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2536</i>
//       */
//      Numa numaErode(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaDilate(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2538</i>
//       */
//      Numa numaDilate(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaOpen(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2540</i>
//       */
//      Numa numaOpen(Numa nas, int size);
//  
//      /**
//       * Original signature : <code>NUMA* numaClose(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2542</i>
//       */
//      Numa numaClose(Numa nas, int size);
//      /**
//       * Original signature :
//       * <code>NUMA* numaTransform(NUMA*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2544</i>
//       */
//      Numa numaTransform(Numa nas, float shift, float scale);
    /**
     * Original signature :
     * <code>l_int32 numaSimpleStats(NUMA*, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:2546</i>
     */
    int numaSimpleStats(Numa na, int first, int last, FloatBuffer pmean, FloatBuffer pvar, FloatBuffer prvar);

//      /**
//       * Original signature :
//       * <code>l_int32 numaWindowedStats(NUMA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2548</i>
//       */
//      int numaWindowedStats(Numa nas, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMean(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2550</i>
//       */
//      Numa numaWindowedMean(Numa nas, int wc);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMeanSquare(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2552</i>
//       */
//      Numa numaWindowedMeanSquare(Numa nas, int wc);
//      /**
//       * Original signature :
//       * <code>l_int32 numaWindowedVariance(NUMA*, NUMA*, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2554</i>
//       */
//      int numaWindowedVariance(Numa nam, Numa nams, PointerByReference pnav, PointerByReference pnarv);
//      /**
//       * Original signature :
//       * <code>NUMA* numaWindowedMedian(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2556</i>
//       */
//      Numa numaWindowedMedian(Numa nas, int halfwin);
//  
//      /**
//       * Original signature : <code>NUMA* numaConvertToInt(NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:2558</i>
//       */
//      Numa numaConvertToInt(Numa nas);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogram(NUMA*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2560</i>
//       */
//      Numa numaMakeHistogram(Numa na, int maxbins, IntBuffer pbinsize, IntBuffer pbinstart);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogramAuto(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2562</i>
//       */
//      Numa numaMakeHistogramAuto(Numa na, int maxbins);
//      /**
//       * Original signature :
//       * <code>NUMA* numaMakeHistogramClipped(NUMA*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2564</i>
//       */
//      Numa numaMakeHistogramClipped(Numa na, float binsize, float maxsize);
//      /**
//       * Original signature :
//       * <code>NUMA* numaRebinHistogram(NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2566</i>
//       */
//      Numa numaRebinHistogram(Numa nas, int newsize);
//      /**
//       * Original signature :
//       * <code>NUMA* numaNormalizeHistogram(NUMA*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2568</i>
//       */
//      Numa numaNormalizeHistogram(Numa nas, float tsum);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2570</i>
//       */
//      int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatBuffer pmin, FloatBuffer pmax, FloatBuffer pmean, FloatBuffer pvariance, FloatBuffer pmedian, float rank, FloatBuffer prval, PointerByReference phisto);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetStatsUsingHistogram(NUMA*, l_int32, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2570</i>
//       */
//      int numaGetStatsUsingHistogram(Numa na, int maxbins, FloatByReference pmin, FloatByReference pmax, FloatByReference pmean, FloatByReference pvariance, FloatByReference pmedian, float rank, FloatByReference prval, PointerByReference phisto);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetHistogramStats(NUMA*, l_float32, l_float32, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2572</i>
//       */
//      int numaGetHistogramStats(Numa nahisto, float startx, float deltax, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetHistogramStatsOnInterval(NUMA*, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2574</i>
//       */
//      int numaGetHistogramStatsOnInterval(Numa nahisto, float startx, float deltax, int ifirst, int ilast, FloatBuffer pxmean, FloatBuffer pxmedian, FloatBuffer pxmode, FloatBuffer pxvariance);
//      /**
//       * Original signature :
//       * <code>l_int32 numaMakeRankFromHistogram(l_float32, l_float32, NUMA*, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2576</i>
//       */
//      int numaMakeRankFromHistogram(float startx, float deltax, Numa nasy, int npts, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>l_int32 numaHistogramGetRankFromVal(NUMA*, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2578</i>
//       */
//      int numaHistogramGetRankFromVal(Numa na, float rval, FloatBuffer prank);
//      /**
//       * Original signature :
//       * <code>l_int32 numaHistogramGetValFromRank(NUMA*, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2580</i>
//       */
//      int numaHistogramGetValFromRank(Numa na, float rank, FloatBuffer prval);
//      /**
//       * Original signature :
//       * <code>l_int32 numaDiscretizeRankAndIntensity(NUMA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2582</i>
//       */
//      int numaDiscretizeRankAndIntensity(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam, PointerByReference pnar, PointerByReference pnabb);
//      /**
//       * Original signature :
//       * <code>l_int32 numaGetRankBinValues(NUMA*, l_int32, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2584</i>
//       */
//      int numaGetRankBinValues(Numa na, int nbins, PointerByReference pnarbin, PointerByReference pnam);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2586</i>
//       */
//      int numaSplitDistribution(Numa na, float scorefract, IntBuffer psplitindex, FloatBuffer pave1, FloatBuffer pave2, FloatBuffer pnum1, FloatBuffer pnum2, PointerByReference pnascore);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSplitDistribution(NUMA*, l_float32, l_int32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2586</i>
//       */
//      int numaSplitDistribution(Numa na, float scorefract, IntByReference psplitindex, FloatByReference pave1, FloatByReference pave2, FloatByReference pnum1, FloatByReference pnum2, PointerByReference pnascore);
    /**
     * Original signature :
     * <code>l_int32 grayHistogramsToEMD(NUMAA*, NUMAA*, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:2588</i>
     */
    int grayHistogramsToEMD(Numaa naa1, Numaa naa2, PointerByReference pnad);

//      /**
//       * Original signature :
//       * <code>l_int32 numaEarthMoverDistance(NUMA*, NUMA*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2590</i>
//       */
//      int numaEarthMoverDistance(Numa na1, Numa na2, FloatBuffer pdist);
    /**
     * Original signature :
     * <code>l_int32 grayInterHistogramStats(NUMAA*, l_int32, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:2592</i>
     */
    int grayInterHistogramStats(Numaa naa, int wc, PointerByReference pnam, PointerByReference pnams, PointerByReference pnav, PointerByReference pnarv);

//      /**
//       * Original signature :
//       * <code>NUMA* numaFindPeaks(NUMA*, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2594</i>
//       */
//      Numa numaFindPeaks(Numa nas, int nmax, float fract1, float fract2);
//      /**
//       * Original signature :
//       * <code>NUMA* numaFindExtrema(NUMA*, l_float32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:2596</i>
//       */
//      Numa numaFindExtrema(Numa nas, float delta, PointerByReference pnav);
//      /**
//       * Original signature :
//       * <code>l_int32 numaCountReversals(NUMA*, l_float32, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2598</i>
//       */
//      int numaCountReversals(Numa nas, float minreversal, IntBuffer pnr, FloatBuffer pnrpl);
//      /**
//       * Original signature :
//       * <code>l_int32 numaSelectCrossingThreshold(NUMA*, NUMA*, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2600</i>
//       */
//      int numaSelectCrossingThreshold(Numa nax, Numa nay, float estthresh, FloatBuffer pbestthresh);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCrossingsByThreshold(NUMA*, NUMA*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2602</i>
//       */
//      Numa numaCrossingsByThreshold(Numa nax, Numa nay, float thresh);
//      /**
//       * Original signature :
//       * <code>NUMA* numaCrossingsByPeaks(NUMA*, NUMA*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2604</i>
//       */
//      Numa numaCrossingsByPeaks(Numa nax, Numa nay, float delta);
//      /**
//       * Original signature :
//       * <code>l_int32 numaEvalBestHaarParameters(NUMA*, l_float32, l_int32, l_int32, l_float32, l_float32, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2606</i>
//       */
//      int numaEvalBestHaarParameters(Numa nas, float relweight, int nwidth, int nshift, float minwidth, float maxwidth, FloatBuffer pbestwidth, FloatBuffer pbestshift, FloatBuffer pbestscore);
//      /**
//       * Original signature :
//       * <code>l_int32 numaEvalHaarSum(NUMA*, l_float32, l_float32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:2608</i>
//       */
//      int numaEvalHaarSum(Numa nas, float width, float shift, float relweight, FloatBuffer pscore);
    /**
     * Original signature :
     * <code>NUMA* genConstrainedNumaInRange(l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2610</i>
     */
    Numa genConstrainedNumaInRange(int first, int last, int nmax, int use_pairs);

    /**
     * Original signature :
     * <code>l_int32 pixGetRegionsBinary(PIX*, PIX**, PIX**, PIX**, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2612</i>
     */
    int pixGetRegionsBinary(Pix pixs, PointerByReference ppixhm, PointerByReference ppixtm, PointerByReference ppixtb, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2614</i>
     */
    Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenHalftoneMask(PIX*, PIX**, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2614</i>
     */
    Pix pixGenHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, int debug);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2616</i>
     */
    Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntBuffer phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenerateHalftoneMask(PIX*, PIX**, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2616</i>
     */
    Pix pixGenerateHalftoneMask(Pix pixs, PointerByReference ppixtext, IntByReference phtfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2618</i>
     */
    Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntBuffer ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextlineMask(PIX*, PIX**, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2618</i>
     */
    Pix pixGenTextlineMask(Pix pixs, PointerByReference ppixvws, IntByReference ptlfound, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixGenTextblockMask(PIX*, PIX*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2620</i>
     */
    Pix pixGenTextblockMask(Pix pixs, Pix pixvws, Pixa pixadb);

    /**
     * Original signature :
     * <code>BOX* pixFindPageForeground(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:2622</i>
     */
    Box pixFindPageForeground(Pix pixs, int threshold, int mindist, int erasedist, int pagenum, int showmorph, int display, String pdfdir);

    /**
     * Original signature :
     * <code>l_int32 pixSplitIntoCharacters(PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2624</i>
     */
    int pixSplitIntoCharacters(Pix pixs, int minw, int minh, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>BOXA* pixSplitComponentWithProfile(PIX*, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2626</i>
     */
    Boxa pixSplitComponentWithProfile(Pix pixs, int delta, int mindel, PointerByReference ppixdebug);

    /**
     * Original signature :
     * <code>PIXA* pixExtractTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2628</i>
     */
    Pixa pixExtractTextlines(Pix pixs, int maxw, int maxh, int minw, int minh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIXA* pixExtractRawTextlines(PIX*, l_int32, l_int32, l_int32, l_int32, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2630</i>
     */
    Pixa pixExtractRawTextlines(Pix pixs, int maxw, int maxh, int adjw, int adjh, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 pixCountTextColumns(PIX*, l_float32, l_float32, l_float32, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2636</i>
     */
    int pixCountTextColumns(Pix pixs, float deltafract, float peakfract, float clipfract, IntBuffer pncols, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 pixDecideIfText(PIX*, BOX*, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:2632</i>
     */
    int pixDecideIfText(Pix pixs, Box box, IntBuffer pistext, Pixa pixadb);

    /**
     * Original signature :
     * <code>l_int32 pixFindThreshFgExtent(PIX*, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2634</i>
     */
    int pixFindThreshFgExtent(Pix pixs, int thresh, IntBuffer ptop, IntBuffer pbot);

    /**
     * Original signature :
     * <code>l_int32 pixDecideIfTable(PIX*, BOX*, l_int32*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:</i>
     */
    int pixDecideIfTable(Pix pixs, Box box, IntBuffer pistable, Pixa pixadb);

    /**
     * Original signature :
     * <code>PIX* pixPrepare1bpp(PIX*, BOX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:</i>
     */
    Pix pixPrepare1bpp(Pix pixs, Box box, float cropfract, int outres);

    /**
     * Original signature :
     * <code>l_int32 pixEstimateBackground(PIX*, l_int32, l_float32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2638</i>
     */
    int pixEstimateBackground(Pix pixs, int darkthresh, float edgecrop, IntBuffer pbg);

    /**
     * Original signature :
     * <code>l_int32 pixFindLargeRectangles(PIX*, l_int32, l_int32, BOXA**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2640</i>
     */
    int pixFindLargeRectangles(Pix pixs, int polarity, int nrect, PointerByReference pboxa, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_int32 pixFindLargestRectangle(PIX*, l_int32, BOX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2642</i>
     */
    int pixFindLargestRectangle(Pix pixs, int polarity, PointerByReference pbox, PointerByReference ppixdb);

    /**
     * Original signature :
     * <code>l_int32 pixSetSelectCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2644</i>
     */
    int pixSetSelectCmap(Pix pixs, Box box, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixColorGrayRegionsCmap(PIX*, BOXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2646</i>
     */
    int pixColorGrayRegionsCmap(Pix pixs, Boxa boxa, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixColorGrayCmap(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2648</i>
     */
    int pixColorGrayCmap(Pix pixs, Box box, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixColorGrayMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2650</i>
     */
    int pixColorGrayMaskedCmap(Pix pixs, Pix pixm, int type, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 addColorizedGrayToCmap(PIXCMAP*, l_int32, l_int32, l_int32, l_int32, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:2652</i>
     */
    int addColorizedGrayToCmap(PixColormap cmap, int type, int rval, int gval, int bval, PointerByReference pna);

    /**
     * Original signature :
     * <code>l_int32 pixSetSelectMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2654</i>
     */
    int pixSetSelectMaskedCmap(Pix pixs, Pix pixm, int x, int y, int sindex, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixSetMaskedCmap(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2656</i>
     */
    int pixSetMaskedCmap(Pix pixs, Pix pixm, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>char* parseForProtos(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2658</i>
     */
    Pointer parseForProtos(String filein, String prestring);

    /**
     * Original signature :
     * <code>BOXA* boxaGetWhiteblocks(BOXA*, BOX*, l_int32, l_int32, l_float32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2660</i>
     */
    Boxa boxaGetWhiteblocks(Boxa boxas, Box box, int sortflag, int maxboxes, float maxoverlap, int maxperim, float fract, int maxpops);

    /**
     * Original signature :
     * <code>BOXA* boxaPruneSortedOnOverlap(BOXA*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2662</i>
     */
    Boxa boxaPruneSortedOnOverlap(Boxa boxas, float maxoverlap);

    /**
     * Original signature :
     * <code>l_int32 convertFilesToPdf(const char*, const char*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2664</i>
     */
    int convertFilesToPdf(String dirname, String substr, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 saConvertFilesToPdf(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2666</i>
     */
    int saConvertFilesToPdf(Sarray sa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 saConvertFilesToPdfData(SARRAY*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2668</i>
     */
    int saConvertFilesToPdfData(Sarray sa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 selectDefaultPdfEncoding(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2670</i>
     */
    int selectDefaultPdfEncoding(Pix pix, IntBuffer ptype);

    /**
     * Original signature :
     * <code>l_int32 convertUnscaledFilesToPdf(const char*, const char*, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2672</i>
     */
    int convertUnscaledFilesToPdf(String dirname, String substr, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 saConvertUnscaledFilesToPdf(SARRAY*, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2674</i>
     */
    int saConvertUnscaledFilesToPdf(Sarray sa, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 saConvertUnscaledFilesToPdfData(SARRAY*, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2676</i>
     */
    int saConvertUnscaledFilesToPdfData(Sarray sa, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 convertUnscaledToPdfData(const char*, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2678</i>
     */
    int convertUnscaledToPdfData(String fname, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 pixaConvertToPdf(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2680</i>
     */
    int pixaConvertToPdf(Pixa pixa, int res, float scalefactor, int type, int quality, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 pixaConvertToPdfData(PIXA*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2682</i>
     */
    int pixaConvertToPdfData(Pixa pixa, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2684</i>
     */
    int convertToPdf(String filein, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertToPdf(const char*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2684</i>
     */
    int convertToPdf(Pointer filein, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2686</i>
     */
    int convertImageDataToPdf(ByteBuffer imdata, NativeSize size, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertImageDataToPdf(l_uint8*, size_t, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2686</i>
     */
    int convertImageDataToPdf(Pointer imdata, NativeSize size, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2688</i>
     */
    int convertToPdfData(String filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertToPdfData(const char*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2688</i>
     */
    int convertToPdfData(Pointer filein, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2690</i>
     */
    int convertImageDataToPdfData(ByteBuffer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 convertImageDataToPdfData(l_uint8*, size_t, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2690</i>
     */
    int convertImageDataToPdfData(Pointer imdata, NativeSize size, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2692</i>
     */
    int pixConvertToPdf(Pix pix, int type, int quality, String fileout, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdf(PIX*, l_int32, l_int32, const char*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2692</i>
     */
    int pixConvertToPdf(Pix pix, int type, int quality, Pointer fileout, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamPdf(FILE*, PIX*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:2694</i>
//       */
//      int pixWriteStreamPdf(FILE fp, Pix pix, int res, String title);
    /**
     * Original signature :
     * <code>l_int32 pixWriteMemPdf(l_uint8**, size_t*, PIX*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:2696</i>
     */
    int pixWriteMemPdf(PointerByReference pdata, NativeSizeByReference pnbytes, Pix pix, int res, String title);

    /**
     * Original signature :
     * <code>l_int32 convertSegmentedFilesToPdf(const char*, const char*, l_int32, l_int32, l_int32, BOXAA*, l_int32, l_float32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2698</i>
     */
    int convertSegmentedFilesToPdf(String dirname, String substr, int res, int type, int thresh, Boxaa baa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>BOXAA* convertNumberedMasksToBoxaa(const char*, const char*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2700</i>
     */
    Boxaa convertNumberedMasksToBoxaa(String dirname, String substr, int numpre, int numpost);

    /**
     * Original signature :
     * <code>l_int32 convertToPdfSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2702</i>
     */
    int convertToPdfSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdfSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2704</i>
     */
    int pixConvertToPdfSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, String fileout);

    /**
     * Original signature :
     * <code>l_int32 convertToPdfDataSegmented(const char*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2706</i>
     */
    int convertToPdfDataSegmented(String filein, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdfDataSegmented(PIX*, l_int32, l_int32, l_int32, BOXA*, l_int32, l_float32, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2708</i>
     */
    int pixConvertToPdfDataSegmented(Pix pixs, int res, int type, int thresh, Boxa boxa, int quality, float scalefactor, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 concatenatePdf(const char*, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2710</i>
     */
    int concatenatePdf(String dirname, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_int32 saConcatenatePdf(SARRAY*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2712</i>
     */
    int saConcatenatePdf(Sarray sa, String fileout);

    /**
     * Original signature :
     * <code>l_int32 ptraConcatenatePdf(L_PTRA*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2714</i>
     */
    int ptraConcatenatePdf(L_Ptra pa, String fileout);

    /**
     * Original signature :
     * <code>l_int32 concatenatePdfToData(const char*, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2716</i>
     */
    int concatenatePdfToData(String dirname, String substr, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 saConcatenatePdfToData(SARRAY*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2718</i>
     */
    int saConcatenatePdfToData(Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2720</i>
     */
    int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, String title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 pixConvertToPdfData(PIX*, l_int32, l_int32, l_uint8**, size_t*, l_int32, l_int32, l_int32, const char*, L_PDF_DATA**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2720</i>
     */
    int pixConvertToPdfData(Pix pix, int type, int quality, PointerByReference pdata, NativeSizeByReference pnbytes, int x, int y, int res, Pointer title, PointerByReference plpd, int position);

    /**
     * Original signature :
     * <code>l_int32 ptraConcatenatePdfToData(L_PTRA*, SARRAY*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2722</i>
     */
    int ptraConcatenatePdfToData(L_Ptra pa_data, Sarray sa, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 convertTiffMultipageToPdf(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2724</i>
     */
    int convertTiffMultipageToPdf(String filein, String fileout);

    /**
     * Original signature :
     * <code>l_int32 l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2726</i>
     */
    int l_generateCIDataForPdf(String fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_int32 l_generateCIDataForPdf(const char*, PIX*, l_int32, L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2726</i>
     */
    int l_generateCIDataForPdf(Pointer fname, Pix pix, int quality, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateDataPdf(const char*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2728</i>
     */
    L_Compressed_Data l_generateFlateDataPdf(String fname, Pix pixs);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateJpegData(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2730</i>
     */
    L_Compressed_Data l_generateJpegData(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>l_int32 l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2732</i>
     */
    int l_generateCIData(String fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_int32 l_generateCIData(const char*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2732</i>
     */
    int l_generateCIData(Pointer fname, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>l_int32 pixGenerateCIData(PIX*, l_int32, l_int32, l_int32, L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2734</i>
     */
    int pixGenerateCIData(Pix pixs, int type, int quality, int ascii85, PointerByReference pcid);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateFlateData(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2736</i>
     */
    L_Compressed_Data l_generateFlateData(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>L_COMP_DATA* l_generateG4Data(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2738</i>
     */
    L_Compressed_Data l_generateG4Data(String fname, int ascii85flag);

    /**
     * Original signature :
     * <code>l_int32 cidConvertToPdfData(L_COMP_DATA*, const char*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2740</i>
     */
    int cidConvertToPdfData(L_Compressed_Data cid, String title, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature : <code>void l_CIDataDestroy(L_COMP_DATA**)</code><br>
     * <i>native declaration : allheaders.h:2742</i>
     */
    void l_CIDataDestroy(PointerByReference pcid);

    /**
     * Original signature : <code>void l_pdfSetG4ImageMask(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2744</i>
     */
    void l_pdfSetG4ImageMask(int flag);

    /**
     * Original signature :
     * <code>void l_pdfSetDateAndVersion(l_int32)</code><br>
     * <i>native declaration : allheaders.h:2746</i>
     */
    void l_pdfSetDateAndVersion(int flag);

    /**
     * Original signature :
     * <code>void setPixMemoryManager(alloc_fn, dealloc_fn)</code><br>
     * <i>native declaration : allheaders.h:2748</i>
     */
    void setPixMemoryManager(alloc_fn allocator, dealloc_fn deallocator);

    /**
     * Original signature :
     * <code>PIX* pixCreate(l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2750</i>
     */
    Pix pixCreate(int width, int height, int depth);

    /**
     * Original signature :
     * <code>PIX* pixCreateNoInit(l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2752</i>
     */
    Pix pixCreateNoInit(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixCreateTemplate(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2754</i>
     */
    Pix pixCreateTemplate(Pix pixs);

    /**
     * Original signature : <code>PIX* pixCreateTemplateNoInit(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2756</i>
     */
    Pix pixCreateTemplateNoInit(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixCreateHeader(l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2758</i>
     */
    Pix pixCreateHeader(int width, int height, int depth);

    /**
     * Original signature : <code>PIX* pixClone(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2760</i>
     */
    Pix pixClone(Pix pixs);

    /**
     * Original signature : <code>void pixDestroy(PIX**)</code><br>
     * <i>native declaration : allheaders.h:2762</i>
     */
    void pixDestroy(PointerByReference ppix);

    /**
     * Original signature : <code>PIX* pixCopy(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2764</i>
     */
    Pix pixCopy(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixResizeImageData(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2766</i>
     */
    int pixResizeImageData(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixCopyColormap(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2768</i>
     */
    int pixCopyColormap(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixSizesEqual(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2770</i>
     */
    int pixSizesEqual(Pix pix1, Pix pix2);

    /**
     * Original signature :
     * <code>l_int32 pixTransferAllData(PIX*, PIX**, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2772</i>
     */
    int pixTransferAllData(Pix pixd, PointerByReference ppixs, int copytext, int copyformat);

    /**
     * Original signature :
     * <code>l_int32 pixSwapAndDestroy(PIX**, PIX**)</code><br>
     * <i>native declaration : allheaders.h:2774</i>
     */
    int pixSwapAndDestroy(PointerByReference ppixd, PointerByReference ppixs);

    /**
     * Original signature : <code>l_int32 pixGetWidth(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2776</i>
     */
    int pixGetWidth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWidth(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2778</i>
     */
    int pixSetWidth(Pix pix, int width);

    /**
     * Original signature : <code>l_int32 pixGetHeight(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2780</i>
     */
    int pixGetHeight(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetHeight(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2782</i>
     */
    int pixSetHeight(Pix pix, int height);

    /**
     * Original signature : <code>l_int32 pixGetDepth(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2784</i>
     */
    int pixGetDepth(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetDepth(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2786</i>
     */
    int pixSetDepth(Pix pix, int depth);

    /**
     * Original signature :
     * <code>l_int32 pixGetDimensions(PIX*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2788</i>
     */
    int pixGetDimensions(Pix pix, IntBuffer pw, IntBuffer ph, IntBuffer pd);

    /**
     * Original signature :
     * <code>l_int32 pixSetDimensions(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2790</i>
     */
    int pixSetDimensions(Pix pix, int w, int h, int d);

    /**
     * Original signature :
     * <code>l_int32 pixCopyDimensions(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2792</i>
     */
    int pixCopyDimensions(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetSpp(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2794</i>
     */
    int pixGetSpp(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetSpp(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2796</i>
     */
    int pixSetSpp(Pix pix, int spp);

    /**
     * Original signature : <code>l_int32 pixCopySpp(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2798</i>
     */
    int pixCopySpp(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>l_int32 pixGetWpl(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2800</i>
     */
    int pixGetWpl(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetWpl(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2802</i>
     */
    int pixSetWpl(Pix pix, int wpl);

    /**
     * Original signature : <code>l_int32 pixGetRefcount(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2804</i>
     */
    int pixGetRefcount(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixChangeRefcount(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2806</i>
     */
    int pixChangeRefcount(Pix pix, int delta);

    /**
     * Original signature : <code>l_int32 pixGetXRes(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2808</i>
     */
    int pixGetXRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetXRes(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2810</i>
     */
    int pixSetXRes(Pix pix, int res);

    /**
     * Original signature : <code>l_int32 pixGetYRes(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2812</i>
     */
    int pixGetYRes(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetYRes(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2814</i>
     */
    int pixSetYRes(Pix pix, int res);

    /**
     * Original signature :
     * <code>l_int32 pixGetResolution(PIX*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2816</i>
     */
    int pixGetResolution(Pix pix, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_int32 pixSetResolution(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2818</i>
     */
    int pixSetResolution(Pix pix, int xres, int yres);

    /**
     * Original signature :
     * <code>l_int32 pixCopyResolution(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2820</i>
     */
    int pixCopyResolution(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixScaleResolution(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2822</i>
     */
    int pixScaleResolution(Pix pix, float xscale, float yscale);

    /**
     * Original signature : <code>l_int32 pixGetInputFormat(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2824</i>
     */
    int pixGetInputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetInputFormat(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2826</i>
     */
    int pixSetInputFormat(Pix pix, int informat);

    /**
     * Original signature :
     * <code>l_int32 pixCopyInputFormat(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2828</i>
     */
    int pixCopyInputFormat(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixSetSpecial(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2830</i>
     */
    int pixSetSpecial(Pix pix, int special);

    /**
     * Original signature : <code>char* pixGetText(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2832</i>
     */
    Pointer pixGetText(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetText(PIX*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2834</i>
     */
    int pixSetText(Pix pix, String textstring);

    /**
     * Original signature :
     * <code>l_int32 pixAddText(PIX*, const char*)</code><br>
     * <i>native declaration : allheaders.h:2836</i>
     */
    int pixAddText(Pix pix, String textstring);

    /**
     * Original signature : <code>l_int32 pixCopyText(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2838</i>
     */
    int pixCopyText(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIXCMAP* pixGetColormap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2840</i>
     */
    PixColormap pixGetColormap(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetColormap(PIX*, PIXCMAP*)</code><br>
     * <i>native declaration : allheaders.h:2842</i>
     */
    int pixSetColormap(Pix pix, PixColormap colormap);

    /**
     * Original signature : <code>l_int32 pixDestroyColormap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2844</i>
     */
    int pixDestroyColormap(Pix pix);

    /**
     * Original signature : <code>l_uint32* pixGetData(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2846</i>
     */
    IntByReference pixGetData(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetData(PIX*, l_uint32*)</code><br>
     * <i>native declaration : allheaders.h:2848</i>
     */
    int pixSetData(Pix pix, IntBuffer data);

    /**
     * Original signature : <code>l_uint32* pixExtractData(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2850</i>
     */
    IntByReference pixExtractData(Pix pixs);

    /**
     * Original signature : <code>l_int32 pixFreeData(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2852</i>
     */
    int pixFreeData(Pix pix);

    /**
     * Original signature :
     * <code>void** pixGetLinePtrs(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2854</i>
     */
    PointerByReference pixGetLinePtrs(Pix pix, IntBuffer psize);

//      /**
//       * Original signature :
//       * <code>l_int32 pixPrintStreamInfo(FILE*, PIX*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:2856</i>
//       */
//      int pixPrintStreamInfo(FILE fp, Pix pix, String text);
    /**
     * Original signature :
     * <code>l_int32 pixGetPixel(PIX*, l_int32, l_int32, l_uint32*)</code><br>
     * <i>native declaration : allheaders.h:2858</i>
     */
    int pixGetPixel(Pix pix, int x, int y, IntBuffer pval);

    /**
     * Original signature :
     * <code>l_int32 pixSetPixel(PIX*, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2860</i>
     */
    int pixSetPixel(Pix pix, int x, int y, int val);

    /**
     * Original signature :
     * <code>l_int32 pixGetRGBPixel(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2862</i>
     */
    int pixGetRGBPixel(Pix pix, int x, int y, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);

    /**
     * Original signature :
     * <code>l_int32 pixSetRGBPixel(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2864</i>
     */
    int pixSetRGBPixel(Pix pix, int x, int y, int rval, int gval, int bval);

    /**
     * Original signature :
     * <code>l_int32 pixGetRandomPixel(PIX*, l_uint32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2866</i>
     */
    int pixGetRandomPixel(Pix pix, IntBuffer pval, IntBuffer px, IntBuffer py);

    /**
     * Original signature :
     * <code>l_int32 pixClearPixel(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2868</i>
     */
    int pixClearPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixFlipPixel(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2870</i>
     */
    int pixFlipPixel(Pix pix, int x, int y);

    /**
     * Original signature :
     * <code>void setPixelLow(l_uint32*, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2872</i>
     */
    void setPixelLow(IntBuffer line, int x, int depth, int val);

    /**
     * Original signature :
     * <code>l_int32 pixGetBlackOrWhiteVal(PIX*, l_int32, l_uint32*)</code><br>
     * <i>native declaration : allheaders.h:2874</i>
     */
    int pixGetBlackOrWhiteVal(Pix pixs, int op, IntBuffer pval);

    /**
     * Original signature : <code>l_int32 pixClearAll(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2876</i>
     */
    int pixClearAll(Pix pix);

    /**
     * Original signature : <code>l_int32 pixSetAll(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2878</i>
     */
    int pixSetAll(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixSetAllGray(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2880</i>
     */
    int pixSetAllGray(Pix pix, int grayval);

    /**
     * Original signature :
     * <code>l_int32 pixSetAllArbitrary(PIX*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2882</i>
     */
    int pixSetAllArbitrary(Pix pix, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetBlackOrWhite(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2884</i>
     */
    int pixSetBlackOrWhite(Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_int32 pixSetComponentArbitrary(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2886</i>
     */
    int pixSetComponentArbitrary(Pix pix, int comp, int val);

    /**
     * Original signature : <code>l_int32 pixClearInRect(PIX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:2888</i>
     */
    int pixClearInRect(Pix pix, Box box);

    /**
     * Original signature : <code>l_int32 pixSetInRect(PIX*, BOX*)</code><br>
     * <i>native declaration : allheaders.h:2890</i>
     */
    int pixSetInRect(Pix pix, Box box);

    /**
     * Original signature :
     * <code>l_int32 pixSetInRectArbitrary(PIX*, BOX*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2892</i>
     */
    int pixSetInRectArbitrary(Pix pix, Box box, int val);

    /**
     * Original signature :
     * <code>l_int32 pixBlendInRect(PIX*, BOX*, l_uint32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2894</i>
     */
    int pixBlendInRect(Pix pixs, Box box, int val, float fract);

    /**
     * Original signature :
     * <code>l_int32 pixSetPadBits(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2896</i>
     */
    int pixSetPadBits(Pix pix, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetPadBitsBand(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2898</i>
     */
    int pixSetPadBitsBand(Pix pix, int by, int bh, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetOrClearBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2900</i>
     */
    int pixSetOrClearBorder(Pix pixs, int left, int right, int top, int bot, int op);

    /**
     * Original signature :
     * <code>l_int32 pixSetBorderVal(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2902</i>
     */
    int pixSetBorderVal(Pix pixs, int left, int right, int top, int bot, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetBorderRingVal(PIX*, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2904</i>
     */
    int pixSetBorderRingVal(Pix pixs, int dist, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2906</i>
     */
    int pixSetMirroredBorder(Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixCopyBorder(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2908</i>
     */
    Pix pixCopyBorder(Pix pixd, Pix pixs, int left, int right, int top, int bot);

    /**
     * Original signature :
     * <code>PIX* pixAddBorder(PIX*, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2910</i>
     */
    Pix pixAddBorder(Pix pixs, int npix, int val);

    /**
     * Original signature :
     * <code>PIX* pixAddBlackOrWhiteBorder(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2912</i>
     */
    Pix pixAddBlackOrWhiteBorder(Pix pixs, int left, int right, int top, int bot, int op);

//      /**
//       * Original signature :
//       * <code>PIX* pixAddBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:2914</i>
//       */
//      Pix pixAddBorderGeneral(Pix pixs, int left, int right, int top, int bot, int val);
//  
//      /**
//       * Original signature : <code>PIX* pixRemoveBorder(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2916</i>
//       */
//      Pix pixRemoveBorder(Pix pixs, int npix);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderGeneral(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2918</i>
//       */
//      Pix pixRemoveBorderGeneral(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderToSize(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2920</i>
//       */
//      Pix pixRemoveBorderToSize(Pix pixs, int wd, int hd);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddMirroredBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2922</i>
//       */
//      Pix pixAddMirroredBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddRepeatedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2924</i>
//       */
//      Pix pixAddRepeatedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddMixedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2926</i>
//       */
//      Pix pixAddMixedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddContinuedBorder(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2928</i>
//       */
//      Pix pixAddContinuedBorder(Pix pixs, int left, int right, int top, int bot);
//      /**
//       * Original signature :
//       * <code>l_int32 pixShiftAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2930</i>
//       */
//      int pixShiftAndTransferAlpha(Pix pixd, Pix pixs, float shiftx, float shifty);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayLayersRGBA(PIX*, l_uint32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2932</i>
//       */
//      Pix pixDisplayLayersRGBA(Pix pixs, int val, int maxw);
//      /**
//       * Original signature :
//       * <code>PIX* pixCreateRGBImage(PIX*, PIX*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:2934</i>
//       */
//      Pix pixCreateRGBImage(Pix pixr, Pix pixg, Pix pixb);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetRGBComponent(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2936</i>
//       */
//      Pix pixGetRGBComponent(Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSetRGBComponent(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2938</i>
//       */
//      int pixSetRGBComponent(Pix pixd, Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetRGBComponentCmap(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2940</i>
//       */
//      Pix pixGetRGBComponentCmap(Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCopyRGBComponent(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2942</i>
//       */
//      int pixCopyRGBComponent(Pix pixd, Pix pixs, int comp);
//      /**
//       * Original signature :
//       * <code>l_int32 composeRGBPixel(l_int32, l_int32, l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:2944</i>
//       */
//      int composeRGBPixel(int rval, int gval, int bval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>l_int32 composeRGBAPixel(l_int32, l_int32, l_int32, l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:2946</i>
//       */
//      int composeRGBAPixel(int rval, int gval, int bval, int aval, IntBuffer ppixel);
//      /**
//       * Original signature :
//       * <code>void extractRGBValues(l_uint32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2948</i>
//       */
//      void extractRGBValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval);
//      /**
//       * Original signature :
//       * <code>void extractRGBAValues(l_uint32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2950</i>
//       */
//      void extractRGBAValues(int pixel, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer paval);
//      /**
//       * Original signature :
//       * <code>l_int32 extractMinMaxComponent(l_uint32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:2952</i>
//       */
//      int extractMinMaxComponent(int pixel, int type);
    /**
     * Original signature :
     * <code>l_int32 pixGetRGBLine(PIX*, l_int32, l_uint8*, l_uint8*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:2954</i>
     */
    int pixGetRGBLine(Pix pixs, int row, ByteBuffer bufr, ByteBuffer bufg, ByteBuffer bufb);

    /**
     * Original signature : <code>PIX* pixEndianByteSwapNew(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2956</i>
     */
    Pix pixEndianByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_int32 pixEndianByteSwap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2958</i>
     */
    int pixEndianByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 lineEndianByteSwap(l_uint32*, l_uint32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2960</i>
     */
    int lineEndianByteSwap(IntBuffer datad, IntBuffer datas, int wpl);

    /**
     * Original signature : <code>PIX* pixEndianTwoByteSwapNew(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2962</i>
     */
    Pix pixEndianTwoByteSwapNew(Pix pixs);

    /**
     * Original signature : <code>l_int32 pixEndianTwoByteSwap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:2964</i>
     */
    int pixEndianTwoByteSwap(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixGetRasterData(PIX*, l_uint8**, size_t*)</code><br>
     * <i>native declaration : allheaders.h:2966</i>
     */
    int pixGetRasterData(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);

    /**
     * Original signature :
     * <code>l_int32 pixAlphaIsOpaque(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2968</i>
     */
    int pixAlphaIsOpaque(Pix pix, IntBuffer popaque);

//      /**
//       * Original signature :
//       * <code>l_uint8** pixSetupByteProcessing(PIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:2970</i>
//       */
//      PointerByReference pixSetupByteProcessing(Pix pix, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCleanupByteProcessing(PIX*, l_uint8**)</code><br>
//       * <i>native declaration : allheaders.h:2972</i>
//       */
//      int pixCleanupByteProcessing(Pix pix, PointerByReference lineptrs);
//      /**
//       * Original signature :
//       * <code>void l_setAlphaMaskBorder(l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:2974</i>
//       */
//      void l_setAlphaMaskBorder(float val1, float val2);
    /**
     * Original signature :
     * <code>l_int32 pixSetMasked(PIX*, PIX*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2976</i>
     */
    int pixSetMasked(Pix pixd, Pix pixm, int val);

    /**
     * Original signature :
     * <code>l_int32 pixSetMaskedGeneral(PIX*, PIX*, l_uint32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2978</i>
     */
    int pixSetMaskedGeneral(Pix pixd, Pix pixm, int val, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixCombineMasked(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:2980</i>
     */
    int pixCombineMasked(Pix pixd, Pix pixs, Pix pixm);

    /**
     * Original signature :
     * <code>l_int32 pixCombineMaskedGeneral(PIX*, PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2982</i>
     */
    int pixCombineMaskedGeneral(Pix pixd, Pix pixs, Pix pixm, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixPaintThroughMask(PIX*, PIX*, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:2984</i>
     */
    int pixPaintThroughMask(Pix pixd, Pix pixm, int x, int y, int val);

    /**
     * Original signature :
     * <code>l_int32 pixPaintSelfThroughMask(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2986</i>
     */
    int pixPaintSelfThroughMask(Pix pixd, Pix pixm, int x, int y, int searchdir, int mindist, int tilesize, int ntiles, int distblend);

    /**
     * Original signature :
     * <code>PIX* pixMakeMaskFromVal(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2988</i>
     */
    Pix pixMakeMaskFromVal(Pix pixs, int val);

    /**
     * Original signature :
     * <code>PIX* pixMakeMaskFromLUT(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:2990</i>
     */
    Pix pixMakeMaskFromLUT(Pix pixs, IntBuffer tab);

    /**
     * Original signature :
     * <code>PIX* pixMakeArbMaskFromRGB(PIX*, l_float32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:2992</i>
     */
    Pix pixMakeArbMaskFromRGB(Pix pixs, float rc, float gc, float bc, float thresh);

    /**
     * Original signature :
     * <code>PIX* pixSetUnderTransparency(PIX*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2994</i>
     */
    Pix pixSetUnderTransparency(Pix pixs, int val, int debug);

    /**
     * Original signature :
     * <code>PIX* pixMakeAlphaFromMask(PIX*, l_int32, BOX**)</code><br>
     * <i>native declaration : allheaders.h:2996</i>
     */
    Pix pixMakeAlphaFromMask(Pix pixs, int dist, PointerByReference pbox);

    /**
     * Original signature :
     * <code>l_int32 pixGetColorNearMaskBoundary(PIX*, PIX*, BOX*, l_int32, l_uint32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:2998</i>
     */
    int pixGetColorNearMaskBoundary(Pix pixs, Pix pixm, Box box, int dist, IntBuffer pval, int debug);

    /**
     * Original signature : <code>PIX* pixInvert(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3000</i>
     */
    Pix pixInvert(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixOr(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3002</i>
     */
    Pix pixOr(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAnd(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3004</i>
     */
    Pix pixAnd(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixXor(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3006</i>
     */
    Pix pixXor(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixSubtract(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3008</i>
     */
    Pix pixSubtract(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>l_int32 pixZero(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3010</i>
     */
    int pixZero(Pix pix, IntBuffer pempty);

    /**
     * Original signature :
     * <code>l_int32 pixForegroundFraction(PIX*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:3012</i>
     */
    int pixForegroundFraction(Pix pix, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>NUMA* pixaCountPixels(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3014</i>
//       */
//      Numa pixaCountPixels(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>l_int32 pixCountPixels(PIX*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3016</i>
//       */
//      int pixCountPixels(Pix pix, IntBuffer pcount, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountByRow(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3018</i>
//       */
//      Numa pixCountByRow(Pix pix, Box box);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountByColumn(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3020</i>
//       */
//      Numa pixCountByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixCountPixelsByRow(PIX*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3022</i>
//       */
//      Numa pixCountPixelsByRow(Pix pix, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>NUMA* pixCountPixelsByColumn(PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3024</i>
//       */
//      Numa pixCountPixelsByColumn(Pix pix);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCountPixelsInRow(PIX*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3026</i>
//       */
//      int pixCountPixelsInRow(Pix pix, int row, IntBuffer pcount, IntBuffer tab8);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetMomentByColumn(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3028</i>
//       */
//      Numa pixGetMomentByColumn(Pix pix, int order);
//      /**
//       * Original signature :
//       * <code>l_int32 pixThresholdPixelSum(PIX*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3030</i>
//       */
//      int pixThresholdPixelSum(Pix pix, int thresh, IntBuffer pabove, IntBuffer tab8);
//  
//      /**
//       * Original signature : <code>l_int32* makePixelSumTab8()</code><br>
//       * <i>native declaration : allheaders.h:3032</i>
//       */
//      IntByReference makePixelSumTab8();
//  
//      /**
//       * Original signature : <code>l_int32* makePixelCentroidTab8()</code><br>
//       * <i>native declaration : allheaders.h:3034</i>
//       */
//      IntByReference makePixelCentroidTab8();
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageByRow(PIX*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3036</i>
//       */
//      Numa pixAverageByRow(Pix pix, Box box, int type);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageByColumn(PIX*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3038</i>
//       */
//      Numa pixAverageByColumn(Pix pix, Box box, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 pixAverageInRect(PIX*, BOX*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3040</i>
//       */
//      int pixAverageInRect(Pix pix, Box box, FloatBuffer pave);
//  
//      /**
//       * Original signature : <code>NUMA* pixVarianceByRow(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3042</i>
//       */
//      Numa pixVarianceByRow(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixVarianceByColumn(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3044</i>
//       */
//      Numa pixVarianceByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_int32 pixVarianceInRect(PIX*, BOX*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3046</i>
//       */
//      int pixVarianceInRect(Pix pix, Box box, FloatBuffer prootvar);
//  
//      /**
//       * Original signature : <code>NUMA* pixAbsDiffByRow(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3048</i>
//       */
//      Numa pixAbsDiffByRow(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAbsDiffByColumn(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3050</i>
//       */
//      Numa pixAbsDiffByColumn(Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_int32 pixAbsDiffInRect(PIX*, BOX*, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3052</i>
//       */
//      int pixAbsDiffInRect(Pix pix, Box box, int dir, FloatBuffer pabsdiff);
//      /**
//       * Original signature :
//       * <code>l_int32 pixAbsDiffOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3054</i>
//       */
//      int pixAbsDiffOnLine(Pix pix, int x1, int y1, int x2, int y2, FloatBuffer pabsdiff);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCountArbInRect(PIX*, BOX*, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3056</i>
//       */
//      int pixCountArbInRect(Pix pixs, Box box, int val, int factor, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>PIX* pixMirroredTiling(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3058</i>
//       */
//      Pix pixMirroredTiling(Pix pixs, int w, int h);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindRepCloseTile(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, BOX**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3060</i>
//       */
//      int pixFindRepCloseTile(Pix pixs, Box box, int searchdir, int mindist, int tsize, int ntiles, PointerByReference pboxtile, int debug);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogram(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3062</i>
//       */
//      Numa pixGetGrayHistogram(Pix pixs, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3064</i>
//       */
//      Numa pixGetGrayHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetGrayHistogramInRect(PIX*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3066</i>
//       */
//      Numa pixGetGrayHistogramInRect(Pix pixs, Box box, int factor);
    /**
     * Original signature :
     * <code>NUMAA* pixGetGrayHistogramTiled(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3068</i>
     */
    Numaa pixGetGrayHistogramTiled(Pix pixs, int factor, int nx, int ny);

//      /**
//       * Original signature :
//       * <code>l_int32 pixGetColorHistogram(PIX*, l_int32, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3070</i>
//       */
//      int pixGetColorHistogram(Pix pixs, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetColorHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3072</i>
//       */
//      int pixGetColorHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor, PointerByReference pnar, PointerByReference pnag, PointerByReference pnab);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogram(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3074</i>
//       */
//      Numa pixGetCmapHistogram(Pix pixs, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogramMasked(PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3076</i>
//       */
//      Numa pixGetCmapHistogramMasked(Pix pixs, Pix pixm, int x, int y, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetCmapHistogramInRect(PIX*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3078</i>
//       */
//      Numa pixGetCmapHistogramInRect(Pix pixs, Box box, int factor);
    /**
     * Original signature : <code>l_int32 pixCountRGBColors(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3080</i>
     */
    int pixCountRGBColors(Pix pixs);

    /**
     * Original signature :
     * <code>L_AMAP* pixGetColorAmapHistogram(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3082</i>
     */
    L_Rbtree pixGetColorAmapHistogram(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>l_int32 amapGetCountForColor(L_AMAP*, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3084</i>
     */
    int amapGetCountForColor(L_Rbtree amap, int val);

//      /**
//       * Original signature :
//       * <code>l_int32 pixGetRankValue(PIX*, l_int32, l_float32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:3086</i>
//       */
//      int pixGetRankValue(Pix pixs, int factor, float rank, IntBuffer pvalue);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetRankValueMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3088</i>
//       */
//      int pixGetRankValueMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3090</i>
//       */
//      int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatBuffer pval, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetRankValueMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_float32, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3090</i>
//       */
//      int pixGetRankValueMasked(Pix pixs, Pix pixm, int x, int y, int factor, float rank, FloatByReference pval, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetAverageValue(PIX*, l_int32, l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:3092</i>
//       */
//      int pixGetAverageValue(Pix pixs, int factor, int type, IntBuffer pvalue);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetAverageMaskedRGB(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3094</i>
//       */
//      int pixGetAverageMaskedRGB(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer prval, FloatBuffer pgval, FloatBuffer pbval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetAverageMasked(PIX*, PIX*, l_int32, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3096</i>
//       */
//      int pixGetAverageMasked(Pix pixs, Pix pixm, int x, int y, int factor, int type, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetAverageTiledRGB(PIX*, l_int32, l_int32, l_int32, PIX**, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:3098</i>
//       */
//      int pixGetAverageTiledRGB(Pix pixs, int sx, int sy, int type, PointerByReference ppixr, PointerByReference ppixg, PointerByReference ppixb);
//      /**
//       * Original signature :
//       * <code>PIX* pixGetAverageTiled(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3100</i>
//       */
//      Pix pixGetAverageTiled(Pix pixs, int sx, int sy, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRowStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3102</i>
//       */
//      int pixRowStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);
//      /**
//       * Original signature :
//       * <code>l_int32 pixColumnStats(PIX*, BOX*, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3104</i>
//       */
//      int pixColumnStats(Pix pixs, Box box, PointerByReference pnamean, PointerByReference pnamedian, PointerByReference pnamode, PointerByReference pnamodecount, PointerByReference pnavar, PointerByReference pnarootvar);
    /**
     * Original signature :
     * <code>l_int32 pixGetRangeValues(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3106</i>
     */
    int pixGetRangeValues(Pix pixs, int factor, int color, IntBuffer pminval, IntBuffer pmaxval);

//      /**
//       * Original signature :
//       * <code>l_int32 pixGetExtremeValue(PIX*, l_int32, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3108</i>
//       */
//      int pixGetExtremeValue(Pix pixs, int factor, int type, IntBuffer prval, IntBuffer pgval, IntBuffer pbval, IntBuffer pgrayval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetMaxValueInRect(PIX*, BOX*, l_uint32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3110</i>
//       */
//      int pixGetMaxValueInRect(Pix pixs, Box box, IntBuffer pmaxval, IntBuffer pxmax, IntBuffer pymax);
    /**
     * Original signature :
     * <code>l_int32 pixGetBinnedComponentRange(PIX*, l_int32, l_int32, l_int32, l_int32*, l_int32*, l_uint32**, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3112</i>
     */
    int pixGetBinnedComponentRange(Pix pixs, int nbins, int factor, int color, IntBuffer pminval, IntBuffer pmaxval, PointerByReference pcarray, int fontsize);

    /**
     * Original signature :
     * <code>l_int32 pixGetRankColorArray(PIX*, l_int32, l_int32, l_int32, l_uint32**, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3114</i>
     */
    int pixGetRankColorArray(Pix pixs, int nbins, int type, int factor, PointerByReference pcarray, int debugflag, int fontsize);

//      /**
//       * Original signature :
//       * <code>l_int32 pixGetBinnedColor(PIX*, PIX*, l_int32, l_int32, NUMA*, l_uint32**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3116</i>
//       */
//      int pixGetBinnedColor(Pix pixs, Pix pixg, int factor, int nbins, Numa nalut, PointerByReference pcarray, int debugflag);
    /**
     * Original signature :
     * <code>PIX* pixDisplayColorArray(l_uint32*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3118</i>
     */
    Pix pixDisplayColorArray(IntBuffer carray, int ncolors, int side, int ncols, int fontsize);

//      /**
//       * Original signature :
//       * <code>PIX* pixRankBinByStrip(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3120</i>
//       */
//      Pix pixRankBinByStrip(Pix pixs, int direction, int size, int nbins, int type);
//      /**
//       * Original signature :
//       * <code>PIX* pixaGetAlignedStats(PIXA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3122</i>
//       */
//      Pix pixaGetAlignedStats(Pixa pixa, int type, int nbins, int thresh);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaExtractColumnFromEachPix(PIXA*, l_int32, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3124</i>
//       */
//      int pixaExtractColumnFromEachPix(Pixa pixa, int col, Pix pixd);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetRowStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3126</i>
//       */
//      int pixGetRowStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer colvect);
//      /**
//       * Original signature :
//       * <code>l_int32 pixGetColumnStats(PIX*, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3128</i>
//       */
//      int pixGetColumnStats(Pix pixs, int type, int nbins, int thresh, FloatBuffer rowvect);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSetPixelColumn(PIX*, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3130</i>
//       */
//      int pixSetPixelColumn(Pix pix, int col, FloatBuffer colvect);
//      /**
//       * Original signature :
//       * <code>l_int32 pixThresholdForFgBg(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3132</i>
//       */
//      int pixThresholdForFgBg(Pix pixs, int factor, int thresh, IntBuffer pfgval, IntBuffer pbgval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:3134</i>
//       */
//      int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntBuffer pthresh, IntBuffer pfgval, IntBuffer pbgval, PointerByReference ppixdb);
    /**
     * Original signature :
     * <code>l_int32 pixSplitDistributionFgBg(PIX*, l_float32, l_int32, l_int32*, l_int32*, l_int32*, PIX**)</code><br>
     * <i>native declaration : allheaders.h:3134</i>
     */
    int pixSplitDistributionFgBg(Pix pixs, float scorefract, int factor, IntByReference pthresh, IntByReference pfgval, IntByReference pbgval, PointerByReference ppixdb);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaFindDimensions(PIXA*, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3136</i>
//       */
//      int pixaFindDimensions(Pixa pixa, PointerByReference pnaw, PointerByReference pnah);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindAreaPerimRatio(PIX*, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3138</i>
//       */
//      int pixFindAreaPerimRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindPerimToAreaRatio(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3140</i>
//       */
//      Numa pixaFindPerimToAreaRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindPerimToAreaRatio(PIX*, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3142</i>
//       */
//      int pixFindPerimToAreaRatio(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>NUMA* pixaFindPerimSizeRatio(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3144</i>
//       */
//      Numa pixaFindPerimSizeRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindPerimSizeRatio(PIX*, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3146</i>
//       */
//      int pixFindPerimSizeRatio(Pix pixs, IntBuffer tab, FloatBuffer pratio);
//  
//      /**
//       * Original signature : <code>NUMA* pixaFindAreaFraction(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3148</i>
//       */
//      Numa pixaFindAreaFraction(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindAreaFraction(PIX*, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3150</i>
//       */
//      int pixFindAreaFraction(Pix pixs, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindAreaFractionMasked(PIXA*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3152</i>
//       */
//      Numa pixaFindAreaFractionMasked(Pixa pixa, Pix pixm, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindAreaFractionMasked(PIX*, BOX*, PIX*, l_int32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3154</i>
//       */
//      int pixFindAreaFractionMasked(Pix pixs, Box box, Pix pixm, IntBuffer tab, FloatBuffer pfract);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindWidthHeightRatio(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3156</i>
//       */
//      Numa pixaFindWidthHeightRatio(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaFindWidthHeightProduct(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3158</i>
//       */
//      Numa pixaFindWidthHeightProduct(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindOverlapFraction(PIX*, PIX*, l_int32, l_int32, l_int32*, l_float32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3160</i>
//       */
//      int pixFindOverlapFraction(Pix pixs1, Pix pixs2, int x2, int y2, IntBuffer tab, FloatBuffer pratio, IntBuffer pnoverlap);
//      /**
//       * Original signature :
//       * <code>BOXA* pixFindRectangleComps(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3162</i>
//       */
//      Boxa pixFindRectangleComps(Pix pixs, int dist, int minw, int minh);
//      /**
//       * Original signature :
//       * <code>l_int32 pixConformsToRectangle(PIX*, BOX*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3164</i>
//       */
//      int pixConformsToRectangle(Pix pixs, Box box, int dist, IntBuffer pconforms);
//      /**
//       * Original signature :
//       * <code>PIXA* pixClipRectangles(PIX*, BOXA*)</code><br>
//       * <i>native declaration : allheaders.h:3166</i>
//       */
//      Pixa pixClipRectangles(Pix pixs, Boxa boxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixClipRectangle(PIX*, BOX*, BOX**)</code><br>
//       * <i>native declaration : allheaders.h:3168</i>
//       */
//      Pix pixClipRectangle(Pix pixs, Box box, PointerByReference pboxc);
//      /**
//       * Original signature :
//       * <code>PIX* pixClipMasked(PIX*, PIX*, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3170</i>
//       */
//      Pix pixClipMasked(Pix pixs, Pix pixm, int x, int y, int outval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixCropToMatch(PIX*, PIX*, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:3172</i>
//       */
//      int pixCropToMatch(Pix pixs1, Pix pixs2, PointerByReference ppixd1, PointerByReference ppixd2);
//      /**
//       * Original signature :
//       * <code>PIX* pixCropToSize(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3174</i>
//       */
//      Pix pixCropToSize(Pix pixs, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixResizeToMatch(PIX*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3176</i>
//       */
//      Pix pixResizeToMatch(Pix pixs, Pix pixt, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixMakeFrameMask(l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3178</i>
//       */
//      Pix pixMakeFrameMask(int w, int h, float hf1, float hf2, float vf1, float vf2);
    /**
     * Original signature :
     * <code>l_int32 pixFractionFgInMask(PIX*, PIX*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:3180</i>
     */
    int pixFractionFgInMask(Pix pix1, Pix pix2, FloatBuffer pfract);

//      /**
//       * Original signature :
//       * <code>l_int32 pixClipToForeground(PIX*, PIX**, BOX**)</code><br>
//       * <i>native declaration : allheaders.h:3182</i>
//       */
//      int pixClipToForeground(Pix pixs, PointerByReference ppixd, PointerByReference pbox);
//      /**
//       * Original signature :
//       * <code>l_int32 pixTestClipToForeground(PIX*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3184</i>
//       */
//      int pixTestClipToForeground(Pix pixs, IntBuffer pcanclip);
//      /**
//       * Original signature :
//       * <code>l_int32 pixClipBoxToForeground(PIX*, BOX*, PIX**, BOX**)</code><br>
//       * <i>native declaration : allheaders.h:3186</i>
//       */
//      int pixClipBoxToForeground(Pix pixs, Box boxs, PointerByReference ppixd, PointerByReference pboxd);
//      /**
//       * Original signature :
//       * <code>l_int32 pixScanForForeground(PIX*, BOX*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3188</i>
//       */
//      int pixScanForForeground(Pix pixs, Box box, int scanflag, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>l_int32 pixClipBoxToEdges(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, PIX**, BOX**)</code><br>
//       * <i>native declaration : allheaders.h:3190</i>
//       */
//      int pixClipBoxToEdges(Pix pixs, Box boxs, int lowthresh, int highthresh, int maxwidth, int factor, PointerByReference ppixd, PointerByReference pboxd);
//      /**
//       * Original signature :
//       * <code>l_int32 pixScanForEdge(PIX*, BOX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3192</i>
//       */
//      int pixScanForEdge(Pix pixs, Box box, int lowthresh, int highthresh, int maxwidth, int factor, int scanflag, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3194</i>
//       */
//      Numa pixExtractOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);
//      /**
//       * Original signature :
//       * <code>l_float32 pixAverageOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3196</i>
//       */
//      float pixAverageOnLine(Pix pixs, int x1, int y1, int x2, int y2, int factor);
//      /**
//       * Original signature :
//       * <code>NUMA* pixAverageIntensityProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3198</i>
//       */
//      Numa pixAverageIntensityProfile(Pix pixs, float fract, int dir, int first, int last, int factor1, int factor2);
//      /**
//       * Original signature :
//       * <code>NUMA* pixReversalProfile(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3200</i>
//       */
//      Numa pixReversalProfile(Pix pixs, float fract, int dir, int first, int last, int minreversal, int factor1, int factor2);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWindowedVarianceOnLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3202</i>
//       */
//      int pixWindowedVarianceOnLine(Pix pixs, int dir, int loc, int c1, int c2, int size, PointerByReference pnad);
//      /**
//       * Original signature :
//       * <code>l_int32 pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3204</i>
//       */
//      int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatBuffer pminave, FloatBuffer pmaxave);
//      /**
//       * Original signature :
//       * <code>l_int32 pixMinMaxNearLine(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, NUMA**, NUMA**, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3204</i>
//       */
//      int pixMinMaxNearLine(Pix pixs, int x1, int y1, int x2, int y2, int dist, int direction, PointerByReference pnamin, PointerByReference pnamax, FloatByReference pminave, FloatByReference pmaxave);
//  
//      /**
//       * Original signature : <code>PIX* pixRankRowTransform(PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3206</i>
//       */
//      Pix pixRankRowTransform(Pix pixs);
//  
//      /**
//       * Original signature : <code>PIX* pixRankColumnTransform(PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3208</i>
//       */
//      Pix pixRankColumnTransform(Pix pixs);
//  
//      /**
//       * Original signature : <code>PIXA* pixaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3210</i>
//       */
//      Pixa pixaCreate(int n);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaCreateFromPix(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3212</i>
//       */
//      Pixa pixaCreateFromPix(Pix pixs, int n, int cellw, int cellh);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaCreateFromBoxa(PIX*, BOXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3214</i>
//       */
//      Pixa pixaCreateFromBoxa(Pix pixs, Boxa boxa, IntBuffer pcropwarn);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSplitPix(PIX*, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3216</i>
//       */
//      Pixa pixaSplitPix(Pix pixs, int nx, int ny, int borderwidth, int bordercolor);
//  
//      /**
//       * Original signature : <code>void pixaDestroy(PIXA**)</code><br>
//       * <i>native declaration : allheaders.h:3218</i>
//       */
//      void pixaDestroy(PointerByReference ppixa);
//  
//      /**
//       * Original signature : <code>PIXA* pixaCopy(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3220</i>
//       */
//      Pixa pixaCopy(Pixa pixa, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAddPix(PIXA*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3222</i>
//       */
//      int pixaAddPix(Pixa pixa, Pix pix, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAddBox(PIXA*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3224</i>
//       */
//      int pixaAddBox(Pixa pixa, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaExtendArrayToSize(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3226</i>
//       */
//      int pixaExtendArrayToSize(Pixa pixa, int size);
//  
//      /**
//       * Original signature : <code>l_int32 pixaGetCount(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3228</i>
//       */
//      int pixaGetCount(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaChangeRefcount(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3230</i>
//       */
//      int pixaChangeRefcount(Pixa pixa, int delta);
//      /**
//       * Original signature :
//       * <code>PIX* pixaGetPix(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3232</i>
//       */
//      Pix pixaGetPix(Pixa pixa, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaGetPixDimensions(PIXA*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3234</i>
//       */
//      int pixaGetPixDimensions(Pixa pixa, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);
//  
//      /**
//       * Original signature : <code>BOXA* pixaGetBoxa(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3236</i>
//       */
//      Boxa pixaGetBoxa(Pixa pixa, int accesstype);
//  
//      /**
//       * Original signature : <code>l_int32 pixaGetBoxaCount(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3238</i>
//       */
//      int pixaGetBoxaCount(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>BOX* pixaGetBox(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3240</i>
//       */
//      Box pixaGetBox(Pixa pixa, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaGetBoxGeometry(PIXA*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3242</i>
//       */
//      int pixaGetBoxGeometry(Pixa pixa, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaSetBoxa(PIXA*, BOXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3244</i>
//       */
//      int pixaSetBoxa(Pixa pixa, Boxa boxa, int accesstype);
    /**
     * Original signature : <code>PIX** pixaGetPixArray(PIXA*)</code><br>
     * <i>native declaration : allheaders.h:3246</i>
     */
    PointerByReference pixaGetPixArray(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaVerifyDepth(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3248</i>
//       */
//      int pixaVerifyDepth(Pixa pixa, IntBuffer pmaxdepth);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaIsFull(PIXA*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3250</i>
//       */
//      int pixaIsFull(Pixa pixa, IntBuffer pfullpa, IntBuffer pfullba);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaCountText(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3252</i>
//       */
//      int pixaCountText(Pixa pixa, IntBuffer pntext);
    /**
     * Original signature : <code>l_int32 pixaSetText(PIXA*, SARRAY*)</code><br>
     * <i>native declaration : allheaders.h:3254</i>
     */
    int pixaSetText(Pixa pixa, Sarray sa);

//      /**
//       * Original signature :
//       * <code>void*** pixaGetLinePtrs(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3256</i>
//       */
//      PointerByReference pixaGetLinePtrs(Pixa pixa, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaWriteStreamInfo(FILE*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3258</i>
//       */
//      int pixaWriteStreamInfo(FILE fp, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaReplacePix(PIXA*, l_int32, PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3260</i>
//       */
//      int pixaReplacePix(Pixa pixa, int index, Pix pix, Box box);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaInsertPix(PIXA*, l_int32, PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3262</i>
//       */
//      int pixaInsertPix(Pixa pixa, int index, Pix pixs, Box box);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaRemovePix(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3264</i>
//       */
//      int pixaRemovePix(Pixa pixa, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaRemovePixAndSave(PIXA*, l_int32, PIX**, BOX**)</code><br>
//       * <i>native declaration : allheaders.h:3266</i>
//       */
//      int pixaRemovePixAndSave(Pixa pixa, int index, PointerByReference ppix, PointerByReference pbox);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaInitFull(PIXA*, PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:3268</i>
//       */
//      int pixaInitFull(Pixa pixa, Pix pix, Box box);
//  
//      /**
//       * Original signature : <code>l_int32 pixaClear(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3270</i>
//       */
//      int pixaClear(Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaJoin(PIXA*, PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3272</i>
//       */
//      int pixaJoin(Pixa pixad, Pixa pixas, int istart, int iend);
    /**
     * Original signature :
     * <code>PIXA* pixaInterleave(PIXA*, PIXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3274</i>
     */
    Pixa pixaInterleave(Pixa pixa1, Pixa pixa2, int copyflag);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaaJoin(PIXAA*, PIXAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3276</i>
//       */
//      int pixaaJoin(Pixaa paad, Pixaa paas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3278</i>
//       */
//      Pixaa pixaaCreate(int n);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaCreateFromPixa(PIXA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3280</i>
//       */
//      Pixaa pixaaCreateFromPixa(Pixa pixa, int n, int type, int copyflag);
//  
//      /**
//       * Original signature : <code>void pixaaDestroy(PIXAA**)</code><br>
//       * <i>native declaration : allheaders.h:3282</i>
//       */
//      void pixaaDestroy(PointerByReference ppaa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaAddPixa(PIXAA*, PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3284</i>
//       */
//      int pixaaAddPixa(Pixaa paa, Pixa pixa, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 pixaaExtendArray(PIXAA*)</code><br>
//       * <i>native declaration : allheaders.h:3286</i>
//       */
//      int pixaaExtendArray(Pixaa paa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaAddPix(PIXAA*, l_int32, PIX*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3288</i>
//       */
//      int pixaaAddPix(Pixaa paa, int index, Pix pix, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaAddBox(PIXAA*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3290</i>
//       */
//      int pixaaAddBox(Pixaa paa, Box box, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaGetCount(PIXAA*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3292</i>
//       */
//      int pixaaGetCount(Pixaa paa, PointerByReference pna);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaGetPixa(PIXAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3294</i>
//       */
//      Pixa pixaaGetPixa(Pixaa paa, int index, int accesstype);
//  
//      /**
//       * Original signature : <code>BOXA* pixaaGetBoxa(PIXAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3296</i>
//       */
//      Boxa pixaaGetBoxa(Pixaa paa, int accesstype);
//      /**
//       * Original signature :
//       * <code>PIX* pixaaGetPix(PIXAA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3298</i>
//       */
//      Pix pixaaGetPix(Pixaa paa, int index, int ipix, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaVerifyDepth(PIXAA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3300</i>
//       */
//      int pixaaVerifyDepth(Pixaa paa, IntBuffer pmaxdepth);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaIsFull(PIXAA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3302</i>
//       */
//      int pixaaIsFull(Pixaa paa, IntBuffer pfull);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaInitFull(PIXAA*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3304</i>
//       */
//      int pixaaInitFull(Pixaa paa, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaReplacePixa(PIXAA*, l_int32, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3306</i>
//       */
//      int pixaaReplacePixa(Pixaa paa, int index, Pixa pixa);
//  
//      /**
//       * Original signature : <code>l_int32 pixaaClear(PIXAA*)</code><br>
//       * <i>native declaration : allheaders.h:3308</i>
//       */
//      int pixaaClear(Pixaa paa);
//  
//      /**
//       * Original signature : <code>l_int32 pixaaTruncate(PIXAA*)</code><br>
//       * <i>native declaration : allheaders.h:3310</i>
//       */
//      int pixaaTruncate(Pixaa paa);
//  
//      /**
//       * Original signature : <code>PIXA* pixaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:3312</i>
//       */
//      Pixa pixaRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXA* pixaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3314</i>
//       */
//      Pixa pixaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PIXA* pixaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3316</i>
     */
    Pixa pixaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaWrite(const char*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3318</i>
//       */
//      int pixaWrite(String filename, Pixa pixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaWriteStream(FILE*, PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3320</i>
//       */
//      int pixaWriteStream(FILE fp, Pixa pixa);
    /**
     * Original signature :
     * <code>l_int32 pixaWriteMem(l_uint8**, size_t*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:3322</i>
     */
    int pixaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature : <code>PIXA* pixaReadBoth(const char*)</code><br>
     * <i>native declaration : allheaders.h:3324</i>
     */
    Pixa pixaReadBoth(String filename);

//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaReadFromFiles(const char*, const char*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3326</i>
//       */
//      Pixaa pixaaReadFromFiles(String dirname, String substr, int first, int nfiles);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:3328</i>
//       */
//      Pixaa pixaaRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXAA* pixaaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3330</i>
//       */
//      Pixaa pixaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PIXAA* pixaaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3332</i>
     */
    Pixaa pixaaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaaWrite(const char*, PIXAA*)</code><br>
//       * <i>native declaration : allheaders.h:3334</i>
//       */
//      int pixaaWrite(String filename, Pixaa paa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaWriteStream(FILE*, PIXAA*)</code><br>
//       * <i>native declaration : allheaders.h:3336</i>
//       */
//      int pixaaWriteStream(FILE fp, Pixaa paa);
    /**
     * Original signature :
     * <code>l_int32 pixaaWriteMem(l_uint8**, size_t*, PIXAA*)</code><br>
     * <i>native declaration : allheaders.h:3338</i>
     */
    int pixaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pixaa paa);

//      /**
//       * Original signature :
//       * <code>PIXACC* pixaccCreate(l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3340</i>
//       */
//      Pixacc pixaccCreate(int w, int h, int negflag);
//      /**
//       * Original signature :
//       * <code>PIXACC* pixaccCreateFromPix(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3342</i>
//       */
//      Pixacc pixaccCreateFromPix(Pix pix, int negflag);
//  
//      /**
//       * Original signature : <code>void pixaccDestroy(PIXACC**)</code><br>
//       * <i>native declaration : allheaders.h:3344</i>
//       */
//      void pixaccDestroy(PointerByReference ppixacc);
//  
//      /**
//       * Original signature : <code>PIX* pixaccFinal(PIXACC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3346</i>
//       */
//      Pix pixaccFinal(Pixacc pixacc, int outdepth);
//  
//      /**
//       * Original signature : <code>PIX* pixaccGetPix(PIXACC*)</code><br>
//       * <i>native declaration : allheaders.h:3348</i>
//       */
//      Pix pixaccGetPix(Pixacc pixacc);
//  
//      /**
//       * Original signature : <code>l_int32 pixaccGetOffset(PIXACC*)</code><br>
//       * <i>native declaration : allheaders.h:3350</i>
//       */
//      int pixaccGetOffset(Pixacc pixacc);
//  
//      /**
//       * Original signature : <code>l_int32 pixaccAdd(PIXACC*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3352</i>
//       */
//      int pixaccAdd(Pixacc pixacc, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaccSubtract(PIXACC*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3354</i>
//       */
//      int pixaccSubtract(Pixacc pixacc, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaccMultConst(PIXACC*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3356</i>
//       */
//      int pixaccMultConst(Pixacc pixacc, float factor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaccMultConstAccumulate(PIXACC*, PIX*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3358</i>
//       */
//      int pixaccMultConstAccumulate(Pixacc pixacc, Pix pix, float factor);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectBySize(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3360</i>
//       */
//      Pix pixSelectBySize(Pix pixs, int width, int height, int connectivity, int type, int relation, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectBySize(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3362</i>
//       */
//      Pixa pixaSelectBySize(Pixa pixas, int width, int height, int type, int relation, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>NUMA* pixaMakeSizeIndicator(PIXA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3364</i>
//       */
//      Numa pixaMakeSizeIndicator(Pixa pixa, int width, int height, int type, int relation);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByPerimToAreaRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3366</i>
//       */
//      Pix pixSelectByPerimToAreaRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByPerimToAreaRatio(PIXA*, l_float32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3368</i>
//       */
//      Pixa pixaSelectByPerimToAreaRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByPerimSizeRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3370</i>
//       */
//      Pix pixSelectByPerimSizeRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByPerimSizeRatio(PIXA*, l_float32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3372</i>
//       */
//      Pixa pixaSelectByPerimSizeRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByAreaFraction(PIX*, l_float32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3374</i>
//       */
//      Pix pixSelectByAreaFraction(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByAreaFraction(PIXA*, l_float32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3376</i>
//       */
//      Pixa pixaSelectByAreaFraction(Pixa pixas, float thresh, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIX* pixSelectByWidthHeightRatio(PIX*, l_float32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3378</i>
//       */
//      Pix pixSelectByWidthHeightRatio(Pix pixs, float thresh, int connectivity, int type, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectByWidthHeightRatio(PIXA*, l_float32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3380</i>
//       */
//      Pixa pixaSelectByWidthHeightRatio(Pixa pixas, float thresh, int type, IntBuffer pchanged);
    /**
     * Original signature :
     * <code>PIXA* pixaSelectByNumConnComp(PIXA*, l_int32, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3382</i>
     */
    Pixa pixaSelectByNumConnComp(Pixa pixas, int nmin, int nmax, int connectivity, IntBuffer pchanged);

//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectWithIndicator(PIXA*, NUMA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3384</i>
//       */
//      Pixa pixaSelectWithIndicator(Pixa pixas, Numa na, IntBuffer pchanged);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRemoveWithIndicator(PIX*, PIXA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:3386</i>
//       */
//      int pixRemoveWithIndicator(Pix pixs, Pixa pixa, Numa na);
//      /**
//       * Original signature :
//       * <code>l_int32 pixAddWithIndicator(PIX*, PIXA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:3388</i>
//       */
//      int pixAddWithIndicator(Pix pixs, Pixa pixa, Numa na);
    /**
     * Original signature :
     * <code>PIXA* pixaSelectWithString(PIXA*, const char*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3390</i>
     */
    Pixa pixaSelectWithString(Pixa pixas, String str, IntBuffer perror);

//      /**
//       * Original signature :
//       * <code>PIX* pixaRenderComponent(PIX*, PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3392</i>
//       */
//      Pix pixaRenderComponent(Pix pixs, Pixa pixa, int index);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3394</i>
//       */
//      Pixa pixaSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaBinSort(PIXA*, l_int32, l_int32, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3396</i>
//       */
//      Pixa pixaBinSort(Pixa pixas, int sorttype, int sortorder, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSortByIndex(PIXA*, NUMA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3398</i>
//       */
//      Pixa pixaSortByIndex(Pixa pixas, Numa naindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaSort2dByIndex(PIXA*, NUMAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3400</i>
//       */
//      Pixaa pixaSort2dByIndex(Pixa pixas, Numaa naa, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaSelectRange(PIXA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3402</i>
//       */
//      Pixa pixaSelectRange(Pixa pixas, int first, int last, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaSelectRange(PIXAA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3404</i>
//       */
//      Pixaa pixaaSelectRange(Pixaa paas, int first, int last, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaScaleToSize(PIXAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3406</i>
//       */
//      Pixaa pixaaScaleToSize(Pixaa paas, int wd, int hd);
//      /**
//       * Original signature :
//       * <code>PIXAA* pixaaScaleToSizeVar(PIXAA*, NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:3408</i>
//       */
//      Pixaa pixaaScaleToSizeVar(Pixaa paas, Numa nawd, Numa nahd);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaScaleToSize(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3410</i>
//       */
//      Pixa pixaScaleToSize(Pixa pixas, int wd, int hd);
    /**
     * Original signature :
     * <code>PIXA* pixaScaleToSizeRel(PIXA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3412</i>
     */
    Pixa pixaScaleToSizeRel(Pixa pixas, int delw, int delh);

    /**
     * Original signature :
     * <code>PIXA* pixaScale(PIXA*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3414</i>
     */
    Pixa pixaScale(Pixa pixas, float scalex, float scaley);

//      /**
//       * Original signature :
//       * <code>PIXA* pixaAddBorderGeneral(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3416</i>
//       */
//      Pixa pixaAddBorderGeneral(Pixa pixad, Pixa pixas, int left, int right, int top, int bot, int val);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaFlattenToPixa(PIXAA*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3418</i>
//       */
//      Pixa pixaaFlattenToPixa(Pixaa paa, PointerByReference pnaindex, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaaSizeRange(PIXAA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3420</i>
//       */
//      int pixaaSizeRange(Pixaa paa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaSizeRange(PIXA*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3422</i>
//       */
//      int pixaSizeRange(Pixa pixa, IntBuffer pminw, IntBuffer pminh, IntBuffer pmaxw, IntBuffer pmaxh);
//  
//      /**
//       * Original signature : <code>PIXA* pixaClipToPix(PIXA*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3424</i>
//       */
//      Pixa pixaClipToPix(Pixa pixas, Pix pixs);
    /**
     * Original signature :
     * <code>l_int32 pixaClipToForeground(PIXA*, PIXA**, BOXA**)</code><br>
     * <i>native declaration : allheaders.h:3426</i>
     */
    int pixaClipToForeground(Pixa pixas, PointerByReference ppixad, PointerByReference pboxa);

//      /**
//       * Original signature :
//       * <code>l_int32 pixaGetRenderingDepth(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3428</i>
//       */
//      int pixaGetRenderingDepth(Pixa pixa, IntBuffer pdepth);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaHasColor(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3430</i>
//       */
//      int pixaHasColor(Pixa pixa, IntBuffer phascolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAnyColormaps(PIXA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3432</i>
//       */
//      int pixaAnyColormaps(Pixa pixa, IntBuffer phascmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaGetDepthInfo(PIXA*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3434</i>
//       */
//      int pixaGetDepthInfo(Pixa pixa, IntBuffer pmaxdepth, IntBuffer psame);
//  
//      /**
//       * Original signature : <code>PIXA* pixaConvertToSameDepth(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3436</i>
//       */
//      Pixa pixaConvertToSameDepth(Pixa pixas);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3438</i>
//       */
//      int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntBuffer psame);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaEqual(PIXA*, PIXA*, l_int32, NUMA**, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3438</i>
//       */
//      int pixaEqual(Pixa pixa1, Pixa pixa2, int maxdist, PointerByReference pnaindex, IntByReference psame);
    /**
     * Original signature :
     * <code>PIXA* pixaRotateOrth(PIXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3440</i>
     */
    Pixa pixaRotateOrth(Pixa pixas, int rotation);

    /**
     * Original signature : <code>l_int32 pixaSetFullSizeBoxa(PIXA*)</code><br>
     * <i>native declaration : allheaders.h:3442</i>
     */
    int pixaSetFullSizeBoxa(Pixa pixa);

//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplay(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3444</i>
//       */
//      Pix pixaDisplay(Pixa pixa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnColor(PIXA*, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3446</i>
//       */
//      Pix pixaDisplayOnColor(Pixa pixa, int w, int h, int bgcolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayRandomCmap(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3448</i>
//       */
//      Pix pixaDisplayRandomCmap(Pixa pixa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayLinearly(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:3450</i>
//       */
//      Pix pixaDisplayLinearly(Pixa pixas, int direction, float scalefactor, int background, int spacing, int border, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:3452</i>
//       */
//      Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntBuffer pncols, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayOnLattice(PIXA*, l_int32, l_int32, l_int32*, BOXA**)</code><br>
//       * <i>native declaration : allheaders.h:3452</i>
//       */
//      Pix pixaDisplayOnLattice(Pixa pixa, int cellw, int cellh, IntByReference pncols, PointerByReference pboxa);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayUnsplit(PIXA*, l_int32, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3454</i>
//       */
//      Pix pixaDisplayUnsplit(Pixa pixa, int nx, int ny, int borderwidth, int bordercolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiled(PIXA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3456</i>
//       */
//      Pix pixaDisplayTiled(Pixa pixa, int maxwidth, int background, int spacing);
//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiledInRows(PIXA*, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3458</i>
//       */
//      Pix pixaDisplayTiledInRows(Pixa pixa, int outdepth, int maxwidth, float scalefactor, int background, int spacing, int border);
    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledInColumns(PIXA*, l_int32, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3460</i>
     */
    Pix pixaDisplayTiledInColumns(Pixa pixas, int nx, float scalefactor, int spacing, int border);

//      /**
//       * Original signature :
//       * <code>PIX* pixaDisplayTiledAndScaled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3462</i>
//       */
//      Pix pixaDisplayTiledAndScaled(Pixa pixa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledWithText(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3464</i>
     */
    Pix pixaDisplayTiledWithText(Pixa pixa, int maxwidth, float scalefactor, int spacing, int border, int fontsize, int textcolor);

    /**
     * Original signature :
     * <code>PIX* pixaDisplayTiledByIndex(PIXA*, NUMA*, l_int32, l_int32, l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3466</i>
     */
    Pix pixaDisplayTiledByIndex(Pixa pixa, Numa na, int width, int spacing, int border, int fontsize, int textcolor);

//      /**
//       * Original signature :
//       * <code>PIX* pixaaDisplay(PIXAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3468</i>
//       */
//      Pix pixaaDisplay(Pixaa paa, int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* pixaaDisplayByPixa(PIXAA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3470</i>
//       */
//      Pix pixaaDisplayByPixa(Pixaa paa, int xspace, int yspace, int maxw);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaaDisplayTiledAndScaled(PIXAA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3472</i>
//       */
//      Pixa pixaaDisplayTiledAndScaled(Pixaa paa, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo1(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3474</i>
//       */
//      Pixa pixaConvertTo1(Pixa pixas, int thresh);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo8(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3476</i>
//       */
//      Pixa pixaConvertTo8(Pixa pixas, int cmapflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaConvertTo8Color(PIXA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3478</i>
//       */
//      Pixa pixaConvertTo8Color(Pixa pixas, int dither);
//  
//      /**
//       * Original signature : <code>PIXA* pixaConvertTo32(PIXA*)</code><br>
//       * <i>native declaration : allheaders.h:3480</i>
//       */
//      Pixa pixaConvertTo32(Pixa pixas);
    /**
     * Original signature :
     * <code>PIXA* pixaConstrainedSelect(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3482</i>
     */
    Pixa pixaConstrainedSelect(Pixa pixas, int first, int last, int nmax, int use_pairs, int copyflag);

    /**
     * Original signature :
     * <code>l_int32 pixaSelectToPdf(PIXA*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_uint32, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:3484</i>
     */
    int pixaSelectToPdf(Pixa pixas, int first, int last, int res, float scalefactor, int type, int quality, int color, int fontsize, String fileout);

    /**
     * Original signature :
     * <code>PIXA* pixaDisplayMultiTiled(PIXA*, l_int32, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3486</i>
     */
    Pixa pixaDisplayMultiTiled(Pixa pixas, int nx, int ny, int maxw, int maxh, float scalefactor, int spacing, int border);

    /**
     * Original signature :
     * <code>l_int32 pixaSplitIntoFiles(PIXA*, l_int32, l_float32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3488</i>
     */
    int pixaSplitIntoFiles(Pixa pixas, int nsplit, float scale, int outwidth, int write_pixa, int write_pix, int write_pdf);

//      /**
//       * Original signature :
//       * <code>l_int32 convertToNUpFiles(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3490</i>
//       */
//      int convertToNUpFiles(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize, String outdir);
//      /**
//       * Original signature :
//       * <code>PIXA* convertToNUpPixa(const char*, const char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3492</i>
//       */
//      Pixa convertToNUpPixa(String dir, String substr, int nx, int ny, int tw, int spacing, int border, int fontsize);
    /**
     * Original signature :
     * <code>PIXA* pixaConvertToNUpPixa(PIXA*, SARRAY*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3494</i>
     */
    Pixa pixaConvertToNUpPixa(Pixa pixas, Sarray sa, int nx, int ny, int tw, int spacing, int border, int fontsize);

    /**
     * Original signature :
     * <code>l_int32 pixaCompareInPdf(PIXA*, PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:3496</i>
     */
    int pixaCompareInPdf(Pixa pixa1, Pixa pixa2, int nx, int ny, int tw, int spacing, int border, int fontsize, String fileout);

//      /**
//       * Original signature :
//       * <code>l_int32 pmsCreate(size_t, size_t, NUMA*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3498</i>
//       */
//      int pmsCreate(NativeSize minsize, NativeSize smallest, Numa numalloc, String logfile);
//  
//      /**
//       * Original signature : <code>void pmsDestroy()</code><br>
//       * <i>native declaration : allheaders.h:3500</i>
//       */
//      void pmsDestroy();
//  
//      /**
//       * Original signature : <code>void* pmsCustomAlloc(size_t)</code><br>
//       * <i>native declaration : allheaders.h:3502</i>
//       */
//      Pointer pmsCustomAlloc(NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>void pmsCustomDealloc(void*)</code><br>
//       * <i>native declaration : allheaders.h:3504</i>
//       */
//      void pmsCustomDealloc(Pointer data);
//  
//      /**
//       * Original signature : <code>void* pmsGetAlloc(size_t)</code><br>
//       * <i>native declaration : allheaders.h:3506</i>
//       */
//      Pointer pmsGetAlloc(NativeSize nbytes);
//      /**
//       * Original signature :
//       * <code>l_int32 pmsGetLevelForAlloc(size_t, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3508</i>
//       */
//      int pmsGetLevelForAlloc(NativeSize nbytes, IntBuffer plevel);
//      /**
//       * Original signature :
//       * <code>l_int32 pmsGetLevelForDealloc(void*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3510</i>
//       */
//      int pmsGetLevelForDealloc(Pointer data, IntBuffer plevel);
//  
//      /**
//       * Original signature : <code>void pmsLogInfo()</code><br>
//       * <i>native declaration : allheaders.h:3512</i>
//       */
//      void pmsLogInfo();
    /**
     * Original signature :
     * <code>l_int32 pixAddConstantGray(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3514</i>
     */
    int pixAddConstantGray(Pix pixs, int val);

    /**
     * Original signature :
     * <code>l_int32 pixMultConstantGray(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3516</i>
     */
    int pixMultConstantGray(Pix pixs, float val);

    /**
     * Original signature : <code>PIX* pixAddGray(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3518</i>
     */
    Pix pixAddGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixSubtractGray(PIX*, PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3520</i>
     */
    Pix pixSubtractGray(Pix pixd, Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixThresholdToValue(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3522</i>
     */
    Pix pixThresholdToValue(Pix pixd, Pix pixs, int threshval, int setval);

    /**
     * Original signature :
     * <code>PIX* pixInitAccumulate(l_int32, l_int32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3524</i>
     */
    Pix pixInitAccumulate(int w, int h, int offset);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulate(PIX*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3526</i>
     */
    Pix pixFinalAccumulate(Pix pixs, int offset, int depth);

    /**
     * Original signature :
     * <code>PIX* pixFinalAccumulateThreshold(PIX*, l_uint32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3528</i>
     */
    Pix pixFinalAccumulateThreshold(Pix pixs, int offset, int threshold);

    /**
     * Original signature :
     * <code>l_int32 pixAccumulate(PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3530</i>
     */
    int pixAccumulate(Pix pixd, Pix pixs, int op);

    /**
     * Original signature :
     * <code>l_int32 pixMultConstAccumulate(PIX*, l_float32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3532</i>
     */
    int pixMultConstAccumulate(Pix pixs, float factor, int offset);

    /**
     * Original signature : <code>PIX* pixAbsDifference(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3534</i>
     */
    Pix pixAbsDifference(Pix pixs1, Pix pixs2);

    /**
     * Original signature : <code>PIX* pixAddRGB(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3536</i>
     */
    Pix pixAddRGB(Pix pixs1, Pix pixs2);

    /**
     * Original signature :
     * <code>PIX* pixMinOrMax(PIX*, PIX*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3538</i>
     */
    Pix pixMinOrMax(Pix pixd, Pix pixs1, Pix pixs2, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaxDynamicRange(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3540</i>
     */
    Pix pixMaxDynamicRange(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixMaxDynamicRangeRGB(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3542</i>
     */
    Pix pixMaxDynamicRangeRGB(Pix pixs, int type);

    /**
     * Original signature :
     * <code>l_uint32 linearScaleRGBVal(l_uint32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3544</i>
     */
    int linearScaleRGBVal(int sval, float factor);

    /**
     * Original signature :
     * <code>l_uint32 logScaleRGBVal(l_uint32, l_float32*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3546</i>
     */
    int logScaleRGBVal(int sval, FloatBuffer tab, float factor);
//  
//      /**
//       * Original signature : <code>l_float32* makeLogBase2Tab()</code><br>
//       * <i>native declaration : allheaders.h:3548</i>
//       */
//      FloatByReference makeLogBase2Tab();

//      /**
//       * Original signature :
//       * <code>l_float32 getLogBase2(l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3550</i>
//       */
//      float getLogBase2(int val, FloatBuffer logtab);
//      /**
//       * Original signature :
//       * <code>PIXC* pixcompCreateFromPix(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3552</i>
//       */
//      PixComp pixcompCreateFromPix(Pix pix, int comptype);
    /**
     * Original signature :
     * <code>PIXC* pixcompCreateFromString(l_uint8*, size_t, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3554</i>
     */
    PixComp pixcompCreateFromString(ByteBuffer data, NativeSize size, int copyflag);

//      /**
//       * Original signature :
//       * <code>PIXC* pixcompCreateFromFile(const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3556</i>
//       */
//      PixComp pixcompCreateFromFile(String filename, int comptype);
//  
//      /**
//       * Original signature : <code>void pixcompDestroy(PIXC**)</code><br>
//       * <i>native declaration : allheaders.h:3558</i>
//       */
//      void pixcompDestroy(PointerByReference ppixc);
    /**
     * Original signature : <code>PIXC* pixcompCopy(PIXC*)</code><br>
     * <i>native declaration : allheaders.h:3560</i>
     */
    PixComp pixcompCopy(PixComp pixcs);

//      /**
//       * Original signature :
//       * <code>l_int32 pixcompGetDimensions(PIXC*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3562</i>
//       */
//      int pixcompGetDimensions(PixComp pixc, IntBuffer pw, IntBuffer ph, IntBuffer pd);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcompDetermineFormat(l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3564</i>
//       */
//      int pixcompDetermineFormat(int comptype, int d, int cmapflag, IntBuffer pformat);
//  
//      /**
//       * Original signature : <code>PIX* pixCreateFromPixcomp(PIXC*)</code><br>
//       * <i>native declaration : allheaders.h:3566</i>
//       */
//      Pix pixCreateFromPixcomp(PixComp pixc);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3568</i>
//       */
//      PixaComp pixacompCreate(int n);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateWithInit(l_int32, l_int32, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3570</i>
//       */
//      PixaComp pixacompCreateWithInit(int n, int offset, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromPixa(PIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3572</i>
//       */
//      PixaComp pixacompCreateFromPixa(Pixa pixa, int comptype, int accesstype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromFiles(const char*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3574</i>
//       */
//      PixaComp pixacompCreateFromFiles(String dirname, String substr, int comptype);
//      /**
//       * Original signature :
//       * <code>PIXAC* pixacompCreateFromSA(SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3576</i>
//       */
//      PixaComp pixacompCreateFromSA(Sarray sa, int comptype);
//  
//      /**
//       * Original signature : <code>void pixacompDestroy(PIXAC**)</code><br>
//       * <i>native declaration : allheaders.h:3578</i>
//       */
//      void pixacompDestroy(PointerByReference ppixac);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompAddPix(PIXAC*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3580</i>
//       */
//      int pixacompAddPix(PixaComp pixac, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompAddPixcomp(PIXAC*, PIXC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3582</i>
//       */
//      int pixacompAddPixcomp(PixaComp pixac, PixComp pixc, int copyflag);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompReplacePix(PIXAC*, l_int32, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3584</i>
//       */
//      int pixacompReplacePix(PixaComp pixac, int index, Pix pix, int comptype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompReplacePixcomp(PIXAC*, l_int32, PIXC*)</code><br>
//       * <i>native declaration : allheaders.h:3586</i>
//       */
//      int pixacompReplacePixcomp(PixaComp pixac, int index, PixComp pixc);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompAddBox(PIXAC*, BOX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3588</i>
//       */
//      int pixacompAddBox(PixaComp pixac, Box box, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 pixacompGetCount(PIXAC*)</code><br>
//       * <i>native declaration : allheaders.h:3590</i>
//       */
//      int pixacompGetCount(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>PIXC* pixacompGetPixcomp(PIXAC*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3592</i>
//       */
//      PixComp pixacompGetPixcomp(PixaComp pixac, int index, int copyflag);
//      /**
//       * Original signature :
//       * <code>PIX* pixacompGetPix(PIXAC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3594</i>
//       */
//      Pix pixacompGetPix(PixaComp pixac, int index);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompGetPixDimensions(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3596</i>
//       */
//      int pixacompGetPixDimensions(PixaComp pixac, int index, IntBuffer pw, IntBuffer ph, IntBuffer pd);
//      /**
//       * Original signature :
//       * <code>BOXA* pixacompGetBoxa(PIXAC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3598</i>
//       */
//      Boxa pixacompGetBoxa(PixaComp pixac, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompGetBoxaCount(PIXAC*)</code><br>
//       * <i>native declaration : allheaders.h:3600</i>
//       */
//      int pixacompGetBoxaCount(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>BOX* pixacompGetBox(PIXAC*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3602</i>
//       */
//      Box pixacompGetBox(PixaComp pixac, int index, int accesstype);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompGetBoxGeometry(PIXAC*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3604</i>
//       */
//      int pixacompGetBoxGeometry(PixaComp pixac, int index, IntBuffer px, IntBuffer py, IntBuffer pw, IntBuffer ph);
//  
//      /**
//       * Original signature : <code>l_int32 pixacompGetOffset(PIXAC*)</code><br>
//       * <i>native declaration : allheaders.h:3606</i>
//       */
//      int pixacompGetOffset(PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompSetOffset(PIXAC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3608</i>
//       */
//      int pixacompSetOffset(PixaComp pixac, int offset);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaCreateFromPixacomp(PIXAC*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3610</i>
//       */
//      Pixa pixaCreateFromPixacomp(PixaComp pixac, int accesstype);
    /**
     * Original signature :
     * <code>l_int32 pixacompJoin(PIXAC*, PIXAC*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3612</i>
     */
    int pixacompJoin(PixaComp pixacd, PixaComp pixacs, int istart, int iend);

    /**
     * Original signature :
     * <code>PIXAC* pixacompInterleave(PIXAC*, PIXAC*)</code><br>
     * <i>native declaration : allheaders.h:3614</i>
     */
    PixaComp pixacompInterleave(PixaComp pixac1, PixaComp pixac2);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:3616</i>
//       */
//      PixaComp pixacompRead(String filename);
//  
//      /**
//       * Original signature : <code>PIXAC* pixacompReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3618</i>
//       */
//      PixaComp pixacompReadStream(FILE fp);

    /**
     * Original signature :
     * <code>PIXAC* pixacompReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3620</i>
     */
    PixaComp pixacompReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 pixacompWrite(const char*, PIXAC*)</code><br>
//       * <i>native declaration : allheaders.h:3622</i>
//       */
//      int pixacompWrite(String filename, PixaComp pixac);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompWriteStream(FILE*, PIXAC*)</code><br>
//       * <i>native declaration : allheaders.h:3624</i>
//       */
//      int pixacompWriteStream(FILE fp, PixaComp pixac);
    /**
     * Original signature :
     * <code>l_int32 pixacompWriteMem(l_uint8**, size_t*, PIXAC*)</code><br>
     * <i>native declaration : allheaders.h:3626</i>
     */
    int pixacompWriteMem(PointerByReference pdata, NativeSizeByReference psize, PixaComp pixac);

//      /**
//       * Original signature :
//       * <code>l_int32 pixacompConvertToPdf(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3628</i>
//       */
//      int pixacompConvertToPdf(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompConvertToPdfData(PIXAC*, l_int32, l_float32, l_int32, l_int32, const char*, l_uint8**, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:3630</i>
//       */
//      int pixacompConvertToPdfData(PixaComp pixac, int res, float scalefactor, int type, int quality, String title, PointerByReference pdata, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>l_int32 pixacompWriteStreamInfo(FILE*, PIXAC*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3632</i>
//       */
//      int pixacompWriteStreamInfo(FILE fp, PixaComp pixac, String text);
//      /**
//       * Original signature :
//       * <code>l_int32 pixcompWriteStreamInfo(FILE*, PIXC*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3634</i>
//       */
//      int pixcompWriteStreamInfo(FILE fp, PixComp pixc, String text);
//      /**
//       * Original signature :
//       * <code>PIX* pixacompDisplayTiledAndScaled(PIXAC*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3636</i>
//       */
//      Pix pixacompDisplayTiledAndScaled(PixaComp pixac, int outdepth, int tilewidth, int ncols, int background, int spacing, int border);
    /**
     * Original signature :
     * <code>PIX* pixThreshold8(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3638</i>
     */
    Pix pixThreshold8(Pix pixs, int d, int nlevels, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRemoveColormapGeneral(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3640</i>
     */
    Pix pixRemoveColormapGeneral(Pix pixs, int type, int ifnocmap);

    /**
     * Original signature :
     * <code>PIX* pixRemoveColormap(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3642</i>
     */
    Pix pixRemoveColormap(Pix pixs, int type);

    /**
     * Original signature : <code>l_int32 pixAddGrayColormap8(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3644</i>
     */
    int pixAddGrayColormap8(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixAddMinimalGrayColormap8(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3646</i>
     */
    Pix pixAddMinimalGrayColormap8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertRGBToLuminance(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3648</i>
     */
    Pix pixConvertRGBToLuminance(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGray(PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3650</i>
     */
    Pix pixConvertRGBToGray(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature : <code>PIX* pixConvertRGBToGrayFast(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3652</i>
     */
    Pix pixConvertRGBToGrayFast(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayMinMax(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3654</i>
     */
    Pix pixConvertRGBToGrayMinMax(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGraySatBoost(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3656</i>
     */
    Pix pixConvertRGBToGraySatBoost(Pix pixs, int refval);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToGrayArb(PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3658</i>
     */
    Pix pixConvertRGBToGrayArb(Pix pixs, float rc, float gc, float bc);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToBinaryArb(PIX*, l_float32, l_float32, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3660</i>
     */
    Pix pixConvertRGBToBinaryArb(Pix pixs, float rc, float gc, float bc, int thresh, int relation);

    /**
     * Original signature : <code>PIX* pixConvertGrayToColormap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3662</i>
     */
    Pix pixConvertGrayToColormap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToColormap8(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3664</i>
     */
    Pix pixConvertGrayToColormap8(Pix pixs, int mindepth);

    /**
     * Original signature :
     * <code>PIX* pixColorizeGray(PIX*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3666</i>
     */
    Pix pixColorizeGray(Pix pixs, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertRGBToColormap(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3668</i>
     */
    Pix pixConvertRGBToColormap(Pix pixs, int ditherflag);

    /**
     * Original signature : <code>PIX* pixConvertCmapTo1(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3670</i>
     */
    Pix pixConvertCmapTo1(Pix pixs);

    /**
     * Original signature :
     * <code>l_int32 pixQuantizeIfFewColors(PIX*, l_int32, l_int32, l_int32, PIX**)</code><br>
     * <i>native declaration : allheaders.h:3672</i>
     */
    int pixQuantizeIfFewColors(Pix pixs, int maxcolors, int mingraycolors, int octlevel, PointerByReference ppixd);

    /**
     * Original signature : <code>PIX* pixConvert16To8(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3674</i>
     */
    Pix pixConvert16To8(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToFalseColor(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3676</i>
     */
    Pix pixConvertGrayToFalseColor(Pix pixs, float gamma);

    /**
     * Original signature :
     * <code>PIX* pixUnpackBinary(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3678</i>
     */
    Pix pixUnpackBinary(Pix pixs, int depth, int invert);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To16(PIX*, PIX*, l_uint16, l_uint16)</code><br>
     * <i>native declaration : allheaders.h:3680</i>
     */
    Pix pixConvert1To16(Pix pixd, Pix pixs, short val0, short val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To32(PIX*, PIX*, l_uint32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:3682</i>
     */
    Pix pixConvert1To32(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To2Cmap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3684</i>
     */
    Pix pixConvert1To2Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To2(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3686</i>
     */
    Pix pixConvert1To2(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To4Cmap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3688</i>
     */
    Pix pixConvert1To4Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To4(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3690</i>
     */
    Pix pixConvert1To4(Pix pixd, Pix pixs, int val0, int val1);

    /**
     * Original signature : <code>PIX* pixConvert1To8Cmap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3692</i>
     */
    Pix pixConvert1To8Cmap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert1To8(PIX*, PIX*, l_uint8, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:3694</i>
     */
    Pix pixConvert1To8(Pix pixd, Pix pixs, byte val0, byte val1);

    /**
     * Original signature :
     * <code>PIX* pixConvert2To8(PIX*, l_uint8, l_uint8, l_uint8, l_uint8, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3696</i>
     */
    Pix pixConvert2To8(Pix pixs, byte val0, byte val1, byte val2, byte val3, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert4To8(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3698</i>
     */
    Pix pixConvert4To8(Pix pixs, int cmapflag);

    /**
     * Original signature : <code>PIX* pixConvert8To16(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3700</i>
     */
    Pix pixConvert8To16(Pix pixs, int leftshift);

    /**
     * Original signature : <code>PIX* pixConvertTo1(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3702</i>
     */
    Pix pixConvertTo1(Pix pixs, int threshold);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo1BySampling(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3704</i>
     */
    Pix pixConvertTo1BySampling(Pix pixs, int factor, int threshold);

    /**
     * Original signature : <code>PIX* pixConvertTo8(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3706</i>
     */
    Pix pixConvertTo8(Pix pixs, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8BySampling(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3708</i>
     */
    Pix pixConvertTo8BySampling(Pix pixs, int factor, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Color(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3710</i>
     */
    Pix pixConvertTo8Color(Pix pixs, int dither);

    /**
     * Original signature : <code>PIX* pixConvertTo16(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3712</i>
     */
    Pix pixConvertTo16(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvertTo32(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3714</i>
     */
    Pix pixConvertTo32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo32BySampling(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3716</i>
     */
    Pix pixConvertTo32BySampling(Pix pixs, int factor);

    /**
     * Original signature : <code>PIX* pixConvert8To32(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3718</i>
     */
    Pix pixConvert8To32(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertTo8Or32(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3720</i>
     */
    Pix pixConvertTo8Or32(Pix pixs, int copyflag, int warnflag);

    /**
     * Original signature : <code>PIX* pixConvert24To32(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3722</i>
     */
    Pix pixConvert24To32(Pix pixs);

    /**
     * Original signature : <code>PIX* pixConvert32To24(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3724</i>
     */
    Pix pixConvert32To24(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvert32To16(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3726</i>
     */
    Pix pixConvert32To16(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixConvert32To8(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3728</i>
     */
    Pix pixConvert32To8(Pix pixs, int type16, int type8);

    /**
     * Original signature : <code>PIX* pixRemoveAlpha(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3730</i>
     */
    Pix pixRemoveAlpha(Pix pixs);

    /**
     * Original signature : <code>PIX* pixAddAlphaTo1bpp(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3732</i>
     */
    Pix pixAddAlphaTo1bpp(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertLossless(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3734</i>
     */
    Pix pixConvertLossless(Pix pixs, int d);

    /**
     * Original signature : <code>PIX* pixConvertForPSWrap(PIX*)</code><br>
     * <i>native declaration : allheaders.h:3736</i>
     */
    Pix pixConvertForPSWrap(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixConvertToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3738</i>
     */
    Pix pixConvertToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertGrayToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3740</i>
     */
    Pix pixConvertGrayToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature :
     * <code>PIX* pixConvertColorToSubpixelRGB(PIX*, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3742</i>
     */
    Pix pixConvertColorToSubpixelRGB(Pix pixs, float scalex, float scaley, int order);

    /**
     * Original signature : <code>void l_setNeutralBoostVal(l_int32)</code><br>
     * <i>native declaration : allheaders.h:3744</i>
     */
    void l_setNeutralBoostVal(int val);

//      /**
//       * Original signature :
//       * <code>PIX* pixConnCompTransform(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3746</i>
//       */
//      Pix pixConnCompTransform(Pix pixs, int connect, int depth);
//      /**
//       * Original signature :
//       * <code>PIX* pixConnCompAreaTransform(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3748</i>
//       */
//      Pix pixConnCompAreaTransform(Pix pixs, int connect);
    /**
     * Original signature :
     * <code>l_int32 pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3750</i>
     */
    int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntBuffer pncc);

    /**
     * Original signature :
     * <code>l_int32 pixConnCompIncrInit(PIX*, l_int32, PIX**, PTAA**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3750</i>
     */
    int pixConnCompIncrInit(Pix pixs, int conn, PointerByReference ppixd, PointerByReference pptaa, IntByReference pncc);

    /**
     * Original signature :
     * <code>l_int32 pixConnCompIncrAdd(PIX*, PTAA*, l_int32*, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3752</i>
     */
    int pixConnCompIncrAdd(Pix pixs, Ptaa ptaa, IntBuffer pncc, float x, float y, int debug);

    /**
     * Original signature :
     * <code>l_int32 pixGetSortedNeighborValues(PIX*, l_int32, l_int32, l_int32, l_int32**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3754</i>
     */
    int pixGetSortedNeighborValues(Pix pixs, int x, int y, int conn, PointerByReference pneigh, IntBuffer pnvals);
//  
//      /**
//       * Original signature : <code>PIX* pixLocToColorTransform(PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3756</i>
//       */
//      Pix pixLocToColorTransform(Pix pixs);

//      /**
//       * Original signature :
//       * <code>PIXTILING* pixTilingCreate(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3758</i>
//       */
//      PixTiling pixTilingCreate(Pix pixs, int nx, int ny, int w, int h, int xoverlap, int yoverlap);
//  
//      /**
//       * Original signature : <code>void pixTilingDestroy(PIXTILING**)</code><br>
//       * <i>native declaration : allheaders.h:3760</i>
//       */
//      void pixTilingDestroy(PointerByReference ppt);
//      /**
//       * Original signature :
//       * <code>l_int32 pixTilingGetCount(PIXTILING*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3762</i>
//       */
//      int pixTilingGetCount(PixTiling pt, IntBuffer pnx, IntBuffer pny);
//      /**
//       * Original signature :
//       * <code>l_int32 pixTilingGetSize(PIXTILING*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3764</i>
//       */
//      int pixTilingGetSize(PixTiling pt, IntBuffer pw, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>PIX* pixTilingGetTile(PIXTILING*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3766</i>
//       */
//      Pix pixTilingGetTile(PixTiling pt, int i, int j);
//      /**
//       * Original signature :
//       * <code>l_int32 pixTilingNoStripOnPaint(PIXTILING*)</code><br>
//       * <i>native declaration : allheaders.h:3768</i>
//       */
//      int pixTilingNoStripOnPaint(PixTiling pt);
//      /**
//       * Original signature :
//       * <code>l_int32 pixTilingPaintTile(PIX*, l_int32, l_int32, PIX*, PIXTILING*)</code><br>
//       * <i>native declaration : allheaders.h:3770</i>
//       */
//      int pixTilingPaintTile(Pix pixd, int i, int j, Pix pixs, PixTiling pt);
    /**
     * Original signature : <code>PIX* pixReadStreamPng(FILE*)</code><br>
     * <i>native declaration : allheaders.h:3772</i>
     */
    Pix pixReadStreamPng(FILE fp);

    /**
     * Original signature :
     * <code>l_int32 readHeaderPng(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3774</i>
     */
    int readHeaderPng(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 freadHeaderPng(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3776</i>
     */
    int freadHeaderPng(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 readHeaderMemPng(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3778</i>
     */
    int readHeaderMemPng(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 fgetPngResolution(FILE*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3780</i>
     */
    int fgetPngResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_int32 isPngInterlaced(const char*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3782</i>
     */
    int isPngInterlaced(String filename, IntBuffer pinterlaced);

    /**
     * Original signature :
     * <code>l_int32 fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3784</i>
     */
    int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntBuffer ptransparency);

    /**
     * Original signature :
     * <code>l_int32 fgetPngColormapInfo(FILE*, PIXCMAP**, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3784</i>
     */
    int fgetPngColormapInfo(FILE fp, PointerByReference pcmap, IntByReference ptransparency);

    /**
     * Original signature :
     * <code>l_int32 pixWritePng(const char*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3786</i>
     */
    int pixWritePng(String filename, Pix pix, float gamma);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamPng(FILE*, PIX*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3788</i>
//       */
//      int pixWriteStreamPng(FILE fp, Pix pix, float gamma);
    /**
     * Original signature :
     * <code>l_int32 pixSetZlibCompression(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3790</i>
     */
    int pixSetZlibCompression(Pix pix, int compval);

    /**
     * Original signature :
     * <code>void l_pngSetReadStrip16To8(l_int32)</code><br>
     * <i>native declaration : allheaders.h:3792</i>
     */
    void l_pngSetReadStrip16To8(int flag);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPng(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3794</i>
     */
    Pix pixReadMemPng(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemPng(l_uint8**, size_t*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:3796</i>
     */
    int pixWriteMemPng(PointerByReference pfiledata, NativeSizeByReference pfilesize, Pix pix, float gamma);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamPnm(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3798</i>
//       */
//      Pix pixReadStreamPnm(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_int32 readHeaderPnm(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3800</i>
//       */
//      int readHeaderPnm(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);
//      /**
//       * Original signature :
//       * <code>l_int32 freadHeaderPnm(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3802</i>
//       */
//      int freadHeaderPnm(FILE fp, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamPnm(FILE*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3804</i>
//       */
//      int pixWriteStreamPnm(FILE fp, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamAsciiPnm(FILE*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3806</i>
//       */
//      int pixWriteStreamAsciiPnm(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>l_int32 pixWriteStreamPam(FILE*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3808</i>
     */
    int pixWriteStreamPam(FILE fp, Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixReadMemPnm(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3810</i>
     */
    Pix pixReadMemPnm(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 readHeaderMemPnm(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:3812</i>
     */
    int readHeaderMemPnm(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pd, IntBuffer ptype, IntBuffer pbps, IntBuffer pspp);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteMemPnm(l_uint8**, size_t*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:3814</i>
//       */
//      int pixWriteMemPnm(PointerByReference pdata, NativeSizeByReference psize, Pix pix);
    /**
     * Original signature :
     * <code>l_int32 pixWriteMemPam(l_uint8**, size_t*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:3816</i>
     */
    int pixWriteMemPam(PointerByReference pdata, NativeSizeByReference psize, Pix pix);

//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveSampledPta(PIX*, PTA*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3818</i>
//       */
//      Pix pixProjectiveSampledPta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveSampled(PIX*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3820</i>
//       */
//      Pix pixProjectiveSampled(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePta(PIX*, PTA*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3822</i>
//       */
//      Pix pixProjectivePta(Pix pixs, Pta ptad, Pta ptas, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjective(PIX*, l_float32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3824</i>
//       */
//      Pix pixProjective(Pix pixs, FloatBuffer vc, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaColor(PIX*, PTA*, PTA*, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3826</i>
//       */
//      Pix pixProjectivePtaColor(Pix pixs, Pta ptad, Pta ptas, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveColor(PIX*, l_float32*, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:3828</i>
//       */
//      Pix pixProjectiveColor(Pix pixs, FloatBuffer vc, int colorval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaGray(PIX*, PTA*, PTA*, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:3830</i>
//       */
//      Pix pixProjectivePtaGray(Pix pixs, Pta ptad, Pta ptas, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectiveGray(PIX*, l_float32*, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:3832</i>
//       */
//      Pix pixProjectiveGray(Pix pixs, FloatBuffer vc, byte grayval);
//      /**
//       * Original signature :
//       * <code>PIX* pixProjectivePtaWithAlpha(PIX*, PTA*, PTA*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3834</i>
//       */
//      Pix pixProjectivePtaWithAlpha(Pix pixs, Pta ptad, Pta ptas, Pix pixg, float fract, int border);
//      /**
//       * Original signature :
//       * <code>l_int32 getProjectiveXformCoeffs(PTA*, PTA*, l_float32**)</code><br>
//       * <i>native declaration : allheaders.h:3836</i>
//       */
//      int getProjectiveXformCoeffs(Pta ptas, Pta ptad, PointerByReference pvc);
//      /**
//       * Original signature :
//       * <code>l_int32 projectiveXformSampledPt(l_float32*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3838</i>
//       */
//      int projectiveXformSampledPt(FloatBuffer vc, int x, int y, IntBuffer pxp, IntBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_int32 projectiveXformPt(l_float32*, l_int32, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3840</i>
//       */
//      int projectiveXformPt(FloatBuffer vc, int x, int y, FloatBuffer pxp, FloatBuffer pyp);
//      /**
//       * Original signature :
//       * <code>l_int32 convertFilesToPS(const char*, const char*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3842</i>
//       */
//      int convertFilesToPS(String dirin, String substr, int res, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayConvertFilesToPS(SARRAY*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3844</i>
//       */
//      int sarrayConvertFilesToPS(Sarray sa, int res, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 convertFilesFittedToPS(const char*, const char*, l_float32, l_float32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3846</i>
//       */
//      int convertFilesFittedToPS(String dirin, String substr, float xpts, float ypts, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayConvertFilesFittedToPS(SARRAY*, l_float32, l_float32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3848</i>
//       */
//      int sarrayConvertFilesFittedToPS(Sarray sa, float xpts, float ypts, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 writeImageCompressedToPSFile(const char*, const char*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3850</i>
//       */
//      int writeImageCompressedToPSFile(String filein, String fileout, int res, IntBuffer pfirstfile, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 convertSegmentedPagesToPS(const char*, const char*, l_int32, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_float32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3852</i>
//       */
//      int convertSegmentedPagesToPS(String pagedir, String pagestr, int page_numpre, String maskdir, String maskstr, int mask_numpre, int numpost, int maxnum, float textscale, float imagescale, int threshold, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteSegmentedPageToPS(PIX*, PIX*, l_float32, l_float32, l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3854</i>
//       */
//      int pixWriteSegmentedPageToPS(Pix pixs, Pix pixm, float textscale, float imagescale, int threshold, int pageno, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteMixedToPS(PIX*, PIX*, l_float32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3856</i>
//       */
//      int pixWriteMixedToPS(Pix pixb, Pix pixc, float scale, int pageno, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 convertToPSEmbed(const char*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3858</i>
//       */
//      int convertToPSEmbed(String filein, String fileout, int level);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaWriteCompressedToPS(PIXA*, const char*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3860</i>
//       */
//      int pixaWriteCompressedToPS(Pixa pixa, String fileout, int res, int level);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWritePSEmbed(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3862</i>
//       */
//      int pixWritePSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamPS(FILE*, PIX*, BOX*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3864</i>
//       */
//      int pixWriteStreamPS(FILE fp, Pix pix, Box box, int res, float scale);
//      /**
//       * Original signature :
//       * <code>char* pixWriteStringPS(PIX*, BOX*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3866</i>
//       */
//      Pointer pixWriteStringPS(Pix pixs, Box box, int res, float scale);
    /**
     * Original signature :
     * <code>char* generateUncompressedPS(char*, l_int32, l_int32, l_int32, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3868</i>
     */
    Pointer generateUncompressedPS(ByteBuffer hexdata, int w, int h, int d, int psbpl, int bps, float xpt, float ypt, float wpt, float hpt, int boxflag);

//      /**
//       * Original signature :
//       * <code>void getScaledParametersPS(BOX*, l_int32, l_int32, l_int32, l_float32, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3870</i>
//       */
//      void getScaledParametersPS(Box box, int wpix, int hpix, int res, float scale, FloatBuffer pxpt, FloatBuffer pypt, FloatBuffer pwpt, FloatBuffer phpt);
    /**
     * Original signature :
     * <code>void convertByteToHexAscii(l_uint8, char*, char*)</code><br>
     * <i>native declaration : allheaders.h:3872</i>
     */
    void convertByteToHexAscii(byte byteval, ByteBuffer pnib1, ByteBuffer pnib2);

//      /**
//       * Original signature :
//       * <code>l_int32 convertJpegToPSEmbed(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3874</i>
//       */
//      int convertJpegToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 convertJpegToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3876</i>
//       */
//      int convertJpegToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 convertJpegToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3878</i>
//       */
//      int convertJpegToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateJpegPS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3880</i>
//       */
//      Pointer generateJpegPS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 convertG4ToPSEmbed(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3882</i>
//       */
//      int convertG4ToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 convertG4ToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3884</i>
//       */
//      int convertG4ToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int maskflag, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 convertG4ToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3886</i>
//       */
//      int convertG4ToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int maskflag, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateG4PS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3888</i>
//       */
//      Pointer generateG4PS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int maskflag, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 convertTiffMultipageToPS(const char*, const char*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3890</i>
//       */
//      int convertTiffMultipageToPS(String filein, String fileout, float fillfract);
//      /**
//       * Original signature :
//       * <code>l_int32 convertFlateToPSEmbed(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:3892</i>
//       */
//      int convertFlateToPSEmbed(String filein, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 convertFlateToPS(const char*, const char*, const char*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3894</i>
//       */
//      int convertFlateToPS(String filein, String fileout, String operation, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 convertFlateToPSString(const char*, char**, l_int32*, l_int32, l_int32, l_int32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3896</i>
//       */
//      int convertFlateToPSString(String filein, PointerByReference poutstr, IntBuffer pnbytes, int x, int y, int res, float scale, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>char* generateFlatePS(const char*, L_COMP_DATA*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3898</i>
//       */
//      Pointer generateFlatePS(String filein, L_Compressed_Data cid, float xpt, float ypt, float wpt, float hpt, int pageno, int endpage);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteMemPS(l_uint8**, size_t*, PIX*, BOX*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3900</i>
//       */
//      int pixWriteMemPS(PointerByReference pdata, NativeSizeByReference psize, Pix pix, Box box, int res, float scale);
//      /**
//       * Original signature :
//       * <code>l_int32 getResLetterPage(l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3902</i>
//       */
//      int getResLetterPage(int w, int h, float fillfract);
//      /**
//       * Original signature :
//       * <code>l_int32 getResA4Page(l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3904</i>
//       */
//      int getResA4Page(int w, int h, float fillfract);
//  
//      /**
//       * Original signature : <code>void l_psWriteBoundingBox(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3906</i>
//       */
//      void l_psWriteBoundingBox(int flag);
//  
//      /**
//       * Original signature : <code>PTA* ptaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3908</i>
//       */
//      Pta ptaCreate(int n);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCreateFromNuma(NUMA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:3910</i>
//       */
//      Pta ptaCreateFromNuma(Numa nax, Numa nay);
//  
//      /**
//       * Original signature : <code>void ptaDestroy(PTA**)</code><br>
//       * <i>native declaration : allheaders.h:3912</i>
//       */
//      void ptaDestroy(PointerByReference ppta);
//  
//      /**
//       * Original signature : <code>PTA* ptaCopy(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3914</i>
//       */
//      Pta ptaCopy(Pta pta);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCopyRange(PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3916</i>
//       */
//      Pta ptaCopyRange(Pta ptas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PTA* ptaClone(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3918</i>
//       */
//      Pta ptaClone(Pta pta);
//  
//      /**
//       * Original signature : <code>l_int32 ptaEmpty(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3920</i>
//       */
//      int ptaEmpty(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaAddPt(PTA*, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3922</i>
//       */
//      int ptaAddPt(Pta pta, float x, float y);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaInsertPt(PTA*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3924</i>
//       */
//      int ptaInsertPt(Pta pta, int index, int x, int y);
//  
//      /**
//       * Original signature : <code>l_int32 ptaRemovePt(PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3926</i>
//       */
//      int ptaRemovePt(Pta pta, int index);
//  
//      /**
//       * Original signature : <code>l_int32 ptaGetRefcount(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3928</i>
//       */
//      int ptaGetRefcount(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaChangeRefcount(PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3930</i>
//       */
//      int ptaChangeRefcount(Pta pta, int delta);
//  
//      /**
//       * Original signature : <code>l_int32 ptaGetCount(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3932</i>
//       */
//      int ptaGetCount(Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetPt(PTA*, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3934</i>
//       */
//      int ptaGetPt(Pta pta, int index, FloatBuffer px, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetIPt(PTA*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:3936</i>
//       */
//      int ptaGetIPt(Pta pta, int index, IntBuffer px, IntBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaSetPt(PTA*, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3938</i>
//       */
//      int ptaSetPt(Pta pta, int index, float x, float y);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetArrays(PTA*, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:3940</i>
//       */
//      int ptaGetArrays(Pta pta, PointerByReference pnax, PointerByReference pnay);
//  
//      /**
//       * Original signature : <code>PTA* ptaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:3942</i>
//       */
//      Pta ptaRead(String filename);
//  
//      /**
//       * Original signature : <code>PTA* ptaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3944</i>
//       */
//      Pta ptaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PTA* ptaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3946</i>
     */
    Pta ptaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaWrite(const char*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3948</i>
//       */
//      int ptaWrite(String filename, Pta pta, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaWriteStream(FILE*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3950</i>
//       */
//      int ptaWriteStream(FILE fp, Pta pta, int type);
    /**
     * Original signature :
     * <code>l_int32 ptaWriteMem(l_uint8**, size_t*, PTA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3952</i>
     */
    int ptaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pta pta, int type);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3954</i>
//       */
//      Ptaa ptaaCreate(int n);
//  
//      /**
//       * Original signature : <code>void ptaaDestroy(PTAA**)</code><br>
//       * <i>native declaration : allheaders.h:3956</i>
//       */
//      void ptaaDestroy(PointerByReference pptaa);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaaAddPta(PTAA*, PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3958</i>
//       */
//      int ptaaAddPta(Ptaa ptaa, Pta pta, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 ptaaGetCount(PTAA*)</code><br>
//       * <i>native declaration : allheaders.h:3960</i>
//       */
//      int ptaaGetCount(Ptaa ptaa);
//      /**
//       * Original signature :
//       * <code>PTA* ptaaGetPta(PTAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3962</i>
//       */
//      Pta ptaaGetPta(Ptaa ptaa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaaGetPt(PTAA*, l_int32, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:3964</i>
//       */
//      int ptaaGetPt(Ptaa ptaa, int ipta, int jpt, FloatBuffer px, FloatBuffer py);
//  
//      /**
//       * Original signature : <code>l_int32 ptaaInitFull(PTAA*, PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3966</i>
//       */
//      int ptaaInitFull(Ptaa ptaa, Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaaReplacePta(PTAA*, l_int32, PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3968</i>
//       */
//      int ptaaReplacePta(Ptaa ptaa, int index, Pta pta);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaaAddPt(PTAA*, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:3970</i>
//       */
//      int ptaaAddPt(Ptaa ptaa, int ipta, float x, float y);
//  
//      /**
//       * Original signature : <code>l_int32 ptaaTruncate(PTAA*)</code><br>
//       * <i>native declaration : allheaders.h:3972</i>
//       */
//      int ptaaTruncate(Ptaa ptaa);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:3974</i>
//       */
//      Ptaa ptaaRead(String filename);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:3976</i>
//       */
//      Ptaa ptaaReadStream(FILE fp);
    /**
     * Original signature :
     * <code>PTAA* ptaaReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:3978</i>
     */
    Ptaa ptaaReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaaWrite(const char*, PTAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3980</i>
//       */
//      int ptaaWrite(String filename, Ptaa ptaa, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaaWriteStream(FILE*, PTAA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3982</i>
//       */
//      int ptaaWriteStream(FILE fp, Ptaa ptaa, int type);
    /**
     * Original signature :
     * <code>l_int32 ptaaWriteMem(l_uint8**, size_t*, PTAA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3984</i>
     */
    int ptaaWriteMem(PointerByReference pdata, NativeSizeByReference psize, Ptaa ptaa, int type);
//  
//      /**
//       * Original signature : <code>PTA* ptaSubsample(PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3986</i>
//       */
//      Pta ptaSubsample(Pta ptas, int subfactor);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaJoin(PTA*, PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3988</i>
//       */
//      int ptaJoin(Pta ptad, Pta ptas, int istart, int iend);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaaJoin(PTAA*, PTAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3990</i>
//       */
//      int ptaaJoin(Ptaa ptaad, Ptaa ptaas, int istart, int iend);
//  
//      /**
//       * Original signature : <code>PTA* ptaReverse(PTA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3992</i>
//       */
//      Pta ptaReverse(Pta ptas, int type);
//  
//      /**
//       * Original signature : <code>PTA* ptaTranspose(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:3994</i>
//       */
//      Pta ptaTranspose(Pta ptas);
//      /**
//       * Original signature :
//       * <code>PTA* ptaCyclicPerm(PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:3996</i>
//       */
//      Pta ptaCyclicPerm(Pta ptas, int xs, int ys);
    /**
     * Original signature :
     * <code>PTA* ptaSelectRange(PTA*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:3998</i>
     */
    Pta ptaSelectRange(Pta ptas, int first, int last);
//  
//      /**
//       * Original signature : <code>BOX* ptaGetBoundingRegion(PTA*)</code><br>
//       * <i>native declaration : allheaders.h:4000</i>
//       */
//      Box ptaGetBoundingRegion(Pta pta);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetRange(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4002</i>
//       */
//      int ptaGetRange(Pta pta, FloatBuffer pminx, FloatBuffer pmaxx, FloatBuffer pminy, FloatBuffer pmaxy);
//  
//      /**
//       * Original signature : <code>PTA* ptaGetInsideBox(PTA*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:4004</i>
//       */
//      Pta ptaGetInsideBox(Pta ptas, Box box);
//  
//      /**
//       * Original signature : <code>PTA* pixFindCornerPixels(PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4006</i>
//       */
//      Pta pixFindCornerPixels(Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaContainsPt(PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4008</i>
//       */
//      int ptaContainsPt(Pta pta, int x, int y);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaTestIntersection(PTA*, PTA*)</code><br>
//       * <i>native declaration : allheaders.h:4010</i>
//       */
//      int ptaTestIntersection(Pta pta1, Pta pta2);
//      /**
//       * Original signature :
//       * <code>PTA* ptaTransform(PTA*, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4012</i>
//       */
//      Pta ptaTransform(Pta ptas, int shiftx, int shifty, float scalex, float scaley);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaPtInsidePolygon(PTA*, l_float32, l_float32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4014</i>
//       */
//      int ptaPtInsidePolygon(Pta pta, float x, float y, IntBuffer pinside);
//      /**
//       * Original signature :
//       * <code>l_float32 l_angleBetweenVectors(l_float32, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4016</i>
//       */
//      float l_angleBetweenVectors(float x1, float y1, float x2, float y2);
    /**
     * Original signature :
     * <code>l_int32 ptaGetMinMax(PTA*, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4018</i>
     */
    int ptaGetMinMax(Pta pta, FloatBuffer pxmin, FloatBuffer pymin, FloatBuffer pxmax, FloatBuffer pymax);

    /**
     * Original signature :
     * <code>PTA* ptaSelectByValue(PTA*, l_float32, l_float32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4020</i>
     */
    Pta ptaSelectByValue(Pta ptas, float xth, float yth, int type, int relation);

    /**
     * Original signature : <code>PTA* ptaCropToMask(PTA*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:4022</i>
     */
    Pta ptaCropToMask(Pta ptas, Pix pixm);

//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4024</i>
//       */
//      int ptaGetLinearLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetLinearLSF(PTA*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4024</i>
//       */
//      int ptaGetLinearLSF(Pta pta, FloatByReference pa, FloatByReference pb, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4026</i>
//       */
//      int ptaGetQuadraticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetQuadraticLSF(PTA*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4026</i>
//       */
//      int ptaGetQuadraticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4028</i>
//       */
//      int ptaGetCubicLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetCubicLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4028</i>
//       */
//      int ptaGetCubicLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4030</i>
//       */
//      int ptaGetQuarticLSF(Pta pta, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pd, FloatBuffer pe, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetQuarticLSF(PTA*, l_float32*, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4030</i>
//       */
//      int ptaGetQuarticLSF(Pta pta, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pd, FloatByReference pe, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4032</i>
//       */
//      int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaNoisyLinearLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4032</i>
//       */
//      int ptaNoisyLinearLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4034</i>
//       */
//      int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatBuffer pa, FloatBuffer pb, FloatBuffer pc, FloatBuffer pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaNoisyQuadraticLSF(PTA*, l_float32, PTA**, l_float32*, l_float32*, l_float32*, l_float32*, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4034</i>
//       */
//      int ptaNoisyQuadraticLSF(Pta pta, float factor, PointerByReference pptad, FloatByReference pa, FloatByReference pb, FloatByReference pc, FloatByReference pmederr, PointerByReference pnafit);
//      /**
//       * Original signature :
//       * <code>l_int32 applyLinearFit(l_float32, l_float32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4036</i>
//       */
//      int applyLinearFit(float a, float b, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 applyQuadraticFit(l_float32, l_float32, l_float32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4038</i>
//       */
//      int applyQuadraticFit(float a, float b, float c, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 applyCubicFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4040</i>
//       */
//      int applyCubicFit(float a, float b, float c, float d, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 applyQuarticFit(l_float32, l_float32, l_float32, l_float32, l_float32, l_float32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4042</i>
//       */
//      int applyQuarticFit(float a, float b, float c, float d, float e, float x, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 pixPlotAlongPta(PIX*, PTA*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4044</i>
//       */
//      int pixPlotAlongPta(Pix pixs, Pta pta, int outformat, String title);
//      /**
//       * Original signature :
//       * <code>PTA* ptaGetPixelsFromPix(PIX*, BOX*)</code><br>
//       * <i>native declaration : allheaders.h:4046</i>
//       */
//      Pta ptaGetPixelsFromPix(Pix pixs, Box box);
//      /**
//       * Original signature :
//       * <code>PIX* pixGenerateFromPta(PTA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4048</i>
//       */
//      Pix pixGenerateFromPta(Pta pta, int w, int h);
//      /**
//       * Original signature :
//       * <code>PTA* ptaGetBoundaryPixels(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4050</i>
//       */
//      Pta ptaGetBoundaryPixels(Pix pixs, int type);
//      /**
//       * Original signature :
//       * <code>PTAA* ptaaGetBoundaryPixels(PIX*, l_int32, l_int32, BOXA**, PIXA**)</code><br>
//       * <i>native declaration : allheaders.h:4052</i>
//       */
//      Ptaa ptaaGetBoundaryPixels(Pix pixs, int type, int connectivity, PointerByReference pboxa, PointerByReference ppixa);
//    /**
//     * Original signature :
//     * <code>PTAA* ptaaIndexLabeledPixels(PIX*, l_int32*)</code><br>
//     * <i>native declaration : allheaders.h:4054</i>
//     */
//    Ptaa ptaaIndexLabeledPixels(Pix pixs, IntBuffer pncc);
//
//    /**
//     * Original signature :
//     * <code>PTA* ptaGetNeighborPixLocs(PIX*, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4056</i>
//     */
//    Pta ptaGetNeighborPixLocs(Pix pixs, int x, int y, int conn);
//
//    /**
//     * Original signature : <code>PTA* numaConvertToPta1(NUMA*)</code><br>
//     * <i>native declaration : allheaders.h:4058</i>
//     */
//    Pta numaConvertToPta1(Numa na);
//
//    /**
//     * Original signature :
//     * <code>PTA* numaConvertToPta2(NUMA*, NUMA*)</code><br>
//     * <i>native declaration : allheaders.h:4060</i>
//     */
//    Pta numaConvertToPta2(Numa nax, Numa nay);
//
//    /**
//     * Original signature :
//     * <code>l_int32 ptaConvertToNuma(PTA*, NUMA**, NUMA**)</code><br>
//     * <i>native declaration : allheaders.h:4062</i>
//     */
//    int ptaConvertToNuma(Pta pta, PointerByReference pnax, PointerByReference pnay);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPta(PIX*, PIX*, PTA*)</code><br>
//       * <i>native declaration : allheaders.h:4064</i>
//       */
//      Pix pixDisplayPta(Pix pixd, Pix pixs, Pta pta);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPtaaPattern(PIX*, PIX*, PTAA*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4066</i>
//       */
//      Pix pixDisplayPtaaPattern(Pix pixd, Pix pixs, Ptaa ptaa, Pix pixp, int cx, int cy);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayPtaPattern(PIX*, PIX*, PTA*, PIX*, l_int32, l_int32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:4068</i>
//       */
//      Pix pixDisplayPtaPattern(Pix pixd, Pix pixs, Pta pta, Pix pixp, int cx, int cy, int color);
//      /**
//       * Original signature :
//       * <code>PTA* ptaReplicatePattern(PTA*, PIX*, PTA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4070</i>
//       */
//      Pta ptaReplicatePattern(Pta ptas, Pix pixp, Pta ptap, int cx, int cy, int w, int h);
//  
//      /**
//       * Original signature : <code>PIX* pixDisplayPtaa(PIX*, PTAA*)</code><br>
//       * <i>native declaration : allheaders.h:4072</i>
//       */
//      Pix pixDisplayPtaa(Pix pixs, Ptaa ptaa);
//      /**
//       * Original signature :
//       * <code>PTA* ptaSort(PTA*, l_int32, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4074</i>
//       */
//      Pta ptaSort(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);
//      /**
//       * Original signature :
//       * <code>l_int32 ptaGetSortIndex(PTA*, l_int32, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4076</i>
//       */
//      int ptaGetSortIndex(Pta ptas, int sorttype, int sortorder, PointerByReference pnaindex);
//  
//      /**
//       * Original signature : <code>PTA* ptaSortByIndex(PTA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:4078</i>
//       */
//      Pta ptaSortByIndex(Pta ptas, Numa naindex);
//  
//      /**
//       * Original signature : <code>PTAA* ptaaSortByIndex(PTAA*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:4080</i>
//       */
//      Ptaa ptaaSortByIndex(Ptaa ptaas, Numa naindex);
    /**
     * Original signature :
     * <code>l_int32 ptaGetRankValue(PTA*, l_float32, PTA*, l_int32, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4082</i>
     */
    int ptaGetRankValue(Pta pta, float fract, Pta ptasort, int sorttype, FloatBuffer pval);

    /**
     * Original signature : <code>PTA* ptaUnionByAset(PTA*, PTA*)</code><br>
     * <i>native declaration : allheaders.h:4084</i>
     */
    Pta ptaUnionByAset(Pta pta1, Pta pta2);

    /**
     * Original signature : <code>PTA* ptaRemoveDupsByAset(PTA*)</code><br>
     * <i>native declaration : allheaders.h:4086</i>
     */
    Pta ptaRemoveDupsByAset(Pta ptas);

    /**
     * Original signature :
     * <code>PTA* ptaIntersectionByAset(PTA*, PTA*)</code><br>
     * <i>native declaration : allheaders.h:4088</i>
     */
    Pta ptaIntersectionByAset(Pta pta1, Pta pta2);

    /**
     * Original signature : <code>L_ASET* l_asetCreateFromPta(PTA*)</code><br>
     * <i>native declaration : allheaders.h:4090</i>
     */
    L_Rbtree l_asetCreateFromPta(Pta pta);

    /**
     * Original signature : <code>PTA* ptaUnionByHash(PTA*, PTA*)</code><br>
     * <i>native declaration : allheaders.h:4092</i>
     */
    Pta ptaUnionByHash(Pta pta1, Pta pta2);

    /**
     * Original signature :
     * <code>l_int32 ptaRemoveDupsByHash(PTA*, PTA**, L_DNAHASH**)</code><br>
     * <i>native declaration : allheaders.h:4094</i>
     */
    int ptaRemoveDupsByHash(Pta ptas, PointerByReference pptad, PointerByReference pdahash);

    /**
     * Original signature :
     * <code>PTA* ptaIntersectionByHash(PTA*, PTA*)</code><br>
     * <i>native declaration : allheaders.h:4096</i>
     */
    Pta ptaIntersectionByHash(Pta pta1, Pta pta2);

    /**
     * Original signature :
     * <code>l_int32 ptaFindPtByHash(PTA*, L_DNAHASH*, l_int32, l_int32, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4098</i>
     */
    int ptaFindPtByHash(Pta pta, L_DnaHash dahash, int x, int y, IntBuffer pindex);

    /**
     * Original signature :
     * <code>L_DNAHASH* l_dnaHashCreateFromPta(PTA*)</code><br>
     * <i>native declaration : allheaders.h:4100</i>
     */
    L_DnaHash l_dnaHashCreateFromPta(Pta pta);
//  
//      /**
//       * Original signature : <code>L_PTRA* ptraCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4102</i>
//       */
//      L_Ptra ptraCreate(int n);

//      /**
//       * Original signature :
//       * <code>void ptraDestroy(L_PTRA**, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4104</i>
//       */
//      void ptraDestroy(PointerByReference ppa, int freeflag, int warnflag);
//  
//      /**
//       * Original signature : <code>l_int32 ptraAdd(L_PTRA*, void*)</code><br>
//       * <i>native declaration : allheaders.h:4106</i>
//       */
//      int ptraAdd(L_Ptra pa, Pointer item);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraInsert(L_PTRA*, l_int32, void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4108</i>
//       */
//      int ptraInsert(L_Ptra pa, int index, Pointer item, int shiftflag);
//      /**
//       * Original signature :
//       * <code>void* ptraRemove(L_PTRA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4110</i>
//       */
//      Pointer ptraRemove(L_Ptra pa, int index, int flag);
//  
//      /**
//       * Original signature : <code>void* ptraRemoveLast(L_PTRA*)</code><br>
//       * <i>native declaration : allheaders.h:4112</i>
//       */
//      Pointer ptraRemoveLast(L_Ptra pa);
//      /**
//       * Original signature :
//       * <code>void* ptraReplace(L_PTRA*, l_int32, void*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4114</i>
//       */
//      Pointer ptraReplace(L_Ptra pa, int index, Pointer item, int freeflag);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraSwap(L_PTRA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4116</i>
//       */
//      int ptraSwap(L_Ptra pa, int index1, int index2);
//  
//      /**
//       * Original signature : <code>l_int32 ptraCompactArray(L_PTRA*)</code><br>
//       * <i>native declaration : allheaders.h:4118</i>
//       */
//      int ptraCompactArray(L_Ptra pa);
//  
//      /**
//       * Original signature : <code>l_int32 ptraReverse(L_PTRA*)</code><br>
//       * <i>native declaration : allheaders.h:4120</i>
//       */
//      int ptraReverse(L_Ptra pa);
//  
//      /**
//       * Original signature : <code>l_int32 ptraJoin(L_PTRA*, L_PTRA*)</code><br>
//       * <i>native declaration : allheaders.h:4122</i>
//       */
//      int ptraJoin(L_Ptra pa1, L_Ptra pa2);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraGetMaxIndex(L_PTRA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4124</i>
//       */
//      int ptraGetMaxIndex(L_Ptra pa, IntBuffer pmaxindex);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraGetActualCount(L_PTRA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4126</i>
//       */
//      int ptraGetActualCount(L_Ptra pa, IntBuffer pcount);
//      /**
//       * Original signature :
//       * <code>void* ptraGetPtrToItem(L_PTRA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4128</i>
//       */
//      Pointer ptraGetPtrToItem(L_Ptra pa, int index);
//  
//      /**
//       * Original signature : <code>L_PTRAA* ptraaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4130</i>
//       */
//      L_Ptraa ptraaCreate(int n);
//      /**
//       * Original signature :
//       * <code>void ptraaDestroy(L_PTRAA**, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4132</i>
//       */
//      void ptraaDestroy(PointerByReference ppaa, int freeflag, int warnflag);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraaGetSize(L_PTRAA*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4134</i>
//       */
//      int ptraaGetSize(L_Ptraa paa, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_int32 ptraaInsertPtra(L_PTRAA*, l_int32, L_PTRA*)</code><br>
//       * <i>native declaration : allheaders.h:4136</i>
//       */
//      int ptraaInsertPtra(L_Ptraa paa, int index, L_Ptra pa);
//      /**
//       * Original signature :
//       * <code>L_PTRA* ptraaGetPtra(L_PTRAA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4138</i>
//       */
//      L_Ptra ptraaGetPtra(L_Ptraa paa, int index, int accessflag);
//      /**
//       * Original signature :
//       * <code>L_PTRA* ptraaFlattenToPtra(L_PTRAA*)</code><br>
//       * <i>native declaration : allheaders.h:4140</i>
//       */
//      L_Ptra ptraaFlattenToPtra(L_Ptraa paa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixQuadtreeMean(PIX*, l_int32, PIX*, FPIXA**)</code><br>
//       * <i>native declaration : allheaders.h:4142</i>
//       */
//      int pixQuadtreeMean(Pix pixs, int nlevels, Pix pix_ma, PointerByReference pfpixa);
//      /**
//       * Original signature :
//       * <code>l_int32 pixQuadtreeVariance(PIX*, l_int32, PIX*, DPIX*, FPIXA**, FPIXA**)</code><br>
//       * <i>native declaration : allheaders.h:4144</i>
//       */
//      int pixQuadtreeVariance(Pix pixs, int nlevels, Pix pix_ma, DPix dpix_msa, PointerByReference pfpixa_v, PointerByReference pfpixa_rv);
//      /**
//       * Original signature :
//       * <code>l_int32 pixMeanInRectangle(PIX*, BOX*, PIX*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4146</i>
//       */
//      int pixMeanInRectangle(Pix pixs, Box box, Pix pixma, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 pixVarianceInRectangle(PIX*, BOX*, PIX*, DPIX*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4148</i>
//       */
//      int pixVarianceInRectangle(Pix pixs, Box box, Pix pix_ma, DPix dpix_msa, FloatBuffer pvar, FloatBuffer prvar);
//      /**
//       * Original signature :
//       * <code>BOXAA* boxaaQuadtreeRegions(l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4150</i>
//       */
//      Boxaa boxaaQuadtreeRegions(int w, int h, int nlevels);
//      /**
//       * Original signature :
//       * <code>l_int32 quadtreeGetParent(FPIXA*, l_int32, l_int32, l_int32, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4152</i>
//       */
//      int quadtreeGetParent(FPixa fpixa, int level, int x, int y, FloatBuffer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 quadtreeGetChildren(FPIXA*, l_int32, l_int32, l_int32, l_float32*, l_float32*, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4154</i>
//       */
//      int quadtreeGetChildren(FPixa fpixa, int level, int x, int y, FloatBuffer pval00, FloatBuffer pval10, FloatBuffer pval01, FloatBuffer pval11);
//      /**
//       * Original signature :
//       * <code>l_int32 quadtreeMaxLevels(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4156</i>
//       */
//      int quadtreeMaxLevels(int w, int h);
//      /**
//       * Original signature :
//       * <code>PIX* fpixaDisplayQuadtree(FPIXA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4158</i>
//       */
//      Pix fpixaDisplayQuadtree(FPixa fpixa, int factor, int fontsize);
//  
//      /**
//       * Original signature : <code>L_QUEUE* lqueueCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4160</i>
//       */
//      L_Queue lqueueCreate(int nalloc);
//      /**
//       * Original signature :
//       * <code>void lqueueDestroy(L_QUEUE**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4162</i>
//       */
//      void lqueueDestroy(PointerByReference plq, int freeflag);
//  
//      /**
//       * Original signature : <code>l_int32 lqueueAdd(L_QUEUE*, void*)</code><br>
//       * <i>native declaration : allheaders.h:4164</i>
//       */
//      int lqueueAdd(L_Queue lq, Pointer item);
//  
//      /**
//       * Original signature : <code>void* lqueueRemove(L_QUEUE*)</code><br>
//       * <i>native declaration : allheaders.h:4166</i>
//       */
//      Pointer lqueueRemove(L_Queue lq);
//  
//      /**
//       * Original signature : <code>l_int32 lqueueGetCount(L_QUEUE*)</code><br>
//       * <i>native declaration : allheaders.h:4168</i>
//       */
//      int lqueueGetCount(L_Queue lq);
//      /**
//       * Original signature :
//       * <code>l_int32 lqueuePrint(FILE*, L_QUEUE*)</code><br>
//       * <i>native declaration : allheaders.h:4170</i>
//       */
//      int lqueuePrint(FILE fp, L_Queue lq);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilter(PIX*, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4172</i>
//       */
//      Pix pixRankFilter(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterRGB(PIX*, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4174</i>
//       */
//      Pix pixRankFilterRGB(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterGray(PIX*, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4176</i>
//       */
//      Pix pixRankFilterGray(Pix pixs, int wf, int hf, float rank);
//      /**
//       * Original signature :
//       * <code>PIX* pixMedianFilter(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4178</i>
//       */
//      Pix pixMedianFilter(Pix pixs, int wf, int hf);
//      /**
//       * Original signature :
//       * <code>PIX* pixRankFilterWithScaling(PIX*, l_int32, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4180</i>
//       */
//      Pix pixRankFilterWithScaling(Pix pixs, int wf, int hf, float rank, float scalefactor);
//  
//      /**
//       * Original signature : <code>L_RBTREE* l_rbtreeCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4182</i>
//       */
//      L_Rbtree l_rbtreeCreate(int keytype);
//      /**
//       * Original signature :
//       * <code>RB_TYPE* l_rbtreeLookup(L_RBTREE*, RB_TYPE)</code><br>
//       * <i>native declaration : allheaders.h:4184</i>
//       */
//      Rb_Type l_rbtreeLookup(L_Rbtree t, Rb_Type.ByValue key);
//      /**
//       * Original signature :
//       * <code>void l_rbtreeInsert(L_RBTREE*, RB_TYPE, RB_TYPE)</code><br>
//       * <i>native declaration : allheaders.h:4186</i>
//       */
//      void l_rbtreeInsert(L_Rbtree t, Rb_Type.ByValue key, Rb_Type.ByValue value);
//      /**
//       * Original signature :
//       * <code>void l_rbtreeDelete(L_RBTREE*, RB_TYPE)</code><br>
//       * <i>native declaration : allheaders.h:4188</i>
//       */
//      void l_rbtreeDelete(L_Rbtree t, Rb_Type.ByValue key);
//  
//      /**
//       * Original signature : <code>void l_rbtreeDestroy(L_RBTREE**)</code><br>
//       * <i>native declaration : allheaders.h:4190</i>
//       */
//      void l_rbtreeDestroy(PointerByReference pt);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetFirst(L_RBTREE*)</code><br>
//       * <i>native declaration : allheaders.h:4192</i>
//       */
//      L_Rbtree_Node l_rbtreeGetFirst(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetNext(L_RBTREE_NODE*)</code><br>
//       * <i>native declaration : allheaders.h:4194</i>
//       */
//      L_Rbtree_Node l_rbtreeGetNext(L_Rbtree_Node n);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetLast(L_RBTREE*)</code><br>
//       * <i>native declaration : allheaders.h:4196</i>
//       */
//      L_Rbtree_Node l_rbtreeGetLast(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>L_RBTREE_NODE* l_rbtreeGetPrev(L_RBTREE_NODE*)</code><br>
//       * <i>native declaration : allheaders.h:4198</i>
//       */
//      L_Rbtree_Node l_rbtreeGetPrev(L_Rbtree_Node n);
//  
//      /**
//       * Original signature : <code>l_int32 l_rbtreeGetCount(L_RBTREE*)</code><br>
//       * <i>native declaration : allheaders.h:4200</i>
//       */
//      int l_rbtreeGetCount(L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>void l_rbtreePrint(FILE*, L_RBTREE*)</code><br>
//       * <i>native declaration : allheaders.h:4202</i>
//       */
//      void l_rbtreePrint(FILE fp, L_Rbtree t);
//      /**
//       * Original signature :
//       * <code>SARRAY* pixProcessBarcodes(PIX*, l_int32, l_int32, SARRAY**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4204</i>
//       */
//      Sarray pixProcessBarcodes(Pix pixs, int format, int method, PointerByReference psaw, int debugflag);
//      /**
//       * Original signature :
//       * <code>PIXA* pixExtractBarcodes(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4206</i>
//       */
//      Pixa pixExtractBarcodes(Pix pixs, int debugflag);
//      /**
//       * Original signature :
//       * <code>SARRAY* pixReadBarcodes(PIXA*, l_int32, l_int32, SARRAY**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4208</i>
//       */
//      Sarray pixReadBarcodes(Pixa pixa, int format, int method, PointerByReference psaw, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixReadBarcodeWidths(PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4210</i>
//       */
//      Numa pixReadBarcodeWidths(Pix pixs, int method, int debugflag);
//      /**
//       * Original signature :
//       * <code>BOXA* pixLocateBarcodes(PIX*, l_int32, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4212</i>
//       */
//      Boxa pixLocateBarcodes(Pix pixs, int thresh, PointerByReference ppixb, PointerByReference ppixm);
//      /**
//       * Original signature :
//       * <code>PIX* pixDeskewBarcode(PIX*, PIX*, BOX*, l_int32, l_int32, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4214</i>
//       */
//      Pix pixDeskewBarcode(Pix pixs, Pix pixb, Box box, int margin, int threshold, FloatBuffer pangle, FloatBuffer pconf);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths1(PIX*, l_float32, l_float32, NUMA**, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4216</i>
//       */
//      Numa pixExtractBarcodeWidths1(Pix pixs, float thresh, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4218</i>
//       */
//      Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatBuffer pwidth, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeWidths2(PIX*, l_float32, l_float32*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4218</i>
//       */
//      Numa pixExtractBarcodeWidths2(Pix pixs, float thresh, FloatByReference pwidth, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* pixExtractBarcodeCrossings(PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4220</i>
//       */
//      Numa pixExtractBarcodeCrossings(Pix pixs, float thresh, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWidth(NUMA*, l_float32, NUMA**, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4222</i>
//       */
//      Numa numaQuantizeCrossingsByWidth(Numa nas, float binfract, PointerByReference pnaehist, PointerByReference pnaohist, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4224</i>
//       */
//      Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatBuffer pwidth, FloatBuffer pfirstloc, PointerByReference pnac, int debugflag);
//      /**
//       * Original signature :
//       * <code>NUMA* numaQuantizeCrossingsByWindow(NUMA*, l_float32, l_float32*, l_float32*, NUMA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4224</i>
//       */
//      Numa numaQuantizeCrossingsByWindow(Numa nas, float ratio, FloatByReference pwidth, FloatByReference pfirstloc, PointerByReference pnac, int debugflag);
    /**
     * Original signature :
     * <code>PIXA* pixaReadFiles(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:4226</i>
     */
    Pixa pixaReadFiles(String dirname, String substr);

    /**
     * Original signature : <code>PIXA* pixaReadFilesSA(SARRAY*)</code><br>
     * <i>native declaration : allheaders.h:4228</i>
     */
    Pixa pixaReadFilesSA(Sarray sa);

    /**
     * Original signature : <code>PIX* pixRead(const char*)</code><br>
     * <i>native declaration : allheaders.h:4230</i>
     */
    Pix pixRead(String filename);

    /**
     * Original signature :
     * <code>PIX* pixReadWithHint(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4232</i>
     */
    Pix pixReadWithHint(String filename, int hint);

    /**
     * Original signature :
     * <code>PIX* pixReadIndexed(SARRAY*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4234</i>
     */
    Pix pixReadIndexed(Sarray sa, int index);

    /**
     * Original signature : <code>PIX* pixReadStream(FILE*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4236</i>
     */
    Pix pixReadStream(FILE fp, int hint);

    /**
     * Original signature :
     * <code>l_int32 pixReadHeader(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4238</i>
     */
    int pixReadHeader(String filename, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 findFileFormat(const char*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4240</i>
     */
    int findFileFormat(String filename, IntBuffer pformat);

//      /**
//       * Original signature :
//       * <code>l_int32 findFileFormatStream(FILE*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4242</i>
//       */
//      int findFileFormatStream(FILE fp, IntBuffer pformat);
    /**
     * Original signature :
     * <code>l_int32 findFileFormatBuffer(const l_uint8*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4244</i>
     */
    int findFileFormatBuffer(ByteBuffer buf, IntBuffer pformat);

    /**
     * Original signature : <code>l_int32 fileFormatIsTiff(FILE*)</code><br>
     * <i>native declaration : allheaders.h:4246</i>
     */
    int fileFormatIsTiff(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:4248</i>
     */
    Pix pixReadMem(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 pixReadHeaderMem(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4250</i>
     */
    int pixReadHeaderMem(ByteBuffer data, NativeSize size, IntBuffer pformat, IntBuffer pw, IntBuffer ph, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);

    /**
     * Original signature :
     * <code>l_int32 writeImageFileInfo(const char*, FILE*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4252</i>
     */
    int writeImageFileInfo(String filename, FILE fpout, int headeronly);

    /**
     * Original signature : <code>l_int32 ioFormatTest(const char*)</code><br>
     * <i>native declaration : allheaders.h:4254</i>
     */
    int ioFormatTest(String filename);

//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromRecog(L_RECOG*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4256</i>
//       */
//      L_Recog recogCreateFromRecog(L_Recog recs, int scalew, int scaleh, int linew, int threshold, int maxyshift);
//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromPixa(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4258</i>
//       */
//      L_Recog recogCreateFromPixa(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);
//      /**
//       * Original signature :
//       * <code>L_RECOG* recogCreateFromPixaNoFinish(PIXA*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4260</i>
//       */
//      L_Recog recogCreateFromPixaNoFinish(Pixa pixa, int scalew, int scaleh, int linew, int threshold, int maxyshift);
    /**
     * Original signature :
     * <code>L_RECOG* recogCreate(l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4262</i>
     */
    L_Recog recogCreate(int scalew, int scaleh, int linew, int threshold, int maxyshift);
//  
//      /**
//       * Original signature : <code>void recogDestroy(L_RECOG**)</code><br>
//       * <i>native declaration : allheaders.h:4264</i>
//       */
//      void recogDestroy(PointerByReference precog);
//  
//      /**
//       * Original signature : <code>l_int32 recogGetCount(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4266</i>
//       */
//      int recogGetCount(L_Recog recog);

    /**
     * Original signature :
     * <code>l_int32 recogSetParams(L_RECOG*, l_int32, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4268</i>
     */
    int recogSetParams(L_Recog recog, int type, int min_nopad, float max_wh_ratio, float max_ht_ratio);

//      /**
//       * Original signature :
//       * <code>l_int32 recogGetClassIndex(L_RECOG*, l_int32, char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4270</i>
//       */
//      int recogGetClassIndex(L_Recog recog, int val, ByteBuffer text, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 recogStringToIndex(L_RECOG*, char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4272</i>
//       */
//      int recogStringToIndex(L_Recog recog, ByteBuffer text, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>l_int32 recogGetClassString(L_RECOG*, l_int32, char**)</code><br>
//       * <i>native declaration : allheaders.h:4274</i>
//       */
//      int recogGetClassString(L_Recog recog, int index, PointerByReference pcharstr);
//      /**
//       * Original signature :
//       * <code>l_int32 l_convertCharstrToInt(const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4276</i>
//       */
//      int l_convertCharstrToInt(String str, IntBuffer pval);
//  
//      /**
//       * Original signature : <code>L_RECOG* recogRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4278</i>
//       */
//      L_Recog recogRead(String filename);
//  
//      /**
//       * Original signature : <code>L_RECOG* recogReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:4280</i>
//       */
//      L_Recog recogReadStream(FILE fp);
    /**
     * Original signature :
     * <code>L_RECOG* recogReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:4282</i>
     */
    L_Recog recogReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 recogWrite(const char*, L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4284</i>
//       */
//      int recogWrite(String filename, L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_int32 recogWriteStream(FILE*, L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4286</i>
//       */
//      int recogWriteStream(FILE fp, L_Recog recog);
//    /**
//     * Original signature :
//     * <code>l_int32 recogWriteMem(l_uint8**, size_t*, L_RECOG*)</code><br>
//     * <i>native declaration : allheaders.h:4288</i>
//     */
//    int recogWriteMem(PointerByReference pdata, NativeSizeByReference psize, L_Recog recog);
//
//    /**
//     * Original signature : <code>PIXA* recogExtractPixa(L_RECOG*)</code><br>
//     * <i>native declaration : allheaders.h:4290</i>
//     */
//    Pixa recogExtractPixa(L_Recog recog);
//
//    /**
//     * Original signature :
//     * <code>BOXA* recogDecode(L_RECOG*, PIX*, l_int32, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4292</i>
//     */
//    Boxa recogDecode(L_Recog recog, Pix pixs, int nlevels, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_int32 recogCreateDid(L_RECOG*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4294</i>
//       */
//      int recogCreateDid(L_Recog recog, Pix pixs);
//  
//      /**
//       * Original signature : <code>l_int32 recogDestroyDid(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4296</i>
//       */
//      int recogDestroyDid(L_Recog recog);
//  
//      /**
//       * Original signature : <code>l_int32 recogDidExists(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4298</i>
//       */
//      int recogDidExists(L_Recog recog);
//  
//      /**
//       * Original signature : <code>L_RDID* recogGetDid(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4300</i>
//       */
//      L_Rdid recogGetDid(L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_int32 recogSetChannelParams(L_RECOG*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4302</i>
//       */
//      int recogSetChannelParams(L_Recog recog, int nlevels);
//    /**
//     * Original signature :
//     * <code>l_int32 recogIdentifyMultiple(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, PIX**, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4304</i>
//     */
//    int recogIdentifyMultiple(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, PointerByReference ppixdb, int debugsplit);
//      /**
//       * Original signature :
//       * <code>l_int32 recogSplitIntoCharacters(L_RECOG*, PIX*, l_int32, l_int32, BOXA**, PIXA**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4306</i>
//       */
//      int recogSplitIntoCharacters(L_Recog recog, Pix pixs, int minh, int skipsplit, PointerByReference pboxa, PointerByReference ppixa, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 recogCorrelationBestRow(L_RECOG*, PIX*, BOXA**, NUMA**, NUMA**, SARRAY**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4308</i>
//       */
//      int recogCorrelationBestRow(L_Recog recog, Pix pixs, PointerByReference pboxa, PointerByReference pnascore, PointerByReference pnaindex, PointerByReference psachar, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4310</i>
//       */
//      int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatBuffer pscore, IntBuffer pindex, PointerByReference pcharstr, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_int32 recogCorrelationBestChar(L_RECOG*, PIX*, BOX**, l_float32*, l_int32*, char**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4310</i>
//       */
//      int recogCorrelationBestChar(L_Recog recog, Pix pixs, PointerByReference pbox, FloatByReference pscore, IntByReference pindex, PointerByReference pcharstr, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_int32 recogIdentifyPixa(L_RECOG*, PIXA*, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4312</i>
//       */
//      int recogIdentifyPixa(L_Recog recog, Pixa pixa, PointerByReference ppixdb);
//      /**
//       * Original signature :
//       * <code>l_int32 recogIdentifyPix(L_RECOG*, PIX*, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4314</i>
//       */
//      int recogIdentifyPix(L_Recog recog, Pix pixs, PointerByReference ppixdb);
//  
//      /**
//       * Original signature : <code>l_int32 recogSkipIdentify(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4316</i>
//       */
//      int recogSkipIdentify(L_Recog recog);
//  
//      /**
//       * Original signature : <code>void rchaDestroy(L_RCHA**)</code><br>
//       * <i>native declaration : allheaders.h:4318</i>
//       */
//      void rchaDestroy(PointerByReference prcha);
//  
//      /**
//       * Original signature : <code>void rchDestroy(L_RCH**)</code><br>
//       * <i>native declaration : allheaders.h:4320</i>
//       */
//      void rchDestroy(PointerByReference prch);
//      /**
//       * Original signature :
//       * <code>l_int32 rchaExtract(L_RCHA*, NUMA**, NUMA**, SARRAY**, NUMA**, NUMA**, NUMA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4322</i>
//       */
//      int rchaExtract(L_Rcha rcha, PointerByReference pnaindex, PointerByReference pnascore, PointerByReference psatext, PointerByReference pnasample, PointerByReference pnaxloc, PointerByReference pnayloc, PointerByReference pnawidth);
//      /**
//       * Original signature :
//       * <code>l_int32 rchExtract(L_RCH*, l_int32*, l_float32*, char**, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4324</i>
//       */
//      int rchExtract(L_Rch rch, IntBuffer pindex, FloatBuffer pscore, PointerByReference ptext, IntBuffer psample, IntBuffer pxloc, IntBuffer pyloc, IntBuffer pwidth);
//      /**
//       * Original signature :
//       * <code>PIX* recogProcessToIdentify(L_RECOG*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4326</i>
//       */
//      Pix recogProcessToIdentify(L_Recog recog, Pix pixs, int pad);
//    /**
//     * Original signature :
//     * <code>SARRAY* recogExtractNumbers(L_RECOG*, BOXA*, l_float32, l_int32, BOXAA**, NUMAA**)</code><br>
//     * <i>native declaration : allheaders.h:4328</i>
//     */
//    Sarray recogExtractNumbers(L_Recog recog, Boxa boxas, float scorethresh, int spacethresh, PointerByReference pbaa, PointerByReference pnaa);
//
//    /**
//     * Original signature :
//     * <code>PIXA* showExtractNumbers(PIX*, SARRAY*, BOXAA*, NUMAA*, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4330</i>
//     */
//    Pixa showExtractNumbers(Pix pixs, Sarray sa, Boxaa baa, Numaa naa, PointerByReference ppixdb);
//    /**
//     * Original signature :
//     * <code>l_int32 recogTrainLabeled(L_RECOG*, PIX*, BOX*, char*, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4332</i>
//     */
//    int recogTrainLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, int debug);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4334</i>
//     */
//    int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, ByteBuffer text, PointerByReference ppix);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogProcessLabeled(L_RECOG*, PIX*, BOX*, char*, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4334</i>
//     */
//    int recogProcessLabeled(L_Recog recog, Pix pixs, Box box, Pointer text, PointerByReference ppix);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogAddSample(L_RECOG*, PIX*, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4336</i>
//     */
//    int recogAddSample(L_Recog recog, Pix pix, int debug);
//
//    /**
//     * Original signature :
//     * <code>PIX* recogModifyTemplate(L_RECOG*, PIX*)</code><br>
//     * <i>native declaration : allheaders.h:4338</i>
//     */
//    Pix recogModifyTemplate(L_Recog recog, Pix pixs);
//      /**
//       * Original signature :
//       * <code>l_int32 recogAverageSamples(L_RECOG**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4340</i>
//       */
//      int recogAverageSamples(PointerByReference precog, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4342</i>
//       */
//      int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatBuffer px, FloatBuffer py);
//      /**
//       * Original signature :
//       * <code>l_int32 pixaAccumulateSamples(PIXA*, PTA*, PIX**, l_float32*, l_float32*)</code><br>
//       * <i>native declaration : allheaders.h:4342</i>
//       */
//      int pixaAccumulateSamples(Pixa pixa, Pta pta, PointerByReference ppixd, FloatByReference px, FloatByReference py);
//      /**
//       * Original signature :
//       * <code>l_int32 recogTrainingFinished(L_RECOG**, l_int32, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4344</i>
//       */
//      int recogTrainingFinished(PointerByReference precog, int modifyflag, int minsize, float minfract);
//    /**
//     * Original signature :
//     * <code>PIXA* recogFilterPixaBySize(PIXA*, l_int32, l_int32, l_float32, NUMA**)</code><br>
//     * <i>native declaration : allheaders.h:4346</i>
//     */
//    Pixa recogFilterPixaBySize(Pixa pixas, int setsize, int maxkeep, float max_ht_ratio, PointerByReference pna);
//    /**
//     * Original signature :
//     * <code>PIXAA* recogSortPixaByClass(PIXA*, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4348</i>
//     */
//    Pixaa recogSortPixaByClass(Pixa pixa, int setsize);
//      /**
//       * Original signature :
//       * <code>l_int32 recogRemoveOutliers1(L_RECOG**, l_float32, l_int32, l_int32, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4350</i>
//       */
//      int recogRemoveOutliers1(PointerByReference precog, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//    /**
//     * Original signature :
//     * <code>PIXA* pixaRemoveOutliers1(PIXA*, l_float32, l_int32, l_int32, PIX**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4352</i>
//     */
//    Pixa pixaRemoveOutliers1(Pixa pixas, float minscore, int mintarget, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogRemoveOutliers2(L_RECOG**, l_float32, l_int32, PIX**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4354</i>
//     */
//    int recogRemoveOutliers2(PointerByReference precog, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>PIXA* pixaRemoveOutliers2(PIXA*, l_float32, l_int32, PIX**, PIX**)</code><br>
//     * <i>native declaration : allheaders.h:4356</i>
//     */
//    Pixa pixaRemoveOutliers2(Pixa pixas, float minscore, int minsize, PointerByReference ppixsave, PointerByReference ppixrem);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogTrainFromBoot(L_RECOG*, PIXA*, l_float32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4358</i>
//     */
//    Pixa recogTrainFromBoot(L_Recog recogboot, Pixa pixas, float minscore, int threshold, int debug);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogPadDigitTrainingSet(L_RECOG**, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4360</i>
//     */
//    int recogPadDigitTrainingSet(PointerByReference precog, int scaleh, int linew);
//
//    /**
//     * Original signature :
//     * <code>l_int32 recogIsPaddingNeeded(L_RECOG*, SARRAY**)</code><br>
//     * <i>native declaration : allheaders.h:4362</i>
//     */
//    int recogIsPaddingNeeded(L_Recog recog, PointerByReference psa);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogAddDigitPadTemplates(L_RECOG*, SARRAY*)</code><br>
//     * <i>native declaration : allheaders.h:4364</i>
//     */
//    Pixa recogAddDigitPadTemplates(L_Recog recog, Sarray sa);
//
//    /**
//     * Original signature :
//     * <code>L_RECOG* recogMakeBootDigitRecog(l_int32, l_int32, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4366</i>
//     */
//    L_Recog recogMakeBootDigitRecog(int scaleh, int linew, int maxyshift, int debug);
//
//    /**
//     * Original signature :
//     * <code>PIXA* recogMakeBootDigitTemplates(l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4368</i>
//     */
//    Pixa recogMakeBootDigitTemplates(int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 recogShowContent(FILE*, L_RECOG*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4370</i>
//       */
//      int recogShowContent(FILE fp, L_Recog recog, int index, int display);
//      /**
//       * Original signature :
//       * <code>l_int32 recogDebugAverages(L_RECOG**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4372</i>
//       */
//      int recogDebugAverages(PointerByReference precog, int debug);
//      /**
//       * Original signature :
//       * <code>l_int32 recogShowAverageTemplates(L_RECOG*)</code><br>
//       * <i>native declaration : allheaders.h:4374</i>
//       */
//      int recogShowAverageTemplates(L_Recog recog);
//      /**
//       * Original signature :
//       * <code>l_int32 recogShowMatchesInRange(L_RECOG*, PIXA*, l_float32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4376</i>
//       */
//      int recogShowMatchesInRange(L_Recog recog, Pixa pixa, float minscore, float maxscore, int display);
//      /**
//       * Original signature :
//       * <code>PIX* recogShowMatch(L_RECOG*, PIX*, PIX*, BOX*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4378</i>
//       */
//      Pix recogShowMatch(L_Recog recog, Pix pix1, Pix pix2, Box box, int index, float score);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestSetup(l_int32, char**, L_REGPARAMS**)</code><br>
//       * <i>native declaration : allheaders.h:4380</i>
//       */
//      int regTestSetup(int argc, PointerByReference argv, PointerByReference prp);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCleanup(L_REGPARAMS*)</code><br>
//       * <i>native declaration : allheaders.h:4382</i>
//       */
//      int regTestCleanup(L_RegParams rp);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCompareValues(L_REGPARAMS*, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4384</i>
//       */
//      int regTestCompareValues(L_RegParams rp, float val1, float val2, float delta);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCompareStrings(L_REGPARAMS*, l_uint8*, size_t, l_uint8*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:4386</i>
//       */
//      int regTestCompareStrings(L_RegParams rp, ByteBuffer string1, NativeSize bytes1, ByteBuffer string2, NativeSize bytes2);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestComparePix(L_REGPARAMS*, PIX*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4388</i>
//       */
//      int regTestComparePix(L_RegParams rp, Pix pix1, Pix pix2);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCompareSimilarPix(L_REGPARAMS*, PIX*, PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4390</i>
//       */
//      int regTestCompareSimilarPix(L_RegParams rp, Pix pix1, Pix pix2, int mindiff, float maxfract, int printstats);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCheckFile(L_REGPARAMS*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4392</i>
//       */
//      int regTestCheckFile(L_RegParams rp, String localname);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestCompareFiles(L_REGPARAMS*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4394</i>
//       */
//      int regTestCompareFiles(L_RegParams rp, int index1, int index2);
//      /**
//       * Original signature :
//       * <code>l_int32 regTestWritePixAndCheck(L_REGPARAMS*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4396</i>
//       */
//      int regTestWritePixAndCheck(L_RegParams rp, Pix pix, int format);
//    /**
//     * Original signature :
//     * <code>char* regTestGenLocalFilename(L_REGPARAMS*, l_int32, l_int32)</code><br>
//     * <i>native declaration : allheaders.h:4398</i>
//     */
//    Pointer regTestGenLocalFilename(L_RegParams rp, int index, int format);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRasterop(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4400</i>
//       */
//      int pixRasterop(Pix pixd, int dx, int dy, int dw, int dh, int op, Pix pixs, int sx, int sy);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRasteropVip(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4402</i>
//       */
//      int pixRasteropVip(Pix pixd, int bx, int bw, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRasteropHip(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4404</i>
//       */
//      int pixRasteropHip(Pix pixd, int by, int bh, int hshift, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixTranslate(PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4406</i>
//       */
//      Pix pixTranslate(Pix pixd, Pix pixs, int hshift, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRasteropIP(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4408</i>
//       */
//      int pixRasteropIP(Pix pixd, int hshift, int vshift, int incolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixRasteropFullImage(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4410</i>
//       */
//      int pixRasteropFullImage(Pix pixd, Pix pixs, int op);
//      /**
//       * Original signature :
//       * <code>void rasteropVipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4412</i>
//       */
//      void rasteropVipLow(IntBuffer data, int pixw, int pixh, int depth, int wpl, int x, int w, int shift);
//      /**
//       * Original signature :
//       * <code>void rasteropHipLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4414</i>
//       */
//      void rasteropHipLow(IntBuffer data, int pixh, int depth, int wpl, int y, int h, int shift);
//      /**
//       * Original signature :
//       * <code>void shiftDataHorizontalLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4416</i>
//       */
//      void shiftDataHorizontalLow(IntBuffer datad, int wpld, IntBuffer datas, int wpls, int shift);
//      /**
//       * Original signature :
//       * <code>void rasteropUniLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4418</i>
//       */
//      void rasteropUniLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op);
//      /**
//       * Original signature :
//       * <code>void rasteropLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4420</i>
//       */
//      void rasteropLow(IntBuffer datad, int dpixw, int dpixh, int depth, int dwpl, int dx, int dy, int dw, int dh, int op, IntBuffer datas, int spixw, int spixh, int swpl, int sx, int sy);
    /**
     * Original signature :
     * <code>PIX* pixRotate(PIX*, l_float32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4422</i>
     */
    Pix pixRotate(Pix pixs, float angle, int type, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixEmbedForRotation(PIX*, l_float32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4424</i>
     */
    Pix pixEmbedForRotation(Pix pixs, float angle, int incolor, int width, int height);

    /**
     * Original signature :
     * <code>PIX* pixRotateBySampling(PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4426</i>
     */
    Pix pixRotateBySampling(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateBinaryNice(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4428</i>
     */
    Pix pixRotateBinaryNice(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateWithAlpha(PIX*, l_float32, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4430</i>
     */
    Pix pixRotateWithAlpha(Pix pixs, float angle, Pix pixg, float fract);

    /**
     * Original signature :
     * <code>PIX* pixRotateAM(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4432</i>
     */
    Pix pixRotateAM(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColor(PIX*, l_float32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:4434</i>
     */
    Pix pixRotateAMColor(Pix pixs, float angle, int colorval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGray(PIX*, l_float32, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:4436</i>
     */
    Pix pixRotateAMGray(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMCorner(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4438</i>
     */
    Pix pixRotateAMCorner(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorCorner(PIX*, l_float32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:4440</i>
     */
    Pix pixRotateAMColorCorner(Pix pixs, float angle, int fillval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMGrayCorner(PIX*, l_float32, l_uint8)</code><br>
     * <i>native declaration : allheaders.h:4442</i>
     */
    Pix pixRotateAMGrayCorner(Pix pixs, float angle, byte grayval);

    /**
     * Original signature :
     * <code>PIX* pixRotateAMColorFast(PIX*, l_float32, l_uint32)</code><br>
     * <i>native declaration : allheaders.h:4444</i>
     */
    Pix pixRotateAMColorFast(Pix pixs, float angle, int colorval);

//      /**
//       * Original signature :
//       * <code>void rotateAMColorLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:4446</i>
//       */
//      void rotateAMColorLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval);
//      /**
//       * Original signature :
//       * <code>void rotateAMGrayLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:4448</i>
//       */
//      void rotateAMGrayLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, byte grayval);
//      /**
//       * Original signature :
//       * <code>void rotateAMColorCornerLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:4450</i>
//       */
//      void rotateAMColorCornerLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval);
//      /**
//       * Original signature :
//       * <code>void rotateAMGrayCornerLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_uint8)</code><br>
//       * <i>native declaration : allheaders.h:4452</i>
//       */
//      void rotateAMGrayCornerLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, byte grayval);
//      /**
//       * Original signature :
//       * <code>void rotateAMColorFastLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:4454</i>
//       */
//      void rotateAMColorFastLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datas, int wpls, float angle, int colorval);
    /**
     * Original signature : <code>PIX* pixRotateOrth(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4456</i>
     */
    Pix pixRotateOrth(Pix pixs, int quads);

    /**
     * Original signature : <code>PIX* pixRotate180(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:4458</i>
     */
    Pix pixRotate180(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixRotate90(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4460</i>
     */
    Pix pixRotate90(Pix pixs, int direction);

    /**
     * Original signature : <code>PIX* pixFlipLR(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:4462</i>
     */
    Pix pixFlipLR(Pix pixd, Pix pixs);

    /**
     * Original signature : <code>PIX* pixFlipTB(PIX*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:4464</i>
     */
    Pix pixFlipTB(Pix pixd, Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixRotateShear(PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4466</i>
     */
    Pix pixRotateShear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate2Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4468</i>
     */
    Pix pixRotate2Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotate3Shear(PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4470</i>
     */
    Pix pixRotate3Shear(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_int32 pixRotateShearIP(PIX*, l_int32, l_int32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4472</i>
     */
    int pixRotateShearIP(Pix pixs, int xcen, int ycen, float angle, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixRotateShearCenter(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4474</i>
     */
    Pix pixRotateShearCenter(Pix pixs, float angle, int incolor);

    /**
     * Original signature :
     * <code>l_int32 pixRotateShearCenterIP(PIX*, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4476</i>
     */
    int pixRotateShearCenterIP(Pix pixs, float angle, int incolor);

//      /**
//       * Original signature :
//       * <code>PIX* pixStrokeWidthTransform(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4478</i>
//       */
//      Pix pixStrokeWidthTransform(Pix pixs, int color, int depth, int nangles);
//      /**
//       * Original signature :
//       * <code>PIX* pixRunlengthTransform(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4480</i>
//       */
//      Pix pixRunlengthTransform(Pix pixs, int color, int direction, int depth);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindHorizontalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4482</i>
//       */
//      int pixFindHorizontalRuns(Pix pix, int y, IntBuffer xstart, IntBuffer xend, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindVerticalRuns(PIX*, l_int32, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4484</i>
//       */
//      int pixFindVerticalRuns(Pix pix, int x, IntBuffer ystart, IntBuffer yend, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>NUMA* pixFindMaxRuns(PIX*, l_int32, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4486</i>
//       */
//      Numa pixFindMaxRuns(Pix pix, int direction, PointerByReference pnastart);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindMaxHorizontalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4488</i>
//       */
//      int pixFindMaxHorizontalRunOnLine(Pix pix, int y, IntBuffer pxstart, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_int32 pixFindMaxVerticalRunOnLine(PIX*, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4490</i>
//       */
//      int pixFindMaxVerticalRunOnLine(Pix pix, int x, IntBuffer pystart, IntBuffer psize);
//      /**
//       * Original signature :
//       * <code>l_int32 runlengthMembershipOnLine(l_int32*, l_int32, l_int32, l_int32*, l_int32*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4492</i>
//       */
//      int runlengthMembershipOnLine(IntBuffer buffer, int size, int depth, IntBuffer start, IntBuffer end, int n);
//  
//      /**
//       * Original signature : <code>l_int32* makeMSBitLocTab(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4494</i>
//       */
//      IntByReference makeMSBitLocTab(int bitval);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4496</i>
//       */
//      Sarray sarrayCreate(int n);
    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateInitialized(l_int32, char*)</code><br>
     * <i>native declaration : allheaders.h:4498</i>
     */
    Sarray sarrayCreateInitialized(int n, ByteBuffer initstr);

//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayCreateWordsFromString(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4500</i>
//       */
//      Sarray sarrayCreateWordsFromString(String string);
    /**
     * Original signature :
     * <code>SARRAY* sarrayCreateLinesFromString(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4502</i>
     */
    Sarray sarrayCreateLinesFromString(String string, int blankflag);
//  
//      /**
//       * Original signature : <code>void sarrayDestroy(SARRAY**)</code><br>
//       * <i>native declaration : allheaders.h:4504</i>
//       */
//      void sarrayDestroy(PointerByReference psa);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayCopy(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4506</i>
//       */
//      Sarray sarrayCopy(Sarray sa);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayClone(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4508</i>
//       */
//      Sarray sarrayClone(Sarray sa);

    /**
     * Original signature :
     * <code>l_int32 sarrayAddString(SARRAY*, char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4510</i>
     */
    int sarrayAddString(Sarray sa, ByteBuffer string, int copyflag);

//      /**
//       * Original signature :
//       * <code>char* sarrayRemoveString(SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4512</i>
//       */
//      Pointer sarrayRemoveString(Sarray sa, int index);
    /**
     * Original signature :
     * <code>l_int32 sarrayReplaceString(SARRAY*, l_int32, char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4514</i>
     */
    int sarrayReplaceString(Sarray sa, int index, ByteBuffer newstr, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 sarrayClear(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4516</i>
//       */
//      int sarrayClear(Sarray sa);
//  
//      /**
//       * Original signature : <code>l_int32 sarrayGetCount(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4518</i>
//       */
//      int sarrayGetCount(Sarray sa);

//      /**
//       * Original signature :
//       * <code>char** sarrayGetArray(SARRAY*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4520</i>
//       */
//      PointerByReference sarrayGetArray(Sarray sa, IntBuffer pnalloc, IntBuffer pn);
//      /**
//       * Original signature :
//       * <code>char* sarrayGetString(SARRAY*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4522</i>
//       */
//      Pointer sarrayGetString(Sarray sa, int index, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 sarrayGetRefcount(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4524</i>
//       */
//      int sarrayGetRefcount(Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayChangeRefcount(SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4526</i>
//       */
//      int sarrayChangeRefcount(Sarray sa, int delta);
//      /**
//       * Original signature :
//       * <code>char* sarrayToString(SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4528</i>
//       */
//      Pointer sarrayToString(Sarray sa, int addnlflag);
//      /**
//       * Original signature :
//       * <code>char* sarrayToStringRange(SARRAY*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4530</i>
//       */
//      Pointer sarrayToStringRange(Sarray sa, int first, int nstrings, int addnlflag);
    /**
     * Original signature :
     * <code>l_int32 sarrayJoin(SARRAY*, SARRAY*)</code><br>
     * <i>native declaration : allheaders.h:4532</i>
     */
    int sarrayJoin(Sarray sa1, Sarray sa2);

//      /**
//       * Original signature :
//       * <code>l_int32 sarrayAppendRange(SARRAY*, SARRAY*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4534</i>
//       */
//      int sarrayAppendRange(Sarray sa1, Sarray sa2, int start, int end);
    /**
     * Original signature :
     * <code>l_int32 sarrayPadToSameSize(SARRAY*, SARRAY*, char*)</code><br>
     * <i>native declaration : allheaders.h:4536</i>
     */
    int sarrayPadToSameSize(Sarray sa1, Sarray sa2, ByteBuffer padstring);

//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayConvertWordsToLines(SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4538</i>
//       */
//      Sarray sarrayConvertWordsToLines(Sarray sa, int linesize);
//      /**
//       * Original signature :
//       * <code>l_int32 sarraySplitString(SARRAY*, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4540</i>
//       */
//      int sarraySplitString(Sarray sa, String str, String separators);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySelectBySubstring(SARRAY*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4542</i>
//       */
//      Sarray sarraySelectBySubstring(Sarray sain, String substr);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySelectByRange(SARRAY*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4544</i>
//       */
//      Sarray sarraySelectByRange(Sarray sain, int first, int last);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayParseRange(SARRAY*, l_int32, l_int32*, l_int32*, l_int32*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4546</i>
//       */
//      int sarrayParseRange(Sarray sa, int start, IntBuffer pactualstart, IntBuffer pend, IntBuffer pnewstart, String substr, int loc);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4548</i>
//       */
//      Sarray sarrayRead(String filename);
//  
//      /**
//       * Original signature : <code>SARRAY* sarrayReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:4550</i>
//       */
//      Sarray sarrayReadStream(FILE fp);
    /**
     * Original signature :
     * <code>SARRAY* sarrayReadMem(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:4552</i>
     */
    Sarray sarrayReadMem(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 sarrayWrite(const char*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4554</i>
//       */
//      int sarrayWrite(String filename, Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayWriteStream(FILE*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4556</i>
//       */
//      int sarrayWriteStream(FILE fp, Sarray sa);
    /**
     * Original signature :
     * <code>l_int32 sarrayWriteMem(l_uint8**, size_t*, SARRAY*)</code><br>
     * <i>native declaration : allheaders.h:4558</i>
     */
    int sarrayWriteMem(PointerByReference pdata, NativeSizeByReference psize, Sarray sa);

//      /**
//       * Original signature :
//       * <code>l_int32 sarrayAppend(const char*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4560</i>
//       */
//      int sarrayAppend(String filename, Sarray sa);
//      /**
//       * Original signature :
//       * <code>SARRAY* getNumberedPathnamesInDirectory(const char*, const char*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4562</i>
//       */
//      Sarray getNumberedPathnamesInDirectory(String dirname, String substr, int numpre, int numpost, int maxnum);
//      /**
//       * Original signature :
//       * <code>SARRAY* getSortedPathnamesInDirectory(const char*, const char*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4564</i>
//       */
//      Sarray getSortedPathnamesInDirectory(String dirname, String substr, int first, int nfiles);
//      /**
//       * Original signature :
//       * <code>SARRAY* convertSortedToNumberedPathnames(SARRAY*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4566</i>
//       */
//      Sarray convertSortedToNumberedPathnames(Sarray sa, int numpre, int numpost, int maxnum);
//      /**
//       * Original signature :
//       * <code>SARRAY* getFilenamesInDirectory(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4568</i>
//       */
//      Sarray getFilenamesInDirectory(String dirname);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySort(SARRAY*, SARRAY*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4570</i>
//       */
//      Sarray sarraySort(Sarray saout, Sarray sain, int sortorder);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarraySortByIndex(SARRAY*, NUMA*)</code><br>
//       * <i>native declaration : allheaders.h:4572</i>
//       */
//      Sarray sarraySortByIndex(Sarray sain, Numa naindex);
//      /**
//       * Original signature :
//       * <code>l_int32 stringCompareLexical(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4574</i>
//       */
//      int stringCompareLexical(String str1, String str2);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayUnionByAset(SARRAY*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4576</i>
//       */
//      Sarray sarrayUnionByAset(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayRemoveDupsByAset(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4578</i>
//       */
//      Sarray sarrayRemoveDupsByAset(Sarray sas);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayIntersectionByAset(SARRAY*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4580</i>
//       */
//      Sarray sarrayIntersectionByAset(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>L_ASET* l_asetCreateFromSarray(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4582</i>
//       */
//      L_Rbtree l_asetCreateFromSarray(Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayRemoveDupsByHash(SARRAY*, SARRAY**, L_DNAHASH**)</code><br>
//       * <i>native declaration : allheaders.h:4584</i>
//       */
//      int sarrayRemoveDupsByHash(Sarray sas, PointerByReference psad, PointerByReference pdahash);
//      /**
//       * Original signature :
//       * <code>SARRAY* sarrayIntersectionByHash(SARRAY*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4586</i>
//       */
//      Sarray sarrayIntersectionByHash(Sarray sa1, Sarray sa2);
//      /**
//       * Original signature :
//       * <code>l_int32 sarrayFindStringByHash(SARRAY*, L_DNAHASH*, const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4588</i>
//       */
//      int sarrayFindStringByHash(Sarray sa, L_DnaHash dahash, String str, IntBuffer pindex);
//      /**
//       * Original signature :
//       * <code>L_DNAHASH* l_dnaHashCreateFromSarray(SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:4590</i>
//       */
//      L_DnaHash l_dnaHashCreateFromSarray(Sarray sa);
    /**
     * Original signature :
     * <code>SARRAY* sarrayGenerateIntegers(l_int32)</code><br>
     * <i>native declaration : allheaders.h:4592</i>
     */
    Sarray sarrayGenerateIntegers(int n);

    /**
     * Original signature :
     * <code>PIX* pixScale(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4594</i>
     */
    Pix pixScale(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSizeRel(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4596</i>
     */
    Pix pixScaleToSizeRel(Pix pixs, int delw, int delh);

    /**
     * Original signature :
     * <code>PIX* pixScaleToSize(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4598</i>
     */
    Pix pixScaleToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleGeneral(PIX*, l_float32, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4600</i>
     */
    Pix pixScaleGeneral(Pix pixs, float scalex, float scaley, float sharpfract, int sharpwidth);

    /**
     * Original signature :
     * <code>PIX* pixScaleLI(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4602</i>
     */
    Pix pixScaleLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleColorLI(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4604</i>
     */
    Pix pixScaleColorLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleColor2xLI(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4606</i>
     */
    Pix pixScaleColor2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleColor4xLI(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4608</i>
     */
    Pix pixScaleColor4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayLI(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4610</i>
     */
    Pix pixScaleGrayLI(Pix pixs, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLI(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4612</i>
     */
    Pix pixScaleGray2xLI(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLI(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4614</i>
     */
    Pix pixScaleGray4xLI(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySampling(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4616</i>
     */
    Pix pixScaleBySampling(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleBySamplingToSize(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4618</i>
     */
    Pix pixScaleBySamplingToSize(Pix pixs, int wd, int hd);

    /**
     * Original signature :
     * <code>PIX* pixScaleByIntSampling(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4620</i>
     */
    Pix pixScaleByIntSampling(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGrayFast(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4622</i>
     */
    Pix pixScaleRGBToGrayFast(Pix pixs, int factor, int color);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToBinaryFast(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4624</i>
     */
    Pix pixScaleRGBToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayToBinaryFast(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4626</i>
     */
    Pix pixScaleGrayToBinaryFast(Pix pixs, int factor, int thresh);

    /**
     * Original signature :
     * <code>PIX* pixScaleSmooth(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4628</i>
     */
    Pix pixScaleSmooth(Pix pix, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleRGBToGray2(PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4630</i>
     */
    Pix pixScaleRGBToGray2(Pix pixs, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>PIX* pixScaleAreaMap(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4632</i>
     */
    Pix pixScaleAreaMap(Pix pix, float scalex, float scaley);

    /**
     * Original signature : <code>PIX* pixScaleAreaMap2(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4634</i>
     */
    Pix pixScaleAreaMap2(Pix pix);

    /**
     * Original signature :
     * <code>PIX* pixScaleBinary(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4636</i>
     */
    Pix pixScaleBinary(Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGray(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4638</i>
     */
    Pix pixScaleToGray(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayFast(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4640</i>
     */
    Pix pixScaleToGrayFast(Pix pixs, float scalefactor);

    /**
     * Original signature : <code>PIX* pixScaleToGray2(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4642</i>
     */
    Pix pixScaleToGray2(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray3(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4644</i>
     */
    Pix pixScaleToGray3(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray4(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4646</i>
     */
    Pix pixScaleToGray4(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray6(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4648</i>
     */
    Pix pixScaleToGray6(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray8(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4650</i>
     */
    Pix pixScaleToGray8(Pix pixs);

    /**
     * Original signature : <code>PIX* pixScaleToGray16(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4652</i>
     */
    Pix pixScaleToGray16(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleToGrayMipmap(PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4654</i>
     */
    Pix pixScaleToGrayMipmap(Pix pixs, float scalefactor);

    /**
     * Original signature :
     * <code>PIX* pixScaleMipmap(PIX*, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4656</i>
     */
    Pix pixScaleMipmap(Pix pixs1, Pix pixs2, float scale);

    /**
     * Original signature :
     * <code>PIX* pixExpandReplicate(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4658</i>
     */
    Pix pixExpandReplicate(Pix pixs, int factor);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray2xLIThresh(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4660</i>
     */
    Pix pixScaleGray2xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray2xLIDither(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4662</i>
     */
    Pix pixScaleGray2xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGray4xLIThresh(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4664</i>
     */
    Pix pixScaleGray4xLIThresh(Pix pixs, int thresh);

    /**
     * Original signature : <code>PIX* pixScaleGray4xLIDither(PIX*)</code><br>
     * <i>native declaration : allheaders.h:4666</i>
     */
    Pix pixScaleGray4xLIDither(Pix pixs);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayMinMax(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4668</i>
     */
    Pix pixScaleGrayMinMax(Pix pixs, int xfact, int yfact, int type);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayMinMax2(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4670</i>
     */
    Pix pixScaleGrayMinMax2(Pix pixs, int type);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayRankCascade(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4672</i>
     */
    Pix pixScaleGrayRankCascade(Pix pixs, int level1, int level2, int level3, int level4);

    /**
     * Original signature :
     * <code>PIX* pixScaleGrayRank2(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4674</i>
     */
    Pix pixScaleGrayRank2(Pix pixs, int rank);

    /**
     * Original signature :
     * <code>l_int32 pixScaleAndTransferAlpha(PIX*, PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4676</i>
     */
    int pixScaleAndTransferAlpha(Pix pixd, Pix pixs, float scalex, float scaley);

    /**
     * Original signature :
     * <code>PIX* pixScaleWithAlpha(PIX*, l_float32, l_float32, PIX*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4678</i>
     */
    Pix pixScaleWithAlpha(Pix pixs, float scalex, float scaley, Pix pixg, float fract);

//      /**
//       * Original signature :
//       * <code>void scaleColorLILow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4680</i>
//       */
//      void scaleColorLILow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleGrayLILow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4682</i>
//       */
//      void scaleGrayLILow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleColor2xLILow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4684</i>
//       */
//      void scaleColor2xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleColor2xLILineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4686</i>
//       */
//      void scaleColor2xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag);
//      /**
//       * Original signature :
//       * <code>void scaleGray2xLILow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4688</i>
//       */
//      void scaleGray2xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleGray2xLILineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4690</i>
//       */
//      void scaleGray2xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag);
//      /**
//       * Original signature :
//       * <code>void scaleGray4xLILow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4692</i>
//       */
//      void scaleGray4xLILow(IntBuffer datad, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleGray4xLILineLow(l_uint32*, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4694</i>
//       */
//      void scaleGray4xLILineLow(IntBuffer lined, int wpld, IntBuffer lines, int ws, int wpls, int lastlineflag);
//      /**
//       * Original signature :
//       * <code>l_int32 scaleBySamplingLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4696</i>
//       */
//      int scaleBySamplingLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int d, int wpls);
//      /**
//       * Original signature :
//       * <code>l_int32 scaleSmoothLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4698</i>
//       */
//      int scaleSmoothLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int d, int wpls, int size);
//      /**
//       * Original signature :
//       * <code>void scaleRGBToGray2Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_float32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4700</i>
//       */
//      void scaleRGBToGray2Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, float rwt, float gwt, float bwt);
//      /**
//       * Original signature :
//       * <code>void scaleColorAreaMapLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4702</i>
//       */
//      void scaleColorAreaMapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleGrayAreaMapLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4704</i>
//       */
//      void scaleGrayAreaMapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls);
//      /**
//       * Original signature :
//       * <code>void scaleAreaMapLow2(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4706</i>
//       */
//      void scaleAreaMapLow2(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int d, int wpls);
//      /**
//       * Original signature :
//       * <code>l_int32 scaleBinaryLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4708</i>
//       */
//      int scaleBinaryLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int ws, int hs, int wpls);
    /**
     * Original signature :
     * <code>void scaleToGray2Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:4710</i>
     */
    void scaleToGray2Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab);
//  
//      /**
//       * Original signature : <code>l_uint32* makeSumTabSG2()</code><br>
//       * <i>native declaration : allheaders.h:4712</i>
//       */
//      IntByReference makeSumTabSG2();
//  
//      /**
//       * Original signature : <code>l_uint8* makeValTabSG2()</code><br>
//       * <i>native declaration : allheaders.h:4714</i>
//       */
//      Pointer makeValTabSG2();

    /**
     * Original signature :
     * <code>void scaleToGray3Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:4716</i>
     */
    void scaleToGray3Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab);
//  
//      /**
//       * Original signature : <code>l_uint32* makeSumTabSG3()</code><br>
//       * <i>native declaration : allheaders.h:4718</i>
//       */
//      IntByReference makeSumTabSG3();
//  
//      /**
//       * Original signature : <code>l_uint8* makeValTabSG3()</code><br>
//       * <i>native declaration : allheaders.h:4720</i>
//       */
//      Pointer makeValTabSG3();

    /**
     * Original signature :
     * <code>void scaleToGray4Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:4722</i>
     */
    void scaleToGray4Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer sumtab, ByteBuffer valtab);
//  
//      /**
//       * Original signature : <code>l_uint32* makeSumTabSG4()</code><br>
//       * <i>native declaration : allheaders.h:4724</i>
//       */
//      IntByReference makeSumTabSG4();
//  
//      /**
//       * Original signature : <code>l_uint8* makeValTabSG4()</code><br>
//       * <i>native declaration : allheaders.h:4726</i>
//       */
//      Pointer makeValTabSG4();

    /**
     * Original signature :
     * <code>void scaleToGray6Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:4728</i>
     */
    void scaleToGray6Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab);
//  
//      /**
//       * Original signature : <code>l_uint8* makeValTabSG6()</code><br>
//       * <i>native declaration : allheaders.h:4730</i>
//       */
//      Pointer makeValTabSG6();

    /**
     * Original signature :
     * <code>void scaleToGray8Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32*, l_uint8*)</code><br>
     * <i>native declaration : allheaders.h:4732</i>
     */
    void scaleToGray8Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8, ByteBuffer valtab);
//  
//      /**
//       * Original signature : <code>l_uint8* makeValTabSG8()</code><br>
//       * <i>native declaration : allheaders.h:4734</i>
//       */
//      Pointer makeValTabSG8();

//      /**
//       * Original signature :
//       * <code>void scaleToGray16Low(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4736</i>
//       */
//      void scaleToGray16Low(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas, int wpls, IntBuffer tab8);
//      /**
//       * Original signature :
//       * <code>l_int32 scaleMipmapLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_uint32*, l_int32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4738</i>
//       */
//      int scaleMipmapLow(IntBuffer datad, int wd, int hd, int wpld, IntBuffer datas1, int wpls1, IntBuffer datas2, int wpls2, float red);
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillBinary(PIX*, PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4740</i>
//       */
//      Pix pixSeedfillBinary(Pix pixd, Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillBinaryRestricted(PIX*, PIX*, PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4742</i>
//       */
//      Pix pixSeedfillBinaryRestricted(Pix pixd, Pix pixs, Pix pixm, int connectivity, int xmax, int ymax);
//      /**
//       * Original signature :
//       * <code>PIX* pixHolesByFilling(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4744</i>
//       */
//      Pix pixHolesByFilling(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillClosedBorders(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4746</i>
//       */
//      Pix pixFillClosedBorders(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixExtractBorderConnComps(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4748</i>
//       */
//      Pix pixExtractBorderConnComps(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveBorderConnComps(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4750</i>
//       */
//      Pix pixRemoveBorderConnComps(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillBgFromBorder(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4752</i>
//       */
//      Pix pixFillBgFromBorder(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixFillHolesToBoundingRect(PIX*, l_int32, l_float32, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:4754</i>
//       */
//      Pix pixFillHolesToBoundingRect(Pix pixs, int minsize, float maxhfract, float minfgfract);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSeedfillGray(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4756</i>
//       */
//      int pixSeedfillGray(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSeedfillGrayInv(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4758</i>
//       */
//      int pixSeedfillGrayInv(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSeedfillGraySimple(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4760</i>
//       */
//      int pixSeedfillGraySimple(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSeedfillGrayInvSimple(PIX*, PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4762</i>
//       */
//      int pixSeedfillGrayInvSimple(Pix pixs, Pix pixm, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixSeedfillGrayBasin(PIX*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4764</i>
//       */
//      Pix pixSeedfillGrayBasin(Pix pixb, Pix pixm, int delta, int connectivity);
//      /**
//       * Original signature :
//       * <code>PIX* pixDistanceFunction(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4766</i>
//       */
//      Pix pixDistanceFunction(Pix pixs, int connectivity, int outdepth, int boundcond);
//  
//      /**
//       * Original signature : <code>PIX* pixSeedspread(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4768</i>
//       */
//      Pix pixSeedspread(Pix pixs, int connectivity);
//      /**
//       * Original signature :
//       * <code>l_int32 pixLocalExtrema(PIX*, l_int32, l_int32, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4770</i>
//       */
//      int pixLocalExtrema(Pix pixs, int maxmin, int minmax, PointerByReference ppixmin, PointerByReference ppixmax);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSelectedLocalExtrema(PIX*, l_int32, PIX**, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4772</i>
//       */
//      int pixSelectedLocalExtrema(Pix pixs, int mindist, PointerByReference ppixmin, PointerByReference ppixmax);
//  
//      /**
//       * Original signature : <code>PIX* pixFindEqualValues(PIX*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4774</i>
//       */
//      Pix pixFindEqualValues(Pix pixs1, Pix pixs2);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSelectMinInConnComp(PIX*, PIX*, PTA**, NUMA**)</code><br>
//       * <i>native declaration : allheaders.h:4776</i>
//       */
//      int pixSelectMinInConnComp(Pix pixs, Pix pixm, PointerByReference ppta, PointerByReference pnav);
//      /**
//       * Original signature :
//       * <code>PIX* pixRemoveSeededComponents(PIX*, PIX*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4778</i>
//       */
//      Pix pixRemoveSeededComponents(Pix pixd, Pix pixs, Pix pixm, int connectivity, int bordersize);
//      /**
//       * Original signature :
//       * <code>void seedfillBinaryLow(l_uint32*, l_int32, l_int32, l_uint32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4780</i>
//       */
//      void seedfillBinaryLow(IntBuffer datas, int hs, int wpls, IntBuffer datam, int hm, int wplm, int connectivity);
//      /**
//       * Original signature :
//       * <code>void seedfillGrayLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4782</i>
//       */
//      void seedfillGrayLow(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity);
//      /**
//       * Original signature :
//       * <code>void seedfillGrayInvLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4784</i>
//       */
//      void seedfillGrayInvLow(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity);
//      /**
//       * Original signature :
//       * <code>void seedfillGrayLowSimple(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4786</i>
//       */
//      void seedfillGrayLowSimple(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity);
//      /**
//       * Original signature :
//       * <code>void seedfillGrayInvLowSimple(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4788</i>
//       */
//      void seedfillGrayInvLowSimple(IntBuffer datas, int w, int h, int wpls, IntBuffer datam, int wplm, int connectivity);
//      /**
//       * Original signature :
//       * <code>void distanceFunctionLow(l_uint32*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4790</i>
//       */
//      void distanceFunctionLow(IntBuffer datad, int w, int h, int d, int wpld, int connectivity);
//      /**
//       * Original signature :
//       * <code>void seedspreadLow(l_uint32*, l_int32, l_int32, l_int32, l_uint32*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4792</i>
//       */
//      void seedspreadLow(IntBuffer datad, int w, int h, int wpld, IntBuffer datat, int wplt, int connectivity);
//  
//      /**
//       * Original signature : <code>SELA* selaCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4794</i>
//       */
//      Sela selaCreate(int n);
//  
//      /**
//       * Original signature : <code>void selaDestroy(SELA**)</code><br>
//       * <i>native declaration : allheaders.h:4796</i>
//       */
//      void selaDestroy(PointerByReference psela);
//      /**
//       * Original signature :
//       * <code>SEL* selCreate(l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4798</i>
//       */
//      Sel selCreate(int height, int width, String name);
//  
//      /**
//       * Original signature : <code>void selDestroy(SEL**)</code><br>
//       * <i>native declaration : allheaders.h:4800</i>
//       */
//      void selDestroy(PointerByReference psel);
//  
//      /**
//       * Original signature : <code>SEL* selCopy(SEL*)</code><br>
//       * <i>native declaration : allheaders.h:4802</i>
//       */
//      Sel selCopy(Pointer sel);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateBrick(l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4804</i>
//       */
//      Sel selCreateBrick(int h, int w, int cy, int cx, int type);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateComb(l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4806</i>
//       */
//      Sel selCreateComb(int factor1, int factor2, int direction);
//      /**
//       * Original signature :
//       * <code>l_int32** create2dIntArray(l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4808</i>
//       */
//      PointerByReference create2dIntArray(int sy, int sx);
//      /**
//       * Original signature :
//       * <code>l_int32 selaAddSel(SELA*, SEL*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4810</i>
//       */
//      int selaAddSel(Sela sela, Pointer sel, String selname, int copyflag);
//  
//      /**
//       * Original signature : <code>l_int32 selaGetCount(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4812</i>
//       */
//      int selaGetCount(Sela sela);
//  
//      /**
//       * Original signature : <code>SEL* selaGetSel(SELA*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4814</i>
//       */
//      Sel selaGetSel(Sela sela, int i);
//  
//      /**
//       * Original signature : <code>char* selGetName(SEL*)</code><br>
//       * <i>native declaration : allheaders.h:4816</i>
//       */
//      Pointer selGetName(Pointer sel);
//      /**
//       * Original signature :
//       * <code>l_int32 selSetName(SEL*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4818</i>
//       */
//      int selSetName(Pointer sel, String name);
//      /**
//       * Original signature :
//       * <code>l_int32 selaFindSelByName(SELA*, const char*, l_int32*, SEL**)</code><br>
//       * <i>native declaration : allheaders.h:4820</i>
//       */
//      int selaFindSelByName(Sela sela, String name, IntBuffer pindex, PointerByReference psel);
//      /**
//       * Original signature :
//       * <code>l_int32 selGetElement(SEL*, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4822</i>
//       */
//      int selGetElement(Pointer sel, int row, int col, IntBuffer ptype);
//      /**
//       * Original signature :
//       * <code>l_int32 selSetElement(SEL*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4824</i>
//       */
//      int selSetElement(Pointer sel, int row, int col, int type);
//      /**
//       * Original signature :
//       * <code>l_int32 selGetParameters(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4826</i>
//       */
//      int selGetParameters(Pointer sel, IntBuffer psy, IntBuffer psx, IntBuffer pcy, IntBuffer pcx);
//      /**
//       * Original signature :
//       * <code>l_int32 selSetOrigin(SEL*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4828</i>
//       */
//      int selSetOrigin(Pointer sel, int cy, int cx);
//      /**
//       * Original signature :
//       * <code>l_int32 selGetTypeAtOrigin(SEL*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4830</i>
//       */
//      int selGetTypeAtOrigin(Pointer sel, IntBuffer ptype);
//      /**
//       * Original signature :
//       * <code>char* selaGetBrickName(SELA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4832</i>
//       */
//      Pointer selaGetBrickName(Sela sela, int hsize, int vsize);
//      /**
//       * Original signature :
//       * <code>char* selaGetCombName(SELA*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4834</i>
//       */
//      Pointer selaGetCombName(Sela sela, int size, int direction);
//      /**
//       * Original signature :
//       * <code>l_int32 getCompositeParameters(l_int32, l_int32*, l_int32*, char**, char**, char**, char**)</code><br>
//       * <i>native declaration : allheaders.h:4836</i>
//       */
//      int getCompositeParameters(int size, IntBuffer psize1, IntBuffer psize2, PointerByReference pnameh1, PointerByReference pnameh2, PointerByReference pnamev1, PointerByReference pnamev2);
//  
//      /**
//       * Original signature : <code>SARRAY* selaGetSelnames(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4838</i>
//       */
//      Sarray selaGetSelnames(Sela sela);
//      /**
//       * Original signature :
//       * <code>l_int32 selFindMaxTranslations(SEL*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4840</i>
//       */
//      int selFindMaxTranslations(Pointer sel, IntBuffer pxp, IntBuffer pyp, IntBuffer pxn, IntBuffer pyn);
//  
//      /**
//       * Original signature : <code>SEL* selRotateOrth(SEL*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4842</i>
//       */
//      Sel selRotateOrth(Pointer sel, int quads);
//  
//      /**
//       * Original signature : <code>SELA* selaRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4844</i>
//       */
//      Sela selaRead(String fname);
//  
//      /**
//       * Original signature : <code>SELA* selaReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:4846</i>
//       */
//      Sela selaReadStream(FILE fp);
//  
//      /**
//       * Original signature : <code>SEL* selRead(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4848</i>
//       */
//      Sel selRead(String fname);
//  
//      /**
//       * Original signature : <code>SEL* selReadStream(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:4850</i>
//       */
//      Sel selReadStream(FILE fp);
//      /**
//       * Original signature :
//       * <code>l_int32 selaWrite(const char*, SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4852</i>
//       */
//      int selaWrite(String fname, Sela sela);
//      /**
//       * Original signature :
//       * <code>l_int32 selaWriteStream(FILE*, SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4854</i>
//       */
//      int selaWriteStream(FILE fp, Sela sela);
//  
//      /**
//       * Original signature : <code>l_int32 selWrite(const char*, SEL*)</code><br>
//       * <i>native declaration : allheaders.h:4856</i>
//       */
//      int selWrite(String fname, Pointer sel);
//  
//      /**
//       * Original signature : <code>l_int32 selWriteStream(FILE*, SEL*)</code><br>
//       * <i>native declaration : allheaders.h:4858</i>
//       */
//      int selWriteStream(FILE fp, Pointer sel);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromString(const char*, l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4860</i>
//       */
//      Sel selCreateFromString(String text, int h, int w, String name);
//  
//      /**
//       * Original signature : <code>char* selPrintToString(SEL*)</code><br>
//       * <i>native declaration : allheaders.h:4862</i>
//       */
//      Pointer selPrintToString(Pointer sel);
//      /**
//       * Original signature :
//       * <code>SELA* selaCreateFromFile(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4864</i>
//       */
//      Sela selaCreateFromFile(String filename);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromPta(PTA*, l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4866</i>
//       */
//      Sel selCreateFromPta(Pta pta, int cy, int cx, String name);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromPix(PIX*, l_int32, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4868</i>
//       */
//      Sel selCreateFromPix(Pix pix, int cy, int cx, String name);
//      /**
//       * Original signature :
//       * <code>SEL* selReadFromColorImage(const char*)</code><br>
//       * <i>native declaration : allheaders.h:4870</i>
//       */
//      Sel selReadFromColorImage(String pathname);
//      /**
//       * Original signature :
//       * <code>SEL* selCreateFromColorPix(PIX*, char*)</code><br>
//       * <i>native declaration : allheaders.h:4872</i>
//       */
//      Sel selCreateFromColorPix(Pix pixs, ByteBuffer selname);
//      /**
//       * Original signature :
//       * <code>PIX* selDisplayInPix(SEL*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4874</i>
//       */
//      Pix selDisplayInPix(Pointer sel, int size, int gthick);
//      /**
//       * Original signature :
//       * <code>PIX* selaDisplayInPix(SELA*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4876</i>
//       */
//      Pix selaDisplayInPix(Sela sela, int size, int gthick, int spacing, int ncols);
//  
//      /**
//       * Original signature : <code>SELA* selaAddBasic(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4878</i>
//       */
//      Sela selaAddBasic(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddHitMiss(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4880</i>
//       */
//      Sela selaAddHitMiss(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddDwaLinear(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4882</i>
//       */
//      Sela selaAddDwaLinear(Sela sela);
//  
//      /**
//       * Original signature : <code>SELA* selaAddDwaCombs(SELA*)</code><br>
//       * <i>native declaration : allheaders.h:4884</i>
//       */
//      Sela selaAddDwaCombs(Sela sela);
//      /**
//       * Original signature :
//       * <code>SELA* selaAddCrossJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4886</i>
//       */
//      Sela selaAddCrossJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);
//      /**
//       * Original signature :
//       * <code>SELA* selaAddTJunctions(SELA*, l_float32, l_float32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4888</i>
//       */
//      Sela selaAddTJunctions(Sela sela, float hlsize, float mdist, int norient, int debugflag);
    /**
     * Original signature : <code>SELA* sela4ccThin(SELA*)</code><br>
     * <i>native declaration : allheaders.h:4890</i>
     */
    Sela sela4ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela8ccThin(SELA*)</code><br>
     * <i>native declaration : allheaders.h:4892</i>
     */
    Sela sela8ccThin(Sela sela);

    /**
     * Original signature : <code>SELA* sela4and8ccThin(SELA*)</code><br>
     * <i>native declaration : allheaders.h:4894</i>
     */
    Sela sela4and8ccThin(Sela sela);

//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelWithRuns(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4896</i>
//       */
//      Sel pixGenerateSelWithRuns(Pix pixs, int nhlines, int nvlines, int distance, int minlength, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelRandom(PIX*, l_float32, l_float32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4898</i>
//       */
//      Sel pixGenerateSelRandom(Pix pixs, float hitfract, float missfract, int distance, int toppix, int botpix, int leftpix, int rightpix, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>SEL* pixGenerateSelBoundary(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32, PIX**)</code><br>
//       * <i>native declaration : allheaders.h:4900</i>
//       */
//      Sel pixGenerateSelBoundary(Pix pixs, int hitdist, int missdist, int hitskip, int missskip, int topflag, int botflag, int leftflag, int rightflag, PointerByReference ppixe);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetRunCentersOnLine(PIX*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4902</i>
//       */
//      Numa pixGetRunCentersOnLine(Pix pixs, int x, int y, int minlength);
//      /**
//       * Original signature :
//       * <code>NUMA* pixGetRunsOnLine(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4904</i>
//       */
//      Numa pixGetRunsOnLine(Pix pixs, int x1, int y1, int x2, int y2);
//      /**
//       * Original signature :
//       * <code>PTA* pixSubsampleBoundaryPixels(PIX*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4906</i>
//       */
//      Pta pixSubsampleBoundaryPixels(Pix pixs, int skip);
//      /**
//       * Original signature :
//       * <code>l_int32 adjacentOnPixelInRaster(PIX*, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4908</i>
//       */
//      int adjacentOnPixelInRaster(Pix pixs, int x, int y, IntBuffer pxa, IntBuffer pya);
//      /**
//       * Original signature :
//       * <code>PIX* pixDisplayHitMissSel(PIX*, SEL*, l_int32, l_uint32, l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:4910</i>
//       */
//      Pix pixDisplayHitMissSel(Pix pixs, Pointer sel, int scalefactor, int hitcolor, int misscolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4912</i>
//       */
//      Pix pixHShear(Pix pixd, Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShear(PIX*, PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4914</i>
//       */
//      Pix pixVShear(Pix pixd, Pix pixs, int xloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearCorner(PIX*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4916</i>
//       */
//      Pix pixHShearCorner(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearCorner(PIX*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4918</i>
//       */
//      Pix pixVShearCorner(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearCenter(PIX*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4920</i>
//       */
//      Pix pixHShearCenter(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearCenter(PIX*, PIX*, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4922</i>
//       */
//      Pix pixVShearCenter(Pix pixd, Pix pixs, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixHShearIP(PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4924</i>
//       */
//      int pixHShearIP(Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>l_int32 pixVShearIP(PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4926</i>
//       */
//      int pixVShearIP(Pix pixs, int xloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixHShearLI(PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4928</i>
//       */
//      Pix pixHShearLI(Pix pixs, int yloc, float radang, int incolor);
//      /**
//       * Original signature :
//       * <code>PIX* pixVShearLI(PIX*, l_int32, l_float32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4930</i>
//       */
//      Pix pixVShearLI(Pix pixs, int xloc, float radang, int incolor);
    /**
     * Original signature : <code>PIX* pixDeskewBoth(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:</i>
     */
    Pix pixDeskewBoth(Pix pixs, int redsearch);

    /**
     * Original signature : <code>PIX* pixDeskew(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4932</i>
     */
    Pix pixDeskew(Pix pixs, int redsearch);

    /**
     * Original signature :
     * <code>PIX* pixFindSkewAndDeskew(PIX*, l_int32, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4934</i>
     */
    Pix pixFindSkewAndDeskew(Pix pixs, int redsearch, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>PIX* pixDeskewGeneral(PIX*, l_int32, l_float32, l_float32, l_int32, l_int32, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4936</i>
     */
    Pix pixDeskewGeneral(Pix pixs, int redsweep, float sweeprange, float sweepdelta, int redsearch, int thresh, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkew(PIX*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4938</i>
     */
    int pixFindSkew(Pix pixs, FloatBuffer pangle, FloatBuffer pconf);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewSweep(PIX*, l_float32*, l_int32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4940</i>
     */
    int pixFindSkewSweep(Pix pixs, FloatBuffer pangle, int reduction, float sweeprange, float sweepdelta);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewSweepAndSearch(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4942</i>
     */
    int pixFindSkewSweepAndSearch(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewSweepAndSearchScore(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4944</i>
     */
    int pixFindSkewSweepAndSearchScore(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewSweepAndSearchScorePivot(PIX*, l_float32*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4946</i>
     */
    int pixFindSkewSweepAndSearchScorePivot(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, FloatBuffer pendscore, int redsweep, int redsearch, float sweepcenter, float sweeprange, float sweepdelta, float minbsdelta, int pivot);

    /**
     * Original signature :
     * <code>l_int32 pixFindSkewOrthogonalRange(PIX*, l_float32*, l_float32*, l_int32, l_int32, l_float32, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:4948</i>
     */
    int pixFindSkewOrthogonalRange(Pix pixs, FloatBuffer pangle, FloatBuffer pconf, int redsweep, int redsearch, float sweeprange, float sweepdelta, float minbsdelta, float confprior);

    /**
     * Original signature :
     * <code>l_int32 pixFindDifferentialSquareSum(PIX*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4950</i>
     */
    int pixFindDifferentialSquareSum(Pix pixs, FloatBuffer psum);

    /**
     * Original signature :
     * <code>l_int32 pixFindNormalizedSquareSum(PIX*, l_float32*, l_float32*, l_float32*)</code><br>
     * <i>native declaration : allheaders.h:4952</i>
     */
    int pixFindNormalizedSquareSum(Pix pixs, FloatBuffer phratio, FloatBuffer pvratio, FloatBuffer pfract);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamSpix(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:4954</i>
//       */
//      Pix pixReadStreamSpix(FILE fp);

//      /**
//       * Original signature :
//       * <code>l_int32 readHeaderSpix(const char*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4956</i>
//       */
//      int readHeaderSpix(String filename, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_int32 freadHeaderSpix(FILE*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4958</i>
//       */
//      int freadHeaderSpix(FILE fp, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_int32 sreadHeaderSpix(const l_uint32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:4960</i>
//       */
//      int sreadHeaderSpix(IntBuffer data, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer piscmap);
//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamSpix(FILE*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4962</i>
//       */
//      int pixWriteStreamSpix(FILE fp, Pix pix);
    /**
     * Original signature :
     * <code>PIX* pixReadMemSpix(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:4964</i>
     */
    Pix pixReadMemSpix(ByteBuffer data, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteMemSpix(l_uint8**, size_t*, PIX*)</code><br>
//       * <i>native declaration : allheaders.h:4966</i>
//       */
//      int pixWriteMemSpix(PointerByReference pdata, NativeSizeByReference psize, Pix pix);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSerializeToMemory(PIX*, l_uint32**, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:4968</i>
//       */
//      int pixSerializeToMemory(Pix pixs, PointerByReference pdata, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>PIX* pixDeserializeFromMemory(const l_uint32*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:4970</i>
//       */
//      Pix pixDeserializeFromMemory(IntBuffer data, NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>L_STACK* lstackCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4972</i>
//       */
//      L_Stack lstackCreate(int nalloc);
//      /**
//       * Original signature :
//       * <code>void lstackDestroy(L_STACK**, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4974</i>
//       */
//      void lstackDestroy(PointerByReference plstack, int freeflag);
//  
//      /**
//       * Original signature : <code>l_int32 lstackAdd(L_STACK*, void*)</code><br>
//       * <i>native declaration : allheaders.h:4976</i>
//       */
//      int lstackAdd(L_Stack lstack, Pointer item);
//  
//      /**
//       * Original signature : <code>void* lstackRemove(L_STACK*)</code><br>
//       * <i>native declaration : allheaders.h:4978</i>
//       */
//      Pointer lstackRemove(L_Stack lstack);
//  
//      /**
//       * Original signature : <code>l_int32 lstackGetCount(L_STACK*)</code><br>
//       * <i>native declaration : allheaders.h:4980</i>
//       */
//      int lstackGetCount(L_Stack lstack);
//      /**
//       * Original signature :
//       * <code>l_int32 lstackPrint(FILE*, L_STACK*)</code><br>
//       * <i>native declaration : allheaders.h:4982</i>
//       */
//      int lstackPrint(FILE fp, L_Stack lstack);
//  
//      /**
//       * Original signature : <code>L_STRCODE* strcodeCreate(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:4984</i>
//       */
//      L_StrCode strcodeCreate(int fileno);
//      /**
//       * Original signature :
//       * <code>l_int32 strcodeCreateFromFile(const char*, l_int32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4986</i>
//       */
//      int strcodeCreateFromFile(String filein, int fileno, String outdir);
//      /**
//       * Original signature :
//       * <code>l_int32 strcodeGenerate(L_STRCODE*, const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4988</i>
//       */
//      int strcodeGenerate(L_StrCode strcode, String filein, String type);
//      /**
//       * Original signature :
//       * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code><br>
//       * <i>native declaration : allheaders.h:4990</i>
//       */
//      int strcodeFinalize(PointerByReference pstrcode, String outdir);
    /**
     * Original signature :
     * <code>l_int32 strcodeFinalize(L_STRCODE**, const char*)</code><br>
     * <i>native declaration : allheaders.h:4990</i>
     */
    int strcodeFinalize(PointerByReference pstrcode, Pointer outdir);

    /**
     * Original signature :
     * <code>l_int32 l_getStructStrFromFile(const char*, l_int32, char**)</code><br>
     * <i>native declaration : allheaders.h:4992</i>
     */
    int l_getStructStrFromFile(String filename, int field, PointerByReference pstr);

    /**
     * Original signature :
     * <code>l_int32 pixFindStrokeLength(PIX*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:4994</i>
     */
    int pixFindStrokeLength(Pix pixs, IntBuffer tab8, IntBuffer plength);

    /**
     * Original signature :
     * <code>l_int32 pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:4996</i>
     */
    int pixFindStrokeWidth(Pix pixs, float thresh, IntBuffer tab8, FloatBuffer pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>l_int32 pixFindStrokeWidth(PIX*, l_float32, l_int32*, l_float32*, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:4996</i>
     */
    int pixFindStrokeWidth(Pix pixs, float thresh, IntByReference tab8, FloatByReference pwidth, PointerByReference pnahisto);

    /**
     * Original signature :
     * <code>NUMA* pixaFindStrokeWidth(PIXA*, l_float32, l_int32*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:4998</i>
     */
    Numa pixaFindStrokeWidth(Pixa pixa, float thresh, IntBuffer tab8, int debug);

    /**
     * Original signature :
     * <code>PIXA* pixaModifyStrokeWidth(PIXA*, l_float32)</code><br>
     * <i>native declaration : allheaders.h:5000</i>
     */
    Pixa pixaModifyStrokeWidth(Pixa pixas, float targetw);

    /**
     * Original signature :
     * <code>PIX* pixModifyStrokeWidth(PIX*, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:5002</i>
     */
    Pix pixModifyStrokeWidth(Pix pixs, float width, float targetw);

    /**
     * Original signature :
     * <code>PIXA* pixaSetStrokeWidth(PIXA*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5004</i>
     */
    Pixa pixaSetStrokeWidth(Pixa pixas, int width, int thinfirst, int connectivity);

    /**
     * Original signature :
     * <code>PIX* pixSetStrokeWidth(PIX*, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5006</i>
     */
    Pix pixSetStrokeWidth(Pix pixs, int width, int thinfirst, int connectivity);

//      /**
//       * Original signature :
//       * <code>l_int32* sudokuReadFile(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5008</i>
//       */
//      IntByReference sudokuReadFile(String filename);
//      /**
//       * Original signature :
//       * <code>l_int32* sudokuReadString(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5010</i>
//       */
//      IntByReference sudokuReadString(String str);
//  
//      /**
//       * Original signature : <code>L_SUDOKU* sudokuCreate(l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5012</i>
//       */
//      L_Sudoku sudokuCreate(IntBuffer array);
//  
//      /**
//       * Original signature : <code>void sudokuDestroy(L_SUDOKU**)</code><br>
//       * <i>native declaration : allheaders.h:5014</i>
//       */
//      void sudokuDestroy(PointerByReference psud);
//  
//      /**
//       * Original signature : <code>l_int32 sudokuSolve(L_SUDOKU*)</code><br>
//       * <i>native declaration : allheaders.h:5016</i>
//       */
//      int sudokuSolve(L_Sudoku sud);
//      /**
//       * Original signature :
//       * <code>l_int32 sudokuTestUniqueness(l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5018</i>
//       */
//      int sudokuTestUniqueness(IntBuffer array, IntBuffer punique);
//      /**
//       * Original signature :
//       * <code>L_SUDOKU* sudokuGenerate(l_int32*, l_int32, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5020</i>
//       */
//      L_Sudoku sudokuGenerate(IntBuffer array, int seed, int minelems, int maxtries);
//      /**
//       * Original signature :
//       * <code>l_int32 sudokuOutput(L_SUDOKU*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5022</i>
//       */
//      int sudokuOutput(L_Sudoku sud, int arraytype);
//      /**
//       * Original signature :
//       * <code>PIX* pixAddSingleTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5024</i>
//       */
//      Pix pixAddSingleTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int location, IntBuffer poverflow);
    /**
     * Original signature :
     * <code>PIX* pixAddTextlines(PIX*, L_BMF*, const char*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5026</i>
     */
    Pix pixAddTextlines(Pix pixs, L_Bmf bmf, String textstr, int val, int location);

//      /**
//       * Original signature :
//       * <code>l_int32 pixSetTextblock(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5028</i>
//       */
//      int pixSetTextblock(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, int wtext, int firstindent, IntBuffer poverflow);
//      /**
//       * Original signature :
//       * <code>l_int32 pixSetTextline(PIX*, L_BMF*, const char*, l_uint32, l_int32, l_int32, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5030</i>
//       */
//      int pixSetTextline(Pix pixs, L_Bmf bmf, String textstr, int val, int x0, int y0, IntBuffer pwidth, IntBuffer poverflow);
//      /**
//       * Original signature :
//       * <code>PIXA* pixaAddTextNumber(PIXA*, L_BMF*, NUMA*, l_uint32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5032</i>
//       */
//      Pixa pixaAddTextNumber(Pixa pixas, L_Bmf bmf, Numa na, int val, int location);
    /**
     * Original signature :
     * <code>PIXA* pixaAddTextlines(PIXA*, L_BMF*, SARRAY*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5034</i>
     */
    Pixa pixaAddTextlines(Pixa pixas, L_Bmf bmf, Sarray sa, int val, int location);

    /**
     * Original signature :
     * <code>l_int32 pixaAddPixWithText(PIXA*, PIX*, l_int32, L_BMF*, const char*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5036</i>
     */
    int pixaAddPixWithText(Pixa pixa, Pix pixs, int reduction, L_Bmf bmf, String textstr, int val, int location);

//      /**
//       * Original signature :
//       * <code>SARRAY* bmfGetLineStrings(L_BMF*, const char*, l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5038</i>
//       */
//      Sarray bmfGetLineStrings(L_Bmf bmf, String textstr, int maxw, int firstindent, IntBuffer ph);
//      /**
//       * Original signature :
//       * <code>NUMA* bmfGetWordWidths(L_BMF*, const char*, SARRAY*)</code><br>
//       * <i>native declaration : allheaders.h:5040</i>
//       */
//      Numa bmfGetWordWidths(L_Bmf bmf, String textstr, Sarray sa);
//      /**
//       * Original signature :
//       * <code>l_int32 bmfGetStringWidth(L_BMF*, const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5042</i>
//       */
//      int bmfGetStringWidth(L_Bmf bmf, String textstr, IntBuffer pw);
    /**
     * Original signature :
     * <code>SARRAY* splitStringToParagraphs(char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5044</i>
     */
    Sarray splitStringToParagraphs(ByteBuffer textstr, int splitflag);

    /**
     * Original signature :
     * <code>PIX* pixReadTiff(const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5046</i>
     */
    Pix pixReadTiff(String filename, int n);

    /**
     * Original signature :
     * <code>PIX* pixReadStreamTiff(FILE*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5048</i>
     */
    Pix pixReadStreamTiff(FILE fp, int n);

    /**
     * Original signature :
     * <code>l_int32 pixWriteTiff(const char*, PIX*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:5050</i>
     */
    int pixWriteTiff(String filename, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>l_int32 pixWriteTiffCustom(const char*, PIX*, l_int32, const char*, NUMA*, SARRAY*, SARRAY*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:5052</i>
     */
    int pixWriteTiffCustom(String filename, Pix pix, int comptype, String modestr, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);

    /**
     * Original signature :
     * <code>l_int32 pixWriteStreamTiff(FILE*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5054</i>
     */
    int pixWriteStreamTiff(FILE fp, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_int32 pixWriteStreamTiffWA(FILE*, PIX*, l_int32, const char*)</code><br>
     * <i>native declaration : allheaders.h:5056</i>
     */
    int pixWriteStreamTiffWA(FILE fp, Pix pix, int comptype, String modestr);

    /**
     * Original signature :
     * <code>PIX* pixReadFromMultipageTiff(const char*, size_t*)</code><br>
     * <i>native declaration : allheaders.h:5058</i>
     */
    Pix pixReadFromMultipageTiff(String fname, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMultipageTiff(const char*)</code><br>
     * <i>native declaration : allheaders.h:5060</i>
     */
    Pixa pixaReadMultipageTiff(String filename);

    /**
     * Original signature :
     * <code>l_int32 pixaWriteMultipageTiff(const char*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:5062</i>
     */
    int pixaWriteMultipageTiff(String fname, Pixa pixa);

    /**
     * Original signature :
     * <code>l_int32 writeMultipageTiff(const char*, const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:5064</i>
     */
    int writeMultipageTiff(String dirin, String substr, String fileout);

    /**
     * Original signature :
     * <code>l_int32 writeMultipageTiffSA(SARRAY*, const char*)</code><br>
     * <i>native declaration : allheaders.h:5066</i>
     */
    int writeMultipageTiffSA(Sarray sa, String fileout);

    /**
     * Original signature :
     * <code>l_int32 fprintTiffInfo(FILE*, const char*)</code><br>
     * <i>native declaration : allheaders.h:5068</i>
     */
    int fprintTiffInfo(FILE fpout, String tiffile);

    /**
     * Original signature :
     * <code>l_int32 tiffGetCount(FILE*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5070</i>
     */
    int tiffGetCount(FILE fp, IntBuffer pn);

    /**
     * Original signature :
     * <code>l_int32 getTiffResolution(FILE*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5072</i>
     */
    int getTiffResolution(FILE fp, IntBuffer pxres, IntBuffer pyres);

    /**
     * Original signature :
     * <code>l_int32 readHeaderTiff(const char*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5074</i>
     */
    int readHeaderTiff(String filename, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_int32 freadHeaderTiff(FILE*, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5076</i>
     */
    int freadHeaderTiff(FILE fp, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_int32 readHeaderMemTiff(const l_uint8*, size_t, l_int32, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5078</i>
     */
    int readHeaderMemTiff(ByteBuffer cdata, NativeSize size, int n, IntBuffer pwidth, IntBuffer pheight, IntBuffer pbps, IntBuffer pspp, IntBuffer pres, IntBuffer pcmap, IntBuffer pformat);

    /**
     * Original signature :
     * <code>l_int32 findTiffCompression(FILE*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5080</i>
     */
    int findTiffCompression(FILE fp, IntBuffer pcomptype);

//      /**
//       * Original signature :
//       * <code>l_int32 extractG4DataFromFile(const char*, l_uint8**, size_t*, l_int32*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5082</i>
//       */
//      int extractG4DataFromFile(String filein, PointerByReference pdata, NativeSizeByReference pnbytes, IntBuffer pw, IntBuffer ph, IntBuffer pminisblack);
    /**
     * Original signature :
     * <code>PIX* pixReadMemTiff(const l_uint8*, size_t, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5084</i>
     */
    Pix pixReadMemTiff(ByteBuffer cdata, NativeSize size, int n);

    /**
     * Original signature :
     * <code>PIX* pixReadMemFromMultipageTiff(const l_uint8*, size_t, size_t*)</code><br>
     * <i>native declaration : allheaders.h:5086</i>
     */
    Pix pixReadMemFromMultipageTiff(ByteBuffer cdata, NativeSize size, NativeSizeByReference poffset);

    /**
     * Original signature :
     * <code>PIXA* pixaReadMemMultipageTiff(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:5088</i>
     */
    Pixa pixaReadMemMultipageTiff(ByteBuffer data, NativeSize size);

    /**
     * Original signature :
     * <code>l_int32 pixaWriteMemMultipageTiff(l_uint8**, size_t*, PIXA*)</code><br>
     * <i>native declaration : allheaders.h:5090</i>
     */
    int pixaWriteMemMultipageTiff(PointerByReference pdata, NativeSizeByReference psize, Pixa pixa);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemTiff(l_uint8**, size_t*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5092</i>
     */
    int pixWriteMemTiff(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMemTiffCustom(l_uint8**, size_t*, PIX*, l_int32, NUMA*, SARRAY*, SARRAY*, NUMA*)</code><br>
     * <i>native declaration : allheaders.h:5094</i>
     */
    int pixWriteMemTiffCustom(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int comptype, Numa natags, Sarray savals, Sarray satypes, Numa nasizes);
//  
//      /**
//       * Original signature : <code>l_int32 setMsgSeverity(l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5096</i>
//       */
//      int setMsgSeverity(int newsev);

//      /**
//       * Original signature :
//       * <code>l_int32 returnErrorInt(const char*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5098</i>
//       */
//      int returnErrorInt(String msg, String procname, int ival);
//      /**
//       * Original signature :
//       * <code>l_float32 returnErrorFloat(const char*, const char*, l_float32)</code><br>
//       * <i>native declaration : allheaders.h:5100</i>
//       */
//      float returnErrorFloat(String msg, String procname, float fval);
//      /**
//       * Original signature :
//       * <code>void* returnErrorPtr(const char*, const char*, void*)</code><br>
//       * <i>native declaration : allheaders.h:5102</i>
//       */
//      Pointer returnErrorPtr(String msg, String procname, Pointer pval);
//      /**
//       * Original signature :
//       * <code>l_int32 filesAreIdentical(const char*, const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5104</i>
//       */
//      int filesAreIdentical(String fname1, String fname2, IntBuffer psame);
//      /**
//       * Original signature :
//       * <code>l_uint16 convertOnLittleEnd16(l_uint16)</code><br>
//       * <i>native declaration : allheaders.h:5106</i>
//       */
//      short convertOnLittleEnd16(short shortin);
//      /**
//       * Original signature :
//       * <code>l_uint16 convertOnBigEnd16(l_uint16)</code><br>
//       * <i>native declaration : allheaders.h:5108</i>
//       */
//      short convertOnBigEnd16(short shortin);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertOnLittleEnd32(l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:5110</i>
//       */
//      int convertOnLittleEnd32(int wordin);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertOnBigEnd32(l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:5112</i>
//       */
//      int convertOnBigEnd32(int wordin);
//      /**
//       * Original signature :
//       * <code>l_int32 fileCorruptByDeletion(const char*, l_float32, l_float32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5114</i>
//       */
//      int fileCorruptByDeletion(String filein, float loc, float size, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 fileCorruptByMutation(const char*, l_float32, l_float32, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5116</i>
//       */
//      int fileCorruptByMutation(String filein, float loc, float size, String fileout);
//      /**
//       * Original signature :
//       * <code>l_int32 genRandomIntegerInRange(l_int32, l_int32, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5118</i>
//       */
//      int genRandomIntegerInRange(int range, int seed, IntBuffer pval);
//  
//      /**
//       * Original signature : <code>l_int32 lept_roundftoi(l_float32)</code><br>
//       * <i>native declaration : allheaders.h:5120</i>
//       */
//      int lept_roundftoi(float fval);
//      /**
//       * Original signature :
//       * <code>l_int32 l_hashStringToUint64(const char*, l_uint64*)</code><br>
//       * <i>native declaration : allheaders.h:5122</i>
//       */
//      int l_hashStringToUint64(String str, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_int32 l_hashPtToUint64(l_int32, l_int32, l_uint64*)</code><br>
//       * <i>native declaration : allheaders.h:5124</i>
//       */
//      int l_hashPtToUint64(int x, int y, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_int32 l_hashFloat64ToUint64(l_int32, l_float64, l_uint64*)</code><br>
//       * <i>native declaration : allheaders.h:5126</i>
//       */
//      int l_hashFloat64ToUint64(int nbuckets, double val, LongBuffer phash);
//      /**
//       * Original signature :
//       * <code>l_int32 findNextLargerPrime(l_int32, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:5128</i>
//       */
//      int findNextLargerPrime(int start, IntBuffer pprime);
//      /**
//       * Original signature :
//       * <code>l_int32 lept_isPrime(l_uint64, l_int32*, l_uint32*)</code><br>
//       * <i>native declaration : allheaders.h:5130</i>
//       */
//      int lept_isPrime(long n, IntBuffer pis_prime, IntBuffer pfactor);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertBinaryToGrayCode(l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:5132</i>
//       */
//      int convertBinaryToGrayCode(int val);
//      /**
//       * Original signature :
//       * <code>l_uint32 convertGrayCodeToBinary(l_uint32)</code><br>
//       * <i>native declaration : allheaders.h:5134</i>
//       */
//      int convertGrayCodeToBinary(int val);
    /**
     * Original signature : <code>char* getLeptonicaVersion()</code><br>
     * <i>native declaration : allheaders.h:5136</i>
     */
    Pointer getLeptonicaVersion();
//  
//      /**
//       * Original signature : <code>void startTimer()</code><br>
//       * <i>native declaration : allheaders.h:5138</i>
//       */
//      void startTimer();
//  
//      /**
//       * Original signature : <code>l_float32 stopTimer()</code><br>
//       * <i>native declaration : allheaders.h:5140</i>
//       */
//      float stopTimer();
//  
//      /**
//       * Original signature : <code>L_TIMER startTimerNested()</code><br>
//       * <i>native declaration : allheaders.h:5142</i>
//       */
//      Pointer startTimerNested();
//  
//      /**
//       * Original signature : <code>l_float32 stopTimerNested(L_TIMER)</code><br>
//       * <i>native declaration : allheaders.h:5144</i>
//       */
//      float stopTimerNested(Pointer rusage_start);

    /**
     * Original signature :
     * <code>void l_getCurrentTime(l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5146</i>
     */
    void l_getCurrentTime(IntBuffer sec, IntBuffer usec);

    /**
     * Original signature : <code>L_WALLTIMER* startWallTimer()</code><br>
     * <i>native declaration : allheaders.h:5148</i>
     */
    L_WallTimer startWallTimer();

    /**
     * Original signature :
     * <code>l_float32 stopWallTimer(L_WALLTIMER**)</code><br>
     * <i>native declaration : allheaders.h:5150</i>
     */
    float stopWallTimer(PointerByReference ptimer);

    /**
     * Original signature : <code>char* l_getFormattedDate()</code><br>
     * <i>native declaration : allheaders.h:5152</i>
     */
    Pointer l_getFormattedDate();
//  
//      /**
//       * Original signature : <code>char* stringNew(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5154</i>
//       */
//      Pointer stringNew(String src);

//      /**
//       * Original signature :
//       * <code>l_int32 stringCopy(char*, const char*, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5156</i>
//       */
//      int stringCopy(ByteBuffer dest, String src, int n);
//      /**
//       * Original signature :
//       * <code>l_int32 stringReplace(char**, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5158</i>
//       */
//      int stringReplace(PointerByReference pdest, String src);
//      /**
//       * Original signature :
//       * <code>l_int32 stringLength(const char*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:5160</i>
//       */
//      int stringLength(String src, NativeSize size);
//      /**
//       * Original signature :
//       * <code>l_int32 stringCat(char*, size_t, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5162</i>
//       */
//      int stringCat(ByteBuffer dest, NativeSize size, String src);
//      /**
//       * Original signature :
//       * <code>char* stringConcatNew(const char*, null)</code><br>
//       * <i>native declaration : allheaders.h:5164</i>
//       */
//      Pointer stringConcatNew(String first, PointerByReference varArgs1);
//      /**
//       * Original signature :
//       * <code>char* stringJoin(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5166</i>
//       */
//      Pointer stringJoin(String src1, String src2);
//      /**
//       * Original signature :
//       * <code>l_int32 stringJoinIP(char**, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5168</i>
//       */
//      int stringJoinIP(PointerByReference psrc1, String src2);
//  
//      /**
//       * Original signature : <code>char* stringReverse(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5170</i>
//       */
//      Pointer stringReverse(String src);
//      /**
//       * Original signature :
//       * <code>char* strtokSafe(char*, const char*, char**)</code><br>
//       * <i>native declaration : allheaders.h:5172</i>
//       */
//      Pointer strtokSafe(ByteBuffer cstr, String seps, PointerByReference psaveptr);
//      /**
//       * Original signature :
//       * <code>l_int32 stringSplitOnToken(char*, const char*, char**, char**)</code><br>
//       * <i>native declaration : allheaders.h:5174</i>
//       */
//      int stringSplitOnToken(ByteBuffer cstr, String seps, PointerByReference phead, PointerByReference ptail);
//      /**
//       * Original signature :
//       * <code>char* stringRemoveChars(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5176</i>
//       */
//      Pointer stringRemoveChars(String src, String remchars);
//      /**
//       * Original signature :
//       * <code>l_int32 stringFindSubstr(const char*, const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5178</i>
//       */
//      int stringFindSubstr(String src, String sub, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>char* stringReplaceSubstr(const char*, const char*, const char*, l_int32*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5180</i>
//       */
//      Pointer stringReplaceSubstr(String src, String sub1, String sub2, IntBuffer pfound, IntBuffer ploc);
//      /**
//       * Original signature :
//       * <code>char* stringReplaceEachSubstr(const char*, const char*, const char*, l_int32*)</code><br>
//       * <i>native declaration : allheaders.h:5182</i>
//       */
//      Pointer stringReplaceEachSubstr(String src, String sub1, String sub2, IntBuffer pcount);
    /**
     * Original signature :
     * <code>L_DNA* arrayFindEachSequence(const l_uint8*, size_t, const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:5184</i>
     */
    L_Dna arrayFindEachSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen);

    /**
     * Original signature :
     * <code>l_int32 arrayFindSequence(const l_uint8*, size_t, const l_uint8*, size_t, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5186</i>
     */
    int arrayFindSequence(ByteBuffer data, NativeSize datalen, ByteBuffer sequence, NativeSize seqlen, IntBuffer poffset, IntBuffer pfound);

//      /**
//       * Original signature :
//       * <code>void* reallocNew(void**, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5188</i>
//       */
//      Pointer reallocNew(PointerByReference pindata, int oldsize, int newsize);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryRead(const char*, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:5190</i>
//       */
//      Pointer l_binaryRead(String filename, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadStream(FILE*, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:5192</i>
//       */
//      Pointer l_binaryReadStream(FILE fp, NativeSizeByReference pnbytes);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadSelect(const char*, size_t, size_t, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:5194</i>
//       */
//      Pointer l_binaryReadSelect(String filename, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);
//      /**
//       * Original signature :
//       * <code>l_uint8* l_binaryReadSelectStream(FILE*, size_t, size_t, size_t*)</code><br>
//       * <i>native declaration : allheaders.h:5196</i>
//       */
//      Pointer l_binaryReadSelectStream(FILE fp, NativeSize start, NativeSize nbytes, NativeSizeByReference pnread);
//      /**
//       * Original signature :
//       * <code>l_int32 l_binaryWrite(const char*, const char*, void*, size_t)</code><br>
//       * <i>native declaration : allheaders.h:5198</i>
//       */
//      int l_binaryWrite(String filename, String operation, Pointer data, NativeSize nbytes);
//  
//      /**
//       * Original signature : <code>size_t nbytesInFile(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5200</i>
//       */
//      NativeSize nbytesInFile(String filename);
//  
//      /**
//       * Original signature : <code>size_t fnbytesInFile(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:5202</i>
//       */
//      NativeSize fnbytesInFile(FILE fp);
    /**
     * Original signature :
     * <code>l_uint8* l_binaryCopy(l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:5204</i>
     */
    Pointer l_binaryCopy(ByteBuffer datas, NativeSize size);

//      /**
//       * Original signature :
//       * <code>l_int32 fileCopy(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5206</i>
//       */
//      int fileCopy(String srcfile, String newfile);
//      /**
//       * Original signature :
//       * <code>l_int32 fileConcatenate(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5208</i>
//       */
//      int fileConcatenate(String srcfile, String destfile);
//      /**
//       * Original signature :
//       * <code>l_int32 fileAppendString(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5210</i>
//       */
//      int fileAppendString(String filename, String str);
//  
//      /**
//       * Original signature : <code>FILE* fopenReadStream(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5212</i>
//       */
//      FILE fopenReadStream(String filename);
//      /**
//       * Original signature :
//       * <code>FILE* fopenWriteStream(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5214</i>
//       */
//      FILE fopenWriteStream(String filename, String modestring);
    /**
     * Original signature :
     * <code>FILE* fopenReadFromMemory(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:5216</i>
     */
    FILE fopenReadFromMemory(ByteBuffer data, NativeSize size);

    /**
     * Original signature : <code>FILE* fopenWriteWinTempfile()</code><br>
     * <i>native declaration : allheaders.h:5218</i>
     */
    FILE fopenWriteWinTempfile();

//      /**
//       * Original signature :
//       * <code>FILE* lept_fopen(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5220</i>
//       */
//      FILE lept_fopen(String filename, String mode);
//  
//      /**
//       * Original signature : <code>l_int32 lept_fclose(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:5222</i>
//       */
//      int lept_fclose(FILE fp);
//  
//      /**
//       * Original signature : <code>void* lept_calloc(size_t, size_t)</code><br>
//       * <i>native declaration : allheaders.h:5224</i>
//       */
//      Pointer lept_calloc(NativeSize nmemb, NativeSize size);
    /**
     * Original signature : <code>void lept_free(void*)</code><br>
     * <i>native declaration : allheaders.h:5226</i>
     */
    void lept_free(Pointer ptr);

    /**
     * Original signature : <code>l_int32 lept_mkdir(const char*)</code><br>
     * <i>native declaration : allheaders.h:5228</i>
     */
    int lept_mkdir(String subdir);

    /**
     * Original signature : <code>l_int32 lept_rmdir(const char*)</code><br>
     * <i>native declaration : allheaders.h:5230</i>
     */
    int lept_rmdir(String subdir);

    /**
     * Original signature :
     * <code>void lept_direxists(const char*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5232</i>
     */
    void lept_direxists(String dir, IntBuffer pexists);

//      /**
//       * Original signature :
//       * <code>l_int32 lept_rm_match(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5234</i>
//       */
//      int lept_rm_match(String subdir, String substr);
    /**
     * Original signature :
     * <code>l_int32 lept_rm(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:5236</i>
     */
    int lept_rm(String subdir, String tail);
//  
//      /**
//       * Original signature : <code>l_int32 lept_rmfile(const char*)</code><br>
//       * <i>native declaration : allheaders.h:5238</i>
//       */
//      int lept_rmfile(String filepath);

//      /**
//       * Original signature :
//       * <code>l_int32 lept_mv(const char*, const char*, const char*, char**)</code><br>
//       * <i>native declaration : allheaders.h:5240</i>
//       */
//      int lept_mv(String srcfile, String newdir, String newtail, PointerByReference pnewpath);
//      /**
//       * Original signature :
//       * <code>l_int32 lept_cp(const char*, const char*, const char*, char**)</code><br>
//       * <i>native declaration : allheaders.h:5242</i>
//       */
//      int lept_cp(String srcfile, String newdir, String newtail, PointerByReference pnewpath);
//      /**
//       * Original signature :
//       * <code>l_int32 splitPathAtDirectory(const char*, char**, char**)</code><br>
//       * <i>native declaration : allheaders.h:5244</i>
//       */
//      int splitPathAtDirectory(String pathname, PointerByReference pdir, PointerByReference ptail);
//      /**
//       * Original signature :
//       * <code>l_int32 splitPathAtExtension(const char*, char**, char**)</code><br>
//       * <i>native declaration : allheaders.h:5246</i>
//       */
//      int splitPathAtExtension(String pathname, PointerByReference pbasename, PointerByReference pextension);
//      /**
//       * Original signature :
//       * <code>char* pathJoin(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5248</i>
//       */
//      Pointer pathJoin(String dir, String fname);
    /**
     * Original signature :
     * <code>char* appendSubdirs(const char*, const char*)</code><br>
     * <i>native declaration : allheaders.h:5250</i>
     */
    Pointer appendSubdirs(String basedir, String subdirs);

    /**
     * Original signature :
     * <code>l_int32 convertSepCharsInPath(char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5252</i>
     */
    int convertSepCharsInPath(ByteBuffer path, int type);

//      /**
//       * Original signature :
//       * <code>char* genPathname(const char*, const char*)</code><br>
//       * <i>native declaration : allheaders.h:5254</i>
//       */
//      Pointer genPathname(String dir, String fname);
    /**
     * Original signature :
     * <code>l_int32 makeTempDirname(char*, size_t, const char*)</code><br>
     * <i>native declaration : allheaders.h:5256</i>
     */
    int makeTempDirname(ByteBuffer result, NativeSize nbytes, String subdir);

    /**
     * Original signature :
     * <code>l_int32 modifyTrailingSlash(char*, size_t, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5258</i>
     */
    int modifyTrailingSlash(ByteBuffer path, NativeSize nbytes, int flag);

    /**
     * Original signature : <code>char* l_makeTempFilename()</code><br>
     * <i>native declaration : allheaders.h:5260</i>
     */
    Pointer l_makeTempFilename();

//      /**
//       * Original signature :
//       * <code>l_int32 extractNumberFromFilename(const char*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5262</i>
//       */
//      int extractNumberFromFilename(String fname, int numpre, int numpost);
    /**
     * Original signature :
     * <code>PIX* pixSimpleCaptcha(PIX*, l_int32, l_int32, l_uint32, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5264</i>
     */
    Pix pixSimpleCaptcha(Pix pixs, int border, int nterms, int seed, int color, int cmapflag);

    /**
     * Original signature :
     * <code>PIX* pixRandomHarmonicWarp(PIX*, l_float32, l_float32, l_float32, l_float32, l_int32, l_int32, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5266</i>
     */
    Pix pixRandomHarmonicWarp(Pix pixs, float xmag, float ymag, float xfreq, float yfreq, int nx, int ny, int seed, int grayval);

    /**
     * Original signature :
     * <code>PIX* pixWarpStereoscopic(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5268</i>
     */
    Pix pixWarpStereoscopic(Pix pixs, int zbend, int zshiftt, int zshiftb, int ybendt, int ybendb, int redleft);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontal(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5270</i>
     */
    Pix pixStretchHorizontal(Pix pixs, int dir, int type, int hmax, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5272</i>
     */
    Pix pixStretchHorizontalSampled(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStretchHorizontalLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5274</i>
     */
    Pix pixStretchHorizontalLI(Pix pixs, int dir, int type, int hmax, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShear(PIX*, l_int32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5276</i>
     */
    Pix pixQuadraticVShear(Pix pixs, int dir, int vmaxt, int vmaxb, int operation, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearSampled(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5278</i>
     */
    Pix pixQuadraticVShearSampled(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixQuadraticVShearLI(PIX*, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5280</i>
     */
    Pix pixQuadraticVShearLI(Pix pixs, int dir, int vmaxt, int vmaxb, int incolor);

    /**
     * Original signature :
     * <code>PIX* pixStereoFromPair(PIX*, PIX*, l_float32, l_float32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:5282</i>
     */
    Pix pixStereoFromPair(Pix pix1, Pix pix2, float rwt, float gwt, float bwt);

    /**
     * Original signature :
     * <code>L_WSHED* wshedCreate(PIX*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5284</i>
     */
    L_WShed wshedCreate(Pix pixs, Pix pixm, int mindepth, int debugflag);

    /**
     * Original signature : <code>void wshedDestroy(L_WSHED**)</code><br>
     * <i>native declaration : allheaders.h:5286</i>
     */
    void wshedDestroy(PointerByReference pwshed);

    /**
     * Original signature : <code>l_int32 wshedApply(L_WSHED*)</code><br>
     * <i>native declaration : allheaders.h:5288</i>
     */
    int wshedApply(L_WShed wshed);

    /**
     * Original signature :
     * <code>l_int32 wshedBasins(L_WSHED*, PIXA**, NUMA**)</code><br>
     * <i>native declaration : allheaders.h:5290</i>
     */
    int wshedBasins(L_WShed wshed, PointerByReference ppixa, PointerByReference pnalevels);

    /**
     * Original signature : <code>PIX* wshedRenderFill(L_WSHED*)</code><br>
     * <i>native declaration : allheaders.h:5292</i>
     */
    Pix wshedRenderFill(L_WShed wshed);

    /**
     * Original signature : <code>PIX* wshedRenderColors(L_WSHED*)</code><br>
     * <i>native declaration : allheaders.h:5294</i>
     */
    Pix wshedRenderColors(L_WShed wshed);
//  
//      /**
//       * Original signature : <code>PIX* pixReadStreamWebP(FILE*)</code><br>
//       * <i>native declaration : allheaders.h:5296</i>
//       */
//      Pix pixReadStreamWebP(FILE fp);

    /**
     * Original signature :
     * <code>PIX* pixReadMemWebP(const l_uint8*, size_t)</code><br>
     * <i>native declaration : allheaders.h:5298</i>
     */
    Pix pixReadMemWebP(ByteBuffer filedata, NativeSize filesize);

    /**
     * Original signature :
     * <code>l_int32 readHeaderWebP(const char*, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5300</i>
     */
    int readHeaderWebP(String filename, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_int32 readHeaderMemWebP(const l_uint8*, size_t, l_int32*, l_int32*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5302</i>
     */
    int readHeaderMemWebP(ByteBuffer data, NativeSize size, IntBuffer pw, IntBuffer ph, IntBuffer pspp);

    /**
     * Original signature :
     * <code>l_int32 pixWriteWebP(const char*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5304</i>
     */
    int pixWriteWebP(String filename, Pix pixs, int quality, int lossless);

//      /**
//       * Original signature :
//       * <code>l_int32 pixWriteStreamWebP(FILE*, PIX*, l_int32, l_int32)</code><br>
//       * <i>native declaration : allheaders.h:5306</i>
//       */
//      int pixWriteStreamWebP(FILE fp, Pix pixs, int quality, int lossless);
    /**
     * Original signature :
     * <code>l_int32 pixWriteMemWebP(l_uint8**, size_t*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5308</i>
     */
    int pixWriteMemWebP(PointerByReference pencdata, NativeSizeByReference pencsize, Pix pixs, int quality, int lossless);

    /**
     * Original signature :
     * <code>l_int32 pixaWriteFiles(const char*, PIXA*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5310</i>
     */
    int pixaWriteFiles(String rootname, Pixa pixa, int format);

    /**
     * Original signature :
     * <code>l_int32 pixWrite(const char*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5312</i>
     */
    int pixWrite(String fname, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_int32 pixWriteAutoFormat(const char*, PIX*)</code><br>
     * <i>native declaration : allheaders.h:5314</i>
     */
    int pixWriteAutoFormat(String filename, Pix pix);

    /**
     * Original signature :
     * <code>l_int32 pixWriteStream(FILE*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5316</i>
     */
    int pixWriteStream(FILE fp, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_int32 pixWriteImpliedFormat(const char*, PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5318</i>
     */
    int pixWriteImpliedFormat(String filename, Pix pix, int quality, int progressive);

    /**
     * Original signature : <code>l_int32 pixChooseOutputFormat(PIX*)</code><br>
     * <i>native declaration : allheaders.h:5320</i>
     */
    int pixChooseOutputFormat(Pix pix);

    /**
     * Original signature :
     * <code>l_int32 getImpliedFileFormat(const char*)</code><br>
     * <i>native declaration : allheaders.h:5322</i>
     */
    int getImpliedFileFormat(String filename);

    /**
     * Original signature :
     * <code>l_int32 pixGetAutoFormat(PIX*, l_int32*)</code><br>
     * <i>native declaration : allheaders.h:5324</i>
     */
    int pixGetAutoFormat(Pix pix, IntBuffer pformat);

    /**
     * Original signature : <code>char* getFormatExtension(l_int32)</code><br>
     * <i>native declaration : allheaders.h:5326</i>
     */
    Pointer getFormatExtension(int format);

    /**
     * Original signature :
     * <code>l_int32 pixWriteMem(l_uint8**, size_t*, PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5328</i>
     */
    int pixWriteMem(PointerByReference pdata, NativeSizeByReference psize, Pix pix, int format);

    /**
     * Original signature :
     * <code>l_int32 l_fileDisplay(const char*, l_int32, l_int32, l_float32)</code><br>
     * <i>native declaration : allheaders.h:5330</i>
     */
    int l_fileDisplay(String fname, int x, int y, float scale);

    /**
     * Original signature :
     * <code>l_int32 pixDisplay(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5332</i>
     */
    int pixDisplay(Pix pixs, int x, int y);

    /**
     * Original signature :
     * <code>l_int32 pixDisplayWithTitle(PIX*, l_int32, l_int32, const char*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5334</i>
     */
    int pixDisplayWithTitle(Pix pixs, int x, int y, String title, int dispflag);

    /**
     * Original signature :
     * <code>l_int32 pixSaveTiled(PIX*, PIXA*, l_float32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5336</i>
     */
    int pixSaveTiled(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int dp);

    /**
     * Original signature :
     * <code>l_int32 pixSaveTiledOutline(PIX*, PIXA*, l_float32, l_int32, l_int32, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5338</i>
     */
    int pixSaveTiledOutline(Pix pixs, Pixa pixa, float scalefactor, int newrow, int space, int linewidth, int dp);

    /**
     * Original signature :
     * <code>l_int32 pixSaveTiledWithText(PIX*, PIXA*, l_int32, l_int32, l_int32, l_int32, L_BMF*, const char*, l_uint32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5340</i>
     */
    int pixSaveTiledWithText(Pix pixs, Pixa pixa, int outwidth, int newrow, int space, int linewidth, L_Bmf bmf, String textstr, int val, int location);

    /**
     * Original signature : <code>void l_chooseDisplayProg(l_int32)</code><br>
     * <i>native declaration : allheaders.h:5342</i>
     */
    void l_chooseDisplayProg(int selection);

    /**
     * Original signature :
     * <code>l_int32 pixDisplayWrite(PIX*, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5344</i>
     */
    int pixDisplayWrite(Pix pixs, int reduction);

    /**
     * Original signature :
     * <code>l_int32 pixDisplayWriteFormat(PIX*, l_int32, l_int32)</code><br>
     * <i>native declaration : allheaders.h:5346</i>
     */
    int pixDisplayWriteFormat(Pix pixs, int reduction, int format);

    /**
     * Original signature :
     * <code>l_int32 pixDisplayMultiple(l_int32, l_float32, const char*)</code><br>
     * <i>native declaration : allheaders.h:5348</i>
     */
    int pixDisplayMultiple(int res, float scalefactor, String fileout);

    /**
     * Original signature :
     * <code>l_uint8* zlibCompress(l_uint8*, size_t, size_t*)</code><br>
     * <i>native declaration : allheaders.h:5350</i>
     */
    Pointer zlibCompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);

    /**
     * Original signature :
     * <code>l_uint8* zlibUncompress(l_uint8*, size_t, size_t*)</code><br>
     * <i>native declaration : allheaders.h:5352</i>
     */
    Pointer zlibUncompress(ByteBuffer datain, NativeSize nin, NativeSizeByReference pnout);
}
