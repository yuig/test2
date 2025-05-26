package e21;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f56931a;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f56931a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
