package xi0;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kh2.g3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.r0;
import pk.a0;
import z32.n1;

/* loaded from: classes5.dex */
public abstract class f extends CardView implements vi0.b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f135010l = 0;

    /* renamed from: h, reason: collision with root package name */
    public wi0.b f135011h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f135012i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltAvatar f135013j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f135014k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(e.f135008k);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.margin_half);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, 0, dimensionPixelSize, 0);
        gestaltText.setLayoutParams(layoutParams);
        this.f135012i = gestaltText;
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_300));
        webImageView.f52564p = new yv1.g(1);
        this.f135013j = new GestaltAvatar(6, context, (AttributeSet) null).H2(e.f135007j);
        ImageView imageView = new ImageView(context);
        int dimensionPixelSize2 = imageView.getResources().getDimensionPixelSize(r0.thumbnail_xsmall_size);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        int dimensionPixelSize3 = imageView.getResources().getDimensionPixelSize(eo1.c.space_200);
        layoutParams2.setMargins(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(dl2.b.x0(context, eo1.a.color_white_mochimalist_0_opacity_80));
        shapeDrawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
        imageView.setBackground(shapeDrawable);
        imageView.setVisibility(8);
        this.f135014k = imageView;
        setElevation(getResources().getDimension(eo1.c.ignore));
        t(getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium));
        setOnClickListener(new tq.j(this, 28));
    }

    public abstract l D();

    public void L() {
        WebImageView x13 = x();
        Intrinsics.g(x13, "null cannot be cast to non-null type android.view.View");
        addView(x13);
        addView(this.f135012i);
        addView(this.f135013j);
        addView(this.f135014k);
    }

    public final void T(n1 n1Var) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BitmapDrawable j03 = g3.j0(context, n1Var);
        ImageView imageView = this.f135014k;
        imageView.setImageDrawable(j03);
        bs1.c.R1(imageView, j03 != null);
    }

    public void U2(String str) {
        setContentDescription(getResources().getString(x50.a.content_description_article_view, str));
    }

    public void f() {
        pe.i.K(this.f135013j);
    }

    public void j1(vi0.c viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        a0.p(this.f135012i, viewModel.f125870h);
        x().loadUrl((String) CollectionsKt.firstOrNull(viewModel.f125871i));
        WebImageView x13 = x();
        WebImageView x14 = x();
        Intrinsics.g(x14, "null cannot be cast to non-null type android.view.View");
        Context context = x14.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x13.setBackgroundColor(((Number) viewModel.f125872j.a(context)).intValue());
        T(viewModel.f125873k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeAllViews();
        L();
    }

    public abstract WebImageView x();
}
