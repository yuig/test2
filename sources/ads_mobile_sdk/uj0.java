package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uj0 implements a.s8 {

    /* renamed from: a, reason: collision with root package name */
    public final zr f12087a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f12088b;

    /* renamed from: c, reason: collision with root package name */
    public final a.j3 f12089c;

    public uj0(zr consentManager, oh0 flags, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f12087a = consentManager;
        this.f12088b = flags;
        this.f12089c = traceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.s8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.u r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof ads_mobile_sdk.tj0
            if (r6 == 0) goto L13
            r6 = r7
            ads_mobile_sdk.tj0 r6 = (ads_mobile_sdk.tj0) r6
            int r0 = r6.f11568d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f11568d = r0
            goto L18
        L13:
            ads_mobile_sdk.tj0 r6 = new ads_mobile_sdk.tj0
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.f11566b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f11568d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ads_mobile_sdk.uj0 r6 = r6.f11565a
            ue.c.H(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ue.c.H(r7)
            ads_mobile_sdk.oh0 r7 = r5.f12088b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r3 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r4 = "gads:topics_signal:enabled"
            java.lang.Object r7 = r7.a(r4, r1, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L4b:
            ads_mobile_sdk.zr r7 = r5.f12087a
            r6.f11565a = r5
            r6.f11568d = r2
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.zr.a(r7, r2, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            r6 = r5
        L5c:
            a.ad r7 = (a.ad) r7
            boolean r0 = r7 instanceof ads_mobile_sdk.kk0
            if (r0 == 0) goto L72
            a.j3 r6 = r6.f12089c
            ads_mobile_sdk.kk0 r7 = (ads_mobile_sdk.kk0) r7
            java.lang.Throwable r7 = r7.f7342c
            ads_mobile_sdk.ks2 r6 = (ads_mobile_sdk.ks2) r6
            java.lang.String r0 = "GetTopicsApiWithRecordObservationActionHandler"
            r6.a(r0, r7)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L72:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uj0.a(nm.u, bl2.c):java.lang.Object");
    }
}
