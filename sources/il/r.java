package il;

/* loaded from: classes3.dex */
public final class r extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private x params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(r.class, rVar);
    }

    public static void A(r rVar, x xVar) {
        rVar.getClass();
        rVar.params_ = xVar;
        rVar.bitField0_ |= 1;
    }

    public static void B(r rVar, com.google.crypto.tink.shaded.protobuf.j jVar) {
        rVar.getClass();
        rVar.keyValue_ = jVar;
    }

    public static r C() {
        return DEFAULT_INSTANCE;
    }

    public static q G() {
        return (q) DEFAULT_INSTANCE.j();
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.keyValue_;
    }

    public final x E() {
        x xVar = this.params_;
        return xVar == null ? x.B() : xVar;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (p.f72491a[e0Var.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new q(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (r.class) {
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
