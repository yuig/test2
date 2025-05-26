package il;

/* loaded from: classes3.dex */
public final class o4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final o4 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.k value_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;

    static {
        o4 o4Var = new o4();
        DEFAULT_INSTANCE = o4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(o4.class, o4Var);
    }

    public static void A(o4 o4Var, String str) {
        o4Var.getClass();
        str.getClass();
        o4Var.typeUrl_ = str;
    }

    public static void B(o4 o4Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        o4Var.getClass();
        kVar.getClass();
        o4Var.value_ = kVar;
    }

    public static void C(o4 o4Var, o5 o5Var) {
        o4Var.getClass();
        o4Var.outputPrefixType_ = o5Var.getNumber();
    }

    public static o4 D() {
        return DEFAULT_INSTANCE;
    }

    public static n4 H() {
        return (n4) DEFAULT_INSTANCE.j();
    }

    public static o4 I(byte[] bArr, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (o4) com.google.crypto.tink.shaded.protobuf.f0.v(DEFAULT_INSTANCE, bArr, uVar);
    }

    public final o5 E() {
        o5 forNumber = o5.forNumber(this.outputPrefixType_);
        return forNumber == null ? o5.UNRECOGNIZED : forNumber;
    }

    public final String F() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k G() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (m4.f72486a[e0Var.ordinal()]) {
            case 1:
                return new o4();
            case 2:
                return new n4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (o4.class) {
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
