package ys0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.k0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import lq0.f1;
import ns.n0;
import o82.i0;
import o82.i2;
import o82.j3;
import o82.s0;
import o82.t1;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class s extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final d0 f140127c;

    /* renamed from: d, reason: collision with root package name */
    public final at0.b f140128d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f140129e;

    /* renamed from: f, reason: collision with root package name */
    public final y f140130f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Application application, j0 scope, zs0.c boardRecommendationsPageLoader, d0 pinalyticsSEP, at0.b privacyAndDataSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(boardRecommendationsPageLoader, "boardRecommendationsPageLoader");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(privacyAndDataSEP, "privacyAndDataSEP");
        this.f140127c = pinalyticsSEP;
        this.f140128d = privacyAndDataSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new k0(11), new n0(28), new j3(e0.b(new r())), true, t1.a(), null, null, null, null, null, 992);
        k0 k0Var = new k0(12);
        n0 n0Var = new n0(29);
        Intrinsics.checkNotNullParameter(boardRecommendationsPageLoader, "<this>");
        kv0.p.b(pVar, k0Var, n0Var, new s0(boardRecommendationsPageLoader), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f140129e = d2;
        a0 a0Var = new a0(scope);
        p stateTransformer = new p((i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f140130f = a0.b(a0Var, new q(new l0((h32.i0) null, 3), new o82.j0(f0.j(new i2((Object) null, 3), new i2((Object) null, 3)))), new f1(this, 15), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f140130f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f140130f.e();
    }
}
