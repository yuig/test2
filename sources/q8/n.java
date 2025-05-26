package q8;

/* loaded from: classes3.dex */
public class n implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f102964a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102966c;

    /* renamed from: d, reason: collision with root package name */
    public final long f102967d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102968e;

    /* renamed from: f, reason: collision with root package name */
    public final long f102969f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102970g;

    public n(int i13, int i14, long j13, long j14, boolean z13) {
        this.f102964a = j13;
        this.f102965b = j14;
        this.f102966c = i14 == -1 ? 1 : i14;
        this.f102968e = i13;
        this.f102970g = z13;
        if (j13 == -1) {
            this.f102967d = -1L;
            this.f102969f = -9223372036854775807L;
        } else {
            long j15 = j13 - j14;
            this.f102967d = j15;
            this.f102969f = (Math.max(0L, j15) * 8000000) / i13;
        }
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        long j14 = this.f102967d;
        long j15 = this.f102965b;
        if (j14 == -1 && !this.f102970g) {
            f0 f0Var = new f0(0L, j15);
            return new d0(f0Var, f0Var);
        }
        int i13 = this.f102968e;
        long j16 = this.f102966c;
        long j17 = (((i13 * j13) / 8000000) / j16) * j16;
        if (j14 != -1) {
            j17 = Math.min(j17, j14 - j16);
        }
        long max = Math.max(j17, 0L) + j15;
        long max2 = (Math.max(0L, max - j15) * 8000000) / i13;
        f0 f0Var2 = new f0(max2, max);
        if (j14 != -1 && max2 < j13) {
            long j18 = max + j16;
            if (j18 < this.f102964a) {
                return new d0(f0Var2, new f0((Math.max(0L, j18 - j15) * 8000000) / i13, j18));
            }
        }
        return new d0(f0Var2, f0Var2);
    }

    @Override // q8.e0
    public final boolean h() {
        return this.f102967d != -1 || this.f102970g;
    }

    @Override // q8.e0
    public final long l() {
        return this.f102969f;
    }
}
