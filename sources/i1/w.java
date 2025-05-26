package i1;

import i2.v3;

/* loaded from: classes2.dex */
public final class w implements q3.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final j1.y1 f70921b;

    /* renamed from: c, reason: collision with root package name */
    public final v3 f70922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f70923d;

    public w(x xVar, j1.y1 y1Var, i2.q1 q1Var) {
        this.f70923d = xVar;
        this.f70921b = y1Var;
        this.f70922c = q1Var;
    }

    @Override // q3.a0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        return rVar.N(i13);
    }

    @Override // q3.a0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        return rVar.d(i13);
    }

    @Override // q3.a0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        return rVar.D(i13);
    }

    @Override // q3.a0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        return rVar.P(i13);
    }

    @Override // q3.a0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.c1 Q = o0Var.Q(j13);
        x xVar = this.f70923d;
        j1.x1 a13 = this.f70921b.a(new v(0, xVar, this), new q0.e(xVar, 3));
        xVar.getClass();
        long d2 = r0Var.K() ? lb.l0.d(Q.f102178a, Q.f102179b) : ((n4.j) a13.getValue()).f89186a;
        s03 = r0Var.s0((int) (d2 >> 32), (int) (4294967295L & d2), kotlin.collections.z0.d(), new u(this.f70923d, Q, d2, 0));
        return s03;
    }
}
