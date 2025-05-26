package com.pinterest.feature.pin.closeup.filters.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.c0;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import eo1.b;
import hf0.c;
import i01.c1;
import i01.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n80.d;
import nx.d0;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import pb0.a;
import pb0.g;
import q01.a0;
import q01.b0;
import so.jb;
import xk2.k;
import xk2.n;
import xk2.v;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/closeup/filters/view/RelatedPinsFiltersCarouselView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Li01/c1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RelatedPinsFiltersCarouselView extends BaseRecyclerContainerView implements c1 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f46960j = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46961b;

    /* renamed from: c, reason: collision with root package name */
    public c f46962c;

    /* renamed from: d, reason: collision with root package name */
    public final v f46963d;

    /* renamed from: e, reason: collision with root package name */
    public d1 f46964e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46965f;

    /* renamed from: g, reason: collision with root package name */
    public final k f46966g;

    /* renamed from: h, reason: collision with root package name */
    public final k f46967h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f46968i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelatedPinsFiltersCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var == null ? new m[0] : new m[]{new xt.k(d0Var, pinalyticsManager)};
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f46963d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return d.related_pins_filters_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return n80.c.related_pins_filters_carousel_rv;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f46961b) {
            return;
        }
        this.f46961b = true;
        jb jbVar = (jb) ((b0) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        this.f46962c = (c) jbVar.f113483a.f113717h7.get();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPinterestRecyclerView().b(this.f46968i);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getPinterestRecyclerView().e(this.f46968i);
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(18992131, new a0(this, 1));
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        super.setPinalytics(pinalytics);
        addImpressionLoggers();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        d1 d1Var;
        super.setVisibility(i13);
        if (i13 != 0 || (d1Var = this.f46964e) == null) {
            return;
        }
        d1Var.x2();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedPinsFiltersCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f46963d = xk2.m.b(q01.z.f101858i);
        n nVar = n.NONE;
        this.f46966g = xk2.m.a(nVar, new a0(this, 0));
        this.f46967h = xk2.m.a(nVar, new b01.c(2, this, context));
        this.f46968i = new c0(this, 17);
        setBackgroundColor(bs1.c.B(this, b.color_themed_background_default));
        getPinterestRecyclerView().a(new eb2.k(true, bs1.c.W(this, eo1.c.lego_brick_quarter), bs1.c.W(this, n80.a.related_pins_filter_rep_vertical_margin), bs1.c.W(this, eo1.c.lego_brick_quarter), bs1.c.W(this, n80.a.related_pins_filter_rep_vertical_margin)));
    }
}
