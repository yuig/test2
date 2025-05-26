package a22;

import com.pinterest.api.model.kb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import n60.o;

/* loaded from: classes4.dex */
public final class d implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = o13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            Object e13 = vd0.c.f125622b.e(o13.j(i13).f125623a, kb0.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.QuizOutputSection");
            arrayList.add((kb0) e13);
        }
        return arrayList;
    }
}
