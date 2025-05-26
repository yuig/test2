package sf2;

import kh2.d1;
import kh2.j2;
import kh2.n0;
import kh2.t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f112851g;

    /* renamed from: a, reason: collision with root package name */
    public final p f112852a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f112853b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112854c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112855d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f112856e;

    /* renamed from: f, reason: collision with root package name */
    public Object f112857f;

    static {
        d0 d0Var = new d0(l.class, "featureModule", "getFeatureModule()Lio/embrace/android/embracesdk/internal/injection/FeatureModule;", 0);
        l0 l0Var = k0.f80436a;
        f112851g = new u[]{l0Var.g(d0Var), a.c.l(l.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var), a.c.l(l.class, "appFramework", "getAppFramework()Lio/embrace/android/embracesdk/internal/payload/AppFramework;", 0, l0Var)};
    }

    public l(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112852a = sdkCallChecker;
        this.f112853b = ((d1) bootstrapper.f79550b).f79455a;
        this.f112854c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 24));
        this.f112855d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 25));
        this.f112856e = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 23));
    }

    public final t0 a() {
        return (t0) this.f112854c.a(this, f112851g[0]);
    }
}
