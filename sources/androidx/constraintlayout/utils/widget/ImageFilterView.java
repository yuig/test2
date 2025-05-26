package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.s;
import y4.b;
import y4.c;

/* loaded from: classes3.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public final c f17578a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17579b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f17580c;

    /* renamed from: d, reason: collision with root package name */
    public float f17581d;

    /* renamed from: e, reason: collision with root package name */
    public float f17582e;

    /* renamed from: f, reason: collision with root package name */
    public float f17583f;

    /* renamed from: g, reason: collision with root package name */
    public Path f17584g;

    /* renamed from: h, reason: collision with root package name */
    public b f17585h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f17586i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable[] f17587j;

    /* renamed from: k, reason: collision with root package name */
    public LayerDrawable f17588k;

    /* renamed from: l, reason: collision with root package name */
    public float f17589l;

    /* renamed from: m, reason: collision with root package name */
    public float f17590m;

    /* renamed from: n, reason: collision with root package name */
    public float f17591n;

    /* renamed from: o, reason: collision with root package name */
    public float f17592o;

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17578a = new c();
        this.f17579b = true;
        this.f17580c = null;
        this.f17581d = 0.0f;
        this.f17582e = 0.0f;
        this.f17583f = Float.NaN;
        this.f17587j = new Drawable[2];
        this.f17589l = Float.NaN;
        this.f17590m = Float.NaN;
        this.f17591n = Float.NaN;
        this.f17592o = Float.NaN;
        f2(attributeSet);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void f2(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f17580c = obtainStyledAttributes.getDrawable(s.ImageFilterView_altSrc);
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ImageFilterView_crossfade) {
                    this.f17581d = obtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    int i14 = s.ImageFilterView_warmth;
                    c cVar = this.f17578a;
                    if (index == i14) {
                        cVar.f136875g = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_saturation) {
                        cVar.f136873e = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_contrast) {
                        cVar.f136874f = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_brightness) {
                        cVar.f136872d = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_round) {
                        float dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f17583f = dimension;
                            float f13 = this.f17582e;
                            this.f17582e = -1.0f;
                            k2(f13);
                        } else {
                            boolean z13 = this.f17583f != dimension;
                            this.f17583f = dimension;
                            if (dimension != 0.0f) {
                                if (this.f17584g == null) {
                                    this.f17584g = new Path();
                                }
                                if (this.f17586i == null) {
                                    this.f17586i = new RectF();
                                }
                                if (this.f17585h == null) {
                                    b bVar = new b(this, 1);
                                    this.f17585h = bVar;
                                    setOutlineProvider(bVar);
                                }
                                setClipToOutline(true);
                                this.f17586i.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f17584g.reset();
                                Path path = this.f17584g;
                                RectF rectF = this.f17586i;
                                float f14 = this.f17583f;
                                path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z13) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == s.ImageFilterView_roundPercent) {
                        k2(obtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == s.ImageFilterView_overlay) {
                        this.f17579b = obtainStyledAttributes.getBoolean(index, this.f17579b);
                    } else if (index == s.ImageFilterView_imagePanX) {
                        this.f17589l = obtainStyledAttributes.getFloat(index, this.f17589l);
                        l2();
                    } else if (index == s.ImageFilterView_imagePanY) {
                        this.f17590m = obtainStyledAttributes.getFloat(index, this.f17590m);
                        l2();
                    } else if (index == s.ImageFilterView_imageRotate) {
                        this.f17592o = obtainStyledAttributes.getFloat(index, this.f17592o);
                        l2();
                    } else if (index == s.ImageFilterView_imageZoom) {
                        this.f17591n = obtainStyledAttributes.getFloat(index, this.f17591n);
                        l2();
                    }
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            Drawable drawable2 = this.f17580c;
            Drawable[] drawableArr = this.f17587j;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                if (drawable3 != null) {
                    drawableArr[0] = drawable3.mutate();
                    return;
                }
                return;
            }
            drawableArr[0] = getDrawable().mutate();
            drawableArr[1] = this.f17580c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f17588k = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f17581d * 255.0f));
            if (!this.f17579b) {
                this.f17588k.getDrawable(0).setAlpha((int) ((1.0f - this.f17581d) * 255.0f));
            }
            super.setImageDrawable(this.f17588k);
        }
    }

    public final void g2(float f13) {
        this.f17581d = f13;
        if (this.f17587j != null) {
            if (!this.f17579b) {
                this.f17588k.getDrawable(0).setAlpha((int) ((1.0f - this.f17581d) * 255.0f));
            }
            this.f17588k.getDrawable(1).setAlpha((int) (this.f17581d * 255.0f));
            super.setImageDrawable(this.f17588k);
        }
    }

    public final void i2() {
        if (Float.isNaN(this.f17589l) && Float.isNaN(this.f17590m) && Float.isNaN(this.f17591n) && Float.isNaN(this.f17592o)) {
            return;
        }
        float f13 = Float.isNaN(this.f17589l) ? 0.0f : this.f17589l;
        float f14 = Float.isNaN(this.f17590m) ? 0.0f : this.f17590m;
        float f15 = Float.isNaN(this.f17591n) ? 1.0f : this.f17591n;
        float f16 = Float.isNaN(this.f17592o) ? 0.0f : this.f17592o;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f17 = f15 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f17, f17);
        float f18 = intrinsicWidth * f17;
        float f19 = f17 * intrinsicHeight;
        matrix.postTranslate(((((width - f18) * f13) + width) - f18) * 0.5f, ((((height - f19) * f14) + height) - f19) * 0.5f);
        matrix.postRotate(f16, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void k2(float f13) {
        boolean z13 = this.f17582e != f13;
        this.f17582e = f13;
        if (f13 != 0.0f) {
            if (this.f17584g == null) {
                this.f17584g = new Path();
            }
            if (this.f17586i == null) {
                this.f17586i = new RectF();
            }
            if (this.f17585h == null) {
                b bVar = new b(this, 0);
                this.f17585h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f17582e) / 2.0f;
            this.f17586i.set(0.0f, 0.0f, width, height);
            this.f17584g.reset();
            this.f17584g.addRoundRect(this.f17586i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z13) {
            invalidateOutline();
        }
    }

    public final void l2() {
        if (Float.isNaN(this.f17589l) && Float.isNaN(this.f17590m) && Float.isNaN(this.f17591n) && Float.isNaN(this.f17592o)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            i2();
        }
    }

    @Override // android.view.View
    public final void layout(int i13, int i14, int i15, int i16) {
        super.layout(i13, i14, i15, i16);
        i2();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (this.f17580c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        Drawable[] drawableArr = this.f17587j;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f17580c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f17588k = layerDrawable;
        super.setImageDrawable(layerDrawable);
        g2(this.f17581d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i13) {
        if (this.f17580c == null) {
            super.setImageResource(i13);
            return;
        }
        Drawable mutate = com.bumptech.glide.c.I(getContext(), i13).mutate();
        Drawable[] drawableArr = this.f17587j;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f17580c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f17588k = layerDrawable;
        super.setImageDrawable(layerDrawable);
        g2(this.f17581d);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17578a = new c();
        this.f17579b = true;
        this.f17580c = null;
        this.f17581d = 0.0f;
        this.f17582e = 0.0f;
        this.f17583f = Float.NaN;
        this.f17587j = new Drawable[2];
        this.f17589l = Float.NaN;
        this.f17590m = Float.NaN;
        this.f17591n = Float.NaN;
        this.f17592o = Float.NaN;
        f2(attributeSet);
    }
}
