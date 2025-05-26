package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class pb extends sj0 {
    private static final pb DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9611c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9612d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9613e = 3;
    private int bitField0_;
    private long screenBrightness_ = -1;
    private long screenBrightnessMode_ = -1;
    private long screenOffTimeout_ = -1;

    static {
        pb pbVar = new pb();
        DEFAULT_INSTANCE = pbVar;
        sj0.a(pb.class, pbVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "screenBrightness_", "screenBrightnessMode_", "screenOffTimeout_"});
        }
        if (c13 == 3) {
            return new pb();
        }
        if (c13 == 4) {
            return new a.i9(0);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (pb.class) {
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
}
