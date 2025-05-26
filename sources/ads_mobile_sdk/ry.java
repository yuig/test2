package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class ry extends sj0 {
    private static final ry DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10846c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10847d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10848e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10849f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10850g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10851h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f10852i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f10853j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10854k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f10855l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f10856m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f10857n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f10858o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final int f10859p = 14;
    private int bitField0_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private String url_ = "";
    private String mainFrameUrl_ = "";
    private int type_ = 4;
    private h4 ipAddresses_ = sj0.i();
    private String referrerUrl_ = "";
    private String referrerMainFrameUrl_ = "";
    private h4 serverRedirectChain_ = sj0.i();

    static {
        ry ryVar = new ry();
        DEFAULT_INSTANCE = ryVar;
        sj0.a(ry.class, ryVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"bitField0_", "url_", "type_", py.f9851a, "ipAddresses_", "referrerUrl_", "referrerMainFrameUrl_", "isRetargeting_", "navigationTimeMsec_", "serverRedirectChain_", oy.class, "mainFrameUrl_", "navigationInitiation_", ly.f8024a, "maybeLaunchedByExternalApplication_", "isSubframeUrlRemoved_", "isSubframeReferrerUrlRemoved_", "isUrlRemovedByPolicy_"});
        }
        if (c13 == 3) {
            return new ry();
        }
        if (c13 == 4) {
            return new a.k(21);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ry.class) {
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
