package p1;

/* loaded from: classes2.dex */
public final class l1 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f98551n;

    /* renamed from: o, reason: collision with root package name */
    public float f98552o;

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        int N = rVar.N(i13);
        int R = !n4.e.a(this.f98551n, Float.NaN) ? sVar.R(this.f98551n) : 0;
        return N < R ? R : N;
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        int d2 = rVar.d(i13);
        int R = !n4.e.a(this.f98552o, Float.NaN) ? sVar.R(this.f98552o) : 0;
        return d2 < R ? R : d2;
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        int D = rVar.D(i13);
        int R = !n4.e.a(this.f98552o, Float.NaN) ? sVar.R(this.f98552o) : 0;
        return D < R ? R : D;
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        int P = rVar.P(i13);
        int R = !n4.e.a(this.f98551n, Float.NaN) ? sVar.R(this.f98551n) : 0;
        return P < R ? R : P;
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        int j14;
        q3.q0 s03;
        int i13 = 0;
        if (n4.e.a(this.f98551n, Float.NaN) || n4.a.j(j13) != 0) {
            j14 = n4.a.j(j13);
        } else {
            j14 = r0Var.R(this.f98551n);
            int h10 = n4.a.h(j13);
            if (j14 > h10) {
                j14 = h10;
            }
            if (j14 < 0) {
                j14 = 0;
            }
        }
        int h13 = n4.a.h(j13);
        if (n4.e.a(this.f98552o, Float.NaN) || n4.a.i(j13) != 0) {
            i13 = n4.a.i(j13);
        } else {
            int R = r0Var.R(this.f98552o);
            int g13 = n4.a.g(j13);
            if (R > g13) {
                R = g13;
            }
            if (R >= 0) {
                i13 = R;
            }
        }
        q3.c1 Q = o0Var.Q(bs1.c.a(j14, h13, i13, n4.a.g(j13)));
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i1.a0(Q, 4));
        return s03;
    }
}
