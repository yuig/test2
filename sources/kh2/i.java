package kh2;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79516i;

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f79517a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79518b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79519c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79520d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79521e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79522f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79523g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79524h;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(i.class, "anrService", "getAnrService()Lio/embrace/android/embracesdk/internal/anr/AnrService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79516i = new rl2.u[]{l0Var.g(d0Var), a.c.l(i.class, "anrOtelMapper", "getAnrOtelMapper()Lio/embrace/android/embracesdk/internal/anr/AnrOtelMapper;", 0, l0Var), a.c.l(i.class, "looper", "getLooper()Landroid/os/Looper;", 0, l0Var), a.c.l(i.class, AnimatedTarget.PROPERTY_STATE, "getState()Lio/embrace/android/embracesdk/internal/anr/detection/ThreadMonitoringState;", 0, l0Var), a.c.l(i.class, "targetThreadHandler", "getTargetThreadHandler()Lio/embrace/android/embracesdk/internal/anr/detection/TargetThreadHandler;", 0, l0Var), a.c.l(i.class, "blockedThreadDetector", "getBlockedThreadDetector()Lio/embrace/android/embracesdk/internal/anr/detection/BlockedThreadDetector;", 0, l0Var), a.c.l(i.class, "livenessCheckScheduler", "getLivenessCheckScheduler()Lio/embrace/android/embracesdk/internal/anr/detection/LivenessCheckScheduler;", 0, l0Var)};
    }

    public i(b1 initModule, sg2.a configService, l3 workerModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(workerModule, "workerModule");
        this.f79517a = ((m3) workerModule).a(ki2.g.f79810b);
        f fVar = new f(configService, this, initModule, 1);
        g1 g1Var = g1.LAZY;
        this.f79518b = new c0(g1Var, fVar);
        this.f79519c = new c0(g1Var, new f(configService, this, initModule, 0));
        this.f79520d = new c0(g1Var, g.f79496j);
        this.f79521e = new c0(g1Var, new h(initModule, 0));
        this.f79522f = new c0(g1Var, new fe2.a(8, this, initModule));
        this.f79523g = new c0(g1Var, new f(configService, initModule, this));
        this.f79524h = new c0(g1Var, new f(configService, this, initModule, 3));
    }

    public final of2.b a() {
        return (of2.b) this.f79518b.a(this, f79516i[0]);
    }
}
