package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import hf0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import org.jetbrains.annotations.NotNull;
import qa2.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/grid/GridPlaceholderLoadingLayout;", "Lcom/pinterest/ui/components/placeholder/BasePlaceholderLoadingLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "androidx/appcompat/widget/g", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GridPlaceholderLoadingLayout extends BasePlaceholderLoadingLayout {

    /* renamed from: i, reason: collision with root package name */
    public boolean f52377i;

    /* renamed from: j, reason: collision with root package name */
    public final View f52378j;

    /* renamed from: k, reason: collision with root package name */
    public final int f52379k;

    /* renamed from: l, reason: collision with root package name */
    public final int f52380l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f52381m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f52382n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridPlaceholderLoadingLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int j(int i13, int i14, int i15) {
        List list = i13 % 2 == 0 ? g.f103264b : g.f103263a;
        return (int) (((Number) list.get(i14 % list.size())).floatValue() * i15);
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    /* renamed from: b, reason: from getter */
    public final int getF52379k() {
        return this.f52379k;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    /* renamed from: c, reason: from getter */
    public final int getF52380l() {
        return this.f52380l;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    public final View e() {
        if (this.f52377i) {
            return this.f52378j;
        }
        return null;
    }

    @Override // com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout
    public final void h() {
        int i13;
        LinearLayout linearLayout = this.f52381m;
        if (linearLayout.getChildCount() != 0) {
            return;
        }
        this.f52289a.rewind();
        int i14 = b.f69004d;
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int width = getWidth();
        int i15 = this.f52379k;
        int i16 = ((width - ((i14 * i15) * 2)) - paddingEnd) / i14;
        int W = c.W(this, eo1.c.lego_corner_radius_medium);
        int width2 = f() ? getWidth() - getPaddingEnd() : getPaddingStart();
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int height = getHeight();
                i13 = this.f52380l;
                if (i18 >= height) {
                    break;
                }
                int j13 = j(i17, i19, i16);
                i19++;
                i18 += (i13 * 2) + j13;
            }
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            int i23 = i13;
            int i24 = 0;
            while (i24 < i19) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                androidx.appcompat.widget.g gVar = new androidx.appcompat.widget.g(context, this.f52382n);
                int j14 = j(i17, i24, i16);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i16, j14);
                layoutParams.topMargin = i13;
                layoutParams.bottomMargin = i13;
                layoutParams.leftMargin = i15;
                layoutParams.rightMargin = i15;
                linearLayout2.addView(gVar, layoutParams);
                int i25 = i13;
                a(width2, i23, j14, i16, W);
                i23 = (i25 * 2) + j14 + i23;
                i24++;
                linearLayout2 = linearLayout2;
                i13 = i25;
            }
            linearLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -1));
            width2 = f() ? width2 - ((i15 * 2) + i16) : (i15 * 2) + i16 + width2;
        }
    }

    public /* synthetic */ GridPlaceholderLoadingLayout(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridPlaceholderLoadingLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52377i = true;
        int G0 = dl2.b.G0(this, eo1.a.item_horizontal_spacing_half);
        this.f52379k = G0;
        this.f52380l = dl2.b.G0(this, eo1.a.item_vertical_spacing);
        View.inflate(context, v0.grid_placeholder_loading_layout, this);
        View findViewById = findViewById(t0.grid_overlay_gradient_view);
        findViewById.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f52378j = findViewById;
        View findViewById2 = findViewById(t0.grid_loading_placeholder_columns_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52381m = (LinearLayout) findViewById2;
        setPaddingRelative(G0, getPaddingTop(), G0, getPaddingBottom());
        setWillNotDraw(false);
    }
}
