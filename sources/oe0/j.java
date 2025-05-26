package oe0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes5.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f94241b;

    public /* synthetic */ j(l lVar, int i13) {
        this.f94240a = i13;
        this.f94241b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i13 = this.f94240a;
        l lVar = this.f94241b;
        switch (i13) {
            case 0:
                lVar.f94243b.animate().setListener(null);
                break;
            default:
                lVar.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f94240a;
        l lVar = this.f94241b;
        switch (i13) {
            case 0:
                lVar.f94246e = k.ACTIVATED;
                lVar.f94243b.animate().setListener(null);
                break;
            default:
                lVar.d();
                break;
        }
    }
}
