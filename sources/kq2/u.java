package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class u extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80746i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80747h;

    public u() {
        super(f80746i);
        this.f80747h = new hq2.k(this, 13);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new u();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 13);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        v vVar = new v(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(v.f80748f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] a03 = j1.a0(384, bigInteger);
        if (a03[11] == -1) {
            int[] iArr = b.A;
            if (j1.j0(12, a03, iArr)) {
                j1.B1(12, iArr, a03);
            }
        }
        vVar.f80749e = a03;
        return vVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80746i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80747h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
