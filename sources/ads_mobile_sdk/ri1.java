package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ri1 extends sj0 {
    private static final ri1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10649c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10650d = 2;
    private int bitField0_;
    private int sccgDir_;
    private boolean sccgTap_;

    static {
        ri1 ri1Var = new ri1();
        DEFAULT_INSTANCE = ri1Var;
        sj0.a(ri1.class, ri1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "sccgDir_", "sccgTap_"});
        }
        if (c13 == 3) {
            return new ri1();
        }
        if (c13 == 4) {
            return new a.pa(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ri1.class) {
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

    public static a.pa r() {
        return (a.pa) DEFAULT_INSTANCE.f();
    }
}
