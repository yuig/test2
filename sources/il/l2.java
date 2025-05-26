package il;

/* loaded from: classes3.dex */
public final class l2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final l2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private f2 params_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.k x_;
    private com.google.crypto.tink.shaded.protobuf.k y_;

    static {
        l2 l2Var = new l2();
        DEFAULT_INSTANCE = l2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(l2.class, l2Var);
    }

    public l2() {
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        this.x_ = jVar;
        this.y_ = jVar;
    }

    public static void A(l2 l2Var) {
        l2Var.version_ = 0;
    }

    public static void B(l2 l2Var, f2 f2Var) {
        l2Var.getClass();
        l2Var.params_ = f2Var;
        l2Var.bitField0_ |= 1;
    }

    public static void C(l2 l2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l2Var.getClass();
        l2Var.x_ = jVar;
    }

    public static void D(l2 l2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l2Var.getClass();
        jVar.getClass();
        l2Var.y_ = jVar;
    }

    public static l2 E() {
        return DEFAULT_INSTANCE;
    }

    public static k2 J() {
        return (k2) DEFAULT_INSTANCE.j();
    }

    public static l2 K(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (l2) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 L() {
        return DEFAULT_INSTANCE.n();
    }

    public final f2 F() {
        f2 f2Var = this.params_;
        return f2Var == null ? f2.D() : f2Var;
    }

    public final int G() {
        return this.version_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k H() {
        return this.x_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k I() {
        return this.y_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (j2.f72477a[e0Var.ordinal()]) {
            case 1:
                return new l2();
            case 2:
                return new k2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (l2.class) {
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
