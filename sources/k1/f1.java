package k1;

/* loaded from: classes2.dex */
public final class f1 extends u2.p implements s3.f2 {

    /* renamed from: n, reason: collision with root package name */
    public o1.l f77862n;

    /* renamed from: o, reason: collision with root package name */
    public o1.h f77863o;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object M0(k1.f1 r4, bl2.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof k1.b1
            if (r0 == 0) goto L16
            r0 = r5
            k1.b1 r0 = (k1.b1) r0
            int r1 = r0.f77822v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f77822v = r1
            goto L1b
        L16:
            k1.b1 r0 = new k1.b1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f77820t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f77822v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            o1.h r4 = r0.f77819s
            k1.f1 r0 = r0.f77818r
            ue.c.H(r5)
            r5 = r4
            r4 = r0
            goto L53
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            ue.c.H(r5)
            o1.h r5 = r4.f77863o
            if (r5 != 0) goto L55
            o1.h r5 = new o1.h
            r5.<init>()
            o1.l r2 = r4.f77862n
            r0.f77818r = r4
            r0.f77819s = r5
            r0.f77822v = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L53
            goto L57
        L53:
            r4.f77863o = r5
        L55:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f1.M0(k1.f1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object N0(k1.f1 r4, bl2.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof k1.c1
            if (r0 == 0) goto L16
            r0 = r5
            k1.c1 r0 = (k1.c1) r0
            int r1 = r0.f77835u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f77835u = r1
            goto L1b
        L16:
            k1.c1 r0 = new k1.c1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f77833s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f77835u
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            k1.f1 r4 = r0.f77832r
            ue.c.H(r5)
            goto L4d
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r5)
            o1.h r5 = r4.f77863o
            if (r5 == 0) goto L50
            o1.i r2 = new o1.i
            r2.<init>(r5)
            o1.l r5 = r4.f77862n
            r0.f77832r = r4
            r0.f77835u = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4d
            goto L52
        L4d:
            r5 = 0
            r4.f77863o = r5
        L50:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f1.N0(k1.f1, bl2.c):java.lang.Object");
    }

    @Override // u2.p
    public final void E0() {
        O0();
    }

    public final void O0() {
        o1.h hVar = this.f77863o;
        if (hVar != null) {
            this.f77862n.b(new o1.i(hVar));
            this.f77863o = null;
        }
    }

    @Override // s3.f2
    public final void W(n3.j jVar, n3.k kVar, long j13) {
        if (kVar == n3.k.Main) {
            int i13 = jVar.f89073d;
            if (n3.o.a(i13, 4)) {
                kotlin.jvm.internal.j.z(z0(), null, null, new d1(this, null), 3);
            } else if (n3.o.a(i13, 5)) {
                kotlin.jvm.internal.j.z(z0(), null, null, new e1(this, null), 3);
            }
        }
    }

    @Override // s3.f2
    public final void c0() {
        O0();
    }
}
