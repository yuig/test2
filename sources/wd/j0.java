package wd;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 implements nd.n {

    /* renamed from: d, reason: collision with root package name */
    public static final nd.k f129175d = new nd.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new f0(0));

    /* renamed from: e, reason: collision with root package name */
    public static final nd.k f129176e = new nd.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new f0(1));

    /* renamed from: f, reason: collision with root package name */
    public static final wc.b f129177f = new wc.b(10);

    /* renamed from: g, reason: collision with root package name */
    public static final List f129178g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final h0 f129179a;

    /* renamed from: b, reason: collision with root package name */
    public final qd.d f129180b;

    /* renamed from: c, reason: collision with root package name */
    public final wc.b f129181c = f129177f;

    public j0(qd.d dVar, h0 h0Var) {
        this.f129180b = dVar;
        this.f129179a = h0Var;
    }

    @Override // nd.n
    public final boolean a(Object obj, nd.l lVar) {
        return true;
    }

    @Override // nd.n
    public final pd.g0 b(Object obj, int i13, int i14, nd.l lVar) {
        long longValue = ((Long) lVar.c(f129175d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(a.a.g("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) lVar.c(f129176e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) lVar.c(m.f129188f);
        if (mVar == null) {
            mVar = m.f129187e;
        }
        m mVar2 = mVar;
        this.f129181c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f129179a.i(mediaMetadataRetriever, obj);
            return c.e(c(obj, mediaMetadataRetriever, longValue, num.intValue(), i13, i14, mVar2), this.f129180b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|10|11|12|(2:14|(1:16)(3:17|18|19))|22|23|24|(5:31|32|33|(1:39)|37)|(1:45)|46|(3:79|(0)|(1:62)(2:63|64))(4:50|(3:53|(1:55)(1:77)|51)|78|(0)(0))|56|57|58|(3:66|67|(3:69|(1:71)|72))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0187, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0189, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        if (r0 < 33) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0074, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r16, android.media.MediaMetadataRetriever r17, long r18, int r20, int r21, int r22, wd.m r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.j0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, wd.m):android.graphics.Bitmap");
    }
}
