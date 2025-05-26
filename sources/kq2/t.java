package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class t extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80744f = s.f80742i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80745e;

    public t(int[] iArr) {
        super(2);
        this.f80745e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[8];
        if (he2.k.b(this.f80745e, ((t) dVar).f80745e, iArr) != 0 || (iArr[7] == -1 && he2.k.o(iArr, b.f80697y))) {
            b.l(iArr);
        }
        return new t(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[8];
        if (j1.n0(8, this.f80745e, iArr) != 0 || (iArr[7] == -1 && he2.k.o(iArr, b.f80697y))) {
            b.l(iArr);
        }
        return new t(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[8];
        jk.v.Z(b.f80697y, ((t) dVar).f80745e, iArr);
        b.N(iArr, this.f80745e, iArr);
        return new t(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return he2.k.g(this.f80745e, ((t) obj).f80745e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80744f.bitLength();
    }

    public final int hashCode() {
        return f80744f.hashCode() ^ kotlin.jvm.internal.r.v(8, this.f80745e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[8];
        jk.v.Z(b.f80697y, this.f80745e, iArr);
        return new t(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return he2.k.p(this.f80745e);
    }

    @Override // o6.d
    public final boolean m() {
        return he2.k.r(this.f80745e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[8];
        b.N(this.f80745e, ((t) dVar).f80745e, iArr);
        return new t(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f80745e;
        if (he2.k.r(iArr2)) {
            he2.k.J(iArr);
        } else {
            he2.k.z(b.f80697y, iArr2, iArr);
        }
        return new t(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80745e;
        if (he2.k.r(iArr) || he2.k.p(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        b.F0(iArr, iArr2);
        b.N(iArr2, iArr, iArr2);
        b.S0(2, iArr2, iArr3);
        b.N(iArr3, iArr2, iArr3);
        b.S0(4, iArr3, iArr2);
        b.N(iArr2, iArr3, iArr2);
        b.S0(8, iArr2, iArr3);
        b.N(iArr3, iArr2, iArr3);
        b.S0(16, iArr3, iArr2);
        b.N(iArr2, iArr3, iArr2);
        b.S0(32, iArr2, iArr2);
        b.N(iArr2, iArr, iArr2);
        b.S0(96, iArr2, iArr2);
        b.N(iArr2, iArr, iArr2);
        b.S0(94, iArr2, iArr2);
        b.F0(iArr2, iArr3);
        if (he2.k.g(iArr, iArr3)) {
            return new t(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[8];
        b.F0(this.f80745e, iArr);
        return new t(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[8];
        b.d1(this.f80745e, ((t) dVar).f80745e, iArr);
        return new t(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return he2.k.k(this.f80745e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return he2.k.C(this.f80745e);
    }
}
