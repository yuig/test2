package m00;

import java.util.ArrayList;
import n60.o;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {
    @Override // rz.d
    public final Object b(c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = o13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            String l13 = o13.l(i13);
            if (l13 != null) {
                arrayList.add(l13);
            }
        }
        return arrayList;
    }
}
