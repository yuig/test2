package il;

/* loaded from: classes3.dex */
public final class l6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final l6 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k crt_;
    private com.google.crypto.tink.shaded.protobuf.k d_;
    private com.google.crypto.tink.shaded.protobuf.k dp_;
    private com.google.crypto.tink.shaded.protobuf.k dq_;
    private com.google.crypto.tink.shaded.protobuf.k p_;
    private o6 publicKey_;
    private com.google.crypto.tink.shaded.protobuf.k q_;
    private int version_;

    static {
        l6 l6Var = new l6();
        DEFAULT_INSTANCE = l6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(l6.class, l6Var);
    }

    public l6() {
        com.google.crypto.tink.shaded.protobuf.j jVar = com.google.crypto.tink.shaded.protobuf.k.f33636b;
        this.d_ = jVar;
        this.p_ = jVar;
        this.q_ = jVar;
        this.dp_ = jVar;
        this.dq_ = jVar;
        this.crt_ = jVar;
    }

    public static void A(l6 l6Var) {
        l6Var.version_ = 0;
    }

    public static void B(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.q_ = jVar;
    }

    public static void C(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.dp_ = jVar;
    }

    public static void D(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.dq_ = jVar;
    }

    public static void E(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.crt_ = jVar;
    }

    public static void F(l6 l6Var, o6 o6Var) {
        l6Var.getClass();
        l6Var.publicKey_ = o6Var;
        l6Var.bitField0_ |= 1;
    }

    public static void G(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.d_ = jVar;
    }

    public static void H(l6 l6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        l6Var.getClass();
        l6Var.p_ = jVar;
    }

    public static k6 Q() {
        return (k6) DEFAULT_INSTANCE.j();
    }

    public static l6 R(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (l6) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 S() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k I() {
        return this.crt_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k J() {
        return this.d_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k K() {
        return this.dp_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k L() {
        return this.dq_;
    }

    public final com.google.crypto.tink.shaded.protobuf.k M() {
        return this.p_;
    }

    public final o6 N() {
        o6 o6Var = this.publicKey_;
        return o6Var == null ? o6.E() : o6Var;
    }

    public final com.google.crypto.tink.shaded.protobuf.k O() {
        return this.q_;
    }

    public final int P() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (j6.f72478a[e0Var.ordinal()]) {
            case 1:
                return new l6();
            case 2:
                return new k6(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (l6.class) {
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
