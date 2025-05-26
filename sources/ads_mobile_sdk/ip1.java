package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ip1 extends sj0 {
    private static final ip1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6514c = 1;
    private boolean deviceOnline_;

    static {
        ip1 ip1Var = new ip1();
        DEFAULT_INSTANCE = ip1Var;
        sj0.a(ip1.class, ip1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"deviceOnline_"});
        }
        if (c13 == 3) {
            return new ip1();
        }
        if (c13 == 4) {
            return new a.d5(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ip1.class) {
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

    public static a.d5 r() {
        return (a.d5) DEFAULT_INSTANCE.f();
    }
}
