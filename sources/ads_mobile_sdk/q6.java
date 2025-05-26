package ads_mobile_sdk;

import a.ta;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q6 extends sj0 {
    private static final q6 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9960c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9961d = 2;
    private int bitField0_;
    private w81 extras_ = w81.a();
    private String format_ = "";

    static {
        q6 q6Var = new q6();
        DEFAULT_INSTANCE = q6Var;
        sj0.a(q6.class, q6Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"bitField0_", "format_", "extras_", a.x9.f185a});
        }
        if (c13 == 3) {
            return new q6();
        }
        if (c13 == 4) {
            return new a.g9(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (q6.class) {
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

    public static a.g9 t() {
        return (a.g9) DEFAULT_INSTANCE.f();
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.extras_);
    }

    public final String s() {
        return this.format_;
    }
}
