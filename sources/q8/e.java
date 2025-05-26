package q8;

import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f102900a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void a(int i13, d7.d0 d0Var) {
        d0Var.H(7);
        byte[] bArr = d0Var.f53806a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i13 >> 16) & 255);
        bArr[5] = (byte) ((i13 >> 8) & 255);
        bArr[6] = (byte) (i13 & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q8.d b(d7.c0 r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = q8.e.f102900a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            q8.d r1 = new q8.d
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.e.b(d7.c0):q8.d");
    }

    public static void c(d7.c0 c0Var, o7.m mVar) {
        int g13 = c0Var.g(5);
        c0Var.o(2);
        if (c0Var.f()) {
            c0Var.o(5);
        }
        if (g13 >= 7 && g13 <= 10) {
            c0Var.n();
        }
        if (c0Var.f()) {
            int g14 = c0Var.g(3);
            if (mVar.f93145b == -1 && g13 >= 0 && g13 <= 15 && (g14 == 0 || g14 == 1)) {
                mVar.f93145b = g13;
            }
            if (c0Var.f()) {
                e(c0Var);
            }
        }
    }

    public static void d(d7.c0 c0Var, o7.m mVar) {
        c0Var.o(2);
        boolean f13 = c0Var.f();
        int g13 = c0Var.g(8);
        for (int i13 = 0; i13 < g13; i13++) {
            c0Var.o(2);
            if (c0Var.f()) {
                c0Var.o(5);
            }
            if (f13) {
                c0Var.o(24);
            } else {
                if (c0Var.f()) {
                    if (!c0Var.f()) {
                        c0Var.o(4);
                    }
                    mVar.f93146c = c0Var.g(6) + 1;
                }
                c0Var.o(4);
            }
        }
        if (c0Var.f()) {
            c0Var.o(3);
            if (c0Var.f()) {
                e(c0Var);
            }
        }
    }

    public static void e(d7.c0 c0Var) {
        int g13 = c0Var.g(6);
        if (g13 < 2 || g13 > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g13)));
        }
        c0Var.o(g13 * 8);
    }
}
