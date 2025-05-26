package ads_mobile_sdk;

import a.n;
import a.ta;

/* loaded from: classes2.dex */
public final class bc1 extends sj0 {
    private static final bc1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2841c = 1;
    private String action_ = "";

    static {
        bc1 bc1Var = new bc1();
        DEFAULT_INSTANCE = bc1Var;
        sj0.a(bc1.class, bc1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"action_"});
        }
        if (c13 == 3) {
            return new bc1();
        }
        if (c13 == 4) {
            return new n(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (bc1.class) {
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

    public static n r() {
        return (n) DEFAULT_INSTANCE.f();
    }
}
