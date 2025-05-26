package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum uv implements a.w {
    SAFE(0),
    DANGEROUS(1),
    UNCOMMON(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4),
    UNKNOWN(5),
    PLAY_POLICY_VIOLATION_SEVERE(6),
    PLAY_POLICY_VIOLATION_OTHER(7),
    DANGEROUS_ACCOUNT_COMPROMISE(8),
    PENDING(9),
    PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE(10),
    HIGH_RISK_BLOCK(11),
    HIGH_RISK_WARN(12),
    PROBABLY_BAD(13),
    VERIFIER_APP_VERIFICATION_FAILED(16),
    VERDICT_UNSPECIFIED(15);


    /* renamed from: a, reason: collision with root package name */
    public final int f12214a;

    uv(int i13) {
        this.f12214a = i13;
    }

    public static uv a(int i13) {
        switch (i13) {
            case 0:
                return SAFE;
            case 1:
                return DANGEROUS;
            case 2:
                return UNCOMMON;
            case 3:
                return POTENTIALLY_UNWANTED;
            case 4:
                return DANGEROUS_HOST;
            case 5:
                return UNKNOWN;
            case 6:
                return PLAY_POLICY_VIOLATION_SEVERE;
            case 7:
                return PLAY_POLICY_VIOLATION_OTHER;
            case 8:
                return DANGEROUS_ACCOUNT_COMPROMISE;
            case 9:
                return PENDING;
            case 10:
                return PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE;
            case 11:
                return HIGH_RISK_BLOCK;
            case 12:
                return HIGH_RISK_WARN;
            case 13:
                return PROBABLY_BAD;
            case 14:
            default:
                return null;
            case 15:
                return VERDICT_UNSPECIFIED;
            case 16:
                return VERIFIER_APP_VERIFICATION_FAILED;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + uv.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12214a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f12214a;
    }
}
