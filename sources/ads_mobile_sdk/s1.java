package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s1 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f10900a;

    /* renamed from: b, reason: collision with root package name */
    public final zr f10901b;

    public s1(j0 backgroundScope, zr consentManager) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f10900a = backgroundScope;
        this.f10901b = consentManager;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_ID_INFO;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.q1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.q1 r0 = (ads_mobile_sdk.q1) r0
            int r1 = r0.f9903c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9903c = r1
            goto L18
        L13:
            ads_mobile_sdk.q1 r0 = new ads_mobile_sdk.q1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f9901a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9903c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r8)
            goto L5e
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            ue.c.H(r8)
            ao2.j0 r8 = r7.f10900a
            ads_mobile_sdk.r1 r2 = new ads_mobile_sdk.r1
            r4 = 0
            r2.<init>(r7, r4)
            kotlin.coroutines.j r5 = kotlin.coroutines.j.f80412a
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            ads_mobile_sdk.dt2 r6 = new ads_mobile_sdk.dt2
            r6.<init>(r2, r4)
            r2 = 2
            ao2.q0 r8 = kotlin.jvm.internal.j.d(r8, r5, r6, r2)
            r0.f9903c = r3
            java.lang.Object r8 = r8.v(r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r8 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r8
            ads_mobile_sdk.p1 r0 = new ads_mobile_sdk.p1
            r0.<init>(r8)
            ads_mobile_sdk.pk0 r8 = new ads_mobile_sdk.pk0
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s1.c(bl2.c):java.lang.Object");
    }
}
