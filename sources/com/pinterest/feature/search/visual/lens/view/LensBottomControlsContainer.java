package com.pinterest.feature.search.visual.lens.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.imageview.ProportionalImageView;
import d5.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m81.r;
import org.jetbrains.annotations.NotNull;
import u81.c;
import uc2.b;
import uc2.d;
import uc2.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/view/LensBottomControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LensBottomControlsContainer extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48045i = 0;

    /* renamed from: a, reason: collision with root package name */
    public r f48046a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f48047b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f48048c;

    /* renamed from: d, reason: collision with root package name */
    public final ProportionalImageView f48049d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f48050e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f48051f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48052g;

    /* renamed from: h, reason: collision with root package name */
    public final int f48053h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LensBottomControlsContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a, reason: from getter */
    public final FrameLayout getF48050e() {
        return this.f48050e;
    }

    /* renamed from: b, reason: from getter */
    public final ProportionalImageView getF48049d() {
        return this.f48049d;
    }

    /* renamed from: c, reason: from getter */
    public final FrameLayout getF48047b() {
        return this.f48047b;
    }

    /* renamed from: d, reason: from getter */
    public final LinearLayout getF48051f() {
        return this.f48051f;
    }

    public final void e() {
        this.f48047b.setClickable(true);
        this.f48051f.setClickable(true);
        this.f48049d.setClickable(true);
    }

    public final void f(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ProportionalImageView proportionalImageView = this.f48049d;
        proportionalImageView.setImageDrawable(null);
        proportionalImageView.U1(b.lens_15_gallery_icon_corner_radius);
        proportionalImageView.M1(proportionalImageView.getResources().getDimensionPixelOffset(b.lens_15_gallery_icon_border_width));
        Context context = proportionalImageView.getContext();
        int i13 = eo1.b.color_white_mochimalist_0;
        Object obj = a.f53679a;
        proportionalImageView.o0(context.getColor(i13));
        proportionalImageView.setScaleX(1.0f);
        proportionalImageView.setScaleY(1.0f);
        File file = new File(path);
        int i14 = this.f48052g;
        proportionalImageView.P0(file, i14, i14);
    }

    public final void g(r rVar) {
        this.f48046a = rVar;
    }

    public final void h(boolean z13) {
        if (z13) {
            LinearLayout linearLayout = this.f48051f;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new u81.b(this, 2));
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.f48053h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LensBottomControlsContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        float f13 = hf0.b.f69002b;
        View.inflate(context, f.lens_bottom_controls_container, this);
        View findViewById = findViewById(d.camera_shutter_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f48047b = frameLayout;
        View findViewById2 = findViewById(d.shutter_inner);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(d.shutter_outer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48048c = (ImageView) findViewById3;
        View findViewById4 = findViewById(d.lens_gallery_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById4;
        this.f48050e = frameLayout2;
        View findViewById5 = findViewById(d.lens_gallery_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById5;
        this.f48049d = proportionalImageView;
        View findViewById6 = findViewById(d.makeup_try_on_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48051f = (LinearLayout) findViewById6;
        frameLayout.setOnClickListener(new u81.b(this, 0));
        proportionalImageView.setOnClickListener(new u81.b(this, 1));
        proportionalImageView.setImageDrawable(new GestaltIcon(context).g2(c.f121001j).getDrawable());
        proportionalImageView.setScaleX(0.6f);
        proportionalImageView.setScaleY(0.6f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.lens_gallery_icon_size);
        this.f48052g = dimensionPixelSize;
        float f14 = 2;
        float dimensionPixelSize2 = (f13 - getResources().getDimensionPixelSize(b.lens_shutter_size)) / f14;
        int i14 = (int) ((dimensionPixelSize2 - dimensionPixelSize) / f14);
        this.f48053h = (int) ((dimensionPixelSize2 - getResources().getDimensionPixelSize(b.tryon_icon_size)) / f14);
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i14);
    }
}
