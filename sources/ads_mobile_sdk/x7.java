package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public e8 f13513a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f13514b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f13515c = null;

    public final z7 a() {
        le2 le2Var;
        jl a13;
        e8 e8Var = this.f13513a;
        if (e8Var == null || (le2Var = this.f13514b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (e8Var.f4749a != le2Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (this.f13513a.a() && this.f13515c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f13513a.a() && this.f13515c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        d8 d8Var = this.f13513a.f4751c;
        if (d8Var == d8.f4194e) {
            a13 = ku1.f7535a;
        } else if (d8Var == d8.f4193d || d8Var == d8.f4192c) {
            a13 = ku1.a(this.f13515c.intValue());
        } else {
            if (d8Var != d8.f4191b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f13513a.f4751c);
            }
            a13 = ku1.b(this.f13515c.intValue());
        }
        return new z7(this.f13513a, this.f13514b, a13, this.f13515c);
    }
}
