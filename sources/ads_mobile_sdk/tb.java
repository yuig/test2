package ads_mobile_sdk;

import a.qb;
import a.ta;

/* loaded from: classes2.dex */
public final class tb extends sj0 {
    private static final tb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11471c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11472d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11473e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11474f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11475g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11476h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11477i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11478j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11479k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11480l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11481m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11482n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11483o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11484p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11485q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final int f11486r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final int f11487s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11488t = 18;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11489u = 19;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11490v = 20;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11491w = 21;
    private int bitField0_;
    private long viewDxSignal_;
    private long viewDySignal_;
    private long tcxSignal_ = -1;
    private long tcySignal_ = -1;
    private long tcd_ = -1;
    private long avgMoveTcd_ = -1;
    private long tcp_ = -1;
    private long avgMoveTcp_ = -1;
    private int obscured_ = 1000;
    private long tctMs_ = -1;
    private long toolType_ = -1;
    private long source_ = -1;
    private int isPhysicalTouch_ = 1000;
    private long stkDepth_ = -1;
    private long pathDistanceSignal_ = -1;
    private long viewXSignal_ = -1;
    private long viewYSignal_ = -1;
    private long tcxDownSignal_ = -1;
    private long tcyDownSignal_ = -1;
    private long tcxUpSignal_ = -1;
    private long tcyUpSignal_ = -1;

    static {
        tb tbVar = new tb();
        DEFAULT_INSTANCE = tbVar;
        sj0.a(tb.class, tbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            fc fcVar = fc.f5097a;
            return new f62(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"bitField0_", "tcxSignal_", "tcySignal_", "tcd_", "avgMoveTcd_", "tcp_", "avgMoveTcp_", "obscured_", fcVar, "tctMs_", "toolType_", "source_", "isPhysicalTouch_", fcVar, "stkDepth_", "pathDistanceSignal_", "viewXSignal_", "viewYSignal_", "viewDxSignal_", "viewDySignal_", "tcxDownSignal_", "tcyDownSignal_", "tcxUpSignal_", "tcyUpSignal_"});
        }
        if (c13 == 3) {
            return new tb();
        }
        if (c13 == 4) {
            return new qb(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (tb.class) {
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

    public static qb r() {
        return (qb) DEFAULT_INSTANCE.f();
    }
}
