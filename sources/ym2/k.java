package ym2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k {
    static {
        Intrinsics.checkNotNullExpressionValue(new c("java.lang").c(g.e("annotation")), "child(...)");
    }

    public static final b a(String str) {
        j jVar = j.f139489a;
        return new b(j.f139490b, g.e(str));
    }

    public static final b b(String str) {
        j jVar = j.f139489a;
        return new b(j.f139492d, g.e(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int a13 = y0.a(g0.q(entrySet, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a13);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final b d(g gVar) {
        j.f139489a.getClass();
        b bVar = j.f139497i;
        return new b(bVar.g(), g.e(gVar.c() + bVar.i().c()));
    }

    public static final b e(String str) {
        j jVar = j.f139489a;
        return new b(j.f139491c, g.e(str));
    }

    public static final b f(b bVar) {
        j jVar = j.f139489a;
        return new b(j.f139490b, g.e("U".concat(bVar.i().c())));
    }
}
