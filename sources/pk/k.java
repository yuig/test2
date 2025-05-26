package pk;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class k extends i3 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f100438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f100439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, Map map) {
        super(0);
        this.f100439c = dVar;
        map.getClass();
        this.f100438b = map;
    }

    @Override // pk.i3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        h hVar = (h) iterator();
        while (hVar.hasNext()) {
            hVar.next();
            hVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f100438b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f100438b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f100438b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f100438b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f100438b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this, this.f100438b.entrySet().iterator());
    }

    @Override // pk.i3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f100438b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f100439c.f100376e -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f100438b.size();
    }
}
