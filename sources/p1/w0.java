package p1;

/* loaded from: classes.dex */
public final class w0 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f98611n;

    /* renamed from: o, reason: collision with root package name */
    public float f98612o;

    /* renamed from: p, reason: collision with root package name */
    public float f98613p;

    /* renamed from: q, reason: collision with root package name */
    public float f98614q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f98615r;

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        int R = r0Var.R(this.f98613p) + r0Var.R(this.f98611n);
        int R2 = r0Var.R(this.f98614q) + r0Var.R(this.f98612o);
        q3.c1 Q = o0Var.Q(bs1.c.w1(-R, -R2, j13));
        s03 = r0Var.s0(bs1.c.J(Q.f102178a + R, j13), bs1.c.I(Q.f102179b + R2, j13), kotlin.collections.z0.d(), new i1.a1(this, Q, r0Var, 3));
        return s03;
    }
}
