package q21;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;

/* loaded from: classes5.dex */
public final class k extends RoundedCornersLayout implements o21.a {

    /* renamed from: f, reason: collision with root package name */
    public final g f102163f;

    /* renamed from: g, reason: collision with root package name */
    public final int f102164g;

    /* renamed from: h, reason: collision with root package name */
    public int f102165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(context, i13);
        this.f102163f = gVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_border_width_large) * 2;
        this.f102164g = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.lego_border_width_large) + dimensionPixelSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setLayoutParams(layoutParams);
        addView(gVar);
        int i14 = s0.rounded_dual_stroke_border_transparent;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
        g(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        ef0.a cornerSettings = new ef0.a(dimensionPixelSize2, 6);
        Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
        this.f44944e = cornerSettings;
    }

    @Override // o21.a
    public final void V(int i13, int i14) {
        int i15 = this.f102164g;
        this.f102163f.V(i13 - i15, i14 - i15);
    }

    @Override // o21.a
    public final void e4(String imageUrl, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f102163f.e4(imageUrl, str);
    }

    @Override // o21.a
    public final void q0(int i13) {
        this.f102165h = i13;
    }

    @Override // android.view.View, o21.a
    public final void setSelected(boolean z13) {
        Drawable drawable;
        super.setSelected(z13);
        if (z13) {
            Context context = getContext();
            int i13 = ty1.b.rounded_dual_stroke_border;
            Object obj = d5.a.f53679a;
            drawable = context.getDrawable(i13);
        } else {
            Context context2 = getContext();
            int i14 = s0.rounded_dual_stroke_border_transparent;
            Object obj2 = d5.a.f53679a;
            drawable = context2.getDrawable(i14);
        }
        setBackground(drawable);
    }
}
