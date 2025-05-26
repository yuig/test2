package do2;

/* loaded from: classes2.dex */
public final class m0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f55855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55856b;

    public m0(j jVar, kotlin.jvm.internal.j0 j0Var) {
        this.f55855a = jVar;
        this.f55856b = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof do2.l0
            if (r0 == 0) goto L13
            r0 = r6
            do2.l0 r0 = (do2.l0) r0
            int r1 = r0.f55843u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55843u = r1
            goto L18
        L13:
            do2.l0 r0 = new do2.l0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f55841s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55843u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            do2.m0 r5 = r0.f55840r
            ue.c.H(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            do2.j r6 = r4.f55855a     // Catch: java.lang.Throwable -> L46
            r0.f55840r = r4     // Catch: java.lang.Throwable -> L46
            r0.f55843u = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L46:
            r6 = move-exception
            r5 = r4
        L48:
            kotlin.jvm.internal.j0 r5 = r5.f55856b
            r5.f80434a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.m0.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
