package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class rb extends sj0 {
    private static final rb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10570c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10571d = 2;
    private int bitField0_;
    private long mediaVolume_ = -1;
    private int isDndMode_ = 1000;

    static {
        rb rbVar = new rb();
        DEFAULT_INSTANCE = rbVar;
        sj0.a(rb.class, rbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "mediaVolume_", "isDndMode_", fc.f5097a});
        }
        if (c13 == 3) {
            return new rb();
        }
        if (c13 == 4) {
            return new a.i9(6);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (rb.class) {
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
