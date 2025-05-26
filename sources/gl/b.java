package gl;

import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import fl.q;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f65721a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f65722b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f65723c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f65724d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f65721a = new l0(new q(5), fl.d.class);
        f65722b = new j0(new q(6), c13);
        f65723c = new n(new q(7), fl.a.class);
        f65724d = new l(new q(8), c13);
    }

    public static o5 a(fl.c cVar) {
        if (fl.c.f62504b.equals(cVar)) {
            return o5.TINK;
        }
        if (fl.c.f62505c.equals(cVar)) {
            return o5.CRUNCHY;
        }
        if (fl.c.f62507e.equals(cVar)) {
            return o5.RAW;
        }
        if (fl.c.f62506d.equals(cVar)) {
            return o5.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static fl.c b(o5 o5Var) {
        int i13 = a.f65720a[o5Var.ordinal()];
        if (i13 == 1) {
            return fl.c.f62504b;
        }
        if (i13 == 2) {
            return fl.c.f62505c;
        }
        if (i13 == 3) {
            return fl.c.f62506d;
        }
        if (i13 == 4) {
            return fl.c.f62507e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
