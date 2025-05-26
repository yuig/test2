package hq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class e extends c {

    /* renamed from: h, reason: collision with root package name */
    public BigInteger f69941h;

    /* renamed from: i, reason: collision with root package name */
    public BigInteger f69942i;

    /* renamed from: j, reason: collision with root package name */
    public k f69943j;

    public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(bigInteger);
        this.f69941h = bigInteger;
        int bitLength = bigInteger.bitLength();
        this.f69942i = (bitLength < 96 || bigInteger.shiftRight(bitLength + (-64)).longValue() != -1) ? null : a.f69934b.shiftLeft(bitLength).subtract(bigInteger);
        this.f69943j = new k(this, 0);
        this.f69945b = h(bigInteger2);
        this.f69946c = h(bigInteger3);
        this.f69947d = bigInteger4;
        this.f69948e = bigInteger5;
        this.f69949f = 4;
    }

    @Override // hq2.f
    public final f a() {
        o6.d dVar = this.f69945b;
        o6.d dVar2 = this.f69946c;
        BigInteger bigInteger = this.f69947d;
        BigInteger bigInteger2 = this.f69948e;
        BigInteger bigInteger3 = this.f69941h;
        e eVar = new e(bigInteger3);
        eVar.f69941h = bigInteger3;
        eVar.f69942i = this.f69942i;
        eVar.f69943j = new k(eVar, 0);
        eVar.f69945b = dVar;
        eVar.f69946c = dVar2;
        eVar.f69947d = bigInteger;
        eVar.f69948e = bigInteger2;
        eVar.f69949f = 4;
        return eVar;
    }

    @Override // hq2.f
    public final l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new k(this, dVar, dVar2, z13, 0);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        return new h(this.f69941h, this.f69942i, bigInteger);
    }

    @Override // hq2.f
    public final int i() {
        return this.f69941h.bitLength();
    }

    @Override // hq2.f
    public final l j() {
        return this.f69943j;
    }

    @Override // hq2.f
    public final l k(l lVar) {
        int i13;
        return (this == lVar.f69962a || this.f69949f != 2 || lVar.f() || !((i13 = lVar.f69962a.f69949f) == 2 || i13 == 3 || i13 == 4)) ? super.k(lVar) : new k(this, h(lVar.f69963b.w()), h(lVar.f69964c.w()), new o6.d[]{h(lVar.f69965d[0].w())}, lVar.f69966e, 0);
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4;
    }
}
