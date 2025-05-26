package p1;

/* loaded from: classes2.dex */
public final class m0 extends o0 {

    /* renamed from: n, reason: collision with root package name */
    public n0 f98555n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98556o;

    @Override // p1.o0
    public final long M0(q3.o0 o0Var, long j13) {
        int D = this.f98555n == n0.Min ? o0Var.D(n4.a.h(j13)) : o0Var.d(n4.a.h(j13));
        if (D < 0) {
            D = 0;
        }
        if (D >= 0) {
            return bs1.c.N(0, Integer.MAX_VALUE, D, D);
        }
        kh2.n.i0("height(" + D + ") must be >= 0");
        throw null;
    }

    @Override // p1.o0
    public final boolean N0() {
        return this.f98556o;
    }

    @Override // p1.o0, s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        return this.f98555n == n0.Min ? rVar.D(i13) : rVar.d(i13);
    }

    @Override // p1.o0, s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        return this.f98555n == n0.Min ? rVar.D(i13) : rVar.d(i13);
    }
}
