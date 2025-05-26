package x7;

import a7.o0;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import pk.c1;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f134106a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (n0.f53866a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f134049a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.o("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new r(new c3.e(10)));
        }
        if (n0.f53866a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f134049a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(androidx.media3.common.b bVar) {
        Pair d2;
        if ("audio/eac3-joc".equals(bVar.f18765o)) {
            return "audio/eac3";
        }
        String str = bVar.f18765o;
        if ("video/dolby-vision".equals(str) && (d2 = d(bVar)) != null) {
            int intValue = ((Integer) d2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: NumberFormatException -> 0x0101, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0101, blocks: (B:22:0x00ae, B:24:0x00c2, B:36:0x00e0, B:44:0x00f2), top: B:21:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(androidx.media3.common.b r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.v.d(androidx.media3.common.b):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:4:0x0005, B:9:0x0016, B:15:0x002c, B:17:0x0034, B:19:0x003a, B:21:0x0040, B:23:0x0050, B:24:0x0074), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.util.List e(java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.lang.String r0 = "MediaCodecList API didn't list secure decoder for: "
            java.lang.Class<x7.v> r1 = x7.v.class
            monitor-enter(r1)
            x7.s r2 = new x7.s     // Catch: java.lang.Throwable -> L72
            r2.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L72
            java.util.HashMap r3 = x7.v.f134106a     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L72
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L16
            monitor-exit(r1)
            return r4
        L16:
            java.lang.String r4 = "video/mv-hevc"
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L72
            ck2.a r5 = new ck2.a     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            r6 = 0
            if (r8 != 0) goto L2b
            if (r9 != 0) goto L2b
            if (r4 == 0) goto L29
            goto L2b
        L29:
            r9 = r6
            goto L2c
        L2b:
            r9 = 1
        L2c:
            r5.f27913a = r9     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r9 = f(r2, r5)     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L74
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L74
            int r8 = d7.n0.f53866a     // Catch: java.lang.Throwable -> L72
            r4 = 23
            if (r8 > r4) goto L74
            v5.x r8 = new v5.x     // Catch: java.lang.Throwable -> L72
            r9 = 0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r9 = f(r2, r8)     // Catch: java.lang.Throwable -> L72
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r8 != 0) goto L74
            java.lang.String r8 = "MediaCodecUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L72
            r4.append(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = ". Assuming: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r9.get(r6)     // Catch: java.lang.Throwable -> L72
            x7.n r0 = (x7.n) r0     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.f134049a     // Catch: java.lang.Throwable -> L72
            r4.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L72
            d7.u.g(r8, r0)     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r7 = move-exception
            goto L80
        L74:
            a(r7, r9)     // Catch: java.lang.Throwable -> L72
            pk.c1 r7 = pk.c1.r(r9)     // Catch: java.lang.Throwable -> L72
            r3.put(r2, r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            return r7
        L80:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.v.e(java.lang.String, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(x7.s r23, x7.t r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.v.f(x7.s, x7.t):java.util.ArrayList");
    }

    public static v2 g(q qVar, androidx.media3.common.b bVar, boolean z13, boolean z14) {
        Iterable e13;
        String str = bVar.f18765o;
        com.google.firebase.messaging.k kVar = (com.google.firebase.messaging.k) qVar;
        kVar.getClass();
        List e14 = e(str, z13, z14);
        String b13 = b(bVar);
        if (b13 == null) {
            e13 = v2.f100502e;
        } else {
            kVar.getClass();
            e13 = e(b13, z13, z14);
        }
        x0 n13 = c1.n();
        n13.b(e14);
        n13.b(e13);
        return n13.i();
    }

    public static n h() {
        List e13 = e("audio/raw", false, false);
        if (e13.isEmpty()) {
            return null;
        }
        return (n) e13.get(0);
    }

    public static Pair i(androidx.media3.common.b bVar) {
        String c13 = e7.q.c(bVar.f18768r);
        if (c13 == null) {
            return null;
        }
        String trim = c13.trim();
        int i13 = n0.f53866a;
        return d7.f.g(c13, trim.split("\\.", -1), bVar.C);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, boolean z13, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z13 && str.endsWith(".secure"))) {
            return false;
        }
        int i13 = n0.f53866a;
        if (i13 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i13 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (n0.f53866a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (o0.m(str)) {
            return true;
        }
        String q13 = com.bumptech.glide.c.q1(mediaCodecInfo.getName());
        if (q13.startsWith("arc.")) {
            return false;
        }
        if (q13.startsWith("omx.google.") || q13.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((q13.startsWith("omx.sec.") && q13.contains(".sw.")) || q13.equals("omx.qcom.video.decoder.hevcswvdec") || q13.startsWith("c2.android.") || q13.startsWith("c2.google.")) {
            return true;
        }
        return (q13.startsWith("omx.") || q13.startsWith("c2.")) ? false : true;
    }
}
