package il;

/* loaded from: classes.dex */
public final class l extends com.google.crypto.tink.shaded.protobuf.f0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private r aesCtrKey_;
    private int bitField0_;
    private g3 hmacKey_;
    private int version_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(l.class, lVar);
    }

    public static void B(l lVar, r rVar) {
        lVar.getClass();
        lVar.aesCtrKey_ = rVar;
        lVar.bitField0_ |= 1;
    }

    public static void C(l lVar, g3 g3Var) {
        lVar.getClass();
        lVar.hmacKey_ = g3Var;
        lVar.bitField0_ |= 2;
    }

    public static k G() {
        return (k) DEFAULT_INSTANCE.j();
    }

    public static l H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (l) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 I() {
        return DEFAULT_INSTANCE.n();
    }

    public final r D() {
        r rVar = this.aesCtrKey_;
        return rVar == null ? r.C() : rVar;
    }

    public final g3 E() {
        g3 g3Var = this.hmacKey_;
        return g3Var == null ? g3.D() : g3Var;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (j.f72475a[e0Var.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new k();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (l.class) {
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
