package f5;

import a7.o0;
import a7.q;
import android.graphics.BlendMode;
import android.graphics.Insets;
import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.List;
import pk.v2;
import x7.v;

/* loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = r2.getSupportedPerformancePoints()
            r0 = 0
            if (r2 == 0) goto L5d
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            goto L5d
        Le:
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            int r5 = (int) r5
            r1.<init>(r3, r4, r5)
            r3 = r0
        L15:
            int r4 = r2.size()
            r5 = 2
            r6 = 1
            if (r3 >= r4) goto L30
            java.lang.Object r4 = r2.get(r3)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = n5.i.e(r4)
            boolean r4 = n5.i.r(r4, r1)
            if (r4 == 0) goto L2d
            r2 = r5
            goto L31
        L2d:
            int r3 = r3 + 1
            goto L15
        L30:
            r2 = r6
        L31:
            if (r2 != r6) goto L5c
            java.lang.Boolean r3 = ao2.m0.f20171a
            if (r3 != 0) goto L5c
            int r3 = d7.n0.f53866a
            r4 = 35
            if (r3 < r4) goto L3f
        L3d:
            r6 = r0
            goto L53
        L3f:
            int r3 = b(r0)
            int r4 = b(r6)
            if (r3 != 0) goto L4a
            goto L53
        L4a:
            if (r4 != 0) goto L4f
            if (r3 == r5) goto L3d
            goto L53
        L4f:
            if (r3 != r5) goto L53
            if (r4 == r5) goto L3d
        L53:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            ao2.m0.f20171a = r3
            if (r6 == 0) goto L5c
            return r0
        L5c:
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    public static int b(boolean z13) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        boolean covers;
        try {
            q qVar = new q();
            qVar.f1181n = o0.r("video/avc");
            androidx.media3.common.b bVar = new androidx.media3.common.b(qVar);
            if (bVar.f18765o != null) {
                v2 g13 = v.g(x7.q.f134101fp, bVar, z13, false);
                for (int i13 = 0; i13 < g13.f100504d; i13++) {
                    if (((x7.n) g13.get(i13)).f134052d != null && ((x7.n) g13.get(i13)).f134052d.getVideoCapabilities() != null && (supportedPerformancePoints = ((x7.n) g13.get(i13)).f134052d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i14 = 0; i14 < supportedPerformancePoints.size(); i14++) {
                            covers = n5.i.e(supportedPerformancePoints.get(i14)).covers(performancePoint);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static Insets c(int i13, int i14, int i15, int i16) {
        return Insets.of(i13, i14, i15, i16);
    }

    public static void d(xb.a aVar, Object obj) {
        aVar.setBlendMode((BlendMode) obj);
    }
}
