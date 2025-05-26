package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class b0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80699e;

    public b0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        long[] I = kh2.r.I(bigInteger);
        long j13 = I[2];
        long j14 = j13 >>> 35;
        I[0] = ((j14 << 7) ^ (((j14 << 3) ^ j14) ^ (j14 << 6))) ^ I[0];
        I[2] = j13 & 34359738367L;
        this.f80699e = I;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((b0) dVar).f80699e;
        long[] jArr2 = this.f80699e;
        return new b0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80699e;
        return new b0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        long[] jArr = this.f80699e;
        long[] jArr2 = ((b0) obj).f80699e;
        for (int i13 = 2; i13 >= 0; i13--) {
            if (jArr[i13] != jArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80699e, 3) ^ 163763;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f80699e;
        if (kh2.r.c1(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[6];
        b.x(jArr2, jArr5);
        b.W(jArr5, jArr3);
        b.K0(1, jArr3, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(1, jArr4, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(3, jArr3, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(3, jArr4, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(9, jArr3, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(9, jArr4, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(27, jArr3, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(27, jArr4, jArr4);
        b.D(jArr3, jArr4, jArr3);
        b.K0(81, jArr3, jArr4);
        b.D(jArr3, jArr4, jArr);
        return new b0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.r.Y0(this.f80699e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.r.c1(this.f80699e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[3];
        b.D(this.f80699e, ((b0) dVar).f80699e, jArr);
        return new b0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((b0) dVar).f80699e;
        long[] jArr2 = ((b0) dVar2).f80699e;
        long[] jArr3 = ((b0) dVar3).f80699e;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        b.p(this.f80699e, jArr, jArr5);
        b.g(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        b.p(jArr2, jArr3, jArr6);
        b.g(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        b.W(jArr4, jArr7);
        return new b0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f80699e;
        long i13 = p2.i1(jArr2[0]);
        long i14 = p2.i1(jArr2[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long i15 = p2.i1(jArr2[2]);
        b.D(new long[]{(i13 >>> 32) | (i14 & (-4294967296L)), i15 >>> 32, 0}, b.F, jArr);
        jArr[0] = jArr[0] ^ j13;
        jArr[1] = jArr[1] ^ (i15 & 4294967295L);
        return new b0(jArr);
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        b.x(this.f80699e, jArr2);
        b.W(jArr2, jArr);
        return new b0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((b0) dVar).f80699e;
        long[] jArr2 = ((b0) dVar2).f80699e;
        long[] jArr3 = new long[6];
        long[] jArr4 = new long[6];
        b.x(this.f80699e, jArr4);
        b.g(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        b.p(jArr, jArr2, jArr5);
        b.g(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        b.W(jArr3, jArr6);
        return new b0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80699e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.r.t1(this.f80699e);
    }

    public b0(long[] jArr) {
        super(2);
        this.f80699e = jArr;
    }
}
