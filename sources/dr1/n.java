package dr1;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nm.q;
import nm.s;

/* loaded from: classes2.dex */
public final class n implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        s v13 = pinterestJsonObject.f125623a.v("data");
        v13.getClass();
        if (!(v13 instanceof q)) {
            return q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = v13.f().f91364a.iterator();
        while (it.hasNext()) {
            Object e13 = new nm.o().e((s) it.next(), wy0.class);
            Intrinsics.checkNotNullExpressionValue(e13, "fromJson(...)");
            arrayList.add(e13);
        }
        return arrayList;
    }
}
