package lu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f84966b;

    public /* synthetic */ x(y yVar, int i13) {
        this.f84965a = i13;
        this.f84966b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f84965a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                this.f84966b.F0.f126584k = false;
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f84965a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                this.f84966b.F0.f126584k = true;
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
