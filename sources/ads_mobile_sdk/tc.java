package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tc implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final zr f11500a;

    public tc(zr consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f11500a = consentManager;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AMAZON_FIRE_AD_ID;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.sc
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.sc r0 = (ads_mobile_sdk.sc) r0
            int r1 = r0.f11030d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11030d = r1
            goto L18
        L13:
            ads_mobile_sdk.sc r0 = new ads_mobile_sdk.sc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f11028b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11030d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f11027a
            java.lang.String r0 = (java.lang.String) r0
            ue.c.H(r7)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.f11027a
            ads_mobile_sdk.tc r2 = (ads_mobile_sdk.tc) r2
            ue.c.H(r7)
            goto L4f
        L3e:
            ue.c.H(r7)
            ads_mobile_sdk.zr r7 = r6.f11500a
            r0.f11027a = r6
            r0.f11030d = r4
            java.lang.Object r7 = r7.l(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            java.lang.String r7 = (java.lang.String) r7
            ads_mobile_sdk.zr r2 = r2.f11500a
            r0.f11027a = r7
            r0.f11030d = r3
            java.lang.Object r0 = r2.u(r0)
            if (r0 != r1) goto L5e
            return r1
        L5e:
            r5 = r0
            r0 = r7
            r7 = r5
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            ads_mobile_sdk.rc r1 = new ads_mobile_sdk.rc
            r1.<init>(r0, r7)
            ads_mobile_sdk.pk0 r7 = new ads_mobile_sdk.pk0
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tc.c(bl2.c):java.lang.Object");
    }
}
