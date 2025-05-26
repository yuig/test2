package uf1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.d;
import kotlin.jvm.internal.Intrinsics;
import rm1.f;
import rm1.q;

/* loaded from: classes5.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f122087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122088b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f122089c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f122090d;

    /* renamed from: e, reason: collision with root package name */
    public final BitmapDrawable f122091e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f122092f;

    /* renamed from: g, reason: collision with root package name */
    public final float f122093g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f122094h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f122095i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f122096j;

    /* renamed from: k, reason: collision with root package name */
    public int f122097k;

    public a(Context context, String hexColor, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        this.f122087a = context;
        this.f122088b = hexColor;
        this.f122089c = z13;
        this.f122090d = z14;
        this.f122091e = d.C(new rm1.d(new f(q.COLOR_PICKER), rm1.c.DARK, null, 0, null, 28), context);
        int dimension = (int) context.getResources().getDimension(dq1.a.story_pin_color_picker_item_size);
        this.f122092f = new Rect(0, 0, dimension, dimension);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(dq1.a.story_pin_color_picker_item_border_width);
        this.f122093g = dimensionPixelSize;
        int i13 = eo1.b.color_gray_roboflow_100;
        int i14 = eo1.b.color_black_cosmicore_900;
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(hexColor));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f122094h = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(i13));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setAntiAlias(true);
        this.f122095i = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(context.getColor(i14));
        paint3.setStyle(style);
        paint3.setStrokeWidth(dimensionPixelSize);
        paint3.setAntiAlias(true);
        this.f122096j = paint3;
        this.f122097k = 6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        BitmapDrawable bitmapDrawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getBounds().isEmpty()) {
            bounds = this.f122092f;
        } else {
            bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        }
        float min = Math.min(bounds.width(), bounds.height());
        float f13 = this.f122097k;
        float f14 = this.f122093g;
        float f15 = min - (f13 * f14);
        float f16 = 2;
        float f17 = f15 / f16;
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        canvas.drawCircle(centerX, centerY, f17, this.f122094h);
        Paint paint = this.f122095i;
        canvas.drawCircle(centerX, centerY, f17, paint);
        if (this.f122090d) {
            canvas.drawCircle(centerX, centerY, f17 + f14, this.f122096j);
            canvas.drawCircle(centerX, centerY, (f16 * f14) + f17, paint);
        }
        if (!this.f122089c || (bitmapDrawable = this.f122091e) == null) {
            return;
        }
        bitmapDrawable.setTint(bs1.c.A(this.f122087a, f5.c.e(Color.parseColor(this.f122088b)) > 0.5d ? eo1.b.color_black_900 : eo1.b.color_white_0));
        float f18 = f17 * 0.6f;
        bitmapDrawable.setBounds((int) (centerX - f18), (int) (centerY - f18), (int) (centerX + f18), (int) (centerY + f18));
        bitmapDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ a(Context context, String str, boolean z13, boolean z14, int i13) {
        this(context, str, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14);
    }
}
