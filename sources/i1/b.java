package i1;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f70719a;

    static {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f23;
        float[] fArr = new float[RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE];
        f70719a = fArr;
        float[] fArr2 = new float[RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE];
        float f24 = 0.0f;
        float f25 = 0.0f;
        for (int i13 = 0; i13 < 100; i13++) {
            float f26 = i13 / 100;
            float f27 = 1.0f;
            while (true) {
                f13 = ((f27 - f24) / 2.0f) + f24;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f28 = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
                if (Math.abs(f28 - f26) < 1.0E-5d) {
                    break;
                } else if (f28 > f26) {
                    f27 = f13;
                } else {
                    f24 = f13;
                }
            }
            float f29 = 0.5f;
            fArr[i13] = (((f14 * 0.5f) + f13) * f15) + f16;
            float f33 = 1.0f;
            while (true) {
                f17 = ((f33 - f25) / 2.0f) + f25;
                f18 = 1.0f - f17;
                f19 = f17 * 3.0f * f18;
                f23 = f17 * f17 * f17;
                float f34 = (((f18 * f29) + f17) * f19) + f23;
                if (Math.abs(f34 - f26) >= 1.0E-5d) {
                    if (f34 > f26) {
                        f33 = f17;
                    } else {
                        f25 = f17;
                    }
                    f29 = 0.5f;
                }
            }
            fArr2[i13] = (((f17 * 0.35000002f) + (f18 * 0.175f)) * f19) + f23;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static double a(float f13, float f14) {
        return Math.log((Math.abs(f13) * 0.35f) / f14);
    }

    public static a b(float f13) {
        float f14 = 0.0f;
        float f15 = 1.0f;
        float f16 = ql2.s.f(f13, 0.0f, 1.0f);
        float f17 = 100;
        int i13 = (int) (f17 * f16);
        if (i13 < 100) {
            float f18 = i13 / f17;
            int i14 = i13 + 1;
            float f19 = i14 / f17;
            float[] fArr = f70719a;
            float f23 = fArr[i13];
            float f24 = (fArr[i14] - f23) / (f19 - f18);
            float a13 = ep.b.a(f16, f18, f24, f23);
            f14 = f24;
            f15 = a13;
        }
        return new a(f15, f14);
    }
}
