package il;

/* loaded from: classes3.dex */
public final class u4 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final u4 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private j4 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        u4 u4Var = new u4();
        DEFAULT_INSTANCE = u4Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(u4.class, u4Var);
    }

    public static void A(u4 u4Var, j4 j4Var) {
        u4Var.getClass();
        u4Var.keyData_ = j4Var;
        u4Var.bitField0_ |= 1;
    }

    public static void B(u4 u4Var, o5 o5Var) {
        u4Var.getClass();
        u4Var.outputPrefixType_ = o5Var.getNumber();
    }

    public static void C(u4 u4Var, l4 l4Var) {
        u4Var.getClass();
        u4Var.status_ = l4Var.getNumber();
    }

    public static void D(u4 u4Var, int i13) {
        u4Var.keyId_ = i13;
    }

    public static t4 J() {
        return (t4) DEFAULT_INSTANCE.j();
    }

    public final j4 E() {
        j4 j4Var = this.keyData_;
        return j4Var == null ? j4.D() : j4Var;
    }

    public final int F() {
        return this.keyId_;
    }

    public final o5 G() {
        o5 forNumber = o5.forNumber(this.outputPrefixType_);
        return forNumber == null ? o5.UNRECOGNIZED : forNumber;
    }

    public final l4 H() {
        l4 forNumber = l4.forNumber(this.status_);
        return forNumber == null ? l4.UNRECOGNIZED : forNumber;
    }

    public final boolean I() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (r4.f72501a[e0Var.ordinal()]) {
            case 1:
                return new u4();
            case 2:
                return new t4(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (u4.class) {
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
