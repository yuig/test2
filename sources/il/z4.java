package il;

/* loaded from: classes3.dex */
public final class z4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final z4 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        z4 z4Var = new z4();
        DEFAULT_INSTANCE = z4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(z4.class, z4Var);
    }

    public static void A(z4 z4Var, String str) {
        z4Var.getClass();
        str.getClass();
        z4Var.typeUrl_ = str;
    }

    public static void B(z4 z4Var, o5 o5Var) {
        z4Var.getClass();
        z4Var.outputPrefixType_ = o5Var.getNumber();
    }

    public static void C(z4 z4Var, l4 l4Var) {
        z4Var.getClass();
        z4Var.status_ = l4Var.getNumber();
    }

    public static void D(z4 z4Var, int i13) {
        z4Var.keyId_ = i13;
    }

    public static y4 E() {
        return (y4) DEFAULT_INSTANCE.j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (w4.f72514a[e0Var.ordinal()]) {
            case 1:
                return new z4();
            case 2:
                return new y4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (z4.class) {
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
