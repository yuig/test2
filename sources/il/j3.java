package il;

/* loaded from: classes3.dex */
public final class j3 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final j3 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private m3 params_;
    private int version_;

    static {
        j3 j3Var = new j3();
        DEFAULT_INSTANCE = j3Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(j3.class, j3Var);
    }

    public static void A(j3 j3Var, m3 m3Var) {
        j3Var.getClass();
        j3Var.params_ = m3Var;
        j3Var.bitField0_ |= 1;
    }

    public static void B(j3 j3Var, int i13) {
        j3Var.keySize_ = i13;
    }

    public static j3 C() {
        return DEFAULT_INSTANCE;
    }

    public static i3 G() {
        return (i3) DEFAULT_INSTANCE.j();
    }

    public static j3 H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (j3) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int D() {
        return this.keySize_;
    }

    public final m3 E() {
        m3 m3Var = this.params_;
        return m3Var == null ? m3.C() : m3Var;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (h3.f72472a[e0Var.ordinal()]) {
            case 1:
                return new j3();
            case 2:
                return new i3(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (j3.class) {
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
