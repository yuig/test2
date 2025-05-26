package il;

/* loaded from: classes3.dex */
public final class s0 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final s0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(s0.class, s0Var);
    }

    public static void A(s0 s0Var, int i13) {
        s0Var.keySize_ = i13;
    }

    public static r0 D() {
        return (r0) DEFAULT_INSTANCE.j();
    }

    public static s0 E(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (s0) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int B() {
        return this.keySize_;
    }

    public final int C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (q0.f72498a[e0Var.ordinal()]) {
            case 1:
                return new s0();
            case 2:
                return new r0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (s0.class) {
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
