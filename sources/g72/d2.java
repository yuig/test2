package g72;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d2 extends ro2.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d2 f63965b = new d2(b2.Companion.serializer());

    @Override // ro2.j0
    public final ro2.n f(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        r13.computeIfPresent("loopMode", new es.i(6, c2.f63950j));
        return new ro2.c0(r13);
    }

    @Override // ro2.j0
    public final ro2.n g(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        r13.computeIfPresent("loopMode", new es.i(5, c2.f63951k));
        return new ro2.c0(r13);
    }
}
