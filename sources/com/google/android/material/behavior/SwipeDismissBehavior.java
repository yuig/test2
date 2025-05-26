package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ij.a;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;
import y5.d;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f32240a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32241b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32242c;

    /* renamed from: d, reason: collision with root package name */
    public int f32243d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f32244e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f32245f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f32246g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final a f32247h = new a(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f32240a == null) {
            return false;
        }
        if (this.f32242c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f32240a.m(motionEvent);
        return true;
    }

    public boolean C(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z13 = this.f32241b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z13 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f32241b = z13;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f32241b = false;
        }
        if (!z13) {
            return false;
        }
        if (this.f32240a == null) {
            this.f32240a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f32247h);
        }
        return !this.f32242c && this.f32240a.t(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
        WeakHashMap weakHashMap = v0.f102521a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            v0.l(view, 1048576);
            v0.i(view, 0);
            if (C(view)) {
                v0.m(view, r5.d.f106221o, null, new u6(this, 4));
            }
        }
        return false;
    }
}
