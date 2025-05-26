package sf2;

import di2.n;
import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f112844d;

    /* renamed from: a, reason: collision with root package name */
    public final p f112845a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f112846b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112847c;

    static {
        d0 d0Var = new d0(j.class, "sessionPropertiesService", "getSessionPropertiesService()Lio/embrace/android/embracesdk/internal/capture/session/SessionPropertiesService;", 0);
        l0 l0Var = k0.f80436a;
        f112844d = new u[]{l0Var.g(d0Var), a.c.l(j.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var)};
    }

    public j(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112845a = sdkCallChecker;
        this.f112846b = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 21));
        this.f112847c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 20));
    }

    public final void a(boolean z13) {
        if (this.f112845a.e("end_session")) {
            di2.c cVar = (di2.c) this.f112847c.a(this, f112844d[1]);
            if (cVar != null) {
                di2.j jVar = (di2.j) cVar;
                long now = jVar.f55090b.now();
                di2.j.b(jVar, n.END_MANUAL, new di2.f(jVar, now, 0), new di2.e(jVar, now, 1), new di2.g(jVar, 0), z13, null, 32);
            }
        }
    }
}
