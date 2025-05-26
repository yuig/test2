package iq2;

import he2.k;
import kh2.j1;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f73438a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f73439b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        k.t(iArr, iArr2, iArr4);
        b(iArr4, iArr3);
    }

    public static void b(int[] iArr, int[] iArr2) {
        int i13 = iArr[7];
        int i14 = i13;
        int i15 = 0;
        while (i15 < 8) {
            int i16 = iArr[8 + i15];
            iArr2[i15] = (i14 >>> 31) | (i16 << 1);
            i15++;
            i14 = i16;
        }
        long j13 = 19 & 4294967295L;
        long j14 = ((iArr2[0] & 4294967295L) * j13) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j14;
        long j15 = ((iArr2[1] & 4294967295L) * j13) + (iArr[1] & 4294967295L) + (j14 >>> 32);
        iArr2[1] = (int) j15;
        long j16 = ((iArr2[2] & 4294967295L) * j13) + (iArr[2] & 4294967295L) + (j15 >>> 32);
        iArr2[2] = (int) j16;
        long j17 = ((iArr2[3] & 4294967295L) * j13) + (iArr[3] & 4294967295L) + (j16 >>> 32);
        iArr2[3] = (int) j17;
        long j18 = ((iArr2[4] & 4294967295L) * j13) + (iArr[4] & 4294967295L) + (j17 >>> 32);
        iArr2[4] = (int) j18;
        long j19 = ((iArr2[5] & 4294967295L) * j13) + (iArr[5] & 4294967295L) + (j18 >>> 32);
        iArr2[5] = (int) j19;
        long j23 = ((iArr2[6] & 4294967295L) * j13) + (iArr[6] & 4294967295L) + (j19 >>> 32);
        iArr2[6] = (int) j23;
        long j24 = (j13 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j23 >>> 32);
        int i17 = (int) j24;
        iArr2[7] = i17;
        iArr2[7] = (i17 & Integer.MAX_VALUE) + j1.M(7, ((((int) (j24 >>> 32)) << 1) + ((i17 >>> 31) - (i13 >>> 31))) * 19, iArr2);
        if (k.o(iArr2, f73438a)) {
            f(iArr2);
        }
    }

    public static void c(int[] iArr, int i13) {
        int i14 = iArr[7];
        iArr[7] = j1.M(7, ((i13 << 1) | (i14 >>> 31)) * 19, iArr) + (i14 & Integer.MAX_VALUE);
        if (k.o(iArr, f73438a)) {
            f(iArr);
        }
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        k.y(iArr, iArr3);
        b(iArr3, iArr2);
    }

    public static void e(int i13, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        k.y(iArr, iArr3);
        b(iArr3, iArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            k.y(iArr2, iArr3);
            b(iArr3, iArr2);
        }
    }

    public static void f(int[] iArr) {
        long j13 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j13;
        long j14 = j13 >> 32;
        if (j14 != 0) {
            j14 = j1.p0(7, 1, iArr);
        }
        iArr[7] = (int) (((iArr[7] & 4294967295L) - 2147483648L) + j14);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (k.z(iArr, iArr2, iArr3) != 0) {
            long j13 = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                j14 = j1.X(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & iArr3[7]) + 2147483648L + j14);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        j1.r1(8, 0, iArr, iArr2);
        if (k.o(iArr2, f73438a)) {
            f(iArr2);
        }
    }
}
