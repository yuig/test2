package j41;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import eo1.b;
import j41.m;
import kg.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import zp.s0;

/* loaded from: classes5.dex */
public final class m extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f74666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i13, Function0 onLearnMoreClick) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
        this.f74666a = onLearnMoreClick;
        View.inflate(context, nz1.d.view_private_profile_modal_popup_body, this);
        String string = getContext().getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getContext().getResources().getString(x0.learn_more);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        URLSpan uRLSpan = new URLSpan() { // from class: com.pinterest.feature.profile.lego.header.view.PrivateProfileExplainerView$setupBody$urlSpan$1
            {
                super("");
            }

            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View widget) {
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                m.this.f74666a.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds2) {
                Intrinsics.checkNotNullParameter(ds2, "ds");
                Context context2 = m.this.getContext();
                int i14 = b.color_themed_text_default;
                Object obj = a.f53679a;
                ds2.linkColor = context2.getColor(i14);
                super.updateDrawState(ds2);
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(uRLSpan, string.length() + 1, string2.length() + string.length() + 1, 33);
        GestaltText gestaltText = (GestaltText) findViewById(nz1.c.body_text_view);
        int dimensionPixelSize = gestaltText.getContext().getResources().getDimensionPixelSize(eo1.c.space_200);
        gestaltText.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        gestaltText.i(new s0(spannableStringBuilder, 19));
    }
}
