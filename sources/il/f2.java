package il;

/* loaded from: classes3.dex */
public final class f2 extends com.google.crypto.tink.shaded.protobuf.f0 {
    private static final f2 DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.j1 PARSER;
    private int bitField0_;
    private z1 demParams_;
    private int ecPointFormat_;
    private o2 kemParams_;

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        com.google.crypto.tink.shaded.protobuf.f0.x(f2.class, f2Var);
    }

    public static void A(f2 f2Var, o2 o2Var) {
        f2Var.getClass();
        f2Var.kemParams_ = o2Var;
        f2Var.bitField0_ |= 1;
    }

    public static void B(f2 f2Var, z1 z1Var) {
        f2Var.getClass();
        f2Var.demParams_ = z1Var;
        f2Var.bitField0_ |= 2;
    }

    public static void C(f2 f2Var, i1 i1Var) {
        f2Var.getClass();
        f2Var.ecPointFormat_ = i1Var.getNumber();
    }

    public static f2 D() {
        return DEFAULT_INSTANCE;
    }

    public static e2 H() {
        return (e2) DEFAULT_INSTANCE.j();
    }

    public final z1 E() {
        z1 z1Var = this.demParams_;
        return z1Var == null ? z1.C() : z1Var;
    }

    public final i1 F() {
        i1 forNumber = i1.forNumber(this.ecPointFormat_);
        return forNumber == null ? i1.UNRECOGNIZED : forNumber;
    }

    public final o2 G() {
        o2 o2Var = this.kemParams_;
        return o2Var == null ? o2.E() : o2Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object k(com.google.crypto.tink.shaded.protobuf.e0 e0Var) {
        switch (d2.f72460a[e0Var.ordinal()]) {
            case 1:
                return new f2();
            case 2:
                return new e2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.o1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.j1 j1Var = PARSER;
                if (j1Var == null) {
                    synchronized (f2.class) {
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
