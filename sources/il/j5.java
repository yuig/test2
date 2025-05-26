package il;

/* loaded from: classes.dex */
public final class j5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final j5 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private m5 params_;
    private int version_;

    static {
        j5 j5Var = new j5();
        DEFAULT_INSTANCE = j5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(j5.class, j5Var);
    }

    public static void B(j5 j5Var, m5 m5Var) {
        j5Var.getClass();
        j5Var.params_ = m5Var;
        j5Var.bitField0_ |= 1;
    }

    public static i5 E() {
        return (i5) DEFAULT_INSTANCE.j();
    }

    public static j5 F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (j5) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 G() {
        return DEFAULT_INSTANCE.n();
    }

    public final m5 C() {
        m5 m5Var = this.params_;
        return m5Var == null ? m5.C() : m5Var;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (h5.f72474a[e0Var.ordinal()]) {
            case 1:
                return new j5();
            case 2:
                return new i5();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (j5.class) {
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
