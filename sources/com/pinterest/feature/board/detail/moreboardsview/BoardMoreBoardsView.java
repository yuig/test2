package com.pinterest.feature.board.detail.moreboardsview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.gestalt.text.GestaltText;
import cp.b;
import d70.d;
import eb2.k;
import eb2.l;
import el0.c;
import el0.e;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import tq.a;
import xk2.v;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/detail/moreboardsview/BoardMoreBoardsView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lel0/e;", "Leb2/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardMoreBoardsView extends a implements e, l {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45234k = 0;

    /* renamed from: d, reason: collision with root package name */
    public w f45235d;

    /* renamed from: e, reason: collision with root package name */
    public final CarouselIndexView f45236e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45237f;

    /* renamed from: g, reason: collision with root package name */
    public final int f45238g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f45239h;

    /* renamed from: i, reason: collision with root package name */
    public c f45240i;

    /* renamed from: j, reason: collision with root package name */
    public final v f45241j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardMoreBoardsView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var == null ? super.createImpressionLoggers(clock, d0Var, pinalyticsManager) : new m[]{new tq0.c(clock, d0Var, pinalyticsManager, g0.RECOMMENDED_BOARDS, this.f45239h)};
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, final boolean z13) {
        final b bVar = new b(this, 9);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(z13, bVar) { // from class: com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView$createLayoutManagerContract$1
            @Override // androidx.recyclerview.widget.l2
            public final RecyclerView.LayoutParams C(ViewGroup.LayoutParams layoutParams) {
                if (layoutParams != null) {
                    layoutParams.width = (this.f19506n - this.f45238g) / 2;
                }
                RecyclerView.LayoutParams C = super.C(layoutParams);
                Intrinsics.checkNotNullExpressionValue(C, "generateLayoutParams(...)");
                return C;
            }
        };
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f45241j.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return d70.e.board_more_boards_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return d.board_more_boards_p_recycler_view;
    }

    @Override // eb2.l
    public final void i(int i13) {
        c cVar = this.f45240i;
        if (cVar != null) {
            cVar.J3(i13);
        }
    }

    @Override // eb2.l
    public final void j(int i13) {
        c cVar = this.f45240i;
        if (cVar != null) {
            cVar.J3(i13);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(43, new jh0.d(this, 15));
    }

    public /* synthetic */ BoardMoreBoardsView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardMoreBoardsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, eo1.c.space_200);
        this.f45238g = W;
        getPinterestRecyclerView().f52531a.m(new k(false, 0, 0, W, 0));
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        eb2.m mVar = new eb2.m(2, recyclerView, getLinearLayoutManager());
        mVar.f58273i = this;
        mVar.b(getPinterestRecyclerView().f52531a);
        View findViewById = findViewById(d.board_more_boards_carousel_index_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        CarouselIndexView carouselIndexView = (CarouselIndexView) findViewById;
        this.f45236e = carouselIndexView;
        carouselIndexView.c(eo1.b.color_background_inverse_base, eo1.b.color_background_secondary_base);
        carouselIndexView.e(0);
        View findViewById2 = findViewById(d.board_more_boards_header);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45237f = (GestaltText) findViewById2;
        this.f45241j = xk2.m.b(el0.d.f59566i);
    }
}
