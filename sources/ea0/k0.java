package ea0;

import android.app.Application;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import o82.i2;
import o82.s0;

/* loaded from: classes5.dex */
public final class k0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ja0.e f57966c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f57967d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.d f57968e;

    /* renamed from: f, reason: collision with root package name */
    public final k92.l f57969f;

    /* renamed from: g, reason: collision with root package name */
    public final g01.a f57970g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.y f57971h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ja0.e sourceSEP, zy.d0 pinalyticsSEP, w60.d navigationSEP, k92.l toastSEP, es.h adsCommonDisplay, o12.a collageService, es.a adFormats, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(sourceSEP, "sourceSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f57966c = sourceSEP;
        this.f57967d = pinalyticsSEP;
        this.f57968e = navigationSEP;
        this.f57969f = toastSEP;
        kv0.p pVar = new kv0.p(4);
        ja0.b bVar = new ja0.b(collageService);
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        s0 s0Var = new s0(bVar);
        Set set = v.f58002a;
        j6.b autoplayQualifier = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
        n1 experiments = n1.f83436b.c();
        Intrinsics.checkNotNullParameter(autoplayQualifier, "autoplayQualifier");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        kv0.p.b(pVar, new m90.y(autoplayQualifier, experiments, adFormats, adsCommonDisplay, 2), new ns.n0(11), s0Var, false, new com.pinterest.boardAutoCollages.l0(3), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f57970g = d2;
        l82.a0 a0Var = new l82.a0(scope);
        i0 stateTransformer = new i0((o82.i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f57971h = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f57971h.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f57971h.e();
    }

    public final void h(h32.i0 loggingContext, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f57971h, new j0(z13, new o82.j0(kotlin.collections.e0.b(new i2(new ja0.c(), 2))), new zy.l0(loggingContext, str)), false, new p90.n0(this, 16), 2);
    }
}
