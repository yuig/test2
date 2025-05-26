package xo0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import r1.j0;

/* loaded from: classes5.dex */
public final class x extends d implements nx.v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f135630m = 0;

    /* renamed from: j, reason: collision with root package name */
    public uo0.c f135631j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltAvatar f135632k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f135633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        gestaltAvatar.H2(c.f135581p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = gestaltAvatar.getResources().getDimensionPixelSize(eo1.c.space_200);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        gestaltAvatar.setLayoutParams(layoutParams);
        this.f135632k = gestaltAvatar;
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
        this.f135633l = imageView;
        this.f135588g = eo1.c.font_size_300;
        addView(gestaltAvatar);
        addView(imageView);
        setOnClickListener(new lj0.a(this, 14));
    }

    @Override // xo0.d, uo0.d
    public final void K2(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        GestaltAvatar gestaltAvatar = this.f135632k;
        m0.V0(gestaltAvatar, user);
        gestaltAvatar.H2(c.f135583r);
        this.f135586e.i(new j0(1, 22));
    }

    @Override // uo0.d
    public final void f() {
        this.f135632k.H2(c.f135582q);
        this.f135586e.i(new j0(2, 22));
    }

    @Override // xo0.d
    public final ProportionalImageView i() {
        ProportionalImageView proportionalImageView = new ProportionalImageView(getContext());
        proportionalImageView.f52576J = 0.5f;
        proportionalImageView.U1(eo1.c.lego_corner_radius_medium);
        Context context = proportionalImageView.getContext();
        int i13 = eo1.b.color_themed_background_dark_opacity_300;
        Object obj = d5.a.f53679a;
        proportionalImageView.setColorFilter(context.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, proportionalImageView.getResources().getDimensionPixelSize(c80.b.bubble_size)));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        proportionalImageView.f52564p = new yv1.g(1);
        return proportionalImageView;
    }

    @Override // xo0.d
    public final GestaltText j() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(c.f135580o);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(r0.margin_half);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        gestaltText.setLayoutParams(layoutParams);
        dl2.b.y2(gestaltText);
        return gestaltText;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f135631j;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f135631j;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
