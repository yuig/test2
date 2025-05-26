package kq2;

import java.math.BigInteger;
import kh2.j1;
import kh2.p2;

/* loaded from: classes4.dex */
public final class h extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80715f = g.f80712i;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f80716e;

    public h(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f80715f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] h03 = p2.h0(bigInteger);
        if (h03[4] == -1) {
            int[] iArr = b.f80679g;
            if (p2.p0(h03, iArr)) {
                p2.e1(iArr, h03);
            }
        }
        this.f80716e = h03;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[5];
        if (p2.J(this.f80716e, ((h) dVar).f80716e, iArr) != 0 || (iArr[4] == -1 && p2.p0(iArr, b.f80679g))) {
            j1.C(5, 21389, iArr);
        }
        return new h(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[5];
        if (j1.n0(5, this.f80716e, iArr) != 0 || (iArr[4] == -1 && p2.p0(iArr, b.f80679g))) {
            j1.C(5, 21389, iArr);
        }
        return new h(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[5];
        jk.v.Z(b.f80679g, ((h) dVar).f80716e, iArr);
        b.F(iArr, this.f80716e, iArr);
        return new h(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return p2.b0(this.f80716e, ((h) obj).f80716e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80715f.bitLength();
    }

    public final int hashCode() {
        return f80715f.hashCode() ^ kotlin.jvm.internal.r.v(5, this.f80716e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[5];
        jk.v.Z(b.f80679g, this.f80716e, iArr);
        return new h(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return p2.R0(this.f80716e);
    }

    @Override // o6.d
    public final boolean m() {
        return p2.S0(this.f80716e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[5];
        b.F(this.f80716e, ((h) dVar).f80716e, iArr);
        return new h(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f80716e;
        if (p2.S0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            p2.d1(b.f80679g, iArr2, iArr);
        }
        return new h(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80716e;
        if (p2.S0(iArr) || p2.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        b.z0(iArr, iArr2);
        b.F(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        b.z0(iArr2, iArr3);
        b.F(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        b.z0(iArr3, iArr4);
        b.F(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        b.L0(3, iArr4, iArr5);
        b.F(iArr5, iArr3, iArr5);
        b.L0(7, iArr5, iArr4);
        b.F(iArr4, iArr5, iArr4);
        b.L0(3, iArr4, iArr5);
        b.F(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        b.L0(14, iArr5, iArr6);
        b.F(iArr6, iArr4, iArr6);
        b.L0(31, iArr6, iArr4);
        b.F(iArr4, iArr6, iArr4);
        b.L0(62, iArr4, iArr6);
        b.F(iArr6, iArr4, iArr6);
        b.L0(3, iArr6, iArr4);
        b.F(iArr4, iArr3, iArr4);
        b.L0(18, iArr4, iArr4);
        b.F(iArr4, iArr5, iArr4);
        b.L0(2, iArr4, iArr4);
        b.F(iArr4, iArr, iArr4);
        b.L0(3, iArr4, iArr4);
        b.F(iArr4, iArr2, iArr4);
        b.L0(6, iArr4, iArr4);
        b.F(iArr4, iArr3, iArr4);
        b.L0(2, iArr4, iArr4);
        b.F(iArr4, iArr, iArr4);
        b.z0(iArr4, iArr2);
        if (p2.b0(iArr, iArr2)) {
            return new h(iArr4);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[5];
        b.z0(this.f80716e, iArr);
        return new h(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[5];
        b.X0(this.f80716e, ((h) dVar).f80716e, iArr);
        return new h(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return p2.j0(this.f80716e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return p2.f1(this.f80716e);
    }

    public h(int[] iArr) {
        super(2);
        this.f80716e = iArr;
    }
}
