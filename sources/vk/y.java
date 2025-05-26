package vk;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class y extends b {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f126070b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f126071c;

    /* renamed from: d, reason: collision with root package name */
    public final ml.a f126072d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f126073e;

    public y(b0 b0Var, ll.j jVar, ml.a aVar, Integer num) {
        this.f126070b = b0Var;
        this.f126071c = jVar;
        this.f126072d = aVar;
        this.f126073e = num;
    }

    public static y j(a0 a0Var, ll.j jVar, Integer num) {
        ml.a b13;
        a0 a0Var2 = a0.f125928d;
        if (a0Var != a0Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + a0Var + " the value of idRequirement must be non-null");
        }
        if (a0Var == a0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (jVar.I() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + jVar.I());
        }
        b0 b0Var = new b0(a0Var);
        if (a0Var == a0Var2) {
            b13 = el.i0.f59494a;
        } else if (a0Var == a0.f125927c) {
            b13 = el.i0.a(num.intValue());
        } else {
            if (a0Var != a0.f125926b) {
                throw new IllegalStateException("Unknown Variant: " + a0Var);
            }
            b13 = el.i0.b(num.intValue());
        }
        return new y(b0Var, jVar, b13, num);
    }
}
