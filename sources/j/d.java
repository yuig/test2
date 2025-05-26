package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import i.i;
import i.j;

/* loaded from: classes2.dex */
public final class d extends Drawable {

    /* renamed from: l, reason: collision with root package name */
    public static final float f73948l = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f73949a;

    /* renamed from: b, reason: collision with root package name */
    public final float f73950b;

    /* renamed from: c, reason: collision with root package name */
    public final float f73951c;

    /* renamed from: d, reason: collision with root package name */
    public final float f73952d;

    /* renamed from: e, reason: collision with root package name */
    public final float f73953e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f73954f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f73955g;

    /* renamed from: h, reason: collision with root package name */
    public final int f73956h;

    /* renamed from: i, reason: collision with root package name */
    public float f73957i;

    /* renamed from: j, reason: collision with root package name */
    public final float f73958j;

    /* renamed from: k, reason: collision with root package name */
    public final int f73959k;

    public d(Context context) {
        Paint paint = new Paint();
        this.f73949a = paint;
        this.f73955g = new Path();
        this.f73959k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, i.a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f73958j = (float) (Math.cos(f73948l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z13 = obtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true);
        if (this.f73954f != z13) {
            this.f73954f = z13;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (round != this.f73953e) {
            this.f73953e = round;
            invalidateSelf();
        }
        this.f73956h = obtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f73951c = Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f73950b = Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f73952d = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f13, float f14, float f15) {
        return ep.b.a(f14, f13, f15, f13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z13 = false;
        int i13 = this.f73959k;
        if (i13 != 0 && (i13 == 1 || (i13 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z13 = true;
        }
        float f13 = this.f73950b;
        float sqrt = (float) Math.sqrt(f13 * f13 * 2.0f);
        float f14 = this.f73957i;
        float f15 = this.f73951c;
        float a13 = a(f15, sqrt, f14);
        float a14 = a(f15, this.f73952d, this.f73957i);
        float round = Math.round(a(0.0f, this.f73958j, this.f73957i));
        float a15 = a(0.0f, f73948l, this.f73957i);
        float a16 = a(z13 ? 0.0f : -180.0f, z13 ? 180.0f : 0.0f, this.f73957i);
        double d2 = a13;
        double d13 = a15;
        float round2 = Math.round(Math.cos(d13) * d2);
        float round3 = Math.round(Math.sin(d13) * d2);
        Path path = this.f73955g;
        path.rewind();
        float f16 = this.f73953e;
        Paint paint = this.f73949a;
        float a17 = a(paint.getStrokeWidth() + f16, -this.f73958j, this.f73957i);
        float f17 = (-a14) / 2.0f;
        path.moveTo(f17 + round, 0.0f);
        path.rLineTo(a14 - (round * 2.0f), 0.0f);
        path.moveTo(f17, a17);
        path.rLineTo(round2, round3);
        path.moveTo(f17, -a17);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f73953e + ((((int) (height - (2.0f * r8))) / 4) * 2));
        if (this.f73954f) {
            canvas.rotate(a16 * (z13 ? -1 : 1));
        } else if (z13) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f73956h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f73956h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Paint paint = this.f73949a;
        if (i13 != paint.getAlpha()) {
            paint.setAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f73949a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f13) {
        if (this.f73957i != f13) {
            this.f73957i = f13;
            invalidateSelf();
        }
    }
}
