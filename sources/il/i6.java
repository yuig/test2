package il;

/* loaded from: classes3.dex */
public final class i6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final i6 DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    static {
        i6 i6Var = new i6();
        DEFAULT_INSTANCE = i6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(i6.class, i6Var);
    }

    public static void A(i6 i6Var, d3 d3Var) {
        i6Var.getClass();
        i6Var.sigHash_ = d3Var.getNumber();
    }

    public static void B(i6 i6Var, d3 d3Var) {
        i6Var.getClass();
        i6Var.mgf1Hash_ = d3Var.getNumber();
    }

    public static void C(i6 i6Var, int i13) {
        i6Var.saltLength_ = i13;
    }

    public static i6 D() {
        return DEFAULT_INSTANCE;
    }

    public static h6 H() {
        return (h6) DEFAULT_INSTANCE.j();
    }

    public final d3 E() {
        d3 forNumber = d3.forNumber(this.mgf1Hash_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    public final int F() {
        return this.saltLength_;
    }

    public final d3 G() {
        d3 forNumber = d3.forNumber(this.sigHash_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (g6.f72469a[e0Var.ordinal()]) {
            case 1:
                return new i6();
            case 2:
                return new h6(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (i6.class) {
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
