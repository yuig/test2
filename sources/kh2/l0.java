package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements h0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79585m;

    /* renamed from: a, reason: collision with root package name */
    public final z f79586a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79587b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79588c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79589d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79590e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79591f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79592g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79593h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f79594i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f79595j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f79596k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f79597l;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(l0.class, "payloadStore", "getPayloadStore()Lio/embrace/android/embracesdk/internal/session/orchestrator/PayloadStore;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79585m = new rl2.u[]{l0Var.g(d0Var), a.c.l(l0.class, "deliveryService", "getDeliveryService()Lio/embrace/android/embracesdk/internal/comms/delivery/DeliveryService;", 0, l0Var), a.c.l(l0.class, "dataPersistenceWorker", "getDataPersistenceWorker()Lio/embrace/android/embracesdk/internal/worker/PriorityWorker;", 0, l0Var), a.c.l(l0.class, "intakeService", "getIntakeService()Lio/embrace/android/embracesdk/internal/delivery/intake/IntakeService;", 0, l0Var), a.c.l(l0.class, "periodicSessionCacher", "getPeriodicSessionCacher()Lio/embrace/android/embracesdk/internal/session/caching/PeriodicSessionCacher;", 0, l0Var), a.c.l(l0.class, "payloadCachingService", "getPayloadCachingService()Lio/embrace/android/embracesdk/internal/delivery/caching/PayloadCachingService;", 0, l0Var), a.c.l(l0.class, "payloadStorageService", "getPayloadStorageService()Lio/embrace/android/embracesdk/internal/delivery/storage/PayloadStorageService;", 0, l0Var), a.c.l(l0.class, "cacheStorageService", "getCacheStorageService()Lio/embrace/android/embracesdk/internal/delivery/storage/PayloadStorageService;", 0, l0Var), a.c.l(l0.class, "cachedLogEnvelopeStore", "getCachedLogEnvelopeStore()Lio/embrace/android/embracesdk/internal/delivery/storage/CachedLogEnvelopeStore;", 0, l0Var), a.c.l(l0.class, "requestExecutionService", "getRequestExecutionService()Lio/embrace/android/embracesdk/internal/delivery/execution/RequestExecutionService;", 0, l0Var), a.c.l(l0.class, "schedulingService", "getSchedulingService()Lio/embrace/android/embracesdk/internal/delivery/scheduling/SchedulingService;", 0, l0Var)};
    }

    public l0(k configModule, b1 initModule, q2 otelModule, l3 workerThreadModule, o coreModule, d3 storageModule, o0 essentialServiceModule, a androidServicesModule, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        this.f79586a = new z(otelModule, 1);
        j0 j0Var = new j0(configModule, this, initModule, workerThreadModule);
        g1 g1Var = g1.LAZY;
        this.f79587b = new c0(g1Var, j0Var);
        this.f79588c = new c0(g1Var, new q4.h(function04, (Object) configModule, (Object) storageModule, (Object) essentialServiceModule, (Object) initModule, 16));
        this.f79589d = new c0(g1Var, new nd2.a(workerThreadModule, 26));
        this.f79590e = new c0(g1Var, new jg2.h(configModule, this, initModule, 9));
        this.f79591f = new c0(g1Var, new e0(workerThreadModule, initModule, 1));
        this.f79592g = new c0(g1Var, new j1.v0(configModule, this, initModule, essentialServiceModule, 24));
        this.f79593h = new c0(g1Var, new i0(function02, configModule, coreModule, initModule, this, 1));
        this.f79594i = new c0(g1Var, new i0(function03, configModule, coreModule, initModule, this, 0));
        this.f79595j = new c0(g1Var, new j1.v0(configModule, coreModule, initModule, this, 23));
        this.f79596k = new c0(g1Var, new q4.h(function0, (Object) configModule, (Object) androidServicesModule, (Object) initModule, (Object) this, 17));
        this.f79597l = new c0(g1Var, new j0(configModule, this, workerThreadModule, initModule));
    }

    public static final ki2.e a(l0 l0Var) {
        return (ki2.e) l0Var.f79589d.a(l0Var, f79585m[2]);
    }

    public final di2.b b() {
        return (di2.b) this.f79587b.a(this, f79585m[0]);
    }
}
