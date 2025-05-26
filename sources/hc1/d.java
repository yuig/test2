package hc1;

import ic1.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p03 = (String) obj;
        String p13 = (String) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        e eVar = (e) this.receiver;
        int i13 = e.C0;
        eVar.f7().d(new x(p03, p13));
        eVar.P7();
        return Unit.f80348a;
    }
}
