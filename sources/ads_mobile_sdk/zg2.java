package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class zg2 extends sj0 {
    private static final zg2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14768c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14769d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14770e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14771f = 4;
    private boolean cacheHit_;
    private int retryNumber_;
    private boolean thirdPartyCookiesEnabled_;
    private boolean wasLastSignalUsed_;

    static {
        zg2 zg2Var = new zg2();
        DEFAULT_INSTANCE = zg2Var;
        sj0.a(zg2.class, zg2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"retryNumber_", "wasLastSignalUsed_", "thirdPartyCookiesEnabled_", "cacheHit_"});
        }
        if (c13 == 3) {
            return new zg2();
        }
        if (c13 == 4) {
            return new a.hg(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (zg2.class) {
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

    public static a.hg r() {
        return (a.hg) DEFAULT_INSTANCE.f();
    }
}
