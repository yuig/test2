package gi;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f65143a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f65144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65148f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f65149g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65150h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z0(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4d
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            if (r7 == 0) goto L39
            r7 = r1[r5]
            if (r7 != r2) goto L1c
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 == 0) goto L25
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L25:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Duplicate character: %s"
            java.lang.String r10 = kh2.g0.t0(r0, r10)
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Non-ASCII character: %s"
            java.lang.String r10 = kh2.g0.t0(r0, r10)
            r9.<init>(r10)
            throw r9
        L4d:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.z0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f65150h == z0Var.f65150h && Arrays.equals(this.f65144b, z0Var.f65144b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f65144b) + (true != this.f65150h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f65143a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z0(java.lang.String r4, char[] r5, byte[] r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            r3.f65143a = r4
            r5.getClass()
            r3.f65144b = r5
            int r4 = r5.length     // Catch: java.lang.ArithmeticException -> L73
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L73
            if (r4 <= 0) goto L7d
            int[] r1 = gi.d1.f65058a     // Catch: java.lang.ArithmeticException -> L73
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L73
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L73
            switch(r0) {
                case 1: goto L38;
                case 2: goto L3d;
                case 3: goto L3d;
                case 4: goto L2f;
                case 5: goto L2f;
                case 6: goto L20;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L1a;
            }     // Catch: java.lang.ArithmeticException -> L73
        L1a:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L73
            r4.<init>()     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L20:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r1 = r1 >>> r0
            int r0 = 31 - r0
            int r1 = r1 - r4
            int r1 = r1 >>> 31
            int r0 = r0 + r1
            goto L43
        L2f:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 32 - r0
            goto L43
        L38:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 != 0) goto L75
        L3d:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 31 - r0
        L43:
            r3.f65146d = r0     // Catch: java.lang.ArithmeticException -> L73
            int r5 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r1 = 3 - r5
            r2 = 1
            int r1 = r2 << r1
            r3.f65147e = r1
            int r5 = r0 >> r5
            r3.f65148f = r5
            int r4 = r4 + (-1)
            r3.f65145c = r4
            r3.f65149g = r6
            boolean[] r4 = new boolean[r1]
            r5 = 0
        L5d:
            int r6 = r3.f65148f
            if (r5 >= r6) goto L70
            int r6 = r5 * 8
            int r0 = r3.f65146d
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r6 = kh2.k3.d2(r6, r0, r1)
            r4[r6] = r2
            int r5 = r5 + 1
            goto L5d
        L70:
            r3.f65150h = r7
            return
        L73:
            r4 = move-exception
            goto L85
        L75:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "x (0) must be > 0"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L85:
            int r5 = r5.length
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Illegal alphabet length "
            java.lang.String r5 = a.a.d(r7, r5)
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.z0.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
