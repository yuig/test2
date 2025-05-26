package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b3 implements z2 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79440h;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79441a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79442b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79443c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79444d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79445e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79446f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79447g;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(b3.class, "gatingService", "getGatingService()Lio/embrace/android/embracesdk/internal/gating/GatingService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79440h = new rl2.u[]{l0Var.g(d0Var), a.c.l(b3.class, "memoryCleanerService", "getMemoryCleanerService()Lio/embrace/android/embracesdk/internal/session/MemoryCleanerService;", 0, l0Var), a.c.l(b3.class, "payloadMessageCollator", "getPayloadMessageCollator()Lio/embrace/android/embracesdk/internal/session/message/PayloadMessageCollatorImpl;", 0, l0Var), a.c.l(b3.class, "payloadFactory", "getPayloadFactory()Lio/embrace/android/embracesdk/internal/session/message/PayloadFactory;", 0, l0Var), a.c.l(b3.class, "boundaryDelegate", "getBoundaryDelegate()Lio/embrace/android/embracesdk/internal/session/orchestrator/OrchestratorBoundaryDelegate;", 0, l0Var), a.c.l(b3.class, "sessionSpanAttrPopulator", "getSessionSpanAttrPopulator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionSpanAttrPopulator;", 0, l0Var), a.c.l(b3.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var)};
    }

    public b3(b1 initModule, q2 openTelemetryModule, a androidServicesModule, o0 essentialServiceModule, k configModule, h0 deliveryModule, d0 dataSourceModule, v2 payloadSourceModule, jg2.d startupService, h1 logModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        Intrinsics.checkNotNullParameter(dataSourceModule, "dataSourceModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(startupService, "startupService");
        Intrinsics.checkNotNullParameter(logModule, "logModule");
        fe2.a aVar = new fe2.a(24, configModule, logModule);
        g1 g1Var = g1.LAZY;
        this.f79441a = new c0(g1Var, aVar);
        this.f79442b = new c0(g1Var, new h(initModule, 1));
        this.f79443c = new c0(g1Var, new a3(androidServicesModule, openTelemetryModule, this, payloadSourceModule));
        this.f79444d = new c0(g1Var, new a3(initModule, this, payloadSourceModule, configModule, 0));
        this.f79445e = new c0(g1Var, new fe2.a(23, this, essentialServiceModule));
        this.f79446f = new c0(g1Var, new a3(openTelemetryModule, startupService, logModule, payloadSourceModule));
        this.f79447g = new c0(g1.EAGER, new w01.t(essentialServiceModule, initModule, configModule, this, deliveryModule, dataSourceModule, openTelemetryModule, 4));
    }

    public final di2.c a() {
        return (di2.c) this.f79447g.a(this, f79440h[6]);
    }
}
