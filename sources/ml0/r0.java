package ml0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import o82.j3;
import o82.t1;

/* loaded from: classes5.dex */
public final class r0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final tu.d0 f87495c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f87496d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f87497e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f87498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v60.d boardHeaderImagePageLoader, tu.d0 boardHeaderImageSEP, zy.d0 pinalyticsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(boardHeaderImagePageLoader, "boardHeaderImagePageLoader");
        Intrinsics.checkNotNullParameter(boardHeaderImageSEP, "boardHeaderImageSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f87495c = boardHeaderImageSEP;
        this.f87496d = pinalyticsSEP;
        kv0.p pVar = new kv0.p(4);
        int i13 = 2;
        kv0.p.b(pVar, new h90.g0(1001, 2), new ns.n0(15), new j3(kotlin.collections.e0.b(new n0())), false, t1.a(), null, null, null, null, null, 1000);
        kv0.p.b(pVar, new h90.g0(1002, 2), new ns.n0(16), new j3(kotlin.collections.e0.b(new o0())), false, t1.a(), null, null, null, null, null, 1000);
        kv0.p.b(pVar, new h90.g0(1000, 2), new ns.n0(17), new j3(kotlin.collections.e0.b(new p0())), false, t1.a(), null, null, null, null, null, 1000);
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(5), new ns.n0(18), new o82.s0(boardHeaderImagePageLoader, new nl0.n()), false, t1.b(), null, null, new m90.z(i13), null, null, 872);
        kv0.p.b(pVar, new h90.g0(1004, 2), new ns.n0(19), new j3(kotlin.collections.e0.b(new q0())), true, t1.a(), null, null, null, null, null, 992);
        g01.a d2 = pVar.d();
        this.f87497e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        l0 stateTransformer = new l0((o82.i0) d2.f63224a, new lt.j(i13));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f87498f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f87498f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f87498f.e();
    }

    public final void h(h32.i0 loggingContext, String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Object obj = null;
        int i13 = 3;
        l82.y.i(this.f87498f, new m0(boardId, new o82.j0(kotlin.collections.f0.j(new i2(obj, i13), new i2(obj, i13), new i2(obj, i13), new i2(new nl0.a(boardId), 2), new i2(obj, i13))), new zy.l0(loggingContext, 2), null, 1, null), false, new kl0.t(this, i13), 2);
    }
}
