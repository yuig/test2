package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19518a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f19519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f19520c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f19522e;

    public n(s sVar, y2 y2Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f19522e = sVar;
        this.f19519b = y2Var;
        this.f19521d = viewPropertyAnimator;
        this.f19520c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f19518a) {
            case 1:
                this.f19520c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f19518a;
        y2 y2Var = this.f19519b;
        s sVar = this.f19522e;
        ViewPropertyAnimator viewPropertyAnimator = this.f19521d;
        switch (i13) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f19520c.setAlpha(1.0f);
                sVar.h(y2Var);
                sVar.f19628q.remove(y2Var);
                sVar.p();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                sVar.h(y2Var);
                sVar.f19626o.remove(y2Var);
                sVar.p();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f19518a;
        s sVar = this.f19522e;
        switch (i13) {
            case 0:
                sVar.getClass();
                break;
            default:
                sVar.getClass();
                break;
        }
    }

    public n(s sVar, y2 y2Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f19522e = sVar;
        this.f19519b = y2Var;
        this.f19520c = view;
        this.f19521d = viewPropertyAnimator;
    }
}
