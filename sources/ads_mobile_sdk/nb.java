package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class nb extends sj0 {
    private static final nb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8738c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8739d = 2;
    private int bitField0_;
    private long counter_ = -1;
    private int deviceIdType_;

    static {
        nb nbVar = new nb();
        DEFAULT_INSTANCE = nbVar;
        sj0.a(nb.class, nbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "deviceIdType_", za.f14686a, "counter_"});
        }
        if (c13 == 3) {
            return new nb();
        }
        if (c13 == 4) {
            return new a.k(24);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (nb.class) {
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
