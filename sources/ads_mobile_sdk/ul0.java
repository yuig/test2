package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ul0 extends sj0 {
    private static final ul0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12102c = 6;
    private int bitField0_;
    private ql0 gmaSdkMonitoringMessage_;

    static {
        ul0 ul0Var = new ul0();
        DEFAULT_INSTANCE = ul0Var;
        sj0.a(ul0.class, ul0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"bitField0_", "gmaSdkMonitoringMessage_"});
        }
        if (c13 == 3) {
            return new ul0();
        }
        if (c13 == 4) {
            return new a.bd(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ul0.class) {
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

    public static a.bd r() {
        return (a.bd) DEFAULT_INSTANCE.f();
    }
}
