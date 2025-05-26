package q3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final s3.a1 f102254a;

    public n0(s3.a1 a1Var) {
        this.f102254a = a1Var;
    }

    @Override // q3.x
    public final long B(long j13) {
        return a3.c.h(this.f102254a.M0().B(j13), a());
    }

    @Override // q3.x
    public final long E(long j13) {
        return this.f102254a.M0().E(a3.c.h(j13, a()));
    }

    @Override // q3.x
    public final a3.d J(x xVar, boolean z13) {
        return this.f102254a.M0().J(xVar, z13);
    }

    @Override // q3.x
    public final void L(float[] fArr) {
        this.f102254a.M0().L(fArr);
    }

    @Override // q3.x
    public final x V() {
        s3.a1 V0;
        if (!h()) {
            jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        s3.q1 q1Var = this.f102254a.M0().f110898l.f110837y.f110806c.f110901o;
        if (q1Var == null || (V0 = q1Var.V0()) == null) {
            return null;
        }
        return V0.B0();
    }

    @Override // q3.x
    public final long W(x xVar, long j13) {
        boolean z13 = xVar instanceof n0;
        s3.a1 a1Var = this.f102254a;
        if (!z13) {
            s3.a1 b13 = androidx.compose.ui.layout.a.b(a1Var);
            long W = W(b13.f110735o, j13);
            s3.q1 q1Var = b13.f110732l;
            q1Var.getClass();
            return a3.c.h(W, q1Var.W(xVar, 0L));
        }
        s3.a1 a1Var2 = ((n0) xVar).f102254a;
        a1Var2.f110732l.f1();
        s3.a1 V0 = a1Var.f110732l.S0(a1Var2.f110732l).V0();
        if (V0 != null) {
            long b14 = n4.h.b(n4.h.c(a1Var2.O0(V0, false), d7.b.q0(j13)), a1Var.O0(V0, false));
            return com.bumptech.glide.c.d((int) (b14 >> 32), (int) (b14 & 4294967295L));
        }
        s3.a1 b15 = androidx.compose.ui.layout.a.b(a1Var2);
        long c13 = n4.h.c(n4.h.c(a1Var2.O0(b15, false), b15.f110733m), d7.b.q0(j13));
        s3.a1 b16 = androidx.compose.ui.layout.a.b(a1Var);
        long b17 = n4.h.b(c13, n4.h.c(a1Var.O0(b16, false), b16.f110733m));
        long d2 = com.bumptech.glide.c.d((int) (b17 >> 32), (int) (b17 & 4294967295L));
        s3.q1 q1Var2 = b16.f110732l.f110901o;
        Intrinsics.f(q1Var2);
        s3.q1 q1Var3 = b15.f110732l.f110901o;
        Intrinsics.f(q1Var3);
        return q1Var2.W(q1Var3, d2);
    }

    public final long a() {
        s3.a1 a1Var = this.f102254a;
        s3.a1 b13 = androidx.compose.ui.layout.a.b(a1Var);
        return a3.c.g(W(b13.B0(), 0L), a1Var.M0().W(b13.M0(), 0L));
    }

    @Override // q3.x
    public final long c0(long j13) {
        return this.f102254a.M0().c0(a3.c.h(j13, a()));
    }

    @Override // q3.x
    public final long e(x xVar, long j13) {
        return W(xVar, j13);
    }

    @Override // q3.x
    public final boolean h() {
        return this.f102254a.M0().X0().f120054m;
    }

    @Override // q3.x
    public final long j() {
        s3.a1 a1Var = this.f102254a;
        return lb.l0.d(a1Var.f102178a, a1Var.f102179b);
    }

    @Override // q3.x
    public final long l(long j13) {
        return a3.c.h(this.f102254a.M0().l(j13), a());
    }

    @Override // q3.x
    public final void n(x xVar, float[] fArr) {
        this.f102254a.M0().n(xVar, fArr);
    }
}
