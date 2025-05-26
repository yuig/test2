package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class b13 extends a.ab {

    /* renamed from: a, reason: collision with root package name */
    public final g13 f2631a;

    /* renamed from: b, reason: collision with root package name */
    public final le2 f2632b;

    /* renamed from: c, reason: collision with root package name */
    public final jl f2633c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f2634d;

    public b13(g13 g13Var, le2 le2Var, jl jlVar, Integer num) {
        this.f2631a = g13Var;
        this.f2632b = le2Var;
        this.f2633c = jlVar;
        this.f2634d = num;
    }

    public static b13 a(g13 g13Var, le2 le2Var, Integer num) {
        jl b13;
        f13 f13Var = g13Var.f5353a;
        f13 f13Var2 = f13.f5010c;
        if (f13Var != f13Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + g13Var.f5353a + " the value of idRequirement must be non-null");
        }
        if (f13Var == f13Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (le2Var.a() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + le2Var.a());
        }
        f13 f13Var3 = g13Var.f5353a;
        if (f13Var3 == f13Var2) {
            b13 = ku1.f7535a;
        } else {
            if (f13Var3 != f13.f5009b) {
                throw new IllegalStateException("Unknown Variant: " + g13Var.f5353a);
            }
            b13 = ku1.b(num.intValue());
        }
        return new b13(g13Var, le2Var, b13, num);
    }

    @Override // a.ab
    public final jl b() {
        return this.f2633c;
    }

    @Override // a.i7
    public final p6 a() {
        return this.f2631a;
    }
}
