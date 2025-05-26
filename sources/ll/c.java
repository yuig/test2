package ll;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class c implements uk.a {

    /* renamed from: c, reason: collision with root package name */
    public static final yk.d f83690c = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f83691a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83692b;

    public c(byte[] bArr, ml.a aVar) {
        if (!f83690c.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        a.g gVar = wk.f.f130054a;
        j0.a(bArr.length);
        this.f83691a = new SecretKeySpec(bArr, "AES");
        this.f83692b = aVar.b();
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] s13 = jk.r.s(12);
        AlgorithmParameterSpec a13 = wk.f.a(s13, 0, s13.length);
        Cipher cipher = (Cipher) wk.f.f130054a.get();
        cipher.init(1, this.f83691a, a13);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f83692b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(s13, 0, copyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f83692b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec a13 = wk.f.a(bArr, bArr3.length, 12);
        Cipher cipher = (Cipher) wk.f.f130054a.get();
        cipher.init(2, this.f83691a, a13);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
