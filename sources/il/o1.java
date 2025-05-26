package il;

/* loaded from: classes3.dex */
public final class o1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final o1 DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(o1.class, o1Var);
    }

    public static void A(o1 o1Var, d3 d3Var) {
        o1Var.getClass();
        o1Var.hashType_ = d3Var.getNumber();
    }

    public static void B(o1 o1Var, y2 y2Var) {
        o1Var.getClass();
        o1Var.curve_ = y2Var.getNumber();
    }

    public static void C(o1 o1Var, w1 w1Var) {
        o1Var.getClass();
        o1Var.encoding_ = w1Var.getNumber();
    }

    public static o1 E() {
        return DEFAULT_INSTANCE;
    }

    public static n1 H() {
        return (n1) DEFAULT_INSTANCE.j();
    }

    public final y2 D() {
        y2 forNumber = y2.forNumber(this.curve_);
        return forNumber == null ? y2.UNRECOGNIZED : forNumber;
    }

    public final w1 F() {
        w1 forNumber = w1.forNumber(this.encoding_);
        return forNumber == null ? w1.UNRECOGNIZED : forNumber;
    }

    public final d3 G() {
        d3 forNumber = d3.forNumber(this.hashType_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (m1.f72484a[e0Var.ordinal()]) {
            case 1:
                return new o1();
            case 2:
                return new n1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (o1.class) {
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
