package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bk.a0;
import bk.i;
import bk.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.d;
import com.google.android.material.stateful.ExtendableSavedState;
import d7.b;
import fj.c;
import fj.e;
import fj.l;
import fj.m;
import g1.o0;
import gj.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;
import sj.a;
import tj.j;
import tj.k;
import tj.q;
import tj.s;

/* loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements a, a0, androidx.coordinatorlayout.widget.a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f32627n = l.Widget_Design_FloatingActionButton;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f32628b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f32629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32630d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32631e;

    /* renamed from: f, reason: collision with root package name */
    public int f32632f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32633g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32634h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f32635i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f32636j;

    /* renamed from: k, reason: collision with root package name */
    public final z f32637k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.appcompat.widget.a f32638l;

    /* renamed from: m, reason: collision with root package name */
    public s f32639m;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.floatingActionButtonStyle);
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        d().m(oVar);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final CoordinatorLayout.Behavior a() {
        return new Behavior();
    }

    public final q d() {
        if (this.f32639m == null) {
            this.f32639m = new s(this, new u6(this, 10));
        }
        return this.f32639m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d().i(getDrawableState());
    }

    public final int e(int i13) {
        int i14 = this.f32631e;
        if (i14 != 0) {
            return i14;
        }
        Resources resources = getResources();
        return i13 != -1 ? i13 != 1 ? resources.getDimensionPixelSize(e.design_fab_size_normal) : resources.getDimensionPixelSize(e.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? e(1) : e(0);
    }

    public final void f() {
        q d2 = d();
        FloatingActionButton floatingActionButton = d2.f117844u;
        if (floatingActionButton.getVisibility() == 0) {
            if (d2.f117840q == 1) {
                return;
            }
        } else if (d2.f117840q != 2) {
            return;
        }
        Animator animator = d2.f117834k;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = v0.f102521a;
        FloatingActionButton floatingActionButton2 = d2.f117844u;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.b(4, false);
            return;
        }
        f fVar = d2.f117836m;
        AnimatorSet b13 = fVar != null ? d2.b(fVar, 0.0f, 0.0f, 0.0f) : d2.c(0.0f, 0.4f, 0.4f, q.E, q.F);
        b13.addListener(new j(d2));
        ArrayList arrayList = d2.f117842s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b13.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b13.start();
    }

    public final void g(Rect rect) {
        int i13 = rect.left;
        Rect rect2 = this.f32635i;
        rect.left = i13 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.f32628b;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f32629c;
    }

    public final void h() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    public final void i() {
        q d2 = d();
        if (d2.f117844u.getVisibility() == 0 ? d2.f117840q != 1 : d2.f117840q == 2) {
            return;
        }
        Animator animator = d2.f117834k;
        if (animator != null) {
            animator.cancel();
        }
        boolean z13 = d2.f117835l == null;
        WeakHashMap weakHashMap = v0.f102521a;
        FloatingActionButton floatingActionButton = d2.f117844u;
        boolean z14 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = d2.f117849z;
        if (!z14) {
            floatingActionButton.b(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            d2.f117838o = 1.0f;
            d2.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z13 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z13 ? 0.4f : 0.0f);
            float f13 = z13 ? 0.4f : 0.0f;
            d2.f117838o = f13;
            d2.a(f13, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        f fVar = d2.f117835l;
        AnimatorSet b13 = fVar != null ? d2.b(fVar, 1.0f, 1.0f, 1.0f) : d2.c(1.0f, 1.0f, 1.0f, q.C, q.D);
        b13.addListener(new k(d2));
        ArrayList arrayList = d2.f117841r;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b13.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b13.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        d().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q d2 = d();
        i iVar = d2.f117825b;
        if (iVar != null) {
            b.y0(d2.f117844u, iVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q d2 = d();
        ViewTreeObserver viewTreeObserver = d2.f117844u.getViewTreeObserver();
        a5.b bVar = d2.A;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            d2.A = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int e13 = e(this.f32630d);
        this.f32632f = (e13 - this.f32633g) / 2;
        d().p();
        int min = Math.min(View.resolveSize(e13, i13), View.resolveSize(e13, i14));
        Rect rect = this.f32635i;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f18020a);
        Bundle bundle = (Bundle) extendableSavedState.f33118c.get("expandableWidgetHelper");
        bundle.getClass();
        androidx.appcompat.widget.a aVar = this.f32638l;
        aVar.getClass();
        aVar.f16503b = bundle.getBoolean("expanded", false);
        aVar.f16502a = bundle.getInt("expandedComponentIdHint", 0);
        if (aVar.f16503b) {
            ViewParent parent = ((View) aVar.f16504c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).h((View) aVar.f16504c);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        o0 o0Var = extendableSavedState.f33118c;
        androidx.appcompat.widget.a aVar = this.f32638l;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", aVar.f16503b);
        bundle.putInt("expandedComponentIdHint", aVar.f16502a);
        o0Var.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i13;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f32636j;
            rect.set(0, 0, measuredWidth, measuredHeight);
            g(rect);
            s sVar = this.f32639m;
            if (sVar.f117829f) {
                int i14 = sVar.f117833j;
                FloatingActionButton floatingActionButton = sVar.f117844u;
                i13 = Math.max((i14 - floatingActionButton.e(floatingActionButton.f32630d)) / 2, 0);
            } else {
                i13 = 0;
            }
            int i15 = -i13;
            rect.inset(i15, i15);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f32628b != colorStateList) {
            this.f32628b = colorStateList;
            q d2 = d();
            i iVar = d2.f117825b;
            if (iVar != null) {
                iVar.setTintList(colorStateList);
            }
            tj.b bVar = d2.f117827d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f117781m = colorStateList.getColorForState(bVar.getState(), bVar.f117781m);
                }
                bVar.f117784p = colorStateList;
                bVar.f117782n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f32629c != mode) {
            this.f32629c = mode;
            i iVar = d().f117825b;
            if (iVar != null) {
                iVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        i iVar = d().f117825b;
        if (iVar != null) {
            iVar.s(f13);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            q d2 = d();
            float f13 = d2.f117838o;
            d2.f117838o = f13;
            Matrix matrix = d2.f117849z;
            d2.a(f13, matrix);
            d2.f117844u.setImageMatrix(matrix);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i13) {
        this.f32637k.c(i13);
        h();
    }

    @Override // android.view.View
    public final void setScaleX(float f13) {
        super.setScaleX(f13);
        d().k();
    }

    @Override // android.view.View
    public final void setScaleY(float f13) {
        super.setScaleY(f13);
        d().k();
    }

    @Override // android.view.View
    public final void setTranslationX(float f13) {
        super.setTranslationX(f13);
        d().l();
    }

    @Override // android.view.View
    public final void setTranslationY(float f13) {
        super.setTranslationY(f13);
        d().l();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f13) {
        super.setTranslationZ(f13);
        d().l();
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public final void setVisibility(int i13) {
        b(i13, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionButton(@androidx.annotation.NonNull android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f32640a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32641b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.FloatingActionButton_Behavior_Layout);
            this.f32641b = obtainStyledAttributes.getBoolean(m.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f32641b && ((androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams()).f17905f == appBarLayout.getId() && floatingActionButton.f32692a == 0)) {
                return false;
            }
            if (this.f32640a == null) {
                this.f32640a = new Rect();
            }
            Rect rect = this.f32640a;
            d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                floatingActionButton.f();
            } else {
                floatingActionButton.i();
            }
            return true;
        }

        public final boolean D(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f32641b && ((androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams()).f17905f == view.getId() && floatingActionButton.f32692a == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.f();
            } else {
                floatingActionButton.i();
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f32635i;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void g(androidx.coordinatorlayout.widget.c cVar) {
            if (cVar.f17907h == 0) {
                cVar.f17907h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                C(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c) || !(((androidx.coordinatorlayout.widget.c) layoutParams).f17900a instanceof BottomSheetBehavior)) {
                return false;
            }
            D(view2, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List p13 = coordinatorLayout.p(floatingActionButton);
            int size = p13.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                View view2 = (View) p13.get(i15);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof androidx.coordinatorlayout.widget.c) && (((androidx.coordinatorlayout.widget.c) layoutParams).f17900a instanceof BottomSheetBehavior) && D(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (C(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.F(floatingActionButton, i13);
            Rect rect = floatingActionButton.f32635i;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) floatingActionButton.getLayoutParams();
            int i16 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) cVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) cVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) {
                i14 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) cVar).topMargin) {
                i14 = -rect.top;
            }
            if (i14 != 0) {
                WeakHashMap weakHashMap = v0.f102521a;
                floatingActionButton.offsetTopAndBottom(i14);
            }
            if (i16 == 0) {
                return true;
            }
            WeakHashMap weakHashMap2 = v0.f102521a;
            floatingActionButton.offsetLeftAndRight(i16);
            return true;
        }

        public BaseBehavior() {
            this.f32641b = true;
        }
    }
}
