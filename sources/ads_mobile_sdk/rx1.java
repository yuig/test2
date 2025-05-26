package ads_mobile_sdk;

import a.ta;
import a.ua;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rx1 extends sj0 {
    private static final rx1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10843c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10844d = 2;
    private int bitField0_;
    private w81 includeSignals_ = w81.a();
    private c81 pattern_;

    static {
        rx1 rx1Var = new rx1();
        DEFAULT_INSTANCE = rx1Var;
        sj0.a(rx1.class, rx1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pattern_", "includeSignals_", ua.f172a});
        }
        if (c13 == 3) {
            return new rx1();
        }
        if (c13 == 4) {
            return new a.i9(5);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (rx1.class) {
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

    public final Map r() {
        return Collections.unmodifiableMap(this.includeSignals_);
    }

    public final c81 s() {
        c81 c81Var = this.pattern_;
        return c81Var == null ? c81.s() : c81Var;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }
}
