package gj;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public long f65179a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f65181c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f65182d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f65183e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f65180b = 150;

    public g(long j13) {
        this.f65179a = j13;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f65179a);
        animator.setDuration(this.f65180b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f65182d);
            valueAnimator.setRepeatMode(this.f65183e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f65181c;
        return timeInterpolator != null ? timeInterpolator : a.f65168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f65179a == gVar.f65179a && this.f65180b == gVar.f65180b && this.f65182d == gVar.f65182d && this.f65183e == gVar.f65183e) {
            return b().getClass().equals(gVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j13 = this.f65179a;
        long j14 = this.f65180b;
        return ((((b().getClass().hashCode() + (((((int) (j13 ^ (j13 >>> 32))) * 31) + ((int) ((j14 >>> 32) ^ j14))) * 31)) * 31) + this.f65182d) * 31) + this.f65183e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("\n");
        sb3.append(g.class.getName());
        sb3.append('{');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" delay: ");
        sb3.append(this.f65179a);
        sb3.append(" duration: ");
        sb3.append(this.f65180b);
        sb3.append(" interpolator: ");
        sb3.append(b().getClass());
        sb3.append(" repeatCount: ");
        sb3.append(this.f65182d);
        sb3.append(" repeatMode: ");
        return a.a.n(sb3, this.f65183e, "}\n");
    }
}
