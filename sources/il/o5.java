package il;

/* loaded from: classes.dex */
public enum o5 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new com.facebook.login.z(13);
    private final int value;

    o5(int i13) {
        this.value = i13;
    }

    public static o5 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i13 == 1) {
            return TINK;
        }
        if (i13 == 2) {
            return LEGACY;
        }
        if (i13 == 3) {
            return RAW;
        }
        if (i13 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return n5.f72490a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o5 valueOf(int i13) {
        return forNumber(i13);
    }
}
