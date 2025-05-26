package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.n3;
import kh2.p2;

/* loaded from: classes4.dex */
public final class h0 extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final long[] f80717e;

    public h0(BigInteger bigInteger) {
        super(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[9];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        b.t0(jArr, 0);
        this.f80717e = jArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        long[] jArr = new long[9];
        b.b(this.f80717e, ((h0) dVar).f80717e, jArr);
        return new h0(jArr);
    }

    @Override // o6.d
    public final o6.d b() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f80717e;
        jArr[0] = jArr2[0] ^ 1;
        for (int i13 = 1; i13 < 9; i13++) {
            jArr[i13] = jArr2[i13];
        }
        return new h0(jArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        long[] jArr = ((h0) obj).f80717e;
        for (int i13 = 8; i13 >= 0; i13--) {
            if (this.f80717e[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final int h() {
        return 571;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.r.x(this.f80717e, 9) ^ 5711052;
    }

    @Override // o6.d
    public final o6.d k() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f80717e;
        if (n3.w0(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        b.x0(jArr2, jArr5);
        b.x0(jArr5, jArr3);
        b.x0(jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(2, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.I(jArr3, jArr5, jArr3);
        b.O0(5, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(5, jArr4, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(15, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr5);
        b.O0(30, jArr5, jArr3);
        b.O0(30, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(60, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(60, jArr4, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, jArr3, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.O0(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, jArr4, jArr4);
        b.I(jArr3, jArr4, jArr3);
        b.I(jArr3, jArr5, jArr);
        return new h0(jArr);
    }

    @Override // o6.d
    public final boolean l() {
        long[] jArr = this.f80717e;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 9; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final boolean m() {
        return n3.w0(this.f80717e);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        long[] jArr = new long[9];
        b.I(this.f80717e, ((h0) dVar).f80717e, jArr);
        return new h0(jArr);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        long[] jArr = ((h0) dVar).f80717e;
        long[] jArr2 = ((h0) dVar2).f80717e;
        long[] jArr3 = ((h0) dVar3).f80717e;
        long[] jArr4 = new long[18];
        b.Q(this.f80717e, jArr, jArr4);
        b.Q(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        b.b0(jArr4, jArr5);
        return new h0(jArr5);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    @Override // o6.d
    public final o6.d r() {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            long[] jArr4 = this.f80717e;
            if (i13 >= 4) {
                long i15 = p2.i1(jArr4[i14]);
                jArr2[4] = i15 & 4294967295L;
                jArr3[4] = i15 >>> 32;
                b.I(jArr3, b.H, jArr);
                b.b(jArr, jArr2, jArr);
                return new h0(jArr);
            }
            int i16 = i14 + 1;
            long i17 = p2.i1(jArr4[i14]);
            i14 += 2;
            long i18 = p2.i1(jArr4[i16]);
            jArr2[i13] = (i17 & 4294967295L) | (i18 << 32);
            jArr3[i13] = (i17 >>> 32) | ((-4294967296L) & i18);
            i13++;
        }
    }

    @Override // o6.d
    public final o6.d s() {
        long[] jArr = new long[9];
        b.x0(this.f80717e, jArr);
        return new h0(jArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        long[] jArr = ((h0) dVar).f80717e;
        long[] jArr2 = ((h0) dVar2).f80717e;
        long[] jArr3 = new long[18];
        long[] jArr4 = new long[18];
        b.z(this.f80717e, jArr4);
        for (int i13 = 0; i13 < 18; i13++) {
            jArr3[i13] = jArr3[i13] ^ jArr4[i13];
        }
        b.Q(jArr, jArr2, jArr3);
        long[] jArr5 = new long[9];
        b.b0(jArr3, jArr5);
        return new h0(jArr5);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        return (this.f80717e[0] & 1) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        byte[] bArr = new byte[72];
        for (int i13 = 0; i13 < 9; i13++) {
            long j13 = this.f80717e[i13];
            if (j13 != 0) {
                e0.t.N0(j13, (8 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public h0(long[] jArr) {
        super(2);
        this.f80717e = jArr;
    }
}
