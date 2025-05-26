package lf2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ei2.n;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.d1;
import kh2.f1;
import kh2.j2;
import kh2.n0;
import kh2.q2;
import kh2.s2;
import kh2.t0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import net.quikkly.android.utils.BitmapUtils;
import nf2.k;
import rl2.u;
import sf2.l;
import xk2.m;
import xk2.q;
import xk2.s;
import xk2.v;

/* loaded from: classes4.dex */
public final class i implements rf2.a, k {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u[] f83149w;

    /* renamed from: a, reason: collision with root package name */
    public final j2 f83150a;

    /* renamed from: b, reason: collision with root package name */
    public final p f83151b;

    /* renamed from: c, reason: collision with root package name */
    public final sf2.k f83152c;

    /* renamed from: d, reason: collision with root package name */
    public final sf2.j f83153d;

    /* renamed from: e, reason: collision with root package name */
    public final sf2.h f83154e;

    /* renamed from: f, reason: collision with root package name */
    public final sf2.g f83155f;

    /* renamed from: g, reason: collision with root package name */
    public final l f83156g;

    /* renamed from: h, reason: collision with root package name */
    public final sf2.i f83157h;

    /* renamed from: i, reason: collision with root package name */
    public final g01.a f83158i;

    /* renamed from: j, reason: collision with root package name */
    public final sf2.b f83159j;

    /* renamed from: k, reason: collision with root package name */
    public final sf2.e f83160k;

    /* renamed from: l, reason: collision with root package name */
    public final sf2.d f83161l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f83162m;

    /* renamed from: n, reason: collision with root package name */
    public final v f83163n;

    /* renamed from: o, reason: collision with root package name */
    public final v f83164o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f83165p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Application f83166q;

    /* renamed from: r, reason: collision with root package name */
    public f1 f83167r;

    /* renamed from: s, reason: collision with root package name */
    public final n0 f83168s;

    /* renamed from: t, reason: collision with root package name */
    public final n0 f83169t;

    /* renamed from: u, reason: collision with root package name */
    public final n0 f83170u;

    /* renamed from: v, reason: collision with root package name */
    public final n0 f83171v;

    static {
        d0 d0Var = new d0(i.class, "metadataService", "getMetadataService()Lio/embrace/android/embracesdk/internal/capture/metadata/MetadataService;", 0);
        l0 l0Var = k0.f80436a;
        f83149w = new u[]{l0Var.g(d0Var), a.c.l(i.class, "processStateService", "getProcessStateService()Lio/embrace/android/embracesdk/internal/session/lifecycle/ProcessStateService;", 0, l0Var), a.c.l(i.class, "activityLifecycleTracker", "getActivityLifecycleTracker()Lio/embrace/android/embracesdk/internal/session/lifecycle/ActivityTracker;", 0, l0Var), a.c.l(i.class, "anrService", "getAnrService()Lio/embrace/android/embracesdk/internal/anr/AnrService;", 0, l0Var), a.c.l(i.class, "configService", "getConfigService()Lio/embrace/android/embracesdk/internal/config/ConfigService;", 0, l0Var), a.c.l(i.class, "nativeThreadSampler", "getNativeThreadSampler()Lio/embrace/android/embracesdk/internal/anr/ndk/NativeThreadSamplerService;", 0, l0Var), a.c.l(i.class, "nativeThreadSamplerInstaller", "getNativeThreadSamplerInstaller()Lio/embrace/android/embracesdk/internal/anr/ndk/NativeThreadSamplerInstaller;", 0, l0Var)};
    }

    public i() {
        try {
            c0.d.M2("bootstrapper-init");
            j2 bootstrapper = new j2();
            q2 q2Var = bootstrapper.f79551c;
            c0.d.N();
            d1 d1Var = (d1) bootstrapper.f79550b;
            lh2.b logger = d1Var.f79456b;
            d1Var.getClass();
            gi2.a aVar = (gi2.a) d1Var.f79459e.a(d1Var, d1.f79454h[0]);
            Intrinsics.checkNotNullParameter(logger, "logger");
            p sdkCallChecker = new p();
            sdkCallChecker.f80994a = logger;
            sdkCallChecker.f80995b = aVar;
            sdkCallChecker.f80996c = new AtomicBoolean(false);
            sf2.k userApiDelegate = new sf2.k(bootstrapper, sdkCallChecker);
            sf2.j sessionApiDelegate = new sf2.j(bootstrapper, sdkCallChecker);
            sf2.h networkRequestApiDelegate = new sf2.h(bootstrapper, sdkCallChecker);
            sf2.g logsApiDelegate = new sf2.g(bootstrapper, sdkCallChecker);
            l viewTrackingApiDelegate = new l(bootstrapper, sdkCallChecker);
            sf2.i sdkStateApiDelegate = new sf2.i(bootstrapper, sdkCallChecker);
            g01.a otelApiDelegate = new g01.a(bootstrapper, sdkCallChecker);
            sf2.b breadcrumbApiDelegate = new sf2.b(bootstrapper, sdkCallChecker);
            sf2.e webviewApiDelegate = new sf2.e(bootstrapper, sdkCallChecker);
            sf2.d instrumentationApiDelegate = new sf2.d(bootstrapper, sdkCallChecker);
            Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
            Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
            Intrinsics.checkNotNullParameter(userApiDelegate, "userApiDelegate");
            Intrinsics.checkNotNullParameter(sessionApiDelegate, "sessionApiDelegate");
            Intrinsics.checkNotNullParameter(networkRequestApiDelegate, "networkRequestApiDelegate");
            Intrinsics.checkNotNullParameter(logsApiDelegate, "logsApiDelegate");
            Intrinsics.checkNotNullParameter(viewTrackingApiDelegate, "viewTrackingApiDelegate");
            Intrinsics.checkNotNullParameter(sdkStateApiDelegate, "sdkStateApiDelegate");
            Intrinsics.checkNotNullParameter(otelApiDelegate, "otelApiDelegate");
            Intrinsics.checkNotNullParameter(breadcrumbApiDelegate, "breadcrumbApiDelegate");
            Intrinsics.checkNotNullParameter(webviewApiDelegate, "webviewApiDelegate");
            Intrinsics.checkNotNullParameter(instrumentationApiDelegate, "instrumentationApiDelegate");
            this.f83150a = bootstrapper;
            this.f83151b = sdkCallChecker;
            this.f83152c = userApiDelegate;
            this.f83153d = sessionApiDelegate;
            this.f83154e = networkRequestApiDelegate;
            this.f83155f = logsApiDelegate;
            this.f83156g = viewTrackingApiDelegate;
            this.f83157h = sdkStateApiDelegate;
            this.f83158i = otelApiDelegate;
            this.f83159j = breadcrumbApiDelegate;
            this.f83160k = webviewApiDelegate;
            this.f83161l = instrumentationApiDelegate;
            s2 s2Var = (s2) q2Var;
            s2Var.getClass();
            this.f83162m = (n) s2Var.f79698l.a(s2Var, s2.f79686r[2]);
            nf2.l lVar = nf2.f.f90496b;
            nf2.f.f90496b = (ei2.p) ((s2) q2Var).f79699m.getValue();
            nf2.f.f90497c = this;
            e eVar = new e(0, (AtomicBoolean) sdkCallChecker.f80996c, AtomicBoolean.class, "get", "get()Z", 0);
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            nf2.f.f90498d = eVar;
            this.f83163n = m.b(new g(this, 8));
            this.f83164o = m.b(new g(this, 3));
            this.f83165p = new AtomicBoolean(false);
            g provider = new g(this, 4);
            int i13 = 10;
            g startedCheck = new g(this, i13);
            Intrinsics.checkNotNullParameter(startedCheck, "startedCheck");
            Intrinsics.checkNotNullParameter(provider, "provider");
            xk2.n nVar = xk2.n.PUBLICATION;
            m.a(nVar, provider);
            g provider2 = new g(this, 7);
            g startedCheck2 = new g(this, i13);
            Intrinsics.checkNotNullParameter(startedCheck2, "startedCheck");
            Intrinsics.checkNotNullParameter(provider2, "provider");
            m.a(nVar, provider2);
            g provider3 = new g(this, 0);
            g startedCheck3 = new g(this, i13);
            Intrinsics.checkNotNullParameter(startedCheck3, "startedCheck");
            Intrinsics.checkNotNullParameter(provider3, "provider");
            m.a(nVar, provider3);
            this.f83168s = new n0(new g(this, i13), new g(this, 1));
            this.f83169t = new n0(new g(this, i13), new g(this, 2));
            this.f83170u = new n0(new g(this, i13), new g(this, 5));
            this.f83171v = new n0(new g(this, i13), new g(this, 6));
        } finally {
        }
    }

    public static void c(i iVar, Severity severity, String message, Map map, StackTraceElement[] stackTraceElementArr, String str, LogExceptionType logExceptionType, String str2, String str3, LinkedHashMap linkedHashMap, int i13) {
        Map map2 = (i13 & 4) != 0 ? null : map;
        StackTraceElement[] stackTraceElementArr2 = (i13 & 8) != 0 ? null : stackTraceElementArr;
        String str4 = (i13 & 16) != 0 ? null : str;
        LogExceptionType logExceptionType2 = (i13 & 32) != 0 ? LogExceptionType.NONE : logExceptionType;
        String str5 = (i13 & 64) != 0 ? null : str2;
        String str6 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str3;
        Map customLogAttrs = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? z0.d() : linkedHashMap;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExceptionType2, "logExceptionType");
        Intrinsics.checkNotNullParameter(customLogAttrs, "customLogAttrs");
        sf2.g.d(iVar.f83155f, severity, message, map2, stackTraceElementArr2, str4, logExceptionType2, str5, str6, customLogAttrs, null, BitmapUtils.BITMAP_TO_JPEG_SIZE);
    }

    public static boolean k(sg2.a aVar) {
        tg2.e eVar;
        boolean z13 = false;
        if (aVar != null && (eVar = ((sg2.b) aVar).f112877b) != null && ((Boolean) eVar.f117603d.getValue()).booleanValue()) {
            z13 = true;
        }
        return !z13;
    }

    @Override // nf2.k
    public final nf2.g a() {
        f1 f1Var = this.f83167r;
        nf2.g a13 = f1Var != null ? f1Var.a() : null;
        if (a13 != null) {
            return a13;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // rf2.a
    public final void addLoadTraceChildSpan(Activity activity, String name, long j13, long j14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f83161l.addLoadTraceChildSpan(activity, name, j13, j14, attributes, events, errorCode);
    }

    @Override // rf2.a
    public final void addStartupTraceChildSpan(String name, long j13, long j14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f83161l.addStartupTraceChildSpan(name, j13, j14, attributes, events, errorCode);
    }

    public final void b(String message, Severity severity, Map map) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        sf2.g gVar = this.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        sf2.g.d(gVar, severity, message, map, null, null, null, null, null, null, null, 1016);
    }

    public final void d(Pair point, String element, th2.n type) {
        dg2.j jVar;
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(element, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        l lVar = this.f83156g;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(element, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        if (lVar.f112852a.e("log_tap")) {
            t0 a13 = lVar.a();
            if (a13 != null) {
                uf2.d b13 = ((kh2.z0) a13).f79770f.b(kh2.z0.f79764n[4]);
                if (b13 != null && (jVar = (dg2.j) b13.f122121f) != null) {
                    long now = lVar.f112853b.now();
                    Intrinsics.checkNotNullParameter(point, "point");
                    Intrinsics.checkNotNullParameter(element, "element");
                    Intrinsics.checkNotNullParameter(type, "type");
                    jVar.e(uf2.c.f122114k, new dg2.i(jVar, point, element, type, now));
                }
            }
            di2.c cVar = (di2.c) lVar.f112855d.a(lVar, l.f112851g[1]);
            if (cVar != null) {
                ((di2.j) cVar).a();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:36|(5:38|(1:40)(1:221)|41|(4:44|(29:46|(2:48|(2:52|53))(1:217)|56|(1:58)(1:215)|59|(1:61)(1:214)|62|(1:64)(1:213)|(1:66)(1:212)|67|68|(3:70|(1:72)(1:210)|73)(1:211)|(1:75)(1:209)|(1:77)(1:208)|(3:79|(1:81)(1:206)|82)(1:207)|(3:84|(1:86)(1:204)|87)(1:205)|(1:89)(1:203)|(3:91|(1:93)(1:201)|94)(1:202)|95|(3:97|(1:99)(6:101|102|103|(4:105|106|107|108)|111|108)|100)|119|120|(1:122)|123|124|125|(1:127)(1:198)|(2:129|385)|192)(2:218|219)|54|42)|220)|222|120|(0)|123|124|125|(0)(0)|(0)|192) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03c7, code lost:
    
        if (r0 != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0362, code lost:
    
        r0 = r1.matcher(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(io.embrace.android.embracesdk.network.EmbraceNetworkRequest r35) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf2.i.e(io.embrace.android.embracesdk.network.EmbraceNetworkRequest):void");
    }

    public final Object f(String name, oi2.b bVar, Map map, List list, oi2.a autoTerminationMode, Function0 code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f83162m.b(name, bVar, map, list, autoTerminationMode, code);
    }

    public final void g(Context context, a appFramework) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appFramework, "appFramework");
        try {
            c0.d.M2("sdk-start");
            h(context, appFramework);
            c0.d.N();
        } catch (Throwable th3) {
            try {
                q qVar = s.f135225b;
                ((lh2.e) ((lh2.b) this.f83164o.getValue())).b(lh2.g.SDK_START_FAIL, th3);
                Unit unit = Unit.f80348a;
            } catch (Throwable th4) {
                q qVar2 = s.f135225b;
                ue.c.m(th4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.content.Context r28, lf2.a r29) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf2.i.h(android.content.Context, lf2.a):void");
    }

    public final oi2.b i(String name, oi2.b bVar, Long l13, oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return this.f83162m.c(name, bVar, l13, autoTerminationMode);
    }

    public final void j() {
        synchronized (this.f83151b) {
            try {
                if (this.f83165p.compareAndSet(false, true)) {
                    try {
                        q qVar = s.f135225b;
                        Application app = this.f83166q;
                        if (app != null) {
                            Intrinsics.checkNotNullParameter(app, "app");
                            l lVar = this.f83156g;
                            lVar.getClass();
                            Intrinsics.checkNotNullParameter(app, "app");
                            try {
                                Object obj = lVar.f112857f;
                                if (obj != null) {
                                    app.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj);
                                    Unit unit = Unit.f80348a;
                                }
                            } catch (Throwable th3) {
                                q qVar2 = s.f135225b;
                                ue.c.m(th3);
                            }
                        }
                        this.f83166q = null;
                        j2 j2Var = this.f83150a;
                        if (j2Var.N.get() && j2Var.N.get()) {
                            kh2.q qVar3 = (kh2.q) j2Var.d();
                            ((vh2.d) qVar3.f79655d.a(qVar3, kh2.q.f79651g[3])).close();
                            j2Var.m().close();
                            j2Var.N.set(false);
                        }
                        Unit unit2 = Unit.f80348a;
                    } catch (Throwable th4) {
                        q qVar4 = s.f135225b;
                        ue.c.m(th4);
                    }
                }
                Unit unit3 = Unit.f80348a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
