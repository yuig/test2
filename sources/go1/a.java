package go1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f65922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65923b;

    public a(View view, int i13) {
        this.f65922a = view;
        this.f65923b = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        int i13 = this.f65923b;
        View view = this.f65922a;
        view.setVisibility(i13);
        view.setAlpha(1.0f);
    }
}
