package xo0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import df.j1;
import h32.g0;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import rq.c2;
import so.jb;

/* loaded from: classes5.dex */
public final class v extends d implements nx.v {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f135623p = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f135624j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f135625k;

    /* renamed from: l, reason: collision with root package name */
    public final g0 f135626l;

    /* renamed from: m, reason: collision with root package name */
    public uo0.c f135627m;

    /* renamed from: n, reason: collision with root package name */
    public String f135628n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f135629o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, d0 pinalytics, g0 g0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        e();
        this.f135625k = pinalytics;
        this.f135626l = g0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(context.getDrawable(eo1.d.rounded_rect_medium_radius_opaque_background));
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_100);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f135629o = linearLayout;
        addView(linearLayout);
        linearLayout.addView(this.f135585d);
        linearLayout.addView(this.f135586e);
        setOnClickListener(new lj0.a(this, 13));
    }

    @Override // lu.a0
    public final void e() {
        if (this.f135624j) {
            return;
        }
        this.f135624j = true;
        s0.z0(this, (ku1.l) ((jb) ((w) generatedComponent())).f113485c.f114476s.get());
    }

    @Override // uo0.d
    public final void f() {
    }

    @Override // xo0.d
    public final void g() {
    }

    @Override // xo0.d
    public final ProportionalImageView i() {
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.f52576J = 1.0f;
        proportionalImageView.U1(eo1.c.rounding_300);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(proportionalImageView.getResources().getDimensionPixelSize(c80.b.bubble_text_forward_image_size), proportionalImageView.getResources().getDimensionPixelSize(c80.b.bubble_text_forward_image_size)));
        bs1.c.R1(proportionalImageView, false);
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        proportionalImageView.f52564p = new yv1.g(1);
        return proportionalImageView;
    }

    @Override // xo0.d
    public final GestaltText j() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new c2(gestaltText, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, gestaltText.getResources().getDimensionPixelSize(c80.b.bubble_text_forward_textview_height), 1.0f);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_400);
        pp2.a.P0(layoutParams, dimensionPixelSize, 0, dimensionPixelSize, 0);
        gestaltText.setLayoutParams(layoutParams);
        return gestaltText;
    }

    @Override // xo0.d
    public final void k(String url, u50.i placeHolderColor) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(placeHolderColor, "placeHolderColor");
        bs1.c.R1(this.f135585d, j1.U0(url));
        super.k(url, placeHolderColor);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f135627m;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f135627m;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f135627m = null;
        super.onDetachedFromWindow();
    }
}
