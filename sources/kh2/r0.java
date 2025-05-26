package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 implements o0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79668m;

    /* renamed from: a, reason: collision with root package name */
    public final xk2.v f79669a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f79670b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79671c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79672d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79673e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79674f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79675g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79676h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f79677i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f79678j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f79679k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f79680l;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(r0.class, "processStateService", "getProcessStateService()Lio/embrace/android/embracesdk/internal/session/lifecycle/ProcessStateService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79668m = new rl2.u[]{l0Var.g(d0Var), a.c.l(r0.class, "activityLifecycleTracker", "getActivityLifecycleTracker()Lio/embrace/android/embracesdk/internal/session/lifecycle/ActivityLifecycleTracker;", 0, l0Var), a.c.l(r0.class, "userService", "getUserService()Lio/embrace/android/embracesdk/internal/capture/user/UserService;", 0, l0Var), a.c.l(r0.class, "networkConnectivityService", "getNetworkConnectivityService()Lio/embrace/android/embracesdk/internal/capture/connectivity/NetworkConnectivityService;", 0, l0Var), a.c.l(r0.class, "pendingApiCallsSender", "getPendingApiCallsSender()Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCallsSender;", 0, l0Var), a.c.l(r0.class, "apiService", "getApiService()Lio/embrace/android/embracesdk/internal/comms/api/ApiService;", 0, l0Var), a.c.l(r0.class, "apiClient", "getApiClient()Lio/embrace/android/embracesdk/internal/comms/api/ApiClient;", 0, l0Var), a.c.l(r0.class, "sessionIdTracker", "getSessionIdTracker()Lio/embrace/android/embracesdk/internal/session/id/SessionIdTracker;", 0, l0Var), a.c.l(r0.class, "sessionPropertiesService", "getSessionPropertiesService()Lio/embrace/android/embracesdk/internal/capture/session/SessionPropertiesService;", 0, l0Var), a.c.l(r0.class, "logWriter", "getLogWriter()Lio/embrace/android/embracesdk/internal/arch/destination/LogWriter;", 0, l0Var)};
    }

    public r0(b1 initModule, k configModule, q2 openTelemetryModule, o coreModule, l3 workerThreadModule, h3 systemServiceModule, a androidServicesModule, d3 storageModule, Function0 lifecycleOwnerProvider, Function0 networkConnectivityServiceProvider) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(lifecycleOwnerProvider, "lifecycleOwnerProvider");
        Intrinsics.checkNotNullParameter(networkConnectivityServiceProvider, "networkConnectivityServiceProvider");
        int i13 = 0;
        this.f79669a = xk2.m.b(new p0(configModule, i13));
        c cVar = (c) androidServicesModule;
        this.f79670b = xk2.m.b(new k0(cVar.a(), 1));
        q0 q0Var = new q0(lifecycleOwnerProvider, initModule, i13);
        g1 g1Var = g1.LAZY;
        this.f79671c = new c0(g1Var, q0Var);
        this.f79672d = new c0(g1Var, new b(coreModule, initModule, 2));
        this.f79673e = new c0(g1Var, new fe2.a(13, cVar, initModule));
        this.f79674f = new c0(g1Var, new q4.h(networkConnectivityServiceProvider, (Object) coreModule, (Object) workerThreadModule, (Object) initModule, (Object) systemServiceModule, 18));
        this.f79675g = new c0(g1Var, new jg2.h(workerThreadModule, storageModule, initModule, 11));
        this.f79676h = new c0(g1Var, new j1.v0(this, initModule, workerThreadModule, configModule, 25));
        this.f79677i = new c0(g1Var, g.f79498l);
        this.f79678j = new c0(g1Var, new fe2.a(12, systemServiceModule, initModule));
        this.f79679k = new c0(g1Var, new jg2.h(cVar, this, openTelemetryModule, 12));
        this.f79680l = new c0(g1Var, new jg2.h(openTelemetryModule, this, initModule, 10));
    }

    public final bi2.b a() {
        return (bi2.b) this.f79672d.a(this, f79668m[1]);
    }

    public final vf2.b b() {
        return (vf2.b) this.f79680l.a(this, f79668m[9]);
    }

    public final bg2.c c() {
        return (bg2.c) this.f79674f.a(this, f79668m[3]);
    }

    public final bi2.h d() {
        return (bi2.h) this.f79671c.a(this, f79668m[0]);
    }

    public final ai2.b e() {
        return (ai2.b) this.f79678j.a(this, f79668m[7]);
    }

    public final ig2.b f() {
        return (ig2.b) this.f79679k.a(this, f79668m[8]);
    }
}
