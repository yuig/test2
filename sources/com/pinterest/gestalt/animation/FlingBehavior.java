package com.pinterest.gestalt.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes5.dex */
public final class FlingBehavior extends AppBarLayout.Behavior {

    /* renamed from: p, reason: collision with root package name */
    public boolean f49241p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f49242q;

    public FlingBehavior() {
        this.f49242q = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: Q */
    public final void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int[] iArr, int i15) {
        super.q(coordinatorLayout, appBarLayout, view, i13, i14, iArr, i15);
        this.f49241p = i14 > 0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: R */
    public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i13, int i14) {
        if (this.f49242q) {
            return super.y(coordinatorLayout, appBarLayout, view, view2, i13, i14);
        }
        return false;
    }

    public final void W(boolean z13) {
        this.f49242q = z13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        if ((f14 > 0.0f && !this.f49241p) || (f14 < 0.0f && this.f49241p)) {
            f14 *= -1.0f;
        }
        if ((view2 instanceof RecyclerView) && f14 < 0.0f) {
            RecyclerView.r1(((RecyclerView) view2).getChildAt(0));
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr) {
        this.f49241p = i14 > 0;
    }

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49242q = true;
    }
}
