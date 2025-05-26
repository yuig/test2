package lb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f82673a = new LinkedHashMap();

    @Override // lb.u
    public final boolean a(tb.j id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        return this.f82673a.containsKey(id3);
    }

    @Override // lb.u
    public final t b(tb.j id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        LinkedHashMap linkedHashMap = this.f82673a;
        Object obj = linkedHashMap.get(id3);
        if (obj == null) {
            obj = new t(id3);
            linkedHashMap.put(id3, obj);
        }
        return (t) obj;
    }

    @Override // lb.u
    public final t d(tb.j id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        return (t) this.f82673a.remove(id3);
    }

    @Override // lb.u
    public final List remove(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = this.f82673a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.d(((tb.j) entry.getKey()).f116981a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((tb.j) it.next());
        }
        return CollectionsKt.F0(linkedHashMap2.values());
    }
}
