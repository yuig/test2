package eo;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Log;
import android.widget.ImageView;
import com.makeramen.RoundedImageView;
import java.util.HashSet;
import rd.j;

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f59707u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f59708a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f59709b;

    /* renamed from: c, reason: collision with root package name */
    public float f59710c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f59711d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f59712e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f59713f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f59714g;

    /* renamed from: h, reason: collision with root package name */
    public final BitmapShader f59715h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f59716i;

    /* renamed from: j, reason: collision with root package name */
    public final int f59717j;

    /* renamed from: k, reason: collision with root package name */
    public final int f59718k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f59719l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f59720m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59721n;

    /* renamed from: o, reason: collision with root package name */
    public float f59722o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f59723p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f59724q;

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f59725r;

    /* renamed from: s, reason: collision with root package name */
    public final Matrix f59726s;

    /* renamed from: t, reason: collision with root package name */
    public j f59727t;

    public c(Bitmap bitmap) {
        this(bitmap, 0, null);
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int max = Math.max(drawable.getIntrinsicWidth(), 2);
        int max2 = Math.max(drawable.getIntrinsicHeight(), 2);
        if (max <= 0 || max2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Drawable b(Drawable drawable, int i13, ColorStateList colorStateList, boolean z13) {
        if (drawable != null) {
            if (drawable instanceof TransitionDrawable) {
                TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
                int numberOfLayers = transitionDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i14 = 0; i14 < numberOfLayers; i14++) {
                    Drawable drawable2 = transitionDrawable.getDrawable(i14);
                    if (drawable2 instanceof ColorDrawable) {
                        drawableArr[i14] = drawable2;
                    } else {
                        drawableArr[i14] = new c(a(transitionDrawable.getDrawable(i14)), i13, colorStateList);
                    }
                }
                return new TransitionDrawable(drawableArr);
            }
            Bitmap a13 = a(drawable);
            if (a13 != null) {
                return new c(a13, i13, colorStateList);
            }
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
        }
        return drawable;
    }

    public final ImageView.ScaleType c() {
        return this.f59724q;
    }

    public final void d(Canvas canvas) {
        boolean[] zArr = this.f59711d;
        for (boolean z13 : zArr) {
            if (!z13) {
                if (this.f59710c == 0.0f) {
                    return;
                }
                RectF rectF = this.f59709b;
                float f13 = rectF.left;
                float f14 = rectF.top;
                float width = rectF.width() + f13;
                float height = rectF.height() + f14;
                float f15 = this.f59710c;
                boolean z14 = zArr[a.TOP_LEFT.getValue()];
                Paint paint = this.f59716i;
                RectF rectF2 = this.f59712e;
                if (!z14) {
                    rectF2.set(f13, f14, f13 + f15, f14 + f15);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[a.TOP_RIGHT.getValue()]) {
                    rectF2.set(width - f15, f14, width, f15);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[a.BOTTOM_RIGHT.getValue()]) {
                    rectF2.set(width - f15, height - f15, width, height);
                    canvas.drawRect(rectF2, paint);
                }
                if (zArr[a.BOTTOM_LEFT.getValue()]) {
                    return;
                }
                rectF2.set(f13, height - f15, f15 + f13, height);
                canvas.drawRect(rectF2, paint);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f59714g.isRecycled()) {
            return;
        }
        boolean z13 = this.f59721n;
        Paint paint = this.f59720m;
        RectF rectF = this.f59719l;
        Paint paint2 = this.f59716i;
        RectF rectF2 = this.f59709b;
        if (z13) {
            if (this.f59722o <= 0.0f) {
                canvas.drawOval(rectF2, paint2);
                return;
            } else {
                canvas.drawOval(rectF, paint);
                canvas.drawOval(rectF2, paint2);
                return;
            }
        }
        for (boolean z14 : this.f59711d) {
            if (z14) {
                float f13 = this.f59710c;
                float f14 = this.f59722o;
                if (f14 <= 0.0f) {
                    canvas.drawRoundRect(rectF2, f13, f13, paint2);
                    d(canvas);
                    return;
                }
                float f15 = (int) ((f13 - (f14 / 2.0f)) + 0.5f);
                canvas.drawRoundRect(rectF2, f15, f15, paint2);
                canvas.drawRoundRect(rectF, f13, f13, paint);
                d(canvas);
                e(canvas);
                return;
            }
        }
        canvas.drawRect(rectF2, paint2);
        if (this.f59722o > 0.0f) {
            canvas.drawRect(rectF, paint);
        }
    }

    public final void e(Canvas canvas) {
        Paint paint;
        float f13;
        boolean[] zArr = this.f59711d;
        for (boolean z13 : zArr) {
            if (!z13) {
                if (this.f59710c == 0.0f) {
                    return;
                }
                RectF rectF = this.f59709b;
                float f14 = rectF.left;
                float f15 = rectF.top;
                float width = rectF.width() + f14;
                float height = rectF.height() + f15;
                float f16 = this.f59710c;
                float f17 = this.f59722o / 2.0f;
                boolean z14 = zArr[a.TOP_LEFT.getValue()];
                Paint paint2 = this.f59720m;
                if (!z14) {
                    canvas.drawLine(f14 - f17, f15, f14 + f16, f15, paint2);
                    canvas.drawLine(f14, f15 - f17, f14, f15 + f16, paint2);
                }
                if (zArr[a.TOP_RIGHT.getValue()]) {
                    paint = paint2;
                    f13 = f16;
                } else {
                    canvas.drawLine((width - f16) - f17, f15, width, f15, paint2);
                    float f18 = f15 - f17;
                    float f19 = f15 + f16;
                    paint = paint2;
                    f13 = f16;
                    canvas.drawLine(width, f18, width, f19, paint);
                }
                if (!zArr[a.BOTTOM_RIGHT.getValue()]) {
                    canvas.drawLine((width - f13) - f17, height, width + f17, height, paint);
                    canvas.drawLine(width, height - f13, width, height, paint);
                }
                if (zArr[a.BOTTOM_LEFT.getValue()]) {
                    return;
                }
                Paint paint3 = paint;
                canvas.drawLine(f14 - f17, height, f14 + f13, height, paint3);
                canvas.drawLine(f14, height - f13, f14, height, paint3);
                return;
            }
        }
    }

    public final void f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f59723p = colorStateList;
        this.f59720m.setColor(colorStateList.getColorForState(getState(), -16777216));
    }

    public final void g() {
        h(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59718k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59717j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(float f13, float f14, float f15, float f16) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f13));
        hashSet.add(Float.valueOf(f14));
        hashSet.add(Float.valueOf(f15));
        hashSet.add(Float.valueOf(f16));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f59710c = 0.0f;
        } else {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.f59710c = floatValue;
        }
        int value = a.TOP_LEFT.getValue();
        boolean z13 = f13 > 0.0f;
        boolean[] zArr = this.f59711d;
        zArr[value] = z13;
        zArr[a.TOP_RIGHT.getValue()] = f14 > 0.0f;
        zArr[a.BOTTOM_RIGHT.getValue()] = f15 > 0.0f;
        zArr[a.BOTTOM_LEFT.getValue()] = f16 > 0.0f;
    }

    public final void i() {
        float width;
        float height;
        RectF rectF = this.f59719l;
        RectF rectF2 = this.f59708a;
        rectF.set(rectF2);
        RectF rectF3 = this.f59709b;
        float f13 = this.f59722o;
        rectF3.set(f13, f13, rectF.width() - this.f59722o, rectF.height() - this.f59722o);
        int i13 = b.f59706a[this.f59724q.ordinal()];
        int i14 = this.f59718k;
        int i15 = this.f59717j;
        RectF rectF4 = this.f59713f;
        Matrix matrix = this.f59725r;
        switch (i13) {
            case 1:
                rectF.set(rectF2);
                float f14 = this.f59722o;
                rectF3.set(f14, f14, rectF.width() - this.f59722o, rectF.height() - this.f59722o);
                matrix.set(null);
                matrix.setTranslate((int) ep.b.a(rectF3.width(), i15, 0.5f, 0.5f), (int) ep.b.a(rectF3.height(), i14, 0.5f, 0.5f));
                break;
            case 2:
                rectF.set(rectF2);
                float f15 = this.f59722o;
                rectF3.set(f15, f15, rectF.width() - this.f59722o, rectF.height() - this.f59722o);
                matrix.set(null);
                float f16 = 0.0f;
                if (rectF3.height() * i15 > rectF3.width() * i14) {
                    width = rectF3.height() / i14;
                    f16 = (rectF3.width() - (i15 * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF3.width() / i15;
                    height = (rectF3.height() - (i14 * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                float f17 = (int) (f16 + 0.5f);
                float f18 = this.f59722o;
                matrix.postTranslate(f17 + f18, ((int) (height + 0.5f)) + f18);
                break;
            case 3:
                matrix.set(null);
                float min = (((float) i15) > rectF2.width() || ((float) i14) > rectF2.height()) ? Math.min(rectF2.width() / i15, rectF2.height() / i14) : 1.0f;
                float width2 = (int) (((rectF2.width() - (i15 * min)) * 0.5f) + 0.5f);
                float height2 = (int) (((rectF2.height() - (i14 * min)) * 0.5f) + 0.5f);
                matrix.setScale(min, min);
                matrix.postTranslate(width2, height2);
                rectF.set(rectF4);
                matrix.mapRect(rectF);
                float f19 = rectF.left;
                float f23 = this.f59722o;
                rectF3.set(f19 + f23, rectF.top + f23, rectF.right - f23, rectF.bottom - f23);
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 4:
                rectF.set(rectF4);
                matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectF);
                float f24 = rectF.left;
                float f25 = this.f59722o;
                rectF3.set(f24 + f25, rectF.top + f25, rectF.right - f25, rectF.bottom - f25);
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                rectF.set(rectF4);
                matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.END);
                matrix.mapRect(rectF);
                float f26 = rectF.left;
                float f27 = this.f59722o;
                rectF3.set(f26 + f27, rectF.top + f27, rectF.right - f27, rectF.bottom - f27);
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                rectF.set(rectF4);
                matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.START);
                matrix.mapRect(rectF);
                float f28 = rectF.left;
                float f29 = this.f59722o;
                rectF3.set(f28 + f29, rectF.top + f29, rectF.right - f29, rectF.bottom - f29);
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                rectF.set(rectF2);
                rectF3.set(rectF4);
                Matrix matrix2 = this.f59726s;
                matrix2.mapRect(rectF3);
                matrix.set(matrix2);
                break;
            default:
                rectF.set(rectF2);
                rectF3.set(rectF);
                matrix.set(null);
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.FILL);
                break;
        }
        float f33 = this.f59722o;
        rectF.inset(f33 / 2.0f, f33 / 2.0f);
        this.f59715h.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f59723p.isStateful();
    }

    public final void j(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        if (this.f59724q != scaleType) {
            this.f59724q = scaleType;
            i();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable;
        super.onBoundsChange(rect);
        this.f59708a.set(rect);
        i();
        j jVar = this.f59727t;
        if (jVar == null || (drawable = ((RoundedImageView) jVar.f107506b).f34155h) == null) {
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f59723p.getColorForState(iArr, 0);
        Paint paint = this.f59720m;
        if (paint.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f59716i.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59716i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public c(Bitmap bitmap, int i13, ColorStateList colorStateList) {
        this.f59708a = new RectF();
        this.f59709b = new RectF();
        this.f59711d = new boolean[]{true, true, true, true};
        this.f59712e = new RectF();
        RectF rectF = new RectF();
        this.f59713f = rectF;
        this.f59719l = new RectF();
        this.f59721n = false;
        this.f59724q = ImageView.ScaleType.FIT_XY;
        Matrix matrix = new Matrix();
        this.f59725r = matrix;
        this.f59726s = new Matrix();
        this.f59727t = null;
        float f13 = i13;
        this.f59722o = f13;
        this.f59723p = colorStateList == null ? ColorStateList.valueOf(-16777216) : colorStateList;
        this.f59714g = bitmap;
        int width = bitmap.getWidth();
        this.f59717j = width;
        int height = bitmap.getHeight();
        this.f59718k = height;
        rectF.set(0.0f, 0.0f, width, height);
        this.f59710c = 0.0f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f59715h = bitmapShader;
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        this.f59716i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Paint paint2 = new Paint();
        this.f59720m = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f59723p.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(f13);
    }
}
