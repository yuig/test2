package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b1 extends a1 {
    public static q5.w0 s(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return CollectionsKt.K(map.entrySet());
    }

    public static List t(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return q0.f80391a;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return q0.f80391a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return e0.b(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
