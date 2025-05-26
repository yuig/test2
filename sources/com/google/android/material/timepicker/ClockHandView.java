package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import fj.l;
import fj.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kh2.g0;
import lb.l0;
import q5.v0;

/* loaded from: classes3.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f33345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33346b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f33347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33348d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33349e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f33350f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f33351g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33352h;

    /* renamed from: i, reason: collision with root package name */
    public float f33353i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33354j;

    /* renamed from: k, reason: collision with root package name */
    public double f33355k;

    /* renamed from: l, reason: collision with root package name */
    public int f33356l;

    /* renamed from: m, reason: collision with root package name */
    public int f33357m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialClockStyle);
    }

    public final int a(int i13) {
        return i13 == 2 ? Math.round(this.f33356l * 0.66f) : this.f33356l;
    }

    public final void b(float f13) {
        ValueAnimator valueAnimator = this.f33345a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f13);
    }

    public final void c(float f13) {
        float f14 = f13 % 360.0f;
        this.f33353i = f14;
        this.f33355k = Math.toRadians(f14 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a13 = a(this.f33357m);
        float cos = (((float) Math.cos(this.f33355k)) * a13) + width;
        float sin = (a13 * ((float) Math.sin(this.f33355k))) + height;
        float f15 = this.f33348d;
        this.f33351g.set(cos - f15, sin - f15, cos + f15, sin + f15);
        Iterator it = this.f33347c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f33343q - f14) > 0.001f) {
                clockFaceView.f33343q = f14;
                clockFaceView.T();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f13 = width;
        float a13 = a(this.f33357m);
        float cos = (((float) Math.cos(this.f33355k)) * a13) + f13;
        float f14 = height;
        float sin = (a13 * ((float) Math.sin(this.f33355k))) + f14;
        Paint paint = this.f33350f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f33348d, paint);
        double sin2 = Math.sin(this.f33355k);
        paint.setStrokeWidth(this.f33352h);
        canvas.drawLine(f13, f14, width + ((int) (Math.cos(this.f33355k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f13, f14, this.f33349e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (this.f33345a.isRunning()) {
            return;
        }
        b(this.f33353i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        boolean z15 = false;
        if (actionMasked == 0) {
            this.f33354j = false;
            z13 = true;
            z14 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z14 = this.f33354j;
            if (this.f33346b) {
                this.f33357m = g0.k((float) (getWidth() / 2), (float) (getHeight() / 2), x13, y13) <= ((float) a(2)) + l0.X(getContext(), 12) ? 2 : 1;
            }
            z13 = false;
        } else {
            z14 = false;
            z13 = false;
        }
        boolean z16 = this.f33354j;
        int degrees = (int) Math.toDegrees(Math.atan2(y13 - (getHeight() / 2), x13 - (getWidth() / 2)));
        int i13 = degrees + 90;
        if (i13 < 0) {
            i13 = degrees + 450;
        }
        float f13 = i13;
        boolean z17 = this.f33353i != f13;
        if (!z13 || !z17) {
            if (z17 || z14) {
                b(f13);
            }
            this.f33354j = z16 | z15;
            return true;
        }
        z15 = true;
        this.f33354j = z16 | z15;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f33345a = new ValueAnimator();
        this.f33347c = new ArrayList();
        Paint paint = new Paint();
        this.f33350f = paint;
        this.f33351g = new RectF();
        this.f33357m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ClockHandView, i13, l.Widget_MaterialComponents_TimePicker_Clock);
        tb.f.c0(context, fj.c.motionDurationLong2, 200);
        tb.f.d0(context, fj.c.motionEasingEmphasizedInterpolator, gj.a.f65168b);
        this.f33356l = obtainStyledAttributes.getDimensionPixelSize(m.ClockHandView_materialCircleRadius, 0);
        this.f33348d = obtainStyledAttributes.getDimensionPixelSize(m.ClockHandView_selectorSize, 0);
        this.f33352h = getResources().getDimensionPixelSize(fj.e.material_clock_hand_stroke_width);
        this.f33349e = r7.getDimensionPixelSize(fj.e.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(m.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = v0.f102521a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }
}
