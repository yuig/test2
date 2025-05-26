package ads_mobile_sdk;

import a.df;
import a.ta;

/* loaded from: classes2.dex */
public final class xv extends sj0 {
    private static final xv DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13827c = 1;
    private int bitField0_;
    private String clickString_ = "";

    static {
        xv xvVar = new xv();
        DEFAULT_INSTANCE = xvVar;
        sj0.a(xv.class, xvVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "clickString_"});
        }
        if (c13 == 3) {
            return new xv();
        }
        if (c13 == 4) {
            return new df(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (xv.class) {
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

    public static df r() {
        return (df) DEFAULT_INSTANCE.f();
    }
}
