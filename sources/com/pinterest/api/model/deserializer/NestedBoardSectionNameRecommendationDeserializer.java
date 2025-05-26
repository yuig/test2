package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.ga;
import java.util.ArrayList;
import java.util.Iterator;
import ke0.a;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nm.q;
import nm.s;
import nm.u;
import rz.d;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/api/model/deserializer/NestedBoardSectionNameRecommendationDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/ga;", "Lrz/d;", "", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NestedBoardSectionNameRecommendationDeserializer extends a implements d {
    public NestedBoardSectionNameRecommendationDeserializer() {
        super("board_section_name_recommendation");
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        ArrayList arrayList = new ArrayList();
        q jsonArray = pinterestJsonObject.k("data").f125618a;
        Intrinsics.checkNotNullExpressionValue(jsonArray, "jsonArray");
        ArrayList arrayList2 = new ArrayList(g0.q(jsonArray, 10));
        Iterator it = jsonArray.f91364a.iterator();
        while (it.hasNext()) {
            q f13 = ((s) it.next()).f();
            Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
            ArrayList arrayList3 = new ArrayList(g0.q(f13, 10));
            Iterator it2 = f13.f91364a.iterator();
            while (it2.hasNext()) {
                s sVar = (s) it2.next();
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.google.gson.JsonObject");
                Object e13 = c.f125622b.e((u) sVar, ga.class);
                Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSectionNameRecommendation");
                arrayList3.add((ga) e13);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(arrayList3)));
        }
        return arrayList;
    }

    @Override // ke0.a
    public final dl1.s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, ga.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSectionNameRecommendation");
        return (ga) e13;
    }
}
