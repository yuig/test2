package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ax implements a.w {
    UNSPECIFIED(0),
    CMD_DONT_PROCEED(1),
    CMD_PROCEED(2),
    CMD_SHOW_MORE_SECTION(3),
    CMD_OPEN_HELP_CENTER(4),
    CMD_OPEN_DIAGNOSTIC(5),
    CMD_RELOAD(6),
    CMD_OPEN_DATE_SETTINGS(7),
    CMD_OPEN_LOGIN(8),
    CMD_DO_REPORT(9),
    CMD_DONT_REPORT(10),
    CMD_OPEN_REPORTING_PRIVACY(11),
    CMD_OPEN_WHITEPAPER(12),
    CMD_REPORT_PHISHING_ERROR(13),
    CMD_OPEN_ENHANCED_PROTECTION_SETTINGS(14),
    CMD_CLOSE_INTERSTITIAL_WITHOUT_UI(15);


    /* renamed from: a, reason: collision with root package name */
    public final int f2583a;

    ax(int i13) {
        this.f2583a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f2583a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ax.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2583a + " name=" + name() + '>';
    }

    public static ax a(int i13) {
        switch (i13) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return CMD_DONT_PROCEED;
            case 2:
                return CMD_PROCEED;
            case 3:
                return CMD_SHOW_MORE_SECTION;
            case 4:
                return CMD_OPEN_HELP_CENTER;
            case 5:
                return CMD_OPEN_DIAGNOSTIC;
            case 6:
                return CMD_RELOAD;
            case 7:
                return CMD_OPEN_DATE_SETTINGS;
            case 8:
                return CMD_OPEN_LOGIN;
            case 9:
                return CMD_DO_REPORT;
            case 10:
                return CMD_DONT_REPORT;
            case 11:
                return CMD_OPEN_REPORTING_PRIVACY;
            case 12:
                return CMD_OPEN_WHITEPAPER;
            case 13:
                return CMD_REPORT_PHISHING_ERROR;
            case 14:
                return CMD_OPEN_ENHANCED_PROTECTION_SETTINGS;
            case 15:
                return CMD_CLOSE_INTERSTITIAL_WITHOUT_UI;
            default:
                return null;
        }
    }
}
