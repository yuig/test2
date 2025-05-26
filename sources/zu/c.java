package zu;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.internal.Intrinsics;
import ky.h;
import nx.d0;
import nx.o0;
import pb0.g;
import ps.p;
import so.jb;
import so.oa;
import uj2.q;
import xk2.m;
import xk2.v;
import xt.k;
import yk1.j;
import yq0.g0;
import yq0.z;
import zp.j0;

/* loaded from: classes3.dex */
public final class c extends BaseRecyclerContainerView implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f142787i = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f142788b;

    /* renamed from: c, reason: collision with root package name */
    public final v f142789c;

    /* renamed from: d, reason: collision with root package name */
    public PinService f142790d;

    /* renamed from: e, reason: collision with root package name */
    public uk1.e f142791e;

    /* renamed from: f, reason: collision with root package name */
    public q f142792f;

    /* renamed from: g, reason: collision with root package name */
    public k f142793g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f142794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, xt.f showcaseManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        inject();
        this.f142789c = m.b(b.f142786i);
        j a13 = j.a();
        uk1.e eVar = this.f142791e;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        q qVar = this.f142792f;
        if (qVar == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        a13.d(this, new zt.d(g13, qVar, showcaseManager));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        getPinterestRecyclerView().a(new eb2.d(new yu.a(dimensionPixelSize, dimensionPixelSize2, 1), a.f142783j, new yu.c(this, dimensionPixelSize, dimensionPixelSize2, 1), a.f142784k));
        setPinalytics(showcaseManager.f135858a);
        this.f142794h = new g0(showcaseManager.f135858a, h32.g0.SHOWCASE, new androidx.appcompat.widget.q(showcaseManager, 1), null);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
        }
        k kVar = new k(d0Var, 1);
        this.f142793g = kVar;
        return new zy.m[]{kVar};
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f142789c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return ps.q.view_showcase_subpin_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return p.showcase_subpin_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f142788b) {
            return;
        }
        this.f142788b = true;
        jb jbVar = (jb) ((d) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        oa oaVar = jbVar.f113483a;
        this.f142790d = (PinService) oaVar.f113713h3.get();
        this.f142791e = (uk1.e) oaVar.f113702ga.get();
        this.f142792f = (q) oaVar.f113947u9.get();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.o(this.f142794h);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.w2(this.f142794h);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM, new j0(18, this, pinalytics));
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }
}
