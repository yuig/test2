package ads_mobile_sdk;

import a.nd;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class v8 implements a.r9 {

    /* renamed from: d, reason: collision with root package name */
    public static final nd f12390d = new nd();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f12391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12393c;

    public v8(int i13, byte[] bArr) {
        if (!l3.c.o()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        kh2.b0.B(bArr.length);
        this.f12391a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f12390d.get()).getBlockSize();
        this.f12393c = blockSize;
        if (i13 < 12 || i13 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f12392b = i13;
    }
}
