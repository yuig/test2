package jq2;

import he2.k;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f77522a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f77523b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (k.b(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && k.o(iArr3, f77522a))) {
            b(iArr3);
        }
    }

    public static void b(int[] iArr) {
        long j13 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            long j15 = j14 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j15;
            j14 = j15 >> 32;
        }
        long j16 = ((iArr[2] & 4294967295L) - 1) + j14;
        iArr[2] = (int) j16;
        long j17 = (iArr[3] & 4294967295L) + 1 + (j16 >> 32);
        iArr[3] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j19;
            long j23 = (j19 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j23;
            long j24 = (j23 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j24;
            j18 = j24 >> 32;
        }
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + j18);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        k.t(iArr, iArr2, iArr4);
        d(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2) {
        long j13 = iArr[8] & 4294967295L;
        long j14 = iArr[9] & 4294967295L;
        long j15 = iArr[10] & 4294967295L;
        long j16 = iArr[11] & 4294967295L;
        long j17 = iArr[12] & 4294967295L;
        long j18 = iArr[13] & 4294967295L;
        long j19 = iArr[14] & 4294967295L;
        long j23 = iArr[15] & 4294967295L;
        long j24 = j15 + j16;
        long j25 = j18 + j19;
        long j26 = j25 + (j23 << 1);
        long j27 = j13 + j14 + j25;
        long j28 = j24 + j17 + j23 + j27;
        long j29 = (iArr[0] & 4294967295L) + j28 + j18 + j19 + j23;
        iArr2[0] = (int) j29;
        long j33 = (((iArr[1] & 4294967295L) + j28) - j13) + j19 + j23 + (j29 >> 32);
        iArr2[1] = (int) j33;
        long j34 = ((iArr[2] & 4294967295L) - j27) + (j33 >> 32);
        iArr2[2] = (int) j34;
        long j35 = ((((iArr[3] & 4294967295L) + j28) - j14) - j15) + j18 + (j34 >> 32);
        iArr2[3] = (int) j35;
        long j36 = ((((iArr[4] & 4294967295L) + j28) - j24) - j13) + j19 + (j35 >> 32);
        iArr2[4] = (int) j36;
        long j37 = (iArr[5] & 4294967295L) + j26 + j15 + (j36 >> 32);
        iArr2[5] = (int) j37;
        long j38 = (iArr[6] & 4294967295L) + j16 + j19 + j23 + (j37 >> 32);
        iArr2[6] = (int) j38;
        long j39 = (4294967295L & iArr[7]) + j28 + j26 + j17 + (j38 >> 32);
        iArr2[7] = (int) j39;
        e(iArr2, (int) (j39 >> 32));
    }

    public static void e(int[] iArr, int i13) {
        long j13;
        if (i13 != 0) {
            long j14 = i13 & 4294967295L;
            long j15 = (iArr[0] & 4294967295L) + j14;
            iArr[0] = (int) j15;
            long j16 = j15 >> 32;
            if (j16 != 0) {
                long j17 = j16 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j17;
                j16 = j17 >> 32;
            }
            long j18 = ((iArr[2] & 4294967295L) - j14) + j16;
            iArr[2] = (int) j18;
            long j19 = (iArr[3] & 4294967295L) + j14 + (j18 >> 32);
            iArr[3] = (int) j19;
            long j23 = j19 >> 32;
            if (j23 != 0) {
                long j24 = j23 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j24;
                long j25 = (j24 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j25;
                long j26 = (j25 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j26;
                j23 = j26 >> 32;
            }
            long j27 = (4294967295L & iArr[7]) + j14 + j23;
            iArr[7] = (int) j27;
            j13 = j27 >> 32;
        } else {
            j13 = 0;
        }
        if (j13 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && k.o(iArr, f77522a))) {
            b(iArr);
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        k.y(iArr, iArr3);
        d(iArr3, iArr2);
    }

    public static void g(int i13, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        k.y(iArr, iArr3);
        d(iArr3, iArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            k.y(iArr2, iArr3);
            d(iArr3, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (k.z(iArr, iArr2, iArr3) != 0) {
            long j13 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = (iArr3[2] & 4294967295L) + 1 + j14;
            iArr3[2] = (int) j16;
            long j17 = ((iArr3[3] & 4294967295L) - 1) + (j16 >> 32);
            iArr3[3] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j19;
                long j23 = (j19 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j23;
                long j24 = (j23 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j24;
                j18 = j24 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + j18);
        }
    }
}
