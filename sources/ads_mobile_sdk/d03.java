package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d03 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f4083a;

    /* renamed from: b, reason: collision with root package name */
    public final a.e4 f4084b;

    public d03(ym0 gmaWebView, a.e4 omidMonitor) {
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        this.f4083a = gmaWebView;
        this.f4084b = omidMonitor;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.c03
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.c03 r0 = (ads_mobile_sdk.c03) r0
            int r1 = r0.f3674d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3674d = r1
            goto L18
        L13:
            ads_mobile_sdk.c03 r0 = new ads_mobile_sdk.c03
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3672b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3674d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r7)
            goto L76
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            ue.c.H(r7)
            goto L66
        L39:
            ads_mobile_sdk.d03 r2 = r0.f3671a
            ue.c.H(r7)
            goto L50
        L3f:
            ue.c.H(r7)
            a.e4 r7 = r6.f4084b
            r0.f3671a = r6
            r0.f3674d = r5
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r2 = r6
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r5 = 0
            if (r7 == 0) goto L69
            a.e4 r7 = r2.f4084b
            r0.f3671a = r5
            r0.f3674d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L69:
            ads_mobile_sdk.ym0 r7 = r2.f4083a
            r0.f3671a = r5
            r0.f3674d = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d03.a(bl2.c):java.lang.Object");
    }
}
