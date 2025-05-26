package wk;

import el.c1;
import el.j0;
import el.l0;
import il.f0;
import il.g0;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130050a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130051b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130052c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130053d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f130050a = new l0(new a(3), vk.p.class);
        f130051b = new j0(new a(4), c13);
        f130052c = new el.n(new a(5), vk.m.class);
        f130053d = new el.l(new a(6), c13);
    }

    public static g0 a(vk.p pVar) {
        if (pVar.f126015c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(pVar.f126015c)));
        }
        f0 D = g0.D();
        D.i(pVar.f126014b);
        return (g0) D.a();
    }

    public static o5 b(vk.o oVar) {
        if (vk.o.f126005b.equals(oVar)) {
            return o5.TINK;
        }
        if (vk.o.f126006c.equals(oVar)) {
            return o5.CRUNCHY;
        }
        if (vk.o.f126007d.equals(oVar)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + oVar);
    }

    public static vk.o c(o5 o5Var) {
        int i13 = d.f130049a[o5Var.ordinal()];
        if (i13 == 1) {
            return vk.o.f126005b;
        }
        if (i13 == 2 || i13 == 3) {
            return vk.o.f126006c;
        }
        if (i13 == 4) {
            return vk.o.f126007d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
