package il;

/* loaded from: classes3.dex */
public final class i extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final i DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(i.class, iVar);
    }

    public static void A(i iVar, int i13) {
        iVar.tagSize_ = i13;
    }

    public static i B() {
        return DEFAULT_INSTANCE;
    }

    public static h D() {
        return (h) DEFAULT_INSTANCE.j();
    }

    public final int C() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (g.f72467a[e0Var.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (i.class) {
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
