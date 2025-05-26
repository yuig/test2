package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.r2 f90793a;

    /* renamed from: b, reason: collision with root package name */
    public final l82.y f90794b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f90795c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f90796d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f90797e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f90798f;

    /* renamed from: g, reason: collision with root package name */
    public final q2 f90799g;

    public s2(ao2.j0 scope, lh0.r2 experiments, l82.y engine, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f90793a = experiments;
        this.f90794b = engine;
        this.f90795c = xk2.m.b(new i2.j2(7, pinalytics, this));
        xk2.v b13 = xk2.m.b(new r2(this, 2));
        this.f90796d = b13;
        int i13 = 0;
        this.f90797e = xk2.m.b(new r2(this, i13));
        this.f90798f = xk2.m.b(new r2(this, 1));
        this.f90799g = new q2(this, i13);
        if (((Boolean) b13.getValue()).booleanValue()) {
            ko2.f fVar = ao2.v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c.m(1, null), null, new p2(this, null), 2);
        }
    }

    public static final int a(s2 s2Var) {
        lh0.r2 r2Var = s2Var.f90793a;
        if (r2Var.c0("enabled_250") || ((Boolean) s2Var.f90797e.getValue()).booleanValue() || r2Var.c0("employees")) {
            return 250;
        }
        if (r2Var.c0("enabled_1000")) {
            return 1000;
        }
        r2Var.c0("enabled_max");
        return Integer.MAX_VALUE;
    }
}
