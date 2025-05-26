package gq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f65972b;

    public /* synthetic */ e(View view, int i13) {
        this.f65971a = i13;
        this.f65972b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f65971a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                View view = this.f65972b;
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f65971a;
        View view = this.f65972b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                animator.removeAllListeners();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animation");
                view.setAlpha(1.0f);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animation");
                float f13 = 2;
                view.setPivotX(view.getMeasuredWidth() / f13);
                view.setPivotY(view.getMeasuredHeight() / f13);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animation");
                view.setVisibility(4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f65971a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f65972b.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
