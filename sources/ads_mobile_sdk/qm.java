package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class qm extends sj0 {
    private static final qm DEFAULT_INSTANCE;
    private static volatile ta PARSER;

    static {
        qm qmVar = new qm();
        DEFAULT_INSTANCE = qmVar;
        sj0.a(qm.class, qmVar);
    }

    public static qm r() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (c13 == 3) {
            return new qm();
        }
        if (c13 == 4) {
            return new a.i9(3);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (qm.class) {
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

    public static void a(il ilVar, jc0 jc0Var) {
    }
}
