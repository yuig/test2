package il;

/* loaded from: classes3.dex */
public final class e4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final e4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private y3 params_;
    private com.google.crypto.tink.shaded.protobuf.k publicKey_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private int version_;

    static {
        e4 e4Var = new e4();
        DEFAULT_INSTANCE = e4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(e4.class, e4Var);
    }

    public static void A(e4 e4Var) {
        e4Var.version_ = 0;
    }

    public static void B(e4 e4Var, y3 y3Var) {
        e4Var.getClass();
        e4Var.params_ = y3Var;
        e4Var.bitField0_ |= 1;
    }

    public static void C(e4 e4Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        e4Var.getClass();
        e4Var.publicKey_ = jVar;
    }

    public static e4 D() {
        return DEFAULT_INSTANCE;
    }

    public static d4 H() {
        return (d4) DEFAULT_INSTANCE.j();
    }

    public static e4 I(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (e4) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 J() {
        return DEFAULT_INSTANCE.n();
    }

    public final y3 E() {
        y3 y3Var = this.params_;
        return y3Var == null ? y3.E() : y3Var;
    }

    public final com.google.crypto.tink.shaded.protobuf.k F() {
        return this.publicKey_;
    }

    public final int G() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (c4.f72458a[e0Var.ordinal()]) {
            case 1:
                return new e4();
            case 2:
                return new d4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "publicKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (e4.class) {
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
