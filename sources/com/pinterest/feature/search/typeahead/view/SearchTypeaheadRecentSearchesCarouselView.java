package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import k71.l;
import ko0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n42.a;
import n42.c;
import n42.d;
import org.jetbrains.annotations.NotNull;
import q71.k0;
import so.jb;
import w01.e0;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadRecentSearchesCarouselView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lk71/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadRecentSearchesCarouselView extends BaseRecyclerContainerView implements l {

    /* renamed from: b, reason: collision with root package name */
    public boolean f47884b;

    /* renamed from: c, reason: collision with root package name */
    public final v f47885c;

    /* renamed from: d, reason: collision with root package name */
    public PinterestRecyclerView f47886d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadRecentSearchesCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f47885c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return d.search_typeahead_recent_searches_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return c.recent_searches_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        View findViewById = findViewById(c.recent_searches_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47886d = (PinterestRecyclerView) findViewById;
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.search_autocomplete_recent_searches_inter_spacing) / 2;
        PinterestRecyclerView pinterestRecyclerView = this.f47886d;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        pinterestRecyclerView.a(new b(dimensionPixelSize, 0));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(a.search_autocomplete_recent_searches_container_horizontal_spacing);
        setPaddingRelative(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f47884b) {
            return;
        }
        this.f47884b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((k0) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(14, new e0(this, 28));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadRecentSearchesCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f47885c = m.b(q71.v.f102771l);
    }
}
