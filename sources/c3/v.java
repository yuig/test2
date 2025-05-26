package c3;

/* loaded from: classes.dex */
public final class v extends d {
    @Override // c3.d
    public final float a(int i13) {
        return 2.0f;
    }

    @Override // c3.d
    public final float b(int i13) {
        return -2.0f;
    }

    @Override // c3.d
    public final long d(float f13, float f14, float f15) {
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        return (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14 <= 2.0f ? f14 : 2.0f) & 4294967295L);
    }

    @Override // c3.d
    public final float e(float f13, float f14, float f15) {
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            return 2.0f;
        }
        return f15;
    }

    @Override // c3.d
    public final long f(float f13, float f14, float f15, float f16, d dVar) {
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        return androidx.compose.ui.graphics.a.b(f13, f14, f15 <= 2.0f ? f15 : 2.0f, f16, dVar);
    }
}
