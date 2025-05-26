package ads_mobile_sdk;

import a.h4;
import a.ta;

/* loaded from: classes2.dex */
public final class l4 extends sj0 {
    private static final l4 DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c */
    public static final int f7659c = 8;

    /* renamed from: d */
    public static final int f7660d = 21;

    /* renamed from: e */
    public static final int f7661e = 22;

    /* renamed from: f */
    public static final int f7662f = 23;

    /* renamed from: g */
    public static final int f7663g = 24;

    /* renamed from: h */
    public static final int f7664h = 25;

    /* renamed from: i */
    public static final int f7665i = 40;

    /* renamed from: j */
    public static final int f7666j = 41;

    /* renamed from: k */
    public static final int f7667k = 60;

    /* renamed from: l */
    public static final int f7668l = 61;

    /* renamed from: m */
    public static final int f7669m = 62;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int deviceType_;
    private long samplingDenominator_;
    private h4 logEvents_ = sj0.i();
    private String model_ = "";
    private String locale_ = "";
    private String country_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";
    private String adshieldVersion_ = "";

    static {
        l4 l4Var = new l4();
        DEFAULT_INSTANCE = l4Var;
        sj0.a(l4.class, l4Var);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0004\u000b\u0000\u0001\b>\u000b\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t", new Object[]{"bitField0_", "logEvents_", m71.class, "apiLevel_", "model_", "locale_", "country_", "deviceType_", a90.f2312a, "appId_", "appVersionCode_", "hostVersion_", "adshieldVersion_", "samplingDenominator_"});
        }
        if (c13 == 3) {
            return new l4();
        }
        if (c13 == 4) {
            return new a.u6(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (l4.class) {
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

    public static a.u6 r() {
        return (a.u6) DEFAULT_INSTANCE.f();
    }
}
