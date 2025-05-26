package do2;

/* loaded from: classes2.dex */
public final class s1 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f55933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl2.l f55935c;

    public s1(l82.o oVar, l82.x xVar, z1 z1Var) {
        this.f55933a = oVar;
        this.f55934b = z1Var;
        this.f55935c = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof do2.r1
            if (r0 == 0) goto L13
            r0 = r8
            do2.r1 r0 = (do2.r1) r0
            int r1 = r0.f55922s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55922s = r1
            goto L18
        L13:
            do2.r1 r0 = new do2.r1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f55921r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55922s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.jvm.internal.j0 r7 = r0.f55926w
            do2.j r2 = r0.f55925v
            do2.s1 r4 = r0.f55924u
            ue.c.H(r8)
            goto L5a
        L3c:
            ue.c.H(r8)
            kotlin.jvm.internal.j0 r8 = new kotlin.jvm.internal.j0
            r8.<init>()
            java.lang.Object r2 = r6.f55933a
            r8.f80434a = r2
            r0.f55924u = r6
            r0.f55925v = r7
            r0.f55926w = r8
            r0.f55922s = r4
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r4 = r6
            r2 = r7
            r7 = r8
        L5a:
            do2.i r8 = r4.f55934b
            do2.u1 r5 = new do2.u1
            kl2.l r4 = r4.f55935c
            r5.<init>(r7, r4, r2)
            r7 = 0
            r0.f55924u = r7
            r0.f55925v = r7
            r0.f55926w = r7
            r0.f55922s = r3
            java.lang.Object r7 = r8.collect(r5, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.s1.collect(do2.j, bl2.c):java.lang.Object");
    }
}
