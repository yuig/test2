package il;

/* loaded from: classes3.dex */
public final class d0 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final d0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private int keySize_;
    private g0 params_;

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(d0.class, d0Var);
    }

    public static void A(d0 d0Var, g0 g0Var) {
        d0Var.getClass();
        d0Var.params_ = g0Var;
        d0Var.bitField0_ |= 1;
    }

    public static void B(d0 d0Var, int i13) {
        d0Var.keySize_ = i13;
    }

    public static c0 E() {
        return (c0) DEFAULT_INSTANCE.j();
    }

    public static d0 F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (d0) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int C() {
        return this.keySize_;
    }

    public final g0 D() {
        g0 g0Var = this.params_;
        return g0Var == null ? g0.B() : g0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (b0.f72454a[e0Var.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new c0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (d0.class) {
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
