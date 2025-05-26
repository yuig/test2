package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class m extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80729i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80730h;

    public m() {
        super(f80729i);
        this.f80730h = new hq2.k(this, 9);
        this.f69945b = h(hq2.a.f69933a);
        this.f69946c = h(BigInteger.valueOf(5L));
        this.f69947d = new BigInteger(1, oq2.a.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new m();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 9);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        n nVar = new n(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(n.f80731f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] C = kh2.w.C(bigInteger);
        if (C[6] == -1 && kh2.w.T(C, b.f80688p)) {
            j1.C(7, 6803, C);
        }
        nVar.f80733e = C;
        return nVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80729i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80730h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
