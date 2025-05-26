package a;

import ads_mobile_sdk.za0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class n1 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) za0.f14687b.f14689a.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }
}
