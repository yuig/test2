package x4;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes3.dex */
public final class p extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f131803a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f131804b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f131805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f131806d;

    public p(MotionLayout motionLayout) {
        this.f131806d = motionLayout;
    }

    @Override // x4.n
    public final float a() {
        return this.f131806d.f17531d;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        float f14 = this.f131803a;
        MotionLayout motionLayout = this.f131806d;
        if (f14 > 0.0f) {
            float f15 = this.f131805c;
            if (f14 / f15 < f13) {
                f13 = f14 / f15;
            }
            motionLayout.f17531d = f14 - (f15 * f13);
            return ((f14 * f13) - (((f15 * f13) * f13) / 2.0f)) + this.f131804b;
        }
        float f16 = this.f131805c;
        if ((-f14) / f16 < f13) {
            f13 = (-f14) / f16;
        }
        motionLayout.f17531d = (f16 * f13) + f14;
        return (((f16 * f13) * f13) / 2.0f) + (f14 * f13) + this.f131804b;
    }
}
