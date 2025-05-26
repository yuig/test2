package ads_mobile_sdk;

import a.k7;
import a.ta;

/* loaded from: classes2.dex */
public final class m71 extends sj0 {
    private static final m71 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f8112c = 1;

    /* renamed from: d */
    public static final int f8113d = 2;

    /* renamed from: e */
    public static final int f8114e = 3;

    /* renamed from: f */
    public static final int f8115f = 4;

    /* renamed from: g */
    public static final int f8116g = 5;

    /* renamed from: h */
    public static final int f8117h = 6;

    /* renamed from: i */
    public static final int f8118i = 7;
    private int bitField0_;
    private long eventCount_;
    private long eventId_;
    private long runtimeMs_;
    private int status_;
    private String exceptionName_ = "";
    private String stackTrace_ = "";
    private String debugInfo_ = "";

    static {
        m71 m71Var = new m71();
        DEFAULT_INSTANCE = m71Var;
        sj0.a(m71.class, m71Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "eventId_", "runtimeMs_", "status_", ln2.f7901a, "exceptionName_", "stackTrace_", "eventCount_", "debugInfo_"});
        }
        if (c13 == 3) {
            return new m71();
        }
        if (c13 == 4) {
            return new k7(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (m71.class) {
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

    public static k7 r() {
        return (k7) DEFAULT_INSTANCE.f();
    }
}
