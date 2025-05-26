package e12;

import com.pinterest.api.model.lb;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements rz.d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        ?? r13;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        vd0.a k13 = m13 != null ? m13.k("blocking_actions") : null;
        if (k13 != null) {
            r13 = new ArrayList();
            Iterator it = k13.iterator();
            while (it.hasNext()) {
                Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, lb.class);
                lb lbVar = e13 instanceof lb ? (lb) e13 : null;
                if (lbVar != null) {
                    r13.add(lbVar);
                }
            }
        } else {
            r13 = q0.f80391a;
        }
        return new t60.a(r13);
    }
}
