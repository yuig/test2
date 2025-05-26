package q21;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageViewContainer;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.s0;

/* loaded from: classes5.dex */
public final class g extends WebImageViewContainer implements o21.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102153e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f102154c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f102155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        b2(getResources().getDimensionPixelSize(i13));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        b().setScaleType(scaleType);
        Y(new f(this));
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b.f102130k);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gestaltText.getResources().getDimensionPixelOffset(r0.fixed_size_pin_image_attribution_gradient_height));
        layoutParams.gravity = 80;
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.setHorizontallyScrolling(true);
        this.f102155d = gestaltText;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int dimensionPixelOffset = frameLayout.getResources().getDimensionPixelOffset(r0.margin_half);
        frameLayout.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        int i14 = s0.pin_article_story_attribution_gradient;
        Object obj = d5.a.f53679a;
        frameLayout.setBackground(context.getDrawable(i14));
        frameLayout.addView(gestaltText);
        bs1.c.X0(frameLayout);
        this.f102154c = frameLayout;
        addView(frameLayout);
    }

    @Override // o21.a
    public final void V(int i13, int i14) {
        getLayoutParams().width = i13;
        getLayoutParams().height = i14;
        post(new vs0.b(this, 19));
    }

    @Override // o21.a
    public final void e4(String imageUrl, String str) {
        int color;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (str == null || str.length() == 0) {
            Context context = getContext();
            int i13 = eo1.b.color_themed_light_gray;
            Object obj = d5.a.f53679a;
            color = context.getColor(i13);
        } else {
            color = Color.parseColor(str);
        }
        V1(imageUrl, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(color), (r18 & 64) != 0 ? null : null, null);
    }

    @Override // o21.a
    public final void q0(int i13) {
    }

    @Override // android.view.View, o21.a
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        dispatchSetSelected(z13);
    }
}
