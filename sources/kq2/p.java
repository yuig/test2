package kq2;

import java.math.BigInteger;
import java.util.Random;
import kh2.j1;

/* loaded from: classes4.dex */
public final class p extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80736f = o.f80734i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80737e;

    public p(int[] iArr) {
        super(2);
        this.f80737e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[7];
        b.c(this.f80737e, ((p) dVar).f80737e, iArr);
        return new p(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[7];
        if (j1.n0(7, this.f80737e, iArr) != 0 || (iArr[6] == -1 && kh2.w.T(iArr, b.f80691s))) {
            b.k(iArr);
        }
        return new p(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[7];
        jk.v.Z(b.f80691s, ((p) dVar).f80737e, iArr);
        b.L(iArr, this.f80737e, iArr);
        return new p(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return kh2.w.z(this.f80737e, ((p) obj).f80737e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80736f.bitLength();
    }

    public final int hashCode() {
        return f80736f.hashCode() ^ kotlin.jvm.internal.r.v(7, this.f80737e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[7];
        jk.v.Z(b.f80691s, this.f80737e, iArr);
        return new p(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.w.j0(this.f80737e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.w.l0(this.f80737e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[7];
        b.L(this.f80737e, ((p) dVar).f80737e, iArr);
        return new p(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f80737e;
        if (kh2.w.l0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            kh2.w.z0(b.f80691s, iArr2, iArr);
        }
        return new p(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = this.f80737e;
        if (kh2.w.l0(iArr3) || kh2.w.j0(iArr3)) {
            return this;
        }
        int[] iArr4 = new int[7];
        boolean l03 = kh2.w.l0(iArr3);
        char c13 = 0;
        int[] iArr5 = b.f80691s;
        int i13 = 1;
        if (l03) {
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr4[2] = 0;
            iArr4[3] = 0;
            iArr4[4] = 0;
            iArr4[5] = 0;
            iArr4[6] = 0;
        } else {
            kh2.w.z0(iArr5, iArr3, iArr4);
        }
        Random random = new Random();
        int[] iArr6 = new int[7];
        int i14 = iArr5[6];
        int i15 = i14 | (i14 >>> 1);
        int i16 = i15 | (i15 >>> 2);
        int i17 = i16 | (i16 >>> 4);
        int i18 = i17 | (i17 >>> 8);
        int i19 = i18 | (i18 >>> 16);
        do {
            for (int i23 = 0; i23 != 7; i23++) {
                iArr6[i23] = random.nextInt();
            }
            iArr6[6] = iArr6[6] & i19;
        } while (j1.j0(7, iArr6, iArr5));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        kh2.w.u(iArr3, iArr8);
        for (int i24 = 0; i24 < 7; i24++) {
            kh2.w.u(iArr8, iArr9);
            int i25 = 1 << i24;
            int[] iArr10 = new int[14];
            kh2.w.x0(iArr8, iArr10);
            b.e0(iArr10, iArr8);
            while (true) {
                i25--;
                if (i25 > 0) {
                    kh2.w.x0(iArr8, iArr10);
                    b.e0(iArr10, iArr8);
                }
            }
            b.L(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        kh2.w.x0(iArr8, iArr11);
        b.e0(iArr11, iArr8);
        int i26 = 95;
        while (true) {
            i26--;
            if (i26 <= 0) {
                break;
            }
            kh2.w.x0(iArr8, iArr11);
            b.e0(iArr11, iArr8);
        }
        if (!kh2.w.j0(iArr8)) {
            return null;
        }
        loop5: while (true) {
            int[] iArr12 = new int[7];
            kh2.w.u(iArr6, iArr12);
            int[] iArr13 = new int[7];
            iArr13[c13] = i13;
            int[] iArr14 = new int[7];
            kh2.w.u(iArr4, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            int i27 = 0;
            while (i27 < 7) {
                kh2.w.u(iArr12, iArr15);
                kh2.w.u(iArr13, iArr16);
                int i28 = i13 << i27;
                while (true) {
                    i28--;
                    if (i28 >= 0) {
                        b.L(iArr13, iArr12, iArr13);
                        b.g1(iArr13, iArr13);
                        b.D0(iArr12, iArr7);
                        b.c(iArr14, iArr7, iArr12);
                        b.L(iArr14, iArr7, iArr14);
                        b.p0(iArr14, j1.s1(7, iArr14));
                    }
                }
                b.L(iArr13, iArr16, iArr7);
                b.L(iArr7, iArr4, iArr7);
                b.L(iArr12, iArr15, iArr14);
                b.c(iArr14, iArr7, iArr14);
                b.L(iArr12, iArr16, iArr7);
                kh2.w.u(iArr14, iArr12);
                b.L(iArr13, iArr15, iArr13);
                b.c(iArr13, iArr7, iArr13);
                b.D0(iArr13, iArr14);
                b.L(iArr14, iArr4, iArr14);
                i27++;
                i13 = 1;
            }
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i29 = 1; i29 < 96; i29++) {
                kh2.w.u(iArr12, iArr);
                kh2.w.u(iArr13, iArr2);
                b.L(iArr13, iArr12, iArr13);
                b.g1(iArr13, iArr13);
                b.D0(iArr12, iArr7);
                b.c(iArr14, iArr7, iArr12);
                b.L(iArr14, iArr7, iArr14);
                b.p0(iArr14, j1.s1(7, iArr14));
                if (kh2.w.l0(iArr12)) {
                    break loop5;
                }
            }
            if (j1.n0(7, iArr6, iArr6) != 0 || (iArr6[6] == -1 && kh2.w.T(iArr6, iArr5))) {
                b.k(iArr6);
            }
            c13 = 0;
            i13 = 1;
        }
        jk.v.Z(iArr5, iArr2, iArr7);
        b.L(iArr7, iArr, iArr7);
        b.D0(iArr7, iArr6);
        if (kh2.w.z(iArr3, iArr6)) {
            return new p(iArr7);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[7];
        b.D0(this.f80737e, iArr);
        return new p(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[7];
        b.b1(this.f80737e, ((p) dVar).f80737e, iArr);
        return new p(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return kh2.w.D(this.f80737e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.w.A0(this.f80737e);
    }
}
