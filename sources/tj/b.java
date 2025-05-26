package tj;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f117770b;

    /* renamed from: h, reason: collision with root package name */
    public float f117776h;

    /* renamed from: i, reason: collision with root package name */
    public int f117777i;

    /* renamed from: j, reason: collision with root package name */
    public int f117778j;

    /* renamed from: k, reason: collision with root package name */
    public int f117779k;

    /* renamed from: l, reason: collision with root package name */
    public int f117780l;

    /* renamed from: m, reason: collision with root package name */
    public int f117781m;

    /* renamed from: o, reason: collision with root package name */
    public bk.o f117783o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f117784p;

    /* renamed from: a, reason: collision with root package name */
    public final bk.r f117769a = bk.p.f23103a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f117771c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f117772d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f117773e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f117774f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final va.e f117775g = new va.e(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public boolean f117782n = true;

    public b(bk.o oVar) {
        this.f117783o = oVar;
        Paint paint = new Paint(1);
        this.f117770b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z13 = this.f117782n;
        Paint paint = this.f117770b;
        Rect rect = this.f117772d;
        if (z13) {
            copyBounds(rect);
            float height = this.f117776h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{f5.c.g(this.f117777i, this.f117781m), f5.c.g(this.f117778j, this.f117781m), f5.c.g(f5.c.j(this.f117778j, 0), this.f117781m), f5.c.g(f5.c.j(this.f117780l, 0), this.f117781m), f5.c.g(this.f117780l, this.f117781m), f5.c.g(this.f117779k, this.f117781m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f117782n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f117773e;
        rectF.set(rect);
        bk.d dVar = this.f117783o.f23095e;
        RectF rectF2 = this.f117774f;
        rectF2.set(getBounds());
        float min = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        bk.o oVar = this.f117783o;
        rectF2.set(getBounds());
        if (oVar.g(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f117775g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f117776h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        bk.o oVar = this.f117783o;
        RectF rectF = this.f117774f;
        rectF.set(getBounds());
        if (oVar.g(rectF)) {
            bk.d dVar = this.f117783o.f23095e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f117772d;
        copyBounds(rect);
        RectF rectF2 = this.f117773e;
        rectF2.set(rect);
        bk.o oVar2 = this.f117783o;
        Path path = this.f117771c;
        this.f117769a.a(oVar2, 1.0f, rectF2, null, path);
        d7.b.w0(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        bk.o oVar = this.f117783o;
        RectF rectF = this.f117774f;
        rectF.set(getBounds());
        if (!oVar.g(rectF)) {
            return true;
        }
        int round = Math.round(this.f117776h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f117784p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f117782n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f117784p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f117781m)) != this.f117781m) {
            this.f117782n = true;
            this.f117781m = colorForState;
        }
        if (this.f117782n) {
            invalidateSelf();
        }
        return this.f117782n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f117770b.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f117770b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
