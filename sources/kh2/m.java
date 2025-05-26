package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79607g;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79608a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79609b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79610c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79611d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79612e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79613f;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(m.class, "okHttpClient", "getOkHttpClient()Lokhttp3/OkHttpClient;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79607g = new rl2.u[]{l0Var.g(d0Var), a.c.l(m.class, "combinedRemoteConfigSource", "getCombinedRemoteConfigSource()Lio/embrace/android/embracesdk/internal/config/source/CombinedRemoteConfigSource;", 0, l0Var), a.c.l(m.class, "configService", "getConfigService()Lio/embrace/android/embracesdk/internal/config/ConfigService;", 0, l0Var), a.c.l(m.class, "remoteConfigSource", "getRemoteConfigSource()Lio/embrace/android/embracesdk/internal/config/source/OkHttpRemoteConfigSource;", 0, l0Var), a.c.l(m.class, "remoteConfigStore", "getRemoteConfigStore()Lio/embrace/android/embracesdk/internal/config/store/RemoteConfigStore;", 0, l0Var), a.c.l(m.class, "urlBuilder", "getUrlBuilder()Lio/embrace/android/embracesdk/internal/comms/api/ApiUrlBuilder;", 0, l0Var)};
    }

    public m(b1 initModule, o coreModule, q2 openTelemetryModule, l3 workerThreadModule, a androidServicesModule, th2.g framework) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(framework, "framework");
        l lVar = l.f79584i;
        g1 g1Var = g1.LAZY;
        this.f79608a = new c0(g1Var, lVar);
        this.f79609b = new c0(g1Var, new jg2.h(this, initModule, workerThreadModule, 5));
        this.f79610c = new c0(g1Var, new q4.h(openTelemetryModule, androidServicesModule, framework, initModule, this, 12));
        this.f79611d = new c0(g1Var, new fe2.a(9, this, initModule));
        this.f79612e = new c0(g1Var, new b(initModule, coreModule));
        this.f79613f = new c0(g1Var, new j1.v0(this, initModule, androidServicesModule, coreModule, 22));
    }

    public static final boolean a(m mVar, b1 b1Var) {
        mVar.getClass();
        return ((d1) b1Var).f79461g.getProject().getAppId() == null;
    }

    public final sg2.a b() {
        return (sg2.a) this.f79610c.a(this, f79607g[2]);
    }

    public final pg2.k c() {
        return (pg2.k) this.f79613f.a(this, f79607g[5]);
    }
}
