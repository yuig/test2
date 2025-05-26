package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import fj.c;
import fj.l;
import fj.m;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import q5.v0;
import tj.d;
import tj.e;
import tj.f;
import tj.g;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements a {
    public static final int I = l.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: J, reason: collision with root package name */
    public static final v2 f32617J;
    public static final v2 K;
    public static final v2 L;
    public static final v2 M;
    public int A;
    public int B;
    public final ExtendedFloatingActionButtonBehavior C;
    public boolean D;
    public boolean E;
    public ColorStateList F;
    public int G;
    public int H;

    /* renamed from: u, reason: collision with root package name */
    public int f32618u;

    /* renamed from: v, reason: collision with root package name */
    public final e f32619v;

    /* renamed from: w, reason: collision with root package name */
    public final e f32620w;

    /* renamed from: x, reason: collision with root package name */
    public final g f32621x;

    /* renamed from: y, reason: collision with root package name */
    public final f f32622y;

    /* renamed from: z, reason: collision with root package name */
    public final int f32623z;

    static {
        Class<Float> cls = Float.class;
        f32617J = new v2(11, cls, "width");
        K = new v2(12, cls, "height");
        L = new v2(13, cls, "paddingStart");
        M = new v2(14, cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.extendedFloatingActionButtonStyle);
    }

    public static void s(ExtendedFloatingActionButton extendedFloatingActionButton, int i13) {
        tj.a aVar;
        if (i13 == 0) {
            aVar = extendedFloatingActionButton.f32621x;
        } else if (i13 == 1) {
            aVar = extendedFloatingActionButton.f32622y;
        } else if (i13 == 2) {
            aVar = extendedFloatingActionButton.f32619v;
        } else {
            if (i13 != 3) {
                throw new IllegalStateException(a.a.d("Unknown strategy type: ", i13));
            }
            aVar = extendedFloatingActionButton.f32620w;
        }
        if (aVar.h()) {
            return;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        if (!extendedFloatingActionButton.isLaidOut()) {
            extendedFloatingActionButton.getVisibility();
        } else if (!extendedFloatingActionButton.isInEditMode()) {
            if (i13 == 2) {
                ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
                if (layoutParams != null) {
                    extendedFloatingActionButton.G = layoutParams.width;
                    extendedFloatingActionButton.H = layoutParams.height;
                } else {
                    extendedFloatingActionButton.G = extendedFloatingActionButton.getWidth();
                    extendedFloatingActionButton.H = extendedFloatingActionButton.getHeight();
                }
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet a13 = aVar.a();
            a13.addListener(new d(aVar));
            Iterator it = aVar.f117765c.iterator();
            while (it.hasNext()) {
                a13.addListener((Animator.AnimatorListener) it.next());
            }
            a13.start();
            return;
        }
        aVar.g();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final CoordinatorLayout.Behavior a() {
        return this.C;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && TextUtils.isEmpty(getText()) && this.f32346i != null) {
            this.D = false;
            this.f32619v.g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        super.setPadding(i13, i14, i15, i16);
        if (!this.D || this.E) {
            return;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        this.A = getPaddingStart();
        this.B = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        super.setPaddingRelative(i13, i14, i15, i16);
        if (!this.D || this.E) {
            return;
        }
        this.A = i13;
        this.B = i15;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i13) {
        super.setTextColor(i13);
        this.F = getTextColors();
    }

    public final int t() {
        int i13 = this.f32623z;
        if (i13 >= 0) {
            return i13;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        return (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + this.f32348k;
    }

    public final void u(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.I
            r1 = r18
            android.content.Context r1 = fk.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f32618u = r10
            oi.u6 r1 = new oi.u6
            r11 = 9
            r1.<init>(r11)
            tj.g r12 = new tj.g
            r12.<init>(r0, r1)
            r0.f32621x = r12
            tj.f r13 = new tj.f
            r13.<init>(r0, r1)
            r0.f32622y = r13
            r14 = 1
            r0.D = r14
            r0.E = r10
            android.content.Context r15 = r17.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r15, r7)
            r0.C = r1
            int[] r3 = fj.m.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r15
            r2 = r19
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.d0.f(r1, r2, r3, r4, r5, r6)
            int r2 = fj.m.ExtendedFloatingActionButton_showMotionSpec
            gj.f r2 = gj.f.a(r15, r1, r2)
            int r3 = fj.m.ExtendedFloatingActionButton_hideMotionSpec
            gj.f r3 = gj.f.a(r15, r1, r3)
            int r4 = fj.m.ExtendedFloatingActionButton_extendMotionSpec
            gj.f r4 = gj.f.a(r15, r1, r4)
            int r5 = fj.m.ExtendedFloatingActionButton_shrinkMotionSpec
            gj.f r5 = gj.f.a(r15, r1, r5)
            int r6 = fj.m.ExtendedFloatingActionButton_collapsedSize
            r10 = -1
            int r6 = r1.getDimensionPixelSize(r6, r10)
            r0.f32623z = r6
            int r6 = fj.m.ExtendedFloatingActionButton_extendStrategy
            int r6 = r1.getInt(r6, r14)
            java.util.WeakHashMap r10 = q5.v0.f102521a
            int r10 = r17.getPaddingStart()
            r0.A = r10
            int r10 = r17.getPaddingEnd()
            r0.B = r10
            oi.u6 r10 = new oi.u6
            r10.<init>(r11)
            tj.e r11 = new tj.e
            tj.c r7 = new tj.c
            r7.<init>(r0, r14)
            com.google.android.gms.internal.measurement.x r14 = new com.google.android.gms.internal.measurement.x
            r8 = 7
            r14.<init>(r0, r7, r8)
            gi.m r8 = new gi.m
            r16 = r9
            r9 = 5
            r8.<init>(r0, r14, r7, r9)
            r9 = 1
            if (r6 == r9) goto L9f
            r7 = 2
            if (r6 == r7) goto L9e
            r7 = r8
            goto L9f
        L9e:
            r7 = r14
        L9f:
            r11.<init>(r0, r10, r7, r9)
            r0.f32620w = r11
            tj.e r6 = new tj.e
            tj.c r7 = new tj.c
            r8 = 0
            r7.<init>(r0, r8)
            r6.<init>(r0, r10, r7, r8)
            r0.f32619v = r6
            r12.f117768f = r2
            r13.f117768f = r3
            r11.f117768f = r4
            r6.f117768f = r5
            r1.recycle()
            bk.k r1 = bk.o.f23090m
            r2 = r19
            r3 = r20
            r4 = r16
            bk.m r1 = bk.o.e(r15, r2, r3, r4, r1)
            bk.o r1 = r1.a()
            r0.Y0(r1)
            android.content.res.ColorStateList r1 = r17.getTextColors()
            r0.F = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.F = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f32624a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32625b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f32626c;

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ExtendedFloatingActionButton_Behavior_Layout);
            this.f32625b = obtainStyledAttributes.getBoolean(m.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f32626c = obtainStyledAttributes.getBoolean(m.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f32625b && !this.f32626c) || cVar.f17905f != appBarLayout.getId()) {
                return false;
            }
            if (this.f32624a == null) {
                this.f32624a = new Rect();
            }
            Rect rect = this.f32624a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                ExtendedFloatingActionButton.s(extendedFloatingActionButton, this.f32626c ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.s(extendedFloatingActionButton, this.f32626c ? 3 : 0);
            }
            return true;
        }

        public final boolean D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f32625b && !this.f32626c) || cVar.f17905f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.s(extendedFloatingActionButton, this.f32626c ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.s(extendedFloatingActionButton, this.f32626c ? 3 : 0);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void g(androidx.coordinatorlayout.widget.c cVar) {
            if (cVar.f17907h == 0) {
                cVar.f17907h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c) || !(((androidx.coordinatorlayout.widget.c) layoutParams).f17900a instanceof BottomSheetBehavior)) {
                return false;
            }
            D(view2, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List p13 = coordinatorLayout.p(extendedFloatingActionButton);
            int size = p13.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = (View) p13.get(i14);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof androidx.coordinatorlayout.widget.c) && (((androidx.coordinatorlayout.widget.c) layoutParams).f17900a instanceof BottomSheetBehavior) && D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.F(extendedFloatingActionButton, i13);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.f32625b = false;
            this.f32626c = true;
        }
    }
}
