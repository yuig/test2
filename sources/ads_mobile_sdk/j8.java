package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public s8 f6723a = null;

    /* renamed from: b, reason: collision with root package name */
    public le2 f6724b = null;

    /* renamed from: c, reason: collision with root package name */
    public le2 f6725c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f6726d = null;

    public final l8 a() {
        jl b13;
        s8 s8Var = this.f6723a;
        if (s8Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        le2 le2Var = this.f6724b;
        if (le2Var == null || this.f6725c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (s8Var.f10994a != le2Var.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (this.f6723a.f10995b != this.f6725c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f6723a.a() && this.f6726d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f6723a.a() && this.f6726d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        r8 r8Var = this.f6723a.f10998e;
        if (r8Var == r8.f10544d) {
            b13 = ku1.f7535a;
        } else if (r8Var == r8.f10543c) {
            b13 = ku1.a(this.f6726d.intValue());
        } else {
            if (r8Var != r8.f10542b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f6723a.f10998e);
            }
            b13 = ku1.b(this.f6726d.intValue());
        }
        return new l8(this.f6723a, this.f6724b, this.f6725c, b13, this.f6726d);
    }
}
