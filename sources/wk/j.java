package wk;

import el.c1;
import el.j0;
import el.l0;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130061a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130062b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130063c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130064d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f130061a = new l0(new a(11), vk.x.class);
        f130062b = new j0(new a(12), c13);
        f130063c = new el.n(new a(13), vk.u.class);
        f130064d = new el.l(new a(14), c13);
    }

    public static o5 a(vk.w wVar) {
        if (vk.w.f126064b.equals(wVar)) {
            return o5.TINK;
        }
        if (vk.w.f126065c.equals(wVar)) {
            return o5.CRUNCHY;
        }
        if (vk.w.f126066d.equals(wVar)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + wVar);
    }

    public static vk.w b(o5 o5Var) {
        int i13 = i.f130060a[o5Var.ordinal()];
        if (i13 == 1) {
            return vk.w.f126064b;
        }
        if (i13 == 2 || i13 == 3) {
            return vk.w.f126065c;
        }
        if (i13 == 4) {
            return vk.w.f126066d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
