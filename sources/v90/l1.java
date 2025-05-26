package v90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ua0.d f124935c;

    /* renamed from: d, reason: collision with root package name */
    public final sa0.y f124936d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.d f124937e;

    /* renamed from: f, reason: collision with root package name */
    public final u90.c f124938f;

    /* renamed from: g, reason: collision with root package name */
    public final ua0.e f124939g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.d0 f124940h;

    /* renamed from: i, reason: collision with root package name */
    public final u90.j f124941i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f124942j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ua0.d addToCollageSEP, sa0.y cutoutRepinPrepSEP, w60.d navigatorSEP, u90.c collageCutoutLegacyNavigationSEP, ua0.e toastSEP, zy.d0 pinalyticsSEP, u90.j collageCutoutMaskEditorSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(addToCollageSEP, "addToCollageSEP");
        Intrinsics.checkNotNullParameter(cutoutRepinPrepSEP, "cutoutRepinPrepSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(collageCutoutLegacyNavigationSEP, "collageCutoutLegacyNavigationSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(collageCutoutMaskEditorSEP, "collageCutoutMaskEditorSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f124935c = addToCollageSEP;
        this.f124936d = cutoutRepinPrepSEP;
        this.f124937e = navigatorSEP;
        this.f124938f = collageCutoutLegacyNavigationSEP;
        this.f124939g = toastSEP;
        this.f124940h = pinalyticsSEP;
        this.f124941i = collageCutoutMaskEditorSEP;
        l82.a0 a0Var = new l82.a0(scope);
        j1 stateTransformer = new j1(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f124942j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f124942j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f124942j.e();
    }

    public final void h(sa0.b0 source, s90.v0 editSource, d32.c entryPointSource, r72.i1 i1Var, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f124942j, new k1(source, editSource, entryPointSource, i1Var, new zy.l0(loggingContext, str), null, true), false, new p90.n0(this, 12), 2);
    }
}
