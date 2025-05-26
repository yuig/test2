package il;

/* loaded from: classes3.dex */
public final class r1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final r1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private u1 publicKey_;
    private int version_;

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(r1.class, r1Var);
    }

    public static void A(r1 r1Var, u1 u1Var) {
        r1Var.getClass();
        r1Var.publicKey_ = u1Var;
        r1Var.bitField0_ |= 1;
    }

    public static void B(r1 r1Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        r1Var.getClass();
        r1Var.keyValue_ = jVar;
    }

    public static q1 F() {
        return (q1) DEFAULT_INSTANCE.j();
    }

    public static r1 G(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (r1) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 H() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k C() {
        return this.keyValue_;
    }

    public final u1 D() {
        u1 u1Var = this.publicKey_;
        return u1Var == null ? u1.D() : u1Var;
    }

    public final int E() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (p1.f72492a[e0Var.ordinal()]) {
            case 1:
                return new r1();
            case 2:
                return new q1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (r1.class) {
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
