package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18344a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18349f;

    public i(k kVar, View view, boolean z13, z1 z1Var, f fVar) {
        this.f18346c = kVar;
        this.f18347d = view;
        this.f18345b = z13;
        this.f18348e = z1Var;
        this.f18349f = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        int i13 = this.f18344a;
        Object obj = this.f18348e;
        Object obj2 = this.f18349f;
        Object obj3 = this.f18347d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(anim, "anim");
                View viewToAnimate = (View) obj3;
                ((k) this.f18346c).f18361a.endViewTransition(viewToAnimate);
                if (this.f18345b) {
                    x1 x1Var = ((z1) obj).f18508a;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    x1Var.applyState(viewToAnimate);
                }
                ((f) obj2).a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animator from operation " + ((z1) obj) + " has ended.");
                    break;
                }
                break;
            default:
                ((ViewPropertyAnimator) obj3).setListener(null);
                c02.u uVar = (c02.u) obj2;
                y2 y2Var = (y2) obj;
                uVar.f24463j.s(y2Var);
                uVar.h(y2Var);
                uVar.f24473t.remove(y2Var);
                uVar.q();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f18344a) {
            case 1:
                if (((c02.q) this.f18346c).f24450b != null) {
                    ((c02.u) this.f18349f).getClass();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(c02.u uVar, c02.q qVar, boolean z13, ViewPropertyAnimator viewPropertyAnimator, y2 y2Var) {
        this.f18349f = uVar;
        this.f18346c = qVar;
        this.f18345b = z13;
        this.f18347d = viewPropertyAnimator;
        this.f18348e = y2Var;
    }
}
