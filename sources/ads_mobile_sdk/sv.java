package ads_mobile_sdk;

import a.h4;
import a.ta;
import kp.n;

/* loaded from: classes2.dex */
public final class sv extends sj0 {
    private static final sv DEFAULT_INSTANCE;
    private static volatile ta PARSER = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11245c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11246d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11247e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11248f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11249g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11250h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11251i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11252j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11253k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11254l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11255m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11256n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11257o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11258p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11259q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final int f11260r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final int f11261s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11262t = 18;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11263u = 19;
    private long aesbLastUpdateTimeWindowsEpochMicros_;
    private int bitField0_;
    private boolean isAesbEnabled_;
    private boolean isHighRiskUser_;
    private boolean isHistorySyncEnabled_;
    private boolean isIncognito_;
    private boolean isMbbEnabled_;
    private boolean isSignedIn_;
    private boolean isUnderAdvancedProtection_;
    private int numberOfLoadedProfiles_;
    private int numberOfOpenProfiles_;
    private int numberOfProfiles_;
    private int polarbearPopulationMemoizedSerializedSize;
    private int profileManagementStatus_;
    private int serverExperimentGroupsMemoizedSerializedSize;
    private int userPopulation_;
    private static final a.u1 polarbearPopulation_converter_ = new n(5);
    private static final a.u1 serverExperimentGroups_converter_ = new n(6);
    private String finchActiveGroup_ = "";
    private h4 finchActiveGroups_ = sj0.i();
    private String userAgent_ = "";
    private h4 pageLoadTokens_ = sj0.i();
    private a.g1 polarbearPopulation_ = sj0.g();
    private a.g1 serverExperimentGroups_ = sj0.g();

    static {
        sv svVar = new sv();
        DEFAULT_INSTANCE = svVar;
        sj0.a(sv.class, svVar);
    }

    @Override // ads_mobile_sdk.sj0
    public final Object a(int i13, sj0 sj0Var) {
        int c13 = a.bb.c(i13);
        if (c13 == 0) {
            return (byte) 1;
        }
        if (c13 == 2) {
            return new f62(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"bitField0_", "userPopulation_", qv.f10289a, "isHistorySyncEnabled_", "finchActiveGroup_", "finchActiveGroups_", "profileManagementStatus_", mv.f8398a, "isUnderAdvancedProtection_", "isIncognito_", "isMbbEnabled_", "userAgent_", "numberOfProfiles_", "numberOfLoadedProfiles_", "numberOfOpenProfiles_", "isHighRiskUser_", "pageLoadTokens_", lv.class, "isAesbEnabled_", "aesbLastUpdateTimeWindowsEpochMicros_", "polarbearPopulation_", cx1.f4057a, "isSignedIn_", "serverExperimentGroups_", ov.f9460a});
        }
        if (c13 == 3) {
            return new sv();
        }
        if (c13 == 4) {
            return new a.k(14);
        }
        if (c13 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (c13 != 6) {
            throw null;
        }
        ta taVar = PARSER;
        if (taVar == null) {
            synchronized (sv.class) {
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
