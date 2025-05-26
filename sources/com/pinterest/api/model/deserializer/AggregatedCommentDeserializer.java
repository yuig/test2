package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.z2;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/AggregatedCommentDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/z2;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AggregatedCommentDeserializer extends a implements b {
    public AggregatedCommentDeserializer() {
        super("aggregatedcomment");
    }

    public static z2 e(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        c m14 = json.m("aggregated_comment");
        if (m14 != null) {
            json = m14;
        }
        Object e13 = c.f125622b.e(json.f125623a, z2.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.AggregatedComment");
        return (z2) e13;
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
            c cVar = (c) it.next();
            Intrinsics.f(cVar);
            arrayList.add(e(cVar));
        }
        return CollectionsKt.H0(arrayList);
    }

    @Override // ke0.a
    public final /* bridge */ /* synthetic */ s d(c cVar) {
        return e(cVar);
    }
}
