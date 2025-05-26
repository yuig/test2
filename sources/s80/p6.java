package s80;

import android.app.Application;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p6 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final lh0.d0 f111757c;

    /* renamed from: d, reason: collision with root package name */
    public final zb0.i f111758d;

    /* renamed from: e, reason: collision with root package name */
    public final z80.m f111759e;

    /* renamed from: f, reason: collision with root package name */
    public final z80.b f111760f;

    /* renamed from: g, reason: collision with root package name */
    public final ta0.v f111761g;

    /* renamed from: h, reason: collision with root package name */
    public final z80.s f111762h;

    /* renamed from: i, reason: collision with root package name */
    public final z80.x f111763i;

    /* renamed from: j, reason: collision with root package name */
    public final t80.s f111764j;

    /* renamed from: k, reason: collision with root package name */
    public final zy.d0 f111765k;

    /* renamed from: l, reason: collision with root package name */
    public final z80.q f111766l;

    /* renamed from: m, reason: collision with root package name */
    public final z80.d f111767m;

    /* renamed from: n, reason: collision with root package name */
    public final o22.a f111768n;

    /* renamed from: o, reason: collision with root package name */
    public final l82.y f111769o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(lh0.d0 experiments, zb0.i alertSEP, z80.m canvasSEP, z80.b collageOptionsSEP, ta0.v collageDraftDownloadSEP, z80.s navigationSEP, z80.x onboardingSEP, t80.s emptyStateCarouselSEP, zy.d0 pinalyticsSEP, z80.q retrievalSEP, z80.d toastSEP, o22.a experimentsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(canvasSEP, "canvasSEP");
        Intrinsics.checkNotNullParameter(collageOptionsSEP, "collageOptionsSEP");
        Intrinsics.checkNotNullParameter(collageDraftDownloadSEP, "collageDraftDownloadSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(onboardingSEP, "onboardingSEP");
        Intrinsics.checkNotNullParameter(emptyStateCarouselSEP, "emptyStateCarouselSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(retrievalSEP, "retrievalSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(experimentsSEP, "experimentsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f111757c = experiments;
        this.f111758d = alertSEP;
        this.f111759e = canvasSEP;
        this.f111760f = collageOptionsSEP;
        this.f111761g = collageDraftDownloadSEP;
        this.f111762h = navigationSEP;
        this.f111763i = onboardingSEP;
        this.f111764j = emptyStateCarouselSEP;
        this.f111765k = pinalyticsSEP;
        this.f111766l = retrievalSEP;
        this.f111767m = toastSEP;
        this.f111768n = experimentsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        m6 stateTransformer = new m6(new t80.c0(), new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f111769o = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f111769o.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f111769o.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        super.g();
        t80.s sVar = this.f111764j;
        sVar.getClass();
        try {
            sVar.f116735e.close();
        } catch (Exception unused) {
        }
    }

    public final void h(String draftId, String boardId, String remixPinId, boolean z13, h32.i0 loggingContext, String str, d32.c cVar) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(remixPinId, "remixPinId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        zy.l0 l0Var = new zy.l0(loggingContext, str);
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        int intValue = (f13 != null ? f13.x2() : 0).intValue();
        lh0.d0 d0Var = this.f111757c;
        l82.y.i(this.f111769o, new n6(draftId, boardId, remixPinId, (kotlin.text.z.j(draftId) ^ true) || (kotlin.text.z.j(remixPinId) ^ true), false, false, false, null, null, null, null, null, kotlin.collections.z0.d(), b7.None, new t80.d0(intValue, l0Var, ((lh0.g1) d0Var.f83324a).j(), 3), false, l0Var, false, z13, cVar == null ? d32.c.UNKNOWN : cVar, ((lh0.g1) d0Var.f83324a).j()), false, new mz.c(this, 25), 2);
    }
}
