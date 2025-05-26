package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class q13 extends sj0 {
    private static final q13 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9911c = 1;
    private int version_;

    static {
        q13 q13Var = new q13();
        DEFAULT_INSTANCE = q13Var;
        sj0.a(q13.class, q13Var);
    }

    public static q13 r() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
        }
        if (c13 == 3) {
            return new q13();
        }
        if (c13 == 4) {
            return new a.i9(2);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (q13.class) {
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
        return this.version_;
    }

    public static q13 a(il ilVar, jc0 jc0Var) {
        return (q13) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
