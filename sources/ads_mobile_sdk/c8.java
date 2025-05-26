package ads_mobile_sdk;

import a.f;
import a.m0;
import a.s;
import a.sd;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class c8 {

    /* renamed from: a, reason: collision with root package name */
    public static final sd f3807a = new f(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a12 f3808b = new a12(new a.e(2), z7.class, s.class);

    /* renamed from: c, reason: collision with root package name */
    public static final a12 f3809c = new a12(new a.e(3), z7.class, a.a2.class);

    /* renamed from: d, reason: collision with root package name */
    public static final l61 f3810d;

    static {
        n41 n41Var = n41.SYMMETRIC;
        y7.v();
        f3810d = new l61("type.googleapis.com/google.crypto.tink.AesCmacKey", a.a2.class, n41Var);
    }

    public static z7 a(e8 e8Var, Integer num) {
        int i13 = e8Var.f4749a;
        if (i13 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        x7 x7Var = new x7();
        x7Var.f13513a = e8Var;
        x7Var.f13514b = le2.a(i13);
        x7Var.f13515c = num;
        return x7Var.a();
    }

    public static a.a2 b(z7 z7Var) {
        if (z7Var.f14669a.f4749a == 32) {
            return new w02(z7Var);
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    public static s a(z7 z7Var) {
        if (z7Var.f14669a.f4749a == 32) {
            return new m0(1);
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
