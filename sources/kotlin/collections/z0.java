package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class z0 extends y0 {
    public static r0 d() {
        r0 r0Var = r0.f80392a;
        Intrinsics.g(r0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r0Var;
    }

    public static Object e(Object obj, Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof w0) {
            return ((w0) map).l();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(y0.a(pairs.length));
        l(hashMap, pairs);
        return hashMap;
    }

    public static Map g(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(pairs.length));
        q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static LinkedHashMap h(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(pairs.length));
        l(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map i(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : y0.c(linkedHashMap) : d();
    }

    public static LinkedHashMap j(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map k(Map map, Pair pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return y0.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f80346a, pair.f80347b);
        return linkedHashMap;
    }

    public static void l(HashMap hashMap, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            hashMap.put(pair.f80346a, pair.f80347b);
        }
    }

    public static Map m(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            p(iterable, linkedHashMap);
            return i(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size == 1) {
            return y0.b((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(collection.size()));
        p(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map n(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? r(map) : y0.c(map) : d();
    }

    public static Map o(yn2.h0 pairs) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        LinkedHashMap destination = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.f139564a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) pairs.f139565b.invoke(it.next());
            destination.put(pair.f80346a, pair.f80347b);
        }
        return i(destination);
    }

    public static final void p(Iterable pairs, LinkedHashMap destination) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            destination.put(pair.f80346a, pair.f80347b);
        }
    }

    public static final void q(LinkedHashMap destination, Pair[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        l(destination, pairArr);
    }

    public static LinkedHashMap r(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
