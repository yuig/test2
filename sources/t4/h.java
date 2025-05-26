package t4;

import kh2.c3;

/* loaded from: classes3.dex */
public final class h extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f116364a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f116365b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f116366c;

    @Override // kh2.c3
    public final double F(double d2) {
        double d13;
        double d14;
        double I;
        double[] dArr = this.f116364a;
        int length = dArr.length;
        double d15 = dArr[0];
        double[][] dArr2 = this.f116365b;
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
                        double d19 = (d2 - d17) / (d18 - d17);
                        return (dArr2[i15][0] * d19) + ((1.0d - d19) * dArr2[i14][0]);
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
        double[] dArr2 = this.f116364a;
        int length = dArr2.length;
        double[][] dArr3 = this.f116365b;
        int i13 = 0;
        int length2 = dArr3[0].length;
        double d13 = dArr2[0];
        double[] dArr4 = this.f116366c;
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
                double d17 = (d2 - d16) / (d15 - d16);
                while (i13 < length2) {
                    dArr[i13] = (dArr3[i18][i13] * d17) + ((1.0d - d17) * dArr3[i16][i13]);
                    i13++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // kh2.c3
    public final void H(double d2, float[] fArr) {
        double[] dArr = this.f116364a;
        int length = dArr.length;
        double[][] dArr2 = this.f116365b;
        int i13 = 0;
        int length2 = dArr2[0].length;
        double d13 = dArr[0];
        double[] dArr3 = this.f116366c;
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
                double d17 = (d2 - d16) / (d15 - d16);
                while (i13 < length2) {
                    fArr[i13] = (float) ((dArr2[i18][i13] * d17) + ((1.0d - d17) * dArr2[i16][i13]));
                    i13++;
                }
                return;
            }
            i16 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    @Override // kh2.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double I(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f116364a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.f116365b
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.h.I(double):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r12 >= r5) goto L4;
     */
    @Override // kh2.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.f116364a
            int r1 = r0.length
            double[][] r2 = r11.f116365b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.h.J(double, double[]):void");
    }

    @Override // kh2.c3
    public final double[] K() {
        return this.f116364a;
    }
}
