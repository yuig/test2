package j1;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f74057a;

    /* renamed from: b, reason: collision with root package name */
    public final float[][] f74058b;

    /* renamed from: c, reason: collision with root package name */
    public final float[][] f74059c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f74060d;

    public f1(float[] fArr, float[][] fArr2, float f13) {
        int i13;
        int length = fArr.length;
        int i14 = 0;
        int length2 = fArr2[0].length;
        this.f74060d = new float[length2];
        int i15 = length - 1;
        float[][] fArr3 = new float[i15][];
        for (int i16 = 0; i16 < i15; i16++) {
            fArr3[i16] = new float[length2];
        }
        float[][] fArr4 = new float[length][];
        for (int i17 = 0; i17 < length; i17++) {
            fArr4[i17] = new float[length2];
        }
        for (int i18 = 0; i18 < length2; i18++) {
            int i19 = 0;
            while (i19 < i15) {
                int i23 = i19 + 1;
                float f14 = fArr[i23] - fArr[i19];
                float[] fArr5 = fArr3[i19];
                float f15 = (fArr2[i23][i18] - fArr2[i19][i18]) / f14;
                fArr5[i18] = f15;
                if (i19 == 0) {
                    fArr4[i19][i18] = f15;
                } else {
                    fArr4[i19][i18] = (fArr3[i19 - 1][i18] + f15) * 0.5f;
                }
                i19 = i23;
            }
            fArr4[i15][i18] = fArr3[length - 2][i18];
        }
        if (!Float.isNaN(f13)) {
            for (int i24 = 0; i24 < length2; i24++) {
                float[] fArr6 = fArr3[length - 2];
                float f16 = (1 - f13) * fArr6[i24];
                float[] fArr7 = fArr3[0];
                float f17 = (fArr7[i24] * f13) + f16;
                fArr7[i24] = f17;
                fArr6[i24] = f17;
                fArr4[i15][i24] = f17;
                fArr4[0][i24] = f17;
            }
        }
        int i25 = 0;
        while (i25 < i15) {
            int i26 = i14;
            while (i26 < length2) {
                float f18 = fArr3[i25][i26];
                if (f18 == 0.0f) {
                    fArr4[i25][i26] = 0.0f;
                    fArr4[i25 + 1][i26] = 0.0f;
                    i13 = length2;
                } else {
                    float f19 = fArr4[i25][i26] / f18;
                    int i27 = i25 + 1;
                    float f23 = fArr4[i27][i26] / f18;
                    i13 = length2;
                    float hypot = (float) Math.hypot(f19, f23);
                    if (hypot > 9.0d) {
                        float f24 = 3.0f / hypot;
                        float[] fArr8 = fArr4[i25];
                        float[] fArr9 = fArr3[i25];
                        fArr8[i26] = f19 * f24 * fArr9[i26];
                        fArr4[i27][i26] = f24 * f23 * fArr9[i26];
                    }
                }
                i26++;
                length2 = i13;
            }
            i25++;
            i14 = 0;
        }
        this.f74057a = fArr;
        this.f74058b = fArr2;
        this.f74059c = fArr4;
    }

    public static float a(float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = f14 * f14;
        float f23 = 6;
        float f24 = f23 * f14;
        float f25 = (((f23 * f19) * f15) + ((f16 * f24) + (((-6) * f19) * f16))) - (f24 * f15);
        float f26 = 3 * f13;
        return (f13 * f17) + (((((f26 * f17) * f19) + (((f26 * f18) * f19) + f25)) - (((2 * f13) * f18) * f14)) - (((4 * f13) * f17) * f14));
    }

    public final void b(float f13, t tVar, int i13) {
        f1 f1Var = this;
        float[] fArr = f1Var.f74057a;
        int length = fArr.length;
        float[][] fArr2 = f1Var.f74058b;
        int i14 = 0;
        int length2 = fArr2[0].length;
        float f14 = fArr[0];
        float[] fArr3 = f1Var.f74060d;
        if (f13 <= f14) {
            f1Var.c(f14, fArr3);
            for (int i15 = 0; i15 < length2; i15++) {
                tVar.e(i15, ((f13 - fArr[0]) * fArr3[i15]) + fArr2[0][i15]);
            }
            return;
        }
        int i16 = length - 1;
        float f15 = fArr[i16];
        if (f13 >= f15) {
            f1Var.c(f15, fArr3);
            while (i14 < length2) {
                tVar.e(i14, ((f13 - fArr[i16]) * fArr3[i14]) + fArr2[i16][i14]);
                i14++;
            }
            return;
        }
        int i17 = i13;
        while (i17 < i16) {
            if (f13 == fArr[i17]) {
                for (int i18 = 0; i18 < length2; i18++) {
                    tVar.e(i18, fArr2[i17][i18]);
                }
            }
            int i19 = i17 + 1;
            float f16 = fArr[i19];
            if (f13 < f16) {
                float f17 = fArr[i17];
                float f18 = f16 - f17;
                float f19 = (f13 - f17) / f18;
                while (i14 < length2) {
                    float f23 = fArr2[i17][i14];
                    float f24 = fArr2[i19][i14];
                    float[][] fArr4 = f1Var.f74059c;
                    float f25 = fArr4[i17][i14];
                    float f26 = f19 * f19;
                    float f27 = f26 * f19;
                    float f28 = 3 * f26;
                    float f29 = 2;
                    float f33 = fArr4[i19][i14] * f18;
                    float f34 = (f33 * f27) + ((((f29 * f27) * f23) + ((f24 * f28) + (((-2) * f27) * f24))) - (f28 * f23)) + f23;
                    float f35 = f18 * f25;
                    tVar.e(i14, (f35 * f19) + ((((f27 * f35) + f34) - (f33 * f26)) - (((f29 * f18) * f25) * f26)));
                    i14++;
                    f1Var = this;
                }
                return;
            }
            f1Var = this;
            i17 = i19;
        }
    }

    public final void c(float f13, float[] fArr) {
        float[] fArr2 = this.f74057a;
        int length = fArr2.length;
        float[][] fArr3 = this.f74058b;
        int length2 = fArr3[0].length;
        float f14 = fArr2[0];
        if (f13 > f14) {
            f14 = fArr2[length - 1];
            if (f13 < f14) {
                f14 = f13;
            }
        }
        int i13 = length - 1;
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i14 + 1;
            float f15 = fArr2[i15];
            if (f14 <= f15) {
                float f16 = fArr2[i14];
                float f17 = f15 - f16;
                float f18 = (f14 - f16) / f17;
                for (int i16 = 0; i16 < length2; i16++) {
                    float f19 = fArr3[i14][i16];
                    float f23 = fArr3[i15][i16];
                    float[][] fArr4 = this.f74059c;
                    fArr[i16] = a(f17, f18, f19, f23, fArr4[i14][i16], fArr4[i15][i16]) / f17;
                }
                return;
            }
            i14 = i15;
        }
    }
}
