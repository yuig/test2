package kq2;

import java.math.BigInteger;
import kh2.p2;

/* loaded from: classes4.dex */
public final class e extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80706i = new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80707h;

    public e() {
        super(f80706i);
        this.f80707h = new hq2.k(this, 5);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f69947d = new BigInteger(1, oq2.a.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new e();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 5);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        f fVar = new f(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f.f80709f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] h03 = p2.h0(bigInteger);
        if (h03[4] == -1) {
            int[] iArr = b.f80676d;
            if (p2.p0(h03, iArr)) {
                p2.e1(iArr, h03);
            }
        }
        fVar.f80710e = h03;
        return fVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80706i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80707h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
