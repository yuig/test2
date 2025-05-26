package il;

/* loaded from: classes3.dex */
public final class u1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final u1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private o1 params_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.k x_;
    private com.google.crypto.tink.shaded.protobuf.k y_;

    static {
        u1 u1Var = new u1();
        DEFAULT_INSTANCE = u1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(u1.class, u1Var);
    }

    public u1() {
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        this.x_ = jVar;
        this.y_ = jVar;
    }

    public static void A(u1 u1Var, o1 o1Var) {
        u1Var.getClass();
        u1Var.params_ = o1Var;
        u1Var.bitField0_ |= 1;
    }

    public static void B(u1 u1Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        u1Var.getClass();
        u1Var.x_ = jVar;
    }

    public static void C(u1 u1Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        u1Var.getClass();
        u1Var.y_ = jVar;
    }

    public static u1 D() {
        return DEFAULT_INSTANCE;
    }

    public static t1 I() {
        return (t1) DEFAULT_INSTANCE.j();
    }

    public static u1 J(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (u1) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 K() {
        return DEFAULT_INSTANCE.n();
    }

    public final o1 E() {
        o1 o1Var = this.params_;
        return o1Var == null ? o1.E() : o1Var;
    }

    public final int F() {
        return this.version_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k G() {
        return this.x_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k H() {
        return this.y_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (s1.f72504a[e0Var.ordinal()]) {
            case 1:
                return new u1();
            case 2:
                return new t1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (u1.class) {
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
