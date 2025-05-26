package fa0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.t1;
import x02.i2;

/* loaded from: classes5.dex */
public final class k0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ha0.j f61499c;

    /* renamed from: d, reason: collision with root package name */
    public final ha0.f f61500d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f61501e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f61502f;

    /* renamed from: g, reason: collision with root package name */
    public final k92.l f61503g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f61504h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f61505i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ha0.j sourceSEP, ha0.f optionSEP, zy.d0 pinalyticsSEP, w60.d navigationSEP, k92.l toastSEP, i2 pinRepository, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(sourceSEP, "sourceSEP");
        Intrinsics.checkNotNullParameter(optionSEP, "optionSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f61499c = sourceSEP;
        this.f61500d = optionSEP;
        this.f61501e = pinalyticsSEP;
        this.f61502f = navigationSEP;
        this.f61503g = toastSEP;
        kv0.p pVar = new kv0.p(4);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(3), new ns.n0(12), new o82.h(new r90.g(pinRepository, 1)), false, t1.a(), null, null, null, a0.Collage.id(), null, 744);
        g01.a d2 = pVar.d();
        this.f61504h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        i0 stateTransformer = new i0((o82.i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        String tagged = k0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tagged, "getSimpleName(...)");
        Intrinsics.checkNotNullParameter(tagged, "tagged");
        a0Var.c(this, application);
        this.f61505i = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f61505i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f61505i.e();
    }

    public final void h(ra0.c sourceIds, boolean z13, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(sourceIds, "sourceIds");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f61505i, new j0(sourceIds, null, z13, new o82.j0(kotlin.collections.e0.b(new o82.i2(new ha0.k(sourceIds.f106906a), 2))), new zy.l0(loggingContext, str)), false, new p90.n0(this, 23), 2);
    }
}
