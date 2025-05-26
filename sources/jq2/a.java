package jq2;

import hq2.f;
import hq2.k;
import hq2.l;
import java.math.BigInteger;
import o6.d;

/* loaded from: classes4.dex */
public final class a extends hq2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f77520i = new BigInteger(1, oq2.a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: h, reason: collision with root package name */
    public final k f77521h;

    public a() {
        super(f77520i);
        this.f77521h = new k(this, 2);
        this.f69945b = h(new BigInteger(1, oq2.a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f69946c = h(new BigInteger(1, oq2.a.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.f69947d = new BigInteger(1, oq2.a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f69948e = BigInteger.valueOf(1L);
        this.f69949f = 2;
    }

    @Override // hq2.f
    public final f a() {
        return new a();
    }

    @Override // hq2.f
    public final l d(d dVar, d dVar2, boolean z13) {
        return new k(this, dVar, dVar2, z13, 2);
    }

    @Override // hq2.f
    public final d h(BigInteger bigInteger) {
        c cVar = new c(2);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(c.f77524f) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] i13 = he2.k.i(bigInteger);
        if ((i13[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = b.f77522a;
            if (he2.k.o(i13, iArr)) {
                he2.k.B(iArr, i13);
            }
        }
        cVar.f77525e = i13;
        return cVar;
    }

    @Override // hq2.f
    public final int i() {
        return f77520i.bitLength();
    }

    @Override // hq2.f
    public final l j() {
        return this.f77521h;
    }

    @Override // hq2.f
    public final boolean l(int i13) {
        return i13 == 2;
    }
}
