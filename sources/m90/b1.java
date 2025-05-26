package m90;

import android.app.Application;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.n1;
import lh0.z3;
import o82.i2;

/* loaded from: classes5.dex */
public final class b1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final o12.a f86632c;

    /* renamed from: d, reason: collision with root package name */
    public final o90.c f86633d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f86634e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0.f0 f86635f;

    /* renamed from: g, reason: collision with root package name */
    public final o22.c f86636g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f86637h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f86638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(o12.a collageService, o90.c navigationSEP, zy.d0 pinalyticsSEP, lh0.f0 experiments, o22.c experimentSEP, es.a adFormats, es.h adsCommonDisplay, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experimentSEP, "experimentSEP");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f86632c = collageService;
        this.f86633d = navigationSEP;
        this.f86634e = pinalyticsSEP;
        this.f86635f = experiments;
        this.f86636g = experimentSEP;
        kv0.p pVar = new kv0.p(4);
        o82.s0 s0Var = new o82.s0(new o90.e(collageService), new m60.p(15, 25, 25));
        Set set = a0.f86617a;
        j6.b autoplayQualifier = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
        n1 experiments2 = n1.f83436b.c();
        Intrinsics.checkNotNullParameter(autoplayQualifier, "autoplayQualifier");
        Intrinsics.checkNotNullParameter(experiments2, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        int i13 = 2;
        kv0.p.b(pVar, new y(autoplayQualifier, experiments2, adFormats, adsCommonDisplay, 0), new ns.n0(5), s0Var, false, new com.pinterest.boardAutoCollages.l0(i13), null, null, new z(0), null, null, 872);
        g01.a d2 = pVar.d();
        this.f86637h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        y0 stateTransformer = new y0(new lt.j(i13), (o82.i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f86638i = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f86638i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f86638i.e();
    }

    public final void h(String query, za0.b type, List pinIds, CutoutPickerPage cutoutPickerPage, boolean z13, h32.i0 loggingContext, String str) {
        e0 d0Var;
        e0 c0Var;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        if (cutoutPickerPage != null) {
            c0Var = new b0(cutoutPickerPage);
        } else {
            if (!kotlin.text.z.j(query)) {
                d0Var = new d0(query, type);
                lh0.f0 f0Var = this.f86635f;
                f0Var.getClass();
                z3 z3Var = a4.f83297a;
                lh0.z0 z0Var = f0Var.f83341a;
                lh0.g1 g1Var = (lh0.g1) z0Var;
                boolean z14 = !g1Var.o("android_curation_collage_cutout_carousel", "enabled", z3Var) || g1Var.l("android_curation_collage_cutout_carousel");
                l82.y.i(this.f86638i, new a1(d0Var, z14, z13, new o82.j0(kotlin.collections.e0.b(new i2(new o90.k(d0Var, z14), 2))), new zy.l0(loggingContext, str), ((lh0.g1) z0Var).j()), false, new mz.c(this, 29), 2);
            }
            c0Var = new c0(pinIds);
        }
        d0Var = c0Var;
        lh0.f0 f0Var2 = this.f86635f;
        f0Var2.getClass();
        z3 z3Var2 = a4.f83297a;
        lh0.z0 z0Var2 = f0Var2.f83341a;
        lh0.g1 g1Var2 = (lh0.g1) z0Var2;
        if (g1Var2.o("android_curation_collage_cutout_carousel", "enabled", z3Var2)) {
        }
        l82.y.i(this.f86638i, new a1(d0Var, z14, z13, new o82.j0(kotlin.collections.e0.b(new i2(new o90.k(d0Var, z14), 2))), new zy.l0(loggingContext, str), ((lh0.g1) z0Var2).j()), false, new mz.c(this, 29), 2);
    }
}
