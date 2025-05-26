package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class a0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80672e;

    public a0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        long[] I = kh2.r.I(bigInteger);
        long j13 = I[2];
        long j14 = j13 >>> 3;
        I[0] = ((j14 << 8) ^ (((j14 << 2) ^ j14) ^ (j14 << 3))) ^ I[0];
        I[1] = I[1] ^ (j13 >>> 59);
        I[2] = j13 & 7;
        this.f80672e = I;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((a0) dVar).f80672e;
        long[] jArr2 = this.f80672e;
        return new a0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80672e;
        return new a0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        long[] jArr = this.f80672e;
        long[] jArr2 = ((a0) obj).f80672e;
        for (int i13 = 2; i13 >= 0; i13--) {
            if (jArr[i13] != jArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80672e, 3) ^ 131832;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f80672e;
        if (kh2.r.c1(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[5];
        b.w(jArr2, jArr5);
        b.U(jArr5, jArr3);
        b.B(jArr3, jArr2, jArr3);
        b.I0(2, jArr3, jArr4);
        b.B(jArr4, jArr3, jArr4);
        b.I0(4, jArr4, jArr3);
        b.B(jArr3, jArr4, jArr3);
        b.I0(8, jArr3, jArr4);
        b.B(jArr4, jArr3, jArr4);
        b.I0(16, jArr4, jArr3);
        b.B(jArr3, jArr4, jArr3);
        b.I0(32, jArr3, jArr4);
        b.B(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        b.w(jArr4, jArr6);
        b.U(jArr6, jArr4);
        b.B(jArr4, jArr2, jArr4);
        b.I0(65, jArr4, jArr3);
        b.B(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        b.w(jArr3, jArr7);
        b.U(jArr7, jArr);
        return new a0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        return kh2.r.Y0(this.f80672e);
    }

    @Override // o6.d
    public final boolean m() {
        return kh2.r.c1(this.f80672e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[3];
        b.B(this.f80672e, ((a0) dVar).f80672e, jArr);
        return new a0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((a0) dVar).f80672e;
        long[] jArr2 = ((a0) dVar2).f80672e;
        long[] jArr3 = ((a0) dVar3).f80672e;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[6];
        b.o(this.f80672e, jArr, jArr5);
        b.f(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        b.o(jArr2, jArr3, jArr6);
        b.f(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        b.U(jArr4, jArr7);
        return new a0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f80672e;
        long i13 = p2.i1(jArr2[0]);
        long i14 = p2.i1(jArr2[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long i15 = p2.i1(jArr2[2]);
        b.B(new long[]{(i13 >>> 32) | (i14 & (-4294967296L)), i15 >>> 32, 0}, b.E, jArr);
        jArr[0] = jArr[0] ^ j13;
        jArr[1] = jArr[1] ^ (i15 & 4294967295L);
        return new a0(jArr);
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        b.w(this.f80672e, jArr2);
        b.U(jArr2, jArr);
        return new a0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((a0) dVar).f80672e;
        long[] jArr2 = ((a0) dVar2).f80672e;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        b.w(this.f80672e, jArr4);
        b.f(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        b.o(jArr, jArr2, jArr5);
        b.f(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        b.U(jArr3, jArr6);
        return new a0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80672e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        return kh2.r.t1(this.f80672e);
    }

    public a0(long[] jArr) {
        super(2);
        this.f80672e = jArr;
    }
}
