package kq2;

import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class a extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f80670i = new BigInteger(1, oq2.a.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final hq2.k f80671h;

    public a() {
        super(f80670i);
        this.f80671h = new hq2.k(this, 3);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final hq2.f a() {
        return new a();
    }

    @Override // hq2.f
    public final hq2.l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new hq2.k(this, dVar, dVar2, z13, 3);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        BigInteger bigInteger2 = bigInteger;
        c cVar = new c(2);
        if (bigInteger2 == null || bigInteger.signum() < 0 || bigInteger2.compareTo(c.f80700f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        int i13 = 0;
        while (bigInteger2.signum() != 0) {
            iArr[i13] = bigInteger2.intValue();
            bigInteger2 = bigInteger2.shiftRight(32);
            i13++;
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            if (j1.k0(iArr, b.f80673a)) {
                long j13 = (iArr[0] & 4294967295L) - (r5[0] & 4294967295L);
                iArr[0] = (int) j13;
                long j14 = ((iArr[1] & 4294967295L) - (r5[1] & 4294967295L)) + (j13 >> 32);
                iArr[1] = (int) j14;
                long j15 = ((iArr[2] & 4294967295L) - (r5[2] & 4294967295L)) + (j14 >> 32);
                iArr[2] = (int) j15;
                iArr[3] = (int) (((iArr[3] & 4294967295L) - (r5[3] & 4294967295L)) + (j15 >> 32));
            }
        }
        cVar.f80701e = iArr;
        return cVar;
    }

    @Override // hq2.f
    public final int i() {
        return f80670i.bitLength();
    }

    @Override // hq2.f
    public final hq2.l j() {
        return this.f80671h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
