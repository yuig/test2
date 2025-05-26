package il;

/* loaded from: classes3.dex */
public final class t2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final t2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private w2 publicKey_;
    private int version_;

    static {
        t2 t2Var = new t2();
        DEFAULT_INSTANCE = t2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(t2.class, t2Var);
    }

    public static void A(t2 t2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        t2Var.getClass();
        t2Var.keyValue_ = jVar;
    }

    public static void B(t2 t2Var, w2 w2Var) {
        t2Var.getClass();
        t2Var.publicKey_ = w2Var;
        t2Var.bitField0_ |= 1;
    }

    public static s2 F() {
        return (s2) DEFAULT_INSTANCE.j();
    }

    public static t2 G(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (t2) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 H() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k C() {
        return this.keyValue_;
    }

    public final w2 D() {
        w2 w2Var = this.publicKey_;
        return w2Var == null ? w2.B() : w2Var;
    }

    public final int E() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (r2.f72499a[e0Var.ordinal()]) {
            case 1:
                return new t2();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "publicKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (t2.class) {
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
