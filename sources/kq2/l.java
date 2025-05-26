package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class l extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80727f = k.f80725i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80728e;

    public l(int[] iArr) {
        super(2);
        this.f80728e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[6];
        if (kh2.r.j(this.f80728e, ((l) dVar).f80728e, iArr) != 0 || (iArr[5] == -1 && kh2.r.R(iArr, b.f80685m))) {
            b.j(iArr);
        }
        return new l(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[6];
        if (j1.n0(6, this.f80728e, iArr) != 0 || (iArr[5] == -1 && kh2.r.R(iArr, b.f80685m))) {
            b.j(iArr);
        }
        return new l(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[6];
        jk.v.Z(b.f80685m, ((l) dVar).f80728e, iArr);
        b.J(iArr, this.f80728e, iArr);
        return new l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return kh2.r.E(this.f80728e, ((l) obj).f80728e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80727f.bitLength();
    }

    public final int hashCode() {
        return f80727f.hashCode() ^ kotlin.jvm.internal.r.v(6, this.f80728e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[6];
        jk.v.Z(b.f80685m, this.f80728e, iArr);
        return new l(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.r.X0(this.f80728e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.r.b1(this.f80728e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[6];
        b.J(this.f80728e, ((l) dVar).f80728e, iArr);
        return new l(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f80728e;
        if (kh2.r.b1(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            kh2.r.p1(b.f80685m, iArr2, iArr);
        }
        return new l(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80728e;
        if (kh2.r.b1(iArr) || kh2.r.X0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        b.B0(iArr, iArr2);
        b.J(iArr2, iArr, iArr2);
        b.P0(2, iArr2, iArr3);
        b.J(iArr3, iArr2, iArr3);
        b.P0(4, iArr3, iArr2);
        b.J(iArr2, iArr3, iArr2);
        b.P0(8, iArr2, iArr3);
        b.J(iArr3, iArr2, iArr3);
        b.P0(16, iArr3, iArr2);
        b.J(iArr2, iArr3, iArr2);
        b.P0(32, iArr2, iArr3);
        b.J(iArr3, iArr2, iArr3);
        b.P0(64, iArr3, iArr2);
        b.J(iArr2, iArr3, iArr2);
        b.P0(62, iArr2, iArr2);
        b.B0(iArr2, iArr3);
        if (kh2.r.E(iArr, iArr3)) {
            return new l(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[6];
        b.B0(this.f80728e, iArr);
        return new l(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[6];
        b.Z0(this.f80728e, ((l) dVar).f80728e, iArr);
        return new l(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return kh2.r.K(this.f80728e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.r.s1(this.f80728e);
    }
}
