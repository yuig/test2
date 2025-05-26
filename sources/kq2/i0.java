package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class i0 extends hq2.b {

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f80720i;

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f80721j;

    /* renamed from: h, reason: collision with root package name */
    public final hq2.j f80722h;

    static {
        h0 h0Var = new h0(new BigInteger(1, oq2.a.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f80720i = h0Var;
        f80721j = (h0) h0Var.r();
    }

    public i0() {
        super(571, 2, 5, 10);
        this.f80722h = new hq2.j(this, 18);
        this.f69945b = new h0(BigInteger.valueOf(1L));
        this.f69946c = f80720i;
        this.f69947d = new BigInteger(1, oq2.a.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f69948e = BigInteger.valueOf(2L);
        this.f69949f = 6;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new i0();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.j(this, dVar, dVar2, z13, 18);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        return new h0(bigInteger);
    }

    @Override // hq2.f
    public final int i() {
        return 571;
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80722h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 6;
    }
}
