package do2;

/* loaded from: classes2.dex */
public final class u1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl2.l f55965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f55966c;

    public u1(kotlin.jvm.internal.j0 j0Var, kl2.l lVar, j jVar) {
        this.f55964a = j0Var;
        this.f55965b = lVar;
        this.f55966c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof do2.t1
            if (r0 == 0) goto L13
            r0 = r8
            do2.t1 r0 = (do2.t1) r0
            int r1 = r0.f55955v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55955v = r1
            goto L18
        L13:
            do2.t1 r0 = new do2.t1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f55953t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55955v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.jvm.internal.j0 r7 = r0.f55952s
            do2.u1 r2 = r0.f55951r
            ue.c.H(r8)
            goto L54
        L3a:
            ue.c.H(r8)
            kotlin.jvm.internal.j0 r8 = r6.f55964a
            java.lang.Object r2 = r8.f80434a
            r0.f55951r = r6
            r0.f55952s = r8
            r0.f55955v = r4
            kl2.l r4 = r6.f55965b
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L54:
            r7.f80434a = r8
            do2.j r7 = r2.f55966c
            kotlin.jvm.internal.j0 r8 = r2.f55964a
            java.lang.Object r8 = r8.f80434a
            r2 = 0
            r0.f55951r = r2
            r0.f55952s = r2
            r0.f55955v = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.u1.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
