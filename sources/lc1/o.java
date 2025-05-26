package lc1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import ic1.y;
import kc1.w;
import kotlin.jvm.internal.Intrinsics;
import p91.v;
import pk.a0;

/* loaded from: classes5.dex */
public final class o extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82898c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f82899a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f82900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        webImageView.setAdjustViewBounds(true);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        float W = bs1.c.W(webImageView, eo1.c.corner_radius);
        webImageView.g2(W, W, W, W);
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
        this.f82899a = webImageView;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltText.i(hb2.b.f68538l);
        this.f82900b = gestaltText;
        GestaltIcon gestaltIcon = new GestaltIcon(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int W2 = bs1.c.W(gestaltIcon, eo1.c.space_200);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, W2, W2, W2, W2);
        gestaltIcon.setLayoutParams(layoutParams);
        gestaltIcon.g2(hb2.b.f68537k);
        setOrientation(0);
        setGravity(17);
        addView(webImageView);
        addView(gestaltIcon);
        addView(gestaltText);
    }

    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ((WebImageView) this.f82899a).loadUrl(url);
    }

    public final void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p((GestaltText) this.f82900b, text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, y pronounModel, v onClickListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pronounModel, "pronounModel");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f82899a = pronounModel;
        this.f82900b = onClickListener;
        setId(j52.a.selected_pronoun_cell);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(getResources().getDimensionPixelOffset(eo1.c.margin_quarter));
        setLayoutParams(layoutParams);
        GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
        bs1.c.s(gestaltButton, new w(this, 4));
        addView(gestaltButton.e(new ca1.h(this, 11)));
    }
}
