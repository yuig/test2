package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class h1 extends g1 {
    public static HashSet c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        HashSet hashSet = new HashSet(y0.a(elements.length));
        c0.V(hashSet, elements);
        return hashSet;
    }

    public static Set d(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y0.a(elements.length));
        c0.V(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final Set e(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : g1.b(set.iterator().next()) : s0.f80394a;
    }

    public static Set f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? c0.f0(elements) : s0.f80394a;
    }
}
