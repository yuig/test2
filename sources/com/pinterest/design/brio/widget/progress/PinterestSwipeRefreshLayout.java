package com.pinterest.design.brio.widget.progress;

import android.R;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.widget.NestedScrollingViewGroup;
import d5.a;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import q5.v0;
import se0.c;
import se0.i;
import se0.j;
import se0.k;
import se0.m;
import se0.n;
import se0.o;
import se0.p;
import se0.q;
import ue0.b;

/* loaded from: classes.dex */
public class PinterestSwipeRefreshLayout extends NestedScrollingViewGroup implements c {
    public static final int[] H = {R.attr.enabled};
    public int A;
    public m B;
    public boolean C;
    public float D;
    public final int[] E;
    public final int[] F;
    public boolean G;

    /* renamed from: c, reason: collision with root package name */
    public float f44869c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f44870d;

    /* renamed from: e, reason: collision with root package name */
    public int f44871e;

    /* renamed from: f, reason: collision with root package name */
    public int f44872f;

    /* renamed from: g, reason: collision with root package name */
    public int f44873g;

    /* renamed from: h, reason: collision with root package name */
    public b f44874h;

    /* renamed from: i, reason: collision with root package name */
    public n f44875i;

    /* renamed from: j, reason: collision with root package name */
    public View f44876j;

    /* renamed from: k, reason: collision with root package name */
    public p f44877k;

    /* renamed from: l, reason: collision with root package name */
    public View f44878l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44879m;

    /* renamed from: n, reason: collision with root package name */
    public k f44880n;

    /* renamed from: o, reason: collision with root package name */
    public j f44881o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44882p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f44883q;

    /* renamed from: r, reason: collision with root package name */
    public float f44884r;

    /* renamed from: s, reason: collision with root package name */
    public float f44885s;

    /* renamed from: t, reason: collision with root package name */
    public float f44886t;

    /* renamed from: u, reason: collision with root package name */
    public float f44887u;

    /* renamed from: v, reason: collision with root package name */
    public float f44888v;

    /* renamed from: w, reason: collision with root package name */
    public float f44889w;

    /* renamed from: x, reason: collision with root package name */
    public final float f44890x;

    /* renamed from: y, reason: collision with root package name */
    public float f44891y;

    /* renamed from: z, reason: collision with root package name */
    public float f44892z;

    public PinterestSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44870d = new Rect();
        this.f44871e = -1;
        this.f44872f = -1;
        this.f44879m = false;
        this.f44890x = -1.0f;
        this.E = new int[2];
        this.F = new int[2];
        g(context);
        i(context, attributeSet);
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup
    public final int[] a() {
        return this.F;
    }

    public final void b(long j13, boolean z13) {
        k kVar;
        if (!this.f44882p) {
            this.f44883q = true;
            return;
        }
        this.f44875i = n.ANIMATE_TO_REFRESH;
        q qVar = (q) this.f44877k;
        qVar.getClass();
        qVar.setVisibility(0);
        m mVar = this.B;
        mVar.a(mVar.f112391d, 1.0f, 1.0f, mVar.f112392e, mVar.f112401n, j13, null);
        ((q) this.f44877k).f112418a.start();
        if (!z13 || (kVar = this.f44880n) == null) {
            return;
        }
        kVar.V1();
    }

    public final void c() {
        this.f44875i = n.ANIMATE_TO_RESET;
        m mVar = this.B;
        mVar.a(mVar.f112390c, 0.0f, 0.0f, 0.0f, mVar.f112400m, 750L, mVar.f112402o);
    }

    public final void d(float f13) {
        j jVar;
        float f14 = this.f44890x;
        if (f14 != -1.0f) {
            f13 = Math.min(f13, f14);
        }
        float f15 = 0.5f * f13;
        q qVar = (q) this.f44877k;
        qVar.getClass();
        if (qVar.getVisibility() != 0) {
            q qVar2 = (q) this.f44877k;
            qVar2.getClass();
            qVar2.setVisibility(0);
        }
        float f16 = (this.f44887u - this.f44884r) * 1.0f;
        float min = Math.min(f15 <= f16 ? f15 / f16 : ((f15 - f16) * this.f44886t) + 1.0f, 1.0f);
        float f17 = this.f44884r + f15;
        ((q) this.f44877k).getClass();
        float measuredHeight = ((r0.getMeasuredHeight() * min) / 2.0f) + f17;
        float min2 = Math.min(1.0f, min) * 360.0f;
        q qVar3 = (q) this.f44877k;
        qVar3.setY(measuredHeight);
        qVar3.setAlpha(Math.min(1.0f, min));
        qVar3.setScaleX(min);
        qVar3.setScaleY(min);
        o oVar = qVar3.f112418a;
        if (oVar.f112407e != min2) {
            oVar.f112407e = min2;
            oVar.invalidateSelf();
        }
        f();
        View view = this.f44878l;
        if (view != null) {
            view.setTranslationY(f13);
            if (this.f44878l.getY() <= 0.0f || (jVar = this.f44881o) == null) {
                return;
            }
            jVar.d(f13);
        }
    }

    public final void e() {
        AnimatorSet animatorSet;
        int ordinal = this.f44875i.ordinal();
        if ((ordinal == 3 || ordinal == 5) && (animatorSet = this.B.f112399l) != null) {
            animatorSet.cancel();
        }
        ((q) this.f44877k).f112418a.stop();
    }

    public final void f() {
        if (this.f44878l == null) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (h(childAt)) {
                    this.f44878l = childAt;
                    return;
                }
            }
        }
    }

    public final void g(Context context) {
        setWillNotDraw(true);
        Resources resources = getResources();
        this.f44869c = resources.getDisplayMetrics().density;
        this.f44873g = resources.getDimensionPixelSize(eo1.c.spinner_diameter_small);
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = a.f53679a;
        context.getColor(i13);
        this.f44874h = new b(context, new i(this));
        this.f44875i = n.IDLE;
        int i14 = this.f44871e;
        if (i14 >= 0) {
            removeViewAt(i14);
            this.f44871e = -1;
        }
        this.f44876j = null;
        q qVar = new q(context, this.f44873g);
        int i15 = this.f44872f;
        if (i15 >= 0) {
            removeViewAt(i15);
        }
        int childCount = getChildCount();
        this.f44872f = childCount;
        this.f44877k = qVar;
        addView(qVar, childCount);
        q qVar2 = (q) this.f44877k;
        qVar2.getClass();
        qVar2.setVisibility(8);
        this.A = resources.getInteger(R.integer.config_mediumAnimTime);
        this.B = new m(new b20.c(this));
        this.f44882p = false;
        this.f44883q = false;
        this.f44886t = 0.0f;
        this.f44891y = 0.0f;
        this.f44892z = this.f44869c * 1.0f;
        if (v0.f102522b == null) {
            try {
                v0.f102522b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e13) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e13);
            }
            v0.f102522b.setAccessible(true);
        }
        try {
            v0.f102522b.invoke(this, Boolean.TRUE);
        } catch (IllegalAccessException e14) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e14);
        } catch (IllegalArgumentException e15) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e15);
        } catch (InvocationTargetException e16) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e16);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        int i15 = this.f44871e;
        if (i15 < 0) {
            int i16 = this.f44872f;
            return i16 < 0 ? i14 : i14 == i13 + (-1) ? i16 : i14 >= i16 ? i14 + 1 : i14;
        }
        if (i14 == 0) {
            return i15;
        }
        if (i14 == i13 - 1) {
            return this.f44872f;
        }
        if (i14 < i15 || (i14 == i15 && i14 < this.f44872f)) {
            i14--;
        }
        int i17 = this.f44872f;
        return (i14 > i17 || (i14 == i17 && i14 > i15)) ? i14 + 1 : i14;
    }

    public boolean h(View view) {
        return (view == null || view.equals(this.f44877k) || view.equals(this.f44876j)) ? false : true;
    }

    public final void i(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, le0.i.PinterestSwipeRefreshLayout);
        this.f44891y = obtainStyledAttributes2.getDimensionPixelSize(le0.i.PinterestSwipeRefreshLayout_spinnerYStart, (int) this.f44891y);
        this.f44892z = obtainStyledAttributes2.getDimensionPixelSize(le0.i.PinterestSwipeRefreshLayout_spinnerYEnd, (int) this.f44892z);
        this.f44888v = obtainStyledAttributes2.getDimensionPixelSize(le0.i.PinterestSwipeRefreshLayout_targetYOffset, (int) this.f44888v);
        obtainStyledAttributes2.recycle();
    }

    public final void j() {
        q qVar = (q) this.f44877k;
        qVar.getClass();
        float y13 = qVar.getY();
        q qVar2 = (q) this.f44877k;
        qVar2.getClass();
        boolean z13 = y13 - ((((float) qVar2.getMeasuredHeight()) * 1.0f) / 2.0f) > this.f44887u;
        o(z13, z13, true);
    }

    public final void k() {
        p pVar = this.f44877k;
        float f13 = this.f44884r;
        q qVar = (q) pVar;
        qVar.f112418a.stop();
        qVar.setY(f13);
        qVar.setAlpha(1.0f);
        qVar.setScaleX(0.0f);
        qVar.setScaleY(0.0f);
        qVar.setVisibility(8);
        f();
        View view = this.f44878l;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
    }

    public final void l(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("PinterestSwipeRefreshLayout.LAYOUT_SAVED_STATE_KEY");
        if (parcelable != null) {
            onRestoreInstanceState(parcelable);
        }
    }

    public final void m(Bundle bundle) {
        Parcelable onSaveInstanceState = onSaveInstanceState();
        if (onSaveInstanceState != null) {
            bundle.putParcelable("PinterestSwipeRefreshLayout.LAYOUT_SAVED_STATE_KEY", onSaveInstanceState);
        }
    }

    public void n(boolean z13) {
        if (!z13 || this.f44879m == z13) {
            o(z13, false, false);
        } else {
            this.f44879m = z13;
            b(this.A, false);
        }
    }

    public final void o(boolean z13, boolean z14, boolean z15) {
        if (z15 || this.f44879m != z13) {
            f();
            this.f44879m = z13;
            if (z13) {
                b((long) ((Math.abs(this.f44878l.getTranslationY() - this.f44889w) / this.f44869c) * 1.3f), z14);
            } else if (this.f44882p) {
                c();
            } else if (this.f44883q) {
                this.f44883q = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        k();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        boolean isAnimatingToReset = this.f44875i.isAnimatingToReset();
        if (isAnimatingToReset && actionMasked == 0) {
            isAnimatingToReset = false;
        }
        if (isEnabled() && !isAnimatingToReset) {
            View view = this.f44878l;
            WeakHashMap weakHashMap = v0.f102521a;
            if (!view.canScrollVertically(-1) && !this.f44875i.isRefreshing() && !this.G) {
                return this.f44874h.b(motionEvent, this.f44875i.isAnimatingToReset() ? this.f44878l.getTranslationY() : 0.0f, this.f44875i.isUserDragInterruptReset());
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f44878l == null) {
            f();
            if (this.f44878l == null) {
                return;
            }
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingEnd();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        Rect rect = this.f44870d;
        rect.set(paddingStart, paddingTop, measuredWidth, measuredHeight);
        this.f44878l.layout(rect.left, rect.top, rect.right, rect.bottom);
        View view = this.f44876j;
        if (view != null) {
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        q qVar = (q) this.f44877k;
        qVar.getClass();
        int top = qVar.getTop();
        q qVar2 = (q) this.f44877k;
        qVar2.getClass();
        int measuredHeight2 = qVar2.getMeasuredHeight() + top;
        int measuredWidth2 = getMeasuredWidth() / 2;
        q qVar3 = (q) this.f44877k;
        qVar3.getClass();
        int measuredWidth3 = qVar3.getMeasuredWidth() / 2;
        q qVar4 = (q) this.f44877k;
        qVar4.getClass();
        qVar4.layout(measuredWidth2 - measuredWidth3, top, measuredWidth2 + measuredWidth3, measuredHeight2);
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingEnd();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        Rect rect = this.f44870d;
        rect.set(paddingStart, paddingTop, measuredWidth, measuredHeight);
        View view = this.f44876j;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
        }
        f();
        View view2 = this.f44878l;
        if (view2 == null) {
            return;
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
        q qVar = (q) this.f44877k;
        qVar.getClass();
        qVar.measure(View.MeasureSpec.makeMeasureSpec(((q) this.f44877k).f112418a.f112406d, 1073741824), View.MeasureSpec.makeMeasureSpec(((q) this.f44877k).f112418a.f112406d, 1073741824));
        if (!this.f44882p) {
            m mVar = this.B;
            q qVar2 = (q) this.f44877k;
            qVar2.getClass();
            View view3 = this.f44878l;
            mVar.f112388a = qVar2;
            mVar.f112389b = view3;
            mVar.f112397j.setTarget(qVar2);
            mVar.f112398k.setTarget(mVar.f112389b);
            if (!this.C) {
                int i15 = (int) this.f44891y;
                p pVar = this.f44877k;
                float f13 = pVar != null ? i15 - ((q) pVar).f112418a.f112406d : 0;
                this.f44884r = f13;
                this.f44885s = f13 + ((q) pVar).f112418a.f112406d + this.f44892z;
            }
            this.f44887u = this.f44885s;
            this.f44886t = 1.0f / (rect.height() * 0.5f);
            p(this.f44884r, this.f44885s, this.f44888v);
            k();
            this.f44882p = true;
            if (this.f44883q) {
                b(this.A, false);
                this.f44883q = false;
            }
        }
        this.f44871e = -1;
        this.f44872f = -1;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            p pVar2 = this.f44877k;
            if (childAt == pVar2) {
                this.f44872f = i16;
            } else if (childAt == this.f44876j) {
                this.f44871e = i16;
            }
            if ((pVar2 == null || this.f44872f != -1) && (this.f44876j == null || this.f44871e != -1)) {
                return;
            }
        }
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        if (i14 > 0) {
            float f13 = this.D;
            if (f13 > 0.0f) {
                float f14 = i14;
                if (f14 > f13) {
                    iArr[1] = i14 - ((int) f13);
                    this.D = 0.0f;
                } else {
                    this.D = f13 - f14;
                    iArr[1] = i14;
                }
                d(this.D);
            }
        }
        if (this.C && i14 > 0 && this.D == 0.0f && Math.abs(i14 - iArr[1]) > 0) {
            q qVar = (q) this.f44877k;
            qVar.getClass();
            qVar.setVisibility(8);
        }
        int i15 = i13 - iArr[0];
        int i16 = i14 - iArr[1];
        int[] iArr2 = this.E;
        if (dispatchNestedPreScroll(i15, i16, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        super.onNestedScroll(view, i13, i14, i15, i16);
        float f13 = this.D - (i16 + this.F[1]);
        this.D = f13;
        d(Math.max(f13, 0.0f));
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        super.onNestedScrollAccepted(view, view2, i13);
        this.D = 0.0f;
        this.G = true;
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        return (!isEnabled() || this.f44875i.isAnimatingToReset() || this.f44879m || (i13 & 2) == 0) ? false : true;
    }

    @Override // com.pinterest.design.widget.NestedScrollingViewGroup, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.G = false;
        if (this.D != 0.0f) {
            j();
            this.D = 0.0f;
        }
        super.onStopNestedScroll(view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean isAnimatingToReset = this.f44875i.isAnimatingToReset();
        if (isAnimatingToReset && actionMasked == 0) {
            isAnimatingToReset = false;
        }
        if (isEnabled() && !isAnimatingToReset) {
            View view = this.f44878l;
            WeakHashMap weakHashMap = v0.f102521a;
            if (!view.canScrollVertically(-1) && !this.f44875i.isRefreshing() && !this.G) {
                return this.f44874h.c(motionEvent);
            }
        }
        return false;
    }

    public final void p(float f13, float f14, float f15) {
        this.f44884r = f13;
        this.f44885s = f14;
        this.f44888v = f15;
        p pVar = this.f44877k;
        float f16 = ((((((q) pVar).f112418a.f112406d / 2) + f14) - (((q) pVar).f112418a.f112406d + f13)) * 2.0f) + f15;
        this.f44889w = f16;
        m mVar = this.B;
        mVar.f112390c = f13;
        mVar.f112391d = f14;
        mVar.f112392e = f16;
    }

    @Override // se0.c
    public final void showLoadingSpinner(boolean z13) {
        n(z13);
    }

    public PinterestSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44870d = new Rect();
        this.f44871e = -1;
        this.f44872f = -1;
        this.f44879m = false;
        this.f44890x = -1.0f;
        this.E = new int[2];
        this.F = new int[2];
        g(context);
        i(context, attributeSet);
    }
}
