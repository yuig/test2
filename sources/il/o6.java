package il;

/* loaded from: classes3.dex */
public final class o6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final o6 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k e_;
    private com.google.crypto.tink.shaded.protobuf.k n_;
    private i6 params_;
    private int version_;

    static {
        o6 o6Var = new o6();
        DEFAULT_INSTANCE = o6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(o6.class, o6Var);
    }

    public o6() {
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        this.n_ = jVar;
        this.e_ = jVar;
    }

    public static void A(o6 o6Var) {
        o6Var.version_ = 0;
    }

    public static void B(o6 o6Var, i6 i6Var) {
        o6Var.getClass();
        o6Var.params_ = i6Var;
        o6Var.bitField0_ |= 1;
    }

    public static void C(o6 o6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        o6Var.getClass();
        o6Var.n_ = jVar;
    }

    public static void D(o6 o6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        o6Var.getClass();
        o6Var.e_ = jVar;
    }

    public static o6 E() {
        return DEFAULT_INSTANCE;
    }

    public static n6 J() {
        return (n6) DEFAULT_INSTANCE.j();
    }

    public static o6 K(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (o6) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 L() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k F() {
        return this.e_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k G() {
        return this.n_;
    }

    public final i6 H() {
        i6 i6Var = this.params_;
        return i6Var == null ? i6.D() : i6Var;
    }

    public final int I() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (m6.f72487a[e0Var.ordinal()]) {
            case 1:
                return new o6();
            case 2:
                return new n6(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (o6.class) {
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
