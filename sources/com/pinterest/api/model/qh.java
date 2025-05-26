package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class qh {

    /* renamed from: a, reason: collision with root package name */
    public final v10.b f41297a;

    public qh(@NotNull v10.b modelParserAndSync) {
        Intrinsics.checkNotNullParameter(modelParserAndSync, "modelParserAndSync");
        this.f41297a = modelParserAndSync;
    }

    public static DynamicFeed a(qh qhVar, vd0.c cVar, String str, int i13) {
        Pair pair;
        dl1.s a13;
        if ((i13 & 2) != 0) {
            str = null;
        }
        qhVar.getClass();
        String o13 = cVar.o("bookmark", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        Object a14 = vd0.c.a(cVar.f125623a.v("data"));
        if (!(a14 instanceof vd0.a)) {
            kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
            return new DynamicFeed(str, o13, q0Var, q0Var);
        }
        v10.b bVar = qhVar.f41297a;
        bVar.getClass();
        vd0.a aVar = (vd0.a) a14;
        v10.a aVar2 = (v10.a) bVar;
        if (aVar == null) {
            kotlin.collections.q0 q0Var2 = kotlin.collections.q0.f80391a;
            pair = new Pair(q0Var2, q0Var2);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ((bf2.b) aVar2.f123830b).get();
            int d2 = aVar.d();
            for (int i14 = 0; i14 < d2; i14++) {
                vd0.c j13 = aVar.j(i14);
                String o14 = j13.o("type", "");
                Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                if (kotlin.text.z.i("story", o14, true)) {
                    a13 = (vh) aVar2.f123831c.e(j13, false, false);
                } else if (kotlin.text.z.i("pin", o14, true)) {
                    a13 = ((f30) aVar2.f123832d.e(j13, false, false)).R6().a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                } else {
                    a13 = v10.a.d(o14) ? aVar2.a(j13) : v10.a.k(o14) ? aVar2.c(j13) : v10.a.e(o14) ? aVar2.f123829a.a(j13) : v10.a.g(o14) ? aVar2.b(j13) : v10.a.i(o14) ? aVar2.f123836h.d(j13) : v10.a.h(o14) ? aVar2.f123835g.d(j13) : v10.a.f(o14) ? aVar2.f123837i.d(j13) : v10.a.j(o14) ? aVar2.f123838j.d(j13) : null;
                }
                if (a13 != null) {
                    arrayList.add(a13);
                    String id3 = a13.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    arrayList2.add(id3);
                }
            }
            aVar2.f123839k.a(arrayList);
            pair = new Pair(CollectionsKt.F0(arrayList), CollectionsKt.F0(arrayList2));
        }
        return new DynamicFeed(str, o13, (List) pair.f80346a, (List) pair.f80347b);
    }
}
