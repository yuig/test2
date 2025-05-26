package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o42 extends r32 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f9125u = {kotlin.jvm.internal.k0.f80436a.e(new kotlin.jvm.internal.x(o42.class, "refreshCallback", "getRefreshCallback()Lcom/google/android/libraries/ads/mobile/sdk/banner/BannerAdRefreshCallback;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public final Context f9126k;

    /* renamed from: l, reason: collision with root package name */
    public final CoroutineContext f9127l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineContext f9128m;

    /* renamed from: n, reason: collision with root package name */
    public final a.v7 f9129n;

    /* renamed from: o, reason: collision with root package name */
    public final c72 f9130o;

    /* renamed from: p, reason: collision with root package name */
    public final r90 f9131p;

    /* renamed from: q, reason: collision with root package name */
    public final vi.c f9132q;

    /* renamed from: r, reason: collision with root package name */
    public final h61 f9133r;

    /* renamed from: s, reason: collision with root package name */
    public final co2 f9134s;

    /* renamed from: t, reason: collision with root package name */
    public l92 f9135t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o42(Context applicationContext, CoroutineContext uiContext, CoroutineContext loadContext, j0 loadScope, j0 backgroundScope, a.o8 componentProvider, c72 refreshHelper, r90 displayUtil, vi.c bannerAdRequest, ss2 traceMetaSet, oh0 flags, sb2 rootTraceCreator, String publisherRequestId, h92 requestType, String appId, boolean z13, ws0 inspectorAdLifecycleMonitor) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, bannerAdRequest, z13, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(loadContext, "loadContext");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(refreshHelper, "refreshHelper");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(bannerAdRequest, "bannerAdRequest");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        this.f9126k = applicationContext;
        this.f9127l = uiContext;
        this.f9128m = loadContext;
        this.f9129n = componentProvider;
        this.f9130o = refreshHelper;
        this.f9131p = displayUtil;
        this.f9132q = bannerAdRequest;
        this.f9133r = new h61();
        this.f9134s = new co2(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.o42 r5, bl2.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ads_mobile_sdk.f42
            if (r0 == 0) goto L16
            r0 = r6
            ads_mobile_sdk.f42 r0 = (ads_mobile_sdk.f42) r0
            int r1 = r0.f5042c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f5042c = r1
            goto L1b
        L16:
            ads_mobile_sdk.f42 r0 = new ads_mobile_sdk.f42
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f5040a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5042c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ue.c.H(r6)     // Catch: java.lang.Exception -> L2d
            goto L52
        L2d:
            r5 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ue.c.H(r6)     // Catch: java.lang.Exception -> L2d
            goto L47
        L3b:
            ue.c.H(r6)
            r0.f5042c = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r6 = r5.b(r0)     // Catch: java.lang.Exception -> L2d
            if (r6 != r1) goto L47
            goto L75
        L47:
            do2.i r6 = (do2.i) r6     // Catch: java.lang.Exception -> L2d
            r0.f5042c = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r6 = lb.l0.f0(r6, r0)     // Catch: java.lang.Exception -> L2d
            if (r6 != r1) goto L52
            goto L75
        L52:
            r1 = r6
            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch: java.lang.Exception -> L2d
            goto L75
        L56:
            java.lang.String r6 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            ads_mobile_sdk.cs2 r6 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r0 = r6.f()
            r1 = 0
            r0.f6988j = r1
            r6.a(r5)
            kotlin.Pair r1 = new kotlin.Pair
            ads_mobile_sdk.kk0 r6 = new ads_mobile_sdk.kk0
            r0 = 6
            r2 = 0
            r6.<init>(r5, r2, r2, r0)
            r1.<init>(r6, r2)
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o42.a(ads_mobile_sdk.o42, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0135 A[PHI: r1
      0x0135: PHI (r1v29 java.lang.Object) = (r1v25 java.lang.Object), (r1v1 java.lang.Object) binds: [B:18:0x0132, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // ads_mobile_sdk.r32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o42.b(bl2.c):java.lang.Object");
    }

    public final h61 c() {
        return this.f9133r;
    }

    @Override // ads_mobile_sdk.r32
    public final /* bridge */ /* synthetic */ Object a(a.x5 x5Var, d32 d32Var) {
        return a((sx0) x5Var, (bl2.c) d32Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.sx0 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.g42
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.g42 r0 = (ads_mobile_sdk.g42) r0
            int r1 = r0.f5403d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5403d = r1
            goto L18
        L13:
            ads_mobile_sdk.g42 r0 = new ads_mobile_sdk.g42
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f5401b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5403d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ads_mobile_sdk.o42 r7 = r0.f5400a
            ue.c.H(r8)
            goto L59
        L39:
            ue.c.H(r8)
            ads_mobile_sdk.h61 r8 = r6.f9133r
            r8.a(r7)
            r0.f5400a = r6
            r0.f5403d = r5
            kotlin.coroutines.CoroutineContext r8 = r6.f9127l
            ads_mobile_sdk.n42 r2 = new ads_mobile_sdk.n42
            r2.<init>(r6, r7, r3)
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r8, r2)
            if (r7 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L55:
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            ads_mobile_sdk.c72 r8 = r7.f9130o
            r0.f5400a = r3
            r0.f5403d = r4
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o42.a(ads_mobile_sdk.sx0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.ad r10, wi.b0 r11, bl2.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.h42
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.h42 r0 = (ads_mobile_sdk.h42) r0
            int r1 = r0.f5844e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5844e = r1
            goto L18
        L13:
            ads_mobile_sdk.h42 r0 = new ads_mobile_sdk.h42
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f5842c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5844e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            ue.c.H(r12)
            goto Lbd
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            ue.c.H(r12)
            goto La2
        L3e:
            ads_mobile_sdk.o42 r10 = r0.f5840a
            ue.c.H(r12)
            goto L8c
        L44:
            a.ad r10 = r0.f5841b
            ads_mobile_sdk.o42 r11 = r0.f5840a
            ue.c.H(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L79
        L4f:
            ue.c.H(r12)
            boolean r12 = r10 instanceof ads_mobile_sdk.pk0
            if (r12 == 0) goto La5
            ads_mobile_sdk.ss2 r11 = r9.f10480c
            r12 = r10
            ads_mobile_sdk.pk0 r12 = (ads_mobile_sdk.pk0) r12
            java.lang.Object r2 = r12.f9719b
            ads_mobile_sdk.sx0 r2 = (ads_mobile_sdk.sx0) r2
            ads_mobile_sdk.ss2 r2 = r2.a()
            r11.a(r2)
            java.lang.Object r11 = r12.f9719b
            ads_mobile_sdk.sx0 r11 = (ads_mobile_sdk.sx0) r11
            r0.f5840a = r9
            r0.f5841b = r10
            r0.f5844e = r6
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            r11 = r10
            r10 = r9
        L79:
            ads_mobile_sdk.pk0 r11 = (ads_mobile_sdk.pk0) r11
            java.lang.Object r11 = r11.f9719b
            ads_mobile_sdk.sx0 r11 = (ads_mobile_sdk.sx0) r11
            r0.f5840a = r10
            r0.f5841b = r7
            r0.f5844e = r5
            java.lang.Object r11 = r10.b(r11, r0)
            if (r11 != r1) goto L8c
            return r1
        L8c:
            ao2.j0 r11 = r10.f10479b
            kotlin.coroutines.CoroutineContext r11 = r11.getCoroutineContext()
            ads_mobile_sdk.j42 r12 = new ads_mobile_sdk.j42
            r12.<init>(r10, r7)
            r0.f5840a = r7
            r0.f5844e = r4
            java.lang.Object r10 = kotlin.jvm.internal.j.M(r0, r11, r12)
            if (r10 != r1) goto La2
            return r1
        La2:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        La5:
            boolean r12 = r10 instanceof ads_mobile_sdk.jk0
            if (r12 == 0) goto Lc0
            ao2.j0 r12 = r9.f10479b
            kotlin.coroutines.CoroutineContext r12 = r12.getCoroutineContext()
            ads_mobile_sdk.l42 r2 = new ads_mobile_sdk.l42
            r2.<init>(r11, r9, r10, r7)
            r0.f5844e = r3
            java.lang.Object r10 = kotlin.jvm.internal.j.M(r0, r12, r2)
            if (r10 != r1) goto Lbd
            return r1
        Lbd:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        Lc0:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o42.a(a.ad, wi.b0, bl2.c):java.lang.Object");
    }

    public final l92 b() {
        l92 l92Var = this.f9135t;
        if (l92Var != null) {
            return l92Var;
        }
        Intrinsics.r("adFrame");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.sx0 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.m42
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.m42 r0 = (ads_mobile_sdk.m42) r0
            int r1 = r0.f8077d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8077d = r1
            goto L18
        L13:
            ads_mobile_sdk.m42 r0 = new ads_mobile_sdk.m42
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8075b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8077d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.sx0 r7 = r0.f8074a
            ue.c.H(r8)
            goto L7a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r8)
            ads_mobile_sdk.h61 r8 = r6.f9133r
            java.lang.String r2 = "The backing field has not yet been initialized."
            java.lang.Object r8 = r8.a(r2)
            ads_mobile_sdk.sx0 r8 = (ads_mobile_sdk.sx0) r8
            ads_mobile_sdk.h61 r2 = r6.f9133r
            r2.a(r7)
            ads_mobile_sdk.f80 r2 = r8.f()
            monitor-enter(r2)
            monitor-exit(r2)
            ads_mobile_sdk.f80 r2 = r8.f()
            r4 = 0
            r2.a(r4)
            ads_mobile_sdk.h61 r2 = r6.f9133r
            java.lang.String r5 = "The backing field has not yet been initialized."
            java.lang.Object r2 = r2.a(r5)
            ads_mobile_sdk.sx0 r2 = (ads_mobile_sdk.sx0) r2
            ads_mobile_sdk.f80 r2 = r2.f()
            r2.a(r4)
            r0.f8074a = r8
            r0.f8077d = r3
            kotlin.coroutines.CoroutineContext r2 = r6.f9127l
            ads_mobile_sdk.n42 r3 = new ads_mobile_sdk.n42
            r3.<init>(r6, r7, r4)
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r2, r3)
            if (r7 != r1) goto L74
            goto L76
        L74:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L76:
            if (r7 != r1) goto L79
            return r1
        L79:
            r7 = r8
        L7a:
            r7.destroy()
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o42.b(ads_mobile_sdk.sx0, bl2.c):java.lang.Object");
    }
}
