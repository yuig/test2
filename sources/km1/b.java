package km1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import jm1.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends Drawable {

    /* renamed from: c, reason: collision with root package name */
    public static final c f80203c = c.HORIZONTAL;

    /* renamed from: a, reason: collision with root package name */
    public final int f80204a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f80205b;

    public b(Context context) {
        a initialState = new a();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        int F0 = dl2.b.F0(context, eo1.a.comp_divider_stroke_height);
        this.f80204a = F0;
        Paint paint = new Paint();
        paint.setColor(dl2.b.x0(context, eo1.a.comp_divider_background_color));
        paint.setStrokeWidth(F0);
        this.f80205b = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.f80205b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f80204a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f80204a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f80205b.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f80205b.setColorFilter(colorFilter);
    }
}
