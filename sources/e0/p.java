package e0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final r[] f56724c;

    /* renamed from: d, reason: collision with root package name */
    public static final r[][] f56725d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f56726e;

    /* renamed from: a, reason: collision with root package name */
    public final List f56727a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteOrder f56728b;

    static {
        r[] rVarArr = {new r("ImageWidth", RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 3, 4), new r("ImageLength", RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, 3, 4), new r("Make", RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD, 2), new r("Model", RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE, 2), new r("Orientation", RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE, 3), new r("XResolution", 282, 5), new r("YResolution", 283, 5), new r("ResolutionUnit", 296, 3), new r("Software", 305, 2), new r("DateTime", 306, 2), new r("YCbCrPositioning", 531, 3), new r("SubIFDPointer", 330, 4), new r("ExifIFDPointer", 34665, 4), new r("GPSInfoIFDPointer", 34853, 4)};
        r[] rVarArr2 = {new r("ExposureTime", 33434, 5), new r("FNumber", 33437, 5), new r("ExposureProgram", 34850, 3), new r("PhotographicSensitivity", 34855, 3), new r("SensitivityType", 34864, 3), new r("ExifVersion", 36864, 2), new r("DateTimeOriginal", 36867, 2), new r("DateTimeDigitized", 36868, 2), new r("ComponentsConfiguration", 37121, 7), new r("ShutterSpeedValue", 37377, 10), new r("ApertureValue", 37378, 5), new r("BrightnessValue", 37379, 10), new r("ExposureBiasValue", 37380, 10), new r("MaxApertureValue", 37381, 5), new r("MeteringMode", 37383, 3), new r("LightSource", 37384, 3), new r("Flash", 37385, 3), new r("FocalLength", 37386, 5), new r("SubSecTime", 37520, 2), new r("SubSecTimeOriginal", 37521, 2), new r("SubSecTimeDigitized", 37522, 2), new r("FlashpixVersion", 40960, 7), new r("ColorSpace", 40961, 3), new r("PixelXDimension", 40962, 3, 4), new r("PixelYDimension", 40963, 3, 4), new r("InteroperabilityIFDPointer", 40965, 4), new r("FocalPlaneResolutionUnit", 41488, 3), new r("SensingMethod", 41495, 3), new r("FileSource", 41728, 7), new r("SceneType", 41729, 7), new r("CustomRendered", 41985, 3), new r("ExposureMode", 41986, 3), new r("WhiteBalance", 41987, 3), new r("SceneCaptureType", 41990, 3), new r("Contrast", 41992, 3), new r("Saturation", 41993, 3), new r("Sharpness", 41994, 3)};
        r[] rVarArr3 = {new r("GPSVersionID", 0, 1), new r("GPSLatitudeRef", 1, 2), new r("GPSLatitude", 2, 5, 10), new r("GPSLongitudeRef", 3, 2), new r("GPSLongitude", 4, 5, 10), new r("GPSAltitudeRef", 5, 1), new r("GPSAltitude", 6, 5), new r("GPSTimeStamp", 7, 5), new r("GPSSpeedRef", 12, 2), new r("GPSTrackRef", 14, 2), new r("GPSImgDirectionRef", 16, 2), new r("GPSDestBearingRef", 23, 2), new r("GPSDestDistanceRef", 25, 2)};
        f56724c = new r[]{new r("SubIFDPointer", 330, 4), new r("ExifIFDPointer", 34665, 4), new r("GPSInfoIFDPointer", 34853, 4), new r("InteroperabilityIFDPointer", 40965, 4)};
        f56725d = new r[][]{rVarArr, rVarArr2, rVarArr3, new r[]{new r("InteroperabilityIndex", 1, 2)}};
        f56726e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public p(ByteOrder byteOrder, ArrayList arrayList) {
        com.bumptech.glide.d.v("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f56728b = byteOrder;
        this.f56727a = arrayList;
    }

    public final Map a(int i13) {
        com.bumptech.glide.d.k(a.a.e("Invalid IFD index: ", i13, ". Index should be between [0, EXIF_TAGS.length] "), i13, 0, 4);
        return (Map) this.f56727a.get(i13);
    }
}
