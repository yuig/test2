package com.pinterest.repository.interest;

import dl1.s;
import java.util.ArrayList;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/repository/interest/HierarchicalInterestDeserializableAdapter;", "Lke0/a;", "Lu12/a;", "Lrz/d;", "", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HierarchicalInterestDeserializableAdapter extends a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final a f50453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HierarchicalInterestDeserializableAdapter(a interestDeserializer) {
        super("hierarchicalinterest");
        Intrinsics.checkNotNullParameter(interestDeserializer, "interestDeserializer");
        this.f50453b = interestDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        ArrayList arrayList = new ArrayList();
        vd0.a k13 = pinterestJsonObject.k("data");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        int d2 = k13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            c json = k13.j(i13);
            Intrinsics.checkNotNullExpressionValue(json, "optJsonObject(...)");
            Intrinsics.checkNotNullParameter(json, "json");
            arrayList.add((u12.a) this.f50453b.d(json));
        }
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return (u12.a) this.f50453b.d(json);
    }
}
