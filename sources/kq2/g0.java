package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.m2;
import kh2.p2;

/* loaded from: classes4.dex */
public final class g0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80714e;

    public g0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[7];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        long j13 = jArr[6];
        long j14 = j13 >>> 25;
        jArr[0] = jArr[0] ^ j14;
        jArr[1] = (j14 << 23) ^ jArr[1];
        jArr[6] = j13 & 33554431;
        this.f80714e = jArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((g0) dVar).f80714e;
        long[] jArr2 = this.f80714e;
        return new g0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80714e;
        return new g0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        long[] jArr = ((g0) obj).f80714e;
        for (int i13 = 6; i13 >= 0; i13--) {
            if (this.f80714e[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return 409;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80714e, 7) ^ 4090087;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[7];
        long[] jArr2 = this.f80714e;
        for (int i13 = 0; i13 < 7; i13++) {
            if (jArr2[i13] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                m2.g1(jArr2, jArr6);
                m2.G1(jArr6, jArr3);
                m2.O1(1, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(1, jArr4, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(3, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(6, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(12, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr5);
                m2.O1(24, jArr5, jArr3);
                m2.O1(24, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(48, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(96, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.O1(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, jArr3, jArr4);
                m2.D1(jArr3, jArr4, jArr3);
                m2.D1(jArr3, jArr5, jArr);
                return new g0(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // o6.d
    public final boolean l() {
        long[] jArr = this.f80714e;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 7; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final boolean m() {
        long[] jArr = this.f80714e;
        for (int i13 = 0; i13 < 7; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[7];
        m2.D1(this.f80714e, ((g0) dVar).f80714e, jArr);
        return new g0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((g0) dVar).f80714e;
        long[] jArr2 = ((g0) dVar2).f80714e;
        long[] jArr3 = ((g0) dVar3).f80714e;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        m2.f1(this.f80714e, jArr, jArr5);
        for (int i13 = 0; i13 < 13; i13++) {
            jArr4[i13] = jArr4[i13] ^ jArr5[i13];
        }
        long[] jArr6 = new long[14];
        m2.f1(jArr2, jArr3, jArr6);
        for (int i14 = 0; i14 < 13; i14++) {
            jArr4[i14] = jArr4[i14] ^ jArr6[i14];
        }
        long[] jArr7 = new long[7];
        m2.G1(jArr4, jArr7);
        return new g0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = this.f80714e;
        long i13 = p2.i1(jArr[0]);
        long i14 = p2.i1(jArr[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long j14 = (i13 >>> 32) | (i14 & (-4294967296L));
        long i15 = p2.i1(jArr[2]);
        long i16 = p2.i1(jArr[3]);
        long j15 = (i15 & 4294967295L) | (i16 << 32);
        long j16 = (i15 >>> 32) | (i16 & (-4294967296L));
        long i17 = p2.i1(jArr[4]);
        long i18 = p2.i1(jArr[5]);
        long j17 = (i17 & 4294967295L) | (i18 << 32);
        long j18 = (i17 >>> 32) | (i18 & (-4294967296L));
        long i19 = p2.i1(jArr[6]);
        long j19 = i19 >>> 32;
        return new g0(new long[]{j13 ^ (j14 << 44), (j15 ^ (j16 << 44)) ^ (j14 >>> 20), (j17 ^ (j18 << 44)) ^ (j16 >>> 20), (((i19 & 4294967295L) ^ (j19 << 44)) ^ (j18 >>> 20)) ^ (j14 << 13), ((i19 >>> 52) ^ (j16 << 13)) ^ (j14 >>> 51), (j18 << 13) ^ (j16 >>> 51), (j19 << 13) ^ (j18 >>> 51)});
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        m2.g1(this.f80714e, jArr2);
        m2.G1(jArr2, jArr);
        return new g0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((g0) dVar).f80714e;
        long[] jArr2 = ((g0) dVar2).f80714e;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        m2.g1(this.f80714e, jArr4);
        for (int i13 = 0; i13 < 13; i13++) {
            jArr3[i13] = jArr3[i13] ^ jArr4[i13];
        }
        long[] jArr5 = new long[14];
        m2.f1(jArr, jArr2, jArr5);
        for (int i14 = 0; i14 < 13; i14++) {
            jArr3[i14] = jArr3[i14] ^ jArr5[i14];
        }
        long[] jArr6 = new long[7];
        m2.G1(jArr3, jArr6);
        return new g0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80714e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        byte[] bArr = new byte[56];
        for (int i13 = 0; i13 < 7; i13++) {
            long j13 = this.f80714e[i13];
            if (j13 != 0) {
                e0.t.N0(j13, (6 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public g0(long[] jArr) {
        super(2);
        this.f80714e = jArr;
    }
}
