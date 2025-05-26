package hq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f69936h;

    /* renamed from: i, reason: collision with root package name */
    public int f69937i;

    /* renamed from: j, reason: collision with root package name */
    public int f69938j;

    /* renamed from: k, reason: collision with root package name */
    public int f69939k;

    /* renamed from: l, reason: collision with root package name */
    public j f69940l;

    public d(int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i13, i14, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    @Override // hq2.f
    public final f a() {
        o6.d dVar = this.f69945b;
        o6.d dVar2 = this.f69946c;
        BigInteger bigInteger = this.f69947d;
        BigInteger bigInteger2 = this.f69948e;
        int i13 = this.f69936h;
        int i14 = this.f69937i;
        int i15 = this.f69938j;
        int i16 = this.f69939k;
        d dVar3 = new d(i13, i14, i15, i16);
        dVar3.f69936h = i13;
        dVar3.f69937i = i14;
        dVar3.f69938j = i15;
        dVar3.f69939k = i16;
        dVar3.f69947d = bigInteger;
        dVar3.f69948e = bigInteger2;
        dVar3.f69940l = new j(dVar3, 0);
        dVar3.f69945b = dVar;
        dVar3.f69946c = dVar2;
        dVar3.f69949f = 6;
        return dVar3;
    }

    @Override // hq2.f
    public final l d(o6.d dVar, o6.d dVar2, boolean z13) {
        return new j(this, dVar, dVar2, z13, 0);
    }

    @Override // hq2.f
    public final o6.d h(BigInteger bigInteger) {
        int i13;
        g gVar = new g(2);
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int bitLength = bigInteger.bitLength();
            int i14 = this.f69936h;
            if (bitLength <= i14) {
                int i15 = this.f69937i;
                int i16 = this.f69938j;
                int i17 = this.f69939k;
                if (i16 == 0 && i17 == 0) {
                    gVar.f69951e = 2;
                    gVar.f69953g = new int[]{i15};
                } else {
                    if (i16 >= i17) {
                        throw new IllegalArgumentException("k2 must be smaller than k3");
                    }
                    if (i16 <= 0) {
                        throw new IllegalArgumentException("k2 must be larger than 0");
                    }
                    gVar.f69951e = 3;
                    gVar.f69953g = new int[]{i15, i16, i17};
                }
                gVar.f69952f = i14;
                m mVar = new m();
                if (bigInteger.signum() < 0) {
                    throw new IllegalArgumentException("invalid F2m field value");
                }
                if (bigInteger.signum() == 0) {
                    mVar.f69969a = new long[]{0};
                } else {
                    byte[] byteArray = bigInteger.toByteArray();
                    int length = byteArray.length;
                    if (byteArray[0] == 0) {
                        length--;
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    int i18 = (length + 7) / 8;
                    mVar.f69969a = new long[i18];
                    int i19 = i18 - 1;
                    int i23 = (length % 8) + i13;
                    if (i13 < i23) {
                        long j13 = 0;
                        while (i13 < i23) {
                            j13 = (j13 << 8) | (byteArray[i13] & 255);
                            i13++;
                        }
                        mVar.f69969a[i19] = j13;
                        i19 = i18 - 2;
                    }
                    while (i19 >= 0) {
                        int i24 = 0;
                        long j14 = 0;
                        while (i24 < 8) {
                            j14 = (j14 << 8) | (byteArray[i13] & 255);
                            i24++;
                            i13++;
                        }
                        mVar.f69969a[i19] = j14;
                        i19--;
                    }
                }
                gVar.f69954h = mVar;
                return gVar;
            }
        }
        throw new IllegalArgumentException("x value invalid in F2m field element");
    }

    @Override // hq2.f
    public final int i() {
        return this.f69936h;
    }

    @Override // hq2.f
    public final l j() {
        return this.f69940l;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 0 || i13 == 1 || i13 == 6;
    }

    public d(int i13, int i14, int i15, int i16, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i13, i14, i15, i16);
        this.f69936h = i13;
        this.f69937i = i14;
        this.f69938j = i15;
        this.f69939k = i16;
        this.f69947d = bigInteger3;
        this.f69948e = bigInteger4;
        this.f69940l = new j(this, 0);
        this.f69945b = h(bigInteger);
        this.f69946c = h(bigInteger2);
        this.f69949f = 6;
    }
}
