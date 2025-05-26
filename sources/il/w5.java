package il;

/* loaded from: classes3.dex */
public final class w5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final w5 DEFAULT_INSTANCE;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int hashType_;

    static {
        w5 w5Var = new w5();
        DEFAULT_INSTANCE = w5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(w5.class, w5Var);
    }

    public static void A(w5 w5Var, d3 d3Var) {
        w5Var.getClass();
        w5Var.hashType_ = d3Var.getNumber();
    }

    public static w5 B() {
        return DEFAULT_INSTANCE;
    }

    public static v5 D() {
        return (v5) DEFAULT_INSTANCE.j();
    }

    public final d3 C() {
        d3 forNumber = d3.forNumber(this.hashType_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (u5.f72509a[e0Var.ordinal()]) {
            case 1:
                return new w5();
            case 2:
                return new v5(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (w5.class) {
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
