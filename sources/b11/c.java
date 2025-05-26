package b11;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f20975a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f20977c;

    public c(d dVar, int i13) {
        this.f20977c = dVar;
        this.f20975a = i13;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f20976b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f20976b) {
            return;
        }
        int i13 = this.f20975a;
        int i14 = i13 == 0 ? 0 : 3;
        d dVar = this.f20977c;
        dVar.f20979a = i14;
        dVar.c(i13);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f20977c.f20979a = this.f20975a == 0 ? 1 : 2;
    }
}
