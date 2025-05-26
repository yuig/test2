package ads_mobile_sdk;

import a.h4;
import a.ta;
import java.util.List;

/* loaded from: classes2.dex */
public final class n6 extends sj0 {
    private static final n6 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8684c = 1;
    private h4 initializationData_ = sj0.i();

    static {
        n6 n6Var = new n6();
        DEFAULT_INSTANCE = n6Var;
        sj0.a(n6.class, n6Var);
    }

    public static a.z7 t() {
        return (a.z7) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"initializationData_", q6.class});
        }
        if (c13 == 3) {
            return new n6();
        }
        if (c13 == 4) {
            return new a.z7(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (n6.class) {
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

    public static n6 r() {
        return DEFAULT_INSTANCE;
    }

    public final List s() {
        return this.initializationData_;
    }
}
