package g72;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h2 extends ro2.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h2 f64001b = new h2(g2.Companion.serializer());

    @Override // ro2.j0
    public final ro2.n f(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        r13.computeIfPresent("timingFunction", new es.i(8, c2.f63952l));
        return new ro2.c0(r13);
    }

    @Override // ro2.j0
    public final ro2.n g(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        r13.computeIfPresent("timingFunction", new es.i(7, c2.f63953m));
        return new ro2.c0(r13);
    }
}
