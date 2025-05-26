package xf2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f134894a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f134895b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f134896c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f134897d;

    public s0(sg2.a configService, Function0 sessionPropertiesProvider, Map map) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(sessionPropertiesProvider, "sessionPropertiesProvider");
        this.f134894a = configService;
        this.f134895b = sessionPropertiesProvider;
        this.f134896c = map;
        this.f134897d = new LinkedHashMap();
    }

    public final void a(ri2.e key, String value, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (z13 || !kg.o.D(value)) {
            this.f134897d.put(key, value);
        }
    }

    public final void b(d0 key, String value, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        a(key.f134856b, value, z13);
    }

    public final LinkedHashMap c() {
        Map map;
        Map map2;
        sg2.b bVar = (sg2.b) this.f134894a;
        boolean b13 = bVar.f112882g.b("log_pr");
        boolean b14 = bVar.f112882g.b("s_props");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!b13 && (map2 = this.f134896c) != null) {
            linkedHashMap.putAll(map2);
        }
        if (!b14 && (map = (Map) this.f134895b.invoke()) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(ig1.b.m1((String) entry.getKey()), entry.getValue());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = this.f134897d;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(y0.a(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(((ri2.e) entry2.getKey()).f108404b, entry2.getValue());
        }
        linkedHashMap.putAll(linkedHashMap4);
        return linkedHashMap;
    }
}
