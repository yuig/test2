package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fo2 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final un1 f5229a;

    public fo2(un1 networkConnectivityManager) {
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        this.f5229a = networkConnectivityManager;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.TELEPHONY;
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
            boolean r0 = r5 instanceof ads_mobile_sdk.eo2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.eo2 r0 = (ads_mobile_sdk.eo2) r0
            int r1 = r0.f4913c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4913c = r1
            goto L18
        L13:
            ads_mobile_sdk.eo2 r0 = new ads_mobile_sdk.eo2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4911a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4913c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ue.c.H(r5)
            ads_mobile_sdk.un1 r5 = r4.f5229a
            r0.f4913c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fo2.c(bl2.c):java.lang.Object");
    }
}
