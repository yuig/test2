package c3;

import ao2.m0;

/* loaded from: classes.dex */
public final class n extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f25526d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f25527e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f25528f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f25529g;

    static {
        float[] a03 = m0.a0(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, m0.n(b.f25481b.f25482a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f25526d = a03;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f25527e = fArr;
        f25528f = m0.P(a03);
        f25529g = m0.P(fArr);
    }

    @Override // c3.d
    public final float a(int i13) {
        return i13 == 0 ? 1.0f : 0.5f;
    }

    @Override // c3.d
    public final float b(int i13) {
        return i13 == 0 ? 0.0f : -0.5f;
    }

    @Override // c3.d
    public final long d(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f25529g;
        float f17 = (fArr[6] * f16) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f16) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f16) + (fArr[5] * f14) + (fArr[2] * f13);
        float f23 = f18 * f18 * f18;
        float f24 = f19 * f19 * f19;
        float[] fArr2 = f25528f;
        float f25 = (fArr2[6] * f24) + (fArr2[3] * f23) + (fArr2[0] * f17 * f17 * f17);
        return (Float.floatToRawIntBits((fArr2[7] * f24) + (fArr2[4] * f23) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f25) << 32);
    }

    @Override // c3.d
    public final float e(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f25529g;
        float f17 = (fArr[6] * f16) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f16) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f16) + (fArr[5] * f14) + (fArr[2] * f13);
        float f23 = f17 * f17 * f17;
        float f24 = f18 * f18 * f18;
        float f25 = f19 * f19 * f19;
        float[] fArr2 = f25528f;
        return (fArr2[8] * f25) + (fArr2[5] * f24) + (fArr2[2] * f23);
    }

    @Override // c3.d
    public final long f(float f13, float f14, float f15, float f16, d dVar) {
        float[] fArr = f25526d;
        float f17 = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
        float J2 = tb.f.J(f17);
        float J3 = tb.f.J(f18);
        float J4 = tb.f.J(f19);
        float[] fArr2 = f25527e;
        return androidx.compose.ui.graphics.a.b((fArr2[6] * J4) + (fArr2[3] * J3) + (fArr2[0] * J2), (fArr2[7] * J4) + (fArr2[4] * J3) + (fArr2[1] * J2), (fArr2[8] * J4) + (fArr2[5] * J3) + (fArr2[2] * J2), f16, dVar);
    }
}
