package ads_mobile_sdk;

import a.j4;
import a.zb;
import android.content.Context;
import ao2.j0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wp extends yr0 implements j4 {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f13137d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f13138e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f13139f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13140g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13141h;

    /* renamed from: i, reason: collision with root package name */
    public final a.a5 f13142i;

    /* renamed from: j, reason: collision with root package name */
    public final eg f13143j;

    /* renamed from: k, reason: collision with root package name */
    public final z6 f13144k;

    /* renamed from: l, reason: collision with root package name */
    public final a.j3 f13145l;

    /* renamed from: m, reason: collision with root package name */
    public final zb f13146m;

    /* renamed from: n, reason: collision with root package name */
    public final oh0 f13147n;

    /* renamed from: o, reason: collision with root package name */
    public final sb2 f13148o;

    /* renamed from: p, reason: collision with root package name */
    public final zr f13149p;

    /* renamed from: q, reason: collision with root package name */
    public final mo2.a f13150q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13151r;

    /* renamed from: s, reason: collision with root package name */
    public long f13152s;

    /* renamed from: t, reason: collision with root package name */
    public long f13153t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(CoroutineContext backgroundContext, j0 backgroundScope, Context context, String applicationId, String afmaVersion, a.a5 javascriptEngine, eg appState, z6 adapterInitializer, a.j3 traceLogger, zb clock, oh0 flags, sb2 rootTraceCreator, zr consentManager) {
        super((il0) null, false, 5);
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f13137d = backgroundContext;
        this.f13138e = backgroundScope;
        this.f13139f = context;
        this.f13140g = applicationId;
        this.f13141h = afmaVersion;
        this.f13142i = javascriptEngine;
        this.f13143j = appState;
        this.f13144k = adapterInitializer;
        this.f13145l = traceLogger;
        this.f13146m = clock;
        this.f13147n = flags;
        this.f13148o = rootTraceCreator;
        this.f13149p = consentManager;
        this.f13150q = mo2.d.a();
        zn2.b.f142311b.getClass();
        this.f13152s = 0L;
        this.f13153t = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.wp r18, boolean r19, java.lang.String r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wp.a(ads_mobile_sdk.wp, boolean, java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        j0 j0Var = this.f13138e;
        vp block = new vp(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return new pk0(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (zn2.b.c(r0, r4.a(dl2.b.P2(5, zn2.d.SECONDS), "gads:fetch_app_settings_using_cld:throttle_interval_ms")) < 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(ads_mobile_sdk.wp r8) {
        /*
            boolean r0 = r8.f13151r
            if (r0 == 0) goto L5
            goto L77
        L5:
            long r0 = r8.f13152s
            zn2.a r2 = zn2.b.f142311b
            r2.getClass()
            r2 = 0
            boolean r0 = zn2.b.d(r0, r2)
            if (r0 != 0) goto L42
            a.zb r0 = r8.f13146m
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            zn2.d r4 = zn2.d.MILLISECONDS
            long r0 = dl2.b.Q2(r0, r4)
            long r4 = r8.f13152s
            long r0 = zn2.b.j(r0, r4)
            ads_mobile_sdk.oh0 r4 = r8.f13147n
            r4.getClass()
            zn2.d r5 = zn2.d.SECONDS
            r6 = 5
            long r5 = dl2.b.P2(r6, r5)
            java.lang.String r7 = "gads:fetch_app_settings_using_cld:throttle_interval_ms"
            long r4 = r4.a(r5, r7)
            int r0 = zn2.b.c(r0, r4)
            if (r0 >= 0) goto L42
            goto L77
        L42:
            long r0 = r8.f13153t
            boolean r0 = zn2.b.d(r0, r2)
            if (r0 != 0) goto L79
            a.zb r0 = r8.f13146m
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            zn2.d r2 = zn2.d.MILLISECONDS
            long r0 = dl2.b.Q2(r0, r2)
            long r2 = r8.f13153t
            long r0 = zn2.b.j(r0, r2)
            ads_mobile_sdk.oh0 r8 = r8.f13147n
            r8.getClass()
            zn2.d r2 = zn2.d.HOURS
            r3 = 2
            long r2 = dl2.b.P2(r3, r2)
            java.lang.String r4 = "gads:fetch_app_settings_using_cld:refresh_interval_ms"
            long r2 = r8.a(r2, r4)
            int r8 = zn2.b.c(r0, r2)
            if (r8 >= 0) goto L79
        L77:
            r8 = 0
            goto L7a
        L79:
            r8 = 1
        L7a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wp.a(ads_mobile_sdk.wp):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(10:19|20|21|22|23|24|25|(1:27)|14|15))(2:37|38))(4:47|48|49|(1:51)(1:52))|39|(8:41|(1:43)|23|24|25|(0)|14|15)(4:44|(1:46)|35|36)))|58|6|7|(0)(0)|39|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0031, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #3 {Exception -> 0x0031, blocks: (B:13:0x002c, B:14:0x00bb, B:25:0x0093, B:30:0x00bf, B:31:0x00c4, B:38:0x004d, B:39:0x0064, B:41:0x006b, B:44:0x00c5, B:46:0x00c9, B:24:0x007e), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: Exception -> 0x0031, TryCatch #3 {Exception -> 0x0031, blocks: (B:13:0x002c, B:14:0x00bb, B:25:0x0093, B:30:0x00bf, B:31:0x00c4, B:38:0x004d, B:39:0x0064, B:41:0x006b, B:44:0x00c5, B:46:0x00c9, B:24:0x007e), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [nm.u] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [ads_mobile_sdk.wp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.u r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wp.a(nm.u, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:11:0x004a, B:14:0x006b, B:19:0x005a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.wp r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.qp
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.qp r0 = (ads_mobile_sdk.qp) r0
            int r1 = r0.f10214e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10214e = r1
            goto L18
        L13:
            ads_mobile_sdk.qp r0 = new ads_mobile_sdk.qp
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10212c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10214e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f10211b
            ads_mobile_sdk.wp r0 = r0.f10210a
            ue.c.H(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r6)
            mo2.a r6 = r5.f13150q
            r0.f10210a = r5
            r0.f10211b = r6
            r0.f10214e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r5.f13153t     // Catch: java.lang.Throwable -> L76
            zn2.a r2 = zn2.b.f142311b     // Catch: java.lang.Throwable -> L76
            r2.getClass()     // Catch: java.lang.Throwable -> L76
            r2 = 0
            boolean r0 = zn2.b.d(r0, r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L5a
            goto L6b
        L5a:
            a.zb r0 = r5.f13146m     // Catch: java.lang.Throwable -> L76
            r0.getClass()     // Catch: java.lang.Throwable -> L76
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L76
            long r2 = r5.f13153t     // Catch: java.lang.Throwable -> L76
            long r2 = zn2.b.e(r2)     // Catch: java.lang.Throwable -> L76
            long r2 = r0 - r2
        L6b:
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L76
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L76
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r5
        L76:
            r5 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wp.a(ads_mobile_sdk.wp, bl2.c):java.lang.Object");
    }

    @Override // a.j4
    public final Object a(wi.k kVar, bl2.c cVar) {
        return a(this, kVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.wp r5, wi.k r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.sp
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.sp r0 = (ads_mobile_sdk.sp) r0
            int r1 = r0.f11185c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11185c = r1
            goto L18
        L13:
            ads_mobile_sdk.sp r0 = new ads_mobile_sdk.sp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f11183a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11185c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r7)
            java.lang.String r6 = r6.l()
            r0.f11185c = r3
            kotlin.coroutines.CoroutineContext r7 = r5.f13137d
            ads_mobile_sdk.rp r2 = new ads_mobile_sdk.rp
            r3 = 0
            r4 = 0
            r2.<init>(r5, r4, r6, r3)
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r7, r2)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wp.a(ads_mobile_sdk.wp, wi.k, bl2.c):java.lang.Object");
    }
}
