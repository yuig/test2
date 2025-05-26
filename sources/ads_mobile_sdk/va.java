package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class va implements a.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final va f12410a = new va();

    @Override // a.r0
    public final boolean a(int i13) {
        wa waVar;
        switch (i13) {
            case 0:
                waVar = wa.DEBUGGER_STATE_UNSPECIFIED;
                break;
            case 1:
                waVar = wa.DEBUGGER_STATE_NOT_INSTALLED;
                break;
            case 2:
                waVar = wa.DEBUGGER_STATE_INSTALLED;
                break;
            case 3:
                waVar = wa.DEBUGGER_STATE_ACTIVE;
                break;
            case 4:
                waVar = wa.DEBUGGER_STATE_ENVVAR;
                break;
            case 5:
                waVar = wa.DEBUGGER_STATE_MACHPORT;
                break;
            case 6:
                waVar = wa.DEBUGGER_STATE_ENVVAR_MACHPORT;
                break;
            default:
                waVar = null;
                break;
        }
        return waVar != null;
    }
}
