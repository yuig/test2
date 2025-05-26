package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class z51 extends sj0 {
    private static final z51 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14637c = 1;
    private String keyUri_ = "";

    static {
        z51 z51Var = new z51();
        DEFAULT_INSTANCE = z51Var;
        sj0.a(z51.class, z51Var);
    }

    public static a.vf t() {
        return (a.vf) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (c13 == 3) {
            return new z51();
        }
        if (c13 == 4) {
            return new a.vf(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (z51.class) {
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

    public final String s() {
        return this.keyUri_;
    }

    public static z51 r() {
        return DEFAULT_INSTANCE;
    }

    public static z51 a(il ilVar, jc0 jc0Var) {
        return (z51) sj0.a(DEFAULT_INSTANCE, ilVar, jc0Var);
    }
}
