package il;

/* loaded from: classes.dex */
public final class c extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final c DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.k keyValue_ = com.google.crypto.tink.shaded.protobuf.k.f33636b;
    private i params_;
    private int version_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(c.class, cVar);
    }

    public static void B(c cVar, com.google.crypto.tink.shaded.protobuf.j jVar) {
        cVar.getClass();
        cVar.keyValue_ = jVar;
    }

    public static void C(c cVar, i iVar) {
        cVar.getClass();
        cVar.params_ = iVar;
        cVar.bitField0_ |= 1;
    }

    public static b G() {
        return (b) DEFAULT_INSTANCE.j();
    }

    public static c H(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (c) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.j1 I() {
        return DEFAULT_INSTANCE.n();
    }

    public final com.google.crypto.tink.shaded.protobuf.k D() {
        return this.keyValue_;
    }

    public final i E() {
        i iVar = this.params_;
        return iVar == null ? i.B() : iVar;
    }

    public final int F() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (a.f72451a[e0Var.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b();
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (c.class) {
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
