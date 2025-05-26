package il;

/* loaded from: classes3.dex */
public enum w1 implements com.google.crypto.tink.shaded.protobuf.h0 {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);

    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(14);
    private final int value;

    w1(int i13) {
        this.value = i13;
    }

    public static w1 forNumber(int i13) {
        if (i13 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i13 == 1) {
            return IEEE_P1363;
        }
        if (i13 != 2) {
            return null;
        }
        return DER;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return v1.f72511a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static w1 valueOf(int i13) {
        return forNumber(i13);
    }
}
