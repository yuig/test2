package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class i extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80718i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80719h;

    public i() {
        super(f80718i);
        this.f80719h = new hq2.k(this, 7);
        this.f69945b = h(hq2.a.f69933a);
        this.f69946c = h(BigInteger.valueOf(3L));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new i();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 7);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        j jVar = new j(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(j.f80723f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] H = kh2.r.H(bigInteger);
        if (H[5] == -1) {
            int[] iArr = b.f80682j;
            if (kh2.r.R(H, iArr)) {
                kh2.r.r1(iArr, H);
            }
        }
        jVar.f80724e = H;
        return jVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80718i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80719h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
