package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f32278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f32280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f32281e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i13, boolean z13) {
        this.f32281e = bottomAppBar;
        this.f32278b = actionMenuView;
        this.f32279c = i13;
        this.f32280d = z13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f32277a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f32277a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f32281e;
        bottomAppBar.getClass();
        bottomAppBar.O(this.f32278b, this.f32279c, this.f32280d);
    }
}
