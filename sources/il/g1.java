package il;

/* loaded from: classes3.dex */
public final class g1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final g1 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;

    static {
        g1 g1Var = new g1();
        DEFAULT_INSTANCE = g1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(g1.class, g1Var);
    }

    public static g1 B() {
        return DEFAULT_INSTANCE;
    }

    public static void C(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (c1.f72456a[e0Var.ordinal()]) {
            case 1:
                return new g1();
            case 2:
                return new f1();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (g1.class) {
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
