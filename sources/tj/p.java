package tj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public abstract class p extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f117819a;

    /* renamed from: b, reason: collision with root package name */
    public float f117820b;

    /* renamed from: c, reason: collision with root package name */
    public float f117821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f117822d;

    public p(s sVar) {
        this.f117822d = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f13 = (int) this.f117821c;
        bk.i iVar = this.f117822d.f117825b;
        if (iVar != null) {
            iVar.s(f13);
        }
        this.f117819a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f13;
        float f14;
        boolean z13 = this.f117819a;
        q qVar = this.f117822d;
        if (!z13) {
            bk.i iVar = qVar.f117825b;
            float f15 = 0.0f;
            this.f117820b = iVar == null ? 0.0f : iVar.f23052a.f23043n;
            o oVar = (o) this;
            int i13 = oVar.f117817e;
            q qVar2 = oVar.f117818f;
            switch (i13) {
                case 0:
                    break;
                case 1:
                    f13 = qVar2.f117830g;
                    f14 = qVar2.f117831h;
                    f15 = f13 + f14;
                    break;
                case 2:
                    f13 = qVar2.f117830g;
                    f14 = qVar2.f117832i;
                    f15 = f13 + f14;
                    break;
                default:
                    f15 = qVar2.f117830g;
                    break;
            }
            this.f117821c = f15;
            this.f117819a = true;
        }
        float f16 = this.f117820b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f117821c - f16)) + f16);
        bk.i iVar2 = qVar.f117825b;
        if (iVar2 != null) {
            iVar2.s(animatedFraction);
        }
    }
}
