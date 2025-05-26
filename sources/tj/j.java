package tj;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f117796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f117797b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.b f117798c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f117799d;

    public j(q qVar) {
        this.f117799d = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f117796a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.f117799d;
        qVar.f117840q = 0;
        qVar.f117834k = null;
        if (this.f117796a) {
            return;
        }
        boolean z13 = this.f117797b;
        qVar.f117844u.b(z13 ? 8 : 4, z13);
        bh.b bVar = this.f117798c;
        if (bVar == null) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(bVar.f22798b);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        q qVar = this.f117799d;
        qVar.f117844u.b(0, this.f117797b);
        qVar.f117840q = 1;
        qVar.f117834k = animator;
        this.f117796a = false;
    }
}
