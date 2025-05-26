package ads_mobile_sdk;

import a.ta;

/* loaded from: classes2.dex */
public final class tx extends sj0 {
    private static final tx DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11721c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11722d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11723e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11724f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11725g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11726h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11727i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11728j = 8;
    private boolean appVerificationEnabled_;
    private int bitField0_;
    private long googlePlayServicesVersion_;
    private boolean isAsyncCheck_;
    private boolean isInstantApps_;
    private int urlApiType_;
    private String clientVersion_ = "";
    private String clientName_ = "";
    private String updateApiListVersion_ = "";

    static {
        tx txVar = new tx();
        DEFAULT_INSTANCE = txVar;
        sj0.a(tx.class, txVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"bitField0_", "clientVersion_", "googlePlayServicesVersion_", "isInstantApps_", "urlApiType_", ux.f12247a, "clientName_", "updateApiListVersion_", "isAsyncCheck_", "appVerificationEnabled_"});
        }
        if (c13 == 3) {
            return new tx();
        }
        if (c13 == 4) {
            return new a.fc(DEFAULT_INSTANCE);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (tx.class) {
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

    public static a.fc r() {
        return (a.fc) DEFAULT_INSTANCE.f();
    }
}
