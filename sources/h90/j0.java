package h90;

import android.app.Application;
import com.pinterest.api.model.pi0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import o82.j3;
import o82.s0;
import o82.t1;
import o82.y0;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class j0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final zy.d0 f68264c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f68265d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f68266e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f68267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zy.d0 pinalyticsSEP, w60.d navigationSEP, o12.a collageService, i2 pinRepository, x2 userRepository, Application application, ao2.j0 scope, m60.g0 pageSizeProvider, m7.c dynamicStoryRecyclerViewTypeCalculator, n1 hairballExperiments) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "dynamicStoryRecyclerViewTypeCalculator");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        this.f68264c = pinalyticsSEP;
        this.f68265d = navigationSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new g0(555666777, 0), new ns.n0(4), new j3(kotlin.collections.e0.b(new h0())), false, t1.a(), null, null, null, null, null, 1000);
        xz.b bVar = i90.d.f71777a;
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        int i13 = 1;
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(i13), new ns.n0(3), new o82.h(new i90.a(pinRepository, userRepository)), false, new com.pinterest.boardAutoCollages.l0(17), null, null, null, null, null, 1000);
        s0 s0Var = new s0(new i90.i(collageService), pageSizeProvider);
        Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "dynamicStoryRecyclerViewTypeCalculator");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        int i14 = 2;
        kv0.p.b(pVar, new ns.m0(dynamicStoryRecyclerViewTypeCalculator, i13), new ns.n0(i14), s0Var, false, new com.pinterest.boardAutoCollages.l0(i13), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f68266e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        ns.k0 stateTransformer = new ns.k0(new lt.j(i14), (o82.i0) d2.f63224a, 1);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f68267f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f68267f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f68267f.e();
    }

    public final void h(String str, String assetPinId, String assetUserId, pi0.a assetType, String collageId, h32.i0 pinalyticsContext, String str2, HashMap auxData, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(assetPinId, "assetPinId");
        Intrinsics.checkNotNullParameter(assetUserId, "assetUserId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        zy.l0 l0Var = new zy.l0(pinalyticsContext, str2);
        o82.i2[] i2VarArr = new o82.i2[3];
        i2VarArr[0] = new o82.i2((Object) null, 3);
        int i13 = e0.f68245a[assetType.ordinal()];
        i2VarArr[1] = new o82.i2(i13 != 1 ? i13 != 2 ? null : new i90.e(assetUserId) : new i90.f(assetPinId), 2);
        i2VarArr[2] = new o82.i2(new i90.j(str, collageId, z13), z14 ? new o82.k(new y0(null, o82.v.f93728e, true, 1)) : o82.l.f93651a);
        l82.y.i(this.f68267f, new f0(str, assetPinId, assetUserId, assetType, collageId, z13, z14, l0Var, new o82.j0(kotlin.collections.f0.j(i2VarArr)), auxData), false, new i0(this), 2);
    }
}
