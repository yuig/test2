package pk;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class i extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient g f100414a;

    /* renamed from: b, reason: collision with root package name */
    public transient u f100415b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f100416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f100417d;

    public i(d dVar, Map map) {
        this.f100417d = dVar;
        this.f100416c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        g gVar = this.f100414a;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f100414a = gVar2;
        return gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        u uVar = this.f100415b;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f100415b = uVar2;
        return uVar2;
    }

    public final w0 c(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        d dVar = this.f100417d;
        dVar.getClass();
        List list = (List) collection;
        return new w0(key, list instanceof RandomAccess ? new n(dVar, key, list, null) : new s(dVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d dVar = this.f100417d;
        if (this.f100416c == dVar.f100375d) {
            dVar.clear();
            return;
        }
        h hVar = new h(this);
        while (hVar.hasNext()) {
            hVar.next();
            hVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f100416c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f100416c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f100416c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        d dVar = this.f100417d;
        dVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new n(dVar, obj, list, null) : new s(dVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f100416c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        d dVar = this.f100417d;
        Set set = dVar.f100505a;
        if (set != null) {
            return set;
        }
        Set i13 = dVar.i();
        dVar.f100505a = i13;
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f100416c.remove(obj);
        if (collection == null) {
            return null;
        }
        d dVar = this.f100417d;
        Collection h10 = dVar.h();
        h10.addAll(collection);
        dVar.f100376e -= collection.size();
        collection.clear();
        return h10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f100416c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f100416c.toString();
    }
}
