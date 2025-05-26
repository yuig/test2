package p1;

/* loaded from: classes.dex */
public final class m extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f98553n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98554o;

    public final long M0(long j13, boolean z13) {
        int round;
        int g13 = n4.a.g(j13);
        if (g13 == Integer.MAX_VALUE || (round = Math.round(g13 * this.f98553n)) <= 0) {
            return 0L;
        }
        long d2 = lb.l0.d(round, g13);
        if (!z13 || bs1.c.n1(j13, d2)) {
            return d2;
        }
        return 0L;
    }

    public final long N0(long j13, boolean z13) {
        int round;
        int h10 = n4.a.h(j13);
        if (h10 == Integer.MAX_VALUE || (round = Math.round(h10 / this.f98553n)) <= 0) {
            return 0L;
        }
        long d2 = lb.l0.d(h10, round);
        if (!z13 || bs1.c.n1(j13, d2)) {
            return d2;
        }
        return 0L;
    }

    public final long O0(long j13, boolean z13) {
        int i13 = n4.a.i(j13);
        int round = Math.round(i13 * this.f98553n);
        if (round <= 0) {
            return 0L;
        }
        long d2 = lb.l0.d(round, i13);
        if (!z13 || bs1.c.n1(j13, d2)) {
            return d2;
        }
        return 0L;
    }

    public final long P0(long j13, boolean z13) {
        int j14 = n4.a.j(j13);
        int round = Math.round(j14 / this.f98553n);
        if (round <= 0) {
            return 0L;
        }
        long d2 = lb.l0.d(j14, round);
        if (!z13 || bs1.c.n1(j13, d2)) {
            return d2;
        }
        return 0L;
    }

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f98553n) : rVar.N(i13);
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f98553n) : rVar.d(i13);
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f98553n) : rVar.D(i13);
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f98553n) : rVar.P(i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (n4.j.a(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        if (n4.j.a(r5, 0) == false) goto L53;
     */
    @Override // s3.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q3.q0 i(q3.r0 r8, q3.o0 r9, long r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.i(q3.r0, q3.o0, long):q3.q0");
    }
}
