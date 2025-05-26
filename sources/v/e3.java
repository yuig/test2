package v;

import a.cb;

/* loaded from: classes2.dex */
public final class e3 implements c0.t1 {

    /* renamed from: a, reason: collision with root package name */
    public float f123440a;

    /* renamed from: b, reason: collision with root package name */
    public final float f123441b;

    /* renamed from: c, reason: collision with root package name */
    public final float f123442c;

    /* renamed from: d, reason: collision with root package name */
    public float f123443d;

    public e3(float f13, float f14) {
        this.f123441b = f13;
        this.f123442c = f14;
    }

    @Override // c0.t1
    public final float a() {
        return this.f123443d;
    }

    @Override // c0.t1
    public final float b() {
        return this.f123440a;
    }

    public final void c(float f13) {
        if (f13 > 1.0f || f13 < 0.0f) {
            throw new IllegalArgumentException(cb.h("Requested linearZoom ", f13, " is not within valid range [0..1]"));
        }
        this.f123443d = f13;
        float f14 = this.f123441b;
        if (f13 != 1.0f) {
            float f15 = this.f123442c;
            if (f13 == 0.0f) {
                f14 = f15;
            } else {
                double d2 = 1.0f / f15;
                double d13 = 1.0d / ((((1.0f / f14) - d2) * f13) + d2);
                double d14 = f15;
                double d15 = f14;
                if (d13 < d14) {
                    d13 = d14;
                } else if (d13 > d15) {
                    d13 = d15;
                }
                f14 = (float) d13;
            }
        }
        this.f123440a = f14;
    }

    public final void d() {
        float f13 = 1.0f;
        float f14 = this.f123441b;
        float f15 = this.f123442c;
        if (1.0f > f14 || 1.0f < f15) {
            throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f15 + " , " + f14 + "]");
        }
        this.f123440a = 1.0f;
        if (f14 != f15) {
            if (1.0f != f14) {
                if (1.0f != f15) {
                    float f16 = 1.0f / f15;
                    f13 = (1.0f - f16) / ((1.0f / f14) - f16);
                }
            }
            this.f123443d = f13;
        }
        f13 = 0.0f;
        this.f123443d = f13;
    }
}
