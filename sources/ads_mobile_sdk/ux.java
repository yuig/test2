package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ux implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ux f12247a = new ux();

    @Override // a.r0
    public final boolean a(int i13) {
        vx vxVar;
        switch (i13) {
            case 0:
                vxVar = vx.SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED;
                break;
            case 1:
                vxVar = vx.PVER3_NATIVE;
                break;
            case 2:
                vxVar = vx.PVER4_NATIVE;
                break;
            case 3:
                vxVar = vx.ANDROID_SAFETYNET;
                break;
            case 4:
                vxVar = vx.FLYWHEEL;
                break;
            case 5:
                vxVar = vx.REAL_TIME;
                break;
            case 6:
                vxVar = vx.PVER5_NATIVE_REAL_TIME;
                break;
            case 7:
                vxVar = vx.ANDROID_SAFEBROWSING_REAL_TIME;
                break;
            case 8:
                vxVar = vx.ANDROID_SAFEBROWSING;
                break;
            case 9:
                vxVar = vx.CLIENT_SIDE_DETECTION;
                break;
            default:
                vxVar = null;
                break;
        }
        return vxVar != null;
    }
}
