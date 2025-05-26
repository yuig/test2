package com.pinterest.feature.shopping.shoppingcomponents.productfilters;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le0.h;
import mz1.c;
import mz1.e;
import mz1.f;
import mz1.g;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/productfilters/ProductFilterIcon;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProductFilterIcon extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f48478a;

    /* renamed from: b, reason: collision with root package name */
    public final View f48479b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIcon(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), f.filter_button_v2_selected, this);
        setContentDescription(getResources().getString(h.content_description_product_filter));
        setVisibility(8);
        View findViewById = findViewById(e.filter_button_badge_selected);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48478a = (ImageView) findViewById;
        View findViewById2 = findViewById(e.filter_button_badge_selected_with_count);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(findViewById2.getResources().getDimension(c.filter_button_badge_corner_radius));
        gradientDrawable.setStroke(findViewById2.getResources().getDimensionPixelOffset(c.filter_button_badge_stroke), b.y0(findViewById2, a.comp_icon_color_inverse));
        gradientDrawable.setColors(new int[]{b.y0(findViewById2, a.comp_icon_color_default), b.y0(findViewById2, a.comp_icon_color_default)});
        findViewById2.setBackground(gradientDrawable);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48479b = findViewById2;
        View findViewById3 = findViewById(e.filter_button_badge_selected_with_count_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48480c = (GestaltText) findViewById3;
    }

    public final void a(boolean z13) {
        bs1.c.R1(this.f48478a, z13);
        if (z13) {
            bs1.c.R1(this.f48479b, false);
        }
    }

    public final void b(int i13) {
        String string;
        View view = this.f48479b;
        if (i13 < 1) {
            view.setVisibility(8);
            return;
        }
        this.f48478a.setVisibility(8);
        view.setVisibility(0);
        if (i13 <= 9) {
            string = String.valueOf(i13);
        } else if (10 > i13 || i13 >= 100) {
            string = getContext().getString(g.filter_button_badge_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = String.valueOf(i13);
        }
        a0.p(this.f48480c, string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIcon(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), f.filter_button_v2_selected, this);
        setContentDescription(getResources().getString(h.content_description_product_filter));
        setVisibility(8);
        View findViewById = findViewById(e.filter_button_badge_selected);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48478a = (ImageView) findViewById;
        View findViewById2 = findViewById(e.filter_button_badge_selected_with_count);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(findViewById2.getResources().getDimension(c.filter_button_badge_corner_radius));
        gradientDrawable.setStroke(findViewById2.getResources().getDimensionPixelOffset(c.filter_button_badge_stroke), b.y0(findViewById2, a.comp_icon_color_inverse));
        gradientDrawable.setColors(new int[]{b.y0(findViewById2, a.comp_icon_color_default), b.y0(findViewById2, a.comp_icon_color_default)});
        findViewById2.setBackground(gradientDrawable);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48479b = findViewById2;
        View findViewById3 = findViewById(e.filter_button_badge_selected_with_count_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48480c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIcon(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), f.filter_button_v2_selected, this);
        setContentDescription(getResources().getString(h.content_description_product_filter));
        setVisibility(8);
        View findViewById = findViewById(e.filter_button_badge_selected);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48478a = (ImageView) findViewById;
        View findViewById2 = findViewById(e.filter_button_badge_selected_with_count);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(findViewById2.getResources().getDimension(c.filter_button_badge_corner_radius));
        gradientDrawable.setStroke(findViewById2.getResources().getDimensionPixelOffset(c.filter_button_badge_stroke), b.y0(findViewById2, a.comp_icon_color_inverse));
        gradientDrawable.setColors(new int[]{b.y0(findViewById2, a.comp_icon_color_default), b.y0(findViewById2, a.comp_icon_color_default)});
        findViewById2.setBackground(gradientDrawable);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48479b = findViewById2;
        View findViewById3 = findViewById(e.filter_button_badge_selected_with_count_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48480c = (GestaltText) findViewById3;
    }
}
