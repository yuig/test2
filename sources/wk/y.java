package wk;

import el.c1;
import el.j0;
import el.l0;
import il.o5;
import java.security.GeneralSecurityException;
import vk.s0;
import vk.u0;
import vk.v0;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130098a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130099b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130100c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130101d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f130098a = new l0(new a(19), v0.class);
        f130099b = new j0(new a(20), c13);
        f130100c = new el.n(new a(21), s0.class);
        f130101d = new el.l(new a(22), c13);
    }

    public static o5 a(u0 u0Var) {
        if (u0.f126055b.equals(u0Var)) {
            return o5.TINK;
        }
        if (u0.f126056c.equals(u0Var)) {
            return o5.CRUNCHY;
        }
        if (u0.f126057d.equals(u0Var)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + u0Var);
    }

    public static u0 b(o5 o5Var) {
        int i13 = x.f130097a[o5Var.ordinal()];
        if (i13 == 1) {
            return u0.f126055b;
        }
        if (i13 == 2 || i13 == 3) {
            return u0.f126056c;
        }
        if (i13 == 4) {
            return u0.f126057d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
