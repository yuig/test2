package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dh1 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final a.n5 f4283d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f4284e;

    /* renamed from: f, reason: collision with root package name */
    public ug1 f4285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh1(a.n5 dataStore) {
        super(il0.CUI_NAME_SDKINIT_INIT_NATIVE_AD_SETTINGS, false, 4);
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f4283d = dataStore;
        this.f4284e = mo2.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.xg1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xg1 r0 = (ads_mobile_sdk.xg1) r0
            int r1 = r0.f13654d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13654d = r1
            goto L18
        L13:
            ads_mobile_sdk.xg1 r0 = new ads_mobile_sdk.xg1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13652b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13654d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f13651a
            ue.c.H(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            r0.f13651a = r5
            r0.f13654d = r3
            java.lang.Object r6 = r4.g(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            ads_mobile_sdk.ug1 r6 = (ads_mobile_sdk.ug1) r6
            java.util.Map r6 = r6.r()
            java.lang.Object r5 = r6.get(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.a(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x007c, B:15:0x0080, B:16:0x0089), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v14, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v8, types: [mo2.a] */
    @Override // ads_mobile_sdk.yr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.yg1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.yg1 r0 = (ads_mobile_sdk.yg1) r0
            int r1 = r0.f14243e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14243e = r1
            goto L18
        L13:
            ads_mobile_sdk.yg1 r0 = new ads_mobile_sdk.yg1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14241c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14243e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f14240b
            ads_mobile_sdk.dh1 r1 = (ads_mobile_sdk.dh1) r1
            java.lang.Object r0 = r0.f14239a
            mo2.a r0 = (mo2.a) r0
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L33
            goto L7c
        L33:
            r8 = move-exception
            goto L98
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f14240b
            mo2.a r2 = (mo2.a) r2
            java.lang.Object r4 = r0.f14239a
            ads_mobile_sdk.dh1 r4 = (ads_mobile_sdk.dh1) r4
            ue.c.H(r8)
            r8 = r2
            goto L5f
        L4a:
            ue.c.H(r8)
            mo2.a r8 = r7.f4284e
            r0.f14239a = r7
            r0.f14240b = r8
            r0.f14243e = r4
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r2 = r8.f(r5, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r4 = r7
        L5f:
            a.n5 r2 = r4.f4283d     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L9c
            a6.h r2 = (a6.h) r2     // Catch: java.lang.Throwable -> L9c
            do2.i r2 = r2.getData()     // Catch: java.lang.Throwable -> L9c
            r0.f14239a = r8     // Catch: java.lang.Throwable -> L9c
            r0.f14240b = r4     // Catch: java.lang.Throwable -> L9c
            r0.f14243e = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = lb.l0.h0(r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r0 != r1) goto L78
            return r1
        L78:
            r1 = r4
            r6 = r0
            r0 = r8
            r8 = r6
        L7c:
            ads_mobile_sdk.ug1 r8 = (ads_mobile_sdk.ug1) r8     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L89
            ads_mobile_sdk.ug1 r8 = ads_mobile_sdk.ug1.t()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "getDefaultInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch: java.lang.Throwable -> L33
        L89:
            r1.f4285f = r8     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L33
            mo2.c r0 = (mo2.c) r0
            r0.i(r5)
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            r0.<init>(r8)
            return r0
        L98:
            r6 = r0
            r0 = r8
            r8 = r6
            goto L9d
        L9c:
            r0 = move-exception
        L9d:
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.e(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.vg1
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.vg1 r0 = (ads_mobile_sdk.vg1) r0
            int r1 = r0.f12502c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12502c = r1
            goto L18
        L13:
            ads_mobile_sdk.vg1 r0 = new ads_mobile_sdk.vg1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12500a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12502c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ue.c.H(r5)
            r0.f12502c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            ads_mobile_sdk.ug1 r5 = (ads_mobile_sdk.ug1) r5
            long r0 = r5.s()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.f(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x004a, B:16:0x0054, B:17:0x0059), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.wg1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.wg1 r0 = (ads_mobile_sdk.wg1) r0
            int r1 = r0.f13031e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13031e = r1
            goto L18
        L13:
            ads_mobile_sdk.wg1 r0 = new ads_mobile_sdk.wg1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13029c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13031e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f13028b
            ads_mobile_sdk.dh1 r0 = r0.f13027a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f4284e
            r0.f13027a = r5
            r0.f13028b = r6
            r0.f13031e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            ads_mobile_sdk.ug1 r6 = r0.f4285f     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L54
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L54:
            java.lang.String r6 = "nativeAdSettings"
            kotlin.jvm.internal.Intrinsics.r(r6)     // Catch: java.lang.Throwable -> L5a
            throw r4     // Catch: java.lang.Throwable -> L5a
        L5a:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.g(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, bl2.c r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.bh1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.bh1 r0 = (ads_mobile_sdk.bh1) r0
            int r1 = r0.f2885f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2885f = r1
            goto L18
        L13:
            ads_mobile_sdk.bh1 r0 = new ads_mobile_sdk.bh1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2883d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2885f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            mo2.a r7 = r0.f2882c
            ads_mobile_sdk.ug1 r9 = r0.f2881b
            ads_mobile_sdk.dh1 r0 = r0.f2880a
            ue.c.H(r8)
            goto L73
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            ads_mobile_sdk.dh1 r7 = r0.f2880a
            ue.c.H(r8)
            goto L5b
        L3f:
            ue.c.H(r8)
            a.n5 r8 = r6.f4283d
            java.lang.Object r8 = r8.get()
            a6.h r8 = (a6.h) r8
            ads_mobile_sdk.ch1 r2 = new ads_mobile_sdk.ch1
            r2.<init>(r7, r5, r9)
            r0.f2880a = r6
            r0.f2885f = r4
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r7 = r6
        L5b:
            r9 = r8
            ads_mobile_sdk.ug1 r9 = (ads_mobile_sdk.ug1) r9
            mo2.a r8 = r7.f4284e
            r0.f2880a = r7
            r0.f2881b = r9
            r0.f2882c = r8
            r0.f2885f = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r5, r0)
            if (r0 != r1) goto L71
            return r1
        L71:
            r0 = r7
            r7 = r8
        L73:
            r0.f4285f = r9     // Catch: java.lang.Throwable -> L7d
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7d
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            return r8
        L7d:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.a(java.lang.String, bl2.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r7, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.zg1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.zg1 r0 = (ads_mobile_sdk.zg1) r0
            int r1 = r0.f14767f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14767f = r1
            goto L18
        L13:
            ads_mobile_sdk.zg1 r0 = new ads_mobile_sdk.zg1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14765d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14767f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            mo2.a r7 = r0.f14764c
            ads_mobile_sdk.ug1 r8 = r0.f14763b
            ads_mobile_sdk.dh1 r0 = r0.f14762a
            ue.c.H(r9)
            goto L73
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            ads_mobile_sdk.dh1 r7 = r0.f14762a
            ue.c.H(r9)
            goto L5b
        L3f:
            ue.c.H(r9)
            a.n5 r9 = r6.f4283d
            java.lang.Object r9 = r9.get()
            a6.h r9 = (a6.h) r9
            ads_mobile_sdk.ah1 r2 = new ads_mobile_sdk.ah1
            r2.<init>(r7, r5)
            r0.f14762a = r6
            r0.f14767f = r4
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            r7 = r6
        L5b:
            r8 = r9
            ads_mobile_sdk.ug1 r8 = (ads_mobile_sdk.ug1) r8
            mo2.a r9 = r7.f4284e
            r0.f14762a = r7
            r0.f14763b = r8
            r0.f14764c = r9
            r0.f14767f = r3
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r0 = r9.f(r5, r0)
            if (r0 != r1) goto L71
            return r1
        L71:
            r0 = r7
            r7 = r9
        L73:
            r0.f4285f = r8     // Catch: java.lang.Throwable -> L7d
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7d
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            return r8
        L7d:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dh1.e(long, bl2.c):java.lang.Object");
    }
}
