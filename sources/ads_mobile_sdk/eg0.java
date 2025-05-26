package ads_mobile_sdk;

import a.zb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class eg0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.n5 f4851a;

    /* renamed from: b, reason: collision with root package name */
    public final mo2.a f4852b;

    /* renamed from: c, reason: collision with root package name */
    public sf0 f4853c;

    public eg0(a.n5 dataStore, zb clock) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f4851a = dataStore;
        this.f4852b = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v9, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.eg0 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.uf0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.uf0 r0 = (ads_mobile_sdk.uf0) r0
            int r1 = r0.f12061f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12061f = r1
            goto L18
        L13:
            ads_mobile_sdk.uf0 r0 = new ads_mobile_sdk.uf0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12059d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12061f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            mo2.a r7 = r0.f12058c
            java.lang.Object r1 = r0.f12057b
            ads_mobile_sdk.sf0 r1 = (ads_mobile_sdk.sf0) r1
            ads_mobile_sdk.eg0 r0 = r0.f12056a
            ue.c.H(r8)
            goto La6
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            ads_mobile_sdk.eg0 r7 = r0.f12056a
            ue.c.H(r8)
            goto L88
        L45:
            java.lang.Object r7 = r0.f12057b
            mo2.a r7 = (mo2.a) r7
            ads_mobile_sdk.eg0 r2 = r0.f12056a
            ue.c.H(r8)
            r8 = r7
            r7 = r2
            goto L65
        L51:
            ue.c.H(r8)
            mo2.a r8 = r7.f4852b
            r0.f12056a = r7
            r0.f12057b = r8
            r0.f12061f = r5
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r2 = r8.f(r6, r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            ads_mobile_sdk.sf0 r2 = r7.f4853c     // Catch: java.lang.Throwable -> Lba
            mo2.c r8 = (mo2.c) r8
            r8.i(r6)
            if (r2 == 0) goto L6f
            return r2
        L6f:
            a.n5 r8 = r7.f4851a
            java.lang.Object r8 = r8.get()
            a6.h r8 = (a6.h) r8
            do2.i r8 = r8.getData()
            r0.f12056a = r7
            r0.f12057b = r6
            r0.f12061f = r4
            java.lang.Object r8 = lb.l0.h0(r8, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            ads_mobile_sdk.sf0 r8 = (ads_mobile_sdk.sf0) r8
            if (r8 != 0) goto L90
            ads_mobile_sdk.sf0 r8 = ads_mobile_sdk.sf0.t()
        L90:
            mo2.a r2 = r7.f4852b
            r0.f12056a = r7
            r0.f12057b = r8
            r0.f12058c = r2
            r0.f12061f = r3
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r0 = r2.f(r6, r0)
            if (r0 != r1) goto La3
            return r1
        La3:
            r0 = r7
            r1 = r8
            r7 = r2
        La6:
            r0.f4853c = r1     // Catch: java.lang.Throwable -> Lb3
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> Lb3
            mo2.c r7 = (mo2.c) r7
            r7.i(r6)
            kotlin.jvm.internal.Intrinsics.f(r1)
            return r1
        Lb3:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r6)
            throw r8
        Lba:
            r7 = move-exception
            mo2.c r8 = (mo2.c) r8
            r8.i(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg0.a(ads_mobile_sdk.eg0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.eg0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.vf0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.vf0 r0 = (ads_mobile_sdk.vf0) r0
            int r1 = r0.f12487e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12487e = r1
            goto L18
        L13:
            ads_mobile_sdk.vf0 r0 = new ads_mobile_sdk.vf0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12485c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12487e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f12484b
            ads_mobile_sdk.eg0 r0 = r0.f12483a
            ue.c.H(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r6)
            mo2.a r6 = r5.f4852b
            r0.f12483a = r5
            r0.f12484b = r6
            r0.f12487e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            ads_mobile_sdk.sf0 r5 = r5.f4853c     // Catch: java.lang.Throwable -> L5e
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            if (r5 == 0) goto L57
            java.util.Map r4 = r5.x()
        L57:
            if (r4 != 0) goto L5d
            kotlin.collections.r0 r4 = kotlin.collections.z0.d()
        L5d:
            return r4
        L5e:
            r5 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg0.b(ads_mobile_sdk.eg0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(2:25|26))(3:31|32|(1:34)(1:35))|27|(1:29)(6:30|13|14|15|16|17)))|38|6|7|(0)(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "exception");
        r0 = ads_mobile_sdk.qs2.a();
        r0.f().f6988j = false;
        r0.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.xf0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.xf0 r0 = (ads_mobile_sdk.xf0) r0
            int r1 = r0.f13638f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13638f = r1
            goto L18
        L13:
            ads_mobile_sdk.xf0 r0 = new ads_mobile_sdk.xf0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f13636d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13638f
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            mo2.a r1 = r0.f13635c
            ads_mobile_sdk.sf0 r2 = r0.f13634b
            ads_mobile_sdk.eg0 r0 = r0.f13633a
            ue.c.H(r7)     // Catch: java.lang.Exception -> L31
            goto L75
        L31:
            r7 = move-exception
            goto L86
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            ads_mobile_sdk.eg0 r2 = r0.f13633a
            ue.c.H(r7)     // Catch: java.lang.Exception -> L31
            goto L5d
        L41:
            ue.c.H(r7)
            a.n5 r7 = r6.f4851a     // Catch: java.lang.Exception -> L31
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Exception -> L31
            a6.h r7 = (a6.h) r7     // Catch: java.lang.Exception -> L31
            a.gg r2 = new a.gg     // Catch: java.lang.Exception -> L31
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L31
            r0.f13633a = r6     // Catch: java.lang.Exception -> L31
            r0.f13638f = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Exception -> L31
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            ads_mobile_sdk.sf0 r7 = (ads_mobile_sdk.sf0) r7     // Catch: java.lang.Exception -> L31
            mo2.a r3 = r2.f4852b     // Catch: java.lang.Exception -> L31
            r0.f13633a = r2     // Catch: java.lang.Exception -> L31
            r0.f13634b = r7     // Catch: java.lang.Exception -> L31
            r0.f13635c = r3     // Catch: java.lang.Exception -> L31
            r0.f13638f = r4     // Catch: java.lang.Exception -> L31
            mo2.c r3 = (mo2.c) r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r0 = r3.f(r5, r0)     // Catch: java.lang.Exception -> L31
            if (r0 != r1) goto L72
            return r1
        L72:
            r0 = r2
            r1 = r3
            r2 = r7
        L75:
            r0.f4853c = r2     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7f
            mo2.c r1 = (mo2.c) r1     // Catch: java.lang.Exception -> L31
            r1.i(r5)     // Catch: java.lang.Exception -> L31
            goto L99
        L7f:
            r7 = move-exception
            mo2.c r1 = (mo2.c) r1     // Catch: java.lang.Exception -> L31
            r1.i(r5)     // Catch: java.lang.Exception -> L31
            throw r7     // Catch: java.lang.Exception -> L31
        L86:
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            ads_mobile_sdk.cs2 r0 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r1 = r0.f()
            r2 = 0
            r1.f6988j = r2
            r0.a(r7)
        L99:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg0.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(2:25|26))(3:31|32|(1:34))|27|(1:29)(6:30|13|14|15|16|17)))|37|6|7|(0)(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "exception");
        r8 = ads_mobile_sdk.qs2.a();
        r8.f().f6988j = false;
        r8.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.eg0 r7, java.lang.String r8, java.lang.String r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.ag0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.ag0 r0 = (ads_mobile_sdk.ag0) r0
            int r1 = r0.f2395f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2395f = r1
            goto L18
        L13:
            ads_mobile_sdk.ag0 r0 = new ads_mobile_sdk.ag0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f2393d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2395f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            mo2.a r7 = r0.f2392c
            ads_mobile_sdk.sf0 r8 = r0.f2391b
            ads_mobile_sdk.eg0 r9 = r0.f2390a
            ue.c.H(r10)     // Catch: java.lang.Exception -> L31
            goto L75
        L31:
            r7 = move-exception
            goto L86
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            ads_mobile_sdk.eg0 r7 = r0.f2390a
            ue.c.H(r10)     // Catch: java.lang.Exception -> L31
            goto L5c
        L41:
            ue.c.H(r10)
            a.n5 r10 = r7.f4851a     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L31
            a6.h r10 = (a6.h) r10     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.bg0 r2 = new ads_mobile_sdk.bg0     // Catch: java.lang.Exception -> L31
            r2.<init>(r9, r8, r5)     // Catch: java.lang.Exception -> L31
            r0.f2390a = r7     // Catch: java.lang.Exception -> L31
            r0.f2395f = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r10.a(r2, r0)     // Catch: java.lang.Exception -> L31
            if (r10 != r1) goto L5c
            return r1
        L5c:
            r8 = r10
            ads_mobile_sdk.sf0 r8 = (ads_mobile_sdk.sf0) r8     // Catch: java.lang.Exception -> L31
            mo2.a r9 = r7.f4852b     // Catch: java.lang.Exception -> L31
            r0.f2390a = r7     // Catch: java.lang.Exception -> L31
            r0.f2391b = r8     // Catch: java.lang.Exception -> L31
            r0.f2392c = r9     // Catch: java.lang.Exception -> L31
            r0.f2395f = r3     // Catch: java.lang.Exception -> L31
            mo2.c r9 = (mo2.c) r9     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r9.f(r5, r0)     // Catch: java.lang.Exception -> L31
            if (r10 != r1) goto L72
            return r1
        L72:
            r6 = r9
            r9 = r7
            r7 = r6
        L75:
            r9.f4853c = r8     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7f
            mo2.c r7 = (mo2.c) r7     // Catch: java.lang.Exception -> L31
            r7.i(r5)     // Catch: java.lang.Exception -> L31
            goto L99
        L7f:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7     // Catch: java.lang.Exception -> L31
            r7.i(r5)     // Catch: java.lang.Exception -> L31
            throw r8     // Catch: java.lang.Exception -> L31
        L86:
            java.lang.String r8 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            ads_mobile_sdk.cs2 r8 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r9 = r8.f()
            r10 = 0
            r9.f6988j = r10
            r8.a(r7)
        L99:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg0.a(ads_mobile_sdk.eg0, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(2:25|26))(3:31|32|(1:34))|27|(1:29)(6:30|13|14|15|16|17)))|37|6|7|(0)(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "exception");
        r8 = ads_mobile_sdk.qs2.a();
        r8.f().f6988j = false;
        r8.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.eg0 r7, ads_mobile_sdk.ds r8, nm.u r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.cg0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.cg0 r0 = (ads_mobile_sdk.cg0) r0
            int r1 = r0.f3906f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3906f = r1
            goto L18
        L13:
            ads_mobile_sdk.cg0 r0 = new ads_mobile_sdk.cg0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f3904d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3906f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            mo2.a r7 = r0.f3903c
            ads_mobile_sdk.sf0 r8 = r0.f3902b
            ads_mobile_sdk.eg0 r9 = r0.f3901a
            ue.c.H(r10)     // Catch: java.lang.Exception -> L31
            goto L75
        L31:
            r7 = move-exception
            goto L86
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            ads_mobile_sdk.eg0 r7 = r0.f3901a
            ue.c.H(r10)     // Catch: java.lang.Exception -> L31
            goto L5c
        L41:
            ue.c.H(r10)
            a.n5 r10 = r7.f4851a     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L31
            a6.h r10 = (a6.h) r10     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.dg0 r2 = new ads_mobile_sdk.dg0     // Catch: java.lang.Exception -> L31
            r2.<init>(r8, r9, r5)     // Catch: java.lang.Exception -> L31
            r0.f3901a = r7     // Catch: java.lang.Exception -> L31
            r0.f3906f = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r10.a(r2, r0)     // Catch: java.lang.Exception -> L31
            if (r10 != r1) goto L5c
            return r1
        L5c:
            r8 = r10
            ads_mobile_sdk.sf0 r8 = (ads_mobile_sdk.sf0) r8     // Catch: java.lang.Exception -> L31
            mo2.a r9 = r7.f4852b     // Catch: java.lang.Exception -> L31
            r0.f3901a = r7     // Catch: java.lang.Exception -> L31
            r0.f3902b = r8     // Catch: java.lang.Exception -> L31
            r0.f3903c = r9     // Catch: java.lang.Exception -> L31
            r0.f3906f = r3     // Catch: java.lang.Exception -> L31
            mo2.c r9 = (mo2.c) r9     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r9.f(r5, r0)     // Catch: java.lang.Exception -> L31
            if (r10 != r1) goto L72
            return r1
        L72:
            r6 = r9
            r9 = r7
            r7 = r6
        L75:
            r9.f4853c = r8     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7f
            mo2.c r7 = (mo2.c) r7     // Catch: java.lang.Exception -> L31
            r7.i(r5)     // Catch: java.lang.Exception -> L31
            goto L99
        L7f:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7     // Catch: java.lang.Exception -> L31
            r7.i(r5)     // Catch: java.lang.Exception -> L31
            throw r8     // Catch: java.lang.Exception -> L31
        L86:
            java.lang.String r8 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            ads_mobile_sdk.cs2 r8 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r9 = r8.f()
            r10 = 0
            r9.f6988j = r10
            r8.a(r7)
        L99:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg0.a(ads_mobile_sdk.eg0, ads_mobile_sdk.ds, nm.u, bl2.c):java.lang.Object");
    }
}
