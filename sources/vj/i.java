package vj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f125911c;

    public i(j jVar, boolean z13, int i13) {
        this.f125911c = jVar;
        this.f125909a = z13;
        this.f125910b = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f125911c;
        jVar.f125890b.setTranslationX(0.0f);
        jVar.d(0.0f, this.f125910b, this.f125909a);
    }
}
