package pk;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class m extends p implements NavigableSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f100450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, NavigableMap navigableMap) {
        super(dVar, navigableMap);
        this.f100450e = dVar;
    }

    @Override // pk.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f100438b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((k) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new m(this.f100450e, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // pk.p, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        h hVar = (h) iterator();
        if (!hVar.hasNext()) {
            return null;
        }
        Object next = hVar.next();
        hVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // pk.p, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // pk.p, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z13) {
        return new m(this.f100450e, b().headMap(obj, z13));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z13, Object obj2, boolean z14) {
        return new m(this.f100450e, b().subMap(obj, z13, obj2, z14));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z13) {
        return new m(this.f100450e, b().tailMap(obj, z13));
    }
}
