package il;

/* loaded from: classes.dex */
public final class a0 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final a0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private g0 params_;
    private int version_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(a0.class, a0Var);
    }

    public static void B(a0 a0Var, g0 g0Var) {
        a0Var.getClass();
        a0Var.params_ = g0Var;
        a0Var.bitField0_ |= 1;
    }

    public static void C(a0 a0Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        a0Var.getClass();
        a0Var.keyValue_ = jVar;
    }

    public static z G() {
        return (z) DEFAULT_INSTANCE.j();
    }

    public static a0 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (a0) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 I() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.keyValue_;
    }

    public final g0 E() {
        g0 g0Var = this.params_;
        return g0Var == null ? g0.B() : g0Var;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (y.f72518a[e0Var.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new z();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (a0.class) {
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
