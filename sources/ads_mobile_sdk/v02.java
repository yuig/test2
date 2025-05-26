package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class v02 implements a.wa {

    /* renamed from: a, reason: collision with root package name */
    public final u02 f12277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12278b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f12279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12280d;

    public v02(String str, SecretKeySpec secretKeySpec) {
        u02 u02Var = new u02(this);
        this.f12277a = u02Var;
        if (!l3.c.o()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f12278b = str;
        this.f12279c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f12280d = 20;
                break;
            case "HMACSHA224":
                this.f12280d = 28;
                break;
            case "HMACSHA256":
                this.f12280d = 32;
                break;
            case "HMACSHA384":
                this.f12280d = 48;
                break;
            case "HMACSHA512":
                this.f12280d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        u02Var.get();
    }

    @Override // a.wa
    public final byte[] a(int i13, byte[] bArr) {
        if (i13 > this.f12280d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f12277a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f12277a.get()).doFinal(), i13);
    }
}
