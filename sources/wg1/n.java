package wg1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends k {
    public final boolean D;
    public final ArrayList E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, com.google.android.gms.common.api.internal.q pillColorHelper) {
        super(context, pillColorHelper);
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pillColorHelper, "pillColorHelper");
        this.D = hf0.b.m();
        this.f129802s.setGravity(this.f129800q ? 8388611 : 17);
        ViewGroup.LayoutParams layoutParams = this.f129802s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = this.f129800q ? getResources().getDimensionPixelSize(eo1.c.space_200) : getResources().getDimensionPixelSize(eo1.c.space_400);
            marginLayoutParams.leftMargin = this.f129800q ? getResources().getDimensionPixelSize(i82.b.article_immersive_header_height_large) : getResources().getDimensionPixelSize(eo1.c.space_0);
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_0);
        }
        this.f129804u.i(new m(this, 0));
        LinearLayout linearLayout = this.f129801r;
        if (this.f129800q) {
            linearLayout.setGravity(8388627);
            dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_200);
        } else {
            linearLayout.setGravity(17);
            dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_1200);
        }
        linearLayout.setPaddingRelative(dimensionPixelSize, linearLayout.getPaddingTop(), this.f129800q ? context.getResources().getDisplayMetrics().widthPixels / 2 : dimensionPixelSize, linearLayout.getPaddingBottom());
        this.E = k.Z(context);
        this.C.setVisibility(8);
    }

    @Override // wg1.k
    public final void a0() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200) + getResources().getDimensionPixelSize(ga2.b.lego_search_bar_height);
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(i82.b.article_immersive_header_height_large);
        layoutParams2.height = dimensionPixelSize2;
        layoutParams2.width = dimensionPixelSize2;
        layoutParams2.gravity = this.f129800q ? 8388629 : 16;
        WebImageView webImageView = this.f129807x;
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_300));
        float dimensionPixelSize3 = webImageView.getResources().getDimensionPixelSize(eo1.c.space_800);
        webImageView.g2(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        ViewGroup.LayoutParams layoutParams3 = webImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = webImageView.getResources().getDimensionPixelSize(i82.b.article_immersive_header_margin);
        }
        Drawable background = getBackground();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        background.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context, eo1.a.color_background_dark_opacity_200), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // wg1.k
    public final void d0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayout = this.f129801r;
        GestaltText gestaltText = this.f135012i;
        GestaltText gestaltText2 = this.f129805v;
        if (!this.f129800q) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(i82.b.article_immersive_header_height_large);
            }
            gestaltText.i(d.A);
            gestaltText2.i(new m(this, 2));
            ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(i82.b.article_immersive_header_tablet_horizontal_padding);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.leftMargin = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams4 = this.A.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.rightMargin = dimensionPixelSize;
        }
        gestaltText.i(new m(this, 1));
        gestaltText2.i(d.f129751z);
        ViewGroup.LayoutParams layoutParams5 = gestaltText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams6 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        if (marginLayoutParams6 != null) {
            marginLayoutParams6.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams7 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams7 != null) {
            marginLayoutParams7.leftMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
        }
        ViewGroup.LayoutParams layoutParams8 = this.f129802s.getLayoutParams();
        marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
    }

    @Override // wg1.k
    public final void k0() {
        WebImageView webImageView = this.f129809z;
        WebImageView webImageView2 = this.f129807x;
        ViewGroup viewGroup = this.A;
        if (this.f129800q) {
            androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
            ConstraintLayout constraintLayout = viewGroup instanceof ConstraintLayout ? (ConstraintLayout) viewGroup : null;
            pVar.j(constraintLayout);
            Intrinsics.g(webImageView2, "null cannot be cast to non-null type android.view.View");
            pVar.g(webImageView2.getId());
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_100);
            Guideline guideline = new Guideline(getContext());
            guideline.setId(View.generateViewId());
            Guideline guideline2 = new Guideline(getContext());
            guideline2.setId(View.generateViewId());
            Guideline guideline3 = new Guideline(getContext());
            guideline3.setId(View.generateViewId());
            viewGroup.addView(guideline);
            viewGroup.addView(guideline2);
            viewGroup.addView(guideline3);
            pVar.s(guideline.getId(), 1);
            pVar.s(guideline2.getId(), 1);
            pVar.s(guideline3.getId(), 1);
            pVar.G(guideline.getId(), 0.5f);
            pVar.G(guideline2.getId(), 0.6667f);
            pVar.G(guideline3.getId(), 0.8333f);
            Guideline guideline4 = new Guideline(getContext());
            guideline4.setId(View.generateViewId());
            Guideline guideline5 = new Guideline(getContext());
            guideline5.setId(View.generateViewId());
            Guideline guideline6 = new Guideline(getContext());
            guideline6.setId(View.generateViewId());
            viewGroup.addView(guideline4);
            viewGroup.addView(guideline5);
            viewGroup.addView(guideline6);
            pVar.s(guideline4.getId(), 0);
            pVar.s(guideline5.getId(), 0);
            pVar.s(guideline6.getId(), 0);
            pVar.G(guideline4.getId(), 0.54f);
            pVar.G(guideline5.getId(), 0.75f);
            pVar.G(guideline6.getId(), 0.85f);
            ArrayList arrayList = this.E;
            setBackgroundColor(((Number) arrayList.get(0)).intValue());
            pVar.l(webImageView2.getId(), 6, guideline.getId(), 6);
            int i13 = dimensionPixelSize * 2;
            pVar.m(webImageView2.getId(), 7, guideline2.getId(), 6, i13);
            pVar.m(webImageView2.getId(), 3, guideline4.getId(), 4, dimensionPixelSize);
            pVar.l(webImageView2.getId(), 4, 0, 4);
            webImageView2.setTranslationY(getResources().getDimensionPixelSize(eo1.c.space_800));
            int intValue = ((Number) arrayList.get(1)).intValue();
            WebImageView webImageView3 = this.f129808y;
            Intrinsics.g(webImageView3, "null cannot be cast to non-null type android.view.View");
            pVar.l(webImageView3.getId(), 6, guideline2.getId(), 6);
            pVar.l(webImageView3.getId(), 7, guideline3.getId(), 6);
            pVar.n(webImageView3.getId(), getResources().getDimensionPixelSize(eo1.c.space_1500) * 5);
            pVar.m(webImageView3.getId(), 4, guideline5.getId(), 3, dimensionPixelSize);
            View X = X(intValue);
            viewGroup.addView(X);
            pVar.l(X.getId(), 6, guideline2.getId(), 7);
            pVar.l(X.getId(), 7, guideline3.getId(), 6);
            pVar.m(X.getId(), 3, guideline5.getId(), 4, dimensionPixelSize);
            int id3 = X.getId();
            int i14 = (-dimensionPixelSize) * 2;
            pVar.m(id3, 4, 0, 4, i14);
            int intValue2 = ((Number) arrayList.get(2)).intValue();
            Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
            pVar.m(webImageView.getId(), 6, guideline3.getId(), 7, i13);
            pVar.l(webImageView.getId(), 7, 0, 7);
            pVar.n(webImageView.getId(), getResources().getDimensionPixelSize(eo1.c.space_1500) * 5);
            pVar.m(webImageView.getId(), 4, guideline6.getId(), 3, dimensionPixelSize);
            webImageView.setTranslationX(this.f129806w);
            View X2 = X(intValue2);
            viewGroup.addView(X2);
            pVar.m(X2.getId(), 6, guideline3.getId(), 7, i13);
            pVar.m(X2.getId(), 7, 0, 7, i14);
            pVar.m(X2.getId(), 4, 0, 4, i14);
            pVar.m(X2.getId(), 3, guideline6.getId(), 4, dimensionPixelSize);
            pVar.b(constraintLayout);
        } else {
            webImageView2.setColorFilter(dl2.b.y0(webImageView2, eo1.a.color_background_dark_opacity_300));
            ViewGroup.LayoutParams layoutParams = webImageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = webImageView2.getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_margin);
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.height = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_height_large);
            layoutParams3.width = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_width_large);
            Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
            ViewGroup.LayoutParams layoutParams4 = webImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_margin);
            }
            Drawable background = getBackground();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            background.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context, eo1.a.color_background_dark_opacity_200), PorterDuff.Mode.SRC_ATOP));
        }
        g0(true);
    }

    @Override // wg1.k
    public final void o0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GestaltText gestaltText = this.f129805v;
        GestaltText gestaltText2 = this.f135012i;
        if (!this.f129800q) {
            ViewGroup.LayoutParams layoutParams = this.f129801r.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(i82.b.article_immersive_header_three_pins_image_container_height_large);
            }
            gestaltText2.i(d.C);
            gestaltText.i(new m(this, 4));
            return;
        }
        gestaltText2.i(new m(this, 3));
        gestaltText.i(d.B);
        int dimensionPixelSize = getResources().getDimensionPixelSize(i82.b.article_immersive_header_tablet_horizontal_padding);
        ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams3 = gestaltText2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.leftMargin = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams4 = gestaltText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams5 = gestaltText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.leftMargin = dimensionPixelSize;
        }
        LinearLayout linearLayout = this.f129802s;
        ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        if (marginLayoutParams6 != null) {
            marginLayoutParams6.bottomMargin = getResources().getDimensionPixelSize(eo1.c.space_100);
        }
        ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        marginLayoutParams = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(eo1.c.space_200);
    }
}
