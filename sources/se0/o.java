package se0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.appcompat.app.v;

/* loaded from: classes.dex */
public final class o extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f112403a;

    /* renamed from: b, reason: collision with root package name */
    public int f112404b;

    /* renamed from: c, reason: collision with root package name */
    public int f112405c;

    /* renamed from: d, reason: collision with root package name */
    public int f112406d;

    /* renamed from: e, reason: collision with root package name */
    public float f112407e;

    /* renamed from: f, reason: collision with root package name */
    public int f112408f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f112409g;

    /* renamed from: h, reason: collision with root package name */
    public final int f112410h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112411i;

    /* renamed from: j, reason: collision with root package name */
    public float f112412j;

    /* renamed from: k, reason: collision with root package name */
    public float f112413k;

    /* renamed from: l, reason: collision with root package name */
    public float f112414l;

    /* renamed from: m, reason: collision with root package name */
    public float f112415m;

    /* renamed from: n, reason: collision with root package name */
    public float f112416n;

    /* renamed from: o, reason: collision with root package name */
    public final v f112417o;

    public o(Context context, int i13) {
        this.f112417o = new v(this, 15);
        Paint paint = new Paint(1);
        this.f112403a = paint;
        paint.setStyle(Paint.Style.FILL);
        int i14 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        this.f112404b = context.getColor(i14);
        this.f112405c = context.getColor(eo1.b.color_themed_background_default);
        this.f112408f = 255;
        this.f112407e = 0.0f;
        this.f112410h = 20;
        this.f112411i = 9;
        this.f112406d = i13;
        Rect bounds = getBounds();
        int i15 = bounds.left;
        int i16 = bounds.top;
        int i17 = this.f112406d;
        super.setBounds(i15, i16, i15 + i17, i17 + i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(this.f112407e, this.f112412j, this.f112413k);
        float f13 = this.f112412j;
        float f14 = this.f112415m;
        float f15 = f13 - f14;
        float f16 = f13 + f14;
        float f17 = this.f112413k;
        float f18 = f17 - f14;
        float f19 = f17 + f14;
        Paint paint = this.f112403a;
        paint.setColor(this.f112404b);
        paint.setAlpha(this.f112408f);
        canvas.drawCircle(this.f112412j, this.f112413k, this.f112414l, paint);
        paint.setColor(this.f112405c);
        paint.setAlpha(255);
        canvas.drawCircle(f15, f18, this.f112416n, paint);
        canvas.drawCircle(f16, f18, this.f112416n, paint);
        canvas.drawCircle(f15, f19, this.f112416n, paint);
        canvas.drawCircle(f16, f19, this.f112416n, paint);
        paint.setAlpha(this.f112408f);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f112408f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f112406d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f112406d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f112409g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f112412j = rect.exactCenterX();
        this.f112413k = rect.exactCenterY();
        int i13 = this.f112406d;
        this.f112414l = i13 * 0.5f;
        float f13 = i13 * 0.125f;
        this.f112415m = f13;
        this.f112416n = f13 * 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        if (i13 != this.f112408f) {
            this.f112408f = i13;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        if (i15 < i13 || i16 < i14) {
            return;
        }
        int min = Math.min(i15 - i13, i16 - i14);
        this.f112406d = min;
        super.setBounds(i13, i14, i13 + min, min + i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f112403a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f112409g) {
            return;
        }
        this.f112409g = true;
        if (this.f112409g) {
            scheduleSelf(this.f112417o, SystemClock.uptimeMillis() + this.f112410h);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f112409g) {
            this.f112409g = false;
            unscheduleSelf(this.f112417o);
            this.f112407e = 0.0f;
        }
    }

    public o(Context context, int i13, int i14) {
        this(context, i13);
        this.f112404b = i14;
    }
}
