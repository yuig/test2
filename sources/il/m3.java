package il;

/* loaded from: classes3.dex */
public final class m3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final m3 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        m3 m3Var = new m3();
        DEFAULT_INSTANCE = m3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(m3.class, m3Var);
    }

    public static void A(m3 m3Var, d3 d3Var) {
        m3Var.getClass();
        m3Var.hash_ = d3Var.getNumber();
    }

    public static void B(m3 m3Var, int i13) {
        m3Var.tagSize_ = i13;
    }

    public static m3 C() {
        return DEFAULT_INSTANCE;
    }

    public static l3 F() {
        return (l3) DEFAULT_INSTANCE.j();
    }

    public final d3 D() {
        d3 forNumber = d3.forNumber(this.hash_);
        return forNumber == null ? d3.UNRECOGNIZED : forNumber;
    }

    public final int E() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (k3.f72480a[e0Var.ordinal()]) {
            case 1:
                return new m3();
            case 2:
                return new l3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (m3.class) {
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
