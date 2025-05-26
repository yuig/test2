package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class hs0 {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f6064a;

    public hs0(byte[] bArr) {
        if (!l3.c.o()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f6064a = u9.a(bArr);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, int i13, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i13 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec a13 = u9.a(bArr, 0, bArr.length);
        Cipher cipher = (Cipher) u9.f11886a.get();
        cipher.init(2, this.f6064a, a13);
        if (bArr3 != null && bArr3.length != 0) {
            cipher.updateAAD(bArr3);
        }
        return cipher.doFinal(bArr2, i13, bArr2.length - i13);
    }
}
