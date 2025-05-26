package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.List;

/* loaded from: classes2.dex */
public final class r5 extends sj0 {
    private static final r5 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10502c = 1;
    private h4 adUnitPatterns_ = sj0.i();

    static {
        r5 r5Var = new r5();
        DEFAULT_INSTANCE = r5Var;
        sj0.a(r5.class, r5Var);
    }

    public static a.la t() {
        return (a.la) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adUnitPatterns_", n5.class});
        }
        if (c13 == 3) {
            return new r5();
        }
        if (c13 == 4) {
            return new a.la(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (r5.class) {
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

    public static r5 s() {
        return DEFAULT_INSTANCE;
    }

    public final List r() {
        return this.adUnitPatterns_;
    }
}
