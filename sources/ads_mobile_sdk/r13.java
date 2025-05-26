package ads_mobile_sdk;

import a.f;
import a.h5;
import a.sd;
import a.ze;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class r13 {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f10414a = new a12(new h5(16), o13.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final l61 f10415b;

    /* renamed from: c, reason: collision with root package name */
    public static final ze f10416c;

    /* renamed from: d, reason: collision with root package name */
    public static final sd f10417d;

    static {
        n41 n41Var = n41.SYMMETRIC;
        n13.u();
        f10415b = new l61("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", a.y9.class, n41Var);
        f10416c = new a.f0();
        f10417d = new f(9);
    }

    public static o13 a(t13 t13Var, Integer num) {
        return o13.a(t13Var.f11320a, le2.a(32), num);
    }

    public static void a() {
        if (l3.c.k()) {
            nv1 nv1Var = u13.f11795a;
            cf1 cf1Var = cf1.f3890b;
            cf1Var.a(u13.f11795a);
            cf1Var.a(u13.f11796b);
            cf1Var.a(u13.f11797c);
            cf1Var.a(u13.f11798d);
            bf1.f2867b.a(f10414a);
            af1 af1Var = af1.f2383b;
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new t13(s13.f10903b));
            hashMap.put("XCHACHA20_POLY1305_RAW", new t13(s13.f10905d));
            af1Var.a(Collections.unmodifiableMap(hashMap));
            ve1.f12474b.a(f10417d, t13.class);
            xe1.f13623b.a(f10416c, t13.class);
            q41 q41Var = q41.f9943d;
            l61 l61Var = f10415b;
            synchronized (q41Var) {
                q41Var.a(l61Var, 1, true);
            }
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }

    public static a.y9 a(o13 o13Var) {
        if (l13.a()) {
            return new l13(o13Var.f9107b.f7789a.a(), o13Var.f9108c.a());
        }
        return new k13(o13Var.f9107b.f7789a.a(), o13Var.f9108c.a());
    }
}
