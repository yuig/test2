package tj;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f117800a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bh.b f117801b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f117802c;

    public k(q qVar) {
        this.f117802c = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.f117802c;
        qVar.f117840q = 0;
        qVar.f117834k = null;
        bh.b bVar = this.f117801b;
        if (bVar == null) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(bVar.f22798b);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        q qVar = this.f117802c;
        qVar.f117844u.b(0, this.f117800a);
        qVar.f117840q = 2;
        qVar.f117834k = animator;
    }
}
