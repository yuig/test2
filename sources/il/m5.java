package il;

/* loaded from: classes3.dex */
public final class m5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final m5 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private o4 dekTemplate_;
    private String kekUri_ = "";

    static {
        m5 m5Var = new m5();
        DEFAULT_INSTANCE = m5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(m5.class, m5Var);
    }

    public static void A(m5 m5Var, String str) {
        m5Var.getClass();
        str.getClass();
        m5Var.kekUri_ = str;
    }

    public static void B(m5 m5Var, o4 o4Var) {
        m5Var.getClass();
        m5Var.dekTemplate_ = o4Var;
        m5Var.bitField0_ |= 1;
    }

    public static m5 C() {
        return DEFAULT_INSTANCE;
    }

    public static l5 F() {
        return (l5) DEFAULT_INSTANCE.j();
    }

    public static m5 G(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (m5) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final o4 D() {
        o4 o4Var = this.dekTemplate_;
        return o4Var == null ? o4.D() : o4Var;
    }

    public final String E() {
        return this.kekUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (k5.f72482a[e0Var.ordinal()]) {
            case 1:
                return new m5();
            case 2:
                return new l5(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (m5.class) {
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
