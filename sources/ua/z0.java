package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f121380a;

    /* renamed from: b, reason: collision with root package name */
    public final View f121381b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f121382c;

    /* renamed from: d, reason: collision with root package name */
    public float f121383d;

    /* renamed from: e, reason: collision with root package name */
    public float f121384e;

    /* renamed from: f, reason: collision with root package name */
    public final float f121385f;

    /* renamed from: g, reason: collision with root package name */
    public final float f121386g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f121387h;

    public z0(View view, View view2, float f13, float f14) {
        this.f121381b = view;
        this.f121380a = view2;
        this.f121385f = f13;
        this.f121386g = f14;
        int[] iArr = (int[]) view2.getTag(e0.transition_position);
        this.f121382c = iArr;
        if (iArr != null) {
            view2.setTag(e0.transition_position, null);
        }
    }

    @Override // ua.o0
    public final void a() {
        if (this.f121382c == null) {
            this.f121382c = new int[2];
        }
        int[] iArr = this.f121382c;
        View view = this.f121381b;
        view.getLocationOnScreen(iArr);
        this.f121380a.setTag(e0.transition_position, this.f121382c);
        this.f121383d = view.getTranslationX();
        this.f121384e = view.getTranslationY();
        view.setTranslationX(this.f121385f);
        view.setTranslationY(this.f121386g);
    }

    @Override // ua.o0
    public final void c(Transition transition) {
        if (this.f121387h) {
            return;
        }
        this.f121380a.setTag(e0.transition_position, null);
    }

    @Override // ua.o0
    public final void d() {
        float f13 = this.f121383d;
        View view = this.f121381b;
        view.setTranslationX(f13);
        view.setTranslationY(this.f121384e);
    }

    @Override // ua.o0
    public final void e(Transition transition) {
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        c(transition);
    }

    @Override // ua.o0
    public final void g(Transition transition) {
        this.f121387h = true;
        float f13 = this.f121385f;
        View view = this.f121381b;
        view.setTranslationX(f13);
        view.setTranslationY(this.f121386g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f121387h = true;
        float f13 = this.f121385f;
        View view = this.f121381b;
        view.setTranslationX(f13);
        view.setTranslationY(this.f121386g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        if (z13) {
            return;
        }
        float f13 = this.f121385f;
        View view = this.f121381b;
        view.setTranslationX(f13);
        view.setTranslationY(this.f121386g);
    }
}
