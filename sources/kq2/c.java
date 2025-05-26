package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class c extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80700f = a.f80670i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80701e;

    public c(int[] iArr) {
        super(2);
        this.f80701e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[4];
        b.a(this.f80701e, ((c) dVar).f80701e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[4];
        if (j1.n0(4, this.f80701e, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && j1.k0(iArr, b.f80673a))) {
            b.i(iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[4];
        jk.v.Z(b.f80673a, ((c) dVar).f80701e, iArr);
        b.A(iArr, this.f80701e, iArr);
        return new c(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        int[] iArr = this.f80701e;
        int[] iArr2 = ((c) obj).f80701e;
        for (int i13 = 3; i13 >= 0; i13--) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return f80700f.bitLength();
    }

    public final int hashCode() {
        return f80700f.hashCode() ^ kotlin.jvm.internal.r.v(4, this.f80701e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[4];
        jk.v.Z(b.f80673a, this.f80701e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return j1.c1(this.f80701e);
    }

    @Override // o6.d
    public final boolean m() {
        return j1.g1(this.f80701e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[4];
        b.A(this.f80701e, ((c) dVar).f80701e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[4];
        int[] iArr2 = this.f80701e;
        if (j1.g1(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        } else {
            j1.y1(b.f80673a, iArr2, iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80701e;
        if (j1.g1(iArr) || j1.c1(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        b.u0(iArr, iArr2);
        b.A(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        b.H0(2, iArr2, iArr3);
        b.A(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        b.H0(4, iArr3, iArr4);
        b.A(iArr4, iArr3, iArr4);
        b.H0(2, iArr4, iArr3);
        b.A(iArr3, iArr2, iArr3);
        b.H0(10, iArr3, iArr2);
        b.A(iArr2, iArr3, iArr2);
        b.H0(10, iArr2, iArr4);
        b.A(iArr4, iArr3, iArr4);
        b.u0(iArr4, iArr3);
        b.A(iArr3, iArr, iArr3);
        b.H0(95, iArr3, iArr3);
        b.u0(iArr3, iArr4);
        for (int i13 = 3; i13 >= 0; i13--) {
            if (iArr[i13] != iArr4[i13]) {
                return null;
            }
        }
        return new c(iArr3);
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[4];
        b.u0(this.f80701e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[4];
        b.U0(this.f80701e, ((c) dVar).f80701e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80701e[0] & 1) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        byte[] bArr = new byte[16];
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = this.f80701e[i13];
            if (i14 != 0) {
                e0.t.K0(bArr, i14, (3 - i13) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
