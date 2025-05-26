package j21;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import eb2.k;
import h32.h2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import ky.h;
import nx.d0;
import nx.o0;
import nx.v;
import so.c6;
import so.jb;
import so.oa;
import so.s8;
import uj2.q;
import xk2.m;
import yn2.c0;
import yq0.z;

/* loaded from: classes5.dex */
public final class f extends BaseRecyclerContainerView implements g21.d, v, h {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f74498q = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f74499b;

    /* renamed from: c, reason: collision with root package name */
    public final q f74500c;

    /* renamed from: d, reason: collision with root package name */
    public final String f74501d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74502e;

    /* renamed from: f, reason: collision with root package name */
    public final rs.a f74503f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f74504g;

    /* renamed from: h, reason: collision with root package name */
    public l f74505h;

    /* renamed from: i, reason: collision with root package name */
    public c6 f74506i;

    /* renamed from: j, reason: collision with root package name */
    public i21.b f74507j;

    /* renamed from: k, reason: collision with root package name */
    public RelativeLayout f74508k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltText f74509l;

    /* renamed from: m, reason: collision with root package name */
    public FrameLayout f74510m;

    /* renamed from: n, reason: collision with root package name */
    public GestaltText f74511n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltButton f74512o;

    /* renamed from: p, reason: collision with root package name */
    public GestaltIconButton f74513p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, d0 d0Var, q networkStateStream, b carouselPadding, String pinImageSize, rs.a aVar, int i13, boolean z13, int i14) {
        super(context);
        carouselPadding = (i14 & 8) != 0 ? new b(0, 0, 0, 0) : carouselPadding;
        pinImageSize = (i14 & 16) != 0 ? "medium" : pinImageSize;
        int i15 = eo1.c.lego_corner_radius_medium;
        aVar = (i14 & 64) != 0 ? null : aVar;
        i13 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? eo1.c.margin_three_quarter : i13;
        z13 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselPadding, "carouselPadding");
        Intrinsics.checkNotNullParameter(pinImageSize, "pinImageSize");
        inject();
        this.f74500c = networkStateStream;
        this.f74501d = pinImageSize;
        this.f74502e = i15;
        this.f74503f = aVar;
        this.f74504g = m.b(c.f74492i);
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        pinterestRecyclerView.a(new k(false, 0, 0, pinterestRecyclerView.getResources().getDimensionPixelSize(i13), 0));
        if (z13) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            pinterestRecyclerView.setLayoutParams(layoutParams);
        }
        getPinterestRecyclerView().f52531a.setPaddingRelative(carouselPadding.f74488a, carouselPadding.f74489b, carouselPadding.f74490c, carouselPadding.f74491d);
        if (d0Var != null) {
            setPinalytics(d0Var);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
        }
        zy.m[] mVarArr = new zy.m[1];
        c6 c6Var = this.f74506i;
        if (c6Var != null) {
            mVarArr[0] = c6Var.a(d0Var, h2.STORY_CAROUSEL);
            return mVarArr;
        }
        Intrinsics.r("pinImpressionLoggerFactory");
        throw null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            return c0.t(c0.j(d7.b.O(recyclerView), d.f74493j));
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f74504g.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return ty1.d.view_story_pin_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return ty1.c.pin_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f74499b) {
            return;
        }
        this.f74499b = true;
        jb jbVar = (jb) ((g) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        s8 s8Var = jbVar.f113485c;
        this.f74505h = (l) s8Var.f114476s.get();
        oa oaVar = jbVar.f113483a;
        bf2.b.a(oaVar.f113717h7);
        this.f74506i = (c6) s8Var.f114447q.get();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f74507j = null;
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL, new e(this, 0));
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new b01.c(9, this, pinalytics));
        }
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, new e(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL, new e(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE, new e(this, 3));
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }
}
