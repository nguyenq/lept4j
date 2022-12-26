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

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

public interface ILeptonica {

    public static final int L_NOT_FOUND = 0;
	public static final int L_FOUND = 1;
	public static final int UNIX_PATH_SEPCHAR = 0;
	public static final int WIN_PATH_SEPCHAR = 1;
	/** Get the severity from the environment */
	public static final int L_SEVERITY_EXTERNAL = 0;
	/** Lowest severity: print all messages */
	public static final int L_SEVERITY_ALL = 1;
	/** Print debugging and higher messages */
	public static final int L_SEVERITY_DEBUG = 2;
	/** Print informational and higher messages */
	public static final int L_SEVERITY_INFO = 3;
	/** Print warning and higher messages */
	public static final int L_SEVERITY_WARNING = 4;
	/** Print error and higher messages */
	public static final int L_SEVERITY_ERROR = 5;
	/** Highest severity: print no messages */
	public static final int L_SEVERITY_NONE = 6;
	/** linear */
	public static final int L_LINEAR_INTERP = 1;
	/** quadratic */
	public static final int L_QUADRATIC_INTERP = 2;
	/** extended with same value */
	public static final int L_CONTINUED_BORDER = 1;
	/** extended with constant normal derivative */
	public static final int L_SLOPE_BORDER = 2;
	/** mirrored */
	public static final int L_MIRRORED_BORDER = 3;
	/** convert to integer */
	public static final int L_INTEGER_VALUE = 1;
	/** convert to float */
	public static final int L_FLOAT_VALUE = 2;
	/** invalid operation */
	public static final int L_UNDEFINED = 0;
	/** check if this key/val has been stored */
	public static final int L_HMAP_CHECK = 1;
	/** create and store a hashitem if not found */
	public static final int L_HMAP_CREATE = 2;
	/** null the pointer only */
	public static final int L_NO_COMPACTION = 1;
	/** compact the array */
	public static final int L_COMPACTION = 2;
	/** choose based on number of holes */
	public static final int L_AUTO_DOWNSHIFT = 0;
	/** downshifts min # of ptrs below insert */
	public static final int L_MIN_DOWNSHIFT = 1;
	/** downshifts all ptrs below insert */
	public static final int L_FULL_DOWNSHIFT = 2;
	/** ptr to L_Ptra; caller can inspect only */
	public static final int L_HANDLE_ONLY = 0;
	/** caller owns; destroy or save in L_Ptraa */
	public static final int L_REMOVE = 1;
	public static final int L_INT_TYPE = 1;
	public static final int L_UINT_TYPE = 2;
	public static final int L_FLOAT_TYPE = 3;
	/** tab or space at beginning of line */
	public static final int SPLIT_ON_LEADING_WHITE = 1;
	/** newline with optional white space */
	public static final int SPLIT_ON_BLANK_LINE = 2;
	/** leading white space or newline */
	public static final int SPLIT_ON_BOTH = 3;
	public static final int CCB_LOCAL_COORDS = 1;
	public static final int CCB_GLOBAL_COORDS = 2;
	public static final int CCB_SAVE_ALL_PTS = 1;
	public static final int CCB_SAVE_TURNING_PTS = 2;
	/**
	 * gplot.h<br>
	 * <pre><br>
	 *   Data structures and parameters for generating gnuplot files<br>
	 *   We used to support X11 output, but recent versions of gnuplot do not<br>
	 *   support the X11 terminal.  To get display to your screen, use<br>
	 *   GPLOT_PNG output; e.g.,<br>
	 *       gplotSimple1(na, GPLOT_PNG, "/tmp/someroot", ...);<br>
	 *       l_fileDisplay("/tmp/someroot.png", ...);<br>
	 * </pre><br>
	 * enum values
	 */
	public static interface GPLOT_STYLE {
		public static final int GPLOT_LINES = 0;
		public static final int GPLOT_POINTS = 1;
		public static final int GPLOT_IMPULSES = 2;
		public static final int GPLOT_LINESPOINTS = 3;
		public static final int GPLOT_DOTS = 4;
	};
	/**
	 * enum values
	 */
	public static interface GPLOT_OUTPUT {
		public static final int GPLOT_NONE = 0;
		public static final int GPLOT_PNG = 1;
		public static final int GPLOT_PS = 2;
		public static final int GPLOT_EPS = 3;
		public static final int GPLOT_LATEX = 4;
		public static final int GPLOT_PNM = 5;
	};
	/**
	 * enum values
	 */
	public static interface GPLOT_SCALING {
		/**
		 * default
		 */
		public static final int GPLOT_LINEAR_SCALE = 0;
		public static final int GPLOT_LOG_SCALE_X = 1;
		public static final int GPLOT_LOG_SCALE_Y = 2;
		public static final int GPLOT_LOG_SCALE_X_Y = 3;
	};
	public static final int IFF_UNKNOWN = 0;
	public static final int IFF_BMP = 1;
	public static final int IFF_JFIF_JPEG = 2;
	public static final int IFF_PNG = 3;
	public static final int IFF_TIFF = 4;
	public static final int IFF_TIFF_PACKBITS = 5;
	public static final int IFF_TIFF_RLE = 6;
	public static final int IFF_TIFF_G3 = 7;
	public static final int IFF_TIFF_G4 = 8;
	public static final int IFF_TIFF_LZW = 9;
	public static final int IFF_TIFF_ZIP = 10;
	public static final int IFF_PNM = 11;
	public static final int IFF_PS = 12;
	public static final int IFF_GIF = 13;
	public static final int IFF_JP2 = 14;
	public static final int IFF_WEBP = 15;
	public static final int IFF_LPDF = 16;
	public static final int IFF_TIFF_JPEG = 17;
	public static final int IFF_DEFAULT = 18;
	public static final int IFF_SPIX = 19;
	/** BM - for bitmaps */
	public static final int BMP_ID = 0x4d42;
	/** MM - for 'motorola' */
	public static final int TIFF_BIGEND_ID = 0x4d4d;
	/** II - for 'intel' */
	public static final int TIFF_LITTLEEND_ID = 0x4949;
	/** only want luminance data; no chroma */
	public static final int L_JPEG_READ_LUMINANCE = 1;
	/** return possibly damaged pix */
	public static final int L_JPEG_CONTINUE_WITH_BAD_DATA = 2;
	/** codestream */
	public static final int L_J2K_CODEC = 1;
	/** file format with 'ihdr' */
	public static final int L_JP2_CODEC = 2;
	/** use default encoding based on image */
	public static final int L_DEFAULT_ENCODE = 0;
	/** use dct encoding: 8 and 32 bpp, no cmap */
	public static final int L_JPEG_ENCODE = 1;
	/** use ccitt g4 fax encoding: 1 bpp */
	public static final int L_G4_ENCODE = 2;
	/** use flate encoding: any depth, cmap ok */
	public static final int L_FLATE_ENCODE = 3;
	/** use jp2k encoding: 8 and 32 bpp, no cmap */
	public static final int L_JP2K_ENCODE = 4;
	/** first image to be used */
	public static final int L_FIRST_IMAGE = 1;
	/** intermediate image; not first or last */
	public static final int L_NEXT_IMAGE = 2;
	/** last image to be used */
	public static final int L_LAST_IMAGE = 3;
	public static final int JB_RANKHAUS = 0;
	public static final int JB_CORRELATION = 1;
	public static final int JB_CONN_COMPS = 0;
	public static final int JB_CHARACTERS = 1;
	public static final int JB_WORDS = 2;
	public static final int SYMMETRIC_MORPH_BC = 0;
	public static final int ASYMMETRIC_MORPH_BC = 1;
	public static final int SEL_DONT_CARE = 0;
	public static final int SEL_HIT = 1;
	public static final int SEL_MISS = 2;
	public static final int L_RUN_OFF = 0;
	public static final int L_RUN_ON = 1;
	public static final int L_HORIZ = 1;
	public static final int L_VERT = 2;
	public static final int L_BOTH_DIRECTIONS = 3;
	public static final int L_MORPH_DILATE = 1;
	public static final int L_MORPH_ERODE = 2;
	public static final int L_MORPH_OPEN = 3;
	public static final int L_MORPH_CLOSE = 4;
	public static final int L_MORPH_HMT = 5;
	public static final int L_LINEAR_SCALE = 1;
	public static final int L_LOG_SCALE = 2;
	public static final int L_TOPHAT_WHITE = 0;
	public static final int L_TOPHAT_BLACK = 1;
	public static final int L_ARITH_ADD = 1;
	public static final int L_ARITH_SUBTRACT = 2;
	/** on numas only */
	public static final int L_ARITH_MULTIPLY = 3;
	/** on numas only */
	public static final int L_ARITH_DIVIDE = 4;
	/** on numas only */
	public static final int L_UNION = 5;
	/** on numas only */
	public static final int L_INTERSECTION = 6;
	/** on numas only */
	public static final int L_SUBTRACTION = 7;
	/** on numas only */
	public static final int L_EXCLUSIVE_OR = 8;
	/** useful in a downscaling "erosion" */
	public static final int L_CHOOSE_MIN = 1;
	/** useful in a downscaling "dilation" */
	public static final int L_CHOOSE_MAX = 2;
	/** useful in a downscaling contrast */
	public static final int L_CHOOSE_MAXDIFF = 3;
	/** use a modification of the min value */
	public static final int L_CHOOSE_MIN_BOOST = 4;
	/** use a modification of the max value */
	public static final int L_CHOOSE_MAX_BOOST = 5;
	/** assume bg outside image */
	public static final int L_BOUNDARY_BG = 1;
	/** assume fg outside image */
	public static final int L_BOUNDARY_FG = 2;
	public static final int L_COMPARE_XOR = 1;
	public static final int L_COMPARE_SUBTRACT = 2;
	public static final int L_COMPARE_ABS_DIFF = 3;
	/** red color index in RGBA_QUAD */
	public static final int COLOR_RED = 0;
	/** green color index in RGBA_QUAD */
	public static final int COLOR_GREEN = 1;
	/** blue color index in RGBA_QUAD */
	public static final int COLOR_BLUE = 2;
	/** alpha value index in RGBA_QUAD */
	public static final int L_ALPHA_CHANNEL = 3;
	/** draw in red */
	public static final int L_DRAW_RED = 0;
	/** draw in green */
	public static final int L_DRAW_GREEN = 1;
	/** draw in blue */
	public static final int L_DRAW_BLUE = 2;
	/** draw specified color */
	public static final int L_DRAW_SPECIFIED = 3;
	/** draw as sequence of r,g,b */
	public static final int L_DRAW_RGB = 4;
	/** draw randomly chosen colors */
	public static final int L_DRAW_RANDOM = 5;
	/** remove colormap for conv to 1 bpp */
	public static final int REMOVE_CMAP_TO_BINARY = 0;
	/** remove colormap for conv to 8 bpp */
	public static final int REMOVE_CMAP_TO_GRAYSCALE = 1;
	/** remove colormap for conv to 32 bpp */
	public static final int REMOVE_CMAP_TO_FULL_COLOR = 2;
	/** remove colormap and alpha */
	public static final int REMOVE_CMAP_WITH_ALPHA = 3;
	/** remove depending on src format */
	public static final int REMOVE_CMAP_BASED_ON_SRC = 4;
	/** do not copy the object; do not delete the ptr */
	public static final int L_NOCOPY = 0;
	/** stuff it in; do not copy or clone */
	public static final int L_INSERT = L_NOCOPY;
	/** make/use a copy of the object */
	public static final int L_COPY = 1;
	/** make/use clone (ref count) of the object */
	public static final int L_CLONE = 2;
	/** make a new array object (e.g., pixa) and fill */
	public static final int L_COPY_CLONE = 3;
	/** use shell sort */
	public static final int L_SHELL_SORT = 1;
	/** use bin sort */
	public static final int L_BIN_SORT = 2;
	/** sort in increasing order */
	public static final int L_SORT_INCREASING = 1;
	/** sort in decreasing order */
	public static final int L_SORT_DECREASING = 2;
	/** sort box or c.c. by left edge location */
	public static final int L_SORT_BY_X = 1;
	/** sort box or c.c. by top edge location */
	public static final int L_SORT_BY_Y = 2;
	/** sort box or c.c. by right edge location */
	public static final int L_SORT_BY_RIGHT = 3;
	/** sort box or c.c. by bot edge location */
	public static final int L_SORT_BY_BOT = 4;
	/** sort box or c.c. by width */
	public static final int L_SORT_BY_WIDTH = 5;
	/** sort box or c.c. by height */
	public static final int L_SORT_BY_HEIGHT = 6;
	/** sort box or c.c. by min dimension */
	public static final int L_SORT_BY_MIN_DIMENSION = 7;
	/** sort box or c.c. by max dimension */
	public static final int L_SORT_BY_MAX_DIMENSION = 8;
	/** sort box or c.c. by perimeter */
	public static final int L_SORT_BY_PERIMETER = 9;
	/** sort box or c.c. by area */
	public static final int L_SORT_BY_AREA = 10;
	/** sort box or c.c. by width/height ratio */
	public static final int L_SORT_BY_ASPECT_RATIO = 11;
	/** add some of src inverse to itself */
	public static final int L_BLEND_WITH_INVERSE = 1;
	/** shift src colors towards white */
	public static final int L_BLEND_TO_WHITE = 2;
	/** shift src colors towards black */
	public static final int L_BLEND_TO_BLACK = 3;
	/** blend src directly with blender */
	public static final int L_BLEND_GRAY = 4;
	/** add amount of src inverse to itself, */
	public static final int L_BLEND_GRAY_WITH_INVERSE = 5;
	/** colorize non-black pixels */
	public static final int L_PAINT_LIGHT = 1;
	/** colorize non-white pixels */
	public static final int L_PAINT_DARK = 2;
	/** set all bits in each pixel to 1 */
	public static final int L_SET_PIXELS = 1;
	/** set all bits in each pixel to 0 */
	public static final int L_CLEAR_PIXELS = 2;
	/** flip all bits in each pixel */
	public static final int L_FLIP_PIXELS = 3;
	/** save if value is less than threshold */
	public static final int L_SELECT_IF_LT = 1;
	/** save if value is more than threshold */
	public static final int L_SELECT_IF_GT = 2;
	/** save if value is &lt;= to the threshold */
	public static final int L_SELECT_IF_LTE = 3;
	/** save if value is &gt;= to the threshold */
	public static final int L_SELECT_IF_GTE = 4;
	/** select by width; 1 bpp */
	public static final int L_SELECT_BY_WIDTH = 1;
	/** select by height; 1 bpp */
	public static final int L_SELECT_BY_HEIGHT = 2;
	/** select by max of width and */
	public static final int L_SELECT_BY_MAX_DIMENSION = 3;
	/** select by foreground area; 1 bpp */
	public static final int L_SELECT_BY_AREA = 4;
	/** select by perimeter; 1 bpp */
	public static final int L_SELECT_BY_PERIMETER = 5;
	/** width must satisfy constraint */
	public static final int L_SELECT_WIDTH = 1;
	/** height must satisfy constraint */
	public static final int L_SELECT_HEIGHT = 2;
	/** x value must satisfy constraint */
	public static final int L_SELECT_XVAL = 3;
	/** y value must satisfy constraint */
	public static final int L_SELECT_YVAL = 4;
	/** either width or height (or xval */
	public static final int L_SELECT_IF_EITHER = 5;
	/** both width and height (or xval */
	public static final int L_SELECT_IF_BOTH = 6;
	/** check and possibly modify width */
	public static final int L_CHECK_WIDTH = 1;
	/** check and possibly modify height */
	public static final int L_CHECK_HEIGHT = 2;
	/** check and possibly modify both */
	public static final int L_CHECK_BOTH = 3;
	/** use red component */
	public static final int L_SELECT_RED = 1;
	/** use green component */
	public static final int L_SELECT_GREEN = 2;
	/** use blue component */
	public static final int L_SELECT_BLUE = 3;
	/** use min color component */
	public static final int L_SELECT_MIN = 4;
	/** use max color component */
	public static final int L_SELECT_MAX = 5;
	/** use average of color components */
	public static final int L_SELECT_AVERAGE = 6;
	/** use hue value (in HSV color space) */
	public static final int L_SELECT_HUE = 7;
	/** use saturation value (in HSV space) */
	public static final int L_SELECT_SATURATION = 8;
	/** use weighted average of color comps */
	public static final int L_SELECT_WEIGHTED = 9;
	/** intermediate of diff component values */
	public static final int L_INTERMED_DIFF = 1;
	/** diff average closest comps to third */
	public static final int L_AVE_MAX_DIFF_2 = 2;
	/** maximum diff of component values */
	public static final int L_MAX_DIFF = 3;
	/** use LSB */
	public static final int L_LS_BYTE = 1;
	/** use MSB */
	public static final int L_MS_BYTE = 2;
	/** use LSB if max(val) &lt; 256; else MSB */
	public static final int L_AUTO_BYTE = 3;
	/** use max(val, 255) */
	public static final int L_CLIP_TO_FF = 4;
	/** use two LSB */
	public static final int L_LS_TWO_BYTES = 5;
	/** use two MSB */
	public static final int L_MS_TWO_BYTES = 6;
	/** use max(val, 65535) */
	public static final int L_CLIP_TO_FFFF = 7;
	/** use area map rotation, if possible */
	public static final int L_ROTATE_AREA_MAP = 1;
	/** use shear rotation */
	public static final int L_ROTATE_SHEAR = 2;
	/** use sampling */
	public static final int L_ROTATE_SAMPLING = 3;
	/** bring in white pixels from the outside */
	public static final int L_BRING_IN_WHITE = 1;
	/** bring in black pixels from the outside */
	public static final int L_BRING_IN_BLACK = 2;
	/** shear image about UL corner */
	public static final int L_SHEAR_ABOUT_CORNER = 1;
	/** shear image about center */
	public static final int L_SHEAR_ABOUT_CENTER = 2;
	/** translate, scale, rotate */
	public static final int L_TR_SC_RO = 1;
	/** scale, rotate, translate */
	public static final int L_SC_RO_TR = 2;
	/** rotate, translate, scale */
	public static final int L_RO_TR_SC = 3;
	/** translate, rotate, scale */
	public static final int L_TR_RO_SC = 4;
	/** rotate, scale, translate */
	public static final int L_RO_SC_TR = 5;
	/** scale, translate, rotate */
	public static final int L_SC_TR_RO = 6;
	/** fill white pixels (e.g, in fg map) */
	public static final int L_FILL_WHITE = 1;
	/** fill black pixels (e.g., in bg map) */
	public static final int L_FILL_BLACK = 2;
	/** set pixels to white */
	public static final int L_SET_WHITE = 1;
	/** set pixels to black */
	public static final int L_SET_BLACK = 2;
	/** get white pixel value */
	public static final int L_GET_WHITE_VAL = 1;
	/** get black pixel value */
	public static final int L_GET_BLACK_VAL = 2;
	/** white pixels are 0xff or 0xffff; black are 0 */
	public static final int L_WHITE_IS_MAX = 1;
	/** black pixels are 0xff or 0xffff; white are 0 */
	public static final int L_BLACK_IS_MAX = 2;
	/** dist to black with no prop; 1 bpp */
	public static final int DEFAULT_CLIP_LOWER_1 = 10;
	/** dist to black with no prop; 1 bpp */
	public static final int DEFAULT_CLIP_UPPER_1 = 10;
	/** dist to black with no prop; 2 bpp */
	public static final int DEFAULT_CLIP_LOWER_2 = 5;
	/** dist to black with no prop; 2 bpp */
	public static final int DEFAULT_CLIP_UPPER_2 = 5;
	/** L1 distance (e.g., in color space) */
	public static final int L_MANHATTAN_DISTANCE = 1;
	/** L2 distance */
	public static final int L_EUCLIDEAN_DISTANCE = 2;
	/** values &lt; 0 */
	public static final int L_NEGATIVE = 1;
	/** values &gt;= 0 */
	public static final int L_NON_NEGATIVE = 2;
	/** values &gt; 0 */
	public static final int L_POSITIVE = 3;
	/** values &lt;= 0 */
	public static final int L_NON_POSITIVE = 4;
	/** values = 0 */
	public static final int L_ZERO = 5;
	/** all values */
	public static final int L_ALL = 6;
	/** average of abs values */
	public static final int L_MEAN_ABSVAL = 1;
	/** median value of set */
	public static final int L_MEDIAN_VAL = 2;
	/** mode value of set */
	public static final int L_MODE_VAL = 3;
	/** mode count of set */
	public static final int L_MODE_COUNT = 4;
	/** rms of values */
	public static final int L_ROOT_MEAN_SQUARE = 5;
	/** standard deviation from mean */
	public static final int L_STANDARD_DEVIATION = 6;
	/** variance of values */
	public static final int L_VARIANCE = 7;
	/** select 'n' consecutive */
	public static final int L_CHOOSE_CONSECUTIVE = 1;
	/** select at intervals of 'n' */
	public static final int L_CHOOSE_SKIP_BY = 2;
	/** low confidence on text orientation */
	public static final int L_TEXT_ORIENT_UNKNOWN = 0;
	/** portrait, text rightside-up */
	public static final int L_TEXT_ORIENT_UP = 1;
	/** landscape, text up to left */
	public static final int L_TEXT_ORIENT_LEFT = 2;
	/** portrait, text upside-down */
	public static final int L_TEXT_ORIENT_DOWN = 3;
	/** landscape, text up to right */
	public static final int L_TEXT_ORIENT_RIGHT = 4;
	/** filters for horizontal edges */
	public static final int L_HORIZONTAL_EDGES = 0;
	/** filters for vertical edges */
	public static final int L_VERTICAL_EDGES = 1;
	/** filters for all edges */
	public static final int L_ALL_EDGES = 2;
	/** horizontal line */
	public static final int L_HORIZONTAL_LINE = 0;
	/** 45 degree line with positive slope */
	public static final int L_POS_SLOPE_LINE = 1;
	/** vertical line */
	public static final int L_VERTICAL_LINE = 2;
	/** 45 degree line with negative slope */
	public static final int L_NEG_SLOPE_LINE = 3;
	/** neither horizontal nor vertical */
	public static final int L_OBLIQUE_LINE = 4;
	/** typical: page is viewed with height &gt; width */
	public static final int L_PORTRAIT_MODE = 0;
	/** page is viewed at 90 deg to portrait mode */
	public static final int L_LANDSCAPE_MODE = 1;
	/** scan from left */
	public static final int L_FROM_LEFT = 0;
	/** scan from right */
	public static final int L_FROM_RIGHT = 1;
	/** scan from top */
	public static final int L_FROM_TOP = 2;
	/** scan from bottom */
	public static final int L_FROM_BOT = 3;
	/** scan in negative direction */
	public static final int L_SCAN_NEGATIVE = 4;
	/** scan in positive direction */
	public static final int L_SCAN_POSITIVE = 5;
	/** scan in both directions */
	public static final int L_SCAN_BOTH = 6;
	/** horizontal scan (direction unimportant) */
	public static final int L_SCAN_HORIZONTAL = 7;
	/** vertical scan (direction unimportant) */
	public static final int L_SCAN_VERTICAL = 8;
	/** do not adjust */
	public static final int L_ADJUST_SKIP = 0;
	/** adjust left edge */
	public static final int L_ADJUST_LEFT = 1;
	/** adjust right edge */
	public static final int L_ADJUST_RIGHT = 2;
	/** adjust both left and right edges */
	public static final int L_ADJUST_LEFT_AND_RIGHT = 3;
	/** adjust top edge */
	public static final int L_ADJUST_TOP = 4;
	/** adjust bottom edge */
	public static final int L_ADJUST_BOT = 5;
	/** adjust both top and bottom edges */
	public static final int L_ADJUST_TOP_AND_BOT = 6;
	/** choose the min median value */
	public static final int L_ADJUST_CHOOSE_MIN = 7;
	/** choose the max median value */
	public static final int L_ADJUST_CHOOSE_MAX = 8;
	/** set left side to a given value */
	public static final int L_SET_LEFT = 9;
	/** set right side to a given value */
	public static final int L_SET_RIGHT = 10;
	/** set top side to a given value */
	public static final int L_SET_TOP = 11;
	/** set bottom side to a given value */
	public static final int L_SET_BOT = 12;
	/** get left side location */
	public static final int L_GET_LEFT = 13;
	/** get right side location */
	public static final int L_GET_RIGHT = 14;
	/** get top side location */
	public static final int L_GET_TOP = 15;
	/** get bottom side location */
	public static final int L_GET_BOT = 16;
	/** use boundaries giving min size */
	public static final int L_USE_MINSIZE = 1;
	/** use boundaries giving max size */
	public static final int L_USE_MAXSIZE = 2;
	/** modify boundary if big location diff */
	public static final int L_SUB_ON_LOC_DIFF = 3;
	/** modify boundary if big size diff */
	public static final int L_SUB_ON_SIZE_DIFF = 4;
	/** modify boundary with capped min */
	public static final int L_USE_CAPPED_MIN = 5;
	/** modify boundary with capped max */
	public static final int L_USE_CAPPED_MAX = 6;
	/** resize to bounding region; remove smaller */
	public static final int L_COMBINE = 1;
	/** only remove smaller */
	public static final int L_REMOVE_SMALL = 2;
	/** use union of two boxes */
	public static final int L_GEOMETRIC_UNION = 1;
	/** use intersection of two boxes */
	public static final int L_GEOMETRIC_INTERSECTION = 2;
	/** use box with largest area */
	public static final int L_LARGEST_AREA = 3;
	/** use box with smallest area */
	public static final int L_SMALLEST_AREA = 4;
	/** consider all boxes in the sequence */
	public static final int L_USE_ALL_BOXES = 1;
	/** consider boxes with the same parity */
	public static final int L_USE_SAME_PARITY_BOXES = 2;
	/** UL corner */
	public static final int L_UPPER_LEFT = 1;
	/** UR corner */
	public static final int L_UPPER_RIGHT = 2;
	/** LL corner */
	public static final int L_LOWER_LEFT = 3;
	/** LR corner */
	public static final int L_LOWER_RIGHT = 4;
	/** center */
	public static final int L_BOX_CENTER = 5;
	/** increasing stretch or contraction to left */
	public static final int L_WARP_TO_LEFT = 1;
	/** increasing stretch or contraction to right */
	public static final int L_WARP_TO_RIGHT = 2;
	/** stretch or contraction grows linearly */
	public static final int L_LINEAR_WARP = 1;
	/** stretch or contraction grows quadratically */
	public static final int L_QUADRATIC_WARP = 2;
	/** linear interpolation from src pixels */
	public static final int L_INTERPOLATED = 1;
	/** nearest src pixel sampling only */
	public static final int L_SAMPLED = 2;
	/** thin foreground of 1 bpp image */
	public static final int L_THIN_FG = 1;
	/** thin background of 1 bpp image */
	public static final int L_THIN_BG = 2;
	/** determine runlengths of horizontal runs */
	public static final int L_HORIZONTAL_RUNS = 0;
	/** determine runlengths of vertical runs */
	public static final int L_VERTICAL_RUNS = 1;
	/** Sobel edge filter */
	public static final int L_SOBEL_EDGE = 1;
	/** Two-sided edge filter */
	public static final int L_TWO_SIDED_EDGE = 2;
	/** sensor order left-to-right RGB */
	public static final int L_SUBPIXEL_ORDER_RGB = 1;
	/** sensor order left-to-right BGR */
	public static final int L_SUBPIXEL_ORDER_BGR = 2;
	/** sensor order top-to-bottom RGB */
	public static final int L_SUBPIXEL_ORDER_VRGB = 3;
	/** sensor order top-to-bottom BGR */
	public static final int L_SUBPIXEL_ORDER_VBGR = 4;
	/** Use hue-saturation histogram */
	public static final int L_HS_HISTO = 1;
	/** Use hue-value histogram */
	public static final int L_HV_HISTO = 2;
	/** Use saturation-value histogram */
	public static final int L_SV_HISTO = 3;
	/** Use pixels with specified HSV region */
	public static final int L_INCLUDE_REGION = 1;
	/** Use pixels outside HSV region */
	public static final int L_EXCLUDE_REGION = 2;
	/** Add text above the image */
	public static final int L_ADD_ABOVE = 1;
	/** Add text below the image */
	public static final int L_ADD_BELOW = 2;
	/** Add text to the left of the image */
	public static final int L_ADD_LEFT = 3;
	/** Add text to the right of the image */
	public static final int L_ADD_RIGHT = 4;
	/** Add text over the top of the image */
	public static final int L_ADD_AT_TOP = 5;
	/** Add text over the bottom of the image */
	public static final int L_ADD_AT_BOT = 6;
	/** Add text over left side of the image */
	public static final int L_ADD_AT_LEFT = 7;
	/** Add text over right side of the image */
	public static final int L_ADD_AT_RIGHT = 8;
	/** Plot horizontally at top */
	public static final int L_PLOT_AT_TOP = 1;
	/** Plot horizontally at middle */
	public static final int L_PLOT_AT_MID_HORIZ = 2;
	/** Plot horizontally at bottom */
	public static final int L_PLOT_AT_BOT = 3;
	/** Plot vertically at left */
	public static final int L_PLOT_AT_LEFT = 4;
	/** Plot vertically at middle */
	public static final int L_PLOT_AT_MID_VERT = 5;
	/** Plot vertically at right */
	public static final int L_PLOT_AT_RIGHT = 6;
	/** Select the interior part */
	public static final int L_USE_INNER = 1;
	/** Select the outer part (e.g., a frame) */
	public static final int L_USE_OUTER = 2;
	/** Use xzgv with pixDisplay() */
	public static final int L_DISPLAY_WITH_XZGV = 1;
	/** Use xli with pixDisplay() */
	public static final int L_DISPLAY_WITH_XLI = 2;
	/** Use xv with pixDisplay() */
	public static final int L_DISPLAY_WITH_XV = 3;
	/** Use irfvanview (win) with pixDisplay() */
	public static final int L_DISPLAY_WITH_IV = 4;
	/** Use open (apple) with pixDisplay() */
	public static final int L_DISPLAY_WITH_OPEN = 5;
	/** Write full resolution chroma */
	public static final int L_NO_CHROMA_SAMPLING_JPEG = 1;
	/** Clip negative values to 0 */
	public static final int L_CLIP_TO_ZERO = 1;
	/** Convert to positive using L_ABS() */
	public static final int L_TAKE_ABSVAL = 2;
	/** Choose values less than zero */
	public static final int L_LESS_THAN_ZERO = 1;
	/** Choose values equal to zero */
	public static final int L_EQUAL_TO_ZERO = 2;
	/** Choose values greater than zero */
	public static final int L_GREATER_THAN_ZERO = 3;
	/** Add trailing slash to string */
	public static final int L_ADD_TRAIL_SLASH = 1;
	/** Remove trailing slash from string */
	public static final int L_REMOVE_TRAIL_SLASH = 2;
	/** character set type is not specified */
	public static final int L_UNKNOWN = 0;
	/** 10 digits */
	public static final int L_ARABIC_NUMERALS = 1;
	/** 7 lower-case letters (i,v,x,l,c,d,m) */
	public static final int L_LC_ROMAN_NUMERALS = 2;
	/** 7 upper-case letters (I,V,X,L,C,D,M) */
	public static final int L_UC_ROMAN_NUMERALS = 3;
	/** 26 lower-case letters */
	public static final int L_LC_ALPHA = 4;
	/** 26 upper-case letters */
	public static final int L_UC_ALPHA = 5;
	/** use all templates; default */
	public static final int L_USE_ALL_TEMPLATES = 0;
	/** use average templates; special cases */
	public static final int L_USE_AVERAGE_TEMPLATES = 1;
	public static final int L_REG_GENERATE = 0;
	public static final int L_REG_COMPARE = 1;
	public static final int L_REG_DISPLAY = 2;
	/** typedef for the data type */
	public static final int L_STR_TYPE = 0;
	/** name of the data type */
	public static final int L_STR_NAME = 1;
	/** reader to get the data type from file */
	public static final int L_STR_READER = 2;
	/** reader to get the compressed string in memory */
	public static final int L_STR_MEMREADER = 3;
	public static final int L_SUDOKU_INIT = 0;
	public static final int L_SUDOKU_STATE = 1;
	/**
	 * -------------------------------------------------------------------------*<br>
	 *    Standard size of border added around images for special processing   *<br>
	 * -------------------------------------------------------------------------<br>
	 * pixels, not bits
	 */
	public static final int ADDED_BORDER = 32;
	/**
	 * Conversion Error : sizeof(l_uint32)<br>
	 * SKIPPED:<br>
	 * static const l_int32 L_RED_SHIFT = 8 * (sizeof(l_uint32) - 1 - COLOR_RED);
	 */
	/**
	 * Conversion Error : sizeof(l_uint32)<br>
	 * SKIPPED:<br>
	 * static const l_int32 L_GREEN_SHIFT = 8 * (sizeof(l_uint32) - 1 - COLOR_GREEN);
	 */
	/**
	 * Conversion Error : sizeof(l_uint32)<br>
	 * SKIPPED:<br>
	 * static const l_int32 L_BLUE_SHIFT = 8 * (sizeof(l_uint32) - 1 - COLOR_BLUE);
	 */
	/**
	 * Conversion Error : sizeof(l_uint32)<br>
	 * SKIPPED:<br>
	 * static const l_int32 L_ALPHA_SHIFT = 8 * (sizeof(l_uint32) - 1 - L_ALPHA_CHANNEL);
	 */
	/**
	 * <pre><br>
	 *  Notes:<br>
	 *      (1) These perceptual weighting factors are ad-hoc, but they do<br>
	 *          add up to 1.  Unlike, for example, the weighting factors for<br>
	 *          converting RGB to luminance, or more specifically to Y in the<br>
	 *          YUV colorspace.  Those numbers come from the<br>
	 *          International Telecommunications Union, via ITU-R.<br>
	 * </pre><br>
	 * Percept. weight for red
	 */
	public static final float L_RED_WEIGHT = 0.3f;
	/** Percept. weight for green */
	public static final float L_GREEN_WEIGHT = 0.5f;
	/** Percept. weight for blue */
	public static final float L_BLUE_WEIGHT = 0.2f;
	public static final int LIBLEPT_MAJOR_VERSION = (int)1;
	public static final int LIBLEPT_MINOR_VERSION = (int)83;
	public static final int LIBLEPT_PATCH_VERSION = (int)0;
	public static final int HAVE_LIBJPEG = (int)1;
	public static final int HAVE_LIBTIFF = (int)1;
	public static final int HAVE_LIBPNG = (int)1;
	public static final int HAVE_LIBZ = (int)1;
	public static final int HAVE_LIBGIF = (int)0;
	public static final int HAVE_LIBUNGIF = (int)0;
	public static final int HAVE_LIBWEBP = (int)0;
	public static final int HAVE_LIBWEBP_ANIM = (int)0;
	public static final int HAVE_LIBJP2K = (int)0;
	public static final int USE_BMPIO = (int)1;
	public static final int USE_PNMIO = (int)1;
	public static final int USE_JP2KHEADER = (int)1;
	public static final int USE_PDFIO = (int)1;
	public static final int USE_PSIO = (int)1;
	public static final int HAVE_FSTATAT = (int)0;
        public static final int HAVE_DIRFD = (int)0;
	public static final int UNDEF = (int)-1;
	public static final int NULL = (int)0;
	public static final int TRUE = (int)1;
	public static final int FALSE = (int)0;
	public static final int NUMA_VERSION_NUMBER = (int)1;
	public static final int DNA_VERSION_NUMBER = (int)1;
	public static final int SARRAY_VERSION_NUMBER = (int)1;
	public static final int USE_INLINE_ACCESSORS = (int)1;
	public static final int DEWARP_VERSION_NUMBER = (int)4;
	public static final int GPLOT_VERSION_NUMBER = (int)1;
	public static final int NUM_GPLOT_STYLES = (int)5;
	public static final int NUM_GPLOT_OUTPUTS = (int)6;
	public static final String JB_TEMPLATE_EXT = (String)".templates.png";
	public static final String JB_DATA_EXT = (String)".data";
	public static final int SEL_VERSION_NUMBER = (int)1;
	public static final int KERNEL_VERSION_NUMBER = (int)2;
	public static final int PIX_SRC = (int)(0xc);
	public static final int PIX_DST = (int)(0xa);
	public static final int PIX_CLR = (int)(0x0);
	public static final int PIX_SET = (int)(0xf);
	public static final int PIX_PAINT = (int)((0xc) | (0xa));
	public static final int PIX_MASK = (int)((0xc) & (0xa));
	public static final int PIX_SUBTRACT = (int)((0xa) & ((0xc) ^ 0x0f));
	public static final int PIX_XOR = (int)((0xc) ^ (0xa));
	public static final int PIXAA_VERSION_NUMBER = (int)2;
	public static final int PIXA_VERSION_NUMBER = (int)2;
	public static final int BOXA_VERSION_NUMBER = (int)2;
	public static final int BOXAA_VERSION_NUMBER = (int)3;
	public static final int PTA_VERSION_NUMBER = (int)1;
	public static final int FPIX_VERSION_NUMBER = (int)2;
	public static final int DPIX_VERSION_NUMBER = (int)2;
	public static final int PIXACOMP_VERSION_NUMBER = (int)2;
	public static final int RECOG_VERSION_NUMBER = (int)2;
	public interface alloc_fn extends Callback {
		Pointer apply(NativeSize size_t1);
	};
	public interface dealloc_fn extends Callback {
		void apply(Pointer voidPtr1);
	};
	public interface leptSetStderrHandler_handler_callback extends Callback {
		void apply(Pointer charPtr1);
	};

    public static class FILE extends PointerType {

        public FILE(Pointer address) {
            super(address);
        }

        public FILE() {
            super();
        }
    };
}
