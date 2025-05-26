package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class i1 extends h1 {
    public static LinkedHashSet g(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y0.a(set.size()));
        boolean z13 = false;
        for (Object obj2 : set) {
            boolean z14 = true;
            if (!z13 && Intrinsics.d(obj2, obj)) {
                z13 = true;
                z14 = false;
            }
            if (z14) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set h(Set set, Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> w13 = k0.w(elements);
        if (w13.isEmpty()) {
            return CollectionsKt.J0(set);
        }
        if (!(w13 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(w13);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!w13.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet i(Set set, Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Integer valueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(y0.a(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        k0.u(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet j(Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
