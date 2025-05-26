package x9;

import a7.o0;
import android.media.MediaCodecInfo;
import com.bumptech.glide.c;
import d7.n0;
import pk.x;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f134301a = 0;

    static {
        new x();
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (n0.f53866a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (o0.m(str)) {
            return true;
        }
        String q13 = c.q1(mediaCodecInfo.getName());
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
