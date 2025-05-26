package ads_mobile_sdk;

import a.o4;
import a.ta;

/* loaded from: classes2.dex */
public final class i13 extends sj0 {
    private static final i13 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6179c = 1;
    private int saltSize_;

    static {
        i13 i13Var = new i13();
        DEFAULT_INSTANCE = i13Var;
        sj0.a(i13.class, i13Var);
    }

    public static o4 t() {
        return (o4) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
        }
        if (c13 == 3) {
            return new i13();
        }
        if (c13 == 4) {
            return new o4(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (i13.class) {
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
        return this.saltSize_;
    }

    public static i13 r() {
        return DEFAULT_INSTANCE;
    }
}
