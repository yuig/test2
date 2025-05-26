package a;

/* loaded from: classes2.dex */
public interface wc {
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object a(a.wc r5, ads_mobile_sdk.ln0 r6, ads_mobile_sdk.r0 r7, ads_mobile_sdk.y60 r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.sd0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.sd0 r0 = (ads_mobile_sdk.sd0) r0
            int r1 = r0.f11050f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11050f = r1
            goto L18
        L13:
            ads_mobile_sdk.sd0 r0 = new ads_mobile_sdk.sd0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f11048d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11050f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ads_mobile_sdk.y60 r8 = r0.f11047c
            ads_mobile_sdk.r0 r7 = r0.f11046b
            ads_mobile_sdk.ln0 r6 = r0.f11045a
            ue.c.H(r9)
            goto L77
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ue.c.H(r9)
            ads_mobile_sdk.ym0 r9 = r6.f7894a
            r0.f11045a = r6
            r0.f11046b = r7
            r0.f11047c = r8
            r0.f11050f = r3
            r5.getClass()
            nm.u r2 = new nm.u
            r2.<init>()
            ads_mobile_sdk.hf r3 = r5.a()
            boolean r3 = r3.f5945d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_muted"
            r2.u(r4, r3)
            ads_mobile_sdk.hf r5 = r5.a()
            float r5 = r5.f5944c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "app_volume"
            r2.u(r3, r5)
            java.lang.String r5 = "volume"
            java.lang.Object r5 = r9.a(r2, r5, r0)
            if (r5 != r1) goto L72
            goto L74
        L72:
            kotlin.Unit r5 = kotlin.Unit.f80348a
        L74:
            if (r5 != r1) goto L77
            return r1
        L77:
            r6.f7895b = r8
            boolean r5 = r7.Y
            if (r5 == 0) goto L99
            ads_mobile_sdk.io2 r5 = new ads_mobile_sdk.io2
            android.content.Context r7 = r6.getContext()
            java.lang.String r8 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r5.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 49
            r9 = -2
            r7.<init>(r9, r9, r8)
            r6.addView(r5, r7)
            r6.bringChildToFront(r5)
        L99:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wc.a(a.wc, ads_mobile_sdk.ln0, ads_mobile_sdk.r0, ads_mobile_sdk.y60, bl2.c):java.lang.Object");
    }

    ads_mobile_sdk.hf a();
}
