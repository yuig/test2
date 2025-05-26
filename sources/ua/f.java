package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.ChangeClipBounds;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f121252a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f121253b;

    /* renamed from: c, reason: collision with root package name */
    public final View f121254c;

    public f(View view, Rect rect, Rect rect2) {
        this.f121254c = view;
        this.f121252a = rect;
        this.f121253b = rect2;
    }

    @Override // ua.o0
    public final void a() {
        View view = this.f121254c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = ChangeClipBounds.I;
        }
        view.setTag(e0.transition_clip, clipBounds);
        view.setClipBounds(this.f121253b);
    }

    @Override // ua.o0
    public final void d() {
        int i13 = e0.transition_clip;
        View view = this.f121254c;
        view.setClipBounds((Rect) view.getTag(i13));
        view.setTag(e0.transition_clip, null);
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
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        View view = this.f121254c;
        if (!z13) {
            view.setClipBounds(this.f121253b);
        } else {
            view.setClipBounds(this.f121252a);
        }
    }
}
