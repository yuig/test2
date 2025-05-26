package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class eh2 extends sj0 {
    private static final eh2 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4862c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4863d = 2;
    private boolean automaticRefresh_;
    private boolean staleResultAllowed_;

    static {
        eh2 eh2Var = new eh2();
        DEFAULT_INSTANCE = eh2Var;
        sj0.a(eh2.class, eh2Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"automaticRefresh_", "staleResultAllowed_"});
        }
        if (c13 == 3) {
            return new eh2();
        }
        if (c13 == 4) {
            return new a.q1(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (eh2.class) {
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

    public static a.q1 r() {
        return (a.q1) DEFAULT_INSTANCE.f();
    }
}
