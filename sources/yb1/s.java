package yb1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        va1.t p03 = (va1.t) obj;
        String p13 = (String) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        com.pinterest.feature.settings.permissions.e eVar = ((t) this.receiver).F0;
        if (eVar != null) {
            ((xb1.j) eVar).v3(p03, p13);
        }
        return Unit.f80348a;
    }
}
