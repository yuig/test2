package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y2 implements v2 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79750l;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79751a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79752b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79753c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79754d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79755e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79756f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79757g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79758h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f79759i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f79760j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f79761k;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(y2.class, "rnBundleIdTracker", "getRnBundleIdTracker()Lio/embrace/android/embracesdk/internal/capture/metadata/RnBundleIdTracker;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79750l = new rl2.u[]{l0Var.g(d0Var), a.c.l(y2.class, "sessionPayloadSource", "getSessionPayloadSource()Lio/embrace/android/embracesdk/internal/envelope/session/SessionPayloadSourceImpl;", 0, l0Var), a.c.l(y2.class, "logPayloadSource", "getLogPayloadSource()Lio/embrace/android/embracesdk/internal/envelope/log/LogPayloadSourceImpl;", 0, l0Var), a.c.l(y2.class, "sessionEnvelopeSource", "getSessionEnvelopeSource()Lio/embrace/android/embracesdk/internal/envelope/session/SessionEnvelopeSource;", 0, l0Var), a.c.l(y2.class, "logEnvelopeSource", "getLogEnvelopeSource()Lio/embrace/android/embracesdk/internal/envelope/log/LogEnvelopeSource;", 0, l0Var), a.c.l(y2.class, "deviceArchitecture", "getDeviceArchitecture()Lio/embrace/android/embracesdk/internal/DeviceArchitecture;", 0, l0Var), a.c.l(y2.class, "hostedSdkVersionInfo", "getHostedSdkVersionInfo()Lio/embrace/android/embracesdk/internal/envelope/metadata/HostedSdkVersionInfo;", 0, l0Var), a.c.l(y2.class, "resourceSource", "getResourceSource()Lio/embrace/android/embracesdk/internal/envelope/resource/EnvelopeResourceSourceImpl;", 0, l0Var), a.c.l(y2.class, "metadataSource", "getMetadataSource()Lio/embrace/android/embracesdk/internal/envelope/metadata/EnvelopeMetadataSourceImpl;", 0, l0Var), a.c.l(y2.class, "metadataService", "getMetadataService()Lio/embrace/android/embracesdk/internal/capture/metadata/MetadataService;", 0, l0Var), a.c.l(y2.class, "payloadResurrectionService", "getPayloadResurrectionService()Lio/embrace/android/embracesdk/internal/resurrection/PayloadResurrectionService;", 0, l0Var)};
    }

    public y2(b1 initModule, o coreModule, l3 workerThreadModule, h3 systemServiceModule, a androidServicesModule, o0 essentialServiceModule, k configModule, Function0 nativeSymbolsProvider, q2 otelModule, Function0 otelPayloadMapperProvider, h0 deliveryModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(nativeSymbolsProvider, "nativeSymbolsProvider");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(otelPayloadMapperProvider, "otelPayloadMapperProvider");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        j1.v0 v0Var = new j1.v0(coreModule, configModule, androidServicesModule, workerThreadModule, 29);
        g1 g1Var = g1.LAZY;
        this.f79751a = new c0(g1Var, v0Var);
        this.f79752b = new c0(g1Var, new q4.h(nativeSymbolsProvider, (Object) otelModule, (Object) otelPayloadMapperProvider, (Object) essentialServiceModule, (Object) initModule, 26));
        this.f79753c = new c0(g1Var, new z(otelModule, 3));
        this.f79754d = new c0(g1Var, new w2(this, 1));
        this.f79755e = new c0(g1Var, new fe2.a(22, this, deliveryModule));
        this.f79756f = new c0(g1Var, g.f79509w);
        this.f79757g = new c0(g1Var, new fe2.a(21, androidServicesModule, configModule));
        this.f79758h = new c0(g1Var, new x2(this, coreModule, configModule, systemServiceModule, androidServicesModule, workerThreadModule, initModule));
        this.f79759i = new c0(g1Var, new c2(essentialServiceModule, 3));
        this.f79760j = new c0(g1Var, new x2(coreModule, configModule, androidServicesModule, workerThreadModule, initModule, this, systemServiceModule));
        this.f79761k = new c0(g1Var, new jg2.h(deliveryModule, configModule, initModule, 18));
    }

    public final nf2.b a() {
        return (nf2.b) this.f79756f.a(this, f79750l[5]);
    }

    public final fh2.c b() {
        return (fh2.c) this.f79757g.a(this, f79750l[6]);
    }
}
