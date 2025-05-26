package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ic extends sj0 {
    private static final ic DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6307c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6308d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6309e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6310f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6311g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6312h = 6;
    private String adshieldVersion_ = "";
    private String afmaVersion_ = "";
    private String appIdSignal_ = "D";
    private int bitField0_;
    private long evtTime_;
    private long uptSignal_;
    private long vcdSignal_;

    static {
        ic icVar = new ic();
        DEFAULT_INSTANCE = icVar;
        sj0.a(ic.class, icVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "adshieldVersion_", "afmaVersion_", "evtTime_", "appIdSignal_", "vcdSignal_", "uptSignal_"});
        }
        if (c13 == 3) {
            return new ic();
        }
        if (c13 == 4) {
            return new a.z4(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ic.class) {
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

    public static a.z4 r() {
        return (a.z4) DEFAULT_INSTANCE.f();
    }
}
