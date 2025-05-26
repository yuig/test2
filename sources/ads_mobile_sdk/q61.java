package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class q61 extends a.ab {

    /* renamed from: a, reason: collision with root package name */
    public final t61 f9963a;

    /* renamed from: b, reason: collision with root package name */
    public final jl f9964b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f9965c;

    public q61(t61 t61Var, jl jlVar, Integer num) {
        this.f9963a = t61Var;
        this.f9964b = jlVar;
        this.f9965c = num;
    }

    public static q61 a(t61 t61Var, Integer num) {
        jl b13;
        s61 s61Var = t61Var.f11424a;
        if (s61Var == s61.f10968c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b13 = ku1.f7535a;
        } else {
            if (s61Var != s61.f10967b) {
                throw new GeneralSecurityException("Unknown Variant: " + t61Var.f11424a);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b13 = ku1.b(num.intValue());
        }
        return new q61(t61Var, b13, num);
    }

    @Override // a.ab
    public final jl b() {
        return this.f9964b;
    }

    @Override // a.i7
    public final p6 a() {
        return this.f9963a;
    }
}
