package com.bugsnag.android;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29687a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f29688b;

    public x1(Map map) {
        this.f29687a = map;
        this.f29688b = new e2();
    }

    public final void a(String str, String str2, Object obj) {
        Map map = this.f29687a;
        if (obj == null) {
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                map2.remove(str2);
            }
            if (map2 == null || map2.isEmpty()) {
                map.remove(str);
                return;
            }
            return;
        }
        Map map3 = (Map) map.get(str);
        if (map3 == null) {
            map3 = new ConcurrentHashMap();
        }
        map.put(str, map3);
        Object obj2 = map3.get(str2);
        if (obj2 != null && (obj instanceof Map)) {
            obj = eb.d.j(kotlin.collections.f0.j((Map) obj2, (Map) obj));
        }
        map3.put(str2, obj);
    }

    public final void b(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a(str, (String) entry.getKey(), entry.getValue());
        }
    }

    public final x1 c() {
        x1 x1Var = new x1(d());
        x1Var.f29688b.f29212a = CollectionsKt.J0(this.f29688b.f29212a);
        return x1Var;
    }

    public final ConcurrentHashMap d() {
        Map map = this.f29687a;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
        for (Map.Entry entry : map.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && Intrinsics.d(this.f29687a, ((x1) obj).f29687a);
    }

    public final int hashCode() {
        return this.f29687a.hashCode();
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        this.f29688b.a(this.f29687a, o1Var, true);
    }

    public final String toString() {
        return "Metadata(store=" + this.f29687a + ')';
    }

    public /* synthetic */ x1(int i13) {
        this(new ConcurrentHashMap());
    }
}
