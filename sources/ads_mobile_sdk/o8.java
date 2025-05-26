package ads_mobile_sdk;

import a.f;
import a.h5;
import a.sd;
import a.ze;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f9168a = new a12(new h5(9), l8.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final l61 f9169b;

    /* renamed from: c, reason: collision with root package name */
    public static final ze f9170c;

    /* renamed from: d, reason: collision with root package name */
    public static final sd f9171d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9172e;

    static {
        n41 n41Var = n41.SYMMETRIC;
        k8.v();
        f9169b = new l61("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", a.y9.class, n41Var);
        f9170c = new a.f0();
        f9171d = new f(7);
        f9172e = 2;
    }

    public static l8 a(s8 s8Var, Integer num) {
        int i13 = s8Var.f10994a;
        if (i13 != 16 && i13 != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        j8 j8Var = new j8();
        j8Var.f6723a = s8Var;
        j8Var.f6726d = num;
        j8Var.f6724b = le2.a(i13);
        j8Var.f6725c = le2.a(s8Var.f10995b);
        return j8Var.a();
    }
}
