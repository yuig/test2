package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ql2.s;
import yn2.x;

/* loaded from: classes3.dex */
public final class AFk1xSDK {
    private static final Object getCurrencyIso4217Code(Object obj) {
        if (obj instanceof JSONArray) {
            return getMonetizationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.d(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    @NotNull
    public static final Map<String, Object> getMonetizationNetwork(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        Sequence c13 = x.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : c13) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, getCurrencyIso4217Code(obj2));
        }
        return linkedHashMap;
    }

    private static final List<Object> getMonetizationNetwork(JSONArray jSONArray) {
        IntRange q13 = s.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(g0.q(q13, 10));
        Iterator it = q13.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((u0) it).b());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getCurrencyIso4217Code(obj));
        }
        return arrayList;
    }
}
