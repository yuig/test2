package c2;

/* loaded from: classes2.dex */
public final class c3 extends u2.p implements s3.l, s3.c0 {
    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        boolean z13 = this.f120054m && ((Boolean) com.bumptech.glide.c.w(this, w2.f25351a)).booleanValue();
        long j14 = w2.f25352b;
        q3.c1 Q = o0Var.Q(j13);
        int max = z13 ? Math.max(Q.f102178a, r0Var.R(n4.g.b(j14))) : Q.f102178a;
        int max2 = z13 ? Math.max(Q.f102179b, r0Var.R(n4.g.a(j14))) : Q.f102179b;
        s03 = r0Var.s0(max, max2, kotlin.collections.z0.d(), new p1.j0(max, Q, max2, 2));
        return s03;
    }
}
