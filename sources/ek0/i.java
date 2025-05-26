package ek0;

import com.pinterest.api.model.c9;
import df.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final i f59202i = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m30.f fVar;
        List<m30.e> list;
        pc.h response = (pc.h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = null;
        m30.d dVar = ((m30.h) response.a()).f85754a;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            m30.g gVar = dVar instanceof m30.g ? (m30.g) dVar : null;
            if (gVar != null && (fVar = gVar.f85753e) != null && (list = fVar.f85751a) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (m30.e eVar : list) {
                    String str = eVar.f85749a;
                    Object e13 = vd0.c.f125622b.e(j1.p1(eVar.f85750b).i(), c9.class);
                    Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardNameMetadata");
                    bk0.c cVar = str != null ? new bk0.c(str, (c9) e13) : null;
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                arrayList = arrayList2;
            }
        }
        return arrayList == null ? q0.f80391a : arrayList;
    }
}
