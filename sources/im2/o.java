package im2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f72759a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f72760b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f72759a = linkedHashMap;
        b(ym2.j.f139506r, a("java.util.ArrayList", "java.util.LinkedList"));
        b(ym2.j.f139507s, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(ym2.j.f139508t, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ym2.b j13 = ym2.b.j(new ym2.c("java.util.function.Function"));
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        b(j13, a("java.util.function.UnaryOperator"));
        ym2.b j14 = ym2.b.j(new ym2.c("java.util.function.BiFunction"));
        Intrinsics.checkNotNullExpressionValue(j14, "topLevel(...)");
        b(j14, a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ym2.b) entry.getKey()).b(), ((ym2.b) entry.getValue()).b()));
        }
        f72760b = z0.m(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ym2.b.j(new ym2.c(str)));
        }
        return arrayList;
    }

    public static void b(ym2.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f72759a.put(obj, bVar);
        }
    }
}
