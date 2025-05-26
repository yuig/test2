package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.x0;
import androidx.constraintlayout.widget.x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.e0;
import bk.i;
import bk.o;
import fj.e;
import fj.k;
import fj.l;
import fj.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kj.c;
import lb.l0;
import q5.i1;
import q5.j1;
import q5.l1;
import q5.m0;
import q5.v0;
import vj.b;
import vj.g;
import y5.d;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements b {

    /* renamed from: g0, reason: collision with root package name */
    public static final int f32289g0 = l.Widget_Design_BottomSheet_Modal;
    public final c A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f32290J;
    public boolean K;
    public int L;
    public d M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public WeakReference W;
    public final ArrayList X;
    public VelocityTracker Y;
    public g Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f32291a;

    /* renamed from: a0, reason: collision with root package name */
    public int f32292a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32293b;

    /* renamed from: b0, reason: collision with root package name */
    public int f32294b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f32295c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f32296c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f32297d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f32298d0;

    /* renamed from: e, reason: collision with root package name */
    public int f32299e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f32300e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32301f;

    /* renamed from: f0, reason: collision with root package name */
    public final kj.a f32302f0;

    /* renamed from: g, reason: collision with root package name */
    public int f32303g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32304h;

    /* renamed from: i, reason: collision with root package name */
    public final i f32305i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f32306j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32307k;

    /* renamed from: l, reason: collision with root package name */
    public int f32308l;

    /* renamed from: m, reason: collision with root package name */
    public int f32309m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32310n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f32311o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f32312p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f32313q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f32314r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f32315s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f32316t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f32317u;

    /* renamed from: v, reason: collision with root package name */
    public int f32318v;

    /* renamed from: w, reason: collision with root package name */
    public int f32319w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32320x;

    /* renamed from: y, reason: collision with root package name */
    public final o f32321y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32322z;

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i13;
        this.f32291a = 0;
        this.f32293b = true;
        this.f32307k = -1;
        this.f32308l = -1;
        this.A = new c(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        int i14 = 4;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList();
        this.f32294b0 = -1;
        this.f32300e0 = new SparseIntArray();
        this.f32302f0 = new kj.a(this);
        this.f32304h = context.getResources().getDimensionPixelSize(e.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(m.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f32306j = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(m.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f32321y = o.b(fj.c.bottomSheetStyle, f32289g0, context, attributeSet).a();
        }
        o oVar = this.f32321y;
        if (oVar != null) {
            i iVar = new i(oVar);
            this.f32305i = iVar;
            iVar.o(context);
            ColorStateList colorStateList = this.f32306j;
            if (colorStateList != null) {
                this.f32305i.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f32305i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(E(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new e0(this, i14));
        this.H = obtainStyledAttributes.getDimension(m.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(m.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.f32307k = obtainStyledAttributes.getDimensionPixelSize(m.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (obtainStyledAttributes.hasValue(m.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.f32308l = obtainStyledAttributes.getDimensionPixelSize(m.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(m.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i13 = peekValue.data) != -1) {
            W(obtainStyledAttributes.getDimensionPixelSize(m.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            W(i13);
        }
        T(obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f32310n = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z13 = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f32293b != z13) {
            this.f32293b = z13;
            if (this.U != null) {
                D();
            }
            Y((this.f32293b && this.L == 6) ? 3 : this.L);
            d0(this.L, true);
            c0();
        }
        this.f32290J = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f32291a = obtainStyledAttributes.getInt(m.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        S(obtainStyledAttributes.getFloat(m.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(m.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(m.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.C = dimensionPixelOffset;
            d0(this.L, true);
        } else {
            int i15 = peekValue2.data;
            if (i15 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.C = i15;
            d0(this.L, true);
        }
        this.f32297d = obtainStyledAttributes.getInt(m.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f32311o = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f32312p = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f32313q = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f32314r = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f32315s = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f32316t = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f32317u = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f32320x = obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f32295c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View I(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        if (m0.i(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View I = I(viewGroup.getChildAt(i13));
                if (I != null) {
                    return I;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior J(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f17900a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int K(int i13, int i14, int i15, int i16) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i14, i16);
        if (i15 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i15), 1073741824);
        }
        if (size != 0) {
            i15 = Math.min(size, i15);
        }
        return View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.L()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Y(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.W
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f32293b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.Y
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f32295c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Y
            int r6 = r2.f32292a0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.Z(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f32293b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f32293b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.a0(r4, r0, r3)
            r2.P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i13 = this.L;
        if (i13 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.M;
        if (dVar != null && (this.K || i13 == 1)) {
            dVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            P();
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float abs = Math.abs(this.f32294b0 - motionEvent.getY());
            d dVar2 = this.M;
            if (abs > dVar2.f137747b) {
                dVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void C(kj.b bVar) {
        ArrayList arrayList = this.X;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public final void D() {
        int F = F();
        if (this.f32293b) {
            this.G = Math.max(this.T - F, this.D);
        } else {
            this.G = this.T - F;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float E() {
        /*
            r5 = this;
            bk.i r0 = r5.f32305i
            r1 = 0
            if (r0 == 0) goto L65
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L65
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L65
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L65
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.O()
            if (r2 == 0) goto L65
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L65
            bk.i r2 = r5.f32305i
            float r2 = r2.l()
            android.view.RoundedCorner r3 = a.i3.j(r0)
            if (r3 == 0) goto L44
            int r3 = a.i3.e(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            bk.i r2 = r5.f32305i
            float r2 = r2.m()
            android.view.RoundedCorner r0 = a.i3.D(r0)
            if (r0 == 0) goto L60
            int r0 = a.i3.e(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L60
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L60
            float r1 = r0 / r2
        L60:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E():float");
    }

    public final int F() {
        int i13;
        return this.f32301f ? Math.min(Math.max(this.f32303g, this.T - ((this.S * 9) / 16)), this.R) + this.f32318v : (this.f32310n || this.f32311o || (i13 = this.f32309m) <= 0) ? this.f32299e + this.f32318v : Math.max(this.f32299e, i13 + this.f32304h);
    }

    public final void G(View view, int i13) {
        if (view == null) {
            return;
        }
        v0.l(view, 524288);
        v0.i(view, 0);
        v0.l(view, 262144);
        v0.i(view, 0);
        v0.l(view, 1048576);
        v0.i(view, 0);
        SparseIntArray sparseIntArray = this.f32300e0;
        int i14 = sparseIntArray.get(i13, -1);
        if (i14 != -1) {
            v0.l(view, i14);
            v0.i(view, 0);
            sparseIntArray.delete(i13);
        }
    }

    public final void H(int i13) {
        float f13;
        float f14;
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.X;
            if (arrayList.isEmpty()) {
                return;
            }
            int i14 = this.G;
            if (i13 > i14 || i14 == L()) {
                int i15 = this.G;
                f13 = i15 - i13;
                f14 = this.T - i15;
            } else {
                int i16 = this.G;
                f13 = i16 - i13;
                f14 = i16 - L();
            }
            float f15 = f13 / f14;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                ((kj.b) arrayList.get(i17)).b(view, f15);
            }
        }
    }

    public final int L() {
        if (this.f32293b) {
            return this.D;
        }
        return Math.max(this.C, this.f32314r ? 0 : this.f32319w);
    }

    public final int M() {
        return this.L;
    }

    public final int N(int i13) {
        if (i13 == 3) {
            return L();
        }
        if (i13 == 4) {
            return this.G;
        }
        if (i13 == 5) {
            return this.T;
        }
        if (i13 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(a.a.d("Invalid state to get top offset: ", i13));
    }

    public final boolean O() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void P() {
        this.f32292a0 = -1;
        this.f32294b0 = -1;
        VelocityTracker velocityTracker = this.Y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Y = null;
        }
    }

    public final void Q(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.V) == null) {
            this.V = new WeakReference(view);
            b0(view, 1);
        } else {
            G((View) weakReference.get(), 1);
            this.V = null;
        }
    }

    public final void R(boolean z13) {
        this.K = z13;
    }

    public final void S(float f13) {
        if (f13 <= 0.0f || f13 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f13;
        if (this.U != null) {
            this.E = (int) ((1.0f - f13) * this.T);
        }
    }

    public final void T(boolean z13) {
        if (this.I != z13) {
            this.I = z13;
            if (!z13 && this.L == 5) {
                X(4);
            }
            c0();
        }
    }

    public final void U(int i13) {
        this.f32308l = -1;
    }

    public final void V(int i13) {
        W(i13);
    }

    public final void W(int i13) {
        if (i13 == -1) {
            if (this.f32301f) {
                return;
            } else {
                this.f32301f = true;
            }
        } else {
            if (!this.f32301f && this.f32299e == i13) {
                return;
            }
            this.f32301f = false;
            this.f32299e = Math.max(0, i13);
        }
        f0();
    }

    public final void X(int i13) {
        if (i13 == 1 || i13 == 2) {
            throw new IllegalArgumentException(a.a.p(new StringBuilder("STATE_"), i13 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i13 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i13);
            return;
        }
        int i14 = (i13 == 6 && this.f32293b && N(i13) <= this.D) ? 3 : i13;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            Y(i13);
            return;
        }
        View view = (View) this.U.get();
        d.d dVar = new d.d(this, view, i14, 9, 0);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (view.isAttachedToWindow()) {
                view.post(dVar);
                return;
            }
        }
        dVar.run();
    }

    public final void Y(int i13) {
        View view;
        if (this.L == i13) {
            return;
        }
        this.L = i13;
        if (i13 != 4 && i13 != 3 && i13 != 6) {
            boolean z13 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i14 = 0;
        if (i13 == 3) {
            e0(true);
        } else if (i13 == 6 || i13 == 5 || i13 == 4) {
            e0(false);
        }
        d0(i13, true);
        while (true) {
            ArrayList arrayList = this.X;
            if (i14 >= arrayList.size()) {
                c0();
                return;
            } else {
                ((kj.b) arrayList.get(i14)).c(view, i13);
                i14++;
            }
        }
    }

    public final boolean Z(View view, float f13) {
        if (this.f32290J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f13 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) F()) > 0.5f;
    }

    public final void a0(View view, int i13, boolean z13) {
        int N = N(i13);
        d dVar = this.M;
        if (dVar == null || (!z13 ? dVar.u(view, view.getLeft(), N) : dVar.s(view.getLeft(), N))) {
            Y(i13);
            return;
        }
        Y(2);
        d0(i13, true);
        this.A.a(i13);
    }

    @Override // vj.b
    public final void b() {
        g gVar = this.Z;
        if (gVar == null || gVar.a() == null) {
            return;
        }
        AnimatorSet b13 = gVar.b();
        b13.setDuration(gVar.f125893e);
        b13.start();
    }

    public final void b0(View view, int i13) {
        if (view == null) {
            return;
        }
        G(view, i13);
        if (!this.f32293b && this.L != 6) {
            this.f32300e0.put(i13, v0.a(view, view.getResources().getString(k.bottomsheet_action_expand_halfway), new l0.k(this, 6, 8)));
        }
        if (this.I && this.L != 5) {
            v0.m(view, r5.d.f106221o, null, new l0.k(this, 5, 8));
        }
        int i14 = this.L;
        if (i14 == 3) {
            v0.m(view, r5.d.f106220n, null, new l0.k(this, this.f32293b ? 4 : 6, 8));
            return;
        }
        if (i14 == 4) {
            v0.m(view, r5.d.f106219m, null, new l0.k(this, this.f32293b ? 3 : 6, 8));
        } else {
            if (i14 != 6) {
                return;
            }
            v0.m(view, r5.d.f106220n, null, new l0.k(this, 4, 8));
            v0.m(view, r5.d.f106219m, null, new l0.k(this, 3, 8));
        }
    }

    @Override // vj.b
    public final void c(androidx.activity.b bVar) {
        g gVar = this.Z;
        if (gVar == null) {
            return;
        }
        gVar.f125894f = bVar;
    }

    public final void c0() {
        WeakReference weakReference = this.U;
        if (weakReference != null) {
            b0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.V;
        if (weakReference2 != null) {
            b0((View) weakReference2.get(), 1);
        }
    }

    @Override // vj.b
    public final void d(androidx.activity.b bVar) {
        g gVar = this.Z;
        if (gVar == null) {
            return;
        }
        if (gVar.f125894f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = gVar.f125894f;
        gVar.f125894f = bVar;
        if (bVar2 == null) {
            return;
        }
        gVar.c(bVar.f15875c);
    }

    public final void d0(int i13, boolean z13) {
        i iVar = this.f32305i;
        ValueAnimator valueAnimator = this.B;
        if (i13 == 2) {
            return;
        }
        boolean z14 = this.L == 3 && (this.f32320x || O());
        if (this.f32322z == z14 || iVar == null) {
            return;
        }
        this.f32322z = z14;
        if (!z13 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            iVar.u(this.f32322z ? E() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(iVar.f23052a.f23039j, z14 ? E() : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // vj.b
    public final void e() {
        g gVar = this.Z;
        if (gVar == null) {
            return;
        }
        androidx.activity.b bVar = gVar.f125894f;
        gVar.f125894f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            X(this.I ? 5 : 4);
            return;
        }
        boolean z13 = this.I;
        int i13 = gVar.f125892d;
        int i14 = gVar.f125891c;
        float f13 = bVar.f15875c;
        if (!z13) {
            AnimatorSet b13 = gVar.b();
            b13.setDuration(gj.a.c(i14, f13, i13));
            b13.start();
            X(4);
            return;
        }
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(this, r2);
        View view = gVar.f125890b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new q6.b());
        ofFloat.setDuration(gj.a.c(i14, f13, i13));
        ofFloat.addListener(new androidx.appcompat.widget.d(gVar, 7));
        ofFloat.addListener(dVar);
        ofFloat.start();
    }

    public final void e0(boolean z13) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z13) {
                if (this.f32298d0 != null) {
                    return;
                } else {
                    this.f32298d0 = new HashMap(childCount);
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (childAt != this.U.get() && z13) {
                    this.f32298d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z13) {
                return;
            }
            this.f32298d0 = null;
        }
    }

    public final void f0() {
        View view;
        if (this.U != null) {
            D();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(androidx.coordinatorlayout.widget.c cVar) {
        this.U = null;
        this.M = null;
        this.Z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.U = null;
        this.M = null;
        this.Z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i13;
        d dVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            P();
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x13 = (int) motionEvent.getX();
            this.f32294b0 = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.W;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x13, this.f32294b0)) {
                    this.f32292a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f32296c0 = true;
                }
            }
            this.N = this.f32292a0 == -1 && !coordinatorLayout.z(view, x13, this.f32294b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f32296c0 = false;
            this.f32292a0 = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (dVar = this.M) != null && dVar.t(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.W;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i13 = this.f32294b0) == -1 || Math.abs(((float) i13) - motionEvent.getY()) <= ((float) this.M.f137747b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
        WeakHashMap weakHashMap = v0.f102521a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.U == null) {
            this.f32303g = coordinatorLayout.getResources().getDimensionPixelSize(e.design_bottom_sheet_peek_height_min);
            int i15 = Build.VERSION.SDK_INT;
            boolean z13 = (i15 < 29 || this.f32310n || this.f32301f) ? false : true;
            if (this.f32311o || this.f32312p || this.f32313q || this.f32315s || this.f32316t || this.f32317u || z13) {
                l0.W(view, new x0(this, z13));
            }
            x xVar = new x();
            xVar.f17870a = 0;
            xVar.f17875f = new int[2];
            xVar.f17874e = view;
            if (i15 >= 30) {
                view.setWindowInsetsAnimationCallback(new l1(xVar));
            } else {
                PathInterpolator pathInterpolator = j1.f102468e;
                Object tag = view.getTag(b5.c.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener i1Var = new i1(view, xVar);
                view.setTag(b5.c.tag_window_insets_animation_callback, i1Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(i1Var);
                }
            }
            this.U = new WeakReference(view);
            this.Z = new g(view);
            Drawable drawable = this.f32305i;
            if (drawable != null) {
                view.setBackground(drawable);
                i iVar = this.f32305i;
                float f13 = this.H;
                if (f13 == -1.0f) {
                    f13 = m0.e(view);
                }
                iVar.s(f13);
            } else {
                ColorStateList colorStateList = this.f32306j;
                if (colorStateList != null) {
                    m0.j(view, colorStateList);
                }
            }
            c0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f32302f0);
        }
        int top = view.getTop();
        coordinatorLayout.F(view, i13);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i16 = this.T;
        int i17 = i16 - height;
        int i18 = this.f32319w;
        if (i17 < i18) {
            if (this.f32314r) {
                int i19 = this.f32308l;
                if (i19 != -1) {
                    i16 = Math.min(i16, i19);
                }
                this.R = i16;
            } else {
                int i23 = i16 - i18;
                int i24 = this.f32308l;
                if (i24 != -1) {
                    i23 = Math.min(i23, i24);
                }
                this.R = i23;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        D();
        int i25 = this.L;
        if (i25 == 3) {
            view.offsetTopAndBottom(L());
        } else if (i25 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i25 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i25 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i25 == 1 || i25 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        d0(this.L, false);
        this.W = new WeakReference(I(view));
        while (true) {
            ArrayList arrayList = this.X;
            if (i14 >= arrayList.size()) {
                return true;
            }
            ((kj.b) arrayList.get(i14)).a(view);
            i14++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(K(i13, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, this.f32307k, marginLayoutParams.width), K(i15, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f32308l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        WeakReference weakReference = this.W;
        return (weakReference == null || view2 != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 1) {
            return;
        }
        WeakReference weakReference = this.W;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i16 = top - i14;
        if (i14 > 0) {
            if (i16 < L()) {
                int L = top - L();
                iArr[1] = L;
                int i17 = -L;
                WeakHashMap weakHashMap = v0.f102521a;
                view.offsetTopAndBottom(i17);
                Y(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i14;
                WeakHashMap weakHashMap2 = v0.f102521a;
                view.offsetTopAndBottom(-i14);
                Y(1);
            }
        } else if (i14 < 0 && !view2.canScrollVertically(-1)) {
            int i18 = this.G;
            if (i16 > i18 && !this.I) {
                int i19 = top - i18;
                iArr[1] = i19;
                int i23 = -i19;
                WeakHashMap weakHashMap3 = v0.f102521a;
                view.offsetTopAndBottom(i23);
                Y(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i14;
                WeakHashMap weakHashMap4 = v0.f102521a;
                view.offsetTopAndBottom(-i14);
                Y(1);
            }
        }
        H(view.getTop());
        this.O = i14;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void v(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i13 = this.f32291a;
        if (i13 != 0) {
            if (i13 == -1 || (i13 & 1) == 1) {
                this.f32299e = savedState.f32324d;
            }
            if (i13 == -1 || (i13 & 2) == 2) {
                this.f32293b = savedState.f32325e;
            }
            if (i13 == -1 || (i13 & 4) == 4) {
                this.I = savedState.f32326f;
            }
            if (i13 == -1 || (i13 & 8) == 8) {
                this.f32290J = savedState.f32327g;
            }
        }
        int i14 = savedState.f32323c;
        if (i14 == 1 || i14 == 2) {
            this.L = 4;
        } else {
            this.L = i14;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable w(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        this.O = 0;
        this.P = false;
        return (i13 & 2) != 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f32323c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32324d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f32325e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f32326f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f32327g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32323c = parcel.readInt();
            this.f32324d = parcel.readInt();
            this.f32325e = parcel.readInt() == 1;
            this.f32326f = parcel.readInt() == 1;
            this.f32327g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f32323c);
            parcel.writeInt(this.f32324d);
            parcel.writeInt(this.f32325e ? 1 : 0);
            parcel.writeInt(this.f32326f ? 1 : 0);
            parcel.writeInt(this.f32327g ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f32323c = bottomSheetBehavior.L;
            this.f32324d = bottomSheetBehavior.f32299e;
            this.f32325e = bottomSheetBehavior.f32293b;
            this.f32326f = bottomSheetBehavior.I;
            this.f32327g = bottomSheetBehavior.f32290J;
        }
    }

    public BottomSheetBehavior() {
        this.f32291a = 0;
        this.f32293b = true;
        this.f32307k = -1;
        this.f32308l = -1;
        this.A = new c(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList();
        this.f32294b0 = -1;
        this.f32300e0 = new SparseIntArray();
        this.f32302f0 = new kj.a(this);
    }
}
