package m60;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f85916a;

    public k(m mVar) {
        this.f85916a = mVar;
    }

    public final void a(tb0.f errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        int i13 = j.f85913a[errorType.ordinal()];
        m mVar = this.f85916a;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            Object obj = ((bf2.b) ((se2.a) mVar.i().f89301u.getValue())).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            nx.d0.v((nx.d0) obj, f1.APP_CRASH_DETECTED, null, false, 12);
            return;
        }
        Object obj2 = ((bf2.b) ((se2.a) mVar.i().f89301u.getValue())).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        nx.d0.v((nx.d0) obj2, f1.APP_DEADLOCK_CRASH_DETECTED, null, false, 12);
        mVar.d();
        tb0.o.f117106m = true;
        lb0.m c13 = ((lb0.b) lb0.n.f82724c.a()).c();
        c13.putBoolean("PREF_DID_CRASH_BY_ANR", true);
        c13.commit();
    }
}
