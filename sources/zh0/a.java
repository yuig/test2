package zh0;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f141972b;

    public /* synthetic */ a(int i13, Function0 function0) {
        this.f141971a = i13;
        this.f141972b = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f141971a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f141972b.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f141971a;
        Function0 function0 = this.f141972b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                function0.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                function0.invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f141971a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f141971a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }
}
