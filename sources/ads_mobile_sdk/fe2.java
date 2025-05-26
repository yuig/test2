package ads_mobile_sdk;

import a.zb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fe2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.n5 f5130a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f5131b;

    /* renamed from: c, reason: collision with root package name */
    public final mo2.a f5132c;

    /* renamed from: d, reason: collision with root package name */
    public ae2 f5133d;

    public fe2(a.n5 dataStore, zb clock) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f5130a = dataStore;
        this.f5131b = clock;
        this.f5132c = mo2.d.a();
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
    public static java.lang.Object a(ads_mobile_sdk.fe2 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ce2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ce2 r0 = (ads_mobile_sdk.ce2) r0
            int r1 = r0.f3889f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3889f = r1
            goto L18
        L13:
            ads_mobile_sdk.ce2 r0 = new ads_mobile_sdk.ce2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3887d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3889f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            mo2.a r7 = r0.f3886c
            java.lang.Object r1 = r0.f3885b
            ads_mobile_sdk.ae2 r1 = (ads_mobile_sdk.ae2) r1
            ads_mobile_sdk.fe2 r0 = r0.f3884a
            ue.c.H(r8)
            goto La6
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            ads_mobile_sdk.fe2 r7 = r0.f3884a
            ue.c.H(r8)
            goto L88
        L45:
            java.lang.Object r7 = r0.f3885b
            mo2.a r7 = (mo2.a) r7
            ads_mobile_sdk.fe2 r2 = r0.f3884a
            ue.c.H(r8)
            r8 = r7
            r7 = r2
            goto L65
        L51:
            ue.c.H(r8)
            mo2.a r8 = r7.f5132c
            r0.f3884a = r7
            r0.f3885b = r8
            r0.f3889f = r5
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r2 = r8.f(r6, r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            ads_mobile_sdk.ae2 r2 = r7.f5133d     // Catch: java.lang.Throwable -> Lba
            mo2.c r8 = (mo2.c) r8
            r8.i(r6)
            if (r2 == 0) goto L6f
            return r2
        L6f:
            a.n5 r8 = r7.f5130a
            java.lang.Object r8 = r8.get()
            a6.h r8 = (a6.h) r8
            do2.i r8 = r8.getData()
            r0.f3884a = r7
            r0.f3885b = r6
            r0.f3889f = r4
            java.lang.Object r8 = lb.l0.h0(r8, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            ads_mobile_sdk.ae2 r8 = (ads_mobile_sdk.ae2) r8
            if (r8 != 0) goto L90
            ads_mobile_sdk.ae2 r8 = ads_mobile_sdk.ae2.s()
        L90:
            mo2.a r2 = r7.f5132c
            r0.f3884a = r7
            r0.f3885b = r8
            r0.f3886c = r2
            r0.f3889f = r3
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r0 = r2.f(r6, r0)
            if (r0 != r1) goto La3
            return r1
        La3:
            r0 = r7
            r1 = r8
            r7 = r2
        La6:
            r0.f5133d = r1     // Catch: java.lang.Throwable -> Lb3
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
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fe2.a(ads_mobile_sdk.fe2, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(2:25|26))(3:31|32|(1:34))|27|(1:29)(6:30|13|14|15|16|17)))|37|6|7|(0)(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "exception");
        r7 = ads_mobile_sdk.qs2.a();
        r7.f().f6988j = false;
        r7.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.fe2 r6, java.lang.String r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.de2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.de2 r0 = (ads_mobile_sdk.de2) r0
            int r1 = r0.f4255f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4255f = r1
            goto L18
        L13:
            ads_mobile_sdk.de2 r0 = new ads_mobile_sdk.de2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4253d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4255f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            mo2.a r6 = r0.f4252c
            ads_mobile_sdk.ae2 r7 = r0.f4251b
            ads_mobile_sdk.fe2 r0 = r0.f4250a
            ue.c.H(r8)     // Catch: java.lang.Exception -> L31
            goto L74
        L31:
            r6 = move-exception
            goto L85
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            ads_mobile_sdk.fe2 r6 = r0.f4250a
            ue.c.H(r8)     // Catch: java.lang.Exception -> L31
            goto L5c
        L41:
            ue.c.H(r8)
            a.n5 r8 = r6.f5130a     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Exception -> L31
            a6.h r8 = (a6.h) r8     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.ee2 r2 = new ads_mobile_sdk.ee2     // Catch: java.lang.Exception -> L31
            r2.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L31
            r0.f4250a = r6     // Catch: java.lang.Exception -> L31
            r0.f4255f = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Exception -> L31
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r7 = r8
            ads_mobile_sdk.ae2 r7 = (ads_mobile_sdk.ae2) r7     // Catch: java.lang.Exception -> L31
            mo2.a r8 = r6.f5132c     // Catch: java.lang.Exception -> L31
            r0.f4250a = r6     // Catch: java.lang.Exception -> L31
            r0.f4251b = r7     // Catch: java.lang.Exception -> L31
            r0.f4252c = r8     // Catch: java.lang.Exception -> L31
            r0.f4255f = r3     // Catch: java.lang.Exception -> L31
            mo2.c r8 = (mo2.c) r8     // Catch: java.lang.Exception -> L31
            java.lang.Object r0 = r8.f(r5, r0)     // Catch: java.lang.Exception -> L31
            if (r0 != r1) goto L72
            return r1
        L72:
            r0 = r6
            r6 = r8
        L74:
            r0.f5133d = r7     // Catch: java.lang.Throwable -> L7e
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7e
            mo2.c r6 = (mo2.c) r6     // Catch: java.lang.Exception -> L31
            r6.i(r5)     // Catch: java.lang.Exception -> L31
            goto L98
        L7e:
            r7 = move-exception
            mo2.c r6 = (mo2.c) r6     // Catch: java.lang.Exception -> L31
            r6.i(r5)     // Catch: java.lang.Exception -> L31
            throw r7     // Catch: java.lang.Exception -> L31
        L85:
            java.lang.String r7 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            ads_mobile_sdk.cs2 r7 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r8 = r7.f()
            r0 = 0
            r8.f6988j = r0
            r7.a(r6)
        L98:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fe2.a(ads_mobile_sdk.fe2, java.lang.String, bl2.c):java.lang.Object");
    }
}
