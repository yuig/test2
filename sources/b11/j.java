package b11;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import v.c1;

/* loaded from: classes5.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f21020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f21021b;

    public j(float f13, c1 c1Var) {
        this.f21020a = f13;
        this.f21021b = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f21020a < 0.0f) {
            ((View) this.f21021b.f123391h).setTranslationY(0.0f);
        }
    }
}
