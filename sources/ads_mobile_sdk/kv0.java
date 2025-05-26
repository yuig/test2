package ads_mobile_sdk;

import a.o6;
import a.ta;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class kv0 extends sj0 {
    private static final kv0 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7540c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7541d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7542e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7543f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7544g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7545h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7546i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7547j = 8;
    private int gesture_;
    private boolean isLinkedDevice_;
    private boolean isTestMode_;
    private long networkExtrasExpirationSecs_;
    private String networkExtras_ = "";
    private String deviceIdForDebugging_ = "";
    private String debugAdUnitId_ = "";
    private String uiStorage_ = "";

    static {
        kv0 kv0Var = new kv0();
        DEFAULT_INSTANCE = kv0Var;
        sj0.a(kv0.class, kv0Var);
    }

    public static o6 A() {
        return (o6) DEFAULT_INSTANCE.f();
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"isTestMode_", "isLinkedDevice_", "gesture_", "networkExtras_", "networkExtrasExpirationSecs_", "deviceIdForDebugging_", "debugAdUnitId_", "uiStorage_"});
        }
        if (c13 == 3) {
            return new kv0();
        }
        if (c13 == 4) {
            return new o6(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (kv0.class) {
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

    public final String z() {
        return this.uiStorage_;
    }

    public static kv0 s() {
        return DEFAULT_INSTANCE;
    }

    public final String r() {
        return this.debugAdUnitId_;
    }

    public final String t() {
        return this.deviceIdForDebugging_;
    }

    public final bt0 u() {
        int i13 = this.gesture_;
        bt0 bt0Var = i13 != 0 ? i13 != 1 ? i13 != 2 ? null : bt0.FLICK : bt0.SHAKE : bt0.NONE;
        return bt0Var == null ? bt0.UNRECOGNIZED : bt0Var;
    }

    public final boolean v() {
        return this.isLinkedDevice_;
    }

    public final boolean w() {
        return this.isTestMode_;
    }

    public final String x() {
        return this.networkExtras_;
    }

    public final long y() {
        return this.networkExtrasExpirationSecs_;
    }

    public static kv0 a(InputStream inputStream) {
        return (kv0) sj0.a(sj0.a(DEFAULT_INSTANCE, io.a(inputStream), jc0.a()));
    }
}
