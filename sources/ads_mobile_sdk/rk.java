package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class rk extends sj0 {
    private static final rk DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f10663c = 1;

    /* renamed from: d */
    public static final int f10664d = 2;

    /* renamed from: e */
    public static final int f10665e = 3;
    private int bitField0_;
    private long major_;
    private long micro_;
    private long minor_;

    static {
        rk rkVar = new rk();
        DEFAULT_INSTANCE = rkVar;
        sj0.a(rk.class, rkVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "major_", "minor_", "micro_"});
        }
        if (c13 == 3) {
            return new rk();
        }
        if (c13 == 4) {
            return new a.qa(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (rk.class) {
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

    public static a.qa r() {
        return (a.qa) DEFAULT_INSTANCE.f();
    }
}
