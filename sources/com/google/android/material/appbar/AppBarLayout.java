package com.google.android.material.appbar;

import a41.n;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.measurement.x;
import fj.m;
import g1.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import q5.a2;
import q5.r;
import q5.r0;
import q5.v0;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements androidx.coordinatorlayout.widget.a {

    /* renamed from: y */
    public static final int f32098y = fj.l.Widget_Design_AppBarLayout;

    /* renamed from: a */
    public int f32099a;

    /* renamed from: b */
    public int f32100b;

    /* renamed from: c */
    public int f32101c;

    /* renamed from: d */
    public int f32102d;

    /* renamed from: e */
    public boolean f32103e;

    /* renamed from: f */
    public int f32104f;

    /* renamed from: g */
    public a2 f32105g;

    /* renamed from: h */
    public ArrayList f32106h;

    /* renamed from: i */
    public boolean f32107i;

    /* renamed from: j */
    public boolean f32108j;

    /* renamed from: k */
    public boolean f32109k;

    /* renamed from: l */
    public final int f32110l;

    /* renamed from: m */
    public WeakReference f32111m;

    /* renamed from: n */
    public final boolean f32112n;

    /* renamed from: o */
    public ValueAnimator f32113o;

    /* renamed from: p */
    public final ValueAnimator.AnimatorUpdateListener f32114p;

    /* renamed from: q */
    public final ArrayList f32115q;

    /* renamed from: r */
    public final long f32116r;

    /* renamed from: s */
    public final TimeInterpolator f32117s;

    /* renamed from: t */
    public int[] f32118t;

    /* renamed from: u */
    public final Drawable f32119u;

    /* renamed from: v */
    public final Integer f32120v;

    /* renamed from: w */
    public final float f32121w;

    /* renamed from: x */
    public Behavior f32122x;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f32134a;

        /* renamed from: b */
        public final x f32135b;

        /* renamed from: c */
        public final Interpolator f32136c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32134a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.AppBarLayout_Layout);
            this.f32134a = obtainStyledAttributes.getInt(m.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f32135b = obtainStyledAttributes.getInt(m.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new x(6);
            if (obtainStyledAttributes.hasValue(m.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f32136c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(m.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public final void a() {
            this.f32134a = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout G(List list) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) list.get(i13);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float I(View view) {
            int i13;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int h10 = appBarLayout.h();
                int d2 = appBarLayout.d();
                CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) appBarLayout.getLayoutParams()).f17900a;
                int D = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).D() : 0;
                if ((d2 == 0 || h10 + D > d2) && (i13 = h10 - d2) != 0) {
                    return (D / i13) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int J(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).h() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) view2.getLayoutParams()).f17900a;
            if (behavior instanceof BaseBehavior) {
                int bottom = ((((BaseBehavior) behavior).f32123j + (view2.getBottom() - view.getTop())) + this.f32174e) - H(view2);
                WeakHashMap weakHashMap = v0.f102521a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.j()) {
                return false;
            }
            appBarLayout.o(appBarLayout.p(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                v0.o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean u(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z13) {
            AppBarLayout appBarLayout;
            List p13 = coordinatorLayout.p(view);
            int size = p13.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) p13.get(i13);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i13++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f32172c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.m(false, !z13);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ScrollingViewBehavior_Layout);
            this.f32175f = obtainStyledAttributes.getDimensionPixelSize(m.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.appBarLayoutStyle);
    }

    public static LayoutParams c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f32134a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f32134a = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.f32134a = 1;
        return layoutParams4;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final CoordinatorLayout.Behavior a() {
        Behavior behavior = new Behavior();
        this.f32122x = behavior;
        return behavior;
    }

    public final void b(h hVar) {
        if (this.f32106h == null) {
            this.f32106h = new ArrayList();
        }
        if (hVar == null || this.f32106h.contains(hVar)) {
            return;
        }
        this.f32106h.add(hVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() {
        /*
            r9 = this;
            int r0 = r9.f32101c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f32134a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = q5.v0.f102521a
            int r4 = r3.getMinimumHeight()
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = q5.v0.f102521a
            int r4 = r3.getMinimumHeight()
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = q5.v0.f102521a
            boolean r3 = r3.getFitsSystemWindows()
            if (r3 == 0) goto L61
            int r3 = r9.g()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f32101c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.d():int");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f32119u == null || g() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.f32099a);
        this.f32119u.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f32119u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int e() {
        int i13 = this.f32102d;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i16 = layoutParams.f32134a;
                if ((i16 & 1) == 0) {
                    break;
                }
                i15 += measuredHeight;
                if ((i16 & 2) != 0) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    i15 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i14++;
        }
        int max = Math.max(0, i15);
        this.f32102d = max;
        return max;
    }

    public final int f() {
        int g13 = g();
        WeakHashMap weakHashMap = v0.f102521a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + g13;
    }

    public final int g() {
        a2 a2Var = this.f32105g;
        if (a2Var != null) {
            return a2Var.e();
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f32134a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public final int h() {
        int i13 = this.f32100b;
        if (i13 != -1) {
            return i13;
        }
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = layoutParams.f32134a;
                if ((i16 & 1) == 0) {
                    break;
                }
                int i17 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i15;
                if (i14 == 0) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    if (childAt.getFitsSystemWindows()) {
                        i17 -= g();
                    }
                }
                i15 = i17;
                if ((i16 & 2) != 0) {
                    WeakHashMap weakHashMap2 = v0.f102521a;
                    i15 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i14++;
        }
        int max = Math.max(0, i15);
        this.f32100b = max;
        return max;
    }

    public final void i() {
        Behavior behavior = this.f32122x;
        BaseBehavior.SavedState S = (behavior == null || this.f32100b == -1 || this.f32104f != 0) ? null : behavior.S(AbsSavedState.f18019b, this);
        this.f32100b = -1;
        this.f32101c = -1;
        this.f32102d = -1;
        if (S != null) {
            Behavior behavior2 = this.f32122x;
            if (behavior2.f32126m != null) {
                return;
            }
            behavior2.f32126m = S;
        }
    }

    public final boolean j() {
        return this.f32109k;
    }

    public final void k(int i13) {
        this.f32099a = i13;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = v0.f102521a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f32106h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                f fVar = (f) this.f32106h.get(i14);
                if (fVar != null) {
                    fVar.a(this, i13);
                }
            }
        }
    }

    public final void l(h hVar) {
        ArrayList arrayList = this.f32106h;
        if (arrayList == null || hVar == null) {
            return;
        }
        arrayList.remove(hVar);
    }

    public final void m(boolean z13, boolean z14) {
        n(z13, z14, true);
    }

    public final void n(boolean z13, boolean z14, boolean z15) {
        this.f32104f = (z13 ? 1 : 2) | (z14 ? 4 : 0) | (z15 ? 8 : 0);
        requestLayout();
    }

    public final boolean o(boolean z13) {
        if (this.f32108j == z13) {
            return false;
        }
        this.f32108j = z13;
        refreshDrawableState();
        if (getBackground() instanceof bk.i) {
            if (this.f32112n) {
                r(z13 ? 0.0f : 1.0f, z13 ? 1.0f : 0.0f);
            } else if (this.f32109k) {
                float f13 = this.f32121w;
                r(z13 ? 0.0f : f13, z13 ? f13 : 0.0f);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        if (this.f32118t == null) {
            this.f32118t = new int[4];
        }
        int[] iArr = this.f32118t;
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + iArr.length);
        boolean z13 = this.f32107i;
        int i14 = fj.c.state_liftable;
        if (!z13) {
            i14 = -i14;
        }
        iArr[0] = i14;
        iArr[1] = (z13 && this.f32108j) ? fj.c.state_lifted : -fj.c.state_lifted;
        int i15 = fj.c.state_collapsible;
        if (!z13) {
            i15 = -i15;
        }
        iArr[2] = i15;
        iArr[3] = (z13 && this.f32108j) ? fj.c.state_collapsed : -fj.c.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f32111m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f32111m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z14 = true;
        if (getFitsSystemWindows() && q()) {
            int g13 = g();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(g13);
            }
        }
        i();
        this.f32103e = false;
        int childCount2 = getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i17).getLayoutParams()).f32136c != null) {
                this.f32103e = true;
                break;
            }
            i17++;
        }
        Drawable drawable = this.f32119u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), g());
        }
        if (!this.f32109k) {
            int childCount3 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount3) {
                    z14 = false;
                    break;
                }
                int i19 = ((LayoutParams) getChildAt(i18).getLayoutParams()).f32134a;
                if ((i19 & 1) == 1 && (i19 & 10) != 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (this.f32107i != z14) {
            this.f32107i = z14;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (getFitsSystemWindows() && q()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = com.bumptech.glide.c.q(g() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i14));
                } else if (mode == 0) {
                    measuredHeight += g();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        i();
    }

    public final boolean p(View view) {
        int i13;
        if (this.f32111m == null && (i13 = this.f32110l) != -1) {
            View findViewById = view != null ? view.findViewById(i13) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(i13);
            }
            if (findViewById != null) {
                this.f32111m = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.f32111m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean q() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        return !childAt.getFitsSystemWindows();
    }

    public final void r(float f13, float f14) {
        ValueAnimator valueAnimator = this.f32113o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f14);
        this.f32113o = ofFloat;
        ofFloat.setDuration(this.f32116r);
        this.f32113o.setInterpolator(this.f32117s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f32114p;
        if (animatorUpdateListener != null) {
            this.f32113o.addUpdateListener(animatorUpdateListener);
        }
        this.f32113o.start();
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        d7.b.v0(this, f13);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i13) {
        if (i13 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i13);
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f32119u;
        if (drawable != null) {
            drawable.setVisible(z13, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32119u;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: j */
        public int f32123j;

        /* renamed from: k */
        public int f32124k;

        /* renamed from: l */
        public ValueAnimator f32125l;

        /* renamed from: m */
        public SavedState f32126m;

        /* renamed from: n */
        public WeakReference f32127n;

        /* renamed from: o */
        public d f32128o;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new e();

            /* renamed from: c */
            public boolean f32129c;

            /* renamed from: d */
            public boolean f32130d;

            /* renamed from: e */
            public int f32131e;

            /* renamed from: f */
            public float f32132f;

            /* renamed from: g */
            public boolean f32133g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f32129c = parcel.readByte() != 0;
                this.f32130d = parcel.readByte() != 0;
                this.f32131e = parcel.readInt();
                this.f32132f = parcel.readFloat();
                this.f32133g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                super.writeToParcel(parcel, i13);
                parcel.writeByte(this.f32129c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f32130d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f32131e);
                parcel.writeFloat(this.f32132f);
                parcel.writeByte(this.f32133g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f32168f = -1;
            this.f32170h = -1;
        }

        public static View M(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (((androidx.coordinatorlayout.widget.c) childAt.getLayoutParams()).f17900a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View P(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if ((childAt instanceof r) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13, int i14, boolean z13) {
            View view;
            boolean z14;
            int abs = Math.abs(i13);
            int childCount = appBarLayout.getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i15);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (view != null) {
                int i16 = ((LayoutParams) view.getLayoutParams()).f32134a;
                if ((i16 & 1) != 0) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    int minimumHeight = view.getMinimumHeight();
                    z14 = true;
                    if (i14 > 0) {
                    }
                }
            }
            z14 = false;
            if (appBarLayout.f32109k) {
                z14 = appBarLayout.p(P(coordinatorLayout));
            }
            boolean o13 = appBarLayout.o(z14);
            if (!z13) {
                if (o13) {
                    ArrayList arrayList = (ArrayList) ((o0) coordinatorLayout.f17882b.f33804b).get(appBarLayout);
                    List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                    if (arrayList2 == null) {
                        arrayList2 = Collections.emptyList();
                    }
                    int size = arrayList2.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) ((View) arrayList2.get(i17)).getLayoutParams()).f17900a;
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).f32175f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void A(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f32124k == 0 || i13 == 1) {
                U(coordinatorLayout, appBarLayout);
                if (appBarLayout.f32109k) {
                    appBarLayout.o(appBarLayout.p(view2));
                }
            }
            this.f32127n = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int D() {
            return C() + this.f32123j;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean G(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f32128o != null) {
                Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
                return false;
            }
            WeakReference weakReference = this.f32127n;
            return weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int H(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.g() + (-appBarLayout.e());
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int I(View view) {
            return ((AppBarLayout) view).h();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void J(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            U(coordinatorLayout, appBarLayout);
            if (appBarLayout.f32109k) {
                appBarLayout.o(appBarLayout.p(P(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int K(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
            View.AccessibilityDelegate d2;
            int i16;
            int i17;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int D = D();
            int i18 = 0;
            if (i14 == 0 || D < i14 || D > i15) {
                this.f32123j = 0;
            } else {
                int q13 = com.bumptech.glide.c.q(i13, i14, i15);
                if (D != q13) {
                    if (appBarLayout.f32103e) {
                        int abs = Math.abs(q13);
                        int childCount = appBarLayout.getChildCount();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i19);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f32136c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i19++;
                            } else if (interpolator != null) {
                                int i23 = layoutParams.f32134a;
                                if ((i23 & 1) != 0) {
                                    i17 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((i23 & 2) != 0) {
                                        WeakHashMap weakHashMap = v0.f102521a;
                                        i17 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i17 = 0;
                                }
                                WeakHashMap weakHashMap2 = v0.f102521a;
                                if (childAt.getFitsSystemWindows()) {
                                    i17 -= appBarLayout.g();
                                }
                                if (i17 > 0) {
                                    float f13 = i17;
                                    i16 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f13) * f13)) * Integer.signum(q13);
                                }
                            }
                        }
                    }
                    i16 = q13;
                    boolean F = F(i16);
                    int i24 = D - q13;
                    this.f32123j = q13 - i16;
                    if (F) {
                        for (int i25 = 0; i25 < appBarLayout.getChildCount(); i25++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i25).getLayoutParams();
                            x xVar = layoutParams2.f32135b;
                            if (xVar != null && (layoutParams2.f32134a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i25);
                                float C = C();
                                Rect rect = (Rect) xVar.f31694b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.g());
                                float abs2 = ((Rect) xVar.f31694b).top - Math.abs(C);
                                if (abs2 <= 0.0f) {
                                    float p13 = 1.0f - com.bumptech.glide.c.p(Math.abs(abs2 / ((Rect) xVar.f31694b).height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((((Rect) xVar.f31694b).height() * 0.3f) * (1.0f - (p13 * p13)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) xVar.f31695c);
                                    ((Rect) xVar.f31695c).offset(0, (int) (-height));
                                    if (height >= ((Rect) xVar.f31695c).height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    Rect rect2 = (Rect) xVar.f31695c;
                                    WeakHashMap weakHashMap3 = v0.f102521a;
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    WeakHashMap weakHashMap4 = v0.f102521a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                            }
                        }
                    }
                    if (!F && appBarLayout.f32103e) {
                        coordinatorLayout.h(appBarLayout);
                    }
                    appBarLayout.k(C());
                    V(coordinatorLayout, appBarLayout, q13, q13 < D ? -1 : 1, false);
                    i18 = i24;
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                WeakHashMap weakHashMap5 = v0.f102521a;
                d2 = r0.a(coordinatorLayout);
            } else {
                d2 = v0.d(coordinatorLayout);
            }
            if (d2 == null) {
                v0.o(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            }
            return i18;
        }

        public final void O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i13) {
            int abs = Math.abs(D() - i13);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int D = D();
            if (D == i13) {
                ValueAnimator valueAnimator = this.f32125l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f32125l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f32125l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f32125l = valueAnimator3;
                valueAnimator3.setInterpolator(gj.a.f65171e);
                this.f32125l.addUpdateListener(new b(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f32125l.setDuration(Math.min(round, AdSize.WIDE_SKYSCRAPER_HEIGHT));
            this.f32125l.setIntValues(D, i13);
            this.f32125l.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: Q */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int[] iArr, int i15) {
            int i16;
            int i17;
            if (i14 != 0) {
                if (i14 < 0) {
                    i16 = -appBarLayout.h();
                    i17 = appBarLayout.d() + i16;
                } else {
                    i16 = -appBarLayout.h();
                    i17 = 0;
                }
                int i18 = i16;
                int i19 = i17;
                if (i18 != i19) {
                    iArr[1] = K(coordinatorLayout, appBarLayout, D() - i14, i18, i19);
                }
            }
            if (appBarLayout.f32109k) {
                appBarLayout.o(appBarLayout.p(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: R */
        public boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i13, int i14) {
            ValueAnimator valueAnimator;
            boolean z13 = (i13 & 2) != 0 && (appBarLayout.f32109k || (appBarLayout.h() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()));
            if (z13 && (valueAnimator = this.f32125l) != null) {
                valueAnimator.cancel();
            }
            this.f32127n = null;
            this.f32124k = i14;
            return z13;
        }

        public final SavedState S(Parcelable parcelable, AppBarLayout appBarLayout) {
            int C = C();
            int childCount = appBarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = appBarLayout.getChildAt(i13);
                int bottom = childAt.getBottom() + C;
                if (childAt.getTop() + C <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f18019b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z13 = C == 0;
                    savedState.f32130d = z13;
                    savedState.f32129c = !z13 && (-C) >= appBarLayout.h();
                    savedState.f32131e = i13;
                    WeakHashMap weakHashMap = v0.f102521a;
                    savedState.f32133g = bottom == appBarLayout.g() + childAt.getMinimumHeight();
                    savedState.f32132f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void T(n nVar) {
            this.f32128o = nVar;
        }

        public final void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.g();
            int D = D() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    i13 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i13);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f32134a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i14 = -D;
                if (top <= i14 && bottom >= i14) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i13);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i15 = layoutParams2.f32134a;
                if ((i15 & 17) == 17) {
                    int i16 = -childAt2.getTop();
                    int i17 = -childAt2.getBottom();
                    if (i13 == 0) {
                        WeakHashMap weakHashMap = v0.f102521a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i16 -= appBarLayout.g();
                        }
                    }
                    if ((i15 & 2) == 2) {
                        WeakHashMap weakHashMap2 = v0.f102521a;
                        i17 += childAt2.getMinimumHeight();
                    } else if ((i15 & 5) == 5) {
                        WeakHashMap weakHashMap3 = v0.f102521a;
                        int minimumHeight = childAt2.getMinimumHeight() + i17;
                        if (D < minimumHeight) {
                            i16 = minimumHeight;
                        } else {
                            i17 = minimumHeight;
                        }
                    }
                    if ((i15 & 32) == 32) {
                        i16 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i17 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (D < (i17 + i16) / 2) {
                        i16 = i17;
                    }
                    O(coordinatorLayout, appBarLayout, com.bumptech.glide.c.q(i16 + paddingTop, -appBarLayout.h(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
            View.AccessibilityDelegate d2;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i13);
            int i14 = appBarLayout.f32104f;
            SavedState savedState = this.f32126m;
            if (savedState == null || (i14 & 8) != 0) {
                if (i14 != 0) {
                    boolean z13 = (i14 & 4) != 0;
                    if ((i14 & 2) != 0) {
                        int i15 = -appBarLayout.h();
                        if (z13) {
                            O(coordinatorLayout, appBarLayout, i15);
                        } else {
                            L(coordinatorLayout, appBarLayout, i15);
                        }
                    } else if ((i14 & 1) != 0) {
                        if (z13) {
                            O(coordinatorLayout, appBarLayout, 0);
                        } else {
                            L(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f32129c) {
                L(coordinatorLayout, appBarLayout, -appBarLayout.h());
            } else if (savedState.f32130d) {
                L(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f32131e);
                int i16 = -childAt.getBottom();
                if (this.f32126m.f32133g) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    round = appBarLayout.g() + childAt.getMinimumHeight() + i16;
                } else {
                    round = Math.round(childAt.getHeight() * this.f32126m.f32132f) + i16;
                }
                L(coordinatorLayout, appBarLayout, round);
            }
            appBarLayout.f32104f = 0;
            this.f32126m = null;
            F(com.bumptech.glide.c.q(C(), -appBarLayout.h(), 0));
            V(coordinatorLayout, appBarLayout, C(), 0, true);
            appBarLayout.k(C());
            if (Build.VERSION.SDK_INT >= 29) {
                WeakHashMap weakHashMap2 = v0.f102521a;
                d2 = r0.a(coordinatorLayout);
            } else {
                d2 = v0.d(coordinatorLayout);
            }
            if (d2 == null) {
                v0.o(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.G(appBarLayout, i13, i14, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            View.AccessibilityDelegate d2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i16 < 0) {
                iArr[1] = K(coordinatorLayout, appBarLayout, D() - i16, -appBarLayout.e(), 0);
            }
            if (i16 == 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    d2 = r0.a(coordinatorLayout);
                } else {
                    d2 = v0.d(coordinatorLayout);
                }
                if (d2 != null) {
                    return;
                }
                v0.o(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void v(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f32126m = (SavedState) parcelable;
            } else {
                this.f32126m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable w(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState S = S(absSavedState, (AppBarLayout) view);
            return S == null ? absSavedState : S;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f32134a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
