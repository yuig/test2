package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class cy implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cy f4061a = new cy();

    @Override // a.r0
    public final boolean a(int i13) {
        dy dyVar;
        switch (i13) {
            case 0:
                dyVar = dy.UNKNOWN;
                break;
            case 1:
                dyVar = dy.PHISHING_INTERSTITIAL;
                break;
            case 2:
                dyVar = dy.CLIENT_SIDE_PHISHING_INTERSTITIAL;
                break;
            case 3:
                dyVar = dy.MALWARE_INTERSTITIAL;
                break;
            case 4:
                dyVar = dy.UWS_INTERSTITIAL;
                break;
            case 5:
                dyVar = dy.BILLING_INTERSTITIAL;
                break;
            case 6:
                dyVar = dy.BINARY_MALWARE_DOWNLOAD_WARNING;
                break;
            default:
                dyVar = null;
                break;
        }
        return dyVar != null;
    }
}
