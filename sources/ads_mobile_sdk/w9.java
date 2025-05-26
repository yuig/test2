package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    public da f12899a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f12900b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f12901c = null;

    public final y9 a() {
        le2 le2Var;
        jl b13;
        da daVar = this.f12899a;
        if (daVar == null || (le2Var = this.f12900b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (daVar.f4212a != le2Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (this.f12899a.a() && this.f12901c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f12899a.a() && this.f12901c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ca caVar = this.f12899a.f4215d;
        if (caVar == ca.f3833d) {
            b13 = ku1.f7535a;
        } else if (caVar == ca.f3832c) {
            b13 = ku1.a(this.f12901c.intValue());
        } else {
            if (caVar != ca.f3831b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f12899a.f4215d);
            }
            b13 = ku1.b(this.f12901c.intValue());
        }
        return new y9(this.f12899a, this.f12900b, b13, this.f12901c);
    }
}
