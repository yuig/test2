package ads_mobile_sdk;

import a.qd;
import a.ta;

/* loaded from: classes2.dex */
public final class vb extends sj0 {
    private static final vb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12416c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12417d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12418e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12419f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12420g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12421h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12422i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12423j = 8;
    private int bitField0_;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private long minAlphaSignal_ = -1;
    private long viewHeight_ = -1;
    private long viewWidth_ = -1;
    private long displayDensity_ = -1;
    private long estimatedOccludedSurface_ = -1;
    private long scaleFactor_ = -1;

    static {
        vb vbVar = new vb();
        DEFAULT_INSTANCE = vbVar;
        sj0.a(vb.class, vbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"bitField0_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "minAlphaSignal_", "viewHeight_", "viewWidth_", "displayDensity_", "estimatedOccludedSurface_", "scaleFactor_"});
        }
        if (c13 == 3) {
            return new vb();
        }
        if (c13 == 4) {
            return new qd(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (vb.class) {
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

    public static qd r() {
        return (qd) DEFAULT_INSTANCE.f();
    }
}
