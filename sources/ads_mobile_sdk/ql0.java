package ads_mobile_sdk;

import a.ta;
import kp.n;

/* loaded from: classes2.dex */
public final class ql0 extends sj0 {
    public static final int A = 9;
    public static final int B = 53;
    public static final int C = 10;
    public static final int D = 11;
    private static final ql0 DEFAULT_INSTANCE;
    public static final int E = 12;
    public static final int F = 13;
    public static final int G = 14;
    public static final int H = 26;
    public static final int I = 27;

    /* renamed from: J, reason: collision with root package name */
    public static final int f10125J = 46;
    public static final int K = 45;
    public static final int L = 43;
    public static final int M = 48;
    public static final int N = 44;
    public static final int O = 49;
    public static final int P = 50;
    private static volatile ta PARSER = null;
    public static final int Q = 28;
    public static final int R = 60;
    public static final int S = 15;
    public static final int T = 16;
    public static final int U = 17;
    public static final int V = 18;
    public static final int W = 19;
    public static final int X = 20;
    public static final int Y = 29;
    public static final int Z = 55;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f10126a0 = 56;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f10127b0 = 38;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10128c = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f10129c0 = 39;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10130d = 40;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f10131d0 = 57;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10132e = 30;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f10133e0 = 47;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10134f = 31;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f10135f0 = 41;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10136g = 32;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f10137g0 = 42;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10138h = 33;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f10139h0 = 52;

    /* renamed from: i, reason: collision with root package name */
    public static final int f10140i = 37;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f10141i0 = 54;

    /* renamed from: j, reason: collision with root package name */
    public static final int f10142j = 2;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f10143j0 = 58;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10144k = 3;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f10145k0 = 59;

    /* renamed from: l, reason: collision with root package name */
    public static final int f10146l = 34;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f10147l0 = 61;

    /* renamed from: m, reason: collision with root package name */
    public static final int f10148m = 35;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f10149m0 = 62;

    /* renamed from: n, reason: collision with root package name */
    public static final int f10150n = 36;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f10151n0 = 63;

    /* renamed from: o, reason: collision with root package name */
    public static final int f10152o = 4;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f10153o0 = 65;

    /* renamed from: p, reason: collision with root package name */
    public static final int f10154p = 5;

    /* renamed from: q, reason: collision with root package name */
    public static final int f10155q = 21;

    /* renamed from: r, reason: collision with root package name */
    public static final int f10156r = 22;

    /* renamed from: s, reason: collision with root package name */
    public static final int f10157s = 64;

    /* renamed from: t, reason: collision with root package name */
    public static final int f10158t = 6;
    private static final a.u1 tag_converter_ = new n(4);

    /* renamed from: u, reason: collision with root package name */
    public static final int f10159u = 51;

    /* renamed from: v, reason: collision with root package name */
    public static final int f10160v = 7;

    /* renamed from: w, reason: collision with root package name */
    public static final int f10161w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f10162x = 23;

    /* renamed from: y, reason: collision with root package name */
    public static final int f10163y = 24;

    /* renamed from: z, reason: collision with root package name */
    public static final int f10164z = 25;
    private int adConfigurationIndex_;
    private int bitField0_;
    private int cachedSignalState_;
    private long childCpuTimeMillis_;
    private xm chromeVariations_;
    private long cpuTimeMillis_;
    private int customTabsNavigationEvent_;
    private int format_;
    private long gmsCoreVersion_;
    private int gmsgName_;
    private ko0 h5Data_;
    private j41 jsEngineData_;
    private long latencyMillis_;
    private int mediationChainLength_;
    private bc1 mraidData_;
    private int name_;
    private int networkType_;
    private ip1 offlineData_;
    private int orientation_;
    private int os_;
    private long parentTraceId_;
    private oy1 preloadData_;
    private int processState_;
    private long samplingDenominator_;
    private od2 scarCacheEvictionData_;
    private int scarRequestType_;
    private int sequenceNumber_;
    private zg2 signalCacheData_;
    private eh2 signalData_;
    private int signalId_;
    private long startTimeMillis_;
    private boolean success_;
    private int tagMemoizedSerializedSize;
    private int targetVersion_;
    private long traceDepth_;
    private long traceId_;
    private kz2 webviewData_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String rootTraceId_ = "";
    private a.g1 tag_ = sj0.g();
    private String sdkVersion_ = "";
    private String canonicalSdkVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String adUnitId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private a.k3 experimentId_ = sj0.h();
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String signalGenerationRequestId_ = "";
    private String internalRequestId_ = "";
    private String renderId_ = "";
    private String renderer_ = "";
    private String adId_ = "";
    private String preloadId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String topException_ = "";
    private String stackTraceHash_ = "";
    private String cause_ = "";
    private String cronetProvider_ = "";
    private String rawChromeVariations_ = "";

    static {
        ql0 ql0Var = new ql0();
        DEFAULT_INSTANCE = ql0Var;
        sj0.a(ql0.class, ql0Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004A\u0000\u0001\u0001AA\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\t", new Object[]{"bitField0_", "name_", "success_", "latencyMillis_", "os_", "sdkVersion_", "appId_", "osVersion_", "targetVersion_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "topException_", "stackTraceHash_", "cause_", "canonicalSdkVersion_", "appName_", "deviceModel_", "country_", "experimentId_", "sessionId_", "requestId_", "adId_", "samplingDenominator_", "rootTraceId_", "traceId_", "parentTraceId_", "traceDepth_", "startTimeMillis_", "cpuTimeMillis_", "childCpuTimeMillis_", "tag_", "signalId_", "cachedSignalState_", "gmsgName_", "scarCacheEvictionData_", "h5Data_", "sequenceNumber_", "renderId_", "internalRequestId_", "signalGenerationRequestId_", "scarRequestType_", "mediationChainLength_", "adConfigurationIndex_", "renderer_", "adUnitId_", "mraidData_", "processState_", "jsEngineData_", "cronetProvider_", "customTabsNavigationEvent_", "signalData_", "signalCacheData_", "preloadData_", "preloadId_", "offlineData_", "chromeVariations_", "rawChromeVariations_", "appVersionName_", "webviewData_"});
        }
        if (c13 == 3) {
            return new ql0();
        }
        if (c13 == 4) {
            return new a.b4(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ql0.class) {
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

    public static a.b4 r() {
        return (a.b4) DEFAULT_INSTANCE.f();
    }
}
