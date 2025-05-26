package ae2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15065a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f15066b = new LinkedHashSet();

    public final h a(a aVar) {
        LinkedHashMap linkedHashMap = this.f15065a;
        List list = (List) linkedHashMap.get(aVar);
        d dVar = list != null ? (d) CollectionsKt.firstOrNull(list) : null;
        if (dVar == null) {
            return null;
        }
        List list2 = (List) linkedHashMap.get(aVar);
        if (list2 != null) {
            list2.remove(dVar);
        }
        h hVar = new h(aVar, dVar, this);
        this.f15066b.add(hVar);
        return hVar;
    }
}
