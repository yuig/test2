package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class q9 extends sj0 {
    private static final q9 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9991c = 1;
    private int ivSize_;

    static {
        q9 q9Var = new q9();
        DEFAULT_INSTANCE = q9Var;
        sj0.a(q9.class, q9Var);
    }

    public static a.aa t() {
        return (a.aa) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
        }
        if (c13 == 3) {
            return new q9();
        }
        if (c13 == 4) {
            return new a.aa(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (q9.class) {
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

    public final int s() {
        return this.ivSize_;
    }

    public static q9 r() {
        return DEFAULT_INSTANCE;
    }
}
