package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class kz2 extends sj0 {
    private static final kz2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7567c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7568d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7569e = 3;
    private h4 blockedStartupLocations_ = sj0.i();
    private long maxTimePerTaskInUiThreadMs_;
    private long totalTimeInUiThreadMs_;

    static {
        kz2 kz2Var = new kz2();
        DEFAULT_INSTANCE = kz2Var;
        sj0.a(kz2.class, kz2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"totalTimeInUiThreadMs_", "maxTimePerTaskInUiThreadMs_", "blockedStartupLocations_"});
        }
        if (c13 == 3) {
            return new kz2();
        }
        if (c13 == 4) {
            return new a.s6(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (kz2.class) {
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

    public static a.s6 r() {
        return (a.s6) DEFAULT_INSTANCE.f();
    }
}
