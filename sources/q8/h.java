package q8;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f102930a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102931b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102932c;

    /* renamed from: d, reason: collision with root package name */
    public long f102933d;

    /* renamed from: e, reason: collision with root package name */
    public long f102934e;

    /* renamed from: f, reason: collision with root package name */
    public long f102935f;

    /* renamed from: g, reason: collision with root package name */
    public long f102936g;

    /* renamed from: h, reason: collision with root package name */
    public long f102937h;

    public h(long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f102930a = j13;
        this.f102931b = j14;
        this.f102933d = j15;
        this.f102934e = j16;
        this.f102935f = j17;
        this.f102936g = j18;
        this.f102932c = j19;
        this.f102937h = a(j14, j15, j16, j17, j18, j19);
    }

    public static long a(long j13, long j14, long j15, long j16, long j17, long j18) {
        if (j16 + 1 >= j17 || j14 + 1 >= j15) {
            return j16;
        }
        long j19 = (long) ((j13 - j14) * ((j17 - j16) / (j15 - j14)));
        return d7.n0.j(((j19 + j16) - j18) - (j19 / 20), j16, j17 - 1);
    }
}
