package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class l1 extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f121300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121301b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f121302c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121304e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121305f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121303d = true;

    public l1(View view, int i13) {
        this.f121300a = view;
        this.f121301b = i13;
        this.f121302c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // ua.o0
    public final void a() {
        h(false);
        if (this.f121305f) {
            return;
        }
        b1.e(this.f121300a, this.f121301b);
    }

    @Override // ua.o0
    public final void d() {
        h(true);
        if (this.f121305f) {
            return;
        }
        b1.e(this.f121300a, 0);
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
    }

    public final void h(boolean z13) {
        ViewGroup viewGroup;
        if (!this.f121303d || this.f121304e == z13 || (viewGroup = this.f121302c) == null) {
            return;
        }
        this.f121304e = z13;
        k0.j(viewGroup, z13);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f121305f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        if (z13) {
            return;
        }
        if (!this.f121305f) {
            b1.e(this.f121300a, this.f121301b);
            ViewGroup viewGroup = this.f121302c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z13) {
        if (z13) {
            b1.e(this.f121300a, 0);
            ViewGroup viewGroup = this.f121302c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f121305f) {
            b1.e(this.f121300a, this.f121301b);
            ViewGroup viewGroup = this.f121302c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }
}
