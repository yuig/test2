package q5;

import android.view.WindowInsetsAnimation;
import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes3.dex */
public final class m1 extends n1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f102481e;

    public m1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f102481e = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds e(q4 q4Var) {
        return new WindowInsetsAnimation.Bounds(((f5.e) q4Var.f31594b).d(), ((f5.e) q4Var.f31595c).d());
    }

    @Override // q5.n1
    public final long a() {
        long durationMillis;
        durationMillis = this.f102481e.getDurationMillis();
        return durationMillis;
    }

    @Override // q5.n1
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f102481e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // q5.n1
    public final int c() {
        int typeMask;
        typeMask = this.f102481e.getTypeMask();
        return typeMask;
    }

    @Override // q5.n1
    public final void d(float f13) {
        this.f102481e.setFraction(f13);
    }
}
