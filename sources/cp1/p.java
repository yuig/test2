package cp1;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.j3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.j0;
import androidx.fragment.app.w0;
import com.google.firebase.messaging.a0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NoConnectionErrorWithUrls;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w1;
import df.j1;
import ey.s1;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.k0;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLHandshakeException;
import jk2.x;
import kh2.c3;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.t;
import m60.t0;
import m60.v0;
import m60.w;
import m60.x0;
import m60.z0;
import nx.d0;
import nx.f0;
import nx.o0;
import nx.z;
import org.jetbrains.annotations.NotNull;
import so.h3;
import so.oa;
import so.r8;

/* loaded from: classes2.dex */
public abstract class p extends q implements uo1.a, rs1.a, oe0.b, ms1.b, at1.h, os1.b, oy1.a, nx.a, uk1.c, nf0.d, nf0.c, a, ms1.a, yf0.f {

    @NotNull
    public static final b Companion = new b();
    public b60.b activeUserManager;
    private h32.e adDataEventData;
    public se2.a adFormats;
    public vy.m analyticsApi;
    public m60.e applicationInfoProvider;
    public se2.a baseActivityHelperInternal;
    private FrameLayout baseActivityLayout;
    public tb0.h baseCrashReporting;
    private dp1.a brioLoadingHandler;
    private dp1.c brioVoiceHandler;
    public se2.a chromeSettings;
    private Integer collectionSelectedPosition;
    private ns1.b configHelper;
    public se2.a contextLogViewHelper;
    private boolean correctFragmentFactory;
    private c currentPermissionsRequest;
    public tx.d dauManager;
    public tx.f dauWindowCallbackFactory;
    private k0 dcoEventData;
    private long deepLinkClickthroughStartTime;
    private f30 deepLinkSourcePin;
    private String deeplinkTrackingParam;
    private nf0.a dialogContainer;
    public nf0.b dialogContainerFactory;
    private xj2.b disposables;
    private Short dlAdCloseupIngressVariant;
    private String dlAdCloseupParentObjectId;
    public w eventManager;
    public il1.a fragmentFactory;
    public n1 hairballExperiments;
    public se2.a imageCache;
    public se2.a inAppBrowserSettings;
    private String insertionId;
    private boolean isRestored;
    private boolean isStateAlreadySaved;
    private boolean isVisibleInternal;
    private long lastToastTime;
    public se2.a lazyUnauthAnalyticsApi;
    private Boolean mdlDidSucceed;
    public ku1.j navigationManager;
    public z networkPinalytics;
    public se2.a offPinterestTimeSpentManager;
    private boolean padForStatusBar;
    private String parentDlAdCloseupIngressVariant;
    public se2.a pinAuxHelper;
    public f0 pinalyticsFactory;
    private s screenManager;
    private qe2.c shakeDetector;
    public se2.a shakeModalNavigation;
    private String storyType;
    public bz.i timeSpentLoggingManager;
    private m92.d toastContainer;
    private final a4 viewParameterType;
    private boolean autoAnalytics = true;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final oe0.c pinterestUiManager = new oe0.c();

    @NotNull
    private final xk2.k pinalytics$delegate = xk2.m.b(new e(this, 2));

    @NotNull
    private final xk2.k shouldSendToBackgroundThread$delegate = xk2.m.b(new e(this, 3));

    @NotNull
    private final xk2.k ioScope$delegate = xk2.m.b(g.f52998i);

    @NotNull
    private final qe2.a onShake = new a0(this, 22);

    @NotNull
    private final xk2.k perfDebugEventsSubscriber$delegate = xk2.m.b(new e(this, 1));

    @NotNull
    private final xk2.k contextLogEventsSubscriber$delegate = xk2.m.b(new e(this, 0));

    @NotNull
    private final t eventsSubscriberToast = new f(this);

    @NotNull
    private final String[] NETWORK_ERROR_MESSAGE_PATTERNS = {"Orig: /v", NoConnectionErrorWithUrls.class.getName(), rb0.a.class.getName(), UnknownHostException.class.getName(), SSLHandshakeException.class.getName()};

    static {
        r rVar = androidx.appcompat.app.t.f16128a;
        int i13 = j3.f16617a;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [bz.e, com.pinterest.api.model.f30, h32.k0, java.lang.Boolean, java.lang.Integer, java.lang.Short, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$logDeepLinkClickthroughEnd(cp1.p r70, com.pinterest.api.model.f30 r71) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cp1.p.access$logDeepLinkClickthroughEnd(cp1.p, com.pinterest.api.model.f30):void");
    }

    public static final void access$logFacebookAppInstalled(p pVar) {
        boolean P1 = dl2.b.P1(pVar.getApplicationContext(), "com.facebook.katana");
        HashMap hashMap = new HashMap();
        hashMap.put("app", hf0.b.a().name());
        ((m60.d) pVar.getApplicationInfoProvider()).b();
        hashMap.put("app_version", String.valueOf(13198010));
        String bool = Boolean.toString(P1);
        Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
        hashMap.put("installed", bool);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tags", hashMap);
        nm.o a13 = new nm.p().a();
        HashMap hashMap3 = new HashMap();
        String k13 = a13.k(hashMap2);
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        hashMap3.put("aux_data", k13);
        vy.m mVar = (vy.m) ((bf2.b) pVar.getLazyUnauthAnalyticsApi()).get();
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        mVar.k("facebook_installed", unmodifiableMap);
    }

    public final void addDisposable(@NotNull xj2.c disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        vb0.j.f125466a.N(this.disposables, "addDisposable() must be called between onCreate() and onDestroy()", new Object[0]);
        xj2.b bVar = this.disposables;
        if (bVar != null) {
            bVar.a(disposable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: all -> 0x0069, Exception -> 0x006b, LOOP:0: B:25:0x0051->B:27:0x0057, LOOP_END, TryCatch #2 {Exception -> 0x006b, blocks: (B:24:0x0048, B:25:0x0051, B:27:0x0057, B:29:0x006d), top: B:23:0x0048, outer: #3 }] */
    @Override // androidx.appcompat.app.n, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r7) {
        /*
            r6 = this;
            super.attachBaseContext(r7)
            if (r7 == 0) goto L8d
            java.util.concurrent.atomic.AtomicReference r0 = ik.a.f72383e
            java.lang.Object r0 = r0.get()
            ik.a r0 = (ik.a) r0
            if (r0 != 0) goto L22
            android.content.Context r0 = r7.getApplicationContext()
            r1 = 0
            if (r0 == 0) goto L1d
            android.content.Context r0 = r7.getApplicationContext()
            ik.a.c(r0, r1)
        L1d:
            ik.a.c(r7, r1)
            goto L8d
        L22:
            rd.j r1 = r0.f72387d
            java.util.HashSet r2 = r0.f72386c
            monitor-enter(r2)
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L8a
            java.util.HashSet r0 = r0.f72386c     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-enter(r1)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            goto L48
        L3b:
            r7 = move-exception
            goto L88
        L3d:
            r2 = move-exception
            goto L41
        L3f:
            r2 = move-exception
            r0 = 0
        L41:
            java.lang.String r4 = "SplitCompat"
            java.lang.String r5 = "Unable to set up strict mode."
            android.util.Log.i(r4, r5, r2)     // Catch: java.lang.Throwable -> L3b
        L48:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
        L51:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.Object r5 = r1.f107506b     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            ik.c r5 = (ik.c) r5     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.io.File r4 = r5.b(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2.add(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            goto L51
        L69:
            r7 = move-exception
            goto L81
        L6b:
            r7 = move-exception
            goto L77
        L6d:
            r1.I(r7, r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r0 == 0) goto L75
        L72:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3b
        L75:
            monitor-exit(r1)
            goto L8d
        L77:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Error installing additional splits"
            android.util.Log.e(r2, r3, r7)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L75
            goto L72
        L81:
            if (r0 != 0) goto L84
            goto L87
        L84:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3b
        L87:
            throw r7     // Catch: java.lang.Throwable -> L3b
        L88:
            monitor-exit(r1)
            throw r7
        L8a:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            throw r7
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp1.p.attachBaseContext(android.content.Context):void");
    }

    public final void clearDisposables() {
        vb0.j.f125466a.N(this.disposables, "clearDisposable() must be called between onCreate() and onDestroy()", new Object[0]);
        xj2.b bVar = this.disposables;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void configureTheme() {
        g92.h.a(this, g92.d.VR, g92.a.MAIN, false);
    }

    public final void createConfigChangeHandlers(@NotNull ns1.b configHelper) {
        Intrinsics.checkNotNullParameter(configHelper, "configHelper");
        dp1.c handler = new dp1.c(this.pinterestUiManager);
        configHelper.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        HashSet hashSet = configHelper.f91976a;
        hashSet.add(handler);
        this.brioVoiceHandler = handler;
        dp1.a handler2 = new dp1.a(this.pinterestUiManager);
        Intrinsics.checkNotNullParameter(handler2, "handler");
        hashSet.add(handler2);
        this.brioLoadingHandler = handler2;
    }

    public d4 d() {
        return getF143047w0();
    }

    public final void disableShakeDetector() {
        qe2.c cVar = this.shakeDetector;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final boolean dismissInlineAlertOrError() {
        dp1.c cVar = this.brioVoiceHandler;
        return cVar != null && cVar.a(false);
    }

    public final void enableShakeDetector() {
        Boolean bool;
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 == null || (bool = f13.z3()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        ((m60.d) m60.d.a()).g();
        if (booleanValue) {
            if (this.shakeDetector == null) {
                this.shakeDetector = new qe2.c(this.onShake);
            }
            qe2.c cVar = this.shakeDetector;
            if (cVar != null) {
                Object systemService = getSystemService("sensor");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                cVar.a((SensorManager) systemService);
            }
        }
    }

    public final void ensureResources(int i13) {
        if (i13 != 0) {
            int i14 = at1.d.f20439o;
            nl.b.f().a(i13, this, false);
        }
    }

    public i0 generateLoggingContext() {
        return new i0(getF143047w0(), getY0(), null, null, null, null);
    }

    /* renamed from: getActiveFragment */
    public nl1.d getF34938d() {
        Fragment fragment = getFragment();
        if (fragment instanceof nl1.d) {
            return (nl1.d) fragment;
        }
        return null;
    }

    @NotNull
    public final b60.b getActiveUserManager() {
        b60.b bVar = this.activeUserManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activeUserManager");
        throw null;
    }

    @NotNull
    public final se2.a getAdFormats() {
        se2.a aVar = this.adFormats;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    @NotNull
    public final vy.m getAnalyticsApi() {
        vy.m mVar = this.analyticsApi;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("analyticsApi");
        throw null;
    }

    @NotNull
    public final m60.e getApplicationInfoProvider() {
        m60.e eVar = this.applicationInfoProvider;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("applicationInfoProvider");
        throw null;
    }

    public final boolean getAutoAnalytics() {
        return this.autoAnalytics;
    }

    public abstract so1.a getBaseActivityComponent();

    @NotNull
    public final se2.a getBaseActivityHelperInternal() {
        se2.a aVar = this.baseActivityHelperInternal;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("baseActivityHelperInternal");
        throw null;
    }

    @NotNull
    public final tb0.h getBaseCrashReporting() {
        tb0.h hVar = this.baseCrashReporting;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("baseCrashReporting");
        throw null;
    }

    @NotNull
    public final se2.a getChromeSettings() {
        se2.a aVar = this.chromeSettings;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("chromeSettings");
        throw null;
    }

    @NotNull
    public final se2.a getContextLogViewHelper() {
        se2.a aVar = this.contextLogViewHelper;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("contextLogViewHelper");
        throw null;
    }

    public boolean getCorrectFragmentFactory() {
        return this.correctFragmentFactory;
    }

    @NotNull
    public final tx.d getDauManager() {
        tx.d dVar = this.dauManager;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("dauManager");
        throw null;
    }

    @NotNull
    public final tx.f getDauWindowCallbackFactory() {
        tx.f fVar = this.dauWindowCallbackFactory;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("dauWindowCallbackFactory");
        throw null;
    }

    @Override // nf0.d
    @NotNull
    public nf0.a getDialogContainer() {
        nf0.a aVar = this.dialogContainer;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("dialogContainer");
        throw null;
    }

    @NotNull
    public final nf0.b getDialogContainerFactory() {
        nf0.b bVar = this.dialogContainerFactory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("dialogContainerFactory");
        throw null;
    }

    public yf0.d getEdgeToEdgeConfiguration() {
        return yf0.b.f138956a;
    }

    @NotNull
    public final w getEventManager() {
        w wVar = this.eventManager;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public abstract Fragment getFragment();

    @NotNull
    public final il1.a getFragmentFactory() {
        il1.a aVar = this.fragmentFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("fragmentFactory");
        throw null;
    }

    public oe0.a getFullBleedLoadingDispatcher() {
        return this.brioLoadingHandler;
    }

    @NotNull
    public final n1 getHairballExperiments() {
        n1 n1Var = this.hairballExperiments;
        if (n1Var != null) {
            return n1Var;
        }
        Intrinsics.r("hairballExperiments");
        throw null;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // nf0.c
    @NotNull
    public FragmentActivity getHostActivity() {
        return this;
    }

    @NotNull
    public final se2.a getImageCache() {
        se2.a aVar = this.imageCache;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("imageCache");
        throw null;
    }

    @NotNull
    public final se2.a getInAppBrowserSettings() {
        se2.a aVar = this.inAppBrowserSettings;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("inAppBrowserSettings");
        throw null;
    }

    public final void getInfoForBugReport(@NotNull StringBuilder sb3) {
        i0 generateLoggingContext;
        Intrinsics.checkNotNullParameter(sb3, "sb");
        nl1.d f34938d = getF34938d();
        if (f34938d != null) {
            List<String> r73 = f34938d.r7();
            List list = r73;
            if (list != null && !list.isEmpty()) {
                sb3.append("Pin id(s):\n");
                for (String str : r73) {
                    sb3.append("     ");
                    sb3.append(str);
                    sb3.append("\n");
                }
            }
            sb3.append("\n");
            f34938d.Q6(sb3);
        }
        o0 o0Var = o0.f92437i;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(sb3, "sb");
        nx.a d2 = o0Var.d();
        if (d2 == null || (generateLoggingContext = d2.generateLoggingContext()) == null) {
            return;
        }
        sb3.append("Context: ");
        sb3.append(generateLoggingContext);
        sb3.append("\n");
    }

    @NotNull
    public final se2.a getLazyUnauthAnalyticsApi() {
        se2.a aVar = this.lazyUnauthAnalyticsApi;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("lazyUnauthAnalyticsApi");
        throw null;
    }

    @NotNull
    public final ku1.j getNavigationManager() {
        ku1.j jVar = this.navigationManager;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("navigationManager");
        throw null;
    }

    @NotNull
    public final z getNetworkPinalytics() {
        z zVar = this.networkPinalytics;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.r("networkPinalytics");
        throw null;
    }

    @NotNull
    public final se2.a getOffPinterestTimeSpentManager() {
        se2.a aVar = this.offPinterestTimeSpentManager;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("offPinterestTimeSpentManager");
        throw null;
    }

    @NotNull
    public final se2.a getPinAuxHelper() {
        se2.a aVar = this.pinAuxHelper;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("pinAuxHelper");
        throw null;
    }

    @NotNull
    public final d0 getPinalytics() {
        return (d0) this.pinalytics$delegate.getValue();
    }

    @NotNull
    public final f0 getPinalyticsFactory() {
        f0 f0Var = this.pinalyticsFactory;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    public final s getScreenManager() {
        return this.screenManager;
    }

    @NotNull
    public final se2.a getShakeModalNavigation() {
        se2.a aVar = this.shakeModalNavigation;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("shakeModalNavigation");
        throw null;
    }

    @NotNull
    public final bz.i getTimeSpentLoggingManager() {
        bz.i iVar = this.timeSpentLoggingManager;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("timeSpentLoggingManager");
        throw null;
    }

    public final m92.d getToastContainer() {
        return this.toastContainer;
    }

    /* renamed from: getViewParameterType */
    public a4 getY0() {
        return this.viewParameterType;
    }

    @Override // oe0.b
    public oe0.h getVoiceMessageDispatcher() {
        return this.brioVoiceHandler;
    }

    public void inflateConfettiContainer() {
    }

    public void inflateEducationContainer() {
    }

    public void init() {
    }

    public void injectDependencies() {
    }

    @Override // ms1.a
    public boolean isRestored() {
        return this.isRestored;
    }

    public boolean isStateAlreadySaved() {
        return this.isStateAlreadySaved;
    }

    @Override // nf0.c
    public boolean isVisible() {
        return this.isVisibleInternal;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        f30 f30Var;
        if (i13 == 1718 && (f30Var = this.deepLinkSourcePin) != null) {
            if (t()) {
                kotlin.jvm.internal.j.z(q(), null, null, new h(f30Var, this, null), 3);
            } else if (b40.q0(f30Var)) {
                access$logDeepLinkClickthroughEnd(this, f30Var);
            }
        }
        getBaseCrashReporting().h("{" + this + "}#onActivityResult(): requestCode=" + i13 + ", resultCode=" + i14);
        nl1.d f34938d = getF34938d();
        if (f34938d != null) {
            f34938d.onActivityResult(i13, i14, intent);
        }
        super.onActivityResult(i13, i14, intent);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onBackPressed() {
        if (preActivityBackPress()) {
            return;
        }
        super.onBackPressed();
        postActivityBackPress();
    }

    @Override // cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        configureTheme();
        if (getEdgeToEdgeConfiguration() instanceof yf0.c) {
            androidx.activity.q.a(this);
        }
        super.setContentView(v0.activity_toast);
        new fy.e(getClass().getSimpleName()).i();
        this.baseActivityLayout = (FrameLayout) findViewById(t0.base_activity_layout);
        this.disposables = new xj2.b();
        ((m60.d) m60.d.a()).f85896f.getClass();
        ns1.b bVar = new ns1.b();
        createConfigChangeHandlers(bVar);
        LinkedList linkedList = bVar.f91977b;
        linkedList.clear();
        if (bundle != null) {
            Iterator it = bVar.f91976a.iterator();
            while (it.hasNext()) {
                ns1.a aVar = (ns1.a) it.next();
                if (aVar.f(bundle)) {
                    linkedList.add(aVar);
                }
            }
        }
        this.configHelper = bVar;
        z0 z0Var = ff0.a.f62099a;
        ((m60.d) m60.d.a()).g();
        dl2.b.a2(this);
        if (!getCorrectFragmentFactory()) {
            getSupportFragmentManager().f18474z = getFragmentFactory();
        }
        super.onCreate(bundle);
        if (getCorrectFragmentFactory()) {
            getSupportFragmentManager().f18474z = getFragmentFactory();
        }
        setupActivityComponent();
        tb.c cVar = (tb.c) getDialogContainerFactory();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "dialogHost");
        w wVar = (w) cVar.f116959a;
        mf0.k kVar = new mf0.k(this, wVar, (tb0.h) cVar.f116960b);
        this.dialogContainer = kVar;
        mf0.j jVar = kVar.f87124g;
        if (!wVar.c(jVar)) {
            wVar.h(jVar);
        }
        getPinalytics().getClass();
        if (t()) {
            kotlin.jvm.internal.j.z(q(), null, null, new i(null, this), 3);
        } else {
            access$logFacebookAppInstalled(this);
        }
        enableShakeDetector();
        ((m60.d) m60.d.a()).g();
        n1 hairballExperiments = getHairballExperiments();
        hairballExperiments.getClass();
        z3 z3Var = lh0.a4.f83298b;
        g1 g1Var = (g1) hairballExperiments.f83439a;
        if (g1Var.o("android_network_pinalytics", "enabled", z3Var) || g1Var.l("android_network_pinalytics")) {
            getNetworkPinalytics().a();
        }
    }

    @Override // cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m92.d dVar;
        nf0.a aVar = this.dialogContainer;
        if (aVar != null) {
            mf0.k kVar = (mf0.k) aVar;
            kVar.f87119b.j(kVar.f87124g);
        }
        ns1.b bVar = this.configHelper;
        if (bVar != null) {
            bVar.f91977b.clear();
            Iterator it = bVar.f91976a.iterator();
            while (it.hasNext()) {
                ((ns1.a) it.next()).a(false);
            }
        }
        this.configHelper = null;
        s1.b(this);
        ((vx.c) ((bf2.b) getContextLogViewHelper()).get()).a(this);
        qe2.c cVar = this.shakeDetector;
        if (cVar != null) {
            cVar.b();
        }
        this.shakeDetector = null;
        xj2.b bVar2 = this.disposables;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.disposables = null;
        getEventManager().j((t) this.perfDebugEventsSubscriber$delegate.getValue());
        vy.m analyticsApi = getAnalyticsApi();
        analyticsApi.getClass();
        analyticsApi.g(vy.m.d());
        vy.m analyticsApi2 = getAnalyticsApi();
        analyticsApi2.getClass();
        analyticsApi2.f(vy.m.e(), false);
        if (isFinishing() && (dVar = this.toastContainer) != null) {
            dVar.n(this);
        }
        getPinalytics().onDestroy();
        int i13 = at1.d.f20439o;
        nl.b.e();
        Intrinsics.checkNotNullParameter(this, "object");
        ((vx.c) ((bf2.b) getContextLogViewHelper()).get()).f126809a.f92444g = null;
        ((m60.d) m60.d.a()).g();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.n, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        nl1.d f34938d = getF34938d();
        if (f34938d != null && f34938d.N7(i13, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 32 && (i13 == 5 || i13 == 27)) {
            return true;
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i13, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i13 != 4) {
            return super.onKeyLongPress(i13, event);
        }
        Object obj = ((bf2.b) getBaseActivityHelperInternal()).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ((lu1.c) ((lu1.b) obj)).k(this, false);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i13, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getF34938d();
        return super.onKeyUp(i13, event);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        qe2.c cVar = this.shakeDetector;
        if (cVar != null) {
            cVar.b();
        }
        hb0.g gVar = hb0.f.f68518a;
        Timer timer = gVar.f68522d;
        if (timer != null) {
            timer.cancel();
        }
        long j13 = 1000;
        Timer timer2 = gVar.f68521c;
        if (timer2 != null) {
            timer2.schedule(new hb0.e(gVar, (Object) null), j13);
        }
        Timer timer3 = new Timer();
        gVar.f68522d = timer3;
        timer3.schedule(new hb0.e(gVar), 2000);
        m60.d dVar = (m60.d) m60.d.a();
        Timer timer4 = dVar.f85892b;
        if (timer4 != null) {
            timer4.cancel();
            dVar.f85892b = null;
        }
        Timer timer5 = new Timer();
        dVar.f85892b = timer5;
        timer5.schedule(new m60.c(dVar, 0), 1000L);
        if ((!((z70.f) ((bf2.b) getChromeSettings()).get()).f140994c) && (!((a80.a) ((bf2.b) getInAppBrowserSettings()).get()).f1501a)) {
            getTimeSpentLoggingManager().c();
        }
        o0.f92437i.c();
        tx.d dauManager = getDauManager();
        long currentTimeMillis = System.currentTimeMillis();
        Instant ofEpochMilli = Instant.ofEpochMilli(dauManager.f119630h);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        ZonedDateTime atZone = ofEpochMilli.atZone(zoneOffset);
        ZonedDateTime atZone2 = Instant.ofEpochMilli(currentTimeMillis).atZone(zoneOffset);
        boolean z13 = atZone2.getDayOfYear() > atZone.getDayOfYear();
        boolean z14 = atZone2.getYear() > atZone.getYear();
        boolean z15 = atZone2.getYear() == atZone.getYear();
        if (z14 || (z15 && z13)) {
            v();
        }
        getEventManager().j(this.eventsSubscriberToast);
        setRestored(false);
        this.isVisibleInternal = false;
        nf0.a aVar = this.dialogContainer;
        if (aVar == null) {
            Intrinsics.r("dialogContainer");
            throw null;
        }
        mf0.k kVar = (mf0.k) aVar;
        if (kVar.f87121d instanceof mf0.l) {
            kVar.a(null);
        }
        nf0.a aVar2 = this.dialogContainer;
        if (aVar2 == null) {
            Intrinsics.r("dialogContainer");
            throw null;
        }
        mf0.k kVar2 = (mf0.k) aVar2;
        kVar2.f87119b.j(kVar2.f87124g);
        super.onPause();
    }

    @Override // androidx.appcompat.app.n, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Window window = getWindow();
        Window.Callback callback = window.getCallback();
        tx.f dauWindowCallbackFactory = getDauWindowCallbackFactory();
        Intrinsics.f(callback);
        d0 pinalytics = getPinalytics();
        r8 r8Var = ((h3) dauWindowCallbackFactory).f113443a;
        oa oaVar = r8Var.f114090a;
        window.setCallback(new tx.e(callback, this, pinalytics, oaVar.Vc, (m60.e) oaVar.f113920t0.get(), (tb0.h) r8Var.f114090a.f113797m0.get()));
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        setRestored(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public void onRequestPermissionsResult(int i13, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        c cVar = this.currentPermissionsRequest;
        if (cVar != null) {
            cVar.f52992a.onRequestPermissionsResult(i13, permissions, grantResults);
            this.currentPermissionsRequest = null;
        }
        super.onRequestPermissionsResult(i13, permissions, grantResults);
    }

    @Override // at1.h
    public boolean onResourcesError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return false;
    }

    public void onResourcesReady(int i13) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Unit unit;
        ns1.b bVar;
        bz.d dVar;
        bz.e eVar;
        enableShakeDetector();
        if (this.autoAnalytics && !(this instanceof hq.e)) {
            getPinalytics().z(null);
        }
        hb0.g gVar = hb0.f.f68518a;
        Timer timer = gVar.f68522d;
        if (timer != null) {
            timer.cancel();
            gVar.f68522d = null;
        }
        gVar.a();
        m60.d dVar2 = (m60.d) m60.d.a();
        Timer timer2 = dVar2.f85892b;
        if (timer2 != null) {
            timer2.cancel();
            dVar2.f85892b = null;
        }
        dVar2.f85891a = m60.b.FOREGROUND;
        f30 f30Var = this.deepLinkSourcePin;
        if (f30Var != null) {
            if (t()) {
                kotlin.jvm.internal.j.z(q(), null, null, new j(f30Var, this, null), 3);
            } else if (b40.q0(f30Var)) {
                access$logDeepLinkClickthroughEnd(this, f30Var);
            }
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null && (eVar = (dVar = (bz.d) ((bf2.b) getOffPinterestTimeSpentManager()).get()).f24173a) != null) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            eVar.f24171f = elapsedRealtimeNanos;
            eVar.f24169d = (elapsedRealtimeNanos - eVar.f24170e) + eVar.f24168c;
            eVar.g();
            dVar.f24173a = null;
        }
        getEventManager().h(this.eventsSubscriberToast);
        this.isVisibleInternal = true;
        nf0.a aVar = this.dialogContainer;
        if (aVar == null) {
            Intrinsics.r("dialogContainer");
            throw null;
        }
        mf0.k kVar = (mf0.k) aVar;
        w wVar = kVar.f87119b;
        mf0.j jVar = kVar.f87124g;
        if (!wVar.c(jVar)) {
            wVar.h(jVar);
        }
        super.onResume();
        FrameLayout frameLayout = this.baseActivityLayout;
        if (frameLayout != null && (bVar = this.configHelper) != null) {
            bVar.a(frameLayout, "NO_TAG");
        }
        bz.i timeSpentLoggingManager = getTimeSpentLoggingManager();
        if (timeSpentLoggingManager.f24183a == null) {
            bz.c cVar = new bz.c();
            cVar.f();
            timeSpentLoggingManager.f24183a = cVar;
        }
        getDauManager().f119630h = System.currentTimeMillis();
        v();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        this.isStateAlreadySaved = false;
    }

    @Override // androidx.activity.o, c5.h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        ns1.b bVar = this.configHelper;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            Iterator it = bVar.f91976a.iterator();
            while (it.hasNext()) {
                ((ns1.a) it.next()).e(outState);
            }
        }
        w0 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (this.isStateAlreadySaved || supportFragmentManager.f18448J || supportFragmentManager.Q()) {
            return;
        }
        this.isStateAlreadySaved = true;
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        getEventManager().d(Navigation.w1((ScreenLocation) w1.K.getValue()));
        return super.onSearchRequested();
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        f30 f30Var = this.deepLinkSourcePin;
        if (f30Var != null) {
            if (t()) {
                kotlin.jvm.internal.j.z(q(), null, null, new k(f30Var, this, null), 3);
            } else {
                access$logDeepLinkClickthroughEnd(this, f30Var);
            }
        }
        tb0.h baseCrashReporting = getBaseCrashReporting();
        w0 supportFragmentManager = getSupportFragmentManager();
        if (!baseCrashReporting.f117079c.get() || supportFragmentManager == null) {
            return;
        }
        ((CopyOnWriteArrayList) supportFragmentManager.f18462n.f116986b).add(new j0(new tb0.l(), true));
    }

    @Override // rs1.a
    public void onViewTreeReady(@NotNull View rootView, @NotNull String invokerTag) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
        ns1.b bVar = this.configHelper;
        if (bVar != null) {
            bVar.a(rootView, invokerTag);
        }
    }

    public void postActivityBackPress() {
    }

    public boolean preActivityBackPress() {
        ns1.b bVar = this.configHelper;
        boolean z13 = false;
        if (bVar != null) {
            Iterator it = bVar.f91976a.iterator();
            while (it.hasNext()) {
                z13 |= ((ns1.a) it.next()).a(true);
            }
        }
        return z13;
    }

    public final ao2.j0 q() {
        return (ao2.j0) this.ioScope$delegate.getValue();
    }

    public final void refresh() {
    }

    public final void setActiveUserManager(@NotNull b60.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.activeUserManager = bVar;
    }

    public final void setAdFormats(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adFormats = aVar;
    }

    public final void setAnalyticsApi(@NotNull vy.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.analyticsApi = mVar;
    }

    public final void setApplicationInfoProvider(@NotNull m60.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.applicationInfoProvider = eVar;
    }

    public final void setAutoAnalytics(boolean z13) {
        this.autoAnalytics = z13;
    }

    public final void setBaseActivityHelperInternal(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.baseActivityHelperInternal = aVar;
    }

    public final void setBaseCrashReporting(@NotNull tb0.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.baseCrashReporting = hVar;
    }

    public final void setChromeSettings(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.chromeSettings = aVar;
    }

    @Override // androidx.appcompat.app.n, androidx.activity.o, android.app.Activity
    public void setContentView(int i13) {
        LayoutInflater.from(this).inflate(i13, this.baseActivityLayout);
    }

    public final void setContextLogViewHelper(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.contextLogViewHelper = aVar;
    }

    public void setCorrectFragmentFactory(boolean z13) {
        this.correctFragmentFactory = z13;
    }

    public final void setDauManager(@NotNull tx.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.dauManager = dVar;
    }

    public final void setDauWindowCallbackFactory(@NotNull tx.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.dauWindowCallbackFactory = fVar;
    }

    @Override // os1.b
    public void setDeepLinkClickthroughData(@NotNull os1.a deepLinkClickthroughData) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(deepLinkClickthroughData, "deepLinkClickthroughData");
        f30 j13 = deepLinkClickthroughData.j();
        this.deepLinkClickthroughStartTime = deepLinkClickthroughData.b();
        this.deepLinkSourcePin = j13;
        this.mdlDidSucceed = deepLinkClickthroughData.h();
        this.storyType = deepLinkClickthroughData.k();
        this.deeplinkTrackingParam = deepLinkClickthroughData.l();
        this.insertionId = deepLinkClickthroughData.g();
        this.dcoEventData = deepLinkClickthroughData.d();
        this.collectionSelectedPosition = deepLinkClickthroughData.c();
        this.parentDlAdCloseupIngressVariant = deepLinkClickthroughData.i();
        this.dlAdCloseupIngressVariant = deepLinkClickthroughData.e();
        this.dlAdCloseupParentObjectId = deepLinkClickthroughData.f();
        this.adDataEventData = deepLinkClickthroughData.a();
        if (j13 != null) {
            String uid = j13.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            if (uid.length() > 0) {
                i0 p13 = getPinalytics().p();
                a4 a4Var = p13 != null ? p13.f67082b : null;
                HashMap hashMap = new HashMap();
                if (((es.c) ((es.a) ((bf2.b) getAdFormats()).get())).C(j13)) {
                    hashMap.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
                    Boolean bool = this.mdlDidSucceed;
                    if (bool == null || (str = bool.toString()) == null) {
                        str = "false";
                    }
                    hashMap.put("mdl_did_succeed", str);
                    String D = com.bumptech.glide.c.D(j13);
                    if (D == null || (str2 = e0.C(4096, D)) == null) {
                        str2 = "";
                    }
                    hashMap.put("final_destination_url", str2);
                }
                hashMap.put("is_third_party_ad", String.valueOf(j13.i5().booleanValue()));
                nx.z0 R1 = j1.R1(hashMap);
                bz.d dVar = (bz.d) ((bf2.b) getOffPinterestTimeSpentManager()).get();
                String uid2 = j13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                dVar.a(uid2, R1, this.deeplinkTrackingParam, a4Var);
            }
        }
    }

    public final void setDialogContainerFactory(@NotNull nf0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.dialogContainerFactory = bVar;
    }

    public final void setEventManager(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.eventManager = wVar;
    }

    public final void setFragmentFactory(@NotNull il1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.fragmentFactory = aVar;
    }

    public final void setHairballExperiments(@NotNull n1 n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<set-?>");
        this.hairballExperiments = n1Var;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setImageCache(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.imageCache = aVar;
    }

    public final void setInAppBrowserSettings(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.inAppBrowserSettings = aVar;
    }

    public final void setLazyUnauthAnalyticsApi(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.lazyUnauthAnalyticsApi = aVar;
    }

    public final void setNavigationManager(@NotNull ku1.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.navigationManager = jVar;
    }

    public final void setNetworkPinalytics(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        this.networkPinalytics = zVar;
    }

    public final void setOffPinterestTimeSpentManager(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.offPinterestTimeSpentManager = aVar;
    }

    @Override // oy1.a
    public void setOnRequestPermissionsResultCallback(@NotNull c5.a callback, @NotNull List<String> permissions, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(feature, "feature");
        c cVar = this.currentPermissionsRequest;
        if (cVar != null) {
            getBaseCrashReporting().k("DUPLICATE_PERMISSIONS_REQUEST", kotlin.collections.f0.j(new Pair("previous_permissions", cVar.b().toString()), new Pair("previous_feature", cVar.a()), new Pair("new_permissions", permissions.toString()), new Pair("new_feature", feature)));
        }
        this.currentPermissionsRequest = new c(callback, CollectionsKt.J0(permissions), feature);
    }

    public final void setPadForStatusBar(boolean z13) {
        this.padForStatusBar = z13;
        u();
    }

    public final void setPinAuxHelper(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.pinAuxHelper = aVar;
    }

    public final void setPinalyticsFactory(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.pinalyticsFactory = f0Var;
    }

    public void setRestored(boolean z13) {
        this.isRestored = z13;
    }

    public final void setScreenManager(s sVar) {
        this.screenManager = sVar;
    }

    public final void setShakeModalNavigation(@NotNull se2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.shakeModalNavigation = aVar;
    }

    public final void setTimeSpentLoggingManager(@NotNull bz.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.timeSpentLoggingManager = iVar;
    }

    public final void setToastContainer(m92.d dVar) {
        this.toastContainer = dVar;
    }

    public abstract void setupActivityComponent();

    public final void setupToastContainer() {
        m92.d dVar;
        if (this.toastContainer == null) {
            m92.d dVar2 = new m92.d(this);
            dVar2.setId(t0.toast_container);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 49;
            dVar2.setLayoutParams(layoutParams);
            FrameLayout frameLayout = this.baseActivityLayout;
            if (frameLayout != null) {
                frameLayout.addView(dVar2);
            }
            xj2.c F = new x(r70.b.f106349i.k0().d(), new b22.f(5, m.f53007j), 2).F(new dl1.c(24, new xm1.k(18, this, dVar2)), new dl1.c(25, m.f53008k), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
            this.toastContainer = dVar2;
            u();
            if (!(getEdgeToEdgeConfiguration() instanceof yf0.c) || (dVar = this.toastContainer) == null) {
                return;
            }
            c3.w(dVar, false, n.f53010i);
        }
    }

    public final boolean showError(@NotNull String errorMessage, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        dp1.c cVar = this.brioVoiceHandler;
        return cVar != null && cVar.b(errorMessage, anchorView, "NO_TAG", false);
    }

    public final boolean showInlineAlert(@NotNull String alertMessage, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        dp1.c cVar = this.brioVoiceHandler;
        return cVar != null && cVar.h(anchorView, alertMessage, "NO_TAG");
    }

    public final boolean showInlineEducation(@NotNull String educationMessage, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(educationMessage, "educationMessage");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        dp1.c cVar = this.brioVoiceHandler;
        return cVar != null && cVar.i(anchorView, educationMessage, "NO_TAG");
    }

    public final void showToast(@NotNull we0.a toast) {
        Boolean bool;
        i92.g gVar;
        String d2;
        Intrinsics.checkNotNullParameter(toast, "toast");
        setupToastContainer();
        m92.d dVar = this.toastContainer;
        if (dVar != null) {
            if (toast instanceof i92.g) {
                wy0 f13 = ((b60.d) getActiveUserManager()).f();
                if (f13 == null || (bool = f13.z3()) == null) {
                    bool = Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                if ((toast instanceof i92.f) && (d2 = (gVar = (i92.g) toast).d()) != null) {
                    String obj = d2.toString();
                    String[] strArr = this.NETWORK_ERROR_MESSAGE_PATTERNS;
                    int length = strArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        String str = strArr[i13];
                        Intrinsics.f(str);
                        if (!kotlin.text.z.p(obj, str, false)) {
                            i13++;
                        } else if (!booleanValue) {
                            String string = getString(x0.generic_error);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            gVar.e(string);
                        }
                    }
                }
                i92.g gVar2 = (i92.g) toast;
                String d13 = gVar2.d();
                if (d13 != null && d13.length() != 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String lowerCase = gVar2.d().toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (toast.f129242b || !dVar.m(lowerCase) || currentTimeMillis - this.lastToastTime > 8000) {
                        dVar.b(toast);
                        this.lastToastTime = System.currentTimeMillis();
                    }
                }
            } else {
                dVar.b(toast);
            }
            dVar.invalidate();
        }
    }

    public final boolean t() {
        return ((Boolean) this.shouldSendToBackgroundThread$delegate.getValue()).booleanValue();
    }

    public final void u() {
        m92.d dVar = this.toastContainer;
        if (dVar != null) {
            if (!this.padForStatusBar) {
                dVar.setPaddingRelative(dVar.getPaddingStart(), 0, dVar.getPaddingEnd(), dVar.getPaddingBottom());
            } else {
                dVar.setPaddingRelative(dVar.getPaddingStart(), k3.k0(this), dVar.getPaddingEnd(), dVar.getPaddingBottom());
            }
        }
    }

    public final void v() {
        if (t()) {
            kotlin.jvm.internal.j.z(q(), null, null, new o(null, this), 3);
        } else {
            getDauManager().a(this, getPinalytics().p());
        }
    }
}
