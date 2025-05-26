package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class a90 implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a90 f2312a = new a90();

    @Override // a.r0
    public final boolean a(int i13) {
        b90 b90Var;
        switch (i13) {
            case 0:
                b90Var = b90.DEVICE_TYPE_UNKNOWN;
                break;
            case 1:
                b90Var = b90.DEVICE_TYPE_PHONE;
                break;
            case 2:
                b90Var = b90.DEVICE_TYPE_TABLET;
                break;
            case 3:
                b90Var = b90.DEVICE_TYPE_WATCH;
                break;
            case 4:
                b90Var = b90.DEVICE_TYPE_AUTO;
                break;
            case 5:
                b90Var = b90.DEVICE_TYPE_TV;
                break;
            case 6:
                b90Var = b90.DEVICE_TYPE_PC;
                break;
            default:
                b90Var = null;
                break;
        }
        return b90Var != null;
    }
}
