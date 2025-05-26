package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class x12 extends sj0 {
    private static final x12 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13353c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13354d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13355e = 3;
    private int architecture_;
    private int bitField0_;
    private int metadataCase_ = 0;
    private Object metadata_;

    static {
        x12 x12Var = new x12();
        DEFAULT_INSTANCE = x12Var;
        sj0.a(x12.class, x12Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"metadata_", "metadataCase_", "bitField0_", y12.class, bu1.class, "architecture_", mg.f8206a});
        }
        if (c13 == 3) {
            return new x12();
        }
        if (c13 == 4) {
            return new a.be(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (x12.class) {
                try {
                    taVar = PARSER;
                    if (taVar == null) {
                        taVar = new rj0(DEFAULT_INSTANCE);
                        PARSER = taVar;
                    }
                } finally {
                }
            }
        }
        return taVar;
    }

    public static x12 s() {
        return DEFAULT_INSTANCE;
    }

    public static a.be u() {
        return (a.be) DEFAULT_INSTANCE.f();
    }

    public final ng r() {
        ng a13 = ng.a(this.architecture_);
        return a13 == null ? ng.UNSUPPORTED : a13;
    }

    public final y12 t() {
        return this.metadataCase_ == 1 ? (y12) this.metadata_ : y12.s();
    }
}
