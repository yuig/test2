package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import bk.i;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import fj.l;
import g1.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import lb.l0;
import q5.m0;
import q5.v0;
import q5.z;
import tj.q;
import ub.k;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements androidx.coordinatorlayout.widget.a {

    /* renamed from: s0, reason: collision with root package name */
    public static final int f32248s0 = l.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f32249t0 = fj.c.motionDurationLong2;
    public final Integer U;
    public final i V;
    public Animator W;

    /* renamed from: a0, reason: collision with root package name */
    public int f32250a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f32251b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f32252c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f32253d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f32254e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f32255f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f32256g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f32257h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f32258i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f32259j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f32260k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f32261l0;

    /* renamed from: m0, reason: collision with root package name */
    public Behavior f32262m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f32263n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f32264o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f32265p0;

    /* renamed from: q0, reason: collision with root package name */
    public final a f32266q0;

    /* renamed from: r0, reason: collision with root package name */
    public final b f32267r0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* renamed from: c, reason: collision with root package name */
        public int f32272c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32273d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32272c = parcel.readInt();
            this.f32273d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f32272c);
            parcel.writeInt(this.f32273d ? 1 : 0);
        }
    }

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.bottomAppBarStyle);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void A(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.U.intValue());
        }
        super.A(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void C(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void D(CharSequence charSequence) {
    }

    public final View H() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) ((o0) ((CoordinatorLayout) getParent()).f17882b.f33804b).get(this);
        List<View> arrayList2 = arrayList == null ? null : new ArrayList(arrayList);
        if (arrayList2 == null) {
            arrayList2 = Collections.emptyList();
        }
        for (View view : arrayList2) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int I(ActionMenuView actionMenuView, int i13, boolean z13) {
        int i14 = 0;
        if (this.f32254e0 != 1 && (i13 != 1 || !z13)) {
            return 0;
        }
        boolean H0 = l0.H0(this);
        int measuredWidth = H0 ? getMeasuredWidth() : 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f15945a & 8388615) == 8388611) {
                measuredWidth = H0 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = H0 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i16 = H0 ? this.f32264o0 : -this.f32265p0;
        if (o() == null) {
            i14 = getResources().getDimensionPixelOffset(fj.e.m3_bottomappbar_horizontal_padding);
            if (!H0) {
                i14 = -i14;
            }
        }
        return measuredWidth - ((right + i16) + i14);
    }

    public final float J() {
        int i13 = this.f32250a0;
        boolean H0 = l0.H0(this);
        if (i13 != 1) {
            return 0.0f;
        }
        View H = H();
        int i14 = H0 ? this.f32265p0 : this.f32264o0;
        return ((getMeasuredWidth() / 2) - ((this.f32253d0 == -1 || H == null) ? this.f32252c0 + i14 : ((H.getMeasuredWidth() / 2) + r5) + i14)) * (H0 ? -1 : 1);
    }

    public final f K() {
        return (f) this.V.f23052a.f23030a.f23099i;
    }

    public final boolean L() {
        View H = H();
        FloatingActionButton floatingActionButton = H instanceof FloatingActionButton ? (FloatingActionButton) H : null;
        if (floatingActionButton != null) {
            q d2 = floatingActionButton.d();
            if (d2.f117844u.getVisibility() != 0) {
                if (d2.f117840q == 2) {
                    return true;
                }
            } else if (d2.f117840q != 1) {
                return true;
            }
        }
        return false;
    }

    public final void M() {
        ActionMenuView actionMenuView;
        int i13 = 0;
        while (true) {
            if (i13 >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i13++;
        }
        if (actionMenuView == null || this.W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (L()) {
            O(actionMenuView, this.f32250a0, this.f32261l0);
        } else {
            O(actionMenuView, 0, false);
        }
    }

    public final void N() {
        float f13;
        K().f32287e = J();
        i iVar = this.V;
        boolean z13 = this.f32261l0;
        int i13 = this.f32251b0;
        iVar.u((z13 && L() && i13 == 1) ? 1.0f : 0.0f);
        View H = H();
        if (H != null) {
            if (i13 == 1) {
                f13 = -K().f32286d;
            } else {
                View H2 = H();
                f13 = H2 != null ? (-((getMeasuredHeight() + this.f32263n0) - H2.getMeasuredHeight())) / 2 : 0;
            }
            H.setTranslationY(f13);
            H.setTranslationX(J());
        }
    }

    public final void O(ActionMenuView actionMenuView, int i13, boolean z13) {
        new k(this, actionMenuView, i13, z13).run();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final CoordinatorLayout.Behavior a() {
        if (this.f32262m0 == null) {
            this.f32262m0 = new Behavior();
        }
        return this.f32262m0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.y0(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (z13) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            N();
            View H = H();
            if (H != null) {
                WeakHashMap weakHashMap = v0.f102521a;
                if (H.isLaidOut()) {
                    H.post(new z(H, 1));
                }
            }
        }
        M();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        this.f32250a0 = savedState.f32272c;
        this.f32261l0 = savedState.f32273d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f32272c = this.f32250a0;
        savedState.f32273d = this.f32261l0;
        return savedState;
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        i iVar = this.V;
        iVar.s(f13);
        int k13 = iVar.f23052a.f23046q - iVar.k();
        if (this.f32262m0 == null) {
            this.f32262m0 = new Behavior();
        }
        Behavior behavior = this.f32262m0;
        behavior.f32238h = k13;
        if (behavior.f32237g == 1) {
            setTranslationY(behavior.f32236f + k13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        public final Rect f32268m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f32269n;

        /* renamed from: o, reason: collision with root package name */
        public int f32270o;

        /* renamed from: p, reason: collision with root package name */
        public final d f32271p;

        public Behavior() {
            this.f32271p = new d(this);
            this.f32268m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f32269n = new WeakReference(bottomAppBar);
            int i14 = BottomAppBar.f32248s0;
            View H = bottomAppBar.H();
            if (H != null) {
                WeakHashMap weakHashMap = v0.f102521a;
                if (!H.isLaidOut()) {
                    androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) H.getLayoutParams();
                    cVar.f17903d = 17;
                    int i15 = bottomAppBar.f32251b0;
                    if (i15 == 1) {
                        cVar.f17903d = 49;
                    }
                    if (i15 == 0) {
                        cVar.f17903d |= 80;
                    }
                    this.f32270o = ((ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) H.getLayoutParams())).bottomMargin;
                    if (H instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) H;
                        if (i15 == 0 && bottomAppBar.f32255f0) {
                            m0.l(floatingActionButton, 0.0f);
                            q d2 = floatingActionButton.d();
                            if (d2.f117830g != 0.0f) {
                                d2.f117830g = 0.0f;
                                d2.j(0.0f, d2.f117831h, d2.f117832i);
                            }
                        }
                        if (floatingActionButton.d().f117835l == null) {
                            floatingActionButton.d().f117835l = gj.f.b(floatingActionButton.getContext(), fj.b.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.d().f117836m == null) {
                            floatingActionButton.d().f117836m = gj.f.b(floatingActionButton.getContext(), fj.b.mtrl_fab_hide_motion_spec);
                        }
                        a aVar = bottomAppBar.f32266q0;
                        q d13 = floatingActionButton.d();
                        if (d13.f117842s == null) {
                            d13.f117842s = new ArrayList();
                        }
                        d13.f117842s.add(aVar);
                        a aVar2 = new a(bottomAppBar, 2);
                        q d14 = floatingActionButton.d();
                        if (d14.f117841r == null) {
                            d14.f117841r = new ArrayList();
                        }
                        d14.f117841r.add(aVar2);
                        q d15 = floatingActionButton.d();
                        tj.i iVar = new tj.i(floatingActionButton, bottomAppBar.f32267r0);
                        if (d15.f117843t == null) {
                            d15.f117843t = new ArrayList();
                        }
                        d15.f117843t.add(iVar);
                    }
                    H.addOnLayoutChangeListener(this.f32271p);
                    bottomAppBar.N();
                }
            }
            coordinatorLayout.F(bottomAppBar, i13);
            super.l(coordinatorLayout, bottomAppBar, i13);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.f32256g0 && super.y(coordinatorLayout, bottomAppBar, view2, view3, i13, i14);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32271p = new d(this);
            this.f32268m = new Rect();
        }
    }
}
