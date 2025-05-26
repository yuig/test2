package hk0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f69309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f69310c;

    public /* synthetic */ h(j jVar, View view, int i13) {
        this.f69308a = i13;
        this.f69309b = jVar;
        this.f69310c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f69308a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                onAnimationEnd(animation);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                onAnimationEnd(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f69308a;
        View view = this.f69310c;
        j jVar = this.f69309b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69314b.removeView(view);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69314b.removeView(view);
                break;
        }
    }
}
