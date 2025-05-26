package oq;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f97130c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f97131a;

    /* renamed from: b, reason: collision with root package name */
    public Object f97132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, int i13) {
        super(context);
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f97132b = p0.SHOW_TRANSLATION;
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(n.f97104w);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = bs1.c.W(gestaltText, eo1.c.space_100);
            layoutParams.bottomMargin = bs1.c.W(gestaltText, eo1.c.space_100);
            gestaltText.setLayoutParams(layoutParams);
            int W = bs1.c.W(gestaltText, eo1.c.space_100);
            gestaltText.setPaddingRelative(0, W, 0, W);
            this.f97131a = gestaltText;
            addView(gestaltText);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        int i14 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f97131a = new ColorDrawable(context.getColor(i14));
        bs1.c.s1(this, -2, -2, null, 4);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.bottom_nav_badge_padding);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.bottom_nav_badge_icon_size);
        WebImageView webImageView = new WebImageView(context);
        webImageView.i2(true);
        webImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f97132b = webImageView;
        bs1.c.s1(webImageView, dimensionPixelSize, dimensionPixelSize, null, 4);
        Object obj2 = (bb2.j) this.f97132b;
        Intrinsics.g(obj2, "null cannot be cast to non-null type android.view.View");
        addView((View) obj2);
        setBackgroundResource(k60.a.bottom_nav_content_badge_circle_bg);
    }

    public final void a(p0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f97132b = state;
        ((GestaltText) this.f97131a).i(new z3.m(state, 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, String displayName, String str) {
        super(context);
        int y03;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        View.inflate(context, aq1.f.view_idea_pin_sticker_category_cell, this);
        View findViewById = findViewById(aq1.d.gestalt_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f97131a = gestaltText;
        View findViewById2 = findViewById(aq1.d.gestalt_text_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f97132b = (FrameLayout) findViewById2;
        pk.a0.p(gestaltText, displayName);
        FrameLayout frameLayout = (FrameLayout) this.f97132b;
        if (str != null) {
            y03 = Color.parseColor(str);
        } else {
            nv0.o.f92363a.getClass();
            y03 = dl2.b.y0(this, nv0.c.f92352b);
        }
        frameLayout.setBackgroundColor(y03);
    }
}
