package d91;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;

/* loaded from: classes5.dex */
public class m extends RoundedCornersLayout implements rj0.a, ky.h {

    /* renamed from: f, reason: collision with root package name */
    public final d0 f54100f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f54101g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f54102h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f54103i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f54104j;

    /* renamed from: k, reason: collision with root package name */
    public rj0.b f54105k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f54100f = pinalytics;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f54101g = frameLayout;
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webImageView.setBackgroundDrawable(new ColorDrawable(j1.K(context)));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.f52564p = new yv1.g(1);
        frameLayout.addView(webImageView);
        this.f54102h = webImageView;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i13 = u92.a.gradient_black_40_to_transparent_75_percent;
        Object obj = d5.a.f53679a;
        view.setBackground(context.getDrawable(i13));
        addView(view);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int dimensionPixelSize = relativeLayout.getResources().getDimensionPixelSize(r0.margin);
        relativeLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(relativeLayout);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(c.f54053o);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        gestaltText.setEllipsize(TextUtils.TruncateAt.END);
        kh2.j1.o1(gestaltText, 4);
        dl2.b.y2(gestaltText);
        dl2.b.A2(gestaltText);
        relativeLayout.addView(gestaltText);
        this.f54103i = gestaltText;
        GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
        gestaltButton.d(c.f54052n);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(13);
        gestaltButton.setLayoutParams(layoutParams);
        gestaltButton.setGravity(17);
        relativeLayout.addView(gestaltButton);
        this.f54104j = gestaltButton;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        g(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
    }

    @Override // rj0.a
    public final void A(rj0.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f54105k = listener;
    }

    @Override // rj0.a
    public final void M3(int i13) {
        this.f54102h.setImageResource(i13);
    }

    @Override // rj0.a
    public final void T1(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f54103i.i(new sp.a(15, color));
    }

    @Override // ar0.b
    public final boolean b() {
        rj0.b bVar = this.f54105k;
        if (bVar == null) {
            return true;
        }
        bVar.b();
        return true;
    }

    @Override // rj0.a
    public final void c(String str) {
    }

    @Override // rj0.a
    public final void h(String str) {
        this.f54104j.d(new b31.f(str, 29));
    }

    public int i(int i13) {
        return (int) (i13 / 0.75f);
    }

    @Override // rj0.a
    public final void m0(String str) {
        this.f54102h.w2((str == null || str.length() == 0) ? null : Uri.parse(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f1 f1Var = f1.RENDER;
        u0 u0Var = u0.VIRTUAL_TRY_ON_ICON;
        g0 g0Var = g0.DYNAMIC_GRID_STORY;
        d0 d0Var = this.f54100f;
        d0Var.N(f1Var, u0Var, g0Var, null, false);
        f1 f1Var2 = f1.STORY_IMPRESSION_ONE_PIXEL;
        HashMap o13 = ep.b.o("story_type", "virtual_try_on_upsell_story");
        Unit unit = Unit.f80348a;
        d0Var.g(f1Var2, "", o13, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(i(View.MeasureSpec.getSize(i13)), 1073741824));
    }

    @Override // rj0.a
    public final void p(String str) {
        this.f54103i.i(new l(str, 0));
        setContentDescription(str);
    }

    @Override // ky.h
    public ky.g z() {
        return ky.g.OTHER;
    }
}
