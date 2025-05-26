package ua2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f121599b;

    public /* synthetic */ r0(t0 t0Var, int i13) {
        this.f121598a = i13;
        this.f121599b = t0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f121598a;
        t0 t0Var = this.f121599b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                t0Var.H();
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                t0Var.E().S = false;
                t0Var.H();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f121598a;
        t0 t0Var = this.f121599b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                t0Var.E().S = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                t0Var.x();
                int i14 = t0Var.E().I;
                t0Var.E().U = true;
                t0Var.E().S = true;
                break;
        }
    }
}
