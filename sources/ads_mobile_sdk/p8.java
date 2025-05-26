package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9585a = null;

    /* renamed from: b, reason: collision with root package name */
    public Integer f9586b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f9587c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f9588d = null;

    /* renamed from: e, reason: collision with root package name */
    public q8 f9589e = null;

    /* renamed from: f, reason: collision with root package name */
    public r8 f9590f = r8.f10544d;

    public final s8 a() {
        if (this.f9585a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f9586b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f9587c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f9588d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f9589e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f9590f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        q8 q8Var = this.f9589e;
        if (q8Var == q8.f9983b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (q8Var == q8.f9984c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (q8Var == q8.f9985d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (q8Var == q8.f9986e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (q8Var != q8.f9987f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new s8(this.f9585a.intValue(), this.f9586b.intValue(), this.f9587c.intValue(), this.f9588d.intValue(), this.f9590f, this.f9589e);
    }

    public final p8 b(int i13) {
        if (i13 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i13)));
        }
        this.f9586b = Integer.valueOf(i13);
        return this;
    }

    public final p8 c(int i13) {
        if (i13 < 12 || i13 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i13)));
        }
        this.f9587c = Integer.valueOf(i13);
        return this;
    }

    public final p8 d(int i13) {
        if (i13 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i13)));
        }
        this.f9588d = Integer.valueOf(i13);
        return this;
    }

    public final p8 a(int i13) {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f9585a = Integer.valueOf(i13);
        return this;
    }
}
