package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f121261a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f121262b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f121263c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f121264d = true;

    public i(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.f121261a = imageView;
        this.f121262b = matrix;
        this.f121263c = matrix2;
    }

    @Override // ua.o0
    public final void a() {
        if (this.f121264d) {
            int i13 = e0.transition_image_transform;
            ImageView imageView = this.f121261a;
            imageView.setTag(i13, this.f121262b);
            k0.c(imageView, this.f121263c);
        }
    }

    @Override // ua.o0
    public final void d() {
        int i13 = e0.transition_image_transform;
        ImageView imageView = this.f121261a;
        Matrix matrix = (Matrix) imageView.getTag(i13);
        if (matrix != null) {
            k0.c(imageView, matrix);
            imageView.setTag(e0.transition_image_transform, null);
        }
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
    public final void onAnimationEnd(Animator animator) {
        this.f121264d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
        int i13 = e0.transition_image_transform;
        ImageView imageView = this.f121261a;
        imageView.setTag(i13, matrix);
        k0.c(imageView, this.f121263c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        int i13 = e0.transition_image_transform;
        ImageView imageView = this.f121261a;
        Matrix matrix = (Matrix) imageView.getTag(i13);
        if (matrix != null) {
            k0.c(imageView, matrix);
            imageView.setTag(e0.transition_image_transform, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f121264d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        this.f121264d = z13;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z13) {
        this.f121264d = false;
    }
}
