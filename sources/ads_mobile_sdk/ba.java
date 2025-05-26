package ads_mobile_sdk;

import a.f;
import a.sd;
import a.ze;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class ba {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f2798a = new a12(new a.e(1), y9.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final l61 f2799b;

    /* renamed from: c, reason: collision with root package name */
    public static final ze f2800c;

    /* renamed from: d, reason: collision with root package name */
    public static final sd f2801d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2802e;

    static {
        n41 n41Var = n41.SYMMETRIC;
        x9.u();
        f2799b = new l61("type.googleapis.com/google.crypto.tink.AesGcmKey", a.y9.class, n41Var);
        f2800c = new a.f0();
        f2801d = new f(1);
        f2802e = 2;
    }

    public static y9 a(da daVar, Integer num) {
        int i13 = daVar.f4212a;
        if (i13 == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        w9 w9Var = new w9();
        w9Var.f12899a = daVar;
        w9Var.f12901c = num;
        w9Var.f12900b = le2.a(i13);
        return w9Var.a();
    }
}
