package pl0;

import h32.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p03 = (String) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        b bVar = (b) this.receiver;
        bVar.getClass();
        d0.B(bVar.F, null, g0.USER_REP, null, null, 29);
        bVar.E.d(p03, r41.b.PinFavoriteUserPagedList);
        return Unit.f80348a;
    }
}
