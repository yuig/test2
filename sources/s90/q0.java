package s90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final sa0.j f112007c;

    /* renamed from: d, reason: collision with root package name */
    public final ua0.d f112008d;

    /* renamed from: e, reason: collision with root package name */
    public final sa0.y f112009e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f112010f;

    /* renamed from: g, reason: collision with root package name */
    public final u90.c f112011g;

    /* renamed from: h, reason: collision with root package name */
    public final ua0.e f112012h;

    /* renamed from: i, reason: collision with root package name */
    public final zy.d0 f112013i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f112014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(sa0.j cutoutEditorSEP, ua0.d addToCollageSEP, sa0.y cutoutRepinPrepSEP, w60.d navigatorSEP, u90.c collageCutoutLegacyNavigationSEP, ua0.e toastSEP, zy.d0 pinalyticsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(cutoutEditorSEP, "cutoutEditorSEP");
        Intrinsics.checkNotNullParameter(addToCollageSEP, "addToCollageSEP");
        Intrinsics.checkNotNullParameter(cutoutRepinPrepSEP, "cutoutRepinPrepSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(collageCutoutLegacyNavigationSEP, "collageCutoutLegacyNavigationSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f112007c = cutoutEditorSEP;
        this.f112008d = addToCollageSEP;
        this.f112009e = cutoutRepinPrepSEP;
        this.f112010f = navigatorSEP;
        this.f112011g = collageCutoutLegacyNavigationSEP;
        this.f112012h = toastSEP;
        this.f112013i = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        n0 stateTransformer = new n0(new sa0.r(), new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f112014j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f112014j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f112014j.e();
    }

    public final void h(sa0.b0 source, v0 editSource, d32.c entryPointSource, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f112014j, new o0(new sa0.s(source, null, 0 == true ? 1 : 0, 30), editSource, new zy.l0(loggingContext, str), entryPointSource), false, new p90.n0(this, 4), 2);
    }
}
