package m7;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f86223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86224b;

    /* renamed from: c, reason: collision with root package name */
    public final float f86225c;

    /* renamed from: d, reason: collision with root package name */
    public long f86226d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f86227e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f86229g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f86230h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f86233k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    public float f86232j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f86234l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f86235m = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f86228f = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f86231i = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f86236n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public long f86237o = -9223372036854775807L;

    public k(long j13, long j14, float f13) {
        this.f86223a = j13;
        this.f86224b = j14;
        this.f86225c = f13;
    }

    public final float a(long j13, long j14) {
        if (this.f86226d == -9223372036854775807L) {
            return 1.0f;
        }
        long j15 = j13 - j14;
        long j16 = this.f86236n;
        if (j16 == -9223372036854775807L) {
            this.f86236n = j15;
            this.f86237o = 0L;
        } else {
            float f13 = j16;
            float f14 = this.f86225c;
            float f15 = 1.0f - f14;
            this.f86236n = Math.max(j15, (long) ((j15 * f15) + (f13 * f14)));
            this.f86237o = (long) ((f15 * Math.abs(j15 - r12)) + (f14 * this.f86237o));
        }
        if (this.f86235m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f86235m < 1000) {
            return this.f86234l;
        }
        this.f86235m = SystemClock.elapsedRealtime();
        long j17 = (this.f86237o * 3) + this.f86236n;
        if (this.f86231i > j17) {
            float X = d7.n0.X(1000L);
            long[] jArr = {j17, this.f86228f, this.f86231i - (((long) ((this.f86234l - 1.0f) * X)) + ((long) ((this.f86232j - 1.0f) * X)))};
            long j18 = jArr[0];
            for (int i13 = 1; i13 < 3; i13++) {
                long j19 = jArr[i13];
                if (j19 > j18) {
                    j18 = j19;
                }
            }
            this.f86231i = j18;
        } else {
            long j23 = d7.n0.j(j13 - ((long) (Math.max(0.0f, this.f86234l - 1.0f) / 1.0E-7f)), this.f86231i, j17);
            this.f86231i = j23;
            long j24 = this.f86230h;
            if (j24 != -9223372036854775807L && j23 > j24) {
                this.f86231i = j24;
            }
        }
        long j25 = j13 - this.f86231i;
        if (Math.abs(j25) < this.f86223a) {
            this.f86234l = 1.0f;
        } else {
            this.f86234l = d7.n0.h((1.0E-7f * j25) + 1.0f, this.f86233k, this.f86232j);
        }
        return this.f86234l;
    }

    public final long b() {
        return this.f86231i;
    }

    public final void c() {
        long j13;
        long j14 = this.f86226d;
        if (j14 != -9223372036854775807L) {
            j13 = this.f86227e;
            if (j13 == -9223372036854775807L) {
                long j15 = this.f86229g;
                if (j15 != -9223372036854775807L && j14 < j15) {
                    j14 = j15;
                }
                j13 = this.f86230h;
                if (j13 == -9223372036854775807L || j14 <= j13) {
                    j13 = j14;
                }
            }
        } else {
            j13 = -9223372036854775807L;
        }
        if (this.f86228f == j13) {
            return;
        }
        this.f86228f = j13;
        this.f86231i = j13;
        this.f86236n = -9223372036854775807L;
        this.f86237o = -9223372036854775807L;
        this.f86235m = -9223372036854775807L;
    }

    public final void d() {
        long j13 = this.f86231i;
        if (j13 == -9223372036854775807L) {
            return;
        }
        long j14 = j13 + this.f86224b;
        this.f86231i = j14;
        long j15 = this.f86230h;
        if (j15 != -9223372036854775807L && j14 > j15) {
            this.f86231i = j15;
        }
        this.f86235m = -9223372036854775807L;
    }

    public final void e(a7.c0 c0Var) {
        this.f86226d = d7.n0.X(c0Var.f959a);
        this.f86229g = d7.n0.X(c0Var.f960b);
        this.f86230h = d7.n0.X(c0Var.f961c);
        float f13 = c0Var.f962d;
        if (f13 == -3.4028235E38f) {
            f13 = 0.97f;
        }
        this.f86233k = f13;
        float f14 = c0Var.f963e;
        if (f14 == -3.4028235E38f) {
            f14 = 1.03f;
        }
        this.f86232j = f14;
        if (f13 == 1.0f && f14 == 1.0f) {
            this.f86226d = -9223372036854775807L;
        }
        c();
    }

    public final void f(long j13) {
        this.f86227e = j13;
        c();
    }
}
