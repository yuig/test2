package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class w extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80750i = new BigInteger(1, oq2.a.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80751h;

    public w() {
        super(f80750i);
        this.f80751h = new hq2.k(this, 14);
        this.f69945b = h(new BigInteger(1, oq2.a.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f69947d = new BigInteger(1, oq2.a.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new w();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 14);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        x xVar = new x(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(x.f80752f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] a03 = j1.a0(521, bigInteger);
        if (j1.Y(17, a03, b.D)) {
            for (int i13 = 0; i13 < 17; i13++) {
                a03[i13] = 0;
            }
        }
        xVar.f80753e = a03;
        return xVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80750i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80751h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
