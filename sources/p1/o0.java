package p1;

/* loaded from: classes2.dex */
public abstract class o0 extends u2.p implements s3.c0 {
    public abstract long M0(q3.o0 o0Var, long j13);

    public abstract boolean N0();

    @Override // s3.c0
    public int a(q3.s sVar, q3.r rVar, int i13) {
        return rVar.N(i13);
    }

    public int d(q3.s sVar, q3.r rVar, int i13) {
        return rVar.d(i13);
    }

    public int e(q3.s sVar, q3.r rVar, int i13) {
        return rVar.D(i13);
    }

    @Override // s3.c0
    public int h(q3.s sVar, q3.r rVar, int i13) {
        return rVar.P(i13);
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        long M0 = M0(o0Var, j13);
        if (N0()) {
            M0 = bs1.c.H(j13, M0);
        }
        q3.c1 Q = o0Var.Q(M0);
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i1.a0(Q, 3));
        return s03;
    }
}
