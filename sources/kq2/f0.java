package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class f0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80711e;

    public f0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[5];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        long j13 = jArr[4];
        long j14 = j13 >>> 27;
        jArr[0] = ((j14 << 12) ^ (((j14 << 5) ^ j14) ^ (j14 << 7))) ^ jArr[0];
        jArr[4] = j13 & 134217727;
        this.f80711e = jArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((f0) dVar).f80711e;
        long[] jArr2 = this.f80711e;
        return new f0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80711e;
        return new f0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        long[] jArr = ((f0) obj).f80711e;
        for (int i13 = 4; i13 >= 0; i13--) {
            if (this.f80711e[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return 283;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80711e, 5) ^ 2831275;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f80711e;
        for (int i13 = 0; i13 < 5; i13++) {
            if (jArr2[i13] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                b.v0(jArr2, jArr3);
                b.G(jArr3, jArr2, jArr3);
                b.M0(2, jArr3, jArr4);
                b.G(jArr4, jArr3, jArr4);
                b.M0(4, jArr4, jArr3);
                b.G(jArr3, jArr4, jArr3);
                b.M0(8, jArr3, jArr4);
                b.G(jArr4, jArr3, jArr4);
                b.v0(jArr4, jArr4);
                b.G(jArr4, jArr2, jArr4);
                b.M0(17, jArr4, jArr3);
                b.G(jArr3, jArr4, jArr3);
                b.v0(jArr3, jArr3);
                b.G(jArr3, jArr2, jArr3);
                b.M0(35, jArr3, jArr4);
                b.G(jArr4, jArr3, jArr4);
                b.M0(70, jArr4, jArr3);
                b.G(jArr3, jArr4, jArr3);
                b.v0(jArr3, jArr3);
                b.G(jArr3, jArr2, jArr3);
                b.M0(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN, jArr3, jArr4);
                b.G(jArr4, jArr3, jArr4);
                b.v0(jArr4, jArr);
                return new f0(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // o6.d
    public final boolean l() {
        long[] jArr = this.f80711e;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 5; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final boolean m() {
        long[] jArr = this.f80711e;
        for (int i13 = 0; i13 < 5; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[5];
        b.G(this.f80711e, ((f0) dVar).f80711e, jArr);
        return new f0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((f0) dVar).f80711e;
        long[] jArr2 = ((f0) dVar2).f80711e;
        long[] jArr3 = ((f0) dVar3).f80711e;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        b.q(this.f80711e, jArr, jArr5);
        b.h(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        b.q(jArr2, jArr3, jArr6);
        b.h(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        b.Z(jArr4, jArr7);
        return new f0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f80711e;
        long i13 = p2.i1(jArr2[0]);
        long i14 = p2.i1(jArr2[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long i15 = p2.i1(jArr2[2]);
        long i16 = p2.i1(jArr2[3]);
        long j14 = (i15 & 4294967295L) | (i16 << 32);
        long i17 = p2.i1(jArr2[4]);
        b.G(new long[]{(i13 >>> 32) | (i14 & (-4294967296L)), (i15 >>> 32) | (i16 & (-4294967296L)), i17 >>> 32, 0, 0}, b.G, jArr);
        jArr[0] = jArr[0] ^ j13;
        jArr[1] = jArr[1] ^ j14;
        jArr[2] = jArr[2] ^ (4294967295L & i17);
        return new f0(jArr);
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[5];
        b.v0(this.f80711e, jArr);
        return new f0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((f0) dVar).f80711e;
        long[] jArr2 = ((f0) dVar2).f80711e;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        b.y(this.f80711e, jArr4);
        b.h(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        b.q(jArr, jArr2, jArr5);
        b.h(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        b.Z(jArr3, jArr6);
        return new f0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80711e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        byte[] bArr = new byte[40];
        for (int i13 = 0; i13 < 5; i13++) {
            long j13 = this.f80711e[i13];
            if (j13 != 0) {
                e0.t.N0(j13, (4 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public f0(long[] jArr) {
        super(2);
        this.f80711e = jArr;
    }
}
