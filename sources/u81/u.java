package u81;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class u extends FrameLayout implements m81.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f121096c = 0;

    /* renamed from: a, reason: collision with root package name */
    public m81.o f121097a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f121098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        proportionalImageView.f52576J = 1.33f;
        proportionalImageView.setOnClickListener(new x61.e(this, 17));
        this.f121098b = proportionalImageView;
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        int dimensionPixelSize = gestaltIconButton.getResources().getDimensionPixelSize(r0.margin_half);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        com.bumptech.glide.c.a1(layoutParams, 0, dimensionPixelSize, dimensionPixelSize, 0);
        gestaltIconButton.setLayoutParams(layoutParams);
        gestaltIconButton.t(c.f121007p);
        gestaltIconButton.u(new l11.p(this, 20));
        addView(proportionalImageView);
        addView(gestaltIconButton);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f121097a = null;
        super.onDetachedFromWindow();
    }
}
