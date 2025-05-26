package e4;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f57166a;

    public m(Typeface typeface) {
        this.f57166a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.f57166a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.f57166a);
    }
}
