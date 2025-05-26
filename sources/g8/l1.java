package g8;

import m7.x1;

/* loaded from: classes3.dex */
public final class l1 implements c0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f64333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64334b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f64335c;

    public l1(c0 c0Var, long j13) {
        this.f64333a = c0Var;
        this.f64334b = j13;
    }

    @Override // g8.d1
    public final long a() {
        long a13 = this.f64333a.a();
        if (a13 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f64334b + a13;
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        long j14 = this.f64334b;
        return this.f64333a.c(j13 - j14, x1Var) + j14;
    }

    @Override // g8.b0
    public final void e(c0 c0Var) {
        b0 b0Var = this.f64335c;
        b0Var.getClass();
        b0Var.e(this);
    }

    @Override // g8.c0
    public final long f(long j13) {
        long j14 = this.f64334b;
        return this.f64333a.f(j13 - j14) + j14;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f64333a.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f64335c = b0Var;
        this.f64333a.h(this, j13 - this.f64334b);
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        b0 b0Var = this.f64335c;
        b0Var.getClass();
        b0Var.i(this);
    }

    @Override // g8.c0
    public final long k() {
        long k13 = this.f64333a.k();
        if (k13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f64334b + k13;
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i13 = 0;
        while (true) {
            b1 b1Var = null;
            if (i13 >= b1VarArr.length) {
                break;
            }
            k1 k1Var = (k1) b1VarArr[i13];
            if (k1Var != null) {
                b1Var = k1Var.f64327a;
            }
            b1VarArr2[i13] = b1Var;
            i13++;
        }
        long j14 = this.f64334b;
        long l13 = this.f64333a.l(tVarArr, zArr, b1VarArr2, zArr2, j13 - j14);
        for (int i14 = 0; i14 < b1VarArr.length; i14++) {
            b1 b1Var2 = b1VarArr2[i14];
            if (b1Var2 == null) {
                b1VarArr[i14] = null;
            } else {
                b1 b1Var3 = b1VarArr[i14];
                if (b1Var3 == null || ((k1) b1Var3).f64327a != b1Var2) {
                    b1VarArr[i14] = new k1(b1Var2, j14);
                }
            }
        }
        return l13 + j14;
    }

    @Override // g8.c0
    public final void n() {
        this.f64333a.n();
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        m7.x0 x0Var = new m7.x0();
        x0Var.f86478b = y0Var.f86487b;
        x0Var.f86479c = y0Var.f86488c;
        x0Var.f86477a = y0Var.f86486a - this.f64334b;
        return this.f64333a.q(new m7.y0(x0Var));
    }

    @Override // g8.c0
    public final m1 r() {
        return this.f64333a.r();
    }

    @Override // g8.d1
    public final long t() {
        long t13 = this.f64333a.t();
        if (t13 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f64334b + t13;
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        this.f64333a.u(j13 - this.f64334b, z13);
    }

    @Override // g8.d1
    public final void v(long j13) {
        this.f64333a.v(j13 - this.f64334b);
    }
}
