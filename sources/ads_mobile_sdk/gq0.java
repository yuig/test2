package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gq0 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final yp0 f5661a;

    public gq0(yp0 httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f5661a = httpClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(2:20|21)(2:22|(1:24)))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        ads_mobile_sdk.ft2.b(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r4, java.util.Map r5, bl2.c r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof ads_mobile_sdk.fq0
            if (r4 == 0) goto L13
            r4 = r6
            ads_mobile_sdk.fq0 r4 = (ads_mobile_sdk.fq0) r4
            int r0 = r4.f5239c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f5239c = r0
            goto L18
        L13:
            ads_mobile_sdk.fq0 r4 = new ads_mobile_sdk.fq0
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.f5237a
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r4.f5239c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ue.c.H(r6)     // Catch: java.lang.Exception -> L27
            goto L68
        L27:
            r4 = move-exception
            goto L65
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r6)
            java.lang.String r6 = "u"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "URL is missing from an httpTrack GMSG: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            ads_mobile_sdk.ft2.b(r4)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L53:
            ads_mobile_sdk.yp0 r5 = r3.f5661a     // Catch: java.lang.Exception -> L27
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L27
            r1.<init>(r6)     // Catch: java.lang.Exception -> L27
            r4.f5239c = r2     // Catch: java.lang.Exception -> L27
            r6 = 0
            r2 = 6
            java.lang.Object r4 = ads_mobile_sdk.yp0.a(r5, r1, r6, r4, r2)     // Catch: java.lang.Exception -> L27
            if (r4 != r0) goto L68
            return r0
        L65:
            ads_mobile_sdk.ft2.b(r4)
        L68:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gq0.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NAME_HTTP_TRACK;
    }
}
