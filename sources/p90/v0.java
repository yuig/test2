package p90;

import android.app.Application;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import java.util.Set;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.n1;
import o82.j3;
import o82.t1;
import x02.i2;

/* loaded from: classes5.dex */
public final class v0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final lh0.f0 f99236c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f99237d;

    /* renamed from: e, reason: collision with root package name */
    public final r90.c f99238e;

    /* renamed from: f, reason: collision with root package name */
    public final sa0.j f99239f;

    /* renamed from: g, reason: collision with root package name */
    public final o22.c f99240g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f99241h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f99242i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(lh0.f0 experiments, zy.d0 pinalyticsSEP, r90.c navigationSEP, sa0.j cutoutEditorSEP, o22.c experimentsSEP, o12.a collageService, i2 repository, Application application, ao2.j0 scope, es.a adFormats, es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(cutoutEditorSEP, "cutoutEditorSEP");
        Intrinsics.checkNotNullParameter(experimentsSEP, "experimentsSEP");
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(repository, "pinRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f99236c = experiments;
        this.f99237d = pinalyticsSEP;
        this.f99238e = navigationSEP;
        this.f99239f = cutoutEditorSEP;
        this.f99240g = experimentsSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new h90.g0(1000, 1), new ns.n0(6), new o82.h(r90.e.f106868a), false, t1.a(), null, null, null, a0.CutoutEditor.id(), null, 744);
        Intrinsics.checkNotNullParameter(repository, "repository");
        kv0.p.b(pVar, new h90.g0(1001, 1), new ns.n0(7), new o82.h(new r90.g(repository, 0)), false, t1.a(), null, null, null, a0.CutoutSourceMetadata.id(), null, 744);
        kv0.p.b(pVar, new h90.g0(1002, 1), new ns.n0(8), new j3(kotlin.collections.e0.b(b1.f99175a)), false, t1.a(), null, null, null, a0.RelatedContentHeader.id(), null, 744);
        r90.j jVar = new r90.j(collageService);
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        o82.s0 s0Var = new o82.s0(jVar);
        Set set = y.f99247a;
        j6.b autoplayQualifier = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
        n1 experiments2 = n1.f83436b.c();
        Intrinsics.checkNotNullParameter(autoplayQualifier, "autoplayQualifier");
        Intrinsics.checkNotNullParameter(experiments2, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        kv0.p.b(pVar, new m90.y(autoplayQualifier, experiments2, adFormats, adsCommonDisplay, 1), new ns.n0(9), s0Var, false, t1.b(), null, null, new m90.z(1), a0.RelatedContent.id(), null, 616);
        g01.a d2 = pVar.d();
        this.f99241h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        t0 stateTransformer = new t0(new sa0.r(), (o82.i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        String tagged = v0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tagged, "getSimpleName(...)");
        Intrinsics.checkNotNullParameter(tagged, "tagged");
        a0Var.c(this, application);
        this.f99242i = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f99242i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f99242i.e();
    }

    public final void h(String sourceId, CutoutPickerOrigin origin, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        sa0.a0 a0Var = new sa0.a0(sourceId);
        int i13 = 2;
        l82.y.i(this.f99242i, new u0(new sa0.s(a0Var, 1, kotlin.collections.f0.j(sa0.m.f112180a, sa0.n.f112181a), 10), new o82.j0(kotlin.collections.f0.j(new o82.i2(new r90.d(k3.F1(a0Var)), i13), new o82.i2(new r90.h(k3.F1(a0Var)), i13), new o82.i2((Object) null, 3), new o82.i2(new r90.k(k3.F1(a0Var)), i13))), new zy.l0(loggingContext, str), origin, ((g1) this.f99236c.f83341a).j()), false, new n0(this, 1), 2);
    }
}
