package il;

/* loaded from: classes3.dex */
public final class b4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final b4 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k privateKey_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private e4 publicKey_;
    private int version_;

    static {
        b4 b4Var = new b4();
        DEFAULT_INSTANCE = b4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(b4.class, b4Var);
    }

    public static void A(b4 b4Var) {
        b4Var.version_ = 0;
    }

    public static void B(b4 b4Var, e4 e4Var) {
        b4Var.getClass();
        b4Var.publicKey_ = e4Var;
        b4Var.bitField0_ |= 1;
    }

    public static void C(b4 b4Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        b4Var.getClass();
        b4Var.privateKey_ = jVar;
    }

    public static a4 G() {
        return (a4) DEFAULT_INSTANCE.j();
    }

    public static b4 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (b4) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 I() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.privateKey_;
    }

    public final e4 E() {
        e4 e4Var = this.publicKey_;
        return e4Var == null ? e4.D() : e4Var;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (z3.f72521a[e0Var.ordinal()]) {
            case 1:
                return new b4();
            case 2:
                return new a4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (b4.class) {
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
