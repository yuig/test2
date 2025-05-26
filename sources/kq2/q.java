package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class q extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80738i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80739h;

    public q() {
        super(f80738i);
        this.f80739h = new hq2.k(this, 11);
        this.f69945b = h(hq2.a.f69933a);
        this.f69946c = h(BigInteger.valueOf(7L));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new q();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 11);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        r rVar = new r(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(r.f80740f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] i13 = he2.k.i(bigInteger);
        if (i13[7] == -1) {
            int[] iArr = b.f80694v;
            if (he2.k.o(i13, iArr)) {
                he2.k.B(iArr, i13);
            }
        }
        rVar.f80741e = i13;
        return rVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80738i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80739h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
