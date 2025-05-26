package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class dx extends sj0 {
    private static final dx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4480c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4481d = 2;
    private int bitField0_;
    private long displayDurationSec_;
    private String origin_ = "";

    static {
        dx dxVar = new dx();
        DEFAULT_INSTANCE = dxVar;
        sj0.a(dx.class, dxVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "origin_", "displayDurationSec_"});
        }
        if (c13 == 3) {
            return new dx();
        }
        if (c13 == 4) {
            return new a.k(6);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (dx.class) {
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
