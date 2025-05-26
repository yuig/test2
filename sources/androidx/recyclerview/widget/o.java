package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f19528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f19530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f19533f;

    public o(s sVar, y2 y2Var, int i13, View view, int i14, ViewPropertyAnimator viewPropertyAnimator) {
        this.f19533f = sVar;
        this.f19528a = y2Var;
        this.f19529b = i13;
        this.f19530c = view;
        this.f19531d = i14;
        this.f19532e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i13 = this.f19529b;
        View view = this.f19530c;
        if (i13 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f19531d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19532e.setListener(null);
        s sVar = this.f19533f;
        y2 y2Var = this.f19528a;
        sVar.h(y2Var);
        sVar.f19627p.remove(y2Var);
        sVar.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f19533f.getClass();
    }
}
