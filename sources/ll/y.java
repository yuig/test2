package ll;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class y implements hl.a {

    /* renamed from: e, reason: collision with root package name */
    public static final yk.d f83782e = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    public final x f83783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83784b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f83785c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83786d;

    public y(String str, SecretKeySpec secretKeySpec) {
        x xVar = new x(this);
        this.f83783a = xVar;
        if (!f83782e.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f83784b = str;
        this.f83785c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f83786d = 20;
                break;
            case "HMACSHA224":
                this.f83786d = 28;
                break;
            case "HMACSHA256":
                this.f83786d = 32;
                break;
            case "HMACSHA384":
                this.f83786d = 48;
                break;
            case "HMACSHA512":
                this.f83786d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        xVar.get();
    }

    @Override // hl.a
    public final byte[] a(int i13, byte[] bArr) {
        if (i13 > this.f83786d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        x xVar = this.f83783a;
        ((Mac) xVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) xVar.get()).doFinal(), i13);
    }
}
