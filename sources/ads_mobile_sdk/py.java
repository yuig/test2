package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class py implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final py f9851a = new py();

    @Override // a.r0
    public final boolean a(int i13) {
        qy qyVar;
        switch (i13) {
            case 1:
                qyVar = qy.EVENT_URL;
                break;
            case 2:
                qyVar = qy.LANDING_PAGE;
                break;
            case 3:
                qyVar = qy.LANDING_REFERRER;
                break;
            case 4:
                qyVar = qy.CLIENT_REDIRECT;
                break;
            case 5:
                qyVar = qy.SERVER_REDIRECT;
                break;
            case 6:
                qyVar = qy.RECENT_NAVIGATION;
                break;
            case 7:
                qyVar = qy.REFERRER;
                break;
            default:
                qyVar = null;
                break;
        }
        return qyVar != null;
    }
}
