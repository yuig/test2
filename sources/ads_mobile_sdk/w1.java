package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w1 extends hn2 {

    /* renamed from: e, reason: collision with root package name */
    public final zr f12812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(zr consentManager) {
        super(il0.CUI_NAME_SDKINIT_INIT_AD_ID_PERMISSION);
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f12812e = consentManager;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_ID_PERMISSION;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.v1
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.v1 r0 = (ads_mobile_sdk.v1) r0
            int r1 = r0.f12290c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12290c = r1
            goto L18
        L13:
            ads_mobile_sdk.v1 r0 = new ads_mobile_sdk.v1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12288a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12290c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ue.c.H(r5)
            ads_mobile_sdk.zr r5 = r4.f12812e
            r0.f12290c = r3
            r5.getClass()
            a.l0 r0 = ads_mobile_sdk.cm0.f3958f
            android.content.Context r5 = r5.f14873d
            java.lang.String r0 = "com.google.android.gms.permission.AD_ID"
            boolean r5 = a.l0.d(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            ads_mobile_sdk.u1 r0 = new ads_mobile_sdk.u1
            r0.<init>(r5)
            ads_mobile_sdk.pk0 r5 = new ads_mobile_sdk.pk0
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w1.c(bl2.c):java.lang.Object");
    }
}
