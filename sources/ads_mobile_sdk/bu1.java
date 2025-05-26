package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class bu1 extends sj0 {
    private static final bu1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3600c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3601d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3602e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f3603f = 4;
    private int bitField0_;
    private long expirationTimestampMs_;
    private long generationTimestampMs_;
    private il signature_ = il.f6431b;
    private vx2 vmId_;

    static {
        bu1 bu1Var = new bu1();
        DEFAULT_INSTANCE = bu1Var;
        sj0.a(bu1.class, bu1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "vmId_", "signature_", "generationTimestampMs_", "expirationTimestampMs_"});
        }
        if (c13 == 3) {
            return new bu1();
        }
        if (c13 == 4) {
            return new a.k(1);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (bu1.class) {
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
