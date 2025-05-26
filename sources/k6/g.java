package k6;

import a.cb;
import ads_mobile_sdk.wb;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class g {
    public static final SimpleDateFormat R;
    public static final d V;
    public static final d[][] W;
    public static final d[] X;
    public static final HashMap[] Y;
    public static final HashMap[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashSet f78360a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final HashMap f78361b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final Charset f78362c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f78363d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f78364e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f78365f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f78366g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f78367h0;

    /* renamed from: a, reason: collision with root package name */
    public final String f78375a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f78376b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f78377c;

    /* renamed from: d, reason: collision with root package name */
    public int f78378d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap[] f78379e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f78380f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f78381g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78382h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f78383i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f78384j;

    /* renamed from: k, reason: collision with root package name */
    public int f78385k;

    /* renamed from: l, reason: collision with root package name */
    public int f78386l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f78387m;

    /* renamed from: n, reason: collision with root package name */
    public int f78388n;

    /* renamed from: o, reason: collision with root package name */
    public int f78389o;

    /* renamed from: p, reason: collision with root package name */
    public int f78390p;

    /* renamed from: q, reason: collision with root package name */
    public int f78391q;

    /* renamed from: r, reason: collision with root package name */
    public int f78392r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78393s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f78368t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List f78369u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List f78370v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f78371w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f78372x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f78373y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f78374z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f78359J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] S = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] T = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] U = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        d[] dVarArr = {new d("NewSubfileType", RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, 4), new d("SubfileType", 255, 4), new d("ImageWidth", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 3, 4), new d("ImageLength", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, 3, 4), new d("BitsPerSample", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, 3), new d("Compression", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS, 3), new d("PhotometricInterpretation", RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER, 3), new d("ImageDescription", RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, 2), new d("Make", RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD, 2), new d("Model", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE, 2), new d("StripOffsets", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE, 3, 4), new d("Orientation", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE, 3), new d("SamplesPerPixel", RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE, 3), new d("RowsPerStrip", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE, 3, 4), new d("StripByteCounts", RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", wb.W0, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 3, 4), new d("ThumbnailImageLength", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, 3, 4), new d("BitsPerSample", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, 3), new d("Compression", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS, 3), new d("PhotometricInterpretation", RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER, 3), new d("ImageDescription", RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, 2), new d("Make", RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD, 2), new d("Model", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE, 2), new d("StripOffsets", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE, 3, 4), new d("ThumbnailOrientation", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE, 3), new d("SamplesPerPixel", RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE, 3), new d("RowsPerStrip", RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE, 3, 4), new d("StripByteCounts", RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", wb.W0, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        V = new d("StripOffsets", RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE, 3);
        W = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, 4), new d("PreviewImageLength", RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        X = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        Y = new HashMap[10];
        Z = new HashMap[10];
        f78360a0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f78361b0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f78362c0 = forName;
        f78363d0 = "Exif\u0000\u0000".getBytes(forName);
        f78364e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i13 = 0;
        while (true) {
            d[][] dVarArr6 = W;
            if (i13 >= dVarArr6.length) {
                HashMap hashMap = f78361b0;
                d[] dVarArr7 = X;
                hashMap.put(Integer.valueOf(dVarArr7[0].f78353a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f78353a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f78353a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f78353a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f78353a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f78353a), 8);
                Pattern.compile(".*[1-9].*");
                f78365f0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f78366g0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f78367h0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Y[i13] = new HashMap();
            Z[i13] = new HashMap();
            for (d dVar : dVarArr6[i13]) {
                Y[i13].put(Integer.valueOf(dVar.f78353a), dVar);
                Z[i13].put(dVar.f78354b, dVar);
            }
            i13++;
        }
    }

    public g(String str) {
        FileInputStream fileInputStream;
        d[][] dVarArr = W;
        this.f78379e = new HashMap[dVarArr.length];
        this.f78380f = new HashSet(dVarArr.length);
        this.f78381g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f78377c = null;
        this.f78375a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (u(fileInputStream.getFD())) {
                this.f78376b = fileInputStream.getFD();
            } else {
                this.f78376b = null;
            }
            x(fileInputStream);
            tb.f.C(fileInputStream);
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            tb.f.C(fileInputStream2);
            throw th;
        }
    }

    public static ByteOrder A(b bVar) {
        short readShort = bVar.readShort();
        boolean z13 = f78368t;
        if (readShort == 18761) {
            if (z13) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z13) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public static String b(double d2) {
        long j13 = (long) d2;
        double d13 = d2 - j13;
        long j14 = (long) (d13 * 60.0d);
        return j13 + "/1," + j14 + "/1," + Math.round((d13 - (j14 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(b bVar, e0.c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb3 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f78362c0;
                sb3.append(new String(bArr, charset));
                sb3.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb3.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.c(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            tb.f.F(bVar, cVar, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair r(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair r13 = r(split[0]);
            if (((Integer) r13.first).intValue() == 2) {
                return r13;
            }
            for (int i13 = 1; i13 < split.length; i13++) {
                Pair r14 = r(split[i13]);
                int intValue = (((Integer) r14.first).equals(r13.first) || ((Integer) r14.second).equals(r13.first)) ? ((Integer) r13.first).intValue() : -1;
                int intValue2 = (((Integer) r13.second).intValue() == -1 || !(((Integer) r14.first).equals(r13.second) || ((Integer) r14.second).equals(r13.second))) ? -1 : ((Integer) r13.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    r13 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    r13 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return r13;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean u(FileDescriptor fileDescriptor) {
        try {
            h.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f78368t) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public final void B(int i13, byte[] bArr) {
        f fVar = new f(bArr);
        y(fVar);
        C(fVar, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(k6.f r33, int r34) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.g.C(k6.f, int):void");
    }

    public final void D(String str) {
        for (int i13 = 0; i13 < W.length; i13++) {
            this.f78379e[i13].remove(str);
        }
    }

    public final void E(int i13, String str, String str2) {
        HashMap[] hashMapArr = this.f78379e;
        if (hashMapArr[i13].isEmpty() || hashMapArr[i13].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i13];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i13].remove(str);
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f78368t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        e0.c cVar = new e0.c(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String e13 = e("Xmp");
        HashMap[] hashMapArr = this.f78379e;
        c cVar2 = (e13 == null || !this.f78393s) ? null : (c) hashMapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        N(cVar);
        if (cVar2 != null) {
            hashMapArr[0].put("Xmp", cVar2);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.a(-1);
                cVar.a(readByte);
                tb.f.E(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.a(-1);
                cVar.a(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.f(readUnsignedShort);
                int i13 = readUnsignedShort - 2;
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i13 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i13, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i13 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i14 = readUnsignedShort2 - 2;
                if (i14 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i14 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f78363d0)) {
                        bVar.a(readUnsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(readByte);
                cVar.f(readUnsignedShort2);
                if (i14 >= 6) {
                    i14 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i14 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i14, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i14 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f78368t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        e0.c cVar = new e0.c(bufferedOutputStream, byteOrder, 1);
        tb.f.F(bVar, cVar, E.length);
        if (this.f78389o == 0) {
            int readInt = bVar.readInt();
            cVar.c(readInt);
            tb.f.F(bVar, cVar, readInt + 8);
        } else {
            tb.f.F(bVar, cVar, (r3 - r7.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            e0.c cVar2 = new e0.c(byteArrayOutputStream, byteOrder, 1);
            N(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f56698b).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.c((int) crc32.getValue());
            tb.f.C(byteArrayOutputStream);
            tb.f.E(bVar, cVar);
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            tb.f.C(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void H(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        e0.c cVar;
        int i13;
        int i14;
        boolean z13;
        int i15;
        byte[] bArr;
        if (f78368t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        e0.c cVar2 = new e0.c(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = I;
        tb.f.F(bVar, cVar2, bArr2.length);
        byte[] bArr3 = f78359J;
        bVar.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    e0.c cVar3 = new e0.c(byteArrayOutputStream2, byteOrder, 1);
                    int i16 = this.f78389o;
                    if (i16 != 0) {
                        tb.f.F(bVar, cVar3, (i16 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        bVar.a(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.a(readInt);
                        N(cVar3);
                    } else {
                        byte[] bArr4 = new byte[4];
                        if (bVar.read(bArr4) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr5 = M;
                        boolean equals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = O;
                        byte[] bArr7 = N;
                        if (equals) {
                            int readInt2 = bVar.readInt();
                            byte[] bArr8 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                            bVar.read(bArr8);
                            byte b13 = (byte) (bArr8[0] | 8);
                            bArr8[0] = b13;
                            boolean z14 = ((b13 >> 1) & 1) == 1;
                            cVar3.write(bArr5);
                            cVar3.c(readInt2);
                            cVar3.write(bArr8);
                            if (z14) {
                                d(bVar, cVar3, P, null);
                                while (true) {
                                    byte[] bArr9 = new byte[4];
                                    bufferedInputStream.read(bArr9);
                                    if (!Arrays.equals(bArr9, Q)) {
                                        break;
                                    }
                                    int readInt3 = bVar.readInt();
                                    cVar3.write(bArr9);
                                    cVar3.c(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    tb.f.F(bVar, cVar3, readInt3);
                                }
                                N(cVar3);
                            } else {
                                d(bVar, cVar3, bArr6, bArr7);
                                N(cVar3);
                            }
                        } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                            int readInt4 = bVar.readInt();
                            int i17 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                            byte[] bArr10 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr4, bArr6);
                            byte[] bArr11 = L;
                            if (equals2) {
                                bVar.read(bArr10);
                                byte[] bArr12 = new byte[3];
                                cVar = cVar2;
                                if (bVar.read(bArr12) != 3 || !Arrays.equals(bArr11, bArr12)) {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                                i13 = bVar.readInt();
                                i14 = (i13 << 18) >> 18;
                                i17 -= 10;
                                i15 = (i13 << 2) >> 18;
                                z13 = false;
                            } else {
                                cVar = cVar2;
                                if (!Arrays.equals(bArr4, bArr7)) {
                                    i13 = 0;
                                    i14 = 0;
                                    z13 = false;
                                    i15 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i13 = bVar.readInt();
                                    z13 = true;
                                    i14 = (i13 & 16383) + 1;
                                    i15 = ((i13 & 268419072) >>> 14) + 1;
                                    if ((i13 & 268435456) == 0) {
                                        z13 = false;
                                    }
                                    i17 -= 5;
                                }
                            }
                            cVar3.write(bArr5);
                            cVar3.c(10);
                            byte[] bArr13 = new byte[10];
                            if (z13) {
                                bArr13[0] = (byte) (bArr13[0] | 16);
                            }
                            bArr13[0] = (byte) (bArr13[0] | 8);
                            int i18 = i14 - 1;
                            int i19 = i15 - 1;
                            bArr = bArr3;
                            bArr13[4] = (byte) i18;
                            bArr13[5] = (byte) (i18 >> 8);
                            bArr13[6] = (byte) (i18 >> 16);
                            bArr13[7] = (byte) i19;
                            bArr13[8] = (byte) (i19 >> 8);
                            bArr13[9] = (byte) (i19 >> 16);
                            cVar3.write(bArr13);
                            cVar3.write(bArr4);
                            cVar3.c(readInt4);
                            if (Arrays.equals(bArr4, bArr6)) {
                                cVar3.write(bArr10);
                                cVar3.write(bArr11);
                                cVar3.c(i13);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                cVar3.write(47);
                                cVar3.c(i13);
                            }
                            tb.f.F(bVar, cVar3, i17);
                            N(cVar3);
                            tb.f.E(bVar, cVar3);
                            byte[] bArr14 = bArr;
                            e0.c cVar4 = cVar;
                            cVar4.c(byteArrayOutputStream2.size() + bArr14.length);
                            cVar4.write(bArr14);
                            byteArrayOutputStream2.writeTo(cVar4);
                            tb.f.C(byteArrayOutputStream2);
                        }
                    }
                    cVar = cVar2;
                    bArr = bArr3;
                    tb.f.E(bVar, cVar3);
                    byte[] bArr142 = bArr;
                    e0.c cVar42 = cVar;
                    cVar42.c(byteArrayOutputStream2.size() + bArr142.length);
                    cVar42.write(bArr142);
                    byteArrayOutputStream2.writeTo(cVar42);
                    tb.f.C(byteArrayOutputStream2);
                } catch (Exception e13) {
                    e = e13;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    tb.f.C(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void I(String str, String str2) {
        d dVar;
        String str3;
        boolean z13;
        int i13;
        int i14;
        c cVar;
        String str4 = str;
        String str5 = str2;
        int i15 = 0;
        int i16 = 1;
        String str6 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
            boolean find = f78366g0.matcher(str5).find();
            boolean find2 = f78367h0.matcher(str5).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                return;
            }
            if (find2) {
                str5 = str5.replaceAll("-", ":");
            }
        }
        boolean equals = "ISOSpeedRatings".equals(str4);
        boolean z14 = f78368t;
        if (equals) {
            if (z14) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i17 = 2;
        if (str5 != null && f78360a0.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f78365f0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str5 = new e(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
        }
        int i18 = 0;
        while (i18 < W.length) {
            if ((i18 != 4 || this.f78382h) && (dVar = (d) Z[i18].get(str4)) != null) {
                HashMap[] hashMapArr = this.f78379e;
                if (str5 == null) {
                    hashMapArr[i18].remove(str4);
                } else {
                    Pair r13 = r(str5);
                    int intValue = ((Integer) r13.first).intValue();
                    int i19 = -1;
                    int i23 = dVar.f78355c;
                    if (i23 != intValue && i23 != ((Integer) r13.second).intValue()) {
                        int i24 = dVar.f78356d;
                        if (i24 != -1 && (i24 == ((Integer) r13.first).intValue() || i24 == ((Integer) r13.second).intValue())) {
                            i23 = i24;
                        } else if (i23 != i16 && i23 != 7 && i23 != i17) {
                            if (z14) {
                                StringBuilder o13 = cb.o("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                String[] strArr = S;
                                o13.append(strArr[i23]);
                                o13.append(i24 == -1 ? "" : ", " + strArr[i24]);
                                o13.append(" (guess: ");
                                o13.append(strArr[((Integer) r13.first).intValue()]);
                                o13.append(((Integer) r13.second).intValue() != -1 ? ", " + strArr[((Integer) r13.second).intValue()] : "");
                                o13.append(")");
                                Log.d(str6, o13.toString());
                            }
                        }
                    }
                    int[] iArr = T;
                    switch (i23) {
                        case 1:
                            str3 = str6;
                            z13 = z14;
                            HashMap hashMap = hashMapArr[i18];
                            i13 = 1;
                            if (str5.length() == 1) {
                                i14 = 0;
                                if (str5.charAt(0) >= '0' && str5.charAt(0) <= '1') {
                                    cVar = new c(new byte[]{(byte) (str5.charAt(0) - '0')}, 1, 1);
                                    hashMap.put(str4, cVar);
                                    break;
                                }
                            } else {
                                i14 = 0;
                            }
                            byte[] bytes = str5.getBytes(f78362c0);
                            cVar = new c(bytes, 1, bytes.length);
                            hashMap.put(str4, cVar);
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            z13 = z14;
                            hashMapArr[i18].put(str4, c.a(str5));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 3:
                            str3 = str6;
                            z13 = z14;
                            String[] split = str5.split(",", -1);
                            int[] iArr2 = new int[split.length];
                            for (int i25 = 0; i25 < split.length; i25++) {
                                iArr2[i25] = Integer.parseInt(split[i25]);
                            }
                            hashMapArr[i18].put(str4, c.f(iArr2, this.f78381g));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 4:
                            str3 = str6;
                            z13 = z14;
                            String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i26 = 0; i26 < split2.length; i26++) {
                                jArr[i26] = Long.parseLong(split2[i26]);
                            }
                            hashMapArr[i18].put(str4, c.c(jArr, this.f78381g));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 5:
                            str3 = str6;
                            z13 = z14;
                            int i27 = -1;
                            String[] split3 = str5.split(",", -1);
                            e[] eVarArr = new e[split3.length];
                            int i28 = 0;
                            while (i28 < split3.length) {
                                String[] split4 = split3[i28].split("/", i27);
                                eVarArr[i28] = new e((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i28++;
                                i27 = -1;
                            }
                            hashMapArr[i18].put(str4, c.d(eVarArr, this.f78381g));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (z14) {
                                Log.d(str6, "Data format isn't one of expected formats: " + i23);
                                break;
                            }
                            break;
                        case 9:
                            str3 = str6;
                            z13 = z14;
                            String[] split5 = str5.split(",", -1);
                            int length = split5.length;
                            int[] iArr3 = new int[length];
                            for (int i29 = 0; i29 < split5.length; i29++) {
                                iArr3[i29] = Integer.parseInt(split5[i29]);
                            }
                            HashMap hashMap2 = hashMapArr[i18];
                            ByteOrder byteOrder = this.f78381g;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                            wrap.order(byteOrder);
                            for (int i33 = 0; i33 < length; i33++) {
                                wrap.putInt(iArr3[i33]);
                            }
                            hashMap2.put(str4, new c(wrap.array(), 9, length));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 10:
                            String[] split6 = str5.split(",", -1);
                            int length2 = split6.length;
                            e[] eVarArr2 = new e[length2];
                            int i34 = i15;
                            while (i34 < split6.length) {
                                String[] split7 = split6[i34].split("/", i19);
                                eVarArr2[i34] = new e((long) Double.parseDouble(split7[i15]), (long) Double.parseDouble(split7[1]));
                                i34++;
                                str6 = str6;
                                z14 = z14;
                                i15 = 0;
                                i19 = -1;
                            }
                            str3 = str6;
                            z13 = z14;
                            HashMap hashMap3 = hashMapArr[i18];
                            ByteOrder byteOrder2 = this.f78381g;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i35 = 0; i35 < length2; i35++) {
                                e eVar = eVarArr2[i35];
                                wrap2.putInt((int) eVar.f78357a);
                                wrap2.putInt((int) eVar.f78358b);
                            }
                            hashMap3.put(str4, new c(wrap2.array(), 10, length2));
                            i14 = 0;
                            i13 = 1;
                            break;
                        case 12:
                            String[] split8 = str5.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i36 = i15; i36 < split8.length; i36 += i16) {
                                dArr[i36] = Double.parseDouble(split8[i36]);
                            }
                            HashMap hashMap4 = hashMapArr[i18];
                            ByteOrder byteOrder3 = this.f78381g;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                            wrap3.order(byteOrder3);
                            for (int i37 = i15; i37 < length3; i37 += i16) {
                                wrap3.putDouble(dArr[i37]);
                            }
                            hashMap4.put(str4, new c(wrap3.array(), 12, length3));
                            break;
                    }
                    i18 += i13;
                    i15 = i14;
                    i16 = i13;
                    str6 = str3;
                    z14 = z13;
                    i17 = 2;
                }
            }
            i13 = i16;
            str3 = str6;
            z13 = z14;
            i14 = i15;
            i18 += i13;
            i15 = i14;
            i16 = i13;
            str6 = str3;
            z14 = z13;
            i17 = 2;
        }
    }

    public final void J(b bVar) {
        HashMap hashMap = this.f78379e[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar == null) {
            this.f78388n = 6;
            s(bVar, hashMap);
            return;
        }
        int h10 = cVar.h(this.f78381g);
        this.f78388n = h10;
        if (h10 != 1) {
            if (h10 == 6) {
                s(bVar, hashMap);
                return;
            } else if (h10 != 7) {
                return;
            }
        }
        if (v(hashMap)) {
            t(bVar, hashMap);
        }
    }

    public final void K(int i13, int i14) {
        HashMap[] hashMapArr = this.f78379e;
        boolean isEmpty = hashMapArr[i13].isEmpty();
        boolean z13 = f78368t;
        if (isEmpty || hashMapArr[i14].isEmpty()) {
            if (z13) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i13].get("ImageLength");
        c cVar2 = (c) hashMapArr[i13].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i14].get("ImageLength");
        c cVar4 = (c) hashMapArr[i14].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z13) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z13) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int h10 = cVar.h(this.f78381g);
        int h13 = cVar2.h(this.f78381g);
        int h14 = cVar3.h(this.f78381g);
        int h15 = cVar4.h(this.f78381g);
        if (h10 >= h14 || h13 >= h15) {
            return;
        }
        HashMap hashMap = hashMapArr[i13];
        hashMapArr[i13] = hashMapArr[i14];
        hashMapArr[i14] = hashMap;
    }

    public final void L(f fVar, int i13) {
        c e13;
        c e14;
        HashMap[] hashMapArr = this.f78379e;
        c cVar = (c) hashMapArr[i13].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i13].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i13].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i13].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i13].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f78349a == 5) {
                e[] eVarArr = (e[]) cVar.j(this.f78381g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                } else {
                    e13 = c.d(new e[]{eVarArr[0]}, this.f78381g);
                    e14 = c.d(new e[]{eVarArr[1]}, this.f78381g);
                }
            } else {
                int[] iArr = (int[]) cVar.j(this.f78381g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                e13 = c.e(iArr[0], this.f78381g);
                e14 = c.e(iArr[1], this.f78381g);
            }
            hashMapArr[i13].put("ImageWidth", e13);
            hashMapArr[i13].put("ImageLength", e14);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int h10 = cVar2.h(this.f78381g);
            int h13 = cVar4.h(this.f78381g);
            int h14 = cVar5.h(this.f78381g);
            int h15 = cVar3.h(this.f78381g);
            if (h13 <= h10 || h14 <= h15) {
                return;
            }
            c e15 = c.e(h13 - h10, this.f78381g);
            c e16 = c.e(h14 - h15, this.f78381g);
            hashMapArr[i13].put("ImageLength", e15);
            hashMapArr[i13].put("ImageWidth", e16);
            return;
        }
        c cVar6 = (c) hashMapArr[i13].get("ImageLength");
        c cVar7 = (c) hashMapArr[i13].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i13].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i13].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int h16 = cVar8.h(this.f78381g);
            int h17 = cVar8.h(this.f78381g);
            fVar.c(h16);
            byte[] bArr = new byte[h17];
            fVar.read(bArr);
            i(new b(bArr), h16, i13);
        }
    }

    public final void M() {
        K(0, 5);
        K(0, 4);
        K(5, 4);
        HashMap[] hashMapArr = this.f78379e;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && w(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!w(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        E(0, "ThumbnailOrientation", "Orientation");
        E(0, "ThumbnailImageLength", "ImageLength");
        E(0, "ThumbnailImageWidth", "ImageWidth");
        E(5, "ThumbnailOrientation", "Orientation");
        E(5, "ThumbnailImageLength", "ImageLength");
        E(5, "ThumbnailImageWidth", "ImageWidth");
        E(4, "Orientation", "ThumbnailOrientation");
        E(4, "ImageLength", "ThumbnailImageLength");
        E(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void N(e0.c cVar) {
        HashMap[] hashMapArr;
        int[] iArr;
        int i13;
        Object[] objArr;
        d[][] dVarArr = W;
        int[] iArr2 = new int[dVarArr.length];
        int[] iArr3 = new int[dVarArr.length];
        d[] dVarArr2 = X;
        for (d dVar : dVarArr2) {
            D(dVar.f78354b);
        }
        if (this.f78382h) {
            if (this.f78383i) {
                D("StripOffsets");
                D("StripByteCounts");
            } else {
                D("JPEGInterchangeFormat");
                D("JPEGInterchangeFormatLength");
            }
        }
        int i14 = 0;
        while (true) {
            int length = dVarArr.length;
            hashMapArr = this.f78379e;
            if (i14 >= length) {
                break;
            }
            Object[] array = hashMapArr[i14].entrySet().toArray();
            int length2 = array.length;
            int i15 = 0;
            while (i15 < length2) {
                Map.Entry entry = (Map.Entry) array[i15];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i14].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i15++;
                array = objArr;
            }
            i14++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(dVarArr2[1].f78354b, c.b(0L, this.f78381g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(dVarArr2[2].f78354b, c.b(0L, this.f78381g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(dVarArr2[3].f78354b, c.b(0L, this.f78381g));
        }
        int i16 = 4;
        if (this.f78382h) {
            if (this.f78383i) {
                hashMapArr[4].put("StripOffsets", c.e(0, this.f78381g));
                hashMapArr[4].put("StripByteCounts", c.e(this.f78386l, this.f78381g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", c.b(0L, this.f78381g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", c.b(this.f78386l, this.f78381g));
            }
        }
        int i17 = 0;
        while (true) {
            int length3 = dVarArr.length;
            iArr = T;
            if (i17 >= length3) {
                break;
            }
            Iterator it = hashMapArr[i17].entrySet().iterator();
            int i18 = 0;
            while (it.hasNext()) {
                c cVar2 = (c) ((Map.Entry) it.next()).getValue();
                cVar2.getClass();
                int i19 = iArr[cVar2.f78349a] * cVar2.f78350b;
                if (i19 > 4) {
                    i18 += i19;
                }
            }
            iArr3[i17] = iArr3[i17] + i18;
            i17++;
        }
        int i23 = 8;
        for (int i24 = 0; i24 < dVarArr.length; i24++) {
            if (!hashMapArr[i24].isEmpty()) {
                iArr2[i24] = i23;
                i23 = (hashMapArr[i24].size() * 12) + 6 + iArr3[i24] + i23;
            }
        }
        if (this.f78382h) {
            if (this.f78383i) {
                hashMapArr[4].put("StripOffsets", c.e(i23, this.f78381g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", c.b(i23, this.f78381g));
            }
            this.f78385k = i23;
            i23 += this.f78386l;
        }
        if (this.f78378d == 4) {
            i23 += 8;
        }
        if (f78368t) {
            for (int i25 = 0; i25 < dVarArr.length; i25++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i25), Integer.valueOf(iArr2[i25]), Integer.valueOf(hashMapArr[i25].size()), Integer.valueOf(iArr3[i25]), Integer.valueOf(i23)));
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(dVarArr2[1].f78354b, c.b(iArr2[1], this.f78381g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(dVarArr2[2].f78354b, c.b(iArr2[2], this.f78381g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(dVarArr2[3].f78354b, c.b(iArr2[3], this.f78381g));
        }
        int i26 = this.f78378d;
        if (i26 == 4) {
            cVar.f(i23);
            cVar.write(f78363d0);
        } else if (i26 == 13) {
            cVar.c(i23);
            cVar.write(F);
        } else if (i26 == 14) {
            cVar.write(K);
            cVar.c(i23);
        }
        cVar.d(this.f78381g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        ByteOrder byteOrder = this.f78381g;
        int i27 = cVar.f56697a;
        switch (i27) {
            case 0:
                cVar.f56699c = byteOrder;
                break;
            default:
                cVar.f56699c = byteOrder;
                break;
        }
        cVar.f(42);
        cVar.e(8L);
        int i28 = 0;
        while (i28 < dVarArr.length) {
            if (hashMapArr[i28].isEmpty()) {
                i13 = i16;
            } else {
                cVar.f(hashMapArr[i28].size());
                int size = (hashMapArr[i28].size() * 12) + iArr2[i28] + 2 + i16;
                for (Map.Entry entry2 : hashMapArr[i28].entrySet()) {
                    int i29 = ((d) Z[i28].get(entry2.getKey())).f78353a;
                    c cVar3 = (c) entry2.getValue();
                    cVar3.getClass();
                    int i33 = cVar3.f78349a;
                    int i34 = iArr[i33];
                    int i35 = cVar3.f78350b;
                    int i36 = i34 * i35;
                    cVar.f(i29);
                    cVar.f(i33);
                    cVar.c(i35);
                    if (i36 > 4) {
                        cVar.e(size);
                        size += i36;
                    } else {
                        cVar.write(cVar3.f78352d);
                        if (i36 < 4) {
                            while (i36 < 4) {
                                cVar.a(0);
                                i36++;
                            }
                        }
                    }
                    i16 = 4;
                }
                int i37 = i16;
                if (i28 != 0 || hashMapArr[i37].isEmpty()) {
                    cVar.e(0L);
                } else {
                    cVar.e(iArr2[i37]);
                }
                Iterator it2 = hashMapArr[i28].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((c) ((Map.Entry) it2.next()).getValue()).f78352d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i13 = 4;
            }
            i28++;
            i16 = i13;
        }
        if (this.f78382h) {
            cVar.write(p());
        }
        if (this.f78378d == 14 && i23 % 2 == 1) {
            cVar.a(0);
        }
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        switch (i27) {
            case 0:
                cVar.f56699c = byteOrder2;
                break;
            default:
                cVar.f56699c = byteOrder2;
                break;
        }
    }

    public final void a() {
        String e13 = e("DateTimeOriginal");
        HashMap[] hashMapArr = this.f78379e;
        if (e13 != null && e("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(e13));
        }
        if (e("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f78381g));
        }
        if (e("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f78381g));
        }
        if (e("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f78381g));
        }
        if (e("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f78381g));
        }
    }

    public final String e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c g13 = g(str);
        if (g13 != null) {
            if (!f78360a0.contains(str)) {
                return g13.i(this.f78381g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i13 = g13.f78349a;
                if (i13 != 5 && i13 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i13);
                    return null;
                }
                e[] eVarArr = (e[]) g13.j(this.f78381g);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f78357a / eVar.f78358b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f78357a / eVar2.f78358b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f78357a / eVar3.f78358b)));
            }
            try {
                return Double.toString(g13.g(this.f78381g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int f(int i13, String str) {
        c g13 = g(str);
        if (g13 == null) {
            return i13;
        }
        try {
            return g13.h(this.f78381g);
        } catch (NumberFormatException unused) {
            return i13;
        }
    }

    public final c g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f78368t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i13 = 0; i13 < W.length; i13++) {
            c cVar = (c) this.f78379e[i13].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void h(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f78379e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.e(Integer.parseInt(str), this.f78381g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", c.e(Integer.parseInt(str2), this.f78381g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", c.e(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f78381g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.c(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = parseInt2 + 6;
                    int i14 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f78363d0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f78389o = i13;
                    B(0, bArr2);
                }
                if (f78368t) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0198, code lost:
    
        r23.f78346b = r22.f78381g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0185 A[LOOP:0: B:9:0x0033->B:32:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(k6.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.g.i(k6.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00bf, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.g.j(java.io.BufferedInputStream):int");
    }

    public final void k(f fVar) {
        int i13;
        int i14;
        n(fVar);
        HashMap[] hashMapArr = this.f78379e;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f78352d);
            fVar2.f78346b = this.f78381g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.c(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.c(12L);
            }
            C(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.j(this.f78381g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i15 = iArr[2];
                int i16 = iArr[0];
                if (i15 <= i16 || (i13 = iArr[3]) <= (i14 = iArr[1])) {
                    return;
                }
                int i17 = (i15 - i16) + 1;
                int i18 = (i13 - i14) + 1;
                if (i17 < i18) {
                    int i19 = i17 + i18;
                    i18 = i19 - i18;
                    i17 = i19 - i18;
                }
                c e13 = c.e(i17, this.f78381g);
                c e14 = c.e(i18, this.f78381g);
                hashMapArr[0].put("ImageWidth", e13);
                hashMapArr[0].put("ImageLength", e14);
            }
        }
    }

    public final void l(b bVar) {
        if (f78368t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f78346b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i13 = length + 8;
                if (i13 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + tb.f.w(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f78389o = i13;
                        B(0, bArr3);
                        M();
                        J(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = readInt + 4;
                bVar.a(i14);
                length = i13 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void m(b bVar) {
        boolean z13 = f78368t;
        if (z13) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i13 = ByteBuffer.wrap(bArr).getInt();
        int i14 = ByteBuffer.wrap(bArr2).getInt();
        int i15 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i14];
        bVar.a(i13 - bVar.f78347c);
        bVar.read(bArr4);
        i(new b(bArr4), i13, 5);
        bVar.a(i15 - bVar.f78347c);
        bVar.f78346b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i16 = 0; i16 < readInt; i16++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == V.f78353a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c e13 = c.e(readShort, this.f78381g);
                c e14 = c.e(readShort2, this.f78381g);
                HashMap[] hashMapArr = this.f78379e;
                hashMapArr[0].put("ImageLength", e13);
                hashMapArr[0].put("ImageWidth", e14);
                if (z13) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void n(f fVar) {
        y(fVar);
        C(fVar, 0);
        L(fVar, 0);
        L(fVar, 5);
        L(fVar, 4);
        M();
        if (this.f78378d == 8) {
            HashMap[] hashMapArr = this.f78379e;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f78352d);
                fVar2.f78346b = this.f78381g;
                fVar2.a(6);
                C(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void o(f fVar) {
        if (f78368t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        n(fVar);
        HashMap[] hashMapArr = this.f78379e;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            i(new b(cVar.f78352d), (int) cVar.f78351c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x008e, Exception -> 0x0090, TRY_ENTER, TryCatch #1 {Exception -> 0x0090, blocks: (B:17:0x005d, B:20:0x0073, B:22:0x007f, B:30:0x0092, B:31:0x0097, B:32:0x0098, B:33:0x009d), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[Catch: all -> 0x008e, Exception -> 0x0090, TryCatch #1 {Exception -> 0x0090, blocks: (B:17:0x005d, B:20:0x0073, B:22:0x007f, B:30:0x0092, B:31:0x0097, B:32:0x0098, B:33:0x009d), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.g.p():byte[]");
    }

    public final void q(b bVar) {
        if (f78368t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f78346b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f78359J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i13 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f78389o = i13;
                        B(0, bArr3);
                        J(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + tb.f.w(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i13 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void s(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int h10 = cVar.h(this.f78381g);
        int h13 = cVar2.h(this.f78381g);
        if (this.f78378d == 7) {
            h10 += this.f78390p;
        }
        if (h10 > 0 && h13 > 0) {
            this.f78382h = true;
            if (this.f78375a == null && this.f78377c == null && this.f78376b == null) {
                byte[] bArr = new byte[h13];
                bVar.skip(h10);
                bVar.read(bArr);
                this.f78387m = bArr;
            }
            this.f78385k = h10;
            this.f78386l = h13;
        }
        if (f78368t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h10 + ", length: " + h13);
        }
    }

    public final void t(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] D2 = tb.f.D(cVar.j(this.f78381g));
        long[] D3 = tb.f.D(cVar2.j(this.f78381g));
        if (D2 == null || D2.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (D3 == null || D3.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (D2.length != D3.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j13 = 0;
        for (long j14 : D3) {
            j13 += j14;
        }
        int i13 = (int) j13;
        byte[] bArr = new byte[i13];
        this.f78384j = true;
        this.f78383i = true;
        this.f78382h = true;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < D2.length; i16++) {
            int i17 = (int) D2[i16];
            int i18 = (int) D3[i16];
            if (i16 < D2.length - 1 && i17 + i18 != D2[i16 + 1]) {
                this.f78384j = false;
            }
            int i19 = i17 - i14;
            if (i19 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j15 = i19;
            if (bVar.skip(j15) != j15) {
                Log.d("ExifInterface", "Failed to skip " + i19 + " bytes.");
                return;
            }
            int i23 = i14 + i19;
            byte[] bArr2 = new byte[i18];
            if (bVar.read(bArr2) != i18) {
                Log.d("ExifInterface", "Failed to read " + i18 + " bytes.");
                return;
            }
            i14 = i23 + i18;
            System.arraycopy(bArr2, 0, bArr, i15, i18);
            i15 += i18;
        }
        this.f78387m = bArr;
        if (this.f78384j) {
            this.f78385k = (int) D2[0];
            this.f78386l = i13;
        }
    }

    public final boolean v(HashMap hashMap) {
        c cVar;
        int h10;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.j(this.f78381g);
            int[] iArr2 = f78371w;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f78378d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((h10 = cVar.h(this.f78381g)) == 1 && Arrays.equals(iArr, f78372x)) || (h10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f78368t) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean w(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.h(this.f78381g) <= 512 && cVar2.h(this.f78381g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:9:0x0020, B:15:0x003d, B:17:0x0048, B:18:0x005e, B:27:0x004f, B:30:0x0057, B:31:0x005b, B:32:0x0068, B:34:0x0071, B:36:0x0077, B:38:0x007d, B:40:0x0083, B:50:0x0091), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = k6.g.f78368t
            if (r8 == 0) goto La9
            r1 = 0
            r2 = r1
        L6:
            k6.d[][] r3 = k6.g.W     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 >= r3) goto L20
            java.util.HashMap[] r3 = r7.f78379e     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r2 + 1
            goto L6
        L17:
            r8 = move-exception
            goto L99
        L1a:
            r8 = move-exception
            goto L8f
        L1d:
            r8 = move-exception
            goto L8f
        L20:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r8 = r7.j(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.f78378d = r8     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L68
            if (r8 == r5) goto L68
            if (r8 == r4) goto L68
            if (r8 != r3) goto L3d
            goto L68
        L3d:
            k6.f r8 = new k6.f     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r1 = r7.f78378d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r2 = 12
            if (r1 != r2) goto L4c
            r7.h(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L4c:
            r2 = 7
            if (r1 != r2) goto L53
            r7.k(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L53:
            r2 = 10
            if (r1 != r2) goto L5b
            r7.o(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L5b:
            r7.n(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L5e:
            int r1 = r7.f78389o     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.c(r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.J(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L68:
            k6.b r8 = new k6.b     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r7.f78378d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 != r6) goto L75
            r7.i(r8, r1, r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L75:
            if (r2 != r4) goto L7b
            r7.l(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L7b:
            if (r2 != r5) goto L81
            r7.m(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L81:
            if (r2 != r3) goto L86
            r7.q(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L86:
            r7.a()
            if (r0 == 0) goto La8
        L8b:
            r7.z()
            goto La8
        L8f:
            if (r0 == 0) goto La2
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L17
            goto La2
        L99:
            r7.a()
            if (r0 == 0) goto La1
            r7.z()
        La1:
            throw r8
        La2:
            r7.a()
            if (r0 == 0) goto La8
            goto L8b
        La8:
            return
        La9:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.g.x(java.io.InputStream):void");
    }

    public final void y(b bVar) {
        ByteOrder A2 = A(bVar);
        this.f78381g = A2;
        bVar.f78346b = A2;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i13 = this.f78378d;
        if (i13 != 7 && i13 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException(a.a.d("Invalid first Ifd offset: ", readInt));
        }
        int i14 = readInt - 8;
        if (i14 > 0) {
            bVar.a(i14);
        }
    }

    public final void z() {
        int i13 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f78379e;
            if (i13 >= hashMapArr.length) {
                return;
            }
            StringBuilder s13 = a.a.s("The size of tag group[", i13, "]: ");
            s13.append(hashMapArr[i13].size());
            Log.d("ExifInterface", s13.toString());
            for (Map.Entry entry : hashMapArr[i13].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.i(this.f78381g) + "'");
            }
            i13++;
        }
    }

    public g(InputStream inputStream) {
        d[][] dVarArr = W;
        this.f78379e = new HashMap[dVarArr.length];
        this.f78380f = new HashSet(dVarArr.length);
        this.f78381g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f78375a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f78377c = (AssetManager.AssetInputStream) inputStream;
                this.f78376b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (u(fileInputStream.getFD())) {
                        this.f78377c = null;
                        this.f78376b = fileInputStream.getFD();
                    }
                }
                this.f78377c = null;
                this.f78376b = null;
            }
            x(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
