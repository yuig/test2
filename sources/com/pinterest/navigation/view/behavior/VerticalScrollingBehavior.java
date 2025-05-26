package com.pinterest.navigation.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import qu1.a;

/* loaded from: classes2.dex */
public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f49951a;

    /* renamed from: b, reason: collision with root package name */
    public int f49952b;

    /* renamed from: c, reason: collision with root package name */
    public a f49953c;

    public VerticalScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49951a = 0;
        this.f49952b = 0;
        this.f49953c = a.SCROLL_NONE;
    }

    public abstract void C(View view, int i13, a aVar);

    public abstract void D(View view, a aVar);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        a aVar = f14 > 0.0f ? a.SCROLL_DIRECTION_UP : a.SCROLL_DIRECTION_DOWN;
        this.f49953c = aVar;
        D(view, aVar);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        a aVar = f14 > 0.0f ? a.SCROLL_DIRECTION_UP : a.SCROLL_DIRECTION_DOWN;
        this.f49953c = aVar;
        D(view, aVar);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr) {
        if (i14 > 0 && this.f49952b < 0) {
            this.f49952b = 0;
            this.f49953c = a.SCROLL_DIRECTION_UP;
        } else if (i14 < 0 && this.f49952b > 0) {
            this.f49952b = 0;
            this.f49953c = a.SCROLL_DIRECTION_DOWN;
        }
        this.f49952b += i14;
        C(view, i14, this.f49953c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
        if (i14 > 0 && this.f49952b < 0) {
            this.f49952b = 0;
            this.f49953c = a.SCROLL_DIRECTION_UP;
        } else if (i14 < 0 && this.f49952b > 0) {
            this.f49952b = 0;
            this.f49953c = a.SCROLL_DIRECTION_DOWN;
        }
        this.f49952b += i14;
        C(view, i14, this.f49953c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14) {
        if (i14 > 0 && this.f49951a < 0) {
            this.f49951a = 0;
            a aVar = a.SCROLL_DIRECTION_UP;
        } else if (i14 < 0 && this.f49951a > 0) {
            this.f49951a = 0;
            a aVar2 = a.SCROLL_DIRECTION_DOWN;
        }
        this.f49951a += i14;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17) {
        if (i16 > 0 && this.f49951a < 0) {
            this.f49951a = 0;
            a aVar = a.SCROLL_DIRECTION_UP;
        } else if (i16 < 0 && this.f49951a > 0) {
            this.f49951a = 0;
            a aVar2 = a.SCROLL_DIRECTION_DOWN;
        }
        this.f49951a += i16;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
        return (i13 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        return (i13 & 2) != 0;
    }

    public VerticalScrollingBehavior() {
        this.f49951a = 0;
        this.f49952b = 0;
        this.f49953c = a.SCROLL_NONE;
    }
}
