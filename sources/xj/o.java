package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f135140b;

    public /* synthetic */ o(p pVar, int i13) {
        this.f135139a = i13;
        this.f135140b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f135139a) {
            case 1:
                super.onAnimationEnd(animator);
                p pVar = this.f135140b;
                pVar.l();
                va.c cVar = pVar.f135151j;
                if (cVar != null) {
                    cVar.a((l) pVar.f16056a);
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
        switch (this.f135139a) {
            case 0:
                super.onAnimationRepeat(animator);
                p pVar = this.f135140b;
                pVar.f135148g = (pVar.f135148g + 1) % pVar.f135147f.f135076c.length;
                pVar.f135149h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
