package c02;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes2.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f24446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f24447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f24448c;

    public k(u uVar, y2 y2Var, ViewPropertyAnimator viewPropertyAnimator) {
        this.f24448c = uVar;
        this.f24446a = y2Var;
        this.f24447b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f24447b.setListener(null);
        u uVar = this.f24448c;
        l lVar = uVar.f24462i;
        y2 y2Var = this.f24446a;
        lVar.d(y2Var);
        uVar.h(y2Var);
        uVar.f24471r.remove(y2Var);
        uVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f24448c.getClass();
    }
}
