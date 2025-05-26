package p1;

/* loaded from: classes.dex */
public final class f0 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public d0 f98507n;

    /* renamed from: o, reason: collision with root package name */
    public float f98508o;

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        int j14;
        int h10;
        int g13;
        int i13;
        q3.q0 s03;
        if (!n4.a.d(j13) || this.f98507n == d0.Vertical) {
            j14 = n4.a.j(j13);
            h10 = n4.a.h(j13);
        } else {
            j14 = ql2.s.g(Math.round(n4.a.h(j13) * this.f98508o), n4.a.j(j13), n4.a.h(j13));
            h10 = j14;
        }
        if (!n4.a.c(j13) || this.f98507n == d0.Horizontal) {
            int i14 = n4.a.i(j13);
            g13 = n4.a.g(j13);
            i13 = i14;
        } else {
            i13 = ql2.s.g(Math.round(n4.a.g(j13) * this.f98508o), n4.a.i(j13), n4.a.g(j13));
            g13 = i13;
        }
        q3.c1 Q = o0Var.Q(bs1.c.a(j14, h10, i13, g13));
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i1.i0(Q, 2));
        return s03;
    }
}
