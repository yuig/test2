package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class f22 extends sj0 {
    private static final f22 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5022c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5023d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5024e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5025f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5026g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5027h = 6;
    private int bitField0_;
    private boolean reinitializeAfterUpdate_;
    private boolean updateBeforeInitialization_;
    private boolean updateOnInitializationOnly_ = true;
    private long minUpdateIntervalMs_ = 600000;
    private long programAlmostExpiredMs_ = 3600000;
    private String programRequestUrl_ = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        f22 f22Var = new f22();
        DEFAULT_INSTANCE = f22Var;
        sj0.a(f22.class, f22Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "updateOnInitializationOnly_", "reinitializeAfterUpdate_", "updateBeforeInitialization_", "minUpdateIntervalMs_", "programAlmostExpiredMs_", "programRequestUrl_"});
        }
        if (c13 == 3) {
            return new f22();
        }
        if (c13 == 4) {
            return new a.w1(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (f22.class) {
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

    public static f22 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.w1 x() {
        return (a.w1) DEFAULT_INSTANCE.f();
    }

    public final long s() {
        return this.minUpdateIntervalMs_;
    }

    public final long t() {
        return this.programAlmostExpiredMs_;
    }

    public final boolean u() {
        return this.reinitializeAfterUpdate_;
    }

    public final boolean v() {
        return this.updateBeforeInitialization_;
    }

    public final boolean w() {
        return this.updateOnInitializationOnly_;
    }
}
