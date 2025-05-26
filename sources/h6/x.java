package h6;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class x extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f67762b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f67761a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f67763c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f67764d = 1.0f;

    public x(g0 g0Var) {
        com.bumptech.glide.d.s(g0Var, "rasterizer cannot be null");
        this.f67762b = g0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f67761a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        g0 g0Var = this.f67762b;
        this.f67764d = abs / (g0Var.c().a(14) != 0 ? r8.f71621b.getShort(r1 + r8.f71620a) : (short) 0);
        i6.a c13 = g0Var.c();
        int a13 = c13.a(14);
        if (a13 != 0) {
            c13.f71621b.getShort(a13 + c13.f71620a);
        }
        short s13 = (short) ((g0Var.c().a(12) != 0 ? r5.f71621b.getShort(r7 + r5.f71620a) : (short) 0) * this.f67764d);
        this.f67763c = s13;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s13;
    }
}
