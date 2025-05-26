package com.google.android.material.sidesheet;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import bk.i;
import bk.o;
import com.google.android.material.sidesheet.SideSheetBehavior;
import fj.k;
import fj.l;
import fj.m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kj.c;
import n7.y;
import q5.v0;
import vj.b;
import vj.j;
import y5.d;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements b {

    /* renamed from: x, reason: collision with root package name */
    public static final int f33017x = k.side_sheet_accessibility_pane_title;

    /* renamed from: y, reason: collision with root package name */
    public static final int f33018y = l.Widget_Material3_SideSheet;

    /* renamed from: a, reason: collision with root package name */
    public ck.a f33019a;

    /* renamed from: b, reason: collision with root package name */
    public final i f33020b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f33021c;

    /* renamed from: d, reason: collision with root package name */
    public final o f33022d;

    /* renamed from: e, reason: collision with root package name */
    public final c f33023e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33024f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33025g;

    /* renamed from: h, reason: collision with root package name */
    public int f33026h;

    /* renamed from: i, reason: collision with root package name */
    public d f33027i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33028j;

    /* renamed from: k, reason: collision with root package name */
    public final float f33029k;

    /* renamed from: l, reason: collision with root package name */
    public int f33030l;

    /* renamed from: m, reason: collision with root package name */
    public int f33031m;

    /* renamed from: n, reason: collision with root package name */
    public int f33032n;

    /* renamed from: o, reason: collision with root package name */
    public int f33033o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f33034p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f33035q;

    /* renamed from: r, reason: collision with root package name */
    public final int f33036r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f33037s;

    /* renamed from: t, reason: collision with root package name */
    public j f33038t;

    /* renamed from: u, reason: collision with root package name */
    public int f33039u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f33040v;

    /* renamed from: w, reason: collision with root package name */
    public final ck.c f33041w;

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33023e = new c(this);
        this.f33025g = true;
        this.f33026h = 5;
        this.f33029k = 0.1f;
        this.f33036r = -1;
        this.f33040v = new LinkedHashSet();
        this.f33041w = new ck.c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(m.SideSheetBehavior_Layout_backgroundTint)) {
            this.f33021c = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(m.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f33022d = o.b(0, f33018y, context, attributeSet).a();
        }
        if (obtainStyledAttributes.hasValue(m.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = obtainStyledAttributes.getResourceId(m.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.f33036r = resourceId;
            WeakReference weakReference = this.f33035q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f33035q = null;
            WeakReference weakReference2 = this.f33034p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        o oVar = this.f33022d;
        if (oVar != null) {
            i iVar = new i(oVar);
            this.f33020b = iVar;
            iVar.o(context);
            ColorStateList colorStateList = this.f33021c;
            if (colorStateList != null) {
                this.f33020b.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f33020b.setTint(typedValue.data);
            }
        }
        this.f33024f = obtainStyledAttributes.getDimension(m.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f33025g = obtainStyledAttributes.getBoolean(m.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f33026h == 1 && actionMasked == 0) {
            return true;
        }
        if (E()) {
            this.f33027i.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f33037s) != null) {
            velocityTracker.recycle();
            this.f33037s = null;
        }
        if (this.f33037s == null) {
            this.f33037s = VelocityTracker.obtain();
        }
        this.f33037s.addMovement(motionEvent);
        if (E() && actionMasked == 2 && !this.f33028j && E()) {
            float abs = Math.abs(this.f33039u - motionEvent.getX());
            d dVar = this.f33027i;
            if (abs > dVar.f137747b) {
                dVar.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f33028j;
    }

    public final void C(int i13) {
        if (i13 == 1 || i13 == 2) {
            throw new IllegalArgumentException(a.a.p(new StringBuilder("STATE_"), i13 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f33034p;
        if (weakReference == null || weakReference.get() == null) {
            D(i13);
            return;
        }
        View view = (View) this.f33034p.get();
        v.k kVar = new v.k(this, i13, 8);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (view.isAttachedToWindow()) {
                view.post(kVar);
                return;
            }
        }
        kVar.run();
    }

    public final void D(int i13) {
        View view;
        if (this.f33026h == i13) {
            return;
        }
        this.f33026h = i13;
        WeakReference weakReference = this.f33034p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i14 = this.f33026h == 5 ? 4 : 0;
        if (view.getVisibility() != i14) {
            view.setVisibility(i14);
        }
        Iterator it = this.f33040v.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        G();
    }

    public final boolean E() {
        return this.f33027i != null && (this.f33025g || this.f33026h == 1);
    }

    public final void F(View view, int i13, boolean z13) {
        int y13;
        if (i13 == 3) {
            y13 = this.f33019a.y();
        } else {
            if (i13 != 5) {
                throw new IllegalArgumentException(a.a.d("Invalid state to get outer edge offset: ", i13));
            }
            y13 = this.f33019a.z();
        }
        d dVar = this.f33027i;
        if (dVar == null || (!z13 ? dVar.u(view, y13, view.getTop()) : dVar.s(y13, view.getTop()))) {
            D(i13);
        } else {
            D(2);
            this.f33023e.a(i13);
        }
    }

    public final void G() {
        View view;
        WeakReference weakReference = this.f33034p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.l(view, 262144);
        v0.i(view, 0);
        v0.l(view, 1048576);
        v0.i(view, 0);
        int i13 = 2;
        int i14 = 5;
        if (this.f33026h != 5) {
            v0.m(view, r5.d.f106221o, null, new y(this, i14, i13));
        }
        int i15 = 3;
        if (this.f33026h != 3) {
            v0.m(view, r5.d.f106219m, null, new y(this, i15, i13));
        }
    }

    @Override // vj.b
    public final void b() {
        j jVar = this.f33038t;
        if (jVar == null) {
            return;
        }
        jVar.b();
    }

    @Override // vj.b
    public final void c(androidx.activity.b bVar) {
        j jVar = this.f33038t;
        if (jVar == null) {
            return;
        }
        jVar.f125894f = bVar;
    }

    @Override // vj.b
    public final void d(androidx.activity.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f33038t;
        if (jVar == null) {
            return;
        }
        ck.a aVar = this.f33019a;
        int i13 = 5;
        if (aVar != null) {
            switch (aVar.f27895e) {
                case 0:
                    i13 = 3;
                    break;
            }
        }
        if (jVar.f125894f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = jVar.f125894f;
        jVar.f125894f = bVar;
        if (bVar2 != null) {
            jVar.d(bVar.f15875c, i13, bVar.f15876d == 0);
        }
        WeakReference weakReference = this.f33034p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f33034p.get();
        WeakReference weakReference2 = this.f33035q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        int scaleX = (int) ((view.getScaleX() * this.f33030l) + this.f33033o);
        switch (this.f33019a.f27895e) {
            case 0:
                marginLayoutParams.leftMargin = scaleX;
                break;
            default:
                marginLayoutParams.rightMargin = scaleX;
                break;
        }
        view2.requestLayout();
    }

    @Override // vj.b
    public final void e() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i13;
        j jVar = this.f33038t;
        if (jVar == null) {
            return;
        }
        androidx.activity.b bVar = jVar.f125894f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f125894f = null;
        int i14 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            C(5);
            return;
        }
        ck.a aVar = this.f33019a;
        if (aVar != null) {
            switch (aVar.f27895e) {
                case 0:
                    i14 = 3;
                    break;
            }
        }
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(this, 9);
        WeakReference weakReference = this.f33035q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.f33019a.f27895e) {
                case 0:
                    i13 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i13 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ck.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a aVar2 = SideSheetBehavior.this.f33019a;
                    int c13 = gj.a.c(i13, valueAnimator.getAnimatedFraction(), 0);
                    int i15 = aVar2.f27895e;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    switch (i15) {
                        case 0:
                            marginLayoutParams2.leftMargin = c13;
                            break;
                        default:
                            marginLayoutParams2.rightMargin = c13;
                            break;
                    }
                    view.requestLayout();
                }
            };
        }
        jVar.c(bVar, i14, dVar, animatorUpdateListener);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(androidx.coordinatorlayout.widget.c cVar) {
        this.f33034p = null;
        this.f33027i = null;
        this.f33038t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.f33034p = null;
        this.f33027i = null;
        this.f33038t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.e(view) == null) || !this.f33025g) {
            this.f33028j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f33037s) != null) {
            velocityTracker.recycle();
            this.f33037s = null;
        }
        if (this.f33037s == null) {
            this.f33037s = VelocityTracker.obtain();
        }
        this.f33037s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f33039u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f33028j) {
            this.f33028j = false;
            return false;
        }
        return (this.f33028j || (dVar = this.f33027i) == null || !dVar.t(motionEvent)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r5 != r0) goto L42;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i15, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void v(View view, Parcelable parcelable) {
        int i13 = ((SavedState) parcelable).f33042c;
        if (i13 == 1 || i13 == 2) {
            i13 = 5;
        }
        this.f33026h = i13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable w(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f33042c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f33042c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f33042c);
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f33042c = sideSheetBehavior.f33026h;
        }
    }

    public SideSheetBehavior() {
        this.f33023e = new c(this);
        this.f33025g = true;
        this.f33026h = 5;
        this.f33029k = 0.1f;
        this.f33036r = -1;
        this.f33040v = new LinkedHashSet();
        this.f33041w = new ck.c(this);
    }
}
