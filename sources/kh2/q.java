package kh2;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements o {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79651g;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79652a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79653b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79654c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79655d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79656e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f79657f;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(q.class, "context", "getContext()Landroid/content/Context;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79651g = new rl2.u[]{l0Var.g(d0Var), a.c.l(q.class, "packageVersionInfo", "getPackageVersionInfo()Lio/embrace/android/embracesdk/internal/injection/PackageVersionInfo;", 0, l0Var), a.c.l(q.class, "application", "getApplication()Landroid/app/Application;", 0, l0Var), a.c.l(q.class, "serviceRegistry", "getServiceRegistry()Lio/embrace/android/embracesdk/internal/registry/ServiceRegistry;", 0, l0Var), a.c.l(q.class, "resources", "getResources()Lio/embrace/android/embracesdk/internal/AndroidResourcesService;", 0, l0Var)};
    }

    public q(Context ctx, b1 initModule) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        em1.k kVar = new em1.k(ctx, 21);
        g1 g1Var = g1.LAZY;
        this.f79652a = new c0(g1Var, kVar);
        this.f79653b = new c0(g1Var, new p(this, 2));
        this.f79654c = new c0(g1Var, new p(this, 0));
        this.f79655d = new c0(g1Var, g.f79497k);
        this.f79656e = new c0(g1Var, new p(this, 3));
        xk2.m.b(new p(this, 1));
        this.f79657f = xk2.m.b(new fe2.a(10, initModule, this));
    }

    public final Application a() {
        return (Application) this.f79654c.a(this, f79651g[2]);
    }

    public final Context b() {
        Object a13 = this.f79652a.a(this, f79651g[0]);
        Intrinsics.checkNotNullExpressionValue(a13, "<get-context>(...)");
        return (Context) a13;
    }
}
