package j1;

/* loaded from: classes.dex */
public final class l0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74138b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f74139c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74140d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74141e;

    public l0(int i13, int i14, c0 c0Var) {
        this.f74137a = i13;
        this.f74138b = i14;
        this.f74139c = c0Var;
        this.f74140d = i13 * 1000000;
        this.f74141e = i14 * 1000000;
    }

    @Override // j1.i0
    public final float c(long j13, float f13, float f14, float f15) {
        float i13 = this.f74137a == 0 ? 1.0f : ql2.s.i(j13 - this.f74141e, 0L, this.f74140d) / this.f74140d;
        if (i13 < 0.0f) {
            i13 = 0.0f;
        }
        float a13 = this.f74139c.a(i13 <= 1.0f ? i13 : 1.0f);
        p2 p2Var = q2.f74205a;
        return (f14 * a13) + ((1 - a13) * f13);
    }

    @Override // j1.i0
    public final float d(long j13, float f13, float f14, float f15) {
        long i13 = ql2.s.i(j13 - this.f74141e, 0L, this.f74140d);
        if (i13 < 0) {
            return 0.0f;
        }
        if (i13 == 0) {
            return f15;
        }
        return (c(i13, f13, f14, f15) - c(i13 - 1000000, f13, f14, f15)) * 1000.0f;
    }

    @Override // j1.i0
    public final long e(float f13, float f14, float f15) {
        return (this.f74138b + this.f74137a) * 1000000;
    }
}
