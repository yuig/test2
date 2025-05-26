package il;

/* loaded from: classes.dex */
public final class d5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final d5 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private g5 params_;
    private int version_;

    static {
        d5 d5Var = new d5();
        DEFAULT_INSTANCE = d5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(d5.class, d5Var);
    }

    public static void B(d5 d5Var, g5 g5Var) {
        d5Var.getClass();
        d5Var.params_ = g5Var;
        d5Var.bitField0_ |= 1;
    }

    public static c5 E() {
        return (c5) DEFAULT_INSTANCE.j();
    }

    public static d5 F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (d5) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 G() {
        return DEFAULT_INSTANCE.n();
    }

    public final g5 C() {
        g5 g5Var = this.params_;
        return g5Var == null ? g5.B() : g5Var;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (b5.f72455a[e0Var.ordinal()]) {
            case 1:
                return new d5();
            case 2:
                return new c5();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (d5.class) {
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
