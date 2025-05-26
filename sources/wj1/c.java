package wj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;
import pj1.i;

/* loaded from: classes5.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f130024b;

    public /* synthetic */ c(d dVar, int i13) {
        this.f130023a = i13;
        this.f130024b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f130023a;
        d dVar = this.f130024b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                dVar.c();
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                dVar.f100282f.L = false;
                dVar.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f130023a;
        d dVar = this.f130024b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                dVar.f100282f.L = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                dVar.x();
                i iVar = dVar.f100282f;
                int i14 = iVar.B;
                dVar.getClass();
                iVar.N = true;
                iVar.L = true;
                break;
        }
    }
}
