package com.pinterest.kit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import bb2.j;
import ct1.f;
import hf0.b;
import js1.c;

/* loaded from: classes4.dex */
public class ImageCropperLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public c f49856a;

    /* renamed from: b, reason: collision with root package name */
    public float f49857b;

    /* renamed from: c, reason: collision with root package name */
    public int f49858c;

    /* renamed from: d, reason: collision with root package name */
    public float f49859d;

    /* renamed from: e, reason: collision with root package name */
    public float f49860e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f49861f;

    /* renamed from: g, reason: collision with root package name */
    public int f49862g;

    /* renamed from: h, reason: collision with root package name */
    public int f49863h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f49864i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f49865j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f49866k;

    /* renamed from: l, reason: collision with root package name */
    public RectF f49867l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f49868m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f49869n;

    /* renamed from: o, reason: collision with root package name */
    public float f49870o;

    /* renamed from: p, reason: collision with root package name */
    public float f49871p;

    /* renamed from: q, reason: collision with root package name */
    public ScaleGestureDetector f49872q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49873r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f49874s;

    public ImageCropperLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49856a = c.OUT_OF_BOUNDS;
        this.f49862g = 0;
        this.f49863h = 0;
        this.f49874s = true;
        e(context, attributeSet, 0);
    }

    public static float c(float f13) {
        return (f13 / 16.0f) * 9.0f;
    }

    public final void a() {
        RectF rectF = this.f49867l;
        float f13 = rectF.left;
        RectF rectF2 = this.f49868m;
        float f14 = f13 - rectF2.left;
        float f15 = rectF.right;
        float f16 = f15 - rectF2.right;
        float f17 = rectF.top;
        float f18 = f17 - rectF2.top;
        float f19 = rectF.bottom;
        float f23 = f19 - rectF2.bottom;
        if (f14 < 0.0f) {
            rectF.left = f13 - f14;
        }
        if (f16 > 0.0f) {
            rectF.right = f15 - f16;
        }
        if (f18 < 0.0f) {
            rectF.top = f17 - f18;
        }
        if (f23 > 0.0f) {
            rectF.bottom = f19 - f23;
        }
    }

    public final RectF b() {
        return new RectF(this.f49867l);
    }

    public final RectF d() {
        return new RectF(this.f49868m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        super.dispatchDraw(canvas);
        if (!this.f49873r || (rectF = this.f49867l) == null || (rectF2 = this.f49868m) == null) {
            return;
        }
        canvas.drawRect(rectF2.left, rectF2.top, rectF2.right, rectF.top, this.f49864i);
        RectF rectF3 = this.f49868m;
        canvas.drawRect(rectF3.left, this.f49867l.bottom, rectF3.right, rectF3.bottom, this.f49864i);
        float f13 = this.f49868m.left;
        RectF rectF4 = this.f49867l;
        canvas.drawRect(f13, rectF4.top, rectF4.left, rectF4.bottom, this.f49864i);
        RectF rectF5 = this.f49867l;
        canvas.drawRect(rectF5.right, rectF5.top, this.f49868m.right, rectF5.bottom, this.f49864i);
        RectF rectF6 = this.f49867l;
        canvas.drawRect(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, this.f49866k);
        RectF rectF7 = this.f49867l;
        float f14 = rectF7.left;
        float f15 = rectF7.top;
        canvas.drawRect(f14, f15, f14 + this.f49859d, f15 + this.f49860e, this.f49865j);
        RectF rectF8 = this.f49867l;
        float f16 = rectF8.left;
        float f17 = rectF8.top;
        float f18 = this.f49860e;
        canvas.drawRect(f16, f17 + f18, f16 + f18, f17 + this.f49859d, this.f49865j);
        RectF rectF9 = this.f49867l;
        float f19 = rectF9.right;
        float f23 = f19 - this.f49859d;
        float f24 = rectF9.top;
        canvas.drawRect(f23, f24, f19, f24 + this.f49860e, this.f49865j);
        RectF rectF10 = this.f49867l;
        float f25 = rectF10.right;
        float f26 = this.f49860e;
        float f27 = rectF10.top;
        canvas.drawRect(f25 - f26, f27 + f26, f25, f27 + this.f49859d, this.f49865j);
        RectF rectF11 = this.f49867l;
        float f28 = rectF11.left;
        float f29 = rectF11.bottom;
        canvas.drawRect(f28, f29 - this.f49860e, f28 + this.f49859d, f29, this.f49865j);
        RectF rectF12 = this.f49867l;
        float f33 = rectF12.left;
        float f34 = rectF12.bottom;
        float f35 = f34 - this.f49859d;
        float f36 = this.f49860e;
        canvas.drawRect(f33, f35, f33 + f36, f34 - f36, this.f49865j);
        RectF rectF13 = this.f49867l;
        float f37 = rectF13.right;
        float f38 = f37 - this.f49859d;
        float f39 = rectF13.bottom;
        canvas.drawRect(f38, f39 - this.f49860e, f37, f39, this.f49865j);
        RectF rectF14 = this.f49867l;
        float f41 = rectF14.right;
        float f43 = this.f49860e;
        float f44 = rectF14.bottom;
        canvas.drawRect(f41 - f43, f44 - this.f49859d, f41, f44 - f43, this.f49865j);
    }

    public final void e(Context context, AttributeSet attributeSet, int i13) {
        float f13 = b.f69001a;
        this.f49858c = (int) (26.0f * f13);
        this.f49857b = 50.0f * f13;
        this.f49865j = new Paint();
        this.f49864i = new Paint();
        this.f49866k = new Paint();
        this.f49864i.setColor(1711276032);
        Paint paint = this.f49864i;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f49865j.setStyle(style);
        this.f49865j.setColor(-1);
        this.f49866k.setStyle(style);
        this.f49866k.setColor(201326592);
        float f14 = b.f69001a;
        this.f49859d = 17.0f * f14;
        this.f49860e = 5.0f * f14;
        this.f49872q = new ScaleGestureDetector(getContext(), new js1.b(this));
        this.f49873r = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.ImageCropperLayout, i13, 0);
            try {
                this.f49861f = obtainStyledAttributes.getBoolean(f.ImageCropperLayout_useLockedRect, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f49872q.setQuickScaleEnabled(false);
    }

    public final boolean f(RectF rectF) {
        return rectF.height() < this.f49857b;
    }

    public final boolean g(float f13, float f14, float f15, float f16) {
        float f17 = f13 - f15;
        float f18 = f14 - f16;
        return Math.pow((double) this.f49858c, 2.0d) >= ((double) ((f18 * f18) + (f17 * f17)));
    }

    public final boolean h(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        if (!this.f49867l.contains(x13, y13)) {
            RectF rectF = this.f49867l;
            if (!g(x13, y13, rectF.left, rectF.top)) {
                RectF rectF2 = this.f49867l;
                if (!g(x13, y13, rectF2.right, rectF2.top)) {
                    RectF rectF3 = this.f49867l;
                    if (!g(x13, y13, rectF3.left, rectF3.bottom)) {
                        RectF rectF4 = this.f49867l;
                        if (!g(x13, y13, rectF4.right, rectF4.bottom)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean i(RectF rectF) {
        return rectF.width() < this.f49857b;
    }

    public final void j(float f13, float f14) {
        this.f49867l.offset(f13, f14);
        RectF rectF = this.f49867l;
        float f15 = rectF.left;
        RectF rectF2 = this.f49868m;
        float f16 = f15 - rectF2.left;
        if (f16 < 0.0f) {
            rectF.left = f15 - f16;
            rectF.right -= f16;
        }
        float f17 = rectF.right;
        float f18 = f17 - rectF2.right;
        if (f18 > 0.0f) {
            rectF.left -= f18;
            rectF.right = f17 - f18;
        }
        float f19 = rectF.top;
        float f23 = f19 - rectF2.top;
        if (f23 < 0.0f) {
            rectF.top = f19 - f23;
            rectF.bottom -= f23;
        }
        float f24 = rectF.bottom;
        float f25 = f24 - rectF2.bottom;
        if (f25 > 0.0f) {
            rectF.top -= f25;
            rectF.bottom = f24 - f25;
        }
    }

    public final boolean k() {
        RectF rectF = this.f49867l;
        float f13 = rectF.left;
        RectF rectF2 = this.f49868m;
        return f13 - rectF2.left < 0.0f || rectF.right - rectF2.right > 0.0f || rectF.top - rectF2.top < 0.0f || rectF.bottom - rectF2.bottom > 0.0f;
    }

    public final void l(boolean z13) {
        this.f49873r = z13;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && this.f49873r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        KeyEvent.Callback childAt;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        super.onLayout(z13, i13, i14, i15, i16);
        if (getChildCount() > 1) {
            throw new IllegalStateException("ImageCropperLayout can only contain one child view or view group.");
        }
        if (getChildCount() != 1 || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f49862g = getWidth();
        int height = getHeight();
        this.f49863h = height;
        if (!this.f49873r || this.f49862g == 0 || height == 0) {
            return;
        }
        if (childAt instanceof j) {
            j jVar = (j) childAt;
            float z14 = jVar.z1() * 1.0f;
            float k03 = jVar.k0() * 1.0f;
            f13 = (z14 <= 0.0f || k03 <= 0.0f) ? this.f49863h : ((this.f49862g * 1.0f) / z14) * k03;
        } else {
            f13 = 0.0f;
        }
        float f19 = this.f49863h;
        float f23 = (f19 - f13) / 2.0f;
        if (this.f49861f) {
            float c13 = c(this.f49862g);
            float f24 = (f13 - c13) / 2.0f;
            if (f24 < 0.0f) {
                f17 = (this.f49862g - ((f13 / 9.0f) * 16.0f)) / 2.0f;
                f18 = 0.0f;
                c13 = f13;
            } else {
                f18 = f24;
                f17 = 0.0f;
            }
            f16 = f18 + f23;
            f15 = this.f49862g - f17;
            f14 = c13 + f16;
        } else {
            float f25 = this.f49862g;
            float f26 = (int) (f25 * 0.25f);
            float f27 = (int) (0.25f * f19);
            f14 = (int) (f19 * 0.75f);
            f15 = (int) (f25 * 0.75f);
            f16 = f27;
            f17 = f26;
        }
        this.f49867l = new RectF(f17, f16, f15, f14);
        this.f49869n = new RectF(this.f49867l);
        this.f49868m = new RectF(0.0f, f23, this.f49862g, f13 + f23);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (!this.f49873r) {
            return super.onTouchEvent(motionEvent);
        }
        if (!h(motionEvent) && !this.f49872q.isInProgress() && this.f49856a == c.OUT_OF_BOUNDS && (motionEvent.getAction() & 255) == 1) {
            j(motionEvent.getX() - this.f49867l.centerX(), motionEvent.getY() - this.f49867l.centerY());
            invalidate();
            return true;
        }
        if (h(motionEvent) || this.f49872q.isInProgress()) {
            this.f49872q.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f49874s = true;
            invalidate();
            this.f49870o = motionEvent.getX();
            this.f49871p = motionEvent.getY();
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            RectF rectF = this.f49867l;
            if (g(x13, y13, rectF.left, rectF.top)) {
                this.f49856a = c.LEFT_TOP;
            } else {
                RectF rectF2 = this.f49867l;
                if (g(x13, y13, rectF2.right, rectF2.top)) {
                    this.f49856a = c.RIGHT_TOP;
                } else {
                    RectF rectF3 = this.f49867l;
                    if (g(x13, y13, rectF3.left, rectF3.bottom)) {
                        this.f49856a = c.LEFT_BOTTOM;
                    } else {
                        RectF rectF4 = this.f49867l;
                        if (g(x13, y13, rectF4.right, rectF4.bottom)) {
                            this.f49856a = c.RIGHT_BOTTOM;
                        } else if (this.f49867l.contains(x13, y13)) {
                            this.f49856a = c.INSIDE;
                        } else {
                            this.f49856a = c.OUT_OF_BOUNDS;
                        }
                    }
                }
            }
            return true;
        }
        if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f49856a = c.OUT_OF_BOUNDS;
            invalidate();
            return true;
        }
        if (action != 2) {
            if (action == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f49856a = c.OUT_OF_BOUNDS;
                invalidate();
                return true;
            }
            if (action != 5) {
                if (action != 6) {
                    return false;
                }
                this.f49874s = false;
            }
            return true;
        }
        if (!this.f49872q.isInProgress() && this.f49874s) {
            float x14 = motionEvent.getX() - this.f49870o;
            float y14 = motionEvent.getY() - this.f49871p;
            c cVar = this.f49856a;
            c cVar2 = c.OUT_OF_BOUNDS;
            if (cVar != cVar2) {
                int ordinal = cVar.ordinal();
                if (ordinal == 1) {
                    j(x14, y14);
                } else if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (this.f49861f) {
                                    if (Math.abs(x14) >= Math.abs(y14)) {
                                        x14 = y14;
                                    }
                                    RectF rectF5 = this.f49867l;
                                    float f13 = rectF5.right;
                                    float f14 = rectF5.bottom;
                                    rectF5.right = f13 + x14;
                                    rectF5.bottom = c(x14) + f14;
                                    if (i(this.f49867l) || f(this.f49867l) || k()) {
                                        RectF rectF6 = this.f49867l;
                                        rectF6.right = f13;
                                        rectF6.bottom = f14;
                                    }
                                    a();
                                } else {
                                    RectF rectF7 = this.f49867l;
                                    rectF7.right += x14;
                                    rectF7.bottom += y14;
                                    if (i(rectF7)) {
                                        this.f49867l.right += this.f49857b - this.f49867l.width();
                                    }
                                    if (f(this.f49867l)) {
                                        this.f49867l.bottom += this.f49857b - this.f49867l.height();
                                    }
                                    a();
                                }
                            }
                        } else if (this.f49861f) {
                            if (x14 <= y14) {
                                x14 = y14 * (-1.0f);
                            }
                            RectF rectF8 = this.f49867l;
                            float f15 = rectF8.left;
                            float f16 = rectF8.bottom;
                            rectF8.left = f15 + x14;
                            rectF8.bottom = (c(x14) * (-1.0f)) + f16;
                            if (i(this.f49867l) || f(this.f49867l) || k()) {
                                RectF rectF9 = this.f49867l;
                                rectF9.left = f15;
                                rectF9.bottom = f16;
                            }
                            a();
                        } else {
                            RectF rectF10 = this.f49867l;
                            rectF10.left += x14;
                            rectF10.bottom += y14;
                            if (i(rectF10)) {
                                this.f49867l.left -= this.f49857b - this.f49867l.width();
                            }
                            if (f(this.f49867l)) {
                                this.f49867l.bottom += this.f49857b - this.f49867l.height();
                            }
                            a();
                        }
                    } else if (this.f49861f) {
                        if (x14 <= y14) {
                            x14 = y14 * (-1.0f);
                        }
                        RectF rectF11 = this.f49867l;
                        float f17 = rectF11.right;
                        float f18 = rectF11.top;
                        rectF11.right = f17 + x14;
                        rectF11.top = (c(x14) * (-1.0f)) + f18;
                        if (i(this.f49867l) || f(this.f49867l) || k()) {
                            RectF rectF12 = this.f49867l;
                            rectF12.right = f17;
                            rectF12.top = f18;
                        }
                        a();
                    } else {
                        RectF rectF13 = this.f49867l;
                        rectF13.right += x14;
                        rectF13.top += y14;
                        if (i(rectF13)) {
                            this.f49867l.right += this.f49857b - this.f49867l.width();
                        }
                        if (f(this.f49867l)) {
                            this.f49867l.top -= this.f49857b - this.f49867l.height();
                        }
                        a();
                    }
                } else if (this.f49861f) {
                    if (Math.abs(x14) <= Math.abs(y14)) {
                        x14 = y14;
                    }
                    RectF rectF14 = this.f49867l;
                    float f19 = rectF14.left;
                    float f23 = rectF14.top;
                    rectF14.left = f19 + x14;
                    rectF14.top = c(x14) + f23;
                    if (i(this.f49867l) || f(this.f49867l) || k()) {
                        RectF rectF15 = this.f49867l;
                        rectF15.left = f19;
                        rectF15.top = f23;
                    }
                    a();
                } else {
                    RectF rectF16 = this.f49867l;
                    rectF16.left += x14;
                    rectF16.top += y14;
                    if (i(rectF16)) {
                        this.f49867l.left -= this.f49857b - this.f49867l.width();
                    }
                    if (f(this.f49867l)) {
                        this.f49867l.top -= this.f49857b - this.f49867l.height();
                    }
                    a();
                }
            }
            invalidate();
            this.f49870o = motionEvent.getX();
            this.f49871p = motionEvent.getY();
            if (this.f49856a != cVar2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public ImageCropperLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f49856a = c.OUT_OF_BOUNDS;
        this.f49862g = 0;
        this.f49863h = 0;
        this.f49874s = true;
        e(context, attributeSet, i13);
    }
}
