package il;

/* loaded from: classes3.dex */
public enum q3 implements com.google.crypto.tink.shaded.protobuf.h0 {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    public static final int HKDF_SHA256_VALUE = 1;
    public static final int HKDF_SHA384_VALUE = 2;
    public static final int HKDF_SHA512_VALUE = 3;
    public static final int KDF_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(17);
    private final int value;

    q3(int i13) {
        this.value = i13;
    }

    public static q3 forNumber(int i13) {
        if (i13 == 0) {
            return KDF_UNKNOWN;
        }
        if (i13 == 1) {
            return HKDF_SHA256;
        }
        if (i13 == 2) {
            return HKDF_SHA384;
        }
        if (i13 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return p3.f72494a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static q3 valueOf(int i13) {
        return forNumber(i13);
    }
}
