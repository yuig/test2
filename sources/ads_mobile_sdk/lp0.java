package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f7912a = null;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7913b = null;

    /* renamed from: c, reason: collision with root package name */
    public mp0 f7914c = null;

    /* renamed from: d, reason: collision with root package name */
    public np0 f7915d = np0.f8909e;

    public final op0 a() {
        Integer num = this.f7912a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f7913b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f7914c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f7915d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f7912a));
        }
        Integer num2 = this.f7913b;
        int intValue = num2.intValue();
        mp0 mp0Var = this.f7914c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (mp0Var == mp0.f8318b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (mp0Var == mp0.f8319c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (mp0Var == mp0.f8320d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (mp0Var == mp0.f8321e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (mp0Var != mp0.f8322f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new op0(this.f7912a.intValue(), this.f7913b.intValue(), this.f7915d, this.f7914c);
    }
}
