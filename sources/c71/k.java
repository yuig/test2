package c71;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import pc.n0;
import pc.u0;

/* loaded from: classes5.dex */
public final class k implements com.pinterest.framework.multisection.datasource.pagedlist.k {
    @Override // com.pinterest.framework.multisection.datasource.pagedlist.k
    public final Object f(pc.h response) {
        e50.a aVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(response, "response");
        n0 n0Var = response.f99563c;
        ArrayList arrayList2 = null;
        e50.g gVar = n0Var instanceof e50.g ? (e50.g) n0Var : null;
        if (gVar == null || (aVar = gVar.f57346a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        z40.y yVar = aVar instanceof z40.y ? (z40.y) aVar : null;
        if (yVar == null) {
            return null;
        }
        String id3 = yVar.getId();
        String a13 = yVar.a();
        Boolean d2 = yVar.d();
        Integer c13 = yVar.c();
        String f13 = yVar.f();
        String b13 = yVar.b();
        String g13 = yVar.g();
        Boolean h10 = yVar.h();
        z40.x i13 = yVar.i();
        e50.y yVar2 = i13 != null ? new e50.y(i13.b(), i13.getName(), i13.a()) : null;
        List l13 = yVar.l();
        if (l13 != null) {
            List<z40.v> list = l13;
            ArrayList arrayList3 = new ArrayList(g0.q(list, 10));
            for (z40.v vVar : list) {
                arrayList3.add(new e50.w(vVar.b(), vVar.getType(), vVar.a(), vVar.i(), vVar.j()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List n13 = yVar.n();
        if (n13 != null) {
            List<z40.w> list2 = n13;
            arrayList2 = new ArrayList(g0.q(list2, 10));
            for (z40.w wVar : list2) {
                arrayList2.add(new e50.x(wVar.b(), wVar.getType(), wVar.a(), wVar.i(), wVar.j()));
            }
        }
        return new e50.z("User", id3, a13, d2, c13, f13, b13, g13, h10, yVar.m(), yVar.j(), yVar2, arrayList, arrayList2, yVar.k());
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.k
    public final u0 q(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        return new e50.h(id3);
    }
}
