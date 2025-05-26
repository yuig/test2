package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class j extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80723f = i.f80718i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80724e;

    public j(int[] iArr) {
        super(2);
        this.f80724e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[6];
        if (kh2.r.j(this.f80724e, ((j) dVar).f80724e, iArr) != 0 || (iArr[5] == -1 && kh2.r.R(iArr, b.f80682j))) {
            j1.C(6, 4553, iArr);
        }
        return new j(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[6];
        if (j1.n0(6, this.f80724e, iArr) != 0 || (iArr[5] == -1 && kh2.r.R(iArr, b.f80682j))) {
            j1.C(6, 4553, iArr);
        }
        return new j(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[6];
        jk.v.Z(b.f80682j, ((j) dVar).f80724e, iArr);
        b.H(iArr, this.f80724e, iArr);
        return new j(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return kh2.r.E(this.f80724e, ((j) obj).f80724e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80723f.bitLength();
    }

    public final int hashCode() {
        return f80723f.hashCode() ^ kotlin.jvm.internal.r.v(6, this.f80724e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[6];
        jk.v.Z(b.f80682j, this.f80724e, iArr);
        return new j(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.r.X0(this.f80724e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.r.b1(this.f80724e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[6];
        b.H(this.f80724e, ((j) dVar).f80724e, iArr);
        return new j(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f80724e;
        if (kh2.r.b1(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            kh2.r.p1(b.f80682j, iArr2, iArr);
        }
        return new j(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80724e;
        if (kh2.r.b1(iArr) || kh2.r.X0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        b.A0(iArr, iArr2);
        b.H(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        b.A0(iArr2, iArr3);
        b.H(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        b.N0(3, iArr3, iArr4);
        b.H(iArr4, iArr3, iArr4);
        b.N0(2, iArr4, iArr4);
        b.H(iArr4, iArr2, iArr4);
        b.N0(8, iArr4, iArr2);
        b.H(iArr2, iArr4, iArr2);
        b.N0(3, iArr2, iArr4);
        b.H(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        b.N0(16, iArr4, iArr5);
        b.H(iArr5, iArr2, iArr5);
        b.N0(35, iArr5, iArr2);
        b.H(iArr2, iArr5, iArr2);
        b.N0(70, iArr2, iArr5);
        b.H(iArr5, iArr2, iArr5);
        b.N0(19, iArr5, iArr2);
        b.H(iArr2, iArr4, iArr2);
        b.N0(20, iArr2, iArr2);
        b.H(iArr2, iArr4, iArr2);
        b.N0(4, iArr2, iArr2);
        b.H(iArr2, iArr3, iArr2);
        b.N0(6, iArr2, iArr2);
        b.H(iArr2, iArr3, iArr2);
        b.A0(iArr2, iArr2);
        b.A0(iArr2, iArr3);
        if (kh2.r.E(iArr, iArr3)) {
            return new j(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[6];
        b.A0(this.f80724e, iArr);
        return new j(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[6];
        b.Y0(this.f80724e, ((j) dVar).f80724e, iArr);
        return new j(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return kh2.r.K(this.f80724e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.r.s1(this.f80724e);
    }
}
