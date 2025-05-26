package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f33221b;

    public /* synthetic */ d(e eVar, int i13) {
        this.f33220a = i13;
        this.f33221b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33220a) {
            case 1:
                this.f33221b.f33272b.k(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f33220a) {
            case 0:
                this.f33221b.f33272b.k(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
