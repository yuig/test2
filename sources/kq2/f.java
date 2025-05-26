package kq2;

import java.math.BigInteger;
import kh2.j1;
import kh2.p2;

/* loaded from: classes4.dex */
public final class f extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80709f = e.f80706i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80710e;

    public f(int[] iArr) {
        super(2);
        this.f80710e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[5];
        if (p2.J(this.f80710e, ((f) dVar).f80710e, iArr) != 0 || (iArr[4] == -1 && p2.p0(iArr, b.f80676d))) {
            j1.M(5, -2147483647, iArr);
        }
        return new f(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[5];
        if (j1.n0(5, this.f80710e, iArr) != 0 || (iArr[4] == -1 && p2.p0(iArr, b.f80676d))) {
            j1.M(5, -2147483647, iArr);
        }
        return new f(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[5];
        jk.v.Z(b.f80676d, ((f) dVar).f80710e, iArr);
        b.C(iArr, this.f80710e, iArr);
        return new f(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return p2.b0(this.f80710e, ((f) obj).f80710e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80709f.bitLength();
    }

    public final int hashCode() {
        return f80709f.hashCode() ^ kotlin.jvm.internal.r.v(5, this.f80710e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[5];
        jk.v.Z(b.f80676d, this.f80710e, iArr);
        return new f(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return p2.R0(this.f80710e);
    }

    @Override // o6.d
    public final boolean m() {
        return p2.S0(this.f80710e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[5];
        b.C(this.f80710e, ((f) dVar).f80710e, iArr);
        return new f(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f80710e;
        if (p2.S0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            p2.d1(b.f80676d, iArr2, iArr);
        }
        return new f(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80710e;
        if (p2.S0(iArr) || p2.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        b.w0(iArr, iArr2);
        b.C(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        b.J0(2, iArr2, iArr3);
        b.C(iArr3, iArr2, iArr3);
        b.J0(4, iArr3, iArr2);
        b.C(iArr2, iArr3, iArr2);
        b.J0(8, iArr2, iArr3);
        b.C(iArr3, iArr2, iArr3);
        b.J0(16, iArr3, iArr2);
        b.C(iArr2, iArr3, iArr2);
        b.J0(32, iArr2, iArr3);
        b.C(iArr3, iArr2, iArr3);
        b.J0(64, iArr3, iArr2);
        b.C(iArr2, iArr3, iArr2);
        b.w0(iArr2, iArr3);
        b.C(iArr3, iArr, iArr3);
        b.J0(29, iArr3, iArr3);
        b.w0(iArr3, iArr2);
        if (p2.b0(iArr, iArr2)) {
            return new f(iArr3);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[5];
        b.w0(this.f80710e, iArr);
        return new f(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[5];
        b.V0(this.f80710e, ((f) dVar).f80710e, iArr);
        return new f(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return p2.j0(this.f80710e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return p2.f1(this.f80710e);
    }
}
