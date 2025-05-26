package ads_mobile_sdk;

import a.ta;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes2.dex */
public final class i4 extends sj0 {
    private static final i4 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6212c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6213d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6214e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6215f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6216g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6217h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6218i = 18;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6219j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6220k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6221l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6222m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6223n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6224o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6225p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final int f6226q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6227r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final int f6228s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final int f6229t = 19;
    private int bitField0_;
    private boolean clearDgArgsAfterUse_;
    private boolean enableGassClient_;
    private boolean enableMinimalAppStartQuerySignals_;
    private boolean enableViewstringBinding_;
    private a81 loggingOptions_;
    private f22 programUpdateOptions_;
    private int requestedAdshieldVersion_;
    private boolean allowFallback_ = true;
    private String hostVersion_ = "unknown_host";
    private long appStartQuerySignalsTimeoutMs_ = 100;
    private long signalsTimeoutMs_ = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
    private long gassSignalTimeoutMs_ = 200;
    private long localIntSignalTimeoutMs_ = 200;
    private long httpRequestTimeoutMs_ = 20000;
    private String prodInstallerCert_ = "";
    private String debugInstallerCert_ = "";
    private long methodTimeoutMs_ = 500;
    private long appStartWindowMs_ = 3000;

    static {
        i4 i4Var = new i4();
        DEFAULT_INSTANCE = i4Var;
        sj0.a(i4.class, i4Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011", new Object[]{"bitField0_", "requestedAdshieldVersion_", q4.f9932a, "hostVersion_", "enableGassClient_", "loggingOptions_", "enableViewstringBinding_", "signalsTimeoutMs_", "programUpdateOptions_", "allowFallback_", "gassSignalTimeoutMs_", "localIntSignalTimeoutMs_", "httpRequestTimeoutMs_", "prodInstallerCert_", "debugInstallerCert_", "methodTimeoutMs_", "appStartWindowMs_", "enableMinimalAppStartQuerySignals_", "appStartQuerySignalsTimeoutMs_", "clearDgArgsAfterUse_"});
        }
        if (c13 == 3) {
            return new i4();
        }
        if (c13 == 4) {
            return new a.r4(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (i4.class) {
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

    public static a.r4 J() {
        return (a.r4) DEFAULT_INSTANCE.f();
    }

    public final String A() {
        return this.hostVersion_;
    }

    public final long B() {
        return this.httpRequestTimeoutMs_;
    }

    public final long C() {
        return this.localIntSignalTimeoutMs_;
    }

    public final a81 D() {
        a81 a81Var = this.loggingOptions_;
        return a81Var == null ? a81.r() : a81Var;
    }

    public final long E() {
        return this.methodTimeoutMs_;
    }

    public final String F() {
        return this.prodInstallerCert_;
    }

    public final f22 G() {
        f22 f22Var = this.programUpdateOptions_;
        return f22Var == null ? f22.r() : f22Var;
    }

    public final r4 H() {
        int i13 = this.requestedAdshieldVersion_;
        r4 r4Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? null : r4.ADSHIELD_VERSION_3 : r4.ADSHIELD_VERSION_2 : r4.ADSHIELD_VERSION_1 : r4.ADSHIELD_VERSION_UNSPECIFIED;
        return r4Var == null ? r4.ADSHIELD_VERSION_UNSPECIFIED : r4Var;
    }

    public final long I() {
        return this.signalsTimeoutMs_;
    }

    public final boolean r() {
        return this.allowFallback_;
    }

    public final long s() {
        return this.appStartQuerySignalsTimeoutMs_;
    }

    public final long t() {
        return this.appStartWindowMs_;
    }

    public final boolean u() {
        return this.clearDgArgsAfterUse_;
    }

    public final String v() {
        return this.debugInstallerCert_;
    }

    public final boolean w() {
        return this.enableGassClient_;
    }

    public final boolean x() {
        return this.enableMinimalAppStartQuerySignals_;
    }

    public final boolean y() {
        return this.enableViewstringBinding_;
    }

    public final long z() {
        return this.gassSignalTimeoutMs_;
    }
}
