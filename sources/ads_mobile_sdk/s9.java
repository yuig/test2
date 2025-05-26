package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class s9 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11006a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11007b;

    public s9(byte[] bArr, jl jlVar) {
        if (!l3.c.o()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11006a = u9.a(bArr);
        this.f11007b = jlVar.a();
    }

    public static a.y9 a(y9 y9Var) {
        da daVar = y9Var.f14150a;
        if (daVar.f4213b != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + y9Var.f14150a.f4213b);
        }
        if (daVar.f4214c == 16) {
            return new s9(y9Var.f14151b.f7789a.a(), y9Var.f14152c);
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + y9Var.f14150a.f4214c);
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.f11007b;
            if (length >= bArr3.length + 28) {
                if (sx2.a(bArr3, bArr)) {
                    AlgorithmParameterSpec a13 = u9.a(bArr, this.f11007b.length, 12);
                    Cipher cipher = (Cipher) u9.f11886a.get();
                    cipher.init(2, this.f11006a, a13);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.f11007b;
                    return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
