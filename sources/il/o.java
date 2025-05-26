package il;

/* loaded from: classes3.dex */
public final class o extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private u aesCtrKeyFormat_;
    private int bitField0_;
    private j3 hmacKeyFormat_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(o.class, oVar);
    }

    public static void A(o oVar, u uVar) {
        oVar.getClass();
        oVar.aesCtrKeyFormat_ = uVar;
        oVar.bitField0_ |= 1;
    }

    public static void B(o oVar, j3 j3Var) {
        oVar.getClass();
        oVar.hmacKeyFormat_ = j3Var;
        oVar.bitField0_ |= 2;
    }

    public static n E() {
        return (n) DEFAULT_INSTANCE.j();
    }

    public static o F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (o) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final u C() {
        u uVar = this.aesCtrKeyFormat_;
        return uVar == null ? u.C() : uVar;
    }

    public final j3 D() {
        j3 j3Var = this.hmacKeyFormat_;
        return j3Var == null ? j3.C() : j3Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (m.f72483a[e0Var.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (o.class) {
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
