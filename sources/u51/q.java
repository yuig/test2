package u51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class q extends n {
    @Override // u51.n
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f120635b) {
            switch (p.f120639a[xVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    List list = (List) t51.a.f116436a.get(xVar);
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    String str = (String) list.get(0);
                    arrayList.add(new y(xVar, str, null, null));
                    break;
                case 5:
                    arrayList.add(new y(xVar, t51.a.a(xVar), "other", Collections.singletonList("notUseful")));
                    break;
                case 6:
                    arrayList.add(new y(xVar, t51.a.a(xVar), null, null));
                    break;
                case 7:
                    arrayList.add(new y(xVar, t51.a.a(xVar), "spam", Collections.singletonList("spam")));
                    break;
            }
        }
        return arrayList;
    }

    @Override // u51.n
    public final int b() {
        return w02.b.report_did_it_content_title;
    }
}
