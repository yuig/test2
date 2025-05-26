package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.bx0;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/api/model/deserializer/TrendingHashtagDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/bx0;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TrendingHashtagDeserializer extends a {
    public TrendingHashtagDeserializer() {
        super("trendinghashtag");
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String o13 = json.o("id", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        String o14 = json.o("query", "");
        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
        return new bx0(o13, o14, json.j(0, "pin_count"));
    }
}
