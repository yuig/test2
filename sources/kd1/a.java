package kd1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.vh;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import o82.r;
import yw0.n;
import zw0.t;

/* loaded from: classes5.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f79229a = new a();

    @Override // o82.r
    public final Object i(Object obj, bl2.c cVar) {
        List list;
        ArrayList arrayList = new ArrayList();
        vh vhVar = obj instanceof vh ? (vh) obj : null;
        if (vhVar != null && (list = vhVar.f42865w) != null) {
            List<s> list2 = list;
            ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
            for (s sVar : list2) {
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                f30 f30Var = (f30) sVar;
                n nVar = n.DROPDOWN;
                kh khVar = vhVar.f42858p;
                arrayList2.add(Boolean.valueOf(arrayList.add(new t(f30Var, 0, nVar, khVar != null ? khVar.n() : null, 6))));
            }
        }
        return new xz.b(arrayList);
    }
}
