package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class a81 extends sj0 {
    private static final a81 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2304c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2305d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2306e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2307f = 4;
    private int bitField0_;
    private float logSampleRate_;
    private String remoteCaptureServiceUrl_ = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long logBufferSize_ = 1000;
    private long logIntervalMs_ = 60000;

    static {
        a81 a81Var = new a81();
        DEFAULT_INSTANCE = a81Var;
        sj0.a(a81.class, a81Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "remoteCaptureServiceUrl_", "logSampleRate_", "logBufferSize_", "logIntervalMs_"});
        }
        if (c13 == 3) {
            return new a81();
        }
        if (c13 == 4) {
            return new a.ug(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (a81.class) {
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

    public static a81 r() {
        return DEFAULT_INSTANCE;
    }

    public static a.ug w() {
        return (a.ug) DEFAULT_INSTANCE.f();
    }

    public final long s() {
        return this.logBufferSize_;
    }

    public final long t() {
        return this.logIntervalMs_;
    }

    public final float u() {
        return this.logSampleRate_;
    }

    public final String v() {
        return this.remoteCaptureServiceUrl_;
    }
}
