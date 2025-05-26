package n5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f89218a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f89219b;

    public a(Drawable drawable, float f13) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f89218a = drawable;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f13 / 2.0f, Path.Direction.CW);
        this.f89219b = path;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f89219b);
        this.f89218a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f89218a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f89218a.setBounds(bounds);
        this.f89219b.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f89218a.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f89218a.setColorFilter(colorFilter);
    }
}
