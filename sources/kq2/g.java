package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class g extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80712i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80713h;

    public g() {
        super(f80712i);
        this.f80713h = new hq2.k(this, 6);
        this.f69945b = new h(new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f69946c = new h(new BigInteger(1, oq2.a.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f69947d = new BigInteger(1, oq2.a.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new g();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 6);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        return new h(bigInteger);
    }

    @Override // hq2.f
    public final int i() {
        return f80712i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80713h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
