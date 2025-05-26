package com.pinterest.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import e3.a;
import q5.r;
import q5.u;

/* loaded from: classes.dex */
public abstract class NestedScrollingViewGroup extends ViewGroup implements r {

    /* renamed from: a, reason: collision with root package name */
    public final u f44938a;

    /* renamed from: b, reason: collision with root package name */
    public final a f44939b;

    public NestedScrollingViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44938a = new u();
        this.f44939b = new a(this);
        setNestedScrollingEnabled(true);
    }

    public abstract int[] a();

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f44939b.b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f44939b.c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return this.f44939b.d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f44939b.e(i13, i14, i15, i16, 0, iArr, null);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f44938a.b();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f44939b.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f44939b.f56995a;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return this.f44939b.b(f13, f14, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return this.f44939b.c(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        dispatchNestedScroll(i13, i14, i15, i16, a());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        this.f44938a.c(i13, 0);
        startNestedScroll(i13 & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f44938a.d(0);
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup
    public final void setChildrenDrawingOrderEnabled(boolean z13) {
        super.setChildrenDrawingOrderEnabled(z13);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        this.f44939b.o(z13);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return this.f44939b.q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f44939b.s(0);
    }

    public NestedScrollingViewGroup(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44938a = new u();
        this.f44939b = new a(this);
        setNestedScrollingEnabled(true);
    }
}
