package sf2;

import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f112834e;

    /* renamed from: a, reason: collision with root package name */
    public final p f112835a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f112836b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112837c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112838d;

    static {
        d0 d0Var = new d0(h.class, "configService", "getConfigService()Lio/embrace/android/embracesdk/internal/config/ConfigService;", 0);
        l0 l0Var = k0.f80436a;
        f112834e = new u[]{l0Var.g(d0Var), a.c.l(h.class, "networkLoggingService", "getNetworkLoggingService()Lio/embrace/android/embracesdk/internal/network/logging/NetworkLoggingService;", 0, l0Var), a.c.l(h.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var)};
    }

    public h(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112835a = sdkCallChecker;
        this.f112836b = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 14));
        this.f112837c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 15));
        this.f112838d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 16));
    }
}
