package ads_mobile_sdk;

import a.f;
import a.h5;
import a.sd;
import a.ze;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class pa {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f9605a = new a12(new h5(14), ma.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final sd f9606b = new f(8);

    /* renamed from: c, reason: collision with root package name */
    public static final ze f9607c = new a.f0();

    /* renamed from: d, reason: collision with root package name */
    public static final l61 f9608d;

    static {
        n41 n41Var = n41.SYMMETRIC;
        la.u();
        f9608d = new l61("type.googleapis.com/google.crypto.tink.AesGcmSivKey", a.y9.class, n41Var);
    }

    public static void a() {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        nv1 nv1Var = sa.f11010a;
        cf1 cf1Var = cf1.f3890b;
        cf1Var.a(sa.f11010a);
        cf1Var.a(sa.f11011b);
        cf1Var.a(sa.f11012c);
        cf1Var.a(sa.f11013d);
        af1 af1Var = af1.f2383b;
        HashMap hashMap = new HashMap();
        qa qaVar = qa.f9995b;
        hashMap.put("AES128_GCM_SIV", new ra(16, qaVar));
        qa qaVar2 = qa.f9997d;
        hashMap.put("AES128_GCM_SIV_RAW", new ra(16, qaVar2));
        hashMap.put("AES256_GCM_SIV", new ra(32, qaVar));
        hashMap.put("AES256_GCM_SIV_RAW", new ra(32, qaVar2));
        af1Var.a(Collections.unmodifiableMap(hashMap));
        xe1.f13623b.a(f9607c, ra.class);
        ve1.f12474b.a(f9606b, ra.class);
        bf1.f2867b.a(f9605a);
        q41 q41Var = q41.f9943d;
        l61 l61Var = f9608d;
        synchronized (q41Var) {
            q41Var.a(l61Var, 1, true);
        }
    }

    public static ma a(ra raVar, Integer num) {
        ka kaVar = new ka();
        kaVar.f7182a = raVar;
        kaVar.f7184c = num;
        kaVar.f7183b = le2.a(raVar.f10556a);
        return kaVar.a();
    }
}
