package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class y extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80754e;

    public y(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[2];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        long j13 = jArr[1];
        long j14 = j13 >>> 49;
        jArr[0] = (j14 ^ (j14 << 9)) ^ jArr[0];
        jArr[1] = j13 & 562949953421311L;
        this.f80754e = jArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((y) dVar).f80754e;
        long[] jArr2 = this.f80754e;
        return new y(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80754e;
        return new y(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        long[] jArr = ((y) obj).f80754e;
        for (int i13 = 1; i13 >= 0; i13--) {
            if (this.f80754e[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80754e, 2) ^ 113009;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[2];
        long[] jArr2 = this.f80754e;
        for (int i13 = 0; i13 < 2; i13++) {
            if (jArr2[i13] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                kg.o.v(jArr2, jArr5);
                kg.o.L(jArr5, jArr3);
                kg.o.H(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                kg.o.v(jArr3, jArr6);
                kg.o.L(jArr6, jArr3);
                kg.o.H(jArr3, jArr2, jArr3);
                kg.o.N(3, jArr3, jArr4);
                kg.o.H(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                kg.o.v(jArr4, jArr7);
                kg.o.L(jArr7, jArr4);
                kg.o.H(jArr4, jArr2, jArr4);
                kg.o.N(7, jArr4, jArr3);
                kg.o.H(jArr3, jArr4, jArr3);
                kg.o.N(14, jArr3, jArr4);
                kg.o.H(jArr4, jArr3, jArr4);
                kg.o.N(28, jArr4, jArr3);
                kg.o.H(jArr3, jArr4, jArr3);
                kg.o.N(56, jArr3, jArr4);
                kg.o.H(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                kg.o.v(jArr4, jArr8);
                kg.o.L(jArr8, jArr);
                return new y(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // o6.d
    public final boolean l() {
        long[] jArr = this.f80754e;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // o6.d
    public final boolean m() {
        long[] jArr = this.f80754e;
        for (int i13 = 0; i13 < 2; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[2];
        kg.o.H(this.f80754e, ((y) dVar).f80754e, jArr);
        return new y(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((y) dVar).f80754e;
        long[] jArr2 = ((y) dVar2).f80754e;
        long[] jArr3 = ((y) dVar3).f80754e;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        kg.o.t(this.f80754e, jArr, jArr5);
        kg.o.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        kg.o.t(jArr2, jArr3, jArr6);
        kg.o.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        kg.o.L(jArr4, jArr7);
        return new y(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = this.f80754e;
        long i13 = p2.i1(jArr[0]);
        long i14 = p2.i1(jArr[1]);
        long j13 = (i13 >>> 32) | (i14 & (-4294967296L));
        return new y(new long[]{((j13 << 57) ^ ((4294967295L & i13) | (i14 << 32))) ^ (j13 << 5), (j13 >>> 59) ^ (j13 >>> 7)});
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        kg.o.v(this.f80754e, jArr2);
        kg.o.L(jArr2, jArr);
        return new y(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((y) dVar).f80754e;
        long[] jArr2 = ((y) dVar2).f80754e;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        kg.o.v(this.f80754e, jArr4);
        kg.o.d(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[4];
        kg.o.t(jArr, jArr2, jArr5);
        kg.o.d(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        kg.o.L(jArr3, jArr6);
        return new y(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80754e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        byte[] bArr = new byte[16];
        for (int i13 = 0; i13 < 2; i13++) {
            long j13 = this.f80754e[i13];
            if (j13 != 0) {
                e0.t.N0(j13, (1 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public y(long[] jArr) {
        super(2);
        this.f80754e = jArr;
    }
}
