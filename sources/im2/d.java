package im2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends a {
    public static List n(dn2.g gVar) {
        if (!(gVar instanceof dn2.b)) {
            return gVar instanceof dn2.i ? kotlin.collections.e0.b(((dn2.i) gVar).f55626c.c()) : kotlin.collections.q0.f80391a;
        }
        Iterable iterable = (Iterable) ((dn2.b) gVar).f55623a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kotlin.collections.k0.u(n((dn2.g) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // im2.a
    public final ArrayList b(Object obj, boolean z13) {
        bm2.c cVar = (bm2.c) obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Map a13 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a13.entrySet()) {
            kotlin.collections.k0.u((!z13 || Intrinsics.d((ym2.g) entry.getKey(), d0.f72702b)) ? n((dn2.g) entry.getValue()) : kotlin.collections.q0.f80391a, arrayList);
        }
        return arrayList;
    }

    @Override // im2.a
    public final ym2.c e(Object obj) {
        bm2.c cVar = (bm2.c) obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.c();
    }

    @Override // im2.a
    public final am2.g f(Object obj) {
        bm2.c cVar = (bm2.c) obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        am2.g d2 = fn2.d.d(cVar);
        Intrinsics.f(d2);
        return d2;
    }

    @Override // im2.a
    public final Iterable g(Object obj) {
        bm2.i annotations;
        bm2.c cVar = (bm2.c) obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        am2.g d2 = fn2.d.d(cVar);
        return (d2 == null || (annotations = d2.getAnnotations()) == null) ? kotlin.collections.q0.f80391a : annotations;
    }
}
