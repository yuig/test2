package a;

import ads_mobile_sdk.za0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class a3 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            Cipher cipher = (Cipher) za0.f14687b.f14689a.a("AES/GCM-SIV/NoPadding");
            if (ads_mobile_sdk.ia.a(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }
}
