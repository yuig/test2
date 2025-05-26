package y52;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f137811c;

    /* renamed from: d, reason: collision with root package name */
    public final mb0.a f137812d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.a f137813e;

    /* renamed from: f, reason: collision with root package name */
    public final mb0.a f137814f;

    /* renamed from: g, reason: collision with root package name */
    public final p70.e f137815g;

    /* renamed from: h, reason: collision with root package name */
    public final w60.d f137816h;

    /* renamed from: i, reason: collision with root package name */
    public final c f137817i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f137818j;

    /* renamed from: k, reason: collision with root package name */
    public final lb0.r f137819k;

    /* renamed from: l, reason: collision with root package name */
    public final l82.y f137820l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Application application, ao2.j0 scope, gx.e getShareLinkPerformerSEP, mb0.a copyToClipboardSEP, nu.a showCopiedToastSEP, mb0.a shareVideoToStoriesSEP, p70.e shareBoardVideoLoggingSEP, w60.d navigatorSEP, c setTooltipShowCountSEP, z0 videoManipulationSEP, lb0.r prefsManagerUser) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(getShareLinkPerformerSEP, "getShareLinkPerformerSEP");
        Intrinsics.checkNotNullParameter(copyToClipboardSEP, "copyToClipboardSEP");
        Intrinsics.checkNotNullParameter(showCopiedToastSEP, "showCopiedToastSEP");
        Intrinsics.checkNotNullParameter(shareVideoToStoriesSEP, "shareVideoToStoriesSEP");
        Intrinsics.checkNotNullParameter(shareBoardVideoLoggingSEP, "shareBoardVideoLoggingSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(setTooltipShowCountSEP, "setTooltipShowCountSEP");
        Intrinsics.checkNotNullParameter(videoManipulationSEP, "videoManipulationSEP");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f137811c = getShareLinkPerformerSEP;
        this.f137812d = copyToClipboardSEP;
        this.f137813e = showCopiedToastSEP;
        this.f137814f = shareVideoToStoriesSEP;
        this.f137815g = shareBoardVideoLoggingSEP;
        this.f137816h = navigatorSEP;
        this.f137817i = setTooltipShowCountSEP;
        this.f137818j = videoManipulationSEP;
        this.f137819k = prefsManagerUser;
        l82.a0 a0Var = new l82.a0(scope);
        rw1.f stateTransformer = new rw1.f(10);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f137820l = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f137820l.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f137820l.e();
    }

    public final void h(d params, h32.i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        l82.y.i(this.f137820l, new g0(params, new zy.l0(pinalyticsContext, 2), this.f137819k.g("board_preview_share_tooltip", 0)), false, new s12.a(this, 14), 2);
    }
}
