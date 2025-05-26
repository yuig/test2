package il;

/* loaded from: classes3.dex */
public enum y2 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    public static final int CURVE25519_VALUE = 5;
    public static final int NIST_P256_VALUE = 2;
    public static final int NIST_P384_VALUE = 3;
    public static final int NIST_P521_VALUE = 4;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(15);
    private final int value;

    y2(int i13) {
        this.value = i13;
    }

    public static y2 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i13 == 2) {
            return NIST_P256;
        }
        if (i13 == 3) {
            return NIST_P384;
        }
        if (i13 == 4) {
            return NIST_P521;
        }
        if (i13 != 5) {
            return null;
        }
        return CURVE25519;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return x2.f72516a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static y2 valueOf(int i13) {
        return forNumber(i13);
    }
}
