package we1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.api.model.xh;
import com.pinterest.api.model.zh;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f129482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh f129484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f129485d;

    public m1(zh zhVar, Function1 function1, lm1.b textTypeFace, int i13, Context context) {
        Typeface a13;
        this.f129484c = zhVar;
        this.f129485d = function1;
        Intrinsics.f(textTypeFace);
        Intrinsics.f(context);
        Intrinsics.checkNotNullParameter(textTypeFace, "textTypeFace");
        Intrinsics.checkNotNullParameter(context, "context");
        if (1 == textTypeFace.getValue()) {
            a13 = f0.h.K(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "context");
            lm1.b FONT_NORMAL = te0.i.f117496c;
            Intrinsics.checkNotNullExpressionValue(FONT_NORMAL, "FONT_NORMAL");
            a13 = te0.g.a(context, FONT_NORMAL, null, 12);
        }
        this.f129482a = a13;
        Object obj = d5.a.f53679a;
        this.f129483b = context.getColor(i13);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(this.f129482a);
        ds2.setColor(this.f129483b);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Function1 function1;
        kg.n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        xh attributionAction = this.f129484c.getAttributionAction();
        String url = attributionAction != null ? attributionAction.getUrl() : null;
        if (url == null || (function1 = this.f129485d) == null) {
            return;
        }
        function1.invoke(url);
    }
}
