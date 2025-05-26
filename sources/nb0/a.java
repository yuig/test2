package nb0;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.t2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f90151a;

    /* renamed from: b, reason: collision with root package name */
    public final lb0.o f90152b;

    public a(t2 preferencesExperiments, lb0.o sharedPrefs) {
        Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.f90151a = preferencesExperiments;
        this.f90152b = sharedPrefs;
    }

    public final d6.b a(Object obj) {
        d6.i iVar = (d6.i) obj;
        lb0.b bVar = (lb0.b) this.f90152b;
        bVar.getClass();
        HashMap hashMap = new HashMap(bVar.f82703b.getAll());
        hashMap.putAll(bVar.i());
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(hashMap.size()));
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.J0((Iterable) value);
            }
            linkedHashMap.put(key, value);
        }
        iVar.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((d6.b) iVar).f53725a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        d6.b bVar2 = new d6.b(z0.r(unmodifiableMap), false);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String name = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Boolean) {
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key2 = new d6.g(name);
                Intrinsics.checkNotNullParameter(key2, "key");
                bVar2.c(key2, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key3 = new d6.g(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                bVar2.c(key3, value2);
            } else if (value2 instanceof Integer) {
                d6.g key4 = d7.b.c0(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                bVar2.c(key4, value2);
            } else if (value2 instanceof Long) {
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key5 = new d6.g(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                bVar2.c(key5, value2);
            } else if (value2 instanceof String) {
                d6.g key6 = d7.b.z0(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                bVar2.c(key6, value2);
            } else if (value2 instanceof Set) {
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key7 = new d6.g(name);
                Intrinsics.g(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Intrinsics.checkNotNullParameter(key7, "key");
                bVar2.c(key7, (Set) value2);
            }
        }
        lb0.m c13 = bVar.c();
        c13.putBoolean("ALREADY_MIGRATED", true);
        c13.apply();
        Map unmodifiableMap2 = Collections.unmodifiableMap(bVar2.f53725a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap2, "unmodifiableMap(preferencesMap)");
        return new d6.b(z0.r(unmodifiableMap2), true);
    }

    public final Boolean b(Object obj) {
        boolean z13 = false;
        if (this.f90151a.a() && !((lb0.b) this.f90152b).e("ALREADY_MIGRATED", false)) {
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }
}
