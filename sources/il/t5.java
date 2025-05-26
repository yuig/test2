package il;

/* loaded from: classes3.dex */
public final class t5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final t5 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private w5 params_;
    private com.google.crypto.tink.shaded.protobuf.k publicExponent_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;

    static {
        t5 t5Var = new t5();
        DEFAULT_INSTANCE = t5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(t5.class, t5Var);
    }

    public static void A(t5 t5Var, w5 w5Var) {
        t5Var.getClass();
        t5Var.params_ = w5Var;
        t5Var.bitField0_ |= 1;
    }

    public static void B(t5 t5Var, int i13) {
        t5Var.modulusSizeInBits_ = i13;
    }

    public static void C(t5 t5Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        t5Var.getClass();
        t5Var.publicExponent_ = jVar;
    }

    public static s5 G() {
        return (s5) DEFAULT_INSTANCE.j();
    }

    public static t5 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (t5) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int D() {
        return this.modulusSizeInBits_;
    }

    public final w5 E() {
        w5 w5Var = this.params_;
        return w5Var == null ? w5.B() : w5Var;
    }

    public final com.google.crypto.tink.shaded.protobuf.k F() {
        return this.publicExponent_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (r5.f72502a[e0Var.ordinal()]) {
            case 1:
                return new t5();
            case 2:
                return new s5(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (t5.class) {
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
