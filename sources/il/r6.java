package il;

/* loaded from: classes.dex */
public final class r6 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final r6 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private int version_;

    static {
        r6 r6Var = new r6();
        DEFAULT_INSTANCE = r6Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(r6.class, r6Var);
    }

    public static void B(r6 r6Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        r6Var.getClass();
        r6Var.keyValue_ = jVar;
    }

    public static q6 E() {
        return (q6) DEFAULT_INSTANCE.j();
    }

    public static r6 F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (r6) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
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
        switch (p6.f72497a[e0Var.ordinal()]) {
            case 1:
                return new r6();
            case 2:
                return new q6();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (r6.class) {
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
