package c0;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: d */
    public static final y0 f24394d = new y0(0, false, false);

    /* renamed from: e */
    public static final y0 f24395e = new y0(500, true, false);

    /* renamed from: f */
    public static final y0 f24396f;

    /* renamed from: a */
    public final long f24397a;

    /* renamed from: b */
    public final boolean f24398b;

    /* renamed from: c */
    public final boolean f24399c;

    static {
        new y0(100L, true, false);
        f24396f = new y0(0L, false, true);
    }

    public y0(long j13, boolean z13, boolean z14) {
        this.f24398b = z13;
        this.f24397a = j13;
        if (z14) {
            com.bumptech.glide.d.g("shouldRetry must be false when completeWithoutFailure is set to true", !z13);
        }
        this.f24399c = z14;
    }
}
