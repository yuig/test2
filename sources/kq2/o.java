package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class o extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80734i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80735h;

    public o() {
        super(f80734i);
        this.f80735h = new hq2.k(this, 10);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new o();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 10);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        p pVar = new p(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(p.f80736f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] C = kh2.w.C(bigInteger);
        if (C[6] == -1) {
            if (kh2.w.T(C, b.f80691s)) {
                long j13 = (C[0] & 4294967295L) - (r3[0] & 4294967295L);
                C[0] = (int) j13;
                long j14 = ((C[1] & 4294967295L) - (r3[1] & 4294967295L)) + (j13 >> 32);
                C[1] = (int) j14;
                long j15 = ((C[2] & 4294967295L) - (r3[2] & 4294967295L)) + (j14 >> 32);
                C[2] = (int) j15;
                long j16 = ((C[3] & 4294967295L) - (r3[3] & 4294967295L)) + (j15 >> 32);
                C[3] = (int) j16;
                long j17 = ((C[4] & 4294967295L) - (r3[4] & 4294967295L)) + (j16 >> 32);
                C[4] = (int) j17;
                long j18 = ((C[5] & 4294967295L) - (r3[5] & 4294967295L)) + (j17 >> 32);
                C[5] = (int) j18;
                C[6] = (int) (((C[6] & 4294967295L) - (r3[6] & 4294967295L)) + (j18 >> 32));
            }
        }
        pVar.f80737e = C;
        return pVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80734i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80735h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
