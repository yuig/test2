package so2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oo2.g p03 = (oo2.g) obj;
        int intValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(p03, "p0");
        m mVar = (m) this.receiver;
        mVar.getClass();
        boolean z13 = !p03.j(intValue) && p03.h(intValue).b();
        mVar.f114803b = z13;
        return Boolean.valueOf(z13);
    }
}
