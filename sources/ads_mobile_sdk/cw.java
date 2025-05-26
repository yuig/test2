package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class cw implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cw f4049a = new cw();

    @Override // a.r0
    public final boolean a(int i13) {
        dw dwVar;
        switch (i13) {
            case 0:
                dwVar = dw.ACTION_UNSPECIFIED;
                break;
            case 1:
                dwVar = dw.PROCEED;
                break;
            case 2:
                dwVar = dw.DISCARD;
                break;
            case 3:
                dwVar = dw.KEEP;
                break;
            case 4:
                dwVar = dw.CLOSE;
                break;
            case 5:
                dwVar = dw.CANCEL;
                break;
            case 6:
                dwVar = dw.DISMISS;
                break;
            case 7:
                dwVar = dw.BACK;
                break;
            case 8:
                dwVar = dw.OPEN_SUBPAGE;
                break;
            case 9:
                dwVar = dw.PROCEED_DEEP_SCAN;
                break;
            case 10:
                dwVar = dw.OPEN_LEARN_MORE_LINK;
                break;
            default:
                dwVar = null;
                break;
        }
        return dwVar != null;
    }
}
