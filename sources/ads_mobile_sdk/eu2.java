package ads_mobile_sdk;

import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class eu2 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final zr f4960a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f4961b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4962c;

    public eu2(oh0 flags, zr consentManager, Optional optionalSignalRequest) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(optionalSignalRequest, "optionalSignalRequest");
        this.f4960a = consentManager;
        this.f4961b = optionalSignalRequest;
        this.f4962c = flags.I();
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.TRUSTLESS_TOKEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.du2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.du2 r0 = (ads_mobile_sdk.du2) r0
            int r1 = r0.f4458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4458c = r1
            goto L18
        L13:
            ads_mobile_sdk.du2 r0 = new ads_mobile_sdk.du2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4456a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4458c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            ue.c.H(r6)
            goto L68
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            ue.c.H(r6)
            java.util.Optional r6 = r5.f4961b
            java.lang.Object r6 = kh2.m2.U0(r6)
            dj.e r6 = (dj.e) r6
            if (r6 == 0) goto L5a
            java.util.List r2 = r5.f4962c
            ads_mobile_sdk.nl0 r6 = r6.f55121l
            int r6 = r6.a()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r6 = r2.contains(r6)
            if (r6 != 0) goto L5a
            ads_mobile_sdk.pk0 r6 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.cu2 r0 = new ads_mobile_sdk.cu2
            r0.<init>(r3)
            r6.<init>(r0)
            return r6
        L5a:
            ads_mobile_sdk.zr r6 = r5.f4960a
            r0.f4458c = r4
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.zr.g(r6, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            a.ad r6 = (a.ad) r6
            if (r6 == 0) goto L7a
            boolean r0 = r6 instanceof ads_mobile_sdk.jk0
            if (r0 == 0) goto L73
            ads_mobile_sdk.jk0 r6 = (ads_mobile_sdk.jk0) r6
            return r6
        L73:
            ads_mobile_sdk.pk0 r6 = (ads_mobile_sdk.pk0) r6
            java.lang.Object r6 = r6.f9719b
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L7a:
            ads_mobile_sdk.pk0 r6 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.cu2 r0 = new ads_mobile_sdk.cu2
            r0.<init>(r3)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eu2.c(bl2.c):java.lang.Object");
    }
}
