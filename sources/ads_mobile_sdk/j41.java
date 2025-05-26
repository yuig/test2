package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class j41 extends sj0 {
    private static final j41 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6677c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6678d = 2;
    private String functionName_ = "";
    private int numIsolates_;

    static {
        j41 j41Var = new j41();
        DEFAULT_INSTANCE = j41Var;
        sj0.a(j41.class, j41Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"functionName_", "numIsolates_"});
        }
        if (c13 == 3) {
            return new j41();
        }
        if (c13 == 4) {
            return new a.k5(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (j41.class) {
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

    public static a.k5 r() {
        return (a.k5) DEFAULT_INSTANCE.f();
    }
}
