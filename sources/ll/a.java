package ll;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: d, reason: collision with root package name */
    public static final yk.d f83667d = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e, reason: collision with root package name */
    public static final a.g f83668e = new a.g(12);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f83669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83670b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83671c;

    public a(byte[] bArr, int i13) {
        if (!f83667d.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.a(bArr.length);
        this.f83669a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f83668e.get()).getBlockSize();
        this.f83671c = blockSize;
        if (i13 < 12 || i13 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f83670b = i13;
    }

    public final void a(byte[] bArr, int i13, int i14, byte[] bArr2, int i15, byte[] bArr3, boolean z13) {
        Cipher cipher = (Cipher) f83668e.get();
        byte[] bArr4 = new byte[this.f83671c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f83670b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f83669a;
        if (z13) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i13, i14, bArr2, i15) != i14) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
