package a;

import ads_mobile_sdk.ol0;

/* loaded from: classes2.dex */
public interface t5 {
    ol0 a();

    default Object a(bl2.c cVar) {
        return a(this, cVar);
    }

    Object c(bl2.c cVar);

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #3 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0067, B:14:0x006d), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:21:0x007b, B:23:0x0082, B:25:0x0089, B:27:0x008d, B:29:0x0091, B:30:0x0094, B:31:0x0099, B:32:0x009a, B:33:0x00a1, B:34:0x00a2, B:35:0x00a9, B:36:0x00aa), top: B:20:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:21:0x007b, B:23:0x0082, B:25:0x0089, B:27:0x008d, B:29:0x0091, B:30:0x0094, B:31:0x0099, B:32:0x009a, B:33:0x00a1, B:34:0x00a2, B:35:0x00a9, B:36:0x00aa), top: B:20:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object a(a.t5 r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.hj2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.hj2 r0 = (ads_mobile_sdk.hj2) r0
            int r1 = r0.f6001e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6001e = r1
            goto L18
        L13:
            ads_mobile_sdk.hj2 r0 = new ads_mobile_sdk.hj2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f5999c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6001e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ads_mobile_sdk.cs2 r8 = r0.f5998b
            ads_mobile_sdk.cs2 r0 = r0.f5997a
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2c
            goto L67
        L2c:
            r9 = move-exception
            goto L7b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ue.c.H(r9)
            ads_mobile_sdk.il0 r9 = ads_mobile_sdk.il0.CUI_NAME_SIGNAL
            java.util.WeakHashMap r2 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r2 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r9 = ads_mobile_sdk.qs2.a(r9, r2, r3)
            ads_mobile_sdk.cs2 r2 = ads_mobile_sdk.qs2.a()     // Catch: java.lang.Throwable -> L77
            ads_mobile_sdk.jw1 r2 = r2.f()     // Catch: java.lang.Throwable -> L77
            ads_mobile_sdk.xi2 r5 = new ads_mobile_sdk.xi2     // Catch: java.lang.Throwable -> L77
            ads_mobile_sdk.ol0 r6 = r8.a()     // Catch: java.lang.Throwable -> L77
            r7 = 6
            r5.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L77
            r2.f6995q = r5     // Catch: java.lang.Throwable -> L77
            r0.f5997a = r9     // Catch: java.lang.Throwable -> L77
            r0.f5998b = r9     // Catch: java.lang.Throwable -> L77
            r0.f6001e = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L77
            if (r8 != r1) goto L64
            return r1
        L64:
            r0 = r9
            r9 = r8
            r8 = r0
        L67:
            a.ad r9 = (a.ad) r9     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r9 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L73
            r1 = r9
            ads_mobile_sdk.jk0 r1 = (ads_mobile_sdk.jk0) r1     // Catch: java.lang.Throwable -> L2c
            ads_mobile_sdk.ft2.a(r1)     // Catch: java.lang.Throwable -> L2c
        L73:
            dl2.b.J(r8, r4)
            return r9
        L77:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
        L7b:
            r0.b(r9)     // Catch: java.lang.Throwable -> L92
            boolean r1 = r9 instanceof a.jf     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto Laa
            r0.a(r9)     // Catch: java.lang.Throwable -> L92
            boolean r0 = r9 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto La2
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L9a
            boolean r0 = r9 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L94
            throw r9     // Catch: java.lang.Throwable -> L92
        L92:
            r9 = move-exception
            goto Lab
        L94:
            ads_mobile_sdk.dk0 r0 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L92
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L92
        L9a:
            ads_mobile_sdk.yj0 r0 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.CancellationException r9 = (java.util.concurrent.CancellationException) r9     // Catch: java.lang.Throwable -> L92
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L92
        La2:
            ads_mobile_sdk.xl0 r0 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.TimeoutCancellationException r9 = (kotlinx.coroutines.TimeoutCancellationException) r9     // Catch: java.lang.Throwable -> L92
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L92
        Laa:
            throw r9     // Catch: java.lang.Throwable -> L92
        Lab:
            throw r9     // Catch: java.lang.Throwable -> Lac
        Lac:
            r0 = move-exception
            dl2.b.J(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t5.a(a.t5, bl2.c):java.lang.Object");
    }
}
