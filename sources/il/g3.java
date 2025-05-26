package il;

/* loaded from: classes.dex */
public final class g3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final g3 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private m3 params_;
    private int version_;

    static {
        g3 g3Var = new g3();
        DEFAULT_INSTANCE = g3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(g3.class, g3Var);
    }

    public static void B(g3 g3Var, m3 m3Var) {
        g3Var.getClass();
        g3Var.params_ = m3Var;
        g3Var.bitField0_ |= 1;
    }

    public static void C(g3 g3Var, com.google.crypto.tink.shaded.protobuf.j jVar) {
        g3Var.getClass();
        g3Var.keyValue_ = jVar;
    }

    public static g3 D() {
        return DEFAULT_INSTANCE;
    }

    public static f3 H() {
        return (f3) DEFAULT_INSTANCE.j();
    }

    public static g3 I(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (g3) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 J() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k E() {
        return this.keyValue_;
    }

    public final m3 F() {
        m3 m3Var = this.params_;
        return m3Var == null ? m3.C() : m3Var;
    }

    public final int G() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (e3.f72463a[e0Var.ordinal()]) {
            case 1:
                return new g3();
            case 2:
                return new f3();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (g3.class) {
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
