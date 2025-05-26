package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class gb extends sj0 {
    private static final gb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5490c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5491d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5492e = 3;
    private int bitField0_;
    private long source_ = -1;
    private int isPhysicalInput_ = 1000;
    private int verified_ = 1000;

    static {
        gb gbVar = new gb();
        DEFAULT_INSTANCE = gbVar;
        sj0.a(gb.class, gbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            fc fcVar = fc.f5097a;
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "source_", "isPhysicalInput_", fcVar, "verified_", fcVar});
        }
        if (c13 == 3) {
            return new gb();
        }
        if (c13 == 4) {
            return new a.k(9);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (gb.class) {
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
