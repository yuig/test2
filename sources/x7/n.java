package x7;

import a.cb;
import a7.o0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import java.util.Objects;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f134048l = false;

    /* renamed from: a, reason: collision with root package name */
    public final String f134049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134050b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134051c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f134052d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134053e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134054f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f134055g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f134056h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f134057i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f134058j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f134059k;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        str.getClass();
        this.f134049a = str;
        this.f134050b = str2;
        this.f134051c = str3;
        this.f134052d = codecCapabilities;
        this.f134055g = z13;
        this.f134056h = z14;
        this.f134057i = z15;
        this.f134053e = z16;
        this.f134054f = z17;
        this.f134058j = z18;
        this.f134059k = o0.q(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n0.f(i13, widthAlignment) * widthAlignment, n0.f(i14, heightAlignment) * heightAlignment);
    }

    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d2) {
        Point a13 = a(videoCapabilities, i13, i14);
        int i15 = a13.x;
        int i16 = a13.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i15, i16) : videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d2));
    }

    public static MediaCodecInfo.CodecProfileLevel[] d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i13 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? BitmapUtils.BITMAP_TO_JPEG_SIZE : intValue >= 60000000 ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : intValue >= 30000000 ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i13;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean l(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    public static boolean n(String str, String str2) {
        if (!f134048l || str2 == null) {
            return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x7.n o(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r1 = r12
            r4 = r15
            x7.n r11 = new x7.n
            r0 = 0
            r2 = 1
            if (r4 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = d7.n0.f53866a
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = r2
            goto L3c
        L3b:
            r8 = r0
        L3c:
            if (r4 == 0) goto L44
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
        L44:
            if (r19 != 0) goto L53
            if (r4 == 0) goto L51
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L51
            goto L53
        L51:
            r9 = r0
            goto L54
        L53:
            r9 = r2
        L54:
            int r3 = d7.n0.f53866a
            r5 = 35
            if (r3 < r5) goto L6c
            if (r4 == 0) goto L6c
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L6c
            boolean r3 = m()
            if (r3 != 0) goto L6c
            r10 = r2
            goto L6d
        L6c:
            r10 = r0
        L6d:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.n.o(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):x7.n");
    }

    public final m7.j c(androidx.media3.common.b bVar, androidx.media3.common.b bVar2) {
        int i13 = !Objects.equals(bVar.f18765o, bVar2.f18765o) ? 8 : 0;
        if (this.f134059k) {
            if (bVar.f18775y != bVar2.f18775y) {
                i13 |= 1024;
            }
            if (!this.f134053e && (bVar.f18772v != bVar2.f18772v || bVar.f18773w != bVar2.f18773w)) {
                i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
            }
            a7.j jVar = bVar.C;
            boolean f13 = a7.j.f(jVar);
            a7.j jVar2 = bVar2.C;
            if ((!f13 || !a7.j.f(jVar2)) && !Objects.equals(jVar, jVar2)) {
                i13 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f134049a) && !bVar.c(bVar2)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new m7.j(this.f134049a, bVar, bVar2, bVar.c(bVar2) ? 3 : 2, 0);
            }
        } else {
            if (bVar.E != bVar2.E) {
                i13 |= 4096;
            }
            if (bVar.F != bVar2.F) {
                i13 |= 8192;
            }
            if (bVar.G != bVar2.G) {
                i13 |= 16384;
            }
            String str = this.f134050b;
            if (i13 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d2 = v.d(bVar);
                Pair d13 = v.d(bVar2);
                if (d2 != null && d13 != null) {
                    int intValue = ((Integer) d2.first).intValue();
                    int intValue2 = ((Integer) d13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new m7.j(this.f134049a, bVar, bVar2, 3, 0);
                    }
                }
            }
            if (!bVar.c(bVar2)) {
                i13 |= 32;
            }
            if (l(str)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new m7.j(this.f134049a, bVar, bVar2, 1, 0);
            }
        }
        return new m7.j(this.f134049a, bVar, bVar2, 0, i13);
    }

    public final boolean e(androidx.media3.common.b bVar, boolean z13) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Pair d2 = v.d(bVar);
        String str = this.f134051c;
        String str2 = bVar.f18765o;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String r13 = o0.r(str);
            if (r13.equals("video/mv-hevc")) {
                return true;
            }
            if (r13.equals("video/hevc")) {
                d2 = v.i(bVar);
            }
        }
        if (d2 == null) {
            return true;
        }
        int intValue = ((Integer) d2.first).intValue();
        int intValue2 = ((Integer) d2.second).intValue();
        boolean equals = "video/dolby-vision".equals(str2);
        String str3 = this.f134050b;
        if (equals) {
            str3.getClass();
            switch (str3) {
                case "video/av01":
                case "video/hevc":
                    intValue = 2;
                    break;
                case "video/avc":
                    intValue = 8;
                    break;
            }
            intValue2 = 0;
        }
        if (!this.f134059k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f134052d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (n0.f53866a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            codecProfileLevelArr = d(codecCapabilities);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z13)) {
                if ("video/hevc".equals(str3) && 2 == intValue) {
                    String str4 = Build.DEVICE;
                    if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    }
                }
                return true;
            }
        }
        k("codec.profileLevel, " + bVar.f18761k + ", " + str);
        return false;
    }

    public final boolean f(androidx.media3.common.b bVar) {
        return (Objects.equals(bVar.f18765o, "audio/flac") && bVar.G == 22 && n0.f53866a < 34 && this.f134049a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean g(androidx.media3.common.b bVar) {
        int i13;
        String str = bVar.f18765o;
        String str2 = this.f134050b;
        if (!(str2.equals(str) || str2.equals(v.b(bVar))) || !e(bVar, true) || !f(bVar)) {
            return false;
        }
        if (this.f134059k) {
            int i14 = bVar.f18772v;
            if (i14 <= 0 || (i13 = bVar.f18773w) <= 0) {
                return true;
            }
            return i(i14, i13, bVar.f18774x, bVar.f18764n);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f134052d;
        int i15 = bVar.F;
        if (i15 != -1) {
            if (codecCapabilities == null) {
                k("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    k("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                    k("sampleRate.support, " + i15);
                }
            }
            return false;
        }
        int i16 = bVar.E;
        if (i16 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            k("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                k("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((n0.f53866a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i17 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    d7.u.g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f134049a + ", [" + maxInputChannelCount + " to " + i17 + "]");
                    maxInputChannelCount = i17;
                }
                if (maxInputChannelCount >= i16) {
                    return true;
                }
                k("channelCount.support, " + i16);
            }
        }
        return false;
    }

    public final boolean h(androidx.media3.common.b bVar) {
        if (this.f134059k) {
            return this.f134053e;
        }
        Pair d2 = v.d(bVar);
        return d2 != null && ((Integer) d2.first).intValue() == 42;
    }

    public final boolean i(int i13, int i14, double d2, String str) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f134052d;
        if (codecCapabilities == null) {
            k("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            k("sizeAndRate.vCaps");
            return false;
        }
        int i15 = n0.f53866a;
        if (i15 >= 29) {
            int a13 = (i15 < 29 || ((bool = m0.f20171a) != null && bool.booleanValue())) ? 0 : f5.d.a(videoCapabilities, i13, i14, d2);
            if (a13 == 2) {
                return true;
            }
            if (a13 == 1) {
                StringBuilder t13 = a.a.t("sizeAndRate.cover, ", i13, "x", i14, "@");
                t13.append(d2);
                k(t13.toString());
                return false;
            }
        }
        if (!b(videoCapabilities, i13, i14, d2)) {
            if (i13 >= i14 || !n(this.f134049a, str) || !b(videoCapabilities, i14, i13, d2)) {
                StringBuilder t14 = a.a.t("sizeAndRate.support, ", i13, "x", i14, "@");
                t14.append(d2);
                k(t14.toString());
                return false;
            }
            StringBuilder t15 = a.a.t("sizeAndRate.rotated, ", i13, "x", i14, "@");
            t15.append(d2);
            j(t15.toString());
        }
        return true;
    }

    public final void j(String str) {
        StringBuilder o13 = cb.o("AssumedSupport [", str, "] [");
        o13.append(this.f134049a);
        o13.append(", ");
        o13.append(this.f134050b);
        o13.append("] [");
        o13.append(n0.f53867b);
        o13.append("]");
        d7.u.b("MediaCodecInfo", o13.toString());
    }

    public final void k(String str) {
        StringBuilder o13 = cb.o("NoSupport [", str, "] [");
        o13.append(this.f134049a);
        o13.append(", ");
        o13.append(this.f134050b);
        o13.append("] [");
        o13.append(n0.f53867b);
        o13.append("]");
        d7.u.b("MediaCodecInfo", o13.toString());
    }

    public final String toString() {
        return this.f134049a;
    }
}
