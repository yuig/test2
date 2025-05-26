package com.pinterest.ui.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.g;
import bs1.c;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import hf0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/tabs/TabBarPlaceholderLoadingLayout;", "Lcom/pinterest/ui/components/placeholder/BasePlaceholderLoadingLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidx/appcompat/widget/g", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TabBarPlaceholderLoadingLayout extends BasePlaceholderLoadingLayout {

    /* renamed from: i, reason: collision with root package name */
    public final int f52643i;

    /* renamed from: j, reason: collision with root package name */
    public final int f52644j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f52645k;

    /* renamed from: l, reason: collision with root package name */
    public final int f52646l;

    /* renamed from: m, reason: collision with root package name */
    public final int f52647m;

    /* renamed from: n, reason: collision with root package name */
    public final int f52648n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBarPlaceholderLoadingLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    /* renamed from: b, reason: from getter */
    public final int getF52379k() {
        return this.f52643i;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    /* renamed from: c, reason: from getter */
    public final int getF52380l() {
        return this.f52644j;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    public final View e() {
        View findViewById = findViewById(t0.tab_overlay_gradient_view);
        findViewById.setAlpha(0.0f);
        return findViewById;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    public final void h() {
        LinearLayout linearLayout = this.f52645k;
        if (linearLayout.getChildCount() != 0) {
            return;
        }
        int W = c.W(this, eo1.c.lego_corner_radius_small);
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f52648n) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            g gVar = new g(context, 4);
            int i15 = this.f52647m;
            int i16 = this.f52646l;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i16, i15);
            layoutParams.gravity = 16;
            int i17 = this.f52644j;
            layoutParams.topMargin = i17;
            layoutParams.bottomMargin = i17;
            int i18 = this.f52643i;
            layoutParams.setMarginEnd(i18);
            layoutParams.setMarginStart(i13 == 0 ? i18 : 0);
            Unit unit = Unit.f80348a;
            linearLayout.addView(gVar, layoutParams);
            a(i14, this.f52644j, this.f52647m, this.f52646l, W);
            i14 += i18 + i16;
            i13++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBarPlaceholderLoadingLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52643i = c.W(this, eo1.c.margin_half);
        this.f52644j = c.W(this, eo1.c.space_200);
        this.f52646l = c.W(this, eo1.c.tab_pill_placeholder_width);
        this.f52647m = c.W(this, eo1.c.tab_pill_placeholder_height);
        this.f52648n = (int) Math.ceil((b.f69002b - r4) / (r5 + r4));
        View.inflate(context, v0.tab_bar_placeholder_loading_layout, this);
        View findViewById = findViewById(t0.tab_bar_carousel_loading_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52645k = (LinearLayout) findViewById;
    }
}
