package e4;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class k extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f57163a;

    public k(float f13) {
        this.f57163a = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f57163a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f57163a);
    }
}
