package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class yb extends sj0 {
    private static final yb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14173c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14174d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14175e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14176f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14177g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14178h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14179i = 7;
    private int bitField0_;
    private boolean isBattlestarEmulator_;
    private long pairId_;
    private int responseType_;
    private boolean suspicious_;
    private long timestampMs_;
    private a.g1 reasons_ = sj0.g();
    private h4 crowdValidationOutcomes_ = sj0.i();

    static {
        yb ybVar = new yb();
        DEFAULT_INSTANCE = ybVar;
        sj0.a(yb.class, ybVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b", new Object[]{"bitField0_", "timestampMs_", "responseType_", "suspicious_", "reasons_", "pairId_", "isBattlestarEmulator_", "crowdValidationOutcomes_", cc.class});
        }
        if (c13 == 3) {
            return new yb();
        }
        if (c13 == 4) {
            return new a.i9(15);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (yb.class) {
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
