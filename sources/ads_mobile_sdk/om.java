package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class om extends a.ab {

    /* renamed from: a, reason: collision with root package name */
    public final tm f9365a;

    /* renamed from: b, reason: collision with root package name */
    public final le2 f9366b;

    /* renamed from: c, reason: collision with root package name */
    public final jl f9367c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f9368d;

    public om(tm tmVar, le2 le2Var, jl jlVar, Integer num) {
        this.f9365a = tmVar;
        this.f9366b = le2Var;
        this.f9367c = jlVar;
        this.f9368d = num;
    }

    public static om a(sm smVar, le2 le2Var, Integer num) {
        jl b13;
        sm smVar2 = sm.f11148d;
        if (smVar != smVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + smVar + " the value of idRequirement must be non-null");
        }
        if (smVar == smVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (le2Var.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + le2Var.a());
        }
        tm tmVar = new tm(smVar);
        if (smVar == smVar2) {
            b13 = ku1.f7535a;
        } else if (smVar == sm.f11147c) {
            b13 = ku1.a(num.intValue());
        } else {
            if (smVar != sm.f11146b) {
                throw new IllegalStateException("Unknown Variant: " + smVar);
            }
            b13 = ku1.b(num.intValue());
        }
        return new om(tmVar, le2Var, b13, num);
    }

    @Override // a.ab
    public final jl b() {
        return this.f9367c;
    }

    @Override // a.i7
    public final p6 a() {
        return this.f9365a;
    }
}
