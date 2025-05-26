package f72;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 extends ro2.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f61415b = new y0(x.Companion.serializer());

    @Override // ro2.j0
    public final ro2.n f(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        r13.remove("root");
        return new ro2.c0(r13);
    }
}
