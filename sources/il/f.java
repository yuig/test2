package il;

/* loaded from: classes3.dex */
public final class f extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private int keySize_;
    private i params_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.crypto.tink.shaded.protobuf.f0.x(f.class, fVar);
    }

    public static void A(f fVar, int i13) {
        fVar.keySize_ = i13;
    }

    public static void B(f fVar, i iVar) {
        fVar.getClass();
        fVar.params_ = iVar;
        fVar.bitField0_ |= 1;
    }

    public static e E() {
        return (e) DEFAULT_INSTANCE.j();
    }

    public static f F(com.google.crypto.tink.shaded.protobuf.k kVar, com.google.crypto.tink.shaded.protobuf.u uVar) {
        return (f) com.google.crypto.tink.shaded.protobuf.f0.u(DEFAULT_INSTANCE, kVar, uVar);
    }

    public final int C() {
        return this.keySize_;
    }

    public final i D() {
        i iVar = this.params_;
        return iVar == null ? i.B() : iVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (d.f72459a[e0Var.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (f.class) {
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
