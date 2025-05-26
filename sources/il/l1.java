package il;

/* loaded from: classes3.dex */
public final class l1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final l1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private o1 params_;
    private int version_;

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(l1.class, l1Var);
    }

    public static void A(l1 l1Var, o1 o1Var) {
        l1Var.getClass();
        l1Var.params_ = o1Var;
        l1Var.bitField0_ |= 1;
    }

    public static k1 C() {
        return (k1) DEFAULT_INSTANCE.j();
    }

    public static l1 D(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (l1) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final o1 B() {
        o1 o1Var = this.params_;
        return o1Var == null ? o1.E() : o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (j1.f72476a[e0Var.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new k1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"bitField0_", "params_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (l1.class) {
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
