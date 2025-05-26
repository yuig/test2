package il;

/* loaded from: classes3.dex */
public final class j4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final j4 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.k value_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;

    static {
        j4 j4Var = new j4();
        DEFAULT_INSTANCE = j4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(j4.class, j4Var);
    }

    public static void A(j4 j4Var, String str) {
        j4Var.getClass();
        str.getClass();
        j4Var.typeUrl_ = str;
    }

    public static void B(j4 j4Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        j4Var.getClass();
        kVar.getClass();
        j4Var.value_ = kVar;
    }

    public static void C(j4 j4Var, i4 i4Var) {
        j4Var.getClass();
        j4Var.keyMaterialType_ = i4Var.getNumber();
    }

    public static j4 D() {
        return DEFAULT_INSTANCE;
    }

    public static g4 H() {
        return (g4) DEFAULT_INSTANCE.j();
    }

    public final i4 E() {
        i4 forNumber = i4.forNumber(this.keyMaterialType_);
        return forNumber == null ? i4.UNRECOGNIZED : forNumber;
    }

    public final String F() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k G() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (f4.f72466a[e0Var.ordinal()]) {
            case 1:
                return new j4();
            case 2:
                return new g4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (j4.class) {
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
