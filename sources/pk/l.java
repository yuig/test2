package pk;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class l extends o implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f100445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, NavigableMap navigableMap) {
        super(dVar, navigableMap);
        this.f100445g = dVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = f().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return c(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // pk.o
    public final SortedSet d() {
        return new m(this.f100445g, f());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((l) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new l(this.f100445g, f().descendingMap());
    }

    @Override // pk.o
    /* renamed from: e */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = f().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return c(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = f().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return c(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return f().floorKey(obj);
    }

    public final w0 g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h10 = this.f100445g.h();
        h10.addAll((Collection) entry.getValue());
        it.remove();
        return new w0(entry.getKey(), Collections.unmodifiableList((List) h10));
    }

    @Override // pk.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f100416c);
    }

    @Override // pk.o, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = f().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return c(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return f().higherKey(obj);
    }

    @Override // pk.o, pk.i, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = f().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return c(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = f().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return c(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(((g) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(((g) ((i) descendingMap()).entrySet()).iterator());
    }

    @Override // pk.o, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // pk.o, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z13) {
        return new l(this.f100445g, f().headMap(obj, z13));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z13, Object obj2, boolean z14) {
        return new l(this.f100445g, f().subMap(obj, z13, obj2, z14));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z13) {
        return new l(this.f100445g, f().tailMap(obj, z13));
    }
}
