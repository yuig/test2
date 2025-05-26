package sf2;

import kh2.d1;
import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f112807e;

    /* renamed from: a, reason: collision with root package name */
    public final p f112808a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f112809b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112810c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112811d;

    static {
        d0 d0Var = new d0(b.class, "breadcrumbDataSource", "getBreadcrumbDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0);
        l0 l0Var = k0.f80436a;
        f112807e = new u[]{l0Var.g(d0Var), a.c.l(b.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var)};
    }

    public b(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112808a = sdkCallChecker;
        this.f112809b = ((d1) bootstrapper.f79550b).f79455a;
        this.f112810c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 0));
        this.f112811d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 1));
    }
}
