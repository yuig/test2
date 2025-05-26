package wk;

import el.c1;
import el.j0;
import el.l0;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130056a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130057b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130058c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130059d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f130056a = new l0(new a(7), vk.t.class);
        f130057b = new j0(new a(8), c13);
        f130058c = new el.n(new a(9), vk.q.class);
        f130059d = new el.l(new a(10), c13);
    }

    public static o5 a(vk.s sVar) {
        if (vk.s.f126035b.equals(sVar)) {
            return o5.TINK;
        }
        if (vk.s.f126036c.equals(sVar)) {
            return o5.CRUNCHY;
        }
        if (vk.s.f126037d.equals(sVar)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + sVar);
    }

    public static vk.s b(o5 o5Var) {
        int i13 = g.f130055a[o5Var.ordinal()];
        if (i13 == 1) {
            return vk.s.f126035b;
        }
        if (i13 == 2 || i13 == 3) {
            return vk.s.f126036c;
        }
        if (i13 == 4) {
            return vk.s.f126037d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }

    public static void c(vk.t tVar) {
        if (tVar.f126045c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(tVar.f126045c)));
        }
        int i13 = tVar.f126044b;
        if (i13 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i13)));
        }
    }
}
