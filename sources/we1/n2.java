package we1;

import android.content.Context;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.PinFeed;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.s4;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.c6;
import so.jb;

/* loaded from: classes5.dex */
public final class n2 extends BaseRecyclerContainerView implements nx.v, np0.f, g60.h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f129494o = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f129495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129496c;

    /* renamed from: d, reason: collision with root package name */
    public final a82.b f129497d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f129498e;

    /* renamed from: f, reason: collision with root package name */
    public c6 f129499f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f129500g;

    /* renamed from: h, reason: collision with root package name */
    public float f129501h;

    /* renamed from: i, reason: collision with root package name */
    public final int f129502i;

    /* renamed from: j, reason: collision with root package name */
    public yq0.g0 f129503j;

    /* renamed from: k, reason: collision with root package name */
    public p2 f129504k;

    /* renamed from: l, reason: collision with root package name */
    public m2 f129505l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.n1 f129506m;

    /* renamed from: n, reason: collision with root package name */
    public eb2.m f129507n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context, a82.b offscreenRenderer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(offscreenRenderer, "offscreenRenderer");
        inject();
        this.f129496c = false;
        this.f129497d = offscreenRenderer;
        this.f129498e = xk2.m.b(j2.f129443i);
        this.f129502i = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, "feed", new ArrayList(kotlin.collections.e0.b(pinUid)), null));
    }

    public final void b(int i13, boolean z13, boolean z14) {
        getPinterestRecyclerView().f52531a.V = null;
        eb2.m mVar = this.f129507n;
        if (mVar != null) {
            mVar.m();
        }
        androidx.recyclerview.widget.n1 n1Var = this.f129506m;
        if (n1Var != null) {
            n1Var.b(null);
        }
        this.f129506m = null;
        this.f129507n = null;
        if (z13) {
            if (z14) {
                androidx.recyclerview.widget.n1 n1Var2 = new androidx.recyclerview.widget.n1();
                this.f129506m = n1Var2;
                n1Var2.b(getPinterestRecyclerView().f52531a);
            } else {
                RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
                eb2.m mVar2 = new eb2.m(i13, recyclerView, getLinearLayoutManager());
                this.f129507n = mVar2;
                mVar2.l();
            }
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, nx.d0 d0Var, nx.o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        p2 p2Var = this.f129504k;
        if (p2Var == null) {
            return new zy.m[0];
        }
        zy.m[] mVarArr = new zy.m[5];
        c6 c6Var = this.f129499f;
        if (c6Var == null) {
            Intrinsics.r("pinImpressionLoggerFactory");
            throw null;
        }
        uk1.d dVar = p2Var.f129551a;
        nx.d0 d0Var2 = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        mVarArr[0] = c6Var.a(d0Var2, h32.h2.STORY_CAROUSEL);
        nx.d0 pinalytics = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        mVarArr[1] = new tq0.m(clock, pinalytics);
        h32.g0 g0Var = p2Var.f129552b.f129428l;
        Intrinsics.f(pinalytics);
        mVarArr[2] = new tq0.c(clock, pinalytics, pinalyticsManager, g0Var, new n1(p2Var, 3));
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        mVarArr[3] = new tq0.a(clock, pinalytics);
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        mVarArr[4] = new tq0.e(clock, pinalytics);
        return mVarArr;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final androidx.recyclerview.widget.b1 createLayoutManagerContract(int i13, boolean z13) {
        g41.a aVar = new g41.a(this, 7);
        getContext();
        PinterestGridLayoutManager layoutManager = new PinterestGridLayoutManager(aVar, z13);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new androidx.recyclerview.widget.b1(layoutManager);
    }

    public final void e(p2 params) {
        LinearLayout.LayoutParams layoutParams;
        x21.h m13;
        Intrinsics.checkNotNullParameter(params, "params");
        this.f129504k = params;
        uk1.d dVar = params.f129551a;
        nx.d0 d0Var = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        i2 i2Var = params.f129552b;
        this.f129503j = new yq0.g0(d0Var, i2Var.f129428l, null, i2Var.f129427k);
        this.f129505l = new m2(this, params);
        if (i2Var.f129421e) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        pinterestRecyclerView.d(0);
        Context context = pinterestRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        pinterestRecyclerView.a(new eb2.k(false, 0, 0, i2Var.f129420d.a(context).intValue(), 0));
        pinterestRecyclerView.f52531a.setOverScrollMode(2);
        RecyclerView recyclerView = pinterestRecyclerView.f52531a;
        boolean z13 = i2Var.f129430n;
        recyclerView.setFocusable(!z13);
        pinterestRecyclerView.f52531a.setFocusableInTouchMode(!z13);
        PinterestRecyclerView pinterestRecyclerView2 = getPinterestRecyclerView();
        j21.b bVar = i2Var.f129417a;
        pinterestRecyclerView2.f52531a.setPaddingRelative(bVar.f74488a, bVar.f74489b, bVar.f74490c, bVar.f74491d);
        nx.d0 d0Var2 = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        setPinalytics(d0Var2);
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager();
        Intrinsics.g(linearLayoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) linearLayoutManager).R1(i2Var.f129423g);
        if (this.f129496c || (m13 = pe.i.m1(i2Var.f129424h)) == null) {
            return;
        }
        PinterestRecyclerView pinterestRecyclerView3 = getPinterestRecyclerView();
        LinearLayoutManager linearLayoutManager2 = getLinearLayoutManager();
        Intrinsics.checkNotNullParameter(linearLayoutManager2, "<this>");
        x21.g portalVideoCoordinator = new x21.g(pinterestRecyclerView3, new x21.a(linearLayoutManager2), m13, i2Var.f129425i);
        PinterestRecyclerView pinterestRecyclerView4 = getPinterestRecyclerView();
        Intrinsics.checkNotNullParameter(pinterestRecyclerView4, "<this>");
        Intrinsics.checkNotNullParameter(portalVideoCoordinator, "portalVideoCoordinator");
        pinterestRecyclerView4.f52531a.n(portalVideoCoordinator);
        androidx.recyclerview.widget.q2 q2Var = pinterestRecyclerView4.f52531a.f19220c;
        q2Var.f19606e = 8;
        q2Var.q();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            return yn2.c0.t(yn2.c0.j(d7.b.O(recyclerView), b2.f129286k));
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f129498e.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return r82.f.view_universal_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return r82.d.universal_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f129495b) {
            return;
        }
        this.f129495b = true;
        jb jbVar = (jb) ((o2) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        this.f129499f = (c6) jbVar.f113485c.f114447q.get();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        endImpressionsForCurrentChildImpressionViews(true);
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        startImpressionsForCurrentChildImpressionViews();
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        i2 i2Var;
        yq0.g0 g0Var;
        super.onAttachedToWindow();
        p2 p2Var = this.f129504k;
        if (p2Var != null && (i2Var = p2Var.f129552b) != null && i2Var.f129426j && (g0Var = this.f129503j) != null) {
            getPinterestRecyclerView().f52531a.o(g0Var);
        }
        m2 m2Var = this.f129505l;
        if (m2Var != null) {
            getPinterestRecyclerView().f52531a.f19248q.add(m2Var);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i2 i2Var;
        yq0.g0 g0Var;
        p2 p2Var = this.f129504k;
        if (p2Var != null && (i2Var = p2Var.f129552b) != null && i2Var.f129426j && (g0Var = this.f129503j) != null) {
            getPinterestRecyclerView().f52531a.w2(g0Var);
        }
        m2 m2Var = this.f129505l;
        if (m2Var != null) {
            RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
            recyclerView.f19248q.remove(m2Var);
            if (recyclerView.f19250r == m2Var) {
                recyclerView.f19250r = null;
            }
        }
        getPinterestRecyclerView().f52531a.V = null;
        eb2.m mVar = this.f129507n;
        if (mVar != null) {
            mVar.m();
        }
        androidx.recyclerview.widget.n1 n1Var = this.f129506m;
        if (n1Var != null) {
            n1Var.b(null);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        p2 p2Var = this.f129504k;
        if (p2Var != null) {
            int i13 = 3;
            adapter.G(10, new l2(this, p2Var, adapter, i13));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, new l2(this, adapter, p2Var, 5));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_USER, new k2(this, p2Var, 8));
            adapter.G(43, new k2(this, p2Var, 9));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, new k2(this, p2Var, 10));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP, new k2(this, p2Var, 11));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP, new k2(this, p2Var, 12));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP, new k2(this, p2Var, 13));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY, new k2(this, p2Var, 14));
            int i14 = 0;
            adapter.G(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, new k2(this, p2Var, i14));
            int i15 = 1;
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, new k2(this, p2Var, i15));
            adapter.G(39, new l2(this, p2Var, adapter, i14));
            int i16 = 2;
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP, new k2(this, p2Var, i16));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP, new k2(this, p2Var, i13));
            int i17 = 4;
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP, new k2(this, p2Var, i17));
            adapter.G(250, new k2(this, p2Var));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER, new k2(this, p2Var, 6));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, new l2(this, adapter, p2Var, i15));
            uk1.d dVar = p2Var.f129551a;
            nx.d0 d0Var = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, dl2.b.m2(d0Var, null, new l2(this, adapter, p2Var, i16)));
            nx.d0 d0Var2 = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            adapter.G(3, dl2.b.m2(d0Var2, null, new l2(this, p2Var, adapter, i17)));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL, new k2(this, p2Var, 7));
        }
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        p2 p2Var = this.f129504k;
        if (p2Var != null) {
            NavigationImpl z03 = Navigation.z0((ScreenLocation) s4.f51357d.getValue(), pinUid);
            String f13 = metadataProvider.f();
            String z13 = metadataProvider.z();
            int y13 = metadataProvider.y();
            ArrayList w13 = metadataProvider.w();
            nx.d0 d0Var = p2Var.f129551a.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            bs1.c.j(z03, pinFeed, i13, f13, z13, y13, w13, p2Var.f129556f, d0Var, null);
            z03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", metadataProvider.e());
            p2Var.f129553c.d(z03);
        }
    }
}
