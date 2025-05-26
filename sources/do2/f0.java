package do2;

/* loaded from: classes4.dex */
public final class f0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f55778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl2.l f55779b;

    public f0(i iVar, kl2.l lVar) {
        this.f55778a = iVar;
        this.f55779b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r9, bl2.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof do2.e0
            if (r0 == 0) goto L13
            r0 = r10
            do2.e0 r0 = (do2.e0) r0
            int r1 = r0.f55762s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55762s = r1
            goto L18
        L13:
            do2.e0 r0 = new do2.e0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f55761r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55762s
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f55764u
            eo2.k0 r9 = (eo2.k0) r9
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f55764u
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            ue.c.H(r10)
            goto La0
        L44:
            do2.j r9 = r0.f55765v
            java.lang.Object r2 = r0.f55764u
            do2.f0 r2 = (do2.f0) r2
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            ue.c.H(r10)
            do2.i r10 = r8.f55778a     // Catch: java.lang.Throwable -> L8a
            r0.f55764u = r8     // Catch: java.lang.Throwable -> L8a
            r0.f55765v = r9     // Catch: java.lang.Throwable -> L8a
            r0.f55762s = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            eo2.k0 r10 = new eo2.k0
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            kl2.l r9 = r2.f55779b     // Catch: java.lang.Throwable -> L82
            r0.f55764u = r10     // Catch: java.lang.Throwable -> L82
            r0.f55765v = r6     // Catch: java.lang.Throwable -> L82
            r0.f55762s = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            do2.a3 r10 = new do2.a3
            r10.<init>(r9)
            kl2.l r2 = r2.f55779b
            r0.f55764u = r9
            r0.f55765v = r6
            r0.f55762s = r4
            java.lang.Object r10 = com.bumptech.glide.c.f(r10, r2, r9, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.f0.collect(do2.j, bl2.c):java.lang.Object");
    }
}
