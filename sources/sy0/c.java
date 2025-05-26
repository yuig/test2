package sy0;

import j40.k;
import j40.l;
import j40.q;
import j40.r;
import j40.t;
import j40.u;
import j40.v;
import j40.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f115643i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar;
        l lVar;
        t tVar;
        List<r> list;
        q qVar;
        h response = (h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList interestList = new ArrayList();
        w wVar = (w) response.f99563c;
        if (wVar != null && (kVar = wVar.f74631a) != null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            v vVar = kVar instanceof v ? (v) kVar : null;
            if (vVar != null && (lVar = vVar.f74630e) != null) {
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                u uVar = lVar instanceof u ? (u) lVar : null;
                if (uVar != null && (tVar = uVar.f74628e) != null && (list = tVar.f74626b) != null) {
                    for (r rVar : list) {
                        if (rVar != null && (qVar = rVar.f74623a) != null) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            interestList.add(qVar);
                        }
                    }
                }
            }
        }
        Intrinsics.checkNotNullParameter(interestList, "interestList");
        ArrayList arrayList = new ArrayList();
        Iterator it = interestList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            p40.b bVar = (p40.b) next;
            if (Intrinsics.d(bVar.c(), Boolean.TRUE)) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(i13, new uy0.b(new io1.a(bVar)));
            } else {
                arrayList.add(i13, new uy0.b(bVar));
            }
            i13 = i14;
        }
        return arrayList;
    }
}
