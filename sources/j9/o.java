package j9;

import d7.d0;
import q8.i0;
import q8.t;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f75054a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i13, boolean z13) {
        if ((i13 >>> 8) == 3368816) {
            return true;
        }
        if (i13 == 1751476579 && z13) {
            return true;
        }
        int[] iArr = f75054a;
        for (int i14 = 0; i14 < 29; i14++) {
            if (iArr[i14] == i13) {
                return true;
            }
        }
        return false;
    }

    public static i0 b(t tVar) {
        return c(tVar, true, false);
    }

    public static i0 c(t tVar, boolean z13, boolean z14) {
        int i13;
        int i14;
        int i15;
        boolean z15;
        int[] iArr;
        long length = tVar.getLength();
        long j13 = -1;
        long j14 = 4096;
        if (length != -1 && length <= 4096) {
            j14 = length;
        }
        int i16 = (int) j14;
        d0 d0Var = new d0(64);
        int i17 = 0;
        int i18 = 0;
        boolean z16 = false;
        while (i18 < i16) {
            d0Var.H(8);
            if (!tVar.c(d0Var.f53806a, i17, 8, true)) {
                break;
            }
            long A = d0Var.A();
            int k13 = d0Var.k();
            if (A == 1) {
                tVar.s(d0Var.f53806a, 8, 8);
                i14 = 16;
                d0Var.J(16);
                A = d0Var.s();
            } else {
                if (A == 0) {
                    long length2 = tVar.getLength();
                    if (length2 != j13) {
                        A = (length2 - tVar.k()) + 8;
                    }
                }
                i14 = 8;
            }
            long j15 = A;
            long j16 = i14;
            if (j15 < j16) {
                return new a(k13, j15, i14);
            }
            i18 += i14;
            if (k13 == 1836019574) {
                i16 += (int) j15;
                if (length != -1 && i16 > length) {
                    i16 = (int) length;
                }
            } else {
                if (k13 == 1836019558 || k13 == 1836475768) {
                    i13 = 1;
                    break;
                }
                long j17 = length;
                if (k13 == 1835295092) {
                    z16 = true;
                }
                if ((i18 + j15) - j16 >= i16) {
                    i13 = 0;
                    break;
                }
                int i19 = (int) (j15 - j16);
                i18 += i19;
                if (k13 != 1718909296) {
                    i15 = 0;
                    if (i19 != 0) {
                        tVar.m(i19);
                    }
                } else {
                    if (i19 < 8) {
                        return new a(k13, i19, 8);
                    }
                    d0Var.H(i19);
                    i15 = 0;
                    tVar.s(d0Var.f53806a, 0, i19);
                    int k14 = d0Var.k();
                    if (a(k14, z14)) {
                        z16 = true;
                    }
                    d0Var.L(4);
                    int a13 = d0Var.a() / 4;
                    if (!z16 && a13 > 0) {
                        iArr = new int[a13];
                        int i23 = 0;
                        while (true) {
                            if (i23 >= a13) {
                                z15 = z16;
                                break;
                            }
                            int k15 = d0Var.k();
                            iArr[i23] = k15;
                            if (a(k15, z14)) {
                                z15 = true;
                                break;
                            }
                            i23++;
                        }
                    } else {
                        z15 = z16;
                        iArr = null;
                    }
                    if (!z15) {
                        return new l0.k(iArr, k14);
                    }
                    z16 = z15;
                }
                i17 = i15;
                length = j17;
            }
            j13 = -1;
        }
        i13 = i17;
        if (!z16) {
            return j.f75015c;
        }
        if (z13 != i13) {
            return i13 != 0 ? j.f75013a : j.f75014b;
        }
        return null;
    }
}
