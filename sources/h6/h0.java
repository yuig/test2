package h6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class h0 extends x {

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f67722e;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i13, i14, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f67722e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f67722e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f13, i15, f13 + this.f67763c, i17, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        m.a().getClass();
        float f14 = i16;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        g0 g0Var = this.f67762b;
        com.google.firebase.messaging.q qVar = g0Var.f67717b;
        Typeface typeface = (Typeface) qVar.f33806d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) qVar.f33804b, g0Var.f67716a * 2, 2, f13, f14, paint2);
        paint2.setTypeface(typeface2);
    }
}
