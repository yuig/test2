package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class e0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public long[] f80708e;

    public e0(long[] jArr) {
        super(2);
        this.f80708e = jArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = ((e0) dVar).f80708e;
        long[] jArr2 = this.f80708e;
        return new e0(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = this.f80708e;
        return new e0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            return he2.k.h(this.f80708e, ((e0) obj).f80708e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80708e, 4) ^ 23900158;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f80708e;
        if (he2.k.s(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        kh2.j.F2(jArr2, jArr3);
        kh2.j.v2(jArr3, jArr2, jArr3);
        kh2.j.F2(jArr3, jArr3);
        kh2.j.v2(jArr3, jArr2, jArr3);
        kh2.j.G2(3, jArr3, jArr4);
        kh2.j.v2(jArr4, jArr3, jArr4);
        kh2.j.F2(jArr4, jArr4);
        kh2.j.v2(jArr4, jArr2, jArr4);
        kh2.j.G2(7, jArr4, jArr3);
        kh2.j.v2(jArr3, jArr4, jArr3);
        kh2.j.G2(14, jArr3, jArr4);
        kh2.j.v2(jArr4, jArr3, jArr4);
        kh2.j.F2(jArr4, jArr4);
        kh2.j.v2(jArr4, jArr2, jArr4);
        kh2.j.G2(29, jArr4, jArr3);
        kh2.j.v2(jArr3, jArr4, jArr3);
        kh2.j.F2(jArr3, jArr3);
        kh2.j.v2(jArr3, jArr2, jArr3);
        kh2.j.G2(59, jArr3, jArr4);
        kh2.j.v2(jArr4, jArr3, jArr4);
        kh2.j.F2(jArr4, jArr4);
        kh2.j.v2(jArr4, jArr2, jArr4);
        kh2.j.G2(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, jArr4, jArr3);
        kh2.j.v2(jArr3, jArr4, jArr3);
        kh2.j.F2(jArr3, jArr);
        return new e0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        return he2.k.q(this.f80708e);
    }

    @Override // o6.d
    public final boolean m() {
        return he2.k.s(this.f80708e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[4];
        kh2.j.v2(this.f80708e, ((e0) dVar).f80708e, jArr);
        return new e0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((e0) dVar).f80708e;
        long[] jArr2 = ((e0) dVar2).f80708e;
        long[] jArr3 = ((e0) dVar3).f80708e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        kh2.j.e0(this.f80708e, jArr, jArr5);
        kh2.j.m(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        kh2.j.e0(jArr2, jArr3, jArr6);
        kh2.j.m(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        kh2.j.A2(jArr4, jArr7);
        return new e0(jArr7);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f80708e;
        long i13 = p2.i1(jArr2[0]);
        long i14 = p2.i1(jArr2[1]);
        long j13 = (i13 & 4294967295L) | (i14 << 32);
        long j14 = (i13 >>> 32) | (i14 & (-4294967296L));
        long i15 = p2.i1(jArr2[2]);
        long i16 = p2.i1(jArr2[3]);
        long j15 = (i15 & 4294967295L) | (i16 << 32);
        long j16 = (i15 >>> 32) | (i16 & (-4294967296L));
        long j17 = j16 >>> 49;
        long j18 = (j14 >>> 49) | (j16 << 15);
        long j19 = j16 ^ (j14 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL};
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            int i19 = iArr[i17];
            int i23 = i19 >>> 6;
            int i24 = i19 & 63;
            jArr3[i23] = jArr3[i23] ^ (j14 << i24);
            int i25 = i23 + 1;
            int i26 = -i24;
            jArr3[i25] = jArr3[i25] ^ ((j19 << i24) | (j14 >>> i26));
            int i27 = i23 + 2;
            jArr3[i27] = jArr3[i27] ^ ((j18 << i24) | (j19 >>> i26));
            int i28 = i23 + 3;
            jArr3[i28] = jArr3[i28] ^ ((j17 << i24) | (j18 >>> i26));
            int i29 = i23 + 4;
            jArr3[i29] = jArr3[i29] ^ (j17 >>> i26);
            i17++;
        }
        kh2.j.A2(jArr3, jArr);
        jArr[0] = jArr[0] ^ j13;
        jArr[1] = jArr[1] ^ j15;
        return new e0(jArr);
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[4];
        kh2.j.F2(this.f80708e, jArr);
        return new e0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((e0) dVar).f80708e;
        long[] jArr2 = ((e0) dVar2).f80708e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        kh2.j.g0(this.f80708e, jArr4);
        kh2.j.m(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        kh2.j.e0(jArr, jArr2, jArr5);
        kh2.j.m(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        kh2.j.A2(jArr3, jArr6);
        return new e0(jArr6);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80708e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        return he2.k.D(this.f80708e);
    }
}
