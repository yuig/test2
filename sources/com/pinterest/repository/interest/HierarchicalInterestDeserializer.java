package com.pinterest.repository.interest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/repository/interest/HierarchicalInterestDeserializer;", "Lke0/a;", "Lu12/a;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HierarchicalInterestDeserializer extends a implements b {
    public HierarchicalInterestDeserializer() {
        super("hierarchicalinterest");
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList(g0.q(arr, 10));
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            arrayList.add(d((c) it.next()));
        }
        return arrayList;
    }

    @Override // ke0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final u12.a d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, u12.a.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.repository.interest.HierarchicalInterest");
        return (u12.a) e13;
    }
}
