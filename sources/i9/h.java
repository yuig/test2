package i9;

import d7.n0;
import q8.d0;
import q8.f0;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f71764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71765b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71766c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71767d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71768e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71769f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f71770g;

    public h(long j13, int i13, long j14, int i14, long j15, long[] jArr) {
        this.f71764a = j13;
        this.f71765b = i13;
        this.f71766c = j14;
        this.f71767d = i14;
        this.f71768e = j15;
        this.f71770g = jArr;
        this.f71769f = j15 != -1 ? j13 + j15 : -1L;
    }

    @Override // i9.f
    public final long c(long j13) {
        long j14 = j13 - this.f71764a;
        if (!h() || j14 <= this.f71765b) {
            return 0L;
        }
        long[] jArr = this.f71770g;
        bf.b.w(jArr);
        double d2 = (j14 * 256.0d) / this.f71768e;
        int e13 = n0.e(jArr, (long) d2, true);
        long j15 = this.f71766c;
        long j16 = (e13 * j15) / 100;
        long j17 = jArr[e13];
        int i13 = e13 + 1;
        long j18 = (j15 * i13) / 100;
        return Math.round((j17 == (e13 == 99 ? 256L : jArr[i13]) ? 0.0d : (d2 - j17) / (r0 - j17)) * (j18 - j16)) + j16;
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        double d2;
        boolean h10 = h();
        int i13 = this.f71765b;
        long j14 = this.f71764a;
        if (!h10) {
            f0 f0Var = new f0(0L, j14 + i13);
            return new d0(f0Var, f0Var);
        }
        long j15 = n0.j(j13, 0L, this.f71766c);
        double d13 = (j15 * 100.0d) / this.f71766c;
        double d14 = 0.0d;
        if (d13 > 0.0d) {
            if (d13 >= 100.0d) {
                d2 = 256.0d;
                d14 = 256.0d;
                double d15 = d14 / d2;
                long j16 = this.f71768e;
                f0 f0Var2 = new f0(j15, j14 + n0.j(Math.round(d15 * j16), i13, j16 - 1));
                return new d0(f0Var2, f0Var2);
            }
            int i14 = (int) d13;
            long[] jArr = this.f71770g;
            bf.b.w(jArr);
            double d16 = jArr[i14];
            d14 = (((i14 == 99 ? 256.0d : jArr[i14 + 1]) - d16) * (d13 - i14)) + d16;
        }
        d2 = 256.0d;
        double d152 = d14 / d2;
        long j162 = this.f71768e;
        f0 f0Var22 = new f0(j15, j14 + n0.j(Math.round(d152 * j162), i13, j162 - 1));
        return new d0(f0Var22, f0Var22);
    }

    @Override // i9.f
    public final long g() {
        return this.f71769f;
    }

    @Override // q8.e0
    public final boolean h() {
        return this.f71770g != null;
    }

    @Override // i9.f
    public final int k() {
        return this.f71767d;
    }

    @Override // q8.e0
    public final long l() {
        return this.f71766c;
    }
}
