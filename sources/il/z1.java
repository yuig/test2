package il;

/* loaded from: classes3.dex */
public final class z1 extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final z1 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private o4 aeadDem_;
    private int bitField0_;

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(z1.class, z1Var);
    }

    public static void A(z1 z1Var, o4 o4Var) {
        z1Var.getClass();
        z1Var.aeadDem_ = o4Var;
        z1Var.bitField0_ |= 1;
    }

    public static z1 C() {
        return DEFAULT_INSTANCE;
    }

    public static y1 D() {
        return (y1) DEFAULT_INSTANCE.j();
    }

    public final o4 B() {
        o4 o4Var = this.aeadDem_;
        return o4Var == null ? o4.D() : o4Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (x1.f72515a[e0Var.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new y1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (z1.class) {
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
