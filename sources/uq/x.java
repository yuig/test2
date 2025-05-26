package uq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f123034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123035b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f123036c;

    public x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f123034a = dl2.b.x0(context, eo1.a.color_gray_roboflow_500);
        this.f123035b = dl2.b.x0(context, eo1.a.sema_color_background_default);
        this.f123036c = new RectF();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float f14 = 2;
        float descent = (paint.descent() - paint.ascent()) / f14;
        RectF rectF = this.f123036c;
        rectF.left = f13;
        rectF.top = i15;
        rectF.right = (f14 * descent) + paint.measureText(text, i13, i14) + f13;
        rectF.bottom = i17;
        paint.setColor(this.f123034a);
        canvas.drawRoundRect(rectF, descent, descent, paint);
        paint.setColor(this.f123035b);
        canvas.drawText(text, i13, i14, f13 + descent, i16, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        return ml2.c.c((paint.descent() - paint.ascent()) + paint.measureText(text, i13, i14));
    }
}
