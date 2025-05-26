package ads_mobile_sdk;

import a.f;
import a.h5;
import a.sd;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class l9 {

    /* renamed from: a, reason: collision with root package name */
    public static final a12 f7732a = new a12(new h5(8), i9.class, a.y9.class);

    /* renamed from: b, reason: collision with root package name */
    public static final l61 f7733b;

    /* renamed from: c, reason: collision with root package name */
    public static final sd f7734c;

    static {
        n41 n41Var = n41.SYMMETRIC;
        h9.v();
        f7733b = new l61("type.googleapis.com/google.crypto.tink.AesEaxKey", a.y9.class, n41Var);
        f7734c = new f(6);
    }

    public static i9 a(o9 o9Var, Integer num) {
        int i13 = o9Var.f9183a;
        if (i13 == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        g9 g9Var = new g9();
        g9Var.f5475a = o9Var;
        g9Var.f5477c = num;
        g9Var.f5476b = le2.a(i13);
        return g9Var.a();
    }
}
