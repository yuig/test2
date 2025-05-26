package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ol0 implements a.w {
    UNDEFINED(0),
    ADAPTER_VERSIONS(25),
    AD_ID_INFO(20),
    AD_ID_PERMISSION(13),
    AD_REQUEST(1),
    AD_RESPONSE_ENCRYPTION_KEY(28),
    AD_SERVICES_EXTENSION_VERSION(33),
    AD_SIZE(7),
    AD_SPAM(19),
    AD_TYPE(11),
    AMAZON_FIRE_AD_ID(39),
    APP_OPEN(27),
    APP_PERMISSIONS(14),
    APP_SET_ID(21),
    AUDIO(2),
    BANNER_REFRESH(34),
    BATTERY(3),
    CLD(15),
    CONSENT_STRINGS(12),
    CSRB_ECO_DATA(42),
    DEBUG_SIGNAL(32),
    DISPLAY_COUNT(40),
    EXPERIMENT_IDS(9),
    FIREBASE_ANALYTICS(37),
    ICON_AD(35),
    IN_MEMORY_SDK_CORE_DATA(41),
    INSPECTOR_SIGNAL(31),
    MEMORY(8),
    NATIVE_AD(24),
    OMID(5),
    PACKAGE_INFO(10),
    PER_APP_ID_V1(22),
    PER_APP_ID_V2(23),
    QUALITY(16),
    REQUEST_ID(17),
    RTB_SIGNAL(26),
    SDK_ENV(18),
    SESSION_ID(29),
    STATIC_DEVICE(4),
    TELEPHONY(6),
    TOPICS(30),
    SCAR_SIGNAL_TYPE(36),
    TRUSTLESS_TOKEN(38),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f9354a;

    ol0(int i13) {
        this.f9354a = i13;
    }

    public static ol0 a(int i13) {
        switch (i13) {
            case 0:
                return UNDEFINED;
            case 1:
                return AD_REQUEST;
            case 2:
                return AUDIO;
            case 3:
                return BATTERY;
            case 4:
                return STATIC_DEVICE;
            case 5:
                return OMID;
            case 6:
                return TELEPHONY;
            case 7:
                return AD_SIZE;
            case 8:
                return MEMORY;
            case 9:
                return EXPERIMENT_IDS;
            case 10:
                return PACKAGE_INFO;
            case 11:
                return AD_TYPE;
            case 12:
                return CONSENT_STRINGS;
            case 13:
                return AD_ID_PERMISSION;
            case 14:
                return APP_PERMISSIONS;
            case 15:
                return CLD;
            case 16:
                return QUALITY;
            case 17:
                return REQUEST_ID;
            case 18:
                return SDK_ENV;
            case 19:
                return AD_SPAM;
            case 20:
                return AD_ID_INFO;
            case 21:
                return APP_SET_ID;
            case 22:
                return PER_APP_ID_V1;
            case 23:
                return PER_APP_ID_V2;
            case 24:
                return NATIVE_AD;
            case 25:
                return ADAPTER_VERSIONS;
            case 26:
                return RTB_SIGNAL;
            case 27:
                return APP_OPEN;
            case 28:
                return AD_RESPONSE_ENCRYPTION_KEY;
            case 29:
                return SESSION_ID;
            case 30:
                return TOPICS;
            case 31:
                return INSPECTOR_SIGNAL;
            case 32:
                return DEBUG_SIGNAL;
            case 33:
                return AD_SERVICES_EXTENSION_VERSION;
            case 34:
                return BANNER_REFRESH;
            case 35:
                return ICON_AD;
            case 36:
                return SCAR_SIGNAL_TYPE;
            case 37:
                return FIREBASE_ANALYTICS;
            case 38:
                return TRUSTLESS_TOKEN;
            case 39:
                return AMAZON_FIRE_AD_ID;
            case 40:
                return DISPLAY_COUNT;
            case 41:
                return IN_MEMORY_SDK_CORE_DATA;
            case 42:
                return CSRB_ECO_DATA;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(ol0.class.getName());
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb3.append(" number=");
            sb3.append(a());
        }
        sb3.append(" name=");
        sb3.append(name());
        sb3.append('>');
        return sb3.toString();
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f9354a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
