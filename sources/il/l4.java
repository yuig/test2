package il;

/* loaded from: classes3.dex */
public enum l4 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(19);
    private final int value;

    l4(int i13) {
        this.value = i13;
    }

    public static l4 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i13 == 1) {
            return ENABLED;
        }
        if (i13 == 2) {
            return DISABLED;
        }
        if (i13 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return k4.f72481a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static l4 valueOf(int i13) {
        return forNumber(i13);
    }
}
