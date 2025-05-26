package il;

/* loaded from: classes3.dex */
public final class a5 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final a5 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.k0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.n1.f33664d;
    private int primaryKeyId_;

    static {
        a5 a5Var = new a5();
        DEFAULT_INSTANCE = a5Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(a5.class, a5Var);
    }

    public static void A(a5 a5Var, int i13) {
        a5Var.primaryKeyId_ = i13;
    }

    public static void B(a5 a5Var, z4 z4Var) {
        a5Var.getClass();
        com.google.crypto.tink.shaded.protobuf.k0 k0Var = a5Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.c) k0Var).f33594a) {
            int size = k0Var.size();
            a5Var.keyInfo_ = k0Var.g(size == 0 ? 10 : size * 2);
        }
        a5Var.keyInfo_.add(z4Var);
    }

    public static x4 C() {
        return (x4) DEFAULT_INSTANCE.j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (w4.f72514a[e0Var.ordinal()]) {
            case 1:
                return new a5();
            case 2:
                return new x4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", z4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (a5.class) {
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
