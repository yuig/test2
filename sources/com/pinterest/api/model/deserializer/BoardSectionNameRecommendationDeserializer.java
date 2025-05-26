package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.ga;
import dl1.s;
import java.util.ArrayList;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import rz.d;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardSectionNameRecommendationDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/ga;", "Lrz/d;", "", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BoardSectionNameRecommendationDeserializer extends a implements d {
    public BoardSectionNameRecommendationDeserializer() {
        super("board_section_name_recommendation");
    }

    @Override // rz.d
    public final Object b(c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = o13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            Object e13 = c.f125622b.e(o13.j(i13).f125623a, ga.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSectionNameRecommendation");
            arrayList.add((ga) e13);
        }
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, ga.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSectionNameRecommendation");
        return (ga) e13;
    }
}
