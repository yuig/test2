package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ww extends sj0 {
    private static final ww DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13273c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13274d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13275e = 3;
    private int bitField0_;
    private int locallyCachedResultsThreatType_;
    private boolean matchedGlobalCache_;
    private int threatType_;

    static {
        ww wwVar = new ww();
        DEFAULT_INSTANCE = wwVar;
        sj0.a(ww.class, wwVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            tw twVar = tw.f11713a;
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "threatType_", twVar, "matchedGlobalCache_", "locallyCachedResultsThreatType_", twVar});
        }
        if (c13 == 3) {
            return new ww();
        }
        if (c13 == 4) {
            return new a.i9(10);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ww.class) {
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
