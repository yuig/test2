package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class hy extends sj0 {
    private static final hy DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6138c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6139d = 2;
    private int bitField0_;
    private String name_ = "";
    private String value_ = "";

    static {
        hy hyVar = new hy();
        DEFAULT_INSTANCE = hyVar;
        sj0.a(hy.class, hyVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "value_"});
        }
        if (c13 == 3) {
            return new hy();
        }
        if (c13 == 4) {
            return new a.k(11);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (hy.class) {
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
}
