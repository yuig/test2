package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hw1 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final zr f6129a;

    public hw1(zr consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f6129a = consentManager;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.PER_APP_ID_V2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.gw1
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.gw1 r0 = (ads_mobile_sdk.gw1) r0
            int r1 = r0.f5728c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5728c = r1
            goto L18
        L13:
            ads_mobile_sdk.gw1 r0 = new ads_mobile_sdk.gw1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5726a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5728c
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
            ads_mobile_sdk.zr r5 = r4.f6129a
            r0.f5728c = r3
            java.lang.Object r5 = r5.r(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            a.ad r5 = (a.ad) r5
            if (r5 == 0) goto L4f
            boolean r0 = r5 instanceof ads_mobile_sdk.jk0
            if (r0 == 0) goto L48
            ads_mobile_sdk.jk0 r5 = (ads_mobile_sdk.jk0) r5
            return r5
        L48:
            ads_mobile_sdk.pk0 r5 = (ads_mobile_sdk.pk0) r5
            java.lang.Object r5 = r5.f9719b
            ads_mobile_sdk.ew1 r5 = (ads_mobile_sdk.ew1) r5
            goto L50
        L4f:
            r5 = 0
        L50:
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.fw1 r1 = new ads_mobile_sdk.fw1
            r1.<init>(r5)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hw1.c(bl2.c):java.lang.Object");
    }
}
