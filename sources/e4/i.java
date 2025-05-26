package e4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f57155a;

    /* renamed from: b, reason: collision with root package name */
    public int f57156b;

    /* renamed from: c, reason: collision with root package name */
    public int f57157c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57158d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f57155a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.r("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f57158d) {
            return this.f57157c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f57158d) {
            return this.f57156b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        this.f57158d = true;
        paint.getTextSize();
        this.f57155a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        this.f57156b = (int) Math.ceil(0.0f);
        this.f57157c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }
}
