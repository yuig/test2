package xf1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ca1.h;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.t0;
import m60.v0;
import pk.a0;
import yb0.n;

/* loaded from: classes5.dex */
public final class a extends n {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f134841s = 0;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f134842q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f134843r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, v0.story_pin_user_feedback_prompt, null);
        View findViewById = inflate.findViewById(t0.story_pin_user_feedback_prompt_left_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f134842q = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(t0.story_pin_user_feedback_prompt_right_text_view);
        GestaltText gestaltText = (GestaltText) findViewById2;
        gestaltText.j(new h(this, 25));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f134843r = gestaltText;
        View findViewById3 = inflate.findViewById(t0.story_pin_user_feedback_prompt_divider);
        Intrinsics.f(findViewById3);
        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = findViewById3.getResources().getDimensionPixelSize(c.space_600);
        findViewById3.setLayoutParams(marginLayoutParams);
        GestaltText j13 = j();
        ViewGroup.LayoutParams layoutParams2 = j13.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(c.space_400);
        marginLayoutParams2.rightMargin = getResources().getDimensionPixelSize(c.space_400);
        j13.setLayoutParams(marginLayoutParams2);
        LinearLayout i13 = i();
        int dimensionPixelSize = i13.getResources().getDimensionPixelSize(r0.margin_none);
        i13.setPaddingRelative(dimensionPixelSize, i13.getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
        i13.addView(inflate);
    }

    public final void x(String feedbackText, String feedbackTapText) {
        Intrinsics.checkNotNullParameter(feedbackText, "feedbackText");
        Intrinsics.checkNotNullParameter(feedbackTapText, "feedbackTapText");
        a0.q(this.f134842q, bs1.c.h2(feedbackText));
        a0.q(this.f134843r, bs1.c.h2(feedbackTapText));
    }
}
