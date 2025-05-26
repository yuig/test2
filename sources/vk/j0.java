package vk;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class j0 extends b {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f125971b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f125972c;

    public j0(m0 m0Var, ml.a aVar, Integer num) {
        this.f125971b = m0Var;
        this.f125972c = num;
    }

    public static j0 j(m0 m0Var, Integer num) {
        ml.a b13;
        l0 l0Var = m0Var.f125997a;
        if (l0Var == l0.f125991c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b13 = el.i0.f59494a;
        } else {
            if (l0Var != l0.f125990b) {
                throw new GeneralSecurityException("Unknown Variant: " + m0Var.f125997a);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b13 = el.i0.b(num.intValue());
        }
        return new j0(m0Var, b13, num);
    }
}
