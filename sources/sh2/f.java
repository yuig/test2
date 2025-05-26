package sh2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class f extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        m p03 = (m) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        g gVar = (g) this.receiver;
        ui2.p pVar = (ui2.p) gVar.f112951d.get(p03);
        if (pVar != null) {
            return pVar;
        }
        synchronized (gVar.f112951d) {
            try {
                Object obj3 = (ui2.p) gVar.f112951d.get(p03);
                if (obj3 == null) {
                    obj2 = gVar.b(p03);
                } else {
                    Intrinsics.checkNotNullExpressionValue(obj3, "tracers[key] ?: createTracer(key)");
                    obj2 = obj3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj2;
    }
}
