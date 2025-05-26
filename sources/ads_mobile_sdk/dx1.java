package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum dx1 implements a.w {
    USER_POPULATION_UNSPECIFIED(0),
    CARTER_SB_CHROME_INTERSTITIAL(1),
    GMAIL_PHISHY_JOURNEY(2),
    DOWNLOAD_RELATED_POPULATION_MIN(1000),
    RISKY_DOWNLOADER(1001),
    INFREQUENT_DOWNLOADER(1002),
    REGULAR_DOWNLOADER(1003),
    BOTLIKE_DOWNLOADER(1004),
    DOCUMENT_DOWNLOADER(1005),
    HIGHLY_TECHNICAL_DOWNLOADER(1006),
    LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(1007),
    HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(1008),
    SPAM_PING_SENDER(1009),
    RFA_TRUSTED(1010),
    DOWNLOAD_RELATED_POPULATION_MAX(1999);


    /* renamed from: a, reason: collision with root package name */
    public final int f4502a;

    dx1(int i13) {
        this.f4502a = i13;
    }

    public static dx1 a(int i13) {
        if (i13 == 0) {
            return USER_POPULATION_UNSPECIFIED;
        }
        if (i13 == 1) {
            return CARTER_SB_CHROME_INTERSTITIAL;
        }
        if (i13 == 2) {
            return GMAIL_PHISHY_JOURNEY;
        }
        if (i13 == 1999) {
            return DOWNLOAD_RELATED_POPULATION_MAX;
        }
        switch (i13) {
            case 1000:
                return DOWNLOAD_RELATED_POPULATION_MIN;
            case 1001:
                return RISKY_DOWNLOADER;
            case 1002:
                return INFREQUENT_DOWNLOADER;
            case 1003:
                return REGULAR_DOWNLOADER;
            case 1004:
                return BOTLIKE_DOWNLOADER;
            case 1005:
                return DOCUMENT_DOWNLOADER;
            case 1006:
                return HIGHLY_TECHNICAL_DOWNLOADER;
            case 1007:
                return LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case 1008:
                return HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case 1009:
                return SPAM_PING_SENDER;
            case 1010:
                return RFA_TRUSTED;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + dx1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4502a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f4502a;
    }
}
