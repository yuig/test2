package l11;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class n extends y2 implements f11.f {

    /* renamed from: u, reason: collision with root package name */
    public final int f81455u;

    /* renamed from: v, reason: collision with root package name */
    public final int f81456v;

    /* renamed from: w, reason: collision with root package name */
    public final Drawable f81457w;

    /* renamed from: x, reason: collision with root package name */
    public final bb2.j f81458x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f81459y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f81455u = view.getResources().getDimensionPixelOffset(eo1.c.corner_radius);
        this.f81456v = view.getResources().getDimensionPixelOffset(r0.margin_quarter);
        Context context = view.getContext();
        int i13 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        this.f81457w = context.getDrawable(i13);
        KeyEvent.Callback findViewById = view.findViewById(f02.c.carousel_pin_cell_item_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f81458x = (bb2.j) findViewById;
        View findViewById2 = view.findViewById(f02.c.carousel_pin_cell_item_imageless_pin);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f81459y = (FrameLayout) findViewById2;
    }
}
