package ads_mobile_sdk;

import a.af;
import a.o2;
import a.zb;
import android.content.Context;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import wi.f;

/* loaded from: classes2.dex */
public final class ku0 extends yr0 implements af, a.oa {
    public static final wi.g I = new wi.g(f.ALREADY_OPEN, "Ad inspector cannot be opened because it is already open.");

    /* renamed from: J, reason: collision with root package name */
    public static final wi.g f7511J = new wi.g(f.FAILED_TO_LOAD, "Ad inspector failed to load.");
    public static final wi.g K = new wi.g(f.INTERNAL_ERROR, "Ad inspector had an internal error.");
    public static final wi.g L = new wi.g(f.NOT_IN_TEST_MODE, "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
    public nm.u A;
    public gt0 B;
    public final mo2.a C;
    public long D;
    public final LinkedHashMap E;
    public final LinkedHashMap F;
    public final mo2.a G;
    public WeakReference H;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7512d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f7513e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7514f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f7515g;

    /* renamed from: h, reason: collision with root package name */
    public final a.v7 f7516h;

    /* renamed from: i, reason: collision with root package name */
    public final nm.o f7517i;

    /* renamed from: j, reason: collision with root package name */
    public final oh0 f7518j;

    /* renamed from: k, reason: collision with root package name */
    public final zb f7519k;

    /* renamed from: l, reason: collision with root package name */
    public final yp0 f7520l;

    /* renamed from: m, reason: collision with root package name */
    public final mv0 f7521m;

    /* renamed from: n, reason: collision with root package name */
    public final gd f7522n;

    /* renamed from: o, reason: collision with root package name */
    public final eg f7523o;

    /* renamed from: p, reason: collision with root package name */
    public final o2 f7524p;

    /* renamed from: q, reason: collision with root package name */
    public final lz2 f7525q;

    /* renamed from: r, reason: collision with root package name */
    public final sb2 f7526r;

    /* renamed from: s, reason: collision with root package name */
    public final p82 f7527s;

    /* renamed from: t, reason: collision with root package name */
    public final a.v7 f7528t;

    /* renamed from: u, reason: collision with root package name */
    public final zs0 f7529u;

    /* renamed from: v, reason: collision with root package name */
    public final zr f7530v;

    /* renamed from: w, reason: collision with root package name */
    public final mo2.a f7531w;

    /* renamed from: x, reason: collision with root package name */
    public kv0 f7532x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7533y;

    /* renamed from: z, reason: collision with root package name */
    public nm.u f7534z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(Context applicationContext, j0 backgroundScope, String afmaVersion, a.o8 shakeDetector, a.o8 flickDetector, nm.o gson, oh0 flags, zb clock, yp0 httpClient, mv0 inspectorSettingsDataStore, gd appInfo, eg appState, o2 presenterFactory, lz2 webViewFactory, sb2 rootTraceCreator, p82 requestConfigurationWrapper, a.o8 webViewConfigurator, zs0 inspectorAdapterInfo, zr consentManager) {
        super(il0.CUI_NAME_SDKINIT_INIT_AD_INSPECTOR, false, 4);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(shakeDetector, "shakeDetector");
        Intrinsics.checkNotNullParameter(flickDetector, "flickDetector");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(inspectorSettingsDataStore, "inspectorSettingsDataStore");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(webViewConfigurator, "webViewConfigurator");
        Intrinsics.checkNotNullParameter(inspectorAdapterInfo, "inspectorAdapterInfo");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f7512d = applicationContext;
        this.f7513e = backgroundScope;
        this.f7514f = afmaVersion;
        this.f7515g = shakeDetector;
        this.f7516h = flickDetector;
        this.f7517i = gson;
        this.f7518j = flags;
        this.f7519k = clock;
        this.f7520l = httpClient;
        this.f7521m = inspectorSettingsDataStore;
        this.f7522n = appInfo;
        this.f7523o = appState;
        this.f7524p = presenterFactory;
        this.f7525q = webViewFactory;
        this.f7526r = rootTraceCreator;
        this.f7527s = requestConfigurationWrapper;
        this.f7528t = webViewConfigurator;
        this.f7529u = inspectorAdapterInfo;
        this.f7530v = consentManager;
        fi.b bVar = mo2.d.f87812a;
        this.f7531w = new mo2.c(false);
        this.f7534z = new nm.u();
        this.A = new nm.u();
        this.B = gt0.f5683a;
        this.C = new mo2.c(false);
        this.E = new LinkedHashMap();
        this.F = new LinkedHashMap();
        this.G = new mo2.c(false);
        this.H = new WeakReference(null);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0469: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:326:0x0468 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x069d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:328:0x069c */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x06f0: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:322:0x06ef */
    public final java.lang.Object a(ads_mobile_sdk.gt0 r22, wi.t r23, bl2.c r24) {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.gt0, wi.t, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #0 {all -> 0x007b, blocks: (B:25:0x005e, B:27:0x0068), top: B:24:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v13, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.st0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.st0 r0 = (ads_mobile_sdk.st0) r0
            int r1 = r0.f11225f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11225f = r1
            goto L18
        L13:
            ads_mobile_sdk.st0 r0 = new ads_mobile_sdk.st0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11223d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11225f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f11220a
            mo2.a r8 = (mo2.a) r8
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r9 = move-exception
            goto L88
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            mo2.a r8 = r0.f11222c
            java.lang.String r2 = r0.f11221b
            java.lang.Object r4 = r0.f11220a
            ads_mobile_sdk.ku0 r4 = (ads_mobile_sdk.ku0) r4
            ue.c.H(r9)
            r9 = r8
            r8 = r2
            goto L5e
        L47:
            ue.c.H(r9)
            mo2.a r9 = r7.G
            r0.f11220a = r7
            r0.f11221b = r8
            r0.f11222c = r9
            r0.f11225f = r4
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r2 = r9.f(r5, r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r4 = r7
        L5e:
            java.lang.ref.WeakReference r2 = r4.H     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L7b
            ads_mobile_sdk.dv0 r2 = (ads_mobile_sdk.dv0) r2     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L80
            r0.f11220a = r9     // Catch: java.lang.Throwable -> L7b
            r0.f11221b = r5     // Catch: java.lang.Throwable -> L7b
            r0.f11222c = r5     // Catch: java.lang.Throwable -> L7b
            r0.f11225f = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r2.a(r8, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L77
            return r1
        L77:
            r8 = r9
        L78:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L2f
            goto L82
        L7b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L88
        L80:
            r8 = r9
            r9 = r5
        L82:
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            return r9
        L88:
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.b(java.lang.String, bl2.c):java.lang.Object");
    }

    public final String c() {
        if (!e()) {
            return "{}";
        }
        kv0 kv0Var = this.f7532x;
        if (kv0Var == null) {
            Intrinsics.r("storedInspectorSettings");
            throw null;
        }
        if (kv0Var.y() > 0) {
            kv0 kv0Var2 = this.f7532x;
            if (kv0Var2 == null) {
                Intrinsics.r("storedInspectorSettings");
                throw null;
            }
            long y13 = kv0Var2.y();
            this.f7519k.getClass();
            if (y13 < System.currentTimeMillis() / 1000) {
                kotlin.jvm.internal.j.z(this.f7513e, null, null, new kt0(this, null), 3);
                return "{}";
            }
        }
        kv0 kv0Var3 = this.f7532x;
        if (kv0Var3 == null) {
            Intrinsics.r("storedInspectorSettings");
            throw null;
        }
        String x13 = kv0Var3.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getNetworkExtras(...)");
        return x13;
    }

    public final void d() {
        if (this.f7533y) {
            return;
        }
        ((yf2) this.f7515g.get()).f14230i = this;
        sh0 sh0Var = (sh0) this.f7516h.get();
        sh0Var.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        sh0Var.f11105m = this;
        this.f7533y = true;
        kv0 kv0Var = this.f7532x;
        if (kv0Var == null) {
            Intrinsics.r("storedInspectorSettings");
            throw null;
        }
        bt0 u13 = kv0Var.u();
        Intrinsics.checkNotNullExpressionValue(u13, "getGesture(...)");
        a(u13);
        a.ad a13 = this.f7522n.a();
        if (a13 instanceof pk0) {
            this.A = (nm.u) ((pk0) a13).f9719b;
        }
    }

    public final boolean e() {
        kv0 kv0Var = this.f7532x;
        if (kv0Var == null) {
            Intrinsics.r("storedInspectorSettings");
            throw null;
        }
        if (!kv0Var.w()) {
            kv0 kv0Var2 = this.f7532x;
            if (kv0Var2 == null) {
                Intrinsics.r("storedInspectorSettings");
                throw null;
            }
            if (!kv0Var2.v() || !((Boolean) this.f7518j.a("gads:inspector:linked_device_enable_inspector", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.lt0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.lt0 r0 = (ads_mobile_sdk.lt0) r0
            int r1 = r0.f7954c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7954c = r1
            goto L18
        L13:
            ads_mobile_sdk.lt0 r0 = new ads_mobile_sdk.lt0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7952a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7954c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ue.c.H(r5)
            r0.f7954c = r3
            java.lang.String r5 = r4.c()
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "{}"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r0 == 0) goto L48
            java.lang.String r5 = ""
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.f(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #1 {all -> 0x0058, blocks: (B:31:0x0054, B:32:0x008b, B:35:0x0094, B:37:0x009c, B:41:0x00d7, B:42:0x00da, B:43:0x00db, B:44:0x00de, B:46:0x007d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:31:0x0054, B:32:0x008b, B:35:0x0094, B:37:0x009c, B:41:0x00d7, B:42:0x00da, B:43:0x00db, B:44:0x00de, B:46:0x007d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(bl2.c r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.g(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #0 {all -> 0x005b, blocks: (B:11:0x004a, B:16:0x0054, B:17:0x005a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ot0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ot0 r0 = (ads_mobile_sdk.ot0) r0
            int r1 = r0.f9432e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9432e = r1
            goto L18
        L13:
            ads_mobile_sdk.ot0 r0 = new ads_mobile_sdk.ot0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9430c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9432e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f9429b
            ads_mobile_sdk.ku0 r0 = r0.f9428a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f7531w
            r0.f9428a = r5
            r0.f9429b = r6
            r0.f9432e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            ads_mobile_sdk.kv0 r6 = r0.f7532x     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L54
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L54:
            java.lang.String r6 = "storedInspectorSettings"
            kotlin.jvm.internal.Intrinsics.r(r6)     // Catch: java.lang.Throwable -> L5b
            throw r4     // Catch: java.lang.Throwable -> L5b
        L5b:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.h(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.pt0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.pt0 r0 = (ads_mobile_sdk.pt0) r0
            int r1 = r0.f9809e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9809e = r1
            goto L18
        L13:
            ads_mobile_sdk.pt0 r0 = new ads_mobile_sdk.pt0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9807c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9809e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f9806b
            ads_mobile_sdk.ku0 r0 = r0.f9805a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f7531w
            r0.f9805a = r5
            r0.f9806b = r6
            r0.f9809e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            boolean r6 = r0.e()     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L58
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L58:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.i(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(1:(1:(5:(1:(8:12|13|14|15|16|17|18|19)(2:29|30))(8:31|32|33|34|35|36|37|(7:39|(4:41|42|43|(1:45))(1:48)|46|16|17|18|19)(3:49|50|51))|28|23|24|25)(14:59|60|61|62|63|64|(2:80|81)|66|(5:68|69|70|71|(1:73))(1:79)|74|35|36|37|(0)(0)))(1:90))(2:99|(1:101)(1:102))|91|92|(1:94)(11:95|63|64|(0)|66|(0)(0)|74|35|36|37|(0)(0))))|103|6|(0)(0)|91|92|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0160, code lost:
    
        r15 = null;
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:36:0x0106, B:39:0x010a, B:41:0x0119), top: B:35:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #5 {all -> 0x00f7, blocks: (B:64:0x00ae, B:66:0x00bf, B:68:0x00cf), top: B:63:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0079  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v8, types: [ads_mobile_sdk.ku0, java.lang.Throwable, mo2.a] */
    /* JADX WARN: Type inference failed for: r2v7, types: [mo2.c] */
    /* JADX WARN: Type inference failed for: r3v10, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r5v11, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(bl2.c r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.j(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:13:0x008f, B:15:0x0095, B:16:0x009b), top: B:12:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.rt0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.rt0 r0 = (ads_mobile_sdk.rt0) r0
            int r1 = r0.f10780e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10780e = r1
            goto L18
        L13:
            ads_mobile_sdk.rt0 r0 = new ads_mobile_sdk.rt0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f10778c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10780e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            mo2.a r1 = r0.f10777b
            ads_mobile_sdk.ku0 r0 = r0.f10776a
            ue.c.H(r8)
            goto L8f
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            mo2.a r2 = r0.f10777b
            ads_mobile_sdk.ku0 r4 = r0.f10776a
            ue.c.H(r8)
            r8 = r2
            r2 = r4
            goto L72
        L44:
            ads_mobile_sdk.ku0 r2 = r0.f10776a
            ue.c.H(r8)
            goto L59
        L4a:
            ue.c.H(r8)
            r0.f10776a = r7
            r0.f10780e = r5
            java.lang.Object r8 = r7.j(r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            ads_mobile_sdk.oh0 r8 = r2.f7518j
            boolean r8 = r8.M()
            if (r8 == 0) goto Lb0
            mo2.a r8 = r2.f7531w
            r0.f10776a = r2
            r0.f10777b = r8
            r0.f10780e = r4
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r4 = r8.f(r6, r0)
            if (r4 != r1) goto L72
            return r1
        L72:
            boolean r4 = r2.f7533y     // Catch: java.lang.Throwable -> La9
            mo2.c r8 = (mo2.c) r8
            r8.i(r6)
            if (r4 == 0) goto L7c
            goto Lb0
        L7c:
            mo2.a r8 = r2.f7531w
            r0.f10776a = r2
            r0.f10777b = r8
            r0.f10780e = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r6, r0)
            if (r0 != r1) goto L8d
            return r1
        L8d:
            r1 = r8
            r0 = r2
        L8f:
            boolean r8 = r0.e()     // Catch: java.lang.Throwable -> L99
            if (r8 == 0) goto L9b
            r0.d()     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r8 = move-exception
            goto La3
        L9b:
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L99
            mo2.c r1 = (mo2.c) r1
            r1.i(r6)
            return r8
        La3:
            mo2.c r1 = (mo2.c) r1
            r1.i(r6)
            throw r8
        La9:
            r0 = move-exception
            mo2.c r8 = (mo2.c) r8
            r8.i(r6)
            throw r0
        Lb0:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.k(bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Type inference failed for: r13v0, types: [ads_mobile_sdk.ku0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.ku0 r13, java.lang.String r14, bl2.c r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.hu0
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.hu0 r0 = (ads_mobile_sdk.hu0) r0
            int r1 = r0.f6087f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6087f = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            ads_mobile_sdk.hu0 r0 = new ads_mobile_sdk.hu0
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r10.f6085d
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f6087f
            r2 = 2
            r3 = 1
            r12 = 0
            if (r1 == 0) goto L48
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r13 = r10.f6082a
            mo2.a r13 = (mo2.a) r13
            ue.c.H(r15)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r14 = move-exception
            goto L81
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            mo2.a r13 = r10.f6084c
            java.lang.String r14 = r10.f6083b
            java.lang.Object r1 = r10.f6082a
            ads_mobile_sdk.ku0 r1 = (ads_mobile_sdk.ku0) r1
            ue.c.H(r15)
            r9 = r14
            goto L61
        L48:
            ue.c.H(r15)
            mo2.a r15 = r13.f7531w
            r10.f6082a = r13
            r10.f6083b = r14
            r10.f6084c = r15
            r10.f6087f = r3
            mo2.c r15 = (mo2.c) r15
            java.lang.Object r1 = r15.f(r12, r10)
            if (r1 != r0) goto L5e
            return r0
        L5e:
            r1 = r13
            r9 = r14
            r13 = r15
        L61:
            r10.f6082a = r13     // Catch: java.lang.Throwable -> L31
            r10.f6083b = r12     // Catch: java.lang.Throwable -> L31
            r10.f6084c = r12     // Catch: java.lang.Throwable -> L31
            r10.f6087f = r2     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 127(0x7f, float:1.78E-43)
            java.lang.Object r14 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L31
            if (r14 != r0) goto L79
            return r0
        L79:
            kotlin.Unit r14 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L31
            mo2.c r13 = (mo2.c) r13
            r13.i(r12)
            return r14
        L81:
            mo2.c r13 = (mo2.c) r13
            r13.i(r12)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.b(ads_mobile_sdk.ku0, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r12, java.lang.Boolean r13, java.lang.Boolean r14, ads_mobile_sdk.bt0 r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, java.lang.Boolean, java.lang.Boolean, ads_mobile_sdk.bt0, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    public static Object a(ku0 ku0Var, Boolean bool, Boolean bool2, bt0 bt0Var, String str, Long l13, String str2, String str3, String str4, bl2.c cVar, int i13) {
        Boolean bool3 = (i13 & 1) != 0 ? null : bool;
        Boolean bool4 = (i13 & 2) != 0 ? null : bool2;
        bt0 bt0Var2 = (i13 & 4) != 0 ? null : bt0Var;
        String str5 = (i13 & 8) != 0 ? null : str;
        Long l14 = (i13 & 16) != 0 ? null : l13;
        String str6 = (i13 & 32) != 0 ? null : str2;
        String str7 = (i13 & 64) != 0 ? null : str3;
        String str8 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str4;
        ku0Var.getClass();
        return a(ku0Var, bool3, bool4, bt0Var2, str5, l14, str6, str7, str8, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0287, code lost:
    
        r4 = r5;
        r5 = r7;
        r7 = r16;
        r8 = r17;
        r0 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035e A[Catch: all -> 0x0517, TryCatch #6 {all -> 0x0517, blocks: (B:100:0x0356, B:102:0x035e, B:104:0x036a, B:108:0x051a, B:109:0x051e, B:110:0x051f, B:111:0x0523), top: B:99:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x051f A[Catch: all -> 0x0517, TryCatch #6 {all -> 0x0517, blocks: (B:100:0x0356, B:102:0x035e, B:104:0x036a, B:108:0x051a, B:109:0x051e, B:110:0x051f, B:111:0x0523), top: B:99:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04a9 A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #7 {all -> 0x0137, blocks: (B:27:0x04a9, B:30:0x04b0, B:32:0x04b9, B:35:0x04c7, B:37:0x04fc, B:38:0x0501, B:42:0x04d3, B:43:0x04d7, B:46:0x04d8, B:48:0x04ee, B:49:0x04f6, B:57:0x0469, B:59:0x0481, B:60:0x0489, B:77:0x03cd, B:79:0x03d4, B:92:0x0123, B:94:0x039c), top: B:91:0x0123, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04b9 A[Catch: all -> 0x0137, Exception -> 0x04d1, TryCatch #12 {Exception -> 0x04d1, blocks: (B:30:0x04b0, B:32:0x04b9, B:35:0x04c7, B:42:0x04d3, B:43:0x04d7), top: B:29:0x04b0, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04d3 A[Catch: all -> 0x0137, Exception -> 0x04d1, TryCatch #12 {Exception -> 0x04d1, blocks: (B:30:0x04b0, B:32:0x04b9, B:35:0x04c7, B:42:0x04d3, B:43:0x04d7), top: B:29:0x04b0, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0481 A[Catch: all -> 0x0137, TryCatch #7 {all -> 0x0137, blocks: (B:27:0x04a9, B:30:0x04b0, B:32:0x04b9, B:35:0x04c7, B:37:0x04fc, B:38:0x0501, B:42:0x04d3, B:43:0x04d7, B:46:0x04d8, B:48:0x04ee, B:49:0x04f6, B:57:0x0469, B:59:0x0481, B:60:0x0489, B:77:0x03cd, B:79:0x03d4, B:92:0x0123, B:94:0x039c), top: B:91:0x0123, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    /* JADX WARN: Type inference failed for: r4v36, types: [mo2.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0310 -> B:115:0x0316). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x02d2 -> B:116:0x02e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r36, bl2.c r37) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0398 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4 A[Catch: all -> 0x02f4, TryCatch #10 {all -> 0x02f4, blocks: (B:121:0x02dd, B:123:0x02e4, B:125:0x02eb, B:127:0x02ef, B:129:0x02f3, B:130:0x02f7, B:131:0x02fc, B:132:0x02fd, B:133:0x0304, B:134:0x0305, B:135:0x030c, B:136:0x030d), top: B:120:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030d A[Catch: all -> 0x02f4, TRY_LEAVE, TryCatch #10 {all -> 0x02f4, blocks: (B:121:0x02dd, B:123:0x02e4, B:125:0x02eb, B:127:0x02ef, B:129:0x02f3, B:130:0x02f7, B:131:0x02fc, B:132:0x02fd, B:133:0x0304, B:134:0x0305, B:135:0x030c, B:136:0x030d), top: B:120:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208 A[Catch: all -> 0x0217, TRY_LEAVE, TryCatch #14 {all -> 0x0217, blocks: (B:150:0x029b, B:159:0x0202, B:161:0x0208, B:164:0x0219, B:179:0x027d, B:189:0x02bd, B:166:0x0222, B:168:0x0226, B:170:0x0233, B:173:0x0245, B:177:0x0265), top: B:158:0x0202, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0219 A[Catch: all -> 0x0217, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0217, blocks: (B:150:0x029b, B:159:0x0202, B:161:0x0208, B:164:0x0219, B:179:0x027d, B:189:0x02bd, B:166:0x0222, B:168:0x0226, B:170:0x0233, B:173:0x0245, B:177:0x0265), top: B:158:0x0202, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0485 A[Catch: all -> 0x0495, TryCatch #13 {all -> 0x0495, blocks: (B:22:0x047e, B:24:0x0485, B:26:0x048c, B:28:0x0490, B:30:0x0494, B:31:0x0498, B:32:0x049d, B:33:0x049e, B:34:0x04a5, B:35:0x04a6, B:36:0x04ad, B:37:0x04ae), top: B:21:0x047e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04ae A[Catch: all -> 0x0495, TRY_LEAVE, TryCatch #13 {all -> 0x0495, blocks: (B:22:0x047e, B:24:0x0485, B:26:0x048c, B:28:0x0490, B:30:0x0494, B:31:0x0498, B:32:0x049d, B:33:0x049e, B:34:0x04a5, B:35:0x04a6, B:36:0x04ad, B:37:0x04ae), top: B:21:0x047e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0452 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03a6 A[Catch: all -> 0x03b5, TRY_LEAVE, TryCatch #12 {all -> 0x03b5, blocks: (B:53:0x043a, B:62:0x03a0, B:64:0x03a6, B:67:0x03b7, B:82:0x0419, B:92:0x045d, B:69:0x03c0, B:71:0x03c4, B:73:0x03d1, B:76:0x03e1, B:80:0x0401), top: B:61:0x03a0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b7 A[Catch: all -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x03b5, blocks: (B:53:0x043a, B:62:0x03a0, B:64:0x03a6, B:67:0x03b7, B:82:0x0419, B:92:0x045d, B:69:0x03c0, B:71:0x03c4, B:73:0x03d1, B:76:0x03e1, B:80:0x0401), top: B:61:0x03a0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0430 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [ads_mobile_sdk.ku0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ads_mobile_sdk.cs2, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.cs2, ads_mobile_sdk.p12, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.u r34, java.lang.String r35, bl2.c r36) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(nm.u, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:27:0x0086, B:30:0x008c, B:32:0x0091, B:35:0x0098, B:37:0x009e, B:39:0x00a2, B:40:0x00d5, B:44:0x00af, B:45:0x00b2, B:46:0x00b5, B:47:0x00b8, B:48:0x00b9, B:50:0x00bf), top: B:26:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:27:0x0086, B:30:0x008c, B:32:0x0091, B:35:0x0098, B:37:0x009e, B:39:0x00a2, B:40:0x00d5, B:44:0x00af, B:45:0x00b2, B:46:0x00b5, B:47:0x00b8, B:48:0x00b9, B:50:0x00bf), top: B:26:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r17, bl2.c r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:11:0x0053, B:13:0x0071, B:17:0x0080, B:19:0x008a, B:20:0x0094), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #0 {all -> 0x007e, blocks: (B:11:0x0053, B:13:0x0071, B:17:0x0080, B:19:0x008a, B:20:0x0094), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v8, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.ws0 r9, bl2.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.ht0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.ht0 r0 = (ads_mobile_sdk.ht0) r0
            int r1 = r0.f6079g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6079g = r1
            goto L18
        L13:
            ads_mobile_sdk.ht0 r0 = new ads_mobile_sdk.ht0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f6077e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6079g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r8 = r0.f6076d
            ads_mobile_sdk.ws0 r9 = r0.f6075c
            java.lang.String r1 = r0.f6074b
            ads_mobile_sdk.ku0 r0 = r0.f6073a
            ue.c.H(r10)
            r10 = r8
            r8 = r1
            goto L53
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            ue.c.H(r10)
            mo2.a r10 = r7.C
            r0.f6073a = r7
            r0.f6074b = r8
            r0.f6075c = r9
            r0.f6076d = r10
            r0.f6079g = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r0 = r10.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r7
        L53:
            java.util.LinkedHashMap r1 = r0.E     // Catch: java.lang.Throwable -> L7e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7e
            ads_mobile_sdk.oh0 r2 = r0.f7518j     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "gads:inspector:max_ad_life_cycles"
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7e
            ads_mobile_sdk.ah0 r6 = ads_mobile_sdk.oh0.f9285i     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r1 < r2) goto L80
            java.lang.String r8 = "Maximum number of stored ad requests reached. Dropping the current request."
            ads_mobile_sdk.gk0.d(r8, r4)     // Catch: java.lang.Throwable -> L7e
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7e
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            return r8
        L7e:
            r8 = move-exception
            goto La6
        L80:
            java.util.LinkedHashMap r1 = r0.F     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L7e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L94
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            java.util.LinkedHashMap r2 = r0.F     // Catch: java.lang.Throwable -> L7e
            r2.put(r8, r1)     // Catch: java.lang.Throwable -> L7e
        L94:
            r1.add(r9)     // Catch: java.lang.Throwable -> L7e
            java.util.LinkedHashMap r8 = r0.E     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r9.f13206d     // Catch: java.lang.Throwable -> L7e
            r8.put(r0, r9)     // Catch: java.lang.Throwable -> L7e
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L7e
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            return r8
        La6:
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(java.lang.String, ads_mobile_sdk.ws0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, nm.u r8, bl2.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.it0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.it0 r0 = (ads_mobile_sdk.it0) r0
            int r1 = r0.f6545j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6545j = r1
            goto L18
        L13:
            ads_mobile_sdk.it0 r0 = new ads_mobile_sdk.it0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f6543h
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6545j
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            android.net.Uri$Builder r6 = r0.f6542g
            java.lang.String r7 = r0.f6541f
            android.net.Uri$Builder r8 = r0.f6540e
            android.net.Uri$Builder r1 = r0.f6539d
            nm.u r2 = r0.f6538c
            java.lang.String r3 = r0.f6537b
            ads_mobile_sdk.ku0 r0 = r0.f6536a
            ue.c.H(r9)
            r4 = r9
            r9 = r8
            r8 = r2
            r2 = r1
            r1 = r0
            r0 = r4
            goto L6c
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            ue.c.H(r9)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r0.f6536a = r5
            r0.f6537b = r7
            r0.f6538c = r8
            r0.f6539d = r6
            r0.f6540e = r6
            java.lang.String r9 = "linkedDeviceId"
            r0.f6541f = r9
            r0.f6542g = r6
            r0.f6545j = r3
            java.lang.Object r0 = r5.h(r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r1 = r5
            r2 = r6
            r3 = r7
            r7 = r9
            r9 = r2
        L6c:
            ads_mobile_sdk.kv0 r0 = (ads_mobile_sdk.kv0) r0
            java.lang.String r0 = r0.t()
            r6.appendQueryParameter(r7, r0)
            java.lang.String r6 = "adSlotPath"
            r9.appendQueryParameter(r6, r3)
            java.lang.String r6 = r1.f7514f
            java.lang.String r7 = "afmaVersion"
            r9.appendQueryParameter(r7, r6)
            if (r8 == 0) goto L8c
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "debugData"
            r9.appendQueryParameter(r7, r6)
        L8c:
            android.net.Uri r6 = r2.build()
            java.lang.String r7 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(java.lang.String, java.lang.String, nm.u, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.au0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.au0 r0 = (ads_mobile_sdk.au0) r0
            int r1 = r0.f2548d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2548d = r1
            goto L18
        L13:
            ads_mobile_sdk.au0 r0 = new ads_mobile_sdk.au0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2546b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2548d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.ku0 r4 = r0.f2545a
            ue.c.H(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r5)
            r0.f2545a = r4
            r0.f2548d = r3
            java.lang.Object r5 = r4.k(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            ao2.j0 r5 = r4.f7513e
            ads_mobile_sdk.bu0 r0 = new ads_mobile_sdk.bu0
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.coroutines.j r4 = kotlin.coroutines.j.f80412a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            ads_mobile_sdk.et2 r2 = new ads_mobile_sdk.et2
            r2.<init>(r0, r1)
            r0 = 2
            kotlin.jvm.internal.j.z(r5, r4, r1, r2, r0)
            ads_mobile_sdk.pk0 r4 = new ads_mobile_sdk.pk0
            kotlin.Unit r5 = kotlin.Unit.f80348a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Type inference failed for: r13v0, types: [ads_mobile_sdk.ku0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r13, java.lang.String r14, bl2.c r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.cu0
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.cu0 r0 = (ads_mobile_sdk.cu0) r0
            int r1 = r0.f4040f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4040f = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            ads_mobile_sdk.cu0 r0 = new ads_mobile_sdk.cu0
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r10.f4038d
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f4040f
            r2 = 2
            r3 = 1
            r12 = 0
            if (r1 == 0) goto L48
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r13 = r10.f4035a
            mo2.a r13 = (mo2.a) r13
            ue.c.H(r15)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r14 = move-exception
            goto L81
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            mo2.a r13 = r10.f4037c
            java.lang.String r14 = r10.f4036b
            java.lang.Object r1 = r10.f4035a
            ads_mobile_sdk.ku0 r1 = (ads_mobile_sdk.ku0) r1
            ue.c.H(r15)
            r8 = r14
            goto L61
        L48:
            ue.c.H(r15)
            mo2.a r15 = r13.f7531w
            r10.f4035a = r13
            r10.f4036b = r14
            r10.f4037c = r15
            r10.f4040f = r3
            mo2.c r15 = (mo2.c) r15
            java.lang.Object r1 = r15.f(r12, r10)
            if (r1 != r0) goto L5e
            return r0
        L5e:
            r1 = r13
            r8 = r14
            r13 = r15
        L61:
            r10.f4035a = r13     // Catch: java.lang.Throwable -> L31
            r10.f4036b = r12     // Catch: java.lang.Throwable -> L31
            r10.f4037c = r12     // Catch: java.lang.Throwable -> L31
            r10.f4040f = r2     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 191(0xbf, float:2.68E-43)
            java.lang.Object r14 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L31
            if (r14 != r0) goto L79
            return r0
        L79:
            kotlin.Unit r14 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L31
            mo2.c r13 = (mo2.c) r13
            r13.i(r12)
            return r14
        L81:
            mo2.c r13 = (mo2.c) r13
            r13.i(r12)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:14:0x00ba, B:21:0x006e, B:23:0x0072, B:25:0x0078, B:28:0x0080, B:30:0x0086, B:31:0x00a2, B:34:0x00c2, B:35:0x00c8), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:14:0x00ba, B:21:0x006e, B:23:0x0072, B:25:0x0078, B:28:0x0080, B:30:0x0086, B:31:0x00a2, B:34:0x00c2, B:35:0x00c8), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r13, ads_mobile_sdk.bt0 r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, ads_mobile_sdk.bt0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r5, nm.u r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.fu0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.fu0 r0 = (ads_mobile_sdk.fu0) r0
            int r1 = r0.f5286f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5286f = r1
            goto L18
        L13:
            ads_mobile_sdk.fu0 r0 = new ads_mobile_sdk.fu0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5284d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5286f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mo2.a r5 = r0.f5283c
            nm.u r6 = r0.f5282b
            ads_mobile_sdk.ku0 r0 = r0.f5281a
            ue.c.H(r7)
            r7 = r5
            r5 = r0
            goto L4e
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            ue.c.H(r7)
            mo2.a r7 = r5.f7531w
            r0.f5281a = r5
            r0.f5282b = r6
            r0.f5283c = r7
            r0.f5286f = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r5.f7534z = r6     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L58
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            return r5
        L58:
            r5 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, nm.u, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #0 {all -> 0x00a8, blocks: (B:13:0x002d, B:14:0x00e5, B:21:0x0069, B:24:0x006f, B:25:0x0072, B:28:0x0079, B:30:0x007f, B:34:0x0089, B:36:0x008d, B:38:0x0093, B:40:0x0097, B:41:0x00ca, B:44:0x00a4, B:45:0x00a7, B:46:0x00aa, B:47:0x00ad, B:48:0x00ae, B:50:0x00b4, B:51:0x00ed, B:52:0x00f0), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #0 {all -> 0x00a8, blocks: (B:13:0x002d, B:14:0x00e5, B:21:0x0069, B:24:0x006f, B:25:0x0072, B:28:0x0079, B:30:0x007f, B:34:0x0089, B:36:0x008d, B:38:0x0093, B:40:0x0097, B:41:0x00ca, B:44:0x00a4, B:45:0x00a7, B:46:0x00aa, B:47:0x00ad, B:48:0x00ae, B:50:0x00b4, B:51:0x00ed, B:52:0x00f0), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ku0 r13, boolean r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(ads_mobile_sdk.ku0, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x004e, B:13:0x006d, B:17:0x0075), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[Catch: all -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x004e, B:13:0x006d, B:17:0x0075), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.iu0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.iu0 r0 = (ads_mobile_sdk.iu0) r0
            int r1 = r0.f6553f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6553f = r1
            goto L18
        L13:
            ads_mobile_sdk.iu0 r0 = new ads_mobile_sdk.iu0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f6551d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6553f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r10 = r0.f6550c
            mo2.a r1 = r0.f6549b
            ads_mobile_sdk.ku0 r0 = r0.f6548a
            ue.c.H(r11)
            goto L4e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            ue.c.H(r11)
            mo2.a r11 = r9.C
            r0.f6548a = r9
            r0.f6549b = r11
            r0.f6550c = r10
            r0.f6553f = r3
            mo2.c r11 = (mo2.c) r11
            java.lang.Object r0 = r11.f(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r9
            r1 = r11
        L4e:
            long r2 = r0.D     // Catch: java.lang.Throwable -> L82
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L82
            long r2 = r2 + r10
            ads_mobile_sdk.oh0 r5 = r0.f7518j     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = "gads:inspector:max_ad_response_logs_bytes"
            r7 = 20971520(0x1400000, double:1.03613076E-316)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L82
            ads_mobile_sdk.eh0 r8 = ads_mobile_sdk.oh0.f9283g     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r5.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L82
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L82
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L75
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L82
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r10
        L75:
            long r2 = r0.D     // Catch: java.lang.Throwable -> L82
            long r2 = r2 + r10
            r0.D = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r10
        L82:
            r10 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ku0.a(int, bl2.c):java.lang.Object");
    }

    public final void a(bt0 bt0Var) {
        int ordinal = bt0Var.ordinal();
        if (ordinal == 1) {
            ((yf2) this.f7515g.get()).b();
        } else {
            if (ordinal != 2) {
                return;
            }
            ((sh0) this.f7516h.get()).b();
        }
    }
}
