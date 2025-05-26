package g8;

import m7.x1;

/* loaded from: classes.dex */
public final class w implements c0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f64458a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64459b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.m f64460c;

    /* renamed from: d, reason: collision with root package name */
    public a f64461d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f64462e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f64463f;

    /* renamed from: g, reason: collision with root package name */
    public long f64464g = -9223372036854775807L;

    public w(e0 e0Var, l8.m mVar, long j13) {
        this.f64458a = e0Var;
        this.f64460c = mVar;
        this.f64459b = j13;
    }

    @Override // g8.d1
    public final long a() {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.a();
    }

    public final void b(e0 e0Var) {
        long j13 = this.f64464g;
        if (j13 == -9223372036854775807L) {
            j13 = this.f64459b;
        }
        a aVar = this.f64461d;
        aVar.getClass();
        c0 b13 = aVar.b(e0Var, this.f64460c, j13);
        this.f64462e = b13;
        if (this.f64463f != null) {
            b13.h(this, j13);
        }
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.c(j13, x1Var);
    }

    public final long d() {
        return this.f64464g;
    }

    @Override // g8.b0
    public final void e(c0 c0Var) {
        b0 b0Var = this.f64463f;
        int i13 = d7.n0.f53866a;
        b0Var.e(this);
    }

    @Override // g8.c0
    public final long f(long j13) {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.f(j13);
    }

    @Override // g8.d1
    public final boolean g() {
        c0 c0Var = this.f64462e;
        return c0Var != null && c0Var.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f64463f = b0Var;
        c0 c0Var = this.f64462e;
        if (c0Var != null) {
            long j14 = this.f64464g;
            if (j14 == -9223372036854775807L) {
                j14 = this.f64459b;
            }
            c0Var.h(this, j14);
        }
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        b0 b0Var = this.f64463f;
        int i13 = d7.n0.f53866a;
        b0Var.i(this);
    }

    public final void j() {
        if (this.f64462e != null) {
            a aVar = this.f64461d;
            aVar.getClass();
            aVar.q(this.f64462e);
        }
    }

    @Override // g8.c0
    public final long k() {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.k();
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        long j14 = this.f64464g;
        long j15 = (j14 == -9223372036854775807L || j13 != this.f64459b) ? j13 : j14;
        this.f64464g = -9223372036854775807L;
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.l(tVarArr, zArr, b1VarArr, zArr2, j15);
    }

    @Override // g8.c0
    public final void n() {
        c0 c0Var = this.f64462e;
        if (c0Var != null) {
            c0Var.n();
            return;
        }
        a aVar = this.f64461d;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        c0 c0Var = this.f64462e;
        return c0Var != null && c0Var.q(y0Var);
    }

    @Override // g8.c0
    public final m1 r() {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.r();
    }

    @Override // g8.d1
    public final long t() {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        return c0Var.t();
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        c0Var.u(j13, z13);
    }

    @Override // g8.d1
    public final void v(long j13) {
        c0 c0Var = this.f64462e;
        int i13 = d7.n0.f53866a;
        c0Var.v(j13);
    }
}
