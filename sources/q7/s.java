package q7;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class s implements c02.m {

    /* renamed from: a, reason: collision with root package name */
    public final long f102678a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102679b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f102680c;

    public s(j jVar, long j13, long j14) {
        this.f102680c = jVar;
        this.f102678a = j13;
        this.f102679b = j14;
    }

    public j a(m mVar) {
        return (j) this.f102680c;
    }

    @Override // c02.m
    public final long getDuration() {
        return this.f102678a;
    }

    @Override // c02.m
    public final Interpolator o() {
        return (Interpolator) this.f102680c;
    }

    @Override // c02.m
    public final long w() {
        return this.f102679b;
    }

    public s(long j13, long j14, BaseInterpolator baseInterpolator) {
        this.f102678a = j13;
        this.f102679b = j14;
        this.f102680c = baseInterpolator;
    }
}
