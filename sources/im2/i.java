package im2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f72744a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f72745b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f72746c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f72747d;

    static {
        ym2.e eVar = xl2.q.f135304j;
        ym2.c g13 = eVar.b(ym2.g.e("name")).g();
        Intrinsics.checkNotNullExpressionValue(g13, "toSafe(...)");
        Pair pair = new Pair(g13, xl2.r.f135324d);
        ym2.c g14 = eVar.b(ym2.g.e("ordinal")).g();
        Intrinsics.checkNotNullExpressionValue(g14, "toSafe(...)");
        Pair pair2 = new Pair(g14, ym2.g.e("ordinal"));
        Pair pair3 = new Pair(lb.l0.e("size", xl2.q.B), ym2.g.e("size"));
        ym2.c cVar = xl2.q.F;
        Pair pair4 = new Pair(lb.l0.e("size", cVar), ym2.g.e("size"));
        ym2.c g15 = xl2.q.f135299e.b(ym2.g.e("length")).g();
        Intrinsics.checkNotNullExpressionValue(g15, "toSafe(...)");
        Map g16 = z0.g(pair, pair2, pair3, pair4, new Pair(g15, ym2.g.e("length")), new Pair(lb.l0.e("keys", cVar), ym2.g.e("keySet")), new Pair(lb.l0.e("values", cVar), ym2.g.e("values")), new Pair(lb.l0.e("entries", cVar), ym2.g.e("entrySet")));
        f72744a = g16;
        Set<Map.Entry> entrySet = g16.entrySet();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((ym2.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair5 = (Pair) it.next();
            ym2.g gVar = (ym2.g) pair5.f80347b;
            Object obj = linkedHashMap.get(gVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(gVar, obj);
            }
            ((List) obj).add((ym2.g) pair5.f80346a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.M((Iterable) entry2.getValue()));
        }
        f72745b = linkedHashMap2;
        Map map = f72744a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = zl2.d.f142106a;
            ym2.e i13 = ((ym2.c) entry3.getKey()).e().i();
            Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
            ym2.b g17 = zl2.d.g(i13);
            Intrinsics.f(g17);
            linkedHashSet.add(g17.b().c((ym2.g) entry3.getValue()));
        }
        Set keySet = f72744a.keySet();
        f72746c = keySet;
        Set set = keySet;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ym2.c) it2.next()).f());
        }
        f72747d = CollectionsKt.J0(arrayList2);
    }
}
