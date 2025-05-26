package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class n4 extends sj0 {
    private static final n4 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f8664c = 18;
    private l4 adshieldMonitoringMessage_;
    private int bitField0_;

    static {
        n4 n4Var = new n4();
        DEFAULT_INSTANCE = n4Var;
        sj0.a(n4.class, n4Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"bitField0_", "adshieldMonitoringMessage_"});
        }
        if (c13 == 3) {
            return new n4();
        }
        if (c13 == 4) {
            return new a.x7(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (n4.class) {
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

    public static a.x7 r() {
        return (a.x7) DEFAULT_INSTANCE.f();
    }
}
