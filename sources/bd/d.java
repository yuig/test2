package bd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import pc.x;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f22686a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22687b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f22688c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f22689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22691f;

    public d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f22686a = linkedHashMap;
        this.f22687b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22688c = linkedHashSet;
        this.f22689d = linkedHashSet;
        this.f22690e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if ((obj instanceof Map) && (!(obj instanceof ll2.a) || (obj instanceof ll2.e))) {
                    Object obj2 = map.get(str);
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
                    Map u13 = dl2.b.u(obj2);
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 == null) {
                        throw new IllegalStateException(("'" + str + "' is an object in destination but not in map").toString());
                    }
                    a(u13, map3);
                }
            }
            map.put(str, value);
        }
    }

    public final LinkedHashMap b(Map payload) {
        Iterator it;
        Object obj;
        Intrinsics.checkNotNullParameter(payload, "payload");
        LinkedHashMap linkedHashMap = this.f22687b;
        boolean isEmpty = linkedHashMap.isEmpty();
        LinkedHashMap linkedHashMap2 = this.f22686a;
        if (isEmpty) {
            linkedHashMap2.putAll(payload);
            return linkedHashMap;
        }
        Object obj2 = payload.get("incremental");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f22691f = true;
        } else {
            this.f22691f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                Map map2 = (Map) map.get("data");
                Object obj3 = map.get("path");
                Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap.get("data");
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
                Object obj5 = (Map) obj4;
                if (map2 != null) {
                    for (Object obj6 : list2) {
                        Iterator it3 = it2;
                        if (obj5 instanceof List) {
                            Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Int");
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                        it2 = it3;
                    }
                    it = it2;
                    Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
                    a(dl2.b.u(obj5), map2);
                    this.f22688c.add(new x(list2, (String) map.get("label")));
                } else {
                    it = it2;
                }
                Object obj7 = map.get("errors");
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    k0.u(list3, arrayList);
                }
                Object obj8 = map.get("extensions");
                Map map3 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map3 != null) {
                    arrayList2.add(map3);
                }
                it2 = it;
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put("errors", arrayList);
            } else {
                linkedHashMap2.remove("errors");
            }
            if (!arrayList2.isEmpty()) {
                linkedHashMap2.put("extensions", y0.b(new Pair("incremental", arrayList2)));
            } else {
                linkedHashMap2.remove("extensions");
            }
        }
        Boolean bool = (Boolean) payload.get("hasNext");
        this.f22690e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
}
