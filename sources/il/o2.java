package il;

/* loaded from: classes3.dex */
public final class o2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final o2 DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private com.google.crypto.tink.shaded.protobuf.k hkdfSalt_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;

    static {
        o2 o2Var = new o2();
        DEFAULT_INSTANCE = o2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(o2.class, o2Var);
    }

    public static void A(o2 o2Var, y2 y2Var) {
        o2Var.getClass();
        o2Var.curveType_ = y2Var.getNumber();
    }

    public static void B(o2 o2Var, d3 d3Var) {
        o2Var.getClass();
        o2Var.hkdfHashType_ = d3Var.getNumber();
    }

    public static void C(o2 o2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        o2Var.getClass();
        o2Var.hkdfSalt_ = jVar;
    }

    public static o2 E() {
        return DEFAULT_INSTANCE;
    }

    public static n2 H() {
        return (n2) DEFAULT_INSTANCE.j();
    }

    public final y2 D() {
        y2 forNumber = y2.forNumber(this.curveType_);
        return forNumber == null ? y2.UNRECOGNIZED : forNumber;
    }

    public final d3 F() {
        d3 forNumber = d3.forNumber(this.hkdfHashType_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    public final com.google.crypto.tink.shaded.protobuf.k G() {
        return this.hkdfSalt_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (m2.f72485a[e0Var.ordinal()]) {
            case 1:
                return new o2();
            case 2:
                return new n2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (o2.class) {
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
