package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class r extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80740f = q.f80738i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80741e;

    public r(int[] iArr) {
        super(2);
        this.f80741e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[8];
        if (he2.k.b(this.f80741e, ((r) dVar).f80741e, iArr) != 0 || (iArr[7] == -1 && he2.k.o(iArr, b.f80694v))) {
            j1.C(8, 977, iArr);
        }
        return new r(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[8];
        if (j1.n0(8, this.f80741e, iArr) != 0 || (iArr[7] == -1 && he2.k.o(iArr, b.f80694v))) {
            j1.C(8, 977, iArr);
        }
        return new r(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[8];
        jk.v.Z(b.f80694v, ((r) dVar).f80741e, iArr);
        b.M(iArr, this.f80741e, iArr);
        return new r(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return he2.k.g(this.f80741e, ((r) obj).f80741e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80740f.bitLength();
    }

    public final int hashCode() {
        return f80740f.hashCode() ^ kotlin.jvm.internal.r.v(8, this.f80741e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[8];
        jk.v.Z(b.f80694v, this.f80741e, iArr);
        return new r(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return he2.k.p(this.f80741e);
    }

    @Override // o6.d
    public final boolean m() {
        return he2.k.r(this.f80741e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[8];
        b.M(this.f80741e, ((r) dVar).f80741e, iArr);
        return new r(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f80741e;
        if (he2.k.r(iArr2)) {
            he2.k.J(iArr);
        } else {
            he2.k.z(b.f80694v, iArr2, iArr);
        }
        return new r(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80741e;
        if (he2.k.r(iArr) || he2.k.p(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        b.E0(iArr, iArr2);
        b.M(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        b.E0(iArr2, iArr3);
        b.M(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        b.R0(3, iArr3, iArr4);
        b.M(iArr4, iArr3, iArr4);
        b.R0(3, iArr4, iArr4);
        b.M(iArr4, iArr3, iArr4);
        b.R0(2, iArr4, iArr4);
        b.M(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        b.R0(11, iArr4, iArr5);
        b.M(iArr5, iArr4, iArr5);
        b.R0(22, iArr5, iArr4);
        b.M(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        b.R0(44, iArr4, iArr6);
        b.M(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        b.R0(88, iArr6, iArr7);
        b.M(iArr7, iArr6, iArr7);
        b.R0(44, iArr7, iArr6);
        b.M(iArr6, iArr4, iArr6);
        b.R0(3, iArr6, iArr4);
        b.M(iArr4, iArr3, iArr4);
        b.R0(23, iArr4, iArr4);
        b.M(iArr4, iArr5, iArr4);
        b.R0(6, iArr4, iArr4);
        b.M(iArr4, iArr2, iArr4);
        b.R0(2, iArr4, iArr4);
        b.E0(iArr4, iArr2);
        if (he2.k.g(iArr, iArr2)) {
            return new r(iArr4);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[8];
        b.E0(this.f80741e, iArr);
        return new r(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[8];
        b.c1(this.f80741e, ((r) dVar).f80741e, iArr);
        return new r(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return he2.k.k(this.f80741e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return he2.k.C(this.f80741e);
    }
}
