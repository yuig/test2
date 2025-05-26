package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public o9 f5475a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f5476b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5477c = null;

    public final i9 a() {
        le2 le2Var;
        jl b13;
        o9 o9Var = this.f5475a;
        if (o9Var == null || (le2Var = this.f5476b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (o9Var.f9183a != le2Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (this.f5475a.a() && this.f5477c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f5475a.a() && this.f5477c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        n9 n9Var = this.f5475a.f9186d;
        if (n9Var == n9.f8723d) {
            b13 = ku1.f7535a;
        } else if (n9Var == n9.f8722c) {
            b13 = ku1.a(this.f5477c.intValue());
        } else {
            if (n9Var != n9.f8721b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f5475a.f9186d);
            }
            b13 = ku1.b(this.f5477c.intValue());
        }
        return new i9(this.f5475a, this.f5476b, b13, this.f5477c);
    }
}
