package pk;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class p extends k implements SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f100464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d dVar, SortedMap sortedMap) {
        super(dVar, sortedMap);
        this.f100464d = dVar;
    }

    public SortedMap b() {
        return (SortedMap) this.f100438b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new p(this.f100464d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new p(this.f100464d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new p(this.f100464d, b().tailMap(obj));
    }
}
