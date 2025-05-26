package ads_mobile_sdk;

import a.a3;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class ha implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f5909a = new a3();

    public static Cipher a() {
        try {
            Cipher cipher = (Cipher) f5909a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e13) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e13);
        }
    }

    public static a.y9 a(ma maVar) {
        a.e eVar = new a.e(25);
        byte[] bArr = ia.f6287d;
        if (ia.a((Cipher) eVar.d())) {
            return new ia(maVar.f8144b.f7789a.a(), maVar.f8145c.a(), eVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }
}
