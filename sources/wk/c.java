package wk;

import el.c1;
import el.j0;
import el.l0;
import il.d3;
import il.l3;
import il.m3;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f130045a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f130046b;

    /* renamed from: c, reason: collision with root package name */
    public static final el.n f130047c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.l f130048d;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f130045a = new l0(new c3.e(29), vk.l.class);
        f130046b = new j0(new a(0), c13);
        f130047c = new el.n(new a(1), vk.f.class);
        f130048d = new el.l(new a(2), c13);
    }

    public static m3 a(vk.l lVar) {
        d3 d3Var;
        l3 F = m3.F();
        F.j(lVar.f125987d);
        vk.j jVar = vk.j.f125965b;
        vk.j jVar2 = lVar.f125989f;
        if (jVar.equals(jVar2)) {
            d3Var = d3.SHA1;
        } else if (vk.j.f125966c.equals(jVar2)) {
            d3Var = d3.SHA224;
        } else if (vk.j.f125967d.equals(jVar2)) {
            d3Var = d3.SHA256;
        } else if (vk.j.f125968e.equals(jVar2)) {
            d3Var = d3.SHA384;
        } else {
            if (!vk.j.f125969f.equals(jVar2)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + jVar2);
            }
            d3Var = d3.SHA512;
        }
        F.i(d3Var);
        return (m3) F.a();
    }

    public static vk.j b(d3 d3Var) {
        int i13 = b.f130044b[d3Var.ordinal()];
        if (i13 == 1) {
            return vk.j.f125965b;
        }
        if (i13 == 2) {
            return vk.j.f125966c;
        }
        if (i13 == 3) {
            return vk.j.f125967d;
        }
        if (i13 == 4) {
            return vk.j.f125968e;
        }
        if (i13 == 5) {
            return vk.j.f125969f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + d3Var.getNumber());
    }

    public static o5 c(vk.k kVar) {
        if (vk.k.f125973b.equals(kVar)) {
            return o5.TINK;
        }
        if (vk.k.f125974c.equals(kVar)) {
            return o5.CRUNCHY;
        }
        if (vk.k.f125975d.equals(kVar)) {
            return o5.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + kVar);
    }

    public static vk.k d(o5 o5Var) {
        int i13 = b.f130043a[o5Var.ordinal()];
        if (i13 == 1) {
            return vk.k.f125973b;
        }
        if (i13 == 2 || i13 == 3) {
            return vk.k.f125974c;
        }
        if (i13 == 4) {
            return vk.k.f125975d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
