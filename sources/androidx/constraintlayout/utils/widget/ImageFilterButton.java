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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.s;
import y4.a;
import y4.c;

/* loaded from: classes3.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final c f17563d;

    /* renamed from: e, reason: collision with root package name */
    public float f17564e;

    /* renamed from: f, reason: collision with root package name */
    public float f17565f;

    /* renamed from: g, reason: collision with root package name */
    public float f17566g;

    /* renamed from: h, reason: collision with root package name */
    public Path f17567h;

    /* renamed from: i, reason: collision with root package name */
    public a f17568i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f17569j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable[] f17570k;

    /* renamed from: l, reason: collision with root package name */
    public LayerDrawable f17571l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17572m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f17573n;

    /* renamed from: o, reason: collision with root package name */
    public float f17574o;

    /* renamed from: p, reason: collision with root package name */
    public float f17575p;

    /* renamed from: q, reason: collision with root package name */
    public float f17576q;

    /* renamed from: r, reason: collision with root package name */
    public float f17577r;

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17563d = new c();
        this.f17564e = 0.0f;
        this.f17565f = 0.0f;
        this.f17566g = Float.NaN;
        this.f17570k = new Drawable[2];
        this.f17572m = true;
        this.f17573n = null;
        this.f17574o = Float.NaN;
        this.f17575p = Float.NaN;
        this.f17576q = Float.NaN;
        this.f17577r = Float.NaN;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f17573n = obtainStyledAttributes.getDrawable(s.ImageFilterView_altSrc);
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ImageFilterView_crossfade) {
                    this.f17564e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    int i14 = s.ImageFilterView_warmth;
                    c cVar = this.f17563d;
                    if (index == i14) {
                        cVar.f136875g = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_saturation) {
                        cVar.f136873e = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_contrast) {
                        cVar.f136874f = obtainStyledAttributes.getFloat(index, 0.0f);
                        cVar.a(this);
                    } else if (index == s.ImageFilterView_round) {
                        float dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f17566g = dimension;
                            float f13 = this.f17565f;
                            this.f17565f = -1.0f;
                            d(f13);
                        } else {
                            boolean z13 = this.f17566g != dimension;
                            this.f17566g = dimension;
                            if (dimension != 0.0f) {
                                if (this.f17567h == null) {
                                    this.f17567h = new Path();
                                }
                                if (this.f17569j == null) {
                                    this.f17569j = new RectF();
                                }
                                if (this.f17568i == null) {
                                    a aVar = new a(this, 1);
                                    this.f17568i = aVar;
                                    setOutlineProvider(aVar);
                                }
                                setClipToOutline(true);
                                this.f17569j.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f17567h.reset();
                                Path path = this.f17567h;
                                RectF rectF = this.f17569j;
                                float f14 = this.f17566g;
                                path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z13) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == s.ImageFilterView_roundPercent) {
                        d(obtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == s.ImageFilterView_overlay) {
                        this.f17572m = obtainStyledAttributes.getBoolean(index, this.f17572m);
                    } else if (index == s.ImageFilterView_imagePanX) {
                        this.f17574o = obtainStyledAttributes.getFloat(index, this.f17574o);
                        e();
                    } else if (index == s.ImageFilterView_imagePanY) {
                        this.f17575p = obtainStyledAttributes.getFloat(index, this.f17575p);
                        e();
                    } else if (index == s.ImageFilterView_imageRotate) {
                        this.f17577r = obtainStyledAttributes.getFloat(index, this.f17577r);
                        e();
                    } else if (index == s.ImageFilterView_imageZoom) {
                        this.f17576q = obtainStyledAttributes.getFloat(index, this.f17576q);
                        e();
                    }
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            Drawable drawable2 = this.f17573n;
            Drawable[] drawableArr = this.f17570k;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                if (drawable3 != null) {
                    drawableArr[0] = drawable3.mutate();
                    return;
                }
                return;
            }
            drawableArr[0] = getDrawable().mutate();
            drawableArr[1] = this.f17573n.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f17571l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f17564e * 255.0f));
            if (!this.f17572m) {
                this.f17571l.getDrawable(0).setAlpha((int) ((1.0f - this.f17564e) * 255.0f));
            }
            super.setImageDrawable(this.f17571l);
        }
    }

    public final void b(float f13) {
        this.f17564e = f13;
        if (this.f17570k != null) {
            if (!this.f17572m) {
                this.f17571l.getDrawable(0).setAlpha((int) ((1.0f - this.f17564e) * 255.0f));
            }
            this.f17571l.getDrawable(1).setAlpha((int) (this.f17564e * 255.0f));
            super.setImageDrawable(this.f17571l);
        }
    }

    public final void c() {
        if (Float.isNaN(this.f17574o) && Float.isNaN(this.f17575p) && Float.isNaN(this.f17576q) && Float.isNaN(this.f17577r)) {
            return;
        }
        float f13 = Float.isNaN(this.f17574o) ? 0.0f : this.f17574o;
        float f14 = Float.isNaN(this.f17575p) ? 0.0f : this.f17575p;
        float f15 = Float.isNaN(this.f17576q) ? 1.0f : this.f17576q;
        float f16 = Float.isNaN(this.f17577r) ? 0.0f : this.f17577r;
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

    public final void d(float f13) {
        boolean z13 = this.f17565f != f13;
        this.f17565f = f13;
        if (f13 != 0.0f) {
            if (this.f17567h == null) {
                this.f17567h = new Path();
            }
            if (this.f17569j == null) {
                this.f17569j = new RectF();
            }
            if (this.f17568i == null) {
                a aVar = new a(this, 0);
                this.f17568i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f17565f) / 2.0f;
            this.f17569j.set(0.0f, 0.0f, width, height);
            this.f17567h.reset();
            this.f17567h.addRoundRect(this.f17569j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z13) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (Float.isNaN(this.f17574o) && Float.isNaN(this.f17575p) && Float.isNaN(this.f17576q) && Float.isNaN(this.f17577r)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            c();
        }
    }

    @Override // android.view.View
    public final void layout(int i13, int i14, int i15, int i16) {
        super.layout(i13, i14, i15, i16);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (this.f17573n == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        Drawable[] drawableArr = this.f17570k;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f17573n;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f17571l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        b(this.f17564e);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public final void setImageResource(int i13) {
        if (this.f17573n == null) {
            super.setImageResource(i13);
            return;
        }
        Drawable mutate = com.bumptech.glide.c.I(getContext(), i13).mutate();
        Drawable[] drawableArr = this.f17570k;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f17573n;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f17571l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        b(this.f17564e);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17563d = new c();
        this.f17564e = 0.0f;
        this.f17565f = 0.0f;
        this.f17566g = Float.NaN;
        this.f17570k = new Drawable[2];
        this.f17572m = true;
        this.f17573n = null;
        this.f17574o = Float.NaN;
        this.f17575p = Float.NaN;
        this.f17576q = Float.NaN;
        this.f17577r = Float.NaN;
        a(attributeSet);
    }
}
