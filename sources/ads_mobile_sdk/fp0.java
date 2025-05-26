package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class fp0 {

    /* renamed from: a, reason: collision with root package name */
    public op0 f5232a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f5233b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5234c = null;

    public final hp0 a() {
        le2 le2Var;
        jl a13;
        op0 op0Var = this.f5232a;
        if (op0Var == null || (le2Var = this.f5233b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (op0Var.f9390a != le2Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (this.f5232a.a() && this.f5234c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f5232a.a() && this.f5234c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        np0 np0Var = this.f5232a.f9392c;
        if (np0Var == np0.f8909e) {
            a13 = ku1.f7535a;
        } else if (np0Var == np0.f8908d || np0Var == np0.f8907c) {
            a13 = ku1.a(this.f5234c.intValue());
        } else {
            if (np0Var != np0.f8906b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f5232a.f9392c);
            }
            a13 = ku1.b(this.f5234c.intValue());
        }
        return new hp0(this.f5232a, this.f5233b, a13, this.f5234c);
    }
}
