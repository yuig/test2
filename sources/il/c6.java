package il;

/* loaded from: classes3.dex */
public final class c6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final c6 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k e_;
    private com.google.crypto.tink.shaded.protobuf.k n_;
    private w5 params_;
    private int version_;

    static {
        c6 c6Var = new c6();
        DEFAULT_INSTANCE = c6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(c6.class, c6Var);
    }

    public c6() {
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        this.n_ = jVar;
        this.e_ = jVar;
    }

    public static void A(c6 c6Var, w5 w5Var) {
        c6Var.getClass();
        c6Var.params_ = w5Var;
        c6Var.bitField0_ |= 1;
    }

    public static void B(c6 c6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        c6Var.getClass();
        c6Var.n_ = jVar;
    }

    public static void C(c6 c6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        c6Var.getClass();
        c6Var.e_ = jVar;
    }

    public static c6 D() {
        return DEFAULT_INSTANCE;
    }

    public static b6 I() {
        return (b6) DEFAULT_INSTANCE.j();
    }

    public static c6 J(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (c6) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 K() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k E() {
        return this.e_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k F() {
        return this.n_;
    }

    public final w5 G() {
        w5 w5Var = this.params_;
        return w5Var == null ? w5.B() : w5Var;
    }

    public final int H() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (a6.f72453a[e0Var.ordinal()]) {
            case 1:
                return new c6();
            case 2:
                return new b6(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (c6.class) {
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
