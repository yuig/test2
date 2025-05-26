package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class o13 extends a.ab {

    /* renamed from: a, reason: collision with root package name */
    public final t13 f9106a;

    /* renamed from: b, reason: collision with root package name */
    public final le2 f9107b;

    /* renamed from: c, reason: collision with root package name */
    public final jl f9108c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f9109d;

    public o13(t13 t13Var, le2 le2Var, jl jlVar, Integer num) {
        this.f9106a = t13Var;
        this.f9107b = le2Var;
        this.f9108c = jlVar;
        this.f9109d = num;
    }

    public static o13 a(s13 s13Var, le2 le2Var, Integer num) {
        jl b13;
        s13 s13Var2 = s13.f10905d;
        if (s13Var != s13Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + s13Var + " the value of idRequirement must be non-null");
        }
        if (s13Var == s13Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (le2Var.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + le2Var.a());
        }
        t13 t13Var = new t13(s13Var);
        if (s13Var == s13Var2) {
            b13 = ku1.f7535a;
        } else if (s13Var == s13.f10904c) {
            b13 = ku1.a(num.intValue());
        } else {
            if (s13Var != s13.f10903b) {
                throw new IllegalStateException("Unknown Variant: " + s13Var);
            }
            b13 = ku1.b(num.intValue());
        }
        return new o13(t13Var, le2Var, b13, num);
    }

    @Override // a.ab
    public final jl b() {
        return this.f9108c;
    }

    @Override // a.i7
    public final p6 a() {
        return this.f9106a;
    }
}
