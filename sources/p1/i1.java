package p1;

/* loaded from: classes.dex */
public final class i1 extends u2.p implements s3.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f98527n;

    /* renamed from: o, reason: collision with root package name */
    public float f98528o;

    /* renamed from: p, reason: collision with root package name */
    public float f98529p;

    /* renamed from: q, reason: collision with root package name */
    public float f98530q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f98531r;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long M0(n4.b r8) {
        /*
            r7 = this;
            float r0 = r7.f98529p
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = n4.e.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.f98529p
            int r0 = r8.R(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.f98530q
            boolean r4 = n4.e.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.f98530q
            int r4 = r8.R(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.f98527n
            boolean r5 = n4.e.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.f98527n
            int r5 = r8.R(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.f98528o
            boolean r1 = n4.e.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.f98528o
            int r8 = r8.R(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = bs1.c.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.i1.M0(n4.b):long");
    }

    @Override // s3.c0
    public final int a(q3.s sVar, q3.r rVar, int i13) {
        long M0 = M0(sVar);
        return n4.a.f(M0) ? n4.a.h(M0) : bs1.c.J(rVar.N(i13), M0);
    }

    @Override // s3.c0
    public final int d(q3.s sVar, q3.r rVar, int i13) {
        long M0 = M0(sVar);
        return n4.a.e(M0) ? n4.a.g(M0) : bs1.c.I(rVar.d(i13), M0);
    }

    @Override // s3.c0
    public final int e(q3.s sVar, q3.r rVar, int i13) {
        long M0 = M0(sVar);
        return n4.a.e(M0) ? n4.a.g(M0) : bs1.c.I(rVar.D(i13), M0);
    }

    @Override // s3.c0
    public final int h(q3.s sVar, q3.r rVar, int i13) {
        long M0 = M0(sVar);
        return n4.a.f(M0) ? n4.a.h(M0) : bs1.c.J(rVar.P(i13), M0);
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        int j14;
        int h10;
        int i13;
        int g13;
        long a13;
        q3.q0 s03;
        long M0 = M0(r0Var);
        if (this.f98531r) {
            a13 = bs1.c.H(j13, M0);
        } else {
            if (n4.e.a(this.f98527n, Float.NaN)) {
                j14 = n4.a.j(j13);
                int h13 = n4.a.h(M0);
                if (j14 > h13) {
                    j14 = h13;
                }
            } else {
                j14 = n4.a.j(M0);
            }
            if (n4.e.a(this.f98529p, Float.NaN)) {
                h10 = n4.a.h(j13);
                int j15 = n4.a.j(M0);
                if (h10 < j15) {
                    h10 = j15;
                }
            } else {
                h10 = n4.a.h(M0);
            }
            if (n4.e.a(this.f98528o, Float.NaN)) {
                i13 = n4.a.i(j13);
                int g14 = n4.a.g(M0);
                if (i13 > g14) {
                    i13 = g14;
                }
            } else {
                i13 = n4.a.i(M0);
            }
            if (n4.e.a(this.f98530q, Float.NaN)) {
                g13 = n4.a.g(j13);
                int i14 = n4.a.i(M0);
                if (g13 < i14) {
                    g13 = i14;
                }
            } else {
                g13 = n4.a.g(M0);
            }
            a13 = bs1.c.a(j14, h10, i13, g13);
        }
        q3.c1 Q = o0Var.Q(a13);
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i1.i0(Q, 3));
        return s03;
    }
}
