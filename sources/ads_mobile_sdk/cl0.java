package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class cl0 extends sj0 {
    private static final cl0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3949c = 14;
    private int bitField0_;
    private yk0 gmaSdkExceptionMessage_;

    static {
        cl0 cl0Var = new cl0();
        DEFAULT_INSTANCE = cl0Var;
        sj0.a(cl0.class, cl0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\u0000", new Object[]{"bitField0_", "gmaSdkExceptionMessage_"});
        }
        if (c13 == 3) {
            return new cl0();
        }
        if (c13 == 4) {
            return new a.k0(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (cl0.class) {
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

    public static a.k0 r() {
        return (a.k0) DEFAULT_INSTANCE.f();
    }
}
