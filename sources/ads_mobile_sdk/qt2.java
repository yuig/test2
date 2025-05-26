package ads_mobile_sdk;

import a.zb;
import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class qt2 implements a.q6, a.bg {

    /* renamed from: a, reason: collision with root package name */
    public final sb2 f10271a;

    /* renamed from: b, reason: collision with root package name */
    public final n81 f10272b;

    /* renamed from: c, reason: collision with root package name */
    public final y4 f10273c;

    /* renamed from: d, reason: collision with root package name */
    public final x92 f10274d;

    /* renamed from: e, reason: collision with root package name */
    public final Optional f10275e;

    /* renamed from: f, reason: collision with root package name */
    public final cf2 f10276f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f10277g;

    /* renamed from: h, reason: collision with root package name */
    public final ss2 f10278h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10279i;

    /* renamed from: j, reason: collision with root package name */
    public final zb f10280j;

    /* renamed from: k, reason: collision with root package name */
    public final ze2 f10281k;

    /* renamed from: l, reason: collision with root package name */
    public final kd0 f10282l;

    public qt2(sb2 rootTraceCreator, n81 macroExpander, y4 adSpamClient, x92 retryingUrlPinger, Optional view, cf2 serverTransaction, r0 adConfiguration, ss2 traceMetaSet, int i13, zb clock, ze2 serverSideVerificationOptionsHolder, kd0 firebaseAnalyticsEventHandler) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(macroExpander, "macroExpander");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(serverSideVerificationOptionsHolder, "serverSideVerificationOptionsHolder");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        this.f10271a = rootTraceCreator;
        this.f10272b = macroExpander;
        this.f10273c = adSpamClient;
        this.f10274d = retryingUrlPinger;
        this.f10275e = view;
        this.f10276f = serverTransaction;
        this.f10277g = adConfiguration;
        this.f10278h = traceMetaSet;
        this.f10279i = i13;
        this.f10280j = clock;
        this.f10281k = serverSideVerificationOptionsHolder;
        this.f10282l = firebaseAnalyticsEventHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // a.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wi.o r12, bl2.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.lt2
            if (r0 == 0) goto L14
            r0 = r13
            ads_mobile_sdk.lt2 r0 = (ads_mobile_sdk.lt2) r0
            int r1 = r0.f7962d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7962d = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            ads_mobile_sdk.lt2 r0 = new ads_mobile_sdk.lt2
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f7960b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f7962d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            ads_mobile_sdk.qt2 r12 = r9.f7959a
            ue.c.H(r13)
            goto La5
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            ue.c.H(r13)
            r12.getClass()
            wi.n r12 = r12.f129975a
            int r12 = r12.getValue()
            ads_mobile_sdk.r0 r13 = r11.f10277g
            java.util.List r13 = r13.U
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.g0.q(r13, r1)
            r3.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L53:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r13.next()
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "2."
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "@gw_mpe@"
            java.lang.String r1 = kotlin.text.z.n(r1, r5, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r3.add(r1)
            goto L53
        L85:
            ads_mobile_sdk.n81 r1 = r11.f10272b
            ads_mobile_sdk.cf2 r12 = r11.f10276f
            ads_mobile_sdk.r0 r4 = r11.f10277g
            int r13 = r11.f10279i
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r9.f7959a = r11
            r9.f7962d = r2
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 112(0x70, float:1.57E-43)
            r2 = r3
            r3 = r12
            java.lang.Object r13 = ads_mobile_sdk.n81.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto La4
            return r0
        La4:
            r12 = r11
        La5:
            java.util.List r13 = (java.util.List) r13
            r12.a(r13)
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qt2.a(wi.o, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // a.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.ot2
            if (r0 == 0) goto L14
            r0 = r13
            ads_mobile_sdk.ot2 r0 = (ads_mobile_sdk.ot2) r0
            int r1 = r0.f9438d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9438d = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            ads_mobile_sdk.ot2 r0 = new ads_mobile_sdk.ot2
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f9436b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f9438d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ads_mobile_sdk.qt2 r0 = r9.f9435a
            ue.c.H(r13)
            goto L5a
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            ue.c.H(r13)
            ads_mobile_sdk.n81 r1 = r12.f10272b
            ads_mobile_sdk.r0 r4 = r12.f10277g
            java.util.List r13 = r4.f10364e0
            ads_mobile_sdk.cf2 r3 = r12.f10276f
            int r5 = r12.f10279i
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r9.f9435a = r12
            r9.f9438d = r2
            r8 = 0
            r10 = 112(0x70, float:1.57E-43)
            r7 = 0
            r11 = 0
            r2 = r13
            r5 = r6
            r6 = r7
            r7 = r11
            java.lang.Object r13 = ads_mobile_sdk.n81.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L59
            return r0
        L59:
            r0 = r12
        L5a:
            java.util.List r13 = (java.util.List) r13
            r0.a(r13)
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qt2.f(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // a.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(bl2.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.pt2
            if (r0 == 0) goto L14
            r0 = r13
            ads_mobile_sdk.pt2 r0 = (ads_mobile_sdk.pt2) r0
            int r1 = r0.f9813d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9813d = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            ads_mobile_sdk.pt2 r0 = new ads_mobile_sdk.pt2
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f9811b
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f9813d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ads_mobile_sdk.qt2 r0 = r9.f9810a
            ue.c.H(r13)
            goto L5a
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            ue.c.H(r13)
            ads_mobile_sdk.n81 r1 = r12.f10272b
            ads_mobile_sdk.r0 r4 = r12.f10277g
            java.util.List r13 = r4.f10366f0
            ads_mobile_sdk.cf2 r3 = r12.f10276f
            int r5 = r12.f10279i
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r9.f9810a = r12
            r9.f9813d = r2
            r8 = 0
            r10 = 112(0x70, float:1.57E-43)
            r7 = 0
            r11 = 0
            r2 = r13
            r5 = r6
            r6 = r7
            r7 = r11
            java.lang.Object r13 = ads_mobile_sdk.n81.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L59
            return r0
        L59:
            r0 = r12
        L5a:
            java.util.List r13 = (java.util.List) r13
            r0.a(r13)
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qt2.j(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0125 -> B:17:0x0129). Please report as a decompilation issue!!! */
    @Override // a.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(bl2.c r20) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qt2.l(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0125 -> B:17:0x0129). Please report as a decompilation issue!!! */
    @Override // a.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(bl2.c r20) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qt2.o(bl2.c):java.lang.Object");
    }

    @Override // a.bg
    public final Unit a(cj.a rewardItem, bl2.c cVar) {
        n81 n81Var = this.f10272b;
        List uris = this.f10277g.f10358b0;
        this.f10280j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ze2 ze2Var = this.f10281k;
        co2 co2Var = ze2Var.f14728a;
        rl2.u[] uVarArr = ze2.f14727b;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(co2Var.getValue(ze2Var, uVarArr[0]));
        ze2 ze2Var2 = this.f10281k;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(ze2Var2.f14728a.getValue(ze2Var2, uVarArr[0]));
        n81Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        ArrayList arrayList = new ArrayList(g0.q(uris, 10));
        Iterator it = uris.iterator();
        while (it.hasNext()) {
            String uri = ((Uri) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            String n13 = z.n(z.n(z.n(uri, "@gw_rwd_userid@", ""), "@gw_rwd_custom_data@", ""), "@gw_tmstmp@", String.valueOf(elapsedRealtime));
            String encode = Uri.encode(rewardItem.getType());
            Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
            arrayList.add(Uri.parse(z.n(z.n(z.n(n13, "@gw_rwd_itm@", encode), "@gw_rwd_amt@", String.valueOf(rewardItem.getAmount())), "@gw_sdkver@", n81Var.f8698a)));
        }
        a(arrayList);
        return Unit.f80348a;
    }

    public final void a(List uris) {
        x92 x92Var = this.f10274d;
        x92Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        w92 w92Var = x92Var.f13550c;
        r0 adConfiguration = x92Var.f13548a;
        vo commonConfiguration = x92Var.f13549b;
        w92Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        if (((Boolean) w92Var.f12904a.a("gads:use_retry_strategy:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() && adConfiguration.b() && adConfiguration.f10390r0 != null) {
            Iterator it = uris.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
                Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
                if (((Boolean) w92Var.f12904a.a("gads:use_retry_strategy:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() && adConfiguration.b() && adConfiguration.f10390r0 != null) {
                    kotlin.jvm.internal.j.z(w92Var.f12907d, null, null, new u92(w92Var, uri, adConfiguration, commonConfiguration, null), 3);
                } else {
                    cx2 cx2Var = w92Var.f12909f;
                    cx2Var.getClass();
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    cx2Var.f4060f.g(uri);
                }
            }
            return;
        }
        cx2 cx2Var2 = w92Var.f12909f;
        cx2Var2.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Iterator it2 = uris.iterator();
        while (it2.hasNext()) {
            cx2Var2.f4060f.g((Uri) it2.next());
        }
    }
}
