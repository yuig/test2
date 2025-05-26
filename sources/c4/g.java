package c4;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f25634a = new g();

    public final void a(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(@NotNull Canvas canvas, int i13, @NotNull BlendMode blendMode) {
        canvas.drawColor(i13, blendMode);
    }

    public final void c(@NotNull Canvas canvas, long j13) {
        canvas.drawColor(j13);
    }

    public final void d(@NotNull Canvas canvas, long j13, @NotNull BlendMode blendMode) {
        canvas.drawColor(j13, blendMode);
    }

    public final void e(@NotNull Canvas canvas, @NotNull RectF rectF, float f13, float f14, @NotNull RectF rectF2, float f15, float f16, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f13, f14, rectF2, f15, f16, paint);
    }

    public final void f(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(@NotNull Canvas canvas, @NotNull MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, @NotNull Paint paint) {
        canvas.drawTextRun(measuredText, i13, i14, i15, i16, f13, f14, z13, paint);
    }

    public final void i(@NotNull Canvas canvas) {
        canvas.enableZ();
    }
}
