package il;

/* loaded from: classes3.dex */
public final class w2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final w2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private int version_;

    static {
        w2 w2Var = new w2();
        DEFAULT_INSTANCE = w2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(w2.class, w2Var);
    }

    public static void A(w2 w2Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        w2Var.getClass();
        w2Var.keyValue_ = jVar;
    }

    public static w2 B() {
        return DEFAULT_INSTANCE;
    }

    public static v2 E() {
        return (v2) DEFAULT_INSTANCE.j();
    }

    public static w2 F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (w2) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 G() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k C() {
        return this.keyValue_;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (u2.f72508a[e0Var.ordinal()]) {
            case 1:
                return new w2();
            case 2:
                return new v2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (w2.class) {
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
