package ic0;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, a indicatorModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicatorModel, "indicatorModel");
        IconView iconView = new IconView(context);
        int b03 = c.b0(iconView, eo1.c.space_400);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b03, b03);
        int b04 = c.b0(iconView, eo1.c.space_100);
        layoutParams.setMargins(0, b04, b04, b04);
        layoutParams.gravity = 16;
        iconView.setLayoutParams(layoutParams);
        WebImageView webImageView = new WebImageView(context);
        int b05 = c.b0(webImageView, eo1.c.space_400);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b05, b05);
        int b06 = c.b0(webImageView, eo1.c.space_100);
        Intrinsics.checkNotNullParameter(layoutParams2, "<this>");
        com.bumptech.glide.c.a1(layoutParams2, b06, b06, b06, b06);
        layoutParams2.gravity = 16;
        webImageView.setLayoutParams(layoutParams2);
        webImageView.i2(true);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.setBackgroundColor(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_200));
        webImageView.a2(true);
        setOrientation(0);
        setBackgroundResource(ga2.c.indicator_background);
        addView(webImageView);
        addView(iconView);
        String str = indicatorModel.f72062a;
        if (str != null) {
            webImageView.setVisibility(0);
            webImageView.loadUrl(str);
        }
        Integer num = indicatorModel.f72063b;
        if (num != null) {
            int intValue = num.intValue();
            iconView.setVisibility(0);
            iconView.setImageDrawable(c.f0(this, intValue, Integer.valueOf(eo1.b.color_themed_icon_default), null, 4));
        }
    }
}
