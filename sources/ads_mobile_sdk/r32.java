package ads_mobile_sdk;

import a.a6;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r32 {

    /* renamed from: a */
    public final j0 f10478a;

    /* renamed from: b */
    public final j0 f10479b;

    /* renamed from: c */
    public final ss2 f10480c;

    /* renamed from: d */
    public final sb2 f10481d;

    /* renamed from: e */
    public final String f10482e;

    /* renamed from: f */
    public final h92 f10483f;

    /* renamed from: g */
    public final wi.k f10484g;

    /* renamed from: h */
    public final boolean f10485h;

    /* renamed from: i */
    public final String f10486i;

    /* renamed from: j */
    public final ws0 f10487j;

    public r32(j0 loadScope, j0 backgroundScope, ss2 traceMetaSet, oh0 flags, sb2 rootTraceCreator, String requestId, h92 requestType, wi.k kVar, boolean z13, String appId, ws0 inspectorAdLifecycleMonitor) {
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        this.f10478a = loadScope;
        this.f10479b = backgroundScope;
        this.f10480c = traceMetaSet;
        this.f10481d = rootTraceCreator;
        this.f10482e = requestId;
        this.f10483f = requestType;
        this.f10484g = kVar;
        this.f10485h = z13;
        this.f10486i = appId;
        this.f10487j = inspectorAdLifecycleMonitor;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.r32 r7, a.j8 r8, bl2.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof ads_mobile_sdk.i32
            if (r0 == 0) goto L16
            r0 = r9
            ads_mobile_sdk.i32 r0 = (ads_mobile_sdk.i32) r0
            int r1 = r0.f6211e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6211e = r1
            goto L1b
        L16:
            ads_mobile_sdk.i32 r0 = new ads_mobile_sdk.i32
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f6209c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6211e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ue.c.H(r9)
            goto L97
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.coroutines.CoroutineContext r7 = r0.f6208b
            a.j8 r8 = r0.f6207a
            ue.c.H(r9)
            goto L79
        L3f:
            ue.c.H(r9)
            ao2.j0 r9 = r7.f10479b
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            bl2.d r2 = kotlin.coroutines.f.Ho
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r2)
            boolean r2 = r9 instanceof ao2.f0
            if (r2 == 0) goto L55
            ao2.f0 r9 = (ao2.f0) r9
            goto L56
        L55:
            r9 = r5
        L56:
            if (r9 == 0) goto L5f
            java.lang.String r2 = "Publisher Callback"
            ao2.f0 r9 = r9.m(r4, r2)
            goto L60
        L5f:
            r9 = r5
        L60:
            if (r9 == 0) goto L63
            goto L69
        L63:
            ao2.j0 r9 = r7.f10479b
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
        L69:
            r0.f6207a = r8
            r0.f6208b = r9
            r0.f6211e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L76
            goto L99
        L76:
            r6 = r9
            r9 = r7
            r7 = r6
        L79:
            do2.i r9 = (do2.i) r9
            ads_mobile_sdk.l32 r2 = new ads_mobile_sdk.l32
            r2.<init>(r7, r8, r5)
            do2.f0 r4 = new do2.f0
            r4.<init>(r9, r2)
            ads_mobile_sdk.q32 r9 = new ads_mobile_sdk.q32
            r9.<init>(r7, r8)
            r0.f6207a = r5
            r0.f6208b = r5
            r0.f6211e = r3
            java.lang.Object r7 = r4.collect(r9, r0)
            if (r7 != r1) goto L97
            goto L99
        L97:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r32.a(ads_mobile_sdk.r32, a.j8, bl2.c):java.lang.Object");
    }

    public abstract Object b(bl2.c cVar);

    public final a.g5 a(a.g5 componentBuilder, dj.e baseRequest, String adResponseBlob, mh2 signalGenerationData) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adResponseBlob, "adResponseBlob");
        Intrinsics.checkNotNullParameter(signalGenerationData, "signalGenerationData");
        return (a.g5) ((a.g5) ((a.g5) ((a.g5) ((a.g5) ((a.g5) ((a.g5) ((a.g5) componentBuilder.a(adResponseBlob)).a(signalGenerationData)).a(this.f10480c.f11215a)).a(this.f10480c.f11216b)).a(this.f10483f)).a(baseRequest)).a(this.f10485h)).a(this.f10487j);
    }

    public final a6 a(a6 componentBuilder, wi.h baseRequest) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        return (a6) ((a6) ((a6) ((a6) ((a6) ((a6) componentBuilder.a(this.f10480c.f11215a)).a(this.f10480c.f11216b)).a(this.f10483f)).a(baseRequest)).a(this.f10485h)).a(this.f10487j);
    }

    public static wi.r a(jk0 error, wi.b0 b0Var) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new wi.r(error.a().a(), a.bb.d(error), b0Var);
    }

    public final ss2 a() {
        return this.f10480c;
    }

    public final Object a(du1 du1Var) {
        return a(this, du1Var);
    }

    public final void a(a.j8 internalAdLoadCallback) {
        Intrinsics.checkNotNullParameter(internalAdLoadCallback, "internalAdLoadCallback");
        j0 j0Var = this.f10478a;
        a32 block = new a32(this, internalAdLoadCallback, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[PHI: r6
      0x0059: PHI (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0056, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.r32 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.b32
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.b32 r0 = (ads_mobile_sdk.b32) r0
            int r1 = r0.f2697c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2697c = r1
            goto L18
        L13:
            ads_mobile_sdk.b32 r0 = new ads_mobile_sdk.b32
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2695a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2697c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ue.c.H(r6)
            goto L4e
        L36:
            ue.c.H(r6)
            r0.f2697c = r4
            ao2.j0 r6 = r5.f10478a
            kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
            ads_mobile_sdk.c32 r2 = new ads_mobile_sdk.c32
            r4 = 0
            r2.<init>(r5, r4)
            java.lang.Object r6 = kotlin.jvm.internal.j.M(r0, r6, r2)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            do2.i r6 = (do2.i) r6
            r0.f2697c = r3
            java.lang.Object r6 = lb.l0.f0(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r32.a(ads_mobile_sdk.r32, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.g32
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.g32 r0 = (ads_mobile_sdk.g32) r0
            int r1 = r0.f5384d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5384d = r1
            goto L18
        L13:
            ads_mobile_sdk.g32 r0 = new ads_mobile_sdk.g32
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5382b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5384d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ads_mobile_sdk.r32 r0 = r0.f5381a
            ue.c.H(r6)     // Catch: java.lang.Exception -> L2a
            goto L81
        L2a:
            r6 = move-exception
            goto L95
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            wi.k r6 = r5.f10484g
            if (r6 == 0) goto L75
            kotlin.text.Regex r6 = new kotlin.text.Regex
            java.lang.String r2 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            r6.<init>(r2)
            java.lang.String r2 = r5.f10486i
            boolean r6 = r6.e(r2)
            if (r6 != 0) goto L75
            java.lang.String r6 = r5.f10486i
            java.lang.String r0 = "webview_api_for_ads_application_id"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r0)
            if (r6 == 0) goto L58
            java.lang.String r6 = "InitializationConfig.WEBVIEW_APIS_FOR_ADS_APPLICATION_ID was provided as your application ID. This ID should be used if WebView APIs are the only integration point with the SDK. To make standard ad requests, you must provide your application ID of the form ca-app-pub-################~##########."
            goto L5a
        L58:
            java.lang.String r6 = "An invalid application ID was provided during initialization, it should be of the form ca-app-pub-################~##########."
        L5a:
            ads_mobile_sdk.nk0 r0 = new ads_mobile_sdk.nk0
            ads_mobile_sdk.yx0 r1 = ads_mobile_sdk.yx0.f14443a
            r0.<init>(r6, r1)
            ads_mobile_sdk.ft2.a(r0)
            ads_mobile_sdk.s32 r0 = new ads_mobile_sdk.s32
            wi.r r1 = new wi.r
            wi.q r2 = wi.q.INVALID_REQUEST
            r1.<init>(r2, r6, r4)
            r0.<init>(r1)
            do2.l r6 = lb.l0.i0(r0)
            return r6
        L75:
            r0.f5381a = r5     // Catch: java.lang.Exception -> L93
            r0.f5384d = r3     // Catch: java.lang.Exception -> L93
            java.lang.Object r6 = r5.b(r0)     // Catch: java.lang.Exception -> L93
            if (r6 != r1) goto L80
            return r1
        L80:
            r0 = r5
        L81:
            do2.i r6 = (do2.i) r6     // Catch: java.lang.Exception -> L2a
            ads_mobile_sdk.f32 r1 = new ads_mobile_sdk.f32     // Catch: java.lang.Exception -> L2a
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L2a
            ads_mobile_sdk.h32 r6 = new ads_mobile_sdk.h32     // Catch: java.lang.Exception -> L2a
            r6.<init>(r0, r4)     // Catch: java.lang.Exception -> L2a
            do2.j0 r2 = new do2.j0     // Catch: java.lang.Exception -> L2a
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L2a
            return r2
        L93:
            r6 = move-exception
            r0 = r5
        L95:
            java.lang.String r1 = "Ad failed to load"
            ads_mobile_sdk.gk0.c(r1, r6)
            ads_mobile_sdk.kk0 r1 = new ads_mobile_sdk.kk0
            r2 = 6
            r1.<init>(r6, r4, r4, r2)
            r0.getClass()
            java.lang.String r6 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            wi.r r6 = new wi.r
            ads_mobile_sdk.yx0 r0 = r1.a()
            wi.q r0 = r0.a()
            java.lang.String r1 = a.bb.d(r1)
            r6.<init>(r0, r1, r4)
            ads_mobile_sdk.s32 r0 = new ads_mobile_sdk.s32
            r0.<init>(r6)
            do2.l r6 = lb.l0.i0(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r32.a(bl2.c):java.lang.Object");
    }

    public Object a(a.x5 x5Var, d32 d32Var) {
        return Unit.f80348a;
    }
}
