package tq;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z3;

/* loaded from: classes3.dex */
public final class r extends vq0.b implements l21.g, l21.h {

    /* renamed from: c, reason: collision with root package name */
    public List f118925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f118926d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f118927e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f118928f;

    /* renamed from: g, reason: collision with root package name */
    public final f30 f118929g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.b0 f118930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(List pinImages, uj2.q networkStateStream, d4 d4Var, a4 a4Var, nx.f0 pinalyticsFactory, boolean z13, boolean z14, f30 f30Var, nx.b0 pinAuxHelper, lh0.a0 closeupExperiments) {
        super(new gv.a(d4Var, a4Var, pinalyticsFactory), networkStateStream);
        Intrinsics.checkNotNullParameter(pinImages, "pinImages");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        this.f118925c = pinImages;
        this.f118926d = z13;
        this.f118927e = z14;
        this.f118928f = true;
        this.f118929g = f30Var;
        this.f118930h = pinAuxHelper;
        q qVar = new q(this, 0);
        q qVar2 = new q(this, 1);
        z3 z3Var = lh0.a4.f83298b;
        g1 g1Var = (g1) closeupExperiments.f83294a;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new n21.d(this, qVar, this, null, qVar2, g1Var.o("android_load_medium_res_image_in_pdp_closeup", "enabled", z3Var) || g1Var.l("android_load_medium_res_image_in_pdp_closeup"), new q(this, 2), 8));
    }

    @Override // l21.h
    public final void F1() {
        f30 f30Var = this.f118929g;
        if (f30Var != null) {
            String pinUid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new jy.r(pinUid).i();
        }
    }

    @Override // l21.g
    public final void I1(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) getView();
        View.OnLongClickListener onLongClickListener = pdpCloseupCarouselView.f35053j;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(pdpCloseupCarouselView);
        }
    }

    @Override // l21.g
    public final void U() {
        if (!this.f118925c.isEmpty()) {
            m60.u.f85943a.d(new ls1.i(((m21.a) this.f118925c.get(0)).getPinId(), System.currentTimeMillis() * 1000000));
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
    }

    @Override // l21.h
    public final void k1() {
        f30 f30Var = this.f118929g;
        if (f30Var != null) {
            String pinUid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new jy.q(pinUid).i();
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        PdpCloseupCarouselView view = (PdpCloseupCarouselView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f118925c);
    }

    @Override // vq0.g, yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.p(i13, view);
        if (view instanceof com.pinterest.feature.pincarouselads.view.l) {
            com.pinterest.feature.pincarouselads.view.l lVar = (com.pinterest.feature.pincarouselads.view.l) view;
            Context context = lVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            lVar.setContentDescription(bs1.c.e2(context, n80.f.pdp_plus_carousel_content_description, Integer.valueOf(i13 + 1), Integer.valueOf(this.f118925c.size())));
        }
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // vq0.g
    public final void r3(sq0.b0 b0Var) {
        PdpCloseupCarouselView view = (PdpCloseupCarouselView) b0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f118925c);
    }

    @Override // l21.g
    public final void y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) getView();
        View.OnClickListener onClickListener = pdpCloseupCarouselView.f35052i;
        if (onClickListener != null) {
            onClickListener.onClick(pdpCloseupCarouselView);
        }
    }

    @Override // vq0.g, yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        PdpCloseupCarouselView view = (PdpCloseupCarouselView) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f118925c);
    }
}
