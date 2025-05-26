package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class oy1 extends sj0 {
    private static final oy1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9490c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9491d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9492e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9493f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9494g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9495h = 6;
    private boolean cacheHit_;
    private int maxBufferSize_;
    private int numPreloadedAds_;
    private boolean preloadInFlight_;
    private String preloadId_ = "";
    private String evictedAdId_ = "";

    static {
        oy1 oy1Var = new oy1();
        DEFAULT_INSTANCE = oy1Var;
        sj0.a(oy1.class, oy1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"preloadId_", "maxBufferSize_", "numPreloadedAds_", "cacheHit_", "evictedAdId_", "preloadInFlight_"});
        }
        if (c13 == 3) {
            return new oy1();
        }
        if (c13 == 4) {
            return new a.k(28);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (oy1.class) {
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
