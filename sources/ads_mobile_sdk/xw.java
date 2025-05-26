package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class xw extends sj0 {
    private static final xw DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13830c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13831d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13832e = 3;
    private int bitField0_;
    private int hashDatabaseThreatType_;
    private ww hashRealtimeDetails_;
    private ww urlRealtimeDetails_;

    static {
        xw xwVar = new xw();
        DEFAULT_INSTANCE = xwVar;
        sj0.a(xw.class, xwVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "hashDatabaseThreatType_", tw.f11713a, "urlRealtimeDetails_", "hashRealtimeDetails_"});
        }
        if (c13 == 3) {
            return new xw();
        }
        if (c13 == 4) {
            return new a.i9(8);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (xw.class) {
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
