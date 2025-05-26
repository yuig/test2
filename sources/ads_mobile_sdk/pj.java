package ads_mobile_sdk;

import a.ta;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pj extends sj0 {
    private static final pj DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9709c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9710d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9711e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9712f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9713g = 5;
    private int bitField0_;
    private boolean shouldCollectSignalsOnFullApp_;
    private boolean shouldGatherSignals_;
    private w81 serverParameters_ = w81.a();
    private String adapterClassName_ = "";
    private String platform_ = "";

    static {
        pj pjVar = new pj();
        DEFAULT_INSTANCE = pjVar;
        sj0.a(pj.class, pjVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u00052", new Object[]{"bitField0_", "adapterClassName_", "shouldGatherSignals_", "shouldCollectSignalsOnFullApp_", "platform_", "serverParameters_", a.m9.f114a});
        }
        if (c13 == 3) {
            return new pj();
        }
        if (c13 == 4) {
            return new a.x8(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (pj.class) {
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

    public static pj r() {
        return DEFAULT_INSTANCE;
    }

    public static a.x8 u() {
        return (a.x8) DEFAULT_INSTANCE.f();
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.serverParameters_);
    }

    public final boolean t() {
        return this.shouldCollectSignalsOnFullApp_;
    }
}
