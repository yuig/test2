package com.pinterest.api.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o8 implements fl1.e {
    @Override // fl1.e
    public final dl1.s a(dl1.s sVar, dl1.s sVar2) {
        v7 oldModel = (v7) sVar;
        v7 newModel = (v7) sVar2;
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        u7 G1 = oldModel.F1(newModel).G1();
        Intrinsics.checkNotNullExpressionValue(G1, "toBuilder(...)");
        Map d13 = oldModel.d1();
        Map d14 = newModel.d1();
        if (d13 != null && d14 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : d13.keySet()) {
                List list = (List) d13.get(str);
                if (list != null) {
                    Intrinsics.f(str);
                    linkedHashMap.put(str, CollectionsKt.F0(list));
                }
            }
            for (String str2 : d14.keySet()) {
                List list2 = (List) d14.get(str2);
                if (list2 != null) {
                    Intrinsics.f(str2);
                    linkedHashMap.put(str2, CollectionsKt.F0(list2));
                }
            }
            G1.f42424J = linkedHashMap;
            boolean[] zArr = G1.f42452n0;
            if (zArr.length > 35) {
                zArr[35] = true;
            }
        }
        if (bs1.c.g1(oldModel, newModel)) {
            G1.j(oldModel.N0());
            G1.i(oldModel.L0());
        }
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
