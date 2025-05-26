package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class x extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80752f = w.f80750i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80753e;

    public x(int[] iArr) {
        super(2);
        this.f80753e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[17];
        b.d(this.f80753e, ((x) dVar).f80753e, iArr);
        return new x(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f80753e;
        int n03 = j1.n0(16, iArr2, iArr) + iArr2[16];
        if (n03 > 511 || (n03 == 511 && j1.Y(16, iArr, b.D))) {
            n03 = (j1.o0(iArr) + n03) & 511;
        }
        iArr[16] = n03;
        return new x(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[17];
        jk.v.Z(b.D, ((x) dVar).f80753e, iArr);
        b.E(iArr, this.f80753e, iArr);
        return new x(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return j1.Y(17, this.f80753e, ((x) obj).f80753e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80752f.bitLength();
    }

    public final int hashCode() {
        return f80752f.hashCode() ^ kotlin.jvm.internal.r.v(17, this.f80753e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[17];
        jk.v.Z(b.D, this.f80753e, iArr);
        return new x(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return j1.d1(this.f80753e, 17);
    }

    @Override // o6.d
    public final boolean m() {
        return j1.h1(this.f80753e, 17);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[17];
        b.E(this.f80753e, ((x) dVar).f80753e, iArr);
        return new x(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f80753e;
        if (j1.h1(iArr2, 17)) {
            for (int i13 = 0; i13 < 17; i13++) {
                iArr[i13] = 0;
            }
        } else {
            j1.x1(17, b.D, iArr2, iArr);
        }
        return new x(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80753e;
        if (j1.h1(iArr, 17) || j1.d1(iArr, 17)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[33];
        b.v(iArr, iArr4);
        b.X(iArr4, iArr2);
        int i13 = 519;
        while (true) {
            i13--;
            if (i13 <= 0) {
                break;
            }
            b.v(iArr2, iArr4);
            b.X(iArr4, iArr2);
        }
        b.y0(iArr2, iArr3);
        if (j1.Y(17, iArr, iArr3)) {
            return new x(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[17];
        b.y0(this.f80753e, iArr);
        return new x(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[17];
        b.W0(this.f80753e, ((x) dVar).f80753e, iArr);
        return new x(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return j1.e0(this.f80753e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return j1.D1(this.f80753e, 17);
    }
}
