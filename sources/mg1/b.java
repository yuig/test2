package mg1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.k;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ml2.c;
import tb0.h;
import xk2.w;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f87148a = {k.HEVC.getFormat(), k.AVC.getFormat(), k.MPEG4.getFormat(), k.H263.getFormat()};

    public static final Exception a(h hVar, MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, boolean z13) {
        if (mediaCodec != null) {
            try {
                mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z13 ? 1 : 0);
                return null;
            } catch (Exception e13) {
                return e13;
            }
        }
        hVar.h("Cannot configure null codec.");
        return new NullPointerException("Codec cannot be null. Encoder? [" + z13 + "] Format [" + mediaFormat + "]");
    }

    public static final MediaCodec b(h crashReporting, String loggingPrefix, MediaCodec mediaCodec, MediaFormat format, Surface surface, boolean z13) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(loggingPrefix, "loggingPrefix");
        Intrinsics.checkNotNullParameter(format, "format");
        Exception exc = mediaCodec == null ? new Exception("Null codec") : a(crashReporting, mediaCodec, format, surface, z13);
        if (exc != null) {
            String name = mediaCodec != null ? mediaCodec.getName() : null;
            crashReporting.h(loggingPrefix + " configureCodec Error: Name=" + name + " Error=" + exc.getMessage());
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            Pair c13 = c(crashReporting, loggingPrefix, format, surface, z13);
            mediaCodec = (MediaCodec) c13.f80346a;
            exc = (Exception) c13.f80347b;
        }
        if (exc == null) {
            return mediaCodec;
        }
        throw exc;
    }

    public static final Pair c(h crashReporting, String loggingPrefix, MediaFormat format, Surface surface, boolean z13) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(loggingPrefix, "loggingPrefix");
        Intrinsics.checkNotNullParameter(format, "format");
        String concat = loggingPrefix.concat(" createAndConfigureCodec");
        Intrinsics.checkNotNullParameter(format, "format");
        ArrayList arrayList = new ArrayList();
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder() == z13) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                for (String str : supportedTypes) {
                    if (mediaCodecInfo.getCapabilitiesForType(str).isFormatSupported(format)) {
                        String name = mediaCodecInfo.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        arrayList.add(name);
                    }
                }
            }
        }
        MediaCodec mediaCodec = null;
        Throwable runtimeException = arrayList.isEmpty() ? new RuntimeException("No codecs available. Encoder? [" + z13 + "] Format [" + format + "]") : null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MediaCodec d2 = d((String) it.next());
            Throwable a13 = a(crashReporting, d2, format, surface, z13);
            if (a13 == null) {
                mediaCodec = d2;
                runtimeException = a13;
                break;
            }
            crashReporting.h(concat + " Error: Name=" + d2.getName() + " Error=" + a13.getMessage() + " Num fallbacks " + arrayList.size());
            d2.release();
            runtimeException = a13;
        }
        return new Pair(mediaCodec, runtimeException);
    }

    public static final MediaCodec d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
        Intrinsics.checkNotNullExpressionValue(createByCodecName, "createByCodecName(...)");
        return createByCodecName;
    }

    public static final w e(h crashReporting, k mimeType, int i13, Size size) {
        String[] strArr;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i14;
        String[] strArr2;
        String str;
        String[] strArr3;
        int i15;
        String[] strArr4;
        ArrayList arrayList;
        boolean z13;
        Size outputResolution = size;
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        int i16 = 0;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        ArrayList arrayList2 = new ArrayList();
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        String str2 = "getCodecInfos(...)";
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i17 = 0;
        while (true) {
            strArr = f87148a;
            if (i17 >= length) {
                break;
            }
            MediaCodecInfo mediaCodecInfo = codecInfos[i17];
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.f(supportedTypes);
                int length2 = supportedTypes.length;
                int i18 = i16;
                while (i18 < length2) {
                    String str3 = supportedTypes[i18];
                    MediaCodecInfo[] mediaCodecInfoArr2 = codecInfos;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str3).getVideoCapabilities();
                    if (videoCapabilities != null && c0.y(strArr, str3)) {
                        arrayList2.add(videoCapabilities);
                    }
                    i18++;
                    codecInfos = mediaCodecInfoArr2;
                }
            }
            i17++;
            codecInfos = codecInfos;
            i16 = 0;
        }
        Iterator it = arrayList2.iterator();
        int i19 = -1;
        int i23 = -1;
        while (it.hasNext()) {
            MediaCodecInfo.VideoCapabilities videoCapabilities2 = (MediaCodecInfo.VideoCapabilities) it.next();
            i19 = i19 > 0 ? Math.min(videoCapabilities2.getWidthAlignment(), i19) : videoCapabilities2.getWidthAlignment();
            i23 = i23 > 0 ? Math.min(videoCapabilities2.getHeightAlignment(), i23) : videoCapabilities2.getHeightAlignment();
        }
        String[] strArr5 = mimeType != k.AUTO ? new String[]{mimeType.getFormat()} : strArr;
        int i24 = 0;
        while (i24 < 20) {
            float f13 = 1.0f - (i24 * 0.05f);
            int width = (int) (size.getWidth() * f13);
            int height = (int) (size.getHeight() * f13);
            if (i19 > 0) {
                str = str2;
                strArr3 = strArr;
                i15 = i24;
                width = c.b(width / i19) * i19;
            } else {
                str = str2;
                strArr3 = strArr;
                i15 = i24;
            }
            if (i23 > 0) {
                height = c.b(height / i23) * i23;
            }
            Size size2 = new Size(width, height);
            if (!Intrinsics.d(outputResolution, size2)) {
                size.getWidth();
                size.getHeight();
                size2.getWidth();
                size2.getHeight();
            }
            int width2 = (int) (i13 * 0.1875f * size2.getWidth() * size2.getHeight());
            Iterator it2 = arrayList2.iterator();
            int i25 = -1;
            while (it2.hasNext()) {
                MediaCodecInfo.VideoCapabilities videoCapabilities3 = (MediaCodecInfo.VideoCapabilities) it2.next();
                if (videoCapabilities3.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(size2.getWidth())) && videoCapabilities3.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(size2.getHeight())) && videoCapabilities3.getSupportedFrameRates().contains((Range<Integer>) Integer.valueOf(i13))) {
                    Integer upper = videoCapabilities3.getBitrateRange().getUpper();
                    Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
                    i25 = Math.max(i25, upper.intValue());
                }
            }
            if (1 <= i25 && i25 < width2) {
                width2 = i25;
            }
            int length3 = strArr5.length;
            int i26 = 0;
            while (i26 < length3) {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(strArr5[i26], size2.getWidth(), size2.getHeight());
                Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
                createVideoFormat.setInteger("bitrate", width2);
                createVideoFormat.setInteger("frame-rate", i13);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("color-format", 2130708361);
                String findEncoderForFormat = mediaCodecList.findEncoderForFormat(createVideoFormat);
                if (findEncoderForFormat != null) {
                    strArr4 = strArr5;
                    arrayList = arrayList2;
                    z13 = true;
                    Pair c13 = c(crashReporting, "createVideoOutputFormatWithAvailableEncoders", createVideoFormat, null, true);
                    MediaCodec mediaCodec = (MediaCodec) c13.f80346a;
                    Exception exc = (Exception) c13.f80347b;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    if (exc == null) {
                        return new w(createVideoFormat, size2, findEncoderForFormat);
                    }
                } else {
                    strArr4 = strArr5;
                    arrayList = arrayList2;
                    z13 = true;
                }
                i26++;
                strArr5 = strArr4;
                arrayList2 = arrayList;
            }
            i24 = i15 + 1;
            outputResolution = size;
            str2 = str;
            strArr = strArr3;
        }
        String[] strArr6 = strArr;
        int width3 = size.getWidth();
        int height2 = size.getHeight();
        StringBuilder sb3 = new StringBuilder("Cannot find encoder for video with frameRate=");
        sb3.append(i13);
        sb3.append(" mimeType=");
        sb3.append(mimeType);
        sb3.append(" outputResolution=");
        a.a.z(sb3, width3, "x", height2, " widthAlignment");
        sb3.append(i19);
        sb3.append(" heightAlignment=");
        sb3.append(i23);
        sb3.append(". Supported:");
        String sb4 = sb3.toString();
        MediaCodecInfo[] codecInfos2 = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos2, str2);
        int length4 = codecInfos2.length;
        int i27 = 0;
        while (i27 < length4) {
            MediaCodecInfo mediaCodecInfo2 = codecInfos2[i27];
            if (mediaCodecInfo2.isEncoder()) {
                String[] supportedTypes2 = mediaCodecInfo2.getSupportedTypes();
                Intrinsics.f(supportedTypes2);
                int length5 = supportedTypes2.length;
                int i28 = 0;
                while (i28 < length5) {
                    String str4 = supportedTypes2[i28];
                    MediaCodecInfo.VideoCapabilities videoCapabilities4 = mediaCodecInfo2.getCapabilitiesForType(str4).getVideoCapabilities();
                    if (videoCapabilities4 != null) {
                        String str5 = ((Object) sb4) + "\n";
                        strArr2 = strArr6;
                        if (!c0.y(strArr2, str4)) {
                            str5 = ((Object) str5) + "(IGNORED) ";
                        }
                        String name = mediaCodecInfo2.getName();
                        Range<Integer> supportedFrameRates = videoCapabilities4.getSupportedFrameRates();
                        Range<Integer> bitrateRange = videoCapabilities4.getBitrateRange();
                        int heightAlignment = videoCapabilities4.getHeightAlignment();
                        int widthAlignment = videoCapabilities4.getWidthAlignment();
                        mediaCodecInfoArr = codecInfos2;
                        Range<Integer> supportedHeights = videoCapabilities4.getSupportedHeights();
                        Range<Integer> supportedWidths = videoCapabilities4.getSupportedWidths();
                        i14 = length4;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append((Object) str5);
                        sb5.append(name);
                        sb5.append(" ");
                        sb5.append(str4);
                        sb5.append(" fps=");
                        sb5.append(supportedFrameRates);
                        sb5.append(",bitrate=");
                        sb5.append(bitrateRange);
                        sb5.append(",heightAlign=");
                        a.a.z(sb5, heightAlignment, ",widthAlign=", widthAlignment, ",heights=");
                        sb5.append(supportedHeights);
                        sb5.append(",widths=");
                        sb5.append(supportedWidths);
                        sb4 = sb5.toString();
                    } else {
                        mediaCodecInfoArr = codecInfos2;
                        i14 = length4;
                        strArr2 = strArr6;
                    }
                    i28++;
                    codecInfos2 = mediaCodecInfoArr;
                    strArr6 = strArr2;
                    length4 = i14;
                }
            }
            i27++;
            codecInfos2 = codecInfos2;
            strArr6 = strArr6;
            length4 = length4;
        }
        throw new IllegalArgumentException(sb4);
    }

    public static final Pair f(int i13, int i14) {
        float f13;
        float f14;
        if (i13 < i14) {
            if (i13 > 1920) {
                f13 = i13;
                f14 = 1920.0f / f13;
            }
            f14 = 1.0f;
        } else {
            if (i14 > 1920) {
                f13 = i14;
                f14 = 1920.0f / f13;
            }
            f14 = 1.0f;
        }
        if (f14 != 1.0f) {
            float f15 = 2;
            return new Pair(Integer.valueOf(((int) Math.floor((i13 * f14) / f15)) * 2), Integer.valueOf(((int) Math.floor((i14 * f14) / f15)) * 2));
        }
        float max = Math.max(i13 < 128 ? 128.0f / i13 : 1.0f, i14 < 128 ? 128.0f / i14 : 1.0f);
        float f16 = 2;
        return new Pair(Integer.valueOf(((int) Math.ceil((i13 * max) / f16)) * 2), Integer.valueOf(((int) Math.ceil((i14 * max) / f16)) * 2));
    }

    public static final boolean g(String str) {
        return str == null || StringsKt.E(str, "0xffff", true) || StringsKt.E(str, "0x8000", true) || StringsKt.E(str, "0x1", true) || StringsKt.E(str, "instantiate extractor", true) || StringsKt.E(str, "start failed", true) || StringsKt.E(str, "Surface frame wait timed out", true) || StringsKt.E(str, "writeSampleData returned an error", true) || StringsKt.E(str, "bufferInfo must specify a valid buffer offset, size and presentation time", true) || StringsKt.E(str, "Pipeline failed to step", true) || StringsKt.E(str, "Error during updateTexImage", true) || StringsKt.E(str, "java.lang.IllegalStateException", true) || StringsKt.E(str, "java.lang.IllegalArgumentException", true) || StringsKt.E(str, "java.lang.NullPointerException", true) || StringsKt.E(str, "java.nio.BufferOverflowException", true) || StringsKt.E(str, "java.util.concurrent.TimeoutException", true) || StringsKt.E(str, "Codec cannot be null.", true) || StringsKt.E(str, "No codecs available.", true);
    }
}
