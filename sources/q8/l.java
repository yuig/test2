package q8;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public int f102946a;

    /* renamed from: b, reason: collision with root package name */
    public Object f102947b;

    /* renamed from: c, reason: collision with root package name */
    public final k f102948c;

    /* renamed from: d, reason: collision with root package name */
    public h f102949d;

    public l(i iVar, k kVar, long j13, long j14, long j15, long j16, long j17, int i13) {
        this.f102948c = kVar;
        this.f102946a = i13;
        this.f102947b = new g(iVar, j13, j14, j15, j16, j17);
    }

    public static int b(t tVar, long j13, c0 c0Var) {
        if (j13 == tVar.h()) {
            return 0;
        }
        c0Var.f102894a = j13;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        return b(r27, r8, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q8.t r27, q8.c0 r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
        L6:
            q8.h r3 = r0.f102949d
            bf.b.w(r3)
            long r4 = r3.f102935f
            long r6 = r3.f102936g
            long r8 = r3.f102937h
            long r6 = r6 - r4
            int r10 = r0.f102946a
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            if (r6 > 0) goto L26
            r0.f102949d = r7
            q8.k r3 = r0.f102948c
            r3.l()
            int r1 = b(r1, r4, r2)
            return r1
        L26:
            long r4 = r27.h()
            long r4 = r8 - r4
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto Lcc
            r12 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 > 0) goto Lcc
            int r4 = (int) r4
            r1.p(r4)
            r27.g()
            q8.k r4 = r0.f102948c
            long r5 = r3.f102931b
            q8.j r4 = r4.e(r1, r5)
            r5 = -3
            int r6 = r4.f102939a
            if (r6 == r5) goto Lc0
            r5 = -2
            long r8 = r4.f102940b
            long r14 = r4.f102941c
            if (r6 == r5) goto L9e
            r4 = -1
            if (r6 == r4) goto L7f
            if (r6 != 0) goto L77
            long r3 = r27.h()
            long r3 = r14 - r3
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 < 0) goto L6b
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 > 0) goto L6b
            int r3 = (int) r3
            r1.p(r3)
        L6b:
            r0.f102949d = r7
            q8.k r3 = r0.f102948c
            r3.l()
            int r1 = b(r1, r14, r2)
            return r1
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7f:
            r3.f102934e = r8
            r3.f102936g = r14
            long r4 = r3.f102933d
            long r6 = r3.f102935f
            long r10 = r3.f102932c
            long r12 = r3.f102931b
            r22 = r14
            r14 = r12
            r16 = r4
            r18 = r8
            r20 = r6
            r24 = r10
            long r4 = q8.h.a(r14, r16, r18, r20, r22, r24)
            r3.f102937h = r4
            goto L6
        L9e:
            r22 = r14
            r3.f102933d = r8
            r4 = r22
            r3.f102935f = r4
            long r6 = r3.f102934e
            long r10 = r3.f102936g
            long r12 = r3.f102932c
            long r14 = r3.f102931b
            r16 = r8
            r18 = r6
            r20 = r4
            r22 = r10
            r24 = r12
            long r4 = q8.h.a(r14, r16, r18, r20, r22, r24)
            r3.f102937h = r4
            goto L6
        Lc0:
            r0.f102949d = r7
            q8.k r3 = r0.f102948c
            r3.l()
            int r1 = b(r1, r8, r2)
            return r1
        Lcc:
            int r1 = b(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.l.a(q8.t, q8.c0):int");
    }

    public final void c(long j13) {
        h hVar = this.f102949d;
        if (hVar == null || hVar.f102930a != j13) {
            long d2 = ((g) this.f102947b).f102916a.d(j13);
            g gVar = (g) this.f102947b;
            this.f102949d = new h(j13, d2, gVar.f102918c, gVar.f102919d, gVar.f102920e, gVar.f102921f, gVar.f102922g);
        }
    }
}
