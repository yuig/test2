package bj0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.t0;
import m60.v0;
import nx.d0;
import nx.o0;
import so.jb;
import xk2.m;
import xk2.v;
import yq0.z;

/* loaded from: classes5.dex */
public final class e extends BaseRecyclerContainerView implements zi0.b, ky.h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22950b;

    /* renamed from: c, reason: collision with root package name */
    public final v f22951c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f22952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f22951c = m.b(c.f22946i);
        View findViewById = findViewById(t0.article_carousel_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22952d = (GestaltText) findViewById;
        getPinterestRecyclerView().a(new jd0.a(getResources().getDimensionPixelSize(r0.bubble_spacing), 0));
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var != null ? new zy.m[]{new tq0.a(clock, d0Var)} : super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f22951c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return v0.view_story_article_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return t0.article_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f22950b) {
            return;
        }
        this.f22950b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((f) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE, new d(this, pinalytics, 0));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO, new d(this, pinalytics, 1));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, new d(this, pinalytics, 2));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED, new d(this, pinalytics, 3));
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }
}
