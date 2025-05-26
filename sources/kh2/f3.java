package kh2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f3 implements d3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79492d;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79493a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79494b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79495c;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(f3.class, "storageService", "getStorageService()Lio/embrace/android/embracesdk/internal/storage/StorageService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79492d = new rl2.u[]{l0Var.g(d0Var), a.c.l(f3.class, "cacheService", "getCacheService()Lio/embrace/android/embracesdk/internal/comms/delivery/CacheService;", 0, l0Var), a.c.l(f3.class, "deliveryCacheManager", "getDeliveryCacheManager()Lio/embrace/android/embracesdk/internal/comms/delivery/DeliveryCacheManager;", 0, l0Var)};
    }

    public f3(b1 initModule, o coreModule, l3 workerThreadModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        b bVar = new b(coreModule, initModule, 4);
        g1 g1Var = g1.LAZY;
        this.f79493a = new c0(g1Var, bVar);
        this.f79494b = new c0(g1Var, new fe2.a(25, this, initModule));
        this.f79495c = new c0(g1Var, new fe2.a(26, this, workerThreadModule));
        ((m3) workerThreadModule).a(ki2.g.f79812d).a(new e3(this, 0), 1L, TimeUnit.MINUTES);
    }

    public final fi2.b a() {
        return (fi2.b) this.f79493a.a(this, f79492d[0]);
    }
}
