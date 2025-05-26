package g72;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends ro2.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f63980b = new f0(a0.Companion.serializer());

    /* renamed from: c, reason: collision with root package name */
    public static final Set f63981c = kotlin.collections.h1.f(new b0("alphaEffect", "alphaEffectData"), new b0("motionEffect", "motionEffectData"), new b0("frame", "frameEffectData"), new b0("filter", "filterEffectData"));

    @Override // ro2.j0
    public final ro2.n f(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        for (b0 b0Var : f63981c) {
            f63980b.getClass();
            r13.computeIfPresent(b0Var.f63928b, new es.i(3, new e0((ro2.n) r13.getOrDefault(b0Var.f63927a, ro2.o.b("none")), 0)));
        }
        return new ro2.c0(r13);
    }

    @Override // ro2.j0
    public final ro2.n g(ro2.n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        LinkedHashMap r13 = kotlin.collections.z0.r(ro2.o.f(element));
        Set set = f63981c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (r13.containsKey(((b0) obj).f63928b)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            f63980b.getClass();
            ro2.n orDefault = ro2.o.f((ro2.n) kotlin.collections.z0.e(b0Var.f63928b, r13)).getOrDefault("type", ro2.o.b("none"));
            r13.put(b0Var.f63927a, orDefault);
            r13.computeIfPresent(b0Var.f63928b, new es.i(4, new e0(orDefault, 1)));
        }
        return new ro2.c0(r13);
    }
}
