package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Array;
import q5.r;

/* loaded from: classes2.dex */
public class NestedCoordinatorLayout extends CoordinatorLayout implements r {

    /* renamed from: x, reason: collision with root package name */
    public e3.a f52491x;

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        P();
    }

    public final void P() {
        this.f52491x = new e3.a(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f52491x.b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f52491x.c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return this.f52491x.d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f52491x.e(i13, i14, i15, i16, 0, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f52491x.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f52491x.f56995a;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, q5.s
    public final void k(View view, int i13) {
        super.k(view, i13);
        stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, q5.s
    public final void l(View view, int i13, int i14, int[] iArr, int i15) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2);
        super.l(view, i13, i14, iArr2[0], i15);
        dispatchNestedPreScroll(i13, i14, iArr2[1], null);
        int[] iArr3 = iArr2[0];
        int i16 = iArr3[0];
        int[] iArr4 = iArr2[1];
        iArr[0] = i16 + iArr4[0];
        iArr[1] = iArr3[1] + iArr4[1];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return this.f52491x.b(f13, f14, z13) || super.onNestedFling(view, f13, f14, z13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return this.f52491x.c(f13, f14) || super.onNestedPreFling(view, f13, f14);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2);
        l(view, i13, i14, iArr2[0], 0);
        dispatchNestedPreScroll(i13, i14, iArr2[1], null);
        int[] iArr3 = iArr2[0];
        int i15 = iArr3[0];
        int[] iArr4 = iArr2[1];
        iArr[0] = i15 + iArr4[0];
        iArr[1] = iArr3[1] + iArr4[1];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        t(view, i13, i14, i15, i16, 0);
        dispatchNestedScroll(i13, i14, i15, i16, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        return startNestedScroll(i13) || x(view, view2, i13, 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(view, 0);
        stopNestedScroll();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        this.f52491x.o(z13);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return this.f52491x.q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f52491x.s(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, q5.s
    public final void t(View view, int i13, int i14, int i15, int i16, int i17) {
        super.t(view, i13, i14, i15, i16, i17);
        dispatchNestedScroll(i13, i14, i15, i16, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, q5.s
    public final boolean x(View view, View view2, int i13, int i14) {
        return startNestedScroll(i13) || super.x(view, view2, i13, i14);
    }

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        P();
    }
}
