package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.b1;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import d5.a;
import eo1.b;
import k42.c;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n42.d;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q71.d0;
import q71.e0;
import so.jb;
import x61.e;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadPinCarousel;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lk71/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadPinCarousel extends BaseRecyclerContainerView implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47871g = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47872b;

    /* renamed from: c, reason: collision with root package name */
    public final v f47873c;

    /* renamed from: d, reason: collision with root package name */
    public final v f47874d;

    /* renamed from: e, reason: collision with root package name */
    public final ForegroundColorSpan f47875e;

    /* renamed from: f, reason: collision with root package name */
    public o71.v f47876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadPinCarousel(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f47873c = m.b(q71.v.f102770k);
        this.f47874d = m.b(new d0(this, 2));
        v b13 = m.b(new d0(this, 0));
        Context context2 = getContext();
        int i14 = b.color_gray_500;
        Object obj = a.f53679a;
        this.f47875e = new ForegroundColorSpan(context2.getColor(i14));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(1);
        setBackground(getContext().getDrawable(c.rounded_corners_pressed_state));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200) / 2;
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PinterestRecyclerView) value).a(new ko0.b(dimensionPixelSize, 0));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        setPaddingRelative(K, dimensionPixelSize2, K, dimensionPixelSize2);
        setOnClickListener(new e(this, 9));
        Object value2 = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PinterestRecyclerView) value2).setLayoutParams(new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(n42.a.search_autocomplete_redesign_pin_image_height)));
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f47873c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return d.list_search_typeahead_pin_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return n42.c.pin_carousel;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f47872b) {
            return;
        }
        this.f47872b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((e0) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(7, new d0(this, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadPinCarousel(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
