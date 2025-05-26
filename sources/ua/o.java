package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class o extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f121334a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121335b = false;

    public o(View view) {
        this.f121334a = view;
    }

    @Override // ua.o0
    public final void a() {
        View view = this.f121334a;
        view.setTag(e0.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? b1.f121223a.f(view) : 0.0f));
    }

    @Override // ua.o0
    public final void b(Transition transition) {
    }

    @Override // ua.o0
    public final void d() {
        this.f121334a.setTag(e0.transition_pause_alpha, null);
    }

    @Override // ua.o0
    public final void e(Transition transition) {
    }

    @Override // ua.o0
    public final void f(Transition transition) {
    }

    @Override // ua.o0
    public final void g(Transition transition) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        b1.d(this.f121334a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f121334a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f121335b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        boolean z14 = this.f121335b;
        View view = this.f121334a;
        if (z14) {
            view.setLayerType(0, null);
        }
        if (z13) {
            return;
        }
        b1.d(view, 1.0f);
        b1.f121223a.getClass();
    }
}
