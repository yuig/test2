package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class d extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80703i = g.f80712i;

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80704h;

    public d() {
        super(f80703i);
        this.f80704h = new hq2.k(this, 4);
        this.f69945b = new h(hq2.a.f69933a);
        this.f69946c = new h(BigInteger.valueOf(7L));
        this.f69947d = new BigInteger(1, oq2.a.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new d();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 4);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        return new h(bigInteger);
    }

    @Override // hq2.f
    public final int i() {
        return f80703i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80704h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
