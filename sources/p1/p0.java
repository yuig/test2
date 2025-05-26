package p1;

/* loaded from: classes2.dex */
public final class p0 extends o0 {

    /* renamed from: n, reason: collision with root package name */
    public n0 f98566n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98567o;

    @Override // p1.o0
    public final long M0(q3.o0 o0Var, long j13) {
        int N = this.f98566n == n0.Min ? o0Var.N(n4.a.g(j13)) : o0Var.P(n4.a.g(j13));
        if (N < 0) {
            N = 0;
        }
        if (N >= 0) {
            return bs1.c.N(N, N, 0, Integer.MAX_VALUE);
        }
        kh2.n.i0("width(" + N + ") must be >= 0");
        throw null;
    }

    @Override // p1.o0
    public final boolean N0() {
        return this.f98567o;
    }

    @Override // p1.o0, s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        return this.f98566n == n0.Min ? rVar.N(i13) : rVar.P(i13);
    }

    @Override // p1.o0, s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        return this.f98566n == n0.Min ? rVar.N(i13) : rVar.P(i13);
    }
}
