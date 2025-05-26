package il;

/* loaded from: classes3.dex */
public final class c2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final c2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private f2 params_;

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(c2.class, c2Var);
    }

    public static void A(c2 c2Var, f2 f2Var) {
        c2Var.getClass();
        c2Var.params_ = f2Var;
        c2Var.bitField0_ |= 1;
    }

    public static b2 C() {
        return (b2) DEFAULT_INSTANCE.j();
    }

    public static c2 D(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (c2) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final f2 B() {
        f2 f2Var = this.params_;
        return f2Var == null ? f2.D() : f2Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (a2.f72452a[e0Var.ordinal()]) {
            case 1:
                return new c2();
            case 2:
                return new b2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (c2.class) {
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
