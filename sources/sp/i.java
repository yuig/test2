package sp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.ui.grid.pin.ImagelessPinView;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes3.dex */
public final class i extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f114873b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final EmptyView f114874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, ImagelessPinView imagelessPin, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagelessPin, "imagelessPin");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin_none);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r0.margin_half);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(r0.margin_half);
        Drawable I = com.bumptech.glide.c.I(context, eo1.d.white_check_in_red_circle);
        imagelessPin.f52559h = dimensionPixelOffset3;
        int dimensionPixelOffset4 = getResources().getDimensionPixelOffset(yy1.a.pin_marklet_selection_icon_size);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelOffset4, dimensionPixelOffset4));
        imageView.setImageDrawable(I);
        EmptyView emptyView = new EmptyView(context);
        emptyView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        emptyView.setContentDescription(emptyView.getResources().getString(yy1.e.accessibility_image));
        this.f114874a = emptyView;
        addView(imagelessPin);
        addView(imageView);
        addView(emptyView);
        if (z13) {
            imageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imagelessPin.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            return;
        }
        imageView.setVisibility(4);
        ViewGroup.LayoutParams layoutParams2 = imagelessPin.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f114874a.setOnClickListener(new co.a(onClickListener, this, 10));
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f114874a.setOnLongClickListener(new d(1, onLongClickListener, this));
    }
}
