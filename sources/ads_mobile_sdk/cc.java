package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class cc extends sj0 {
    private static final cc DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3858c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3859d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3860e = 3;
    private int bitField0_;
    private long lifecycle_;
    private long outcome_;
    private long signal_;

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        sj0.a(cc.class, ccVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "signal_", "outcome_", "lifecycle_"});
        }
        if (c13 == 3) {
            return new cc();
        }
        if (c13 == 4) {
            return new a.k(5);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (cc.class) {
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
