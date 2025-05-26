package c3;

/* loaded from: classes.dex */
public final class m extends d {
    @Override // c3.d
    public final float a(int i13) {
        return i13 == 0 ? 100.0f : 128.0f;
    }

    @Override // c3.d
    public final float b(int i13) {
        return i13 == 0 ? 0.0f : -128.0f;
    }

    @Override // c3.d
    public final long d(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        float f16 = (f13 + 16.0f) / 116.0f;
        float f17 = (f14 * 0.002f) + f16;
        float f18 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float f19 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f23 = f18 * l.f25525e[0];
        return (Float.floatToRawIntBits(f19 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f23) << 32);
    }

    @Override // c3.d
    public final float e(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        float f16 = ((f13 + 16.0f) / 116.0f) - (f15 * 0.005f);
        return (f16 > 0.20689656f ? f16 * f16 * f16 : 0.12841855f * (f16 - 0.13793103f)) * l.f25525e[2];
    }

    @Override // c3.d
    public final long f(float f13, float f14, float f15, float f16, d dVar) {
        float[] fArr = l.f25525e;
        float f17 = f13 / fArr[0];
        float f18 = f14 / fArr[1];
        float f19 = f15 / fArr[2];
        float cbrt = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
        float cbrt2 = f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f;
        float f23 = (116.0f * cbrt2) - 16.0f;
        float f24 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f19 > 0.008856452f ? (float) Math.cbrt(f19) : (f19 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f23 < 0.0f) {
            f23 = 0.0f;
        }
        if (f23 > 100.0f) {
            f23 = 100.0f;
        }
        if (f24 < -128.0f) {
            f24 = -128.0f;
        }
        if (f24 > 128.0f) {
            f24 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        return androidx.compose.ui.graphics.a.b(f23, f24, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f16, dVar);
    }
}
