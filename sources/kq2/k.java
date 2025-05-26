package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class k extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80725i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80726h;

    public k() {
        super(f80725i);
        this.f80726h = new hq2.k(this, 8);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new k();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 8);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        l lVar = new l(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(l.f80727f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] H = kh2.r.H(bigInteger);
        if (H[5] == -1) {
            int[] iArr = b.f80685m;
            if (kh2.r.R(H, iArr)) {
                kh2.r.r1(iArr, H);
            }
        }
        lVar.f80728e = H;
        return lVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80725i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80726h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
