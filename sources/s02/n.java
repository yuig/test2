package s02;

import ao2.j0;
import com.pinterest.feature.unauth.sba.q0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import o82.i0;
import o82.i2;
import o82.s0;
import w41.q1;

/* loaded from: classes4.dex */
public final class n extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final nu.b f110329c;

    /* renamed from: d, reason: collision with root package name */
    public final o02.a f110330d;

    /* renamed from: e, reason: collision with root package name */
    public final y f110331e;

    /* renamed from: f, reason: collision with root package name */
    public final g01.a f110332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j0 scope, nu.b navigationSEP, o02.a rvcService) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(rvcService, "rvcService");
        this.f110329c = navigationSEP;
        this.f110330d = rvcService;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(16), new q0(4), new s0(new i90.i(rvcService)), false, null, null, null, null, "RVC_SECTION_ID", null, 752);
        g01.a d2 = pVar.d();
        this.f110332f = d2;
        a0 a0Var = new a0(scope);
        tx0.x stateTransformer = new tx0.x((i0) d2.f63224a, 6);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f110331e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f110331e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f110331e.e();
    }

    public final void h(boolean z13) {
        y.i(this.f110331e, new p02.u(z13, null, new o82.j0(e0.b(new i2(new p02.f(null, z13), 2)))), false, new ex1.n(this, 25), 2);
    }
}
