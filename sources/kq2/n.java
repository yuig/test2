package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class n extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80731f = m.f80729i;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f80732g = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: e, reason: collision with root package name */
    public int[] f80733e;

    public n(int[] iArr) {
        super(2);
        this.f80733e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[7];
        if (kh2.w.p(this.f80733e, ((n) dVar).f80733e, iArr) != 0 || (iArr[6] == -1 && kh2.w.T(iArr, b.f80688p))) {
            j1.C(7, 6803, iArr);
        }
        return new n(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[7];
        if (j1.n0(7, this.f80733e, iArr) != 0 || (iArr[6] == -1 && kh2.w.T(iArr, b.f80688p))) {
            j1.C(7, 6803, iArr);
        }
        return new n(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[7];
        jk.v.Z(b.f80688p, ((n) dVar).f80733e, iArr);
        b.K(iArr, this.f80733e, iArr);
        return new n(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return kh2.w.z(this.f80733e, ((n) obj).f80733e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80731f.bitLength();
    }

    public final int hashCode() {
        return f80731f.hashCode() ^ kotlin.jvm.internal.r.v(7, this.f80733e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[7];
        jk.v.Z(b.f80688p, this.f80733e, iArr);
        return new n(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.w.j0(this.f80733e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.w.l0(this.f80733e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[7];
        b.K(this.f80733e, ((n) dVar).f80733e, iArr);
        return new n(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f80733e;
        if (kh2.w.l0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            kh2.w.z0(b.f80688p, iArr2, iArr);
        }
        return new n(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80733e;
        if (kh2.w.l0(iArr) || kh2.w.j0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        b.C0(iArr, iArr2);
        b.K(iArr2, iArr, iArr2);
        b.C0(iArr2, iArr2);
        b.K(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        b.C0(iArr2, iArr3);
        b.K(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        b.Q0(4, iArr3, iArr4);
        b.K(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        b.Q0(3, iArr4, iArr5);
        b.K(iArr5, iArr2, iArr5);
        b.Q0(8, iArr5, iArr5);
        b.K(iArr5, iArr4, iArr5);
        b.Q0(4, iArr5, iArr4);
        b.K(iArr4, iArr3, iArr4);
        b.Q0(19, iArr4, iArr3);
        b.K(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        b.Q0(42, iArr3, iArr6);
        b.K(iArr6, iArr3, iArr6);
        b.Q0(23, iArr6, iArr3);
        b.K(iArr3, iArr4, iArr3);
        b.Q0(84, iArr3, iArr4);
        b.K(iArr4, iArr6, iArr4);
        b.Q0(20, iArr4, iArr4);
        b.K(iArr4, iArr5, iArr4);
        b.Q0(3, iArr4, iArr4);
        b.K(iArr4, iArr, iArr4);
        b.Q0(2, iArr4, iArr4);
        b.K(iArr4, iArr, iArr4);
        b.Q0(4, iArr4, iArr4);
        b.K(iArr4, iArr2, iArr4);
        b.C0(iArr4, iArr4);
        b.C0(iArr4, iArr6);
        if (kh2.w.z(iArr, iArr6)) {
            return new n(iArr4);
        }
        b.K(iArr4, f80732g, iArr4);
        b.C0(iArr4, iArr6);
        if (kh2.w.z(iArr, iArr6)) {
            return new n(iArr4);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[7];
        b.C0(this.f80733e, iArr);
        return new n(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[7];
        b.a1(this.f80733e, ((n) dVar).f80733e, iArr);
        return new n(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return kh2.w.D(this.f80733e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.w.A0(this.f80733e);
    }
}
