package u51;

import com.pinterest.api.model.wy0;
import df.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class u extends n {
    @Override // u51.n
    public final ArrayList a() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f120635b) {
            List list = (List) t51.a.f116436a.get(xVar);
            if (list == null) {
                list = Collections.emptyList();
            }
            int i13 = t.f120641a[xVar.ordinal()];
            if (i13 == 1) {
                str = (String) list.get(0);
            } else if (i13 == 2 || i13 == 3) {
                q51.a aVar = this.f120637d;
                String str2 = "";
                if (aVar != null) {
                    wy0 U = ((s51.e) aVar).f111157a.U();
                    String U2 = U != null ? U.U2() : null;
                    if (U2 != null) {
                        str2 = U2;
                    }
                }
                str = j1.X((String) list.get(0), str2);
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(new y(xVar, str, null, null));
            }
        }
        return arrayList;
    }

    @Override // u51.n
    public final int b() {
        return w02.b.thanks_for_report;
    }
}
