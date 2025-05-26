package vk;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class s0 extends b {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f126039b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f126040c;

    /* renamed from: d, reason: collision with root package name */
    public final ml.a f126041d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f126042e;

    public s0(v0 v0Var, ll.j jVar, ml.a aVar, Integer num) {
        this.f126039b = v0Var;
        this.f126040c = jVar;
        this.f126041d = aVar;
        this.f126042e = num;
    }

    public static s0 j(u0 u0Var, ll.j jVar, Integer num) {
        ml.a b13;
        u0 u0Var2 = u0.f126057d;
        if (u0Var != u0Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + u0Var + " the value of idRequirement must be non-null");
        }
        if (u0Var == u0Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (jVar.I() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + jVar.I());
        }
        v0 v0Var = new v0(u0Var);
        if (u0Var == u0Var2) {
            b13 = el.i0.f59494a;
        } else if (u0Var == u0.f126056c) {
            b13 = el.i0.a(num.intValue());
        } else {
            if (u0Var != u0.f126055b) {
                throw new IllegalStateException("Unknown Variant: " + u0Var);
            }
            b13 = el.i0.b(num.intValue());
        }
        return new s0(v0Var, jVar, b13, num);
    }
}
