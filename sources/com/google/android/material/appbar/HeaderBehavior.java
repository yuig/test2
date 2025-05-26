package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: c, reason: collision with root package name */
    public j f32165c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f32166d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32167e;

    /* renamed from: f, reason: collision with root package name */
    public int f32168f;

    /* renamed from: g, reason: collision with root package name */
    public int f32169g;

    /* renamed from: h, reason: collision with root package name */
    public int f32170h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f32171i;

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32168f = -1;
        this.f32170h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean B(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.B(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean G(View view) {
        return false;
    }

    public int H(View view) {
        return -view.getHeight();
    }

    public int I(View view) {
        return view.getHeight();
    }

    public void J(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int K(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
        int q13;
        int C = C();
        if (i14 == 0 || C < i14 || C > i15 || C == (q13 = com.bumptech.glide.c.q(i13, i14, i15))) {
            return 0;
        }
        F(q13);
        return C - q13;
    }

    public final void L(CoordinatorLayout coordinatorLayout, View view, int i13) {
        K(coordinatorLayout, view, i13, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f32170h < 0) {
            this.f32170h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f32167e) {
            int i13 = this.f32168f;
            if (i13 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i13)) == -1) {
                return false;
            }
            int y13 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y13 - this.f32169g) > this.f32170h) {
                this.f32169g = y13;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f32168f = -1;
            int x13 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            boolean z13 = G(view) && coordinatorLayout.z(view, x13, y14);
            this.f32167e = z13;
            if (z13) {
                this.f32169g = y14;
                this.f32168f = motionEvent.getPointerId(0);
                if (this.f32171i == null) {
                    this.f32171i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f32166d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f32166d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f32171i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
