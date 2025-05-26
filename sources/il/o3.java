package il;

/* loaded from: classes3.dex */
public enum o3 implements com.google.crypto.tink.shaded.protobuf.h0 {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    public static final int AEAD_UNKNOWN_VALUE = 0;
    public static final int AES_128_GCM_VALUE = 1;
    public static final int AES_256_GCM_VALUE = 2;
    public static final int CHACHA20_POLY1305_VALUE = 3;
    private static final com.google.crypto.tink.shaded.protobuf.i0 internalValueMap = new c50.c1(16);
    private final int value;

    o3(int i13) {
        this.value = i13;
    }

    public static o3 forNumber(int i13) {
        if (i13 == 0) {
            return AEAD_UNKNOWN;
        }
        if (i13 == 1) {
            return AES_128_GCM;
        }
        if (i13 == 2) {
            return AES_256_GCM;
        }
        if (i13 != 3) {
            return null;
        }
        return CHACHA20_POLY1305;
    }

    public static com.google.crypto.tink.shaded.protobuf.i0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.j0 internalGetVerifier() {
        return n3.f72489a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o3 valueOf(int i13) {
        return forNumber(i13);
    }
}
