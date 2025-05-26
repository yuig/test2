package ads_mobile_sdk;

import a.f;
import a.h5;
import a.sd;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class rm {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f10680a = new a12(new h5(21), om.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final sd f10681b = new f(10);

    /* renamed from: c, reason: collision with root package name */
    public static final l61 f10682c;

    static {
        n41 n41Var = n41.SYMMETRIC;
        nm.u();
        f10682c = new l61("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", a.y9.class, n41Var);
    }

    public static om a(tm tmVar, Integer num) {
        return om.a(tmVar.f11593a, le2.a(32), num);
    }

    public static void a() {
        if (l3.c.k()) {
            nv1 nv1Var = um.f12111a;
            cf1 cf1Var = cf1.f3890b;
            cf1Var.a(um.f12111a);
            cf1Var.a(um.f12112b);
            cf1Var.a(um.f12113c);
            cf1Var.a(um.f12114d);
            bf1.f2867b.a(f10680a);
            ve1.f12474b.a(f10681b, tm.class);
            af1 af1Var = af1.f2383b;
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new tm(sm.f11146b));
            hashMap.put("CHACHA20_POLY1305_RAW", new tm(sm.f11148d));
            af1Var.a(Collections.unmodifiableMap(hashMap));
            q41 q41Var = q41.f9943d;
            l61 l61Var = f10682c;
            synchronized (q41Var) {
                q41Var.a(l61Var, 1, true);
            }
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }

    public static a.y9 a(om omVar) {
        if (lm.a()) {
            return new lm(omVar.f9366b.f7789a.a(), omVar.f9367c.a());
        }
        return new jm(omVar.f9366b.f7789a.a(), omVar.f9367c.a());
    }
}
