package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class xk0 extends sj0 {
    private static final xk0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13705c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13706d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13707e = 3;
    private int status_;
    private String stacktrace_ = "";
    private String conduitTraceKey_ = "";

    static {
        xk0 xk0Var = new xk0();
        DEFAULT_INSTANCE = xk0Var;
        sj0.a(xk0.class, xk0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"status_", "stacktrace_", "conduitTraceKey_"});
        }
        if (c13 == 3) {
            return new xk0();
        }
        if (c13 == 4) {
            return new a.i9(12);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (xk0.class) {
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
