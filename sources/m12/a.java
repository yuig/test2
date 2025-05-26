package m12;

import com.pinterest.api.model.i10;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {
    @Override // rz.d
    public final Object b(c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = o13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            Object e13 = c.f125622b.e(o13.j(i13).f125623a, i10.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.OutpaintStyle");
            arrayList.add((i10) e13);
        }
        return arrayList;
    }
}
