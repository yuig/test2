package dl1;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f55260i = new o0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair collector = (Pair) obj;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 1>");
        m mVar = (m) pair.f80346a;
        s sVar = (s) pair.f80347b;
        ((List) collector.f80346a).add(mVar);
        ((List) collector.f80347b).add(sVar);
        return collector;
    }
}
