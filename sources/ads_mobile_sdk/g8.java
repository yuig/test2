package ads_mobile_sdk;

import a.ta;
import a.u2;

/* loaded from: classes2.dex */
public final class g8 extends sj0 {
    private static final g8 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5470c = 1;
    private int tagSize_;

    static {
        g8 g8Var = new g8();
        DEFAULT_INSTANCE = g8Var;
        sj0.a(g8.class, g8Var);
    }

    public static u2 t() {
        return (u2) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
        }
        if (c13 == 3) {
            return new g8();
        }
        if (c13 == 4) {
            return new u2(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (g8.class) {
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
        return this.tagSize_;
    }

    public static g8 r() {
        return DEFAULT_INSTANCE;
    }
}
