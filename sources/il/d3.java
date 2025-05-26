package il;

/* loaded from: classes.dex */
public enum d3 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new com.facebook.login.z(12);
    private final int value;

    d3(int i13) {
        this.value = i13;
    }

    public static d3 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_HASH;
        }
        if (i13 == 1) {
            return SHA1;
        }
        if (i13 == 2) {
            return SHA384;
        }
        if (i13 == 3) {
            return SHA256;
        }
        if (i13 == 4) {
            return SHA512;
        }
        if (i13 != 5) {
            return null;
        }
        return SHA224;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return c3.f72457a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d3 valueOf(int i13) {
        return forNumber(i13);
    }
}
