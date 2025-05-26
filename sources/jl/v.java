package jl;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v extends bl.v {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f76905e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f76906a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f76907b;

    /* renamed from: c, reason: collision with root package name */
    public final u f76908c;

    /* renamed from: d, reason: collision with root package name */
    public final t f76909d;

    public v(int i13, BigInteger bigInteger, u uVar, t tVar) {
        this.f76906a = i13;
        this.f76907b = bigInteger;
        this.f76908c = uVar;
        this.f76909d = tVar;
    }

    public static s b() {
        s sVar = new s();
        sVar.f76892a = null;
        sVar.f76893b = f76905e;
        sVar.f76894c = null;
        sVar.f76895d = u.f76903e;
        return sVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f76908c != u.f76903e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f76906a == this.f76906a && Objects.equals(vVar.f76907b, this.f76907b) && vVar.f76908c == this.f76908c && vVar.f76909d == this.f76909d;
    }

    public final int hashCode() {
        return Objects.hash(v.class, Integer.valueOf(this.f76906a), this.f76907b, this.f76908c, this.f76909d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RSA SSA PKCS1 Parameters (variant: ");
        sb3.append(this.f76908c);
        sb3.append(", hashType: ");
        sb3.append(this.f76909d);
        sb3.append(", publicExponent: ");
        sb3.append(this.f76907b);
        sb3.append(", and ");
        return a.a.n(sb3, this.f76906a, "-bit modulus)");
    }
}
