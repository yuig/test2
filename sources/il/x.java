package il;

/* loaded from: classes3.dex */
public final class x extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final x DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int ivSize_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(x.class, xVar);
    }

    public static void A(x xVar, int i13) {
        xVar.ivSize_ = i13;
    }

    public static x B() {
        return DEFAULT_INSTANCE;
    }

    public static w D() {
        return (w) DEFAULT_INSTANCE.j();
    }

    public final int C() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (v.f72510a[e0Var.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new w(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (x.class) {
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
