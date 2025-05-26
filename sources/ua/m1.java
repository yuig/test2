package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Visibility;

/* loaded from: classes3.dex */
public final class m1 extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f121317a;

    /* renamed from: b, reason: collision with root package name */
    public final View f121318b;

    /* renamed from: c, reason: collision with root package name */
    public final View f121319c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f121320d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Visibility f121321e;

    public m1(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f121321e = visibility;
        this.f121317a = viewGroup;
        this.f121318b = view;
        this.f121319c = view2;
    }

    @Override // ua.o0
    public final void a() {
    }

    @Override // ua.o0
    public final void d() {
    }

    @Override // ua.o0
    public final void e(Transition transition) {
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        transition.I(this);
    }

    @Override // ua.o0
    public final void g(Transition transition) {
        if (this.f121320d) {
            h();
        }
    }

    public final void h() {
        this.f121319c.setTag(e0.save_overlay_view, null);
        this.f121317a.getOverlay().remove(this.f121318b);
        this.f121320d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        if (z13) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f121317a.getOverlay().remove(this.f121318b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f121318b;
        if (view.getParent() == null) {
            this.f121317a.getOverlay().add(view);
        } else {
            this.f121321e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z13) {
        if (z13) {
            View view = this.f121319c;
            int i13 = e0.save_overlay_view;
            View view2 = this.f121318b;
            view.setTag(i13, view2);
            this.f121317a.getOverlay().add(view2);
            this.f121320d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }
}
