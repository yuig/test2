package il;

/* loaded from: classes3.dex */
public final class i2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final i2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private l2 publicKey_;
    private int version_;

    static {
        i2 i2Var = new i2();
        DEFAULT_INSTANCE = i2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(i2.class, i2Var);
    }

    public static void A(i2 i2Var) {
        i2Var.version_ = 0;
    }

    public static void B(i2 i2Var, l2 l2Var) {
        i2Var.getClass();
        i2Var.publicKey_ = l2Var;
        i2Var.bitField0_ |= 1;
    }

    public static void C(i2 i2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        i2Var.getClass();
        i2Var.keyValue_ = jVar;
    }

    public static h2 G() {
        return (h2) DEFAULT_INSTANCE.j();
    }

    public static i2 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (i2) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 I() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.keyValue_;
    }

    public final l2 E() {
        l2 l2Var = this.publicKey_;
        return l2Var == null ? l2.E() : l2Var;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (g2.f72468a[e0Var.ordinal()]) {
            case 1:
                return new i2();
            case 2:
                return new h2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (i2.class) {
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
