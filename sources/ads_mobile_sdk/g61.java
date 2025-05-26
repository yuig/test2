package ads_mobile_sdk;

import a.f;
import a.sd;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class g61 {

    /* renamed from: a, reason: collision with root package name */
    public static final l61 f5462a;

    /* renamed from: b, reason: collision with root package name */
    public static final sd f5463b;

    /* renamed from: c, reason: collision with root package name */
    public static final a12 f5464c;

    static {
        n41 n41Var = n41.SYMMETRIC;
        d61.u();
        f5462a = new l61("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", a.y9.class, n41Var);
        f5463b = new f(4);
        f5464c = new a12(new a.e(11), q61.class, a.y9.class);
    }

    public static a.y9 a(q61 q61Var) {
        String str = q61Var.f9963a.f11425b;
        Iterator it = a.b0.f12a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(a.a.j("No KMS client does support: ", str));
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public static q61 a(t61 t61Var, Integer num) {
        return q61.a(t61Var, num);
    }

    public static void a() {
        if (l3.c.k()) {
            nv1 nv1Var = u61.f11859a;
            cf1 cf1Var = cf1.f3890b;
            cf1Var.a(u61.f11859a);
            cf1Var.a(u61.f11860b);
            cf1Var.a(u61.f11861c);
            cf1Var.a(u61.f11862d);
            ve1.f12474b.a(f5463b, t61.class);
            bf1.f2867b.a(f5464c);
            q41 q41Var = q41.f9943d;
            l61 l61Var = f5462a;
            synchronized (q41Var) {
                q41Var.a(l61Var, 1, true);
            }
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
