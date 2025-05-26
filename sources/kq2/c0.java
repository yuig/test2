package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class c0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80702e;

    public c0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        long[] j13 = he2.k.j(bigInteger);
        long j14 = j13[3];
        long j15 = j14 >>> 1;
        j13[0] = (j15 ^ (j15 << 15)) ^ j13[0];
        j13[1] = j13[1] ^ (j14 >>> 50);
        j13[3] = j14 & 1;
        this.f80702e = j13;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((c0) dVar).f80702e;
        long[] jArr2 = this.f80702e;
        return new c0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80702e;
        return new c0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return he2.k.h(this.f80702e, ((c0) obj).f80702e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80702e, 4) ^ 1930015;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f80702e;
        if (he2.k.s(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        kg.p.G(jArr2, jArr5);
        kg.p.V(jArr5, jArr3);
        kg.p.a0(1, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(1, jArr4, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(3, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(6, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(12, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(24, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(48, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr3);
        kg.p.a0(96, jArr3, jArr4);
        kg.p.Q(jArr3, jArr4, jArr);
        return new c0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        return he2.k.q(this.f80702e);
    }

    @Override // o6.d
    public final boolean m() {
        return he2.k.s(this.f80702e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[4];
        kg.p.Q(this.f80702e, ((c0) dVar).f80702e, jArr);
        return new c0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((c0) dVar).f80702e;
        long[] jArr2 = ((c0) dVar2).f80702e;
        long[] jArr3 = ((c0) dVar3).f80702e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        kg.p.E(this.f80702e, jArr, jArr5);
        kg.p.j(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        kg.p.E(jArr2, jArr3, jArr6);
        kg.p.j(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        kg.p.V(jArr4, jArr7);
        return new c0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = this.f80702e;
        long i13 = p2.i1(jArr[0]);
        long i14 = p2.i1(jArr[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long j14 = (i13 >>> 32) | (i14 & (-4294967296L));
        long i15 = p2.i1(jArr[2]);
        long j15 = i15 >>> 32;
        return new c0(new long[]{j13 ^ (j14 << 8), ((((4294967295L & i15) ^ (jArr[3] << 32)) ^ (j15 << 8)) ^ (j14 >>> 56)) ^ (j14 << 33), (j14 >>> 31) ^ ((i15 >>> 88) ^ (j15 << 33)), i15 >>> 63});
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        kg.p.G(this.f80702e, jArr2);
        kg.p.V(jArr2, jArr);
        return new c0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((c0) dVar).f80702e;
        long[] jArr2 = ((c0) dVar2).f80702e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        kg.p.G(this.f80702e, jArr4);
        kg.p.j(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        kg.p.E(jArr, jArr2, jArr5);
        kg.p.j(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        kg.p.V(jArr3, jArr6);
        return new c0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80702e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        return he2.k.D(this.f80702e);
    }

    public c0(long[] jArr) {
        super(2);
        this.f80702e = jArr;
    }
}
