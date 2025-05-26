package a;

import ads_mobile_sdk.lm;
import ads_mobile_sdk.za0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class b7 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Cipher cipher;
        try {
            cipher = (Cipher) za0.f14687b.f14689a.a("ChaCha20-Poly1305");
        } catch (GeneralSecurityException unused) {
        }
        if (lm.a(cipher)) {
            return cipher;
        }
        return null;
    }
}
