package com.pinterest.feature.storypin.creation.interesttagging.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import d5.a;
import dl2.b;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/creation/interesttagging/view/ShoppingBrandCapsule;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShoppingBrandCapsule extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48575a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f48576b;

    public ShoppingBrandCapsule(ContextWrapper contextWrapper) {
        super(contextWrapper);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        b.y2(gestaltText);
        this.f48575a = gestaltText;
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.U1(c.lego_corner_radius_xlarge);
        Context context2 = proportionalImageView.getContext();
        int i13 = eo1.b.color_themed_background_dark_opacity_300;
        Object obj = a.f53679a;
        proportionalImageView.setColorFilter(context2.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        int dimensionPixelSize = proportionalImageView.getResources().getDimensionPixelSize(dq1.a.shopping_brand_capsule_icon_size);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f48576b = proportionalImageView;
        setOrientation(0);
        setBackground(getContext().getDrawable(dq1.b.rounded_capsule_brio_light_grey));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin_half);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, dimensionPixelOffset, dimensionPixelOffset, 0);
        setLayoutParams(layoutParams);
        proportionalImageView.setBackgroundDrawable(getContext().getDrawable(dq1.b.round_white_border));
        addView(proportionalImageView);
        addView(gestaltText);
    }

    public final void a() {
        bs1.c.R1(this.f48576b, false);
    }

    public final void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48575a, text);
    }

    public final void c(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f48575a.i(new sp.a(20, color));
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        Context context = getContext();
        int i13 = z13 ? dq1.b.rounded_capsule_brio_always_white : dq1.b.rounded_capsule_brio_light_grey;
        Object obj = a.f53679a;
        setBackground(context.getDrawable(i13));
        c(z13 ? vn1.c.DARK : vn1.c.LIGHT);
    }

    public ShoppingBrandCapsule(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        b.y2(gestaltText);
        this.f48575a = gestaltText;
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.U1(c.lego_corner_radius_xlarge);
        Context context3 = proportionalImageView.getContext();
        int i13 = eo1.b.color_themed_background_dark_opacity_300;
        Object obj = a.f53679a;
        proportionalImageView.setColorFilter(context3.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        int dimensionPixelSize = proportionalImageView.getResources().getDimensionPixelSize(dq1.a.shopping_brand_capsule_icon_size);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f48576b = proportionalImageView;
        setOrientation(0);
        setBackground(getContext().getDrawable(dq1.b.rounded_capsule_brio_light_grey));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin_half);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, dimensionPixelOffset, dimensionPixelOffset, 0);
        setLayoutParams(layoutParams);
        proportionalImageView.setBackgroundDrawable(getContext().getDrawable(dq1.b.round_white_border));
        addView(proportionalImageView);
        addView(gestaltText);
    }

    public ShoppingBrandCapsule(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        b.y2(gestaltText);
        this.f48575a = gestaltText;
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.U1(c.lego_corner_radius_xlarge);
        Context context3 = proportionalImageView.getContext();
        int i14 = eo1.b.color_themed_background_dark_opacity_300;
        Object obj = a.f53679a;
        proportionalImageView.setColorFilter(context3.getColor(i14), PorterDuff.Mode.SRC_ATOP);
        int dimensionPixelSize = proportionalImageView.getResources().getDimensionPixelSize(dq1.a.shopping_brand_capsule_icon_size);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f48576b = proportionalImageView;
        setOrientation(0);
        setBackground(getContext().getDrawable(dq1.b.rounded_capsule_brio_light_grey));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin_half);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, dimensionPixelOffset, dimensionPixelOffset, 0);
        setLayoutParams(layoutParams);
        proportionalImageView.setBackgroundDrawable(getContext().getDrawable(dq1.b.round_white_border));
        addView(proportionalImageView);
        addView(gestaltText);
    }
}
