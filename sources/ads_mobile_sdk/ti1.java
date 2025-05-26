package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class ti1 extends sj0 {
    private static final ti1 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11555c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11556d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11557e = 3;
    private int bitField0_;
    private boolean clickToExpandRequested_;
    private boolean customControlsRequested_;
    private boolean startMuted_;

    static {
        ti1 ti1Var = new ti1();
        DEFAULT_INSTANCE = ti1Var;
        sj0.a(ti1.class, ti1Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "startMuted_", "clickToExpandRequested_", "customControlsRequested_"});
        }
        if (c13 == 3) {
            return new ti1();
        }
        if (c13 == 4) {
            return new a.vb(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (ti1.class) {
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

    public static a.vb r() {
        return (a.vb) DEFAULT_INSTANCE.f();
    }
}
