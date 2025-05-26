package il;

/* loaded from: classes3.dex */
public final class g5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final g5 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private String keyUri_ = "";

    static {
        g5 g5Var = new g5();
        DEFAULT_INSTANCE = g5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(g5.class, g5Var);
    }

    public static void A(g5 g5Var, String str) {
        g5Var.getClass();
        str.getClass();
        g5Var.keyUri_ = str;
    }

    public static g5 B() {
        return DEFAULT_INSTANCE;
    }

    public static f5 D() {
        return (f5) DEFAULT_INSTANCE.j();
    }

    public static g5 E(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (g5) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final String C() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (e5.f72464a[e0Var.ordinal()]) {
            case 1:
                return new g5();
            case 2:
                return new f5(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (g5.class) {
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
