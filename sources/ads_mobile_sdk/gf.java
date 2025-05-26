package ads_mobile_sdk;

import a.c3;
import a.h0;
import a.ta;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gf extends sj0 {
    private static final gf DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5540c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5541d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5542e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5543f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5544g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5545h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5546i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5547j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5548k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5549l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5550m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5551n = 12;
    private int bitField0_;
    private long lastUpdateTimeMs_;
    private long serverCacheTtlSecs_;
    private int loggingOnlyExperimentIdsMemoizedSerializedSize = -1;
    private w81 adUnitAndFormatToMediationConfigs_ = w81.a();
    private w81 adUnitAndFormatToRequestSignals_ = w81.a();
    private w81 adapterInitializationConfigs_ = w81.a();
    private w81 adUnitPatterns_ = w81.a();
    private w81 signalAdapterConfigs_ = w81.a();
    private w81 admobSignalAdapterConfigs_ = w81.a();
    private w81 adManagerSignalAdapterConfigs_ = w81.a();
    private String appSettingsJson_ = "";
    private a.k3 loggingOnlyExperimentIds_ = sj0.h();
    private String commonSettingsJson_ = "";

    static {
        gf gfVar = new gf();
        DEFAULT_INSTANCE = gfVar;
        sj0.a(gf.class, gfVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\f\u0000\u0001\u0001\f\f\u0007\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004%\u00052\u0006ለ\u0003\u00072\b2\t2\n2\u000b2\f2", new Object[]{"bitField0_", "appSettingsJson_", "lastUpdateTimeMs_", "serverCacheTtlSecs_", "loggingOnlyExperimentIds_", "adUnitAndFormatToMediationConfigs_", a.ch.f30a, "commonSettingsJson_", "adUnitAndFormatToRequestSignals_", a.o.f127a, "adapterInitializationConfigs_", a.y0.f187a, "adUnitPatterns_", h0.f49a, "signalAdapterConfigs_", c3.f29a, "admobSignalAdapterConfigs_", a.o1.f128a, "adManagerSignalAdapterConfigs_", a.fg.f41a});
        }
        if (c13 == 3) {
            return new gf();
        }
        if (c13 == 4) {
            return new a.c2(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (gf.class) {
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

    public static a.c2 C() {
        return (a.c2) DEFAULT_INSTANCE.f();
    }

    public static gf z() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.lastUpdateTimeMs_;
    }

    public final long B() {
        return this.serverCacheTtlSecs_;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.adManagerSignalAdapterConfigs_);
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToMediationConfigs_);
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToRequestSignals_);
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.adUnitPatterns_);
    }

    public final Map v() {
        return Collections.unmodifiableMap(this.adapterInitializationConfigs_);
    }

    public final Map w() {
        return Collections.unmodifiableMap(this.admobSignalAdapterConfigs_);
    }

    public final String x() {
        return this.appSettingsJson_;
    }

    public final String y() {
        return this.commonSettingsJson_;
    }

    public static gf a(InputStream inputStream) {
        return (gf) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0.a()));
    }
}
