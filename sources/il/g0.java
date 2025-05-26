package il;

/* loaded from: classes3.dex */
public final class g0 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final g0 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int ivSize_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(g0.class, g0Var);
    }

    public static void A(g0 g0Var, int i13) {
        g0Var.ivSize_ = i13;
    }

    public static g0 B() {
        return DEFAULT_INSTANCE;
    }

    public static f0 D() {
        return (f0) DEFAULT_INSTANCE.j();
    }

    public final int C() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (e0.f72462a[e0Var.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return new f0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (g0.class) {
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
