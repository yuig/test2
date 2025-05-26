package jl;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f76890e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f76891f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f76892a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f76893b;

    /* renamed from: c, reason: collision with root package name */
    public t f76894c;

    /* renamed from: d, reason: collision with root package name */
    public u f76895d;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f76890e = valueOf;
        f76891f = valueOf.pow(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    }

    public final v a() {
        Integer num = this.f76892a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f76893b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f76894c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f76895d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f76892a));
        }
        BigInteger bigInteger = this.f76893b;
        int compareTo = bigInteger.compareTo(v.f76905e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f76890e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f76891f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new v(this.f76892a.intValue(), this.f76893b, this.f76895d, this.f76894c);
    }
}
