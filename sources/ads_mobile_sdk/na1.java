package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.List;

/* loaded from: classes2.dex */
public final class na1 extends sj0 {
    private static final na1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8737c = 1;
    private h4 adNetworkInfo_ = sj0.i();

    static {
        na1 na1Var = new na1();
        DEFAULT_INSTANCE = na1Var;
        sj0.a(na1.class, na1Var);
    }

    public static a.c8 t() {
        return (a.c8) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adNetworkInfo_", i91.class});
        }
        if (c13 == 3) {
            return new na1();
        }
        if (c13 == 4) {
            return new a.c8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (na1.class) {
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

    public static na1 s() {
        return DEFAULT_INSTANCE;
    }

    public final List r() {
        return this.adNetworkInfo_;
    }
}
