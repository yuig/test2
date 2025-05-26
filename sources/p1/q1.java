package p1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q1 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public d0 f98575n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98576o;

    /* renamed from: p, reason: collision with root package name */
    public Function2 f98577p;

    public q1(d0 d0Var, boolean z13, Function2 function2) {
        this.f98575n = d0Var;
        this.f98576o = z13;
        this.f98577p = function2;
    }

    public final void M0(Function2 function2) {
        this.f98577p = function2;
    }

    public final void N0(d0 d0Var) {
        this.f98575n = d0Var;
    }

    public final void O0(boolean z13) {
        this.f98576o = z13;
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        d0 d0Var = this.f98575n;
        d0 d0Var2 = d0.Vertical;
        int j14 = d0Var != d0Var2 ? 0 : n4.a.j(j13);
        d0 d0Var3 = this.f98575n;
        d0 d0Var4 = d0.Horizontal;
        q3.c1 Q = o0Var.Q(bs1.c.a(j14, (this.f98575n == d0Var2 || !this.f98576o) ? n4.a.h(j13) : Integer.MAX_VALUE, d0Var3 == d0Var4 ? n4.a.i(j13) : 0, (this.f98575n == d0Var4 || !this.f98576o) ? n4.a.g(j13) : Integer.MAX_VALUE));
        int g13 = ql2.s.g(Q.f102178a, n4.a.j(j13), n4.a.h(j13));
        int g14 = ql2.s.g(Q.f102179b, n4.a.i(j13), n4.a.g(j13));
        s03 = r0Var.s0(g13, g14, kotlin.collections.z0.d(), new d1(this, g13, Q, g14, r0Var));
        return s03;
    }
}
