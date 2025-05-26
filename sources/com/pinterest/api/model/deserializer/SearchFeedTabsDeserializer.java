package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.xg0;
import com.pinterest.api.model.zg0;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import ke0.a;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/SearchFeedTabsDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/zg0;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SearchFeedTabsDeserializer extends a {
    public SearchFeedTabsDeserializer() {
        super("search_feed_tabs");
    }

    @Override // ke0.a
    public final s d(c cVar) {
        vd0.a o13 = o.o(cVar, "json", "tabs", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList(g0.q(o13, 10));
        Iterator it = o13.iterator();
        while (it.hasNext()) {
            Object e13 = c.f125622b.e(((c) it.next()).f125623a, xg0.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.SearchFeedTab");
            arrayList.add((xg0) e13);
        }
        return new zg0(arrayList);
    }
}
