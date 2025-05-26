package il;

/* loaded from: classes3.dex */
public final class y3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final y3 DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    static {
        y3 y3Var = new y3();
        DEFAULT_INSTANCE = y3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(y3.class, y3Var);
    }

    public static void A(y3 y3Var, s3 s3Var) {
        y3Var.getClass();
        y3Var.kem_ = s3Var.getNumber();
    }

    public static void B(y3 y3Var, q3 q3Var) {
        y3Var.getClass();
        y3Var.kdf_ = q3Var.getNumber();
    }

    public static void C(y3 y3Var, o3 o3Var) {
        y3Var.getClass();
        y3Var.aead_ = o3Var.getNumber();
    }

    public static y3 E() {
        return DEFAULT_INSTANCE;
    }

    public static x3 H() {
        return (x3) DEFAULT_INSTANCE.j();
    }

    public final o3 D() {
        o3 forNumber = o3.forNumber(this.aead_);
        return forNumber == null ? o3.UNRECOGNIZED : forNumber;
    }

    public final q3 F() {
        q3 forNumber = q3.forNumber(this.kdf_);
        return forNumber == null ? q3.UNRECOGNIZED : forNumber;
    }

    public final s3 G() {
        s3 forNumber = s3.forNumber(this.kem_);
        return forNumber == null ? s3.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (w3.f72513a[e0Var.ordinal()]) {
            case 1:
                return new y3();
            case 2:
                return new x3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (y3.class) {
                        try {
                            j1Var = PARSER;
                            if (j1Var == null) {
                                j1Var = new com.google.crypto.tink.shaded.protobuf.d0();
                                PARSER = j1Var;
                            }
                        } finally {
                        }
                    }
                }
                return j1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
