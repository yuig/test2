package sg1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends FrameLayout implements rg1.a {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f112873a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f112874b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f112875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, webImageView.getResources().getDimensionPixelSize(b80.a.article_feed_header_height)));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_300));
        this.f112873a = webImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(c.space_600);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f112870j);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f112874b = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(a.f112871k);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f112875c = gestaltText2;
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(c.margin_half));
        addView(webImageView);
        addView(linearLayout);
        linearLayout.addView(gestaltText);
        linearLayout.addView(gestaltText2);
    }
}
