package il;

/* loaded from: classes3.dex */
public enum s3 implements com.google.crypto.tink.shaded.protobuf.h0 {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    public static final int DHKEM_P256_HKDF_SHA256_VALUE = 2;
    public static final int DHKEM_P384_HKDF_SHA384_VALUE = 3;
    public static final int DHKEM_P521_HKDF_SHA512_VALUE = 4;
    public static final int DHKEM_X25519_HKDF_SHA256_VALUE = 1;
    public static final int KEM_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(18);
    private final int value;

    s3(int i13) {
        this.value = i13;
    }

    public static s3 forNumber(int i13) {
        if (i13 == 0) {
            return KEM_UNKNOWN;
        }
        if (i13 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i13 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i13 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i13 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return r3.f72500a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static s3 valueOf(int i13) {
        return forNumber(i13);
    }
}
