package kq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class s extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80742i = new BigInteger(1, oq2.a.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80743h;

    public s() {
        super(f80742i);
        this.f80743h = new hq2.k(this, 12);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new s();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 12);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        t tVar = new t(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(t.f80744f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] i13 = he2.k.i(bigInteger);
        if (i13[7] == -1) {
            int[] iArr = b.f80697y;
            if (he2.k.o(i13, iArr)) {
                he2.k.B(iArr, i13);
            }
        }
        tVar.f80745e = i13;
        return tVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80742i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80743h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
