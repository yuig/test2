package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f32194a;

    /* renamed from: b, reason: collision with root package name */
    public final View f32195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HeaderBehavior f32196c;

    public j(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
        this.f32196c = headerBehavior;
        this.f32194a = coordinatorLayout;
        this.f32195b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeaderBehavior headerBehavior;
        OverScroller overScroller;
        View view = this.f32195b;
        if (view == null || (overScroller = (headerBehavior = this.f32196c).f32166d) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.f32194a;
        if (!computeScrollOffset) {
            headerBehavior.J(view, coordinatorLayout);
            return;
        }
        headerBehavior.L(coordinatorLayout, view, headerBehavior.f32166d.getCurrY());
        WeakHashMap weakHashMap = v0.f102521a;
        view.postOnAnimation(this);
    }
}
