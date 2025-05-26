package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public k f32180a;

    /* renamed from: b, reason: collision with root package name */
    public int f32181b;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32181b = 0;
    }

    public int C() {
        k kVar = this.f32180a;
        if (kVar != null) {
            return kVar.f32200d;
        }
        return 0;
    }

    public int D() {
        return C();
    }

    public void E(CoordinatorLayout coordinatorLayout, View view, int i13) {
        coordinatorLayout.F(view, i13);
    }

    public boolean F(int i13) {
        k kVar = this.f32180a;
        if (kVar != null) {
            return kVar.b(i13);
        }
        this.f32181b = i13;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
        E(coordinatorLayout, view, i13);
        if (this.f32180a == null) {
            this.f32180a = new k(view);
        }
        k kVar = this.f32180a;
        View view2 = kVar.f32197a;
        kVar.f32198b = view2.getTop();
        kVar.f32199c = view2.getLeft();
        this.f32180a.a();
        int i14 = this.f32181b;
        if (i14 == 0) {
            return true;
        }
        this.f32180a.b(i14);
        this.f32181b = 0;
        return true;
    }

    public ViewOffsetBehavior() {
        this.f32181b = 0;
    }
}
