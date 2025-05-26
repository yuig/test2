package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import java.util.WeakHashMap;
import q5.v0;
import sj.a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f33375a;

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33375a = 0;
    }

    public abstract void C(View view, View view2, boolean z13, boolean z14);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z13 = ((FloatingActionButton) obj).f32638l.f16503b;
        if (z13) {
            int i13 = this.f33375a;
            if (i13 != 0 && i13 != 2) {
                return false;
            }
        } else if (this.f33375a != 1) {
            return false;
        }
        this.f33375a = z13 ? 1 : 2;
        C((View) obj, view, z13, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
        a aVar;
        int i14;
        WeakHashMap weakHashMap = v0.f102521a;
        if (!view.isLaidOut()) {
            List p13 = coordinatorLayout.p(view);
            int size = p13.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) p13.get(i15);
                if (f(coordinatorLayout, view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i15++;
            }
            if (aVar != null) {
                boolean z13 = ((FloatingActionButton) aVar).f32638l.f16503b;
                if (!z13 ? this.f33375a == 1 : !((i14 = this.f33375a) != 0 && i14 != 2)) {
                    int i16 = z13 ? 1 : 2;
                    this.f33375a = i16;
                    view.getViewTreeObserver().addOnPreDrawListener(new hk.a(this, view, i16, aVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior() {
        this.f33375a = 0;
    }
}
