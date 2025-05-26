package jl;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c0 extends bl.v {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f76809g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f76810a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f76811b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f76812c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f76813d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f76814e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76815f;

    public c0(int i13, BigInteger bigInteger, b0 b0Var, a0 a0Var, a0 a0Var2, int i14) {
        this.f76810a = i13;
        this.f76811b = bigInteger;
        this.f76812c = b0Var;
        this.f76813d = a0Var;
        this.f76814e = a0Var2;
        this.f76815f = i14;
    }

    public static z b() {
        z zVar = new z();
        zVar.f76929a = null;
        zVar.f76930b = f76809g;
        zVar.f76931c = null;
        zVar.f76932d = null;
        zVar.f76933e = null;
        zVar.f76934f = b0.f76804e;
        return zVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f76812c != b0.f76804e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f76810a == this.f76810a && Objects.equals(c0Var.f76811b, this.f76811b) && Objects.equals(c0Var.f76812c, this.f76812c) && Objects.equals(c0Var.f76813d, this.f76813d) && Objects.equals(c0Var.f76814e, this.f76814e) && c0Var.f76815f == this.f76815f;
    }

    public final int hashCode() {
        return Objects.hash(c0.class, Integer.valueOf(this.f76810a), this.f76811b, this.f76812c, this.f76813d, this.f76814e, Integer.valueOf(this.f76815f));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RSA SSA PSS Parameters (variant: ");
        sb3.append(this.f76812c);
        sb3.append(", signature hashType: ");
        sb3.append(this.f76813d);
        sb3.append(", mgf1 hashType: ");
        sb3.append(this.f76814e);
        sb3.append(", saltLengthBytes: ");
        sb3.append(this.f76815f);
        sb3.append(", publicExponent: ");
        sb3.append(this.f76811b);
        sb3.append(", and ");
        return a.a.n(sb3, this.f76810a, "-bit modulus)");
    }
}
