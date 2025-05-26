package il;

/* loaded from: classes.dex */
public enum i4 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new com.google.android.gms.common.api.d(12);
    private final int value;

    i4(int i13) {
        this.value = i13;
    }

    public static i4 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i13 == 1) {
            return SYMMETRIC;
        }
        if (i13 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i13 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i13 != 4) {
            return null;
        }
        return REMOTE;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return h4.f72473a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i4 valueOf(int i13) {
        return forNumber(i13);
    }
}
