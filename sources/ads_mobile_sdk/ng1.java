package ads_mobile_sdk;

import ao2.j0;
import bj.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ng1 extends v0 {

    /* renamed from: j, reason: collision with root package name */
    public final dz f8784j;

    /* renamed from: k, reason: collision with root package name */
    public final a.v7 f8785k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f8786l;

    /* renamed from: m, reason: collision with root package name */
    public final wj1 f8787m;

    /* renamed from: n, reason: collision with root package name */
    public final uf1 f8788n;

    /* renamed from: o, reason: collision with root package name */
    public final n f8789o;

    /* renamed from: p, reason: collision with root package name */
    public final a.gf f8790p;

    /* renamed from: q, reason: collision with root package name */
    public final sb2 f8791q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f8792r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng1(dz csiTicker, a.o8 adComponentProvider, a.o8 mediaAdComponentProvider, wj1 nativeJavascriptEngineFactory, uf1 nativeAdAssetsFactory, n nativeRequest, a.gf preRenderNativeJavascriptEngineConfigurator, sb2 rootTraceCreator, ss2 traceMetaSet, wi.k baseRequest, h92 requestType, long j13, int i13, r0 adConfiguration, vo commonConfiguration, cf2 serverTransaction, String renderId, j0 backgroundScope, int i14) {
        super(traceMetaSet, baseRequest, requestType, j13, i13, adConfiguration, commonConfiguration, serverTransaction, renderId);
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(mediaAdComponentProvider, "mediaAdComponentProvider");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngineFactory, "nativeJavascriptEngineFactory");
        Intrinsics.checkNotNullParameter(nativeAdAssetsFactory, "nativeAdAssetsFactory");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(preRenderNativeJavascriptEngineConfigurator, "preRenderNativeJavascriptEngineConfigurator");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.f8784j = csiTicker;
        this.f8785k = adComponentProvider;
        this.f8786l = mediaAdComponentProvider;
        this.f8787m = nativeJavascriptEngineFactory;
        this.f8788n = nativeAdAssetsFactory;
        this.f8789o = nativeRequest;
        this.f8790p = preRenderNativeJavascriptEngineConfigurator;
        this.f8791q = rootTraceCreator;
        this.f8792r = backgroundScope;
        this.f8793s = i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.zc r7, ads_mobile_sdk.r0 r8, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ig1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ig1 r0 = (ads_mobile_sdk.ig1) r0
            int r1 = r0.f6399c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6399c = r1
            goto L18
        L13:
            ads_mobile_sdk.ig1 r0 = new ads_mobile_sdk.ig1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f6397a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6399c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r9)
            goto L79
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            ue.c.H(r9)
            nm.u r9 = new nm.u
            r9.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r4 = "isNonagon"
            r9.t(r4, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L4a
            java.lang.String r4 = "skipDeepLinkValidation"
            r9.t(r4, r2)
        L4a:
            nm.u r2 = new nm.u
            r2.<init>()
            ads_mobile_sdk.fs0 r8 = r8.H
            kotlin.jvm.internal.Intrinsics.f(r8)
            nm.u r8 = r8.f5266c
            java.lang.String r4 = "response"
            r2.r(r4, r8)
            java.lang.String r8 = "sdk_params"
            r2.r(r8, r9)
            r0.f6399c = r3
            r7.getClass()
            java.lang.String r8 = r2.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.String r9 = "google.afma.nativeAds.preProcessJson"
            java.lang.Object r9 = r7.a(r9, r8, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            a.ad r9 = (a.ad) r9
            boolean r7 = r9 instanceof ads_mobile_sdk.jk0
            if (r7 == 0) goto L82
            ads_mobile_sdk.jk0 r9 = (ads_mobile_sdk.jk0) r9
            return r9
        L82:
            java.lang.String r7 = "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>"
            kotlin.jvm.internal.Intrinsics.g(r9, r7)
            ads_mobile_sdk.pk0 r9 = (ads_mobile_sdk.pk0) r9
            java.lang.Object r7 = r9.f9719b
            nm.u r7 = (nm.u) r7
            java.lang.String r8 = "success"
            r9 = 0
            boolean r8 = ads_mobile_sdk.k41.a(r7, r8, r9)
            if (r8 != 0) goto La1
            ads_mobile_sdk.nk0 r7 = new ads_mobile_sdk.nk0
            java.lang.String r8 = "Process native ad json failed"
            ads_mobile_sdk.yx0 r9 = ads_mobile_sdk.yx0.f14443a
            r7.<init>(r8, r9)
            return r7
        La1:
            java.lang.String r8 = "json"
            r9 = 0
            nm.u r7 = ads_mobile_sdk.k41.a(r7, r8, r9)
            if (r7 == 0) goto Lc7
            java.lang.String r8 = "ads"
            nm.q r7 = ads_mobile_sdk.k41.d(r7, r8)
            if (r7 != 0) goto Lb3
            goto Lc7
        Lb3:
            java.util.ArrayList r8 = r7.f91364a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto Lc1
            ads_mobile_sdk.ok0 r7 = new ads_mobile_sdk.ok0
            r7.<init>()
            return r7
        Lc1:
            ads_mobile_sdk.pk0 r8 = new ads_mobile_sdk.pk0
            r8.<init>(r7)
            return r8
        Lc7:
            ads_mobile_sdk.nk0 r7 = new ads_mobile_sdk.nk0
            java.lang.String r8 = "Invalid processed native ad json"
            ads_mobile_sdk.yx0 r9 = ads_mobile_sdk.yx0.f14443a
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ng1.a(a.zc, ads_mobile_sdk.r0, bl2.c):java.lang.Object");
    }

    @Override // a.kb
    public final boolean b() {
        fs0 fs0Var = this.f12268f.H;
        return (fs0Var != null ? fs0Var.f5266c : null) != null;
    }

    @Override // ads_mobile_sdk.v0
    public final Object a(boolean z13, bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ng1 r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ng1.a(ads_mobile_sdk.ng1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.u r11, a.zc r12, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ng1.a(nm.u, a.zc, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext, bl2.c):java.lang.Object");
    }
}
