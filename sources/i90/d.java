package i90;

import kotlin.collections.q0;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final xz.b f71777a = new xz.b(q0.f80391a);

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(2:29|30))|11|(1:13)(1:23)|14|15|(2:17|18)(2:20|21)))|33|6|7|(0)(0)|11|(0)(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r6 = xk2.s.f135225b;
        r5 = ue.c.m(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0041, B:13:0x0045, B:14:0x0055, B:27:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(x02.i2 r5, java.lang.String r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof i90.b
            if (r0 == 0) goto L13
            r0 = r7
            i90.b r0 = (i90.b) r0
            int r1 = r0.f71774s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71774s = r1
            goto L18
        L13:
            i90.b r0 = new i90.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f71773r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f71774s
            xz.b r3 = i90.d.f71777a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r7)
            xk2.q r7 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L29
            r0.f71774s = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = ve.h.y(r5, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L41
            goto L67
        L41:
            com.pinterest.api.model.f30 r7 = (com.pinterest.api.model.f30) r7     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L54
            xz.b r5 = new xz.b     // Catch: java.lang.Throwable -> L29
            h90.b r6 = new h90.b     // Catch: java.lang.Throwable -> L29
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L29
            java.util.List r6 = kotlin.collections.e0.b(r6)     // Catch: java.lang.Throwable -> L29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L29
            goto L55
        L54:
            r5 = r3
        L55:
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L29
            goto L5e
        L58:
            xk2.q r6 = xk2.s.f135225b
            xk2.r r5 = ue.c.m(r5)
        L5e:
            java.lang.Throwable r6 = xk2.s.a(r5)
            if (r6 != 0) goto L66
            r1 = r5
            goto L67
        L66:
            r1 = r3
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i90.d.a(x02.i2, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(2:29|30))|11|(1:13)(1:23)|14|15|(2:17|18)(2:20|21)))|33|6|7|(0)(0)|11|(0)(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r6 = xk2.s.f135225b;
        r5 = ue.c.m(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0041, B:13:0x0045, B:14:0x0055, B:27:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(x02.x2 r5, java.lang.String r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof i90.c
            if (r0 == 0) goto L13
            r0 = r7
            i90.c r0 = (i90.c) r0
            int r1 = r0.f71776s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71776s = r1
            goto L18
        L13:
            i90.c r0 = new i90.c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f71775r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f71776s
            xz.b r3 = i90.d.f71777a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r7)
            xk2.q r7 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L29
            r0.f71776s = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = ve.h.y(r5, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L41
            goto L67
        L41:
            com.pinterest.api.model.wy0 r7 = (com.pinterest.api.model.wy0) r7     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L54
            xz.b r5 = new xz.b     // Catch: java.lang.Throwable -> L29
            h90.a r6 = new h90.a     // Catch: java.lang.Throwable -> L29
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L29
            java.util.List r6 = kotlin.collections.e0.b(r6)     // Catch: java.lang.Throwable -> L29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L29
            goto L55
        L54:
            r5 = r3
        L55:
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L29
            goto L5e
        L58:
            xk2.q r6 = xk2.s.f135225b
            xk2.r r5 = ue.c.m(r5)
        L5e:
            java.lang.Throwable r6 = xk2.s.a(r5)
            if (r6 != 0) goto L66
            r1 = r5
            goto L67
        L66:
            r1 = r3
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i90.d.b(x02.x2, java.lang.String, bl2.c):java.lang.Object");
    }
}
