package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class za implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final za f14686a = new za();

    @Override // a.r0
    public final boolean a(int i13) {
        ab abVar;
        switch (i13) {
            case 0:
                abVar = ab.DEVICE_IDENTIFIER_NO_ID;
                break;
            case 1:
                abVar = ab.DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                break;
            case 2:
                abVar = ab.DEVICE_IDENTIFIER_GLOBAL_ID;
                break;
            case 3:
                abVar = ab.DEVICE_IDENTIFIER_ADVERTISER_ID;
                break;
            case 4:
                abVar = ab.DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                break;
            case 5:
                abVar = ab.DEVICE_IDENTIFIER_ANDROID_AD_ID;
                break;
            case 6:
                abVar = ab.DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                break;
            case 7:
                abVar = ab.DEVICE_IDENTIFIER_PER_APP_ID;
                break;
            case 8:
                abVar = ab.DEVICE_IDENTIFIER_PER_APP_ID_V2;
                break;
            case 9:
                abVar = ab.DEVICE_IDENTIFIER_CONNECTED_TV_IFA;
                break;
            default:
                abVar = null;
                break;
        }
        return abVar != null;
    }
}
