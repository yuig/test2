package nc2;

import android.media.MediaCodecInfo;
import android.util.Range;
import d7.n0;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements bc2.b {

    /* renamed from: a, reason: collision with root package name */
    public a f90391a;

    /* renamed from: b, reason: collision with root package name */
    public volatile b f90392b;

    /* renamed from: c, reason: collision with root package name */
    public volatile b f90393c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f90394d;

    public static b a(MediaCodecInfo[] mediaCodecInfoArr, String str) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Range<Integer> bitrateRange;
        MediaCodecInfo.VideoCapabilities videoCapabilities2;
        Range<Integer> bitrateRange2;
        Integer num = null;
        MediaCodecInfo mediaCodecInfo = null;
        MediaCodecInfo mediaCodecInfo2 = null;
        for (MediaCodecInfo mediaCodecInfo3 : mediaCodecInfoArr) {
            if (!mediaCodecInfo3.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo3.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                if (c0.y(supportedTypes, str)) {
                    int i13 = x9.a.f134301a;
                    if (!(n0.f53866a >= 29 ? mediaCodecInfo3.isHardwareAccelerated() : true ^ x9.a.a(mediaCodecInfo3, str))) {
                        mediaCodecInfo2 = mediaCodecInfo3;
                    } else if (mediaCodecInfo == null) {
                        mediaCodecInfo = mediaCodecInfo3;
                    }
                }
            }
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo != null ? mediaCodecInfo.getCapabilitiesForType(str) : null;
        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo2 != null ? mediaCodecInfo2.getCapabilitiesForType(str) : null;
        Integer upper = (capabilitiesForType == null || (videoCapabilities2 = capabilitiesForType.getVideoCapabilities()) == null || (bitrateRange2 = videoCapabilities2.getBitrateRange()) == null) ? null : bitrateRange2.getUpper();
        int intValue = upper == null ? -1 : upper.intValue();
        if (capabilitiesForType2 != null && (videoCapabilities = capabilitiesForType2.getVideoCapabilities()) != null && (bitrateRange = videoCapabilities.getBitrateRange()) != null) {
            num = bitrateRange.getUpper();
        }
        return new b(intValue, num == null ? -1 : num.intValue(), capabilitiesForType != null, capabilitiesForType != null ? capabilitiesForType.getMaxSupportedInstances() : 0, capabilitiesForType);
    }
}
