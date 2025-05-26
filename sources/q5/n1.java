package q5;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102485a;

    /* renamed from: b, reason: collision with root package name */
    public float f102486b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f102487c;

    /* renamed from: d, reason: collision with root package name */
    public final long f102488d;

    public n1(int i13, Interpolator interpolator, long j13) {
        this.f102485a = i13;
        this.f102487c = interpolator;
        this.f102488d = j13;
    }

    public long a() {
        return this.f102488d;
    }

    public float b() {
        Interpolator interpolator = this.f102487c;
        return interpolator != null ? interpolator.getInterpolation(this.f102486b) : this.f102486b;
    }

    public int c() {
        return this.f102485a;
    }

    public void d(float f13) {
        this.f102486b = f13;
    }
}
