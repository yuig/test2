package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f19544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f19546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f19547e;

    public /* synthetic */ p(s sVar, q qVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i13) {
        this.f19543a = i13;
        this.f19547e = sVar;
        this.f19544b = qVar;
        this.f19545c = viewPropertyAnimator;
        this.f19546d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f19543a;
        s sVar = this.f19547e;
        q qVar = this.f19544b;
        View view = this.f19546d;
        ViewPropertyAnimator viewPropertyAnimator = this.f19545c;
        switch (i13) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                sVar.h(qVar.f19563a);
                sVar.f19629r.remove(qVar.f19563a);
                sVar.p();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                sVar.h(qVar.f19564b);
                sVar.f19629r.remove(qVar.f19564b);
                sVar.p();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f19543a;
        s sVar = this.f19547e;
        q qVar = this.f19544b;
        switch (i13) {
            case 0:
                y2 y2Var = qVar.f19563a;
                sVar.getClass();
                break;
            default:
                y2 y2Var2 = qVar.f19564b;
                sVar.getClass();
                break;
        }
    }
}
