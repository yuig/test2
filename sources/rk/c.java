package rk;

import kh2.n3;

/* loaded from: classes3.dex */
public abstract class c {
    static {
        Math.log(2.0d);
    }

    public static boolean a(double d2) {
        return Math.copySign(d2 - 1.0d, 1.0d) <= 0.001d || d2 == 1.0d || (Double.isNaN(d2) && Double.isNaN(1.0d));
    }

    public static boolean b(double d2) {
        return n3.t0(d2) && (d2 == 0.0d || 52 - Long.numberOfTrailingZeros(n3.B(d2)) <= Math.getExponent(d2));
    }

    public static boolean c(double d2) {
        if (d2 <= 0.0d || !n3.t0(d2)) {
            return false;
        }
        long B = n3.B(d2);
        return (B & (B - 1)) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = kh2.n3.t0(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            bf.b.j(r3, r0)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L70
            int[] r3 = rk.b.f108435a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L68;
                case 2: goto L6f;
                case 3: goto L5e;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r1 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r1
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L6f
            goto L65
        L4c:
            if (r0 < 0) goto L4f
            r1 = r2
        L4f:
            boolean r5 = c(r5)
        L53:
            r5 = r5 ^ r2
            r5 = r5 & r1
            goto L63
        L56:
            if (r0 >= 0) goto L59
            r1 = r2
        L59:
            boolean r5 = c(r5)
            goto L53
        L5e:
            boolean r5 = c(r5)
            r5 = r5 ^ r2
        L63:
            if (r5 == 0) goto L6f
        L65:
            int r0 = r0 + 1
            goto L6f
        L68:
            boolean r5 = c(r5)
            kotlin.jvm.internal.r.n(r5)
        L6f:
            return r0
        L70:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = d(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.c.d(double, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long e(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = kh2.n3.t0(r8)
            if (r0 == 0) goto Lb5
            int[] r0 = rk.b.f108435a
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            r4 = 0
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L77;
                case 2: goto L69;
                case 3: goto L5a;
                case 4: goto L2c;
                case 5: goto L47;
                case 6: goto L42;
                case 7: goto L2e;
                case 8: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1e:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L7f
        L2c:
            r2 = r8
            goto L7f
        L2e:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L7f
            double r2 = java.lang.Math.copySign(r6, r8)
            double r2 = r2 + r8
            goto L7f
        L42:
            double r2 = java.lang.Math.rint(r8)
            goto L7f
        L47:
            boolean r0 = b(r8)
            if (r0 == 0) goto L4e
            goto L2c
        L4e:
            long r2 = (long) r8
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L55
            r0 = r1
            goto L56
        L55:
            r0 = -1
        L56:
            long r4 = (long) r0
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L7f
        L5a:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2c
            boolean r0 = b(r8)
            if (r0 == 0) goto L65
            goto L2c
        L65:
            long r4 = (long) r8
            long r4 = r4 + r2
        L67:
            double r2 = (double) r4
            goto L7f
        L69:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2c
            boolean r0 = b(r8)
            if (r0 == 0) goto L74
            goto L2c
        L74:
            long r4 = (long) r8
            long r4 = r4 - r2
            goto L67
        L77:
            boolean r0 = b(r8)
            kotlin.jvm.internal.r.n(r0)
            goto L2c
        L7f:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L8b
            r0 = r1
            goto L8c
        L8b:
            r0 = r4
        L8c:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L93
            goto L94
        L93:
            r1 = r4
        L94:
            r0 = r0 & r1
            if (r0 == 0) goto L99
            long r8 = (long) r2
            return r8
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " and rounding mode "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb5:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.c.e(double, java.math.RoundingMode):long");
    }
}
