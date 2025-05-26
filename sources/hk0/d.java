package hk0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f69303b;

    public /* synthetic */ d(j jVar, int i13) {
        this.f69302a = i13;
        this.f69303b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        int i13 = this.f69302a;
        j jVar = this.f69303b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f69302a;
        j jVar = this.f69303b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jVar.f69324l = false;
                break;
        }
    }
}
