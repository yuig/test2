package rq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r2 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f109508b;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f109507a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109508b = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109508b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f109507a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f109508b) {
                    animation.start();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f109508b) {
                    animation.start();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f109507a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109508b = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109508b = false;
                break;
        }
    }
}
