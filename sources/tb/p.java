package tb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements q.a {
    @Override // q.a
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((r) it.next()).a());
        }
        return arrayList;
    }
}
