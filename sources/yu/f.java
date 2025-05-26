package yu;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.internal.Intrinsics;
import ky.h;
import nx.d0;
import nx.o0;
import ps.p;
import ps.s;
import so.jb;
import so.oa;
import uj2.q;
import x02.i2;
import xk2.m;
import xk2.v;
import xt.k;
import yk1.j;
import yq0.g0;
import yq0.z;

/* loaded from: classes3.dex */
public final class f extends BaseRecyclerContainerView implements h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f140146b;

    /* renamed from: c, reason: collision with root package name */
    public final xt.f f140147c;

    /* renamed from: d, reason: collision with root package name */
    public final v f140148d;

    /* renamed from: e, reason: collision with root package name */
    public i2 f140149e;

    /* renamed from: f, reason: collision with root package name */
    public uk1.e f140150f;

    /* renamed from: g, reason: collision with root package name */
    public q f140151g;

    /* renamed from: h, reason: collision with root package name */
    public lh0.g f140152h;

    /* renamed from: i, reason: collision with root package name */
    public final v f140153i;

    /* renamed from: j, reason: collision with root package name */
    public int f140154j;

    /* renamed from: k, reason: collision with root package name */
    public final g0 f140155k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, xt.f showcaseManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        inject();
        this.f140147c = showcaseManager;
        this.f140148d = m.b(d.f140143i);
        this.f140153i = m.b(new e(this, 1));
        this.f140154j = s.ads_showcase_promoted_by;
        j a13 = j.a();
        uk1.e eVar = this.f140150f;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        q qVar = this.f140151g;
        if (qVar == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        i2 i2Var = this.f140149e;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        a13.d(this, new zt.d(g13, qVar, i2Var, showcaseManager));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        int i13 = 0;
        getPinterestRecyclerView().a(new eb2.d(new a(dimensionPixelSize, dimensionPixelSize2, 0), b.f140136j, new c(this, dimensionPixelSize, dimensionPixelSize2, i13), b.f140137k));
        setPinalytics(showcaseManager.f135858a);
        this.f140155k = new g0(showcaseManager.f135858a, h32.g0.SHOWCASE, new androidx.appcompat.widget.q(this, i13), null);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var != null ? new zy.m[]{new k(d0Var, 0)} : super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f140148d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return ps.q.view_showcase_subpage_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return p.showcase_subpage_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f140146b) {
            return;
        }
        this.f140146b = true;
        jb jbVar = (jb) ((g) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        oa oaVar = jbVar.f113483a;
        this.f140149e = (i2) oaVar.F3.get();
        this.f140150f = (uk1.e) oaVar.f113702ga.get();
        this.f140151g = (q) oaVar.f113947u9.get();
        this.f140152h = oaVar.p2();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.o(this.f140155k);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.w2(this.f140155k);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (getPinalytics() != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM, new e(this, 0));
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }
}
