package com.google.android.material.snackbar;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import m.h;
import oi.u6;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final u6 f33111i = new u6(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean C(View view) {
        this.f33111i.getClass();
        return view instanceof Snackbar$SnackbarLayout;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        u6 u6Var = this.f33111i;
        u6Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (h.f85195f == null) {
                    h.f85195f = new h(14);
                }
                h hVar = h.f85195f;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(u6Var.f95225b);
                synchronized (hVar.f85197b) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(hVar.f85199d);
                }
            }
        } else if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (h.f85195f == null) {
                h.f85195f = new h(14);
            }
            h hVar2 = h.f85195f;
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(u6Var.f95225b);
            synchronized (hVar2.f85197b) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(hVar2.f85199d);
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }
}
