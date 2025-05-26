package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class y12 extends sj0 {
    private static final y12 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13944c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13945d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13946e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13947f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13948g = 5;
    private int bitField0_;
    private long downloadTimestampSecs_;
    private long expiredTimestampSecs_;
    private long expiryPeriodSecs_;
    private String vmChecksum_ = "";
    private String bytecodeChecksum_ = "";

    static {
        y12 y12Var = new y12();
        DEFAULT_INSTANCE = y12Var;
        sj0.a(y12.class, y12Var);
    }

    public static y12 s() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "vmChecksum_", "bytecodeChecksum_", "expiredTimestampSecs_", "downloadTimestampSecs_", "expiryPeriodSecs_"});
        }
        if (c13 == 3) {
            return new y12();
        }
        if (c13 == 4) {
            return new a.i9(11);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (y12.class) {
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

    public final String r() {
        return this.bytecodeChecksum_;
    }

    public final long t() {
        return this.expiredTimestampSecs_;
    }

    public final String u() {
        return this.vmChecksum_;
    }
}
