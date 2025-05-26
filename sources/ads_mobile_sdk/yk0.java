package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class yk0 extends sj0 {
    public static final int A = 24;
    public static final int B = 25;
    public static final int C = 26;
    public static final int D = 27;
    private static final yk0 DEFAULT_INSTANCE;
    public static final int E = 28;
    public static final int F = 29;
    public static final int G = 30;
    public static final int H = 31;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14276c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14277d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14278e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14279f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14280g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14281h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14282i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14283j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14284k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14285l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14286m = 32;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14287n = 11;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14288o = 12;

    /* renamed from: p, reason: collision with root package name */
    public static final int f14289p = 13;

    /* renamed from: q, reason: collision with root package name */
    public static final int f14290q = 14;

    /* renamed from: r, reason: collision with root package name */
    public static final int f14291r = 15;

    /* renamed from: s, reason: collision with root package name */
    public static final int f14292s = 16;

    /* renamed from: t, reason: collision with root package name */
    public static final int f14293t = 17;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14294u = 18;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14295v = 19;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14296w = 20;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14297x = 21;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14298y = 22;

    /* renamed from: z, reason: collision with root package name */
    public static final int f14299z = 23;
    private int bitField0_;
    private xk0 deobfuscatedStacktrace_;
    private int format_;
    private long gmsCoreVersion_;
    private int networkType_;
    private int orientation_;
    private int os_;
    private long samplingDenominator_;
    private int targetVersion_;
    private long timeMsec_;
    private boolean trapped_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String name_ = "";
    private String exceptionClass_ = "";
    private String topException_ = "";
    private String stacktrace_ = "";
    private String sdkVersion_ = "";
    private String afmaVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private a.k3 experimentId_ = sj0.h();
    private String sessionId_ = "";
    private String requestId_ = "";
    private String adId_ = "";
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String stackTraceHash_ = "";

    static {
        yk0 yk0Var = new yk0();
        DEFAULT_INSTANCE = yk0Var;
        sj0.a(yk0.class, yk0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004 \u0000\u0001\u0001  \u0000\u0001\u0000\u0001\u0002\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000bȈ\fȈ\r\u0004\u000eȈ\u000fȈ\u0010%\u0011\f\u0012\u0004\u0013\u0002\u0014\f\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001fဉ\u0000 Ȉ", new Object[]{"bitField0_", "timeMsec_", "trapped_", "name_", "exceptionClass_", "topException_", "stacktrace_", "os_", "sdkVersion_", "afmaVersion_", "appName_", "appId_", "osVersion_", "targetVersion_", "deviceModel_", "country_", "experimentId_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "sessionId_", "requestId_", "adId_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "samplingDenominator_", "stackTraceHash_", "deobfuscatedStacktrace_", "appVersionName_"});
        }
        if (c13 == 3) {
            return new yk0();
        }
        if (c13 == 4) {
            return new a.je(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (yk0.class) {
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

    public static a.je r() {
        return (a.je) DEFAULT_INSTANCE.f();
    }
}
