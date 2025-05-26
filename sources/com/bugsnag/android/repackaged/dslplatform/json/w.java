package com.bugsnag.android.repackaged.dslplatform.json;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public abstract class w {
    public static final byte[] M;
    public static final byte[] N;
    public static final BigDecimal O;
    public static final BigDecimal P;

    /* renamed from: a, reason: collision with root package name */
    public static final short[] f29598a = new short[0];

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f29599b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f29600c = new long[0];

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f29601d = new float[0];

    /* renamed from: e, reason: collision with root package name */
    public static final double[] f29602e = new double[0];

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f29603f = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f29604g = {RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE, 444, 888, 1776};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f29605h = {50, 100, 200, 400, 800};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f29606i = {10000, 1000, 100, 10, 1};

    /* renamed from: j, reason: collision with root package name */
    public static final double[] f29607j = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 1.0E23d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};

    /* renamed from: k, reason: collision with root package name */
    public static final b f29608k = new b(12);

    /* renamed from: l, reason: collision with root package name */
    public static final b f29609l = new b(18);

    /* renamed from: m, reason: collision with root package name */
    public static final c f29610m = new c(14);

    /* renamed from: n, reason: collision with root package name */
    public static final b f29611n = new b(19);

    /* renamed from: o, reason: collision with root package name */
    public static final c f29612o = new c(15);

    /* renamed from: p, reason: collision with root package name */
    public static final b f29613p = new b(20);

    /* renamed from: q, reason: collision with root package name */
    public static final b f29614q = new b(21);

    /* renamed from: r, reason: collision with root package name */
    public static final c f29615r = new c(16);

    /* renamed from: s, reason: collision with root package name */
    public static final b f29616s = new b(22);

    /* renamed from: t, reason: collision with root package name */
    public static final c f29617t = new c(6);

    /* renamed from: u, reason: collision with root package name */
    public static final b f29618u = new b(6);

    /* renamed from: v, reason: collision with root package name */
    public static final b f29619v = new b(7);

    /* renamed from: w, reason: collision with root package name */
    public static final c f29620w = new c(7);

    /* renamed from: x, reason: collision with root package name */
    public static final b f29621x = new b(8);

    /* renamed from: y, reason: collision with root package name */
    public static final c f29622y = new c(8);

    /* renamed from: z, reason: collision with root package name */
    public static final b f29623z = new b(9);
    public static final b A = new b(10);
    public static final c B = new c(9);
    public static final b C = new b(11);
    public static final c D = new c(10);
    public static final b E = new b(13);
    public static final b F = new b(14);
    public static final c G = new c(11);
    public static final b H = new b(15);
    public static final c I = new c(12);

    /* renamed from: J, reason: collision with root package name */
    public static final b f29597J = new b(16);
    public static final c K = new c(13);
    public static final b L = new b(17);

    static {
        int i13 = 0;
        while (true) {
            int[] iArr = f29603f;
            if (i13 >= 1000) {
                M = "-2147483648".getBytes();
                N = "-9223372036854775808".getBytes();
                O = BigDecimal.valueOf(Long.MAX_VALUE);
                P = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
            iArr[i13] = (i13 % 10) + (i13 < 10 ? 33554432 : i13 < 100 ? 16777216 : 0) + (((i13 / 100) + 48) << 16) + ((((i13 / 10) % 10) + 48) << 8) + 48;
            i13++;
        }
    }

    public static void A(int i13, v vVar) {
        byte[] b13 = vVar.b(11);
        int i14 = vVar.f29593a;
        vVar.f29593a += x(b13, i14, i13) - i14;
    }

    public static Number B(char[] cArr, int i13, t tVar) {
        BigDecimal t13 = t(cArr, i13, tVar, false);
        if (t13.scale() == 0 && t13.precision() <= 19) {
            if (t13.signum() == 1) {
                if (t13.compareTo(O) <= 0) {
                    return Long.valueOf(t13.longValue());
                }
            } else if (t13.compareTo(P) >= 0) {
                return Long.valueOf(t13.longValue());
            }
        }
        return b(t13, tVar.f29587t);
    }

    public static void C(byte[] bArr, int i13, int i14) {
        bArr[i14] = (byte) (i13 >> 16);
        bArr[i14 + 1] = (byte) (i13 >> 8);
        bArr[i14 + 2] = (byte) i13;
    }

    public static int D(byte[] bArr, int i13, int i14) {
        int i15 = i13 >> 24;
        if (i15 == 0) {
            int i16 = i14 + 1;
            bArr[i14] = (byte) (i13 >> 16);
            i14 += 2;
            bArr[i16] = (byte) (i13 >> 8);
        } else if (i15 == 1) {
            bArr[i14] = (byte) (i13 >> 8);
            i14++;
        }
        bArr[i14] = (byte) i13;
        return 3 - i15;
    }

    public static double a(double d2, int i13, int i14) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        int i15 = ((int) (doubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(doubleToRawLongBits + (((i13 * f29606i[i14 + 1]) + f29605h[i15]) / f29604g[i15]));
    }

    public static Number b(BigDecimal bigDecimal, s sVar) {
        return sVar == s.LONG_AND_BIGDECIMAL ? bigDecimal : Double.valueOf(bigDecimal.doubleValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b7, code lost:
    
        if (r3 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01bb, code lost:
    
        if (r8 > (r1 + 1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01be, code lost:
    
        l(r22, r1, r2, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c3, code lost:
    
        if (r8 <= r1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c9, code lost:
    
        if (r22.a(r8, r2) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01d1, code lost:
    
        m(r22, r1, r2, "Unknown digit", java.lang.Character.valueOf((char) r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01df, code lost:
    
        if (r3 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e3, code lost:
    
        if (r13 == 46) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e7, code lost:
    
        if (r8 > (r1 + 1)) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ea, code lost:
    
        l(r22, r1, r2, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ef, code lost:
    
        if (r8 != r2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01f9, code lost:
    
        if (r13 != 46) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01fb, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fd, code lost:
    
        if (r8 == r2) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ff, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0200, code lost:
    
        if (r3 >= r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0202, code lost:
    
        r13 = r4[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0204, code lost:
    
        if (r13 == 101) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0208, code lost:
    
        if (r13 != 69) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x020b, code lost:
    
        r5 = r13 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x020d, code lost:
    
        if (r5 < 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0211, code lost:
    
        if (r5 <= 9) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0214, code lost:
    
        r6 = ((r6 << 3) + (r6 << 1)) + r5;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0223, code lost:
    
        if (r22.a(r3, r2) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6, r3 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x022c, code lost:
    
        m(r22, r1, r2, "Unknown digit", java.lang.Character.valueOf((char) r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0235, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0236, code lost:
    
        if (r3 != r2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6, r2 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x023e, code lost:
    
        if (r13 == 101) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0242, code lost:
    
        if (r13 != 69) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6, r2 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x024b, code lost:
    
        r1 = r3 + 1;
        r5 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0251, code lost:
    
        if (r5 != 45) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0253, code lost:
    
        r0 = s(r4, r22, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6, (r3 - r8) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x025a, code lost:
    
        if (r5 != 43) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x025c, code lost:
    
        r0 = u(r4, r22, r1, r2, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0262, code lost:
    
        r0 = u(r4, r22, r1, r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x026e, code lost:
    
        l(r22, r1, r2, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0272, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0273, code lost:
    
        if (r13 == 101) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0277, code lost:
    
        if (r13 != 69) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:?, code lost:
    
        return java.math.BigDecimal.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0280, code lost:
    
        r8 = r8 + 1;
        r3 = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0285, code lost:
    
        if (r3 != 45) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0287, code lost:
    
        r0 = s(r4, r22, r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x029f, code lost:
    
        return java.math.BigDecimal.valueOf(r6, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x028e, code lost:
    
        if (r3 != 43) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0290, code lost:
    
        r0 = u(r4, r22, r8, r2, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0295, code lost:
    
        r0 = u(r4, r22, r8, r2, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.math.BigDecimal c(com.bugsnag.android.repackaged.dslplatform.json.t r22) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.w.c(com.bugsnag.android.repackaged.dslplatform.json.t):java.math.BigDecimal");
    }

    public static double d(t tVar) {
        if (tVar.f29571d == 34) {
            return o(tVar.q(), (tVar.f29569b - tVar.f29569b) - 1, tVar, true);
        }
        int s13 = tVar.s();
        int i13 = tVar.f29569b;
        byte[] bArr = tVar.f29575h;
        return bArr[s13] == 45 ? -n(bArr, tVar, s13, i13, 1) : n(bArr, tVar, s13, i13, 0);
    }

    public static float e(t tVar) {
        if (tVar.f29571d == 34) {
            return q(tVar.q(), (tVar.f29569b - tVar.f29569b) - 1, tVar, true);
        }
        int s13 = tVar.s();
        int i13 = tVar.f29569b;
        if (i13 == tVar.f29572e) {
            l0.k v13 = v(tVar, s13);
            return q((char[]) v13.f81236c, v13.f81235b, tVar, false);
        }
        byte[] bArr = tVar.f29575h;
        return bArr[s13] == 45 ? -p(bArr, tVar, s13, i13, 1) : p(bArr, tVar, s13, i13, 0);
    }

    public static int f(t tVar) {
        int i13;
        byte b13;
        byte b14;
        if (tVar.f29571d == 34) {
            int i14 = tVar.f29569b;
            try {
                return t(tVar.q(), (tVar.f29569b - i14) - 1, tVar, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw tVar.g(tVar.f29569b - i14, "Integer overflow detected");
            }
        }
        int s13 = tVar.s();
        int i15 = tVar.f29569b;
        byte[] bArr = tVar.f29575h;
        byte b15 = bArr[s13];
        if (b15 != 45) {
            if (b15 != 48 || i15 <= (i13 = s13 + 1) || (b13 = bArr[i13]) < 48 || b13 > 57) {
                return u(bArr, tVar, s13, i15, 0);
            }
            l(tVar, s13, i15, "Leading zero is not allowed");
            throw null;
        }
        int i16 = s13 + 2;
        if (i15 <= i16 || bArr[s13 + 1] != 48 || (b14 = bArr[i16]) < 48 || b14 > 57) {
            return s(bArr, tVar, s13, i15);
        }
        l(tVar, s13, i15, "Leading zero is not allowed");
        throw null;
    }

    public static long g(t tVar) {
        if (tVar.f29571d == 34) {
            int i13 = tVar.f29569b;
            try {
                return t(tVar.q(), (tVar.f29569b - i13) - 1, tVar, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw tVar.g(tVar.f29569b - i13, "Long overflow detected");
            }
        }
        int s13 = tVar.s();
        int i14 = tVar.f29569b;
        byte[] bArr = tVar.f29575h;
        byte b13 = bArr[s13];
        char c13 = 3;
        int i15 = 9;
        byte b14 = 48;
        if (b13 != 45) {
            if (s13 == i14) {
                l(tVar, s13, i14, "Digit not found");
                throw null;
            }
            boolean z13 = b13 == 48;
            int i16 = s13;
            long j13 = 0;
            while (i16 < i14) {
                int i17 = bArr[i16] - b14;
                if (i17 < 0 || i17 > 9) {
                    if (!z13 || i16 <= s13 + 1) {
                        return (b13 == 43 && i16 > s13 + 1 && tVar.a(i16, i14)) ? j13 : (b13 == 43 || i16 <= s13 || !tVar.a(i16, i14)) ? r(tVar, s13, i14) : j13;
                    }
                    l(tVar, s13, i14, "Leading zero is not allowed");
                    throw null;
                }
                j13 = (j13 << 3) + (j13 << 1) + i17;
                if (j13 < 0) {
                    l(tVar, s13, i14, "Long overflow detected");
                    throw null;
                }
                i16++;
                b14 = 48;
            }
            if (!z13 || i16 <= s13 + 1) {
                return j13;
            }
            l(tVar, s13, i14, "Leading zero is not allowed");
            throw null;
        }
        int i18 = s13 + 1;
        if (i18 == i14) {
            l(tVar, s13, i14, "Digit not found");
            throw null;
        }
        boolean z14 = bArr[i18] == 48;
        int i19 = i18;
        long j14 = 0;
        while (i19 < i14) {
            int i23 = bArr[i19] - 48;
            if (i23 < 0 || i23 > i15) {
                if (!z14 || i19 <= s13 + 2) {
                    return (i19 <= i18 || !tVar.a(i19, i14)) ? r(tVar, s13, i14) : j14;
                }
                l(tVar, s13, i14, "Leading zero is not allowed");
                throw null;
            }
            j14 = ((j14 << c13) + (j14 << 1)) - i23;
            if (j14 > 0) {
                l(tVar, s13, i14, "Long overflow detected");
                throw null;
            }
            i19++;
            c13 = 3;
            i15 = 9;
        }
        if (!z14 || i19 <= s13 + 2) {
            return j14;
        }
        l(tVar, s13, i14, "Leading zero is not allowed");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x01f9, code lost:
    
        if (r6 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r9 == 46) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0201, code lost:
    
        if (r7 > (r1 + 1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0204, code lost:
    
        l(r23, r1, r3, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0208, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0209, code lost:
    
        if (r7 != r3) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return java.lang.Long.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0213, code lost:
    
        if (r9 != 46) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0215, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0217, code lost:
    
        if (r7 == r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0219, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x021a, code lost:
    
        if (r6 >= r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x021c, code lost:
    
        r9 = r5[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0220, code lost:
    
        if (r9 == 101) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0224, code lost:
    
        if (r9 != 69) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0227, code lost:
    
        r8 = r9 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0229, code lost:
    
        if (r8 < 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x022d, code lost:
    
        if (r8 <= 9) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0230, code lost:
    
        r12 = ((r12 << 3) + (r12 << 1)) + r8;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023f, code lost:
    
        if (r23.a(r6, r3) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        return java.math.BigDecimal.valueOf(r12, r6 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return B(r23.m(r1, r4), r4, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0252, code lost:
    
        if (r6 != r3) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:?, code lost:
    
        return b(java.math.BigDecimal.valueOf(r12, r3 - r7), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0261, code lost:
    
        if (r9 == 101) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0265, code lost:
    
        if (r9 != 69) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
    
        return java.math.BigDecimal.valueOf(r12, r3 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x026e, code lost:
    
        r1 = r6 + 1;
        r4 = r5[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0274, code lost:
    
        if (r4 != 45) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0276, code lost:
    
        r0 = s(r5, r23, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return b(java.math.BigDecimal.valueOf(r12, (r6 - r7) - r0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x027d, code lost:
    
        if (r4 != 43) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x027f, code lost:
    
        r0 = u(r5, r23, r1, r3, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0285, code lost:
    
        r0 = u(r5, r23, r1, r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        l(r23, r1, r3, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0299, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x029c, code lost:
    
        if (r9 == 101) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02a0, code lost:
    
        if (r9 != 69) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return b(java.math.BigDecimal.valueOf(r12), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02ad, code lost:
    
        r7 = r7 + 1;
        r4 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02b2, code lost:
    
        if (r4 != 45) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02b4, code lost:
    
        r0 = s(r5, r23, r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02d0, code lost:
    
        return b(java.math.BigDecimal.valueOf(r12, -r0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02bb, code lost:
    
        if (r4 != 43) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02bd, code lost:
    
        r0 = u(r5, r23, r7, r3, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x02c2, code lost:
    
        r0 = u(r5, r23, r7, r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02d1, code lost:
    
        l(r23, r1, r3, "Digit not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02d5, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Number h(com.bugsnag.android.repackaged.dslplatform.json.t r23) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.w.h(com.bugsnag.android.repackaged.dslplatform.json.t):java.lang.Number");
    }

    public static short i(t tVar) {
        if (tVar.f29571d == 34) {
            int i13 = tVar.f29569b;
            try {
                return t(tVar.q(), (tVar.f29569b - i13) - 1, tVar, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw tVar.g(tVar.f29569b - i13, "Short overflow detected");
            }
        }
        int s13 = tVar.s();
        int i14 = tVar.f29569b;
        byte[] bArr = tVar.f29575h;
        int s14 = bArr[s13] == 45 ? s(bArr, tVar, s13, i14) : u(bArr, tVar, s13, i14, 0);
        if (s14 < -32768 || s14 > 32767) {
            throw tVar.g(tVar.f29569b, "Short overflow detected");
        }
        return (short) s14;
    }

    public static double j(t tVar, long j13, int i13, double d2, byte[] bArr, int i14, int i15, int i16, int i17) {
        double d13;
        double pow;
        int i18;
        int i19;
        o oVar = o.EXACT;
        o oVar2 = tVar.f29585r;
        if (oVar2 == oVar) {
            int i23 = (i15 - i14) - i16;
            return o(tVar.m(i14 + i16, i23), i23, tVar, false);
        }
        int i24 = i17 + 1;
        byte b13 = bArr[i24];
        int s13 = (b13 == 45 ? s(bArr, tVar, i24, i15) : b13 == 43 ? u(bArr, tVar, i24, i15, 1) : u(bArr, tVar, i24, i15, 0)) - i13;
        double[] dArr = f29607j;
        if (d2 == 0.0d) {
            if (s13 == 0 || j13 == 0) {
                return j13;
            }
            if (s13 > 0 && s13 < 65) {
                return j13 * dArr[s13 - 1];
            }
            if (s13 < 0 && (i19 = -s13) < 65) {
                return j13 / dArr[i19 - 1];
            }
            if (oVar2 != o.HIGH) {
                if (s13 > 0 && s13 < 300) {
                    d13 = j13;
                    pow = Math.pow(10.0d, s13);
                    return pow * d13;
                }
                if (s13 > -300 && s13 < 0) {
                    return j13 / Math.pow(10.0d, s13);
                }
            }
            int i25 = (i15 - i14) - i16;
            return o(tVar.m(i14 + i16, i25), i25, tVar, false);
        }
        if (s13 == 0) {
            return j13 + d2;
        }
        if (s13 > 0 && s13 < 65) {
            double d14 = dArr[s13 - 1];
            return (j13 * d14) + (d2 * d14);
        }
        if (s13 < 0 && (i18 = -s13) < 65) {
            double d15 = dArr[i18 - 1];
            return (j13 / d15) + (d2 / d15);
        }
        if (oVar2 != o.HIGH) {
            if (s13 > 0 && s13 < 300) {
                d13 = j13;
                pow = Math.pow(10.0d, s13);
                return pow * d13;
            }
            if (s13 > -300 && s13 < 0) {
                return j13 / Math.pow(10.0d, s13);
            }
        }
        int i252 = (i15 - i14) - i16;
        return o(tVar.m(i14 + i16, i252), i252, tVar, false);
    }

    public static float k(t tVar, long j13, int i13, byte[] bArr, int i14, int i15) {
        int i16;
        byte b13 = bArr[i15];
        int s13 = (b13 == 45 ? s(bArr, tVar, i15, i14) : b13 == 43 ? u(bArr, tVar, i15, i14, 1) : u(bArr, tVar, i15, i14, 0)) - i13;
        if (s13 == 0 || j13 == 0) {
            return j13;
        }
        double[] dArr = f29607j;
        return (s13 <= 0 || s13 >= 65) ? (s13 >= 0 || (i16 = -s13) >= 65) ? s13 > 0 ? Float.POSITIVE_INFINITY : 0.0f : (float) (j13 / dArr[i16 - 1]) : (float) (j13 * dArr[s13 - 1]);
    }

    public static void l(t tVar, int i13, int i14, String str) {
        int i15 = i14 - i13;
        if (i15 <= tVar.f29588u) {
            throw tVar.j("Error parsing number", i15, str, null, ". Error parsing number");
        }
        throw tVar.j("Too many digits detected in number", i15, "Too many digits detected in number", Integer.valueOf(i14), "");
    }

    public static void m(t tVar, int i13, int i14, String str, Object obj) {
        int i15 = i14 - i13;
        if (i15 <= tVar.f29588u) {
            throw tVar.j("Error parsing number", i15, str, obj, ". Error parsing number");
        }
        throw tVar.j("Too many digits detected in number", i15, "Too many digits detected in number", Integer.valueOf(i14), "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0161, code lost:
    
        r9 = r23[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0165, code lost:
    
        if (r9 == 101) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0169, code lost:
    
        if (r9 != 69) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016c, code lost:
    
        r6 = r9 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016e, code lost:
    
        if (r6 < 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0172, code lost:
    
        if (r6 <= 9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0175, code lost:
    
        r3 = ((r3 << 3) + (r3 << 1)) + r6;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0183, code lost:
    
        if (r24.a(r1, r26) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018e, code lost:
    
        return a(r11 / r17, r3, (r1 - r14) - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018f, code lost:
    
        m(r24, r25, r26, "Unknown digit", java.lang.Character.valueOf((char) r23[r1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0199, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019a, code lost:
    
        r5 = a(r11 / r17, r3, (r1 - r14) - r10);
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a5, code lost:
    
        if (r10 >= r26) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a9, code lost:
    
        if (r9 < 48) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ad, code lost:
    
        if (r9 > 57) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01af, code lost:
    
        r9 = r23[r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b7, code lost:
    
        if (r9 == 101) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bb, code lost:
    
        if (r9 != 69) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01be, code lost:
    
        if (r4 <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c5, code lost:
    
        return r5 * r22[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c7, code lost:
    
        if (r4 >= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ce, code lost:
    
        return r5 / r22[(-r4) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01e1, code lost:
    
        return j(r24, 0, r4, r5, r23, r25, r26, r27, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01f6, code lost:
    
        return j(r24, r11, r14 - r3, 0.0d, r23, r25, r26, r27, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0131, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00d3, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00d4, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00d6, code lost:
    
        r13 = r2 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00da, code lost:
    
        if (r23[r2] >= 56) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00dc, code lost:
    
        r4 = (r3 - r13) + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00e1, code lost:
    
        r4 = (r3 - r13) + 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01f7, code lost:
    
        l(r24, r25, r26, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fe, code lost:
    
        if (r14 == 101) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0202, code lost:
    
        if (r14 != 69) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0206, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x021a, code lost:
    
        return j(r24, r11, 0, 0.0d, r23, r25, r26, r27, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r13 > (r2 + 1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        l(r24, r25, r26, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r13 <= r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r24.a(r13, r26) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        m(r24, r25, r26, "Unknown digit", java.lang.Character.valueOf((char) r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r14 == 46) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r13 > (r2 + 1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        l(r24, r25, r26, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        if (r13 != r26) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if (r14 != 46) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        r3 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r3 == r26) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        r17 = 1.0E15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (r11 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        r13 = r13 + 16;
        r14 = r23[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        if (r14 != 48) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        if (r26 <= r13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        return o(r24.m(r2, r1), r1, r24, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        if (r14 >= 56) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        r17 = 1.0E14d;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        if (r13 >= r26) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        r13 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        r21 = r14;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ed, code lost:
    
        r22 = com.bugsnag.android.repackaged.dslplatform.json.w.f29607j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        if (r14 >= r13) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        r9 = r23[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        if (r9 == r15) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f5, code lost:
    
        if (r9 != r6) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        r6 = r9 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        if (r6 < 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        if (r6 <= 9) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
    
        r11 = ((r11 << 3) + (r11 << 1)) + r6;
        r14 = r14 + 1;
        r21 = r9;
        r6 = 69;
        r15 = 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011c, code lost:
    
        if (r24.a(r14, r26) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        return r11 / r22[(r14 - r3) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        m(r24, r25, r26, "Unknown digit", java.lang.Character.valueOf((char) r23[r14]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0133, code lost:
    
        if (r14 != r26) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:
    
        return r11 / r22[(r14 - r3) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013f, code lost:
    
        if (r9 == 101) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0143, code lost:
    
        if (r9 != 69) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014b, code lost:
    
        if (r24.f29585r != com.bugsnag.android.repackaged.dslplatform.json.o.HIGH) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0156, code lost:
    
        return o(r24.m(r2, r1), r1, r24, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0157, code lost:
    
        r3 = 0;
        r2 = r2 + 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015a, code lost:
    
        if (r2 >= r26) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015d, code lost:
    
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015f, code lost:
    
        if (r1 >= r2) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double n(byte[] r23, com.bugsnag.android.repackaged.dslplatform.json.t r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.w.n(byte[], com.bugsnag.android.repackaged.dslplatform.json.t, int, int, int):double");
    }

    public static double o(char[] cArr, int i13, t tVar, boolean z13) {
        int i14;
        char c13;
        int i15 = i13;
        while (i15 > 0 && Character.isWhitespace(cArr[i15 - 1])) {
            i15--;
        }
        if (i15 > tVar.f29588u) {
            throw tVar.j("Too many digits detected in number", i13, "Too many digits detected in number", Integer.valueOf(i15), "");
        }
        int i16 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i16] == '0' && i15 > (i14 = i16 + 1) && (c13 = cArr[i14]) >= '0' && c13 <= '9') {
            throw tVar.g(i13 + (z13 ? 2 : 0), "Leading zero is not allowed. Error parsing number");
        }
        try {
            return Double.parseDouble(new String(cArr, 0, i15));
        } catch (NumberFormatException e13) {
            throw tVar.h("Error parsing number", i13 + (z13 ? 2 : 0), e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x012b, code lost:
    
        if (r12 == 101) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012d, code lost:
    
        if (r12 != 69) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0131, code lost:
    
        if (r2 <= 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x013a, code lost:
    
        return (float) (r10 / r16[r2 - 1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013c, code lost:
    
        if (r2 >= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0145, code lost:
    
        return (float) (r10 * r16[(-r2) - 1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0147, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0152, code lost:
    
        return k(r21, r10, r2 - r13, r4, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010b, code lost:
    
        r2 = r4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ee, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a8, code lost:
    
        r2 = r2 + 17;
        r13 = r4;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0153, code lost:
    
        l(r21, r22, r5, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0159, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x015a, code lost:
    
        if (r12 == 101) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015c, code lost:
    
        if (r12 != 69) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0160, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0170, code lost:
    
        return k(r21, r10, 0, r20, r23, r13 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r3 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r12 == 46) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r13 > (r2 + 1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        l(r21, r22, r5, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if (r13 <= (r2 + 18)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        r1 = (r5 - r22) - r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        return q(r21.m(r2, r1), r1, r21, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r13 != r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if (r12 != 46) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r4 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        if (r4 == r5) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r10 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        r13 = r13 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r4 >= r5) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        if (r20[r4] != 48) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a4, code lost:
    
        r2 = r4 + 17;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ac, code lost:
    
        if (r2 >= r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b0, code lost:
    
        r16 = com.bugsnag.android.repackaged.dslplatform.json.w.f29607j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        if (r4 >= r2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b4, code lost:
    
        r12 = r20[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b6, code lost:
    
        if (r12 == 101) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        if (r12 != 69) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bb, code lost:
    
        r3 = r12 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        if (r3 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        if (r3 <= 9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c2, code lost:
    
        r10 = ((r10 << 3) + (r10 << 1)) + r3;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d5, code lost:
    
        if (r21.a(r4, r5) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00de, code lost:
    
        return (float) (r10 / r16[(r4 - r13) - r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
    
        m(r21, r22, r5, "Unknown digit", java.lang.Character.valueOf((char) r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        r4 = r4 + 1;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f2, code lost:
    
        if (r4 != r2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f4, code lost:
    
        if (r18 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        r2 = (r4 + 1) - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f9, code lost:
    
        if (r4 >= r5) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fd, code lost:
    
        if (r12 < 48) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        if (r12 > 57) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0101, code lost:
    
        r12 = r20[r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0107, code lost:
    
        r7 = r4;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010e, code lost:
    
        if (r7 != r5) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
    
        if (r21.f29572e != r5) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0114, code lost:
    
        r3 = r21.s();
        r5 = r21.f29569b;
        r4 = r21.f29575h;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011f, code lost:
    
        if (r7 >= r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0121, code lost:
    
        if (r12 < 48) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0123, code lost:
    
        if (r12 > 57) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0125, code lost:
    
        r12 = r4[r7];
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float p(byte[] r20, com.bugsnag.android.repackaged.dslplatform.json.t r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.w.p(byte[], com.bugsnag.android.repackaged.dslplatform.json.t, int, int, int):float");
    }

    public static float q(char[] cArr, int i13, t tVar, boolean z13) {
        int i14;
        char c13;
        int i15 = i13;
        while (i15 > 0 && Character.isWhitespace(cArr[i15 - 1])) {
            i15--;
        }
        if (i15 > tVar.f29588u) {
            throw tVar.j("Too many digits detected in number", i13, "Too many digits detected in number", Integer.valueOf(i15), "");
        }
        int i16 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i16] == '0' && i15 > (i14 = i16 + 1) && (c13 = cArr[i14]) >= '0' && c13 <= '9') {
            throw tVar.g(i13 + (z13 ? 2 : 0), "Leading zero is not allowed. Error parsing number");
        }
        try {
            return Float.parseFloat(new String(cArr, 0, i15));
        } catch (NumberFormatException e13) {
            throw tVar.h("Error parsing number", i13 + (z13 ? 2 : 0), e13);
        }
    }

    public static long r(t tVar, int i13, int i14) {
        int i15 = i14 - i13;
        char[] m13 = tVar.m(i13, i15);
        if (i15 > 0 && m13[i15 - 1] == '.') {
            l(tVar, i13, i14, "Number ends with a dot");
            throw null;
        }
        BigDecimal t13 = t(m13, i15, tVar, false);
        if (t13.scale() <= 0) {
            return t13.longValue();
        }
        m(tVar, i13, i14, "Expecting long, but found decimal value ", t13);
        throw null;
    }

    public static int s(byte[] bArr, t tVar, int i13, int i14) {
        int i15 = i13 + 1;
        if (i15 == i14) {
            l(tVar, i13, i14, "Digit not found");
            throw null;
        }
        int i16 = 0;
        for (int i17 = i15; i17 < i14; i17++) {
            int i18 = bArr[i17] - 48;
            if (i18 < 0 || i18 > 9) {
                if (i17 > i15 && tVar.a(i17, i14)) {
                    return i16;
                }
                if (i17 == i14 - 1 && bArr[i17] == 46) {
                    l(tVar, i13, i14, "Number ends with a dot");
                    throw null;
                }
                int i19 = i14 - i13;
                BigDecimal t13 = t(tVar.m(i13, i19), i19, tVar, false);
                if (t13.scale() <= 0) {
                    return t13.intValue();
                }
                m(tVar, i13, i14, "Expecting int but found decimal value", t13);
                throw null;
            }
            i16 = ((i16 << 3) + (i16 << 1)) - i18;
            if (i16 > 0) {
                l(tVar, i13, i14, "Integer overflow detected");
                throw null;
            }
        }
        return i16;
    }

    public static BigDecimal t(char[] cArr, int i13, t tVar, boolean z13) {
        int i14;
        char c13;
        int i15 = i13;
        while (i15 > 0 && Character.isWhitespace(cArr[i15 - 1])) {
            i15--;
        }
        if (i15 > tVar.f29588u) {
            throw tVar.j("Too many digits detected in number", i13, "Too many digits detected in number", Integer.valueOf(i15), "");
        }
        int i16 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i16] == '0' && i15 > (i14 = i16 + 1) && (c13 = cArr[i14]) >= '0' && c13 <= '9') {
            throw tVar.g(i13 + (z13 ? 2 : 0), "Leading zero is not allowed. Error parsing number");
        }
        try {
            return new BigDecimal(cArr, 0, i15);
        } catch (NumberFormatException e13) {
            throw tVar.h("Error parsing number", i13 + (z13 ? 2 : 0), e13);
        }
    }

    public static int u(byte[] bArr, t tVar, int i13, int i14, int i15) {
        int i16 = i15 + i13;
        if (i16 == i14) {
            l(tVar, i13, i14, "Digit not found");
            throw null;
        }
        int i17 = 0;
        for (int i18 = i16; i18 < i14; i18++) {
            int i19 = bArr[i18] - 48;
            if (i19 < 0 || i19 > 9) {
                if (i18 > i16 && tVar.a(i18, i14)) {
                    return i17;
                }
                if (i18 == i14 - 1 && bArr[i18] == 46) {
                    l(tVar, i13, i14, "Number ends with a dot");
                    throw null;
                }
                int i23 = i14 - i13;
                BigDecimal t13 = t(tVar.m(i13, i23), i23, tVar, false);
                if (t13.scale() <= 0) {
                    return t13.intValue();
                }
                m(tVar, i13, i14, "Expecting int but found decimal value", t13);
                throw null;
            }
            i17 = (i17 << 3) + (i17 << 1) + i19;
            if (i17 < 0) {
                l(tVar, i13, i14, "Integer overflow detected");
                throw null;
            }
        }
        return i17;
    }

    public static l0.k v(t tVar, int i13) {
        int i14 = tVar.f29572e - i13;
        char[] m13 = tVar.m(i13, i14);
        while (tVar.f29572e == tVar.f29569b && !tVar.e()) {
            tVar.s();
            int i15 = tVar.f29569b;
            int i16 = i14 + i15;
            int i17 = tVar.f29588u;
            if (i16 > i17) {
                Object[] objArr = {Integer.valueOf(i17)};
                q qVar = q.MINIMAL;
                q qVar2 = tVar.f29584q;
                if (qVar2 == qVar) {
                    throw ParsingException.a("Too many digits detected in number", false);
                }
                StringBuilder sb3 = tVar.f29590w;
                sb3.setLength(0);
                tVar.f29591x.format("Number of digits larger than %d. Unable to read number", objArr);
                if (qVar2 == q.DESCRIPTION_ONLY) {
                    throw ParsingException.a(sb3.toString(), false);
                }
                sb3.append(" ");
                tVar.l(i16, sb3);
                throw ParsingException.a(sb3.toString(), tVar.w());
            }
            char[] cArr = new char[i16];
            System.arraycopy(m13, 0, cArr, 0, i14);
            System.arraycopy(tVar.m(0, i15), 0, cArr, i14, i15);
            i14 = i16;
            m13 = cArr;
        }
        return new l0.k(m13, i14, 7);
    }

    public static int w(long j13, int i13, byte[] bArr) {
        int i14;
        if (j13 < 0) {
            if (j13 == Long.MIN_VALUE) {
                int i15 = 0;
                while (true) {
                    byte[] bArr2 = N;
                    if (i15 >= bArr2.length) {
                        return i13 + bArr2.length;
                    }
                    bArr[i13 + i15] = bArr2[i15];
                    i15++;
                }
            } else {
                j13 = -j13;
                bArr[i13] = 45;
                i13++;
            }
        }
        long j14 = j13 / 1000;
        int[] iArr = f29603f;
        if (j14 == 0) {
            return D(bArr, iArr[(int) j13], i13) + i13;
        }
        int i16 = (int) (j13 - (j14 * 1000));
        long j15 = j14 / 1000;
        if (j15 == 0) {
            int i17 = iArr[i16];
            int D2 = D(bArr, iArr[(int) j14], i13);
            C(bArr, i17, i13 + D2);
            return i13 + 3 + D2;
        }
        int i18 = (int) (j14 - (j15 * 1000));
        long j16 = j15 / 1000;
        if (j16 == 0) {
            int i19 = iArr[i16];
            int i23 = iArr[i18];
            int D3 = D(bArr, iArr[(int) j15], i13) + i13;
            C(bArr, i23, D3);
            C(bArr, i19, D3 + 3);
            return D3 + 6;
        }
        int i24 = (int) (j15 - (j16 * 1000));
        int i25 = (int) (j16 / 1000);
        if (i25 == 0) {
            int i26 = iArr[i16];
            int i27 = iArr[i18];
            int i28 = iArr[i24];
            int D4 = D(bArr, iArr[(int) j16], i13) + i13;
            C(bArr, i28, D4);
            C(bArr, i27, D4 + 3);
            C(bArr, i26, D4 + 6);
            return D4 + 9;
        }
        int i29 = (int) (j16 - (i25 * 1000));
        int i33 = i25 / 1000;
        if (i33 == 0) {
            int i34 = iArr[i16];
            int i35 = iArr[i18];
            int i36 = iArr[i24];
            int i37 = iArr[i29];
            int D5 = D(bArr, iArr[i25], i13) + i13;
            C(bArr, i37, D5);
            C(bArr, i36, D5 + 3);
            C(bArr, i35, D5 + 6);
            C(bArr, i34, D5 + 9);
            return D5 + 12;
        }
        int i38 = i33 / 1000;
        int i39 = iArr[i16];
        int i43 = iArr[i18];
        int i44 = iArr[i24];
        int i45 = iArr[i29];
        int i46 = iArr[i25 - (i33 * 1000)];
        if (i38 == 0) {
            i14 = D(bArr, iArr[i33], i13) + i13;
        } else {
            bArr[i13] = (byte) (i38 + 48);
            C(bArr, iArr[i33 - (i38 * 1000)], i13 + 1);
            i14 = i13 + 4;
        }
        C(bArr, i46, i14);
        C(bArr, i45, i14 + 3);
        C(bArr, i44, i14 + 6);
        C(bArr, i43, i14 + 9);
        C(bArr, i39, i14 + 12);
        return i14 + 15;
    }

    public static int x(byte[] bArr, int i13, int i14) {
        int i15;
        if (i14 < 0) {
            if (i14 == Integer.MIN_VALUE) {
                int i16 = 0;
                while (true) {
                    byte[] bArr2 = M;
                    if (i16 >= bArr2.length) {
                        return i13 + bArr2.length;
                    }
                    bArr[i13 + i16] = bArr2[i16];
                    i16++;
                }
            } else {
                i14 = -i14;
                bArr[i13] = 45;
                i13++;
            }
        }
        int i17 = i14 / 1000;
        int[] iArr = f29603f;
        if (i17 == 0) {
            return D(bArr, iArr[i14], i13) + i13;
        }
        int i18 = i14 - (i17 * 1000);
        int i19 = i17 / 1000;
        if (i19 == 0) {
            int i23 = iArr[i18];
            int D2 = D(bArr, iArr[i17], i13);
            C(bArr, i23, i13 + D2);
            return i13 + 3 + D2;
        }
        int i24 = i19 / 1000;
        int i25 = iArr[i18];
        int i26 = iArr[i17 - (i19 * 1000)];
        if (i24 == 0) {
            i15 = D(bArr, iArr[i19], i13) + i13;
        } else {
            bArr[i13] = (byte) (i24 + 48);
            C(bArr, iArr[i19 - (i24 * 1000)], i13 + 1);
            i15 = i13 + 4;
        }
        C(bArr, i26, i15);
        C(bArr, i25, i15 + 3);
        return i15 + 6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(double r38, com.bugsnag.android.repackaged.dslplatform.json.v r40) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.w.y(double, com.bugsnag.android.repackaged.dslplatform.json.v):void");
    }

    public static void z(float f13, v vVar) {
        if (f13 == Float.POSITIVE_INFINITY) {
            vVar.c("\"Infinity\"");
            return;
        }
        if (f13 == Float.NEGATIVE_INFINITY) {
            vVar.c("\"-Infinity\"");
        } else if (f13 != f13) {
            vVar.c("\"NaN\"");
        } else {
            vVar.c(Float.toString(f13));
        }
    }
}
