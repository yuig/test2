package il;

/* loaded from: classes.dex */
public final class q5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final q5 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.k0 entry_ = com.google.crypto.tink.shaded.protobuf.n1.f33664d;

    static {
        q5 q5Var = new q5();
        DEFAULT_INSTANCE = q5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(q5.class, q5Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        d1 d1Var = null;
        switch (p5.f72496a[e0Var.ordinal()]) {
            case 1:
                return new q5();
            case 2:
                return new f1(d1Var);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", q4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (q5.class) {
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
