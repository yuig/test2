package f72;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends ro2.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f61339b = new q0(p1.Companion.serializer());

    @Override // ro2.j0
    public final ro2.n g(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ro2.c0 f13 = ro2.o.f(element);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f13.f108979a.entrySet()) {
            if (!Intrinsics.d((String) entry.getKey(), "type")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new ro2.c0(linkedHashMap);
    }
}
