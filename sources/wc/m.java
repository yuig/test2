package wc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements Map, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f129093a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f129094b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f129095c;

    /* renamed from: d, reason: collision with root package name */
    public Map f129096d;

    public m(String key, Map fields, UUID uuid) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f129093a = key;
        this.f129094b = fields;
        this.f129095c = uuid;
    }

    public final Set b() {
        Set keySet = this.f129094b.keySet();
        ArrayList arrayList = new ArrayList(g0.q(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f129093a + '.' + ((String) it.next()));
        }
        return CollectionsKt.J0(arrayList);
    }

    public final Pair c(m newRecord) {
        Intrinsics.checkNotNullParameter(newRecord, "newRecord");
        Intrinsics.checkNotNullParameter(newRecord, "newRecord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = this.f129094b;
        LinkedHashMap fields = z0.r(map);
        Map map2 = this.f129096d;
        LinkedHashMap date = map2 != null ? z0.r(map2) : new LinkedHashMap();
        Iterator it = newRecord.f129094b.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String key = this.f129093a;
            if (!hasNext) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(fields, "fields");
                Intrinsics.checkNotNullParameter(date, "date");
                m mVar = new m(key, fields, newRecord.f129095c);
                mVar.f129096d = date;
                return new Pair(mVar, linkedHashSet);
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            boolean containsKey = map.containsKey(str);
            Object obj = map.get(str);
            if (!containsKey || !Intrinsics.d(obj, value)) {
                fields.put(str, value);
                linkedHashSet.add(key + '.' + str);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f129094b.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f129094b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f129094b.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f129094b.get(key);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f129094b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f129094b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f129094b.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f129094b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
