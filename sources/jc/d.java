package jc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class d extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public h f75389l;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f75378a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f75379b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f75380c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public float f75381d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75382e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f75383f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f75384g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f75385h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f75386i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f75387j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    public float f75388k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f75390m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f75391n = false;

    @Override // android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f75379b.add(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f75380c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f75378a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f75379b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m(l());
        q(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j13) {
        boolean z13 = false;
        if (this.f75390m) {
            q(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        h hVar = this.f75389l;
        if (hVar == null || !this.f75390m) {
            return;
        }
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        float abs = (this.f75383f != 0 ? j13 - r2 : 0L) / ((1.0E9f / hVar.f28409n) / Math.abs(this.f75381d));
        float f13 = this.f75384g;
        if (l()) {
            abs = -abs;
        }
        float f14 = f13 + abs;
        float j14 = j();
        float i13 = i();
        PointF pointF = f.f75393a;
        if (f14 >= j14 && f14 <= i13) {
            z13 = true;
        }
        boolean z14 = !z13;
        float f15 = this.f75384g;
        float b13 = f.b(f14, j(), i());
        this.f75384g = b13;
        if (this.f75391n) {
            b13 = (float) Math.floor(b13);
        }
        this.f75385h = b13;
        this.f75383f = j13;
        if (!this.f75391n || this.f75384g != f15) {
            n();
        }
        if (z14) {
            if (getRepeatCount() == -1 || this.f75386i < getRepeatCount()) {
                Iterator it = this.f75379b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f75386i++;
                if (getRepeatMode() == 2) {
                    this.f75382e = !this.f75382e;
                    u();
                } else {
                    float i14 = l() ? i() : j();
                    this.f75384g = i14;
                    this.f75385h = i14;
                }
                this.f75383f = j13;
            } else {
                float j15 = this.f75381d < 0.0f ? j() : i();
                this.f75384g = j15;
                this.f75385h = j15;
                q(true);
                m(l());
            }
        }
        if (this.f75389l != null) {
            float f16 = this.f75385h;
            if (f16 < this.f75387j || f16 > this.f75388k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f75387j), Float.valueOf(this.f75388k), Float.valueOf(this.f75385h)));
            }
        }
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
    }

    public final void g() {
        q(true);
        m(l());
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float j13;
        float i13;
        float j14;
        if (this.f75389l == null) {
            return 0.0f;
        }
        if (l()) {
            j13 = i() - this.f75385h;
            i13 = i();
            j14 = j();
        } else {
            j13 = this.f75385h - j();
            i13 = i();
            j14 = j();
        }
        return j13 / (i13 - j14);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        h hVar = this.f75389l;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        k();
        throw null;
    }

    public final float h() {
        h hVar = this.f75389l;
        if (hVar == null) {
            return 0.0f;
        }
        float f13 = this.f75385h;
        float f14 = hVar.f28407l;
        return (f13 - f14) / (hVar.f28408m - f14);
    }

    public final float i() {
        h hVar = this.f75389l;
        if (hVar == null) {
            return 0.0f;
        }
        float f13 = this.f75388k;
        return f13 == 2.1474836E9f ? hVar.f28408m : f13;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f75390m;
    }

    public final float j() {
        h hVar = this.f75389l;
        if (hVar == null) {
            return 0.0f;
        }
        float f13 = this.f75387j;
        return f13 == -2.1474836E9f ? hVar.f28407l : f13;
    }

    public final long k() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final boolean l() {
        return this.f75381d < 0.0f;
    }

    public final void m(boolean z13) {
        Iterator it = this.f75379b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z13);
        }
    }

    public final void n() {
        Iterator it = this.f75378a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void removeAllListeners() {
        this.f75379b.clear();
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void removeAllUpdateListeners() {
        this.f75378a.clear();
    }

    public final void q(boolean z13) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z13) {
            this.f75390m = false;
        }
    }

    @Override // android.animation.Animator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f75379b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f75380c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j13) {
        v(j13);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        x(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i13) {
        super.setRepeatMode(i13);
        if (i13 == 2 || !this.f75382e) {
            return;
        }
        this.f75382e = false;
        u();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j13) {
        z(j13);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f75378a.remove(animatorUpdateListener);
    }

    public final void u() {
        this.f75381d = -this.f75381d;
    }

    public final ValueAnimator v(long j13) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void w(float f13) {
        if (this.f75384g == f13) {
            return;
        }
        float b13 = f.b(f13, j(), i());
        this.f75384g = b13;
        if (this.f75391n) {
            b13 = (float) Math.floor(b13);
        }
        this.f75385h = b13;
        this.f75383f = 0L;
        n();
    }

    public final void x(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void y(float f13, float f14) {
        if (f13 > f14) {
            throw new IllegalArgumentException("minFrame (" + f13 + ") must be <= maxFrame (" + f14 + ")");
        }
        h hVar = this.f75389l;
        float f15 = hVar == null ? -3.4028235E38f : hVar.f28407l;
        float f16 = hVar == null ? Float.MAX_VALUE : hVar.f28408m;
        float b13 = f.b(f13, f15, f16);
        float b14 = f.b(f14, f15, f16);
        if (b13 == this.f75387j && b14 == this.f75388k) {
            return;
        }
        this.f75387j = b13;
        this.f75388k = b14;
        w((int) f.b(this.f75385h, b13, b14));
    }

    public final void z(long j13) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j13) {
        v(j13);
        throw null;
    }
}
