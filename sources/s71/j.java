package s71;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f111365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f111366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f111367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f111368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f111369e;

    public j(a aVar, l lVar, int i13, int i14, long j13) {
        this.f111365a = aVar;
        this.f111366b = lVar;
        this.f111367c = i13;
        this.f111368d = i14;
        this.f111369e = j13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        a aVar = a.EXPAND;
        l lVar = this.f111366b;
        a aVar2 = this.f111365a;
        if (aVar2 == aVar) {
            a0.w1(lVar.f111392u);
        }
        if (lVar.f111375d) {
            long j13 = lVar.f111376e;
            if (aVar2 == aVar) {
                aVar = a.COLLAPSE;
            }
            a aVar3 = aVar;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f111375d = false;
            animatorSet.play(lVar.d(this.f111367c, this.f111368d, aVar3, j13, this.f111369e));
            animatorSet.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        a aVar = this.f111365a;
        a aVar2 = a.COLLAPSE;
        l lVar = this.f111366b;
        if (aVar != aVar2) {
            lVar.getClass();
        } else {
            a0.k0(lVar.f111392u);
            lVar.getClass();
        }
    }
}
