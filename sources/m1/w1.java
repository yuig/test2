package m1;

/* loaded from: classes.dex */
public final class w1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f85615a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85616b;

    public w1(o2 o2Var, boolean z13) {
        this.f85615a = o2Var;
        this.f85616b = z13;
    }

    @Override // m3.a
    public final long Q(int i13, long j13, long j14) {
        if (!this.f85616b) {
            return 0L;
        }
        o2 o2Var = this.f85615a;
        if (o2Var.f85493a.c()) {
            return 0L;
        }
        return o2Var.g(o2Var.c(o2Var.f85493a.f(o2Var.c(o2Var.f(j14)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // m3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y0(long r3, long r5, bl2.c r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof m1.v1
            if (r3 == 0) goto L13
            r3 = r7
            m1.v1 r3 = (m1.v1) r3
            int r4 = r3.f85610u
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f85610u = r4
            goto L18
        L13:
            m1.v1 r3 = new m1.v1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f85608s
            cl2.a r7 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r3.f85610u
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f85607r
            ue.c.H(r4)
            goto L45
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            ue.c.H(r4)
            boolean r4 = r2.f85616b
            if (r4 == 0) goto L50
            r3.f85607r = r5
            r3.f85610u = r1
            m1.o2 r4 = r2.f85615a
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L45
            return r7
        L45:
            n4.o r4 = (n4.o) r4
            long r3 = r4.j()
            long r3 = n4.o.f(r5, r3)
            goto L52
        L50:
            r3 = 0
        L52:
            n4.o r3 = n4.o.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w1.y0(long, long, bl2.c):java.lang.Object");
    }
}
