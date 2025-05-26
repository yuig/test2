package bj0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import jc0.l;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;

/* loaded from: classes5.dex */
public final class b extends g {

    /* renamed from: f, reason: collision with root package name */
    public final int f22944f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f22945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics, boolean z13) {
        super(context, pinalytics);
        RoundedCornersImageView roundedCornersImageView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        this.f22944f = dimensionPixelOffset;
        GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
        gestaltButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388691));
        ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelOffset, 0, 0, dimensionPixelOffset);
        gestaltButton.d(a.f22938j);
        this.f22945g = gestaltButton;
        this.f22955b = b();
        this.f22956c = e();
        addView(this.f22955b);
        addView(this.f22956c);
        addView(gestaltButton);
        if (!z13 || (roundedCornersImageView = this.f22955b) == null) {
            return;
        }
        roundedCornersImageView.setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_200));
    }

    @Override // bj0.g
    public final RoundedCornersImageView b() {
        RoundedCornersImageView roundedCornersImageView = new RoundedCornersImageView(getContext());
        int dimensionPixelSize = roundedCornersImageView.getResources().getDimensionPixelSize(r0.article_cell_with_button_size);
        roundedCornersImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        roundedCornersImageView.G2(re0.a.PROPORTIONAL_USE_LAYOUT_PARAMS);
        roundedCornersImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedCornersImageView.f52564p = new yv1.g(1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.article_image_corner_radius);
        float f13 = dimensionPixelSize2;
        roundedCornersImageView.g2(f13, f13, f13, f13);
        Context context = getContext();
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        roundedCornersImageView.setBackgroundDrawable(ve.h.A(dimensionPixelSize2, context.getColor(i13)));
        return roundedCornersImageView;
    }

    @Override // bj0.g
    public final GestaltText e() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(gestaltText.getResources().getDimensionPixelSize(r0.article_cell_with_button_size), -2, 8388659));
        int i13 = this.f22944f;
        gestaltText.setPaddingRelative(i13, i13, i13, gestaltText.getPaddingBottom());
        gestaltText.i(a.f22939k);
        return gestaltText;
    }

    @Override // bj0.g, zi0.a
    public final void h(String buttonText) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        bs1.c.s(this.f22945g, new l(buttonText, 22));
    }
}
