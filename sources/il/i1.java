package il;

/* loaded from: classes3.dex */
public enum i1 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(13);
    private final int value;

    i1(int i13) {
        this.value = i13;
    }

    public static i1 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i13 == 1) {
            return UNCOMPRESSED;
        }
        if (i13 == 2) {
            return COMPRESSED;
        }
        if (i13 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return h1.f72471a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i1 valueOf(int i13) {
        return forNumber(i13);
    }
}
