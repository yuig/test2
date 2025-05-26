package vk;

import el.c1;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final el.l0 f125961a;

    /* renamed from: b, reason: collision with root package name */
    public static final el.j0 f125962b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f125963c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f125964d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f125961a = new el.l0(new c3.e(13), g0.class);
        f125962b = new el.j0(new c3.e(14), c13);
        f125963c = new el.n(new c3.e(15), e0.class);
        f125964d = new el.l(new c3.e(16), c13);
    }

    public static o5 a(f0 f0Var) {
        if (f0.f125949b.equals(f0Var)) {
            return o5.TINK;
        }
        if (f0.f125950c.equals(f0Var)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + f0Var);
    }

    public static f0 b(o5 o5Var) {
        int i13 = h0.f125955a[o5Var.ordinal()];
        if (i13 == 1) {
            return f0.f125949b;
        }
        if (i13 == 2) {
            return f0.f125950c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
