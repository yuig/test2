package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class hw extends sj0 {
    private static final hw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6122c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6123d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6124e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6125f = 4;
    private int action_;
    private int bitField0_;
    private long intervalMsec_;
    private boolean isTerminalAction_;
    private int surface_;

    static {
        hw hwVar = new hw();
        DEFAULT_INSTANCE = hwVar;
        sj0.a(hw.class, hwVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "surface_", fw.f5294a, "action_", cw.f4049a, "isTerminalAction_", "intervalMsec_"});
        }
        if (c13 == 3) {
            return new hw();
        }
        if (c13 == 4) {
            return new a.k(7);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (hw.class) {
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
}
