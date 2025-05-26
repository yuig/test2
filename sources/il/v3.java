package il;

/* loaded from: classes3.dex */
public final class v3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final v3 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private y3 params_;

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(v3.class, v3Var);
    }

    public static void A(v3 v3Var, y3 y3Var) {
        v3Var.getClass();
        v3Var.params_ = y3Var;
        v3Var.bitField0_ |= 1;
    }

    public static u3 C() {
        return (u3) DEFAULT_INSTANCE.j();
    }

    public static v3 D(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (v3) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final y3 B() {
        y3 y3Var = this.params_;
        return y3Var == null ? y3.E() : y3Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (t3.f72507a[e0Var.ordinal()]) {
            case 1:
                return new v3();
            case 2:
                return new u3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (v3.class) {
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
