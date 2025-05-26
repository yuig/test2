package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class dc implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dc f4226a = new dc();

    @Override // a.r0
    public final boolean a(int i13) {
        ec ecVar;
        switch (i13) {
            case 0:
                ecVar = ec.UNKNOWN_ENCRYPTION_METHOD;
                break;
            case 1:
                ecVar = ec.BITSLICER;
                break;
            case 2:
                ecVar = ec.TINK_HYBRID;
                break;
            case 3:
                ecVar = ec.UNENCRYPTED;
                break;
            case 4:
                ecVar = ec.DG;
                break;
            case 5:
                ecVar = ec.DG_XTEA;
                break;
            case 6:
                ecVar = ec.ADSHIELD_3;
                break;
            default:
                ecVar = null;
                break;
        }
        return ecVar != null;
    }
}
