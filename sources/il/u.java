package il;

/* loaded from: classes3.dex */
public final class u extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final u DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private int keySize_;
    private x params_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(u.class, uVar);
    }

    public static void A(u uVar, x xVar) {
        uVar.getClass();
        uVar.params_ = xVar;
        uVar.bitField0_ |= 1;
    }

    public static void B(u uVar, int i13) {
        uVar.keySize_ = i13;
    }

    public static u C() {
        return DEFAULT_INSTANCE;
    }

    public static t F() {
        return (t) DEFAULT_INSTANCE.j();
    }

    public final int D() {
        return this.keySize_;
    }

    public final x E() {
        x xVar = this.params_;
        return xVar == null ? x.B() : xVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (s.f72503a[e0Var.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (u.class) {
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
