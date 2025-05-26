package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8134a = null;

    /* renamed from: b, reason: collision with root package name */
    public Integer f8135b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8136c = null;

    /* renamed from: d, reason: collision with root package name */
    public n9 f8137d = n9.f8723d;

    public final o9 a() {
        Integer num = this.f8134a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8135b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f8137d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f8136c != null) {
            return new o9(num.intValue(), this.f8135b.intValue(), this.f8136c.intValue(), this.f8137d);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    public final m9 b(int i13) {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f8134a = Integer.valueOf(i13);
        return this;
    }

    public final m9 a(int i13) {
        if (i13 != 12 && i13 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i13)));
        }
        this.f8135b = Integer.valueOf(i13);
        return this;
    }
}
