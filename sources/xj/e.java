package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f135087b;

    public /* synthetic */ e(f fVar, int i13) {
        this.f135086a = i13;
        this.f135087b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f135086a) {
            case 1:
                super.onAnimationEnd(animator);
                f fVar = this.f135087b;
                fVar.l();
                va.c cVar = fVar.f135100j;
                if (cVar != null) {
                    cVar.a((l) fVar.f16056a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f135086a) {
            case 0:
                super.onAnimationRepeat(animator);
                f fVar = this.f135087b;
                fVar.f135097g = (fVar.f135097g + 4) % fVar.f135096f.f135076c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
