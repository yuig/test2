package jl;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f76927g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f76928h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f76929a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f76930b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f76931c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f76932d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f76933e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f76934f;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f76927g = valueOf;
        f76928h = valueOf.pow(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    }

    public final c0 a() {
        Integer num = this.f76929a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f76930b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f76931c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f76932d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f76934f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f76933e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f76929a, 2048));
        }
        if (this.f76931c != this.f76932d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f76930b;
        int compareTo = bigInteger.compareTo(c0.f76809g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f76927g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f76928h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new c0(this.f76929a.intValue(), this.f76930b, this.f76934f, this.f76931c, this.f76932d, this.f76933e.intValue());
    }

    public final void b(int i13) {
        if (i13 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i13)));
        }
        this.f76933e = Integer.valueOf(i13);
    }
}
