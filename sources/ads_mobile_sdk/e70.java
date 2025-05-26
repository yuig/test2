package ads_mobile_sdk;

import a.hb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e70 implements hb {

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f4738a;

    /* renamed from: b, reason: collision with root package name */
    public final fg f4739b;

    /* renamed from: c, reason: collision with root package name */
    public final yp0 f4740c;

    /* renamed from: d, reason: collision with root package name */
    public final t60 f4741d;

    public e70(oh0 flags, fg appState, yp0 httpClient, t60 debugDialogManager) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        this.f4738a = flags;
        this.f4739b = appState;
        this.f4740c = httpClient;
        this.f4741d = debugDialogManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.hb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.cf2 r8, ads_mobile_sdk.r0 r9, wi.b0 r10, bl2.c r11) {
        /*
            r7 = this;
            boolean r10 = r11 instanceof ads_mobile_sdk.d70
            if (r10 == 0) goto L13
            r10 = r11
            ads_mobile_sdk.d70 r10 = (ads_mobile_sdk.d70) r10
            int r0 = r10.f4185d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.f4185d = r0
            goto L18
        L13:
            ads_mobile_sdk.d70 r10 = new ads_mobile_sdk.d70
            r10.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r10.f4183b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f4185d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ue.c.H(r11)
            goto L96
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            ads_mobile_sdk.e70 r8 = r10.f4182a
            ue.c.H(r11)
            goto L76
        L38:
            ue.c.H(r11)
            ads_mobile_sdk.fg r11 = r7.f4739b
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.f5147g
            boolean r11 = r11.get()
            if (r11 == 0) goto L99
            nm.u r11 = r9.A
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L4e
            goto L99
        L4e:
            ads_mobile_sdk.t60 r11 = r7.f4741d
            ads_mobile_sdk.oh0 r1 = r7.f4738a
            ads_mobile_sdk.jh0 r4 = ads_mobile_sdk.oh0.f9294r
            java.lang.String r5 = "gads:drx_debug:send_debug_data_url"
            java.lang.String r6 = "https://www.google.com/dfp/sendDebugData"
            java.lang.Object r1 = r1.a(r5, r6, r4)
            java.lang.String r1 = (java.lang.String) r1
            ads_mobile_sdk.ue2 r8 = r8.f3892a
            wi.k r8 = r8.f12050a
            java.lang.String r8 = r8.l()
            nm.u r9 = r9.A
            r10.f4182a = r7
            r10.f4185d = r3
            ads_mobile_sdk.ku0 r11 = r11.f11417j
            java.lang.Object r11 = r11.a(r1, r8, r9, r10)
            if (r11 != r0) goto L75
            return r0
        L75:
            r8 = r7
        L76:
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
            ads_mobile_sdk.yp0 r8 = r8.f4740c
            java.net.URL r11 = new java.net.URL
            r11.<init>(r9)
            r9 = 0
            r10.f4182a = r9
            r10.f4185d = r2
            r1 = 6
            java.lang.Object r8 = ads_mobile_sdk.yp0.a(r8, r11, r9, r10, r1)
            if (r8 != r0) goto L96
            return r0
        L96:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L99:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e70.a(ads_mobile_sdk.cf2, ads_mobile_sdk.r0, wi.b0, bl2.c):java.lang.Object");
    }
}
