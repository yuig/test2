package n60;

import android.app.Application;
import ao2.i0;
import ao2.j0;
import ao2.k2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class j implements xf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Application f89259a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f89260b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f89261c;

    /* renamed from: d, reason: collision with root package name */
    public k2 f89262d;

    /* renamed from: e, reason: collision with root package name */
    public k2 f89263e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f89264f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f89265g;

    public j(Application application, j0 applicationScope, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f89259a = application;
        this.f89260b = applicationScope;
        this.f89261c = crashReporting;
        this.f89264f = xk2.m.b(new h(this, 0));
        this.f89265g = xk2.m.b(new h(this, 1));
    }

    @Override // xf0.a
    public final void a() {
        j0 j0Var = this.f89260b;
        this.f89262d = kotlin.jvm.internal.j.z(j0Var, j0Var.getCoroutineContext().plus(new i0("ColdStartCompleted")), null, new d(this, null), 2);
        j0 j0Var2 = this.f89260b;
        this.f89263e = kotlin.jvm.internal.j.z(j0Var2, j0Var2.getCoroutineContext().plus(new i0("ColdStartCompletedLow")), null, new g(this, null), 2);
        l0.f82619b = new dv.a(19, new i(this, 1));
    }

    @Override // xf0.a
    public final boolean b() {
        k2 k2Var;
        k2 k2Var2 = this.f89262d;
        return k2Var2 != null && k2Var2.isCompleted() && (k2Var = this.f89263e) != null && k2Var.isCompleted();
    }

    @Override // xf0.a
    public final void c() {
    }
}
