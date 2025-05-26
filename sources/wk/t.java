package wk;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final yk.d f130088b = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f130089a;

    public t(byte[] bArr) {
        if (!f130088b.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (((Cipher) k.f130069g.get()) == null) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f130089a = new SecretKeySpec(bArr, "ChaCha20");
    }
}
