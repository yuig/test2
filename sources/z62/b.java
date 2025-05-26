package z62;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f140894a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f140895b;

    public b() {
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(64, 255, 255, 255));
        paint.setStyle(Paint.Style.FILL);
        this.f140894a = paint;
        this.f140895b = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f140895b, this.f140894a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        RectF rectF = new RectF(bounds);
        Path path = this.f140895b;
        path.reset();
        path.moveTo(rectF.left, rectF.top);
        path.rLineTo(rectF.width(), rectF.top);
        path.rLineTo((-rectF.width()) / 2.0f, rectF.height());
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f140894a.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f140894a.setColorFilter(colorFilter);
    }
}
