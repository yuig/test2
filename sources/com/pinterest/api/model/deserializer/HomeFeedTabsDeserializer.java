package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.ao;
import com.pinterest.api.model.co;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import ke0.a;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/HomeFeedTabsDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/co;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class HomeFeedTabsDeserializer extends a {
    public HomeFeedTabsDeserializer() {
        super("home_feed_tabs");
    }

    @Override // ke0.a
    public final s d(c cVar) {
        vd0.a o13 = o.o(cVar, "json", "tabs", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList(g0.q(o13, 10));
        Iterator it = o13.iterator();
        while (it.hasNext()) {
            Object e13 = c.f125622b.e(((c) it.next()).f125623a, ao.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.HomeFeedTab");
            arrayList.add((ao) e13);
        }
        Boolean bool = Boolean.FALSE;
        Boolean h10 = cVar.h("should_show_settings_icon", bool);
        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
        boolean booleanValue = h10.booleanValue();
        Boolean h13 = cVar.h("disable_title_overrides", bool);
        Intrinsics.checkNotNullExpressionValue(h13, "optBoolean(...)");
        return new co(arrayList, booleanValue, h13.booleanValue());
    }
}
