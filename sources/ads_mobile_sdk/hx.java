package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class hx extends sj0 {
    private static final hx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6130c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6131d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6132e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6133f = 4;
    private int bitField0_;
    private long firstInteractionTimestampMsec_;
    private long lastInteractionTimestampMsec_;
    private int occurrenceCount_;
    private int phishySiteInteractionType_;

    static {
        hx hxVar = new hx();
        DEFAULT_INSTANCE = hxVar;
        sj0.a(hx.class, hxVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "phishySiteInteractionType_", fx.f5297a, "occurrenceCount_", "firstInteractionTimestampMsec_", "lastInteractionTimestampMsec_"});
        }
        if (c13 == 3) {
            return new hx();
        }
        if (c13 == 4) {
            return new a.k(8);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (hx.class) {
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
