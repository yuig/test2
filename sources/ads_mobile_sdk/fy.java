package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class fy extends sj0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 28;
    private static final fy DEFAULT_INSTANCE;
    public static final int E = 29;
    public static final int F = 30;
    public static final int G = 31;
    public static final int H = 32;
    public static final int I = 33;

    /* renamed from: J, reason: collision with root package name */
    public static final int f5306J = 34;
    public static final int K = 35;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5307c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5308d = 11;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5309e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5310f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5311g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5312h = 12;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5313i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5314j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5315k = 13;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5316l = 14;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5317m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5318n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5319o = 7;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5320p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5321q = 9;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5322r = 15;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5323s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5324t = 18;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5325u = 19;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5326v = 20;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5327w = 21;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5328x = 22;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5329y = 23;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5330z = 24;
    private int bitField0_;
    private tx clientProperties_;
    private boolean complete_;
    private xv creativeProperties_;
    private boolean didProceed_;
    private bw downloadItemInfo_;
    private int downloadVerdict_;
    private xw hashRealTimeExperimentDetails_;
    private dx permissionPromptInfo_;
    private sv population_;
    private lx renderedAd_;
    private boolean repeatVisit_;
    private boolean showDownloadInFolder_;
    private int type_;
    private int urlRequestDestination_;
    private zx userInfo_;
    private ey warningShownInfo_;
    private long warningShownTimestampMsec_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private String pageUrl_ = "";
    private String referrerUrl_ = "";
    private h4 resources_ = sj0.i();
    private h4 dom_ = sj0.i();
    private String clickUrl_ = "";
    private h4 clientAsn_ = sj0.i();
    private String clientCountry_ = "";
    private il token_ = il.f6431b;
    private String userAgent_ = "";
    private h4 disallowedPermissions_ = sj0.i();
    private h4 rejectedPermissions_ = sj0.i();
    private h4 referrerChain_ = sj0.i();
    private String safetyNetId_ = "";
    private h4 downloadWarningActions_ = sj0.i();
    private h4 interstitialInteractions_ = sj0.i();
    private h4 phishySiteInteractions_ = sj0.i();
    private String locale_ = "";

    static {
        fy fyVar = new fy();
        DEFAULT_INSTANCE = fyVar;
        sj0.a(fy.class, fyVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        switch (a.bb.c(i13)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (sj0Var == null ? 0 : 1);
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"bitField0_", "url_", "pageUrl_", "referrerUrl_", "resources_", rx.class, "complete_", "clientAsn_", "clientCountry_", "didProceed_", "repeatVisit_", "type_", mx.f8414a, "downloadVerdict_", tv.f11706a, "creativeProperties_", "clickUrl_", "renderedAd_", "token_", "dom_", jy.class, "clientProperties_", "showDownloadInFolder_", "userAgent_", "disallowedPermissions_", "rejectedPermissions_", "userInfo_", "referrerChain_", ry.class, "downloadItemInfo_", "safetyNetId_", "population_", "downloadWarningActions_", hw.class, "hashRealTimeExperimentDetails_", "urlRequestDestination_", wx.f13293a, "interstitialInteractions_", bx.class, "phishySiteInteractions_", hx.class, "warningShownTimestampMsec_", "warningShownInfo_", "permissionPromptInfo_", "locale_"});
            case 3:
                return new fy();
            case 4:
                return new a.pe(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ta taVar = PARSER;
                if (taVar == null) {
                    synchronized (fy.class) {
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
            default:
                throw null;
        }
    }

    public static a.pe r() {
        return (a.pe) DEFAULT_INSTANCE.f();
    }
}
