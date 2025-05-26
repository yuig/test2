package com.pinterest.feature.search.visual.cropper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashSet;

@SuppressLint({"SetPaddingUsageIssue", "PaddingLeftRightUsageIssue"})
/* loaded from: classes5.dex */
public class FlashlightCropperView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f47953a;

    /* renamed from: b, reason: collision with root package name */
    public int f47954b;

    /* renamed from: c, reason: collision with root package name */
    public float f47955c;

    /* renamed from: d, reason: collision with root package name */
    public float f47956d;

    /* renamed from: e, reason: collision with root package name */
    public float f47957e;

    /* renamed from: f, reason: collision with root package name */
    public float f47958f;

    /* renamed from: g, reason: collision with root package name */
    public float f47959g;

    /* renamed from: h, reason: collision with root package name */
    public float f47960h;

    /* renamed from: i, reason: collision with root package name */
    public int f47961i;

    /* renamed from: j, reason: collision with root package name */
    public float f47962j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f47963k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f47964l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f47965m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f47966n;

    /* renamed from: o, reason: collision with root package name */
    public d f47967o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f47968p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f47969q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f47970r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f47971s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f47972t;

    /* renamed from: u, reason: collision with root package name */
    public f f47973u;

    /* renamed from: v, reason: collision with root package name */
    public e f47974v;

    /* renamed from: w, reason: collision with root package name */
    public ib2.d f47975w;

    public FlashlightCropperView(Context context) {
        super(context);
        this.f47963k = new RectF();
        this.f47964l = new RectF();
        this.f47966n = new RectF();
        this.f47968p = true;
        this.f47971s = false;
        this.f47972t = false;
        this.f47973u = f.DRAG_UNKNOWN;
        i(context);
    }

    public final boolean a(float f13, float f14) {
        d dVar = this.f47967o;
        float f15 = this.f47953a;
        RectF rectF = dVar.f48014b;
        float f16 = rectF.left;
        float f17 = rectF.right;
        float f18 = rectF.bottom;
        float f19 = f15 * 2;
        return f16 <= f13 && f13 <= f17 && f18 - f19 <= f14 && f14 <= f18 + f19;
    }

    public final boolean b(float f13, float f14) {
        d dVar = this.f47967o;
        float f15 = this.f47953a;
        RectF rectF = dVar.f48014b;
        float f16 = rectF.left;
        float f17 = f15 * 2;
        return f16 - f17 <= f13 && f13 <= f16 + f17 && rectF.top <= f14 && f14 <= rectF.bottom;
    }

    public final boolean e(float f13, float f14) {
        d dVar = this.f47967o;
        float f15 = this.f47953a;
        RectF rectF = dVar.f48014b;
        float f16 = rectF.right;
        float f17 = f15 * 2;
        return f16 - f17 <= f13 && f13 <= f16 + f17 && rectF.top <= f14 && f14 <= rectF.bottom;
    }

    public final boolean g(float f13, float f14) {
        d dVar = this.f47967o;
        float f15 = this.f47953a;
        RectF rectF = dVar.f48014b;
        float f16 = rectF.left;
        float f17 = rectF.right;
        float f18 = rectF.top;
        float f19 = f15 * 2;
        return f16 <= f13 && f13 <= f17 && f18 - f19 <= f14 && f14 <= f18 + f19;
    }

    public final void i(Context context) {
        setId(uc2.d.flashlight_cropper_view);
        this.f47961i = (int) getResources().getDimension(uc2.b.flashlight_cropper_min_size);
        this.f47967o = new d(context);
        int i13 = (int) (0.5f * this.f47961i);
        this.f47953a = i13;
        this.f47962j = (i13 * 2) + r3;
        setPadding(i13, i13, i13, i13);
        this.f47954b = this.f47953a * 2;
    }

    public final RectF j(float f13, float f14, float f15, float f16, float f17, float f18) {
        RectF rectF = this.f47963k;
        float min = Math.min(rectF.right - f17, Math.max(f13, rectF.left));
        float min2 = Math.min(rectF.bottom - f18, Math.max(f14, rectF.top));
        return new RectF(min, min2, Math.min(rectF.right, Math.max(this.f47959g - f15, f17) + min), Math.min(rectF.bottom, Math.max(this.f47960h - f16, f18) + min2));
    }

    public final void k() {
        this.f47973u = f.DRAG_BOTTOM_LEFT;
        float f13 = this.f47957e + this.f47959g;
        float f14 = this.f47962j;
        float f15 = f13 - f14;
        float f16 = this.f47958f;
        this.f47964l.set(f15, f16, f14 + f15, this.f47961i + f16);
    }

    public final void l() {
        this.f47973u = f.DRAG_BOTTOM_LINE;
        float f13 = this.f47957e + this.f47959g;
        float f14 = this.f47962j;
        float f15 = f13 - f14;
        float f16 = this.f47958f;
        this.f47964l.set(f15, f16, f14 + f15, this.f47961i + f16);
    }

    public final void m() {
        this.f47973u = f.DRAG_LEFT_LINE;
        float f13 = this.f47957e + this.f47959g;
        float f14 = this.f47962j;
        float f15 = f13 - f14;
        float f16 = (this.f47958f + this.f47960h) - f14;
        this.f47964l.set(f15, f16, f15 + f14, f14 + f16);
    }

    public final void n() {
        this.f47973u = f.DRAG_TOP_LEFT;
        float f13 = this.f47957e + this.f47959g;
        float f14 = this.f47962j;
        float f15 = f13 - f14;
        float f16 = (this.f47958f + this.f47960h) - f14;
        this.f47964l.set(f15, f16, f15 + f14, f14 + f16);
    }

    public final void o() {
        this.f47973u = f.DRAG_TOP_RIGHT;
        float f13 = this.f47957e;
        float f14 = this.f47958f + this.f47960h;
        float f15 = this.f47962j;
        float f16 = f14 - f15;
        this.f47964l.set(f13, f16, this.f47961i + f13, f15 + f16);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof e) {
            this.f47974v = (e) parent;
        }
        if (parent instanceof ib2.d) {
            this.f47975w = (ib2.d) parent;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f47963k.setEmpty();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47974v = null;
        this.f47975w = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f47967o.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (!z13 || i13 == i15 || i14 == i16) {
            return;
        }
        s(i13, i14, i15, i16);
        ib2.d dVar = this.f47975w;
        if (dVar == null || !this.f47968p) {
            return;
        }
        dVar.B0(this.f47966n);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f47967o.setBounds(0, 0, i13, i14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getActionIndex() == 0 && this.f47974v != null) {
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f47963k;
            RectF rectF2 = this.f47964l;
            if (actionMasked == 0) {
                boolean z13 = this.f47968p;
                this.f47969q = z13;
                if (z13) {
                    x(motionEvent, this.f47972t);
                    float x13 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    d dVar = this.f47967o;
                    float f13 = this.f47954b;
                    if (dVar.f48016d.a(x13, y13, f13, f13, f13, f13)) {
                        n();
                    } else {
                        d dVar2 = this.f47967o;
                        float f14 = this.f47954b;
                        if (dVar2.f48017e.a(x13, y13, f14, f14, f14, f14)) {
                            o();
                        } else {
                            d dVar3 = this.f47967o;
                            float f15 = this.f47954b;
                            if (dVar3.f48018f.a(x13, y13, f15, f15, f15, f15)) {
                                k();
                            } else {
                                d dVar4 = this.f47967o;
                                float f16 = this.f47954b;
                                if (dVar4.f48019g.a(x13, y13, f16, f16, f16, f16)) {
                                    this.f47973u = f.DRAG_BOTTOM_RIGHT;
                                    float f17 = this.f47957e;
                                    float f18 = this.f47958f;
                                    float f19 = this.f47961i;
                                    rectF2.set(f17, f18, f17 + f19, f19 + f18);
                                } else if (b(x13, y13)) {
                                    m();
                                } else if (g(x13, y13)) {
                                    this.f47973u = f.DRAG_TOP_LINE;
                                    float f23 = this.f47957e;
                                    float f24 = this.f47958f + this.f47960h;
                                    float f25 = this.f47962j;
                                    float f26 = f24 - f25;
                                    rectF2.set(f23, f26, this.f47959g + f23, f25 + f26);
                                } else if (e(x13, y13)) {
                                    this.f47973u = f.DRAG_RIGHT_LINE;
                                    float f27 = this.f47957e;
                                    float f28 = this.f47958f;
                                    rectF2.set(f27, f28, this.f47961i + f27, this.f47960h + f28);
                                } else if (a(x13, y13)) {
                                    l();
                                } else {
                                    this.f47973u = f.DRAG_GENERIC;
                                    rectF2.set(rectF);
                                }
                            }
                        }
                    }
                    ib2.d dVar5 = this.f47975w;
                    if (dVar5 != null && z13) {
                        dVar5.O2(this.f47966n);
                    }
                }
            } else if (actionMasked == 1) {
                q();
            } else if (actionMasked == 2) {
                if (this.f47969q) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float f29 = rawX + this.f47955c;
                    float f33 = rawY + this.f47956d;
                    switch (this.f47973u) {
                        case DRAG_UNKNOWN:
                            break;
                        case DRAG_GENERIC:
                            RectF j13 = j(f29, f33, 0.0f, 0.0f, this.f47959g, this.f47960h);
                            t(j13.left, j13.top, j13.right, j13.bottom);
                            break;
                        case DRAG_TOP_LEFT:
                            float f34 = f29 - this.f47957e;
                            float f35 = f33 - this.f47958f;
                            float f36 = this.f47962j;
                            RectF j14 = j(f29, f33, f34, f35, f36, f36);
                            float min = Math.min(j14.left, rectF2.left);
                            float min2 = Math.min(j14.top, rectF2.top);
                            RectF rectF3 = this.f47965m;
                            if (rectF3 != null) {
                                min = Math.max(min, rectF3.left);
                                min2 = Math.max(min2, this.f47965m.top);
                            }
                            t(min, min2, rectF2.right, rectF2.bottom);
                            break;
                        case DRAG_TOP_RIGHT:
                            float f37 = this.f47957e;
                            float f38 = f33 - this.f47958f;
                            float f39 = this.f47962j;
                            RectF j15 = j(f37, f33, f37 - f29, f38, f39, f39);
                            float min3 = Math.min(j15.top, rectF2.top);
                            float f41 = j15.right;
                            RectF rectF4 = this.f47965m;
                            if (rectF4 != null) {
                                min3 = Math.max(min3, rectF4.top);
                                f41 = Math.min(f41, this.f47965m.right);
                            }
                            t(rectF2.left, min3, f41, rectF2.bottom);
                            break;
                        case DRAG_BOTTOM_LEFT:
                            float f43 = this.f47958f;
                            float f44 = this.f47962j;
                            RectF j16 = j(f29, f43, f29 - this.f47957e, f43 - f33, f44, f44);
                            float min4 = Math.min(j16.left, rectF2.left);
                            float f45 = j16.bottom;
                            RectF rectF5 = this.f47965m;
                            if (rectF5 != null) {
                                min4 = Math.max(min4, rectF5.left);
                                f45 = Math.min(f45, this.f47965m.bottom);
                            }
                            t(min4, rectF2.top, rectF2.right, f45);
                            break;
                        case DRAG_BOTTOM_RIGHT:
                            float f46 = this.f47957e;
                            float f47 = this.f47958f;
                            float f48 = this.f47962j;
                            RectF j17 = j(f46, f47, f46 - f29, f47 - f33, f48, f48);
                            float f49 = j17.right;
                            float f53 = j17.bottom;
                            RectF rectF6 = this.f47965m;
                            if (rectF6 != null) {
                                f49 = Math.min(f49, rectF6.right);
                                f53 = Math.min(f53, this.f47965m.bottom);
                            }
                            t(rectF2.left, rectF2.top, f49, f53);
                            break;
                        case DRAG_TOP_LINE:
                            float max = Math.max(rectF.top, Math.min(f33, rectF2.top));
                            RectF rectF7 = this.f47965m;
                            if (rectF7 == null || max >= rectF7.top) {
                                t(rectF2.left, max, rectF2.right, rectF2.bottom);
                                break;
                            }
                            break;
                        case DRAG_LEFT_LINE:
                            float max2 = Math.max(rectF.left, Math.min(f29, rectF2.left));
                            RectF rectF8 = this.f47965m;
                            if (rectF8 == null || max2 >= rectF8.left) {
                                t(max2, Math.min(this.f47958f, rectF2.top), rectF2.right, rectF2.bottom);
                                break;
                            }
                            break;
                        case DRAG_RIGHT_LINE:
                            float f54 = rectF.right;
                            float f55 = this.f47957e;
                            float min5 = Math.min(f54, Math.max(this.f47959g - (f55 - f29), this.f47962j) + f55);
                            RectF rectF9 = this.f47965m;
                            if (rectF9 == null || min5 <= rectF9.right) {
                                t(rectF2.left, rectF2.top, min5, rectF2.bottom);
                                break;
                            }
                            break;
                        case DRAG_BOTTOM_LINE:
                            float f56 = rectF.bottom;
                            float f57 = this.f47958f;
                            float min6 = Math.min(f56, Math.max(this.f47960h - (f57 - f33), this.f47962j) + f57);
                            RectF rectF10 = this.f47965m;
                            if (rectF10 == null || min6 <= rectF10.bottom) {
                                t(Math.min(this.f47957e, rectF2.left), rectF2.top, rectF2.right, min6);
                                break;
                            }
                            break;
                        default:
                            HashSet hashSet = tb0.h.f117076w;
                            tb0.g.f117075a.p(new IllegalStateException("Touch event completely unhandled and unspecified. Please set drag type."));
                            break;
                    }
                }
            } else if (actionMasked == 3) {
                q();
            }
        }
        return true;
    }

    public void q() {
        f fVar;
        ib2.d dVar = this.f47975w;
        if (dVar != null && (fVar = this.f47973u) != f.DRAG_UNKNOWN) {
            if (fVar == f.DRAG_GENERIC) {
                dVar.F0();
            } else {
                dVar.V5();
            }
        }
        this.f47955c = 0.0f;
        this.f47956d = 0.0f;
        this.f47959g = 0.0f;
        this.f47960h = 0.0f;
        this.f47957e = 0.0f;
        this.f47958f = 0.0f;
        this.f47964l.setEmpty();
        this.f47969q = true;
        this.f47973u = f.DRAG_UNKNOWN;
        ib2.d dVar2 = this.f47975w;
        if (dVar2 == null || !this.f47968p) {
            return;
        }
        dVar2.r2(this.f47966n);
    }

    public final void s(float f13, float f14, float f15, float f16) {
        if (!this.f47970r) {
            f13 += getPaddingLeft();
        }
        if (!this.f47970r) {
            f14 += getPaddingTop();
        }
        if (!this.f47970r) {
            f15 -= getPaddingRight();
        }
        if (!this.f47970r) {
            f16 -= getPaddingBottom();
        }
        this.f47966n.set(f13, f14, f15, f16);
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        int i17 = this.f47953a;
        if (i13 == i17 && i14 == i17 && i15 == i17 && i16 == i17) {
            super.setPadding(i13, i14, i15, i16);
        } else {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(new IllegalArgumentException("Cannot directly set padding, use setSlop() instead."));
        }
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        int i17 = this.f47953a;
        if (i13 == i17 && i14 == i17 && i15 == i17 && i16 == i17) {
            super.setPaddingRelative(i13, i14, i15, i16);
        } else {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(new IllegalArgumentException("Cannot directly set padding, use setSlop() instead."));
        }
    }

    public final void t(float f13, float f14, float f15, float f16) {
        int i13 = (int) f13;
        int i14 = (int) f14;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i15 = ((int) f15) - i13;
        int i16 = ((int) f16) - i14;
        boolean z13 = marginLayoutParams.leftMargin != i13;
        boolean z14 = marginLayoutParams.topMargin != i14;
        boolean z15 = marginLayoutParams.width != i15;
        boolean z16 = marginLayoutParams.height != i16;
        if (z13) {
            marginLayoutParams.leftMargin = i13;
        }
        if (z14) {
            marginLayoutParams.topMargin = i14;
        }
        if (z15) {
            marginLayoutParams.width = i15;
        }
        if (z16) {
            marginLayoutParams.height = i16;
        }
        if (z13 || z14 || z15 || z16) {
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void x(MotionEvent motionEvent, boolean z13) {
        RectF rectF = this.f47963k;
        if (rectF.isEmpty() || z13) {
            c cVar = (c) this.f47974v;
            float f13 = cVar.f47997h.f47953a;
            RectF rectF2 = new RectF(f13, f13, cVar.f48011v, cVar.f47990a - f13);
            rectF.set(rectF2.left - getPaddingLeft(), rectF2.top - getPaddingTop(), rectF2.right + getPaddingRight(), rectF2.bottom + getPaddingBottom());
        }
        float f14 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
        this.f47957e = f14;
        this.f47958f = r7.topMargin;
        this.f47959g = r7.width;
        this.f47960h = r7.height;
        this.f47955c = f14 - motionEvent.getRawX();
        this.f47956d = this.f47958f - motionEvent.getRawY();
    }

    public FlashlightCropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47963k = new RectF();
        this.f47964l = new RectF();
        this.f47966n = new RectF();
        this.f47968p = true;
        this.f47971s = false;
        this.f47972t = false;
        this.f47973u = f.DRAG_UNKNOWN;
        i(context);
    }

    public FlashlightCropperView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f47963k = new RectF();
        this.f47964l = new RectF();
        this.f47966n = new RectF();
        this.f47968p = true;
        this.f47971s = false;
        this.f47972t = false;
        this.f47973u = f.DRAG_UNKNOWN;
        i(context);
    }
}
