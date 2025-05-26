package iq2;

import he2.k;
import hq2.f;
import hq2.l;
import java.math.BigInteger;
import o6.d;

/* loaded from: classes4.dex */
public final class a extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f73436i = k.C(b.f73438a);

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f73437h;

    public a() {
        super(f73436i);
        this.f73437h = new hq2.k(this, 1);
        this.f69945b = h(new BigInteger(1, oq2.a.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f69947d = new BigInteger(1, oq2.a.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f69948e = BigInteger.valueOf(8L);
        this.f69949f = 4;
    }

    @Override // hq2.f
    public final f a() {
        return new a();
    }

    @Override // hq2.f
    public final l d(d dVar, d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 1);
    }

    @Override // hq2.f
    public final d h(BigInteger bigInteger) {
        c cVar = new c(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(c.f73440f) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] i13 = k.i(bigInteger);
        while (true) {
            int[] iArr = b.f73438a;
            if (!k.o(i13, iArr)) {
                cVar.f73442e = i13;
                return cVar;
            }
            k.B(iArr, i13);
        }
    }

    @Override // hq2.f
    public final int i() {
        return f73436i.bitLength();
    }

    @Override // hq2.f
    public final l j() {
        return this.f73437h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 4;
    }
}
