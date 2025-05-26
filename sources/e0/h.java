package e0;

import android.location.Location;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kh2.m0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b */
    public static final a.g f56702b = new a.g(1);

    /* renamed from: c */
    public static final a.g f56703c = new a.g(2);

    /* renamed from: d */
    public static final a.g f56704d = new a.g(3);

    /* renamed from: e */
    public static final List f56705e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* renamed from: f */
    public static final List f56706f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    public final k6.g f56707a;

    public h(k6.g gVar) {
        this.f56707a = gVar;
    }

    public final void a(Location location) {
        k6.g gVar = this.f56707a;
        gVar.getClass();
        if (location == null) {
            return;
        }
        gVar.I("GPSProcessingMethod", location.getProvider());
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (latitude < -90.0d || latitude > 90.0d || Double.isNaN(latitude)) {
            throw new IllegalArgumentException("Latitude value " + latitude + " is not valid.");
        }
        if (longitude < -180.0d || longitude > 180.0d || Double.isNaN(longitude)) {
            throw new IllegalArgumentException("Longitude value " + longitude + " is not valid.");
        }
        gVar.I("GPSLatitudeRef", latitude >= 0.0d ? "N" : "S");
        gVar.I("GPSLatitude", k6.g.b(Math.abs(latitude)));
        gVar.I("GPSLongitudeRef", longitude >= 0.0d ? "E" : "W");
        gVar.I("GPSLongitude", k6.g.b(Math.abs(longitude)));
        double altitude = location.getAltitude();
        String str = altitude >= 0.0d ? "0" : SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        gVar.I("GPSAltitude", new k6.e(Math.abs(altitude)).toString());
        gVar.I("GPSAltitudeRef", str);
        gVar.I("GPSSpeedRef", "K");
        gVar.I("GPSSpeed", new k6.e((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = k6.g.R.format(new Date(location.getTime())).split("\\s+", -1);
        gVar.I("GPSDateStamp", split[0]);
        gVar.I("GPSTimeStamp", split[1]);
    }

    public final void b(h hVar) {
        ArrayList arrayList = new ArrayList(f56705e);
        arrayList.removeAll(f56706f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String e13 = this.f56707a.e(str);
            k6.g gVar = hVar.f56707a;
            String e14 = gVar.e(str);
            if (e13 != null && !e13.equals(e14)) {
                gVar.I(str, e13);
            }
        }
    }

    public final int c() {
        return this.f56707a.f(0, "Orientation");
    }

    public final int d() {
        switch (c()) {
            case 3:
            case 4:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
            case 5:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
            case 6:
            case 7:
                return 90;
            case 8:
                return RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
            default:
                return 0;
        }
    }

    public final void e(int i13) {
        int i14 = i13 % 90;
        k6.g gVar = this.f56707a;
        if (i14 != 0) {
            Locale locale = Locale.US;
            m0.X0("h", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i13 + " is unsupported.");
            gVar.I("Orientation", String.valueOf(0));
            return;
        }
        int i15 = i13 % 360;
        int c13 = c();
        while (i15 < 0) {
            i15 += 90;
            switch (c13) {
                case 2:
                    c13 = 5;
                    break;
                case 3:
                case 8:
                    c13 = 6;
                    break;
                case 4:
                    c13 = 7;
                    break;
                case 5:
                    c13 = 4;
                    break;
                case 6:
                    c13 = 1;
                    break;
                case 7:
                    c13 = 2;
                    break;
                default:
                    c13 = 8;
                    break;
            }
        }
        while (i15 > 0) {
            i15 -= 90;
            switch (c13) {
                case 2:
                    c13 = 7;
                    break;
                case 3:
                    c13 = 8;
                    break;
                case 4:
                    c13 = 5;
                    break;
                case 5:
                    c13 = 2;
                    break;
                case 6:
                    c13 = 3;
                    break;
                case 7:
                    c13 = 4;
                    break;
                case 8:
                    c13 = 1;
                    break;
                default:
                    c13 = 6;
                    break;
            }
        }
        gVar.I("Orientation", String.valueOf(c13));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0130 A[Catch: all -> 0x0140, Exception -> 0x0143, TryCatch #20 {Exception -> 0x0143, all -> 0x0140, blocks: (B:68:0x012c, B:70:0x0130, B:72:0x014e, B:76:0x0146), top: B:67:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146 A[Catch: all -> 0x0140, Exception -> 0x0143, TryCatch #20 {Exception -> 0x0143, all -> 0x0140, blocks: (B:68:0x012c, B:70:0x0130, B:72:0x014e, B:76:0x0146), top: B:67:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h.f():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:0|1|(1:122)(1:5)|6|(1:8)(1:121)|9|(24:14|15|16|(2:114|115)|18|(1:113)(2:(1:22)(1:112)|23)|24|(15:108|109|27|(1:29)|30|(11:97|(1:99)(1:(1:103)(2:104|(1:106)))|100|(1:35)(8:(1:62)|63|(1:65)|66|(2:68|(2:70|(7:72|(5:76|77|(3:79|(1:81)(1:83)|82)|84|85)|86|77|(0)|84|85)(7:87|(5:89|77|(0)|84|85)|86|77|(0)|84|85))(7:90|(5:92|77|(0)|84|85)|86|77|(0)|84|85))|93|(1:95)|96)|36|(6:57|58|39|(3:41|(5:44|45|(3:48|50|46)|51|52)|43)|54|55)|38|39|(0)|54|55)|33|(0)(0)|36|(0)|38|39|(0)|54|55)|26|27|(0)|30|(0)|97|(0)(0)|100|(0)(0)|36|(0)|38|39|(0)|54|55)|120|16|(0)|18|(0)|113|24|(0)|26|27|(0)|30|(0)|97|(0)(0)|100|(0)(0)|36|(0)|38|39|(0)|54|55) */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e A[Catch: ParseException -> 0x0109, TRY_ENTER, TryCatch #4 {ParseException -> 0x0109, blocks: (B:99:0x010e, B:103:0x0121, B:106:0x013b), top: B:97:0x010c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h.toString():java.lang.String");
    }
}
