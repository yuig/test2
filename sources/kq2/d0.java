package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class d0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80705e;

    public d0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        long[] j13 = he2.k.j(bigInteger);
        long j14 = j13[3];
        long j15 = j14 >>> 41;
        j13[0] = j13[0] ^ j15;
        j13[1] = (j15 << 10) ^ j13[1];
        j13[3] = j14 & 2199023255551L;
        this.f80705e = j13;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((d0) dVar).f80705e;
        long[] jArr2 = this.f80705e;
        return new d0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80705e;
        return new d0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return he2.k.h(this.f80705e, ((d0) obj).f80705e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80705e, 4) ^ 2330074;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f80705e;
        if (he2.k.s(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        kg.t.Y0(jArr2, jArr3);
        kg.t.P0(jArr3, jArr2, jArr3);
        kg.t.Y0(jArr3, jArr3);
        kg.t.P0(jArr3, jArr2, jArr3);
        kg.t.Z0(3, jArr3, jArr4);
        kg.t.P0(jArr4, jArr3, jArr4);
        kg.t.Y0(jArr4, jArr4);
        kg.t.P0(jArr4, jArr2, jArr4);
        kg.t.Z0(7, jArr4, jArr3);
        kg.t.P0(jArr3, jArr4, jArr3);
        kg.t.Z0(14, jArr3, jArr4);
        kg.t.P0(jArr4, jArr3, jArr4);
        kg.t.Y0(jArr4, jArr4);
        kg.t.P0(jArr4, jArr2, jArr4);
        kg.t.Z0(29, jArr4, jArr3);
        kg.t.P0(jArr3, jArr4, jArr3);
        kg.t.Z0(58, jArr3, jArr4);
        kg.t.P0(jArr4, jArr3, jArr4);
        kg.t.Z0(RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, jArr4, jArr3);
        kg.t.P0(jArr3, jArr4, jArr3);
        kg.t.Y0(jArr3, jArr);
        return new d0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        return he2.k.q(this.f80705e);
    }

    @Override // o6.d
    public final boolean m() {
        return he2.k.s(this.f80705e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[4];
        kg.t.P0(this.f80705e, ((d0) dVar).f80705e, jArr);
        return new d0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((d0) dVar).f80705e;
        long[] jArr2 = ((d0) dVar2).f80705e;
        long[] jArr3 = ((d0) dVar3).f80705e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        kg.t.S(this.f80705e, jArr, jArr5);
        kg.t.i(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        kg.t.S(jArr2, jArr3, jArr6);
        kg.t.i(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        kg.t.S0(jArr4, jArr7);
        return new d0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f80705e;
        long i13 = p2.i1(jArr2[0]);
        long i14 = p2.i1(jArr2[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long j14 = (i13 >>> 32) | (i14 & (-4294967296L));
        long i15 = p2.i1(jArr2[2]);
        long i16 = p2.i1(jArr2[3]);
        long j15 = (4294967295L & i15) | (i16 << 32);
        long j16 = (i15 >>> 32) | (i16 & (-4294967296L));
        long j17 = j16 >>> 27;
        long j18 = j16 ^ ((j14 >>> 27) | (j16 << 37));
        long j19 = j14 ^ (j14 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO};
        int i17 = 3;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = iArr[i18];
            int i23 = i19 >>> 6;
            int i24 = i19 & 63;
            jArr3[i23] = jArr3[i23] ^ (j19 << i24);
            int i25 = i23 + 1;
            int i26 = -i24;
            jArr3[i25] = jArr3[i25] ^ ((j18 << i24) | (j19 >>> i26));
            int i27 = i23 + 2;
            jArr3[i27] = jArr3[i27] ^ ((j17 << i24) | (j18 >>> i26));
            i17 = 3;
            int i28 = i23 + 3;
            jArr3[i28] = jArr3[i28] ^ (j17 >>> i26);
        }
        kg.t.S0(jArr3, jArr);
        jArr[0] = jArr[0] ^ j13;
        jArr[1] = jArr[1] ^ j15;
        return new d0(jArr);
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[4];
        kg.t.Y0(this.f80705e, jArr);
        return new d0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((d0) dVar).f80705e;
        long[] jArr2 = ((d0) dVar2).f80705e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        kg.t.U(this.f80705e, jArr4);
        kg.t.i(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        kg.t.S(jArr, jArr2, jArr5);
        kg.t.i(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        kg.t.S0(jArr3, jArr6);
        return new d0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80705e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        return he2.k.D(this.f80705e);
    }

    public d0(long[] jArr) {
        super(2);
        this.f80705e = jArr;
    }
}
