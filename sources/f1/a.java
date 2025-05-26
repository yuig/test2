package f1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f60759a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f60760b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f60761c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f60762d;

    /* renamed from: e, reason: collision with root package name */
    public float f60763e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f60766h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f60767i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f60768j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60764f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f60765g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f60769k = PorterDuff.Mode.SRC_IN;

    public a(float f13, ColorStateList colorStateList) {
        this.f60759a = f13;
        Paint paint = new Paint(5);
        this.f60760b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f60766h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f60766h.getDefaultColor()));
        this.f60761c = new RectF();
        this.f60762d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f60761c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f60762d;
        rect2.set(rect);
        if (this.f60764f) {
            rect2.inset((int) Math.ceil(b.a(this.f60763e, this.f60759a, this.f60765g)), (int) Math.ceil(b.b(this.f60763e, this.f60759a, this.f60765g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z13;
        Paint paint = this.f60760b;
        if (this.f60767i == null || paint.getColorFilter() != null) {
            z13 = false;
        } else {
            paint.setColorFilter(this.f60767i);
            z13 = true;
        }
        RectF rectF = this.f60761c;
        float f13 = this.f60759a;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        if (z13) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f60762d, this.f60759a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f60768j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f60766h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f60766h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f60760b;
        boolean z13 = colorForState != paint.getColor();
        if (z13) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f60768j;
        if (colorStateList2 == null || (mode = this.f60769k) == null) {
            return z13;
        }
        this.f60767i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f60760b.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f60760b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f60768j = colorStateList;
        this.f60767i = a(colorStateList, this.f60769k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f60769k = mode;
        this.f60767i = a(this.f60768j, mode);
        invalidateSelf();
    }
}
