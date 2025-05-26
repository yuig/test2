package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yl2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final ku0 f14312a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f14313b;

    /* renamed from: c, reason: collision with root package name */
    public final a.j3 f14314c;

    public yl2(ku0 inspectorManager, oh0 flags, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f14312a = inspectorManager;
        this.f14313b = flags;
        this.f14314c = traceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r12, java.util.Map r13, bl2.c r14) {
        /*
            r11 = this;
            boolean r12 = r14 instanceof ads_mobile_sdk.xl2
            if (r12 == 0) goto L14
            r12 = r14
            ads_mobile_sdk.xl2 r12 = (ads_mobile_sdk.xl2) r12
            int r0 = r12.f13720e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r12.f13720e = r0
        L12:
            r9 = r12
            goto L1a
        L14:
            ads_mobile_sdk.xl2 r12 = new ads_mobile_sdk.xl2
            r12.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r12 = r9.f13718c
            cl2.a r14 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r9.f13720e
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            java.util.Map r13 = r9.f13717b
            ads_mobile_sdk.yl2 r14 = r9.f13716a
            ue.c.H(r12)     // Catch: java.lang.NumberFormatException -> L2d
            goto L8a
        L2d:
            r12 = move-exception
            goto L8d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            ue.c.H(r12)
            ads_mobile_sdk.oh0 r12 = r11.f14313b
            boolean r12 = r12.M()
            if (r12 != 0) goto L45
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        L45:
            java.lang.String r12 = "extras"
            java.lang.Object r12 = r13.get(r12)
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Laf
            int r12 = r4.length()
            if (r12 != 0) goto L57
            goto Laf
        L57:
            ads_mobile_sdk.ku0 r0 = r11.f14312a     // Catch: java.lang.NumberFormatException -> L68
            java.lang.String r12 = "expires"
            java.lang.Object r12 = r13.get(r12)     // Catch: java.lang.NumberFormatException -> L68
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.NumberFormatException -> L68
            if (r12 == 0) goto L6b
            long r2 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L68
            goto L70
        L68:
            r12 = move-exception
            r14 = r11
            goto L8d
        L6b:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L70:
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.NumberFormatException -> L68
            r5.<init>(r2)     // Catch: java.lang.NumberFormatException -> L68
            r9.f13716a = r11     // Catch: java.lang.NumberFormatException -> L68
            r9.f13717b = r13     // Catch: java.lang.NumberFormatException -> L68
            r9.f13720e = r1     // Catch: java.lang.NumberFormatException -> L68
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 231(0xe7, float:3.24E-43)
            java.lang.Object r12 = ads_mobile_sdk.ku0.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.NumberFormatException -> L68
            if (r12 != r14) goto L8a
            return r14
        L8a:
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        L8d:
            java.lang.String r0 = "Invalid expiration in SingleAdSourceTesting GMSG."
            ads_mobile_sdk.gk0.d(r0)
            a.j3 r14 = r14.f14314c
            ads_mobile_sdk.ks2 r14 = (ads_mobile_sdk.ks2) r14
            java.lang.String r0 = "SingleAdSourceTestingGmsgHandler.onGmsg"
            r14.a(r0, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid expiration in SingleAdSource GMSG: "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            ads_mobile_sdk.ft2.b(r12)
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        Laf:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Network Extras is missing from SingleAdSource GMSG: "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            ads_mobile_sdk.ft2.b(r12)
            java.lang.String r12 = "Missing network extras in SingleAdSourceTesting request."
            ads_mobile_sdk.gk0.d(r12)
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yl2.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_INSPECTOR_SINGLE_AD_SOURCE_TEST;
    }
}
