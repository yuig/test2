package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    public ra f7182a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f7183b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7184c = null;

    public final ma a() {
        le2 le2Var;
        jl b13;
        ra raVar = this.f7182a;
        if (raVar == null || (le2Var = this.f7183b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (raVar.f10556a != le2Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (this.f7182a.a() && this.f7184c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f7182a.a() && this.f7184c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        qa qaVar = this.f7182a.f10557b;
        if (qaVar == qa.f9997d) {
            b13 = ku1.f7535a;
        } else if (qaVar == qa.f9996c) {
            b13 = ku1.a(this.f7184c.intValue());
        } else {
            if (qaVar != qa.f9995b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f7182a.f10557b);
            }
            b13 = ku1.b(this.f7184c.intValue());
        }
        return new ma(this.f7182a, this.f7183b, b13, this.f7184c);
    }
}
