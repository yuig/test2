package t4;

import java.lang.reflect.Array;
import kh2.c3;

/* loaded from: classes3.dex */
public final class i extends c3 {

    /* renamed from: a */
    public final double[] f116367a;

    /* renamed from: b */
    public final double[][] f116368b;

    /* renamed from: c */
    public final double[][] f116369c;

    /* renamed from: d */
    public final double[] f116370d;

    public i(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f116370d = new double[length2];
        int i13 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i13, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i14 = 0; i14 < length2; i14++) {
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 + 1;
                double d2 = dArr[i16] - dArr[i15];
                double[] dArr5 = dArr3[i15];
                double d13 = (dArr2[i16][i14] - dArr2[i15][i14]) / d2;
                dArr5[i14] = d13;
                if (i15 == 0) {
                    dArr4[i15][i14] = d13;
                } else {
                    dArr4[i15][i14] = (dArr3[i15 - 1][i14] + d13) * 0.5d;
                }
                i15 = i16;
            }
            dArr4[i13][i14] = dArr3[length - 2][i14];
        }
        for (int i17 = 0; i17 < i13; i17++) {
            for (int i18 = 0; i18 < length2; i18++) {
                double d14 = dArr3[i17][i18];
                if (d14 == 0.0d) {
                    dArr4[i17][i18] = 0.0d;
                    dArr4[i17 + 1][i18] = 0.0d;
                } else {
                    double d15 = dArr4[i17][i18] / d14;
                    int i19 = i17 + 1;
                    double d16 = dArr4[i19][i18] / d14;
                    double hypot = Math.hypot(d15, d16);
                    if (hypot > 9.0d) {
                        double d17 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i17];
                        double[] dArr7 = dArr3[i17];
                        dArr6[i18] = d15 * d17 * dArr7[i18];
                        dArr4[i19][i18] = d17 * d16 * dArr7[i18];
                    }
                }
            }
        }
        this.f116367a = dArr;
        this.f116368b = dArr2;
        this.f116369c = dArr4;
    }

    public static double y0(double d2, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d13 * d13;
        double d19 = d13 * 6.0d;
        double d23 = 6.0d * d18 * d14;
        double d24 = 3.0d * d2;
        return (d2 * d16) + (((((d24 * d16) * d18) + (((d24 * d17) * d18) + ((d23 + ((d19 * d15) + (((-6.0d) * d18) * d15))) - (d19 * d14)))) - (((2.0d * d2) * d17) * d13)) - (((4.0d * d2) * d16) * d13));
    }

    public static double z0(double d2, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d13 * d13;
        double d19 = d18 * d13;
        double d23 = 3.0d * d18;
        double d24 = d19 * 2.0d * d14;
        double d25 = ((d24 + ((d23 * d15) + (((-2.0d) * d19) * d15))) - (d23 * d14)) + d14;
        double d26 = d2 * d17;
        double d27 = (d26 * d19) + d25;
        double d28 = d2 * d16;
        return (d28 * d13) + ((((d19 * d28) + d27) - (d26 * d18)) - (((2.0d * d2) * d16) * d18));
    }

    @Override // kh2.c3
    public final double F(double d2) {
        double d13;
        double d14;
        double I;
        double[] dArr = this.f116367a;
        int length = dArr.length;
        double d15 = dArr[0];
        double[][] dArr2 = this.f116368b;
        if (d2 <= d15) {
            d13 = dArr2[0][0];
            d14 = d2 - d15;
            I = I(d15);
        } else {
            int i13 = length - 1;
            double d16 = dArr[i13];
            if (d2 < d16) {
                int i14 = 0;
                while (i14 < i13) {
                    double d17 = dArr[i14];
                    if (d2 == d17) {
                        return dArr2[i14][0];
                    }
                    int i15 = i14 + 1;
                    double d18 = dArr[i15];
                    if (d2 < d18) {
                        double d19 = d18 - d17;
                        double d23 = (d2 - d17) / d19;
                        double d24 = dArr2[i14][0];
                        double d25 = dArr2[i15][0];
                        double[][] dArr3 = this.f116369c;
                        return z0(d19, d23, d24, d25, dArr3[i14][0], dArr3[i15][0]);
                    }
                    i14 = i15;
                }
                return 0.0d;
            }
            d13 = dArr2[i13][0];
            d14 = d2 - d16;
            I = I(d16);
        }
        return (I * d14) + d13;
    }

    @Override // kh2.c3
    public final void G(double d2, double[] dArr) {
        double[] dArr2 = this.f116367a;
        int length = dArr2.length;
        double[][] dArr3 = this.f116368b;
        int i13 = 0;
        int length2 = dArr3[0].length;
        double d13 = dArr2[0];
        double[] dArr4 = this.f116370d;
        if (d2 <= d13) {
            J(d13, dArr4);
            for (int i14 = 0; i14 < length2; i14++) {
                dArr[i14] = ((d2 - dArr2[0]) * dArr4[i14]) + dArr3[0][i14];
            }
            return;
        }
        int i15 = length - 1;
        double d14 = dArr2[i15];
        if (d2 >= d14) {
            J(d14, dArr4);
            while (i13 < length2) {
                dArr[i13] = ((d2 - dArr2[i15]) * dArr4[i13]) + dArr3[i15][i13];
                i13++;
            }
            return;
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d2 == dArr2[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = dArr3[i16][i17];
                }
            }
            int i18 = i16 + 1;
            double d15 = dArr2[i18];
            if (d2 < d15) {
                double d16 = dArr2[i16];
                double d17 = d15 - d16;
                double d18 = (d2 - d16) / d17;
                while (i13 < length2) {
                    double d19 = dArr3[i16][i13];
                    double d23 = dArr3[i18][i13];
                    double[][] dArr5 = this.f116369c;
                    dArr[i13] = z0(d17, d18, d19, d23, dArr5[i16][i13], dArr5[i18][i13]);
                    i13++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // kh2.c3
    public final void H(double d2, float[] fArr) {
        double[] dArr = this.f116367a;
        int length = dArr.length;
        double[][] dArr2 = this.f116368b;
        int i13 = 0;
        int length2 = dArr2[0].length;
        double d13 = dArr[0];
        double[] dArr3 = this.f116370d;
        if (d2 <= d13) {
            J(d13, dArr3);
            for (int i14 = 0; i14 < length2; i14++) {
                fArr[i14] = (float) (((d2 - dArr[0]) * dArr3[i14]) + dArr2[0][i14]);
            }
            return;
        }
        int i15 = length - 1;
        double d14 = dArr[i15];
        if (d2 >= d14) {
            J(d14, dArr3);
            while (i13 < length2) {
                fArr[i13] = (float) (((d2 - dArr[i15]) * dArr3[i13]) + dArr2[i15][i13]);
                i13++;
            }
            return;
        }
        int i16 = 0;
        while (i16 < i15) {
            if (d2 == dArr[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) dArr2[i16][i17];
                }
            }
            int i18 = i16 + 1;
            double d15 = dArr[i18];
            if (d2 < d15) {
                double d16 = dArr[i16];
                double d17 = d15 - d16;
                double d18 = (d2 - d16) / d17;
                while (i13 < length2) {
                    double d19 = dArr2[i16][i13];
                    double d23 = dArr2[i18][i13];
                    double[][] dArr4 = this.f116369c;
                    fArr[i13] = (float) z0(d17, d18, d19, d23, dArr4[i16][i13], dArr4[i18][i13]);
                    i13++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // kh2.c3
    public final double I(double d2) {
        double[] dArr = this.f116367a;
        int length = dArr.length;
        double d13 = dArr[0];
        if (d2 >= d13) {
            d13 = dArr[length - 1];
            if (d2 < d13) {
                d13 = d2;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            int i14 = i13 + 1;
            double d14 = dArr[i14];
            if (d13 <= d14) {
                double d15 = dArr[i13];
                double d16 = d14 - d15;
                double[][] dArr2 = this.f116368b;
                double d17 = dArr2[i13][0];
                double d18 = dArr2[i14][0];
                double[][] dArr3 = this.f116369c;
                return y0(d16, (d13 - d15) / d16, d17, d18, dArr3[i13][0], dArr3[i14][0]) / d16;
            }
            i13 = i14;
        }
        return 0.0d;
    }

    @Override // kh2.c3
    public final void J(double d2, double[] dArr) {
        double[] dArr2 = this.f116367a;
        int length = dArr2.length;
        double[][] dArr3 = this.f116368b;
        int length2 = dArr3[0].length;
        double d13 = dArr2[0];
        if (d2 > d13) {
            d13 = dArr2[length - 1];
            if (d2 < d13) {
                d13 = d2;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            int i14 = i13 + 1;
            double d14 = dArr2[i14];
            if (d13 <= d14) {
                double d15 = dArr2[i13];
                double d16 = d14 - d15;
                double d17 = (d13 - d15) / d16;
                for (int i15 = 0; i15 < length2; i15++) {
                    double d18 = dArr3[i13][i15];
                    double d19 = dArr3[i14][i15];
                    double[][] dArr4 = this.f116369c;
                    dArr[i15] = y0(d16, d17, d18, d19, dArr4[i13][i15], dArr4[i14][i15]) / d16;
                }
                return;
            }
            i13 = i14;
        }
    }

    @Override // kh2.c3
    public final double[] K() {
        return this.f116367a;
    }
}
