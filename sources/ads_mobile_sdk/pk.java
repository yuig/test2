package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class pk extends sj0 {
    private static final pk DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9717c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9718d = 5;
    private int bitField0_;
    private String errorDescription_ = "";
    private int errorType_;

    static {
        pk pkVar = new pk();
        DEFAULT_INSTANCE = pkVar;
        sj0.a(pk.class, pkVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0000\u0005ဈ\u0001", new Object[]{"bitField0_", "errorType_", ek.f4875a, "errorDescription_"});
        }
        if (c13 == 3) {
            return new pk();
        }
        if (c13 == 4) {
            return new a.o9(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (pk.class) {
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

    public static a.o9 r() {
        return (a.o9) DEFAULT_INSTANCE.f();
    }
}
