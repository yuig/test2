package te0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kg.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class a extends ClickableSpan {

    /* renamed from: a */
    public final View.OnClickListener f117479a;

    /* renamed from: b */
    public final Typeface f117480b;

    /* renamed from: c */
    public final int f117481c;

    public a(Context context, Integer num, int i13) {
        num = (i13 & 2) != 0 ? Integer.valueOf(eo1.b.color_blue_500) : num;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117479a = null;
        this.f117480b = f0.h.K(context);
        int intValue = num != null ? num.intValue() : eo1.b.color_blue_500;
        Object obj = d5.a.f53679a;
        this.f117481c = context.getColor(intValue);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Unit unit;
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View.OnClickListener onClickListener = this.f117479a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("onClick was not implemented");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.f117480b);
        paint.setColor(this.f117481c);
    }
}
