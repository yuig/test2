package ads_mobile_sdk;

import a.f;
import a.sd;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class a61 {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f2283a = new a12(new a.e(0), m61.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final l61 f2284b;

    /* renamed from: c, reason: collision with root package name */
    public static final sd f2285c;

    static {
        n41 n41Var = n41.REMOTE;
        x51.u();
        f2284b = new l61("type.googleapis.com/google.crypto.tink.KmsAeadKey", a.y9.class, n41Var);
        f2285c = new f(0);
    }

    public static a.y9 a(m61 m61Var) {
        String str = m61Var.f8108a.f9154a;
        Iterator it = a.b0.f12a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(a.a.j("No KMS client does support: ", str));
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public static m61 a(o61 o61Var, Integer num) {
        return m61.a(o61Var, num);
    }

    public static void a() {
        if (l3.c.k()) {
            nv1 nv1Var = p61.f9568a;
            cf1 cf1Var = cf1.f3890b;
            cf1Var.a(p61.f9568a);
            cf1Var.a(p61.f9569b);
            cf1Var.a(p61.f9570c);
            cf1Var.a(p61.f9571d);
            bf1.f2867b.a(f2283a);
            ve1.f12474b.a(f2285c, o61.class);
            q41 q41Var = q41.f9943d;
            l61 l61Var = f2284b;
            synchronized (q41Var) {
                q41Var.a(l61Var, 1, true);
            }
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
