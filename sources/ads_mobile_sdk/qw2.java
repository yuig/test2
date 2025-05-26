package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qw2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final zr f10299a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f10300b;

    public qw2(zr consentManager, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f10299a = consentManager;
        this.f10300b = traceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r4, java.util.Map r5, bl2.c r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof ads_mobile_sdk.pw2
            if (r4 == 0) goto L13
            r4 = r6
            ads_mobile_sdk.pw2 r4 = (ads_mobile_sdk.pw2) r4
            int r0 = r4.f9844d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f9844d = r0
            goto L18
        L13:
            ads_mobile_sdk.pw2 r4 = new ads_mobile_sdk.pw2
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.f9842b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r4.f9844d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ads_mobile_sdk.qw2 r4 = r4.f9841a
            ue.c.H(r6)     // Catch: ads_mobile_sdk.e21 -> L29
            goto L75
        L29:
            r5 = move-exception
            goto L7a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ue.c.H(r6)
            java.lang.String r6 = "allowlist"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Allowlist is missing from an updateAllowlist GMSG: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            ads_mobile_sdk.ft2.b(r4)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L54:
            qk.c r5 = qk.d.f104038e     // Catch: java.lang.IllegalArgumentException -> L89
            byte[] r5 = r5.a(r6)     // Catch: java.lang.IllegalArgumentException -> L89
            java.lang.String r6 = "decode(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.IllegalArgumentException -> L89
            ads_mobile_sdk.zr r6 = r3.f10299a     // Catch: ads_mobile_sdk.e21 -> L78
            ads_mobile_sdk.cq r5 = ads_mobile_sdk.cq.a(r5)     // Catch: ads_mobile_sdk.e21 -> L78
            java.lang.String r1 = "parseFrom(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch: ads_mobile_sdk.e21 -> L78
            r4.f9841a = r3     // Catch: ads_mobile_sdk.e21 -> L78
            r4.f9844d = r2     // Catch: ads_mobile_sdk.e21 -> L78
            java.lang.Object r4 = r6.a(r5, r4)     // Catch: ads_mobile_sdk.e21 -> L78
            if (r4 != r0) goto L75
            return r0
        L75:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L78:
            r5 = move-exception
            r4 = r3
        L7a:
            ads_mobile_sdk.ft2.b(r5)
            a.j3 r4 = r4.f10300b
            ads_mobile_sdk.ks2 r4 = (ads_mobile_sdk.ks2) r4
            java.lang.String r6 = "Allowlist proto deserialization failed."
            r4.a(r6, r5)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L89:
            r4 = move-exception
            ads_mobile_sdk.ft2.b(r4)
            a.j3 r5 = r3.f10300b
            ads_mobile_sdk.ks2 r5 = (ads_mobile_sdk.ks2) r5
            java.lang.String r6 = "Allowlist gmsg param is not a valid encoded string."
            r5.a(r6, r4)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qw2.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_UPDATE_CONSENT_ALLOWLIST;
    }
}
