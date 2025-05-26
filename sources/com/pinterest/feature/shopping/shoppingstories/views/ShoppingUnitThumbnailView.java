package com.pinterest.feature.shopping.shoppingstories.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.b;
import eo1.c;
import f62.a;
import f62.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ol2.e;
import ol2.f;
import oq.h;
import org.jetbrains.annotations.NotNull;
import ye1.g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/views/ShoppingUnitThumbnailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "shoppinglibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShoppingUnitThumbnailView extends ConstraintLayout implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48522h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f48523a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48524b;

    /* renamed from: c, reason: collision with root package name */
    public final View f48525c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f48526d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f48527e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f48528f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f48529g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingUnitThumbnailView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48523a = getResources().getDimension(c.space_200);
        Integer[] numArr = {Integer.valueOf(b.color_blue_skycicle_100), Integer.valueOf(b.color_orange_firetini_100), Integer.valueOf(b.color_red_pushpin_100), Integer.valueOf(b.color_purple_mysticool_100), Integer.valueOf(b.color_green_matchacado_100), Integer.valueOf(b.color_pink_flaminglow_100)};
        e random = f.f96454a;
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        random.getClass();
        int intValue = numArr[f.f96455b.i(6)].intValue();
        View.inflate(context, d.view_shopping_unit_thumbnail, this);
        View findViewById = findViewById(f62.c.shopping_unit_thumbnail_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f48524b = gestaltText;
        View findViewById2 = findViewById(f62.c.shopping_unit_thumbnail_title_bg);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48525c = findViewById2;
        findViewById2.setBackground(bs1.c.f0(this, intValue, null, null, 6));
        View findViewById3 = findViewById(f62.c.shopping_unit_thumbnail_faded_bg);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(f62.c.shopping_unit_thumbnail_image_1);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48526d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(f62.c.shopping_unit_thumbnail_image_2);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48527e = (WebImageView) findViewById5;
        View findViewById6 = findViewById(f62.c.shopping_unit_thumbnail_image_3);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48528f = (WebImageView) findViewById6;
        View findViewById7 = findViewById(f62.c.shopping_unit_thumbnail_image_4);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48529g = (WebImageView) findViewById7;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bs1.c.B(this, intValue), bs1.c.B(this, intValue), 0});
        gradientDrawable.setCornerRadius(0.0f);
        findViewById3.setBackground(gradientDrawable);
        gestaltText.i(g.f138857m);
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void L(WebImageView webImageView, String str) {
        webImageView.loadUrl(str);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.M1(bs1.c.W(webImageView, a.shopping_unit_thumbnail_border_width));
        webImageView.o0(bs1.c.B(webImageView, b.color_background_light));
        float f13 = this.f48523a;
        webImageView.g2(f13, f13, f13, f13);
        webImageView.Y(new h(7, webImageView, this));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int dimensionPixelSize;
        int i13 = a.shopping_unit_no_text_height;
        int lineCount = this.f48524b.getLineCount();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_400);
        int i14 = a.shopping_unit_thumbnail_single_line_text_height;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (lineCount < 1) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(i13) + (resources.getDimensionPixelSize(i14) * lineCount) + (dimensionPixelSize2 * 2);
        }
        View view = this.f48525c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
        getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
