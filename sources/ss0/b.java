package ss0;

import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115136a;

    public /* synthetic */ b(int i13) {
        this.f115136a = i13;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        switch (this.f115136a) {
            case 0:
                return new i0(d4.HOMEFEED_CONTROL, a4.HOMEFEED_CONTROL_ACTIVITY, null, null, null, null);
            case 1:
                return new i0(d4.HOMEFEED_CONTROL, a4.HOMEFEED_CONTROL_ACTIVITY, null, null, null, null);
            case 2:
                return new i0(d4.ACTION_SHEET, a4.USER_OTHERS, null, null, null, null);
            case 3:
                List list = r91.b.f106883a;
                return new i0(d4.SETTINGS, a4.UNIDIRECTIONAL_ACKNOWLEDGEMENT_ALERT, null, g0.PARENTAL_PASSCODE_UNIDIRECTIONAL_ALERT, null, null);
            default:
                return null;
        }
    }
}
