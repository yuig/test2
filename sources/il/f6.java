package il;

/* loaded from: classes3.dex */
public final class f6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final f6 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private i6 params_;
    private com.google.crypto.tink.shaded.protobuf.k publicExponent_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;

    static {
        f6 f6Var = new f6();
        DEFAULT_INSTANCE = f6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(f6.class, f6Var);
    }

    public static void A(f6 f6Var, i6 i6Var) {
        f6Var.getClass();
        f6Var.params_ = i6Var;
        f6Var.bitField0_ |= 1;
    }

    public static void B(f6 f6Var, int i13) {
        f6Var.modulusSizeInBits_ = i13;
    }

    public static void C(f6 f6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        f6Var.getClass();
        f6Var.publicExponent_ = jVar;
    }

    public static e6 G() {
        return (e6) DEFAULT_INSTANCE.j();
    }

    public static f6 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (f6) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int D() {
        return this.modulusSizeInBits_;
    }

    public final i6 E() {
        i6 i6Var = this.params_;
        return i6Var == null ? i6.D() : i6Var;
    }

    public final com.google.crypto.tink.shaded.protobuf.k F() {
        return this.publicExponent_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (d6.f72461a[e0Var.ordinal()]) {
            case 1:
                return new f6();
            case 2:
                return new e6(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (f6.class) {
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
