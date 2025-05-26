package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jn implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final y4 f6882a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f6883b;

    /* renamed from: c, reason: collision with root package name */
    public final yg f6884c;

    /* renamed from: d, reason: collision with root package name */
    public final kd0 f6885d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f6886e;

    public jn(y4 adSpamClient, n1 adEventEmitter, yg attributionReportingManager, kd0 firebaseAnalyticsEventHandler, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(attributionReportingManager, "attributionReportingManager");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f6882a = adSpamClient;
        this.f6883b = adEventEmitter;
        this.f6884c = attributionReportingManager;
        this.f6885d = firebaseAnalyticsEventHandler;
        this.f6886e = adConfiguration;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(7:20|21|22|(1:24)|13|14|15))(1:25))(2:29|(2:31|32)(3:33|(2:35|(1:37))|38))|26|(1:28)|21|22|(0)|13|14|15))|41|6|7|(0)(0)|26|(0)|21|22|(0)|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        ads_mobile_sdk.ft2.b(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r9, java.util.Map r10, bl2.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.in
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.in r0 = (ads_mobile_sdk.in) r0
            int r1 = r0.f6497f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6497f = r1
            goto L18
        L13:
            ads_mobile_sdk.in r0 = new ads_mobile_sdk.in
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f6495d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6497f
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r4) goto L43
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            ue.c.H(r11)     // Catch: java.lang.Exception -> L2f
            goto Ld0
        L2f:
            r9 = move-exception
            goto Lcd
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ads_mobile_sdk.ym0 r9 = r0.f6493b
            ads_mobile_sdk.jn r10 = r0.f6492a
            ue.c.H(r11)
            goto Lb6
        L43:
            java.lang.String r9 = r0.f6494c
            ads_mobile_sdk.ym0 r10 = r0.f6493b
            ads_mobile_sdk.jn r2 = r0.f6492a
            ue.c.H(r11)
            r11 = r9
            r9 = r10
            r10 = r2
            goto L96
        L50:
            ue.c.H(r11)
            java.lang.String r11 = "u"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "URL is missing from a click GMSG: "
            r9.<init>(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            ads_mobile_sdk.ft2.b(r9)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L72:
            java.lang.String r2 = "sc"
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            r2 = 0
            java.lang.String r7 = "1"
            boolean r10 = kotlin.text.z.i(r10, r7, r2)
            if (r10 == 0) goto L95
            ads_mobile_sdk.n1 r10 = r8.f6883b
            r0.f6492a = r8
            r0.f6493b = r9
            r0.f6494c = r11
            r0.f6497f = r4
            java.lang.Object r10 = r10.l(r0)
            if (r10 != r1) goto L95
            return r1
        L95:
            r10 = r8
        L96:
            ads_mobile_sdk.kd0 r2 = r10.f6885d
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r4 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
            ads_mobile_sdk.cd0 r4 = ads_mobile_sdk.cd0.f3865b
            ads_mobile_sdk.r0 r7 = r10.f6886e
            android.os.Bundle r7 = r7.f10387q
            r0.f6492a = r10
            r0.f6493b = r9
            r0.f6494c = r6
            r0.f6497f = r5
            java.lang.Object r11 = r2.a(r11, r4, r7, r0)
            if (r11 != r1) goto Lb6
            return r1
        Lb6:
            android.net.Uri r11 = (android.net.Uri) r11
            ads_mobile_sdk.y4 r2 = r10.f6882a     // Catch: java.lang.Exception -> L2f
            android.net.Uri r9 = r2.a(r11, r9)     // Catch: java.lang.Exception -> L2f
            ads_mobile_sdk.yg r10 = r10.f6884c     // Catch: java.lang.Exception -> L2f
            r0.f6492a = r6     // Catch: java.lang.Exception -> L2f
            r0.f6493b = r6     // Catch: java.lang.Exception -> L2f
            r0.f6497f = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r10.c(r9, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto Ld0
            return r1
        Lcd:
            ads_mobile_sdk.ft2.b(r9)
        Ld0:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jn.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NAME_CLICK;
    }
}
