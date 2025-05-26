package uv1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f123208a;

    /* renamed from: b, reason: collision with root package name */
    public final float f123209b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f123210c;

    public i(int[] colors, float f13, float f14) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f123208a = colors;
        this.f123209b = f13;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f14);
        this.f123210c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        RectF rectF = new RectF(bounds);
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f123208a, (float[]) null, Shader.TileMode.CLAMP);
        Path path = new Path();
        float f13 = this.f123209b;
        path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        Paint paint = this.f123210c;
        paint.setShader(linearGradient);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f123210c.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f123210c.setColorFilter(colorFilter);
    }
}
