package p1;

/* loaded from: classes2.dex */
public final class z0 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public x0 f98623n;

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        float f13 = 0;
        if (Float.compare(this.f98623n.c(r0Var.getLayoutDirection()), f13) < 0 || Float.compare(this.f98623n.d(), f13) < 0 || Float.compare(this.f98623n.b(r0Var.getLayoutDirection()), f13) < 0 || Float.compare(this.f98623n.a(), f13) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int R = r0Var.R(this.f98623n.b(r0Var.getLayoutDirection())) + r0Var.R(this.f98623n.c(r0Var.getLayoutDirection()));
        int R2 = r0Var.R(this.f98623n.a()) + r0Var.R(this.f98623n.d());
        q3.c1 Q = o0Var.Q(bs1.c.w1(-R, -R2, j13));
        s03 = r0Var.s0(bs1.c.J(Q.f102178a + R, j13), bs1.c.I(Q.f102179b + R2, j13), kotlin.collections.z0.d(), new e.f(Q, r0Var, this, 3));
        return s03;
    }
}
