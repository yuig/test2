package com.makeramen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import eo.a;
import eo.c;
import eo.d;
import eo.e;
import rd.j;
import zr1.b;

/* loaded from: classes.dex */
public class RoundedImageView extends AppCompatImageView implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final ImageView.ScaleType[] f34147l = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a, reason: collision with root package name */
    public float f34148a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f34149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34150c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34151d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f34152e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f34153f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34154g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f34155h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView.ScaleType f34156i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f34157j;

    /* renamed from: k, reason: collision with root package name */
    public final j f34158k;

    public RoundedImageView(Context context) {
        super(context, null);
        this.f34148a = 0.0f;
        this.f34149b = ColorStateList.valueOf(-16777216);
        this.f34150c = false;
        this.f34151d = false;
        this.f34154g = false;
        this.f34157j = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f34158k = new j(this, 24);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // eo.d
    public final void M1(int i13) {
        float f13 = i13;
        if (this.f34148a == f13) {
            return;
        }
        this.f34148a = f13;
        Drawable drawable = this.f34152e;
        if (drawable instanceof c) {
            c cVar = (c) drawable;
            cVar.f59722o = f13;
            cVar.f59720m.setStrokeWidth(f13);
        }
        if (this.f34150c) {
            Drawable drawable2 = this.f34153f;
            if (drawable2 instanceof c) {
                c cVar2 = (c) drawable2;
                cVar2.f59722o = f13;
                cVar2.f59720m.setStrokeWidth(f13);
            }
        }
        invalidate();
    }

    @Override // eo.d
    public final void U1(int i13) {
        float dimension = getResources().getDimension(i13);
        g2(dimension, dimension, dimension, dimension);
    }

    @Override // eo.d
    public final void a2(boolean z13) {
        if (this.f34150c == z13) {
            return;
        }
        this.f34150c = z13;
        if (z13) {
            Drawable drawable = this.f34153f;
            if (drawable instanceof c) {
                l2(drawable);
            } else {
                setBackgroundDrawable(drawable);
            }
        } else {
            Drawable drawable2 = this.f34153f;
            if (drawable2 instanceof c) {
                c cVar = (c) drawable2;
                float f13 = 0;
                cVar.f59722o = f13;
                cVar.f59720m.setStrokeWidth(f13);
                ((c) this.f34153f).h(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        invalidate();
    }

    @Override // eo.d
    public final void b2(float f13) {
        g2(f13, f13, f13, f13);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final float f2() {
        float f13 = 0.0f;
        for (float f14 : this.f34157j) {
            f13 = Math.max(f14, f13);
        }
        return f13;
    }

    public final void g2(float f13, float f14, float f15, float f16) {
        a aVar = a.TOP_LEFT;
        int value = aVar.getValue();
        float[] fArr = this.f34157j;
        if (fArr[value] == f13 && fArr[a.TOP_RIGHT.getValue()] == f14 && fArr[a.BOTTOM_RIGHT.getValue()] == f16 && fArr[a.BOTTOM_LEFT.getValue()] == f15) {
            return;
        }
        fArr[aVar.getValue()] = f13;
        fArr[a.TOP_RIGHT.getValue()] = f14;
        fArr[a.BOTTOM_LEFT.getValue()] = f15;
        fArr[a.BOTTOM_RIGHT.getValue()] = f16;
        l2(this.f34152e);
        l2(this.f34153f);
        l2(this.f34155h);
        invalidate();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f34156i;
    }

    public final void i2(boolean z13) {
        this.f34151d = z13;
        Drawable drawable = this.f34152e;
        if (drawable instanceof c) {
            ((c) drawable).f59721n = z13;
        }
        if (this.f34150c) {
            Drawable drawable2 = this.f34153f;
            if (drawable2 instanceof c) {
                ((c) drawable2).f59721n = z13;
            }
        }
        if (this.f34154g) {
            Drawable drawable3 = this.f34155h;
            if (drawable3 instanceof c) {
                ((c) drawable3).f59721n = z13;
            }
        }
        invalidate();
    }

    public final void k2(boolean z13) {
        if (this.f34154g == z13) {
            return;
        }
        this.f34154g = z13;
        if (z13) {
            Drawable drawable = this.f34155h;
            if (drawable instanceof c) {
                l2(drawable);
            } else {
                setForeground(drawable);
            }
        } else {
            Drawable drawable2 = this.f34155h;
            if (drawable2 instanceof c) {
                c cVar = (c) drawable2;
                float f13 = 0;
                cVar.f59722o = f13;
                cVar.f59720m.setStrokeWidth(f13);
                ((c) this.f34155h).g();
            }
        }
        invalidate();
    }

    public final void l2(Drawable drawable) {
        if (drawable != null && (drawable instanceof c)) {
            c cVar = (c) drawable;
            cVar.j(this.f34156i);
            float f13 = (int) this.f34148a;
            cVar.f59722o = f13;
            cVar.f59720m.setStrokeWidth(f13);
            cVar.f(this.f34149b);
            cVar.f59721n = this.f34151d;
            float[] fArr = this.f34157j;
            if (fArr != null) {
                cVar.h(fArr[a.TOP_LEFT.getValue()], fArr[a.TOP_RIGHT.getValue()], fArr[a.BOTTOM_RIGHT.getValue()], fArr[a.BOTTOM_LEFT.getValue()]);
            }
        }
    }

    @Override // eo.d
    public final void o0(int i13) {
        ColorStateList valueOf = ColorStateList.valueOf(i13);
        if (this.f34149b.equals(valueOf)) {
            return;
        }
        this.f34149b = valueOf != null ? valueOf : ColorStateList.valueOf(-16777216);
        Drawable drawable = this.f34152e;
        if (drawable instanceof c) {
            ((c) drawable).f(valueOf);
        }
        if (this.f34150c) {
            Drawable drawable2 = this.f34153f;
            if (drawable2 instanceof c) {
                ((c) drawable2).f(valueOf);
            }
        }
        if (this.f34148a > 0.0f) {
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View, eo.d
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f34155h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View, eo.d
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!this.f34150c || drawable == null) {
            this.f34153f = drawable;
        } else {
            Drawable b13 = c.b(drawable, (int) this.f34148a, this.f34149b, this.f34151d);
            this.f34153f = b13;
            l2(b13);
        }
        super.setBackgroundDrawable(this.f34153f);
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        if (drawable == null) {
            this.f34155h = null;
            return;
        }
        Drawable b13 = c.b(drawable, (int) this.f34148a, this.f34149b, this.f34151d);
        this.f34155h = b13;
        l2(b13);
        ((c) this.f34155h).j(ImageView.ScaleType.FIT_XY);
        Drawable drawable2 = this.f34152e;
        if (drawable2 != null && !drawable2.getBounds().isEmpty()) {
            this.f34155h.setBounds(this.f34152e.getBounds());
            return;
        }
        Drawable drawable3 = this.f34152e;
        if (drawable3 instanceof c) {
            ((c) drawable3).f59727t = this.f34158k;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            c cVar = new c(bitmap);
            this.f34152e = cVar;
            l2(cVar);
        } else {
            this.f34152e = null;
        }
        super.setImageDrawable(this.f34152e);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f34152e = null;
        } else if (drawable instanceof yd.c) {
            this.f34152e = drawable;
        } else {
            int i13 = c.f59707u;
            Drawable b13 = c.b(drawable, 0, ColorStateList.valueOf(-16777216), false);
            this.f34152e = b13;
            l2(b13);
            Drawable drawable2 = this.f34152e;
            if (drawable2 instanceof c) {
                ((c) drawable2).f59727t = this.f34158k;
            }
        }
        super.setImageDrawable(this.f34152e);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i13) {
        super.setImageResource(i13);
        setImageDrawable(getDrawable());
    }

    @Override // android.widget.ImageView, eo.d
    public void setScaleType(ImageView.ScaleType scaleType) {
        scaleType.getClass();
        if (this.f34156i != scaleType) {
            this.f34156i = scaleType;
            switch (e.f59728a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            Drawable drawable = this.f34152e;
            if ((drawable instanceof c) && ((c) drawable).c() != scaleType) {
                ((c) this.f34152e).j(scaleType);
            }
            Drawable drawable2 = this.f34153f;
            if ((drawable2 instanceof c) && ((c) drawable2).c() != scaleType) {
                ((c) this.f34153f).j(scaleType);
            }
            setWillNotCacheDrawing(true);
            requestLayout();
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f34148a = 0.0f;
        this.f34149b = ColorStateList.valueOf(-16777216);
        this.f34150c = false;
        this.f34151d = false;
        this.f34154g = false;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f34157j = fArr;
        this.f34158k = new j(this, 24);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.RoundedImageView, i13, 0);
        int i14 = obtainStyledAttributes.getInt(b.RoundedImageView_android_scaleType, -1);
        if (i14 >= 0) {
            setScaleType(f34147l[i14]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_corner_radius, -1);
        fArr[a.TOP_LEFT.getValue()] = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[a.TOP_RIGHT.getValue()] = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[a.BOTTOM_RIGHT.getValue()] = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[a.BOTTOM_LEFT.getValue()] = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_corner_radius_bottom_left, -1);
        boolean z13 = false;
        for (int i15 = 0; i15 < 4; i15++) {
            float[] fArr2 = this.f34157j;
            if (fArr2[i15] < 0.0f) {
                fArr2[i15] = 0.0f;
            } else {
                z13 = true;
            }
        }
        dimensionPixelSize = dimensionPixelSize < 0.0f ? isInEditMode() ? 3.0f : getResources().getDimensionPixelSize(zr1.a.corner_radius) : dimensionPixelSize;
        if (!z13) {
            int length = this.f34157j.length;
            for (int i16 = 0; i16 < length; i16++) {
                this.f34157j[i16] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(b.RoundedImageView_riv_border_width, -1);
        this.f34148a = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f34148a = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(b.RoundedImageView_riv_border_color);
        this.f34149b = colorStateList;
        if (colorStateList == null) {
            this.f34149b = ColorStateList.valueOf(-16777216);
        }
        this.f34150c = obtainStyledAttributes.getBoolean(b.RoundedImageView_riv_mutate_background, true);
        this.f34151d = obtainStyledAttributes.getBoolean(b.RoundedImageView_riv_oval, false);
        Drawable drawable = this.f34152e;
        if (drawable instanceof c) {
            l2(drawable);
        }
        if (this.f34150c) {
            Drawable drawable2 = this.f34153f;
            if (!(drawable2 instanceof c)) {
                setBackgroundDrawable(drawable2);
            }
            Drawable drawable3 = this.f34153f;
            if (drawable3 instanceof c) {
                l2(drawable3);
            }
        }
        this.f34155h = obtainStyledAttributes.getDrawable(b.RoundedImageView_riv_foreground_drawable);
        k2(obtainStyledAttributes.getBoolean(b.RoundedImageView_riv_should_round_foreground, false));
        obtainStyledAttributes.recycle();
    }
}
