package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 implements h1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79531h;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79532a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79533b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79534c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79535d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79536e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79537f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79538g;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(i1.class, "networkCaptureService", "getNetworkCaptureService()Lio/embrace/android/embracesdk/internal/network/logging/NetworkCaptureService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79531h = new rl2.u[]{l0Var.g(d0Var), a.c.l(i1.class, "networkCaptureDataSource", "getNetworkCaptureDataSource()Lio/embrace/android/embracesdk/internal/network/logging/NetworkCaptureDataSource;", 0, l0Var), a.c.l(i1.class, "embraceDomainCountLimiter", "getEmbraceDomainCountLimiter()Lio/embrace/android/embracesdk/internal/network/logging/EmbraceDomainCountLimiter;", 0, l0Var), a.c.l(i1.class, "networkLoggingService", "getNetworkLoggingService()Lio/embrace/android/embracesdk/internal/network/logging/NetworkLoggingService;", 0, l0Var), a.c.l(i1.class, "logService", "getLogService()Lio/embrace/android/embracesdk/internal/logs/LogService;", 0, l0Var), a.c.l(i1.class, "logOrchestrator", "getLogOrchestrator()Lio/embrace/android/embracesdk/internal/logs/LogOrchestrator;", 0, l0Var), a.c.l(i1.class, "attachmentService", "getAttachmentService()Lio/embrace/android/embracesdk/internal/logs/attachments/AttachmentService;", 0, l0Var)};
    }

    public i1(b1 initModule, q2 openTelemetryModule, a androidServicesModule, o0 essentialServiceModule, k configModule, h0 deliveryModule, l3 workerThreadModule, v2 payloadSourceModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        q4.h hVar = new q4.h(essentialServiceModule, androidServicesModule, configModule, initModule, this, 23);
        g1 g1Var = g1.LAZY;
        this.f79532a = new c0(g1Var, hVar);
        this.f79533b = new c0(g1Var, new fe2.a(16, essentialServiceModule, initModule));
        this.f79534c = new c0(g1Var, new p0(configModule, 1));
        this.f79535d = new c0(g1Var, new fe2.a(17, this, openTelemetryModule));
        this.f79536e = new c0(g1Var, new jg2.h(essentialServiceModule, configModule, deliveryModule, 15));
        this.f79537f = new c0(g1Var, new q4.h(workerThreadModule, initModule, openTelemetryModule, deliveryModule, payloadSourceModule, 22));
        this.f79538g = new c0(g1Var, g.f79500n);
    }

    public final mh2.m a() {
        return (mh2.m) this.f79536e.a(this, f79531h[4]);
    }
}
