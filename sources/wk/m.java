package wk;

import el.c1;
import el.j0;
import el.l0;
import il.o5;
import java.security.GeneralSecurityException;
import vk.a0;
import vk.b0;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130073a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130074b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130075c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130076d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f130073a = new l0(new a(15), b0.class);
        f130074b = new j0(new a(16), c13);
        f130075c = new el.n(new a(17), vk.y.class);
        f130076d = new el.l(new a(18), c13);
    }

    public static o5 a(a0 a0Var) {
        if (a0.f125926b.equals(a0Var)) {
            return o5.TINK;
        }
        if (a0.f125927c.equals(a0Var)) {
            return o5.CRUNCHY;
        }
        if (a0.f125928d.equals(a0Var)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + a0Var);
    }

    public static a0 b(o5 o5Var) {
        int i13 = l.f130072a[o5Var.ordinal()];
        if (i13 == 1) {
            return a0.f125926b;
        }
        if (i13 == 2 || i13 == 3) {
            return a0.f125927c;
        }
        if (i13 == 4) {
            return a0.f125928d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
