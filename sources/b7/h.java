package b7;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f22050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22052c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22053d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22055f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22056g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22057h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f22058i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f22059j;

    /* renamed from: k, reason: collision with root package name */
    public int f22060k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f22061l;

    /* renamed from: m, reason: collision with root package name */
    public int f22062m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f22063n;

    /* renamed from: o, reason: collision with root package name */
    public int f22064o;

    /* renamed from: p, reason: collision with root package name */
    public int f22065p;

    /* renamed from: q, reason: collision with root package name */
    public int f22066q;

    /* renamed from: r, reason: collision with root package name */
    public int f22067r;

    /* renamed from: s, reason: collision with root package name */
    public int f22068s;

    /* renamed from: t, reason: collision with root package name */
    public int f22069t;

    /* renamed from: u, reason: collision with root package name */
    public int f22070u;

    /* renamed from: v, reason: collision with root package name */
    public int f22071v;

    /* renamed from: w, reason: collision with root package name */
    public double f22072w;

    public h(float f13, float f14, int i13, int i14, int i15) {
        this.f22050a = i13;
        this.f22051b = i14;
        this.f22052c = f13;
        this.f22053d = f14;
        this.f22054e = i13 / i15;
        this.f22055f = i13 / 400;
        int i16 = i13 / 65;
        this.f22056g = i16;
        int i17 = i16 * 2;
        this.f22057h = i17;
        this.f22058i = new short[i17];
        this.f22059j = new short[i17 * i14];
        this.f22061l = new short[i17 * i14];
        this.f22063n = new short[i17 * i14];
    }

    public static void i(int i13, int i14, short[] sArr, int i15, short[] sArr2, int i16, short[] sArr3, int i17) {
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i15 * i14) + i18;
            int i23 = (i17 * i14) + i18;
            int i24 = (i16 * i14) + i18;
            for (int i25 = 0; i25 < i13; i25++) {
                sArr[i19] = (short) (((sArr3[i23] * i25) + ((i13 - i25) * sArr2[i24])) / i13);
                i19 += i14;
                i24 += i14;
                i23 += i14;
            }
        }
    }

    public final void a(short[] sArr, int i13, int i14) {
        short[] c13 = c(this.f22061l, this.f22062m, i14);
        this.f22061l = c13;
        int i15 = this.f22051b;
        System.arraycopy(sArr, i13 * i15, c13, this.f22062m * i15, i15 * i14);
        this.f22062m += i14;
    }

    public final void b(short[] sArr, int i13, int i14) {
        int i15 = this.f22057h / i14;
        int i16 = this.f22051b;
        int i17 = i14 * i16;
        int i18 = i13 * i16;
        for (int i19 = 0; i19 < i15; i19++) {
            int i23 = 0;
            for (int i24 = 0; i24 < i17; i24++) {
                i23 += sArr[(i19 * i17) + i18 + i24];
            }
            this.f22058i[i19] = (short) (i23 / i17);
        }
    }

    public final short[] c(short[] sArr, int i13, int i14) {
        int length = sArr.length;
        int i15 = this.f22051b;
        int i16 = length / i15;
        return i13 + i14 <= i16 ? sArr : Arrays.copyOf(sArr, (((i16 * 3) / 2) + i14) * i15);
    }

    public final int d(short[] sArr, int i13, int i14, int i15) {
        int i16 = i13 * this.f22051b;
        int i17 = 255;
        int i18 = 1;
        int i19 = 0;
        int i23 = 0;
        while (i14 <= i15) {
            int i24 = 0;
            for (int i25 = 0; i25 < i14; i25++) {
                i24 += Math.abs(sArr[i16 + i25] - sArr[(i16 + i14) + i25]);
            }
            if (i24 * i19 < i18 * i14) {
                i19 = i14;
                i18 = i24;
            }
            if (i24 * i17 > i23 * i14) {
                i17 = i14;
                i23 = i24;
            }
            i14++;
        }
        this.f22070u = i18 / i19;
        this.f22071v = i23 / i17;
        return i19;
    }

    public final void e() {
        this.f22060k = 0;
        this.f22062m = 0;
        this.f22064o = 0;
        this.f22065p = 0;
        this.f22066q = 0;
        this.f22067r = 0;
        this.f22068s = 0;
        this.f22069t = 0;
        this.f22070u = 0;
        this.f22071v = 0;
        this.f22072w = 0.0d;
    }

    public final void f(ShortBuffer shortBuffer) {
        bf.b.t(this.f22062m >= 0);
        int remaining = shortBuffer.remaining();
        int i13 = this.f22051b;
        int min = Math.min(remaining / i13, this.f22062m);
        shortBuffer.put(this.f22061l, 0, min * i13);
        int i14 = this.f22062m - min;
        this.f22062m = i14;
        short[] sArr = this.f22061l;
        System.arraycopy(sArr, min * i13, sArr, 0, i14 * i13);
    }

    public final int g() {
        bf.b.t(this.f22062m >= 0);
        return this.f22062m * this.f22051b * 2;
    }

    public final int h() {
        return this.f22060k * this.f22051b * 2;
    }

    public final void j() {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        long j13;
        long j14;
        int i26 = this.f22062m;
        float f13 = this.f22052c;
        float f14 = this.f22053d;
        double d2 = f13 / f14;
        float f15 = this.f22054e * f14;
        int i27 = this.f22050a;
        int i28 = this.f22051b;
        int i29 = 0;
        int i33 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i34 = this.f22060k;
            int i35 = this.f22057h;
            if (i34 >= i35) {
                int i36 = 0;
                while (true) {
                    int i37 = this.f22067r;
                    if (i37 > 0) {
                        int min = Math.min(i35, i37);
                        a(this.f22059j, i36, min);
                        this.f22067r -= min;
                        i36 += min;
                        i14 = i26;
                        i13 = i27;
                    } else {
                        short[] sArr = this.f22059j;
                        int i38 = i27 > 4000 ? i27 / 4000 : i33;
                        int i39 = this.f22056g;
                        int i43 = this.f22055f;
                        if (i28 == i33 && i38 == i33) {
                            i15 = d(sArr, i36, i43, i39);
                            i14 = i26;
                            i13 = i27;
                        } else {
                            b(sArr, i36, i38);
                            i13 = i27;
                            i14 = i26;
                            short[] sArr2 = this.f22058i;
                            int d13 = d(sArr2, 0, i43 / i38, i39 / i38);
                            if (i38 != 1) {
                                int i44 = d13 * i38;
                                int i45 = i38 * 4;
                                int i46 = i44 - i45;
                                int i47 = i44 + i45;
                                if (i46 >= i43) {
                                    i43 = i46;
                                }
                                if (i47 <= i39) {
                                    i39 = i47;
                                }
                                if (i28 == 1) {
                                    i15 = d(sArr, i36, i43, i39);
                                } else {
                                    b(sArr, i36, 1);
                                    i15 = d(sArr2, 0, i43, i39);
                                }
                            } else {
                                i15 = d13;
                            }
                        }
                        int i48 = this.f22070u;
                        int i49 = this.f22071v;
                        if (i48 == 0 || (i16 = this.f22068s) == 0 || i49 > i48 * 3 || i48 * 2 <= this.f22069t * 3) {
                            i16 = i15;
                        }
                        this.f22069t = i48;
                        this.f22068s = i15;
                        if (d2 > 1.0d) {
                            short[] sArr3 = this.f22059j;
                            if (d2 >= 2.0d) {
                                double d14 = (i16 / (d2 - 1.0d)) + this.f22072w;
                                i18 = (int) Math.round(d14);
                                this.f22072w = d14 - i18;
                            } else {
                                double d15 = (((2.0d - d2) * i16) / (d2 - 1.0d)) + this.f22072w;
                                int round = (int) Math.round(d15);
                                this.f22067r = round;
                                this.f22072w = d15 - round;
                                i18 = i16;
                            }
                            short[] c13 = c(this.f22061l, this.f22062m, i18);
                            this.f22061l = c13;
                            int i53 = i36;
                            i(i18, this.f22051b, c13, this.f22062m, sArr3, i53, sArr3, i36 + i16);
                            this.f22062m += i18;
                            i36 = i16 + i18 + i53;
                        } else {
                            int i54 = i36;
                            short[] sArr4 = this.f22059j;
                            if (d2 < 0.5d) {
                                double d16 = ((i16 * d2) / (1.0d - d2)) + this.f22072w;
                                i17 = (int) Math.round(d16);
                                this.f22072w = d16 - i17;
                            } else {
                                double d17 = ((((2.0d * d2) - 1.0d) * i16) / (1.0d - d2)) + this.f22072w;
                                int round2 = (int) Math.round(d17);
                                this.f22067r = round2;
                                this.f22072w = d17 - round2;
                                i17 = i16;
                            }
                            int i55 = i16 + i17;
                            short[] c14 = c(this.f22061l, this.f22062m, i55);
                            this.f22061l = c14;
                            System.arraycopy(sArr4, i54 * i28, c14, this.f22062m * i28, i16 * i28);
                            i(i17, this.f22051b, this.f22061l, this.f22062m + i16, sArr4, i54 + i16, sArr4, i54);
                            this.f22062m += i55;
                            i36 = i54 + i17;
                        }
                    }
                    if (i36 + i35 > i34) {
                        break;
                    }
                    i27 = i13;
                    i26 = i14;
                    i33 = 1;
                }
                int i56 = this.f22060k - i36;
                short[] sArr5 = this.f22059j;
                System.arraycopy(sArr5, i36 * i28, sArr5, 0, i56 * i28);
                this.f22060k = i56;
                if (f15 != 1.0f || this.f22062m == (i19 = i14)) {
                }
                int i57 = i13;
                long j15 = (long) (i57 / f15);
                long j16 = i57;
                while (j15 != 0 && j16 != 0 && j15 % 2 == 0 && j16 % 2 == 0) {
                    j15 /= 2;
                    j16 /= 2;
                }
                int i58 = this.f22062m - i19;
                short[] c15 = c(this.f22063n, this.f22064o, i58);
                this.f22063n = c15;
                System.arraycopy(this.f22061l, i19 * i28, c15, this.f22064o * i28, i58 * i28);
                this.f22062m = i19;
                this.f22064o += i58;
                int i59 = 0;
                while (true) {
                    i23 = this.f22064o;
                    i24 = i23 - 1;
                    if (i59 >= i24) {
                        break;
                    }
                    while (true) {
                        i25 = this.f22065p + 1;
                        j13 = i25;
                        long j17 = j13 * j15;
                        j14 = this.f22066q;
                        if (j17 <= j14 * j16) {
                            break;
                        }
                        this.f22061l = c(this.f22061l, this.f22062m, 1);
                        int i63 = i29;
                        while (i63 < i28) {
                            short[] sArr6 = this.f22061l;
                            int i64 = (this.f22062m * i28) + i63;
                            short[] sArr7 = this.f22063n;
                            int i65 = (i59 * i28) + i63;
                            short s13 = sArr7[i65];
                            short s14 = sArr7[i65 + i28];
                            long j18 = this.f22066q * j16;
                            long j19 = j16;
                            long j23 = (r12 + 1) * j15;
                            long j24 = j23 - j18;
                            long j25 = j23 - (this.f22065p * j15);
                            sArr6[i64] = (short) ((((j25 - j24) * s14) + (s13 * j24)) / j25);
                            i63++;
                            j16 = j19;
                        }
                        this.f22066q++;
                        this.f22062m++;
                        j16 = j16;
                        i29 = 0;
                    }
                    long j26 = j16;
                    this.f22065p = i25;
                    if (j13 == j26) {
                        this.f22065p = 0;
                        bf.b.t(j14 == j15);
                        this.f22066q = 0;
                    }
                    i59++;
                    j16 = j26;
                    i29 = 0;
                }
                if (i24 == 0) {
                    return;
                }
                short[] sArr8 = this.f22063n;
                System.arraycopy(sArr8, i24 * i28, sArr8, 0, (i23 - i24) * i28);
                this.f22064o -= i24;
                return;
            }
        } else {
            a(this.f22059j, 0, this.f22060k);
            this.f22060k = 0;
        }
        i14 = i26;
        i13 = i27;
        if (f15 != 1.0f) {
        }
    }

    public final void k() {
        int i13 = this.f22060k;
        float f13 = this.f22052c;
        float f14 = this.f22053d;
        double d2 = f13 / f14;
        int i14 = this.f22062m + ((int) (((((((i13 - r5) / d2) + this.f22067r) + this.f22072w) + this.f22064o) / (this.f22054e * f14)) + 0.5d));
        this.f22072w = 0.0d;
        short[] sArr = this.f22059j;
        int i15 = this.f22057h * 2;
        this.f22059j = c(sArr, i13, i15 + i13);
        int i16 = 0;
        while (true) {
            int i17 = this.f22051b;
            if (i16 >= i15 * i17) {
                break;
            }
            this.f22059j[(i17 * i13) + i16] = 0;
            i16++;
        }
        this.f22060k = i15 + this.f22060k;
        j();
        if (this.f22062m > i14) {
            this.f22062m = Math.max(i14, 0);
        }
        this.f22060k = 0;
        this.f22067r = 0;
        this.f22064o = 0;
    }

    public final void l(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i13 = this.f22051b;
        int i14 = remaining / i13;
        short[] c13 = c(this.f22059j, this.f22060k, i14);
        this.f22059j = c13;
        shortBuffer.get(c13, this.f22060k * i13, ((i14 * i13) * 2) / 2);
        this.f22060k += i14;
        j();
    }
}
